import java.util.Scanner;
public class pratik {
    public static void main(String[] args) {
            
        Scanner inp = new Scanner(System.in);
        System.out.print("FAKÖRİYEL SAYISI : ");
        int sayi = inp.nextInt();
        int total = 1;
        for(int i =1; i <=sayi; i++){
            total = total * i;
        }
        System.out.println(sayi + " FAKTÖRİYEL : " + total);
    }
    
}