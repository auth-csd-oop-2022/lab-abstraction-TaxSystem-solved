/**
 * Αυτή η κλάση αναπαριστά έναν τρόπο υπολογισμού φόρου. Ο υπολογισμός του φόρου για τα αυτοκίνητα γίνεται βάση τριών
 * συντελεστών ενός για κάθε ένα από τα 3 χαρακτηριστικά του. Ο τελικός φόρος είναι το άθροισμα των τριών
 * χαρακτηριστικών πολλαπλασιασμένα με τον συντελεστή τους. Για τα σπίτια ο υπολογισμός του φόρου γίνεται αθροίζοντας τα
 * 4 χαρακτηριστικά του κάθε σπιτιού πολλαπλασιασμένα το καθένα με έναν σταθερό συντελεστή 0.25.
 * <p>
 * This class represents a way of calculating the tax. The tax for a car is calculated  based on 3 factors one for each
 * one of its characteristics. The final tax is the sum of those three characteristics multiplied by its factor. The tax
 * for a house is calculated by summing its 4 characteristics each one multiplied by a constant factor 0.25.
 */

public class FixedFactorTax implements Tax {
    private double cubic_capacity_factor;
    private double consumption_factor;
    private double horse_power_factor;

    /**
     * Κατασκευαστής/ Constructor
     *
     * @param factor1 συντελεστής του κυβισμού/ factor for cubic capacity
     * @param factor2 συντελεστής της κατανάλωσης/ factor for consumption
     * @param factor3 συντελεστής της υποδύναμης/ factor for horse power
     */
    public FixedFactorTax(double factor1, double factor2, double factor3) {
        this.cubic_capacity_factor = factor1;
        this.consumption_factor = factor2;
        this.horse_power_factor = factor3;

    }

    /**
     * Επιστρέφει το τελικό ποσό του φόρου για ένα αυτοκίνητο/ Returns the final amount of tax for a car
     */
    @Override
    public double carTax(Car car) {
        return cubic_capacity_factor * car.getCubic_capacity() +
                consumption_factor * car.getConsumption() + horse_power_factor * car.getHorse_power();
    }

    /**
     * Επιστρέφει το τελικό ποσό του φόρου για ένα σπίτι/ Returns the final amount of tax for a house
     */
    @Override
    public double houseTax(House house) {
        return 0.25 * (house.getFloors() + house.getHouse_age() + house.getRooms() + house.getSquare_meters());
    }
}
