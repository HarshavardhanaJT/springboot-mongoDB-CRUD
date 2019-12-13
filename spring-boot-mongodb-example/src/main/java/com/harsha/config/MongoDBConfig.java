package com.harsha.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.harsha.repository")
@Configuration
public class MongoDBConfig {

}
