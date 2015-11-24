package pe.gob.edu.ugel.agenda.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.gob.edu.ugel.agenda.core.domain.Activity;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;
import pe.gob.edu.ugel.agenda.core.service.services.AgendaServiceImpl;
import pe.gob.edu.ugel.agenda.core.util.AgendaCommons;
import pe.gob.edu.ugel.agenda.core.util.CommonUtils;

@Controller
public class AgendaController {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	AgendaServiceImpl agendaService;

	@RequestMapping(value = "agenda/dashboard", method = RequestMethod.GET)
	public String electionsDashboard(Model model, HttpServletRequest request) {

		request.getSession().setAttribute("menuHeader", "agenda");

		logger.info("::::  agenda/dashboard  ::::");

		String date = CommonUtils.dateToString(new Date(), "YYYY-MM-dd");

		Calendar calendar = agendaService.findCalendarByDate(date);
		List<Calendar> listCalendar = agendaService.findCalendarByWeek(calendar.getWeekCalendar());

		List<Activity> listActivity = agendaService.findActivityByWeekCalendar(calendar.getWeekCalendar());

		String calendarString = "<table width='100%' class='table'>" + "<tr>" + "	<th>Hora </th>" + "	<th>Domingo \n "
				+ listCalendar.get(0).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Lunes \n"
				+ listCalendar.get(1).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Martes \n"
				+ listCalendar.get(2).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Miercoles \n"
				+ listCalendar.get(3).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Jueves \n"
				+ listCalendar.get(4).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Viernes \n"
				+ listCalendar.get(5).getDateCalendarYYYYMMDD() + "</th>" + "	<th>Sabado \n"
				+ listCalendar.get(6).getDateCalendarYYYYMMDD() + "</th>" + "</tr>";

		int hourEnd = 0;
		for (int i = 0; i < AgendaCommons.hours.length; i++) {
			hourEnd = AgendaCommons.hours[i] + 1;
			calendarString = calendarString + "<tr>";
			calendarString = calendarString + " <td>" + AgendaCommons.hours[i] + "-" + hourEnd + " </td>";

			for (int j = 1; j <= 7; j++) {
				Activity activity = searchActivity(listActivity, listCalendar.get(j - 1).getDateCalendarYYYYMMDD(),
						AgendaCommons.hours[i] + "");

				if (activity == null) {
					calendarString = calendarString + "	<td><a href='#divFrmSetElector' data-toggle='modal'>Cargar</a></td>";
				} else {
					calendarString = calendarString + "	<td>" + activity.getTitle() + "</td>";
				}

			}
			calendarString = calendarString + "</tr>";

		}

		calendarString = calendarString + "</table>";

		model.addAttribute("calendar", calendarString);
		return "agenda/dashboard";
	}

	private Activity searchActivity(List<Activity> listActivity, String dateEvent, String hour) {
		Activity activityReturn = null;
		for (Activity activity : listActivity) {
			if (activity.getDateEventYYYYMMDD().equals(dateEvent) && activity.getStartHour().equals(hour))
				activityReturn = activity;

		}
		return activityReturn;
	}

}
