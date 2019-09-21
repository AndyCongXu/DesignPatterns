/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package patterns.factory.impl;

import patterns.factory.Shape;

/**
 *
 * @author jianjiu
 * @version : Rectangle.java, v 0.1 2019Äê09ÔÂ21ÈÕ 09:29 jianjiu Exp $
 */
public class Rectangle implements Shape {

    @Override
    public void draw(){
        System.out.println("This is Rectangle.");
    }
}