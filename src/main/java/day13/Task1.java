package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Daniil");
        User user2 = new User("Maksim");
        User user3 = new User("Nikolai");
        user1.subscribe(user2);
        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How is your boring?");
        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "not bad");
        user2.sendMessage(user1, "hows your?");
        user3.sendMessage(user1, "Hello1");
        user3.sendMessage(user1, "HelloHello2");
        user3.sendMessage(user1, "HelloHelloHello3");
        user1.sendMessage(user3, "message1");
        user1.sendMessage(user3, "message2");
        user1.sendMessage(user3, "message3");
        user3.sendMessage(user1, "last message");

        MessageDatabase.showDialog(user1, user3);
    }
}
