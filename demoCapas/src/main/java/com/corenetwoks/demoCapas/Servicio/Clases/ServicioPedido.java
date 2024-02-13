package com.corenetwoks.demoCapas.Servicio.Clases;

import com.corenetwoks.demoCapas.Servicio.Interfaces.IServicioPedido;
import com.corenetwoks.demoCapas.Modelo.Pedido;
import com.corenetwoks.demoCapas.Repositorio.Interfaces.IRepoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Es compoenete de servicio ya no ponemos @Component
public class ServicioPedido implements IServicioPedido {
    @Autowired
    private IRepoPedido capaRepo;


    @Override
    public String insertar(Pedido p) {
        return capaRepo.insertar(p);
    }
}
