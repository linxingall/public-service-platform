/**
 * Created by wuji on 2016/6/15.
 */

$(function(){
    $('.upload').change(function(){

        var objUrl = getObjectURL(this.files[0]) ;
        console.log("objUrl = "+objUrl) ;

        if (objUrl) {
            $(this).parent().prev('.preview').find('.imghead').attr("src", objUrl) ;
        }
    })


})
//建立一個可存取到該file的url
function getObjectURL(file) {
    var url = null ;
    if (window.createObjectURL!=undefined) { // basic
        url = window.createObjectURL(file) ;
    } else if (window.URL!=undefined) { // mozilla(firefox)
        url = window.URL.createObjectURL(file) ;
    } else if (window.webkitURL!=undefined) { // webkit or chrome
        url = window.webkitURL.createObjectURL(file) ;
    }
    return url ;
}
   
