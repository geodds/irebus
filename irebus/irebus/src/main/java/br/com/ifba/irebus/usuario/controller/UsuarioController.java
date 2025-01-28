/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.irebus.usuario.controller;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
/**
 *
 * @author geovana
 */

@RestContoller
@ResquestMapping(path = "/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    
    private final UsuarioIService usuarioService;
    
    @GetMapping(path = "/findall", produces= Media
    Type.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
    }
    
    @PostMapping(path = "/save", produces= Media
    Type.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> save(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.save());
    }
    
    @DeleteMapping(path = "/delete", produces= Media
    Type.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.delete());
    }
    
    @PostMapping(path = "/update", produces= Media
    Type.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.update());
    }

}
