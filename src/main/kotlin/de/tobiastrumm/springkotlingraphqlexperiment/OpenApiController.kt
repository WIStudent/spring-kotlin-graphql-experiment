package de.tobiastrumm.springkotlingraphqlexperiment

import io.swagger.v3.oas.annotations.Parameter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class OpenApiController {

  @GetMapping(value = ["/list"], produces = ["application/json"])
  fun list(
    @Parameter(description = "Id of the queried list") @RequestParam(value = "id", required = true) id: String
  ): MyList {
    return MyList(
      id = id,
      items = listOf(
        Text(id = "text_1", text = "abcdefg"),
        Image(id = "image_1", src = "src")
      ))
  }

  @PostMapping(value = ["/sum"], produces = ["application/json"])
  fun sum(
    @RequestParam(value = "a", required = true) a: Float,
    @RequestParam(value = "b", required = true) b: Float
  ): Float {
    return a + b
  }
}