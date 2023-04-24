package Controller;

import Model.myDate;

public class Main {
    public static void main(String[] args) {
        myDate md = new myDate(24,01,1997);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDate();
    }
}
