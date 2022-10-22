import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        System.out.println("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch(select){
            case 1 :
                System.out.print("Toplam : " + (number1 + number2));
                break;
            case 2 :
                System.out.print("Çıkarma : " + (number1 - number2));
                break;
            case 3 :
                System.out.print("Çarpma : " + (number1 * number2));
                break;
            case 4 :
                if (number2 != 0){
                    System.out.println(number1 / number2);
                }
                else{
                    System.out.print("Bir sayı 0'a bölünemez!!!");
                }
                break;
            default: {
                System.out.print("Yanlış seçim yaptınız. Böyle bir seçim programda bulunmamaktadır.");
            }
        }

    }
}