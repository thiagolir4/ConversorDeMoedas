import java.util.Map;

public record Moedas(String result, String base_code, Map<String, Double> conversion_rates) {
    public Double getConversionRate(String currency) {
        return conversion_rates.get(currency);
    }
}