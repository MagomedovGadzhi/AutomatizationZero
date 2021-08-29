package lesson9.task2;

public class Action {
    public static void execDrawOrMove (Object o){
        if (o instanceof Movable){
            ((Movable) o).move();
        }
        if (o instanceof Drawable){
            ((Drawable) o).draw();
        }
    }
}