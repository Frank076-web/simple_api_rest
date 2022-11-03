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
@Table(name = "localidad")
@Audited
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Localidad extends BaseEntity{

    @Column(name = "denominacion")
    private String denominacion;

}
