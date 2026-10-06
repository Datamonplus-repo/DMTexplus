package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu05 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu05 pgm = new aptexu05 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu05.class ), "" );
   }

   public aptexu05( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Procesando tabla BARCAD...Materiales reoperados...", "") );
      /* Using cursor P02V42 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02V42_A396EmprCod[0] ;
         A148BarEstReo = P02V42_A148BarEstReo[0] ;
         A129BarCod = P02V42_A129BarCod[0] ;
         A132BarCodReo = P02V42_A132BarCodReo[0] ;
         A130BarCodPar = P02V42_A130BarCodPar[0] ;
         A6434BarAsi = P02V42_A6434BarAsi[0] ;
         A365DisDes = P02V42_A365DisDes[0] ;
         AV21Emprcod = A396EmprCod ;
         AV18Barcod = A129BarCod ;
         AV23Codreo_0 = (byte)(0) ;
         AV20barcodreo = A132BarCodReo ;
         AV19Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'HDRMAT' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A6434BarAsi = (byte)(1) ;
         A365DisDes = httpContext.getMessage( "N", "") ;
         Gx_msg = httpContext.getMessage( "Barcod=", "") + GXutil.str( AV18Barcod, 8, 0) + httpContext.getMessage( "Barasi=", "") + GXutil.str( A6434BarAsi, 1, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P02V43 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A6434BarAsi), A365DisDes, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin tabla BARCAD...Materiales reoperados...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'HDRMAT' Routine */
      returnInSub = false ;
      /* Using cursor P02V44 */
      pr_default.execute(2, new Object[] {AV21Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV23Codreo_0), AV19Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6967Mat_Hdp = P02V44_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P02V44_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P02V44_A6965Mat_Hd[0] ;
         A7397Mat_FecIng = P02V44_A7397Mat_FecIng[0] ;
         n7397Mat_FecIng = P02V44_n7397Mat_FecIng[0] ;
         A7396Mat_HdKPr = P02V44_A7396Mat_HdKPr[0] ;
         n7396Mat_HdKPr = P02V44_n7396Mat_HdKPr[0] ;
         A6971Mat_Pzas = P02V44_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = P02V44_n6971Mat_Pzas[0] ;
         A6970Mat_HdGuia = P02V44_A6970Mat_HdGuia[0] ;
         n6970Mat_HdGuia = P02V44_n6970Mat_HdGuia[0] ;
         A6969Mat_HdKgs = P02V44_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = P02V44_n6969Mat_HdKgs[0] ;
         A6968Mat_HdUl = P02V44_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = P02V44_n6968Mat_HdUl[0] ;
         A396EmprCod = P02V44_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRMAT

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         A6965Mat_Hd = AV18Barcod ;
         A6966Mat_Hdr = AV20barcodreo ;
         A6967Mat_Hdp = AV19Barcodpar ;
         /* Using cursor P02V45 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6970Mat_HdGuia), A6970Mat_HdGuia, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), Boolean.valueOf(n7396Mat_HdKPr), A7396Mat_HdKPr, Boolean.valueOf(n7397Mat_FecIng), A7397Mat_FecIng});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
         if ( (pr_default.getStatus(3) == 1) )
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P02V46 */
      pr_default.execute(4, new Object[] {AV21Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV23Codreo_0), AV19Barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A6981Mat_HdObs = P02V46_A6981Mat_HdObs[0] ;
         n6981Mat_HdObs = P02V46_n6981Mat_HdObs[0] ;
         A6967Mat_Hdp = P02V46_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P02V46_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P02V46_A6965Mat_Hd[0] ;
         A7238Mat_RecM = P02V46_A7238Mat_RecM[0] ;
         n7238Mat_RecM = P02V46_n7238Mat_RecM[0] ;
         A7108Mat_TraInt = P02V46_A7108Mat_TraInt[0] ;
         n7108Mat_TraInt = P02V46_n7108Mat_TraInt[0] ;
         A7107Mat_CliRm = P02V46_A7107Mat_CliRm[0] ;
         n7107Mat_CliRm = P02V46_n7107Mat_CliRm[0] ;
         A7106Mat_MaqTej = P02V46_A7106Mat_MaqTej[0] ;
         n7106Mat_MaqTej = P02V46_n7106Mat_MaqTej[0] ;
         A6980Mat_HdLm = P02V46_A6980Mat_HdLm[0] ;
         n6980Mat_HdLm = P02V46_n6980Mat_HdLm[0] ;
         A6979Mat_HdPorc = P02V46_A6979Mat_HdPorc[0] ;
         n6979Mat_HdPorc = P02V46_n6979Mat_HdPorc[0] ;
         A6978Mat_HdLote = P02V46_A6978Mat_HdLote[0] ;
         n6978Mat_HdLote = P02V46_n6978Mat_HdLote[0] ;
         A6977Mat_HdProv = P02V46_A6977Mat_HdProv[0] ;
         n6977Mat_HdProv = P02V46_n6977Mat_HdProv[0] ;
         A6976Mat_HdNomc = P02V46_A6976Mat_HdNomc[0] ;
         n6976Mat_HdNomc = P02V46_n6976Mat_HdNomc[0] ;
         A6975Mat_HdTor = P02V46_A6975Mat_HdTor[0] ;
         n6975Mat_HdTor = P02V46_n6975Mat_HdTor[0] ;
         A6974Mat_HdMat = P02V46_A6974Mat_HdMat[0] ;
         n6974Mat_HdMat = P02V46_n6974Mat_HdMat[0] ;
         A6973Mat_HdEst = P02V46_A6973Mat_HdEst[0] ;
         n6973Mat_HdEst = P02V46_n6973Mat_HdEst[0] ;
         A6972Mat_HdLin = P02V46_A6972Mat_HdLin[0] ;
         A396EmprCod = P02V46_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRMA1

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         W6972Mat_HdLin = A6972Mat_HdLin ;
         A6965Mat_Hd = AV18Barcod ;
         A6966Mat_Hdr = AV20barcodreo ;
         A6967Mat_Hdp = AV19Barcodpar ;
         /* Using cursor P02V47 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin), Boolean.valueOf(n6973Mat_HdEst), A6973Mat_HdEst, Boolean.valueOf(n6974Mat_HdMat), A6974Mat_HdMat, Boolean.valueOf(n6975Mat_HdTor), A6975Mat_HdTor, Boolean.valueOf(n6976Mat_HdNomc), A6976Mat_HdNomc, Boolean.valueOf(n6977Mat_HdProv), A6977Mat_HdProv, Boolean.valueOf(n6978Mat_HdLote), A6978Mat_HdLote, Boolean.valueOf(n6979Mat_HdPorc), A6979Mat_HdPorc, Boolean.valueOf(n6980Mat_HdLm), A6980Mat_HdLm, Boolean.valueOf(n6981Mat_HdObs), A6981Mat_HdObs, Boolean.valueOf(n7106Mat_MaqTej), A7106Mat_MaqTej, Boolean.valueOf(n7107Mat_CliRm), A7107Mat_CliRm, Boolean.valueOf(n7108Mat_TraInt), Long.valueOf(A7108Mat_TraInt), Boolean.valueOf(n7238Mat_RecM), Integer.valueOf(A7238Mat_RecM)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
         if ( (pr_default.getStatus(5) == 1) )
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         A6972Mat_HdLin = W6972Mat_HdLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P02V48 */
      pr_default.execute(6, new Object[] {AV21Emprcod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV23Codreo_0), AV19Barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A6967Mat_Hdp = P02V48_A6967Mat_Hdp[0] ;
         A6966Mat_Hdr = P02V48_A6966Mat_Hdr[0] ;
         A6965Mat_Hd = P02V48_A6965Mat_Hd[0] ;
         A7239Mat_RecT = P02V48_A7239Mat_RecT[0] ;
         n7239Mat_RecT = P02V48_n7239Mat_RecT[0] ;
         A8049Mat_HdKgTl = P02V48_A8049Mat_HdKgTl[0] ;
         n8049Mat_HdKgTl = P02V48_n8049Mat_HdKgTl[0] ;
         A7008Mat_HdUnTl = P02V48_A7008Mat_HdUnTl[0] ;
         n7008Mat_HdUnTl = P02V48_n7008Mat_HdUnTl[0] ;
         A7007Mat_HdTl = P02V48_A7007Mat_HdTl[0] ;
         A396EmprCod = P02V48_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         /*
            INSERT RECORD ON TABLE TXPHDRTAL

         */
         W396EmprCod = A396EmprCod ;
         W6965Mat_Hd = A6965Mat_Hd ;
         W6966Mat_Hdr = A6966Mat_Hdr ;
         W6967Mat_Hdp = A6967Mat_Hdp ;
         W7007Mat_HdTl = A7007Mat_HdTl ;
         A6965Mat_Hd = AV18Barcod ;
         A6966Mat_Hdr = AV20barcodreo ;
         A6967Mat_Hdp = AV19Barcodpar ;
         /* Using cursor P02V49 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A7007Mat_HdTl, Boolean.valueOf(n7008Mat_HdUnTl), Integer.valueOf(A7008Mat_HdUnTl), Boolean.valueOf(n8049Mat_HdKgTl), A8049Mat_HdKgTl, Boolean.valueOf(n7239Mat_RecT), Integer.valueOf(A7239Mat_RecT)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTAL");
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
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         A7007Mat_HdTl = W7007Mat_HdTl ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A6965Mat_Hd = W6965Mat_Hd ;
         A6966Mat_Hdr = W6966Mat_Hdr ;
         A6967Mat_Hdp = W6967Mat_Hdp ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu05.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu05");
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
      P02V42_A396EmprCod = new String[] {""} ;
      P02V42_A148BarEstReo = new byte[1] ;
      P02V42_A129BarCod = new int[1] ;
      P02V42_A132BarCodReo = new byte[1] ;
      P02V42_A130BarCodPar = new String[] {""} ;
      P02V42_A6434BarAsi = new byte[1] ;
      P02V42_A365DisDes = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      AV21Emprcod = "" ;
      AV19Barcodpar = "" ;
      Gx_msg = "" ;
      P02V44_A6967Mat_Hdp = new String[] {""} ;
      P02V44_A6966Mat_Hdr = new byte[1] ;
      P02V44_A6965Mat_Hd = new int[1] ;
      P02V44_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      P02V44_n7397Mat_FecIng = new boolean[] {false} ;
      P02V44_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02V44_n7396Mat_HdKPr = new boolean[] {false} ;
      P02V44_A6971Mat_Pzas = new int[1] ;
      P02V44_n6971Mat_Pzas = new boolean[] {false} ;
      P02V44_A6970Mat_HdGuia = new String[] {""} ;
      P02V44_n6970Mat_HdGuia = new boolean[] {false} ;
      P02V44_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02V44_n6969Mat_HdKgs = new boolean[] {false} ;
      P02V44_A6968Mat_HdUl = new short[1] ;
      P02V44_n6968Mat_HdUl = new boolean[] {false} ;
      P02V44_A396EmprCod = new String[] {""} ;
      A6967Mat_Hdp = "" ;
      A7397Mat_FecIng = GXutil.nullDate() ;
      A7396Mat_HdKPr = DecimalUtil.ZERO ;
      A6970Mat_HdGuia = "" ;
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W6967Mat_Hdp = "" ;
      Gx_emsg = "" ;
      P02V46_A6981Mat_HdObs = new String[] {""} ;
      P02V46_n6981Mat_HdObs = new boolean[] {false} ;
      P02V46_A6967Mat_Hdp = new String[] {""} ;
      P02V46_A6966Mat_Hdr = new byte[1] ;
      P02V46_A6965Mat_Hd = new int[1] ;
      P02V46_A7238Mat_RecM = new int[1] ;
      P02V46_n7238Mat_RecM = new boolean[] {false} ;
      P02V46_A7108Mat_TraInt = new long[1] ;
      P02V46_n7108Mat_TraInt = new boolean[] {false} ;
      P02V46_A7107Mat_CliRm = new String[] {""} ;
      P02V46_n7107Mat_CliRm = new boolean[] {false} ;
      P02V46_A7106Mat_MaqTej = new String[] {""} ;
      P02V46_n7106Mat_MaqTej = new boolean[] {false} ;
      P02V46_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02V46_n6980Mat_HdLm = new boolean[] {false} ;
      P02V46_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02V46_n6979Mat_HdPorc = new boolean[] {false} ;
      P02V46_A6978Mat_HdLote = new String[] {""} ;
      P02V46_n6978Mat_HdLote = new boolean[] {false} ;
      P02V46_A6977Mat_HdProv = new String[] {""} ;
      P02V46_n6977Mat_HdProv = new boolean[] {false} ;
      P02V46_A6976Mat_HdNomc = new String[] {""} ;
      P02V46_n6976Mat_HdNomc = new boolean[] {false} ;
      P02V46_A6975Mat_HdTor = new String[] {""} ;
      P02V46_n6975Mat_HdTor = new boolean[] {false} ;
      P02V46_A6974Mat_HdMat = new String[] {""} ;
      P02V46_n6974Mat_HdMat = new boolean[] {false} ;
      P02V46_A6973Mat_HdEst = new String[] {""} ;
      P02V46_n6973Mat_HdEst = new boolean[] {false} ;
      P02V46_A6972Mat_HdLin = new short[1] ;
      P02V46_A396EmprCod = new String[] {""} ;
      A6981Mat_HdObs = "" ;
      A7107Mat_CliRm = "" ;
      A7106Mat_MaqTej = "" ;
      A6980Mat_HdLm = DecimalUtil.ZERO ;
      A6979Mat_HdPorc = DecimalUtil.ZERO ;
      A6978Mat_HdLote = "" ;
      A6977Mat_HdProv = "" ;
      A6976Mat_HdNomc = "" ;
      A6975Mat_HdTor = "" ;
      A6974Mat_HdMat = "" ;
      A6973Mat_HdEst = "" ;
      P02V48_A6967Mat_Hdp = new String[] {""} ;
      P02V48_A6966Mat_Hdr = new byte[1] ;
      P02V48_A6965Mat_Hd = new int[1] ;
      P02V48_A7239Mat_RecT = new int[1] ;
      P02V48_n7239Mat_RecT = new boolean[] {false} ;
      P02V48_A8049Mat_HdKgTl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02V48_n8049Mat_HdKgTl = new boolean[] {false} ;
      P02V48_A7008Mat_HdUnTl = new int[1] ;
      P02V48_n7008Mat_HdUnTl = new boolean[] {false} ;
      P02V48_A7007Mat_HdTl = new String[] {""} ;
      P02V48_A396EmprCod = new String[] {""} ;
      A8049Mat_HdKgTl = DecimalUtil.ZERO ;
      A7007Mat_HdTl = "" ;
      W7007Mat_HdTl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu05__default(),
         new Object[] {
             new Object[] {
            P02V42_A396EmprCod, P02V42_A148BarEstReo, P02V42_A129BarCod, P02V42_A132BarCodReo, P02V42_A130BarCodPar, P02V42_A6434BarAsi, P02V42_A365DisDes
            }
            , new Object[] {
            }
            , new Object[] {
            P02V44_A6967Mat_Hdp, P02V44_A6966Mat_Hdr, P02V44_A6965Mat_Hd, P02V44_A7397Mat_FecIng, P02V44_n7397Mat_FecIng, P02V44_A7396Mat_HdKPr, P02V44_n7396Mat_HdKPr, P02V44_A6971Mat_Pzas, P02V44_n6971Mat_Pzas, P02V44_A6970Mat_HdGuia,
            P02V44_n6970Mat_HdGuia, P02V44_A6969Mat_HdKgs, P02V44_n6969Mat_HdKgs, P02V44_A6968Mat_HdUl, P02V44_n6968Mat_HdUl, P02V44_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02V46_A6981Mat_HdObs, P02V46_n6981Mat_HdObs, P02V46_A6967Mat_Hdp, P02V46_A6966Mat_Hdr, P02V46_A6965Mat_Hd, P02V46_A7238Mat_RecM, P02V46_n7238Mat_RecM, P02V46_A7108Mat_TraInt, P02V46_n7108Mat_TraInt, P02V46_A7107Mat_CliRm,
            P02V46_n7107Mat_CliRm, P02V46_A7106Mat_MaqTej, P02V46_n7106Mat_MaqTej, P02V46_A6980Mat_HdLm, P02V46_n6980Mat_HdLm, P02V46_A6979Mat_HdPorc, P02V46_n6979Mat_HdPorc, P02V46_A6978Mat_HdLote, P02V46_n6978Mat_HdLote, P02V46_A6977Mat_HdProv,
            P02V46_n6977Mat_HdProv, P02V46_A6976Mat_HdNomc, P02V46_n6976Mat_HdNomc, P02V46_A6975Mat_HdTor, P02V46_n6975Mat_HdTor, P02V46_A6974Mat_HdMat, P02V46_n6974Mat_HdMat, P02V46_A6973Mat_HdEst, P02V46_n6973Mat_HdEst, P02V46_A6972Mat_HdLin,
            P02V46_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02V48_A6967Mat_Hdp, P02V48_A6966Mat_Hdr, P02V48_A6965Mat_Hd, P02V48_A7239Mat_RecT, P02V48_n7239Mat_RecT, P02V48_A8049Mat_HdKgTl, P02V48_n8049Mat_HdKgTl, P02V48_A7008Mat_HdUnTl, P02V48_n7008Mat_HdUnTl, P02V48_A7007Mat_HdTl,
            P02V48_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte A6434BarAsi ;
   private byte AV23Codreo_0 ;
   private byte AV20barcodreo ;
   private byte A6966Mat_Hdr ;
   private byte W6966Mat_Hdr ;
   private short A6968Mat_HdUl ;
   private short Gx_err ;
   private short A6972Mat_HdLin ;
   private short W6972Mat_HdLin ;
   private int A129BarCod ;
   private int AV18Barcod ;
   private int A6965Mat_Hd ;
   private int A6971Mat_Pzas ;
   private int W6965Mat_Hd ;
   private int GX_INS985 ;
   private int A7238Mat_RecM ;
   private int GX_INS986 ;
   private int A7239Mat_RecT ;
   private int A7008Mat_HdUnTl ;
   private int GX_INS1132 ;
   private long A7108Mat_TraInt ;
   private java.math.BigDecimal A7396Mat_HdKPr ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private java.math.BigDecimal A6980Mat_HdLm ;
   private java.math.BigDecimal A6979Mat_HdPorc ;
   private java.math.BigDecimal A8049Mat_HdKgTl ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String AV21Emprcod ;
   private String AV19Barcodpar ;
   private String Gx_msg ;
   private String A6967Mat_Hdp ;
   private String A6970Mat_HdGuia ;
   private String W396EmprCod ;
   private String W6967Mat_Hdp ;
   private String Gx_emsg ;
   private String A7107Mat_CliRm ;
   private String A7106Mat_MaqTej ;
   private String A6978Mat_HdLote ;
   private String A6977Mat_HdProv ;
   private String A6976Mat_HdNomc ;
   private String A6975Mat_HdTor ;
   private String A6974Mat_HdMat ;
   private String A6973Mat_HdEst ;
   private String A7007Mat_HdTl ;
   private String W7007Mat_HdTl ;
   private java.util.Date A7397Mat_FecIng ;
   private boolean returnInSub ;
   private boolean n7397Mat_FecIng ;
   private boolean n7396Mat_HdKPr ;
   private boolean n6971Mat_Pzas ;
   private boolean n6970Mat_HdGuia ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6968Mat_HdUl ;
   private boolean n6981Mat_HdObs ;
   private boolean n7238Mat_RecM ;
   private boolean n7108Mat_TraInt ;
   private boolean n7107Mat_CliRm ;
   private boolean n7106Mat_MaqTej ;
   private boolean n6980Mat_HdLm ;
   private boolean n6979Mat_HdPorc ;
   private boolean n6978Mat_HdLote ;
   private boolean n6977Mat_HdProv ;
   private boolean n6976Mat_HdNomc ;
   private boolean n6975Mat_HdTor ;
   private boolean n6974Mat_HdMat ;
   private boolean n6973Mat_HdEst ;
   private boolean n7239Mat_RecT ;
   private boolean n8049Mat_HdKgTl ;
   private boolean n7008Mat_HdUnTl ;
   private String A6981Mat_HdObs ;
   private IDataStoreProvider pr_default ;
   private String[] P02V42_A396EmprCod ;
   private byte[] P02V42_A148BarEstReo ;
   private int[] P02V42_A129BarCod ;
   private byte[] P02V42_A132BarCodReo ;
   private String[] P02V42_A130BarCodPar ;
   private byte[] P02V42_A6434BarAsi ;
   private String[] P02V42_A365DisDes ;
   private String[] P02V44_A6967Mat_Hdp ;
   private byte[] P02V44_A6966Mat_Hdr ;
   private int[] P02V44_A6965Mat_Hd ;
   private java.util.Date[] P02V44_A7397Mat_FecIng ;
   private boolean[] P02V44_n7397Mat_FecIng ;
   private java.math.BigDecimal[] P02V44_A7396Mat_HdKPr ;
   private boolean[] P02V44_n7396Mat_HdKPr ;
   private int[] P02V44_A6971Mat_Pzas ;
   private boolean[] P02V44_n6971Mat_Pzas ;
   private String[] P02V44_A6970Mat_HdGuia ;
   private boolean[] P02V44_n6970Mat_HdGuia ;
   private java.math.BigDecimal[] P02V44_A6969Mat_HdKgs ;
   private boolean[] P02V44_n6969Mat_HdKgs ;
   private short[] P02V44_A6968Mat_HdUl ;
   private boolean[] P02V44_n6968Mat_HdUl ;
   private String[] P02V44_A396EmprCod ;
   private String[] P02V46_A6981Mat_HdObs ;
   private boolean[] P02V46_n6981Mat_HdObs ;
   private String[] P02V46_A6967Mat_Hdp ;
   private byte[] P02V46_A6966Mat_Hdr ;
   private int[] P02V46_A6965Mat_Hd ;
   private int[] P02V46_A7238Mat_RecM ;
   private boolean[] P02V46_n7238Mat_RecM ;
   private long[] P02V46_A7108Mat_TraInt ;
   private boolean[] P02V46_n7108Mat_TraInt ;
   private String[] P02V46_A7107Mat_CliRm ;
   private boolean[] P02V46_n7107Mat_CliRm ;
   private String[] P02V46_A7106Mat_MaqTej ;
   private boolean[] P02V46_n7106Mat_MaqTej ;
   private java.math.BigDecimal[] P02V46_A6980Mat_HdLm ;
   private boolean[] P02V46_n6980Mat_HdLm ;
   private java.math.BigDecimal[] P02V46_A6979Mat_HdPorc ;
   private boolean[] P02V46_n6979Mat_HdPorc ;
   private String[] P02V46_A6978Mat_HdLote ;
   private boolean[] P02V46_n6978Mat_HdLote ;
   private String[] P02V46_A6977Mat_HdProv ;
   private boolean[] P02V46_n6977Mat_HdProv ;
   private String[] P02V46_A6976Mat_HdNomc ;
   private boolean[] P02V46_n6976Mat_HdNomc ;
   private String[] P02V46_A6975Mat_HdTor ;
   private boolean[] P02V46_n6975Mat_HdTor ;
   private String[] P02V46_A6974Mat_HdMat ;
   private boolean[] P02V46_n6974Mat_HdMat ;
   private String[] P02V46_A6973Mat_HdEst ;
   private boolean[] P02V46_n6973Mat_HdEst ;
   private short[] P02V46_A6972Mat_HdLin ;
   private String[] P02V46_A396EmprCod ;
   private String[] P02V48_A6967Mat_Hdp ;
   private byte[] P02V48_A6966Mat_Hdr ;
   private int[] P02V48_A6965Mat_Hd ;
   private int[] P02V48_A7239Mat_RecT ;
   private boolean[] P02V48_n7239Mat_RecT ;
   private java.math.BigDecimal[] P02V48_A8049Mat_HdKgTl ;
   private boolean[] P02V48_n8049Mat_HdKgTl ;
   private int[] P02V48_A7008Mat_HdUnTl ;
   private boolean[] P02V48_n7008Mat_HdUnTl ;
   private String[] P02V48_A7007Mat_HdTl ;
   private String[] P02V48_A396EmprCod ;
}

final  class aptexu05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02V42", "SELECT EmprCod, BarEstReo, BarCod, BarCodReo, BarCodPar, BarAsi, DisDes FROM TXPBARCAD WHERE EmprCod = '001' and BarEstReo = 1 ORDER BY EmprCod, BarEstReo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V43", "UPDATE TXPBARCAD SET BarAsi=?, DisDes=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02V44", "SELECT Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_FecIng, Mat_HdKPr, Mat_Pzas, Mat_HdGuia, Mat_HdKgs, Mat_HdUl, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02V45", "INSERT INTO TXPHDRMAT(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMAT")
         ,new ForEachCursor("P02V46", "SELECT Mat_HdObs, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecM, Mat_TraInt, Mat_CliRm, Mat_MaqTej, Mat_HdLm, Mat_HdPorc, Mat_HdLote, Mat_HdProv, Mat_HdNomc, Mat_HdTor, Mat_HdMat, Mat_HdEst, Mat_HdLin, EmprCod FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V47", "INSERT INTO TXPHDRMA1(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_HdObs, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMA1")
         ,new ForEachCursor("P02V48", "SELECT Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecT, Mat_HdKgTl, Mat_HdUnTl, Mat_HdTl, EmprCod FROM TXPHDRTAL WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V49", "INSERT INTO TXPHDRTAL(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl, Mat_HdUnTl, Mat_HdKgTl, Mat_RecT) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRTAL")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 4);
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 30);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[28]).longValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               return;
      }
   }

}

