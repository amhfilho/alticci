package com.alticci.sequence.web;

import com.alticci.sequence.service.SequenceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.awt.print.Book;

@RestController("Sequence Number Calculator")
@RequestMapping("/alticci")
@Validated
public class SequenceController {

    private SequenceService service;

    @Autowired
    public SequenceController(SequenceService service) {
        this.service = service;
    }

    @Operation(summary = "Get a sequence number given an integer input")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sequence number calculated",
                    content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Integer.class)) }),
            @ApiResponse(responseCode = "400", description = "Non positive number", content = @Content),
            @ApiResponse(responseCode = "500", description = "Invalid number", content = @Content)})
    @GetMapping("{number}")
    public Integer calculateSequence(@Parameter(description = "Integer positive number", required = true)
                              @Valid @NotNull @Positive @PathVariable Integer number) {
        return service.sequence(number);
    }
}
