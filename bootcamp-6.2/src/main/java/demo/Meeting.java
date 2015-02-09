package demo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meeting {
	private List<Attendee> attendees;
	private Room room;
	private Date timeSlot;

	@Id
	@GeneratedValue
	private Long id;

	Meeting() {
	} // jpa only

	public void MeetingSet(Room room, List<Attendee> attendees, Date timeSlot) {
		this.room = room;
		this.attendees = attendees;
		this.timeSlot = timeSlot;
	}

	public Room getRoom() {
		return this.room;
	}

	public Date getTimeSlot() {
		return this.timeSlot;
	}

	public List<Attendee> getAttendees() {
		return this.attendees;
	}

	@Override
	public String toString() {
		return "Meeting " + this.id;
	}

	public Long getId() {
		return this.id;
	}

}
