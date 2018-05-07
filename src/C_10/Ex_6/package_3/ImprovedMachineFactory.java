package C_10.Ex_6.package_3;

import C_10.Ex_6.package_1.Machine;
import C_10.Ex_6.package_2.MachineFactory;

public class ImprovedMachineFactory extends MachineFactory {
    public Machine getMachine() {
        return new HeavyMachine();
    }
}
