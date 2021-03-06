package com.oath.micro.server.spring;

import java.util.Optional;
import java.util.Set;


import com.oath.micro.server.Plugin;
import com.oath.micro.server.spring.datasource.JdbcConfig;
import com.oath.micro.server.spring.datasource.hibernate.HibernateConfig;
import com.oath.micro.server.spring.datasource.jdbc.SQL;
import cyclops.reactive.collections.mutable.SetX;

/**
 * 
 * Collections of Spring configuration classes (Classes annotated with @Configuration)
 * that configure various useful pieces of functionality - such as property file loading,
 * datasources, scheduling etc
 * 
 * @author johnmcclean
 *
 */
public class HibernatePlugin implements Plugin {

	@Override
	public Optional<SpringDBConfig> springDbConfigurer() {
		return Optional.of(new HibernateSpringConfigurer());
	}

	@Override
	public Set<Class> springClasses() {
		return SetX.of(JdbcConfig.class, SQL.class, HibernateConfig.class);
	}

	

}
