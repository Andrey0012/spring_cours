package org.kalinin.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan ("org.kalinin.spring")
public class MyConfig {
    @Bean
    @Scope ("singleton")
    public Pet petBin () {
        return new Cet();
    }

    @Bean
    public Person personBin () {
        return new Person(petBin());
    }
}
