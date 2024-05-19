module extend {
    requires org.apache.commons.collections4;
    requires org.apache.commons.lang3;
    requires org.apache.httpcomponents.client5.httpclient5;
    requires org.apache.httpcomponents.core5.httpcore5;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires cn.hutool;
    requires org.slf4j;
    requires dev.failsafe.core;
    requires dev.failsafe.okhttp;
    requires okhttp3;

    exports dev.ceres.utils;
    exports dev.ceres.utils.json;
    exports dev.ceres.utils.json.supprot;
}
