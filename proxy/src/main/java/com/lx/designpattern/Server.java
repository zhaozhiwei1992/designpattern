package com.lx.designpattern;

/**
 * 一个服务器接口， 服务器有很多功能， 可以用来路由， 建站等...
 */
public interface Server {
    boolean internetgoogle(Boolean ispass);
    boolean internetbaidu(Boolean ispass);
}
