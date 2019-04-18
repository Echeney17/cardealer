package com.company;

public class SalesPerson {
    //---- Data Members ----//

    //ListenToTheCustomersNeeds
    private String PriceRange;
    private String VehicleType;
    private String Color;
    private String Payment;
    private String Need;

    //CustomerSelectedVehicle
    private String Color;
    private String FitsTheNeed;

    //CheckInvetory
    public String VehicleType;
    public String YearMadeAndModel;
    public float Price;
    public String VehicleColor;

    //Payment
    private float Cash;
    private String Financing;
    private String Leasing;

    //TestDrive
    private String SetATime;


    //---- Method Members ----//

    //--ListenToTheCustomersNeeds--//
    //Setter and Getter for Sedan
    public String getSedan() { return Sedan; }
    public void setSedan(String _Sedan) {this.Sedan = _Sedan;}
    //Setter and Getter for Trucks
    public String getTrucks() { return Trucks; }
    public void setTrucks(String _Trucks) {this.Trucks = _Trucks;}
    //Setter and Getter for Vans
    public String getVans() { return Vans; }
    public void setVans(String _Vans) {this.Vans = _Vans;}
    //Setter and Getter for Hybrid
    public String getHybrid() { return Hybrid; }
    public void setHybrid(String _Hybrid) {this.Hybrid = _Hybrid;}
    //Setter and Getter for Sport
    public String getSport() { return Sport; }
    public void setSport(String _Sport) {this.Sport = _Sport;}

    //--CustomerSelectedVehicle--//
    //Setter and Getter for SparkPlugs
    public String getSparkPlugs() { return SparkPlugs; }
    public void setSparkPlugs(String _SparkPlugs) {this.SparkPlugs = _SparkPlugs;}
    //Setter and Getter for Valves
    public String getValves() { return Valves; }
    public void setValves(String _Valves) {this.Valves = _Valves;}

    //--CheckInvetory--//
    //Setter and Getter for Stringerior
    public String getStringerior() { return Stringerior; }
    public void setStringerior(String _Stringerior) {this.Stringerior = _Stringerior;}
    //Setter and Getter for Exterior
    public String getExterior() { return Exterior; }
    public void setExterior(String _Exterior) {this.Exterior = _Exterior;}
    //Setter and Getter for Lighting
    public String getLighting() { return Lighting; }
    public void setLighting(String _Lighting) {this.Lighting = _Lighting;}
    //Setter and Getter for Towing
    public String getTowing() { return Towing; }
    public void setTowing(String _Towing) {this.Towing = _Towing;}

    //--Payment--//
    //Setter and Getter for Duralast
    public String getDuralast() { return Duralast; }
    public void setDuralast(String _Duralast) {this.Duralast = _Duralast;}
    //Setter and Getter for Odyssey
    public String getOdyssey() { return Odyssey; }
    public void setOdyssey(String _Odyssey) {this.Odyssey = _Odyssey;}
    //Setter and Getter for Optima
    public String getOptima() { return Optima; }
    public void setOptima(String _Optima) {this.Optima = _Optima;}

    //--TestDrive--//
    //Setter and Getter for Goodyear
    public String getGoodyear() { return Goodyear; }
    public void setGoodyear(String _Goodyear) {this.Goodyear = _Goodyear;}

    //Arguments
    public static void main(String[] args) {
        //--ListenToTheCustomersNeeds--//
        Inventory s1 = new Inventory();
        s1.setSedan(1);
        System.out.println(s1.getSedan());

        Inventory s2 = new Inventory();
        s2.setTrucks(1);
        System.out.println(s2.getTrucks());

        Inventory s3 = new Inventory();
        s3.setVans(1);
        System.out.println(s3.getVans());

        Inventory s4 = new Inventory();
        s4.setHybrid(1);
        System.out.println(s4.getHybrid());

        Inventory s5 = new Inventory();
        s5.setSport(1);
        System.out.println(s5.getSport());



    }
}
