// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Barcode kind. */
public final class DocumentBarcodeKind extends ExpandableStringEnum<DocumentBarcodeKind> {
    /** Static value QRCode for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind QRCODE = fromString("QRCode");

    /** Static value PDF417 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind PDF417 = fromString("PDF417");

    /** Static value UPCA for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind UPCA = fromString("UPCA");

    /** Static value UPCE for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind UPCE = fromString("UPCE");

    /** Static value Code39 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind CODE39 = fromString("Code39");

    /** Static value Code128 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind CODE128 = fromString("Code128");

    /** Static value EAN8 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind EAN8 = fromString("EAN8");

    /** Static value EAN13 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind EAN13 = fromString("EAN13");

    /** Static value DataBar for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind DATA_BAR = fromString("DataBar");

    /** Static value Code93 for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind CODE93 = fromString("Code93");

    /** Static value Codabar for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind CODABAR = fromString("Codabar");

    /** Static value DataBarExpanded for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind DATA_BAR_EXPANDED = fromString("DataBarExpanded");

    /** Static value ITF for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind ITF = fromString("ITF");

    /** Static value MicroQRCode for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind MICRO_QRCODE = fromString("MicroQRCode");

    /** Static value Aztec for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind AZTEC = fromString("Aztec");

    /** Static value DataMatrix for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind DATA_MATRIX = fromString("DataMatrix");

    /** Static value MaxiCode for DocumentBarcodeKind. */
    public static final DocumentBarcodeKind MAXI_CODE = fromString("MaxiCode");

    /**
     * Creates a new instance of DocumentBarcodeKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DocumentBarcodeKind() {}

    /**
     * Creates or finds a DocumentBarcodeKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentBarcodeKind.
     */
    @JsonCreator
    public static DocumentBarcodeKind fromString(String name) {
        return fromString(name, DocumentBarcodeKind.class);
    }

    /**
     * Gets known DocumentBarcodeKind values.
     *
     * @return known DocumentBarcodeKind values.
     */
    public static Collection<DocumentBarcodeKind> values() {
        return values(DocumentBarcodeKind.class);
    }
}
