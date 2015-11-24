package pe.gob.edu.ugel.agenda.core.dao;

import java.util.List;

import pe.gob.edu.ugel.agenda.core.domain.Activity;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;

public interface AgendaDAO {

	List<Activity> findActivityByWeekCalendar(String weekCalendar);

	Calendar findCalendarByDate(String date);

	List<Calendar> findCalendarByWeek(String weekCalendar);

}
