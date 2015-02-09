package demo;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RequestMapping("/meetings")
@Controller
public class MeetingController {

	private MeetingRepository meetingRepo;
	
	@Autowired
	public MeetingController(MeetingRepository meetingDao){
		this.meetingRepo=meetingDao;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public @ResponseBody HttpEntity<Meeting> create(@PathVariable Meeting meeting) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(meeting.getId()).toUri());
        return new ResponseEntity<>( null,httpHeaders, HttpStatus.CREATED);
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Meeting getMeeting(@PathVariable Long id) {
        final Meeting meeting = meetingRepo.getOne(id);
        return meeting;
    }

	@RequestMapping( method = RequestMethod.GET)
    public @ResponseBody Collection<Meeting> getMeetings() {
        final List<Meeting> meetings = meetingRepo.findAll();
        return meetings;
    }
	
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	void deleteMeeting(@PathVariable Long id) {
		this.meetingRepo.delete(id);
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	void updateMeeting(@PathVariable Meeting meeting) {
		this.meetingRepo.delete(meeting.getId());
		this.meetingRepo.save(meeting);
	}
	
}
