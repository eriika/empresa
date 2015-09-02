
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Erika Navarro Delgado
 */
public class EmpresaJ {

    public static void main(String[] args) {
        new EmpresaJ().playJuana();
    }

    public void playJuana() {
        List<Producto> productos = new ArrayList<>();

        //productos.add=(new Producto(01,"ocho", "alimento", 10, 15, 20));
        for (Integer i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }

        for (Producto produc : productos) {
            System.out.println(produc);
        }

        // PRODUCTOS CON EXISTENCIA MAYOR A 20
        for (Producto produc : productos) {
            if (produc.cantexist > 20) {
                System.out.println(productos);
            }
        }
        //PRODUCTOS CON EXISTENCIA MENOR A 15
        for (Producto produc : productos) {
            if (produc.cantexist < 15) {
                System.out.println(productos);
            }
        }

        //LISTA DE PRODUCTOS CON LA MISMA CLASIFICAION Y PRECIO > 15.50
        List<Producto> Listacp = productos.stream().filter(a -> {
            return a.descriprecio > 15.50;
        }).collect(Collectors.toList());

        //LISTA DE PRODUCTOS CON PRECIO > 20.30 Y < 45.00
       /* List<Producto> Listapp = (List<Producto>) productos.stream().filter(a -> {
            return a.descriprecio > 20.30 && a.descriprecio < 45.00;});*/
        
        //NUMERO DE PRODUCTOS AGRUPADOS POR SU CLASIFICACION
        
    }

    public class Producto {

        private Integer idproducto;
        private Integer descriprecio;
        private String clasificacion;
        private Integer cantexist;
        private Integer existmin;
        private Integer existmax;

        /**
         * @return the idproducto
         */
        public Integer getIdproducto() {
            return idproducto;
        }

        /**
         * @param idproducto the idproducto to set
         */
        public void setIdproducto(Integer idproducto) {
            this.idproducto = idproducto;
        }

        /**
         * @return the descriprecio
         */
        public Integer getDescriprecio() {
            return descriprecio;
        }

        /**
         * @param descriprecio the descriprecio to set
         */
        public void setDescriprecio(Integer descriprecio) {
            this.descriprecio = descriprecio;
        }

        /**
         * @return the clasificacion
         */
        public String getClasificacion() {
            return clasificacion;
        }

        /**
         * @param clasificacion the clasificacion to set
         */
        public void setClasificacion(String clasificacion) {
            this.clasificacion = clasificacion;
        }

        /**
         * @return the cantexist
         */
        public Integer getCantexist() {
            return cantexist;
        }

        /**
         * @param cantexist the cantexist to set
         */
        public void setCantexist(Integer cantexist) {
            this.cantexist = cantexist;
        }

        /**
         * @return the existmin
         */
        public Integer getExistmin() {
            return existmin;
        }

        /**
         * @param existmin the existmin to set
         */
        public void setExistmin(Integer existmin) {
            this.existmin = existmin;
        }

        /**
         * @return the existmax
         */
        public Integer getExistmax() {
            return existmax;
        }

        /**
         * @param existmax the existmax to set
         */
        public void setExistmax(Integer existmax) {
            this.existmax = existmax;
        }

        @Override
        public String toString() {
            return "Producto{" + "idproducto=" + idproducto + ", descriprecio=" + descriprecio + ", clasificacion=" + clasificacion + ", cantexist=" + cantexist + ", existmin=" + existmin + ", existmax=" + existmax + '}';
        }

    }

}
