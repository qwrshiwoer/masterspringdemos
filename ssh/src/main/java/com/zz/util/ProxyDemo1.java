package com.zz.util;

/**
 * 代理模式是什么
 * 代理模式是一种设计模式，
 * 简单说即是在不改变源码的情况下，
 * 实现对目标对象的功能扩展。
 *
 * --静态代理
 * 1，代理类和目标类都实现同一个接口
 * 2，代理类，需要有一个成员变量，数据类型是目标类
 * 3，代理类的构造方法里面可以传入目标类对象
 * 4, 执行一个方法时候，不直接执行目标类对象的方法
 * 而是通过执行代理类的方法，
 * 在代理类方法的里面执行目标类的方法
 *
 * 动态代理
 * 1，目标类需要实现一个接口
 * 2，代理类实现InvocationHandler接口
 * 3，代理类的构造方法里面可以传入目标类对象
 * 4,执行一个方法时候，不直接执行目标类对象的方法
 *
 *
 * 静态代理和动态代理的区别：
 * 静态代理，目标和代理类必须实现同一个接口
 * 但是动态代理不需要，因为动态代理通过反射执行目标类的方法
 */
public class ProxyDemo1 {

}
