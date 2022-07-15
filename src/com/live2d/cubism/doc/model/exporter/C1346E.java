package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.E */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/E.class */
final class C1346E extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1346E INSTANCE = new C1346E();

    C1346E() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {
        return m24044a(cbVar);
    }

    /* renamed from: a */
    public int m24044a(EmMoc3Source receiver) {

        return receiver.getEmModelSource().getEmPartSources().getSize();
    }
}
