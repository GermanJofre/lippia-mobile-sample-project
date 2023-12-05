@Entrada
Feature: Entrada

  Background:
    Given EL cliente se encuentra en la aplicacion
    And Ingresa sus datos: germancorreoprueba@gmail.com, 159432xx
    And Selecciona para crear un escenario

  @Tiempo
  Scenario Outline: El cliente ingresa horas
    When Agrega un nombre al proyecto '<Proyecto>'
    And Ingresa sus horas trabajadas '<Horas>' : '<Minutos>'
    And Guarda el escenario creado
    Then El cliente puede ver el escenario creado

    Examples:
      | Horas | Minutos | Proyecto |
      | 10    | 27      | Random   |

  @FechayTiempo
  Scenario Outline: El cliente ingresa fecha
    When Agrega un nombre al proyecto '<Proyecto>'
    And Clickea la seccion fechas con horas
    And Ingresa una hora de inicio '<HoraI>' : '<MinutosI>'
    And Ingresa una hora de finalizacion '<HoraF>' : '<MinutosF>'
    And Ingresa fecha '<dia>' '<mes>' y '<ano>'
    And Clicke en guarda la fecha y hora
    And Guarda el escenario creado
    Then El cliente puede ver el escenario creado

    Examples:
      | HoraI | MinutosI | HoraF | MinutosF | Proyecto | dia | mes | ano  |
      | 10    | 27       | 07    | 02       | Random   | 27  | 10  | 2024 |

  @Cancelacion
  Scenario: El cliente quiere cancelar sus acciones
    And Agrega un nombre al proyecto 'Cancelacion'
    And Ingresa sus horas trabajadas '17' : '27'
    And Cancela sus acciones para volver al inicio
    Then Puede observar que no hay escenarios creados