package org.cigma.controlers;

import org.cigma.dtos.User;
import org.cigma.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private UserService service;

    public UserController(final UserService service) {
        this.service = service;
    }

    @PostMapping()
    public User ajouterUser(User user) {
        return service.create(user);
    }

    @GetMapping(MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        return service.all();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<User> userPageable(@RequestParam(value = "size") int size, @RequestParam(value = "page") int page) {
        return service.pageable(size, page);
    }
}
