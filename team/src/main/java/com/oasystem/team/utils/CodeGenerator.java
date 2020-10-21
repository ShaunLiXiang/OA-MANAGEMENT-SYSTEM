package com.oasystem.team.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 代码生成器
 */
public class CodeGenerator {
    public static void main(String[] args) {
        //自动生成器
        AutoGenerator cgAuto = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("十一组");
        gc.setOutputDir(System.getProperty("user.dir")+"/src/main/java/");
        gc.setXmlName("../../../../../../resources/mapper/%sMapper");

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql:///oadb?useUnicode=true&useSSL=false&serverTimezone=GMT%2B8&characterEncoding=utf8");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123");
        dataSourceConfig.setDbType(DbType.MYSQL);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();;
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);

        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.oasystem.team");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("serviceImpl");
        packageConfig.setController("controller");
        packageConfig.setXml("../../../../../../resources/mapper");

        //set自动生成器的
        cgAuto.setPackageInfo(packageConfig);
        cgAuto.setStrategy(strategyConfig);
        cgAuto.setDataSource(dataSourceConfig);
        cgAuto.setGlobalConfig(gc);

        //执行代码生成器
        cgAuto.execute();
    }
}
