package com.baidu.adxgate.portal.blog.dao;

import com.baidu.adxgate.portal.blog.bo.BlogInfo;

import java.util.List;

/**
 * @author huangjinkun.
 * @date 16/2/21
 * @time 下午7:45
 */
public interface BlogDao {

    /**
     * 返回指定数量的博客内容
     *
     * @param offset 指定初始位置
     * @param size 指定的博客数量
     * @return
     */
    List<BlogInfo> getBlogInfosWithSize(int offset, int size);
}
