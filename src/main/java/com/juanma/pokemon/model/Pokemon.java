package com.juanma.pokemon.model;

import com.juanma.pokemon.enums.Enum_Tipo;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "vida", nullable = false)
    private int vida;

    @Column(name = "defensa", nullable = false)
    private int defensa;

    @Column(name = "ataque", nullable = false)
    private int ataque;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private Enum_Tipo tipo;

    @CreationTimestamp
    @Column(name = "creacion")
    private LocalDateTime creacion;

    @UpdateTimestamp
    @Column(name = "actualizacion")
    private LocalDateTime actualizacion;

}