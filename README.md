# onePieceAPI

![badge](https://img.shields.io/badge/STATUS-DESENVOLVIMENTO-blue)

#Sobre o projeto

Essa API é um projeto pessoal baseado no anime One Piece do autor Eiichiro Oda.

A API consiste em uma pesquisa de personagens, onde os dados são coletados do banco de dados e são listados as informações sobre os personagens.

## Métodos
Requsições para a API:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |

# Dados dos personagens [/personagens]

### Listar (List) [GET /api/v1/personagens]

+ Request (application/json)

+ Reponse 200 (application/json)

            {
              "id": 1,
        "nome": "Monkey D. Luffy",
        "estiloLuta": "Gomu Gomu no mi",
        "tripulacao": "Piratas do Chapéu de Palha",
        "recompensa": 1500000000.00,
        "akumaNoMi": "Gomu Gomu no Mi",
        "tipoAkumaNoMi": [
            "Paramecia"
        ],
        "haki": "Haoshoku Haki,Kenbunshoku Haki,Busoshoku Haki",
        "imagens": [
            {
                "eastBlue": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_east_blue.png",
                "alabasta": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_alabasta.png",
                "skypiea": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_skypiea.png",
                "water7": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_water7.png",
                "thrillerBark": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_thrillerbark.png",
                "sabaody": "https://github.com/brunoduarte96/onePieceAPI/blob/master/Imagens/Imagens_Piratas/luffy/Luffy_sabaody.png",
                "impelDown": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_impel_down.png",
                "marineFord": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_marineford.png",
                "ilhaDosTritoes": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_ilha_dos_tritoes.png",
                "dressrosa": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_dressrosa.png",
                "wholeCake": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/Luffy_whole_cake.png",
                "wano": "https://raw.githubusercontent.com/brunoduarte96/onePieceAPI/master/Imagens/Imagens_Piratas/luffy/luffy_wano.png"
            }
        ],
        "links": [],
        "links": [
            {
                "rel": "buscarPorNome",
                "href": "http://localhost:8080/api/v1/personagens/Monkey%20D.%20Luffy"
            }
        ]
            }


  ## Novo (Create) [POST]

  + Request (application/json)
  + Body
 
    
              {
                "nome": "Bepo",
                "estiloLuta": "Artes marciais",
                "tripulacao": "Piratas Heart",
                "recompensa": 500,
                "akumaNoMi": "",
               "haki": "",
                "imagens": [
                  {
                    "eastBlue": "https://example.com/pirata-bepo-egfgfgfgfast-blue",
                    "alabasta": "https://example.com/pirata-bepo-alabasta",
                    "skypiea": "https://example.com/pirata-bepo-skypiea",
                    "water7": "https://example.com/pirata-bepo-water7",
                    "thrillerBark": "https://example.com/pirata-bepo-thriller-bark",
                    "sabaody": "https://example.com/pirata-bepo-sabaody",
                    "impelDown": "https://example.com/pirata-bepo-impel-down",
                    "marineFord": "https://example.com/pirata-bepo-marine-ford",
                    "ilhaDosTritoes": "https://example.com/pirata-bepo-ilha-dos-tritoes",
                    "aliancaPirata": "https://example.com/pirata-bepo-alianca-pirata",
                    "dressrosa": "https://example.com/pirata-bepo-dressrosa",
                    "wholeCake": "https://example.com/pirata-bepo",
                    "wano": "https://example.com/pirata-bepo-wano"
 
  
              }


    
# Dados da Tripulação [/tripulacao]

### Listar (List) [GET /api/v1/tripulacao]

+ Request (application/json)

+ Reponse 200 (application/json)

                  {
                                      {
                      "id": 1,
                      "nome": "Piratas do Chapéu de Palha",
                      "piratas": [
                          "Monkey D. Luffy",
                          "Roronoa Zoro",
                          "Vinsmoke Sanji",
                          "Nami"
                      ],
                      "capitao": "Monkey D. Luffy",
                      "navio": "Thousand Sunny",
                      "links": [
                          {
                              "rel": "buscarTripulacao",
                              "href": "http://localhost:8080/api/v1/tripulacao/Piratas%20do%20Chap%C3%A9u%20de%20Palha"
                          }
                      ]
                  },
                  {
                      "id": 2,
                      "nome": "Piratas Heart",
                      "piratas": [
                           "Trafalgar D. Water Law"
                           "Bepo"
                      ],
                      "capitao": "Trafalgar D. Water Law",
                      "navio": "Polar Tang",
                      "links": [
                          {
                              "rel": "buscarTripulacao",
                              "href": "http://localhost:8080/api/v1/tripulacao/Piratas%20Heart"
                          }
                      ]
                  }

                  }



  # Dados da Hierarquia [/hierarquia]

### Listar (List) [GET /api/v1/hierarquia]

+ Request (application/json)

+ Reponse 200 (application/json)

                    {
                        {
                          "id": 1,
                          "cargo": "Almirante",
                          "marinha": [
                              "Borsalino Kizaru"
                          ],
                          "links": [
                              {
                                  "rel": "buscarCargo",
                                  "href": "http://localhost:8080/api/v1/hierarquia/Almirante"
                              }
                          ]
                      },
                      {
                          "id": 2,
                          "cargo": "Vice-Almirante",
                          "marinha": [
                              "Smoker"
                          ],
                          "links": [
                              {
                                  "rel": "buscarCargo",
                                  "href": "http://localhost:8080/api/v1/hierarquia/Vice-Almirante"
                              }
                          ]
                      }
                    }
    

## Modelo Conceitual 

![der](https://github.com/brunoduarte96/onePieceAPI/assets/106353520/8c7f49d8-5034-4830-b6a9-2e03071c969f)

# Tecnologias utilizadas

## Back end
- Java
- Spring Boot
- Hateoas
- Docker Compose
- Maven

## Banco de dados
- H2
- PostgreSQL
