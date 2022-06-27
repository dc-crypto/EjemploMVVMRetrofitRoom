package com.diegocastro.ejemplomvvmretrofitroom.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.diegocastro.ejemplomvvmretrofitroom.domain.model.Quote

@Entity(tableName ="quote_table")
data class QuoteEntity (

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name="id") val id:Int=0,
    @ColumnInfo (name="quote") val quote:String,
    @ColumnInfo (name="author") val author:String)

fun Quote.toDataBase()=QuoteEntity(quote = quote, author = author)