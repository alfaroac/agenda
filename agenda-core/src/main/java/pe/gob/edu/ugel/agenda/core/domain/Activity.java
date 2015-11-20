package pe.gob.edu.ugel.agenda.core.domain;

import java.util.Date;

public class Activity extends BaseEntity {

	private static final long serialVersionUID = 0L;

	private String title;
	private String description;
	private String place;
	private Date dateEvent;
	private String startHour;
	private String endHour;
	private String priority;
	private Long userInvited;
	private Long userId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Long getUserInvited() {
		return userInvited;
	}

	public void setUserInvited(Long userInvited) {
		this.userInvited = userInvited;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
