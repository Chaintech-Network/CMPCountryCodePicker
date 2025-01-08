package network.chaintech.cmpcountrycodepicker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import network.chaintech.cmpcountrycodepicker.model.CountryDetails
import network.chaintech.cmpcountrycodepicker.utils.Utils
import network.chaintech.cmpcountrycodepicker.utils.Utils.noRippleClickable
import network.chaintech.cmpcountrycodepicker.utils.Utils.searchCountry
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun CountryDialog(
    modifier: Modifier = Modifier,
    countryList: List<CountryDetails>,
    onDismissRequest: () -> Unit,
    onSelected: (item: CountryDetails) -> Unit,
    properties: DialogProperties = DialogProperties(usePlatformDefaultWidth = false)
) {
    var searchValue by remember { mutableStateOf("") }
    var filteredCountries by remember { mutableStateOf(countryList) }
    val focusRequester = remember { FocusRequester() }

    BasicAlertDialog(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(12.dp)),
        onDismissRequest = onDismissRequest,
        properties = properties,
        content = {
            Surface(
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Scaffold { paddingValues ->
                    Column(modifier = Modifier.padding(horizontal = 4.dp).fillMaxWidth()) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.padding(start = 12.dp),
                                text = "Select Country",
                                style = MaterialTheme.typography.titleLarge,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            IconButton(modifier = Modifier.padding(end = 6.dp), onClick = {
                                onDismissRequest()
                            }) {
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = null,
                                )
                            }
                        }

                        BasicTextField(
                            value = searchValue,
                            onValueChange = { searchStr ->
                                searchValue = searchStr
                                filteredCountries =
                                    searchCountry(searchStr, countryList)
                            },
                            modifier = Modifier
                                .padding(horizontal = 12.dp)
                                .focusRequester(focusRequester)
                                .fillMaxWidth()
                                .background(Color(0xFFEFEFEF), RoundedCornerShape(10.dp))
                                .clip(RoundedCornerShape(10.dp)),
                            textStyle = MaterialTheme.typography.bodyLarge,
                            decorationBox = @Composable { innerTextField ->
                                OutlinedTextFieldDefaults.DecorationBox(
                                    value = searchValue,
                                    visualTransformation = VisualTransformation.None,
                                    interactionSource = remember { MutableInteractionSource() },
                                    enabled = true,
                                    singleLine = true,
                                    innerTextField = innerTextField,
                                    placeholder = {
                                        Text(
                                            text = "Search",
                                            color = Color(0XFF939393),
                                            style = MaterialTheme.typography.bodyLarge

                                        )
                                    },
                                    leadingIcon = {
                                        IconButton(
                                            modifier = Modifier.size(26.dp),
                                            onClick = {
                                                onDismissRequest()
                                            }
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.Search,
                                                contentDescription = null,
                                                tint = Color(0XFF939393)
                                            )
                                        }
                                    },
                                    colors = TextFieldDefaults.colors(
                                        disabledContainerColor = Color.Transparent,
                                        focusedContainerColor = Color.Transparent,
                                        unfocusedContainerColor = Color.Transparent,
                                        disabledIndicatorColor = Color.Transparent,
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent,
                                    ),
                                    container = {},
                                    contentPadding = PaddingValues(0.dp),
                                )
                            }
                        )

                        LazyColumn(
                            Modifier
                                .padding(paddingValues)
                                .padding(top = 10.dp)
                                .fillMaxSize(),
                        ) {
                            val countriesData =
                                if (searchValue.isEmpty()) {
                                    countryList
                                } else {
                                    filteredCountries
                                }
                            items(countriesData) { countryItem ->
                                Column {
                                    ListItem(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .noRippleClickable {
                                                onSelected(countryItem)
                                            },
                                        leadingContent = {
                                            Image(
                                                modifier = modifier.size(36.dp).clip(CircleShape)
                                                    .border(
                                                        1.dp,
                                                        Color(0xFFD6D6D6),
                                                        CircleShape
                                                    ),
                                                painter = painterResource(countryItem.countryFlag),
                                                contentDescription = null,
                                                contentScale = ContentScale.FillBounds
                                            )
                                        },
                                        trailingContent = {
                                            Text(
                                                text = countryItem.countryPhoneNumberCode,
                                                style = MaterialTheme.typography.bodyLarge,
                                            )
                                        },
                                        headlineContent = {
                                            Text(
                                                text = countryItem.countryName,
                                                style = MaterialTheme.typography.bodyLarge,
                                            )
                                        },
                                    )
                                    HorizontalDivider(
                                        modifier = Modifier.padding(horizontal = 12.dp)
                                            .fillMaxWidth(),
                                        thickness = 1.dp,
                                        color = Color(0xFFEEEEEE)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
    )
}

@Composable
fun CountryPicker(
    modifier: Modifier = Modifier,
    defaultCountryCode: String,
    defaultPaddingValues: PaddingValues = PaddingValues(4.dp, 6.dp),
    showCountryFlag: Boolean = true,
    showCountryPhoneCode: Boolean = true,
    showCountryName: Boolean = false,
    showCountryCode: Boolean = false,
    showArrowDropDown: Boolean = true,
    showVerticalDivider: Boolean = true,
    spaceAfterCountryFlag: Dp = 8.dp,
    spaceAfterCountryPhoneCode: Dp = 6.dp,
    spaceAfterCountryName: Dp = 6.dp,
    spaceAfterCountryCode: Dp = 6.dp,
    spaceAfterDropDownArrow: Dp = 0.dp,
    spaceAfterVerticalDivider: Dp = 4.dp,
    countryFlagSize: Dp = 24.dp,
    verticalDividerColor: Color = MaterialTheme.colorScheme.onSurface,
    verticalDividerHeight: Dp = 26.dp,
    countryPhoneCodeTextStyle: TextStyle = TextStyle(),
    countryNameTextStyle: TextStyle = TextStyle(),
    countryCodeTextStyle: TextStyle = TextStyle(),
    onCountrySelected: (country: CountryDetails) -> Unit
) {
    var openCountryDialog by remember { mutableStateOf(false) }
    val countryList = remember { Utils.getCountryList() }
    var selectedCountry by remember {
        val selectedCountry =
            Utils.getCountryFromCountryCode(
                defaultCountryCode.lowercase(),
                countryList
            )
        onCountrySelected(selectedCountry)
        mutableStateOf(selectedCountry)
    }
    if (openCountryDialog) {
        CountryDialog(
            countryList = countryList,
            onDismissRequest = {
                openCountryDialog = false
            },
            onSelected = { country ->
                selectedCountry = country
                openCountryDialog = false
                onCountrySelected(country)
            },
        )
    }
    SelectedCountrySection(
        defaultPaddingValues = defaultPaddingValues,
        selectedCountry = selectedCountry,
        showCountryFlag = showCountryFlag,
        showCountryPhoneCode = showCountryPhoneCode,
        showCountryName = showCountryName,
        showCountryCode = showCountryCode,
        showArrowDropDown = showArrowDropDown,
        showVerticalDivider = showVerticalDivider,
        spaceAfterCountryFlag = spaceAfterCountryFlag,
        spaceAfterCountryPhoneCode = spaceAfterCountryPhoneCode,
        spaceAfterCountryName = spaceAfterCountryName,
        spaceAfterCountryCode = spaceAfterCountryCode,
        spaceAfterDropDownArrow = spaceAfterDropDownArrow,
        spaceAfterVerticalDivider = spaceAfterVerticalDivider,
        countryFlagSize = countryFlagSize,
        verticalDividerColor = verticalDividerColor,
        verticalDividerHeight = verticalDividerHeight,
        countryPhoneCodeTextStyle = countryPhoneCodeTextStyle,
        countryNameTextStyle = countryNameTextStyle,
        countryCodeTextStyle = countryCodeTextStyle,
        modifier = modifier
    ) {
        openCountryDialog = !openCountryDialog
    }
}

@Composable
private fun SelectedCountrySection(
    defaultPaddingValues: PaddingValues,
    selectedCountry: CountryDetails,
    showCountryFlag: Boolean = true,
    showCountryPhoneCode: Boolean = true,
    showCountryName: Boolean = false,
    showCountryCode: Boolean = false,
    showArrowDropDown: Boolean = true,
    showVerticalDivider: Boolean = true,
    spaceAfterCountryFlag: Dp = 8.dp,
    spaceAfterCountryPhoneCode: Dp = 6.dp,
    spaceAfterCountryName: Dp = 6.dp,
    spaceAfterCountryCode: Dp = 6.dp,
    spaceAfterDropDownArrow: Dp = 0.dp,
    spaceAfterVerticalDivider: Dp = 4.dp,
    countryFlagSize: Dp = 24.dp,
    verticalDividerColor: Color = MaterialTheme.colorScheme.onSurface,
    verticalDividerHeight: Dp = 26.dp,
    countryPhoneCodeTextStyle: TextStyle = TextStyle(),
    countryNameTextStyle: TextStyle = TextStyle(),
    countryCodeTextStyle: TextStyle = TextStyle(),
    modifier: Modifier = Modifier,
    onSelectCountry: () -> Unit,
) {
    Row(
        modifier = modifier
            .noRippleClickable {
                onSelectCountry()
            }
            .padding(defaultPaddingValues),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (showCountryFlag) {
            Image(
                modifier = Modifier
                    .size(countryFlagSize)
                    .clip(CircleShape),
                painter = painterResource(selectedCountry.countryFlag),
                contentScale = ContentScale.FillBounds,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(spaceAfterCountryFlag))
        }
        if (showCountryPhoneCode) {
            Text(
                text = selectedCountry.countryPhoneNumberCode,
                style = countryPhoneCodeTextStyle
            )
            Spacer(modifier = Modifier.width(spaceAfterCountryPhoneCode))
        }
        if (showCountryName) {
            Text(
                text = selectedCountry.countryName,
                style = countryNameTextStyle
            )
            Spacer(modifier = Modifier.width(spaceAfterCountryName))
        }
        if (showCountryCode) {
            Text(
                text = selectedCountry.countryCode.uppercase(),
                style = countryCodeTextStyle
            )
            Spacer(modifier = Modifier.width(spaceAfterCountryCode))
        }
        if (showArrowDropDown) {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(spaceAfterDropDownArrow))
        }
        if (showVerticalDivider) {
            VerticalDivider(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .height(verticalDividerHeight),
                thickness = 1.dp,
                color = verticalDividerColor
            )
            Spacer(modifier = Modifier.width(spaceAfterVerticalDivider))
        }
    }
}