package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import br.gov.sp.etec.estacionamento.model.Veiculo;
import java.util.List;

public interface VeiculoService {
    void CadastrarVeiculo(Veiculo veiculo);
    List<VeiculoEntity> ListarVeiculo();
    VeiculoEntity AtualizarVeiculo(VeiculoEntity veiculo);
    boolean DeletarVeiculo(long id);
    VeiculoEntity buscarVeiculoPorId(long id);
}
