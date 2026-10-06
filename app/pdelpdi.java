package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelpdi extends GXProcedure
{
   public pdelpdi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelpdi.class ), "" );
   }

   public pdelpdi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 )
   {
      pdelpdi.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 )
   {
      pdelpdi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelpdi.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdelpdi.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdelpdi.this.AV15BarPieCod = aP3[0];
      this.aP3 = aP3;
      pdelpdi.this.AV16Desglose = aP4[0];
      this.aP4 = aP4;
      pdelpdi.this.AV21BarPieKil = aP5[0];
      this.aP5 = aP5;
      pdelpdi.this.AV22BarPieMet = aP6[0];
      this.aP6 = aP6;
      pdelpdi.this.AV23BarPiePie = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV20Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pdelpdi.this.AV20Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV24FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MABERA", ""), GXv_int1) ;
      pdelpdi.this.AV24FlagMab = GXv_int1[0] ;
      /* Optimized UPDATE. */
      /* Using cursor P00A72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized UPDATE. */
      /* Using cursor P00A73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A595Kilos = P00A73_A595Kilos[0] ;
         A631Metros = P00A73_A631Metros[0] ;
         A673Piezas = P00A73_A673Piezas[0] ;
         A595Kilos = A595Kilos.subtract(AV21BarPieKil) ;
         A631Metros = A631Metros.subtract(AV22BarPieMet) ;
         if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
         {
            A673Piezas = (int)(A673Piezas-1) ;
         }
         else
         {
            A673Piezas = (int)(A673Piezas-AV23BarPiePie) ;
         }
         /* Using cursor P00A74 */
         pr_default.execute(2, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV16Desglose, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P00A75 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), AV15BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
         /* End optimized DELETE. */
         if ( AV20Flag1 == 1 )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A44AlbRecCod ;
            GXv_char4[0] = AV15BarPieCod ;
            GXv_decimal5[0] = AV21BarPieKil ;
            GXv_decimal6[0] = AV22BarPieMet ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char9[0] = httpContext.getMessage( "DEL", "") ;
            new app.pdetpie(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_char9) ;
            pdelpdi.this.A396EmprCod = GXv_char2[0] ;
            pdelpdi.this.A44AlbRecCod = GXv_int3[0] ;
            pdelpdi.this.AV15BarPieCod = GXv_char4[0] ;
            pdelpdi.this.AV21BarPieKil = GXv_decimal5[0] ;
            pdelpdi.this.AV22BarPieMet = GXv_decimal6[0] ;
         }
      }
      if ( AV24FlagMab == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P00A76 */
         pr_default.execute(4, new Object[] {AV21BarPieKil, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelpdi.this.A396EmprCod;
      this.aP1[0] = pdelpdi.this.A361DisCod;
      this.aP2[0] = pdelpdi.this.A44AlbRecCod;
      this.aP3[0] = pdelpdi.this.AV15BarPieCod;
      this.aP4[0] = pdelpdi.this.AV16Desglose;
      this.aP5[0] = pdelpdi.this.AV21BarPieKil;
      this.aP6[0] = pdelpdi.this.AV22BarPieMet;
      this.aP7[0] = pdelpdi.this.AV23BarPiePie;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelpdi");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00A73_A396EmprCod = new String[] {""} ;
      P00A73_A361DisCod = new int[1] ;
      P00A73_A44AlbRecCod = new int[1] ;
      P00A73_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A73_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A73_A673Piezas = new int[1] ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char9 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelpdi__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00A73_A396EmprCod, P00A73_A361DisCod, P00A73_A44AlbRecCod, P00A73_A595Kilos, P00A73_A631Metros, P00A73_A673Piezas
            }
            , new Object[] {
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

   private byte AV20Flag1 ;
   private byte AV24FlagMab ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV23BarPiePie ;
   private int A673Piezas ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV21BarPieKil ;
   private java.math.BigDecimal AV22BarPieMet ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV15BarPieCod ;
   private String AV16Desglose ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char9[] ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A73_A396EmprCod ;
   private int[] P00A73_A361DisCod ;
   private int[] P00A73_A44AlbRecCod ;
   private java.math.BigDecimal[] P00A73_A595Kilos ;
   private java.math.BigDecimal[] P00A73_A631Metros ;
   private int[] P00A73_A673Piezas ;
}

final  class pdelpdi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00A72", "UPDATE TXPALBREC SET AlbREst=0  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new ForEachCursor("P00A73", "SELECT EmprCod, DisCod, AlbRecCod, Kilos, Metros, Piezas FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A74", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P00A75", "DELETE FROM TXPDISALD  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00A76", "UPDATE TXPDISPOS SET DisNumUni=DisNumUni - ?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

