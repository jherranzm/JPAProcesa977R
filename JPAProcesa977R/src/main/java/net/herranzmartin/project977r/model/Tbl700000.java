package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_700000 database table.
 * 
 */
@Entity
@Table(name="tbl_700000")
public class Tbl700000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(length=25)
	private String beneficiario;

	@Column(name="CENTRAL_DESTINO")
	private int centralDestino;

	@Column(name="CENTRAL_ORIGEN")
	private int centralOrigen;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_CONCEPTO", length=2)
	private String codigoConcepto;

	@Column(name="CODIGO_POSTAL")
	private int codigoPostal;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="DESC_CODIGO_CONCEPTO", length=250)
	private String descCodigoConcepto;

	@Column(name="DESC_SITUACION_ABONO", length=250)
	private String descSituacionAbono;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(name="DISTANCIA_EN_KM")
	private int distanciaEnKm;

	@Column(name="DOMICILIO_TERMINAL_A", length=50)
	private String domicilioTerminalA;

	@Column(name="DOMICILIO_TERMINAL_B", length=50)
	private String domicilioTerminalB;

	@Column(name="FECHA_ALTA", length=8)
	private String fechaAlta;

	@Column(name="FECHA_BAJA", length=8)
	private String fechaBaja;

	@Column(name="FECHA_DESDE_TEORICA", length=8)
	private String fechaDesdeTeorica;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_HASTA_TEORICA", length=8)
	private String fechaHastaTeorica;

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

	@Column(name="POBLACION_TERMINAL_A", length=40)
	private String poblacionTerminalA;

	@Column(name="POBLACION_TERMINAL_B", length=40)
	private String poblacionTerminalB;

	@Column(length=40)
	private String provincia;

	private int secuencial;

	@Column(name="SITUACION_ABONO", length=1)
	private String situacionAbono;

	@Column(name="SUBSERVICIO_2", length=8)
	private String subservicio2;

	@Column(name="SUBSERVICIO_3", length=8)
	private String subservicio3;

	@Column(name="SUBSERVICIO_4", length=8)
	private String subservicio4;

	@Column(name="TABLA_DETALLES", length=240)
	private String tablaDetalles;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TIPO_TARJETA", length=2)
	private String tipoTarjeta;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl700000() {
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

	public String getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public int getCentralDestino() {
		return this.centralDestino;
	}

	public void setCentralDestino(int centralDestino) {
		this.centralDestino = centralDestino;
	}

	public int getCentralOrigen() {
		return this.centralOrigen;
	}

	public void setCentralOrigen(int centralOrigen) {
		this.centralOrigen = centralOrigen;
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

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
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

	public String getDescSituacionAbono() {
		return this.descSituacionAbono;
	}

	public void setDescSituacionAbono(String descSituacionAbono) {
		this.descSituacionAbono = descSituacionAbono;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public int getDistanciaEnKm() {
		return this.distanciaEnKm;
	}

	public void setDistanciaEnKm(int distanciaEnKm) {
		this.distanciaEnKm = distanciaEnKm;
	}

	public String getDomicilioTerminalA() {
		return this.domicilioTerminalA;
	}

	public void setDomicilioTerminalA(String domicilioTerminalA) {
		this.domicilioTerminalA = domicilioTerminalA;
	}

	public String getDomicilioTerminalB() {
		return this.domicilioTerminalB;
	}

	public void setDomicilioTerminalB(String domicilioTerminalB) {
		this.domicilioTerminalB = domicilioTerminalB;
	}

	public String getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getFechaDesdeTeorica() {
		return this.fechaDesdeTeorica;
	}

	public void setFechaDesdeTeorica(String fechaDesdeTeorica) {
		this.fechaDesdeTeorica = fechaDesdeTeorica;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaHastaTeorica() {
		return this.fechaHastaTeorica;
	}

	public void setFechaHastaTeorica(String fechaHastaTeorica) {
		this.fechaHastaTeorica = fechaHastaTeorica;
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

	public String getPoblacionTerminalA() {
		return this.poblacionTerminalA;
	}

	public void setPoblacionTerminalA(String poblacionTerminalA) {
		this.poblacionTerminalA = poblacionTerminalA;
	}

	public String getPoblacionTerminalB() {
		return this.poblacionTerminalB;
	}

	public void setPoblacionTerminalB(String poblacionTerminalB) {
		this.poblacionTerminalB = poblacionTerminalB;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(int secuencial) {
		this.secuencial = secuencial;
	}

	public String getSituacionAbono() {
		return this.situacionAbono;
	}

	public void setSituacionAbono(String situacionAbono) {
		this.situacionAbono = situacionAbono;
	}

	public String getSubservicio2() {
		return this.subservicio2;
	}

	public void setSubservicio2(String subservicio2) {
		this.subservicio2 = subservicio2;
	}

	public String getSubservicio3() {
		return this.subservicio3;
	}

	public void setSubservicio3(String subservicio3) {
		this.subservicio3 = subservicio3;
	}

	public String getSubservicio4() {
		return this.subservicio4;
	}

	public void setSubservicio4(String subservicio4) {
		this.subservicio4 = subservicio4;
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

	public String getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}