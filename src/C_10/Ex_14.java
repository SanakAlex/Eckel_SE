package C_10;

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}


public class Ex_14 {

    DangerousMonster getDangerousMinster() {
        return new DangerousMonster() {
            @Override
            public void menace() {
                System.out.println("Menacing dangerous monster");
            }

            public void destroy() {
                System.out.println("Something is destroyed");
            }
        };
    }

    Vampire getVampire() {
        return new Vampire() {
            @Override
            public void kill() {
                System.out.println("Somebody is dead");
            }

            @Override
            public void destroy() {
                System.out.println("Something is destroyed");
            }

            @Override
            public void menace() {
                System.out.println("Menacing vampire");
            }

            public void drinkBlood() {
                System.out.println("Drinking blood");
            }
        };
    }

    public static void main(String[] args) {
        Ex_14 ex_14 = new Ex_14();
        DangerousMonster dangerousMonster = ex_14.getDangerousMinster();
        dangerousMonster.destroy();
    }
}
