/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package patterns.factory.impl;

import patterns.factory.Shape;

/**
 *
 * @author jianjiu
 * @version : Square.java, v 0.1 2019Äê09ÔÂ21ÈÕ 09:31 jianjiu Exp $
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("This is Square.");
    }
}