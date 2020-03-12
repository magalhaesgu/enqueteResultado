package br.com.cielo.microservice.resultado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.microservice.resultado.dto.ResultadoDTO;
import br.com.cielo.microservice.resultado.service.ResultadoService;

@RestController
@RequestMapping("/resultadoVotacao")
public class ResultadoController {
	
	@Autowired
	private ResultadoService resultadoService;
	
	@RequestMapping(method = RequestMethod.POST)
	public List<ResultadoDTO> buscarResultadoVotacao(@RequestBody long idPergunta) {
		List<ResultadoDTO> listaResultadoDTO = resultadoService.buscarResultadoVotacao(idPergunta);
		return listaResultadoDTO;
	}	

}
