package io.vertx.up.micro;

import io.vertx.ext.web.Router;
import io.vertx.up.rs.Axis;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

interface Info {

    String HTTP_SERVERS = "[ ZERO ] ( Http Server ) {0} (id = {1}) Agent has deployed HTTP Server on {2}.";

    String MAPPED_ROUTE = "[ ZERO ] ( Uri Register ) \"{1}\" has been deployed by {0}, Options = {2}.";

    String HTTP_LISTEN = "[ ZERO ] ( Http Server ) {0} Http Server has been started successfully. Endpoint: {1}.";

    String HTTP_REGISTRY = "[ ZERO ] ( Http Server ) {0} ( name = {1} ) " +
            "will send data to internal address: {2}.";

    String RPC_LISTEN = "[ ZERO ] ( Rpc Server ) Rpc Server has been started successfully. Channel: grpc://{0}:{1}. ";

    String RPC_FAILURE = "[ ZERO ] ( Rpc Server ) Rpc Server met failure: details = {0}.";

    String ETCD_SUCCESS = "[ ZERO ] ( Etcd Center ) Zero system detected configuration {0}, start to initialize Etcd Center.";

    String REG_SUCCESS = "[ ZERO ] ( Discovery ) Status: {5}, Action : {6} --> The Service Record " +
            "( key = {0}, id = {1}, name = {2}, location = {3}, type = {4} )" +
            "has been registeried in Zero system.";

    String REG_FAILURE = "[ ZERO ] ( Discovery ) Action: {1}, Service Registration has met error: {0}.";

    String API_GATEWAY = "[ ZERO ] ( Api Gateway ) {0} (id = {1}) has deployed on {2}.";

    String API_LISTEN = "[ ZERO ] ( Api Gateway ) {0} has been started successfully. Endpoint: {1}.";
}

interface Pool {

    ConcurrentMap<String, Axis<Router>> ROUTERS = new ConcurrentHashMap<>();

    ConcurrentMap<String, Axis<Router>> EVENTS = new ConcurrentHashMap<>();
}
