package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class popeant extends GXProcedure
{
   public popeant( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( popeant.class ), "" );
   }

   public popeant( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            short[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            java.util.Date[] aP8 ,
                            String[] aP9 ,
                            int[] aP10 ,
                            String[] aP11 )
   {
      popeant.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.util.Date[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 )
   {
      popeant.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      popeant.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      popeant.this.AV16PartCod = aP2[0];
      this.aP2 = aP2;
      popeant.this.AV17ManCod = aP3[0];
      this.aP3 = aP3;
      popeant.this.AV18OpeAntKgm = aP4[0];
      this.aP4 = aP4;
      popeant.this.AV19OpeAlbCli = aP5[0];
      this.aP5 = aP5;
      popeant.this.AV20FasCod = aP6[0];
      this.aP6 = aP6;
      popeant.this.AV21OpeArtCod = aP7[0];
      this.aP7 = aP7;
      popeant.this.AV22FecEnv = aP8[0];
      this.aP8 = aP8;
      popeant.this.AV23OpeAntPri = aP9[0];
      this.aP9 = aP9;
      popeant.this.AV24OpeAntCod = aP10[0];
      this.aP10 = aP10;
      popeant.this.AV25OpeNMtr = aP11[0];
      this.aP11 = aP11;
      popeant.this.AV31OpePrcCod = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33OpeAnt = (byte)(0) ;
      GXv_int1[0] = AV33OpeAnt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "OPEANT", ""), GXv_int1) ;
      popeant.this.AV33OpeAnt = GXv_int1[0] ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV15CliCod ;
      GXv_char4[0] = AV21OpeArtCod ;
      GXv_decimal5[0] = AV18OpeAntKgm ;
      GXv_int6[0] = 0 ;
      GXv_char7[0] = AV20FasCod ;
      GXv_int8[0] = 0 ;
      GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
      GXv_int1[0] = (byte)(0) ;
      GXv_char10[0] = AV19OpeAlbCli ;
      GXv_int11[0] = AV26DisPos ;
      GXv_char12[0] = AV23OpeAntPri ;
      GXv_char13[0] = AV16PartCod ;
      GXv_int14[0] = AV24OpeAntCod ;
      GXv_char15[0] = AV25OpeNMtr ;
      new app.pcredi2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5, GXv_int6, GXv_char7, GXv_int8, GXv_decimal9, GXv_int1, GXv_char10, GXv_int11, GXv_char12, GXv_char13, GXv_int14, GXv_char15) ;
      popeant.this.A396EmprCod = GXv_char2[0] ;
      popeant.this.AV15CliCod = GXv_int3[0] ;
      popeant.this.AV21OpeArtCod = GXv_char4[0] ;
      popeant.this.AV18OpeAntKgm = GXv_decimal5[0] ;
      popeant.this.AV20FasCod = GXv_char7[0] ;
      popeant.this.AV19OpeAlbCli = GXv_char10[0] ;
      popeant.this.AV26DisPos = GXv_int11[0] ;
      popeant.this.AV23OpeAntPri = GXv_char12[0] ;
      popeant.this.AV16PartCod = GXv_char13[0] ;
      popeant.this.AV24OpeAntCod = GXv_int14[0] ;
      popeant.this.AV25OpeNMtr = GXv_char15[0] ;
      /* Using cursor P00EC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16PartCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00EC2_A252CliCod[0] ;
         n252CliCod = P00EC2_n252CliCod[0] ;
         A966PartCod = P00EC2_A966PartCod[0] ;
         n966PartCod = P00EC2_n966PartCod[0] ;
         A972PartULin = P00EC2_A972PartULin[0] ;
         n972PartULin = P00EC2_n972PartULin[0] ;
         A970ProceCod = P00EC2_A970ProceCod[0] ;
         n970ProceCod = P00EC2_n970ProceCod[0] ;
         AV30PartLin = A972PartULin ;
         AV30PartLin = (int)(AV30PartLin+1) ;
         /*
            INSERT RECORD ON TABLE TXPLPARTI

         */
         A979PartLin = AV30PartLin ;
         A980PartLinTip = httpContext.getMessage( "B", "") ;
         n980PartLinTip = false ;
         A981PartAlbDis = AV26DisPos ;
         n981PartAlbDis = false ;
         A982PartSitDis = httpContext.getMessage( "A", "") + " / " + AV19OpeAlbCli + " / " + GXutil.str( AV17ManCod, 4, 0) ;
         n982PartSitDis = false ;
         A983PartFecMov = AV22FecEnv ;
         n983PartFecMov = false ;
         A984KilEnt = AV18OpeAntKgm ;
         n984KilEnt = false ;
         /* Using cursor P00EC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n984KilEnt), A984KilEnt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
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
         A972PartULin = AV30PartLin ;
         n972PartULin = false ;
         A970ProceCod = AV31OpePrcCod ;
         n970ProceCod = false ;
         /* Using cursor P00EC4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV33OpeAnt == 1 )
      {
         AV34Cliente = AV15CliCod ;
         AV15CliCod = AV17ManCod ;
         /* Using cursor P00EC5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16PartCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = P00EC5_A252CliCod[0] ;
            n252CliCod = P00EC5_n252CliCod[0] ;
            A966PartCod = P00EC5_A966PartCod[0] ;
            n966PartCod = P00EC5_n966PartCod[0] ;
            A972PartULin = P00EC5_A972PartULin[0] ;
            n972PartULin = P00EC5_n972PartULin[0] ;
            A970ProceCod = P00EC5_A970ProceCod[0] ;
            n970ProceCod = P00EC5_n970ProceCod[0] ;
            AV30PartLin = A972PartULin ;
            AV30PartLin = (int)(AV30PartLin+1) ;
            /*
               INSERT RECORD ON TABLE TXPLPARTI

            */
            A979PartLin = AV30PartLin ;
            A980PartLinTip = httpContext.getMessage( "B", "") ;
            n980PartLinTip = false ;
            A981PartAlbDis = AV26DisPos ;
            n981PartAlbDis = false ;
            A982PartSitDis = httpContext.getMessage( "A", "") + " / " + AV19OpeAlbCli + " / " + GXutil.str( AV17ManCod, 4, 0) ;
            n982PartSitDis = false ;
            A983PartFecMov = AV22FecEnv ;
            n983PartFecMov = false ;
            A984KilEnt = AV18OpeAntKgm ;
            n984KilEnt = false ;
            /* Using cursor P00EC6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin), Boolean.valueOf(n980PartLinTip), A980PartLinTip, Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis), Boolean.valueOf(n982PartSitDis), A982PartSitDis, Boolean.valueOf(n983PartFecMov), A983PartFecMov, Boolean.valueOf(n984KilEnt), A984KilEnt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
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
            /* End Insert */
            A972PartULin = AV30PartLin ;
            n972PartULin = false ;
            A970ProceCod = AV31OpePrcCod ;
            n970ProceCod = false ;
            /* Using cursor P00EC7 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV15CliCod = AV34Cliente ;
      }
      AV28ExMvpLin = (short)(0) ;
      /* Using cursor P00EC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(AV17ManCod), AV20FasCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2358ExMvpFas = P00EC8_A2358ExMvpFas[0] ;
         A2248ManCod = P00EC8_A2248ManCod[0] ;
         A2379ExMvpExL = P00EC8_A2379ExMvpExL[0] ;
         n2379ExMvpExL = P00EC8_n2379ExMvpExL[0] ;
         A2347ExMvpLin = P00EC8_A2347ExMvpLin[0] ;
         AV28ExMvpLin = A2347ExMvpLin ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV28ExMvpLin = (short)(AV28ExMvpLin+1) ;
      /* Using cursor P00EC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV20FasCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A457FasCod = P00EC9_A457FasCod[0] ;
         A460FasDsc = P00EC9_A460FasDsc[0] ;
         AV29FasDsc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      /*
         INSERT RECORD ON TABLE TXPCEXMVP

      */
      A2248ManCod = AV17ManCod ;
      A2358ExMvpFas = AV20FasCod ;
      A2346ExMvpUln = AV28ExMvpLin ;
      n2346ExMvpUln = false ;
      A2359ExMvpFdc = AV29FasDsc ;
      n2359ExMvpFdc = false ;
      /* Using cursor P00EC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Boolean.valueOf(n2346ExMvpUln), Short.valueOf(A2346ExMvpUln), Boolean.valueOf(n2359ExMvpFdc), A2359ExMvpFdc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVP");
      if ( (pr_default.getStatus(8) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n2346ExMvpUln = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00EC11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n2346ExMvpUln), Short.valueOf(AV28ExMvpLin), A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXMVP");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLEXMVP

      */
      A2248ManCod = AV17ManCod ;
      A2358ExMvpFas = AV20FasCod ;
      A2347ExMvpLin = AV28ExMvpLin ;
      A2348ExMvpTip = httpContext.getMessage( "E", "") ;
      n2348ExMvpTip = false ;
      A2352ExMvpFeE = AV22FecEnv ;
      n2352ExMvpFeE = false ;
      A966PartCod = AV16PartCod ;
      n966PartCod = false ;
      A252CliCod = AV15CliCod ;
      n252CliCod = false ;
      A2349ExMvpAlb = (int)(GXutil.lval( AV19OpeAlbCli)) ;
      n2349ExMvpAlb = false ;
      A2350ExMvpKgE = AV18OpeAntKgm ;
      n2350ExMvpKgE = false ;
      /* Using cursor P00EC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2358ExMvpFas, Short.valueOf(A2347ExMvpLin), Boolean.valueOf(n2348ExMvpTip), A2348ExMvpTip, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2349ExMvpAlb), Integer.valueOf(A2349ExMvpAlb), Boolean.valueOf(n2350ExMvpKgE), A2350ExMvpKgE, Boolean.valueOf(n2352ExMvpFeE), A2352ExMvpFeE});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVP");
      if ( (pr_default.getStatus(10) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = popeant.this.A396EmprCod;
      this.aP1[0] = popeant.this.AV15CliCod;
      this.aP2[0] = popeant.this.AV16PartCod;
      this.aP3[0] = popeant.this.AV17ManCod;
      this.aP4[0] = popeant.this.AV18OpeAntKgm;
      this.aP5[0] = popeant.this.AV19OpeAlbCli;
      this.aP6[0] = popeant.this.AV20FasCod;
      this.aP7[0] = popeant.this.AV21OpeArtCod;
      this.aP8[0] = popeant.this.AV22FecEnv;
      this.aP9[0] = popeant.this.AV23OpeAntPri;
      this.aP10[0] = popeant.this.AV24OpeAntCod;
      this.aP11[0] = popeant.this.AV25OpeNMtr;
      this.aP12[0] = popeant.this.AV31OpePrcCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "popeant");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_char15 = new String[1] ;
      scmdbuf = "" ;
      P00EC2_A396EmprCod = new String[] {""} ;
      P00EC2_A252CliCod = new int[1] ;
      P00EC2_n252CliCod = new boolean[] {false} ;
      P00EC2_A966PartCod = new String[] {""} ;
      P00EC2_n966PartCod = new boolean[] {false} ;
      P00EC2_A972PartULin = new int[1] ;
      P00EC2_n972PartULin = new boolean[] {false} ;
      P00EC2_A970ProceCod = new short[1] ;
      P00EC2_n970ProceCod = new boolean[] {false} ;
      A966PartCod = "" ;
      A980PartLinTip = "" ;
      A982PartSitDis = "" ;
      A983PartFecMov = GXutil.nullDate() ;
      A984KilEnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P00EC5_A396EmprCod = new String[] {""} ;
      P00EC5_A252CliCod = new int[1] ;
      P00EC5_n252CliCod = new boolean[] {false} ;
      P00EC5_A966PartCod = new String[] {""} ;
      P00EC5_n966PartCod = new boolean[] {false} ;
      P00EC5_A972PartULin = new int[1] ;
      P00EC5_n972PartULin = new boolean[] {false} ;
      P00EC5_A970ProceCod = new short[1] ;
      P00EC5_n970ProceCod = new boolean[] {false} ;
      P00EC8_A396EmprCod = new String[] {""} ;
      P00EC8_A2358ExMvpFas = new String[] {""} ;
      P00EC8_A2248ManCod = new short[1] ;
      P00EC8_A2379ExMvpExL = new short[1] ;
      P00EC8_n2379ExMvpExL = new boolean[] {false} ;
      P00EC8_A2347ExMvpLin = new short[1] ;
      A2358ExMvpFas = "" ;
      P00EC9_A396EmprCod = new String[] {""} ;
      P00EC9_A457FasCod = new String[] {""} ;
      P00EC9_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV29FasDsc = "" ;
      A2359ExMvpFdc = "" ;
      A2348ExMvpTip = "" ;
      A2352ExMvpFeE = GXutil.nullDate() ;
      A2350ExMvpKgE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.popeant__default(),
         new Object[] {
             new Object[] {
            P00EC2_A396EmprCod, P00EC2_A252CliCod, P00EC2_A966PartCod, P00EC2_A972PartULin, P00EC2_n972PartULin, P00EC2_A970ProceCod, P00EC2_n970ProceCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00EC5_A396EmprCod, P00EC5_A252CliCod, P00EC5_A966PartCod, P00EC5_A972PartULin, P00EC5_n972PartULin, P00EC5_A970ProceCod, P00EC5_n970ProceCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00EC8_A396EmprCod, P00EC8_A2358ExMvpFas, P00EC8_A2248ManCod, P00EC8_A2379ExMvpExL, P00EC8_n2379ExMvpExL, P00EC8_A2347ExMvpLin
            }
            , new Object[] {
            P00EC9_A396EmprCod, P00EC9_A457FasCod, P00EC9_A460FasDsc
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

   private byte AV33OpeAnt ;
   private byte GXv_int1[] ;
   private short AV17ManCod ;
   private short AV31OpePrcCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private short AV28ExMvpLin ;
   private short A2248ManCod ;
   private short A2379ExMvpExL ;
   private short A2347ExMvpLin ;
   private short A2346ExMvpUln ;
   private int AV15CliCod ;
   private int AV24OpeAntCod ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int GXv_int8[] ;
   private int AV26DisPos ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private int A252CliCod ;
   private int A972PartULin ;
   private int AV30PartLin ;
   private int GX_INS208 ;
   private int A979PartLin ;
   private int A981PartAlbDis ;
   private int AV34Cliente ;
   private int GX_INS319 ;
   private int GX_INS320 ;
   private int A2349ExMvpAlb ;
   private java.math.BigDecimal AV18OpeAntKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal A984KilEnt ;
   private java.math.BigDecimal A2350ExMvpKgE ;
   private String A396EmprCod ;
   private String AV16PartCod ;
   private String AV19OpeAlbCli ;
   private String AV20FasCod ;
   private String AV21OpeArtCod ;
   private String AV23OpeAntPri ;
   private String AV25OpeNMtr ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A980PartLinTip ;
   private String A982PartSitDis ;
   private String Gx_emsg ;
   private String A2358ExMvpFas ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV29FasDsc ;
   private String A2359ExMvpFdc ;
   private String A2348ExMvpTip ;
   private java.util.Date AV22FecEnv ;
   private java.util.Date A983PartFecMov ;
   private java.util.Date A2352ExMvpFeE ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n972PartULin ;
   private boolean n970ProceCod ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n982PartSitDis ;
   private boolean n983PartFecMov ;
   private boolean n984KilEnt ;
   private boolean n2379ExMvpExL ;
   private boolean n2346ExMvpUln ;
   private boolean n2359ExMvpFdc ;
   private boolean n2348ExMvpTip ;
   private boolean n2352ExMvpFeE ;
   private boolean n2349ExMvpAlb ;
   private boolean n2350ExMvpKgE ;
   private short[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.util.Date[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P00EC2_A396EmprCod ;
   private int[] P00EC2_A252CliCod ;
   private boolean[] P00EC2_n252CliCod ;
   private String[] P00EC2_A966PartCod ;
   private boolean[] P00EC2_n966PartCod ;
   private int[] P00EC2_A972PartULin ;
   private boolean[] P00EC2_n972PartULin ;
   private short[] P00EC2_A970ProceCod ;
   private boolean[] P00EC2_n970ProceCod ;
   private String[] P00EC5_A396EmprCod ;
   private int[] P00EC5_A252CliCod ;
   private boolean[] P00EC5_n252CliCod ;
   private String[] P00EC5_A966PartCod ;
   private boolean[] P00EC5_n966PartCod ;
   private int[] P00EC5_A972PartULin ;
   private boolean[] P00EC5_n972PartULin ;
   private short[] P00EC5_A970ProceCod ;
   private boolean[] P00EC5_n970ProceCod ;
   private String[] P00EC8_A396EmprCod ;
   private String[] P00EC8_A2358ExMvpFas ;
   private short[] P00EC8_A2248ManCod ;
   private short[] P00EC8_A2379ExMvpExL ;
   private boolean[] P00EC8_n2379ExMvpExL ;
   private short[] P00EC8_A2347ExMvpLin ;
   private String[] P00EC9_A396EmprCod ;
   private String[] P00EC9_A457FasCod ;
   private String[] P00EC9_A460FasDsc ;
}

final  class popeant__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EC2", "SELECT EmprCod, CliCod, PartCod, PartULin, ProceCod FROM TXPCPARTI WHERE EmprCod = ? and CliCod = ? and PartCod = ? ORDER BY EmprCod, CliCod, PartCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00EC3", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilEnt, TrnCod, ConEnt, KilUti, ConUti, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00EC4", "UPDATE TXPCPARTI SET PartULin=?, ProceCod=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P00EC5", "SELECT EmprCod, CliCod, PartCod, PartULin, ProceCod FROM TXPCPARTI WHERE EmprCod = ? and CliCod = ? and PartCod = ? ORDER BY EmprCod, CliCod, PartCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00EC6", "INSERT INTO TXPLPARTI(EmprCod, PartCod, CliCod, PartLin, PartLinTip, PartAlbDis, PartSitDis, PartFecMov, KilEnt, TrnCod, ConEnt, KilUti, ConUti, PartLoc, KilRes, ConRes, PartPesCo, PartDm, ParPorAgu, TipConCod, ParNumCli, ParExtLin, PartLinUni, PartPalUti, PartPalEst, PartCja, PartTarCja, PartTarPal, PartSts, PartFcEv, PartHhEv, PartTrz, PartFm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P00EC7", "UPDATE TXPCPARTI SET PartULin=?, ProceCod=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
         ,new ForEachCursor("P00EC8", "SELECT EmprCod, ExMvpFas, ManCod, ExMvpExL, ExMvpLin FROM TXPLEXMVP WHERE EmprCod = ? and ManCod = ? and ExMvpFas = ? ORDER BY EmprCod, ManCod, ExMvpFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00EC9", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00EC10", "INSERT INTO TXPCEXMVP(EmprCod, ManCod, ExMvpFas, ExMvpUln, ExMvpFdc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVP")
         ,new UpdateCursor("P00EC11", "UPDATE TXPCEXMVP SET ExMvpUln=?  WHERE EmprCod = ? and ManCod = ? and ExMvpFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVP")
         ,new UpdateCursor("P00EC12", "INSERT INTO TXPLEXMVP(EmprCod, ManCod, ExMvpFas, ExMvpLin, ExMvpTip, PartCod, CliCod, ExMvpAlb, ExMvpKgE, ExMvpFeE, ExMvpCnE, ExMvpKgR, ExMvpCnR, ExMvpFeR, ExMvpKRe, ExMvpCRe, ExMvpLoc, ExMvpExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVP")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               return;
            case 2 :
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
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
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[15]);
               }
               return;
      }
   }

}

