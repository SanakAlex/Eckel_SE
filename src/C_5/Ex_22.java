package C_5;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_22 {
    Ex_21.Money money;
    Ex_22 (Ex_21.Money money){ this.money = money;}
    public void description(){
        System.out.print("It's ");
        switch (money){
            case USD:
                System.out.println("a dollar");
                break;
            case EUR:
                System.out.println("an euro");
                break;
            case HRN:
                System.out.println("an ukrainian hrivna :-)");
                break;
            case LB:
                System.out.println("a puond");
                break;
            case RUB:
                System.out.println("a ruble BYEEEEE");
                break;
            default:
                System.out.println("something else");
        }
    }

    public static void main(String[] args) {
        Ex_22 usd = new Ex_22(Ex_21.Money.USD);
        usd.description();
        Ex_22 rub = new Ex_22(Ex_21.Money.RUB);
        rub.description();
        Ex_22 hrn = new Ex_22(Ex_21.Money.HRN);
        hrn.description();
    }
}
