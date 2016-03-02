package com.baidu.adxgate.portal.blog.controller;

import com.baidu.adxgate.portal.blog.bo.BlogInfo;
import com.baidu.adxgate.portal.blog.service.BlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 博客Controller
 *
 * @author huangjinkun.
 * @date 16/2/20
 * @time 下午9:05
 */
@Controller
@RequestMapping(value = "/portal")
public class BlogController {
    @Autowired
    private BlogService blogService;

    private static final Logger LOG = LoggerFactory.getLogger(BlogController.class);

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping(value = "/GetBlog")
    @ResponseBody
    public List<BlogInfo> getBlogInfo(@RequestParam("start") int start, @RequestParam("size") int size) throws
            ParseException {
        List<BlogInfo> blogs;

        blogs = blogService.queryBlogs(start, size);

//        BlogInfo blog1 = new BlogInfo();
//        blog1.setTitle("Man must explore, and this is exploration at its greatest");
//        blog1.setSubtitle("Problems look mighty small from 150 miles up");
//        blog1.setAuthor("berryjam");
//        blog1.setCreateTime(format.format(new Date()));
//        blog1.setModTIme(format.format(new Date()));
//        blogs.add(blog1);

        LOG.info("GetBlog:" + blogs);

        return blogs;
    }
}
