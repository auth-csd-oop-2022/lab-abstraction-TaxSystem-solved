import java.util.ArrayList;

/**
 * To σύστημα πληρωμής φόρων αποτελείται από δύο λίστες μία που περιέχει όλα τα αυτοκίνητα για τα οποία πρέπει να
 * πληρωθεί φόρος και μία για τα σπίτια. Επιπλέον έχει και έναν τρόπο υπολογισμού αυτών των φόρων
 * <p>
 * The tax payment system consists of two lists one for all the cars whose taxes need to be payed and one for the
 * houses. Furthermore it contains a way of calculating those taxes.
 */
public class TaxSystem {
    private ArrayList<Car> cars;
    private ArrayList<House> houses;
    private Tax tax;

    /**
     * Κατασκευαστής/Constructor
     *
     * @param tax ο τρόπος υπολογισμού των φόρων/ The way of calculating the taxes
     */
    public TaxSystem(Tax tax) {
        this.tax = tax;
        cars = new ArrayList<>();
        houses = new ArrayList<>();
    }

    /**
     * Προσθήκη ενός αυτοκινήτου/ add a car
     */
    public void addCar(Car car) {
        cars.add(car);
    }

    /**
     * Προσθήκη ενός σπιτιού/ add a house
     */
    public void addHouse(House house) {
        houses.add(house);
    }

    /**
     * Υπολογίζει και επιστρέφει μια λίστα με τους τελικούς φόρους για κάθε αυτοκίνητο Computes and returns a list with
     * the final taxes for each car
     */
    public ArrayList<Double> getCarTaxes() {
        ArrayList<Double> carTaxes = new ArrayList<>();
        for (Car car : this.cars) {
            carTaxes.add(this.tax.carTax(car));
        }
        return carTaxes;
    }

    /**
     * Υπολογίζει και επιστρέφει μια λίστα με τoυς τελικούς φόρους για κάθε σπίτι Computes and returns a list with the
     * final taxes for each house
     */
    public ArrayList<Double> geHouseTaxes() {
        ArrayList<Double> houseTaxes = new ArrayList<>();
        for (House house : this.houses) {
            houseTaxes.add(this.tax.houseTax(house));
        }
        return houseTaxes;
    }

    /**
     * Υπολογίζει και επιστρέφει το συνολικό πόσο όλων των φόρων (και για τα αυτοκίνητα και για τα σπίτια). Computes and
     * returns the total amount of taxes (for both the cars and the houses)
     */
    public double getTotalTaxes() {
        double total = 0;
        for (Double carTaxes : this.getCarTaxes()) {
            total += carTaxes;
        }
        for (Double houseTaxes : this.geHouseTaxes()) {
            total += houseTaxes;
        }

        return total;
    }


}
