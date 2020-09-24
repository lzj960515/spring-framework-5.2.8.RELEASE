package com.my.spring.test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义import
 *
 * @author Zijian Liao
 * @since 1.0
 */
public class MyImport implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.my.spring.test.Bicycle"};
    }
}
