package br.gov.sp.etec.estacionamento.model;

import java.time.LocalDate;

public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private String observacao;
    private LocalDate horaentrada;
    private LocalDate horasaida;
    private boolean isEstacionado;

    public LocalDate getHorasaida() {
        return horasaida;
    }

    public void setHorasaida(LocalDate horasaida) {
        this.horasaida = horasaida;
    }

    public boolean isEstacionado() {
        return isEstacionado;
    }

    public void setEstacionado(boolean estacionado) {
        isEstacionado = estacionado;
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
