package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "어바웃타임";
        movieReview1.review = "재밌음";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "인셉션";
        movieReview2.review = "무서움";

        System.out.println("영화 제목: "+ movieReview1.title+", 리뷰: " +movieReview1.review);
        System.out.println("영화 제목: "+ movieReview2.title+", 리뷰: " +movieReview2.review);
    }
}
