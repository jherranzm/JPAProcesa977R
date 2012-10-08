package net.herranzmartin.project977r.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the tbl_000000 database table.
 * 
 */
@Entity
@Table(name="tbl_000000")
public class Tbl000000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="1A_LINEA_DE_ETIQUETA", length=70)
	private String _1aLineaDeEtiqueta;

	@Column(name="2A_LINEA_DE_ETIQUETA", length=70)
	private String _2aLineaDeEtiqueta;

	@Column(name="AGF_MONOSERVICIO", length=20)
	private String agfMonoservicio;

	@Column(name="AGRUPACION_FACTURABLE", length=12)
	private String agrupacionFacturable;

	@Column(name="CIF_SUPRACLIENTE", length=18)
	private String cifSupracliente;

	@Column(length=8)
	private String cliente;

	@Column(name="CODIGO_POSTAL", length=7)
	private String codigoPostal;

	@Column(name="CODIGO_REGISTRO")
	private int codigoRegistro;

	@Column(length=40)
	private String domicilio;

	@Column(name="DUPLICADO_REGULAR", length=5)
	private String duplicadoRegular;

	@Column(name="FECHA_DE_EMISION", length=8)
	private String fechaDeEmision;

	@Column(name="FECHA_FACTURA", length=8)
	private String fechaFactura;

	@Column(name="FECHA_VERSION", length=8)
	private String fechaVersion;

	@Column(length=15)
	private String fichero;

	@Column(name="GRUPO_DE_GASTO", length=12)
	private String grupoDeGasto;

	@Column(name="IDENTIFICACION_TIPO_ACUERDO", length=30)
	private String identificacionTipoAcuerdo;

	@Column(name="IDENTIFICADOR_UNICO", length=8)
	private String identificadorUnico;

	@Column(length=40)
	private String localidad;

	@Column(name="LONGITUD_ARCHIVO")
	private int longitudArchivo;

	@Column(name="LONGITUD_REGISTRO")
	private int longitudRegistro;

	@Column(length=20)
	private String multiconexion;

	@Column(name="NOMBRE_ARCHIVO_PC", length=12)
	private String nombreArchivoPc;

	@Column(name="NOMBRE_ENTIDAD_EMISORA", length=70)
	private String nombreEntidadEmisora;

	@Column(name="NOMBRE_SUPRACLIENTE", length=70)
	private String nombreSupracliente;

	@Column(name="NUM_REGISTROS_TOTALES", length=8)
	private String numRegistrosTotales;

	@Column(name="NUMERO_COMERCIAL", length=20)
	private String numeroComercial;

	@Column(name="NUMERO_COMERCIAL_ASOCIADO", length=20)
	private String numeroComercialAsociado;

	@Column(length=40)
	private String provincia;

	@Column(name="RECEPTOR_DEL_SOPORTE", length=70)
	private String receptorDelSoporte;

	private int secuencial;

	@Column(name="TIPO_DE_CAMBIO", length=8)
	private String tipoDeCambio;

	@Column(name="TIPO_DE_FACTURACION", length=40)
	private String tipoDeFacturacion;

	@Column(name="TIPO_DE_IMPUESTO", length=1)
	private String tipoDeImpuesto;

	@Column(name="TIPO_DE_MONEDA", length=5)
	private String tipoDeMoneda;

	@Column(name="TIPO_DE_SERVICIO", length=12)
	private String tipoDeServicio;

	@Column(name="TIPO_DE_SOPORTE", length=2)
	private String tipoDeSoporte;

	@Column(name="VERSION_DE_977", length=5)
	private String versionDe977;

	//bi-directional many-to-one association to Tbl100000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl100000> tbl100000s;

	//bi-directional many-to-one association to Tbl200000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl200000> tbl200000s;

	//bi-directional many-to-one association to Tbl300000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl300000> tbl300000s;

	//bi-directional many-to-one association to Tbl500000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl500000> tbl500000s;

	//bi-directional many-to-one association to Tbl600000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl600000> tbl600000s;

	//bi-directional many-to-one association to Tbl600040
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl600040> tbl600040s;

	//bi-directional many-to-one association to Tbl601010
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl601010> tbl601010s;

	//bi-directional many-to-one association to Tbl700000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl700000> tbl700000s;

	//bi-directional many-to-one association to Tbl701010
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl701010> tbl701010s;

	//bi-directional many-to-one association to Tbl702001
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl702001> tbl702001s;

	//bi-directional many-to-one association to Tbl702002
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl702002> tbl702002s;

	//bi-directional many-to-one association to Tbl702005
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl702005> tbl702005s;

	//bi-directional many-to-one association to Tbl702010
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl702010> tbl702010s;

	//bi-directional many-to-one association to Tbl702020
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl702020> tbl702020s;

	//bi-directional many-to-one association to Tbl703010
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl703010> tbl703010s;

	//bi-directional many-to-one association to Tbl901000
	@OneToMany(mappedBy="tbl000000")
	private List<Tbl901000> tbl901000s;

    public Tbl000000() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String get_1aLineaDeEtiqueta() {
		return this._1aLineaDeEtiqueta;
	}

	public void set_1aLineaDeEtiqueta(String _aLineaDeEtiqueta) {
		this._1aLineaDeEtiqueta = _aLineaDeEtiqueta;
	}

	public String get_2aLineaDeEtiqueta() {
		return this._2aLineaDeEtiqueta;
	}

	public void set_2aLineaDeEtiqueta(String _aLineaDeEtiqueta) {
		this._2aLineaDeEtiqueta = _aLineaDeEtiqueta;
	}

	public String getAgfMonoservicio() {
		return this.agfMonoservicio;
	}

	public void setAgfMonoservicio(String agfMonoservicio) {
		this.agfMonoservicio = agfMonoservicio;
	}

	public String getAgrupacionFacturable() {
		return this.agrupacionFacturable;
	}

	public void setAgrupacionFacturable(String agrupacionFacturable) {
		this.agrupacionFacturable = agrupacionFacturable;
	}

	public String getCifSupracliente() {
		return this.cifSupracliente;
	}

	public void setCifSupracliente(String cifSupracliente) {
		this.cifSupracliente = cifSupracliente;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getCodigoRegistro() {
		return this.codigoRegistro;
	}

	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getDuplicadoRegular() {
		return this.duplicadoRegular;
	}

	public void setDuplicadoRegular(String duplicadoRegular) {
		this.duplicadoRegular = duplicadoRegular;
	}

	public String getFechaDeEmision() {
		return this.fechaDeEmision;
	}

	public void setFechaDeEmision(String fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}

	public String getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public String getFechaVersion() {
		return this.fechaVersion;
	}

	public void setFechaVersion(String fechaVersion) {
		this.fechaVersion = fechaVersion;
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

	public String getIdentificacionTipoAcuerdo() {
		return this.identificacionTipoAcuerdo;
	}

	public void setIdentificacionTipoAcuerdo(String identificacionTipoAcuerdo) {
		this.identificacionTipoAcuerdo = identificacionTipoAcuerdo;
	}

	public String getIdentificadorUnico() {
		return this.identificadorUnico;
	}

	public void setIdentificadorUnico(String identificadorUnico) {
		this.identificadorUnico = identificadorUnico;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getLongitudArchivo() {
		return this.longitudArchivo;
	}

	public void setLongitudArchivo(int longitudArchivo) {
		this.longitudArchivo = longitudArchivo;
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

	public String getNombreArchivoPc() {
		return this.nombreArchivoPc;
	}

	public void setNombreArchivoPc(String nombreArchivoPc) {
		this.nombreArchivoPc = nombreArchivoPc;
	}

	public String getNombreEntidadEmisora() {
		return this.nombreEntidadEmisora;
	}

	public void setNombreEntidadEmisora(String nombreEntidadEmisora) {
		this.nombreEntidadEmisora = nombreEntidadEmisora;
	}

	public String getNombreSupracliente() {
		return this.nombreSupracliente;
	}

	public void setNombreSupracliente(String nombreSupracliente) {
		this.nombreSupracliente = nombreSupracliente;
	}

	public String getNumRegistrosTotales() {
		return this.numRegistrosTotales;
	}

	public void setNumRegistrosTotales(String numRegistrosTotales) {
		this.numRegistrosTotales = numRegistrosTotales;
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

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getReceptorDelSoporte() {
		return this.receptorDelSoporte;
	}

	public void setReceptorDelSoporte(String receptorDelSoporte) {
		this.receptorDelSoporte = receptorDelSoporte;
	}

	public int getSecuencial() {
		return this.secuencial;
	}

	public void setSecuencial(int secuencial) {
		this.secuencial = secuencial;
	}

	public String getTipoDeCambio() {
		return this.tipoDeCambio;
	}

	public void setTipoDeCambio(String tipoDeCambio) {
		this.tipoDeCambio = tipoDeCambio;
	}

	public String getTipoDeFacturacion() {
		return this.tipoDeFacturacion;
	}

	public void setTipoDeFacturacion(String tipoDeFacturacion) {
		this.tipoDeFacturacion = tipoDeFacturacion;
	}

	public String getTipoDeImpuesto() {
		return this.tipoDeImpuesto;
	}

	public void setTipoDeImpuesto(String tipoDeImpuesto) {
		this.tipoDeImpuesto = tipoDeImpuesto;
	}

	public String getTipoDeMoneda() {
		return this.tipoDeMoneda;
	}

	public void setTipoDeMoneda(String tipoDeMoneda) {
		this.tipoDeMoneda = tipoDeMoneda;
	}

	public String getTipoDeServicio() {
		return this.tipoDeServicio;
	}

	public void setTipoDeServicio(String tipoDeServicio) {
		this.tipoDeServicio = tipoDeServicio;
	}

	public String getTipoDeSoporte() {
		return this.tipoDeSoporte;
	}

	public void setTipoDeSoporte(String tipoDeSoporte) {
		this.tipoDeSoporte = tipoDeSoporte;
	}

	public String getVersionDe977() {
		return this.versionDe977;
	}

	public void setVersionDe977(String versionDe977) {
		this.versionDe977 = versionDe977;
	}

	public List<Tbl100000> getTbl100000s() {
		return this.tbl100000s;
	}

	public void setTbl100000s(List<Tbl100000> tbl100000s) {
		this.tbl100000s = tbl100000s;
	}
	
	public List<Tbl200000> getTbl200000s() {
		return this.tbl200000s;
	}

	public void setTbl200000s(List<Tbl200000> tbl200000s) {
		this.tbl200000s = tbl200000s;
	}
	
	public List<Tbl300000> getTbl300000s() {
		return this.tbl300000s;
	}

	public void setTbl300000s(List<Tbl300000> tbl300000s) {
		this.tbl300000s = tbl300000s;
	}
	
	public List<Tbl500000> getTbl500000s() {
		return this.tbl500000s;
	}

	public void setTbl500000s(List<Tbl500000> tbl500000s) {
		this.tbl500000s = tbl500000s;
	}
	
	public List<Tbl600000> getTbl600000s() {
		return this.tbl600000s;
	}

	public void setTbl600000s(List<Tbl600000> tbl600000s) {
		this.tbl600000s = tbl600000s;
	}
	
	public List<Tbl600040> getTbl600040s() {
		return this.tbl600040s;
	}

	public void setTbl600040s(List<Tbl600040> tbl600040s) {
		this.tbl600040s = tbl600040s;
	}
	
	public List<Tbl601010> getTbl601010s() {
		return this.tbl601010s;
	}

	public void setTbl601010s(List<Tbl601010> tbl601010s) {
		this.tbl601010s = tbl601010s;
	}
	
	public List<Tbl700000> getTbl700000s() {
		return this.tbl700000s;
	}

	public void setTbl700000s(List<Tbl700000> tbl700000s) {
		this.tbl700000s = tbl700000s;
	}
	
	public List<Tbl701010> getTbl701010s() {
		return this.tbl701010s;
	}

	public void setTbl701010s(List<Tbl701010> tbl701010s) {
		this.tbl701010s = tbl701010s;
	}
	
	public List<Tbl702001> getTbl702001s() {
		return this.tbl702001s;
	}

	public void setTbl702001s(List<Tbl702001> tbl702001s) {
		this.tbl702001s = tbl702001s;
	}
	
	public List<Tbl702002> getTbl702002s() {
		return this.tbl702002s;
	}

	public void setTbl702002s(List<Tbl702002> tbl702002s) {
		this.tbl702002s = tbl702002s;
	}
	
	public List<Tbl702005> getTbl702005s() {
		return this.tbl702005s;
	}

	public void setTbl702005s(List<Tbl702005> tbl702005s) {
		this.tbl702005s = tbl702005s;
	}
	
	public List<Tbl702010> getTbl702010s() {
		return this.tbl702010s;
	}

	public void setTbl702010s(List<Tbl702010> tbl702010s) {
		this.tbl702010s = tbl702010s;
	}
	
	public List<Tbl702020> getTbl702020s() {
		return this.tbl702020s;
	}

	public void setTbl702020s(List<Tbl702020> tbl702020s) {
		this.tbl702020s = tbl702020s;
	}
	
	public List<Tbl703010> getTbl703010s() {
		return this.tbl703010s;
	}

	public void setTbl703010s(List<Tbl703010> tbl703010s) {
		this.tbl703010s = tbl703010s;
	}
	
	public List<Tbl901000> getTbl901000s() {
		return this.tbl901000s;
	}

	public void setTbl901000s(List<Tbl901000> tbl901000s) {
		this.tbl901000s = tbl901000s;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tbl000000 [id=");
		builder.append(id);
		builder.append(", _1aLineaDeEtiqueta=");
		builder.append(_1aLineaDeEtiqueta);
		builder.append(", _2aLineaDeEtiqueta=");
		builder.append(_2aLineaDeEtiqueta);
		builder.append(", agfMonoservicio=");
		builder.append(agfMonoservicio);
		builder.append(", agrupacionFacturable=");
		builder.append(agrupacionFacturable);
		builder.append(", cifSupracliente=");
		builder.append(cifSupracliente);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", codigoPostal=");
		builder.append(codigoPostal);
		builder.append(", codigoRegistro=");
		builder.append(codigoRegistro);
		builder.append(", domicilio=");
		builder.append(domicilio);
		builder.append(", duplicadoRegular=");
		builder.append(duplicadoRegular);
		builder.append(", fechaDeEmision=");
		builder.append(fechaDeEmision);
		builder.append(", fechaFactura=");
		builder.append(fechaFactura);
		builder.append(", fechaVersion=");
		builder.append(fechaVersion);
		builder.append(", fichero=");
		builder.append(fichero);
		builder.append(", grupoDeGasto=");
		builder.append(grupoDeGasto);
		builder.append(", identificacionTipoAcuerdo=");
		builder.append(identificacionTipoAcuerdo);
		builder.append(", identificadorUnico=");
		builder.append(identificadorUnico);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", longitudArchivo=");
		builder.append(longitudArchivo);
		builder.append(", longitudRegistro=");
		builder.append(longitudRegistro);
		builder.append(", multiconexion=");
		builder.append(multiconexion);
		builder.append(", nombreArchivoPc=");
		builder.append(nombreArchivoPc);
		builder.append(", nombreEntidadEmisora=");
		builder.append(nombreEntidadEmisora);
		builder.append(", nombreSupracliente=");
		builder.append(nombreSupracliente);
		builder.append(", numRegistrosTotales=");
		builder.append(numRegistrosTotales);
		builder.append(", numeroComercial=");
		builder.append(numeroComercial);
		builder.append(", numeroComercialAsociado=");
		builder.append(numeroComercialAsociado);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", receptorDelSoporte=");
		builder.append(receptorDelSoporte);
		builder.append(", secuencial=");
		builder.append(secuencial);
		builder.append(", tipoDeCambio=");
		builder.append(tipoDeCambio);
		builder.append(", tipoDeFacturacion=");
		builder.append(tipoDeFacturacion);
		builder.append(", tipoDeImpuesto=");
		builder.append(tipoDeImpuesto);
		builder.append(", tipoDeMoneda=");
		builder.append(tipoDeMoneda);
		builder.append(", tipoDeServicio=");
		builder.append(tipoDeServicio);
		builder.append(", tipoDeSoporte=");
		builder.append(tipoDeSoporte);
		builder.append(", versionDe977=");
		builder.append(versionDe977);

		builder.append("]");
		return builder.toString();
	}
	
	
	
}