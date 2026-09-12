import java.util.*;

class InsurancePolicy {
    protected double baseAmount;

    InsurancePolicy(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    double calculatePremium() {
        return baseAmount;
    }
}

class HealthPolicy extends InsurancePolicy {
    private int age;
    private int preExistingConditionsCount;

    HealthPolicy(double baseAmount, int age, int preExistingConditionsCount) {
        super(baseAmount);
        this.age = age;
        this.preExistingConditionsCount = preExistingConditionsCount;
    }

    @Override
    double calculatePremium() {
        return baseAmount + (age * 10)
                + (preExistingConditionsCount * 500);
    }
}

class LifePolicy extends InsurancePolicy {
    private int termYears;
    private double coverageAmount;

    LifePolicy(double baseAmount, int termYears, double coverageAmount) {
        super(baseAmount);
        this.termYears = termYears;
        this.coverageAmount = coverageAmount;
    }

    @Override
    double calculatePremium() {
        return baseAmount
                + (coverageAmount / termYears) * 0.05;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        InsurancePolicy[] policies = new InsurancePolicy[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equalsIgnoreCase("HEALTH")) {
                double baseAmount = sc.nextDouble();
                int age = sc.nextInt();
                int conditions = sc.nextInt();

                policies[i] = new HealthPolicy(
                        baseAmount, age, conditions
                );

            } else if (type.equalsIgnoreCase("LIFE")) {
                double baseAmount = sc.nextDouble();
                int termYears = sc.nextInt();
                double coverageAmount = sc.nextDouble();

                policies[i] = new LifePolicy(
                        baseAmount, termYears, coverageAmount
                );
            }
        }

        double totalPremium = 0;

        for (InsurancePolicy policy : policies) {
            totalPremium += policy.calculatePremium();
        }

        System.out.printf("Total Premium: %.2f%n", totalPremium);

        sc.close();
    }
}
