/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package patterns.factory.impl;

import patterns.factory.*;


/**
 *
 * @author jianjiu
 * @version : Circle.java, v 0.1 2019Äê09ÔÂ21ÈÕ 09:32 jianjiu Exp $
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("This is Circle.");
    }
}