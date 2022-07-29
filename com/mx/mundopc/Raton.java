package com.mx.mundopc;

public class Raton extends  DispositivoEntrada{

    private final int idRaton;
    private static int contadorRatones;



    public Raton(String tipoDeEntrada, String marca, int idRaton) {
        super(tipoDeEntrada, marca);
        this.idRaton = Raton.contadorRatones++;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton + "super="+super.toString()+
                '}';
    }
}
