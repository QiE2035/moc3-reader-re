package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.Z */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/Z.class */
final class C1367Z extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1367Z f3538a = new C1367Z();

    C1367Z() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {
        return m24023a(cbVar);
    }

    /* renamed from: a */
    public int m24023a(EmMoc3Source receiver) {

        return receiver.getEmModelSource().getEmArtMeshSources().getSize();
    }
}
