public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer i = 0;
        ZasobnikArr<Integer> zasobnink = new ZasobnikArr();

        System.out.println(zasobnink);
        zasobnink.push(6);
        System.out.println(zasobnink);
        zasobnink.push(7);
        System.out.println(zasobnink);
        i = zasobnink.pop();
        System.out.println(i);
        zasobnink.push(8);
        System.out.println(zasobnink);

        ZasobnikArr<String> zasobnink2 = new ZasobnikArr();
        System.out.println(zasobnink2);
        zasobnink2.push("hello");
        System.out.println(zasobnink2);
        zasobnink2.push("world");
        System.out.println(zasobnink2);
        String s = zasobnink2.pop();
        System.out.println(s);
        zasobnink2.push("dsfdfds");
        System.out.println(zasobnink2);

        System.out.println("-------------------");

        ZasobnikPole<Integer> zasobninkPole = new ZasobnikPole<>(5);
        System.out.println(zasobninkPole);
        zasobninkPole.push(6);
        System.out.println(zasobninkPole);
        zasobninkPole.push(7);
        System.out.println(zasobninkPole);
        int x = zasobninkPole.pop();
        System.out.println(x);
        System.out.println(zasobninkPole);
        zasobninkPole.push(8);
        System.out.println(zasobninkPole);
    }

}