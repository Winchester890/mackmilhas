package mackmilhas.com.Controllers;

import mackmilhas.com.Entities.PessoaEntity;
import mackmilhas.com.Entities.ReservaEntity;
import mackmilhas.com.Repositories.PessoaRepository;
import mackmilhas.com.Repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagina_inicial")
public class PaginaInicial {
    @Autowired
    private final PessoaRepository pessoaRepository;
    @Autowired
    private final ReservaRepository reservaRepository;

    public PaginaInicial(PessoaRepository pessoaRepository, ReservaRepository reservaRepository) {
        this.pessoaRepository = pessoaRepository;
        this.reservaRepository = reservaRepository;
    }
    @GetMapping("/reservas")
    public List<ReservaEntity> findReservas() {
        return this.reservaRepository.findAll();
    }
    @GetMapping("/pessoas")
    public List<PessoaEntity> findPessoas() {
        return this.pessoaRepository.findAll();
    }
    @GetMapping("/reserva/{id}")
    public ReservaEntity findReserva(@PathVariable("id") final Long id) throws Exception {
        return this.reservaRepository.findById(id)
                .orElseThrow(() -> new Exception("Reserva não encontrada!"));
    }
    @GetMapping("/pessoa/{id}")
    public PessoaEntity findPessoa(@PathVariable("id") final Long id) throws Exception {
        return this.pessoaRepository.findById(id)
                .orElseThrow(() -> new Exception("Pessoa não encontrada!"));
    }
    @GetMapping("/reservas/{idPessoa}")
    public List<ReservaEntity> findByIdPessoa(@PathVariable("idPessoa") final Long idPessoa) {
        return this.reservaRepository.findByIdPessoa(idPessoa);
    }
    @PostMapping("/login")
    public Boolean login(@RequestBody final String nome, final String senha) {
        PessoaEntity pessoaEntity = this.pessoaRepository.findBySenha(senha);
        if (pessoaEntity != null) {
            if (pessoaEntity.getNome().equals(nome) && pessoaEntity.getSenha().equals(senha)) {
                return true;
            } else {
                return false;
            }
        }
        return null;
    }
    @PostMapping("/reservar")
    public void reservar(@RequestBody final ReservaEntity reservaEntity) {
        this.reservaRepository.save(reservaEntity);
    }
    @PostMapping("/cadastrar")
    public void cadastrarPessoa(@RequestBody final PessoaEntity pessoaEntity) {
        this.pessoaRepository.save(pessoaEntity);
    }
    @PostMapping("/atualizar_pessoa")
    public void updatePessoa(@RequestBody final PessoaEntity pessoaEntity) {
        this.pessoaRepository.save(pessoaEntity);
    }
    @DeleteMapping("/excluir_reserva/{id}")
    public void deleteReserva(@PathVariable("id") final Long id) {
        this.reservaRepository.deleteById(id);
    }
    @DeleteMapping("/excluir_pessoa/{id}")
    public void deletePessoa(@PathVariable("id") final Long id) {
        this.pessoaRepository.deleteById(id);
    }
}
