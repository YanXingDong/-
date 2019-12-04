package test;

public class TestPBLWork {
    public static void main(String[] args) {
        Customer customer = new Customer("ADong");
        customer.addRental(new Rental(new Movie("闫",Movie.REGULAR),2));
        customer.addRental(new Rental(new Movie("兴",Movie.NEW_RELEASE),1));
        customer.addRental(new Rental(new Movie("东",Movie.CHILDRENS),1));
        System.out.println(customer.statement());
    }
}
