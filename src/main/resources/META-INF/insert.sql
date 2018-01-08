-- NBP
INSERT INTO client (id,information,name ) VALUES (client_seq.NEXTVAL, 'information', 'NBP');

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context1', 'admin_port1', 'application_context1', 'application_system1', 'host_name1', 'http_port1', 'https_port1', 'information1', 'operating_system1', 'path_name1', 'svn_branch1');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system1', 'host_name1', 'information1', 'operating_system1', 'port1', 'schema_name1', 'service_name1');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name1', 'information1', 'operating_system1', 'port1', 'reports_path1', 'rmi_server_path1', 'rmi_system1');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'PRODUCTION', 'informacja1', 'SZRON1', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context2', 'admin_port2', 'application_context2', 'application_system2', 'host_name2', 'http_port2', 'https_port2', 'information2', 'operating_system2', 'path_name2', 'svn_branch2');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system2', 'host_name2', 'information2', 'operating_system2', 'port2', 'schema_name2', 'service_name2');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name2', 'information2', 'operating_system2', 'port2', 'reports_path2', 'rmi_server_path2', 'rmi_system2');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'DEVELOPMENT', 'informacja2', 'SZRON2', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);

-- GETIN BANK
INSERT INTO client (id,information,name ) VALUES (client_seq.NEXTVAL, 'information', 'Getin Bank');

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context1', 'admin_port1', 'application_context1', 'application_system1', 'host_name1', 'http_port1', 'https_port1', 'information1', 'operating_system1', 'path_name1', 'svn_branch1');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system1', 'host_name1', 'information1', 'operating_system1', 'port1', 'schema_name1', 'service_name1');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name1', 'information1', 'operating_system1', 'port1', 'reports_path1', 'rmi_server_path1', 'rmi_system1');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'PRODUCTION', 'informacja1', 'SZRON1', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context2', 'admin_port2', 'application_context2', 'application_system2', 'host_name2', 'http_port2', 'https_port2', 'information2', 'operating_system2', 'path_name2', 'svn_branch2');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system2', 'host_name2', 'information2', 'operating_system2', 'port2', 'schema_name2', 'service_name2');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name2', 'information2', 'operating_system2', 'port2', 'reports_path2', 'rmi_server_path2', 'rmi_system2');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'DEVELOPMENT', 'informacja2', 'SZRON2', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);

-- Bank Pocztowy
INSERT INTO client (id,information,name ) VALUES (client_seq.NEXTVAL, 'information', 'Bank Pocztowy');

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context1', 'admin_port1', 'application_context1', 'application_system1', 'host_name1', 'http_port1', 'https_port1', 'information1', 'operating_system1', 'path_name1', 'svn_branch1');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system1', 'host_name1', 'information1', 'operating_system1', 'port1', 'schema_name1', 'service_name1');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name1', 'information1', 'operating_system1', 'port1', 'reports_path1', 'rmi_server_path1', 'rmi_system1');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'PRODUCTION', 'informacja1', 'SZRON1', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);

INSERT INTO applicationlayer (id, admin_context, admin_port, application_context, application_system, host_name, http_port, https_port, information, operating_system, path_name, svn_branch) VALUES (app_layer_seq.NEXTVAL, 'admin_context2', 'admin_port2', 'application_context2', 'application_system2', 'host_name2', 'http_port2', 'https_port2', 'information2', 'operating_system2', 'path_name2', 'svn_branch2');
INSERT INTO databaselayer (id, database_system, host_name, information, operating_system, port, schema_name, service_name) VALUES (db_layer_seq.NEXTVAL, 'database_system2', 'host_name2', 'information2', 'operating_system2', 'port2', 'schema_name2', 'service_name2');
INSERT INTO rmilayer (id, host_name, information, operating_system, port, reports_path, rmi_server_path, rmi_system) VALUES (rmi_layer_seq.NEXTVAL, 'host_name2', 'information2', 'operating_system2', 'port2', 'reports_path2', 'rmi_server_path2', 'rmi_system2');

INSERT INTO environment (id, environment_type, information, name, application_layer_id, client_id, database_layer_id, rmi_layer_id) VALUES (environment_seq.NEXTVAL, 'DEVELOPMENT', 'informacja2', 'SZRON2', app_layer_seq.CURRVAL, client_seq.CURRVAL, db_layer_seq.CURRVAL, rmi_layer_seq.CURRVAL);
