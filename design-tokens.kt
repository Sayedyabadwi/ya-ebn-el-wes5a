// Design Tokens - Kotlin Constants
object DesignTokens {

    // MARK: - Colors
    @JvmStatic
    val color_primary_ = Color(0xFF28C76F)

    @JvmStatic
    val color_primary_pressed = Color(0xFF24B364)

    @JvmStatic
    val color_primary_disabled = Color(0xFF1E7A50)

    @JvmStatic
    val color_secondary_ = Color(0xFF7367F0)

    @JvmStatic
    val color_secondary_pressed = Color(0xFF5E54D1)

    @JvmStatic
    val color_secondary_disabled = Color(0xFF3D2B9B)

    @JvmStatic
    val color_background_ = Color(0xFF121212)

    @JvmStatic
    val color_background_surface = Color(0xFF1E1E1E)

    @JvmStatic
    val color_background_card = Color(0xFF1A1A1A)

    @JvmStatic
    val color_text_main = Color(0xFFFFFFFF)

    @JvmStatic
    val color_text_secondary = Color(0xFFB0B0B0)

    @JvmStatic
    val color_text_placeholder = Color(0xFF666666)

    @JvmStatic
    val color_text_disabled = Color(0xFF444444)

    @JvmStatic
    val color_error_ = Color(0xFFFF6F61)

    @JvmStatic
    val color_error_on = Color(0xFFFFFFFF)

    @JvmStatic
    val color_success_ = Color(0xFF28C76F)

    @JvmStatic
    val color_success_on = Color(0xFFFFFFFF)

    @JvmStatic
    val color_warning_ = Color(0xFFFF9F43)

    @JvmStatic
    val color_warning_on = Color(0xFF000000)

    // MARK: - Typography
    // Font Families
    @JvmStatic
    val typography_fontFamily_primary = "Inter"

    @JvmStatic
    val typography_fontFamily_secondary = "Roboto"

    // Font Weights
    @JvmStatic
    val typography_fontWeight_regular = FontWeight.w400

    @JvmStatic
    val typography_fontWeight_medium = FontWeight.w500

    @JvmStatic
    val typography_fontWeight_semibold = FontWeight.w600

    @JvmStatic
    val typography_fontWeight_bold = FontWeight.w700

    // Font Sizes
    @JvmStatic
    val typography_fontSize_12 = 12.sp

    @JvmStatic
    val typography_fontSize_14 = 14.sp

    @JvmStatic
    val typography_fontSize_16 = 16.sp

    @JvmStatic
    val typography_fontSize_18 = 18.sp

    @JvmStatic
    val typography_fontSize_20 = 20.sp

    @JvmStatic
    val typography_fontSize_24 = 24.sp

    // Line Heights
    @JvmStatic
    val typography_lineHeight_small = 16

    @JvmStatic
    val typography_lineHeight_medium = 20

    @JvmStatic
    val typography_lineHeight_large = 24

    // Letter Spacings
    @JvmStatic
    val typography_letterSpacing_tight = -0.001.em

    @JvmStatic
    val typography_letterSpacing_normal = 0.000.em

    @JvmStatic
    val typography_letterSpacing_wide = 0.001.em

    // MARK: - Spacing
    @JvmStatic
    val size_spacing_xs = 4.dp

    @JvmStatic
    val size_spacing_sm = 8.dp

    @JvmStatic
    val size_spacing_md = 16.dp

    @JvmStatic
    val size_spacing_lg = 24.dp

    @JvmStatic
    val size_spacing_xl = 32.dp

    // MARK: - Sizing
    @JvmStatic
    val size_borderRadius_sm = 4.dp

    @JvmStatic
    val size_borderRadius_md = 8.dp

    @JvmStatic
    val size_borderRadius_lg = 16.dp

    @JvmStatic
    val size_borderRadius_round = 9999.dp

    // MARK: - Shadows
    // Small Shadows
    @JvmStatic
    val shadow_sm = Shadow(
        color = Color(rgba(0,0,0,0.1)).copy(alpha = 0.25f),
        offset = Offset(0.dp, 1.dp),
        blurRadius = 2.dp
    )

    // Medium Shadows
    @JvmStatic
    val shadow_md = Shadow(
        color = Color(rgba(0,0,0,0.15)).copy(alpha = 0.25f),
        offset = Offset(0.dp, 4.dp),
        blurRadius = 6.dp
    )

    // Large Shadows
    @JvmStatic
    val shadow_lg = Shadow(
        color = Color(rgba(0,0,0,0.2)).copy(alpha = 0.25f),
        offset = Offset(0.dp, 10.dp),
        blurRadius = 15.dp
    )

    // MARK: - Opacities
    @JvmStatic
    val opacity_disabled = 0.38.f

    @JvmStatic
    val opacity_hover = 0.08.f

    @JvmStatic
    val opacity_focus = 0.12.f

    // MARK: - Other Tokens
    @JvmStatic
    val $schema = "https://example.com/dark-mode-tokens.schema.json"

    // MARK: - Utility Functions
    @JvmStatic
    fun isDarkMode(context: Context): Boolean {
        val configuration = context.resources.configuration
        val currentNightMode = configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        return currentNightMode == Configuration.UI_MODE_NIGHT_YES
    }

    @JvmStatic
    fun getThemeColors(context: Context): Colors {
        return if (isDarkMode(context)) darkColors else lightColors
    }

    @JvmStatic
    fun getTextColor(context: Context): Color {
        return if (isDarkMode(context)) Color.White else Color.Black
    }
}

