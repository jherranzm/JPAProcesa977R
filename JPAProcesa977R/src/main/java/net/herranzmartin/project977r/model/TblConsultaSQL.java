package net.herranzmartin.project977r.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the tbl_ConsultasSQL database table.
 * 
 */
@Entity
@Table(name="tbl_ConsultasSQL")
public class TblConsultaSQL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

    @Lob()
	@Column(nullable=false)
	private String definicion;

	@Column(nullable=false, length=255)
	private String nombre;

	//bi-directional many-to-one association to TblPestanye
	@OneToMany(mappedBy="tblConsultasSql")
	private List<TblPestanya> tblPestanyes;

    public TblConsultaSQL() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinicion() {
		return this.definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TblPestanya> getTblPestanyes() {
		return this.tblPestanyes;
	}

	public void setTblPestanyes(List<TblPestanya> tblPestanyes) {
		this.tblPestanyes = tblPestanyes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tbl_ConsultasSQL [id=");
		builder.append(id);
		builder.append(", definicion=");
		builder.append(definicion);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
	
}