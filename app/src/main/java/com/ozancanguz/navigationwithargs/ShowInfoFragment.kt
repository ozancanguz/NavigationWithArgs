package com.ozancanguz.navigationwithargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgument
import kotlinx.android.synthetic.main.fragment_show_info.*


class ShowInfoFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: Bundle? = arguments
        var args=ShowInfoFragmentArgs.fromBundle(bundle!!)

        nametextview.text= args.name
        emailtextview.text=args.email

        GOHOMEBUTON.setOnClickListener {
            findNavController().navigate(R.id.action_showInfoFragment_to_welcomeFragment)

        }

    }
}