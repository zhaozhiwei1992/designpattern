package com.lx.designpattern.personalproxy;

import com.lx.designpattern.Server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 赵志伟
 * @ClassName: HKProxyServer
 * @description [使用jdk动态代理实现, 不用实现与被代理类相同的接口, 接口增加方法也与我无关, 动态调用被代理类方法,
 * 在调用方法前我可以输出日志, aop, 但是调用的方法的对象是传入的client对象]
 * @create 2018-03-31 上午7:56
 **/
public class PersonalHKProxyServer implements InvocationHandler {

    //传入客户端信息
    private Server client;

    public PersonalHKProxyServer(Server client) {
        this.client = client;
    }

    /**
     * 自定义生成一个代理对象实例
     *
     * @return
     */
    public Object getInstence() {
        // 加载class
        // 返回obj
        // 生成class文件
        Class<?> clazz = client.getClass();
        Class<?> cl = getProxyClass0(clazz.getInterfaces()[0]);
//        final Constructor<?> cons = cl.getConstructor(new Class[]{InvocationHandler.class});
//        return cons.newInstance(new Object[]{this})
//        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return null;
    }


    /**
     * 生成代理字符串并写出到文件中
     // 根据当前传入class 生成代理类
     //生成 java文件
     //编译源代码生成class

     //载入到jvm
     //返回
     * @param clazz
     */
    private Class<?> getProxyClass0(Class<?> clazz) {
        StringBuilder builder = new StringBuilder("package com.lx.designpattern.personalproxy; \n");
        builder.append("import com.lx.designpattern.Server;\n");
        builder.append("import java.lang.reflect.InvocationHandler;\n");
        builder.append("import java.lang.reflect.UndeclaredThrowableException;\n");
        builder.append("import java.lang.reflect.Method;\n");
        builder.append("public final class $Proxy0ByZhao implements " + clazz.getSimpleName() + " {\n");
        builder.append("    protected InvocationHandler h;\n");
        builder.append("protected $Proxy0ByZhao(InvocationHandler h) {\n");
        builder.append("        this.h = h;\n");
        builder.append("    }\n");

        for (Method method : clazz.getMethods()) {
            builder.append("@Override");
            builder.append("    public final " + method.getReturnType().getSimpleName() + " " + method.getName() + " (Boolean var1){\n");
            builder.append("        try {\n");
            builder.append("  Method m3 = Class.forName(\""+ clazz.getName() +"\").getMethod(\"" + method.getName()+ "\", Class.forName(\"java.lang.Boolean\"));\n");
            builder.append("            return ("+ method.getReturnType().getSimpleName()+ ")h.invoke(this, m3, new Object[]{var1});\n");
            builder.append("        } catch (RuntimeException | Error var3) {\n");
            builder.append("        } catch (Throwable var4) {\n");
            builder.append("        }\n");
            builder.append(" return false;   }\n");
            builder.append("\n");
        }
//                "    public final boolean internetgoogle(Boolean var1) throws  {\n" +
//                "        try {\n" +
//                "            return (Boolean)super.h.invoke(this, m3, new Object[]{var1});\n" +
//                "        } catch (RuntimeException | Error var3) {\n" +
//                "            throw var3;\n" +
//                "        } catch (Throwable var4) {\n" +
//                "            throw new UndeclaredThrowableException(var4);\n" +
//                "        }\n" +
//                "    }\n" +
//                "\n" +
        builder.append("}");

        //写出到磁盘
        FileWriter fileWriter = null;
        String path = System.getProperty("user.dir");
        try {
            fileWriter = new FileWriter(path + "\\src\\main\\java\\com\\lx\\designpattern\\personalproxy\\$Proxy0ByZhao.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write(String.valueOf(builder));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        args = new Object[]{true};//代理执行方法前可以搞事情
        System.out.println("mylog +++++++++ 动态代理调用方法 " + method.getName());
        return method.invoke(this.client, args);
    }
}
