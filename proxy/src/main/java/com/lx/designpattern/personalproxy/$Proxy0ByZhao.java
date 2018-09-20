package com.lx.designpattern.personalproxy; 
import com.lx.designpattern.Server;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.UndeclaredThrowableException;
import java.lang.reflect.Method;
public final class $Proxy0ByZhao implements Server {
    protected InvocationHandler h;
protected $Proxy0ByZhao(InvocationHandler h) {
        this.h = h;
    }
@Override    public final boolean internetbaidu (Boolean var1){
        try {
  Method m3 = Class.forName("com.lx.designpattern.Server").getMethod("internetbaidu", Class.forName("java.lang.Boolean"));
            return (boolean)h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
        } catch (Throwable var4) {
        }
 return false;   }

@Override    public final boolean internetgoogle (Boolean var1){
        try {
  Method m3 = Class.forName("com.lx.designpattern.Server").getMethod("internetgoogle", Class.forName("java.lang.Boolean"));
            return (boolean)h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
        } catch (Throwable var4) {
        }
 return false;   }

}