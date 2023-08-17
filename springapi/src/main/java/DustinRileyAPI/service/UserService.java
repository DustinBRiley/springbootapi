package DustinRileyAPI.service;

import DustinRileyAPI.api.model.User;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "George", 20, "George@mail.com");
        User user2 = new User(2, "Mark", 10, "Mark@mail.com");
        User user3 = new User(3, "Mary", 22, "Mary@mail.com");
        User user4 = new User(4, "Tom", 16, "Tom@mail.com");
        User user5 = new User(5, "Frank", 28, "Frank@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}