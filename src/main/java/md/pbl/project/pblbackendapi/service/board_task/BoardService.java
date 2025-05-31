package md.pbl.project.pblbackendapi.service.board_task;

import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.board.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> getAll(Long orgId, Long projId);

    BoardDto get(Long orgId, Long projId, Long boardId) throws PblCustomException;

    BoardDto create(Long orgId, Long projId, Long userId, BoardDto dto) throws PblCustomException;

    BoardDto update(Long orgId, Long projId, Long boardId, Long userId, BoardDto dto) throws PblCustomException;

    void delete(Long orgId, Long projId, Long boardId, Long userId) throws PblCustomException;
}
