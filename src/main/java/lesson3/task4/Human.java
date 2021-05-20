package lesson3.task4;

import java.util.Arrays;

public class Human {
    String name;
    Human[] friends = new Human[0];

    public Human(String name) {
        this.name = name;
    }

    public void addFriend(Human newFriend) {
        for (Human oldFriend : friends) {
            if (oldFriend == newFriend) {
                return;
            }
        }
        friends = Arrays.copyOf(friends, friends.length + 1);
        friends[friends.length - 1] = newFriend;
        newFriend.addFriend(this);
    }
}