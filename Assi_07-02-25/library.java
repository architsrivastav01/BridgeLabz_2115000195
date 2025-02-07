public class library {
public static void main(String[] args) {
        Author author = new Author("The Great Gatsby", 1925);
        author.displayInfo("F. Scott Fitzgerald", "American novelist and short-story writer.");
    }
}
class Book{
    String title;
    int publicationYear;
   
    public void displayInfo(){
        System.out.println("Display information");
    }
}

class Author extends Book{
    String authorName;
    String bio;

    Author(String title, int publicationYear){
        this.title=title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo(String authorName, String bio){
        System.out.println("Title:" +title+ "Publication Year:" + publicationYear +"Author Name:" + authorName + "Bio:"+bio);
    }
}
