package br.senac.sp.cadastro.cadastrofuncionario.controller;

import br.senac.sp.cadastro.cadastrofuncionario.controller.request.FuncionarioRequest;
import br.senac.sp.cadastro.cadastrofuncionario.model.FuncionarioModel;
import br.senac.sp.cadastro.cadastrofuncionario.usecase.CadastroFuncionarioUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/cadastro")
public class CadastroFuncionarioController {

    private final CadastroFuncionarioUseCase funcionarioUseCase;
    public CadastroFuncionarioController(CadastroFuncionarioUseCase useCase){
        this.funcionarioUseCase = useCase;

    }

    @GetMapping("/trazer-usuario/{id-usuario}")
    public ResponseEntity<FuncionarioModel> getFuncionario(@PathVariable("id-usuario") Integer id){
        var fm = funcionarioUseCase.buscarFuncionario(id);
        return ResponseEntity.ok(fm);
    }

    @PostMapping("/criar-funcionario")
    public ResponseEntity<FuncionarioModel> criarFuncionario(@RequestBody FuncionarioRequest fr){
        var funcionario =
                funcionarioUseCase.criarFuncionario(
                        fr.getNome(),
                        fr.getIdade(),
                        fr.getSalario(),
                        fr.getCargo(),
                        fr.getHorasMensais());
        return ResponseEntity.ok(funcionario);
    }

}
