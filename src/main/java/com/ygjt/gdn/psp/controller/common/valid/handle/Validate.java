package com.ygjt.gdn.psp.controller.common.valid.handle;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 字段校验
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
    public String fileName();
    boolean notNull() default false;//标记是否可以为空

    int maxLength() default -1;//标记最大长度

    boolean sign() default false;//标记是否参与签名,字段顺序从上到下

    String regex() default "";//正则表达式

    boolean numeral() default false;//表示数字

    boolean character() default false;//表示字母

    boolean numAndChar() default false;//字母和数字

    boolean money() default false;//表示金额  小数精确到两位


}
