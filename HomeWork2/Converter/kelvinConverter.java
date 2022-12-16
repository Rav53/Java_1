package Converter;


public class kelvinConverter implements Converter {
    /**
     * @return температура в Кельвинах
     */
    @Override
    public double convertValue(double temperature) {
        return temperature + 273.15;
    }

}
