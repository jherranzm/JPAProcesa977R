package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the tbl_test database table.
 * 
 */
@Entity
@Table(name="tbl_test")
public class TblTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private byte activo;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date fecha;

	@Column(nullable=false)
	private Timestamp fechaLarga;

	@Column(nullable=false)
	private Time hora;

	@Column(nullable=false, length=45)
	private String textoCorto;

    @Lob()
	@Column(nullable=false)
	private byte[] textoLargo;

	@Column(nullable=false, precision=10, scale=4)
	private BigDecimal valorDecimal;

	@Column(nullable=false)
	private float valorFloat;

    public TblTest() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Timestamp getFechaLarga() {
		return this.fechaLarga;
	}

	public void setFechaLarga(Timestamp fechaLarga) {
		this.fechaLarga = fechaLarga;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getTextoCorto() {
		return this.textoCorto;
	}

	public void setTextoCorto(String textoCorto) {
		this.textoCorto = textoCorto;
	}

	public byte[] getTextoLargo() {
		return this.textoLargo;
	}

	public void setTextoLargo(byte[] textoLargo) {
		this.textoLargo = textoLargo;
	}

	public BigDecimal getValorDecimal() {
		return this.valorDecimal;
	}

	public void setValorDecimal(BigDecimal valorDecimal) {
		this.valorDecimal = valorDecimal;
	}

	public float getValorFloat() {
		return this.valorFloat;
	}

	public void setValorFloat(float valorFloat) {
		this.valorFloat = valorFloat;
	}

}