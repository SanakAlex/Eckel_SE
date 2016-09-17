package C_6;

/**
 * Created by Sanak Alex on 01.05.2016.
 */
public class Ex_6 {
    protected static class ProtectedData{
        protected String data;
        protected ProtectedData(String data){this.data = data;}
        protected String changeData(String s){return this.data += s;}
    }
    public static class WorkWithData extends ProtectedData{
        WorkWithData(String s){
            super(s);
        }
        public void printData(){
            System.out.println(this.data);
        }
        public static void main(String[] args) {
            WorkWithData data = new WorkWithData("Hello");
            data.changeData(" some changes");
            data.printData();
        }
    }
}
