package network.chaintech.cmpcountrycodepickersample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import network.chaintech.cmpcountrycodepicker.model.CountryDetails
import network.chaintech.cmpcountrycodepicker.ui.CountryPicker
import network.chaintech.cmpcountrycodepicker.ui.CountryPickerBasicTextField
import network.chaintech.cmpcountrycodepicker.ui.CountryPickerTextField
import network.chaintech.cmpcountrycodepickersample.theme.AppTheme

@Composable
internal fun App() = AppTheme {
    Column(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CountryPickerBasicText()

        CountryPicker(
            modifier = Modifier
                .padding(top = 40.dp)
                .background(Color(0xFFF4F4F4), RoundedCornerShape(40.dp))
                .clip(RoundedCornerShape(40.dp))
                .padding(start = 8.dp, end = 4.dp, top = 4.dp, bottom = 4.dp),
            defaultCountryCode = "ad",
            showVerticalDivider = false,
        ) { selectedCountry ->
            println("selectedCountry $selectedCountry")
        }

        CountryPickerText()
    }
}


@Composable
fun CountryPickerBasicText() {
    val selectedCountryState: MutableState<CountryDetails?> = remember {
        mutableStateOf(null)
    }
    var mobileNumber by remember {
        mutableStateOf("")
    }

    CountryPickerBasicTextField(
        mobileNumber = mobileNumber,
        defaultCountryCode = "ad",
        onMobileNumberChange = {
            mobileNumber = it
        },
        onCountrySelected = {
            selectedCountryState.value = it
        },
        modifier = Modifier.fillMaxWidth(),
        defaultPaddingValues = PaddingValues(6.dp),
        showCountryFlag = true,
        showCountryPhoneCode = true,
        showCountryName = false,
        showCountryCode = false,
        showArrowDropDown = true,
        spaceAfterCountryFlag = 8.dp,
        spaceAfterCountryPhoneCode = 6.dp,
        spaceAfterCountryName = 6.dp,
        spaceAfterCountryCode = 6.dp,
        label = {
            Text(text = "Mobile Number")
        },
        focusedBorderThickness = 2.dp,
        unfocusedBorderThickness = 1.dp,
        shape = RoundedCornerShape(10.dp),
        verticalDividerColor = Color(0XFFDDDDDD),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(0XFFDDDDDD),
            unfocusedBorderColor = Color(0XFFDDDDDD)
        )
    )
}


@Composable
fun CountryPickerText() {
    val selectedCountryState: MutableState<CountryDetails?> = remember {
        mutableStateOf(null)
    }
    var mobileNumber by remember {
        mutableStateOf("")
    }

    Column {
        CountryPickerTextField(
            mobileNumber = mobileNumber,
            defaultCountryCode = "ad",
            onMobileNumberChange = {
                mobileNumber = it
            },
            onCountrySelected = {
                selectedCountryState.value = it
            },
            modifier = Modifier.padding(top = 40.dp).fillMaxWidth(),
            showCountryFlag = true,
            showCountryPhoneCode = true,
            showCountryName = false,
            showCountryCode = false,
            spaceAfterCountryFlag = 8.dp,
            spaceAfterCountryPhoneCode = 6.dp,
            spaceAfterCountryName = 6.dp,
            spaceAfterCountryCode = 6.dp,
            placeholder = {
                Text(text = "Mobile Number")
            },
            verticalDividerColor = Color(0XFFDDDDDD)
        )
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color(0XFFDDDDDD)
        )
    }

}