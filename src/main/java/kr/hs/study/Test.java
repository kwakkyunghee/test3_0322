package kr.hs.study;

public class Test {
    private int a;
    private int b;
    private int c;

    public Test(int a, int b, int c){
        this.a = 10;
        this.b = 15;
        this.c = 25;
    }
    public void prData(){
        System.out.println(a+b+c);
        System.out.println((a+b+c)/3);
    }
}
