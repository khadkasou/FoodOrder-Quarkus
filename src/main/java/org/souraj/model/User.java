package org.souraj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table()
public class User extends AbstractEntity{

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;

}
