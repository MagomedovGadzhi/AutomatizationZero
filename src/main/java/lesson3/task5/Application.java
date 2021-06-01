package lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int index = 0; index < humans.length; index++) {
            humans[index] = new Human();
        }

        Human[] similarPeople = new Human[20];
        int index = 0;
        for (Human human1 : humans) {
            for (Human human2 : humans) {
                if (human1 != human2 && human1.dogsList.length == human2.dogsList.length && human1.catsList.length == human2.catsList.length) {
                    similarPeople[index] = human1;
                    index++;
                    break;
                }
            }
        }

        for (Human example : similarPeople) {
            if (example != null) {
                System.out.printf("%d %s: собак = %d, кошек = %d%n", example.ID, example.name, example.dogsList.length, example.catsList.length);
            }
        }
    }
}