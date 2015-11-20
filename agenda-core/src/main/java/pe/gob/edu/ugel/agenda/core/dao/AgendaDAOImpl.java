package pe.gob.edu.ugel.agenda.core.dao;

import java.util.List;

import pe.gob.edu.ugel.agenda.core.domain.Activity;

public class AgendaDAOImpl extends BaseDAOHibernate implements AgendaDAO {

//	@Override
	public List<Activity> findActivityByDate(){
		return find(Activity.class, "FROM Activity");
	}
	
	
}
