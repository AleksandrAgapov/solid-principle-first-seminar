package homework;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        User user2 = new User("Jack");
        Persister persister = new Persister(user2);
        persister.save();
        persister.report();
        user.report();
        user.save();
    }
}