package br.gov.sp.etec.estacionamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity(name = "veiculo")
public class VeiculoEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String placa;
    private String modelo;
    private String cor;
    private String observacao;
    private LocalDate horaentrada;
    private LocalDate horasaida;
    private boolean isEstacionado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEstacionado() {
        return isEstacionado;
    }

    public boolean getEstacionado() {
        return isEstacionado;
    }

    public void setEstacionado(boolean estacionado) {
        isEstacionado = estacionado;
    }

    public LocalDate getHorasaida() {
        return horasaida;
    }

    public void setHorasaida(LocalDate horasaida) {
        this.horasaida = horasaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDate getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(LocalDate horaentrada) {
        this.horaentrada = horaentrada;
    }
}