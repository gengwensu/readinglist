package com.example.readinglist.domain;

import lombok.Data;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 */
@Entity
@Data
public class Reader implements UserDetails {
    private static final long serialVersionUID = 1L;
    @Id
    private String username;
    private String fullname;
    private String password;

    // UserDetails method
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_READER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }

}
