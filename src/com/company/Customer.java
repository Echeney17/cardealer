package com.company;

/*
Project: Team Project Design: Car Dealership Create the Java Classes
Purpose Details: Sales Lead Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 02/17/2019
Rev:
*/

public class Customer {
    //---- Data Members ----//

    //Name
    private String First;
    private String Last;

    //Payment
    private float CreditCard;
    private float TradeIn;
    private float Cash;

    //Budget
    private float Max;
    private float Min;

    //Car
    private String New;
    private String Used;

    //---- Method Members ----//

    //--Name--//
    //Setter and Getter for First
    public String getFirst() { return First; }
    public void setFirst(String _First) {this.First = _First;}
    //Setter and Getter for Last
    public String getLast() { return Last; }
    public void setLast(String _Last) {this.Last = _Last;}

    //--Payment--//
    //Setter and Getter for CreditCard
    public float getCreditCard() { return CreditCard; }
    public void setCreditCard(float _CreditCard) {this.CreditCard = _CreditCard;}
    //Setter and Getter for TradeIn
    public float getTradeIn() { return TradeIn; }
    public void setTradeIn(float _TradeIn) {this.TradeIn = _TradeIn;}
    //Setter and Getter for Cash
    public float getCash() { return Cash; }
    public void setCash(float _Cash) {this.Cash = _Cash;}

    //--Budget--//
    //Setter and Getter for Max
    public float getMax() { return Max; }
    public void setMax(float _Max) {this.Max = _Max;}
    //Setter and Getter for Min
    public float getMin() { return Min; }
    public void setMin(float _Min) {this.Min = _Min;}

    //--Car--//
    //Setter and Getter for New
    public String getNew() { return New; }
    public void setNew(String _New) {this.New = _New;}
    //Setter and Getter for Used
    public String getUsed() { return Used; }
    public void setUsed(String _Used) {this.Used = _Used;}

    //Arguments
    public static void main(int[] args) {
        //--Cars--//
        Inventory s1 = new Inventory();
        s1.setSedan(1);
        System.out.println(s1.getSedan());

    }
}
