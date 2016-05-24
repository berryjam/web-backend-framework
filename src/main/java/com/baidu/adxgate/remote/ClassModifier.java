package com.baidu.adxgate.remote;

/**
 * @author huangjinkun.
 * @date 16/5/24
 * @time 下午9:49
 */
public class ClassModifier {
    private static final int CONSTANT_POOL_COUNT_INDEX = 8;
    private static final int CONSTANT_Utf8_info = 1;
    private static final int[] CONSTANT_ITEM_LENGTH = new int[]{-1, -1, 5, -1, 5, 9, 9, 3, 3, 5, 5, 5, 5};
    private static final int u1 = 1;
    private static final int u2 = 2;
    private byte[] classByte;

    public ClassModifier(byte[] classByte) {
        this.classByte = classByte;
    }

    public byte[] modifyUTF8Constant(String oldStr, String newStr) {
        int cpc = this.getConstantPoolCount();
        int offset = 10;

        for(int i = 0; i < cpc; ++i) {
            int tag = ByteUtils.bytes2Int(this.classByte, offset, 1);
            if(tag == 1) {
                int len = ByteUtils.bytes2Int(this.classByte, offset + 1, 2);
                offset += 3;
                String str = ByteUtils.bytes2String(this.classByte, offset, len);
                if(str.equalsIgnoreCase(oldStr)) {
                    byte[] strBytes = ByteUtils.string2Bytes(newStr);
                    byte[] strLen = ByteUtils.int2Bytes(newStr.length(), 2);
                    this.classByte = ByteUtils.bytesReplace(this.classByte, offset - 2, 2, strLen);
                    this.classByte = ByteUtils.bytesReplace(this.classByte, offset, len, strBytes);
                    return this.classByte;
                }

                offset += len;
            } else {
                offset += CONSTANT_ITEM_LENGTH[tag];
            }
        }

        return this.classByte;
    }

    public int getConstantPoolCount() {
        return ByteUtils.bytes2Int(this.classByte, 8, 2);
    }
}
