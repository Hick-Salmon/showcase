package samlen.tsoi.showcase.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import samlen.tsoi.showcase.entity.User;
import samlen.tsoi.showcase.service.UserWriteService;

/**
 * @author samlen_tsoi
 * @date 2017/12/1
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserWriteService userWriteService;

    @PostMapping("add")
    public void create(@RequestBody User user) {
        userWriteService.insertOne(user);
    }
}
