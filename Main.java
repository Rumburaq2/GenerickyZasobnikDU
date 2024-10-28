public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

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
        System.out.println(zas);
        System.out.println();

        Zasobnik<String> stringZasobnik = tovarna.vyrobZasobnik("list");
        System.out.println(stringZasobnik);
        stringZasobnik.push("hello");
        System.out.println(stringZasobnik);
        stringZasobnik.push("world");
        System.out.println(stringZasobnik);
        String g = stringZasobnik.pop();
        System.out.println(g);
        System.out.println(stringZasobnik);
        System.out.println();

        Zasobnik<Integer> zasPole = tovarna.vyrobZasobnik("pole", 5);
        System.out.println(zasPole);
        System.out.println("is empty: "+zasPole.isEmpty());
        zasPole.push(6);
        System.out.println(zasPole);
        zasPole.push(7);
        System.out.println(zasPole);
        Integer p = zasPole.pop();
        System.out.println(p);
        System.out.println(zasPole);
    }
}