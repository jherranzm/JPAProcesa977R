package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_pestanyes database table.
 * 
 */
@Entity
@Table(name="tbl_pestanyes")
public class TblPestanya implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String nombre;

	@Column(nullable=false)
	private int numFilaInicial;

	@Column(length=255)
	private String rango;

	//bi-directional many-to-one association to Tbl_ConsultasSQL
    @ManyToOne
	@JoinColumn(name="consulta_id")
	private TblConsultaSQL tblConsultasSql;

    public TblPestanya() {
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

	public int getNumFilaInicial() {
		return this.numFilaInicial;
	}

	public void setNumFilaInicial(int numFilaInicial) {
		this.numFilaInicial = numFilaInicial;
	}

	public String getRango() {
		return this.rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public TblConsultaSQL getTblConsultasSql() {
		return this.tblConsultasSql;
	}

	public void setTblConsultasSql(TblConsultaSQL tblConsultasSql) {
		this.tblConsultasSql = tblConsultasSql;
	}
	
}