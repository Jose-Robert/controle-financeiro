package br.com.gestaofinanceira.application.resource;

import br.com.openapi.api.EntradasInvestimentosApi;
import br.com.openapi.model.EntradaInvestimentoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/receitas")
public class EntradasInvestimentosController implements EntradasInvestimentosApi {

    @Override
    public ResponseEntity<Void> cadastrarReceitas(EntradaInvestimentoRequest entradaInvestimentoRequest) {
        return EntradasInvestimentosApi.super.cadastrarReceitas(entradaInvestimentoRequest);
    }
}
