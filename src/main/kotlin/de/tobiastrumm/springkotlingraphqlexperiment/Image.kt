package de.tobiastrumm.springkotlingraphqlexperiment

data class Image(
  override val id: String,
  val src: String
): ListItem
