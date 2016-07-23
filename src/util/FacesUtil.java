package util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesUtil {
	
	public static void addMessageInfo(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
	}
	
	public static void addMessageInfo(String summary) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, ""));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageWarn(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail));
	}
	
	public static void addMessageWarn(String summary) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, ""));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageError(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail));
	}
	
	public static void addMessageError(String summary) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, ""));
	}
	
	public static void addMessageError() {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, getMessage("MSG_OPERACAO_NAO_REALIZADA"), getMessage("MSG_ERRO_INESPERADO")));
	}
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static void addMessageFatal(String summary, String detail) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail));
	}
	
	public static void addMessageFatal(String summary) {
		FacesContext.getCurrentInstance()
			.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, ""));
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
	
//	----------------------------------------------------------------------------------------------------------------
	
	public static String getMessage(String message) {  
      
		FacesContext facesContext = FacesContext.getCurrentInstance();  
        Locale locale = facesContext.getViewRoot().getLocale();  
        
        try {
        	ResourceBundle bundle = ResourceBundle.getBundle("messages.messages", locale);
        	
        	return bundle.getString(message);
        }
        catch(MissingResourceException e) {
        	return "Não foi possível completar a operação";
        }
    }
}
