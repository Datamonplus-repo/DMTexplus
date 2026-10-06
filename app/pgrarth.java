package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrarth extends GXProcedure
{
   public pgrarth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrarth.class ), "" );
   }

   public pgrarth( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             String[] aP16 )
   {
      pgrarth.this.aP17 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 )
   {
      pgrarth.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrarth.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pgrarth.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pgrarth.this.AV28ArtTip = aP3[0];
      this.aP3 = aP3;
      pgrarth.this.AV15ArtTr1 = aP4[0];
      this.aP4 = aP4;
      pgrarth.this.AV17ArtTr2 = aP5[0];
      this.aP5 = aP5;
      pgrarth.this.AV19ArtTr3 = aP6[0];
      this.aP6 = aP6;
      pgrarth.this.AV16ArtPt1 = aP7[0];
      this.aP7 = aP7;
      pgrarth.this.AV18ArtPt2 = aP8[0];
      this.aP8 = aP8;
      pgrarth.this.AV20ArtPt3 = aP9[0];
      this.aP9 = aP9;
      pgrarth.this.AV21ArtUr1 = aP10[0];
      this.aP10 = aP10;
      pgrarth.this.AV23ArtUr2 = aP11[0];
      this.aP11 = aP11;
      pgrarth.this.AV25ArtUr3 = aP12[0];
      this.aP12 = aP12;
      pgrarth.this.AV22ArtPu1 = aP13[0];
      this.aP13 = aP13;
      pgrarth.this.AV24ArtPu2 = aP14[0];
      this.aP14 = aP14;
      pgrarth.this.AV26ArtPu3 = aP15[0];
      this.aP15 = aP15;
      pgrarth.this.AV27DisNMtr = aP16[0];
      this.aP16 = aP16;
      pgrarth.this.AV29ArtMat = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV30FlagMag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pgrarth.this.AV30FlagMag = GXv_int1[0] ;
      if ( AV30FlagMag == 1 )
      {
      }
      else
      {
         AV31ArtFacAbs = DecimalUtil.doubleToDec(0) ;
      }
      /*
         INSERT RECORD ON TABLE TXPARTICU

      */
      A829TipArtCod = AV28ArtTip ;
      A105ArtTra1 = AV15ArtTr1 ;
      n105ArtTra1 = false ;
      A108ArtTraP1 = AV16ArtPt1 ;
      n108ArtTraP1 = false ;
      A106ArtTra2 = AV17ArtTr2 ;
      n106ArtTra2 = false ;
      A109ArtTraP2 = AV18ArtPt2 ;
      n109ArtTraP2 = false ;
      A107ArtTra3 = AV19ArtTr3 ;
      n107ArtTra3 = false ;
      A110ArtTraP3 = AV20ArtPt3 ;
      n110ArtTraP3 = false ;
      A111ArtUrd1 = AV21ArtUr1 ;
      n111ArtUrd1 = false ;
      A114ArtUrdP1 = AV22ArtPu1 ;
      n114ArtUrdP1 = false ;
      A112ArtUrd2 = AV23ArtUr2 ;
      n112ArtUrd2 = false ;
      A115ArtUrdP2 = AV24ArtPu2 ;
      n115ArtUrdP2 = false ;
      A113ArtUrd3 = AV25ArtUr3 ;
      n113ArtUrd3 = false ;
      A116ArtUrdP3 = AV26ArtPu3 ;
      n116ArtUrdP3 = false ;
      A967ArtNMtr = AV27DisNMtr ;
      n967ArtNMtr = false ;
      A87ArtMat = AV29ArtMat ;
      n87ArtMat = false ;
      A2791ArtFacAbs = AV31ArtFacAbs ;
      n2791ArtFacAbs = false ;
      /* Using cursor P007D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n87ArtMat = false ;
         n967ArtNMtr = false ;
         n116ArtUrdP3 = false ;
         n113ArtUrd3 = false ;
         n115ArtUrdP2 = false ;
         n112ArtUrd2 = false ;
         n114ArtUrdP1 = false ;
         n111ArtUrd1 = false ;
         n110ArtTraP3 = false ;
         n107ArtTra3 = false ;
         n109ArtTraP2 = false ;
         n106ArtTra2 = false ;
         n108ArtTraP1 = false ;
         n105ArtTra1 = false ;
         /* Optimized UPDATE. */
         /* Using cursor P007D3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n87ArtMat), AV29ArtMat, Boolean.valueOf(n967ArtNMtr), AV27DisNMtr, Boolean.valueOf(n116ArtUrdP3), Short.valueOf(AV26ArtPu3), Boolean.valueOf(n113ArtUrd3), AV25ArtUr3, Boolean.valueOf(n115ArtUrdP2), Short.valueOf(AV24ArtPu2), Boolean.valueOf(n112ArtUrd2), AV23ArtUr2, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(AV22ArtPu1), Boolean.valueOf(n111ArtUrd1), AV21ArtUr1, Boolean.valueOf(n110ArtTraP3), Short.valueOf(AV20ArtPt3), Boolean.valueOf(n107ArtTra3), AV19ArtTr3, Boolean.valueOf(n109ArtTraP2), Short.valueOf(AV18ArtPt2), Boolean.valueOf(n106ArtTra2), AV17ArtTr2, Boolean.valueOf(n108ArtTraP1), Short.valueOf(AV16ArtPt1), Boolean.valueOf(n105ArtTra1), AV15ArtTr1, Short.valueOf(AV28ArtTip), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgrarth.this.A396EmprCod;
      this.aP1[0] = pgrarth.this.A252CliCod;
      this.aP2[0] = pgrarth.this.A65ArtCod;
      this.aP3[0] = pgrarth.this.AV28ArtTip;
      this.aP4[0] = pgrarth.this.AV15ArtTr1;
      this.aP5[0] = pgrarth.this.AV17ArtTr2;
      this.aP6[0] = pgrarth.this.AV19ArtTr3;
      this.aP7[0] = pgrarth.this.AV16ArtPt1;
      this.aP8[0] = pgrarth.this.AV18ArtPt2;
      this.aP9[0] = pgrarth.this.AV20ArtPt3;
      this.aP10[0] = pgrarth.this.AV21ArtUr1;
      this.aP11[0] = pgrarth.this.AV23ArtUr2;
      this.aP12[0] = pgrarth.this.AV25ArtUr3;
      this.aP13[0] = pgrarth.this.AV22ArtPu1;
      this.aP14[0] = pgrarth.this.AV24ArtPu2;
      this.aP15[0] = pgrarth.this.AV26ArtPu3;
      this.aP16[0] = pgrarth.this.AV27DisNMtr;
      this.aP17[0] = pgrarth.this.AV29ArtMat;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrarth");
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
      AV31ArtFacAbs = DecimalUtil.ZERO ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A967ArtNMtr = "" ;
      A87ArtMat = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrarth__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30FlagMag ;
   private byte GXv_int1[] ;
   private short AV28ArtTip ;
   private short AV16ArtPt1 ;
   private short AV18ArtPt2 ;
   private short AV20ArtPt3 ;
   private short AV22ArtPu1 ;
   private short AV24ArtPu2 ;
   private short AV26ArtPu3 ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS10 ;
   private java.math.BigDecimal AV31ArtFacAbs ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV15ArtTr1 ;
   private String AV17ArtTr2 ;
   private String AV19ArtTr3 ;
   private String AV21ArtUr1 ;
   private String AV23ArtUr2 ;
   private String AV25ArtUr3 ;
   private String AV27DisNMtr ;
   private String AV29ArtMat ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A967ArtNMtr ;
   private String A87ArtMat ;
   private String Gx_emsg ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n114ArtUrdP1 ;
   private boolean n112ArtUrd2 ;
   private boolean n115ArtUrdP2 ;
   private boolean n113ArtUrd3 ;
   private boolean n116ArtUrdP3 ;
   private boolean n967ArtNMtr ;
   private boolean n87ArtMat ;
   private boolean n2791ArtFacAbs ;
   private String[] aP17 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private String[] aP16 ;
   private IDataStoreProvider pr_default ;
}

final  class pgrarth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P007D2", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtNMtr, ArtFacAbs, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new UpdateCursor("P007D3", "UPDATE TXPARTICU SET ArtMat=?, ArtNMtr=?, ArtUrdP3=?, ArtUrd3=?, ArtUrdP2=?, ArtUrd2=?, ArtUrdP1=?, ArtUrd1=?, ArtTraP3=?, ArtTra3=?, ArtTraP2=?, ArtTra2=?, ArtTraP1=?, ArtTra1=?, TipArtCod=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 4);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[33], 2);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 4);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 4);
               }
               stmt.setShort(15, ((Number) parms[28]).shortValue());
               stmt.setString(16, (String)parms[29], 3);
               stmt.setInt(17, ((Number) parms[30]).intValue());
               stmt.setString(18, (String)parms[31], 16);
               return;
      }
   }

}

