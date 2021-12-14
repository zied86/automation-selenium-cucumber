@authentication
Feature: tester la page connexion
  ETQ utilisateur je souhaite tester la page connexion 

  @cnx
  Scenario: tester la page connexion - ORANGE HRM
    Given Je me connecte sur lapplication OrangeHRM 
    When Je saisie le UserName "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page Home 