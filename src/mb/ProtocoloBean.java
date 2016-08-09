package mb;

import interfaces.Dao;
import interfaces.ProtocoloHibernateDao;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import util.FacesUtil;
import bean.Evento;
import bean.Protocolo;
import dao.GenericDao;
import dao.ProtocoloDao;

@ManagedBean
@ViewScoped
public class ProtocoloBean {
	private Protocolo protocolo = new Protocolo();
	private List<Evento> eventos;
	private boolean carregaModal;

	public String salvar() {
		Dao<Protocolo> dao = new GenericDao<>(Protocolo.class);
		
		try {			
			protocolo.setUsuario(FacesUtil.getUsuarioSessao());
			
			dao.incluir(protocolo);
			protocolo = new Protocolo();
			
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_REQUERENTE_INSERIDO"));			
		} catch (Exception e) {
			FacesUtil.addMessageError();
		}
		return "lista-protocolo";
	}

	public void remover() {
		Dao<Protocolo> dao = new GenericDao<>(Protocolo.class);
		try {
			dao.remover(FacesUtil.getParameterInt("id"));
			FacesUtil.addMessageInfo(FacesUtil.getMessage("MSG_PROTOCOLO_CANCELADO"));
			this.carregaModal = false;
		} catch (Exception e) {
			FacesUtil.addMessageError();
		}
	}

	public void carregarDados() {
		ProtocoloHibernateDao dao = new ProtocoloDao();
		
		eventos = dao.buscarEventoData(protocolo.getEvento().getDataEvento());
		protocolo.setRequerente(dao.buscarDadosRequerente(protocolo.getRequerente().getCpf()));
		
		if(eventos == null || eventos.isEmpty()) {
			FacesUtil.addMessageWarn(FacesUtil.getMessage("MSG_EVENTO_NAO_ENCONTRADO"));
		} else if(protocolo.getRequerente() == null) {
			FacesUtil.addMessageWarn(FacesUtil.getMessage("MSG_REQUERENTE_NAO_ENCONTRADO"));
		} else {
			this.carregaModal = true;
		}
	}

	public List<Protocolo> getProtocolos() {
		Dao<Protocolo> dao = new GenericDao<>(Protocolo.class);
		return dao.getLista("select p from Protocolo p");
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public List<Evento> getEventos() {
		return eventos;
	}
	
	public boolean isCarregaModal() {
		return carregaModal;
	}
}
