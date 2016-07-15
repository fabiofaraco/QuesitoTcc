package comum;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ManagedBeanPadrao {
	
	public void addMessageInfo(String summary, String detail) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public void addMessageWarn(String summary, String detail) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public void addMessageError(String summary, String detail) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public void addMessageFatal(String summary, String detail) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------	
	
	public String getParameter(String parameter) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap() .get(parameter);
	}
	
//	----------------------------------------------------------------------------------------------------------------	
	
	public int getParameterInt(String parameter) {
		try {
			return Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap() .get(parameter));
		} catch(Exception e) {
			return 0;
		}		
	}
}
