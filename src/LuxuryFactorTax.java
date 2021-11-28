/**
 * Αυτή η κλάση αναπαριστά έναν τρόπο υπολογισμού φόρου. Ο υπολογισμός του φόρου για τα αυτοκίνητα γίνεται βάση τριών
 * συντελεστών ενός για κάθε ένα από τα 3 χαρακτηριστικά του. Ο τελικός φόρος είναι το άθροισμα των τριών
 * χαρακτηριστικών πολλαπλασιασμένα με τον συντελεστή τους. Επιπλέον, αν το αυτοκίνητο είναι πολυτελές προστίθεται μια
 * επιπλέον σταθερή χρέωση πολυτελείας. Για τα σπίτια ο υπολογισμός του φόρου γίνεται αθροίζοντας τα 4 χαρακτηριστικά
 * του κάθε σπιτιού πολλαπλασιασμένα το καθένα με έναν σταθερό συντελεστή 0.25. Επιπλέον, αν το σπίτι είναι πολυτελές
 * προστίθεται δύο φορές η σταθερή χρέωση πολυτελείας.
 * <p>
 * This class represents a way of calculating the tax. The tax for a car is calculated based on 3 factors one for each
 * one of its characteristics. The final tax is the sum of those three characteristics multiplied by its factor. If the
 * car is luxurious a constant luxury factor is added. The tax for a house is calculated by summing its 4
 * characteristics each one multiplied by a constant factor 0.25. If the house is luxurious the constant luxury factor
 * is added 2 times.
 */

public class LuxuryFactorTax implements Tax {
    private double cubic_capacity_factor;
    private double consumption_factor;
    private double horse_power_factor;
    private double luxury_factor;

    /**
     * Κατασκευαστής/constructor
     *
     * @param factor1       συντελεστής του κυβισμού/ factor for cubic capacity
     * @param factor2       συντελεστής της κατανάλωσης/ factor for consumption
     * @param factor3       συντελεστής της υποδύναμης/ factor for horse power
     * @param luxury_factor Επιπλέον χρέωση πολυτελείας/ extra luxury factor
     */
    public LuxuryFactorTax(double factor1, double factor2, double factor3, double luxury_factor) {
        this.cubic_capacity_factor = factor1;
        this.consumption_factor = factor2;
        this.horse_power_factor = factor3;
        this.luxury_factor = luxury_factor;
    }

    @Override
    public double carTax(Car car) {
        double tax = cubic_capacity_factor * car.getCubic_capacity() +
                consumption_factor * car.getConsumption() + horse_power_factor * car.getHorse_power();
        if (car.isLuxurious()) {
            tax += luxury_factor;
        }
        return tax;
    }

    @Override
    public double houseTax(House house) {
        double tax = 0.25 * (house.getFloors() + house.getHouse_age() + house.getRooms() + house.getSquare_meters());
        if (house.isLuxurious()) {
            tax += (2 * luxury_factor);
        }
        return tax;
    }
}
