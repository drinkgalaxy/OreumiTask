package chapter07;

public class ItemManager extends Item{
    public static void main(String[] args) {
        Album album = new Album();
        String [] arr = {};
        System.out.println("상품 아이디: "+album.id+", 상품 이름: "+album.name+", 상품 가격: "+ album.price
                +", 작곡가: "+album.artist);

        Movie movie = new Movie();
        System.out.println("상품 아이디: "+movie.id+", 상품 이름: "+movie.name+", 상품 가격: "+ movie.price
                +", 감독: "+movie.director+", 배우: "+movie.actor);

        Book book = new Book();
        System.out.println("상품 아이디: "+book.id+", 상품 이름: "+book.name+", 상품 가격: "+ book.price
                +", 작가: "+book.author+", ISBN: "+book.isbn);

    }
}
