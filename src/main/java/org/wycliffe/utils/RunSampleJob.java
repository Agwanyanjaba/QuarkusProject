package org.wycliffe.utils;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.quarkus.scheduler.Scheduled;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RunSampleJob {
    final Logger LOGGER = Logger.getLogger(RunSampleJob.class);

    @Scheduled(cron="{custom.sanction-cron.expression}")
    public void runJobEveryFive(){
        LOGGER.info("=====================[1 minute elapsed");
    }
}
