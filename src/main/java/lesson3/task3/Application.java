package lesson3.task3;

public class Application {
    public static void main(String[] args) {
        //Бабушки и дедушки
        Human valeriy = new Human("Валерий", 70, null, null);
        Human aleksandra = new Human("Александра", 69, null, null);

        Human ivan = new Human("Иван", 71, null, null);
        //Родители
        Human sergey = new Human("Сергей", 44, valeriy, aleksandra);
        Human marina = new Human("Марина", 40, ivan, null);
        //Дети
        Human vitaliy = new Human("Виталий", 25, sergey, marina);
        Human elena = new Human("Елена", 24, sergey, marina);

        Human[] elenasGrandParents = new Human[4];
        int tempIndex = 0;

        //Поиск бабушек и дедушек через foreach
        for (Human elenaParents : elena.parents) {
            for (Human grandParent : elenaParents.parents) {
                elenasGrandParents[tempIndex] = grandParent;
                tempIndex++;
            }
        }
        //Поиск бабушек и дедушек через for
/*
        for (int i = 0; i < elena.parents.length; i++) {
            Human[] parentParents = elena.parents[i].parents;
            for (int j = 0; j < parentParents.length; j++) {
                elenasGrandParents[tempIndex++] = parentParents[j];
            }
        }
*/
        //Вывод на экран
        for (Human example : elenasGrandParents) {
            if (example != null) {
                System.out.println("Имя = " + example.name + ", возраст= " + example.age + ".");
            }
        }
    }
}