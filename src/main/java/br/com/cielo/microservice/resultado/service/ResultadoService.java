package br.com.cielo.microservice.resultado.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.microservice.resultado.dto.ResultadoDTO;
import br.com.cielo.microservice.resultado.dto.VotacaoDTO;
import br.com.cielo.microservice.resultado.model.Resultado;
import br.com.cielo.microservice.resultado.repository.ResultadoRepository;

@Service	
public class ResultadoService {
	
	@Autowired
	private ResultadoRepository resultadoRepository;

	public VotacaoDTO incluirResultado(VotacaoDTO resultadoDTO) {
		Resultado resultado = new Resultado();
		BeanUtils.copyProperties(resultadoDTO, resultado);
		resultado = resultadoRepository.save(resultado);
		return resultadoDTO;
	} 
	
	public List<ResultadoDTO> buscarResultadoVotacao(long idPergunta) {
		List<ResultadoDTO> listaResultado = resultadoRepository.buscarResultadoVotacao(idPergunta);
		return listaResultado;
	}
}
