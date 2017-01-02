<div class="topNav">
    <div class="center row">
        <div class="col-xs-12 text-right topNav-right ">
            <div class="iteam">
                <a href="#" class="iteam"><span class="iconfont">&#xe609;</span>客服热线：<strong class="red">123456</strong></a>
                <input type="hidden" id="baseUrl" value="${base}">
            </div>
            <#if Session.USER_AGENT_IN_REQUEST ? exists>
            <div class="iteam navsecond">
                <a href="#" class=" "><span class="iconfont">&#xe688;</span>
                个人中心<i class="iconfont">&#xe629;</i>
                </a>
                <div class="iteam_second">
                    <span><a href="${base}/logout.htm" target="_blank">安全退出</a></span>
                </div>
            </div>
            <#else>
            <div class="iteam navsecond">
                <a href="${base}/login.htm" target="_blank">电商登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </div>
            </#if>
        </div>
    </div>
</div>
<div class="head">
    <div class="center row">
        <a href="${base}/index.htm" class=" logo"><img src="${base}/static/styles/images/logo.png" /></a>
        <div class="col-xs-12 text-right">
            <div class="top-mune">
                <div class="iteam"><a href="${base}/about.htm">关于我们</a></div>
            </div>
        </div>
    </div>
</div>