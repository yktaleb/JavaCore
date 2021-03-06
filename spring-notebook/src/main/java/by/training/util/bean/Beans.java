package by.training.util.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Beans {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
