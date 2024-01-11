package com.geo.dao.impl;

import com.geo.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Handler;

/**
 * @author yuxiaohong
 * @package com.geo.dao.impl
 * @date 2023/7/7 11:34
 * @description
 */
public abstract class BaseDao {
    // 使用jdbc操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * @Author: yuxiaohong
     * @Description: update方法用来执行insert、update、delete语句。
     * @Return 如果返回-1说明执行失败
     */
    public int update(String sql, Object... args) {
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(connection);
        }
        // return -1;
    }

    /**
     * @Author: yuxiaohong
     * @Description: 查询返回的一条JavaBean的sql语句
     * @Params: type：返回的对象类型
     * @Params: sql：执行的sql语句
     * @Params: args：sql对应的参数
     * @Params: T：返回的类型的泛型
     * @Return
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(connection);
        }
    }

    /**
     * @Author: yuxiaohong
     * @Description: 查询返回的多个JavaBean的sql语句
     * @Params: type：返回的对象类型
     * @Params: sql：执行的sql语句
     * @Params: args：sql对应的参数
     * @Params: T：返回的类型的泛型
     * @Return
     */
    
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection, sql, new BeanListHandler<>(type), args);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.close(connection);
        }
    }
}
