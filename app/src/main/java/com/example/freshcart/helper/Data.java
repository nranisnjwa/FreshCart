package com.example.freshcart.helper;

import com.example.freshcart.model.Category;
import com.example.freshcart.model.Offer;
import com.example.freshcart.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Food", "https://image.flaticon.com/icons/png/512/262/262344.png");
        categoryList.add(category);
        category = new Category("2", "Home & Cleaning", "https://lisasnatural.com/wp-content/uploads/2018/05/housecleanicon-300x228.jpg");
        categoryList.add(category);
        category = new Category("3", "Baby Care", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        category = new Category("4", "sports & Nutrition", "https://kathleenhalme.com/images/nutrition-clipart-sport.jpg");
        categoryList.add(category);
        category = new Category("5", "Pet care", "http://kasperstromman.files.wordpress.com/2013/05/dog-cat-above-board.jpg");
        categoryList.add(category);
        category = new Category("6", "Health & Household", "https://thumbs.dreamstime.com/b/household-cleaning-products-accessories-basket-there-mop-detergents-rubber-gloves-glass-cleaner-sponges-89944820.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "Rp.", "20000", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("2", "1", "Banana", "", "1 Bounch", "Rp.", "10600", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        productList.add(product);
        product = new Product("3", "2", "Detergent", "", "3 Lit.", "Rp.", "75000", "", "https://i.pinimg.com/564x/6f/81/80/6f81804c4252a5e1d690a367416359f0.jpg");
        productList.add(product);
        product = new Product("4", "2", "Mop", "", "1 Piece", "Rp.", "100000", "10% OFF", "https://i.pinimg.com/564x/b2/69/1e/b2691e49bf5dc6f09d51919de8123fb7.jpg");
        productList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Pack", "Rp.", "50000", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        productList.add(product);
        product = new Product("6", "3", "Baby Oil", "", "500 Ml", "Rp.", "31000", "", "https://i.pinimg.com/564x/77/cc/93/77cc93be0b8ad192f647d2075a7daa99.jpg");
        productList.add(product);
        product = new Product("7", "4", "House Clean Items", "", "1 Piece", "Rp.", "10000", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        productList.add(product);
        product = new Product("8", "4", "Indomie", "", "1 Pack", "Rp.", "10500", "", "https://i.pinimg.com/564x/ed/28/26/ed28268873210a34a2d06dfb8b547421.jpg");
        productList.add(product);
        product = new Product("9", "5", "Mushroom", "", "1 Kg", "Rp.", "16000", "", "https://i.pinimg.com/564x/97/ad/f1/97adf1a0274c510d4157e2359256eb74.jpg");
        productList.add(product);
        product = new Product("10", "5", "Potato", "", "1 Kg", "Rp.", "30000", "", "https://i.pinimg.com/564x/cb/21/cc/cb21cc02a85413f42ee40f3820971fc5.jpg");
        productList.add(product);
        product = new Product("11", "6", "Lays", "", "1 Pack", "Rp.", "27000", "", "https://i.pinimg.com/564x/cd/78/b6/cd78b6d8dfd4dc35ee65f06d5b33cadf.jpg");
        productList.add(product);
        product = new Product("12", "6", "Popcorn", "", "1 Pack", "Rp.", "28000", "", "https://i.pinimg.com/564x/c2/d6/35/c2d6352038fca9c9cc3da7776690f75c.jpg");
        productList.add(product);
        product = new Product("13", "1", "Lychee", "", "1 Kg", "Rp.", "18000", "30%OFF", "https://cdn.shopify.com/s/files/1/0665/4989/products/lichee-485x400_grande.jpg");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Apple", "", "1 Kg", "Rp.", "20000", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        newList.add(product);
        product = new Product("2", "1", "Mushroom", "", "1 Bunch", "Rp.", "16000", "20% OFF", "https://i.pinimg.com/564x/97/ad/f1/97adf1a0274c510d4157e2359256eb74.jpg");
        newList.add(product);
        product = new Product("3", "2", "Detergent", "", "3 Lit.", "Rp.", "75000", "", "https://i.pinimg.com/564x/6f/81/80/6f81804c4252a5e1d690a367416359f0.jpg");
        newList.add(product);
        product = new Product("4", "2", "Popcorn", "", "1 Pack", "Rp.", "28000", "", "https://i.pinimg.com/564x/c2/d6/35/c2d6352038fca9c9cc3da7776690f75c.jpg");
        newList.add(product);
        product = new Product("5", "3", "Pampers", "", "1 Pack", "Rp.", "50000", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Baby Oil", "", "500 Ml", "Rp.", "31000", "", "https://i.pinimg.com/564x/77/cc/93/77cc93be0b8ad192f647d2075a7daa99.jpg");
        popularList.add(product);
        product = new Product("7", "4", "Indomie", "", "1 Pack", "Rp.", "10500", "", "https://i.pinimg.com/564x/ed/28/26/ed28268873210a34a2d06dfb8b547421.jpg");
        popularList.add(product);
        product = new Product("8", "4", "House Clean Items", "", "1 Piece", "Rp.", "10000", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        popularList.add(product);
        product = new Product("9", "5", "Mushroom", "", "1 Kg", "Rp.", "16000", "", "https://i.pinimg.com/564x/97/ad/f1/97adf1a0274c510d4157e2359256eb74.jpg");
        popularList.add(product);
        product = new Product("10", "5", "Potato", "", "1 Kg", "Rp.", "30000", "", "https://i.pinimg.com/564x/cb/21/cc/cb21cc02a85413f42ee40f3820971fc5.jpg");
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://d1csarkz8obe9u.cloudfront.net/posterpreviews/grocery-sale-discount-flyer-poster-template-design-0e4351f867ad709de7ace8109bb3fb18_screen.jpg");
        offerList.add(offer);
        offer = new Offer("https://dealroup.com/wp-content/uploads/2020/05/Grocery-Offers-1024x536.jpg");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/SVD/July18/750x375.png");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/BreakfastStore/kmande_2018-06-15T12-00_f010a5_1121973_grocery_750x375.jpg");
        offerList.add(offer);


        return offerList;
    }
}
