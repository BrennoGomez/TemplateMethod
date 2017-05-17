
public class CapitalStrategyTermLoan extends CapitalStrategy {

    @Override
    public double capital(Loan loan) {
        return loan.getCommitment() * duration(loan) * riskFactorFor(loan);
    }

    @Override
    protected double duration(Loan loan) {
        return weightedAverageDuration(loan);
    }

    private double weightedAverageDuration(Loan loan) {
        return 0;
    }

}
