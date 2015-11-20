package pe.gob.edu.ugel.agenda.core.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.gob.edu.ugel.agenda.core.domain.Activity;

public class AgendaDAOTest extends AbstractUnitTest {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	protected AgendaDAO agendaDAO;

	public void testFindActivityByDate() {
		List<Activity> list = agendaDAO.findActivityByDate();
		logger.info("list>>>>>> "+list);
	}

}
