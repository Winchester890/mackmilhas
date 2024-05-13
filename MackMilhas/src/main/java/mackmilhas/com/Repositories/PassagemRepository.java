package mackmilhas.com.Repositories;

import mackmilhas.com.Entities.PassagemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassagemRepository extends JpaRepository<PassagemEntity, Long> {
    List<PassagemEntity> findByDestino(String destino);
}
