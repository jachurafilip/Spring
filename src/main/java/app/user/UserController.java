package app.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user")
    public User user(@RequestParam(value = "firstName") String firstName,
                     @RequestParam(value = "lastName") String lastName)
    {
        return new User(counter.incrementAndGet(),firstName,lastName);
    }
}
