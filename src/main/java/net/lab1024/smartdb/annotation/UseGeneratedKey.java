package net.lab1024.smartdb.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 使用数据库自动生成的为主键
 * @author  zhuoluodada
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface UseGeneratedKey {
}
