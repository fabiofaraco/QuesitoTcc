package bean;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="eventos")
public class Evento {

	@Id
	@GeneratedValue
	private int id;

	private String obm;

	
	private PrincipalEventoAtendido principalEventoAtendido = new PrincipalEventoAtendido();

	private int numeroDeVitimasFatais;
	private int numeroDeVitimasNaoFatais;

	private String comandanteDaObm;
	private String comandanteDoSocorro;

	private String comoFoiAvisado;

	private Calendar recebimentoDoAviso = new GregorianCalendar();
	private Calendar saidaDaObm = new GregorianCalendar();
	private Calendar chegadaAcena = new GregorianCalendar();
	private Calendar retornoAObm = new GregorianCalendar();


//	private Endereco endereco = new Endereco();

	private String areaDaObm;

	private String dpResponsavel;


	private MovimentoDeMaterial movimentoDeMaterial = new MovimentoDeMaterial();


	private NaturezaDoBem naturezaDoBem = new NaturezaDoBem();


	private ResponsabilidadePeloBem responsabilidadePeloBem = new ResponsabilidadePeloBem();


	private Tripulacao tripulacao = new Tripulacao();


	private ProvavelCausa provavelCausa = new ProvavelCausa();


	private AcaoDeSocorro acaoDeSocorro = new AcaoDeSocorro();


	private Salvamento salvamento = new Salvamento();


	private RetiradaDeCadaver retiradaDeCadaver = new RetiradaDeCadaver();

	
	private ProtecaoDeBens protecaoDeBens = new ProtecaoDeBens();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObm() {
		return obm;
	}

	public void setObm(String obm) {
		this.obm = obm;
	}

	public PrincipalEventoAtendido getPrincipalEventoAtendido() {
		return principalEventoAtendido;
	}

	public void setPrincipalEventoAtendido(
			PrincipalEventoAtendido principalEventoAtendido) {
		this.principalEventoAtendido = principalEventoAtendido;
	}

	public int getNumeroDeVitimasFatais() {
		return numeroDeVitimasFatais;
	}

	public void setNumeroDeVitimasFatais(int numeroDeVitimasFatais) {
		this.numeroDeVitimasFatais = numeroDeVitimasFatais;
	}

	public int getNumeroDeVitimasNaoFatais() {
		return numeroDeVitimasNaoFatais;
	}

	public void setNumeroDeVitimasNaoFatais(int numeroDeVitimasNaoFatais) {
		this.numeroDeVitimasNaoFatais = numeroDeVitimasNaoFatais;
	}

	public String getComandanteDaObm() {
		return comandanteDaObm;
	}

	public void setComandanteDaObm(String comandanteDaObm) {
		this.comandanteDaObm = comandanteDaObm;
	}

	public String getComandanteDoSocorro() {
		return comandanteDoSocorro;
	}

	public void setComandanteDoSocorro(String comandanteDoSocorro) {
		this.comandanteDoSocorro = comandanteDoSocorro;
	}

	public String getComoFoiAvisado() {
		return comoFoiAvisado;
	}

	public void setComoFoiAvisado(String comoFoiAvisado) {
		this.comoFoiAvisado = comoFoiAvisado;
	}

	public Calendar getRecebimentoDoAviso() {
		return recebimentoDoAviso;
	}

	public void setRecebimentoDoAviso(Calendar recebimentoDoAviso) {
		this.recebimentoDoAviso = recebimentoDoAviso;
	}

	public Calendar getSaidaDaObm() {
		return saidaDaObm;
	}

	public void setSaidaDaObm(Calendar saidaDaObm) {
		this.saidaDaObm = saidaDaObm;
	}

	public Calendar getChegadaAcena() {
		return chegadaAcena;
	}

	public void setChegadaAcena(Calendar chegadaAcena) {
		this.chegadaAcena = chegadaAcena;
	}

	public Calendar getRetornoAObm() {
		return retornoAObm;
	}

	public void setRetornoAObm(Calendar retornoAObm) {
		this.retornoAObm = retornoAObm;
	}


	public String getAreaDaObm() {
		return areaDaObm;
	}

	public void setAreaDaObm(String areaDaObm) {
		this.areaDaObm = areaDaObm;
	}

	public String getDpResponsavel() {
		return dpResponsavel;
	}

	public void setDpResponsavel(String dpResponsavel) {
		this.dpResponsavel = dpResponsavel;
	}

	public MovimentoDeMaterial getMovimentoDeMaterial() {
		return movimentoDeMaterial;
	}

	public void setMovimentoDeMaterial(MovimentoDeMaterial movimentoDeMaterial) {
		this.movimentoDeMaterial = movimentoDeMaterial;
	}

	public NaturezaDoBem getNaturezaDoBem() {
		return naturezaDoBem;
	}

	public void setNaturezaDoBem(NaturezaDoBem naturezaDoBem) {
		this.naturezaDoBem = naturezaDoBem;
	}

	public ResponsabilidadePeloBem getResponsabilidadePeloBem() {
		return responsabilidadePeloBem;
	}

	public void setResponsabilidadePeloBem(
			ResponsabilidadePeloBem responsabilidadePeloBem) {
		this.responsabilidadePeloBem = responsabilidadePeloBem;
	}

	public Tripulacao getTripulacao() {
		return tripulacao;
	}

	public void setTripulacao(Tripulacao tripulacao) {
		this.tripulacao = tripulacao;
	}

	public ProvavelCausa getProvavelCausa() {
		return provavelCausa;
	}

	public void setProvavelCausa(ProvavelCausa provavelCausa) {
		this.provavelCausa = provavelCausa;
	}

	public AcaoDeSocorro getAcaoDeSocorro() {
		return acaoDeSocorro;
	}

	public void setAcaoDeSocorro(AcaoDeSocorro acaoDeSocorro) {
		this.acaoDeSocorro = acaoDeSocorro;
	}

	public Salvamento getSalvamento() {
		return salvamento;
	}

	public void setSalvamento(Salvamento salvamento) {
		this.salvamento = salvamento;
	}

	public RetiradaDeCadaver getRetiradaDeCadaver() {
		return retiradaDeCadaver;
	}

	public void setRetiradaDeCadaver(RetiradaDeCadaver retiradaDeCadaver) {
		this.retiradaDeCadaver = retiradaDeCadaver;
	}

	public ProtecaoDeBens getProtecaoDeBens() {
		return protecaoDeBens;
	}

	public void setProtecaoDeBens(ProtecaoDeBens protecaoDeBens) {
		this.protecaoDeBens = protecaoDeBens;
	}
}
