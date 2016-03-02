package com.baidu.adxgate.portal.blog.service;

import com.baidu.adxgate.portal.blog.bo.BlogInfo;

import java.util.List;

/**
 * @author huangjinkun.
 * @date 16/2/21
 * @time 下午8:01
 */
public interface BlogService {

    List<BlogInfo> queryBlogs(int offset,int size);
}
