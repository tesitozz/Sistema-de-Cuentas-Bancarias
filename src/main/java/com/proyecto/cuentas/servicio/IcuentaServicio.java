package com.proyecto.cuentas.servicio;
import com.proyecto.cuentas.modelo.Cuenta;
import java.util.List;

public interface IcuentaServicio {

    public List<Cuenta> listarCuentas();

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);
}
