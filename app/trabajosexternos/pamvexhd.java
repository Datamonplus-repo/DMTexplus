package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pamvexhd extends GXProcedure
{
   public pamvexhd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pamvexhd.class ), "" );
   }

   public pamvexhd( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            short[] aP7 ,
                            java.util.Date[] aP8 ,
                            int[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 )
   {
      pamvexhd.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        java.util.Date[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             java.util.Date[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 )
   {
      pamvexhd.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pamvexhd.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pamvexhd.this.AV17ExHdrFas = aP2[0];
      this.aP2 = aP2;
      pamvexhd.this.AV18ExHdrTip = aP3[0];
      this.aP3 = aP3;
      pamvexhd.this.AV19ExHdrAlb = aP4[0];
      this.aP4 = aP4;
      pamvexhd.this.AV20Kgs = aP5[0];
      this.aP5 = aP5;
      pamvexhd.this.AV29Mts = aP6[0];
      this.aP6 = aP6;
      pamvexhd.this.AV21Conos = aP7[0];
      this.aP7 = aP7;
      pamvexhd.this.AV22FecMov = aP8[0];
      this.aP8 = aP8;
      pamvexhd.this.AV23BarCod = aP9[0];
      this.aP9 = aP9;
      pamvexhd.this.AV24BarCodReo = aP10[0];
      this.aP10 = aP10;
      pamvexhd.this.AV25BarCodPar = aP11[0];
      this.aP11 = aP11;
      pamvexhd.this.AV30SalExNln = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CH2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV17ExHdrFas});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02CH2_A457FasCod[0] ;
         A396EmprCod = P02CH2_A396EmprCod[0] ;
         A460FasDsc = P02CH2_A460FasDsc[0] ;
         AV28ExHdrFdc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV27FlagMov = (byte)(0) ;
      /* Using cursor P02CH3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2689ExHdrFas = P02CH3_A2689ExHdrFas[0] ;
         A2248ManCod = P02CH3_A2248ManCod[0] ;
         A396EmprCod = P02CH3_A396EmprCod[0] ;
         AV27FlagMov = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( (0==AV27FlagMov) )
      {
         /*
            INSERT RECORD ON TABLE TXPCEXMVH

         */
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2689ExHdrFas = AV17ExHdrFas ;
         A2690ExHdrFdc = AV28ExHdrFdc ;
         n2690ExHdrFdc = false ;
         A2691ExHdrUln = 0 ;
         n2691ExHdrUln = false ;
         /* Using cursor P02CH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Boolean.valueOf(n2690ExHdrFdc), A2690ExHdrFdc, Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
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
      /* Using cursor P02CH5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2691ExHdrUln = P02CH5_A2691ExHdrUln[0] ;
         n2691ExHdrUln = P02CH5_n2691ExHdrUln[0] ;
         A2689ExHdrFas = P02CH5_A2689ExHdrFas[0] ;
         A2248ManCod = P02CH5_A2248ManCod[0] ;
         A396EmprCod = P02CH5_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2689ExHdrFas = A2689ExHdrFas ;
         /*
            INSERT RECORD ON TABLE TXPLEXMVH

         */
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2689ExHdrFas = A2689ExHdrFas ;
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2689ExHdrFas = AV17ExHdrFas ;
         A2692ExHdrLin = (int)(A2691ExHdrUln+1) ;
         A129BarCod = AV23BarCod ;
         n129BarCod = false ;
         A132BarCodReo = AV24BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = AV25BarCodPar ;
         n130BarCodPar = false ;
         A2693ExHdrTip = AV18ExHdrTip ;
         n2693ExHdrTip = false ;
         A2694ExHdrAlb = AV19ExHdrAlb ;
         n2694ExHdrAlb = false ;
         A2695ExHdrKgE = AV20Kgs ;
         n2695ExHdrKgE = false ;
         A2844ExHdrMtE = AV29Mts ;
         n2844ExHdrMtE = false ;
         A2696ExHdrCnE = AV21Conos ;
         n2696ExHdrCnE = false ;
         A2697ExHdrFeE = AV22FecMov ;
         n2697ExHdrFeE = false ;
         A2703ExHdrLoc = "" ;
         n2703ExHdrLoc = false ;
         A6259ExtHdrLS = AV30SalExNln ;
         n6259ExtHdrLS = false ;
         /* Using cursor P02CH6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin), Boolean.valueOf(n2693ExHdrTip), A2693ExHdrTip, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n2694ExHdrAlb), Integer.valueOf(A2694ExHdrAlb), Boolean.valueOf(n2695ExHdrKgE), A2695ExHdrKgE, Boolean.valueOf(n2696ExHdrCnE), Short.valueOf(A2696ExHdrCnE), Boolean.valueOf(n2697ExHdrFeE), A2697ExHdrFeE, Boolean.valueOf(n2703ExHdrLoc), A2703ExHdrLoc, Boolean.valueOf(n2844ExHdrMtE), A2844ExHdrMtE, Boolean.valueOf(n6259ExtHdrLS), Short.valueOf(A6259ExtHdrLS)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
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
         A2689ExHdrFas = W2689ExHdrFas ;
         /* End Insert */
         A2691ExHdrUln = (int)(A2691ExHdrUln+1) ;
         n2691ExHdrUln = false ;
         /* Using cursor P02CH7 */
         pr_default.execute(5, new Object[] {Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln), A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVH");
         A396EmprCod = W396EmprCod ;
         A2248ManCod = W2248ManCod ;
         A2689ExHdrFas = W2689ExHdrFas ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pamvexhd.this.AV15EmprCod;
      this.aP1[0] = pamvexhd.this.AV16ManCod;
      this.aP2[0] = pamvexhd.this.AV17ExHdrFas;
      this.aP3[0] = pamvexhd.this.AV18ExHdrTip;
      this.aP4[0] = pamvexhd.this.AV19ExHdrAlb;
      this.aP5[0] = pamvexhd.this.AV20Kgs;
      this.aP6[0] = pamvexhd.this.AV29Mts;
      this.aP7[0] = pamvexhd.this.AV21Conos;
      this.aP8[0] = pamvexhd.this.AV22FecMov;
      this.aP9[0] = pamvexhd.this.AV23BarCod;
      this.aP10[0] = pamvexhd.this.AV24BarCodReo;
      this.aP11[0] = pamvexhd.this.AV25BarCodPar;
      this.aP12[0] = pamvexhd.this.AV30SalExNln;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.pamvexhd");
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
      P02CH2_A457FasCod = new String[] {""} ;
      P02CH2_A396EmprCod = new String[] {""} ;
      P02CH2_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      AV28ExHdrFdc = "" ;
      P02CH3_A2689ExHdrFas = new String[] {""} ;
      P02CH3_A2248ManCod = new short[1] ;
      P02CH3_A396EmprCod = new String[] {""} ;
      A2689ExHdrFas = "" ;
      A2690ExHdrFdc = "" ;
      Gx_emsg = "" ;
      P02CH5_A2691ExHdrUln = new int[1] ;
      P02CH5_n2691ExHdrUln = new boolean[] {false} ;
      P02CH5_A2689ExHdrFas = new String[] {""} ;
      P02CH5_A2248ManCod = new short[1] ;
      P02CH5_A396EmprCod = new String[] {""} ;
      W396EmprCod = "" ;
      W2689ExHdrFas = "" ;
      A130BarCodPar = "" ;
      A2693ExHdrTip = "" ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2844ExHdrMtE = DecimalUtil.ZERO ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      A2703ExHdrLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.pamvexhd__default(),
         new Object[] {
             new Object[] {
            P02CH2_A457FasCod, P02CH2_A396EmprCod, P02CH2_A460FasDsc
            }
            , new Object[] {
            P02CH3_A2689ExHdrFas, P02CH3_A2248ManCod, P02CH3_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02CH5_A2691ExHdrUln, P02CH5_n2691ExHdrUln, P02CH5_A2689ExHdrFas, P02CH5_A2248ManCod, P02CH5_A396EmprCod
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

   private byte AV24BarCodReo ;
   private byte AV27FlagMov ;
   private byte A132BarCodReo ;
   private short AV16ManCod ;
   private short AV21Conos ;
   private short AV30SalExNln ;
   private short A2248ManCod ;
   private short Gx_err ;
   private short W2248ManCod ;
   private short A2696ExHdrCnE ;
   private short A6259ExtHdrLS ;
   private int AV19ExHdrAlb ;
   private int AV23BarCod ;
   private int GX_INS381 ;
   private int A2691ExHdrUln ;
   private int GX_INS382 ;
   private int A2692ExHdrLin ;
   private int A129BarCod ;
   private int A2694ExHdrAlb ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal AV29Mts ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private java.math.BigDecimal A2844ExHdrMtE ;
   private String AV15EmprCod ;
   private String AV17ExHdrFas ;
   private String AV18ExHdrTip ;
   private String AV25BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String AV28ExHdrFdc ;
   private String A2689ExHdrFas ;
   private String A2690ExHdrFdc ;
   private String Gx_emsg ;
   private String W396EmprCod ;
   private String W2689ExHdrFas ;
   private String A130BarCodPar ;
   private String A2693ExHdrTip ;
   private String A2703ExHdrLoc ;
   private java.util.Date AV22FecMov ;
   private java.util.Date A2697ExHdrFeE ;
   private boolean n2690ExHdrFdc ;
   private boolean n2691ExHdrUln ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n2693ExHdrTip ;
   private boolean n2694ExHdrAlb ;
   private boolean n2695ExHdrKgE ;
   private boolean n2844ExHdrMtE ;
   private boolean n2696ExHdrCnE ;
   private boolean n2697ExHdrFeE ;
   private boolean n2703ExHdrLoc ;
   private boolean n6259ExtHdrLS ;
   private short[] aP12 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private java.util.Date[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CH2_A457FasCod ;
   private String[] P02CH2_A396EmprCod ;
   private String[] P02CH2_A460FasDsc ;
   private String[] P02CH3_A2689ExHdrFas ;
   private short[] P02CH3_A2248ManCod ;
   private String[] P02CH3_A396EmprCod ;
   private int[] P02CH5_A2691ExHdrUln ;
   private boolean[] P02CH5_n2691ExHdrUln ;
   private String[] P02CH5_A2689ExHdrFas ;
   private short[] P02CH5_A2248ManCod ;
   private String[] P02CH5_A396EmprCod ;
}

final  class pamvexhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CH2", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02CH3", "SELECT ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02CH4", "INSERT INTO TXPCEXMVH(EmprCod, ManCod, ExHdrFas, ExHdrFdc, ExHdrUln) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
         ,new ForEachCursor("P02CH5", "SELECT ExHdrUln, ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02CH6", "INSERT INTO TXPLEXMVH(EmprCod, ManCod, ExHdrFas, ExHdrLin, ExHdrTip, BarCod, BarCodReo, BarCodPar, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrLoc, ExHdrMtE, ExtHdrLS, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKRe, ExHdrCRe, ExHdrExL, ExHdrTin, ExHdrCli, ExHdrMtR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P02CH7", "UPDATE TXPCEXMVH SET ExHdrUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 28);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[25]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setString(4, (String)parms[4], 8);
               return;
      }
   }

}

