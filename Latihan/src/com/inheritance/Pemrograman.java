package com.inheritance;

public class Pemrograman {
    Pemrograman(String name){
        System.out.println("Ini adalah bahasa pemrograman "+ name);
    }
}
class Python extends Pemrograman {
    Python(){
        super("Python");
    }
}
class Java extends Pemrograman {
    Java(){
        super("Java");
    }
}class C extends Pemrograman {
    C(){
        super("C");
    }
}