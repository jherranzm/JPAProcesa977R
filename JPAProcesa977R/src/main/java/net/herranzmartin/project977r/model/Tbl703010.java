package net.herranzmartin.project977r.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_703010 database table.
 * 
 */
@Entity
@Table(name="tbl_703010")
public class Tbl703010 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_DESCUENTO", length=14)
	private String codigoDescuento;

	@Column(name="CODIGO_PERSONALIZADO", length=14)
	private String codigoPersonalizado;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(name="DESC_CODIGO_DESCUENTO", length=250)
	private String descCodigoDescuento;

	@Column(name="DESC_NIVEL_IMPOSITIVO", length=250)
	private String descNivelImpositivo;

	@Column(name="DESC_TIPO_DE_SERVICIO", length=250)
	private String descTipoDeServicio;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_FIN_DESCUENTO", length=8)
	private String fechaFinDescuento;

	@Column(name="FECHA_INICIO_DESCUENTO", length=8)
	private String fechaInicioDescuento;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="IMPORTE_DESCUENTO")
	private double importeDescuento;

	@Column(name="IMPORTE_SUJETO_DESCUENTO")
	private double importeSujetoDescuento;

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

	//bi-directional many-to-one association to Tbl000000
    @ManyToOne
	@JoinColumn(name="ff_id", nullable=false)
	private Tbl000000 tbl000000;

    public Tbl703010() {
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

	public String getCodigoDescuento() {
		return this.codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
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

	public String getDescCodigoDescuento() {
		return this.descCodigoDescuento;
	}

	public void setDescCodigoDescuento(String descCodigoDescuento) {
		this.descCodigoDescuento = descCodigoDescuento;
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

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaFinDescuento() {
		return this.fechaFinDescuento;
	}

	public void setFechaFinDescuento(String fechaFinDescuento) {
		this.fechaFinDescuento = fechaFinDescuento;
	}

	public String getFechaInicioDescuento() {
		return this.fechaInicioDescuento;
	}

	public void setFechaInicioDescuento(String fechaInicioDescuento) {
		this.fechaInicioDescuento = fechaInicioDescuento;
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

	public double getImporteDescuento() {
		return this.importeDescuento;
	}

	public void setImporteDescuento(double importeDescuento) {
		this.importeDescuento = importeDescuento;
	}

	public double getImporteSujetoDescuento() {
		return this.importeSujetoDescuento;
	}

	public void setImporteSujetoDescuento(double importeSujetoDescuento) {
		this.importeSujetoDescuento = importeSujetoDescuento;
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

	public Tbl000000 getTbl000000() {
		return this.tbl000000;
	}

	public void setTbl000000(Tbl000000 tbl000000) {
		this.tbl000000 = tbl000000;
	}
	
}