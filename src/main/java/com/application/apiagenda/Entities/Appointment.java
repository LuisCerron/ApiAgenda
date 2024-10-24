package com.application.apiagenda.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Cita")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="recordatorio")
    private String reminder;
    @Column(name="fecha")
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "id_usuario",nullable = false)
    @JsonIgnore
    private User userAppointment;
    @ManyToOne
    @JoinColumn(name = "id_contacto",nullable = false)
    @JsonIgnore
    private Contact contact;

}
