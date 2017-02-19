
package ejercicios02;

public class Billing {
    private Integer libro;
    private Integer cantidad;
    private Integer cupon;

    public Integer getlibro() {
        return libro;
    }

    public void setlibro(Integer libro1) {
        this.libro = libro1;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCupon() {
        return cupon;
    }

    public void setCupon(Integer cupon) {
        this.cupon = cupon;
    }

    public static void computeBill(Integer precio1) {
        Integer total;
        Integer impuesto = (precio1/100)*8;
        total = precio1+impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void computeBill(Integer precio1, Integer cantidad) {
        Integer total;
        Integer impuesto = (precio1/100)*8;
        total = (cantidad * precio1)+ impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void computeBill(Integer precio, Integer cantidad, Integer cupon) {
        Integer total;
        Integer impuesto = (precio/100)*8;
        total = ((cantidad * precio) - cupon)+impuesto;
        System.out.println("Usted debe " + total);
    }

    public static void main(String[] args) {
        Billing libros = new Billing();
        libros.setCantidad(2);
        libros.setCupon(100);
        libros.setlibro(200);
        computeBill(libros.getlibro());
        computeBill(libros.getlibro(), libros.getCantidad());
        computeBill(libros.getlibro(), libros.getCantidad(),libros.getCupon());
    }
}
