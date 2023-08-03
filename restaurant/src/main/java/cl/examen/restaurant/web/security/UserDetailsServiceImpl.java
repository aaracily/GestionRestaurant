package cl.examen.restaurant.web.security;

import cl.examen.restaurant.model.persistence.entity.UserEntity;
import cl.examen.restaurant.model.persistence.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository repository;

    public UserDetailsServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = repository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        System.out.println(user.getUsername() + " " + user.getPassword());
        return new MyUserDetails(user);
    }
    }


