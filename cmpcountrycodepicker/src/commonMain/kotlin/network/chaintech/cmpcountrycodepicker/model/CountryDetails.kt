package network.chaintech.cmpcountrycodepicker.model

import org.jetbrains.compose.resources.DrawableResource

data class CountryDetails(
    var countryCode: String,
    val countryPhoneNumberCode: String,
    val countryName: String,
    val countryFlag: DrawableResource
)