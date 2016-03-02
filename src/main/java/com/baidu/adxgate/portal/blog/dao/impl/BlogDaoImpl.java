package com.baidu.adxgate.portal.blog.dao.impl;

import com.baidu.adxgate.portal.blog.bo.BlogInfo;
import com.baidu.adxgate.portal.blog.dao.AbstractDao;
import com.baidu.adxgate.portal.blog.dao.BlogDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author huangjinkun.
 * @date 16/2/21
 * @time 下午7:48
 */
@Repository
public class BlogDaoImpl extends AbstractDao implements BlogDao {


    public List<BlogInfo> getBlogInfosWithSize(int offset, int size) {
        String sql = "select title,subtitle,author,createtime,modtime from blog limit " + offset + "," + size;
        List<BlogInfo> blogInfos = jdbcTemplate.query(sql, new RowMapper<BlogInfo>() {

            public BlogInfo mapRow(ResultSet resultSet, int i) throws SQLException {
                BlogInfo blog = new BlogInfo();
                blog.setTitle(resultSet.getString("title"));
                blog.setSubtitle(resultSet.getString("subtitle"));
                blog.setAuthor(resultSet.getString("author"));
                blog.setCreateTime(resultSet.getString("createtime"));
                blog.setModTIme(resultSet.getString("modtime"));
                return blog;
            }
        });
        return blogInfos;
    }
}
