package com.example.pampertemuan12.ui.view.mahasiswa

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pampertemuan12.ui.navigation.DestinasiNavigasi
import com.example.pampertemuan12.ui.viewmodel.InsertViewModel

object DestinasiEntry: DestinasiNavigasi {
    override val route= "item_entry"
    override val titleRes = "Entry Mhs"

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntryMhsScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: InsertViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
}