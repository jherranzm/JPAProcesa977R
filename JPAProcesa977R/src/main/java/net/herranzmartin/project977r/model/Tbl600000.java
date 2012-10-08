package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_600000 database table.
 * 
 */
@Entity
@Table(name="tbl_600000")
public class Tbl600000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_CONCEPTO", length=2)
	private String codigoConcepto;

	@Column(name="CODIGO_CONTROL")
	private int codigoControl;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="DESC_CODIGO_CONCEPTO", length=250)
	private String descCodigoConcepto;

	@Column(name="DESC_MULTICONEXION", length=50)
	private String descMulticonexion;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="IMPORTE_CONCEPTO")
	private double importeConcepto;

	@Column(name="IMPORTE_DESCUENTO")
	private double importeDescuento;

	@Column(name="IMPORTE_PROMOCIONES")
	private double importePromociones;

	@Column(name="IMPORTE_TOTAL")
	private double importeTotal;

	@Column(name="LONGITUD_REGISTRO")
	private int longitudRegistro;

	@Column(length=20)
	private String multiconexion;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	private int ocurrencias;

	private int secuencial;

	@Column(name="TABLA_DETALLES", length=80)
	private String tablaDetalles;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl600000() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgrupacionFacturable() {
		return this.agrupacionFacturable;
	}

	public void setAgrupacionFacturable(String agrupacionFacturable) {
		this.agrupacionFacturable = agrupacionFacturable;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCodigoConcepto() {
		return this.codigoConcepto;
	}

	public void setCodigoConcepto(String codigoConcepto) {
		this.codigoConcepto = codigoConcepto;
	}

	public int getCodigoControl() {
		return this.codigoControl;
	}

	public void setCodigoControl(int codigoControl) {
		this.codigoControl = codigoControl;
	}

	public int getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getDescCodigoConcepto() {
		return this.descCodigoConcepto;
	}

	public void setDescCodigoConcepto(String descCodigoConcepto) {
		this.descCodigoConcepto = descCodigoConcepto;
	}

	public String getDescMulticonexion() {
		return this.descMulticonexion;
	}

	public void setDescMulticonexion(String descMulticonexion) {
		this.descMulticonexion = descMulticonexion;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFichero() {
		return this.fichero;
	}

	public void setFichero(String fichero) {
		this.fichero = fichero;
	}

	public String getGrupoDeGasto() {
		return this.grupoDeGasto;
	}

	public void setGrupoDeGasto(String grupoDeGasto) {
		this.grupoDeGasto = grupoDeGasto;
	}

	public double getImporteConcepto() {
		return this.importeConcepto;
	}

	public void setImporteConcepto(double importeConcepto) {
		this.importeConcepto = importeConcepto;
	}

	public double getImporteDescuento() {
		return this.importeDescuento;
	}

	public void setImporteDescuento(double importeDescuento) {
		this.importeDescuento = importeDescuento;
	}

	public double getImportePromociones() {
		return this.importePromociones;
	}

	public void setImportePromociones(double importePromociones) {
		this.importePromociones = importePromociones;
	}

	public double getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public int getLongitudRegistro() {
		return this.longitudRegistro;
	}

	public void setLongitudRegistro(int longitudRegistro) {
		this.longitudRegistro = longitudRegistro;
	}

	public String getMulticonexion() {
		return this.multiconexion;
	}

	public void setMulticonexion(String multiconexion) {
		this.multiconexion = multiconexion;
	}

	public String getNumeroComercial() {
		return this.numeroComercial;
	}

	public void setNumeroComercial(String numeroComercial) {
		this.numeroComercial = numeroComercial;
	}

	public String getNumeroComercialAsociado() {
		return this.numeroComercialAsociado;
	}

	public void setNumeroComercialAsociado(String numeroComercialAsociado) {
		this.numeroComercialAsociado = numeroComercialAsociado;
	}

	public int getOcurrencias() {
		return this.ocurrencias;
	}

	public void setOcurrencias(int ocurrencias) {
		this.ocurrencias = ocurrencias;
	}

	public int getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(int secuencial) {
		this.secuencial = secuencial;
	}

	public String getTablaDetalles() {
		return this.tablaDetalles;
	}

	public void setTablaDetalles(String tablaDetalles) {
		this.tablaDetalles = tablaDetalles;
	}

	public String getTipoDeServicio() {
		return this.tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}