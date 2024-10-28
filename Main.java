public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
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

        System.out.println();
        System.out.println("fatory");
        System.out.println("--------------------");

         */

        TovarnaNaZasobniky tovarna = new TovarnaNaZasobniky();
        Zasobnik<Integer> zas = tovarna.vyrobZasobnik("list");
        System.out.println(zas);
        zas.push(6);
        System.out.println(zas);
        zas.push(7);
        System.out.println(zas);
        zas.push(8);
        System.out.println(zas);
        Integer d = zas.pop();
        System.out.println(d);
        //zas.push(8);
        System.out.println(zas);



        Zasobnik<String> stringZasobnik = tovarna.vyrobZasobnik("list");
        System.out.println(stringZasobnik);
        stringZasobnik.push("hello");
        System.out.println(stringZasobnik);
        stringZasobnik.push("world");
        System.out.println(stringZasobnik);
        String g = stringZasobnik.pop();
        System.out.println(g);
        System.out.println(stringZasobnik);

        Zasobnik<Integer> zasPole = tovarna.vyrobZasobnik("pole", 10);
        System.out.println(zasPole);
        zasPole.push(6);
        System.out.println(zasPole);
        zasPole.push(7);
        System.out.println(zasPole);
        Integer p = zasPole.pop();
        System.out.println(p);
        System.out.println(zasPole);

    }

}