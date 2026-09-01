abstract class Bank {
    abstract void getRateOfInterest();
}

class SBI extends Bank {
    void getRateOfInterest() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    void getRateOfInterest() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}

class ICICI extends Bank {
    void getRateOfInterest() {
        System.out.println("ICICI Interest Rate: 6.8%");
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.getRateOfInterest();
        b2.getRateOfInterest();
        b3.getRateOfInterest();
    }
}