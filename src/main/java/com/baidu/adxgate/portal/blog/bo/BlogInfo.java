package com.baidu.adxgate.portal.blog.bo;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * 博客bo
 *
 * @author huangjinkun.
 * @date 16/2/20
 * @time 下午9:07
 */
public class BlogInfo {
    @JsonProperty("blogtitle")
    private String title;
    @JsonProperty("blogsubtitle")
    private String subtitle;
    @JsonProperty("author")
    private String author;
    @JsonProperty("createtime")
    private String createTime;
    @JsonProperty("modtime")
    private String modTIme;

    public BlogInfo() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModTIme() {
        return this.modTIme;
    }

    public void setModTIme(String modTIme) {
        this.modTIme = modTIme;
    }

    public String toString() {
        return "BlogInfo{title=\'" + this.title + '\'' + ", subtitle=\'" + this.subtitle + '\'' + ", author=\'" + this.author + '\'' + ", createTime=\'" + this.createTime + '\'' + ", modTIme=\'" + this.modTIme + '\'' + '}';
    }
}
