class CoffeeMaker {
    var water: Int = 400
    var milk: Int = 540
    var coffeeBean: Int = 120
    var cups: Int = 9
    var money: Int = 550

    fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                val need = readln()
                when (need) {
                    "1" -> {
                        if (this.water < 250) {
                            println("Sorry, not enough water")
                        } else if (this.coffeeBean < 16) {
                            println("Sorry, not enough coffee bean")
                        } else if (this.cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            this.water -= 250
                            this.coffeeBean -= 16
                            this.cups -= 1
                            this.money += 4
                        }
                    }
                    "2" -> {
                        if (this.water < 350) {
                            println("Sorry, not enough water")
                        } else if (this.milk < 75) {
                            println("Sorry, not enough milk")
                        } else if (this.coffeeBean < 20) {
                            println("Sorry, not enough coffee bean")
                        } else if (this.cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            this.water -= 350
                            this.milk -= 75
                            this.coffeeBean -= 20
                            this.cups -= 1
                            this.money += 7
                        }
                    }
                    "3" -> {
                        if (this.water < 200) {
                            println("Sorry, not enough water")
                        } else if (this.milk < 100) {
                            println("Sorry, not enough milk")
                        } else if (this.coffeeBean < 12) {
                            println("Sorry, not enough coffee bean")
                        } else if (this.cups < 1) {
                            println("Sorry, not enough cup")
                        } else {
                            println("I have enough resources, making you a coffee!")
                            this.water -= 200
                            this.milk -= 100
                            this.coffeeBean -= 12
                            this.cups -= 1
                            this.money += 6
                        }
                    }
                    "back" -> {
                        return
                    }
                }
    }

    fun fill() {
        println("Write how many ml of water you want to add:")
        this.water = this.water + readln().toInt()
        println("Write how many ml of milk you want to add:")
        this.milk = this.milk + readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        this.coffeeBean = this.coffeeBean + readln().toInt()
        println("Write how many disposable cups you want to add:")
        this.cups = this.cups + readln().toInt()
    }

    fun take() {
        println("I gave you \$$money")
        this.money = 0
    }

    fun remaining() {
        println("\nThe coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffeeBean g of coffee beans")
        println("$cups disposable cups")
        println("\$$money of money\n")
    }
}

fun main() {
    var exit = false
    val coffeeMaker = CoffeeMaker()
    while (!exit) {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()

        when (action) {
            "buy" -> coffeeMaker.buyCoffee()
            "fill" -> coffeeMaker.fill()
            "take" -> coffeeMaker.take()
            "remaining" -> coffeeMaker.remaining()
            "exit" -> {
                exit = !exit
            }
        }
    }
}
