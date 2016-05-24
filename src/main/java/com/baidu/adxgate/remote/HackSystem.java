package com.baidu.adxgate.remote;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author huangjinkun.
 * @date 16/5/24
 * @time 下午9:50
 */
public class HackSystem {
    public static final InputStream in;
    private static ByteArrayOutputStream buffer;
    public static final PrintStream out;
    public static final PrintStream err;

    public HackSystem() {
    }

    public static String getBufferString() {
        return buffer.toString();
    }

    public static void clearBuffer() {
        buffer.reset();
    }

    public static void setSecurityManager(SecurityManager s) {
        System.setSecurityManager(s);
    }

    public static SecurityManager getSecurityManager() {
        return System.getSecurityManager();
    }

    public static long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) {
        System.arraycopy(src, srcPos, dest, destPos, length);
    }

    public static int identityHashCode(Object x) {
        return System.identityHashCode(x);
    }

    static {
        in = System.in;
        buffer = new ByteArrayOutputStream();
        out = new PrintStream(buffer);
        err = out;
    }
}

