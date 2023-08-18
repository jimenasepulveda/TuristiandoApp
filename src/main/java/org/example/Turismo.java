package org.example;

import org.example.entidades.Local;
import org.example.entidades.Oferta;
import org.example.entidades.Reserva;
import org.example.entidades.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class Turismo {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Local local = new Local();
        Oferta oferta = new Oferta();
        Reserva reserva = new Reserva();
        Scanner lea = new Scanner(System.in);

        System.out.println("\u001B[32m***Bienvenid@***\u001B[0m");
        System.out.println("\u001B[34m1.Datos del usuario:\u001B[0m");
        System.out.print("\u001B[36mDigite su nombre y apellidos: \u001B[0m");
        usuario.setNombres(lea.nextLine());
        System.out.print("\u001B[36mIngrese su correo electrónico: \u001B[0m");
        usuario.setCorreo(lea.nextLine());
        System.out.println("\u001B[36Ingrese su ubicación: \n1. Centro \n2. Sur \n3. Norte \n4. Otras \u001B[0m");
        usuario.setUbicacion(Integer.parseInt(lea.nextLine()));
        usuario.setId();
        System.out.println("\u001B[36El id del usuario es: \u001B[0m" + usuario.getId());

        System.out.println("\u001B[34m2.Datos del Local:\u001B[0m");
        System.out.print("\u001B[36mDigite el NIT del local: \u001B[0m");
        local.setNit(lea.nextLine());
        System.out.print("\u001B[36mDigite el nombre del local: \u001B[0m");
        local.setNombre(lea.nextLine());

        System.out.println("\u001B[34m3.Datos de la Oferta:\u001B[0m");
        System.out.print("\u001B[36mDigite el titulo de la oferta: \u001B[0m");
        oferta.setTitulo(lea.nextLine());
        System.out.print("\u001B[36mDigite la fecha de inicio: \u001B[0m");
        oferta.setFechaInicio(lea.nextLine());
        System.out.print("\u001B[36mDigite la fecha de fin: \u001B[0m");
        oferta.setFechaFin(lea.nextLine());
        System.out.print("\u001B[36mDigite el valor de la oferta: \u001B[0m");
        oferta.setCostoPersona(lea.nextDouble());
        lea.nextLine();

        System.out.println("\u001B[34m3.Datos de la reserva:\u001B[0m");
        System.out.print("\u001B[36mDigite la fecha para realizar la reserva: \u001B[0m");
        reserva.setFechaReserva(lea.nextLine());
        System.out.print("\u001B[36mDigite el numero de personas: \u001B[0m");
        reserva.setNumeroPersonas(Integer.parseInt(lea.nextLine()));
        reserva.setId();
        System.out.println("\u001BEl id de la reserva es: \u001B[0m" + reserva.getId());
        reserva.setCostoTotal(oferta.getCostoPersona() * reserva.getNumeroPersonas());
        System.out.println("\u001B[36mEl costo total de la reserva es: \u001B[0m" + reserva.getCostoTotal());



        System.out.println("\u001B[34m-----------------------//------------------------\u001B[0m");
        System.out.println("\u001B[35mSu nombre y apellido son: \u001B[0m" + usuario.getNombres());
        System.out.println("\u001B[35mEl Nit del local es: \u001B[0m" + local.getNit());
        System.out.println("\u001B[35mEl Nombre del local es: \u001B[0m" + local.getNombre());
        System.out.println("\u001B[35mEl titulo de la oferta es: \u001B[0m" + oferta.getTitulo());
        System.out.println("\u001B[35mLa fecha de inicio es: \u001B[0m" + oferta.getFechaInicio());
        System.out.println("\u001B[35mLa fecha de fin es: \u001B[0m" + oferta.getFechaFin());
        System.out.println("\u001B[35mEl valor de la oferta es: \u001B[0m" + oferta.getCostoPersona());
        System.out.println("\u001B[35mLa fecha de la reserva es: \u001B[0m" + reserva.getFechaReserva());
        System.out.println("\u001B[35mEl numero de personas es: \u001B[0m" + reserva.getNumeroPersonas());

    }
}