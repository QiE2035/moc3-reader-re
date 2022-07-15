package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.bc */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bc.class */
final class C1442bc extends Lambda implements Function1<EmMoc3Source, List<Short>> {

    /* renamed from: a */
    public static final C1442bc f3749a = new C1442bc();


    C1442bc() {
        super();
    }

    /* renamed from: a */
    public List<Short> invoke(EmMoc3Source receiver) {

        type = Short.TYPE;
        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(16);
        return receiver.getEmModelSource().getEmPositionIndexSources().getIndex();
    }
}
