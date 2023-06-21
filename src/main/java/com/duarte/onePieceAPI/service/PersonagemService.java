package com.duarte.onePieceAPI.service;

import com.duarte.onePieceAPI.dto.MarinhaDTO;
import com.duarte.onePieceAPI.dto.PirataDTO;
import com.duarte.onePieceAPI.entities.*;
import com.duarte.onePieceAPI.repositories.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PirataRepository pirataRepository;

    @Autowired
    private MarinhaRepository marinhaRepository;

    @Autowired
    private HierarquiaRepository hierarquiaRepository;

    @Autowired
    private TripulacaoRepository tripulacaoRepository;

    @Autowired
    private AkumaNoMiRepository akumaNoMiRepository;

    public List<Object> listarPersonagens() {
        List<PirataDTO> piratasDTO = pirataRepository.findAll().stream()
                .map(PirataDTO::new)
                .toList();

        List<MarinhaDTO> marinheirosDTO = marinhaRepository.findAll().stream()
                .map(MarinhaDTO::new)
                .toList();

        List<Object> personagens = new ArrayList<>();
        personagens.addAll(piratasDTO);
        personagens.addAll(marinheirosDTO);

        return personagens;
    }

    public List<Object> buscarPersonagensPorNome(String nome) {
        List<Pirata> piratasEncontrados = pirataRepository.findByNomeContainingIgnoreCase(nome);
        List<Marinha> marinheirosEncontrados = marinhaRepository.findByNomeContainingIgnoreCase(nome);

        List<PirataDTO> pirataDTO = piratasEncontrados.stream()
                .map(PirataDTO::new)
                .toList();
        List<MarinhaDTO> marinheirosDTO = marinheirosEncontrados.stream()
                .map(MarinhaDTO::new)
                .toList();

        List<Object> personagens = new ArrayList<>();
        personagens.addAll(pirataDTO);
        personagens.addAll(marinheirosDTO);

        return personagens;
    }


    public void adicionarNovoPirata(PirataDTO pirataDTO){
        Pirata pirata  = new Pirata();
        BeanUtils.copyProperties(pirataDTO, pirata);

        if(pirataDTO.getTripulacao() != null){
            Tripulacao tripulacao = tripulacaoRepository.findByNome(pirataDTO.getTripulacao());
            pirata.setTripulacao(tripulacao);
        }

        if (pirataDTO.getAkumaNoMi() != null) {
            AkumaNoMi akumaNoMi = akumaNoMiRepository.findByNome(pirataDTO.getAkumaNoMi());
            pirata.setAkumaNoMi(akumaNoMi);
        }
        List<Imagem> imagens = new ArrayList<>();

        if (pirataDTO.getImagens() != null && !pirataDTO.getImagens().isEmpty()) {
            Imagem imagem = new Imagem();
            imagem.setEastBlue(pirataDTO.getImagens().get(0).getEastBlue());
            imagem.setAlabasta(pirataDTO.getImagens().get(0).getAlabasta());
            imagem.setSkypiea(pirataDTO.getImagens().get(0).getSkypiea());
            imagem.setWater7(pirataDTO.getImagens().get(0).getWater7());
            imagem.setThrillerBark(pirataDTO.getImagens().get(0).getThrillerBark());
            imagem.setSabaody(pirataDTO.getImagens().get(0).getSabaody());
            imagem.setImpelDown(pirataDTO.getImagens().get(0).getImpelDown());
            imagem.setMarineFord(pirataDTO.getImagens().get(0).getMarineFord());
            imagem.setIlhaDosTritoes(pirataDTO.getImagens().get(0).getIlhaDosTritoes());

            imagem.setDressrosa(pirataDTO.getImagens().get(0).getDressrosa());
            imagem.setWholeCake(pirataDTO.getImagens().get(0).getWholeCake());
            imagem.setWano(pirataDTO.getImagens().get(0).getWano());

            imagens.add(imagem);
        }
        pirata.setImagens(imagens);
        pirataRepository.save(pirata);
    }


}
