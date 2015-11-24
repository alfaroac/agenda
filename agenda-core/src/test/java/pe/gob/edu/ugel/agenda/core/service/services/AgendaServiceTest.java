package pe.gob.edu.ugel.agenda.core.service.services;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.gob.edu.ugel.agenda.core.dao.AbstractUnitTest;
import pe.gob.edu.ugel.agenda.core.domain.Calendar;

public class AgendaServiceTest extends AbstractUnitTest {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	protected AgendaServiceImpl agendaService;

	public void testFindCalendarByWeek() {
		List<Calendar> list = agendaService.findCalendarByWeek("1");
		logger.info(":::::::::::::::::::::."+list );
	}

}
