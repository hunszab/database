/**

Copyright (C) SYSTAP, LLC 2006-2015.  All rights reserved.

Contact:
     SYSTAP, LLC
     2501 Calvert ST NW #106
     Washington, DC 20008
     licenses@systap.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
/*
 * Created on Mar 10, 2012
 */

package com.bigdata.rdf.sparql.ast;

import java.util.Map;

import com.bigdata.bop.BOp;

/**
 * A Graph Update operation.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 */
abstract public class GraphUpdate extends Update {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * @param updateType
     */
    public GraphUpdate(UpdateType updateType) {
        super(updateType);
    }

    /**
     * @param op
     */
    public GraphUpdate(GraphUpdate op) {
        super(op);
    }

    /**
     * @param args
     * @param anns
     */
    public GraphUpdate(BOp[] args, Map<String, Object> anns) {
        super(args, anns);
    }

}
