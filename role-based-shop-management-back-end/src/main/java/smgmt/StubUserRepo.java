package smgmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubUserRepo implements UserProfileRepo {
private Map<String, UserProfile> profileData = new HashMap<String, UserProfile>();
	
	public StubUserRepo() {
		UserProfile profile = new UserProfile("admin", "Role : ADMIN");
		profileData.put("1000", profile);
		profile = new UserProfile("user", "Role : ADMIN");
		profileData.put("2000", profile);
		profile = new UserProfile("billinguser", "Role : ADMIN");
		profileData.put("3000", profile);
	}
	
	@Override
	public List<UserProfile> getAllProfiles() {
		return new ArrayList<UserProfile>(profileData.values());
	}
}
