package pe.gob.edu.ugel.agenda.core.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.gob.edu.ugel.agenda.core.domain.Activity;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;
import pe.gob.edu.ugel.agenda.core.util.CommonUtils;

public class AgendaDAOTest extends AbstractUnitTest {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	protected AgendaDAO agendaDAO;

	public void testFindActivityByDate() {
		List<Activity> list = agendaDAO.findActivityByWeekCalendar("48");
		logger.info("list>>>>>> "+list);
		System.out.println("list>>>>>> "+list.size());

	}

	public void testFindCalendarByWeek() {
		List<Calendar> list = agendaDAO.findCalendarByWeek("48");
		logger.info("list>>>>>> "+list.size());
		System.out.println("list>>>>>> "+list.size());

	}

	public void testFindCalendarByDate() {
		String date = CommonUtils.dateToString(new Date(), "YYYY-MM-dd");
		logger.info("date>>>>>> "+date);

		Calendar list = agendaDAO.findCalendarByDate(date);
//		System.out.println("list>>>>>> "+list.s);
		logger.info("list>>>>>> "+list);
	}
}
