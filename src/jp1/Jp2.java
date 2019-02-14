package jp1;

public class Jp2 {
    public static void main(String[] args) {
        String imie="Jessica";
        String nazwisko="Kowalska";
        String stanowsko="Spawacz";
        char plec='K';
        final String PESEL = "90021101211";
        double salary_net=4554.99;
        boolean isRetired=false;
        System.out.println(imie+";"+nazwisko+";"+stanowsko+";"+PESEL+";"+salary_net+";"+isRetired);
        System.out.printf("%10s | %s | %s | %s | %15s | %8.2fzl | %b", imie, nazwisko, stanowsko, plec, PESEL, salary_net, isRetired);
    }
}
