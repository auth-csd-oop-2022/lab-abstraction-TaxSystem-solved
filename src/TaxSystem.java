import java.util.ArrayList;
/**
 * To σύστημα πληρωμής φόρων αποτελείται από δύο λίστες μία που περιέχει όλα τα αυτοκίνητα για τα οποία πρέπει
 * να πληρωθεί φόρος και μία για τα σπίτια. Επιπλεον έχει και έναν τρόπο υπολογισμού αυτών των φόρων
 * <p>
 * The tax payment system consists of two lists one for all the cars whose taxes need to be payed and one for
 * the houses. Furthermore it contains a way of calculating those taxes.
 */
public class TaxSystem {
    private ArrayList<Car> cars;
    private ArrayList<House>  houses;
    private Tax tax;

    /**
     * Κατασκευαστής/Constructor
     * @param tax ο τρόπος υπολογισμού των φόρων/ The way of calculating the taxes
     */
    public TaxSystem(Tax tax){
        this.tax=tax;
        cars=new ArrayList<>();
        houses=new ArrayList<>();
    }

    /**
     * Προσθήκη ενος αυτοκινήτου/ add a car
     *
     */
    public void addCar(Car car){
        cars.add(car);
    }

    /**
     * Προσθήκη ενος σπιτιού/ add a house
     *
     */
    public void addHouse(House house){
        houses.add(house);
    }

    public ArrayList<Double> getCarTaxes(){
        ArrayList<Double> carTaxes = new ArrayList<>();
        for (Car car : this.cars) {
            carTaxes.add(this.tax.carTax(car));
        }
        return carTaxes;
    }

    public ArrayList<Double> geHouseTaxes(){
        ArrayList<Double> houseTaxes = new ArrayList<>();
        for (House house : this.houses) {
            houseTaxes.add(this.tax.houseTax(house));
        }
        return houseTaxes;
    }


    public double getTotalTaxes(){
        double total = 0;
        for (Double carTaxes : this.getCarTaxes()) {
            total += carTaxes;
        }
        for (Double houseTaxes: this.geHouseTaxes()){
            total+=houseTaxes;
        }

        return total;
    }


}
