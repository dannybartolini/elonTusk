package bookstore.com.bookstore.wishlist;
import bookstore.com.bookstore.book.BookService;
import bookstore.com.bookstore.book.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class WishListController {


    @Autowired
    private WishListService wishlistService;


    @RequestMapping("/wish")
    public List<WishList> getAllWishList() {//list books that is in wishlist
        return wishlistService.getAllWishList();
        // List<WishList> wishlist = wishlistService.getAllWishList();
        // return wishlist;

    }

    @RequestMapping(method = RequestMethod.POST, value="/addwishlist")
    public void addWishLis(@RequestBody WishList wishList){
        wishlistService.addWishList(wishList);
    }


    @RequestMapping("/wishlist")//this function is for database wishlist
    public List<WishList> getallwishlist() {
        List<WishList> wishlist_Lists = wishlistService.getwishlist();
        return wishlist_Lists;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/wish/{Books}") //needs fixing
    public void deleteWish(@PathVariable String Books){
        wishlistService.deleteWish(Books);
    }



    @RequestMapping(method = RequestMethod.DELETE, value = "/wishlist/{Books}") //needs fixing
    public void deleteWishList(@PathVariable String Books){
        wishlistService.deleteWish(Books);
    }



    @RequestMapping(method = RequestMethod.POST, value = "/addwish")
    public void addWishList(@RequestBody WishList wishList) {
        wishlistService.addWish(wishList);



        /*
        @RequestMapping("/wishlist/{wishlistid}")
        public WishList getwishlistbooks(@PathVariable Integer wishlistid) {
            WishList wishinglist = wishlistService.getWishListBooksFromRepository(wishlistid);
            return wishinglist;fefefefe



   /*
   @RequestMapping("/wishlist/{wishlistName}")
   public WishList getWishList(@PathVariable String wishlistName){
   return wishlistService.getWishList(wishlistName);
   }

   @RequestMapping(method = RequestMethod.POST, value = "/wishlist")
   public void addWishList(@RequestBody WishList wishList){
   wishlistService.addWishList(wishList);
   }

   @RequestMapping(method = RequestMethod.DELETE, value = "/wishlist/{wishlistName}")
   public void deleteWishList(@PathVariable String wishlistName){
       wishlistService.deleteWishList(wishlistName);
   }




   /*
   public List<WishList> getAllWishList() {
       List<WishList> wishlists = wishlistService.getWishLists();
       return wishlists;
   }
   */

    }
}
