
public class Vehicle {

    private Double fuel;

         public Double getFuel() {
            return fuel;
        }

        public void setFuel(Double fuel) {
            this.fuel = fuel;
        }

    private Double mpg;

        public Double getMpg() {
            return mpg;
        }

        public void setMpg(Double mpg) {
            this.mpg = mpg;
        }

    private int currentSpeed;

        public int getCurrentSpeed() {
            return currentSpeed;
           }

         public void setCurrentSpeed(int currentSpeed) {
            this.currentSpeed = currentSpeed;
     }

    private double baseMpg;

        public double getBaseMpg() {
            return baseMpg;
        }

        public void setBaseMpg(double baseMpg) {
            this.baseMpg = baseMpg;
        }

    private double scaleFactor;

        public double getScaleFactor() {
            return scaleFactor;
        }

        public void setScaleFactor(double scaleFactor) {
            this.scaleFactor = scaleFactor;
        }

    public double updateMpg;

        public double getUpdateMpg() {
            updateMpg = baseMpg - scaleFactor * currentSpeed + (0.01*  Math.exp(currentSpeed/20));
            return updateMpg;
        }

        public void setUpdateMpg(double updateMpg) {
            this.updateMpg = updateMpg;
        }




}
