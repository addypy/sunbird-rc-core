package dev.sunbirdrc.registry.app;

import dev.sunbirdrc.registry.util.EntityParenter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// AppStartupRunner class implements ApplicationRunner to execute custom code after the application has started
@Component
public class AppStartupRunner implements ApplicationRunner {
    // Logger instance for logging messages
    private static Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    // Autowired EntityParenter instance for managing parent vertex and shard records
    @Autowired
    EntityParenter entityParenter;

    // Override the run method to execute custom code after the application has started
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Log the start of loading parent vertex and shard records
        logger.info("On Boot starts loading: parent vertex and shard records");

        // Ensure known parenters are loaded
        entityParenter.ensureKnownParenters();

        // Load the definition index
        entityParenter.loadDefinitionIndex();

        // Ensure the index exists
        entityParenter.ensureIndexExists();
    }
}