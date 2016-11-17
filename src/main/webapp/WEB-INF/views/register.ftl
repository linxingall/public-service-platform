<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type">
    <title>注册</title>
    <link rel="stylesheet" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/bootstrapValidator.css">
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/bootstrapValidator.js"></script>
    <script src="static/js/sha1.js"></script>
    <script>
        $(document).ready(function() {
            $('#register_form')
                    .bootstrapValidator({
                        message: '验证不通过',
                        feedbackIcons: {
                            valid: 'glyphicon glyphicon-ok',
                            invalid: 'glyphicon glyphicon-remove',
                            validating: 'glyphicon glyphicon-refresh'
                        },
                        fields: {
                            name: {
                                message: '用户名验证通过',
                                validators: {
                                    notEmpty: {
                                        message: '用户名不能为空'
                                    },
                                    stringLength: {
                                        min: 6,
                                        max: 30,
                                        message: '用户名长度需在6-30个字符'
                                    },
                                    remote: {
                                        url: 'checkName.htm',

                                        message: '用户名已被使用'
                                    },
                                    /*regexp: {
                                        regexp: /^[a-zA-Z0-9_\.]+$/,
                                        message: 'The username can only consist of alphabetical, number, dot and underscore'
                                    }*/
                                }
                            },
                            email: {
                                validators: {
                                    notEmpty: {
                                        message: '邮箱不能为空'
                                    },
                                    emailAddress: {
                                        message: '无效的邮箱地址'
                                    }
                                }
                            },
                            pwd: {
                                validators: {
                                    notEmpty: {
                                        message: '密码不能为空'
                                    },
                                    identical: {
                                        field: 'confirmPwd',
                                        message: '两次输入密码不同'
                                    }
                                }
                            },
                            confirmPwd: {
                                validators: {
                                    notEmpty: {
                                        message: '重复密码不能为空'
                                    },
                                    identical: {
                                        field: 'pwd',
                                        message: '两次输入密码不同'
                                    }
                                }
                            },
                            validateCode: {
                                validators: {
                                    notEmpty: {
                                        message: '验证码不能为空'
                                    }/*,
                                    remote: {
                                        url: 'checkValidImg.htm',

                                        message: '验证码错误'
                                    }*/
                                }
                            }
                        }
                    })
                    .on('success.form.bv', function(e) {
                        // Prevent form submission
                        e.preventDefault();

                        // Get the form instance
                        var $form = $(e.target);

                        // Get the BootstrapValidator instance
                        var bv = $form.data('bootstrapValidator');

                        // Use Ajax to submit form data
                        $('#pwd').val(hex_sha1($('#pwd').val()));
                        $('#confirmPwd').val(hex_sha1($('#confirmPwd').val()));
                        $.post($form.attr('action'), $form.serialize(), function(result) {
                            //TODO 错误提示及跳转
                            if(result.result){
                                window.location="index.htm";
                            }else{
                                $('#errorContent').html(result.msg);
                            }
                        }, 'json');
                    });
        });
    </script>
</head>
<body>
<div id="loginModal" class="modal show">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close">x</button>
                <h1 class="text-center text-primary">注册</h1>
            </div>
            <div ><span style="color: red" id="errorContent"></span></div>
            <div class="modal-body">
                <form action="/doRegister.htm" class="form col-md-12 center-block" id ="register_form">
                    <div class="form-group">
                        <input type="text" class="form-control input-lg" placeholder="用户名" id="name" name="name">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control input-lg" placeholder="密码"id="pwd" name="pwd">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control input-lg" placeholder="重复密码" id="confirmPwd" name="confirmPwd">
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control input-lg" placeholder="邮箱" id="email" name="email">
                    </div>
                    <div class="form-group col-md-6">

                        <div class="input-group">
                            <input type="text" class="form-control"
                                   id="validateCode" name="validateCode"
                                   placeholder="六位字符验证码">
                            <img id="captcha"
                                 src='/validimg.htm' onClick="this.src='/validimg.htm?t=' + Math.random();" >
                        </div>
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-lg btn-block">注册</button>
                        <span><a href="#">找回密码</a></span>
                        <span><a href="#" class="pull-right">登录</a></span>
                    </div>
                </form>
            </div>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>
</body>
</html>
