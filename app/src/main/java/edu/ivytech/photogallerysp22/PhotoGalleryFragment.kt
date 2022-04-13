
package edu.ivytech.photogallerysp22

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.ivytech.photogallerysp22.databinding.FragmentPhotoGalleryBinding

class PhotoGalleryFragment : Fragment() {

    private lateinit var binding : FragmentPhotoGalleryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPhotoGalleryBinding.inflate(layoutInflater, container, false)


        binding.photoRecyclerView.layoutManager = GridLayoutManager(context, 3)

        return binding.root
    }
/*
    private class PhotoHolder(itemTextView: TextView)
        : RecyclerView.ViewHolder(itemTextView) {

        val bindTitle: (CharSequence) -> Unit = itemTextView::setText
    }

    private class PhotoAdapter(private val galleryItems: List<GalleryItem>)
        : RecyclerView.Adapter<PhotoHolder>() {

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): PhotoHolder {
            val textView = TextView(parent.context)
            return PhotoHolder(textView)
        }

        override fun getItemCount(): Int = galleryItems.size

        override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
            val galleryItem = galleryItems[position]
            holder.bindTitle(galleryItem.title)
        }
    }

 */

}