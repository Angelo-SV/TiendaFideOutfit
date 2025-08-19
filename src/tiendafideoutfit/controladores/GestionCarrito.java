package tiendafideoutfit.controladores;

import tiendafideoutfit.modelos.ItemCarrito;
import tiendafideoutfit.modelos.Prenda;
import java.util.ArrayList;
import java.util.List;

public class GestionCarrito {
    private static List<ItemCarrito> carrito = new ArrayList<>();
    
    public static void agregarItem(Prenda prendaOriginal, int cantidad) {
        // Copiar la prenda
        Prenda copia = new Prenda();
        copia.setDescripcion(prendaOriginal.getDescripcion());
        copia.setCodigo(prendaOriginal.getCodigo());
        copia.setColor(prendaOriginal.getColor());
        copia.setDepartamento(prendaOriginal.getDepartamento());
        copia.setTalla(prendaOriginal.getTalla());
        copia.setPrecio(prendaOriginal.getPrecio());
        ItemCarrito item = new ItemCarrito(copia, cantidad);
        carrito.add(item);
    }
    
     public static List<ItemCarrito> getItemsCarrito() {
        return carrito;
    }

    public static void eliminarItemPorCodigo(String codigo) {
        carrito.removeIf(item -> item.getCodigo().equalsIgnoreCase(codigo));
    }

    public static double getTotalCarrito() {
        return carrito.stream().mapToDouble(ItemCarrito::getTotal).sum();
    }

    public static void limpiarCarrito() {
        carrito.clear();
    }
}