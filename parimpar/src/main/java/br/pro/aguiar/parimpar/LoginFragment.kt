package br.pro.aguiar.parimpar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.pro.aguiar.parimpar.viewmodel.AppViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private lateinit var appViewModel: AppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        appViewModel =
            ViewModelProvider(requireActivity())
                .get(AppViewModel::class.java)

        return inflater.inflate(
            R.layout.fragment_login,
            container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLoginAcessar.setOnClickListener {
            val nomeJogador = editTextLoginNomeJogador.text.toString()
            if (!nomeJogador.isNullOrBlank()){
                appViewModel.iniciarJogo(nomeJogador)
                findNavController().navigate(R.id.jogoFragment)
            } else
                Snackbar.make(
                    root_login_layout,
                    "Informe um nome, jogador!",
                    Snackbar.LENGTH_LONG
                ).show()
        }
    }
}