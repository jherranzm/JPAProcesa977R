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
 * The persistent class for the tbl_Informe_Pestanya database table.
 * 
 */
@Entity
@Table(name="tbl_Informe_Pestanya")
public class TblInformePestanya implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;




	@Column(nullable=false)
	private int orden;

	@Column(name="pestanya_id", nullable=false)
	private int pestanyaId;

	//bi-directional many-to-one association to Tbl_InformesXL
    @ManyToOne
	@JoinColumn(name="informe_id", nullable=false)
	private TblInformeXLS tblInformesXl;

    public TblInformePestanya() {
    }

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getPestanyaId() {
		return this.pestanyaId;
	}

	public void setPestanyaId(int pestanyaId) {
		this.pestanyaId = pestanyaId;
	}

	public TblInformeXLS getTblInformesXl() {
		return this.tblInformesXl;
	}

	public void setTblInformesXl(TblInformeXLS tblInformesXl) {
		this.tblInformesXl = tblInformesXl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}