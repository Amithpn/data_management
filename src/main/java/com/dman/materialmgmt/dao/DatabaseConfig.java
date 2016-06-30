/*package com.dman.materialmgmt.dao;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


*//**
 * Contains database configurations.
 *//*
@Configuration
@EnableTransactionManagement
class DataSourceConfig {
 
   @Value("${spring.datasource.username}")
   private String user;
 
   @Value("${spring.datasource.password}")
   private String password;
 
   @Value("${spring.datasource.url}")
   private String dataSourceUrl;
 
   @Bean
   public DataSource primaryDataSource() {
	   
	   DataSource ds = new Data
       Properties dsProps = new Properties();
       dsProps.put("url", dataSourceUrl);
       dsProps.put("user", user);
       dsProps.put("password", password);
       //dsProps.put("prepStmtCacheSize",250);
       //dsProps.put("prepStmtCacheSqlLimit",2048);
       //dsProps.put("cachePrepStmts",Boolean.TRUE);
       //dsProps.put("useServerPrepStmts",Boolean.TRUE);

      //return dsProps;
   }
} */