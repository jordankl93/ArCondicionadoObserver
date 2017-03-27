Feature: Controle da temperatura do ar condicionado 
  Controla a temperatura do ar condicionado de uma sala de aula
    
  Scenario: Adicionando Pessoas
    Given Eu adiciono 15 pessoas a um sensor
    And Eu Tenho uma temperatura externa de 30 Graus em um sensor
    When Eu quero regular a temperatura
    Then O ar condicionado deve regular a temperatura em 7.5 graus 