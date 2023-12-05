@Configuraciones
Feature: Configuraciones

  Background:
    Given EL cliente se encuentra en la aplicacion
    And Ingresa sus datos: germancorreoprueba@gmail.com, 159432xx
    And Selecciona el menu opcion
    And Clickea en configuraciones

    @ModoOscurao
    Scenario: El cliente quiere cambiar el estilo
      When Selecciona el modo oscuro
      Then La app cambia de color

    @Notificaciones
    Scenario: El cliente quiere ver sus notificaciones
      When Clickea en notificaciones
      Then Las notificaciones quedaron habilitadas
