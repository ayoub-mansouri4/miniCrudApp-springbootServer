package springboot.server.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springboot.server.entities.User;
import springboot.server.services.UserService;

@Component
public class DataInit implements CommandLineRunner {
    @Autowired
    private UserService userService;


    @Override
    public void run(String... args) throws Exception {
       for(int i=1;i<6;i++){
           userService.saveUser(new User("ayoub mns"+i,"ayoub@"+i+"mns.com"));
       }
    }
}
