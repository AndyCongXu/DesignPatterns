/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package patterns.factory.test;

import patterns.factory.FactoryService;
import patterns.factory.Shape;
import org.junit.Test;
import patterns.factory.impl.Circle;

/**
 *
 * @author jianjiu
 * @version : FactoryServiceTest.java, v 0.1 2019��09��20�� 13:20 jianjiu Exp $
 */
public class FactoryServiceTest {

    @Test
    public void test(){

        FactoryService factoryService = new FactoryService();

        Shape shape = factoryService.getServiceByType("CIRCLE");

        if(null != shape){
            shape.draw();
        }

    }

    @Test
    public void test2(){
        FactoryService factoryService = new FactoryService();

        Shape shape = factoryService.getServiceByClassName("CIRCLE");
        if(null != shape){
            shape.draw();
        }
    }

    @Test
    public void test3(){

        FactoryService factoryService = new FactoryService();

        Shape shape = factoryService.getServiceByClassName(Circle.class);
        if(null != shape){
            shape.draw();
        }

    }
}