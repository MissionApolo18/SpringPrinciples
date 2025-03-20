package aragon.fes.service;

import aragon.fes.modelo.entity.UsuarioEntity;
import aragon.fes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioEntity> findAll() {
        List<UsuarioEntity> lista = new ArrayList<>();
        usuarioRepository.findAll().forEach(lista::add);
        return lista;
    }

}
