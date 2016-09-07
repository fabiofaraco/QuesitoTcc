package mb;

import java.io.InputStream;

import javax.faces.bean.ManagedBean;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import util.FacesUtil;

@ManagedBean
public class RelatorioBean {
	
	public void imprimirCertidao() {
		try {
			InputStream is = getClass().getResourceAsStream("/certidao.jasper");
			JasperPrint  print = JasperFillManager.fillReport(is, null);
			JasperExportManager.exportReportToPdfFile(print, "relatorios/certidao.pdf");
		} catch (JRException e) {
			FacesUtil.addMessageError();
			e.printStackTrace();
		}
	}
}
