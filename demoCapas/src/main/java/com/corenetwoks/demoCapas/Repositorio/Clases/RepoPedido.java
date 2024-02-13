package com.corenetwoks.demoCapas.Repositorio.Clases;

import com.corenetwoks.demoCapas.Modelo.Pedido;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoPedido;
import org.springframework.stereotype.Repository;

@Repository //Es compoenete de repositorio ya no ponemos @Component
public class RepoPedido implements IRepoPedido {

    @Override
    public String insertar(Pedido p) {
        return String.format("Capa repo %s", p.toString());
    }
}
