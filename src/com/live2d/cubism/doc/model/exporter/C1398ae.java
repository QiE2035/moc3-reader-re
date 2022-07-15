package com.live2d.cubism.doc.model.exporter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

import java.util.List;


/* renamed from: com.live2d.cubism.doc.model.exporter.ae */
/* loaded from: Live2D_Cubism.jar:com/live2d/cubism/doc/model/exporter/ae.class */
final class C1398ae extends Lambda implements Function1<EmMoc3Source, List<String>> {

    /* renamed from: a */
    public static final C1398ae f3572a = new C1398ae();


    C1398ae() {
        super();
    }

    /* renamed from: a */
    public List<String> invoke(EmMoc3Source receiver) {

        count = receiver.getEmModelSource().getEmCountInfo().getCounts().get(4);
        return receiver.getEmModelSource().getEmArtMeshSources().getID();
    }
}
