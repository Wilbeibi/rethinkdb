// Autogenerated by convert_protofile.py on 2015-05-06.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class TypeOf extends RqlQuery {


    public TypeOf(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.TYPE_OF, args, optargs);
    }
    protected TypeOf(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


}
