package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_601010 database table.
 * 
 */
@Entity
@Table(name="tbl_601010")
public class Tbl601010 implements Serializable {
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

	@Column(name="CODIGO_DESCUENTO_1", length=14)
	private String codigoDescuento1;

	@Column(name="CODIGO_DESCUENTO_2", length=14)
	private String codigoDescuento2;

	@Column(name="CODIGO_DESCUENTO_3", length=14)
	private String codigoDescuento3;

	@Column(name="CODIGO_PAQUETE", length=14)
	private String codigoPaquete;

	@Column(name="CODIGO_PERSONALIZACION", length=14)
	private String codigoPersonalizacion;

	@Column(name="CODIGO_PERSONALIZADO_1", length=14)
	private String codigoPersonalizado1;

	@Column(name="CODIGO_PERSONALIZADO_2", length=14)
	private String codigoPersonalizado2;

	@Column(name="CODIGO_PERSONALIZADO_3", length=14)
	private String codigoPersonalizado3;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="CONCEPTO_FACTURABLE", length=14)
	private String conceptoFacturable;

	@Column(name="DESC_CODIGO_CONCEPTO", length=250)
	private String descCodigoConcepto;

	@Column(name="DESC_CODIGO_DESCUENTO_1", length=250)
	private String descCodigoDescuento1;

	@Column(name="DESC_CODIGO_DESCUENTO_2", length=250)
	private String descCodigoDescuento2;

	@Column(name="DESC_CODIGO_DESCUENTO_3", length=250)
	private String descCodigoDescuento3;

	@Column(name="DESC_CODIGO_PAQUETE", length=250)
	private String descCodigoPaquete;

	@Column(name="DESC_CODIGO_PERSONALIZACION", length=250)
	private String descCodigoPersonalizacion;

	@Column(name="DESC_CODIGO_PERSONALIZADO_1", length=250)
	private String descCodigoPersonalizado1;

	@Column(name="DESC_CODIGO_PERSONALIZADO_2", length=250)
	private String descCodigoPersonalizado2;

	@Column(name="DESC_CODIGO_PERSONALIZADO_3", length=250)
	private String descCodigoPersonalizado3;

	@Column(name="DESC_CONCEPTO_FACTURABLE", length=250)
	private String descConceptoFacturable;

	@Column(name="DESC_DESCRIPCION_PERIODO_1", length=250)
	private String descDescripcionPeriodo1;

	@Column(name="DESC_DESCRIPCION_PERIODO_2", length=250)
	private String descDescripcionPeriodo2;

	@Column(name="DESC_NIVEL_IMPOSITIVO", length=250)
	private String descNivelImpositivo;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(name="DESC_TIPO_VALORACION", length=250)
	private String descTipoValoracion;

	@Column(name="DESCRIPCION_PERIODO_1", length=1)
	private String descripcionPeriodo1;

	@Column(name="DESCRIPCION_PERIODO_2", length=1)
	private String descripcionPeriodo2;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_FIN_PERIODO", length=8)
	private String fechaFinPeriodo;

	@Column(name="FECHA_INICIO_PERIODO", length=8)
	private String fechaInicioPeriodo;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="IMPORTE_DESCUENTO_1")
	private double importeDescuento1;

	@Column(name="IMPORTE_DESCUENTO_2")
	private double importeDescuento2;

	@Column(name="IMPORTE_DESCUENTO_3")
	private double importeDescuento3;

	@Column(name="IMPORTE_DISTANCIA")
	private double importeDistancia;

	@Column(name="IMPORTE_ESTANDAR_PRODUCTO")
	private double importeEstandarProducto;

	@Column(name="IMPORTE_TOTAL_EQUIPO")
	private double importeTotalEquipo;

	@Column(name="IMPORTE_UNITARIO")
	private double importeUnitario;

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

	private int ocurrencias;

	private int secuencial;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TIPO_IMPOSITIVO")
	private double tipoImpositivo;

	@Column(name="TIPO_VALORACION", length=1)
	private String tipoValoracion;

	private int unidades;

	@Column(name="UNIDADES_PERIODO_1")
	private int unidadesPeriodo1;

	@Column(name="UNIDADES_PERIODO_2")
	private int unidadesPeriodo2;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl601010() {
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

	public String getCodigoDescuento1() {
		return this.codigoDescuento1;
	}

	public void setCodigoDescuento1(String codigoDescuento1) {
		this.codigoDescuento1 = codigoDescuento1;
	}

	public String getCodigoDescuento2() {
		return this.codigoDescuento2;
	}

	public void setCodigoDescuento2(String codigoDescuento2) {
		this.codigoDescuento2 = codigoDescuento2;
	}

	public String getCodigoDescuento3() {
		return this.codigoDescuento3;
	}

	public void setCodigoDescuento3(String codigoDescuento3) {
		this.codigoDescuento3 = codigoDescuento3;
	}

	public String getCodigoPaquete() {
		return this.codigoPaquete;
	}

	public void setCodigoPaquete(String codigoPaquete) {
		this.codigoPaquete = codigoPaquete;
	}

	public String getCodigoPersonalizacion() {
		return this.codigoPersonalizacion;
	}

	public void setCodigoPersonalizacion(String codigoPersonalizacion) {
		this.codigoPersonalizacion = codigoPersonalizacion;
	}

	public String getCodigoPersonalizado1() {
		return this.codigoPersonalizado1;
	}

	public void setCodigoPersonalizado1(String codigoPersonalizado1) {
		this.codigoPersonalizado1 = codigoPersonalizado1;
	}

	public String getCodigoPersonalizado2() {
		return this.codigoPersonalizado2;
	}

	public void setCodigoPersonalizado2(String codigoPersonalizado2) {
		this.codigoPersonalizado2 = codigoPersonalizado2;
	}

	public String getCodigoPersonalizado3() {
		return this.codigoPersonalizado3;
	}

	public void setCodigoPersonalizado3(String codigoPersonalizado3) {
		this.codigoPersonalizado3 = codigoPersonalizado3;
	}

	public int getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getConceptoFacturable() {
		return this.conceptoFacturable;
	}

	public void setConceptoFacturable(String conceptoFacturable) {
		this.conceptoFacturable = conceptoFacturable;
	}

	public String getDescCodigoConcepto() {
		return this.descCodigoConcepto;
	}

	public void setDescCodigoConcepto(String descCodigoConcepto) {
		this.descCodigoConcepto = descCodigoConcepto;
	}

	public String getDescCodigoDescuento1() {
		return this.descCodigoDescuento1;
	}

	public void setDescCodigoDescuento1(String descCodigoDescuento1) {
		this.descCodigoDescuento1 = descCodigoDescuento1;
	}

	public String getDescCodigoDescuento2() {
		return this.descCodigoDescuento2;
	}

	public void setDescCodigoDescuento2(String descCodigoDescuento2) {
		this.descCodigoDescuento2 = descCodigoDescuento2;
	}

	public String getDescCodigoDescuento3() {
		return this.descCodigoDescuento3;
	}

	public void setDescCodigoDescuento3(String descCodigoDescuento3) {
		this.descCodigoDescuento3 = descCodigoDescuento3;
	}

	public String getDescCodigoPaquete() {
		return this.descCodigoPaquete;
	}

	public void setDescCodigoPaquete(String descCodigoPaquete) {
		this.descCodigoPaquete = descCodigoPaquete;
	}

	public String getDescCodigoPersonalizacion() {
		return this.descCodigoPersonalizacion;
	}

	public void setDescCodigoPersonalizacion(String descCodigoPersonalizacion) {
		this.descCodigoPersonalizacion = descCodigoPersonalizacion;
	}

	public String getDescCodigoPersonalizado1() {
		return this.descCodigoPersonalizado1;
	}

	public void setDescCodigoPersonalizado1(String descCodigoPersonalizado1) {
		this.descCodigoPersonalizado1 = descCodigoPersonalizado1;
	}

	public String getDescCodigoPersonalizado2() {
		return this.descCodigoPersonalizado2;
	}

	public void setDescCodigoPersonalizado2(String descCodigoPersonalizado2) {
		this.descCodigoPersonalizado2 = descCodigoPersonalizado2;
	}

	public String getDescCodigoPersonalizado3() {
		return this.descCodigoPersonalizado3;
	}

	public void setDescCodigoPersonalizado3(String descCodigoPersonalizado3) {
		this.descCodigoPersonalizado3 = descCodigoPersonalizado3;
	}

	public String getDescConceptoFacturable() {
		return this.descConceptoFacturable;
	}

	public void setDescConceptoFacturable(String descConceptoFacturable) {
		this.descConceptoFacturable = descConceptoFacturable;
	}

	public String getDescDescripcionPeriodo1() {
		return this.descDescripcionPeriodo1;
	}

	public void setDescDescripcionPeriodo1(String descDescripcionPeriodo1) {
		this.descDescripcionPeriodo1 = descDescripcionPeriodo1;
	}

	public String getDescDescripcionPeriodo2() {
		return this.descDescripcionPeriodo2;
	}

	public void setDescDescripcionPeriodo2(String descDescripcionPeriodo2) {
		this.descDescripcionPeriodo2 = descDescripcionPeriodo2;
	}

	public String getDescNivelImpositivo() {
		return this.descNivelImpositivo;
	}

	public void setDescNivelImpositivo(String descNivelImpositivo) {
		this.descNivelImpositivo = descNivelImpositivo;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getDescTipoValoracion() {
		return this.descTipoValoracion;
	}

	public void setDescTipoValoracion(String descTipoValoracion) {
		this.descTipoValoracion = descTipoValoracion;
	}

	public String getDescripcionPeriodo1() {
		return this.descripcionPeriodo1;
	}

	public void setDescripcionPeriodo1(String descripcionPeriodo1) {
		this.descripcionPeriodo1 = descripcionPeriodo1;
	}

	public String getDescripcionPeriodo2() {
		return this.descripcionPeriodo2;
	}

	public void setDescripcionPeriodo2(String descripcionPeriodo2) {
		this.descripcionPeriodo2 = descripcionPeriodo2;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaFinPeriodo() {
		return this.fechaFinPeriodo;
	}

	public void setFechaFinPeriodo(String fechaFinPeriodo) {
		this.fechaFinPeriodo = fechaFinPeriodo;
	}

	public String getFechaInicioPeriodo() {
		return this.fechaInicioPeriodo;
	}

	public void setFechaInicioPeriodo(String fechaInicioPeriodo) {
		this.fechaInicioPeriodo = fechaInicioPeriodo;
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

	public double getImporteDescuento1() {
		return this.importeDescuento1;
	}

	public void setImporteDescuento1(double importeDescuento1) {
		this.importeDescuento1 = importeDescuento1;
	}

	public double getImporteDescuento2() {
		return this.importeDescuento2;
	}

	public void setImporteDescuento2(double importeDescuento2) {
		this.importeDescuento2 = importeDescuento2;
	}

	public double getImporteDescuento3() {
		return this.importeDescuento3;
	}

	public void setImporteDescuento3(double importeDescuento3) {
		this.importeDescuento3 = importeDescuento3;
	}

	public double getImporteDistancia() {
		return this.importeDistancia;
	}

	public void setImporteDistancia(double importeDistancia) {
		this.importeDistancia = importeDistancia;
	}

	public double getImporteEstandarProducto() {
		return this.importeEstandarProducto;
	}

	public void setImporteEstandarProducto(double importeEstandarProducto) {
		this.importeEstandarProducto = importeEstandarProducto;
	}

	public double getImporteTotalEquipo() {
		return this.importeTotalEquipo;
	}

	public void setImporteTotalEquipo(double importeTotalEquipo) {
		this.importeTotalEquipo = importeTotalEquipo;
	}

	public double getImporteUnitario() {
		return this.importeUnitario;
	}

	public void setImporteUnitario(double importeUnitario) {
		this.importeUnitario = importeUnitario;
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

	public double getTipoImpositivo() {
		return this.tipoImpositivo;
	}

	public void setTipoImpositivo(double tipoImpositivo) {
		this.tipoImpositivo = tipoImpositivo;
	}

	public String getTipoValoracion() {
		return this.tipoValoracion;
	}

	public void setTipoValoracion(String tipoValoracion) {
		this.tipoValoracion = tipoValoracion;
	}

	public int getUnidades() {
		return this.unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int getUnidadesPeriodo1() {
		return this.unidadesPeriodo1;
	}

	public void setUnidadesPeriodo1(int unidadesPeriodo1) {
		this.unidadesPeriodo1 = unidadesPeriodo1;
	}

	public int getUnidadesPeriodo2() {
		return this.unidadesPeriodo2;
	}

	public void setUnidadesPeriodo2(int unidadesPeriodo2) {
		this.unidadesPeriodo2 = unidadesPeriodo2;
	}

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}