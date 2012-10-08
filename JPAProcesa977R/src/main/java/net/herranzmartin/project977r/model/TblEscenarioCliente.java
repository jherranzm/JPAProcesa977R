package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_escenario_clientes database table.
 * 
 */
@Entity
@Table(name="tbl_escenario_clientes")
public class TblEscenarioCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=9)
	private String cif;

	@Column(length=8)
	private String cliente;

	@Column(name="fin_periodo", length=8)
	private String finPeriodo;

	@Column(name="inicio_periodo", length=8)
	private String inicioPeriodo;

	@Column(name="nombre_cliente", length=70)
	private String nombreCliente;

	@Column(name="tipo_doc", length=1)
	private String tipoDoc;

	//bi-directional many-to-one association to TblEscenario
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private TblEscenario tblEscenario;

    public TblEscenarioCliente() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTipoDoc() {
		return this.tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public TblEscenario getTblEscenario() {
		return this.tblEscenario;
	}

	public void setTblEscenario(TblEscenario tblEscenario) {
		this.tblEscenario = tblEscenario;
	}
	
}