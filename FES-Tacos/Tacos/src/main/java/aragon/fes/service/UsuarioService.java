package aragon.fes.service;

import aragon.fes.modelo.entity.UsuarioEntity;

import java.util.List;

public interface UsuarioService {
    UsuarioEntity save(UsuarioEntity usuario);
    List<UsuarioEntity> findAll();
}
