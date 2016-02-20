package com.baidu.adxgate.portal.creative.bo;

/**
 * @author huangjinkun.
 * @date 16/1/4
 * @time 下午7:39
 */
public class CreativeAuditInfo {

    private long id;
    private String modTime;
    private long creativeId;
    private int version;
    private int adxId;
    private int audit_state;
    private String rejectReason;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModTime() {
        return modTime;
    }

    public void setModTime(String modTime) {
        this.modTime = modTime;
    }

    public long getCreativeId() {
        return creativeId;
    }

    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getAdxId() {
        return adxId;
    }

    public void setAdxId(int adxId) {
        this.adxId = adxId;
    }

    public int getAudit_state() {
        return audit_state;
    }

    public void setAudit_state(int audit_state) {
        this.audit_state = audit_state;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
}
