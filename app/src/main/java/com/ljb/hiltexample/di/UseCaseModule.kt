package com.ljb.hiltexample.di

import com.ljb.domain.repository.NumbersRepository
import com.ljb.domain.usecase.ClearNumbersUseCase
import com.ljb.domain.usecase.GetNumbersUseCase
import com.ljb.domain.usecase.InsertNumberUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetNumbersUseCase(repository: NumbersRepository) = GetNumbersUseCase(repository)

    @Provides
    fun provideInsertNumberUseCase(repository: NumbersRepository) = InsertNumberUseCase(repository)

    @Provides
    fun provideClearNumbersUseCase(repository: NumbersRepository) = ClearNumbersUseCase(repository)
}