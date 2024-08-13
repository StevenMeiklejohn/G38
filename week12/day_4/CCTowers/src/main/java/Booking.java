public class Booking {

    private Bedroom bedroom;
    private int noOfNights;

    public Booking(Bedroom bedroom, int noOfNights) {
        this.bedroom = bedroom;
        this.noOfNights = noOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(int noOfNights) {
        this.noOfNights = noOfNights;
    }

    public double getTotalBill(){
        return this.bedroom.getNightlyRate() * this.noOfNights;
    }
}
