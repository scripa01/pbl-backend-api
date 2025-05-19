package md.pbl.project.pblbackendapi.model.workflow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
public class WorkflowDefinitionDto {
    Long id;
    String name;
    List<String> states;         // e.g. [NEW, IN_PROGRESS, DONE]
    Map<String, List<String>> transitions; // fromState -> [allowedToStates]

}
