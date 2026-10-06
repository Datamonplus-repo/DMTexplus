package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrarte extends GXProcedure
{
   public pgrarte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrarte.class ), "" );
   }

   public pgrarte( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            short[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            short[] aP9 ,
                            short[] aP10 ,
                            short[] aP11 )
   {
      pgrarte.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 )
   {
      pgrarte.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrarte.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pgrarte.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pgrarte.this.AV15ArtMat = aP3[0];
      this.aP3 = aP3;
      pgrarte.this.AV16ArtLar = aP4[0];
      this.aP4 = aP4;
      pgrarte.this.AV24ArtTip = aP5[0];
      this.aP5 = aP5;
      pgrarte.this.AV17ArtTr1 = aP6[0];
      this.aP6 = aP6;
      pgrarte.this.AV19ArtTr2 = aP7[0];
      this.aP7 = aP7;
      pgrarte.this.AV21ArtTr3 = aP8[0];
      this.aP8 = aP8;
      pgrarte.this.AV18ArtPt1 = aP9[0];
      this.aP9 = aP9;
      pgrarte.this.AV20ArtPt2 = aP10[0];
      this.aP10 = aP10;
      pgrarte.this.AV22ArtPt3 = aP11[0];
      this.aP11 = aP11;
      pgrarte.this.AV23ArtAnh = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPARTICU

      */
      A87ArtMat = AV15ArtMat ;
      n87ArtMat = false ;
      A100ArtTipLar = AV16ArtLar ;
      n100ArtTipLar = false ;
      A829TipArtCod = AV24ArtTip ;
      A105ArtTra1 = AV17ArtTr1 ;
      n105ArtTra1 = false ;
      A108ArtTraP1 = AV18ArtPt1 ;
      n108ArtTraP1 = false ;
      A106ArtTra2 = AV19ArtTr2 ;
      n106ArtTra2 = false ;
      A109ArtTraP2 = AV20ArtPt2 ;
      n109ArtTraP2 = false ;
      A107ArtTra3 = AV21ArtTr3 ;
      n107ArtTra3 = false ;
      A110ArtTraP3 = AV22ArtPt3 ;
      n110ArtTraP3 = false ;
      A63ArtAcaMin = AV23ArtAnh ;
      n63ArtAcaMin = false ;
      /* Using cursor P00ZG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n63ArtAcaMin = false ;
         n110ArtTraP3 = false ;
         n107ArtTra3 = false ;
         n109ArtTraP2 = false ;
         n106ArtTra2 = false ;
         n108ArtTraP1 = false ;
         n105ArtTra1 = false ;
         n100ArtTipLar = false ;
         n87ArtMat = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00ZG3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n63ArtAcaMin), Short.valueOf(AV23ArtAnh), Boolean.valueOf(n110ArtTraP3), Short.valueOf(AV22ArtPt3), Boolean.valueOf(n107ArtTra3), AV21ArtTr3, Boolean.valueOf(n109ArtTraP2), Short.valueOf(AV20ArtPt2), Boolean.valueOf(n106ArtTra2), AV19ArtTr2, Boolean.valueOf(n108ArtTraP1), Short.valueOf(AV18ArtPt1), Boolean.valueOf(n105ArtTra1), AV17ArtTr1, Short.valueOf(AV24ArtTip), Boolean.valueOf(n100ArtTipLar), AV16ArtLar, Boolean.valueOf(n87ArtMat), AV15ArtMat, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
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
      this.aP0[0] = pgrarte.this.A396EmprCod;
      this.aP1[0] = pgrarte.this.A252CliCod;
      this.aP2[0] = pgrarte.this.A65ArtCod;
      this.aP3[0] = pgrarte.this.AV15ArtMat;
      this.aP4[0] = pgrarte.this.AV16ArtLar;
      this.aP5[0] = pgrarte.this.AV24ArtTip;
      this.aP6[0] = pgrarte.this.AV17ArtTr1;
      this.aP7[0] = pgrarte.this.AV19ArtTr2;
      this.aP8[0] = pgrarte.this.AV21ArtTr3;
      this.aP9[0] = pgrarte.this.AV18ArtPt1;
      this.aP10[0] = pgrarte.this.AV20ArtPt2;
      this.aP11[0] = pgrarte.this.AV22ArtPt3;
      this.aP12[0] = pgrarte.this.AV23ArtAnh;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrarte");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A87ArtMat = "" ;
      A100ArtTipLar = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrarte__default(),
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

   private short AV24ArtTip ;
   private short AV18ArtPt1 ;
   private short AV20ArtPt2 ;
   private short AV22ArtPt3 ;
   private short AV23ArtAnh ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A63ArtAcaMin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS10 ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV15ArtMat ;
   private String AV16ArtLar ;
   private String AV17ArtTr1 ;
   private String AV19ArtTr2 ;
   private String AV21ArtTr3 ;
   private String A87ArtMat ;
   private String A100ArtTipLar ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String Gx_emsg ;
   private boolean n87ArtMat ;
   private boolean n100ArtTipLar ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n63ArtAcaMin ;
   private short[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private short[] aP11 ;
   private IDataStoreProvider pr_default ;
}

final  class pgrarte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00ZG2", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtAcaMin, ArtTipLar, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMax, ArtRen, ArtTipPle, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new UpdateCursor("P00ZG3", "UPDATE TXPARTICU SET ArtAcaMin=?, ArtTraP3=?, ArtTra3=?, ArtTraP2=?, ArtTra2=?, ArtTraP1=?, ArtTra1=?, TipArtCod=?, ArtTipLar=?, ArtMat=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 4);
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 4);
               }
               stmt.setShort(8, ((Number) parms[14]).shortValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 16);
               }
               stmt.setString(11, (String)parms[19], 3);
               stmt.setInt(12, ((Number) parms[20]).intValue());
               stmt.setString(13, (String)parms[21], 16);
               return;
      }
   }

}

