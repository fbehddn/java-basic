package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "어바웃타임";
        movieReview1.review = "재밌음";
        movieReviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "인셉션";
        movieReview2.review = "무서움";
        movieReviews[1] = movieReview2;

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: "+ movieReview.title+", 리뷰: " +movieReview.review);

        }
    }
}
