package br.pro.aguiar.fdan1.carros.ui.carro.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.pro.aguiar.fdan1.R
import br.pro.aguiar.fdan1.carros.FullViewModel
import br.pro.aguiar.fdan1.carros.adapter.CarroRecyclerAdapter
import br.pro.aguiar.fdan1.carros.model.Carro
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.list_carro_fragment.*

class ListCarroFragment : Fragment() {

    private lateinit var listCarroViewModel: ListCarroViewModel
    private lateinit var fullViewModel: FullViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.list_carro_fragment, container, false)

        fullViewModel =
            ViewModelProvider(requireActivity())
                .get(FullViewModel::class.java)

        listCarroViewModel =
            ViewModelProvider(this)
                .get(ListCarroViewModel::class.java)

        listCarroViewModel
            .status
            .observe(viewLifecycleOwner) {
                //if (it)
                    // finalizar o progressBar
            }

        listCarroViewModel
            .msg
            .observe(viewLifecycleOwner) {
                if (!it.isNullOrBlank())
                    showSnackbar(it)
            }

        listCarroViewModel
            .carros
            .observe(viewLifecycleOwner) { carros ->
                val carroRecyclerAdapter = CarroRecyclerAdapter(carros, this::actionClick)
                listViewCarros.adapter = carroRecyclerAdapter
                listViewCarros.layoutManager = LinearLayoutManager(requireContext())
            }

        return view
    }

    fun actionClick(carro: Carro) {
        fullViewModel.selectCar(carro)
        findNavController().navigate(R.id.showCarroFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // (Carro) -> Unit
//        listViewCarros.setOnItemClickListener { adapterView, view, i, l ->
//            val listaCarros = listCarroViewModel.carros.value!!
//            val carro = listaCarros.get(i)
//            fullViewModel.selectCar(carro)
//            findNavController().navigate(R.id.showCarroFragment)
//        }

        fabListCarroCadastro.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.createCarroFragment)
        }
    }


    private fun showSnackbar(msg: String) {
        Snackbar.make(
            list_carro_layout_root,
            msg,
            Snackbar.LENGTH_LONG
        ).show()
    }
}