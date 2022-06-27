package homework.oop_homework;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
    }

    public String getName(){
        return this.customer.getName();
    }


    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double totalServiceExpense(){
        return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate(this.customer.getMemberType()));
    }

    public double totalProductExpense(){
        return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate(this.customer.getMemberType()));
    }

    public double getTotalExpense() {
        if (this.customer != null) {
            return totalProductExpense() + totalServiceExpense();
        }

        return 0.0;
    }



    public String toString() {
        if (this.customer != null) {
            return "Visit(" + this.date + ", " + this.customer.toString() + ", " + this.serviceExpense + ", " + this.productExpense + ", " + this.getTotalExpense() + ")";
        }

        return "";
    }
}
