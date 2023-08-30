import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinasyon Hesaplama");
        Scanner imp = new Scanner(System.in);
        System.out.print("Kümenin Eleman sayısını giriniz : ");
        int n= imp.nextInt();
        System.out.print("Alt Kümenin Eleman sayısını giriniz : ");
        int r= imp.nextInt();
        int total,total1=1,total2=1,total3=1;
        for (int i = 1; i <= n; i++) {
            total1*= i;
        } for (int i = 1; i <= r; i++) {
            total2*= i;
        } for (int i = 1; i <= (n-r); i++) {
            total3*= i;
        }total=total1/(total2*total3);
        System.out.println("C("+n+","+r+") Kombinasyonu : " +total);
    }
}