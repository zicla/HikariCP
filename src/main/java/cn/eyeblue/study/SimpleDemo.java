package cn.eyeblue.study;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 简单测试，用于最简答的连接
 *
 * @author fusu
 * @version 2020-09-01
 */
public class SimpleDemo {


   /**
    * 使用无参数构造函数的方式创建数据源
    */
   private void noArgDataSource() throws SQLException {

      HikariDataSource dataSource = new HikariDataSource();
      dataSource.setJdbcUrl("jdbc:mysql://eyeblue.cn:3306/tank_dev");
      dataSource.setUsername("tank_dev");
      dataSource.setPassword("Tank_dev_123");
      //设置数据库独有的属性
      dataSource.addDataSourceProperty("cachePrepStmts", "true");
      //从连接池获取连接
      Connection connection = dataSource.getConnection();



   }

   public static void main(String[] args) {


   }
}
