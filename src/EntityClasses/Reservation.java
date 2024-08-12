/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityClasses;

public class Reservation {
      private Customer customer;
    private Bus bus;
    private int seatIndex;

    public Reservation(Customer customer, Bus bus, int seatIndex) {
        this.customer = customer;
        this.bus = bus;
        this.seatIndex = seatIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bus getBus() {
        return bus;
    }

    public int getSeatIndex() {
        return seatIndex;
    }
}
    

