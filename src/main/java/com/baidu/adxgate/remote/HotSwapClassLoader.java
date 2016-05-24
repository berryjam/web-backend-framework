package com.baidu.adxgate.remote;

/**
 * @author huangjinkun.
 * @date 16/5/24
 * @time 下午9:50
 */
public class HotSwapClassLoader extends ClassLoader {
    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classByte) {
        return this.defineClass((String) null, classByte, 0, classByte.length);
    }
}
