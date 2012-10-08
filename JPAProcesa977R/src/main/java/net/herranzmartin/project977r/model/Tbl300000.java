package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_300000 database table.
 * 
 */
@Entity
@Table(name="tbl_300000")
public class Tbl300000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(name="BASE_IMPONIBLE")
	private double baseImponible;

	@Column(name="CIF_ENTIDAD_EMISORA", length=18)
	private String cifEntidadEmisora;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_CONCEPTO", length=2)
	private String codigoConcepto;

	@Column(name="CODIGO_CONTROL")
	private int codigoControl;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="DATOS_DE_COBRO", length=24)
	private String datosDeCobro;

	@Column(name="DESC_CODIGO_CONCEPTO", length=250)
	private String descCodigoConcepto;

	@Column(name="DESC_IDENTIFICACION", length=250)
	private String descIdentificacion;

	@Column(name="DESC_NIVEL_IMPOSITIVO", length=250)
	private String descNivelImpositivo;

	@Column(name="DESC_TIPO_IMPUESTO", length=250)
	private String descTipoImpuesto;

	@Column(name="DESCRIPCION_DE_CARGO", length=50)
	private String descripcionDeCargo;

	@Column(name="FECHA_DE_LA_FACTURA", length=8)
	private String fechaDeLaFactura;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_PUESTA_COBRO", length=8)
	private String fechaPuestaCobro;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(length=1)
	private String identificacion;

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

	@Column(name="NIVEL_IMPOSITIVO", length=1)
	private String nivelImpositivo;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	@Column(name="NUMERO_DE_FACTURA", length=14)
	private String numeroDeFactura;

	private int ocurrencias;

	private int ocurrencias2;

	private int secuencial;

	@Column(name="TABLA_DETALLES", length=80)
	private String tablaDetalles;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TIPO_IMPOSITIVO")
	private double tipoImpositivo;

	@Column(name="TIPO_IMPUESTO", length=1)
	private String tipoImpuesto;

	@Column(name="TITULAR_POSTAL", length=65)
	private String titularPostal;

	@Column(name="TOTAL_FACTURADO")
	private double totalFacturado;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl300000() {
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

	public double getBaseImponible() {
		return this.baseImponible;
	}

	public void setBaseImponible(double baseImponible) {
		this.baseImponible = baseImponible;
	}

	public String getCifEntidadEmisora() {
		return this.cifEntidadEmisora;
	}

	public void setCifEntidadEmisora(String cifEntidadEmisora) {
		this.cifEntidadEmisora = cifEntidadEmisora;
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

	public String getDatosDeCobro() {
		return this.datosDeCobro;
	}

	public void setDatosDeCobro(String datosDeCobro) {
		this.datosDeCobro = datosDeCobro;
	}

	public String getDescCodigoConcepto() {
		return this.descCodigoConcepto;
	}

	public void setDescCodigoConcepto(String descCodigoConcepto) {
		this.descCodigoConcepto = descCodigoConcepto;
	}

	public String getDescIdentificacion() {
		return this.descIdentificacion;
	}

	public void setDescIdentificacion(String descIdentificacion) {
		this.descIdentificacion = descIdentificacion;
	}

	public String getDescNivelImpositivo() {
		return this.descNivelImpositivo;
	}

	public void setDescNivelImpositivo(String descNivelImpositivo) {
		this.descNivelImpositivo = descNivelImpositivo;
	}

	public String getDescTipoImpuesto() {
		return this.descTipoImpuesto;
	}

	public void setDescTipoImpuesto(String descTipoImpuesto) {
		this.descTipoImpuesto = descTipoImpuesto;
	}

	public String getDescripcionDeCargo() {
		return this.descripcionDeCargo;
	}

	public void setDescripcionDeCargo(String descripcionDeCargo) {
		this.descripcionDeCargo = descripcionDeCargo;
	}

	public String getFechaDeLaFactura() {
		return this.fechaDeLaFactura;
	}

	public void setFechaDeLaFactura(String fechaDeLaFactura) {
		this.fechaDeLaFactura = fechaDeLaFactura;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaPuestaCobro() {
		return this.fechaPuestaCobro;
	}

	public void setFechaPuestaCobro(String fechaPuestaCobro) {
		this.fechaPuestaCobro = fechaPuestaCobro;
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

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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

	public String getNivelImpositivo() {
		return this.nivelImpositivo;
	}

	public void setNivelImpositivo(String nivelImpositivo) {
		this.nivelImpositivo = nivelImpositivo;
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

	public String getNumeroDeFactura() {
		return this.numeroDeFactura;
	}

	public void setNumeroDeFactura(String numeroDeFactura) {
		this.numeroDeFactura = numeroDeFactura;
	}

	public int getOcurrencias() {
		return this.ocurrencias;
	}

	public void setOcurrencias(int ocurrencias) {
		this.ocurrencias = ocurrencias;
	}

	public int getOcurrencias2() {
		return this.ocurrencias2;
	}

	public void setOcurrencias2(int ocurrencias2) {
		this.ocurrencias2 = ocurrencias2;
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

	public double getTipoImpositivo() {
		return this.tipoImpositivo;
	}

	public void setTipoImpositivo(double tipoImpositivo) {
		this.tipoImpositivo = tipoImpositivo;
	}

	public String getTipoImpuesto() {
		return this.tipoImpuesto;
	}

	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}

	public String getTitularPostal() {
		return this.titularPostal;
	}

	public void setTitularPostal(String titularPostal) {
		this.titularPostal = titularPostal;
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