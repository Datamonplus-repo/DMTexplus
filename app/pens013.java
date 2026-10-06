package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens013 extends GXProcedure
{
   public pens013( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens013.class ), "" );
   }

   public pens013( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pens013.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pens013.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens013.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens013.this.AV9Lb_opcionc = aP2[0];
      this.aP2 = aP2;
      pens013.this.AV8Lb_opcion = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01TE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV9Lb_opcionc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P01TE2_A5555Lb_opcion[0] ;
         A14096Lb_fibra = P01TE2_A14096Lb_fibra[0] ;
         A6544Lb_PTinC = P01TE2_A6544Lb_PTinC[0] ;
         A6058Lb_soluc = P01TE2_A6058Lb_soluc[0] ;
         A5558LB_CantC = P01TE2_A5558LB_CantC[0] ;
         A490ForPrdUMe = P01TE2_A490ForPrdUMe[0] ;
         A719PrdNum = P01TE2_A719PrdNum[0] ;
         A5557Lb_LineaC = P01TE2_A5557Lb_LineaC[0] ;
         W396EmprCod = A396EmprCod ;
         W5532Lb_numero = A5532Lb_numero ;
         W5555Lb_opcion = A5555Lb_opcion ;
         /*
            INSERT RECORD ON TABLE TXPENS003

         */
         W396EmprCod = A396EmprCod ;
         W5532Lb_numero = A5532Lb_numero ;
         W5555Lb_opcion = A5555Lb_opcion ;
         W5557Lb_LineaC = A5557Lb_LineaC ;
         W719PrdNum = A719PrdNum ;
         W490ForPrdUMe = A490ForPrdUMe ;
         W5558LB_CantC = A5558LB_CantC ;
         W6058Lb_soluc = A6058Lb_soluc ;
         W6544Lb_PTinC = A6544Lb_PTinC ;
         A5555Lb_opcion = AV8Lb_opcion ;
         /* Using cursor P01TE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A5532Lb_numero = W5532Lb_numero ;
         A5555Lb_opcion = W5555Lb_opcion ;
         A5557Lb_LineaC = W5557Lb_LineaC ;
         A719PrdNum = W719PrdNum ;
         A490ForPrdUMe = W490ForPrdUMe ;
         A5558LB_CantC = W5558LB_CantC ;
         A6058Lb_soluc = W6058Lb_soluc ;
         A6544Lb_PTinC = W6544Lb_PTinC ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A5532Lb_numero = W5532Lb_numero ;
         A5555Lb_opcion = W5555Lb_opcion ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01TE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV9Lb_opcionc});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5555Lb_opcion = P01TE4_A5555Lb_opcion[0] ;
         A6545Lb_PTinP = P01TE4_A6545Lb_PTinP[0] ;
         A6059Lb_solup = P01TE4_A6059Lb_solup[0] ;
         A5562Lb_orden = P01TE4_A5562Lb_orden[0] ;
         A5561LB_CantP = P01TE4_A5561LB_CantP[0] ;
         A490ForPrdUMe = P01TE4_A490ForPrdUMe[0] ;
         A719PrdNum = P01TE4_A719PrdNum[0] ;
         A5560Lb_LineaPr = P01TE4_A5560Lb_LineaPr[0] ;
         W396EmprCod = A396EmprCod ;
         W5532Lb_numero = A5532Lb_numero ;
         W5555Lb_opcion = A5555Lb_opcion ;
         /*
            INSERT RECORD ON TABLE TXPENS004

         */
         W396EmprCod = A396EmprCod ;
         W5532Lb_numero = A5532Lb_numero ;
         W5555Lb_opcion = A5555Lb_opcion ;
         W5560Lb_LineaPr = A5560Lb_LineaPr ;
         W719PrdNum = A719PrdNum ;
         W490ForPrdUMe = A490ForPrdUMe ;
         W5561LB_CantP = A5561LB_CantP ;
         W5562Lb_orden = A5562Lb_orden ;
         W6059Lb_solup = A6059Lb_solup ;
         W6545Lb_PTinP = A6545Lb_PTinP ;
         A5555Lb_opcion = AV8Lb_opcion ;
         /* Using cursor P01TE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Integer.valueOf(A6059Lb_solup), Byte.valueOf(A6545Lb_PTinP)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A5532Lb_numero = W5532Lb_numero ;
         A5555Lb_opcion = W5555Lb_opcion ;
         A5560Lb_LineaPr = W5560Lb_LineaPr ;
         A719PrdNum = W719PrdNum ;
         A490ForPrdUMe = W490ForPrdUMe ;
         A5561LB_CantP = W5561LB_CantP ;
         A5562Lb_orden = W5562Lb_orden ;
         A6059Lb_solup = W6059Lb_solup ;
         A6545Lb_PTinP = W6545Lb_PTinP ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A5532Lb_numero = W5532Lb_numero ;
         A5555Lb_opcion = W5555Lb_opcion ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Application.commitDataStores(context, remoteHandle, pr_default, "pens013");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens013.this.A396EmprCod;
      this.aP1[0] = pens013.this.A5532Lb_numero;
      this.aP2[0] = pens013.this.AV9Lb_opcionc;
      this.aP3[0] = pens013.this.AV8Lb_opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens013");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01TE2_A396EmprCod = new String[] {""} ;
      P01TE2_A5532Lb_numero = new int[1] ;
      P01TE2_A5555Lb_opcion = new String[] {""} ;
      P01TE2_A14096Lb_fibra = new String[] {""} ;
      P01TE2_A6544Lb_PTinC = new byte[1] ;
      P01TE2_A6058Lb_soluc = new int[1] ;
      P01TE2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TE2_A490ForPrdUMe = new byte[1] ;
      P01TE2_A719PrdNum = new String[] {""} ;
      P01TE2_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      A14096Lb_fibra = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      W396EmprCod = "" ;
      W5555Lb_opcion = "" ;
      W719PrdNum = "" ;
      W5558LB_CantC = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P01TE4_A396EmprCod = new String[] {""} ;
      P01TE4_A5532Lb_numero = new int[1] ;
      P01TE4_A5555Lb_opcion = new String[] {""} ;
      P01TE4_A6545Lb_PTinP = new byte[1] ;
      P01TE4_A6059Lb_solup = new int[1] ;
      P01TE4_A5562Lb_orden = new short[1] ;
      P01TE4_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01TE4_A490ForPrdUMe = new byte[1] ;
      P01TE4_A719PrdNum = new String[] {""} ;
      P01TE4_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      W5561LB_CantP = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pens013__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pens013__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pens013__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens013__default(),
         new Object[] {
             new Object[] {
            P01TE2_A396EmprCod, P01TE2_A5532Lb_numero, P01TE2_A5555Lb_opcion, P01TE2_A14096Lb_fibra, P01TE2_A6544Lb_PTinC, P01TE2_A6058Lb_soluc, P01TE2_A5558LB_CantC, P01TE2_A490ForPrdUMe, P01TE2_A719PrdNum, P01TE2_A5557Lb_LineaC
            }
            , new Object[] {
            }
            , new Object[] {
            P01TE4_A396EmprCod, P01TE4_A5532Lb_numero, P01TE4_A5555Lb_opcion, P01TE4_A6545Lb_PTinP, P01TE4_A6059Lb_solup, P01TE4_A5562Lb_orden, P01TE4_A5561LB_CantP, P01TE4_A490ForPrdUMe, P01TE4_A719PrdNum, P01TE4_A5560Lb_LineaPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6544Lb_PTinC ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte W6544Lb_PTinC ;
   private byte A6545Lb_PTinP ;
   private byte W6545Lb_PTinP ;
   private short A5557Lb_LineaC ;
   private short W5557Lb_LineaC ;
   private short Gx_err ;
   private short A5562Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short W5560Lb_LineaPr ;
   private short W5562Lb_orden ;
   private int A5532Lb_numero ;
   private int A6058Lb_soluc ;
   private int W5532Lb_numero ;
   private int GX_INS820 ;
   private int W6058Lb_soluc ;
   private int A6059Lb_solup ;
   private int GX_INS821 ;
   private int W6059Lb_solup ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal W5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal W5561LB_CantP ;
   private String A396EmprCod ;
   private String AV9Lb_opcionc ;
   private String AV8Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A14096Lb_fibra ;
   private String A719PrdNum ;
   private String W396EmprCod ;
   private String W5555Lb_opcion ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01TE2_A396EmprCod ;
   private int[] P01TE2_A5532Lb_numero ;
   private String[] P01TE2_A5555Lb_opcion ;
   private String[] P01TE2_A14096Lb_fibra ;
   private byte[] P01TE2_A6544Lb_PTinC ;
   private int[] P01TE2_A6058Lb_soluc ;
   private java.math.BigDecimal[] P01TE2_A5558LB_CantC ;
   private byte[] P01TE2_A490ForPrdUMe ;
   private String[] P01TE2_A719PrdNum ;
   private short[] P01TE2_A5557Lb_LineaC ;
   private String[] P01TE4_A396EmprCod ;
   private int[] P01TE4_A5532Lb_numero ;
   private String[] P01TE4_A5555Lb_opcion ;
   private byte[] P01TE4_A6545Lb_PTinP ;
   private int[] P01TE4_A6059Lb_solup ;
   private short[] P01TE4_A5562Lb_orden ;
   private java.math.BigDecimal[] P01TE4_A5561LB_CantP ;
   private byte[] P01TE4_A490ForPrdUMe ;
   private String[] P01TE4_A719PrdNum ;
   private short[] P01TE4_A5560Lb_LineaPr ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pens013__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pens013__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pens013__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pens013__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TE2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_fibra, Lb_PTinC, Lb_soluc, LB_CantC, ForPrdUMe, PrdNum, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TE3", "INSERT INTO TXPENS003(EmprCod, Lb_numero, Lb_opcion, Lb_LineaC, PrdNum, ForPrdUMe, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new ForEachCursor("P01TE4", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PTinP, Lb_solup, Lb_orden, LB_CantP, ForPrdUMe, PrdNum, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01TE5", "INSERT INTO TXPENS004(EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr, PrdNum, ForPrdUMe, LB_CantP, Lb_orden, Lb_solup, Lb_PTinP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
      }
   }

}

