package com.frank.simple_api_rest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
@Audited
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends BaseEntity{

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Integer fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private Integer paginas;

}