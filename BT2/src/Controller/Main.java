package Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử cần tính trung bình: ");
        int n;
        while (true) {
            try{
                n = Integer.parseInt(sc.nextLine());;
                break;
            }catch(Exception e){
                System.out.printf("Chỉ được nhập số. Nhập lại: ");
            }
        }
        //Nhập mảng
        Double[] Ave = new Double[n];
        for(int i =0;i<n;i++){
            while(true){
                try{
                    System.out.printf("Nhập vào phân tử thứ "+(i+1)+": ");
                    Ave[i] = Double.parseDouble(sc.nextLine());
                    break;
                }
                catch(Exception e){
                    System.out.printf("Chỉ được nhập số thực!!! Vui lòng nhập lại!!!\n");
                }
            }
        }
        //Tính tổng
        Double Sum= 0.0;
        for(int j=0;j<Ave.length;j++){
            Sum += Ave[j];
        }
        //Tính TBC
        Double Result = Sum/Ave.length;
        System.out.println("Trung bình cộng các số trên là: "+Result);
    }
}
