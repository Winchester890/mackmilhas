package mackmilhas.com.Controllers;

import mackmilhas.com.Entities.PassagemEntity;
import mackmilhas.com.Repositories.PassagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passagem")
public class PassagemController {
    @Autowired
    private final PassagemRepository passagemRepository;

    public PassagemController(PassagemRepository passagemRepository) {
        this.passagemRepository = passagemRepository;
    }
    @GetMapping
    public List<PassagemEntity> findAll() {
        return this.passagemRepository.findAll();
    }
    @GetMapping("/{id}")
    public PassagemEntity findById(@PathVariable("id") final Long id) throws Exception {
        return this.passagemRepository.findById(id)
                .orElseThrow(() -> new Exception("Passagem não encontrada!"));
    }
    @GetMapping("/destino/{destino}")
    public List<PassagemEntity> findByDestino(@PathVariable("destino") final String destino) {
        return this.passagemRepository.findByDestino(destino);
    }
    @PostMapping("/cadastrar")
    public void cadastrarPassagem(@RequestBody final PassagemEntity passagemEntity) {
        this.passagemRepository.save(passagemEntity);
    }
    @PostMapping("/atualizar")
    public void update(@RequestBody final PassagemEntity passagemEntity) {
        this.passagemRepository.save(passagemEntity);
    }
    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable("id") final Long id) {
        this.passagemRepository.deleteById(id);
    }
}
