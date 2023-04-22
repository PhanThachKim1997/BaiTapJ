package Module;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = Integer.parseInt(sc.nextLine());
        String Result ="";
        int number=0;
        for (int i=0;i<n;i++){
            System.out.print("Nhập vào số thứ "+(i+1)+": ");
            while (true){
                try{
                    number= Integer.parseInt(sc.nextLine());
                    break;
                }catch(Exception e){
                    System.out.print("Chỉ nhập được số nguyên. Nhập lại: ");
                }
            }
            Result = Result+number+" ";
        }
        System.out.println("Dãy số đã nhập là: "+ Result);
    }
}
