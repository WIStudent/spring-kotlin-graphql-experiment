package de.tobiastrumm.springkotlingraphqlexperiment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinGraphqlExperimentApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinGraphqlExperimentApplication>(*args)
}
