package com.inheritance;

public class Pemrograman {
    public String name, tahun;
    Pemrograman(String name){
        this.name = name;
        System.out.println("Telah dibuat object dari class bahasa pemrograman "+ this.name);
    }
    public String getTahunRilis(){
        return this.tahun;
    }
}
class Python extends Pemrograman {
    Python(){
        super("Python");
        this.tahun = "1991";
    }
}
class Java extends Pemrograman {
    Java(){
        super("Java");
        this.tahun = "1995";
    }
}class C extends Pemrograman {
    C(){
        super("C");
        this.tahun = "1978";
    }
}