package com.ecamp.horoscopo.servlets;

import com.ecamp.horoscopo.DTO.UsuarioDtoResponse;
import com.ecamp.horoscopo.services.UsuarioService;
import com.ecamp.horoscopo.services.UsuarioServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MostrarFiltrarUsuarios extends HttpServlet {
    private final UsuarioService usuarioService;

    public MostrarFiltrarUsuarios() {
        this.usuarioService = new UsuarioServiceImpl();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<UsuarioDtoResponse>dtoResponseList=usuarioService.EncontrarTodos();

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
