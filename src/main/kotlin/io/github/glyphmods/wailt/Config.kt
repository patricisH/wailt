package io.github.glyphmods.wailt

import net.neoforged.neoforge.common.ModConfigSpec

object Config {
    private val builder = ModConfigSpec.Builder()

    val metadataUrl: ModConfigSpec.ConfigValue<String> =
        builder.comment("The URL to download track metadata from. This should generally be left at the default.")
            .define(
                "metadata.url",
                "https://raw.githubusercontent.com/GlyphMods/wailt/1.20.6/src/main/resources/tracks.json"
            )
    val forceEmbeddedMetadata: ModConfigSpec.BooleanValue =
        builder.comment("Force the mod to use track metadata embedded in the JAR. Only useful for development.")
            .define("metadata.force-embedded", false)

    val toastDuration: ModConfigSpec.ConfigValue<Double> = builder.comment("How long to show the toast on screen, in seconds")
        .define("toast.duration", 5.0)

    val disableToastColors: ModConfigSpec.BooleanValue = builder.comment("Always use white text for the artist name in the toast")
        .define("toast.disable-color", false)

    val automaticallyShowToast: ModConfigSpec.BooleanValue = builder.comment("Automatically show the toast when the music changes")
        .define("toast.automatically-show", true)


    val spec: ModConfigSpec = builder.build()
}