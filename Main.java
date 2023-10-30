class calculator{
    double angka1,angka2;
    public double kurang(double angka1,double angka2){
        return angka1+angka2;
    }
    public double bagi(double angka1,double angka2){
        return angka1*angka2;
    }

    void tampil(){
        System.out.println("Hasil pengurangan: " + kurang(10,5));
        System.out.println("Hasil pembagian: " + bagi(10,5));

    }
}



public class Main {
    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.tampil();
    }
}