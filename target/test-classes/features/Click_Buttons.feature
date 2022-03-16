Feature: Practice clicking on button using XPATH and CSS Locator

  Scenario Outline: Click on button on the page
    Given I access the buttons page
    When I click on the button by <button>
    Then The validation message appears <button> <module message>

    Examples:
    | button      |     module message                         |
    | xpath       | Congratulations!                            |
    | css locator | It’s that Easy!!  Well I think it is.....  |
    | id          |  Well done! the Action Move & Click can become very useful!  |
