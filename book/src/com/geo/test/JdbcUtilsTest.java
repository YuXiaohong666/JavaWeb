package com.geo.test;

import com.geo.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author yuxiaohong
 * @package com.geo.test
 * @date 2023/7/7 11:08
 * @description
 */
public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils() {
        for (int i = 0; i < 100; i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }
}
