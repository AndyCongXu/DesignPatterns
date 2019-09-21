/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package enums;

import org.apache.commons.lang3.StringUtils;
import patterns.factory.impl.Circle;
import patterns.factory.impl.Rectangle;
import patterns.factory.impl.Square;

/**
 *
 * @author jianjiu
 * @version : ShapeTypeWithClassEnums.java, v 0.1 2019��09��21�� 10:09 jianjiu Exp $
 */
public enum ShapeTypeWithClassEnums {
    CIRCLE("circle", Circle.class.getName(), "Բ"),

    RECTANGLE("rectangle", Rectangle.class.getName(), "������"),

    SQUARE("square", Square.class.getName(), "������"),

    ;

    String type;

    String className;

    String desc;

    ShapeTypeWithClassEnums(String type, String className, String desc) {
        this.type = type;
        this.className = className;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static String getClassNameByType(String type){

        if(StringUtils.isBlank(type)){
            return "";
        }

        for(ShapeTypeWithClassEnums enums : values()){

            if(enums.getType().equalsIgnoreCase(type)){
                return enums.getClassName();
            }

        }

        return "";
    }
}