/*
 * Copyright 2023 Signal Messenger, LLC
 * SPDX-License-Identifier: AGPL-3.0-only
 */

package org.whispersystems.textsecuregcm.backup;

import java.util.Map;

public record MessageBackupUploadDescriptor(
    int cdn,
    String key,
    Map<String, String> headers,
    String signedUploadLocation) {}
