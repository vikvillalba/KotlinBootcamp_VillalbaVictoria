import kotlin.random.Random


const val MAX_BORROW : Int = 5

object Constants {
    const val BASE_URL = "localhost/"
}



class Book(val title: String, val author: String, val year: Int, var pages : Int) {

    fun getTitleAuthor() : Pair<String, String>{
        return(title to author)
    }

    fun getTitleAuthorYear() : Triple<String, String, Int>{
        return Triple(title, author, year)
    }

    fun canBorrow(books: Int) : Boolean{
        return (books < MAX_BORROW)
    }

    fun printURL(){
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    fun weight() : Double {
        return this.pages * 1.5
    }

    fun tornPages(torn: Int) {
        if (pages >= torn) {
            pages -= torn
        } else {
            pages = 0
        }
    }

}

class Puppy{
    fun playWithBook(book : Book){
        val torn = Random.nextInt(1, 51)
        println("Puppy is chewing on ${book.title}...")
        book.tornPages(torn)
    }
}

fun main(){

    val myBook = Book("Oliver Twist", "Charles Dickens", 2010, 300)
    val myPuppy = Puppy()

    println("Initial status: ${myBook.title} has ${myBook.pages} pages and weighs ${myBook.weight()} grams.")

    while (myBook.pages > 0) {
        myPuppy.playWithBook(myBook)
        println("Pages left: ${myBook.pages} | Current Weight: ${myBook.weight()}g")
    }



    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Macbeth", "Othello")
    val library = mapOf("William Shakespeare" to allBooks)
    val libraryHasHamlet = library.any { it.value.contains("Hamlet") }

    println("Does the library contain Hamlet? $libraryHasHamlet")
    val moreBooks = mutableMapOf("The Hobbit" to "J.R.R. Tolkien")

    val author = moreBooks.getOrPut("1984") { "George Orwell" }

    println("Author returned by getOrPut: $author")
    println("Final Map: $moreBooks")

    val book = Book("The little prince", "me", 1900, 90)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println( "book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")


}

