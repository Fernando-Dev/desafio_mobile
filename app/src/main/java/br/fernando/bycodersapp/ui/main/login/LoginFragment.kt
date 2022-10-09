package br.fernando.bycodersapp.ui.main.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import br.fernando.bycodersapp.R
import br.fernando.bycodersapp.databinding.FragmentLoginBinding
import br.fernando.bycodersapp.ui.MainActivity

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as MainActivity).supportActionBar?.hide()
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initLayouts()
    }

    private fun initLayouts() {

        binding.button.setOnClickListener {

            binding.button
            this.findNavController()
                .navigate(R.id.action_loginFragment_to_mapsFragment)
        }
    }

}