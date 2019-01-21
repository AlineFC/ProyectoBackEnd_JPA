/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.accenture.proyecto.model;

import javax.persistence.*;

/**
 *
 * @author CrateX
 */

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Id
    @Column(name = "idUser")
    private Integer id;

    @Column(name="nombre")
    private String nombreUs;

    @Column(name="contrasena")
    private String contrasena;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;






    public Usuario() {
    }

    public Usuario(Integer id,String nombreUs,String contrasena,String email,Rol rol) {
        this.id = id;
        this.nombreUs = nombreUs;
        this.contrasena = contrasena;
        this.email = email;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}








