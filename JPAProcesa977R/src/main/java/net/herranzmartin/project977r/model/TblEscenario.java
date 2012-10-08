package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_escenario database table.
 * 
 */
@Entity
@Table(name="tbl_escenario")
public class TblEscenario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=250)
	private String nombre;

	//bi-directional many-to-one association to TblEscenarioCliente
	@OneToMany(mappedBy="tblEscenario")
	private List<TblEscenarioCliente> tblEscenarioClientes;

	//bi-directional many-to-one association to TblEscenarioCondCuota
	@OneToMany(mappedBy="tblEscenario")
	private List<TblEscenarioCondCuota> tblEscenarioCondCuotas;

	//bi-directional many-to-one association to TblEscenarioServicio
	@OneToMany(mappedBy="tblEscenario")
	private List<TblEscenarioServicio> tblEscenarioServicios;

    public TblEscenario() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TblEscenarioCliente> getTblEscenarioClientes() {
		return this.tblEscenarioClientes;
	}

	public void setTblEscenarioClientes(List<TblEscenarioCliente> tblEscenarioClientes) {
		this.tblEscenarioClientes = tblEscenarioClientes;
	}
	
	public List<TblEscenarioCondCuota> getTblEscenarioCondCuotas() {
		return this.tblEscenarioCondCuotas;
	}

	public void setTblEscenarioCondCuotas(List<TblEscenarioCondCuota> tblEscenarioCondCuotas) {
		this.tblEscenarioCondCuotas = tblEscenarioCondCuotas;
	}
	
	public List<TblEscenarioServicio> getTblEscenarioServicios() {
		return this.tblEscenarioServicios;
	}

	public void setTblEscenarioServicios(List<TblEscenarioServicio> tblEscenarioServicios) {
		this.tblEscenarioServicios = tblEscenarioServicios;
	}
	
}