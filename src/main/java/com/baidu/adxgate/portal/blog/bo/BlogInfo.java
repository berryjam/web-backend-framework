package com.baidu.adxgate.portal.blog.bo;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModTIme() {
        return modTIme;
    }

    public void setModTIme(String modTIme) {
        this.modTIme = modTIme;
    }
}
