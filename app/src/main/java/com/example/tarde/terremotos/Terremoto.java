package com.example.tarde.terremotos;

import java.util.Date;

/**
 * Created by tarde on 09/02/2015.
 */
public class Terremoto {
    //http://earthquake.usgs.gov/earthquakes/?source=sitenav
    private String id;
    private String titulo;
    private Date fecha;
    private String link;
    private String descripcion;
    private Float latitud;
    private Float longitud;
    private Float elevacion;

    public Terremoto() {
    }

    public Terremoto(String id, String titulo, Date fecha, String link, String descripcion, Float latitud, Float longitud, Float elevacion) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.link = link;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.elevacion = elevacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public Float getElevacion() {
        return elevacion;
    }

    public void setElevacion(Float elevacion) {
        this.elevacion = elevacion;
    }
}
