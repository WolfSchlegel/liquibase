package liquibase.action.core;

import liquibase.action.AbstractAction;

public class SetColumnRemarksAction extends AbstractAction {
    public static enum Attr {
        columnName,
        remarks,
    }
}