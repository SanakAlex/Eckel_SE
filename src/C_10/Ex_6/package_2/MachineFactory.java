package C_10.Ex_6.package_2;

import C_10.Ex_6.package_1.Machine;

public class MachineFactory {

    protected class HeavyMachine implements Machine {
        public HeavyMachine() {
            System.out.println("Heavy machine is created");
        }

        @Override
        public void process() {
            System.out.println("Heavy machine is working");
        }
    }

}
