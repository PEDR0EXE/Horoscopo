package com.ecamp.horoscopo.servlets;

import com.ecamp.horoscopo.services.UsuarioService;
import com.ecamp.horoscopo.services.UsuarioServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ingresarUsuario extends HttpServlet {
    private final UsuarioService usuarioService;

    public ingresarUsuario(){
        this.usuarioService= new UsuarioServiceImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
