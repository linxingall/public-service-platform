/**
 * Created by zzy on 2016/11/13.
 */
var news_category={"1":"新闻","2":"服务与帮助","3":"政策法规","4":"系统公告"};
var mapping={"1":{"1":"平台动态","2":"行业动态","3":"永康动态","4":"通知公告"},"2":{"7":"服务中心","8":"常见问题","9":"合作流程","10":"咨询与视频"},"3":{"5":"政策法规"},"4":{"6":"系统公告"}};
$(function(){
    categoryInit();
    typeInit("1");
    $("#category").on("change",function () {
        typeInit($("#category").val());
    });
    $('#addNewsForm')
        .bootstrapValidator({
            message: '验证不通过',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                title: {
                    message: '新闻表题不能为空',
                    validators: {
                        notEmpty: {
                            message: '新闻表题不能为空'
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
            console.log($form.serialize());
            var title = $('#title').val();
            var isHead = $('#is_head').val();
            var url = $('#url').val();
            var auther = $('#auther').val();
            var summary = $('#summary').val();
            var category = $('#category').val();
            var type = $('#type').val();
            var content = UE.getEditor('editor').getContent();
            $.ajaxFileUpload({
                url:$form.attr('action'),
                secureuri:false,
                dataType: 'json',
                fileElementId:'top_pic',
                data:  {
                    title: title,
                    isHead: isHead,
                    url: url,
                    auther: auther,
                    summary: summary,
                    category: category,
                    type: type,
                    content: content
                },
                success: function (result)  //服务器成功响应处理函数
                {
                    //TODO 错误提示及跳转
                    if(result.result){
                        //layer.msg(result.msg,{time: 20000});
                        //layer.msg("更新成功",{icon: 1,time: 20000});
                        window.location.href = "../news/list.htm";
                    }else{
                        layer.msg(result.msg,{icon: 2});
                    }
                }
            });
            /* $.post($form.attr('action'), $form.serialize(), function(result) {
             //TODO 错误提示及跳转
             if(result.result){
             //layer.msg(result.msg,{time: 20000});
             //layer.msg("新建成功",{icon: 1,time: 2000});
             window.location.href = "/manage/news/list.htm";
             //window.location.reload();
             }else{
             layer.msg(result.msg,{icon: 2});
             }
             }, 'json');*/
        });
    $(".diyCancel").click(function(){
        $('.imghead').attr("src", '/static/styles/images/add.png');
        isPicBlank();
        $('#top_pic').val("");
        /*$('.file-wrap').children().remove();
         $('.file-wrap').append("<input type='file' class='upload' id='top_pic' name='topPic'>");
         $(".diyCancel").removeClass("diyCancel");*/
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
})
function categoryInit() {
    $("#category").html('');
    $.each(news_category,function (key,value) {
        $("#category").append("<option value='"+key+"'>"+value+"</option>")
    })
}
function typeInit(parentId) {
    $("#type").html('');
    $.each(mapping[parentId],function (key,value) {
        $("#type").append("<option value='"+key+"'>"+value+"</option>")
    })
}
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
   
