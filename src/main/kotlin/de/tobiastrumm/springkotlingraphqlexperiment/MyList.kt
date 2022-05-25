package de.tobiastrumm.springkotlingraphqlexperiment

import io.swagger.v3.oas.annotations.media.Schema

data class MyList(
  val id: String,

  @Schema(
    type = "array",
    anyOf = [Image::class, Text::class]
  )
  val items: List<ListItem>
)
