/*
 * Copyright (C) 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.api.services.datastream.v1.model;

/**
 * Postgresql data source configuration
 *
 * <p>This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Datastream API. For a detailed explanation see: <a
 * href=
 * "https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostgresqlSourceConfig extends com.google.api.client.json.GenericJson {

  /** Drop large object values. The value may be {@code null}. */
  @com.google.api.client.util.Key private DropLargeObjects dropLargeObjects;

  /** Postgresql objects to exclude from the stream. The value may be {@code null}. */
  @com.google.api.client.util.Key private PostgresqlRdbms excludeObjects;

  /** Postgresql objects to include in the stream. The value may be {@code null}. */
  @com.google.api.client.util.Key private PostgresqlRdbms includeObjects;

  /**
   * Drop large object values.
   *
   * @return value or {@code null} for none
   */
  public DropLargeObjects getDropLargeObjects() {
    return dropLargeObjects;
  }

  /**
   * Drop large object values.
   *
   * @param dropLargeObjects dropLargeObjects or {@code null} for none
   */
  public PostgresqlSourceConfig setDropLargeObjects(DropLargeObjects dropLargeObjects) {
    this.dropLargeObjects = dropLargeObjects;
    return this;
  }

  /**
   * Postgresql objects to exclude from the stream.
   *
   * @return value or {@code null} for none
   */
  public PostgresqlRdbms getExcludeObjects() {
    return excludeObjects;
  }

  /**
   * Postgresql objects to exclude from the stream.
   *
   * @param excludeObjects excludeObjects or {@code null} for none
   */
  public PostgresqlSourceConfig setExcludeObjects(PostgresqlRdbms excludeObjects) {
    this.excludeObjects = excludeObjects;
    return this;
  }

  /**
   * Postgresql objects to include in the stream.
   *
   * @return value or {@code null} for none
   */
  public PostgresqlRdbms getIncludeObjects() {
    return includeObjects;
  }

  /**
   * Postgresql objects to include in the stream.
   *
   * @param includeObjects includeObjects or {@code null} for none
   */
  public PostgresqlSourceConfig setIncludeObjects(PostgresqlRdbms includeObjects) {
    this.includeObjects = includeObjects;
    return this;
  }

  @Override
  public PostgresqlSourceConfig set(String fieldName, Object value) {
    return (PostgresqlSourceConfig) super.set(fieldName, value);
  }

  @Override
  public PostgresqlSourceConfig clone() {
    return (PostgresqlSourceConfig) super.clone();
  }
}
