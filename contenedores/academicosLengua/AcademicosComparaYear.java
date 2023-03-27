package contenedores.academicosLengua;

import java.util.Comparator;

public class AcademicosComparaYear implements Comparator<Academico> {

    @Override
    public int compare(Academico arg0, Academico arg1) {
        return arg0.getYearIngreso() - arg1.getYearIngreso();
    }

    
    
}
