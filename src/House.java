/**
 * Αυτή η κλάση αναπαριστά ένα σπίτι. Κάθε σπίτι έχει το μέγεθος του σε τετραγωνικά μέτρα, το αριθμό των ορόφων του, τον
 * αριθμό των δωματίων του και την ηλικία του σε χρόνια
 * <p>
 * This class represents a house. Each house has its size in square meters, the number of floors, the number of rooms
 * and the age of the house in years
 */

public class House {
    private double square_meters;
    private int floors;
    private int rooms;
    private int house_age;

    /**
     * Κατασκευαστής/Constructor
     */
    public House(double square_meters, int floors, int rooms, int house_age) {
        this.square_meters = square_meters;
        this.floors = floors;
        this.rooms = rooms;
        this.house_age = house_age;
    }

    public double getSquare_meters() {

        return this.square_meters;
    }

    public int getFloors() {

        return this.floors;
    }

    public int getRooms() {

        return this.rooms;
    }

    public int getHouse_age() {

        return this.house_age;
    }

    /**
     * Η μέθοδος αυτή επιστρέφει αν ένα σπίτι είναι πολυτελές ή οχι. Ένα σπίτι θεωρείται πολυτελές αν ο αριθμός δωματίων
     * του είναι μεγαλύτερος ή ίσος του 8. This method returns if a house is luxurious or not. A house is considered
     * luxurious if the number of rooms is higher than or equal to 8.
     *
     * @return True αν το σπίτι είναι πολυτελές False αν όχι/ True if the house is luxurious, False if not
     */
    public boolean isLuxurious() {

        return (this.rooms >= 8);
    }

}
