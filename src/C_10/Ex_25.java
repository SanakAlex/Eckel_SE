package C_10;

class GreenhouseControlsWithWetting extends GreenhouseControls {
    private boolean wetting = false;
    public class WettingOn extends Event {

        public WettingOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wetting = true;
        }

        @Override
        public String toString() {
            return "Wetting is on";
        }
    }

    public class WettingOff extends Event {

        public WettingOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wetting = true;
        }

        @Override
        public String toString() {
            return "Wetting is off";
        }
    }
}

public class Ex_25 {
    public static void main(String[] args) {
        GreenhouseControlsWithWetting gc = new GreenhouseControlsWithWetting();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new VentilationOn(1500)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
