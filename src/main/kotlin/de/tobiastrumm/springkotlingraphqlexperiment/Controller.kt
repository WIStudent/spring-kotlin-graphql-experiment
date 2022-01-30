package de.tobiastrumm.springkotlingraphqlexperiment

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.stereotype.Controller
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.graphql.data.method.annotation.SubscriptionMapping
import reactor.core.publisher.Flux
import java.time.Duration

@Controller
class Controller {
  
  @QueryMapping
  fun list(@Argument id: String): MyList? {
    return MyList(
      id = id,
      items = listOf(
        Text(id = "text_1", text = "abcdefg"),
        Image(id = "image_1", src = "src")
    ))
  }

  @SchemaMapping(typeName = "Image", field = "src")
  fun getSrc(image: Image): String {
    return "prefix-${image.src}"
  }

  @MutationMapping
  fun sum(@Argument a: Float, @Argument b: Float): Float {
    return a + b
  }

  @SubscriptionMapping
  fun number(): Flux<Int> {
    return Flux.range(0, Int.MAX_VALUE).delayElements(Duration.ofSeconds(1))
  }
}
