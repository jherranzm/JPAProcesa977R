package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbl_InformesXLS database table.
 * 
 */
@Entity
@Table(name="tbl_InformesXLS")
public class TblInformeXLS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=255)
	private String nombre;

	//bi-directional many-to-one association to Tbl_Informe_Pestanya
	@OneToMany(mappedBy="tblInformesXl")
	private List<TblInformePestanya> tblInformePestanyas;

    public TblInformeXLS() {
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

	public List<TblInformePestanya> getTblInformePestanyas() {
		return this.tblInformePestanyas;
	}

	public void setTblInformePestanyas(List<TblInformePestanya> tblInformePestanyas) {
		this.tblInformePestanyas = tblInformePestanyas;
	}
	
}