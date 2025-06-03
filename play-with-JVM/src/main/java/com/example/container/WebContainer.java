package com.example.container;

import com.example.app1.UserController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WebContainer {

    public void handleHttpRequest(String req) {

        Class<?> clazz = null;
        try {

            // Custom class-loader
            clazz = Class.forName("com.example.app1.UserController");
            Object instance = clazz.newInstance();

            // using reflection api
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                RequestMapping rm = method.getAnnotation(RequestMapping.class);
                if (rm != null) {
                    String url = rm.url();
                    if (req.equals(url))
                        method.invoke(instance, new Object[]{});
                }

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }

}
