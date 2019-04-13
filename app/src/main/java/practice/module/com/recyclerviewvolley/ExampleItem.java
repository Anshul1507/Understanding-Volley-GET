package practice.module.com.recyclerviewvolley;

public class ExampleItem {

    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public ExampleItem(String imageUrl,String creator,int likes){
        mCreator = creator;
        mImageUrl = imageUrl;
        mLikes = likes;
    }

    public int getLikeCount() {
        return mLikes;
    }

    public String getCreator() {
        return mCreator;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
}
