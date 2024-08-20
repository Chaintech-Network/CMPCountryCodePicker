# CMPCountryCodePicker

A CMPCountryCodePicker is country picker library for Compose Multiplatform for Android, iOS and Desktop App.

<img width="960" alt="Hero-image - CMP-country-picker" src="https://github.com/user-attachments/assets/8e1a9169-9ae3-4a42-a37a-ffc8868f5045">

## Installation

Add the dependency to your `build.gradle.kts` file:

```
commonMain.dependencies {
    implementation("network.chaintech:cmp-country-code-picker:1.0.1")
}
```

## Usage

```kotlin
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
)
```

- `mobileNumber` The mobile number to be shown in the text field.
- `onMobileNumberChange` The callback that is triggered when the input service updates the mobile number. An updated mobile number comes as a parameter of the callback.
- `onCountrySelected` The callback function is triggered each time a country is selected within the picker. Additionally, it is also invoked when the picker is first displayed on the screen with the default selected country.
- `modifier` The Modifier to be applied to this text field.
- `defaultPaddingValues` The spacing values to apply internally between the container and the content
- `showCountryFlag` Determines whether to show the country flag within the picker.
- `showCountryPhoneCode` Determines whether to show the country phone code within the picker.
- `showCountryName` Determines whether to show the country name within the picker.
- `showCountryCode` Determines whether to show the country code within the picker.
- `showArrowDropDown` Determines whether to show the arrow drop-down icon within the picker.
- `spaceAfterCountryFlag` The space to add after the country flag.
- `spaceAfterCountryPhoneCode` The space to add after the country phone code.
- `spaceAfterCountryName` The space to add after the country name.
- `spaceAfterCountryCode` The space to add after the country code.
- `countryFlagSize` The size of the country flag.
- `showVerticalDivider` Determines whether to show the vertical divider within the picker.
- `spaceAfterVerticalDivider` The space to add after the vertical divider.
- `verticalDividerColor` The color of the vertical divider.
- `verticalDividerHeight` The height of the vertical divider.
- `countryPhoneCodeTextStyle` The text style for the country phone code.
- `countryNameTextStyle` The text style for the country name.
- `countryCodeTextStyle` The text style for the country code.
- `enabled` Controls the enabled state of this text field. When false, this component will not respond to user input, and it will appear visually disabled and disabled to accessibility services.
- `readOnly` Controls the editable state of the text field. When true, the text field cannot be modified. However, a user can focus it and copy text from it. Read-only text fields are usually used to display pre-filled forms that a user cannot edit.
- `textStyle` The style to be applied to the input text. Defaults to LocalTextStyle.
- `label` The optional label to be displayed inside the text field container.
- `placeholder` The optional placeholder to be displayed when the text field is in focus and the input text is empty.
- `trailingIcon` The optional trailing icon to be displayed at the end of the text field container.
- `prefix` The optional prefix to be displayed before the input text in the text field.
- `suffix` The optional suffix to be displayed after the input text in the text field.
- `supportingText` The optional supporting text to be displayed below the text field.
- `isError` Indicates if the text field's current value is in error.
- `visualTransformation` Transforms the visual representation of the input value.
- `singleLine` When true, this text field becomes a single horizontally scrolling text field instead of wrapping onto multiple lines.
- `maxLines` The maximum height in terms of maximum number of visible lines.
- `minLines` The minimum height in terms of minimum number of visible lines.
- `interactionSource` The MutableInteractionSource representing the stream of Interactions for this text field.
- `shape` Defines the shape of this text field's border.
- `colors` TextFieldColors that will be used to resolve the colors used for this text field in different
- `focusedBorderThickness` Represents the border thickness for focused state.
- `unfocusedBorderThickness` Represents the border thickness for unfocused state.
- `onDone` The callback is triggered when the user clicks the Done button on the keyboard, as the default IME action is set to Done.


## Example

```kotlin
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
```

## Screenshot
![country-picker-banner](https://github.com/ChainTechNetwork/CMPCountryCodePicker/assets/143475887/d9e7c223-9519-4e62-8d50-44d9e48dd870)

![Desktop-country-picker-banner](https://github.com/user-attachments/assets/7bcfba68-8320-4ea8-b6c2-a46b5ad394df)

- For Demo [Checkout This Class](https://github.com/Chaintech-Network/CMPCountryCodePicker-org/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/cmpcountrycodepickerdemo/App.kt)

- [Medium Article](https://medium.com/@manishdabhi1223_25861/792c2a2cb8cb) for detailed explaination.

- Connect us on [LinkedIn](https://www.linkedin.com/showcase/mobile-innovation-network)