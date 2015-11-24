package pe.gob.edu.ugel.agenda.core.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;

import pe.gob.edu.ugel.agenda.core.domain.Activity;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;

public class AgendaDAOImpl extends BaseDAOHibernate implements AgendaDAO {

	// @Override
	public List<Activity> findActivityByWeekCalendar(String weekCalendar) {

		StringBuffer queryBuffer = new StringBuffer();
		queryBuffer.append(" SELECT a.* FROM activity a JOIN calendar c ON (a.calendarId= c.id)");
		queryBuffer.append(" WHERE c.weekCalendar = 48");

		SQLQuery query = getSession().createSQLQuery(queryBuffer.toString());

		List<Object> rows = query.list();

		List<Activity> list = new ArrayList<Activity>();

		for (Iterator<Object> iterator = rows.iterator(); iterator.hasNext();) {
			Object[] objects = (Object[]) iterator.next();
			logger.info("objects>>>>>> " + objects);

			Activity obj = new Activity();
			obj.setId(Long.valueOf(objects[0].toString()));
			if (!"".equals(objects[1]) && objects[1] != null) {
				obj.setUserInvited(Long.valueOf(objects[1].toString()));
			}
			obj.setTitle(objects[2].toString());

			if (!"".equals(objects[3]) && objects[3] != null) {
				obj.setDescription(objects[3].toString());
			}
			obj.setPlace(objects[4].toString());

			obj.setDateEvent((Date) objects[5]);

			obj.setStartHour(objects[6].toString());
			obj.setEndHour(objects[7].toString());
			obj.setPriority(objects[8].toString());
			obj.setUserId(Long.valueOf(objects[9].toString()));
			obj.setCalendarId(Long.valueOf(objects[10].toString()));

			logger.info("objects[7]>>>>>> " + objects[7]);

			list.add(obj);
		}

		return list;
	}

	// @Override
	public Calendar findCalendarByDate(String date) {
		String query = "FROM Calendar where dateCalendar = '" + date + "'";
		return findFirst(Calendar.class, query);
	}

	// @Override
	public List<Calendar> findCalendarByWeek(String weekCalendar) {
		String query = "FROM Calendar where weekCalendar= '" + weekCalendar + "'";
		return find(Calendar.class, query);
	}

}
