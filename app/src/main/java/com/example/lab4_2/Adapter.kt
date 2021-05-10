package com.example.lab4_2
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import name.ank.lab4.BibDatabase
import java.lang.IllegalArgumentException

//бесконечный
class Adapter(private val entriesNumber: Int, val currentDatabase: BibDatabase) :
    RecyclerView.Adapter<ViewHolder<*>>() {

    override fun getItemViewType(position: Int): Int {
        return currentDatabase.getEntry(position % entriesNumber).type.ordinal
        //return currentDatabase.getEntry(position).type.ordinal
    }

    override fun getItemCount(): Int {
        return Integer.MAX_VALUE
        //return entriesNumber
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<*> {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (name.ank.lab4.Types.values()[viewType]) {
            name.ank.lab4.Types.ARTICLE -> {
                ArticleViewHolder(
                    layoutInflater.inflate(R.layout.article, parent, false)
                )
            }
            name.ank.lab4.Types.MISC -> {
                MiscViewHolder(
                    layoutInflater.inflate(R.layout.misc, parent, false)
                )
            }
            name.ank.lab4.Types.INPROCEEDINGS -> {
                InproceedingsViewHolder(
                    layoutInflater.inflate(R.layout.inproceedings, parent, false)
                )
            }
            name.ank.lab4.Types.TECHREPORT -> {
                TechreportViewHolder(
                    layoutInflater.inflate(R.layout.techreport, parent, false)
                )
            }
            name.ank.lab4.Types.UNPUBLISHED -> {
                UnpublishedViewHolder(
                    layoutInflater.inflate(R.layout.unpublished, parent, false)
                )
            }
            name.ank.lab4.Types.BOOK -> {
                BookViewHolder(
                    layoutInflater.inflate(R.layout.book, parent, false)
                )
            }
            name.ank.lab4.Types.INCOLLECTION -> {
                IncollectionViewHolder(
                    layoutInflater.inflate(R.layout.incollection, parent, false)
                )
            }
            else -> {
                throw IllegalArgumentException("Illegal type")
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder<*>, position: Int) {
        val currentEntry = currentDatabase.getEntry(position % entriesNumber)
        //val currentEntry = currentDatabase.getEntry(position)
        when (currentEntry.type) {
            name.ank.lab4.Types.ARTICLE -> (holder as ArticleViewHolder).bind(currentEntry)
            name.ank.lab4.Types.MISC -> (holder as MiscViewHolder).bind(currentEntry)
            name.ank.lab4.Types.INPROCEEDINGS -> (holder as InproceedingsViewHolder).bind(currentEntry)
            name.ank.lab4.Types.TECHREPORT -> (holder as TechreportViewHolder).bind(currentEntry)
            name.ank.lab4.Types.UNPUBLISHED -> (holder as UnpublishedViewHolder).bind(currentEntry)
            name.ank.lab4.Types.BOOK -> (holder as BookViewHolder).bind(currentEntry)
            name.ank.lab4.Types.INCOLLECTION -> (holder as IncollectionViewHolder).bind(currentEntry)
            else -> throw IllegalArgumentException("Illegal type")
        }
    }
}



//import name.ank.lab4.BibEntry
//import name.ank.lab4.Types


//class Adapter(private val entriesList: List<BibEntry>) :
//    RecyclerView.Adapter<ViewHolder<*>>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder<*> {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return when (Types.values()[viewType]) {
//            Types.ARTICLE -> {
//                ArticleViewHolder(
//                    layoutInflater.inflate(R.layout.article, parent, false)
//                )
//            }
//            Types.MISC -> {
//                MiscViewHolder(
//                    layoutInflater.inflate(R.layout.misc, parent, false)
//                )
//            }
//            Types.INCOLLECTION -> {
//                IncollectionViewHolder(
//                    layoutInflater.inflate(R.layout.incollection, parent, false)
//                )
//            }
//            Types.UNPUBLISHED -> {
//                UnpublishedViewHolder(
//                    layoutInflater.inflate(R.layout.unpublished, parent, false)
//                )
//            }
//            Types.INPROCEEDINGS -> {
//                InproceedingsViewHolder(
//                    layoutInflater.inflate(R.layout.inproceedings, parent, false)
//                )
//            }
//            Types.TECHREPORT -> {
//                TechreportViewHolder(
//                    layoutInflater.inflate(R.layout.techreport, parent, false)
//                )
//            }
//            Types.BOOK -> {
//                BookViewHolder(
//                    layoutInflater.inflate(R.layout.book, parent, false)
//                )
//            }
//            else -> {
//                throw IllegalArgumentException("Illegal type")
//            }
//        }
//    }
//    override fun onBindViewHolder(holder: ViewHolder<*>, position: Int) {
//        //val currentEntry = entriesList[position]
//        val positionInList = position % entriesList.size
//        val currentEntry = entriesList[positionInList]
//        when (currentEntry.type) {
//            Types.ARTICLE -> (holder as ArticleViewHolder).bind(currentEntry)
//            Types.MISC -> (holder as MiscViewHolder).bind(currentEntry)
//            Types.INCOLLECTION -> (holder as IncollectionViewHolder).bind(currentEntry)
//            Types.UNPUBLISHED -> (holder as UnpublishedViewHolder).bind(currentEntry)
//            Types.INPROCEEDINGS -> (holder as InproceedingsViewHolder).bind(currentEntry)
//            Types.TECHREPORT -> (holder as TechreportViewHolder).bind(currentEntry)
//            Types.BOOK -> (holder as BookViewHolder).bind(currentEntry)
//            else -> throw IllegalArgumentException("Illegal type")
//        }
//    }
//
//    override fun getItemViewType(position: Int): Int {
//        //return entriesList[position].type.ordinal
//        return entriesList[position % entriesList.size].type.ordinal
//    }
//
//    override fun getItemCount(): Int {
//        //return entriesList.size
//        return Integer.MAX_VALUE
//    }
//}

//конечный
//class Adapter(private val entriesNumber: Int, val currentDatabase:
//BibDatabase) :
//    RecyclerView.Adapter<ViewHolder<*>>() {
//    override fun getItemViewType(position: Int): Int {
//        return currentDatabase.getEntry(position).type.ordinal
//    }
//    override fun getItemCount(): Int {
//        return entriesNumber
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
//            ViewHolder<*> {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        return when (Types.values()[viewType]) {
//            Types.ARTICLE -> {
//                ArticleViewHolder(
//                    layoutInflater.inflate(R.layout.article, parent, false)
//                )
//            }
//            Types.MISC -> {
//                MiscViewHolder(
//                    layoutInflater.inflate(R.layout.misc, parent, false)
//                )
//            }
//            Types.INPROCEEDINGS -> {
//                InproceedingsViewHolder(
//                    layoutInflater.inflate(R.layout.inproceedings, parent,
//                        false)
//                )
//            }
//            Types.TECHREPORT -> {
//                TechreportViewHolder(
//                    layoutInflater.inflate(R.layout.techreport, parent,
//                        false)
//                )
//            }
//            Types.UNPUBLISHED -> {
//                UnpublishedViewHolder(
//                    layoutInflater.inflate(R.layout.unpublished, parent,
//                        false)
//                )
//            }
//            Types.BOOK -> {
//                BookViewHolder(
//                    layoutInflater.inflate(R.layout.book, parent, false)
//                )
//            }
//            Types.INCOLLECTION -> {
//                IncollectionViewHolder(
//                    layoutInflater.inflate(R.layout.incollection, parent,
//                        false)
//                )
//            }
//            else -> {
//                throw IllegalArgumentException("Illegal type")
//            }
//        }
//    }
//    override fun onBindViewHolder(holder: ViewHolder<*>, position: Int) {
//        val currentEntry = currentDatabase.getEntry(position)
//        when (currentEntry.type) {
//            Types.ARTICLE -> (holder as ArticleViewHolder).bind(currentEntry)
//            Types.MISC -> (holder as MiscViewHolder).bind(currentEntry)
//            Types.INPROCEEDINGS -> (holder as
//                    InproceedingsViewHolder).bind(currentEntry)
//            Types.TECHREPORT -> (holder as
//                    TechreportViewHolder).bind(currentEntry)
//            Types.UNPUBLISHED -> (holder as
//                    UnpublishedViewHolder).bind(currentEntry)
//            Types.BOOK -> (holder as BookViewHolder).bind(currentEntry)
//            Types.INCOLLECTION -> (holder as
//                    IncollectionViewHolder).bind(currentEntry)
//            else -> throw IllegalArgumentException("Illegal type")
//        }
//    }
//}
