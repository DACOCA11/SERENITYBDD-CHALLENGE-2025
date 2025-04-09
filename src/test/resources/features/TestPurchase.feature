#language: en

Feature: Automatizacion compra

  @happypath

  Scenario Outline: Verificar compra de dos productos
    #Ingreso al sitio web
    Given que "David" accede al sitio web
    #Ingreso de credenciales y log in
    When introduzco credenciales e inicio de sesión
    #Agrego dos productos al carrito
    Then agrego dos productos al carrito
    #Verifico que el carrito tenga los dos productos
    And verifico que el carrito tenga los dos productos
    #Completo el formulario de compra
    When completo el formulario de compra con "<name>" "<lastname>" "<postal_code>"
    #validar pantalla checkout
    Then validar pantalla checkout
    #finalizo la compra
    And finalizo la compra

    Examples:
      | name | lastname | postal_code |
      | David|  Coronel |    170707   |
