/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package enums;

/**
 *
 * @author jianjiu
 * @version : ShapeTypeEnums.java, v 0.1 2019��09��21�� 10:06 jianjiu Exp $
 */
public enum ShapeTypeEnums {

    CIRCLE("circle", "Բ"),

    RECTANGLE("rectangle", "������"),

    SQUARE("square", "������"),

    ;

    String type;

    String desc;

    ShapeTypeEnums(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}