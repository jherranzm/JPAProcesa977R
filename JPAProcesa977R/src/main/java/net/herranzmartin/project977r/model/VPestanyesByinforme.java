package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the v_pestanyes_byinforme database table.
 * 
 */
@Entity
@Table(name="v_pestanyes_byinforme")
public class VPestanyesByinforme implements Serializable {
	private static final long serialVersionUID = 1L;

	private int consultaid;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	private int idInforme;

	@Column(nullable=false, length=255)
	private String nombre;

	@Column(nullable=false)
	private int numfilainicial;

	private int ordenPestanya;

	@Column(length=255)
	private String rango;

    public VPestanyesByinforme() {
    }

	public int getConsultaid() {
		return this.consultaid;
	}

	public void setConsultaid(int consultaid) {
		this.consultaid = consultaid;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdInforme() {
		return this.idInforme;
	}

	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumfilainicial() {
		return this.numfilainicial;
	}

	public void setNumfilainicial(int numfilainicial) {
		this.numfilainicial = numfilainicial;
	}

	public int getOrdenPestanya() {
		return this.ordenPestanya;
	}

	public void setOrdenPestanya(int ordenPestanya) {
		this.ordenPestanya = ordenPestanya;
	}

	public String getRango() {
		return this.rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

}