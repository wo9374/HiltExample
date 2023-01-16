package com.ljb.domain.usecase

import com.ljb.domain.model.NumberModel
import com.ljb.domain.repository.NumbersRepository
import kotlinx.coroutines.flow.Flow

class GetNumbersUseCase(private val repository: NumbersRepository){
    operator fun invoke(): Flow<List<NumberModel>>{
        return repository.getNumbers()
    }
}
class InsertNumberUseCase(private val repository: NumbersRepository) {
    suspend operator fun invoke(value: Int) {
        val number = NumberModel(id = 0, value = value)
        repository.insertNumber(number)
    }
}

class ClearNumbersUseCase(private val repository: NumbersRepository) {
    suspend operator fun invoke() {
        repository.clearNumbers()
    }
}