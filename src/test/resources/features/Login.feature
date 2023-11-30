@Login
Feature: Login

  Background:
    Given EL cliente se encuentra en la aplicacion
    When Ingresa sus datos: germancorreoprueba@gmail.com, 159432xx

  @Ingreso
  Scenario: Ingreso a clockify
    Then El cliente ingresa a la aplicacion exitosamente

  @Salida
  Scenario: Salida de clockify
    And Selecciona el menu opcion
    Then El cliente sale de la aplicacion exitosamente