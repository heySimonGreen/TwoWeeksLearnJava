package day22.code;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author: chenwei
 * @date: 2021/8/22 0:26
 * @description: 描述
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ElementType.TYPE_PARAMETER})
public @interface MyAnnotation {
    String value() default "hello";
}
