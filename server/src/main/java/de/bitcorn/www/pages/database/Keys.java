/*
 * This file is generated by jOOQ.
 */
package de.bitcorn.www.pages.database;


import de.bitcorn.www.pages.database.tables.Contact;
import de.bitcorn.www.pages.database.tables.Textures;
import de.bitcorn.www.pages.database.tables.VectorGraphics;
import de.bitcorn.www.pages.database.tables.records.ContactRecord;
import de.bitcorn.www.pages.database.tables.records.TexturesRecord;
import de.bitcorn.www.pages.database.tables.records.VectorGraphicsRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>bitcorn</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ContactRecord, Integer> IDENTITY_CONTACT = Identities0.IDENTITY_CONTACT;
    public static final Identity<TexturesRecord, Integer> IDENTITY_TEXTURES = Identities0.IDENTITY_TEXTURES;
    public static final Identity<VectorGraphicsRecord, Integer> IDENTITY_VECTOR_GRAPHICS = Identities0.IDENTITY_VECTOR_GRAPHICS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ContactRecord> KEY_CONTACT_PRIMARY = UniqueKeys0.KEY_CONTACT_PRIMARY;
    public static final UniqueKey<TexturesRecord> KEY_TEXTURES_PRIMARY = UniqueKeys0.KEY_TEXTURES_PRIMARY;
    public static final UniqueKey<VectorGraphicsRecord> KEY_VECTOR_GRAPHICS_PRIMARY = UniqueKeys0.KEY_VECTOR_GRAPHICS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ContactRecord, Integer> IDENTITY_CONTACT = Internal.createIdentity(Contact.CONTACT, Contact.CONTACT.ID);
        public static Identity<TexturesRecord, Integer> IDENTITY_TEXTURES = Internal.createIdentity(Textures.TEXTURES, Textures.TEXTURES.ID);
        public static Identity<VectorGraphicsRecord, Integer> IDENTITY_VECTOR_GRAPHICS = Internal.createIdentity(VectorGraphics.VECTOR_GRAPHICS, VectorGraphics.VECTOR_GRAPHICS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ContactRecord> KEY_CONTACT_PRIMARY = Internal.createUniqueKey(Contact.CONTACT, "KEY_contact_PRIMARY", Contact.CONTACT.ID);
        public static final UniqueKey<TexturesRecord> KEY_TEXTURES_PRIMARY = Internal.createUniqueKey(Textures.TEXTURES, "KEY_textures_PRIMARY", Textures.TEXTURES.ID);
        public static final UniqueKey<VectorGraphicsRecord> KEY_VECTOR_GRAPHICS_PRIMARY = Internal.createUniqueKey(VectorGraphics.VECTOR_GRAPHICS, "KEY_vector_graphics_PRIMARY", VectorGraphics.VECTOR_GRAPHICS.ID);
    }
}
