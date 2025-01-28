Feature: Добавяне на коментар
  Scenario: Добавяне на коментар
    Given Отваряне на екрана с теми за коментиране
    And Избиране на определена тема за коментиране
    When Въвеждане на коментар:"Коментар на тема"
    And Натискане на бутона за добавяне на коментар
    Then Виждаме съобщение: "Успешно добавен коментар!"

  Scenario: Добавяне на коментар с празно съдържание
    Given Отваряне на екрана с теми за коментиране
    And Избиране на определена тема за коментиране
    When Въвеждане на коментар:""
    And Натискане на бутона за добавяне на коментар
    Then Виждаме съобщение: "Моля въведете коментар!"