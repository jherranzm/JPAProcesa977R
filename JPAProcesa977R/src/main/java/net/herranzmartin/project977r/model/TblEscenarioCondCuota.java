package net.herranzmartin.project977r.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the tbl_escenario_cond_cuotas database table.
 * 
 */
@Entity
@Table(name="tbl_escenario_cond_cuotas")
public class TblEscenarioCondCuota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;


	@Column(name="concepto_facturable", length=14)
	private String conceptoFacturable;

	@Column(name="desc_concepto_facturable", length=250)
	private String descConceptoFacturable;

	@Column(name="desc_tipo_de_servicio", length=250)
	private String descTipoDeServicio;

	@Column(nullable=false)
	private String observaciones;

	@Column(name="precio_acuerdo")
	private double precioAcuerdo;

	@Column(name="precio_boe")
	private double precioBoe;

	@Column(name="tipo_de_servicio", length=12)
	private String tipoDeServicio;

	//bi-directional many-to-one association to TblEscenario
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private TblEscenario tblEscenario;

    public TblEscenarioCondCuota() {
    }

	public String getConceptoFacturable() {
		return this.conceptoFacturable;
	}

	public void setConceptoFacturable(String conceptoFacturable) {
		this.conceptoFacturable = conceptoFacturable;
	}

	public String getDescConceptoFacturable() {
		return this.descConceptoFacturable;
	}

	public void setDescConceptoFacturable(String descConceptoFacturable) {
		this.descConceptoFacturable = descConceptoFacturable;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public double getPrecioAcuerdo() {
		return this.precioAcuerdo;
	}

	public void setPrecioAcuerdo(double precioAcuerdo) {
		this.precioAcuerdo = precioAcuerdo;
	}

	public double getPrecioBoe() {
		return this.precioBoe;
	}

	public void setPrecioBoe(double precioBoe) {
		this.precioBoe = precioBoe;
	}

	public String getTipoDeServicio() {
		return this.tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public TblEscenario getTblEscenario() {
		return this.tblEscenario;
	}

	public void setTblEscenario(TblEscenario tblEscenario) {
		this.tblEscenario = tblEscenario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}