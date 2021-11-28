/**
 * Οι πληρωμές φόρων για αυτοκίνητα και ακίνητα διεκπεραιώνονται από ένα σύστημα πληρωμής φόρων. Υπάρχουν δύο
 * διαφορετικοί τρόποι υπολογισμού φόρων αυτοί με την σταθερή χρέωση βάση ενός συντελεστή για κάθε χαρακτηριστικό του
 * αυτοκινήτου/ακινήτου (FixedFactorTax) και αυτοί που λαμβάνουν επιπλέον υπόψη το αν το αυτοκίνητο/ακίνητο είναι
 * πολυτελές (LuxuryFactorTax). Τροποποιήστε κατάλληλα το παρακάτω κομμάτι κώδικα ώστε να υλοποιεί ένα interface που να
 * αναπαριστά ένα τρόπο υπολογισμού φόρου. Κάθε τρόπος υπολογισμού έχει μεθόδους για τον υπολογισμό του φόρου για ένα
 * αυτοκίνητο και για ένα σπίτι.
 * <p>
 * Tax payment for cars and houses is done by a Tax payment system. There are two ways of calculating the tax. The first
 * one is based on a fixed amount calculated by taking account a factor for each one of the car's or house's
 * characteristics (FixedFactorTax) while the second one also takes into account if the car or house is
 * luxurious(LuxuryFactorTax). Modify the following piece of code to implement an interface that represents a way of
 * calculating the Tax. Each way of calculation has two methods one for calculating the tax for a car and one for
 * calculating the tax for a house
 */

public interface Tax {
    double carTax(Car car);

    double houseTax(House house);
}
