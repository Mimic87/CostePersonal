public class CostePersonal {

        public static float costeDelPersonal(Trabajador[] trabajadores) {
                float costeFinal = 0;
                Trabajador trabajador;
                final float AUMENTO_POR_EXTRA = 20;
                for (int i = 0; i < trabajadores.length; i++) {
                        trabajador = trabajadores[i];
                        costeFinal += trabajador.getNomina();

                        public boolean esJefazo(Trabajador trabajador) {
                                return trabajador.getTipoTrabajador() == Trabajador.DIRECTOR ||
                                        trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR;
                        }

                        if (!esJefazo(trabajador)){
                                costeFinal += (trabajador.getHorasExtras() * AUMENTO_POR_EXTRA);
                        }

                        return costeFinal;
                }
        }
