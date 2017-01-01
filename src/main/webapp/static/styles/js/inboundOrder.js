Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S": this.getMilliseconds()
    };
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};


var i = 0;//商品计数
var ocount =0;//修改时使用
var counti =0;
$(function () {
     $(".form_date input").attr("value",new Date().format('yyyy-MM-dd'));

    $(".form_date").datetimepicker({
        format: "yyyy-mm-dd",
        language: 'zh-CN',
        autoclose: true,
        todayBtn: true,
        minView :2,
        pickerPosition: "bottom-left"
    });

    $("#autocomplete").typeahead({
        source:function (query, process){
            $.post("getGoodsText.htm", { query : query }, function (data) {
                   if(data.length>0){
                       process(data);
                   }
            });
        },
        items: 15,
        updater:function (item) {
            addGoodsByInput(item);
            return '';
        },
        delay: 800 //延迟时间
    });

    selectOption();
    $("#swinit").change(function () {
       if(this.value!=''){
           select2(this.value);
           console.log(this.value);
           if(this.value=='OW01010360'){
               $("#is_ocean").val('true');
           }else{
               $("#is_ocean").val('false');
           }
       }
    })
    $('#warehouseCode').change(function () {
        if(this.value!=''){
            select3($("#swinit").val(),this.value);
        }
    });

    $("#destWarehouseCode").change(function () {
        if(this.value!=''){
            logisticsPlanNo($("#swinit").val(),$('#warehouseCode').val(),this.value);
        }
    });

    $("#goodstable").on("click","button",function () {
        $(this).parent().parent().remove();
        i--;
    })

    $("#offer").on("hide.bs.modal",function(){
        clertModal();
        reValide();
    });

    $("#offer .modal-footer button:first").click(function () {
        var flag =judgeForm();
        if(flag){
            addpackage(0);
        }
    })

    $("#offer .modal-footer button:last").click(function () {
        var flag =judgeForm();
        if(flag){
            addpackage(1);
        }
    })
    //箱号超链接
    $("#packagetabel tbody:first ").on("click","a[name=showtable]" ,function () {
       var $tr = $(this).parent().parent().next("tr");
        var text = $tr.attr("text");
        if(text ==0){
            $tr.show();
            $tr.attr("text",1);
        }else{
            $tr.hide();
            $tr.attr("text",0);
        }
    });

    //删除
    $("#packagetabel tbody:first ").on("click","a[name=deleteTable]",function () {
        var $this = $(this);
        layer.confirm("是否确认删除包裹!",function () {
            $.ajax({
                url:'delPackage.htm',
                type:'post',
                data:{
                    id : $this.attr("text")
                },
                dataType:'json',
                success:function (data) {
                     if(data.result){
                         deletePackage($this);
                         $('#goodsCount').html($('#goodsCount').html()-data.obj);
                         layer.msg(data.msg,{icon:1});
                         return true;
                     }else{
                         layer.msg(data.msg,{icon:2});
                         return false;
                     }
                }
            });
        });
    });
    
    //箱号编辑
    $("#packagetabel tbody:first").on("click","a[name=upPackage]",function () {
        //长宽高 l*w*h
        var long = $(this).parent().prev("td").find(".goods-long").html();
        var withs =  $(this).parent().prev("td").find(".goods-with").html();
        var height =  $(this).parent().prev("td").find(".goods-height").html();
        var weight = $(this).parent().prev("td").prev("td").html();
        var packageNo =$(this).parent().prev("td").prev("td").prev("td").find("a[name=showtable]").html();
        var $gTable = $(this).parent().parent().next("tr").find("table");
        $("#packageId").val($(this).attr("text"));
        $("#offer_caseNo").val(packageNo);
        $("#offer_sellerWeight").val(weight);
        $("#offer_sellerLength").val(long);
        $("#offer_sellerWidth").val(withs);
        $("#offer_sellerHeight").val(height);
        setPackageValue($gTable);
        $('#offer').modal('show');
    })

    //第一个下一步
    $("#step1").click(function () {
        var bv = $("#step1_form").data('bootstrapValidator').validate();
        var flag =   $("#step1_form").data('bootstrapValidator').isValid();
        if(flag){
            $.ajax({
                url:'addInboundOrder.htm',
                type:'post',
                data:$("#step1_form").serialize(),
                dataType:'json',
                success:function (data) {
                    if(data.result){
                        $("#collapseTwo").collapse('show');
                        $("#collapseOne").collapse('hide');
                        $("#orderId").val(data.obj);
                    }else{
                        layer.msg(data.msg,{icon:2});
                    }
                },
                error:function (e) {
                    console.info("基本信息保存错误");
                }
            })
        }
    })

    //第二页上一步
    $('#step2_up').click(function () {
        $('#collapseTwo').collapse('hide');
        $('#collapseOne').collapse('show');
    });

    $('#step3_up').click(function () {
        $('#collapseThree').collapse('hide');
    });

    $('#step5_go').click(function () {
        $('#collapseFive').collapse('hide');
    })

    $('#step3_down').click(function () {
        var bv = $("#step3_form").data('bootstrapValidator').validate();
        var flag =   $("#step3_form").data('bootstrapValidator').isValid();
        if(flag){
            $.ajax({
                url:'addInboundOrder.htm?orderId='+$('#orderId').val(),
                type:'post',
                data:$("#step3_form").serialize(),
                dataType:'json',
                success:function (data) {
                    if(data.result){
                        $("#collapseFour").collapse('show');
                        $("#collapseThree").collapse('hide');
                    }else{
                        layer.msg(obj.msg,{icon:2});
                    }
                },
                error:function (e) {
                    console.info("基本信息保存错误");
                }
            })
        }
    });

    $("#step4_down").click(function () {
        var bv = $("#step4_form").data('bootstrapValidator').validate();
        var flag =   $("#step4_form").data('bootstrapValidator').isValid();
        if(flag){
            $.ajax({
                url:'addDispatch.htm?orderId='+$('#orderId').val(),
                type:'post',
                data:$("#step4_form").serialize(),
                dataType:'json',
                success:function (data) {
                    if(data.result){
                        $("#collapseFive").collapse('show');
                        $("#collapseFour").collapse('hide');
                 //       $("#dispatchId").val(data.obj);
                        step5(data.obj);
                        changeDisplay();
                    }else{
                        layer.msg(data.obj.msg,{icon:2});
                    }
                },
                error:function (e) {
                    console.info("基本信息保存错误");
                }
            })
        }
    });

    $("#collapseFour select[name=pickupType]").change(function () {
        $("#step4_form").data('bootstrapValidator').destroy();
        $('#step4_form').data('bootstrapValidator', null);
        step4Form(this.value);
        if(this.value =='P'){
            $("#collapseFour div[name=div_P]").show();
            $("#collapseFour div[name=div_S]").hide();
        }else{
            $("#collapseFour div[name=div_S]").show();
            $("#collapseFour div[name=div_P]").hide();
        }
    })

    getCarriers();

    $('#step2_down').click(function () {
        if($('#packagetabel tr').length<2){
            layer.msg("你还没添加包裹")
            return false;
        }
        //进口
        var $obj = $('#collapseThree select[name=importerCode] ');
        $obj.find('option:first').nextAll().remove();
        ieGoodsCode('IOR',$obj);
        //出口
        var $obj = $('#collapseThree select[name=exporterCode] ');
        $obj.find('option:first').nextAll().remove();
        ieGoodsCode('EOR',$obj);
    });

    getAddress(1);

    //获取更多
    $('#addressNet').click(function () {
        var text =$(this).attr("text");
        getAddress(text);
    })
})

//补全select 框 option
function selectOption() {
    $.ajax({
        url: 'getWinitProductList.htm',
        type:'post',
        dataType:'json',
        success:function (data) {
           var options = '';
           $.each(data.obj,function (index,obj) {
               options +="<option value='"+obj.productCode+"'>"+obj.productName+"</option>";
           })
           if(options!=''){
               $("#swinit").append(options);
           }
        }
    });
}

function select2(winitProductCode) {
    $.ajax({
        url:'getInpsectionWarehouseList.htm',
        type:'post',
        data:{
            winitProductCode : winitProductCode
        },
        dataType:'json',
        success:function (data) {
            if(data.result) {
                 $('#warehouseCode option:first').nextAll().remove();
                var options = '';
                $.each(data.obj.warehouseList, function (index, obj) {
                    options +="<option value='"+obj.warehouseCode+"'>"+obj.warehouseName+"</option>";
                })
                $('#warehouseCode').append(options);
            }
        },
        error:function (e) {
           console.info("验货仓获取失败");
        }
    })
}

function select3(winitProductCode,inspectionWarehouseCode) {
    $.ajax({
        url:'getDestinationWarehouseList.htm',
        type:'post',
        data:{
            winitProductCode:winitProductCode ,
            inspectionWarehouseCode:inspectionWarehouseCode,
        },
        dataType:'json',
        success:function (data) {
            if(data.result){
                var option = '';
                $('#destWarehouseCode option:first').nextAll().remove();
                $.each(data.obj.warehouseList,function (index,obj) {
                    option +="<option value='"+obj.warehouseCode+"'>"+obj.warehouseName+"</option>";
                })
                $('#destWarehouseCode').append(option);
            }
        },
        error:function (e) {
            console.info("获取目的仓失败");
        }
    });

}

function addGoodsByInput(item) {
   var arr = item.split("-");
    var flag = false;
    $("#goodstable tr input[name^=goodsList]").each(function (index) {

            if(this.value == arr[0]){
                flag = true;
               return false;
            }

    })
    if(flag){
        return false;
    }
   var tr = "<tr><td>"+arr[0]+"<input type='hidden' name='goodsList["+counti+"].goodsCode' value='"+arr[0]+"' /></td><td>"+arr[1]+"</td>"
    tr+="<td><input type='text' name='goodsList["+counti+"].quantity' class='form-control' placeholder='输入商品编码' value='1'></td>";
    tr+="<td><button class='btn btn-xs btn-danger'>删除</button></td></tr>";
    i++;
    counti++;
    $("#goodstable").append(tr);
}

function clertModal() {
    $("#offer input").val("");
    var $th = $("#goodstable tr:first");
    $("#goodstable").empty();
    $("#goodstable").append($th);
}
//0-新增  1-修改
function copyTable(id,type){
    var $table = $("#goodstable").clone(); //商品table
    $table.removeAttr("id");
    $table.width("80%");
    $table.find("tr").each(function (index) {
        if(index==0){
            $(this).find("th:last").remove();
        }else{
            $(this).find("td:last").remove();
            var $iput = $(this).find("input:last");
            var v = $iput.val();
            $iput.parent().empty();
            $(this).find("td:last").html(v);
            $(this).find("input").remove();
        }
    })
    if(type==0) {
        var $trs = $("#packagetabel tbody:first ").children("tr");
        var index = 0;
        if ($trs.length > 0) {
            index = $trs.last("tr").prev("tr").find("td:first").html();
        }
        $('#collapseTwo span:first').html("包裹总数:" + (index * 1 + 1));
        var goodsCount = $('#goodsCount').html() * 1 + i;
        $('#goodsCount').html(goodsCount);
        var trs = "<tr><td>" + (index * 1 + 1) + "</td><td><a href='javascript:;' name='showtable'>" + $('#offer_caseNo').val() + "</a></td> " +
            "<td>" + $('#offer_sellerHeight').val() + "</td><td><span class='goods-long'>" + $('#offer_sellerLength').val() +
            "</span>x<span class='goods-with'>" + $('#offer_sellerWeight').val() + "</span>x<span class='goods-height'>" + $('#offer_sellerHeight').val() +
            "</span></td><td><a href='javascript:;' name='deleteTable' text='" + id + "' class='table-btn'><i class='glyphicon glyphicon-remove'></i>删除</a>&nbsp&nbsp&nbsp&nbsp " +
            "<a href='javascript:;' name='upPackage' text='" + id + "' class='table-btn'><i class='glyphicon glyphicon-pencil'></i>编辑</a></td></td></tr>"
        trs += "<tr style='display:none' text='0'><td colspan='6'></td></tr>"
        var $Ntrs = $(trs).appendTo($("#packagetabel tbody:first "));
        $Ntrs.last("tr").children("td").append($table);
    }else{
        var goodsCount = $('#goodsCount').html() * 1 + i-ocount;
        $('#goodsCount').html(goodsCount);
        var $utr = $("#packagetabel tbody:first a[text="+id+"]").parent().parent();
        $utr.find("a[name=showtable]").html($('#offer_caseNo').val());
        $utr.find("td:eq(2)").html( $('#offer_sellerHeight').val());
        $utr.find(".goods-long").html($('#offer_sellerLength').val());
        $utr.find(".goods-with").html($('#offer_sellerWeight').val());
        $utr.find(".goods-height").html( $('#offer_sellerHeight').val());
        $utr.next("tr").find("td:first").empty();
        $utr.next("tr").find("td:first").append($table);
    }
}

function judgeForm() {
    var bv = $("#offer_form").data('bootstrapValidator').validate();
    var flag =   $("#offer_form").data('bootstrapValidator').isValid();
    return flag;
}

function reValide() {
   /* $("#offer_form").data('bootstrapValidator').destroy();
    $('#offer_form').data('bootstrapValidator', null);
    offerFormValid();*/
   $("#offer_form").data('bootstrapValidator').resetForm();//重置表单
}

// type 0-增加下一个   1-关闭model
function addpackage(type) {
    var url = 'addPackage.htm?orderId='+$('#orderId').val();
    $.ajax({
        url:url,
        type:'post',
        data: $("#offer_form").serialize(),
        dateType:'json',
        success:function (data) {
            if(data.result){
                var id = $("#packageId").val();
                if(id==''){
                    copyTable(data.obj,0);
                }else{
                    copyTable(data.obj,1);
                }
                if(type==0){
                    clertModal();
                    reValide();
                }else{
                    $('#offer').modal('hide');
                }
                i=0;
                counti=0;
            }else{
                layer.msg(data.msg,{icon:2});
            }
        },
        error:function (e) {
            console.info('箱号保存失败')
        }
    })
}

function deletePackage(obj) {
    var $ntrs = $(obj).parent().parent().next("tr").nextAll();
    $(obj).parent().parent().next("tr").remove();
    $(obj).parent().parent().remove();
    var index = 0;
    $.each($ntrs,function (index,objtr) {
          if(index%2==0){
              intex = $(objtr).find("td:first").html()-1;
              $(objtr).find("td:first").html(index);
          }
    });
    $("#collapseTwo span:first").html("包裹总数:"+index);
}
//绘制编辑包裹商品列表
function setPackageValue(obj) {
   var $trs = obj.find("tr").not("tr:first");
    $trs.each(function () {
        var addTr = "";
        var goodsNo = $(this).find("td:first").html();
        var goodsName = $(this).find("td:eq(1)").html();
        var count = $(this).find("td:last").html();
        addTr+="<tr><td>"+goodsNo+"<input type='hidden' name='goodsList["+counti+"].goodsCode' value='"+goodsNo+"'></td><td>"+goodsName+"</td>"
        addTr+="<td><input type='text' name='goodsList["+counti+"].quantity' class='form-control' value='"+count+"'></td>" +
            "<td><button class='btn btn-xs btn-danger'>删除</button></td></tr>";
        $("#goodstable").append(addTr);
        counti++;
    })
    i==counti;
    ocount = i;
}
//物流计划
function logisticsPlanNo(productCode,inspectionWarehouseCode,purposeWarehouseCode) {
    $.ajax({
        url:'getLogisticsPlanList.htm',
        type:'post',
        data:{
            'productCode' :productCode,
            'inspectionWarehouseCode':inspectionWarehouseCode,
            'purposeWarehouseCode':purposeWarehouseCode
        },
        dataType:'json',
        success:function (data) {
            if(data.result){
                var option = '';
                $("#collapseThree select[name=logisticsPlanNo] option:first").nextAll().remove()
                $.each(data.obj.planVos,function (index,plan) {
                    option+="<option value='"+plan.id+"'>"+plan.planName+"</option>";
                })
                $("#collapseThree select[name=logisticsPlanNo]").append(option);
            }else{
                console.info("获取物流计划失败");
            }
        },
        error:function (e) {
            console.info("获取物流计划失败");
        }
    });
}
//发货商接口
function getCarriers(){
    $.ajax({
        url:'getCarriers.htm',
        type:'post',
        dataType:'json',
        success:function (data) {
            if(data.result){
                var options ="";
                $.each(data.obj.carrierList,function (index,shipper) {
                    options+="<option value='"+shipper.shipperCode+"-"+shipper.shipperName+"'>"+shipper.shipperName+"</option>"
                })
                $("#collapseFour select[name=expressVendorCode]").append(options);
            }else{
                console.info("获取发货物流商失败");
            }
        },
        error:function (e) {
            console.info("获取发货物流商失败");
        }
    });
}


//获取进出口商内容 type IOR-进口  EOR - 出口
function ieGoodsCode(type,$obj) {
    $.ajax({
        url:'getEorIorInfoList.htm',
        type:'post',
        data:{
            orderId:$("#orderId").val(),
            type:type
        },
        success:function (data) {
            if(data.result){
                var options = '';
                $.each(data.obj,function (index,obj) {
                    options+="<option value='"+obj.code+"'>"+obj.operationUnit+"</option>"
                })
                $obj.append(options);
            }else{
                console.log('type:'+type +'获取失败');
            }
        },
        error:function () {
            console.log('type:'+type +'获取失败');
        }
    });
}
//获取地址
function getAddress(pageNo){
    $.ajax({
        url:'getAddressList.htm',
        type:'get',
        data:{
            pageSize:'10',
            pageNo:pageNo,
        },
        dataType:'json',
        success:function (data) {
            if(data.result){
                var labels = '';
                $.each(data.obj.list,function (index,obj) {
                    var checked='';
                    if(obj.isdefault =='Y'){
                        checked = 'checked'
                    }
                    labels+="<label><input type='radio' name='addressCode' "+checked+" value='"+obj.code+"'>" +
                        "<span class='padding5'>"+obj.detailEn+"</span><span class='padding5'>"+obj.countryName+"</span>" +
                        "<span class='padding5'>"+obj.stateName+"</span><span class='padding5'>"+obj.cityName+"</span>" +
                    "<span class='padding5'>"+obj.detailCn+"</span><span class='padding5'>"+obj.postCode +
                        "</span><a href='javascript:;'>编辑</a></label>"
                })
                $('#collapseFour div.radio').append(labels);
                $('#addressNet').attr("text",data.obj.pageParams.pageNo+1);
            }
        },
        error:function (e) {
            Console.info('获取地址失败');
        }
    });
}

//费用预估
function step5(obj){
   $("#collapseFive div.text-right").html('预计合计金额（USD）：'+obj.totalFee);
    var trs = '';
    $.each(obj.feeList ,function (index,fee) {
        trs+="<tr><td>"+fee.feeName+"</td><td>"+fee.feeNode+"</td><td>" +fee.fee+
            "</td><td>"+fee.feeCurrency+"</td></tr>";
    });
    $('#collapseFive table').append(trs);

}
//变成查看模式
function changeDisplay() {
    $("div.userMain input").attr("disabled",true);
    $("div.userMain select") .attr("disabled",true);
    $("#collapseTwo button.add-offer-btn").hide();
    $("#step1").next().show();
    $("#step1").hide();
    $('#step2_down').next().show();
    $("#step2_down").hide();
    $('#step3_down').next().show();
    $("#step3_down").hide();
    $('#step4_down').next().show();
    $("#step4_down").hide();
}

