
import java.util.ArrayList;
import java.util.List;

    public class Book{
        public String title;
        public String author;
        private String isban;
        int copiesAvailable;

        public Book (String title,String author,String isban,int copiesAvailable){
            this.title=title;
            this.author=author;
            this.isban=isban;
            this.copiesAvailable=copiesAvailable;
        }
        public String getisban(){
            return isban;
        }
        public void setCopiesAvailable(int copies){
            this.copiesAvailable=copies;
        }
        public int getCopiesAvailable(){
            return copiesAvailable;
        }

    }



