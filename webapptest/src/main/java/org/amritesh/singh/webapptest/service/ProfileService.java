package org.amritesh.singh.webapptest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.amritesh.singh.webapptest.database.DatabaseClass;
import org.amritesh.singh.webapptest.model.Message;
import org.amritesh.singh.webapptest.model.Profile;

public class ProfileService {
	
	 private Map<String,Profile> profiles= DatabaseClass.getProfile();
	 
	 public ProfileService(){
		 profiles.put("Amritesh", new Profile(1L,"Amritesh","Singh",new Date()));
	 }
	 
		public List<Profile> getAllProfile() {

			return new ArrayList<Profile>(profiles.values());

		}
		
		public Profile getProfile(String name){
			
			return profiles.get(name);
		}

		public Profile addProfile(Profile profile){
			profile.setId(profiles.size()+1);
			profiles.put(profile.getFirstname(), profile);
			return profile;
		}
		public Profile updateProfile(Profile profile) {
			if (profile.getFirstname().isEmpty()) {
				return null;
			}
			profiles.put(profile.getFirstname(), profile);
			return profile;
		}
		
		public Profile removeProfile(String name) {
			return profiles.remove(name);
		}

}
