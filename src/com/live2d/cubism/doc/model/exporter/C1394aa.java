package com.live2d.cubism.doc.model.exporter;

//import kotlin.Metadata;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;


/* renamed from: com.live2d.cubism.doc.model.exporter.aa */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/aa.class */
final class C1394aa extends Lambda implements Function1<EmMoc3Source, Integer> {

    /* renamed from: a */
    public static final C1394aa f3568a = new C1394aa();

    C1394aa() {
        super();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Integer invoke(EmMoc3Source cbVar) {

        return cbVar.getEmModelSource().getEmArtMeshSources().getSize();
    }

    /* renamed from: a */
}
