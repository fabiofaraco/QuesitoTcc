package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {
	
	public static void addMessageInfo(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageWarn(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageError(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageFatal(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail));
	}
	
//	----------------------------------------------------------------------------------------------------------------	
	
	public static String getParameter(String parameter) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap() .get(parameter);
	}
	
//	----------------------------------------------------------------------------------------------------------------	
	
	public static int getParameterInt(String parameter) {
		try {
			return Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap() .get(parameter));
		} catch(Exception e) {
			return 0;
		}		
	}

}
