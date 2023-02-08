package com.zootopiaproyect.zootopiaproyect.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")

public class Animals {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_animals")

private Long id;
@Column (nullable = false, length = 50) 
 private String name;







public Animals(Long id, String name, String type, String family, String gender, int ingressDate){
    this.name = name;
    this.type = type;

    this.family = family;
    this.gender = gender;
    this.ingressDate = ingressDate;
}
public Animals() {
}
private String type;
private String family;
private String gender;
private int ingressDate;


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getFamily() {
    return family;
}
public void setFamily(String family) {
    this.family = family;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public int getIngressDate() {
    return ingressDate;
}
public void setIngressDate(int ingressDate) {
    this.ingressDate = ingressDate;
}

}
