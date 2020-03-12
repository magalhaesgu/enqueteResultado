package br.com.cielo.microservice.resultado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.microservice.resultado.dto.VotacaoDTO;
import br.com.cielo.microservice.resultado.service.ResultadoService;

@RestController
@RequestMapping("/cadastrarVoto")
public class VotacaoController {
	
	@Autowired
	private ResultadoService resultadoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public VotacaoDTO cadastrarVoto(@RequestBody VotacaoDTO resultadoDTO) {
		VotacaoDTO resultadoVotacaoDTO = resultadoService.incluirResultado(resultadoDTO);
		return resultadoVotacaoDTO;
	}
	

}
