package C_9;

interface RodentI {
    abstract void dispose();
}

class MouseImpl implements RodentI {
    MouseImpl() {
        System.out.println("Mouse()");
    }
    public String toString(){
        return "MouseImpl";
    }

    @Override
    public void dispose() {
        System.out.println("dispose " + this);
    }
}

class HamsterImpl implements RodentI {
    public String toString() {
        return "HamsterImpl";
    }
    @Override
    public void dispose() {
        System.out.println("dispose " + this);
    }
}

public class Ex_7 {
    public static void main(String[] args) {
        HamsterImpl hamster = new HamsterImpl();
        hamster.dispose();
    }
}
