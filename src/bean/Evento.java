package bean;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "eventos")
public class Evento {

	@Id
	@GeneratedValue
	private int id;
	
	@Transient
	private int nrVitimasFatais;
	@Transient
	private int nrVitimasNaoFatais;
	
	@Transient
	private String obm;
	@Transient
	private String comandanteObm;
	@Transient
	private String comandanteSocorro;
	@Transient
	private String formaDeAviso;
	@Transient
	private String areaObm;
	@Transient
	private String dpResponsavel;
	@Transient
	private String socorroChegouPrimeiro;
	@Transient
	private String outrosSocorros;
	@Transient
	private String especieDoBem;
	@Transient
	private String respQuantoContinente;
	@Transient
	private String respQuantoConteudo;
	@Transient
	private String comoOriginou;
	@Transient
	private String ondeOriginou;
	@Transient
	private String situacaoEvento;
	@Transient
	private String formaEstabelecimentoMaterial;
	@Transient
	private String salvamento;
	@Transient
	private String responsavelSalvamento;
	@Transient
	private String meiosSalvamento;
	@Transient
	private String retiradaCadaver;
	@Transient
	private String responsavelRetiradaCadaver;
	@Transient
	private String meiosRetiradaCadaver;
	@Transient
	private String retiradaBens;
	@Transient
	private String responsavelRetiradaBens;
	@Transient
	private String meiosRetiradaBens;

	private Date dataEvento = new Date();
	
	@Transient
	private Calendar dataRecebimento = new GregorianCalendar();
	@Transient
	private Calendar saidaObm = new GregorianCalendar();
	@Transient
	private Calendar chegadaCena = new GregorianCalendar();
	@Transient
	private Calendar retornoObm = new GregorianCalendar();
	
	@ManyToOne
	private PrincipalEventoAtendido principalEventoAtendido = new PrincipalEventoAtendido();
	
	private Endereco endereco = new Endereco();
	@Transient
	private FinalidadeDoBem finalidadeDoBem = new FinalidadeDoBem();
	@Transient
	private List<Tripulacao> tripulantes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNrVitimasFatais() {
		return nrVitimasFatais;
	}

	public void setNrVitimasFatais(int nrVitimasFatais) {
		this.nrVitimasFatais = nrVitimasFatais;
	}

	public int getNrVitimasNaoFatais() {
		return nrVitimasNaoFatais;
	}

	public void setNrVitimasNaoFatais(int nrVitimasNaoFatais) {
		this.nrVitimasNaoFatais = nrVitimasNaoFatais;
	}

	public String getObm() {
		return obm;
	}

	public void setObm(String obm) {
		this.obm = obm;
	}

	public String getComandanteObm() {
		return comandanteObm;
	}

	public void setComandanteObm(String comandanteObm) {
		this.comandanteObm = comandanteObm;
	}

	public String getComandanteSocorro() {
		return comandanteSocorro;
	}

	public void setComandanteSocorro(String comandanteSocorro) {
		this.comandanteSocorro = comandanteSocorro;
	}

	public String getFormaDeAviso() {
		return formaDeAviso;
	}

	public void setFormaDeAviso(String formaDeAviso) {
		this.formaDeAviso = formaDeAviso;
	}

	public String getAreaObm() {
		return areaObm;
	}

	public void setAreaObm(String areaObm) {
		this.areaObm = areaObm;
	}

	public String getDpResponsavel() {
		return dpResponsavel;
	}

	public void setDpResponsavel(String dpResponsavel) {
		this.dpResponsavel = dpResponsavel;
	}

	public String getSocorroChegouPrimeiro() {
		return socorroChegouPrimeiro;
	}

	public void setSocorroChegouPrimeiro(String socorroChegouPrimeiro) {
		this.socorroChegouPrimeiro = socorroChegouPrimeiro;
	}

	public String getOutrosSocorros() {
		return outrosSocorros;
	}

	public void setOutrosSocorros(String outrosSocorros) {
		this.outrosSocorros = outrosSocorros;
	}

	public String getEspecieDoBem() {
		return especieDoBem;
	}

	public void setEspecieDoBem(String especieDoBem) {
		this.especieDoBem = especieDoBem;
	}

	public String getRespQuantoContinente() {
		return respQuantoContinente;
	}

	public void setRespQuantoContinente(String respQuantoContinente) {
		this.respQuantoContinente = respQuantoContinente;
	}

	public String getRespQuantoConteudo() {
		return respQuantoConteudo;
	}

	public void setRespQuantoConteudo(String respQuantoConteudo) {
		this.respQuantoConteudo = respQuantoConteudo;
	}

	public String getComoOriginou() {
		return comoOriginou;
	}

	public void setComoOriginou(String comoOriginou) {
		this.comoOriginou = comoOriginou;
	}

	public String getOndeOriginou() {
		return ondeOriginou;
	}

	public void setOndeOriginou(String ondeOriginou) {
		this.ondeOriginou = ondeOriginou;
	}

	public String getSituacaoEvento() {
		return situacaoEvento;
	}

	public void setSituacaoEvento(String situacaoEvento) {
		this.situacaoEvento = situacaoEvento;
	}

	public String getFormaEstabelecimentoMaterial() {
		return formaEstabelecimentoMaterial;
	}

	public void setFormaEstabelecimentoMaterial(
			String formaEstabelecimentoMaterial) {
		this.formaEstabelecimentoMaterial = formaEstabelecimentoMaterial;
	}

	public String getSalvamento() {
		return salvamento;
	}

	public void setSalvamento(String salvamento) {
		this.salvamento = salvamento;
	}

	public String getResponsavelSalvamento() {
		return responsavelSalvamento;
	}

	public void setResponsavelSalvamento(String responsavelSalvamento) {
		this.responsavelSalvamento = responsavelSalvamento;
	}

	public String getMeiosSalvamento() {
		return meiosSalvamento;
	}

	public void setMeiosSalvamento(String meiosSalvamento) {
		this.meiosSalvamento = meiosSalvamento;
	}

	public String getRetiradaCadaver() {
		return retiradaCadaver;
	}

	public void setRetiradaCadaver(String retiradaCadaver) {
		this.retiradaCadaver = retiradaCadaver;
	}

	public String getResponsavelRetiradaCadaver() {
		return responsavelRetiradaCadaver;
	}

	public void setResponsavelRetiradaCadaver(String responsavelRetiradaCadaver) {
		this.responsavelRetiradaCadaver = responsavelRetiradaCadaver;
	}

	public String getMeiosRetiradaCadaver() {
		return meiosRetiradaCadaver;
	}

	public void setMeiosRetiradaCadaver(String meiosRetiradaCadaver) {
		this.meiosRetiradaCadaver = meiosRetiradaCadaver;
	}

	public String getRetiradaBens() {
		return retiradaBens;
	}

	public void setRetiradaBens(String retiradaBens) {
		this.retiradaBens = retiradaBens;
	}

	public String getResponsavelRetiradaBens() {
		return responsavelRetiradaBens;
	}

	public void setResponsavelRetiradaBens(String responsavelRetiradaBens) {
		this.responsavelRetiradaBens = responsavelRetiradaBens;
	}

	public String getMeiosRetiradaBens() {
		return meiosRetiradaBens;
	}

	public void setMeiosRetiradaBens(String meiosRetiradaBens) {
		this.meiosRetiradaBens = meiosRetiradaBens;
	}

	public Calendar getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Calendar dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public Calendar getSaidaObm() {
		return saidaObm;
	}

	public void setSaidaObm(Calendar saidaObm) {
		this.saidaObm = saidaObm;
	}

	public Calendar getChegadaCena() {
		return chegadaCena;
	}

	public void setChegadaCena(Calendar chegadaCena) {
		this.chegadaCena = chegadaCena;
	}

	public Calendar getRetornoObm() {
		return retornoObm;
	}

	public void setRetornoObm(Calendar retornoObm) {
		this.retornoObm = retornoObm;
	}

	public PrincipalEventoAtendido getPrincipalEventoAtendido() {
		return principalEventoAtendido;
	}

	public void setPrincipalEventoAtendido(
			PrincipalEventoAtendido principalEventoAtendido) {
		this.principalEventoAtendido = principalEventoAtendido;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public FinalidadeDoBem getFinalidadeDoBem() {
		return finalidadeDoBem;
	}

	public void setFinalidadeDoBem(FinalidadeDoBem finalidadeDoBem) {
		this.finalidadeDoBem = finalidadeDoBem;
	}

	public List<Tripulacao> getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(List<Tripulacao> tripulantes) {
		this.tripulantes = tripulantes;
	}
	
	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

}
