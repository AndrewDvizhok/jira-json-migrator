package io.github.andrewdvizhok

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/jira-json-migrator")
class JiraJsonMigratorController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}