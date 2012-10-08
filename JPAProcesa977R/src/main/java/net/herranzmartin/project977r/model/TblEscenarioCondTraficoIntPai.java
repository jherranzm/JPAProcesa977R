package net.herranzmartin.project977r.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the tbl_escenario_cond_trafico_int_pais database table.
 * 
 */
@Entity
@Table(name="tbl_escenario_cond_trafico_int_pais")
public class TblEscenarioCondTraficoIntPai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;



	@Column(name="ambito_de_trafico", length=3)
	private String ambitoDeTrafico;

	@Column(name="codigo_trafico", length=3)
	private String codigoTrafico;

	@Column(nullable=false)
	private String comentario;

	@Column(name="desc_ambito_de_trafico", length=250)
	private String descAmbitoDeTrafico;

	@Column(name="desc_codigo_trafico", length=250)
	private String descCodigoTrafico;

	@Column(name="desc_destino", length=250)
	private String descDestino;

	private int destino;

	private double duracion;

	@Column(name="duracion_detalladas")
	private double duracionDetalladas;

	@Column(name="duracion_no_detalladas")
	private double duracionNoDetalladas;

	@Column(name="EST_LLAM", nullable=false, precision=10, scale=4)
	private BigDecimal estLlam;

	@Column(name="ff_id", nullable=false)
	private int ffId;

	@Column(name="importe_boe")
	private double importeBoe;

	@Column(name="importe_detalladas")
	private double importeDetalladas;

	@Column(name="importe_no_detalladas")
	private double importeNoDetalladas;

	@Column(name="importe_valor_anadido")
	private double importeValorAnadido;

	@Column(name="num_detalladas", precision=10)
	private BigDecimal numDetalladas;

	@Column(name="num_no_detalladas", precision=10)
	private BigDecimal numNoDetalladas;

	@Column(name="numero_de_llamadas", precision=10)
	private BigDecimal numeroDeLlamadas;

	@Column(name="pct_duracion_no_detalladas")
	private double pctDuracionNoDetalladas;

	@Column(name="pct_importe_no_detalladas")
	private double pctImporteNoDetalladas;

	@Column(name="pct_num_no_detalladas", precision=10, scale=2)
	private BigDecimal pctNumNoDetalladas;

	@Column(nullable=false, precision=10, scale=4)
	private BigDecimal ppm;

	@Column(name="PRECIO_ESPECIAL", nullable=false, length=2)
	private String precioEspecial;

	@Column(name="TIPO_DESCUENTO", nullable=false, length=3)
	private String tipoDescuento;

    public TblEscenarioCondTraficoIntPai() {
    }

	public String getAmbitoDeTrafico() {
		return this.ambitoDeTrafico;
	}

	public void setAmbitoDeTrafico(String ambitoDeTrafico) {
		this.ambitoDeTrafico = ambitoDeTrafico;
	}

	public String getCodigoTrafico() {
		return this.codigoTrafico;
	}

	public void setCodigoTrafico(String codigoTrafico) {
		this.codigoTrafico = codigoTrafico;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDescAmbitoDeTrafico() {
		return this.descAmbitoDeTrafico;
	}

	public void setDescAmbitoDeTrafico(String descAmbitoDeTrafico) {
		this.descAmbitoDeTrafico = descAmbitoDeTrafico;
	}

	public String getDescCodigoTrafico() {
		return this.descCodigoTrafico;
	}

	public void setDescCodigoTrafico(String descCodigoTrafico) {
		this.descCodigoTrafico = descCodigoTrafico;
	}

	public String getDescDestino() {
		return this.descDestino;
	}

	public void setDescDestino(String descDestino) {
		this.descDestino = descDestino;
	}

	public int getDestino() {
		return this.destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public double getDuracion() {
		return this.duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getDuracionDetalladas() {
		return this.duracionDetalladas;
	}

	public void setDuracionDetalladas(double duracionDetalladas) {
		this.duracionDetalladas = duracionDetalladas;
	}

	public double getDuracionNoDetalladas() {
		return this.duracionNoDetalladas;
	}

	public void setDuracionNoDetalladas(double duracionNoDetalladas) {
		this.duracionNoDetalladas = duracionNoDetalladas;
	}

	public BigDecimal getEstLlam() {
		return this.estLlam;
	}

	public void setEstLlam(BigDecimal estLlam) {
		this.estLlam = estLlam;
	}

	public int getFfId() {
		return this.ffId;
	}

	public void setFfId(int ffId) {
		this.ffId = ffId;
	}

	public double getImporteBoe() {
		return this.importeBoe;
	}

	public void setImporteBoe(double importeBoe) {
		this.importeBoe = importeBoe;
	}

	public double getImporteDetalladas() {
		return this.importeDetalladas;
	}

	public void setImporteDetalladas(double importeDetalladas) {
		this.importeDetalladas = importeDetalladas;
	}

	public double getImporteNoDetalladas() {
		return this.importeNoDetalladas;
	}

	public void setImporteNoDetalladas(double importeNoDetalladas) {
		this.importeNoDetalladas = importeNoDetalladas;
	}

	public double getImporteValorAnadido() {
		return this.importeValorAnadido;
	}

	public void setImporteValorAnadido(double importeValorAnadido) {
		this.importeValorAnadido = importeValorAnadido;
	}

	public BigDecimal getNumDetalladas() {
		return this.numDetalladas;
	}

	public void setNumDetalladas(BigDecimal numDetalladas) {
		this.numDetalladas = numDetalladas;
	}

	public BigDecimal getNumNoDetalladas() {
		return this.numNoDetalladas;
	}

	public void setNumNoDetalladas(BigDecimal numNoDetalladas) {
		this.numNoDetalladas = numNoDetalladas;
	}

	public BigDecimal getNumeroDeLlamadas() {
		return this.numeroDeLlamadas;
	}

	public void setNumeroDeLlamadas(BigDecimal numeroDeLlamadas) {
		this.numeroDeLlamadas = numeroDeLlamadas;
	}

	public double getPctDuracionNoDetalladas() {
		return this.pctDuracionNoDetalladas;
	}

	public void setPctDuracionNoDetalladas(double pctDuracionNoDetalladas) {
		this.pctDuracionNoDetalladas = pctDuracionNoDetalladas;
	}

	public double getPctImporteNoDetalladas() {
		return this.pctImporteNoDetalladas;
	}

	public void setPctImporteNoDetalladas(double pctImporteNoDetalladas) {
		this.pctImporteNoDetalladas = pctImporteNoDetalladas;
	}

	public BigDecimal getPctNumNoDetalladas() {
		return this.pctNumNoDetalladas;
	}

	public void setPctNumNoDetalladas(BigDecimal pctNumNoDetalladas) {
		this.pctNumNoDetalladas = pctNumNoDetalladas;
	}

	public BigDecimal getPpm() {
		return this.ppm;
	}

	public void setPpm(BigDecimal ppm) {
		this.ppm = ppm;
	}

	public String getPrecioEspecial() {
		return this.precioEspecial;
	}

	public void setPrecioEspecial(String precioEspecial) {
		this.precioEspecial = precioEspecial;
	}

	public String getTipoDescuento() {
		return this.tipoDescuento;
	}

	public void setTipoDescuento(String tipoDescuento) {
		this.tipoDescuento = tipoDescuento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}