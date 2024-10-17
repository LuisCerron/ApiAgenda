package Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="contacto")
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String name;
    @Column(name="telefono")
    private String cellphone;
    @Column(name="direccion")
    private String address;
    @ManyToOne
    @JoinColumn(name = "id_usuario",nullable = false)
    @JsonIgnore
    private User userContact;
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<Appointment> appointmentList = new ArrayList<>();
}
