package hus.oop.lab11.IteratorPattern.Pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }


    public List<Profile> socialGraphRequest(String profileId, String type) {
        List<Profile> list = new ArrayList<>();
        list.add(new Profile(profileId,type));
        return list;
    }
}
