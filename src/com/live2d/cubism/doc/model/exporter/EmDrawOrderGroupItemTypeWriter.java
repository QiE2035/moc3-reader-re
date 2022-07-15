package com.live2d.cubism.doc.model.exporter;

import com.live2d.util.binary.CBinaryWriter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.bB */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bB.class */
final class EmDrawOrderGroupItemTypeWriter extends Lambda implements Function2<CBinaryWriter, EmDrawOrderGroupItemType> {

    /* renamed from: a */
    public static final EmDrawOrderGroupItemTypeWriter INSTANCE = new EmDrawOrderGroupItemTypeWriter();

    EmDrawOrderGroupItemTypeWriter() {
        super();
    }

    @Override
    public /* synthetic */ void invoke(CBinaryWriter bVar, EmDrawOrderGroupItemType bNVar) {
        m23946a(bVar, bNVar);
    }

    /* renamed from: a */
    public void m23946a(CBinaryWriter receiver, EmDrawOrderGroupItemType value) {
        receiver.writeU4(value.getNumber());
    }
}
