package br.pro.aguiar.fdan1.carros.ui.carro.show

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.carros.FullActivity
import br.pro.aguiar.fdan1.carros.FullViewModel
import br.pro.aguiar.fdan1.carros.Questoes
import br.pro.aguiar.fdan1.carros.model.Carro
import kotlinx.android.synthetic.main.show_carro_fragment.*

class ShowCarroFragment : Fragment() {

    private lateinit var showCarroViewModel: ShowCarroViewModel
    private lateinit var fullViewModel: FullViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.show_carro_fragment, container, false)

            fullViewModel =
                ViewModelProvider(requireActivity())
                    .get(FullViewModel::class.java)

        fullViewModel
            .carro
            .observe(viewLifecycleOwner) {
                updateUI(it)
            }

        Questoes.questao1 = 4
        (requireActivity() as FullActivity).questao1 = 4
        //startActivity(Intent(requireActivity(), ResultadoActivity::class.java))

        return view
    }

    private fun updateUI(carro: Carro) {
        textViewShowCarroMarca.text = carro.marca
        textViewShowCarroModelo.text = carro.modelo
        textViewShowCarroPlaca.text = carro.placa
        textViewShowCarroValor.text = carro.preco.toString()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabShowCarroExcluir.setOnClickListener {
            val carro = fullViewModel.carro.value!!
            showCarroViewModel.delete(carro)
        }
    }

}