package C_5;

/**
 * Created by Sanak Alex on 21.04.2016.
 */
public class Ex_9 {
    int i;
    String s;
    Ex_9(int i){
        this.i = i;
    }
    Ex_9(int i, String s){
        this(i);
        this.s = s;
    }

    void print(){
        System.out.println("i="+this.i+" s:"+this.s);
    }

    public static void main(String[] args) {
        new Ex_9(9,"Hello").print();
    }
}
