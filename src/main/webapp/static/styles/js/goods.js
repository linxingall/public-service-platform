/**
 * Created by wuji on 2016/6/8.
 */
$(function(){
    $('.goodsModel').click(function(){
            var raname = $(this).find('input').attr('name');
            $(this).parents('form').find(".goodsModel input[name="+raname+"]").parents('.goodsModel').removeClass("radio_on");
            $(this).parents('form').find(".goodsModel input[name="+raname+"]").attr("checked",false);
            $(this).addClass("radio_on").find(":radio").attr("checked",true);
    });
    $('.goodsLove').click(function(){
        if($(this).hasClass("goodsLove_on")){
            $(this).find('input').attr("checked",false);
            $(this).removeClass('goodsLove_on')
        }else{
            $(this).find('input').attr("checked",true);
            $(this).addClass('goodsLove_on')
        }
    });
    $('.tab_name span').click(function(){
        var name = $(this).attr('id');
        $(this).addClass('on');
        $(this).siblings().removeClass('on')
        $(this).parents('.tab_name').siblings('.tab_list').find('#'+name).show().siblings().hide();
    });
});

/* reduce_add */
var setAmount = {
    min:1,
    max:999,
    reg:function(x) {
        return new RegExp("^[1-9]\\d*$").test(x);
    },
    amount:function(obj, mode) {
        var x = $(obj).val();
        if (this.reg(x)) {
            if (mode) {
                x++;
            } else {
                x--;
            }
        } else {
            alert("请输入正确的数量！");
            $(obj).val(1);
            $(obj).focus();
        }
        return x;
    },
    reduce:function(obj) {
        var x = this.amount(obj, false);
        if (x >= this.min) {
            $(obj).val(x);
            recalc();
        } else {
            alert("商品数量最少为" + this.min);
            $(obj).val(1);
            $(obj).focus();
        }
    },
    add:function(obj) {
        var x = this.amount(obj, true);
        if (x <= this.max) {
            $(obj).val(x);
            recalc();
        } else {
            alert("商品数量最多为" + this.max);
            $(obj).val(999);
            $(obj).focus();
        }
    },
    modify:function(obj) {
        var x = $(obj).val();
        if (x < this.min || x > this.max || !this.reg(x)) {
            alert("请输入正确的数量！");
            $(obj).val(1);
            $(obj).focus();
        }
    }
}

function BuyUrl(wid) {
    var pcounts = $("input[id^=qty_item_]").val();
    var patrn = /^[0-9]{1,4}$/;
    if (!patrn.exec(pcounts)) {
        pcounts = 1;
    }
    else {
        if (pcounts <= 0)
            pcounts = 1;
        if (pcounts >= 1000)
            pcounts = 999;
    }
};