package lesson1;

public class Main1 {

    public static void main(String[] args) {

        int dlinStol=3;
        int shirStol=3;
        int dlinRoom=31;
        int shorRoom=42;

        int ploshStola=dlinStol*shirStol;
        int ploshRoom=dlinRoom*shorRoom;

        int colStolovVRoom=ploshRoom/ploshStola;

        System.out.println(colStolovVRoom);
    }
}
