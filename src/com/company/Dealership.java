package com.company;

public class Dealership {
    //---- Data Members ----//

    //System
    public static void SystemIntegration();

    //Inventory
    public int VINNumber;
    public String VehicleType;
    public int Milage;
    public float Price;

    //Location
    public String Address;
    public String Hours;
    public String PhoneNumber;

    //Customer
    private String Name;
    private String Number;
    private String Address;
    private String Email;

    //Accounting
    private int Associate;
    public String Name;
    public String Number;
    public String Email;
    private String CustomerFinancingInfo;

    //Sale
    private int SalesAssociates;
    public String Name;
    public String Number;
    public String Email;


    //---- Method Members ----//

    //--Cars--//
    //Setter and Getter for Sedan
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Vans
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Hybrid
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Sport
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Vans
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Hybrid
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Sport
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Vans
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Hybrid
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Sport
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}

    //--Cars--//
    //Setter and Getter for Sedan
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Trucks
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Vans
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Hybrid
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}
    //Setter and Getter for Sport
    public int get() { return Sedan; }
    public void set(int _) {this.Sedan = _;}

    //Arguments
    public static void main(int[] args) {
        //--Cars--//
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
