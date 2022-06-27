package com.diegocastro.ejemplomvvmretrofitroom.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.diegocastro.ejemplomvvmretrofitroom.data.database.dao.QuoteDao
import com.diegocastro.ejemplomvvmretrofitroom.data.database.entities.QuoteEntity

@Database(entities = [QuoteEntity::class], version = 1)
abstract class QuoteDataBase : RoomDatabase(){

    abstract fun getQuoteDao(): QuoteDao
}