/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.shipment;

/**
 *
 * @author i2wahid
 */
class StandardParcel extends Parcel {
    // sizeTier: S/M/L affects handling
    protected final String sizeTier;

    public StandardParcel(double weightKg, double distanceKm, boolean insured, String sizeTier) {
        super(weightKg, distanceKm, insured);
        if (!sizeTier.matches("[SML]")) {
            throw new IllegalArgumentException("sizeTier must be S, M, or L");
        }
        this.sizeTier = sizeTier;
    }

    @Override
    public double shippingCost() {
        double cost = super.shippingCost();
        double handling= 0;
        //TO DO
        //Write lines of codes that calculates handeling based on sizeTier
        if(sizeTier.equals("S")){
            handling = 0.75;
        }
        else if(sizeTier.equals("M")){
            handling = 1.25;
        }
        else{//if sizeTier.equals("L"):
            handling = 1.75;
        }
        /*
        Switch statments could be used as well, instead of is-else statements:
        switch (sizeTier){
        case "S" : handling = 0.75; break;
        case "M" : handling = 1.25; break;
        case "L" : handling = 1.75; break;
        // no defualt, since sizeTier has to be either "S", "M", or "L"
        */
        return cost + handling; // return the shipping cost based on sizetier as well, already taking into consideration the base cost from the super class, 'Parcel'
    }

}

