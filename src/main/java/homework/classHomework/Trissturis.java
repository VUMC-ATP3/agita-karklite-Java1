package homework.classHomework;

public class Trissturis {

        double mala1;
        double mala2;
        double mala3;
        public double laukums;
        double pusperimetrs;

    public Trissturis() {
        System.out.println("Veidojam trisstūri");
    }
    public Trissturis(double mala1, double mala2, double mala3) {
        this.mala1 = mala1;
        this.mala2 = mala2;
        this.mala3 = mala3;

    }

        public double aprekinatTrissturaLaukumu(){
            pusperimetrs = (mala1+mala2+mala3)/2;
            laukums = Math.sqrt(pusperimetrs*(pusperimetrs-mala1)*(pusperimetrs-mala2)*(pusperimetrs-mala3));
            return (laukums);

        }
        public boolean vienadmalu(){
            if((mala1 == mala2) && (mala1 == mala3)){
                return true;
            }else {
                return false;
            }
        }

        public boolean vienadsanu() {
            if (mala1 == mala2 || mala1 == mala3 || mala2 == mala3) {
                return true;
            } else {
                return false;
            }
        }

    }
