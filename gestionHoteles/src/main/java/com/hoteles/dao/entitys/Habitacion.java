package com.hoteles.dao.entitys;

public class Habitacion {

private int	ha_id;
private int ha_piso;
private int ha_numero; 
private String ha_vista; 
private String ha_clase; 
private int	ha_camas; 
private float ha_precio; 
private int ha_personas; 
private String ha_dis;
private int	ha_ho_id;


public Habitacion() {
	
}

public Habitacion(int ha_piso, int ha_numero, String ha_vista, String ha_clase, int ha_camas, float ha_precio,
		int ha_personas, String ha_dis, int ha_ho_id) {
	this.ha_piso = ha_piso;
	this.ha_numero = ha_numero;
	this.ha_vista = ha_vista;
	this.ha_clase = ha_clase;
	this.ha_camas = ha_camas;
	this.ha_precio = ha_precio;
	this.ha_personas = ha_personas;
	this.ha_dis = ha_dis;
	this.ha_ho_id = ha_ho_id;
}

public int getHa_id() {
	return ha_id;
}

public void setHa_id(int ha_id) {
	this.ha_id = ha_id;
}

public int getHa_piso() {
	return ha_piso;
}

public void setHa_piso(int ha_piso) {
	this.ha_piso = ha_piso;
}

public int getHa_numero() {
	return ha_numero;
}

public void setHa_numero(int ha_numero) {
	this.ha_numero = ha_numero;
}

public String getHa_vista() {
	return ha_vista;
}

public void setHa_vista(String ha_vista) {
	this.ha_vista = ha_vista;
}

public String getHa_clase() {
	return ha_clase;
}

public void setHa_clase(String ha_clase) {
	this.ha_clase = ha_clase;
}

public int getHa_camas() {
	return ha_camas;
}

public void setHa_camas(int ha_camas) {
	this.ha_camas = ha_camas;
}

public float getHa_precio() {
	return ha_precio;
}

public void setHa_precio(float ha_precio) {
	this.ha_precio = ha_precio;
}

public int getHa_personas() {
	return ha_personas;
}

public void setHa_personas(int ha_personas) {
	this.ha_personas = ha_personas;
}

public String getHa_dis() {
	return ha_dis;
}

public void setHa_dis(String ha_dis) {
	this.ha_dis = ha_dis;
}

public int getHa_ho_id() {
	return ha_ho_id;
}

public void setHa_ho_id(int ha_ho_id) {
	this.ha_ho_id = ha_ho_id;
}

@Override
public String toString() {
	return "Habitacion [ha_id=" + ha_id + ", ha_piso=" + ha_piso + ", ha_numero=" + ha_numero + ", ha_vista=" + ha_vista
			+ ", ha_clase=" + ha_clase + ", ha_camas=" + ha_camas + ", ha_precio=" + ha_precio + ", ha_personas="
			+ ha_personas + ", ha_dis=" + ha_dis + ", ha_ho_id=" + ha_ho_id + "]";
}


	
}
