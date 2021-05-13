package com.company;

public class Main {

    public static void main(String[] args) {
        DatosDeEntrada unaConsola = FactoriaDeEntrada.get(1);
        unaConsola.introducirDatos();

        DatosDeSalida unaventana = FactoriaDeSalida.getProducto(2,"hola");
        unaventana.visualizar();

        DatosDeSalida misalidat;
    }
}
    }
}
