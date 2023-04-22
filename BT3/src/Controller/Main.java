package Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khởi tạo và nhập mảng
        int n;
        while(true){
            try{
                System.out.print("Nhập vào số phần tử mảng A cần tính TBC các số chia hết cho 3: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Chỉ được nhập số thực. Nhập lại!!!");
            }
        }
        Double A[] = new Double[n];
        for (int i=0;i<n;i++){
            while (true){
                try {
                    System.out.printf("Nhập phần tử thứ "+(i+1)+" của mảng: ");
                    A[i]= Double.parseDouble(sc.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Chỉ được nhập số nguyên. Nhập lại!!!");
                }
            }
        }
        //Kiểm tra số chia hết cho 3 trong mảng và tính tổng các số
        Double Sum=0.0;
        int Dem=0;
        for(int j=0;j<A.length;j++){
            if(A[j]%3==0){
                Sum+=A[j];
                Dem+=1;
            }
        }
        //Tính trung bình cộng và in kết quả
        if(Dem==0){
            System.out.println("Mảng không có phần tử chia hết cho 3!!");
        }else {
            Double Ave =  Sum/ Dem;
            System.out.println("Trung bình cộng các số chia hết cho 3 là: "+Ave);
        }
    }
}
