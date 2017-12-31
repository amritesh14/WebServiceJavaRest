package org.amritesh.singh.webapptest.database;

import java.util.HashMap;
import java.util.Map;

import org.amritesh.singh.webapptest.model.Message;
import org.amritesh.singh.webapptest.model.Profile;

public class DatabaseClass {

	private  static Map<Long, Message> mapMessage = new HashMap<Long, Message>();
	private static Map<String, Profile> mapProfile = new HashMap<String, Profile>();

	public static Map<Long, Message> getMessage() {

		return mapMessage;
	}

	public static Map<String, Profile> getProfile() {

		return mapProfile;
	}

}
