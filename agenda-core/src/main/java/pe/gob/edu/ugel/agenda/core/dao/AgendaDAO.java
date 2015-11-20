package pe.gob.edu.ugel.agenda.core.dao;

import java.util.List;

import pe.gob.edu.ugel.agenda.core.domain.Activity;

public interface AgendaDAO {

	List<Activity> findActivityByDate();

}
