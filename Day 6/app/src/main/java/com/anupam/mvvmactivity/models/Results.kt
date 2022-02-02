package com.anupam.mvvmactivity.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Results (

  @PrimaryKey(autoGenerate = true)
  val quoteInt: Int,
  val Id           : String,
  val author       : String,
  val content      : String,
  val authorSlug   : String,
  val length       : Int,
  val dateAdded    : String,
  val dateModified : String,
  val tags         : List<String>

)