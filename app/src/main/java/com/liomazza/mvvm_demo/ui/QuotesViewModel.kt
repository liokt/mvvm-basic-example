package com.liomazza.mvvm_demo.ui

import androidx.lifecycle.ViewModel
import com.liomazza.mvvm_demo.data.Quote
import com.liomazza.mvvm_demo.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}