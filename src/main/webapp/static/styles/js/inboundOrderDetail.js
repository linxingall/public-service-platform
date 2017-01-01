
$(function () {

   $("div.userMain input").attr("disabled",true);

   $("div.userMain select") .attr("disabled",true);


    $("#destWarehouseCode").change(function () {
        if(this.value!=''){
            logisticsPlanNo($("#swinit").val(),$('#warehouseCode').val(),this.value);
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

    $("#collapseFive button").click(function () {
        window.history.go(-1);
    })




})

//补全select 框 option
function selectOption(code) {
    $.ajax({
        url: 'getWinitProductList.htm',
        type:'post',
        dataType:'json',
        success:function (data) {
           var options = '';
           $.each(data.obj,function (index,obj) {
               if(code == obj.productCode){
                   options +="<option value='"+obj.productCode+"'selected >"+obj.productName+"</option>";
               }else{
                   options +="<option value='"+obj.productCode+"'>"+obj.productName+"</option>";
               }
           })
           if(options!=''){
               $("#swinit").append(options);
           }
        },
        error:function (e) {
            console.info("获取WINIT产品失败");
        }
    });
}

function select2(winitProductCode,code) {
    $.ajax({
        url:'getInpsectionWarehouseList.htm',
        type:'post',
        data:{
            winitProductCode : winitProductCode
        },
        dataType:'json',
        success:function (data) {
            if(data.result) {
                var options = '';
                $.each(data.obj.warehouseList, function (index, obj) {
                    if(code ==obj.warehouseCode ){
                        options +="<option value='"+obj.warehouseCode+"'selected>"+obj.warehouseName+"</option>";
                    }else{
                        options +="<option value='"+obj.warehouseCode+"'>"+obj.warehouseName+"</option>";
                    }
                })
                $('#warehouseCode').append(options);
            }
        },
        error:function (e) {
           console.info("验货仓获取失败");
        }
    })
}

function select3(winitProductCode,inspectionWarehouseCode,code) {
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
                $.each(data.obj.warehouseList,function (index,obj) {
                    if(code == obj.warehouseCode){
                        option +="<option value='"+obj.warehouseCode+"'selected>"+obj.warehouseName+"</option>";
                    }else{
                        option +="<option value='"+obj.warehouseCode+"'>"+obj.warehouseName+"</option>";
                    }
                })
                $('#destWarehouseCode').append(option);
            }
        },
        error:function (e) {
            console.info("获取目的仓失败");
        }
    });

}
//物流计划
function logisticsPlanNo(productCode,inspectionWarehouseCode,purposeWarehouseCode,code) {
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
                $.each(data.obj.planVos,function (index,plan) {
                    if(code==plan.id){
                        option+="<option value='"+plan.id+"'selected>"+plan.planName+"</option>";
                    }else{
                        option+="<option value='"+plan.id+"'>"+plan.planName+"</option>";
                    }
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
};

//获取进出口商内容 type IOR-进口  EOR - 出口
function ieGoodsCode(type,$obj,code) {
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
                    if(code == obj.code){
                        options+="<option value='"+obj.code+"'selected>"+obj.operationUnit+"</option>"
                    }else{
                        options+="<option value='"+obj.code+"'>"+obj.operationUnit+"</option>"
                    }
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

function getOneAdress(code) {
    $.ajax({
        url:'getAddress.htm',
        type:'post',
        data:{
            code:code,
        },
        dataType:'json',
        success:function (data) {
            if(data.result){
               var label = "<label><input type='radio' name='address' value='"+code+"' checked>" +
                   " <span class='padding5'>"+data.obj.detailEn+"</span><span class='padding5'>"+data.obj.countryName+"</span>" +
                   "<span class='padding5'>"+data.obj.stateName+"</span><span class='padding5'>"+data.obj.cityName+"</span>" +
                   "<span class='padding5'>"+data.obj.detailCn+"</span><span class='padding5'>"+data.obj.postCode+"</span></label>"
                $('#collapseFour div.radio').append(label);
            }
        },
        error:function (e) {
            console.info('获取地址失败')
        }
    });
}

