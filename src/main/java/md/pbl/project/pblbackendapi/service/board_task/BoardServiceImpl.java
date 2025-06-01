package md.pbl.project.pblbackendapi.service.board_task;

import lombok.RequiredArgsConstructor;
import md.pbl.project.pblbackendapi.exceptions.PblCustomException;
import md.pbl.project.pblbackendapi.model.board.BoardDto;
import md.pbl.project.pblbackendapi.rest.board_task.client.BoardTaskClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class BoardServiceImpl implements BoardService {
    private final BoardTaskClient client;

    @Override
    public List<BoardDto> getAll(Long orgId, Long projId, Long userId) {
        return client.getBoards(orgId, projId, userId);
    }

    @Override
    public BoardDto get(Long orgId, Long projId, Long boardId, Long userId) throws PblCustomException {
        return client.getBoard(orgId, projId, boardId, userId);
    }

    @Override
    public BoardDto create(Long orgId, Long projId, Long userId, BoardDto dto) throws PblCustomException {
        return client.createBoard(orgId, projId, dto, userId);
    }

    @Override
    public BoardDto update(Long orgId, Long projId, Long boardId, Long userId, BoardDto dto) throws PblCustomException {
        return client.updateBoard(orgId, projId, boardId, dto, userId);
    }

    @Override
    public void delete(Long orgId, Long projId, Long boardId, Long userId) throws PblCustomException {
        client.deleteBoard(orgId, projId, boardId, userId);
    }
}
