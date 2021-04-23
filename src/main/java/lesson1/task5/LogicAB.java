package lesson1.task5;

public class LogicAB {
    public static void main(String[] args) {
        LogicAB logic = new LogicAB();

        System.out.println(logic.getOr(false, false) + " ," + logic.getAnd(false, false));
        System.out.println();
        System.out.println(logic.getOr(false, true) + " ," + logic.getAnd(false, true));
        System.out.println();
        System.out.println(logic.getOr(true, false) + " ," + logic.getAnd(true, false));
        System.out.println();
        System.out.println(logic.getOr(true, true) + " ," + logic.getAnd(true, true));
    }

    public boolean getOr (boolean a, boolean b){
        return !(a || b);
    }

    public boolean getAnd (boolean a, boolean b){
        return !a && !b;
    }
}
