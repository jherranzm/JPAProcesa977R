package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_cuc_cif database table.
 * 
 */
@Entity
@Table(name="tbl_cuc_cif")
public class TblCucCif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=9)
	private String cif;

	@Column(nullable=false, length=8)
	private String cuc;

	@Column(name="nombre_cliente", nullable=false, length=70)
	private String nombreCliente;

	@Column(name="tipo_doc", nullable=false, length=1)
	private String tipoDoc;

    public TblCucCif() {
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

	public String getCuc() {
		return this.cuc;
	}

	public void setCuc(String cuc) {
		this.cuc = cuc;
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

}