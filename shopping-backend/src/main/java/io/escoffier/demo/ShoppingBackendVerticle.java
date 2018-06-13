package io.escoffier.demo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.servicediscovery.ServiceDiscovery;
import io.vertx.servicediscovery.types.RedisDataSource;

public class ShoppingBackendVerticle
  extends AbstractVerticle {

  @Override
  public void start() {
    Router router = Router.router(vertx);

    router.get("/").handler(rc -> rc.response().end("Bonjour!"));

    vertx.createHttpServer()
      .requestHandler(router::accept)
      .listen(8080);
  }
  
}
