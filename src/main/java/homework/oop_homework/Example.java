package homework.oop_homework;
import java.util.Date;


public class Example {
    public static void main(String[] args) {
            Customer customer = new Customer("Agita");
        customer.setMember(false);
        customer.setMemberType("nav biedrs");
        System.out.println("Piemērs apmeklētājam, kurš nav kluba biedrs " + customer.toString());

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(10);
        System.out.println("Apmeklējums " + visit.toString());

        Customer customera = new Customer("Aija");
        customera.setMember(true);
        customera.setMemberType("Premium");
        System.out.println("Piemērs  apmeklētājam, kurš ir Premiumm biedrs " + customera.toString());

        Visit visita = new Visit(customera, new Date());
        visita.setServiceExpense(100);
        visita.setProductExpense(10);
        System.out.println("Apmeklējums " + visita.toString());

        Customer customerb = new Customer("Evita");
        customerb.setMember(true);
        customerb.setMemberType("Gold");
        System.out.println("Piemērs  apmeklētājam, kurš ir Gold biedrs " + customerb.toString());

        Visit visitb = new Visit(customerb, new Date());
        visitb.setServiceExpense(100);
        visitb.setProductExpense(10);
        System.out.println("Apmeklējums " + visitb.toString());

        Customer customerc = new Customer("Jānis");
        customerc.setMember(true);
        customerc.setMemberType("Silver");
        System.out.println("Piemērs  apmeklētājam, kurš ir Silver biedrs " + customerc.toString());

        Visit visitc = new Visit(customerc, new Date());
        visitc.setServiceExpense(100);
        visitc.setProductExpense(10);
        System.out.println("Apmeklējums " + visitc.toString());
    }

}
