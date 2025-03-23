package com.marcelocbasilio.model;

import java.math.BigDecimal;

public record Pix(String chave, BigDecimal valor, String cidadeRemetente) {
}
