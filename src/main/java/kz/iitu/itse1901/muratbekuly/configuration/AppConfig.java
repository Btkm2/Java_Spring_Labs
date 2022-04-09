//package kz.iitu.itse1901.muratbekuly.configuration;
//
//import kz.iitu.itse1901.muratbekuly.database.Car;
//import org.hibernate.SessionFactory;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.*;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.util.Properties;
//
//@Configuration
//@ComponentScan("kz.iitu.itse1901.muratbekuly")
//@EnableTransactionManagement
//@PropertySource("classpath:hibProperties.properties")
//public class AppConfig {
////    private static Logger logger =
////            LoggerFactory.getLogger(AppConfig.class);
//
//
//    @Value("${driverClassName}")
//    private String driverClassName;
//    @Value("${url}")
//    private String url;
//    @Value("${username123}")
//    private String username;
//    @Value("${password}")
//    private String password;
//
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer
//    propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        try {
//            DriverManagerDataSource dataSource = new DriverManagerDataSource();
//            dataSource.setDriverClassName(driverClassName);
//            dataSource.setUrl(url);
//            dataSource.setUsername(username);
//            dataSource.setPassword(password);
//            return dataSource;
//        } catch (Exception e) {
////            logger.error("DBCP DataSource bean cannot be created!", e);
//            return null;
//        }
//    }
//
//    private Properties hibernateProperties() {
//        Properties hibernateProp = new Properties();
//        hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//        hibernateProp.put("hibernate.hbm2ddl.auto", "create-drop");
//        hibernateProp.put("hibernate.format_sql", true);
//        hibernateProp.put("hibernate.use_sql_comments", true);
//        hibernateProp.put("hibernate.show_sql", true);
//        hibernateProp.put("hibernate.max_fetch_depth", 3);
//        hibernateProp.put("hibernate.jdbc.batch_size", 10);
//        hibernateProp.put("hibernate.jdbc.fetch_size", 50);
//        return hibernateProp;
//    }
//
//    @Bean
//    public SessionFactory sessionFactory() {
//        return new LocalSessionFactoryBuilder(dataSource())
//                .scanPackages("kz.iitu.itse1901.muratbekuly")
//                .addProperties(hibernateProperties())
//                .buildSessionFactory();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager()
//            throws IOException {
//        return new HibernateTransactionManager(sessionFactory());
//    }
//
//}
