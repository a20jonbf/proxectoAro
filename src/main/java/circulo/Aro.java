package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author a20JonBF
 */
public class Aro {

    /**
     * Constante para o radio mínimo dun aro
     */
    public static final double MINIMO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * Constructor dun Aro sen parámetros
     */
    public Aro() {
    }

    /**
     * Constructor con parámetros
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }





    private static final double LIMITERADIO = 0.0;

    /**
     * método para obter o diámetro do Aro
     * @return diámetro
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Método para obter a circunferencia
     * @return circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * método para obter a superficie
     * @return superficie
     */
    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + coordenadaX + "," + coordenadaY + "]; Radio = " + radio;
    }

    /**
     * método para cambiar as coordenadas do centro do Aro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        coordenadaX=coordenadaX + trasladarX;
        coordenadaY=coordenadaY + trasladarY;
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        radio=(radio < LIMITERADIO ? LIMITERADIO : radio);
        this.radio = radio;
    }
}