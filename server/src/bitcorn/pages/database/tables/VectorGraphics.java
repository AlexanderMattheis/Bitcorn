/*
 * This file is generated by jOOQ.
 */
package bitcorn.pages.database.tables;


import bitcorn.pages.database.Bitcorn;
import bitcorn.pages.database.Indexes;
import bitcorn.pages.database.Keys;
import bitcorn.pages.database.tables.records.VectorGraphicsRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VectorGraphics extends TableImpl<VectorGraphicsRecord> {

    private static final long serialVersionUID = 1332149144;

    /**
     * The reference instance of <code>bitcorn.vector_graphics</code>
     */
    public static final VectorGraphics VECTOR_GRAPHICS = new VectorGraphics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VectorGraphicsRecord> getRecordType() {
        return VectorGraphicsRecord.class;
    }

    /**
     * The column <code>bitcorn.vector_graphics.id</code>.
     */
    public final TableField<VectorGraphicsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.author</code>.
     */
    public final TableField<VectorGraphicsRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.date</code>.
     */
    public final TableField<VectorGraphicsRecord, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.description</code>.
     */
    public final TableField<VectorGraphicsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.image_path</code>.
     */
    public final TableField<VectorGraphicsRecord, String> IMAGE_PATH = createField("image_path", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.image_name</code>.
     */
    public final TableField<VectorGraphicsRecord, String> IMAGE_NAME = createField("image_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.licence_link</code>.
     */
    public final TableField<VectorGraphicsRecord, String> LICENCE_LINK = createField("licence_link", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.licence_name</code>.
     */
    public final TableField<VectorGraphicsRecord, String> LICENCE_NAME = createField("licence_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.path</code>.
     */
    public final TableField<VectorGraphicsRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.element_name</code>.
     */
    public final TableField<VectorGraphicsRecord, String> ELEMENT_NAME = createField("element_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.tags</code>.
     */
    public final TableField<VectorGraphicsRecord, String> TAGS = createField("tags", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>bitcorn.vector_graphics.title</code>.
     */
    public final TableField<VectorGraphicsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>bitcorn.vector_graphics</code> table reference
     */
    public VectorGraphics() {
        this(DSL.name("vector_graphics"), null);
    }

    /**
     * Create an aliased <code>bitcorn.vector_graphics</code> table reference
     */
    public VectorGraphics(String alias) {
        this(DSL.name(alias), VECTOR_GRAPHICS);
    }

    /**
     * Create an aliased <code>bitcorn.vector_graphics</code> table reference
     */
    public VectorGraphics(Name alias) {
        this(alias, VECTOR_GRAPHICS);
    }

    private VectorGraphics(Name alias, Table<VectorGraphicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VectorGraphics(Name alias, Table<VectorGraphicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> VectorGraphics(Table<O> child, ForeignKey<O, VectorGraphicsRecord> key) {
        super(child, key, VECTOR_GRAPHICS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Bitcorn.BITCORN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VECTOR_GRAPHICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VectorGraphicsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VECTOR_GRAPHICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VectorGraphicsRecord> getPrimaryKey() {
        return Keys.KEY_VECTOR_GRAPHICS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VectorGraphicsRecord>> getKeys() {
        return Arrays.<UniqueKey<VectorGraphicsRecord>>asList(Keys.KEY_VECTOR_GRAPHICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorGraphics as(String alias) {
        return new VectorGraphics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorGraphics as(Name alias) {
        return new VectorGraphics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VectorGraphics rename(String name) {
        return new VectorGraphics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VectorGraphics rename(Name name) {
        return new VectorGraphics(name, null);
    }
}
