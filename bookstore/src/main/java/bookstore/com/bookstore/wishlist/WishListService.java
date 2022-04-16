package bookstore.com.bookstore.wishlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bookstore.com.bookstore.book.BookRepository;
import bookstore.com.bookstore.book.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishListService {



private List<WishList> wishLists = new ArrayList<>(Arrays.asList(  //if there is issue check the name "wishLists" if it's correct
        new WishList(1, "Terrancewishlist", 1, "Romeo and Juliet"),
         new WishList(2, "Terrancewishlist", 1, "Hamlet"),
         new WishList(4, "Brianewishlist", 2, "Macbeth")

       ));


    @Autowired
    public WishListRepository wishlistRepository;

   /*
   public List<WishList> getWishes(){
       List<WishList> wishLists = new ArrayList<>();
        wishlistRepository.findAll().forEach(wishLists::add);
       return wishLists;
   }
*/



    public List<WishList> getwishlist(){
        List<WishList> wishlist_List = new ArrayList<>();
        wishlist_List = wishlistRepository.findAll();
        return wishlist_List;
    }




    public void addWish(WishList wishList) {

        wishLists.add(wishList);
    }


    public void addWishList(WishList wishList) {
        wishlistRepository.save(wishList);
    }



   public List<WishList> getAllWishList() {
      // List<WishList> wishLists = new ArrayList<>();
      // wishlistRepository.findAll().forEach(wishLists::add);
       return wishLists;

   }

    public void deleteWish(String Books) {
        wishLists.removeIf(wishList -> wishList.getBooks().equals(Books));
    }

    public void deleteWishList(WishList wishList) {
        wishlistRepository.delete(wishList);
    }

    public WishList getWishListBooksFromRepository(Integer wishlistId){
        //return the list of ALL Books by genre
        return wishlistRepository.findById(wishlistId).orElse(null);
    }
   /*

   public WishList getWishListBooksByGenre(Integer genreid){
       //return the list of ALL Books by genre
       return  wishlistRepository.findById(genreid).orElse(null);
   }


/*

   public WishList getWishList(String wishlistName){
       return wishLists.stream().filter(wishList -> wishList.getwishlistName().equals(wishlistName)).findFirst().get();
   } //either wishList or t

   public void addWishList(WishList wishList) {

       wishLists.add(wishList);
   }

   public void deleteWishList(String wishlistName) {
       wishLists.removeIf(wishList -> wishList.getwishlistName().equals(wishlistName));
   }
*/


   /*
   @Autowired
   public WishListRepository wishlistRepository;

   public List<WishList> getWishLists(){
       List<WishList> wishlistList = new ArrayList<>();
       wishlistRepository.findAll().forEach(wishlistList::add);
       return wishlistList;
   }



     public List<book> getBooks(){
       //return the list of ALL Books
       List<book> BookList = new ArrayList<>();
       BookRepository.findAll().forEach(BookList::add);
       return BookList;
   }

     @RequestMapping("/books")
   public List<book> getAllBooks() {
       List<book> Books = BookService.getBooks();
       return Books;
   }


    */
}


