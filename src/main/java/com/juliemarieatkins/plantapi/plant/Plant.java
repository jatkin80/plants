package com.juliemarieatkins.plantapi.plant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.type.DateType;

import javax.persistence.Id;

import java.sql.Date;

import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "plant")
public class Plant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name= "type")
  private String type;

  @Column(name= "imageurl")
  private String imageUrl;

  @Column(name= "description")
  private String description;

  @Column(name= "dateadded")
  private Date dateadded;

@Column(name= "notes")
private String notes;
@Column(name= "daystomaturity")
private Integer daystomaturity;
@Column(name= "spacing")
private String spacing;


}
