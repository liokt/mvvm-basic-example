package com.liomazza.mvvm_demo.utilities

import com.liomazza.mvvm_demo.data.FakeDatabase
import com.liomazza.mvvm_demo.data.QuoteRepository
import com.liomazza.mvvm_demo.ui.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}