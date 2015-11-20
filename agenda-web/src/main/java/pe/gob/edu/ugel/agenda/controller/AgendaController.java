package pe.gob.edu.ugel.agenda.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendaController {
	
	protected Log logger = LogFactory.getLog(getClass());


	@RequestMapping(value = "agenda/dashboard", method = RequestMethod.GET)
	public String electionsDashboard(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "agenda");

		logger.info("::::  agenda/dashboard  ::::");


		String calendar = "<table width='100%' class='table'>"+
			"<tr>"+
			"	<th>Domingo</th>"+
			"	<th>Lunes</th>"+
			"	<th>Martes</th>"+
			"	<th>Miercoles</th>"+
			"	<th>Jueves</th>"+
			"	<th>Viernes</th>"+
			"	<th>Sabado</th>"+
			"</tr>";
				
		
		for (int i = 0; i < 10; i++) {
			
			calendar =	calendar+
					"<tr>"+
					"	<td><a href='#divFrmSetElector' data-toggle='modal'>Message</a></td>"+
					"	<td background='red'>Lunes</td>"+
					"	<td>Martes</td>"+
					"	<td>Miercoles</td>"+
					"	<td>Jueves</td>"+
					"	<td>Viernes</td>"+
					"	<td>Sabado</td>"+
					"</tr>";
			
		}
		
		
	calendar=calendar+
	"</table>";
		
		model.addAttribute("calendar", calendar);
		return "agenda/dashboard";
	}
		
	
	
}
