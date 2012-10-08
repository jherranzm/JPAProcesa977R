package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_702001 database table.
 * 
 */
@Entity
@Table(name="tbl_702001")
public class Tbl702001 implements Serializable {
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

	@Column(name="CODIGO_DESCUENTO_1", length=14)
	private String codigoDescuento1;

	@Column(name="CODIGO_DESCUENTO_2", length=14)
	private String codigoDescuento2;

	@Column(name="CODIGO_DESCUENTO_3", length=14)
	private String codigoDescuento3;

	@Column(name="CODIGO_DESCUENTO_4", length=14)
	private String codigoDescuento4;

	@Column(name="CODIGO_DESCUENTO_5", length=14)
	private String codigoDescuento5;

	@Column(name="CODIGO_PERSONALIZADO_1", length=14)
	private String codigoPersonalizado1;

	@Column(name="CODIGO_PERSONALIZADO_2", length=14)
	private String codigoPersonalizado2;

	@Column(name="CODIGO_PERSONALIZADO_3", length=14)
	private String codigoPersonalizado3;

	@Column(name="CODIGO_PERSONALIZADO_4", length=14)
	private String codigoPersonalizado4;

	@Column(name="CODIGO_PERSONALIZADO_5", length=14)
	private String codigoPersonalizado5;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="CODIGO_TRAFICO", length=3)
	private String codigoTrafico;

	@Column(name="DESC_AMBITO_DE_TRAFICO", length=250)
	private String descAmbitoDeTrafico;

	@Column(name="DESC_CODIGO_DESCUENTO_1", length=250)
	private String descCodigoDescuento1;

	@Column(name="DESC_CODIGO_DESCUENTO_2", length=250)
	private String descCodigoDescuento2;

	@Column(name="DESC_CODIGO_DESCUENTO_3", length=250)
	private String descCodigoDescuento3;

	@Column(name="DESC_CODIGO_DESCUENTO_4", length=250)
	private String descCodigoDescuento4;

	@Column(name="DESC_CODIGO_DESCUENTO_5", length=250)
	private String descCodigoDescuento5;

	@Column(name="DESC_CODIGO_PERSONALIZADO_1", length=250)
	private String descCodigoPersonalizado1;

	@Column(name="DESC_CODIGO_PERSONALIZADO_2", length=250)
	private String descCodigoPersonalizado2;

	@Column(name="DESC_CODIGO_PERSONALIZADO_3", length=250)
	private String descCodigoPersonalizado3;

	@Column(name="DESC_CODIGO_PERSONALIZADO_4", length=250)
	private String descCodigoPersonalizado4;

	@Column(name="DESC_CODIGO_PERSONALIZADO_5", length=250)
	private String descCodigoPersonalizado5;

	@Column(name="DESC_CODIGO_TRAFICO", length=250)
	private String descCodigoTrafico;

	@Column(name="DESC_INDICADOR_DE_DETALLE", length=250)
	private String descIndicadorDeDetalle;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(length=13)
	private String duracion;

	@Column(name="DURACION_SUJETA_DESCUEN_1", length=13)
	private String duracionSujetaDescuen1;

	@Column(name="DURACION_SUJETA_DESCUEN_2", length=13)
	private String duracionSujetaDescuen2;

	@Column(name="DURACION_SUJETA_DESCUEN_3", length=13)
	private String duracionSujetaDescuen3;

	@Column(name="DURACION_SUJETA_DESCUEN_4", length=13)
	private String duracionSujetaDescuen4;

	@Column(name="DURACION_SUJETA_DESCUEN_5", length=13)
	private String duracionSujetaDescuen5;

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

	@Column(name="IMPORTE_DESCUENTO_4")
	private double importeDescuento4;

	@Column(name="IMPORTE_DESCUENTO_5")
	private double importeDescuento5;

	@Column(name="IMPORTE_ESTANDAR_PRODUCTO")
	private double importeEstandarProducto;

	@Column(name="IMPORTE_VALOR_ANADIDO")
	private double importeValorAnadido;

	@Column(name="INDICADOR_DE_DETALLE", length=1)
	private String indicadorDeDetalle;

	@Column(name="LLAMADAS_SUJETA_DESCUEN_1")
	private int llamadasSujetaDescuen1;

	@Column(name="LLAMADAS_SUJETA_DESCUEN_2")
	private int llamadasSujetaDescuen2;

	@Column(name="LLAMADAS_SUJETA_DESCUEN_3")
	private int llamadasSujetaDescuen3;

	@Column(name="LLAMADAS_SUJETA_DESCUEN_4")
	private int llamadasSujetaDescuen4;

	@Column(name="LLAMADAS_SUJETA_DESCUEN_5")
	private int llamadasSujetaDescuen5;

	@Column(name="LONGITUD_REGISTRO")
	private int longitudRegistro;

	@Column(length=20)
	private String multiconexion;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	@Column(name="NUMERO_DE_LLAMADAS")
	private int numeroDeLlamadas;

	private int ocurrencias;

	private int secuencial;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl702001() {
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

	public String getCodigoDescuento4() {
		return this.codigoDescuento4;
	}

	public void setCodigoDescuento4(String codigoDescuento4) {
		this.codigoDescuento4 = codigoDescuento4;
	}

	public String getCodigoDescuento5() {
		return this.codigoDescuento5;
	}

	public void setCodigoDescuento5(String codigoDescuento5) {
		this.codigoDescuento5 = codigoDescuento5;
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

	public String getCodigoPersonalizado4() {
		return this.codigoPersonalizado4;
	}

	public void setCodigoPersonalizado4(String codigoPersonalizado4) {
		this.codigoPersonalizado4 = codigoPersonalizado4;
	}

	public String getCodigoPersonalizado5() {
		return this.codigoPersonalizado5;
	}

	public void setCodigoPersonalizado5(String codigoPersonalizado5) {
		this.codigoPersonalizado5 = codigoPersonalizado5;
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

	public String getDescCodigoDescuento4() {
		return this.descCodigoDescuento4;
	}

	public void setDescCodigoDescuento4(String descCodigoDescuento4) {
		this.descCodigoDescuento4 = descCodigoDescuento4;
	}

	public String getDescCodigoDescuento5() {
		return this.descCodigoDescuento5;
	}

	public void setDescCodigoDescuento5(String descCodigoDescuento5) {
		this.descCodigoDescuento5 = descCodigoDescuento5;
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

	public String getDescCodigoPersonalizado4() {
		return this.descCodigoPersonalizado4;
	}

	public void setDescCodigoPersonalizado4(String descCodigoPersonalizado4) {
		this.descCodigoPersonalizado4 = descCodigoPersonalizado4;
	}

	public String getDescCodigoPersonalizado5() {
		return this.descCodigoPersonalizado5;
	}

	public void setDescCodigoPersonalizado5(String descCodigoPersonalizado5) {
		this.descCodigoPersonalizado5 = descCodigoPersonalizado5;
	}

	public String getDescCodigoTrafico() {
		return this.descCodigoTrafico;
	}

	public void setDescCodigoTrafico(String descCodigoTrafico) {
		this.descCodigoTrafico = descCodigoTrafico;
	}

	public String getDescIndicadorDeDetalle() {
		return this.descIndicadorDeDetalle;
	}

	public void setDescIndicadorDeDetalle(String descIndicadorDeDetalle) {
		this.descIndicadorDeDetalle = descIndicadorDeDetalle;
	}

	public String getDescTipoDeServicio() {
		return this.descTipoDeServicio;
	}

	public void setDescTipoDeServicio(String descTipoDeServicio) {
		this.descTipoDeServicio = descTipoDeServicio;
	}

	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getDuracionSujetaDescuen1() {
		return this.duracionSujetaDescuen1;
	}

	public void setDuracionSujetaDescuen1(String duracionSujetaDescuen1) {
		this.duracionSujetaDescuen1 = duracionSujetaDescuen1;
	}

	public String getDuracionSujetaDescuen2() {
		return this.duracionSujetaDescuen2;
	}

	public void setDuracionSujetaDescuen2(String duracionSujetaDescuen2) {
		this.duracionSujetaDescuen2 = duracionSujetaDescuen2;
	}

	public String getDuracionSujetaDescuen3() {
		return this.duracionSujetaDescuen3;
	}

	public void setDuracionSujetaDescuen3(String duracionSujetaDescuen3) {
		this.duracionSujetaDescuen3 = duracionSujetaDescuen3;
	}

	public String getDuracionSujetaDescuen4() {
		return this.duracionSujetaDescuen4;
	}

	public void setDuracionSujetaDescuen4(String duracionSujetaDescuen4) {
		this.duracionSujetaDescuen4 = duracionSujetaDescuen4;
	}

	public String getDuracionSujetaDescuen5() {
		return this.duracionSujetaDescuen5;
	}

	public void setDuracionSujetaDescuen5(String duracionSujetaDescuen5) {
		this.duracionSujetaDescuen5 = duracionSujetaDescuen5;
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

	public double getImporteDescuento4() {
		return this.importeDescuento4;
	}

	public void setImporteDescuento4(double importeDescuento4) {
		this.importeDescuento4 = importeDescuento4;
	}

	public double getImporteDescuento5() {
		return this.importeDescuento5;
	}

	public void setImporteDescuento5(double importeDescuento5) {
		this.importeDescuento5 = importeDescuento5;
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

	public String getIndicadorDeDetalle() {
		return this.indicadorDeDetalle;
	}

	public void setIndicadorDeDetalle(String indicadorDeDetalle) {
		this.indicadorDeDetalle = indicadorDeDetalle;
	}

	public int getLlamadasSujetaDescuen1() {
		return this.llamadasSujetaDescuen1;
	}

	public void setLlamadasSujetaDescuen1(int llamadasSujetaDescuen1) {
		this.llamadasSujetaDescuen1 = llamadasSujetaDescuen1;
	}

	public int getLlamadasSujetaDescuen2() {
		return this.llamadasSujetaDescuen2;
	}

	public void setLlamadasSujetaDescuen2(int llamadasSujetaDescuen2) {
		this.llamadasSujetaDescuen2 = llamadasSujetaDescuen2;
	}

	public int getLlamadasSujetaDescuen3() {
		return this.llamadasSujetaDescuen3;
	}

	public void setLlamadasSujetaDescuen3(int llamadasSujetaDescuen3) {
		this.llamadasSujetaDescuen3 = llamadasSujetaDescuen3;
	}

	public int getLlamadasSujetaDescuen4() {
		return this.llamadasSujetaDescuen4;
	}

	public void setLlamadasSujetaDescuen4(int llamadasSujetaDescuen4) {
		this.llamadasSujetaDescuen4 = llamadasSujetaDescuen4;
	}

	public int getLlamadasSujetaDescuen5() {
		return this.llamadasSujetaDescuen5;
	}

	public void setLlamadasSujetaDescuen5(int llamadasSujetaDescuen5) {
		this.llamadasSujetaDescuen5 = llamadasSujetaDescuen5;
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

	public int getNumeroDeLlamadas() {
		return this.numeroDeLlamadas;
	}

	public void setNumeroDeLlamadas(int numeroDeLlamadas) {
		this.numeroDeLlamadas = numeroDeLlamadas;
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

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}