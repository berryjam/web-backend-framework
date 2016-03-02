package com.baidu.adxgate.portal.blog.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * @author huangjinkun.
 * @date 16/2/21
 * @time 下午7:52
 */
public abstract class AbstractDao {
    protected final Log log = LogFactory.getLog(getClass());

    @Resource(name = "oneadxJdbcTemplate")
    protected JdbcTemplate jdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Resource(name = "oneadxJdbcTemplate")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
