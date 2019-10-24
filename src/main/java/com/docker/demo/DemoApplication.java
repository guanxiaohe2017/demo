package com.docker.demo;

import com.docker.demo.dao.UserRepository;
import com.docker.demo.entry.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@RestController("/")
public class DemoApplication {

    @Resource
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @GetMapping(value="test")
    public List<User> testRest() {
        List<User> all = userRepository.findAll();
        return all;
    }

}
