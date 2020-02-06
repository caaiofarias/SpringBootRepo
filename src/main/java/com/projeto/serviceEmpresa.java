package com.projeto;
import org.springframework.stereotype.Service;

//A annotation Service faz com que se torne um componente spring, e pode ser injetado como dependencia ->
// em outro componente usando a annotation @AutoWired (funciona +- como composição, e diminui o acoplamento)
@Service
/**
 * serviceEmpresa
 * Regra de negócio
 * fluxo é requisicão -> controller -> SERVICE -> repository -> 
 * bancoDeDados (onde o service lida com a requisição recebida do controller)
 */ 
public class serviceEmpresa {

    public void testarService(){
        System.out.println("#### Executando serviço de teste service empresa");
    }
}