package com.ejemplo.micalculadora;

public class CalculadoraSalario {

    public static double calcularSalario(int salarioBase, int horasExtras, int bonificaciones) {
        double valorHora = salarioBase / 192.0;
        double valorHorasExtras = horasExtras * valorHora * 1.25;
        double bonificacion = (bonificaciones == 1) ? salarioBase * 0.05 : 0;
        double salarioTotal = salarioBase + valorHorasExtras + bonificacion;
        double descuentoSalud = salarioTotal * 0.035;
        double descuentoPension = salarioTotal * 0.04;
        double descuentoCaja = salarioTotal * 0.01;
        double totalDescuentos = descuentoSalud + descuentoPension + descuentoCaja;
        double salarioNeto = salarioTotal - totalDescuentos;
        return Math.round(salarioNeto * 10) / 10.0;
    }
}
