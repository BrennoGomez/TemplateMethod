
public class CapitalStrategyRevolver extends CapitalStrategy {

    @Override
    public double capital(Loan loan) {
        return (loan.outstandingRiskAmount() * duration(loan) * riskFactorFor(loan))
                + (loan.getUnusedPercentage() * duration(loan) * unusedRiskFactor(loan));
    }

    private double unusedRiskFactor(Loan loan) {
        return 0;
    }

}