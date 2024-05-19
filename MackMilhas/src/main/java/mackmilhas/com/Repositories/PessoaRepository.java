package mackmilhas.com.Repositories;

import mackmilhas.com.Entities.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    PessoaEntity findByNomeAndSenha(String nome, String senha);
}
