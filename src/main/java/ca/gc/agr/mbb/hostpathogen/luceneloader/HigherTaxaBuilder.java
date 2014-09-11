package ca.gc.agr.mbb.hostpathogen.hostpathogenluceneloader;

import java.util.ArrayList;

public class HigherTaxaBuilder extends Builder{

    public static final String[] HIGHER_TAXA_FIELDS={
	PK_HIGHER_TAXA_ID,
	KINGDOM,
	DIVISION,
	CLASS,
	ORDER,
	FAMILY,
    };

    @Override
    public void init(){
	objectFields = HIGHER_TAXA_FIELDS;
    }

}
