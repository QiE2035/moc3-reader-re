package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryWriter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.bA */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bA.class */
final class EmDeformerTypeWriter extends Lambda implements Function2<CBinaryWriter, EmDeformerType> {

    /* renamed from: a */
    public static final EmDeformerTypeWriter INSTANCE = new EmDeformerTypeWriter();

    EmDeformerTypeWriter() {
        super();
    }

    @Override
    public /* synthetic */ void invoke(CBinaryWriter bVar, EmDeformerType bMVar) {
        m23947a(bVar, bMVar);
    }

    /* renamed from: a */
    public void m23947a(CBinaryWriter receiver, EmDeformerType value) {
        receiver.writeU4(value.getNumber());
    }
}
