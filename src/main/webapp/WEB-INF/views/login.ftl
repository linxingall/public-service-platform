<#assign title="登陆">
<#include "common/layout.ftl" >
<@head>
<style>
    .lg_txt02 ,.lg_txt01{
        height: 41px;
    }
</style>
<link rel="stylesheet" href="${base}/static/styles/css/login.css" />
<script src="${base}/static/styles/js/sha1.js"></script>
<script>
    function f(event){
        //网页内按下回车触发
        if(event.keyCode==13)
        {
            login();
        }
    }
    function login() {
        var name =$('#name').val();
        var pwd =$('#pwd').val();
        var validateCode =$('#validateCode').val();
        if (name==null||name==""){
            $('#error').html('用户名必填');
            return ;
        }
        if (pwd==null||pwd==""){
            $('#error').html('密码必填');
            return ;
        }

        $.ajax({
            type: "post",
            dataType: "json",
            url: 'doLogin.htm',
            async:false,
            data: { name : name,pwd:pwd,validateCode:validateCode },
            success: function(data){
                if(data.result){
                        window.location="${base}/index.htm";

                }else{
                    $('#error').html(data.msg);
                    $('#captcha').click();
                    $('#validateCode').val('');
                }
            },
            error:function(){
                $('#error').html("登录失败");
                $('#validateCode').val('');
            }

        });
    }

    function  changeValidCode() {
        $('#captcha').click();
    }

</script>
</@head>

<@body>

<div class="login lg-banner1">
    <div class="center" style="position: relative">
        <div class="login_box support" style="">
            <h3>用户登录</h3>
            <div class="error" id="error"></div>
            <form action="${base}/u/doLogin.htm" class="form" id="loginForm">
                <div class="text_wp">

                    <div class="lg_input form-group">
                        <em class="ic02"></em>
                        <input class="lg_txt01" style="font-size:12px;" type="text"  placeholder="请输入用户名" maxlength="12" id="name" name="userName" autofocus="autofocus" >
                    </div>
                    <div class="lg_input">
                        <em class="ic03"></em>
                        <input class="lg_txt01" style="font-size: 12px;" type="password"  placeholder="请输入登录密码" maxlength="20" id="pwd" name="password">
                    </div>
                    <div class="lg_input">
                        <em class="ic04"></em>
                        <input class="lg_txt02" style="font-size:12px;" type="text" placeholder="验证码" maxlength="5" id="validateCode" name="validateCode" onkeydown="f(event);">
                        <span class="code_img">
                        <b> <img id="captcha"
                                 src='${base}/validimg.htm' onClick="this.src='${base}/validimg.htm?t=' + Math.random();" ></b>
                        <a href="javascript:void(0);" onclick="changeValidCode();">换一张</a>
                    </span>
                    </div>

                </div>
            <#--  <div class="f12px" style="padding: 0 32px;margin-bottom: 14px;"><input class="" type="checkbox" style="cursor: pointer; ">记住密码</div>-->
                <div class="login_btn" id="loginIn"><a href="javascript:void(0);" onclick="login();">登录</a></div>
            </form>
            <p class="lg_link">
                <a href="${base}/u/register.htm" class="fl-left">马上注册</a>
                <a href="#" class="fl-right">忘记密码？</a>
            </p>
        </div>
    </div>
</div>

</@body>
</html>
