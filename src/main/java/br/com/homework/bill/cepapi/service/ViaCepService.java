package br.com.homework.bill.cepapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.homework.bill.cepapi.model.Endereco;

/**
 * Client HTTP , criado via OpenFeign , para o consumoda API do
 * ViaCep .
 * 
 * **/

@FeignClient(name = "viacep",url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
