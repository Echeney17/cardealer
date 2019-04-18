package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
Project: Car Inventory
Feature: A list of dealership inventory
Course: IST 242
Author: Evan Cheney
Date Developed: 2/28/2019
Last Date Changed: 4/17/2019
Rev: development build 2
 */




public class Inventory {
    //---- Data Members ----//

    //Cars
    public int Sedan;
    public int Trucks;
    public int Vans;
    public int Hybrid;
    public int Sport;

    //Engines
    private int SparkPlugs;
    private int Valves;
    private int Pistons;
    private int PistonRings;
    private int ConnectingRods;

    //Accessories
    private int Interior;
    private int Exterior;
    private int Lighting;
    private int Towing;

    //Batteries
    private int Duralast;
    private int Odyssey;
    private int Optima;

    //Tires
    private int Goodyear;
    private int Firesone;
    private int Bridgesone;
    private int Michelin;

    //Brakes
    private int Pads;
    private int RotorsCalipers;

    //---- Method Members ----//

    //--Cars--//
    //Setter and Getter for Sedan
    public int getSedan() { return Sedan; }
    public void setSedan(int _Sedan) {this.Sedan = _Sedan;}
    //Setter and Getter for Trucks
    public int getTrucks() { return Trucks; }
    public void setTrucks(int _Trucks) {this.Trucks = _Trucks;}
    //Setter and Getter for Vans
    public int getVans() { return Vans; }
    public void setVans(int _Vans) {this.Vans = _Vans;}
    //Setter and Getter for Hybrid
    public int getHybrid() { return Hybrid; }
    public void setHybrid(int _Hybrid) {this.Hybrid = _Hybrid;}
    //Setter and Getter for Sport
    public int getSport() { return Sport; }
    public void setSport(int _Sport) {this.Sport = _Sport;}

    //--Engines--//
    //Setter and Getter for SparkPlugs
    public int getSparkPlugs() { return SparkPlugs; }
    public void setSparkPlugs(int _SparkPlugs) {this.SparkPlugs = _SparkPlugs;}
    //Setter and Getter for Valves
    public int getValves() { return Valves; }
    public void setValves(int _Valves) {this.Valves = _Valves;}
    //Setter and Getter for Inquiries
    public int getPistons() { return Pistons; }
    public void setPistons(int _Pistons) {this.Pistons = _Pistons;}
    //Setter and Getter for PistonRings
    public int getPistonRings() { return PistonRings; }
    public void setPistonRings(int _PistonRings) {this.PistonRings = _PistonRings;}
    //Setter and Getter for ContactInformation
    public int getConnectingRods() { return ConnectingRods; }
    public void setConnectingRods(int _ConnectingRods) {this.ConnectingRods = _ConnectingRods;}

    //--Accessories--//
    //Setter and Getter for Interior
    public int getInterior() { return Interior; }
    public void setInterior(int _Interior) {this.Interior = _Interior;}
    //Setter and Getter for Exterior
    public int getExterior() { return Exterior; }
    public void setExterior(int _Exterior) {this.Exterior = _Exterior;}
    //Setter and Getter for Lighting
    public int getLighting() { return Lighting; }
    public void setLighting(int _Lighting) {this.Lighting = _Lighting;}
    //Setter and Getter for Towing
    public int getTowing() { return Towing; }
    public void setTowing(int _Towing) {this.Towing = _Towing;}

    //--Batteries--//
    //Setter and Getter for Duralast
    public int getDuralast() { return Duralast; }
    public void setDuralast(int _Duralast) {this.Duralast = _Duralast;}
    //Setter and Getter for Odyssey
    public int getOdyssey() { return Odyssey; }
    public void setOdyssey(int _Odyssey) {this.Odyssey = _Odyssey;}
    //Setter and Getter for Optima
    public int getOptima() { return Optima; }
    public void setOptima(int _Optima) {this.Optima = _Optima;}

    //--Tires--//
    //Setter and Getter for Goodyear
    public int getGoodyear() { return Goodyear; }
    public void setGoodyear(int _Goodyear) {this.Goodyear = _Goodyear;}
    //Setter and Getter for Firesone
    public int getFiresone() { return Firesone; }
    public void setFiresone(int _Firesone) {this.Firesone = _Firesone;}
    //Setter and Getter for Bridgesone
    public int getBridgesone() { return Bridgesone; }
    public void setBridgesone(int _Bridgesone) {this.Bridgesone = _Bridgesone;}
    //Setter and Getter for Michelin
    public int getMichelin() { return Michelin; }
    public void setMichelin(int _Michelin) {this.Michelin = _Michelin;}

    //--Brakes--//
    //Setter and Getter for Pads
    public int getPads() { return Pads; }
    public void setPads(int _Pads) {this.Pads = _Pads;}
    //Setter and Getter for RotorsCalipers
    public int getRotorsCalipers() { return RotorsCalipers; }
    public void setRotorsCalipers(int _RotorsCalipers) {this.RotorsCalipers = _RotorsCalipers;}

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

    public static void listInventory(ArrayList<Inventory>, mList);
        for (Inventory inventory: mList){
            System.out.println(inventory.getInventory());
        }

        /*
public Inventory addInventory(){
        Inventory inv = new Inventory(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Inventory" : ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
 */
    }
}
