package com.company;

public class SalesLead {
    //---- Data Members ----//

    //Web
    private String Emails;
    private String TrueCar;
    private String CarGurus;
    private String CarMax;
    private String AutoTrader;
    private String Cars;

    //Calls
    private String MaintenanceCheckUp;
    private String FollowUps;
    private String Inquiries;

    //WalkIns
    private String TestDrive;
    private String ContactInformation;

    //References
    private String Referrals;
    private String CarShows;

    //Mail
    private String PreApprovedOffer;
    private String LeaseOffers;
    private String TradeInOffer;

    //---- Method Members ----//

    //--Web--//
    //Setter and Getter for Emails
    public String getEmails() { return Emails; }
    public void setEmails(String _Emails) {this.Emails = _Emails;}
    //Setter and Getter for TrueCar
    public String getTrueCar() { return TrueCar; }
    public void setTrueCar(String _TrueCar) {this.TrueCar = _TrueCar;}
    //Setter and Getter for CarGurus
    public String getCarGurus() { return CarGurus; }
    public void setCarGurus(String _CarGurus) {this.CarGurus = _CarGurus;}
    //Setter and Getter for CarMax
    public String getCarMax() { return CarMax; }
    public void setCarMax(String _CarMax) {this.CarMax = _CarMax;}
    //Setter and Getter for AutoTrader
    public String getAutoTrader() { return AutoTrader; }
    public void setAutoTrader(String _AutoTrader) {this.AutoTrader = _AutoTrader;}
    //Setter and Getter for Cars
    public String getCars() { return Cars; }
    public void setCars(String _Cars) {this.Cars = _Cars;}

    //--Calls--//
    //Setter and Getter for MaintenanceCheckUp
    public String getMaintenanceCheckUp() { return MaintenanceCheckUp; }
    public void setMaintenanceCheckUp(String _MaintenanceCheckUp) {this.MaintenanceCheckUp = _MaintenanceCheckUp;}
    //Setter and Getter for FollowUps
    public String getFollowUps() { return FollowUps; }
    public void setFollowUps(String _FollowUps) {this.FollowUps = _FollowUps;}
    //Setter and Getter for Inquiries
    public String getInquiries() { return Inquiries; }
    public void setInquiries(String _Inquiries) {this.Inquiries = _Inquiries;}

    //--WalkIns--//
    //Setter and Getter for TestDrive
    public String getTestDrive() { return TestDrive; }
    public void setTestDrive(String _TestDrive) {this.TestDrive = _TestDrive;}
    //Setter and Getter for ContactInformation
    public String getContactInformation() { return ContactInformation; }
    public void setContactInformation(String _ContactInformation) {this.ContactInformation = _ContactInformation;}

    //--References--//
    //Setter and Getter for Referrals
    public String getReferrals() { return Referrals; }
    public void setReferrals(String _Referrals) {this.Referrals = _Referrals;}
    //Setter and Getter for CarShows
    public String getCarShows() { return CarShows; }
    public void setCarShows(String _CarShows) {this.CarShows = _CarShows;}

    //--Mail--//
    //Setter and Getter for PreApprovedOffer
    public String getPreApprovedOffer() { return PreApprovedOffer; }
    public void setPreApprovedOffer(String _PreApprovedOffer) {this.PreApprovedOffer = _PreApprovedOffer;}
    //Setter and Getter for LeaseOffers
    public String getLeaseOffers() { return LeaseOffers; }
    public void setLeaseOffers(String _LeaseOffers) {this.LeaseOffers = _LeaseOffers;}
    //Setter and Getter for TradeInOffer
    public String getTradeInOffer() { return TradeInOffer; }
    public void setTradeInOffer(String _TradeInOffer) {this.TradeInOffer = _TradeInOffer;}

    //Arguments
    public static void main(String[] args) {
        //--Web--//
        SalesLead s1 = new SalesLead();
        s1.setEmails("This is a String");
        System.out.println(s1.getEmails());

        SalesLead s2 = new SalesLead();
        s2.setTrueCar("This is a String");
        System.out.println(s2.getTrueCar());

        SalesLead s3 = new SalesLead();
        s3.setCarGurus("This is a String");
        System.out.println(s3.getCarGurus());

        SalesLead s4 = new SalesLead();
        s4.setCarMax("This is a String");
        System.out.println(s4.getCarMax());

        SalesLead s5 = new SalesLead();
        s5.setAutoTrader("This is a String");
        System.out.println(s5.getAutoTrader());

        SalesLead s6 = new SalesLead();
        s6.setCars("This is a String");
        System.out.println(s6.getCars());

        //--Calls--//
        SalesLead s7 = new SalesLead();
        s7.setMaintenanceCheckUp("This is a String");
        System.out.println(s7.getMaintenanceCheckUp());

        SalesLead s8 = new SalesLead();
        s8.setFollowUps("This is a String");
        System.out.println(s8.getFollowUps());

        SalesLead s9 = new SalesLead();
        s9.setInquiries("This is a String");
        System.out.println(s9.getInquiries());

        //--WalkIns--//
        SalesLead s10 = new SalesLead();
        s10.setTestDrive("This is a String");
        System.out.println(s10.getTestDrive());

        SalesLead s11 = new SalesLead();
        s11.setContactInformation("This is a String");
        System.out.println(s11.getContactInformation());

        //--References--//
        SalesLead s12 = new SalesLead();
        s12.setReferrals("This is a String");
        System.out.println(s12.getReferrals());

        SalesLead s13 = new SalesLead();
        s13.setCarShows("This is a String");
        System.out.println(s13.getCarShows());

        //--Mail--//
        SalesLead s14 = new SalesLead();
        s14.setPreApprovedOffer("This is a String");
        System.out.println(s14.getPreApprovedOffer());

        SalesLead s15 = new SalesLead();
        s15.setLeaseOffers("This is a String");
        System.out.println(s15.getLeaseOffers());

        SalesLead s16 = new SalesLead();
        s16.setTradeInOffer("This is a String");
        System.out.println(s16.getTradeInOffer());
    }
}
