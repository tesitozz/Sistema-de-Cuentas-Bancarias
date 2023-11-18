package com.proyecto.cuentas.repositorio;

import com.proyecto.cuentas.modelo.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository<Cuenta,Integer> {


}
