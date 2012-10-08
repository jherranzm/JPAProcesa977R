package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_200000 database table.
 * 
 */
@Entity
@Table(name="tbl_200000")
public class Tbl200000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(name="CIF_CLIENTE", length=18)
	private String cifCliente;

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

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="IMPORTE_A_PAGAR")
	private double importeAPagar;

	@Column(name="IMPORTE_CONCEPTO")
	private double importeConcepto;

	@Column(name="IMPORTE_DESCUENTO")
	private double importeDescuento;

	@Column(name="IMPORTE_IMPUESTOS")
	private double importeImpuestos;

	@Column(name="IMPORTE_PROMOCIONES")
	private double importePromociones;

	@Column(name="IMPORTE_REDONDEO")
	private double importeRedondeo;

	@Column(name="LONGITUD_REGISTRO")
	private int longitudRegistro;

	@Column(length=20)
	private String multiconexion;

	@Column(name="NOMBRE_CLIENTE", length=70)
	private String nombreCliente;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	private int ocurrencias;

	private int secuencial;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TOTAL_FACTURADO")
	private double totalFacturado;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl200000() {
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

	public String getCifCliente() {
		return this.cifCliente;
	}

	public void setCifCliente(String cifCliente) {
		this.cifCliente = cifCliente;
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

	public double getImporteAPagar() {
		return this.importeAPagar;
	}

	public void setImporteAPagar(double importeAPagar) {
		this.importeAPagar = importeAPagar;
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

	public double getImporteImpuestos() {
		return this.importeImpuestos;
	}

	public void setImporteImpuestos(double importeImpuestos) {
		this.importeImpuestos = importeImpuestos;
	}

	public double getImportePromociones() {
		return this.importePromociones;
	}

	public void setImportePromociones(double importePromociones) {
		this.importePromociones = importePromociones;
	}

	public double getImporteRedondeo() {
		return this.importeRedondeo;
	}

	public void setImporteRedondeo(double importeRedondeo) {
		this.importeRedondeo = importeRedondeo;
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

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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

	public String getTipoDeServicio() {
		return this.tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public double getTotalFacturado() {
		return this.totalFacturado;
	}

	public void setTotalFacturado(double totalFacturado) {
		this.totalFacturado = totalFacturado;
	}

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}