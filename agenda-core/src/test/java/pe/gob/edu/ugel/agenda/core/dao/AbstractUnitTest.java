package pe.gob.edu.ugel.agenda.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"pe/gob/edu/ugel/agenda/core/config/application-config.xml",
				"pe/gob/edu/ugel/agenda/core/config/applicationContext-dao.xml",
				"pe/gob/edu/ugel/agenda/core/service/config/applicationContext-service.xml"
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}
