package ct5;

import java.util.Scanner;
class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    protected int getColor() {
        return color;
    }
}

class IPTV extends ColorTV{
    private String address;
    public IPTV(String address, int size, int color){
        super(size, color);
        this.address = address;
    }
    public void printProperty() {
        System.out.println("나의 IPTV는 " + address + " " + getSize() + "인치 " + getColor() + "컬러");
    }
}
public class No2 {
    public static void main(String[] args) {
        IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
        myTV.printProperty();
    }
}