package br.com.cielo.microservice.resultado.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cielo.microservice.resultado.dto.ResultadoDTO;
import br.com.cielo.microservice.resultado.model.Resultado;

public interface ResultadoRepository extends JpaRepository<Resultado, Long>{
	
	@Query("select new br.com.cielo.microservice.resultado.dto.ResultadoDTO (r.idItemSelecionado, count(r)) from Resultado r where r.idPergunta = :idPergunta group by r.idItemSelecionado")
	List<ResultadoDTO> buscarResultadoVotacao(@Param("idPergunta") long idPergunta);

}
