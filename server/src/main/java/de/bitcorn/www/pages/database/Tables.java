/*
 * This file is generated by jOOQ.
 */
package de.bitcorn.www.pages.database;


import de.bitcorn.www.pages.database.tables.Contact;
import de.bitcorn.www.pages.database.tables.Textures;
import de.bitcorn.www.pages.database.tables.VectorGraphics;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in bitcorn
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>bitcorn.contact</code>.
     */
    public static final Contact CONTACT = de.bitcorn.www.pages.database.tables.Contact.CONTACT;

    /**
     * The table <code>bitcorn.textures</code>.
     */
    public static final Textures TEXTURES = de.bitcorn.www.pages.database.tables.Textures.TEXTURES;

    /**
     * The table <code>bitcorn.vector_graphics</code>.
     */
    public static final VectorGraphics VECTOR_GRAPHICS = de.bitcorn.www.pages.database.tables.VectorGraphics.VECTOR_GRAPHICS;
}
