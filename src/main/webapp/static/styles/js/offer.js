/**
 * Created by wuji on 2016/8/28.
 */
$(function(){

    $("body").on("click",'.offer-goods-box .iteam',function () {
        if($(this).hasClass('active')){
            $(this).removeClass('active');
            $(this).find('input').prop("checked",false);
        }else{
            $(this).addClass('active');
            $(this).find('input').prop("checked",true);
        }
    });

    $("div .offer-goods-box").scroll(function(){
        var sheight = this.scrollHeight;
        var sTop = this.scrollTop;
        var dHeight = $(this).height();
        if(dHeight+sTop >= sheight){
            var pageNo =  $("#pageNo").val();
            var goodsNo = $(".u-oder-search input").val();
            appendGoods(pageNo,goodsNo,1);
        }
    });

    $(".u-oder-search button").click(function () {
        var goodsNo = $(".u-oder-search input").val();
        appendGoods(1,goodsNo,0);
    });

    $("div .form-submit button:last").click(function () {
        var id = $("form input:first").val();
        if(id==0){
            layer.msg("请先保存报价单",{icon:2});
        }else{
            $.ajax({
                url:'reviewQuote.htm',
                type:'post',
                data:{
                    id:id
                },
                dataType:'json',
                success:function (data) {
                    if(data.result){
                        layer.msg(data.msg,{icon:1},function () {
                            window.location.href="quoteList.htm";
                        });
                    }else{
                        layer.msg(data.msg,{icon:2});
                    }
                },
                error:function (e) {
                    layer.msg("请联系管理员！",{icon:2})
                }
            })
        }
    });
})

/**
 * 功能：序列化form表单数据成Json对象
 * 1.name均是简单的一级对象
 * 2.同名的name属性，值会被序列化为数组，例如checkbox等控件
 */
$.fn.serializeObject = function() {
    var json = {};
    var arrObj = this.serializeArray();
    $.each(arrObj, function() {
        if (json[this.name]) {
            if (!json[this.name].push) {
                json[this.name] = [ json[this.name] ];
            }
            json[this.name].push(this.value || '');
        } else {
            json[this.name] = this.value || '';
        }
    });
    return json;
};



//商品页码，商品编号，类型 0-搜索 1-加载
function appendGoods(pageNo,goodsNo,type){
    $.ajax({
        url:'appGoods.htm',
        type:'post',
        dataType:'json',
        data:{
            "goodsNo":goodsNo,
            "pageNo":pageNo
        },
        success:function (data) {
            $(".u-oder-search .form-control").val(data.attributes.goodsNo);
            if(data.result){
                if(type==0){
                    $("div .offer-goods-box").empty();
                    $("#pageNo").val("1");
                }else{
                    $("#pageNo").val(data.obj.pageNo+1);
                }
                $.each(data.obj.result,function (index,obj) {
                    var tr = "<div class=' col-xs-3'><div class='iteam'><div class='col-xs-12 img-box'><div class='img'>" +
                        "<img src='/upload/"+obj.mainPic+"' width='100%' /></div><div class='title'>"+obj.chName+"</div></div><div class='col-xs-12'>"+
                        "商品编号："+obj.prodCode+"<table><tr><th>长cm</th><th>宽cm</th><th>高cm</th></tr><tr><td>"+obj.length/100+
                        "</td><td>"+obj.width/100+"</td><td>"+obj.high/100+"</td></tr></table></div><div class='col-xs-6'>含税："+obj.fobTax/100+
                        "</div><div class='col-xs-6'>不含税："+obj.fob/100+"</div><div class='col-xs-6'>净重："+obj.nw/1000+"kg</div><div class='col-xs-6'>" +
                        "毛重："+obj.gw/1000+"kg</div><input type='checkbox' name='offer-goods' value='"+obj.id+"'><span class='iconfont'>" +
                        "&#xe627;</span><div class='clearfix'></div></div></div>";
                    $("div .offer-goods-box").append(tr);
                });
            }
        }
    });
}