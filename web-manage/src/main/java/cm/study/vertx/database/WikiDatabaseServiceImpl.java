package cm.study.vertx.database;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;

/**
 * Created by chenming on 2017/10/6.
 */
public class WikiDatabaseServiceImpl implements WikiDatabaseService {

    @Override
    public WikiDatabaseService fetchAllPages(Handler<AsyncResult<JsonArray>> resultHandler) {
        return null;
    }
}