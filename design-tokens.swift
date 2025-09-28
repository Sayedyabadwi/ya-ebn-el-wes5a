// Design Tokens - SwiftUI Constants
import SwiftUI

public enum DesignTokens {

    // MARK: - Colors
    static let color_primary_ = Color(red: 1, green: 0.1568627450980392, blue: 0.7803921568627451)

    static let color_primary_pressed = Color(red: 1, green: 0.1411764705882353, blue: 0.7019607843137254)

    static let color_primary_disabled = Color(red: 1, green: 0.11764705882352941, blue: 0.47843137254901963)

    static let color_secondary_ = Color(red: 1, green: 0.45098039215686275, blue: 0.403921568627451)

    static let color_secondary_pressed = Color(red: 1, green: 0.3686274509803922, blue: 0.32941176470588235)

    static let color_secondary_disabled = Color(red: 1, green: 0.23921568627450981, blue: 0.16862745098039217)

    static let color_background_ = Color(red: 1, green: 0.07058823529411765, blue: 0.07058823529411765)

    static let color_background_surface = Color(red: 1, green: 0.11764705882352941, blue: 0.11764705882352941)

    static let color_background_card = Color(red: 1, green: 0.10196078431372549, blue: 0.10196078431372549)

    static let color_text_main = Color(red: 1, green: 1, blue: 1)

    static let color_text_secondary = Color(red: 1, green: 0.6901960784313725, blue: 0.6901960784313725)

    static let color_text_placeholder = Color(red: 1, green: 0.4, blue: 0.4)

    static let color_text_disabled = Color(red: 1, green: 0.26666666666666666, blue: 0.26666666666666666)

    static let color_error_ = Color(red: 1, green: 1, blue: 0.43529411764705883)

    static let color_error_on = Color(red: 1, green: 1, blue: 1)

    static let color_success_ = Color(red: 1, green: 0.1568627450980392, blue: 0.7803921568627451)

    static let color_success_on = Color(red: 1, green: 1, blue: 1)

    static let color_warning_ = Color(red: 1, green: 1, blue: 0.6235294117647059)

    static let color_warning_on = Color(red: 1, green: 0, blue: 0)

    // MARK: - Typography
    // Font Families
    static let typography_fontFamily_primary = "Inter"

    static let typography_fontFamily_secondary = "Roboto"

    // Font Weights
    static let typography_fontWeight_regular = Font.Weight.regular

    static let typography_fontWeight_medium = Font.Weight.medium

    static let typography_fontWeight_semibold = Font.Weight.semibold

    static let typography_fontWeight_bold = Font.Weight.bold

    // Font Sizes
    static let typography_fontSize_12 = CGFloat(12)

    static let typography_fontSize_14 = CGFloat(14)

    static let typography_fontSize_16 = CGFloat(16)

    static let typography_fontSize_18 = CGFloat(18)

    static let typography_fontSize_20 = CGFloat(20)

    static let typography_fontSize_24 = CGFloat(24)

    // Line Heights
    static let typography_lineHeight_small = CGFloat(16)

    static let typography_lineHeight_medium = CGFloat(20)

    static let typography_lineHeight_large = CGFloat(24)

    // Letter Spacings
    static let typography_letterSpacing_tight = CGFloat(-0.001)

    static let typography_letterSpacing_normal = CGFloat(0.000)

    static let typography_letterSpacing_wide = CGFloat(0.001)

    // MARK: - Spacing
    static let size_spacing_xs = CGFloat(4)

    static let size_spacing_sm = CGFloat(8)

    static let size_spacing_md = CGFloat(16)

    static let size_spacing_lg = CGFloat(24)

    static let size_spacing_xl = CGFloat(32)

    // MARK: - Sizing
    static let size_borderRadius_sm = CGFloat(4)

    static let size_borderRadius_md = CGFloat(8)

    static let size_borderRadius_lg = CGFloat(16)

    static let size_borderRadius_round = CGFloat(9999)

    // MARK: - Shadows
    // Small Shadows
    static let shadow_sm = Shadow(
        color: Color(red: 0.7294117647058823, green: NaN, blue: NaN, opacity: 0.25),
        radius: 2,
        x: 0,
        y: 1
    )

    // Medium Shadows
    static let shadow_md = Shadow(
        color: Color(red: 0.7294117647058823, green: NaN, blue: NaN, opacity: 0.25),
        radius: 6,
        x: 0,
        y: 4
    )

    // Large Shadows
    static let shadow_lg = Shadow(
        color: Color(red: 0.7294117647058823, green: NaN, blue: NaN, opacity: 0.25),
        radius: 15,
        x: 0,
        y: 10
    )

    // MARK: - Opacities
    static let opacity_disabled = CGFloat(0.38)

    static let opacity_hover = CGFloat(0.08)

    static let opacity_focus = CGFloat(0.12)

    // MARK: - Other Tokens
    static let $schema = "https://example.com/dark-mode-tokens.schema.json"

    // MARK: - Utility Functions
    static func isDarkMode(colorScheme: ColorScheme) -> Bool {
        return colorScheme == .dark
    }

    static func getTextColor(colorScheme: ColorScheme) -> Color {
        return isDarkMode(colorScheme: colorScheme) ? .white : .black
    }
}

