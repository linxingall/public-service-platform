/**
 * Created by wuji on 2016/6/15.
 */
$(function(){

    $(window).scroll(function() {
        var windTop = $(window).scrollTop();
        if (windTop >= 200) {
            $('.toptable').addClass('fd')
        } else {
            $('.toptable').removeClass('fd')

        }
    });
    $('.tableIteam .ticon').click(function(){
        $(this).parents('.tableIteam').find('tbody').hide();
        $(this).hide();
        $(this).next('.ticon2').show()
    });
    $('.tableIteam .ticon2').click(function(){
        $(this).parents('.tableIteam').find('tbody').show();
        $(this).hide();
        $(this).prev('.ticon').show()
    });
   
})