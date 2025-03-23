package com.marcelocbasilio.model;

import com.marcelocbasilio.model.enums.TipoChave;
import com.marcelocbasilio.model.enums.TipoPessoa;

import java.time.LocalDateTime;

public record Chave(TipoChave tipoChave, String chave, String ispb, TipoPessoa tipoPessoa, String cpfCnpj, String nome,
                    LocalDateTime dataHoraCriacao) {
}
