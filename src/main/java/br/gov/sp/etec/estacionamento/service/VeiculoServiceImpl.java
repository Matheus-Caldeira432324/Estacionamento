package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.entity.VeiculoEntity;
import br.gov.sp.etec.estacionamento.model.Veiculo;
import br.gov.sp.etec.estacionamento.repositor.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Autowired VeiculoRepository repository;

    @Override
    public void CadastrarVeiculo(Veiculo veiculo) {
        repository.save(toVeiculoEntity(veiculo));
    }

    @Override
    public List<VeiculoEntity> ListarVeiculo() {
        return repository.findAll();
    }

    @Override
    public VeiculoEntity AtualizarVeiculo(VeiculoEntity veiculo) {
        repository.save(veiculo);
        return veiculo;
    }

    @Override
    public boolean DeletarVeiculo(long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }

    private VeiculoEntity toVeiculoEntity(Veiculo car) {
        VeiculoEntity carEntity = new VeiculoEntity();

        carEntity.setPlaca(car.getPlaca());
        carEntity.setModelo(car.getModelo());
        carEntity.setCor(car.getCor());
        carEntity.setObservacao(car.getObservacao());
        carEntity.setHoraentrada(car.getHoraentrada());

        return carEntity;
    }

    private List<Veiculo> toListVeiculos(List<VeiculoEntity> entities) {
        List<Veiculo> veiculos = new ArrayList<>();

        for (VeiculoEntity v : entities) {
            Veiculo car = new Veiculo();

            car.setPlaca(v.getPlaca());
            car.setCor(v.getCor());
            car.setModelo(v.getModelo());
            car.setObservacao(v.getObservacao());
            veiculos.add(car);
        }
        return veiculos;
    }

    public VeiculoEntity buscarVeiculoPorId(long id) {
        return repository.findById(id).orElseThrow();
    }

}