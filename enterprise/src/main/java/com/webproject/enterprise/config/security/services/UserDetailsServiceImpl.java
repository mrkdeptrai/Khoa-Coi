package com.webproject.enterprise.config.security.services;

import com.webproject.enterprise.entity.UserEntity;
import com.webproject.enterprise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
            UserEntity user = userRepository.findUserByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User Not Found with -> Email : " + email));
        return UserPrinciple.build(user);
    }
}
