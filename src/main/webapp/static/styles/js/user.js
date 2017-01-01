/**
 * Created by wuji on 2016/6/22.
 */
$(function(){
    var adRight = $('.userMain').height();
    var adLeft = $('.userNav').height();

    if(adRight > adLeft){
        $('.userNav').height(adRight);
    }else{
        $('.userMain .borderBox ').css('min-height',adLeft+'px');
    }

    $('.form-style .title').click(function () {
        if($(this).find('i').hasClass('si')){
            $(this).next('.a-list').show();
            $(this).find('i').removeClass('si');
        }else{
            $(this).next('.a-list').hide();
            $(this).find('i').addClass('si');
        }
    })

    /*  图片轮播 */
    $('.good-detail .img-list').hover(function () {
        $(this).addClass('on').siblings().removeClass('on');
        var myphoto = $(this).find('img').attr('src')
        $('.good-detail .main-img').find('img').attr('src',myphoto)
    })

})