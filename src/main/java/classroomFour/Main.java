package classroomFour;


public class Main {
    public static void main(String[] args) {
        House majaViens = new House(4, true, false, "zaļa", "Brīvības", 21);
        majaViens.printHouse();
        House majaDivi = new House(55, false, true, "zila", "Stabu", 99);
//        majaDivi.stavuSkaits = 6;
//        majaDivi.majasNumurs = 52;
//        majaDivi.ielasNosaukums = "Valdemāra iela";
//        majaDivi.irLifts = true;
//        majaDivi.irAutoStavvieta = true;
//        majaDivi.krasa = "brūnā";
        majaDivi.printHouse();

        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        zzk.printetAtrumu();
        System.out.println("Cilveks uzkapj uz velosipeda un min pedalus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("Priekšā izlec kakis");
        zzk.bremzet();
        zzk.bremzet();
        zzk.printetAtrumu();
        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();
        Automasina viens = new Automasina();
        viens.atrumkarba = 'A';
        viens.durvjuSkaits = 5;
        viens.marka = "bmw";
        viens.vietas = 7;


        Rinkis mansRinkis = new Rinkis(5);
        System.out.println(mansRinkis.PI);
        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkis2 = new Rinkis();
        System.out.println(mansRinkis2.PI);
        mansRinkis2.radiuss = 50;
        System.out.println(mansRinkis2.radiuss);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinaRinkaLiniju());
        mansRinkis.printCreatedTime();
        mansRinkis2.printCreatedTime();

        Rinkis mansRinkis3 = new Rinkis(12.3);

        Taisnsturis taisnsturisViens = new Taisnsturis(12.4, 34.32);
        System.out.println(taisnsturisViens.aprekinatLaukumu());

        Suns reksis = new Suns();
        reksis.name = "Dingo";
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        reksis.printName();
        reksis.izdodSkanu();

        Animal dzivnieks = new Animal();
        dzivnieks.izdodSkanu();


    }
}
