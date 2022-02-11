package org.cigma;

import org.cigma.controlers.UserController;
import org.cigma.dtos.User;
import org.cigma.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    UserService service;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = service.all();

        for (User u: users){
            System.out.println(u);
        }
    }
}
