package edu.ivytech.photogallerysp22.api

import com.google.gson.annotations.SerializedName

class FlickrResponse {
    lateinit var photos :PhotoResponse
}

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}

data class GalleryItem (var title: String = "",
                        var id: String = "",
                        @SerializedName("url_s") var url:String = "")
