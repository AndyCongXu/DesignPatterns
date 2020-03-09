/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package patterns.factory;

import enums.ShapeTypeWithClassEnums;
import org.apache.commons.lang3.StringUtils;
import patterns.factory.impl.Circle;
import patterns.factory.impl.Rectangle;
import patterns.factory.impl.Square;

import static enums.ShapeTypeEnums.CIRCLE;
import static enums.ShapeTypeEnums.RECTANGLE;
import static enums.ShapeTypeEnums.SQUARE;

/**
 *
 * @author jianjiu
 * @version : impl.java, v 0.1 2019��09��20�� 13:18 jianjiu Exp $
 */
public class FactoryService {

    public Shape getServiceByType(String type){

        Shape shape = null;

        if(StringUtils.isBlank(type)){
            return shape;
        }

        if(CIRCLE.getType().equalsIgnoreCase(type)){
            shape = new Circle();
        } else if(RECTANGLE.getType().equalsIgnoreCase(type)){
            shape = new Rectangle();
        } else if(SQUARE.getType().equalsIgnoreCase(type)){
            shape = new Square();
        }

        return shape;
    }

    /**
     * �Ժ����µ�������Ҫ����������ôֻ��Ҫ�޸Ķ�Ӧ��ö�ټ��ɡ�
     * @param type
     * @return
     */
    public Shape getServiceByClassName(String type){

        Shape shape = null;

        if(StringUtils.isBlank(type)){
            return shape;
        }

        try{
            String className = ShapeTypeWithClassEnums.getClassNameByType(type);
            if(StringUtils.isNotBlank(className)){
                shape = (Shape) Class.forName(className).newInstance();
            }

        } catch (Exception e){
            System.out.println(e);
        }

        return shape;
    }

    public <T> T getServiceByClassName(Class<? extends T> clazz){

        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return obj;
    }
}