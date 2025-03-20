package aragon.fes.service;

import aragon.fes.modelo.entity.UsuarioEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UsuarioServiceImplTest {
    @Autowired
    UsuarioService usuarioService;

    @Test
    void salvar(){
        UsuarioEntity usuario = new UsuarioEntity().builder()
                .nombre("fes Aragon")
                .apellido("Unam")
                .build();
        usuarioService.save(usuario);
    }

    @Test
    void obtener(){
        List<UsuarioEntity> lista = usuarioService.findAll();
        for(UsuarioEntity s: lista){
            System.out.println(s.toString());
        }
    }

}