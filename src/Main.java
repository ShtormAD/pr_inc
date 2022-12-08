public class Main {
    public static void main(String[] args) {

        Example ex = new Example();
        System.out.println(ex.getS());

        // Устанавливаем новое значение
        ex.setS(13);
        System.out.println(ex.getS());

        // Устанавливаем новое значение
        ex.setS(0);
        System.out.println(ex.getS());
    }
}