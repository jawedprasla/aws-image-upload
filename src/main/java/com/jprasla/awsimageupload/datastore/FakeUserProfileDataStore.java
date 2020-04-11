package com.jprasla.awsimageupload.datastore;

import com.jprasla.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("14c45e35-6b77-4887-947c-2729789d9a78"), "janatejones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("8dd77e67-c52d-441c-8de3-02a9e4509f2c"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
