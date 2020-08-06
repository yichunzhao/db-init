package com.ynz.dbinit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "app.init", havingValue = "true")
public class DbInit implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {


    }
}
