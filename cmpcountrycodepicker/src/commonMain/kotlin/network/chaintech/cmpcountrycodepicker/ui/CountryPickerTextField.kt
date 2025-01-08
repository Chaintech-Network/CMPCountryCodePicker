package network.chaintech.cmpcountrycodepicker.ui

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import network.chaintech.cmpcountrycodepicker.model.CountryDetails

/**
 * @param mobileNumber The mobile number to be shown in the text field.
 * @param onMobileNumberChange The callback that is triggered when the input service updates the mobile number. An updated mobile number comes as a parameter of the callback.
 * @param onCountrySelected The callback function is triggered each time a country is selected within the picker. Additionally, it is also invoked when the picker is first displayed on the screen with the default selected country.
 * @param modifier The Modifier to be applied to this text field.
 * @param defaultPaddingValues The spacing values to apply internally between the container and the content
 * @param showCountryFlag Determines whether to show the country flag within the picker.
 * @param showCountryPhoneCode Determines whether to show the country phone code within the picker.
 * @param showCountryName Determines whether to show the country name within the picker.
 * @param showCountryCode Determines whether to show the country code within the picker.
 * @param showArrowDropDown Determines whether to show the arrow drop-down icon within the picker.
 * @param spaceAfterCountryFlag The space to add after the country flag.
 * @param spaceAfterCountryPhoneCode The space to add after the country phone code.
 * @param spaceAfterCountryName The space to add after the country name.
 * @param spaceAfterCountryCode The space to add after the country code.
 * @param countryFlagSize The size of the country flag.
 * @param showVerticalDivider Determines whether to show the vertical divider within the picker.
 * @param spaceAfterVerticalDivider The space to add after the vertical divider.
 * @param verticalDividerColor The color of the vertical divider.
 * @param verticalDividerHeight The height of the vertical divider.
 * @param countryPhoneCodeTextStyle The text style for the country phone code.
 * @param countryNameTextStyle The text style for the country name.
 * @param countryCodeTextStyle The text style for the country code.
 * @param enabled Controls the enabled state of this text field. When false, this component will not respond to user input, and it will appear visually disabled and disabled to accessibility services.
 * @param readOnly Controls the editable state of the text field. When true, the text field cannot be modified. However, a user can focus it and copy text from it. Read-only text fields are usually used to display pre-filled forms that a user cannot edit.
 * @param textStyle The style to be applied to the input text. Defaults to LocalTextStyle.
 * @param label The optional label to be displayed inside the text field container.
 * @param placeholder The optional placeholder to be displayed when the text field is in focus and the input text is empty.
 * @param trailingIcon The optional trailing icon to be displayed at the end of the text field container.
 * @param prefix The optional prefix to be displayed before the input text in the text field.
 * @param suffix The optional suffix to be displayed after the input text in the text field.
 * @param supportingText The optional supporting text to be displayed below the text field.
 * @param isError Indicates if the text field's current value is in error.
 * @param visualTransformation Transforms the visual representation of the input value.
 * @param singleLine When true, this text field becomes a single horizontally scrolling text field instead of wrapping onto multiple lines.
 * @param maxLines The maximum height in terms of maximum number of visible lines.
 * @param minLines The minimum height in terms of minimum number of visible lines.
 * @param interactionSource The MutableInteractionSource representing the stream of Interactions for this text field.
 * @param shape Defines the shape of this text field's border.
 * @param colors TextFieldColors that will be used to resolve the colors used for this text field in different
 * @param focusedBorderThickness Represents the border thickness for focused state.
 * @param unfocusedBorderThickness Represents the border thickness for unfocused state.
 * @param onDone The callback is triggered when the user clicks the Done button on the keyboard, as the default IME action is set to Done.
 */
@Composable
fun CountryPickerBasicTextField(
    mobileNumber: String,
    defaultCountryCode: String,
    onMobileNumberChange: (String) -> Unit,
    onCountrySelected: (country: CountryDetails) -> Unit,
    modifier: Modifier = Modifier,
    defaultPaddingValues: PaddingValues = PaddingValues(4.dp, 6.dp),
    showCountryFlag: Boolean = true,
    showCountryPhoneCode: Boolean = true,
    showCountryName: Boolean = false,
    showCountryCode: Boolean = false,
    showArrowDropDown: Boolean = true,
    spaceAfterCountryFlag: Dp = 8.dp,
    spaceAfterCountryPhoneCode: Dp = 6.dp,
    spaceAfterCountryName: Dp = 6.dp,
    spaceAfterCountryCode: Dp = 6.dp,
    countryFlagSize: Dp = 26.dp,
    showVerticalDivider: Boolean = true,
    spaceAfterVerticalDivider: Dp = 4.dp,
    verticalDividerColor: Color = MaterialTheme.colorScheme.onSurface,
    verticalDividerHeight: Dp = 26.dp,
    countryPhoneCodeTextStyle: TextStyle = TextStyle(),
    countryNameTextStyle: TextStyle = TextStyle(),
    countryCodeTextStyle: TextStyle = TextStyle(),
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable() (() -> Unit)? = null,
    placeholder: @Composable() (() -> Unit)? = null,
    trailingIcon: @Composable() (() -> Unit)? = null,
    prefix: @Composable() (() -> Unit)? = null,
    suffix: @Composable() (() -> Unit)? = null,
    supportingText: @Composable() (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = RoundedCornerShape(12.dp),
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
    focusedBorderThickness: Dp = 2.dp,
    unfocusedBorderThickness: Dp = 1.dp,
    onDone: () -> Unit = {},
) {
    PickerBasicTextField(
        value = mobileNumber,
        onValueChange = { updatedMobileNumber -> onMobileNumberChange(updatedMobileNumber) },
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = {
            CountryPicker(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clip(RoundedCornerShape(12.dp)),
                defaultCountryCode = defaultCountryCode,
                defaultPaddingValues = defaultPaddingValues,
                showCountryFlag = showCountryFlag,
                showCountryPhoneCode = showCountryPhoneCode,
                showCountryName = showCountryName,
                showCountryCode = showCountryCode,
                showArrowDropDown = showArrowDropDown,
                spaceAfterCountryFlag = spaceAfterCountryFlag,
                spaceAfterCountryPhoneCode = spaceAfterCountryPhoneCode,
                spaceAfterCountryName = spaceAfterCountryName,
                spaceAfterCountryCode = spaceAfterCountryCode,
                countryFlagSize = countryFlagSize,
                showVerticalDivider = showVerticalDivider,
                spaceAfterVerticalDivider = spaceAfterVerticalDivider,
                verticalDividerColor = verticalDividerColor,
                verticalDividerHeight = verticalDividerHeight,
                countryPhoneCodeTextStyle = countryPhoneCodeTextStyle,
                countryNameTextStyle = countryNameTextStyle,
                countryCodeTextStyle = countryCodeTextStyle,
            ) { selectedCountry ->
                onCountrySelected(selectedCountry)
            }
        },
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                onDone()
            },
        ),
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors,
        focusedBorderThickness = focusedBorderThickness,
        unfocusedBorderThickness = unfocusedBorderThickness,
    )
}

@Composable
fun CountryPickerTextField(
    mobileNumber: String,
    defaultCountryCode: String,
    onMobileNumberChange: (String) -> Unit,
    onCountrySelected: (country: CountryDetails) -> Unit,
    modifier: Modifier = Modifier,
    defaultPaddingValues: PaddingValues = PaddingValues(4.dp, 6.dp),
    showCountryFlag: Boolean = true,
    showCountryPhoneCode: Boolean = true,
    showCountryName: Boolean = false,
    showCountryCode: Boolean = false,
    showArrowDropDown: Boolean = true,
    spaceAfterCountryFlag: Dp = 8.dp,
    spaceAfterCountryPhoneCode: Dp = 6.dp,
    spaceAfterCountryName: Dp = 6.dp,
    spaceAfterCountryCode: Dp = 6.dp,
    countryFlagSize: Dp = 24.dp,
    showVerticalDivider: Boolean = true,
    spaceAfterVerticalDivider: Dp = 4.dp,
    verticalDividerColor: Color = MaterialTheme.colorScheme.onSurface,
    verticalDividerHeight: Dp = 26.dp,
    countryPhoneCodeTextStyle: TextStyle = TextStyle(),
    countryNameTextStyle: TextStyle = TextStyle(),
    countryCodeTextStyle: TextStyle = TextStyle(),
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    placeholder: @Composable() (() -> Unit)? = null,
    trailingIcon: @Composable() (() -> Unit)? = null,
    prefix: @Composable() (() -> Unit)? = null,
    suffix: @Composable() (() -> Unit)? = null,
    supportingText: @Composable() (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColors = OutlinedTextFieldDefaults.colors(),
    onDone: () -> Unit = {},
) {
    PickerTextField(
        value = mobileNumber,
        onValueChange = { updatedMobileNumber -> onMobileNumberChange(updatedMobileNumber) },
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        placeholder = placeholder,
        leadingIcon = {
            CountryPicker(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .clip(RoundedCornerShape(12.dp)),
                defaultCountryCode = defaultCountryCode,
                defaultPaddingValues = defaultPaddingValues,
                showCountryFlag = showCountryFlag,
                showCountryPhoneCode = showCountryPhoneCode,
                showCountryName = showCountryName,
                showCountryCode = showCountryCode,
                showArrowDropDown = showArrowDropDown,
                spaceAfterCountryFlag = spaceAfterCountryFlag,
                spaceAfterCountryPhoneCode = spaceAfterCountryPhoneCode,
                spaceAfterCountryName = spaceAfterCountryName,
                spaceAfterCountryCode = spaceAfterCountryCode,
                countryFlagSize = countryFlagSize,
                showVerticalDivider = showVerticalDivider,
                spaceAfterVerticalDivider = spaceAfterVerticalDivider,
                verticalDividerColor = verticalDividerColor,
                verticalDividerHeight = verticalDividerHeight,
                countryPhoneCodeTextStyle = countryPhoneCodeTextStyle,
                countryNameTextStyle = countryNameTextStyle,
                countryCodeTextStyle = countryCodeTextStyle,
            ) { selectedCountry ->
                onCountrySelected(selectedCountry)
            }
        },
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                onDone()
            },
        ),
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        colors = colors,
    )
}