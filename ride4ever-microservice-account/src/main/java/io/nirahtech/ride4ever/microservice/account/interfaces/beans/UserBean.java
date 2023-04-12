package io.nirahtech.ride4ever.microservice.account.interfaces.beans;

import java.util.HashSet;
import java.util.Set;

import io.nirahtech.ride4ever.microservice.account.domain.entities.Role;

public class UserBean {
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public UserBean() {

    }


}
