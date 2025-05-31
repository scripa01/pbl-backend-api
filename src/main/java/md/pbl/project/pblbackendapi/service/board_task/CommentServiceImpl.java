package md.pbl.project.pblbackendapi.service.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.CommentDto;
import md.pbl.project.pblbackendapi.rest.board_task.client.BoardTaskClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class CommentServiceImpl implements CommentService {
    private final BoardTaskClient client;

    @Override
    public List<CommentDto> getAll(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException {
        return client.getComments(orgId, projId, boardId, taskId);
    }

    @Override
    public CommentDto get(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId) throws PblCustomException {
        return client.getComment(orgId, projId, boardId, taskId, commentId);
    }

    @Override
    public CommentDto create(Long orgId, Long projId, Long boardId, Long taskId, Long userId, CommentDto dto) throws PblCustomException {
        return client.createComment(orgId, projId, boardId, taskId, dto);
    }

    @Override
    public CommentDto update(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId, CommentDto dto) throws PblCustomException {
        return client.updateComment(orgId, projId, boardId, taskId, commentId, dto);
    }

    @Override
    public void delete(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId) throws PblCustomException {
        client.deleteComment(orgId, projId, boardId, taskId, commentId);
    }
}
