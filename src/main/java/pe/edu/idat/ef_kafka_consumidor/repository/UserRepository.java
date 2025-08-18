package pe.edu.idat.ef_kafka_consumidor.repository;

import org.springframework.stereotype.Repository;
import pe.edu.idat.ef_kafka_consumidor.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        // Pre-populating the repository with two users
        users.add(new User(1L, "admin", "admin123", "ADMIN"));
        users.add(new User(2L, "user", "user123", "USER"));
    }

    public Optional<User> findByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }
}