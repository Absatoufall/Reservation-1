package projet.stage.memoire.model;

import jakarta.persistence.*;

@Entity
public class Admin {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String username;
    private String password;
    private static final String ADMIN_USERNAME = "Admin";
    private static final String ADMIN_PASSWORD = "Administrateur123";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Admin() {
    }

    public static boolean isAdmin(String username, String password) {
        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }
}
