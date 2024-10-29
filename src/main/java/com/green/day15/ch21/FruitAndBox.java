package com.green.day15.ch21;
//p.480
//Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox appleBox = new AppleBox(new Apple());
        OrangeBox orangeBox = new OrangeBox(new Orange());
    }
}

class Apple {
    public String toString() {
        return "사과";
    }
}

class Orange {
    public String toString() {
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;

    AppleBox(Apple ap) {
        this.ap = ap;
    }

    Apple getAp() {
        return ap;
    }
}

class OrangeBox {
    private Orange orange;

    OrangeBox(Orange orange) {
        this.orange = orange;
    }

    Orange getOrange() {
        return orange;
    }
}