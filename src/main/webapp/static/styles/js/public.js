/**
 * Created by wuji on 2016/8/16.
 */
$(function () {
    $(window).scroll(function () {
        var mytop = $(window).scrollTop();
        if(mytop>200){
            $('.topfixd-search').addClass('topshow');
        }else{
            $('.topfixd-search').removeClass('topshow');
        }
    })

})