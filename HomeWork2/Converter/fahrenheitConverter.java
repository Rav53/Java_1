package Converter;

public class fahrenheitConverter implements Converter {
      /**
     * @return температура Фаренгейт
     */
    @Override
    public double convertValue(double temperature) {
        return ((9 / 5) * temperature) + 32;

    }
}
