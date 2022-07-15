import com.live2d.cubism.doc.model.exporter.CMocMemoryMapperV1;
import com.live2d.cubism.doc.model.exporter.EmMoc3Source;
import com.live2d.cubism.doc.model.exporter.EmModelSourcePack;

import java.io.File;
import java.util.List;

public class App {

    private static final String BASE_PATH = "/run/media/qie2035/7A7613BD76137959/Users/Administrator/Downloads/to_be_tide/ok/L2D/miara_pro_en/runtime/";

    public static void main(String[] args) {
        CMocMemoryMapperV1 mapper = new CMocMemoryMapperV1();
        EmMoc3Source source = mapper.read(new File(BASE_PATH + "miara_pro_t03.moc3"));
        source.getEmSectionOffset().getOffsets().clear();
        List<Byte> data = mapper.write(new EmModelSourcePack(source));
        if (!data.isEmpty()) {
            System.out.println("ok");
        }
    }
}
