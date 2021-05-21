package lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int index = 0; index < humans.length; index++) {
            humans[index] = new Human();
        }
        //Чуть заморочился, чтобы имена при выводе не повторялись.
        Human[] similarPeople = new Human[20];
        for (int index1 = 0; index1 < humans.length; index1++) {
            for (int index2 = 0; index2 < humans.length; index2++) {
                if (humans[index1] != humans[index2] && humans[index1].dogsList.length == humans[index2].dogsList.length && humans[index1].catsList.length == humans[index2].catsList.length) {
                    similarPeople[index1] = humans[index1];
                }
            }
        }
        for (Human example : similarPeople) {
            if (example != null) {
                System.out.printf("%s: собак = %d, кошек = %d%n", example.name, example.dogsList.length, example.catsList.length);
            }
        }
    }
}