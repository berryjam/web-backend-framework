package com.baidu.adxgate.portal.blog.service.impl;

import com.baidu.adxgate.portal.blog.bo.BlogInfo;
import com.baidu.adxgate.portal.blog.dao.BlogDao;
import com.baidu.adxgate.portal.blog.service.BlogService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huangjinkun.
 * @date 16/2/21
 * @time 下午8:04
 */
@Service
public class BlogServiceImpl implements BlogService {
    private final Log log = LogFactory.getLog(getClass());

    @Resource
    private BlogDao blogDao;


    public List<BlogInfo> queryBlogs(int offset, int size) {
        List<BlogInfo> blogInfos = null;
        try {
            blogInfos = blogDao.getBlogInfosWithSize(offset, size);

            return blogInfos;
        } catch (Exception e) {
            log.error("BlogService|queryBlogs", e);
        } finally {
            log.info("BlogService|queryBlogs" + blogInfos == null ? "null" : blogInfos.size());
        }

        return blogInfos;
    }
}
