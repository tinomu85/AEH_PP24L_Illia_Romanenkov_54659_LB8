package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Konto konto = new Konto("123456789", 1000.0, "Jan Kowalski", "jan@example.com", "123-456-789");

        konto.wyplacKonto(900.0);
        konto.zasilKonto(250.0);
        konto.wyplacKonto(50.0);
        konto.wyplacKonto(400.0);
    }
}
