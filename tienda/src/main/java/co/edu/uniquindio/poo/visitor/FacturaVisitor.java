package co.edu.uniquindio.poo.visitor;

import co.edu.uniquindio.poo.Cafe;
import co.edu.uniquindio.poo.Fruta;
import co.edu.uniquindio.poo.Refrigerado;

public interface FacturaVisitor {
    void visit(Cafe cafe);
    void visit(Fruta fruta);
    void visit(Refrigerado refrigerado);
}
