package WorkCommandsList

import ProgrammRootFile.*

// comment2
class Clear {
        fun clear(){
            while (!WorkWithCollection.priorityQueueCollection.isEmpty()){
                println("Объект ${WorkWithCollection.priorityQueueCollection.remove()} успешно удален")
            }
        }
}



// три ветки
// junit5 module tests
// сильные разветвления по файлам
