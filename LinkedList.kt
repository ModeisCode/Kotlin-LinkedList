
class LinkedList {
    var root: Node = Node(null , "")

    fun add(`val`:Node) : LinkedList
    {
        var node:Node = root
        while (node.next != null) {
            node = node.next!!
        }

        node.next = `val`

        return this
    }

    fun remove(content: String)
    {
        var node:Node = root
        var before:Node? = node
        while (node.next != null) {
            if (node.content == content)
            {
                before?.next = node.next
            }

            before = node
            node = node.next!!
        }
    }

    fun reverse() {
        var prev: Node? = null
        var curr: Node? = root
        var next: Node? = null

        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        if (prev != null) {
            root = prev
        }
    }

    fun showAll() {
        var node:Node = root
        while (node.next != null) {
            node = node.next!!
            println("Content : " + node.content.toString())
        }
    }

}