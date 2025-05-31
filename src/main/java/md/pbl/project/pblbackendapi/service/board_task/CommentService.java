package md.pbl.project.pblbackendapi.service.board_task;

import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.task.CommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> getAll(Long orgId, Long projId, Long boardId, Long taskId, Long userId) throws PblCustomException;

    CommentDto get(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId) throws PblCustomException;

    CommentDto create(Long orgId, Long projId, Long boardId, Long taskId, Long userId, CommentDto dto) throws PblCustomException;

    CommentDto update(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId, CommentDto dto) throws PblCustomException;

    void delete(Long orgId, Long projId, Long boardId, Long taskId, Long commentId, Long userId) throws PblCustomException;
}
