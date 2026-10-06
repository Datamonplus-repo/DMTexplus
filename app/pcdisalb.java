package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcdisalb extends GXProcedure
{
   public pcdisalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcdisalb.class ), "" );
   }

   public pcdisalb( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pcdisalb.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pcdisalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcdisalb.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pcdisalb.this.AV9barcodReo = aP2[0];
      this.aP2 = aP2;
      pcdisalb.this.AV10barcodpar = aP3[0];
      this.aP3 = aP3;
      pcdisalb.this.AV11Discod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P02UU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "pcdisalb");
      AV12Kgs = DecimalUtil.doubleToDec(0) ;
      AV13Pzas = 0 ;
      /* Using cursor P02UU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9barcodReo), AV10barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1501BarPiePie = P02UU3_A1501BarPiePie[0] ;
         A203BarPieKil = P02UU3_A203BarPieKil[0] ;
         A205BarPieMet = P02UU3_A205BarPieMet[0] ;
         A44AlbRecCod = P02UU3_A44AlbRecCod[0] ;
         A130BarCodPar = P02UU3_A130BarCodPar[0] ;
         A132BarCodReo = P02UU3_A132BarCodReo[0] ;
         A129BarCod = P02UU3_A129BarCod[0] ;
         A200BarPieCod = P02UU3_A200BarPieCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV12Kgs = AV12Kgs.add(A203BarPieKil) ;
         AV13Pzas = (int)(AV13Pzas+A1501BarPiePie) ;
         /*
            INSERT RECORD ON TABLE TXPDISALB

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W44AlbRecCod = A44AlbRecCod ;
         W673Piezas = A673Piezas ;
         W595Kilos = A595Kilos ;
         W631Metros = A631Metros ;
         W3699KilosUti = A3699KilosUti ;
         n3699KilosUti = false ;
         W3700MetrosUti = A3700MetrosUti ;
         n3700MetrosUti = false ;
         W3701PiezasUti = A3701PiezasUti ;
         n3701PiezasUti = false ;
         A361DisCod = AV11Discod ;
         A673Piezas = A1501BarPiePie ;
         A595Kilos = A203BarPieKil ;
         A631Metros = A205BarPieMet ;
         A3699KilosUti = DecimalUtil.doubleToDec(0) ;
         n3699KilosUti = false ;
         A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
         n3700MetrosUti = false ;
         A3701PiezasUti = (short)(0) ;
         n3701PiezasUti = false ;
         /* Using cursor P02UU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
         if ( (pr_default.getStatus(2) == 1) )
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
         A361DisCod = W361DisCod ;
         A44AlbRecCod = W44AlbRecCod ;
         A673Piezas = W673Piezas ;
         A595Kilos = W595Kilos ;
         A631Metros = W631Metros ;
         A3699KilosUti = W3699KilosUti ;
         n3699KilosUti = false ;
         A3700MetrosUti = W3700MetrosUti ;
         n3700MetrosUti = false ;
         A3701PiezasUti = W3701PiezasUti ;
         n3701PiezasUti = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Optimized UPDATE. */
      /* Using cursor P02UU5 */
      short AV13Pzas374Aux;
      AV13Pzas374Aux = (short)(AV13Pzas) ;
      pr_default.execute(3, new Object[] {Short.valueOf(AV13Pzas374Aux), AV12Kgs, A396EmprCod, Integer.valueOf(AV11Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcdisalb.this.A396EmprCod;
      this.aP1[0] = pcdisalb.this.AV8Barcod;
      this.aP2[0] = pcdisalb.this.AV9barcodReo;
      this.aP3[0] = pcdisalb.this.AV10barcodpar;
      this.aP4[0] = pcdisalb.this.AV11Discod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcdisalb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Kgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02UU3_A396EmprCod = new String[] {""} ;
      P02UU3_A1501BarPiePie = new int[1] ;
      P02UU3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UU3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02UU3_A44AlbRecCod = new int[1] ;
      P02UU3_A130BarCodPar = new String[] {""} ;
      P02UU3_A132BarCodReo = new byte[1] ;
      P02UU3_A129BarCod = new int[1] ;
      P02UU3_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      W396EmprCod = "" ;
      W595Kilos = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      W631Metros = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      W3699KilosUti = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      W3700MetrosUti = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pcdisalb__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pcdisalb__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pcdisalb__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcdisalb__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P02UU3_A396EmprCod, P02UU3_A1501BarPiePie, P02UU3_A203BarPieKil, P02UU3_A205BarPieMet, P02UU3_A44AlbRecCod, P02UU3_A130BarCodPar, P02UU3_A132BarCodReo, P02UU3_A129BarCod, P02UU3_A200BarPieCod
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

   private byte AV9barcodReo ;
   private byte A132BarCodReo ;
   private short W3701PiezasUti ;
   private short A3701PiezasUti ;
   private short Gx_err ;
   private short A374DisNumPie ;
   private int AV8Barcod ;
   private int AV11Discod ;
   private int AV13Pzas ;
   private int A1501BarPiePie ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int GX_INS35 ;
   private int W361DisCod ;
   private int A361DisCod ;
   private int W44AlbRecCod ;
   private int W673Piezas ;
   private int A673Piezas ;
   private java.math.BigDecimal AV12Kgs ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal W595Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal W631Metros ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal W3699KilosUti ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal W3700MetrosUti ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal A375DisNumUni ;
   private String A396EmprCod ;
   private String AV10barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean n3699KilosUti ;
   private boolean n3700MetrosUti ;
   private boolean n3701PiezasUti ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02UU3_A396EmprCod ;
   private int[] P02UU3_A1501BarPiePie ;
   private java.math.BigDecimal[] P02UU3_A203BarPieKil ;
   private java.math.BigDecimal[] P02UU3_A205BarPieMet ;
   private int[] P02UU3_A44AlbRecCod ;
   private String[] P02UU3_A130BarCodPar ;
   private byte[] P02UU3_A132BarCodReo ;
   private int[] P02UU3_A129BarCod ;
   private String[] P02UU3_A200BarPieCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcdisalb__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcdisalb__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcdisalb__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pcdisalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02UU2", "DELETE FROM TXPDISALB  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P02UU3", "SELECT EmprCod, BarPiePie, BarPieKil, BarPieMet, AlbRecCod, BarCodPar, BarCodReo, BarCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02UU4", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P02UU5", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

