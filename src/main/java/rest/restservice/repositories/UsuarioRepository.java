package rest.restservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rest.restservice.models.UsuarioModel;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
