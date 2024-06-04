package pl.pp;

public class Konto {
    private String numerKonta;
    private double saldo;
    private String wlasciciel;
    private String email;
    private String numerTelefonu;

    public Konto(String numerKonta, double saldo, String wlasciciel, String numerTelefonu, String email) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void zasilKonto(double kwota) {
        if (kwota<0){
            System.out.println("Blad! Kwota mniejsza od 0. Sproboj ponownie!");
            return;
        }
        else {
            saldo += kwota;
            System.out.println("Wpłata " + kwota + " została wykonana. Nowe saldo: " + saldo);
        }
    }
    public void wyplacKonto(double kwota) {
        if (kwota<0){
            System.out.println("Blad! Kwota mniejsza od 0. Sproboj ponownie!");
            return;
        }
        else if (saldo >= kwota) {
            saldo -= kwota;
            System.out.println("Pobrano " + kwota + " z konta. Pozostałe saldo: " + saldo);}

        else {
            System.out.println("Brak środków. Masz " + saldo + " na koncie.");
        }
    }
}
