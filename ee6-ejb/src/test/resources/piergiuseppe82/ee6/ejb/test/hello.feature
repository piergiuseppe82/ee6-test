Feature: Hello

  Scenario: Message whit null parameter
  	Given null parameter
    When call ejb
    Then message is "Hello welcome!"

  Scenario: Message whit not null parameter
  	Given parameter with value "Selen"
    When call ejb
    Then message is "Hello Selen, welcome!"
