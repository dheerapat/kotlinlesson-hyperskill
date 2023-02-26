fun main() {
    var water: Int = 400
    var milk: Int = 540
    var coffeeBean: Int = 120
    var cups: Int = 9
    var money: Int = 550
    var exit: Boolean = false

    while (!exit) {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()

        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                val need = readln()
                when (need) {
                    "1" -> {
                        if (water < 250) {
                            println("Sorry, not enough water")
                        } else if (coffeeBean < 16) {
                            println("Sorry, not enough coffee bean")
                        } else if (cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 250
                            coffeeBean -= 16
                            cups -= 1
                            money += 4
                        }
                    }
                    "2" -> {
                        if (water < 350) {
                            println("Sorry, not enough water")
                        } else if (milk < 75) {
                            println("Sorry, not enough milk")
                        } else if (coffeeBean < 20) {
                            println("Sorry, not enough coffee bean")
                        } else if (cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 350
                            milk -= 75
                            coffeeBean -= 20
                            cups -= 1
                            money += 7
                        }
                    }
                    "3" -> {
                        if (water < 200) {
                            println("Sorry, not enough water")
                        } else if (milk < 100) {
                            println("Sorry, not enough milk")
                        } else if (coffeeBean < 12) {
                            println("Sorry, not enough coffee bean")
                        } else if (cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            water -= 200
                            milk -= 100
                            coffeeBean -= 12
                            cups -= 1
                            money += 6
                        }
                    }
                    "back" -> {
                        continue
                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water you want to add:")
                water = water + readln().toInt()
                println("Write how many ml of milk you want to add:")
                milk = milk + readln().toInt()
                println("Write how many grams of coffee beans you want to add:")
                coffeeBean = coffeeBean + readln().toInt()
                println("Write how many disposable cups you want to add:")
                cups = cups + readln().toInt()
            }
            "take" -> {
                println("I gave you \$$money")
                money = 0
            }
            "remaining" -> {
                println("\nThe coffee machine has:")
                println("$water ml of water")
                println("$milk ml of milk")
                println("$coffeeBean g of coffee beans")
                println("$cups disposable cups")
                println("\$$money of money\n")
            }
            "exit" -> {
                exit = !exit
            }
        }
    }
}
