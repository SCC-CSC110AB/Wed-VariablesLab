package wed.variableslab;

/**
 * Wednesday's in-class variable lab code
 * @author johnhaley81
 */
public class WedVariablesLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bossSalary;
        short cookSalary;
        double bossPayPeriod;
        int cookPayPeriod;
        boolean bossIsAJerk; // Just like the teacher??? :P
        
        bossSalary = 120196;
        cookSalary = 20196;
        bossPayPeriod = 52.0;
        cookPayPeriod = 52;
        bossIsAJerk = true;
        
        System.out.println("Boss's Salary is " + bossSalary);
        System.out.println("Cook's Salary is " + cookSalary);
        System.out.println("It is " + bossIsAJerk + " that the " + 
                "boss is a jerk.");
        System.out.println("The Boss's paycheck is " +
                bossSalary / bossPayPeriod);
        System.out.println("The Cook's paycheck is " +
                cookSalary / cookPayPeriod);
        
        cookSalary = (short) bossSalary;
        System.out.println(cookSalary);
    }
    
}
