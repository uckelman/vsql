/*
 * $Id: VSQLTextInfo.java 857 2006-02-21 10:42:32Z swampwallaby $
 *
 * Copyright (c) 2005 Brent Easton
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License (LGPL) as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, copies are available
 * at http://www.opensource.org.
 */

package VSQL;

import VASL.counters.TextInfo;
import VASSAL.counters.GamePiece;
import VASSAL.counters.Properties;

/*
 * Turn off the TextInfo display automatically when the piece
 * is unselected. 
 */
public class VSQLTextInfo extends TextInfo {
  
  public VSQLTextInfo() {
    super();
  }
  
  public VSQLTextInfo(String type, GamePiece p) { 
    super(type, p);
  }
  
  public void setProperty(Object key, Object val) {
    if (Properties.SELECTED.equals(key)) {
      if (val == null) {
        showInfo = false;
      }
      super.setProperty(key, val); 
    }
    else {
      super.setProperty(key, val);
    }
  }
  
}