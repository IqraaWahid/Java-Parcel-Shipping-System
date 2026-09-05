/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.shipment;

/**
 *
 * @author i2wahid
 */

class ExpressParcel extends StandardParcel {
    private final boolean sameDay;

    public ExpressParcel(double weightKg, double distanceKm, boolean insured, String sizeTier, boolean sameDay) {
       super (weightKg, distanceKm, insured, sizeTier); //call superclass constructor
       this.sameDay=sameDay; ///////////////////////////////////////// check if they say yes or no?
    }

    @Override
    public double shippingCost() {
        // Build on Standard cost using super.<method>()
        double cost = super.shippingCost();
        // Express surcharge: faster delivery multiplier + optional same-day fee
        cost *= 1.35; // express speed premium
        //TO DO update cost based on sameDay
        //additional flat fee of $7.50 is added if same-day delivery is requested
        if(sameDay){ // or if(sameDay == true){
            cost=cost+7.50;
        }
        return cost;
    }
}