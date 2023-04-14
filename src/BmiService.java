public class BmiService {

    public int calculate(double weightKilo, double heightMeters) {
        double bodyMassIndex = weightKilo / ( heightMeters * heightMeters);
        return (int) bodyMassIndex;

    }
}
