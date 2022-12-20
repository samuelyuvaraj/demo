package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
public class dataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generate")
    @SequenceGenerator(name = "generate", sequenceName = "sequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setIds(Long id) {
        this.id = id;
    }
    @Column (name ="name", unique = true ,length = 15 ,nullable = false)
    private String name;
    @Column (name ="description", length = 250)
    private String description;
    @Column (name = "status", columnDefinition="BOOLEAN DEFAULT true")
    private Boolean status;
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
