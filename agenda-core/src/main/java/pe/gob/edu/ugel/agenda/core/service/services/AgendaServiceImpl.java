package pe.gob.edu.ugel.agenda.core.service.services;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.edu.ugel.agenda.core.dao.AgendaDAO;
import pe.gob.edu.ugel.agenda.core.domain.Activity;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;

@Service("agendaService")
public class AgendaServiceImpl {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	private AgendaDAO agendaDAO;

	public Calendar findCalendarByDate(String date) {
		return agendaDAO.findCalendarByDate(date);
	}
	
	public List<Calendar> findCalendarByWeek(String weekCalendar) {
		return agendaDAO.findCalendarByWeek(weekCalendar);
	}

	public List<Activity> findActivityByWeekCalendar(String weekCalendar) {
		return agendaDAO.findActivityByWeekCalendar(weekCalendar);
	}
	
}
