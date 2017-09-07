/*package com.chitransh.app.config;

import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.chitransh.app.SpringBootJpaStudentAppApplication;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages={"com.chitransh.app.repositories"})
@PropertySource("application.properties")
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages={"com.chitransh.app.repositories"})
@EntityScan(basePackages={"com.chitransh.app.model"})
@ComponentScan(basePackages={"com.chitransh.app.controller","com.chitransh.app.service"})
public class JpaConfiguration  extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootJpaStudentAppApplication.class);
	}
	
	@Autowired
	private Environment env;
	
	@Bean
	public Map<String, Object> jpaProperties(){
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("hibernate.dialect", MySQL5InnoDBDialect.class.getName());
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", true);
		return props;
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource());
		lef.setJpaPropertyMap(jpaProperties());
		lef.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		lef.setPackagesToScan("com.chitransh.app.model");
		lef.afterPropertiesSet();
		return lef.getObject();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(){
		return new JpaTransactionManager(entityManagerFactory());
	}
	
	@Bean
	public DataSource dataSource(){
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			//dataSource.setDriverClass(env.getRequiredProperty("database.driverclass"));
			dataSource.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
			dataSource.setUser(env.getRequiredProperty("spring.datasource.username"));
			dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
			dataSource.setMaxPoolSize(15);
			dataSource.setMinPoolSize(5);
			
		} catch (IllegalStateException e) {
			throw new RuntimeException("An error occured while connecting database");
		}
		return dataSource;
	}
	

}
*/