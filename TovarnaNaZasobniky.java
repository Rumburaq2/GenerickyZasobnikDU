public class TovarnaNaZasobniky<T> {

    public Zasobnik<T> vyrobZasobnik(String typ) {
        if(typ == null){
            return null;
        }
        else if(typ.equals("list")) {
            return new ZasobnikArr();
        }
        else if(typ.equals("pole")) {
            return new ZasobnikPole(100);
        }
        else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }

    //pretezovani jelikoz u pole je potreba vyprat si velikost zasobniku (pole)
    public Zasobnik<T> vyrobZasobnik(String typ, int velikost) {
        if(typ == null){
            return null;
        }
        else if(typ.equals("list")) {
            return new ZasobnikArr();
        }
        else if(typ.equals("pole")) {
            return new ZasobnikPole(velikost);
        }
        else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
