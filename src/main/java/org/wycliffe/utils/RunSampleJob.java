package org.wycliffe.utils;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import io.quarkus.scheduler.Scheduled;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RunSampleJob {

    @Scheduled(cron="{cron.expr}")
    public void runJobEveryFive(){
        System.out.println("=====================[1 minute elapsed");
    }
}
