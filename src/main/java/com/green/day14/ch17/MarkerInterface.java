package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
        Report0 report0 = new Report0("Simple Funny News~");
        Report1 report1 = new Report1();
        Report2 report2 = new Report2();
        Report3 report3 = new Report3();

        //Printer 클래스 아래에 있는 printContents 메소드 호출
        //호출할 때 r0의 주소값을 보내주세요.
        Printer printer = new Printer();
        printer.printContents(report0);
        printer.printContents(report1);
        printer.printContents(report2);
        printer.printContents(report3);
    }
}

interface Printable2 {
    String getContents();
}
interface Upper {}
interface Lower {}

class Report0 implements Printable2 {
    private String contents;

    Report0(String contents) {
        this.contents = contents;
    }

    @Override
    public String getContents() {
        return contents;
    }
}

class Report1 implements Printable2, Lower {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report2 implements Printable2, Upper {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Report3 implements Printable2, Upper, Lower {
    public String getContents() {
        return "Simple Funny News~";
    }
}

class Printer {
    public void printContents(Printable2 doc) {
        if(doc instanceof Upper) {
            System.out.println(doc.getContents().toUpperCase());
        } else if (doc instanceof Lower) {
            System.out.println(doc.getContents().toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}