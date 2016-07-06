package comum;

import javax.faces.context.FacesContext;

public class ManagedBeanPadrao {
	
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
