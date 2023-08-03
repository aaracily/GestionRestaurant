package cl.examen.restaurant.model.persistence.repository;

import cl.examen.restaurant.model.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
}
