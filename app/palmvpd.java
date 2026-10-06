package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmvpd extends GXProcedure
{
   public palmvpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmvpd.class ), "" );
   }

   public palmvpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 )
   {
      palmvpd.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      palmvpd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      palmvpd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      palmvpd.this.AV17ExMvpFas = aP2[0];
      this.aP2 = aP2;
      palmvpd.this.AV18ExMvpTip = aP3[0];
      this.aP3 = aP3;
      palmvpd.this.AV19ExMvpAlb = aP4[0];
      this.aP4 = aP4;
      palmvpd.this.AV20Kgs = aP5[0];
      this.aP5 = aP5;
      palmvpd.this.AV21Conos = aP6[0];
      this.aP6 = aP6;
      palmvpd.this.AV22FecMov = aP7[0];
      this.aP7 = aP7;
      palmvpd.this.AV23PartCod = aP8[0];
      this.aP8 = aP8;
      palmvpd.this.AV24CliCod = aP9[0];
      this.aP9 = aP9;
      palmvpd.this.AV25Loca = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00DP2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV17ExMvpFas});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P00DP2_A457FasCod[0] ;
         A396EmprCod = P00DP2_A396EmprCod[0] ;
         A460FasDsc = P00DP2_A460FasDsc[0] ;
         AV27ExMvpFdc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV26FlagMov = (byte)(0) ;
      /* Using cursor P00DP3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExMvpFas});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2358ExMvpFas = P00DP3_A2358ExMvpFas[0] ;
         A2248ManCod = P00DP3_A2248ManCod[0] ;
         A396EmprCod = P00DP3_A396EmprCod[0] ;
         AV26FlagMov = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( (0==AV26FlagMov) )
      {
         /*
            INSERT RECORD ON TABLE TXPCEXMVP

         */
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2358ExMvpFas = AV17ExMvpFas ;
         A2359ExMvpFdc = AV27ExMvpFdc ;
         n2359ExMvpFdc = false ;
         A2346ExMvpUln = (short)(0) ;
         n2346ExMvpUln = false ;
         /* Using cursor P00DP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Boolean.valueOf(n2346ExMvpUln), Short.valueOf(A2346ExMvpUln), Boolean.valueOf(n2359ExMvpFdc), A2359ExMvpFdc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVP");
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
         /* End Insert */
      }
      /* Using cursor P00DP5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExMvpFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2346ExMvpUln = P00DP5_A2346ExMvpUln[0] ;
         n2346ExMvpUln = P00DP5_n2346ExMvpUln[0] ;
         A2358ExMvpFas = P00DP5_A2358ExMvpFas[0] ;
         A2248ManCod = P00DP5_A2248ManCod[0] ;
         A396EmprCod = P00DP5_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2358ExMvpFas = A2358ExMvpFas ;
         /*
            INSERT RECORD ON TABLE TXPLEXMVP

         */
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2358ExMvpFas = A2358ExMvpFas ;
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2358ExMvpFas = AV17ExMvpFas ;
         A2347ExMvpLin = (short)(A2346ExMvpUln+1) ;
         A966PartCod = AV23PartCod ;
         n966PartCod = false ;
         A252CliCod = AV24CliCod ;
         n252CliCod = false ;
         A2348ExMvpTip = AV18ExMvpTip ;
         n2348ExMvpTip = false ;
         A2349ExMvpAlb = AV19ExMvpAlb ;
         n2349ExMvpAlb = false ;
         A2350ExMvpKgE = AV20Kgs ;
         n2350ExMvpKgE = false ;
         A2351ExMvpCnE = AV21Conos ;
         n2351ExMvpCnE = false ;
         A2352ExMvpFeE = AV22FecMov ;
         n2352ExMvpFeE = false ;
         A2361ExMvpLoc = AV25Loca ;
         n2361ExMvpLoc = false ;
         /* Using cursor P00DP6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin), Boolean.valueOf(n2348ExMvpTip), A2348ExMvpTip, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2349ExMvpAlb), Integer.valueOf(A2349ExMvpAlb), Boolean.valueOf(n2350ExMvpKgE), A2350ExMvpKgE, Boolean.valueOf(n2351ExMvpCnE), Short.valueOf(A2351ExMvpCnE), Boolean.valueOf(n2352ExMvpFeE), A2352ExMvpFeE, Boolean.valueOf(n2361ExMvpLoc), A2361ExMvpLoc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
         if ( (pr_default.getStatus(4) == 1) )
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
         A2248ManCod = W2248ManCod ;
         A2358ExMvpFas = W2358ExMvpFas ;
         /* End Insert */
         A2346ExMvpUln = (short)(A2346ExMvpUln+1) ;
         n2346ExMvpUln = false ;
         /* Using cursor P00DP7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2346ExMvpUln), Short.valueOf(A2346ExMvpUln), A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVP");
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2358ExMvpFas = W2358ExMvpFas ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmvpd.this.AV15EmprCod;
      this.aP1[0] = palmvpd.this.AV16ManCod;
      this.aP2[0] = palmvpd.this.AV17ExMvpFas;
      this.aP3[0] = palmvpd.this.AV18ExMvpTip;
      this.aP4[0] = palmvpd.this.AV19ExMvpAlb;
      this.aP5[0] = palmvpd.this.AV20Kgs;
      this.aP6[0] = palmvpd.this.AV21Conos;
      this.aP7[0] = palmvpd.this.AV22FecMov;
      this.aP8[0] = palmvpd.this.AV23PartCod;
      this.aP9[0] = palmvpd.this.AV24CliCod;
      this.aP10[0] = palmvpd.this.AV25Loca;
      Application.commitDataStores(context, remoteHandle, pr_default, "palmvpd");
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
      P00DP2_A457FasCod = new String[] {""} ;
      P00DP2_A396EmprCod = new String[] {""} ;
      P00DP2_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      AV27ExMvpFdc = "" ;
      P00DP3_A2358ExMvpFas = new String[] {""} ;
      P00DP3_A2248ManCod = new short[1] ;
      P00DP3_A396EmprCod = new String[] {""} ;
      A2358ExMvpFas = "" ;
      A2359ExMvpFdc = "" ;
      Gx_emsg = "" ;
      P00DP5_A2346ExMvpUln = new short[1] ;
      P00DP5_n2346ExMvpUln = new boolean[] {false} ;
      P00DP5_A2358ExMvpFas = new String[] {""} ;
      P00DP5_A2248ManCod = new short[1] ;
      P00DP5_A396EmprCod = new String[] {""} ;
      W396EmprCod = "" ;
      W2358ExMvpFas = "" ;
      A966PartCod = "" ;
      A2348ExMvpTip = "" ;
      A2350ExMvpKgE = DecimalUtil.ZERO ;
      A2352ExMvpFeE = GXutil.nullDate() ;
      A2361ExMvpLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmvpd__default(),
         new Object[] {
             new Object[] {
            P00DP2_A457FasCod, P00DP2_A396EmprCod, P00DP2_A460FasDsc
            }
            , new Object[] {
            P00DP3_A2358ExMvpFas, P00DP3_A2248ManCod, P00DP3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00DP5_A2346ExMvpUln, P00DP5_n2346ExMvpUln, P00DP5_A2358ExMvpFas, P00DP5_A2248ManCod, P00DP5_A396EmprCod
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

   private byte AV26FlagMov ;
   private short AV16ManCod ;
   private short AV21Conos ;
   private short A2248ManCod ;
   private short A2346ExMvpUln ;
   private short Gx_err ;
   private short W2248ManCod ;
   private short A2347ExMvpLin ;
   private short A2351ExMvpCnE ;
   private int AV19ExMvpAlb ;
   private int AV24CliCod ;
   private int GX_INS319 ;
   private int GX_INS320 ;
   private int A252CliCod ;
   private int A2349ExMvpAlb ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal A2350ExMvpKgE ;
   private String AV15EmprCod ;
   private String AV17ExMvpFas ;
   private String AV18ExMvpTip ;
   private String AV23PartCod ;
   private String AV25Loca ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String AV27ExMvpFdc ;
   private String A2358ExMvpFas ;
   private String A2359ExMvpFdc ;
   private String Gx_emsg ;
   private String W396EmprCod ;
   private String W2358ExMvpFas ;
   private String A966PartCod ;
   private String A2348ExMvpTip ;
   private String A2361ExMvpLoc ;
   private java.util.Date AV22FecMov ;
   private java.util.Date A2352ExMvpFeE ;
   private boolean n2359ExMvpFdc ;
   private boolean n2346ExMvpUln ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2348ExMvpTip ;
   private boolean n2349ExMvpAlb ;
   private boolean n2350ExMvpKgE ;
   private boolean n2351ExMvpCnE ;
   private boolean n2352ExMvpFeE ;
   private boolean n2361ExMvpLoc ;
   private String[] aP10 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DP2_A457FasCod ;
   private String[] P00DP2_A396EmprCod ;
   private String[] P00DP2_A460FasDsc ;
   private String[] P00DP3_A2358ExMvpFas ;
   private short[] P00DP3_A2248ManCod ;
   private String[] P00DP3_A396EmprCod ;
   private short[] P00DP5_A2346ExMvpUln ;
   private boolean[] P00DP5_n2346ExMvpUln ;
   private String[] P00DP5_A2358ExMvpFas ;
   private short[] P00DP5_A2248ManCod ;
   private String[] P00DP5_A396EmprCod ;
}

final  class palmvpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DP2", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DP3", "SELECT ExMvpFas, ManCod, EmprCod FROM TXPCEXMVP WHERE EmprCod = ? and ManCod = ? and ExMvpFas = ? ORDER BY EmprCod, ManCod, ExMvpFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DP4", "INSERT INTO TXPCEXMVP(EmprCod, ManCod, ExMvpFas, ExMvpUln, ExMvpFdc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVP")
         ,new ForEachCursor("P00DP5", "SELECT ExMvpUln, ExMvpFas, ManCod, EmprCod FROM TXPCEXMVP WHERE EmprCod = ? and ManCod = ? and ExMvpFas = ? ORDER BY EmprCod, ManCod, ExMvpFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00DP6", "INSERT INTO TXPLEXMVP(EmprCod, ManCod, ExMvpFas, ExMvpLin, ExMvpTip, PartCod, CliCod, ExMvpAlb, ExMvpKgE, ExMvpCnE, ExMvpFeE, ExMvpLoc, ExMvpKgR, ExMvpCnR, ExMvpFeR, ExMvpKRe, ExMvpCRe, ExMvpExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
         ,new UpdateCursor("P00DP7", "UPDATE TXPCEXMVP SET ExMvpUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExMvpFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 28);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 10);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               return;
      }
   }

}

