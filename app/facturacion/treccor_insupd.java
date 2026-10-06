package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class treccor_insupd extends GXProcedure
{
   public treccor_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treccor_insupd.class ), "" );
   }

   public treccor_insupd( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        byte aP6 ,
                        int aP7 ,
                        int aP8 ,
                        java.math.BigDecimal aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             byte aP6 ,
                             int aP7 ,
                             int aP8 ,
                             java.math.BigDecimal aP9 )
   {
      treccor_insupd.this.A396EmprCod = aP0;
      treccor_insupd.this.A252CliCod = aP1;
      treccor_insupd.this.A494ForSer = aP2;
      treccor_insupd.this.A482ForColNom = aP3;
      treccor_insupd.this.A483ForColNum = aP4;
      treccor_insupd.this.A831TipColCod = aP5;
      treccor_insupd.this.AV8RecCorLin = aP6;
      treccor_insupd.this.AV9RecValIni = aP7;
      treccor_insupd.this.AV10RecValFin = aP8;
      treccor_insupd.this.AV11RecCanRec = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21GXLvl4 = (byte)(0) ;
      n1520RecValIni = false ;
      n1521RecValFin = false ;
      n1522RecCanRec = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMN2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n1520RecValIni), Integer.valueOf(AV9RecValIni), Boolean.valueOf(n1521RecValFin), Integer.valueOf(AV10RecValFin), Boolean.valueOf(n1522RecCanRec), AV11RecCanRec, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(AV8RecCorLin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV21GXLvl4 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
      /* End optimized UPDATE. */
      if ( AV21GXLvl4 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPRECCOR

         */
         A1519RecCorLin = AV8RecCorLin ;
         A1522RecCanRec = AV11RecCanRec ;
         n1522RecCanRec = false ;
         A1521RecValFin = AV10RecValFin ;
         n1521RecValFin = false ;
         A1520RecValIni = AV9RecValIni ;
         n1520RecValIni = false ;
         /* Using cursor P0AMN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(A1519RecCorLin), Boolean.valueOf(n1520RecValIni), Integer.valueOf(A1520RecValIni), Boolean.valueOf(n1521RecValFin), Integer.valueOf(A1521RecValFin), Boolean.valueOf(n1522RecCanRec), A1522RecCanRec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
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
         /* End Insert */
      }
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.treccor_insupd");
      GXt_int1 = (byte)(AV12RecCorLinlast) ;
      GXv_int2[0] = GXt_int1 ;
      new app.facturacion.treccor_nextlinea(remoteHandle, context).execute( AV13emprcod, AV14CliCod, AV15ForSer, AV16ForColNom, AV17ForColNum, AV18TipColCod, GXv_int2) ;
      treccor_insupd.this.GXt_int1 = GXv_int2[0] ;
      AV12RecCorLinlast = GXt_int1 ;
      AV12RecCorLinlast = (short)(AV12RecCorLinlast-1) ;
      n1518RecCorULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMN4 */
      byte AV12RecCorLinlast1518Aux;
      AV12RecCorLinlast1518Aux = (byte)(AV12RecCorLinlast) ;
      pr_default.execute(2, new Object[] {Boolean.valueOf(n1518RecCorULin), Byte.valueOf(AV12RecCorLinlast1518Aux), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.treccor_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1522RecCanRec = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV13emprcod = "" ;
      AV15ForSer = "" ;
      AV16ForColNom = "" ;
      GXv_int2 = new byte[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_insupd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_insupd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_insupd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_insupd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8RecCorLin ;
   private byte AV21GXLvl4 ;
   private byte A1519RecCorLin ;
   private byte GXt_int1 ;
   private byte AV18TipColCod ;
   private byte GXv_int2[] ;
   private byte A1518RecCorULin ;
   private short Gx_err ;
   private short AV12RecCorLinlast ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV9RecValIni ;
   private int AV10RecValFin ;
   private int A1520RecValIni ;
   private int A1521RecValFin ;
   private int GX_INS216 ;
   private int AV14CliCod ;
   private int AV17ForColNum ;
   private java.math.BigDecimal AV11RecCanRec ;
   private java.math.BigDecimal A1522RecCanRec ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String Gx_emsg ;
   private String AV13emprcod ;
   private String AV15ForSer ;
   private String AV16ForColNom ;
   private boolean n1520RecValIni ;
   private boolean n1521RecValFin ;
   private boolean n1522RecCanRec ;
   private boolean n1518RecCorULin ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class treccor_insupd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_insupd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_insupd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treccor_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMN2", "UPDATE TXPRECCOR SET RecValIni=?, RecValFin=?, RecCanRec=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and RecCorLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOR")
         ,new UpdateCursor("P0AMN3", "INSERT INTO TXPRECCOR(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin, RecValIni, RecValFin, RecCanRec, RecIncPor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOR")
         ,new UpdateCursor("P0AMN4", "UPDATE TXPCFORMU SET RecCorULin=?  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               stmt.setString(7, (String)parms[9], 13);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

