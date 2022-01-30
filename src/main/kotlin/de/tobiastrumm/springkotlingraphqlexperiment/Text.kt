package de.tobiastrumm.springkotlingraphqlexperiment

data class Text(
  override val id: String,
  val text: String
): ListItem
