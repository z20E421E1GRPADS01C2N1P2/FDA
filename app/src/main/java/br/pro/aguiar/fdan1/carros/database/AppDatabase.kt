package br.pro.aguiar.fdan1.carros.database

import br.pro.aguiar.fdan1.carros.model.Carro

class AppDatabase {
    private val carros = mutableListOf(
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Fiat", "Uno", "TRF4F45", 10000f),
        Carro("Fiat", "Palio", "FDE4F84", 13000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f),
        Carro("Ford", "Fiesta", "ESD4F24", 18000f)
    )
    fun all() : MutableList<Carro> {
        return carros
    }

    companion object {
        private var instance: AppDatabase? = null
        fun getInstance(): AppDatabase {
            if (instance == null)
                instance = AppDatabase()
            return instance as AppDatabase
        }
    }
}