package smgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
		
	@Autowired
	UserProfileRepo profileRepository;
		
	@RequestMapping("/profiles")
	public UserProfile[] all() {
		List<UserProfile> profiles = profileRepository.getAllProfiles();
		return profiles.toArray(new UserProfile[profiles.size()]);
	}
		
}
