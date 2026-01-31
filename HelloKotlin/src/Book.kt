open class Book (val title : String, val author : String){
    private var currentPage = 0

    open fun readPage(){
        currentPage ++
        println("Turned a page in ${title}. Current page: $currentPage")
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author){
    private var wordCount = 0

    override fun readPage() {
        wordCount += 250
        println("Read a page on the eBook ($format). Word count: $wordCount")
    }
}

fun main() {
    println("--- Physical Book ---")
    val heavyTome = Book("War and Peace", "Leo Tolstoy")
    heavyTome.readPage()
    heavyTome.readPage()

    println("\n--- eBook ---")
    val digitalReader = eBook("The Martian", "Andy Weir")
    digitalReader.readPage()
    digitalReader.readPage()
}