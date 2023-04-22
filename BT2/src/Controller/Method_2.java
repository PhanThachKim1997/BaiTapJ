package Controller;

import java.util.Scanner;

public class Method_2 {
    public static Double TBC(Double []mang){
        int sum =0;
        for (double num : mang){
            sum+=num;
        }
        return (double)sum/mang.length;
    }

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
        System.out.println("Trung bình cộng là: "+TBC(Ave));

    }
}
