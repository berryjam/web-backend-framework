package com.baidu.adxgate.remote;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huangjinkun.
 * @date 16/5/24
 * @time 下午9:51
 */
public class JavaClassExecuter {
    public JavaClassExecuter() {
    }

    public static String execute(byte[] classByte) {
        HackSystem.clearBuffer();
        ClassModifier cm = new ClassModifier(classByte);
        byte[] modiBytes = cm.modifyUTF8Constant("java/lang/System", "com/baidu/adxgate/remote/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(modiBytes);

        try {
            Method e = clazz.getMethod("main", new Class[]{String[].class});
            e.invoke(null, new String[]{null});
        } catch (NoSuchMethodException var6) {
            var6.printStackTrace();
        } catch (InvocationTargetException var7) {
            var7.printStackTrace();
        } catch (IllegalAccessException var8) {
            var8.printStackTrace();
        }

        return HackSystem.getBufferString();
    }
}
