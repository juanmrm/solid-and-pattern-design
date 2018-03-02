package com.demo.pattern.behavioral.state;

public enum Estado {

    APAGADO {
        @Override
        public Estado setPotenciaMin() {
            System.out.println("fijada potencia mínima");
            return Estado.POTENCIA_MIN;
        }
        @Override
        public Estado setPotenciaMax() {
            System.out.println("fijada potencia máxima");
            return Estado.POTENCIA_MAX;
        }
        @Override
        public Estado abrirPuerta() {
            System.out.println("abriendo puerta");
            return Estado.PUERTA_ABIERTA;
        }
    },

    PUERTA_ABIERTA {
        @Override
        public Estado apagar() {
            System.out.println("apagando");
            return Estado.APAGADO;
        }
    },

    POTENCIA_MAX {
        @Override
        public Estado abrirPuerta() {
            System.out.println("abriendo puerta");
            return Estado.PUERTA_ABIERTA;
        }
        @Override
        public Estado setPotenciaMin() {
            System.out.println("fijada potencia mínima");
            return Estado.POTENCIA_MIN;
        }
        @Override
        public Estado cocinando() {
            System.out.println("cocinando");
            return Estado.COCINANDO;
        }
    },

    POTENCIA_MIN {
        @Override
        public Estado abrirPuerta() {
            System.out.println("abriendo puerta");
            return Estado.PUERTA_ABIERTA;
        }
        @Override
        public Estado setPotenciaMax() {
            System.out.println("fijada potencia máxima");
            return Estado.POTENCIA_MAX;
        }
        @Override
        public Estado cocinando() {
            System.out.println("cocinando");
            return Estado.COCINANDO;
        }
    },

    COCINANDO {
        @Override
        public Estado apagar() {
            System.out.println("apagando");
            return Estado.APAGADO;
        }
    };

    public Estado apagar() {
        System.out.println("No se permite operacion desde " + this);
        return this;
    }

    public Estado abrirPuerta() {
        System.out.println("No se permite operacion desde " + this);
        return this;
    }

    public Estado setPotenciaMin() {
        System.out.println("No se permite operacion desde " + this);
        return this;
    }

    public Estado setPotenciaMax() {
        System.out.println("No se permite operacion desde " + this);
        return this;
    }

    public Estado cocinando() {
        System.out.println("No se permite operacion desde " + this);
        return this;
    }

}
