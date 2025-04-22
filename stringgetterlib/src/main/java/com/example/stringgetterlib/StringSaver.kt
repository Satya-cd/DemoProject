package com.example.stringgetterlib

class StringSaver {
    private var savedStrings = mutableListOf<String>()
    fun saveStringsToList(string: String){
        savedStrings.add(string)
    }
    fun getSaveList(): MutableList<String>{
        return savedStrings
    }
}


