package com.todo.configuration;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by sebastian on 24.06.16.
 */
@Configuration
@ComponentScan
@EnableMongoRepositories
public class MongoDbConfiguration extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "todo";
    }

    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new Mongo();
        mongo.setWriteConcern(WriteConcern.SAFE);

        return mongo;

    }
}
