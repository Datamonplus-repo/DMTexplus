package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactmvh extends GXProcedure
{
   public pactmvh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactmvh.class ), "" );
   }

   public pactmvh( int remoteHandle ,
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
                             int[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 )
   {
      pactmvh.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.util.Date[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.util.Date[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 )
   {
      pactmvh.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactmvh.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pactmvh.this.AV17ExHdrFas = aP2[0];
      this.aP2 = aP2;
      pactmvh.this.AV18ExHdrTip = aP3[0];
      this.aP3 = aP3;
      pactmvh.this.AV19ExHdrAlb = aP4[0];
      this.aP4 = aP4;
      pactmvh.this.AV20Kgs = aP5[0];
      this.aP5 = aP5;
      pactmvh.this.AV21Conos = aP6[0];
      this.aP6 = aP6;
      pactmvh.this.AV22FecMov = aP7[0];
      this.aP7 = aP7;
      pactmvh.this.AV23CliCod = aP8[0];
      this.aP8 = aP8;
      pactmvh.this.AV24BarCod = aP9[0];
      this.aP9 = aP9;
      pactmvh.this.AV25BarCodReo = aP10[0];
      this.aP10 = aP10;
      pactmvh.this.AV26BarCodPar = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00F02 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV17ExHdrFas});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P00F02_A457FasCod[0] ;
         A396EmprCod = P00F02_A396EmprCod[0] ;
         A460FasDsc = P00F02_A460FasDsc[0] ;
         AV30ExHdrFdc = A460FasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV29FlagMov = (byte)(0) ;
      /* Using cursor P00F03 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2689ExHdrFas = P00F03_A2689ExHdrFas[0] ;
         A2248ManCod = P00F03_A2248ManCod[0] ;
         A396EmprCod = P00F03_A396EmprCod[0] ;
         AV29FlagMov = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( (0==AV29FlagMov) )
      {
         /*
            INSERT RECORD ON TABLE TXPCEXMVH

         */
         A396EmprCod = AV15EmprCod ;
         A2248ManCod = AV16ManCod ;
         A2689ExHdrFas = AV17ExHdrFas ;
         A2690ExHdrFdc = AV30ExHdrFdc ;
         n2690ExHdrFdc = false ;
         A2691ExHdrUln = 0 ;
         n2691ExHdrUln = false ;
         /* Using cursor P00F04 */
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
      /* Using cursor P00F05 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2691ExHdrUln = P00F05_A2691ExHdrUln[0] ;
         n2691ExHdrUln = P00F05_n2691ExHdrUln[0] ;
         A2689ExHdrFas = P00F05_A2689ExHdrFas[0] ;
         A2248ManCod = P00F05_A2248ManCod[0] ;
         A396EmprCod = P00F05_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W2248ManCod = A2248ManCod ;
         W2689ExHdrFas = A2689ExHdrFas ;
         AV31FlagAlb = (byte)(0) ;
         /* Using cursor P00F06 */
         pr_default.execute(4, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17ExHdrFas, Integer.valueOf(AV19ExHdrAlb), Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P00F06_A130BarCodPar[0] ;
            n130BarCodPar = P00F06_n130BarCodPar[0] ;
            A132BarCodReo = P00F06_A132BarCodReo[0] ;
            n132BarCodReo = P00F06_n132BarCodReo[0] ;
            A129BarCod = P00F06_A129BarCod[0] ;
            n129BarCod = P00F06_n129BarCod[0] ;
            A2694ExHdrAlb = P00F06_A2694ExHdrAlb[0] ;
            n2694ExHdrAlb = P00F06_n2694ExHdrAlb[0] ;
            A2689ExHdrFas = P00F06_A2689ExHdrFas[0] ;
            A2248ManCod = P00F06_A2248ManCod[0] ;
            A396EmprCod = P00F06_A396EmprCod[0] ;
            A2698ExHdrKgR = P00F06_A2698ExHdrKgR[0] ;
            n2698ExHdrKgR = P00F06_n2698ExHdrKgR[0] ;
            A2699ExHdrCnR = P00F06_A2699ExHdrCnR[0] ;
            n2699ExHdrCnR = P00F06_n2699ExHdrCnR[0] ;
            A2700ExHdrFeR = P00F06_A2700ExHdrFeR[0] ;
            n2700ExHdrFeR = P00F06_n2700ExHdrFeR[0] ;
            A2695ExHdrKgE = P00F06_A2695ExHdrKgE[0] ;
            n2695ExHdrKgE = P00F06_n2695ExHdrKgE[0] ;
            A2696ExHdrCnE = P00F06_A2696ExHdrCnE[0] ;
            n2696ExHdrCnE = P00F06_n2696ExHdrCnE[0] ;
            A2697ExHdrFeE = P00F06_A2697ExHdrFeE[0] ;
            n2697ExHdrFeE = P00F06_n2697ExHdrFeE[0] ;
            A2692ExHdrLin = P00F06_A2692ExHdrLin[0] ;
            AV31FlagAlb = (byte)(1) ;
            if ( GXutil.strcmp(AV18ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
            {
               A2698ExHdrKgR = AV20Kgs ;
               n2698ExHdrKgR = false ;
               A2699ExHdrCnR = AV21Conos ;
               n2699ExHdrCnR = false ;
               A2700ExHdrFeR = AV22FecMov ;
               n2700ExHdrFeR = false ;
               A2695ExHdrKgE = DecimalUtil.ZERO ;
               n2695ExHdrKgE = false ;
               A2696ExHdrCnE = (short)(0) ;
               n2696ExHdrCnE = false ;
               A2697ExHdrFeE = GXutil.nullDate() ;
               n2697ExHdrFeE = false ;
            }
            else
            {
               A2695ExHdrKgE = AV20Kgs ;
               n2695ExHdrKgE = false ;
               A2696ExHdrCnE = AV21Conos ;
               n2696ExHdrCnE = false ;
               A2697ExHdrFeE = AV22FecMov ;
               n2697ExHdrFeE = false ;
               A2698ExHdrKgR = DecimalUtil.ZERO ;
               n2698ExHdrKgR = false ;
               A2699ExHdrCnR = (short)(0) ;
               n2699ExHdrCnR = false ;
               A2700ExHdrFeR = GXutil.nullDate() ;
               n2700ExHdrFeR = false ;
            }
            /* Using cursor P00F07 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), Boolean.valueOf(n2700ExHdrFeR), A2700ExHdrFeR, Boolean.valueOf(n2695ExHdrKgE), A2695ExHdrKgE, Boolean.valueOf(n2696ExHdrCnE), Short.valueOf(A2696ExHdrCnE), Boolean.valueOf(n2697ExHdrFeE), A2697ExHdrFeE, A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( (0==AV31FlagAlb) )
         {
            AV33BarNumTen = "" ;
            AV28PartCod = "" ;
            /* Using cursor P00F08 */
            pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV24BarCod), Byte.valueOf(AV25BarCodReo), AV26BarCodPar});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A130BarCodPar = P00F08_A130BarCodPar[0] ;
               n130BarCodPar = P00F08_n130BarCodPar[0] ;
               A132BarCodReo = P00F08_A132BarCodReo[0] ;
               n132BarCodReo = P00F08_n132BarCodReo[0] ;
               A129BarCod = P00F08_A129BarCod[0] ;
               n129BarCod = P00F08_n129BarCod[0] ;
               A396EmprCod = P00F08_A396EmprCod[0] ;
               A212BarSer = P00F08_A212BarSer[0] ;
               A1878BarNumTen = P00F08_A1878BarNumTen[0] ;
               AV33BarNumTen = A1878BarNumTen ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(6);
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
            A2693ExHdrTip = AV18ExHdrTip ;
            n2693ExHdrTip = false ;
            A2694ExHdrAlb = AV19ExHdrAlb ;
            n2694ExHdrAlb = false ;
            A129BarCod = AV24BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV25BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV26BarCodPar ;
            n130BarCodPar = false ;
            A2706ExHdrCli = AV23CliCod ;
            n2706ExHdrCli = false ;
            A2705ExHdrTin = AV33BarNumTen ;
            n2705ExHdrTin = false ;
            if ( GXutil.strcmp(AV18ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
            {
               A2698ExHdrKgR = AV20Kgs ;
               n2698ExHdrKgR = false ;
               A2699ExHdrCnR = AV21Conos ;
               n2699ExHdrCnR = false ;
               A2700ExHdrFeR = AV22FecMov ;
               n2700ExHdrFeR = false ;
               A2695ExHdrKgE = DecimalUtil.ZERO ;
               n2695ExHdrKgE = false ;
               A2696ExHdrCnE = (short)(0) ;
               n2696ExHdrCnE = false ;
               A2697ExHdrFeE = GXutil.nullDate() ;
               n2697ExHdrFeE = false ;
            }
            else
            {
               A2695ExHdrKgE = AV20Kgs ;
               n2695ExHdrKgE = false ;
               A2696ExHdrCnE = AV21Conos ;
               n2696ExHdrCnE = false ;
               A2697ExHdrFeE = AV22FecMov ;
               n2697ExHdrFeE = false ;
               A2698ExHdrKgR = DecimalUtil.ZERO ;
               n2698ExHdrKgR = false ;
               A2699ExHdrCnR = (short)(0) ;
               n2699ExHdrCnR = false ;
               A2700ExHdrFeR = GXutil.nullDate() ;
               n2700ExHdrFeR = false ;
            }
            A2703ExHdrLoc = "" ;
            n2703ExHdrLoc = false ;
            /* Using cursor P00F09 */
            pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin), Boolean.valueOf(n2693ExHdrTip), A2693ExHdrTip, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n2694ExHdrAlb), Integer.valueOf(A2694ExHdrAlb), Boolean.valueOf(n2695ExHdrKgE), A2695ExHdrKgE, Boolean.valueOf(n2696ExHdrCnE), Short.valueOf(A2696ExHdrCnE), Boolean.valueOf(n2697ExHdrFeE), A2697ExHdrFeE, Boolean.valueOf(n2698ExHdrKgR), A2698ExHdrKgR, Boolean.valueOf(n2699ExHdrCnR), Short.valueOf(A2699ExHdrCnR), Boolean.valueOf(n2700ExHdrFeR), A2700ExHdrFeR, Boolean.valueOf(n2703ExHdrLoc), A2703ExHdrLoc, Boolean.valueOf(n2705ExHdrTin), A2705ExHdrTin, Boolean.valueOf(n2706ExHdrCli), Integer.valueOf(A2706ExHdrCli)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
            if ( (pr_default.getStatus(7) == 1) )
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
         }
         /* Using cursor P00F010 */
         pr_default.execute(8, new Object[] {Boolean.valueOf(n2691ExHdrUln), Integer.valueOf(A2691ExHdrUln), A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas});
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
      this.aP0[0] = pactmvh.this.AV15EmprCod;
      this.aP1[0] = pactmvh.this.AV16ManCod;
      this.aP2[0] = pactmvh.this.AV17ExHdrFas;
      this.aP3[0] = pactmvh.this.AV18ExHdrTip;
      this.aP4[0] = pactmvh.this.AV19ExHdrAlb;
      this.aP5[0] = pactmvh.this.AV20Kgs;
      this.aP6[0] = pactmvh.this.AV21Conos;
      this.aP7[0] = pactmvh.this.AV22FecMov;
      this.aP8[0] = pactmvh.this.AV23CliCod;
      this.aP9[0] = pactmvh.this.AV24BarCod;
      this.aP10[0] = pactmvh.this.AV25BarCodReo;
      this.aP11[0] = pactmvh.this.AV26BarCodPar;
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
      P00F02_A457FasCod = new String[] {""} ;
      P00F02_A396EmprCod = new String[] {""} ;
      P00F02_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      A460FasDsc = "" ;
      AV30ExHdrFdc = "" ;
      P00F03_A2689ExHdrFas = new String[] {""} ;
      P00F03_A2248ManCod = new short[1] ;
      P00F03_A396EmprCod = new String[] {""} ;
      A2689ExHdrFas = "" ;
      A2690ExHdrFdc = "" ;
      Gx_emsg = "" ;
      P00F05_A2691ExHdrUln = new int[1] ;
      P00F05_n2691ExHdrUln = new boolean[] {false} ;
      P00F05_A2689ExHdrFas = new String[] {""} ;
      P00F05_A2248ManCod = new short[1] ;
      P00F05_A396EmprCod = new String[] {""} ;
      W396EmprCod = "" ;
      W2689ExHdrFas = "" ;
      P00F06_A130BarCodPar = new String[] {""} ;
      P00F06_n130BarCodPar = new boolean[] {false} ;
      P00F06_A132BarCodReo = new byte[1] ;
      P00F06_n132BarCodReo = new boolean[] {false} ;
      P00F06_A129BarCod = new int[1] ;
      P00F06_n129BarCod = new boolean[] {false} ;
      P00F06_A2694ExHdrAlb = new int[1] ;
      P00F06_n2694ExHdrAlb = new boolean[] {false} ;
      P00F06_A2689ExHdrFas = new String[] {""} ;
      P00F06_A2248ManCod = new short[1] ;
      P00F06_A396EmprCod = new String[] {""} ;
      P00F06_A2698ExHdrKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00F06_n2698ExHdrKgR = new boolean[] {false} ;
      P00F06_A2699ExHdrCnR = new short[1] ;
      P00F06_n2699ExHdrCnR = new boolean[] {false} ;
      P00F06_A2700ExHdrFeR = new java.util.Date[] {GXutil.nullDate()} ;
      P00F06_n2700ExHdrFeR = new boolean[] {false} ;
      P00F06_A2695ExHdrKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00F06_n2695ExHdrKgE = new boolean[] {false} ;
      P00F06_A2696ExHdrCnE = new short[1] ;
      P00F06_n2696ExHdrCnE = new boolean[] {false} ;
      P00F06_A2697ExHdrFeE = new java.util.Date[] {GXutil.nullDate()} ;
      P00F06_n2697ExHdrFeE = new boolean[] {false} ;
      P00F06_A2692ExHdrLin = new int[1] ;
      A130BarCodPar = "" ;
      A2698ExHdrKgR = DecimalUtil.ZERO ;
      A2700ExHdrFeR = GXutil.nullDate() ;
      A2695ExHdrKgE = DecimalUtil.ZERO ;
      A2697ExHdrFeE = GXutil.nullDate() ;
      AV33BarNumTen = "" ;
      AV28PartCod = "" ;
      P00F08_A130BarCodPar = new String[] {""} ;
      P00F08_n130BarCodPar = new boolean[] {false} ;
      P00F08_A132BarCodReo = new byte[1] ;
      P00F08_n132BarCodReo = new boolean[] {false} ;
      P00F08_A129BarCod = new int[1] ;
      P00F08_n129BarCod = new boolean[] {false} ;
      P00F08_A396EmprCod = new String[] {""} ;
      P00F08_A212BarSer = new String[] {""} ;
      P00F08_A1878BarNumTen = new String[] {""} ;
      A212BarSer = "" ;
      A1878BarNumTen = "" ;
      A2693ExHdrTip = "" ;
      A2705ExHdrTin = "" ;
      A2703ExHdrLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactmvh__default(),
         new Object[] {
             new Object[] {
            P00F02_A457FasCod, P00F02_A396EmprCod, P00F02_A460FasDsc
            }
            , new Object[] {
            P00F03_A2689ExHdrFas, P00F03_A2248ManCod, P00F03_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00F05_A2691ExHdrUln, P00F05_n2691ExHdrUln, P00F05_A2689ExHdrFas, P00F05_A2248ManCod, P00F05_A396EmprCod
            }
            , new Object[] {
            P00F06_A130BarCodPar, P00F06_n130BarCodPar, P00F06_A132BarCodReo, P00F06_n132BarCodReo, P00F06_A129BarCod, P00F06_n129BarCod, P00F06_A2694ExHdrAlb, P00F06_n2694ExHdrAlb, P00F06_A2689ExHdrFas, P00F06_A2248ManCod,
            P00F06_A396EmprCod, P00F06_A2698ExHdrKgR, P00F06_n2698ExHdrKgR, P00F06_A2699ExHdrCnR, P00F06_n2699ExHdrCnR, P00F06_A2700ExHdrFeR, P00F06_n2700ExHdrFeR, P00F06_A2695ExHdrKgE, P00F06_n2695ExHdrKgE, P00F06_A2696ExHdrCnE,
            P00F06_n2696ExHdrCnE, P00F06_A2697ExHdrFeE, P00F06_n2697ExHdrFeE, P00F06_A2692ExHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00F08_A130BarCodPar, P00F08_A132BarCodReo, P00F08_A129BarCod, P00F08_A396EmprCod, P00F08_A212BarSer, P00F08_A1878BarNumTen
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

   private byte AV25BarCodReo ;
   private byte AV29FlagMov ;
   private byte AV31FlagAlb ;
   private byte A132BarCodReo ;
   private short AV16ManCod ;
   private short AV21Conos ;
   private short A2248ManCod ;
   private short Gx_err ;
   private short W2248ManCod ;
   private short A2699ExHdrCnR ;
   private short A2696ExHdrCnE ;
   private int AV19ExHdrAlb ;
   private int AV23CliCod ;
   private int AV24BarCod ;
   private int GX_INS381 ;
   private int A2691ExHdrUln ;
   private int A129BarCod ;
   private int A2694ExHdrAlb ;
   private int A2692ExHdrLin ;
   private int GX_INS382 ;
   private int A2706ExHdrCli ;
   private java.math.BigDecimal AV20Kgs ;
   private java.math.BigDecimal A2698ExHdrKgR ;
   private java.math.BigDecimal A2695ExHdrKgE ;
   private String AV15EmprCod ;
   private String AV17ExHdrFas ;
   private String AV18ExHdrTip ;
   private String AV26BarCodPar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String A460FasDsc ;
   private String AV30ExHdrFdc ;
   private String A2689ExHdrFas ;
   private String A2690ExHdrFdc ;
   private String Gx_emsg ;
   private String W396EmprCod ;
   private String W2689ExHdrFas ;
   private String A130BarCodPar ;
   private String AV33BarNumTen ;
   private String AV28PartCod ;
   private String A212BarSer ;
   private String A1878BarNumTen ;
   private String A2693ExHdrTip ;
   private String A2705ExHdrTin ;
   private String A2703ExHdrLoc ;
   private java.util.Date AV22FecMov ;
   private java.util.Date A2700ExHdrFeR ;
   private java.util.Date A2697ExHdrFeE ;
   private boolean n2690ExHdrFdc ;
   private boolean n2691ExHdrUln ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n2694ExHdrAlb ;
   private boolean n2698ExHdrKgR ;
   private boolean n2699ExHdrCnR ;
   private boolean n2700ExHdrFeR ;
   private boolean n2695ExHdrKgE ;
   private boolean n2696ExHdrCnE ;
   private boolean n2697ExHdrFeE ;
   private boolean n2693ExHdrTip ;
   private boolean n2706ExHdrCli ;
   private boolean n2705ExHdrTin ;
   private boolean n2703ExHdrLoc ;
   private String[] aP11 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.util.Date[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P00F02_A457FasCod ;
   private String[] P00F02_A396EmprCod ;
   private String[] P00F02_A460FasDsc ;
   private String[] P00F03_A2689ExHdrFas ;
   private short[] P00F03_A2248ManCod ;
   private String[] P00F03_A396EmprCod ;
   private int[] P00F05_A2691ExHdrUln ;
   private boolean[] P00F05_n2691ExHdrUln ;
   private String[] P00F05_A2689ExHdrFas ;
   private short[] P00F05_A2248ManCod ;
   private String[] P00F05_A396EmprCod ;
   private String[] P00F06_A130BarCodPar ;
   private boolean[] P00F06_n130BarCodPar ;
   private byte[] P00F06_A132BarCodReo ;
   private boolean[] P00F06_n132BarCodReo ;
   private int[] P00F06_A129BarCod ;
   private boolean[] P00F06_n129BarCod ;
   private int[] P00F06_A2694ExHdrAlb ;
   private boolean[] P00F06_n2694ExHdrAlb ;
   private String[] P00F06_A2689ExHdrFas ;
   private short[] P00F06_A2248ManCod ;
   private String[] P00F06_A396EmprCod ;
   private java.math.BigDecimal[] P00F06_A2698ExHdrKgR ;
   private boolean[] P00F06_n2698ExHdrKgR ;
   private short[] P00F06_A2699ExHdrCnR ;
   private boolean[] P00F06_n2699ExHdrCnR ;
   private java.util.Date[] P00F06_A2700ExHdrFeR ;
   private boolean[] P00F06_n2700ExHdrFeR ;
   private java.math.BigDecimal[] P00F06_A2695ExHdrKgE ;
   private boolean[] P00F06_n2695ExHdrKgE ;
   private short[] P00F06_A2696ExHdrCnE ;
   private boolean[] P00F06_n2696ExHdrCnE ;
   private java.util.Date[] P00F06_A2697ExHdrFeE ;
   private boolean[] P00F06_n2697ExHdrFeE ;
   private int[] P00F06_A2692ExHdrLin ;
   private String[] P00F08_A130BarCodPar ;
   private boolean[] P00F08_n130BarCodPar ;
   private byte[] P00F08_A132BarCodReo ;
   private boolean[] P00F08_n132BarCodReo ;
   private int[] P00F08_A129BarCod ;
   private boolean[] P00F08_n129BarCod ;
   private String[] P00F08_A396EmprCod ;
   private String[] P00F08_A212BarSer ;
   private String[] P00F08_A1878BarNumTen ;
}

final  class pactmvh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00F02", "SELECT FasCod, EmprCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00F03", "SELECT ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00F04", "INSERT INTO TXPCEXMVH(EmprCod, ManCod, ExHdrFas, ExHdrFdc, ExHdrUln) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
         ,new ForEachCursor("P00F05", "SELECT ExHdrUln, ExHdrFas, ManCod, EmprCod FROM TXPCEXMVH WHERE EmprCod = ? and ManCod = ? and ExHdrFas = ? ORDER BY EmprCod, ManCod, ExHdrFas ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00F06", "SELECT BarCodPar, BarCodReo, BarCod, ExHdrAlb, ExHdrFas, ManCod, EmprCod, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and ManCod = ? and ExHdrFas = ?) AND (ExHdrAlb = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, ManCod, ExHdrFas, ExHdrLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00F07", "UPDATE TXPLEXMVH SET ExHdrKgR=?, ExHdrCnR=?, ExHdrFeR=?, ExHdrKgE=?, ExHdrCnE=?, ExHdrFeE=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new ForEachCursor("P00F08", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer, BarNumTen FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00F09", "INSERT INTO TXPLEXMVH(EmprCod, ManCod, ExHdrFas, ExHdrLin, ExHdrTip, BarCod, BarCodReo, BarCodPar, ExHdrAlb, ExHdrKgE, ExHdrCnE, ExHdrFeE, ExHdrKgR, ExHdrCnR, ExHdrFeR, ExHdrLoc, ExHdrTin, ExHdrCli, ExHdrKRe, ExHdrCRe, ExHdrExL, ExHdrMtE, ExHdrMtR, ExtHdrLS) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P00F010", "UPDATE TXPCEXMVH SET ExHdrUln=?  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXMVH")
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 8);
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
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
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setShort(8, ((Number) parms[13]).shortValue());
               stmt.setString(9, (String)parms[14], 8);
               stmt.setInt(10, ((Number) parms[15]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 10);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[31]).intValue());
               }
               return;
            case 8 :
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

