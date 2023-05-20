package hus.oop.lab11.IteratorPattern.Pseudocode;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId, type;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId =profileId;
        this.type = type;
    }

    // An iterator object traverses the collection independently of other iterators.
// Therefore, it has to store the iteration state.
    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type).toArray(new Profile[0]);
        }
    }

    // Each concrete iterator class has its own implementation of the common iterator interface.
    public Profile getNext() {
        if (hasMore()) {
            currentPosition++;
            return cache[currentPosition];
        }
        return null;
    }

    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
