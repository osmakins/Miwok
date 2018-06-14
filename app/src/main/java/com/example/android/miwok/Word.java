package com.example.android.miwok;

/**
 * Created by OvercomerPC on 28/07/2017.
 */

public class Word {

    /** The default words in the language the user understands (such as english) */
    private int mDefaultTranslationId;

    /** Miwok translation for the word */
    private int mMiwokTranslationId;

    /** Image resource id for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    /** Create a new word object.
     *
     * @param defaultTranslationId is the string resource id of the word in english language
     *
     * @param miwokTranslationId is the string resource id of the word in the miwok language
     *
     * @param audioResourceId is for the audio resource id
     *
     */

    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId){
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mAudioResourceId = audioResourceId;
    }
    /** Create a new word object.
     *
     * @param defaultTranslationId is the string resource id of the word in english language
     *
     * @param miwokTranslationId is the string resource id word in the miwok language
     *
     * @param ImageResourceId is for the image resource id
     *
     */

    public Word(int defaultTranslationId, int miwokTranslationId, int ImageResourceId, int audioResourceId){
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public int getmDefaultTranslation(){
        return mDefaultTranslationId;
    }

    public int getmMiwokTranslation(){
        return mMiwokTranslationId;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns the audio resource ID of the word
     */
    public int getAudioResourceId(){ return mAudioResourceId;}

    /**
     * Returns where or not the resource id has image or not
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
