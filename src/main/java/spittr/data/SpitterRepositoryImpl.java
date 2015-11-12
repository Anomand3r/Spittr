package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    public Spitter save(Spitter spitter) {
        return null;
    }

    public Spitter findByUsername(String username) {
        return new Spitter(username, "test", "test", "test");
    }
}
