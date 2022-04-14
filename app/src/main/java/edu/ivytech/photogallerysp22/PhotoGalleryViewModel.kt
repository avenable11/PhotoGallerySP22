package edu.ivytech.photogallerysp22

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import edu.ivytech.photogallerysp22.api.GalleryItem

class PhotoGalleryViewModel : ViewModel() {
    val photosLiveData : LiveData<List<GalleryItem>> = FlickrFetchr().fetchPhotos()
}