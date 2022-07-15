package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.bp */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/bp.class */
final class C1455bp extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1455bp INSTANCE = new C1455bp();

    C1455bp() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {
        return m23800a(cbVar);
    }

    /* renamed from: a */
    public int m23800a(EmMoc3Source receiver) {

        return receiver.getEmModelSource().getEmDeformerSources().getSize();
    }
}
