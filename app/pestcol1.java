package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcol1 extends GXProcedure
{
   public pestcol1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcol1.class ), "" );
   }

   public pestcol1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pestcol1.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pestcol1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcol1.this.AV14Clicod = aP1[0];
      this.aP1 = aP1;
      pestcol1.this.AV8EstCol = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV11Artextil)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pestcol1.this.GXt_int1 = GXv_int2[0] ;
      AV11Artextil = DecimalUtil.doubleToDec(GXt_int1) ;
      AV9EstCol2 = GXutil.trim( AV8EstCol) + "%" ;
      if ( AV11Artextil.doubleValue() == 1 )
      {
         /* Using cursor P031A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8EstCol});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4415EstCol = P031A2_A4415EstCol[0] ;
            A252CliCod = P031A2_A252CliCod[0] ;
            A6848EstColDsc = P031A2_A6848EstColDsc[0] ;
            n6848EstColDsc = P031A2_n6848EstColDsc[0] ;
            A11685EstColBck = P031A2_A11685EstColBck[0] ;
            n11685EstColBck = P031A2_n11685EstColBck[0] ;
            AV12EstColDsc = A6848EstColDsc ;
            AV13EstColBck = A11685EstColBck ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      lV9EstCol2 = GXutil.padr( GXutil.rtrim( AV9EstCol2), 20, "%") ;
      /* Using cursor P031A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14Clicod), AV11Artextil, lV9EstCol2, AV8EstCol});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4415EstCol = P031A3_A4415EstCol[0] ;
         A252CliCod = P031A3_A252CliCod[0] ;
         A6848EstColDsc = P031A3_A6848EstColDsc[0] ;
         n6848EstColDsc = P031A3_n6848EstColDsc[0] ;
         A11685EstColBck = P031A3_A11685EstColBck[0] ;
         n11685EstColBck = P031A3_n11685EstColBck[0] ;
         if ( AV11Artextil.doubleValue() == 1 )
         {
            A6848EstColDsc = AV12EstColDsc ;
            n6848EstColDsc = false ;
            A11685EstColBck = AV13EstColBck ;
            n11685EstColBck = false ;
         }
         AV10EstCol1 = A4415EstCol ;
         /* Execute user subroutine: 'ELIMINAR_COLOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ACTUALIZARCOLOR' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P031A4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n6848EstColDsc), A6848EstColDsc, Boolean.valueOf(n11685EstColBck), A11685EstColBck, A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEstCo");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ELIMINAR_COLOR' Routine */
      returnInSub = false ;
      /* Using cursor P031A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV14Clicod), AV11Artextil, AV10EstCol1});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4415EstCol = P031A5_A4415EstCol[0] ;
         A252CliCod = P031A5_A252CliCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P031A6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEstCo");
         /* End optimized DELETE. */
         /* Using cursor P031A7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEstCo");
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'ACTUALIZARCOLOR' Routine */
      returnInSub = false ;
      /* Using cursor P031A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV14Clicod), AV11Artextil, AV10EstCol1});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4420MolCol = P031A8_A4420MolCol[0] ;
         n4420MolCol = P031A8_n4420MolCol[0] ;
         A252CliCod = P031A8_A252CliCod[0] ;
         A2141SerEst = P031A8_A2141SerEst[0] ;
         A1013DibCli = P031A8_A1013DibCli[0] ;
         A1014DibInt = P031A8_A1014DibInt[0] ;
         A2074ColCom = P031A8_A2074ColCom[0] ;
         A2078ColFon = P031A8_A2078ColFon[0] ;
         A2098MolCod = P031A8_A2098MolCod[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char5[0] = A2141SerEst ;
         GXv_char6[0] = A1013DibCli ;
         GXv_int7[0] = A1014DibInt ;
         GXv_char8[0] = A2074ColCom ;
         GXv_char9[0] = A2078ColFon ;
         GXv_int2[0] = A2098MolCod ;
         GXv_char10[0] = A4420MolCol ;
         GXv_int11[0] = (short)(0) ;
         new app.pestcol(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_char8, GXv_char9, GXv_int2, GXv_char10, GXv_int11) ;
         pestcol1.this.A396EmprCod = GXv_char3[0] ;
         pestcol1.this.A252CliCod = GXv_int4[0] ;
         pestcol1.this.A2141SerEst = GXv_char5[0] ;
         pestcol1.this.A1013DibCli = GXv_char6[0] ;
         pestcol1.this.A1014DibInt = GXv_int7[0] ;
         pestcol1.this.A2074ColCom = GXv_char8[0] ;
         pestcol1.this.A2078ColFon = GXv_char9[0] ;
         pestcol1.this.A2098MolCod = GXv_int2[0] ;
         pestcol1.this.A4420MolCol = GXv_char10[0] ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestcol1.this.A396EmprCod;
      this.aP1[0] = pestcol1.this.AV14Clicod;
      this.aP2[0] = pestcol1.this.AV8EstCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestcol1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Artextil = DecimalUtil.ZERO ;
      AV9EstCol2 = "" ;
      scmdbuf = "" ;
      P031A2_A396EmprCod = new String[] {""} ;
      P031A2_A4415EstCol = new String[] {""} ;
      P031A2_A252CliCod = new int[1] ;
      P031A2_A6848EstColDsc = new String[] {""} ;
      P031A2_n6848EstColDsc = new boolean[] {false} ;
      P031A2_A11685EstColBck = new String[] {""} ;
      P031A2_n11685EstColBck = new boolean[] {false} ;
      A4415EstCol = "" ;
      A6848EstColDsc = "" ;
      A11685EstColBck = "" ;
      AV12EstColDsc = "" ;
      AV13EstColBck = "" ;
      lV9EstCol2 = "" ;
      P031A3_A396EmprCod = new String[] {""} ;
      P031A3_A4415EstCol = new String[] {""} ;
      P031A3_A252CliCod = new int[1] ;
      P031A3_A6848EstColDsc = new String[] {""} ;
      P031A3_n6848EstColDsc = new boolean[] {false} ;
      P031A3_A11685EstColBck = new String[] {""} ;
      P031A3_n11685EstColBck = new boolean[] {false} ;
      AV10EstCol1 = "" ;
      P031A5_A396EmprCod = new String[] {""} ;
      P031A5_A4415EstCol = new String[] {""} ;
      P031A5_A252CliCod = new int[1] ;
      P031A8_A396EmprCod = new String[] {""} ;
      P031A8_A4420MolCol = new String[] {""} ;
      P031A8_n4420MolCol = new boolean[] {false} ;
      P031A8_A252CliCod = new int[1] ;
      P031A8_A2141SerEst = new String[] {""} ;
      P031A8_A1013DibCli = new String[] {""} ;
      P031A8_A1014DibInt = new int[1] ;
      P031A8_A2074ColCom = new String[] {""} ;
      P031A8_A2078ColFon = new String[] {""} ;
      P031A8_A2098MolCod = new byte[1] ;
      A4420MolCol = "" ;
      A2141SerEst = "" ;
      A1013DibCli = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestcol1__default(),
         new Object[] {
             new Object[] {
            P031A2_A396EmprCod, P031A2_A4415EstCol, P031A2_A252CliCod, P031A2_A6848EstColDsc, P031A2_n6848EstColDsc, P031A2_A11685EstColBck, P031A2_n11685EstColBck
            }
            , new Object[] {
            P031A3_A396EmprCod, P031A3_A4415EstCol, P031A3_A252CliCod, P031A3_A6848EstColDsc, P031A3_n6848EstColDsc, P031A3_A11685EstColBck, P031A3_n11685EstColBck
            }
            , new Object[] {
            }
            , new Object[] {
            P031A5_A396EmprCod, P031A5_A4415EstCol, P031A5_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P031A8_A396EmprCod, P031A8_A4420MolCol, P031A8_n4420MolCol, P031A8_A252CliCod, P031A8_A2141SerEst, P031A8_A1013DibCli, P031A8_A1014DibInt, P031A8_A2074ColCom, P031A8_A2078ColFon, P031A8_A2098MolCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte A2098MolCod ;
   private byte GXv_int2[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV14Clicod ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV11Artextil ;
   private String A396EmprCod ;
   private String AV8EstCol ;
   private String AV9EstCol2 ;
   private String scmdbuf ;
   private String A4415EstCol ;
   private String A6848EstColDsc ;
   private String A11685EstColBck ;
   private String AV12EstColDsc ;
   private String AV13EstColBck ;
   private String lV9EstCol2 ;
   private String AV10EstCol1 ;
   private String A4420MolCol ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private boolean n6848EstColDsc ;
   private boolean n11685EstColBck ;
   private boolean returnInSub ;
   private boolean n4420MolCol ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P031A2_A396EmprCod ;
   private String[] P031A2_A4415EstCol ;
   private int[] P031A2_A252CliCod ;
   private String[] P031A2_A6848EstColDsc ;
   private boolean[] P031A2_n6848EstColDsc ;
   private String[] P031A2_A11685EstColBck ;
   private boolean[] P031A2_n11685EstColBck ;
   private String[] P031A3_A396EmprCod ;
   private String[] P031A3_A4415EstCol ;
   private int[] P031A3_A252CliCod ;
   private String[] P031A3_A6848EstColDsc ;
   private boolean[] P031A3_n6848EstColDsc ;
   private String[] P031A3_A11685EstColBck ;
   private boolean[] P031A3_n11685EstColBck ;
   private String[] P031A5_A396EmprCod ;
   private String[] P031A5_A4415EstCol ;
   private int[] P031A5_A252CliCod ;
   private String[] P031A8_A396EmprCod ;
   private String[] P031A8_A4420MolCol ;
   private boolean[] P031A8_n4420MolCol ;
   private int[] P031A8_A252CliCod ;
   private String[] P031A8_A2141SerEst ;
   private String[] P031A8_A1013DibCli ;
   private int[] P031A8_A1014DibInt ;
   private String[] P031A8_A2074ColCom ;
   private String[] P031A8_A2078ColFon ;
   private byte[] P031A8_A2098MolCod ;
}

final  class pestcol1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P031A2", "SELECT EmprCod, EstCol, CliCod, EstColDsc, EstColBck FROM TXPCEstCo WHERE EmprCod = ? and CliCod = 1 and EstCol = ? ORDER BY EmprCod, CliCod, EstCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P031A3", "SELECT EmprCod, EstCol, CliCod, EstColDsc, EstColBck FROM TXPCEstCo WHERE (EmprCod = ?) AND (CliCod = ? or ( ? = 1 and CliCod = 1)) AND (EstCol like ?) AND (EstCol <> ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P031A4", "UPDATE TXPCEstCo SET EstColDsc=?, EstColBck=?  WHERE EmprCod = ? AND CliCod = ? AND EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEstCo")
         ,new ForEachCursor("P031A5", "SELECT EmprCod, EstCol, CliCod FROM TXPCEstCo WHERE (EmprCod = ?) AND (CliCod = ? or ( ? = 1 and CliCod = 1)) AND (EstCol = ?) ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P031A6", "DELETE FROM TXPLEstCo  WHERE EmprCod = ? and CliCod = ? and EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEstCo")
         ,new UpdateCursor("P031A7", "DELETE FROM TXPCEstCo  WHERE EmprCod = ? AND CliCod = ? AND EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEstCo")
         ,new ForEachCursor("P031A8", "SELECT EmprCod, MolCol, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE (EmprCod = ?) AND (CliCod = ? or ( ? = 1 and CliCod = 1)) AND (MolCol = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 20);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 20);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 20);
               return;
      }
   }

}

