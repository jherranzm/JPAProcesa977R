package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_escenario_servicios database table.
 * 
 */
@Entity
@Table(name="tbl_escenario_servicios")
public class TblEscenarioServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="desc_tipo_de_servicio", length=250)
	private String descTipoDeServicio;

	@Column(name="fin_periodo", length=8)
	private String finPeriodo;

	@Column(name="inicio_periodo", length=8)
	private String inicioPeriodo;

	@Column(name="tipo_de_servicio", length=12)
	private String tipoDeServicio;

	//bi-directional many-to-one association to TblEscenario
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private TblEscenario tblEscenario;

    public TblEscenarioServicio() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getFinPeriodo() {
		return this.finPeriodo;
	}

	public void setFinPeriodo(String finPeriodo) {
		this.finPeriodo = finPeriodo;
	}

	public String getInicioPeriodo() {
		return this.inicioPeriodo;
	}

	public void setInicioPeriodo(String inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
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
	
}