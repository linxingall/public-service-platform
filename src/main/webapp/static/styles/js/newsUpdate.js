/**
 * Created by zzy on 2016/11/13.
 */
jQuery(document).ready(function () {
    $('#updateNewsForm')
        .bootstrapValidator({
            message: '验证不通过',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                title: {
                    message: '新闻标题不能为空',
                    validators: {
                        notEmpty: {
                            message: '新闻标题不能为空'
                        },
                    }
                },
            }
        })
        .on('success.form.bv', function(e) {
            // Prevent form submission
            e.preventDefault();
            // Get the form instance
            var $form = $(e.target);
            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');
            if(!isHeadValidate()){
                return false;
            }
            var id = $('#id').val();
            var title = $('#title').val();
            var isHead = $('#is_head').val();
            var url = $('#url').val();
            var auther = $('#auther').val();
            var summary = $('#summary').val();
            var type = $('#type').val();
            var content = UE.getEditor('editor').getContent();
            console.log(content);
            $.ajaxFileUpload({
                url:$form.attr('action'),
                secureuri:false,
                dataType: 'json',
                fileElementId:'top_pic',
                data:  {
                    id: id,
                    title: title,
                    isHead: isHead,
                    url: url,
                    auther: auther,
                    summary: summary,
                    type: type,
                    content: content
                },
                success: function (result)  //服务器成功响应处理函数
                {
                    console.log(result.result);
                    //TODO 错误提示及跳转
                    if(result.result){
                        console.log("success");
                        //layer.msg(result.msg,{time: 20000});
                        //layer.msg("更新成功",{icon: 1,time: 20000});
                        window.location.href = "../news/list.htm";
                    }else{
                        layer.msg(result.msg,{icon: 2});
                    }
                },
                error: function () {
                    alert(1)
                }
            });
            /*$.post($form.attr('action'), $form.serialize(), function(result) {
             //TODO 错误提示及跳转
             if(result.result){
             //layer.msg(result.msg,{time: 20000});
             //layer.msg("更新成功",{icon: 1,time: 20000});
             window.location.href = "/manage/news/list.htm";
             }else{
             layer.msg(result.msg,{icon: 2});
             }
             }, 'json');*/
        });
    $(".diyCancel").click(function(){
        $('.imghead').attr("src", '/static/styles/images/add.png');
        isPicBlank();
        $('#top_pic').val("");
    });
    isPicBlank();
    $('.upload').change(function(){

        var objUrl = getObjectURL(this.files[0]) ;
        console.log("objUrl = "+objUrl) ;

        if (objUrl) {
            $(this).parent().prev('.preview').find('.imghead').attr("src", objUrl) ;
        }
        console.log("图片路径改变");
        //当有图片时显示cancel按钮
        if($('.imghead').attr("src")=='/static/styles/images/add.png'){
            $('#cancel').removeClass('diyCancel');
        }else{
            $('#cancel').addClass('diyCancel');
        }
    });
});
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
//判断图片是否为空
function isPicBlank(){
    if($('.imghead').attr("src")=='/static/styles/images/add.png'){
        $('#cancel').removeClass('diyCancel');
    }else{
        $('#cancel').addClass('diyCancel');
    }
}
//判断是否为头条新闻
function isHeadValidate(){
    var pic = $('.imghead').attr("src");
    console.log($('#is_head').is(':checked'));
    if($('#is_head').is(':checked')){
        $('#is_head').val("1");
    }else{
        $('#is_head').val("0");
    }
    console.log($("#is_head").val());
    if($("#is_head").val()=="1"){
        console.log("为头条新闻");
        console.log($('.imghead').attr("src"));
        if($('.imghead').attr("src")=='/static/styles/images/add.png'){
            layer.msg('头条新闻必须有版图', {
                icon: 2,
                time:2000
            },function(){
                return false;
            });
            return false;
        }
    }
    return true;
}

function submitForm(){
    window.location.href = "${base}/manage/news/list.htm";
}

function resetForm(){
    ue.setContent("",false);
}