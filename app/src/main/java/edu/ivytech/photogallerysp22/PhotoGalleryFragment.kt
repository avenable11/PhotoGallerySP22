
package edu.ivytech.photogallerysp22

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
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

    companion object {
        fun newInstance() = PhotoGalleryFragment()
    }
}