package com.hoteles.dao.entitys;

import java.util.Date;

public class Reserva {

	private int re_id;
	private String re_cli_dni;
	private int re_ha_id;
	private Date re_fecha_reserva;
	private Date re_fecha_ini;
	private Date re_fecha_fin;
	private float re_coste_alojamiento;
	private String re_estado;
	
	public Reserva() {

	}

	public Reserva(String re_cli_dni, int re_ha_id, Date re_fecha_reserva, Date re_fecha_ini, Date re_fecha_fin,
			float re_coste_alojamiento, String re_estado) {
		this.re_cli_dni = re_cli_dni;
		this.re_ha_id = re_ha_id;
		this.re_fecha_reserva = re_fecha_reserva;
		this.re_fecha_ini = re_fecha_ini;
		this.re_fecha_fin = re_fecha_fin;
		this.re_coste_alojamiento = re_coste_alojamiento;
		this.re_estado = re_estado;
	}

	public int getRe_id() {
		return re_id;
	}

	public void setRe_id(int re_id) {
		this.re_id = re_id;
	}

	public String getRe_cli_dni() {
		return re_cli_dni;
	}

	public void setRe_cli_dni(String re_cli_dni) {
		this.re_cli_dni = re_cli_dni;
	}

	public int getRe_ha_id() {
		return re_ha_id;
	}

	public void setRe_ha_id(int re_ha_id) {
		this.re_ha_id = re_ha_id;
	}

	public Date getRe_fecha_reserva() {
		return re_fecha_reserva;
	}

	public void setRe_fecha_reserva(Date re_fecha_reserva) {
		this.re_fecha_reserva = re_fecha_reserva;
	}

	public Date getRe_fecha_ini() {
		return re_fecha_ini;
	}

	public void setRe_fecha_ini(Date re_fecha_ini) {
		this.re_fecha_ini = re_fecha_ini;
	}

	public Date getRe_fecha_fin() {
		return re_fecha_fin;
	}

	public void setRe_fecha_fin(Date re_fecha_fin) {
		this.re_fecha_fin = re_fecha_fin;
	}

	public float getRe_coste_alojamiento() {
		return re_coste_alojamiento;
	}

	public void setRe_coste_alojamiento(float re_coste_alojamiento) {
		this.re_coste_alojamiento = re_coste_alojamiento;
	}

	public String getRe_estado() {
		return re_estado;
	}

	public void setRe_estado(String re_estado) {
		this.re_estado = re_estado;
	}

	@Override
	public String toString() {
		return "Reserva [re_id=" + re_id + ", re_cli_dni=" + re_cli_dni + ", re_ha_id=" + re_ha_id
				+ ", re_fecha_reserva=" + re_fecha_reserva + ", re_fecha_ini=" + re_fecha_ini + ", re_fecha_fin="
				+ re_fecha_fin + ", re_coste_alojamiento=" + re_coste_alojamiento + ", re_estado=" + re_estado + "]";
	}

	
}
