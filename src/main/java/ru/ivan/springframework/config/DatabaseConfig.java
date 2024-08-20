package ru.ivan.springframework.config;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("ru.ivan.springframework.repository")
@EnableTransactionManagement
public class DatabaseConfig {
    @Autowired
    Environment env;
}
