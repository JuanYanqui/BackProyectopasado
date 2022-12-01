package com.demo.itx.repositories;

import java.util.List;
import java.util.Optional;

import com.demo.itx.models.Proveedor;

public interface IDAOProveedor {

    Proveedor crear(Proveedor proveedor);

    Optional<Proveedor> porId(Long idProveedor);

    List<Proveedor> listar();

    Proveedor actualizar(Proveedor proveedor, Long idProveedor);

    boolean eliminar(Long idProveedor);

    List<Proveedor> listaByEmpresa(Long idEmpresa);
}
