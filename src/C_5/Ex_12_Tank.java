package C_5;

/**
 * Created by Sanak Alex on 22.04.2016.
 */
public class Ex_12_Tank {
    int tank;
    Ex_12_Tank(int tank){
        this.tank = tank;
    }

    Ex_12_Tank fill(int i){
        tank += i;
        return this;
    }

    Ex_12_Tank empty(int i){
        if (tank==0) finalize();
        tank -= i;
        return this;
    }

    public void finalize(){
        if (tank==0){
            System.out.println("Hi! Tank is empty. Clean UP is OK");
        } else if (tank>0){
            System.out.println("Error! Tank is not empty. Clean up is NOT OK");
        }
    }

    public static void main(String[] args) {
        new Ex_12_Tank(1).fill(2).empty(2);
        new Ex_12_Tank(2);
        System.gc();
    }

}
