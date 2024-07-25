//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val linkedList: LinkedList = LinkedList()

    val node1:Node = Node(null , "1")
    val node2:Node = Node(null , "2")
    val node3:Node = Node(null , "3")
    val node4:Node = Node(null , "4")
    val node5:Node = Node(null , "5")


    linkedList.add(node1).add(node2).add(node3).add(node4).add(node5)

    //linkedList.remove("3")

    linkedList.reverse()

    linkedList.showAll()

}