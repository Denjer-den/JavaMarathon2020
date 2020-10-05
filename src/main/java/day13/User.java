package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public void sendMessage(User user, String text) {

        MessageDatabase.sendMessage(this, user, text);

    }

    public boolean isSubscribed(User user) {
        for (int i = 0; i < subscriptions.size(); i++) {
            if (subscriptions.get(i).equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return isSubscribed(user) && user.isSubscribed(this);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "Пользователь: " + username;
    }
}
