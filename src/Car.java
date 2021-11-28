/**
 * Αυτή η κλάση αναπαριστά ένα αυτοκίνητο. Κάθε αυτοκίνητο έχει έναν ακέραιο αριθμό που δηλώνει τον κυβισμό του έναν
 * αριθμό που δηλώνει την κατανάλωση του σε λίτρα/100 χιλιόμετρα και έναν αριθμό που δηλώνει την ιπποδύναμη του
 * <p>
 * This class represents a car. Each car has a number that represents its cubic capacity, another one for its fuel
 * consumption in liters/100 km and a final number representing its horse power
 */

public class Car {
    private int cubic_capacity;
    private double consumption;
    private int horse_power;

    /**
     * Κατασκευαστής/Constructor
     */
    public Car(int cubic_capacity, double consumption, int horse_power) {
        this.cubic_capacity = cubic_capacity;
        this.consumption = consumption;
        this.horse_power = horse_power;
    }

    public int getCubic_capacity() {
        return this.cubic_capacity;

    }

    public double getConsumption() {

        return this.consumption;
    }

    public int getHorse_power() {

        return this.horse_power;
    }

    /**
     * H μέθοδος αυτή επιστρέφει αν το αυτοκίνητο είναι πολυτελές ή οχι. Ένα αυτοκίνητο θεωρείται πολυτελές αν ο
     * κυβισμός του είναι μεγαλύτερος ή ίσος του 2000. This method returns if a car is luxurious or not. A car is
     * considered luxurious if its cubic capacity is higher than or equal to 2000.
     *
     * @return True αν είναι πολυτελές αλλιώς False/ True if Luxurious else False
     */
    public boolean isLuxurious() {
        return (this.cubic_capacity >= 2000);
    }
}