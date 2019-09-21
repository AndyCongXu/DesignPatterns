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
 * @version : ShapeTypeWithClassEnums.java, v 0.1 2019年09月21日 10:09 jianjiu Exp $
 */
public enum ShapeTypeWithClassEnums {
    CIRCLE("circle", Circle.class.getName(), "圆"),

    RECTANGLE("rectangle", Rectangle.class.getName(), "长方形"),

    SQUARE("square", Square.class.getName(), "正方形"),

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