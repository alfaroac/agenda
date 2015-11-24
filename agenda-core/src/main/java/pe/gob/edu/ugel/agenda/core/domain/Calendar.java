package pe.gob.edu.ugel.agenda.core.domain;

import java.io.Serializable;
import java.util.Date;

import pe.gob.edu.ugel.agenda.core.util.CommonUtils;

public class Calendar implements Serializable{
	
	private static final long serialVersionUID = 0L;

	private Long id;
	private String weekCalendar;
	private String dayCalendar;
	private Date dateCalendar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWeekCalendar() {
		return weekCalendar;
	}

	public void setWeekCalendar(String weekCalendar) {
		this.weekCalendar = weekCalendar;
	}

	public String getDayCalendar() {
		return dayCalendar;
	}

	public void setDayCalendar(String dayCalendar) {
		this.dayCalendar = dayCalendar;
	}

	public Date getDateCalendar() {
		return dateCalendar;
	}

	public String getDateCalendarYYYYMMDD() {
		return CommonUtils.dateToString(dateCalendar, "yyyy-MM-dd") ;
	}
	
	public void setDateCalendar(Date dateCalendar) {
		this.dateCalendar = dateCalendar;
	}

}
