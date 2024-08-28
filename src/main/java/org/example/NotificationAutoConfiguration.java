package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(NotificationService.class)
    public NotificationService notificationService(NotificationProperties notificationProperties){
        return new NotificationService(notificationProperties.getStandardMessage());
    }
}
