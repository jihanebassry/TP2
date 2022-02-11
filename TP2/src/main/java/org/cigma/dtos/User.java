package org.cigma.dtos;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Utilisateur")
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 100)
    private String fullName;
    @Column(unique = true)
    private String email;

    @Override
    public String toString() {
        return "User id:" + id + " fullName: " + fullName + " email='" + email;
    }
}
