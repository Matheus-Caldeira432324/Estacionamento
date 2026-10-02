package br.gov.sp.etec.estacionamento.controler;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import br.gov.sp.etec.estacionamento.model.Veiculo;
import br.gov.sp.etec.estacionamento.service.VeiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veiculo")

public class VeiculoControler {
    @Autowired VeiculoServiceImpl service;

    @PostMapping("/cadastrar")
    public void cadastrar(Veiculo car) {
        service.CadastrarVeiculo(car);
    }

    @GetMapping("/registrar-entrada")
    public String registraentrada() {
        return "registrar-entrada";
    }

    @GetMapping("/registrar-saida")
    public String registrasaida(Model model) {
        var veiculos = service.ListarVeiculo();
        model.addAttribute("veiculoList",veiculos);
        return "/registrar-saida";
    }

    @GetMapping("saida/($id)")
    public String getVeiculo(Model model, @PathVariable long id) {
        var veiculos = service.ListarVeiculo();
        model.addAttribute("veiculoList",veiculos);
        VeiculoEntity entity = service.buscarVeiculoPorId(id);
        model.addAttribute("veiculo",entity);
        return "/registrar-saida";
    }
}
