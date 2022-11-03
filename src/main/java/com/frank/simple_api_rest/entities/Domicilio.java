package com.frank.simple_api_rest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
@Audited
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends BaseEntity{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idLocalidad")
    private Localidad localidad;

}
