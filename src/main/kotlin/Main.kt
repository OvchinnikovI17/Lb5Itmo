import ProgrammRootFile.*
import WorkCommandsList.*

fun main() {

    //hi1

    while ("Kotlin" == "Kotlin"){

        print("> ")
        val getCommandFromUser: List<String> = readln().lowercase().split(" ")

        var all:AllCommands = AllCommands()

        when (getCommandFromUser[0]) {
            "help" -> all.helpStart()
            "info" -> all.info()
            "show" -> all.show()
            "add" -> all.add()
            "update" -> all.updateId()
            "remove_by_id" -> all.removeById()
            "clear" -> all.clear()
            "save" -> all.save()
            "execute_script" -> all.executeScript()
            "exit" -> all.exit()
            "remove_first" -> all.removeFirst()
            "add_if_max" -> all.addIfMax()
            "history" -> all.history14()
            "remove_all_by_distance" -> all.removeAllByDistance()
            "average_of_distance" -> all.averageOfDistance()
            "filter_less_than_distance" -> all.filterLessThanDistance()
            else -> println("Вы ввели несуществующую команду. Для получения списка команд, пропишите help")

        }
    }
}


