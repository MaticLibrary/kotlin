public class Account {
    private String classAccountAccountId;
    private double classAccountBalance;
    private String classAccountUserId;
    private int classAccountTransactionCount = 0; 
    public Account(String classAccountAccountId, double initialBalance, String classAccountUserId) {
        this.classAccountAccountId = classAccountAccountId;
        this.classAccountBalance = initialBalance;
        this.classAccountUserId = classAccountUserId;
    }

    public void displayInformation() {
        System.out.println("=== INFORMACJE O KONCIE ===");
        System.out.println("1. Właściciel: " + classAccountUserId);
        System.out.println("2. Numer konta: " + classAccountAccountId);
        System.out.println("3. Saldo: " + classAccountBalance + " $");
        System.out.println("4. Liczba transakcji: " + classAccountTransactionCount);
        System.out.println("===========================");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            classAccountBalance += amount;
            classAccountTransactionCount++;
            System.out.println(classAccountUserId + " (" + classAccountAccountId + ")");
            System.out.println("Wpłacono: " + amount + " $");
            System.out.println("Nowe saldo: " + classAccountBalance + " $");
        } else {
            System.out.println("Kwota wpłaty musi być dodatnia!");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= classAccountBalance) {
            classAccountBalance -= amount;
            classAccountTransactionCount++;
            System.out.println(classAccountUserId + " (" + classAccountAccountId + ")");
            System.out.println("Wypłacono: " + amount + " $");
            System.out.println("Pozostało: " + classAccountBalance + " $");
            return true;
        } else {
            System.out.println("Błąd: Nie wystarczające środki lub nieprawidłowa kwota!");
            return false;
        }
    }

    public double getBalance() {
        return classAccountBalance;
    }

    public String getAccountId() {
        return classAccountAccountId;
    }

    public String getNameOfUser() {
        return classAccountUserId;
    }

    public int getTransactionCount() {
        return classAccountTransactionCount;
    }
}

--------------------------------------------------------------------
  public class SavingsAccount extends Account {
    private double classSavingsAccountbalanceSavings;
    private double classSavingsAccountInterestRate;

    public SavingsAccount(String classAccountAccountId, double initialBalance, String classAccountUserId, double initialSavingsBalance, double interestRate) {
        super(classAccountAccountId, initialBalance, classAccountUserId);
        this.classSavingsAccountbalanceSavings = initialSavingsBalance;
        this.classSavingsAccountInterestRate = interestRate;
    }

    public void depositIntoSavings(double amount) {
        if (amount > 0) {
            classSavingsAccountbalanceSavings += amount;
            System.out.println(getNameOfUser() + " (" + getAccountId() + ")");
            System.out.println("Wpłacono na oszczędności: " + amount + " $");
            System.out.println("Nowe saldo oszczędności: " + classSavingsAccountbalanceSavings + " $");
        } else {
            System.out.println("Kwota wpłaty na oszczędności musi być dodatnia!");
        }
    }

    public boolean withdrawFromSavings(double amount) {
        if (amount > 0 && amount <= classSavingsAccountbalanceSavings) {
            classSavingsAccountbalanceSavings -= amount;
            System.out.println(getNameOfUser() + " (" + getAccountId() + ")");
            System.out.println("Wypłacono z oszczędności: " + amount + " $");
            System.out.println("Pozostało w oszczędnościach: " + classSavingsAccountbalanceSavings + " $");
            return true;
        } else {
            System.out.println("Błąd: Nie wystarczające środki w oszczędnościach lub nieprawidłowa kwota!");
            return false;
        }
    }

    public void applyInterest() {
        double interest = classSavingsAccountbalanceSavings * classSavingsAccountInterestRate / 100.0;
        classSavingsAccountbalanceSavings += interest;
        System.out.println("Naliczone odsetki: " + interest + " $");
        System.out.println("Saldo oszczędności po odsetkach: " + classSavingsAccountbalanceSavings + " $");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("=== DODATKOWE INFORMACJE O KONCIE OSZCZĘDNOŚCIOWYM ===");
        System.out.println("5. Saldo oszczędności: " + classSavingsAccountbalanceSavings + " $");
        System.out.println("6. Oprocentowanie: " + classSavingsAccountInterestRate + " %");
        System.out.println("=====================================================");
    }


    public double getSavingsBalance() {
        return classSavingsAccountbalanceSavings;
    }

    public double getInterestRate() {
        return classSavingsAccountInterestRate;
    }
}
