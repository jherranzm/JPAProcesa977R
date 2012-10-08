package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_702020 database table.
 * 
 */
@Entity
@Table(name="tbl_702020")
public class Tbl702020 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(name="AMBITO_DE_TRAFICO", length=3)
	private String ambitoDeTrafico;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_DESCUENTO", length=14)
	private String codigoDescuento;

	@Column(name="CODIGO_DESTINO", length=5)
	private String codigoDestino;

	@Column(name="CODIGO_ORIGEN", length=5)
	private String codigoOrigen;

	@Column(name="CODIGO_PERSONALIZADO", length=14)
	private String codigoPersonalizado;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="CODIGO_TRAFICO", length=3)
	private String codigoTrafico;

	@Column(name="DESC_AMBITO_DE_TRAFICO", length=250)
	private String descAmbitoDeTrafico;

	@Column(name="DESC_CODIGO_DESCUENTO", length=250)
	private String descCodigoDescuento;

	@Column(name="DESC_CODIGO_DESTINO", length=250)
	private String descCodigoDestino;

	@Column(name="DESC_CODIGO_ORIGEN", length=250)
	private String descCodigoOrigen;

	@Column(name="DESC_CODIGO_TRAFICO", length=250)
	private String descCodigoTrafico;

	@Column(name="DESC_RAZON_SALIDA", length=250)
	private String descRazonSalida;

	@Column(name="DESC_TARIFA", length=250)
	private String descTarifa;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(name="DESC_TIPO_DESTINO", length=250)
	private String descTipoDestino;

	@Column(name="DESC_TIPO_ORIGEN", length=250)
	private String descTipoOrigen;

	@Column(length=16)
	private String duracion;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_LLAMADA", length=8)
	private String fechaLlamada;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="HORA_INICIO", length=8)
	private String horaInicio;

	@Column(name="IMPORTE_DESCUENTO")
	private double importeDescuento;

	@Column(name="IMPORTE_ESTANDAR_PRODUCTO")
	private double importeEstandarProducto;

	@Column(name="IMPORTE_VALOR_ANADIDO")
	private double importeValorAnadido;

	@Column(name="LONGITUD_REGISTRO")
	private int longitudRegistro;

	@Column(length=20)
	private String multiconexion;

	@Column(name="N_SOLICITADO_LLAMANTE", length=26)
	private String nSolicitadoLlamante;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	@Column(name="NUMERO_LLAMADO", length=26)
	private String numeroLlamado;

	@Column(name="NUMERO_LOCUCIONES")
	private int numeroLocuciones;

	private int ocurrencias;

	@Column(name="RAZON_SALIDA", length=1)
	private String razonSalida;

	private int secuencial;

	@Column(length=2)
	private String tarifa;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TIPO_DESTINO", length=3)
	private String tipoDestino;

	@Column(name="TIPO_ORIGEN", length=3)
	private String tipoOrigen;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl702020() {
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

	public String getAmbitoDeTrafico() {
		return this.ambitoDeTrafico;
	}

	public void setAmbitoDeTrafico(String ambitoDeTrafico) {
		this.ambitoDeTrafico = ambitoDeTrafico;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCodigoDescuento() {
		return this.codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String getCodigoDestino() {
		return this.codigoDestino;
	}

	public void setCodigoDestino(String codigoDestino) {
		this.codigoDestino = codigoDestino;
	}

	public String getCodigoOrigen() {
		return this.codigoOrigen;
	}

	public void setCodigoOrigen(String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	public String getCodigoPersonalizado() {
		return this.codigoPersonalizado;
	}

	public void setCodigoPersonalizado(String codigoPersonalizado) {
		this.codigoPersonalizado = codigoPersonalizado;
	}

	public int getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getCodigoTrafico() {
		return this.codigoTrafico;
	}

	public void setCodigoTrafico(String codigoTrafico) {
		this.codigoTrafico = codigoTrafico;
	}

	public String getDescAmbitoDeTrafico() {
		return this.descAmbitoDeTrafico;
	}

	public void setDescAmbitoDeTrafico(String descAmbitoDeTrafico) {
		this.descAmbitoDeTrafico = descAmbitoDeTrafico;
	}

	public String getDescCodigoDescuento() {
		return this.descCodigoDescuento;
	}

	public void setDescCodigoDescuento(String descCodigoDescuento) {
		this.descCodigoDescuento = descCodigoDescuento;
	}

	public String getDescCodigoDestino() {
		return this.descCodigoDestino;
	}

	public void setDescCodigoDestino(String descCodigoDestino) {
		this.descCodigoDestino = descCodigoDestino;
	}

	public String getDescCodigoOrigen() {
		return this.descCodigoOrigen;
	}

	public void setDescCodigoOrigen(String descCodigoOrigen) {
		this.descCodigoOrigen = descCodigoOrigen;
	}

	public String getDescCodigoTrafico() {
		return this.descCodigoTrafico;
	}

	public void setDescCodigoTrafico(String descCodigoTrafico) {
		this.descCodigoTrafico = descCodigoTrafico;
	}

	public String getDescRazonSalida() {
		return this.descRazonSalida;
	}

	public void setDescRazonSalida(String descRazonSalida) {
		this.descRazonSalida = descRazonSalida;
	}

	public String getDescTarifa() {
		return this.descTarifa;
	}

	public void setDescTarifa(String descTarifa) {
		this.descTarifa = descTarifa;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getDescTipoDestino() {
		return this.descTipoDestino;
	}

	public void setDescTipoDestino(String descTipoDestino) {
		this.descTipoDestino = descTipoDestino;
	}

	public String getDescTipoOrigen() {
		return this.descTipoOrigen;
	}

	public void setDescTipoOrigen(String descTipoOrigen) {
		this.descTipoOrigen = descTipoOrigen;
	}

	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaLlamada() {
		return this.fechaLlamada;
	}

	public void setFechaLlamada(String fechaLlamada) {
		this.fechaLlamada = fechaLlamada;
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

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public double getImporteDescuento() {
		return this.importeDescuento;
	}

	public void setImporteDescuento(double importeDescuento) {
		this.importeDescuento = importeDescuento;
	}

	public double getImporteEstandarProducto() {
		return this.importeEstandarProducto;
	}

	public void setImporteEstandarProducto(double importeEstandarProducto) {
		this.importeEstandarProducto = importeEstandarProducto;
	}

	public double getImporteValorAnadido() {
		return this.importeValorAnadido;
	}

	public void setImporteValorAnadido(double importeValorAnadido) {
		this.importeValorAnadido = importeValorAnadido;
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

	public String getNSolicitadoLlamante() {
		return this.nSolicitadoLlamante;
	}

	public void setNSolicitadoLlamante(String nSolicitadoLlamante) {
		this.nSolicitadoLlamante = nSolicitadoLlamante;
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

	public String getNumeroLlamado() {
		return this.numeroLlamado;
	}

	public void setNumeroLlamado(String numeroLlamado) {
		this.numeroLlamado = numeroLlamado;
	}

	public int getNumeroLocuciones() {
		return this.numeroLocuciones;
	}

	public void setNumeroLocuciones(int numeroLocuciones) {
		this.numeroLocuciones = numeroLocuciones;
	}

	public int getOcurrencias() {
		return this.ocurrencias;
	}

	public void setOcurrencias(int ocurrencias) {
		this.ocurrencias = ocurrencias;
	}

	public String getRazonSalida() {
		return this.razonSalida;
	}

	public void setRazonSalida(String razonSalida) {
		this.razonSalida = razonSalida;
	}

	public int getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(int secuencial) {
		this.secuencial = secuencial;
	}

	public String getTarifa() {
		return this.tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public String getTipoDeServicio() {
		return this.tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public String getTipoDestino() {
		return this.tipoDestino;
	}

	public void setTipoDestino(String tipoDestino) {
		this.tipoDestino = tipoDestino;
	}

	public String getTipoOrigen() {
		return this.tipoOrigen;
	}

	public void setTipoOrigen(String tipoOrigen) {
		this.tipoOrigen = tipoOrigen;
	}

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}