Feature: Hello

  Scenario: Message whit null parameter
  	Given null parameter
    When call ejb
    Then message is "Hello World from EJB!!"

  Scenario: Message whit not null parameter
  	Given parameter with value "Selen"
    When call ejb
    Then message is "Hey Selen, hello from EJB!"
