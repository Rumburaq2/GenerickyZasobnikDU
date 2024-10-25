public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer i = 0;
        Zasobnik<Integer> zasobnink = new Zasobnik<Integer>();

        System.out.println(zasobnink);
        zasobnink.push(6);
        System.out.println(zasobnink);
        zasobnink.push(7);
        System.out.println(zasobnink);
        i = zasobnink.pop();
        System.out.println(i);
        zasobnink.push(8);
        System.out.println(zasobnink);

        Zasobnik<String> zasobnink2 = new Zasobnik<String>();

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

        /*


        Tovarna tovarna = new ZasobnikFactory();
        Zasobnik<Integer> z = (Zasobnik<Integer>) tovarna.vyrobZasobnik("Arraylist");

        System.out.println(z);
        z.push(6);
        System.out.println(z);
        z.push(7);
        System.out.println(z);
        i = z.pop();
        System.out.println(i);
        z.push(8);
        System.out.println(z);

         */






    }
}