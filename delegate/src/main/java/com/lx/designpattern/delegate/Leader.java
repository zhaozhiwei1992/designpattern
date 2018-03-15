package com.lx.designpattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * boss 命令的直接被委派人， 用来理解boss的命令合理分配给手下的兄弟们
 *  被委派人是不干活的， 只是为了分活儿
 */
public class Leader implements Target{
    private Map<String,Target> targets = new HashMap<String,Target>();

    public Leader() {
        targets.put("js", new ZhangSan());// key 就是这个人的标签， 适合做js
        targets.put("java", new LiGouDan());
    }

    /**
     * 项目经理是不会直接去lu代码的， 他会根据手下的特长合理分配任务（策略模式）
     *
     * @param things
     */
    @Override
    public void doing(String things) {
        //可以采用策略的方式进行
//        if(things.equalsIgnoreCase("js")){
//            new ZhangSan().doing(things);
//        }
        targets.get(things).doing(things);
    }
}
