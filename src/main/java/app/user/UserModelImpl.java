package app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserModelImpl implements UserModel {
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>) repository.findAll();
        return users;
    }
}
