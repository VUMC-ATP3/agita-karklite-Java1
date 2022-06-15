package classRoomFive.encapsulation;

public class Rinkis {
    private double radiuss;
    private String krasa;

    public Rinkis() {
        radiuss = 1.0;
        krasa = "sarkana";
    }

    public Rinkis(double radiuss, String krasa) {
        this.radiuss = radiuss;
        this.krasa = krasa;
    }

    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }

    double aprekinatLaukumu(){
        return Math.pow(radiuss, 2) * Math.PI;
    }

}