package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesospedidoanterior extends GXProcedure
{
   public procesospedidoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesospedidoanterior.class ), "" );
   }

   public procesospedidoanterior( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 )
   {
      procesospedidoanterior.this.AV8Emprcod = aP0;
      procesospedidoanterior.this.AV9Discod = aP1;
      procesospedidoanterior.this.AV10Anterior_Discod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A842 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV10Anterior_Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12144ProStsFec = P0A842_A12144ProStsFec[0] ;
         n12144ProStsFec = P0A842_n12144ProStsFec[0] ;
         A12143ProSts = P0A842_A12143ProSts[0] ;
         n12143ProSts = P0A842_n12143ProSts[0] ;
         A5334DisFasApr = P0A842_A5334DisFasApr[0] ;
         n5334DisFasApr = P0A842_n5334DisFasApr[0] ;
         A846UltFasLin = P0A842_A846UltFasLin[0] ;
         A361DisCod = P0A842_A361DisCod[0] ;
         A396EmprCod = P0A842_A396EmprCod[0] ;
         A758ProCod = P0A842_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         /*
            INSERT RECORD ON TABLE TXPDISLIN

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W758ProCod = A758ProCod ;
         W846UltFasLin = A846UltFasLin ;
         W5334DisFasApr = A5334DisFasApr ;
         n5334DisFasApr = false ;
         W12143ProSts = A12143ProSts ;
         n12143ProSts = false ;
         W12144ProStsFec = A12144ProStsFec ;
         n12144ProStsFec = false ;
         A396EmprCod = AV8Emprcod ;
         A361DisCod = AV9Discod ;
         A846UltFasLin = (short)(0) ;
         A5334DisFasApr = "" ;
         n5334DisFasApr = false ;
         A12143ProSts = (byte)(0) ;
         n12143ProSts = false ;
         A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
         n12144ProStsFec = false ;
         /* Using cursor P0A843 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n5334DisFasApr), A5334DisFasApr, Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A758ProCod = W758ProCod ;
         A846UltFasLin = W846UltFasLin ;
         A5334DisFasApr = W5334DisFasApr ;
         n5334DisFasApr = false ;
         A12143ProSts = W12143ProSts ;
         n12143ProSts = false ;
         A12144ProStsFec = W12144ProStsFec ;
         n12144ProStsFec = false ;
         /* End Insert */
         /* Using cursor P0A844 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7744FasPreObl = P0A844_A7744FasPreObl[0] ;
            n7744FasPreObl = P0A844_n7744FasPreObl[0] ;
            A5307DisNumPas = P0A844_A5307DisNumPas[0] ;
            n5307DisNumPas = P0A844_n5307DisNumPas[0] ;
            A5306DisVelPro = P0A844_A5306DisVelPro[0] ;
            n5306DisVelPro = P0A844_n5306DisVelPro[0] ;
            A5305DisPrePie = P0A844_A5305DisPrePie[0] ;
            n5305DisPrePie = P0A844_n5305DisPrePie[0] ;
            A5304DisPreSal = P0A844_A5304DisPreSal[0] ;
            n5304DisPreSal = P0A844_n5304DisPreSal[0] ;
            A9841DisFasObs = P0A844_A9841DisFasObs[0] ;
            A7918Dta_UOrd = P0A844_A7918Dta_UOrd[0] ;
            n7918Dta_UOrd = P0A844_n7918Dta_UOrd[0] ;
            A7917DisfasRb = P0A844_A7917DisfasRb[0] ;
            n7917DisfasRb = P0A844_n7917DisfasRb[0] ;
            A7916DisFasUpL = P0A844_A7916DisFasUpL[0] ;
            n7916DisFasUpL = P0A844_n7916DisFasUpL[0] ;
            A7915Disfastpp = P0A844_A7915Disfastpp[0] ;
            n7915Disfastpp = P0A844_n7915Disfastpp[0] ;
            A7747DisFasAut = P0A844_A7747DisFasAut[0] ;
            n7747DisFasAut = P0A844_n7747DisFasAut[0] ;
            A7743DisFasRec = P0A844_A7743DisFasRec[0] ;
            n7743DisFasRec = P0A844_n7743DisFasRec[0] ;
            A7742DisFasDto = P0A844_A7742DisFasDto[0] ;
            n7742DisFasDto = P0A844_n7742DisFasDto[0] ;
            A7741DisFasUni = P0A844_A7741DisFasUni[0] ;
            n7741DisFasUni = P0A844_n7741DisFasUni[0] ;
            A7740DisFasPre = P0A844_A7740DisFasPre[0] ;
            n7740DisFasPre = P0A844_n7740DisFasPre[0] ;
            A5376DisQuiUl = P0A844_A5376DisQuiUl[0] ;
            A3793DisMaqPru = P0A844_A3793DisMaqPru[0] ;
            n3793DisMaqPru = P0A844_n3793DisMaqPru[0] ;
            A3697FasApr = P0A844_A3697FasApr[0] ;
            A457FasCod = P0A844_A457FasCod[0] ;
            A368DisFasLin = P0A844_A368DisFasLin[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W758ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPDISFAS

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W758ProCod = A758ProCod ;
            W368DisFasLin = A368DisFasLin ;
            A396EmprCod = AV8Emprcod ;
            A361DisCod = AV9Discod ;
            /* Using cursor P0A845 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Boolean.valueOf(n3793DisMaqPru), A3793DisMaqPru, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), Boolean.valueOf(n7915Disfastpp), A7915Disfastpp, Boolean.valueOf(n7916DisFasUpL), A7916DisFasUpL, Boolean.valueOf(n7917DisfasRb), A7917DisfasRb, Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A9841DisFasObs, Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
            A361DisCod = W361DisCod ;
            A758ProCod = W758ProCod ;
            A368DisFasLin = W368DisFasLin ;
            /* End Insert */
            /* Using cursor P0A846 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A3687DisParTxt = P0A846_A3687DisParTxt[0] ;
               A14078DisParPLC = P0A846_A14078DisParPLC[0] ;
               A13990DisParVMx = P0A846_A13990DisParVMx[0] ;
               A13989DisParVMn = P0A846_A13989DisParVMn[0] ;
               A12672DisParVl2 = P0A846_A12672DisParVl2[0] ;
               A6557DisParOrd = P0A846_A6557DisParOrd[0] ;
               A3686DisParObs = P0A846_A3686DisParObs[0] ;
               A3685DisParVal = P0A846_A3685DisParVal[0] ;
               A1664ParFasCod = P0A846_A1664ParFasCod[0] ;
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               /*
                  INSERT RECORD ON TABLE TXPDISPAR

               */
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               W1664ParFasCod = A1664ParFasCod ;
               A396EmprCod = AV8Emprcod ;
               A361DisCod = AV9Discod ;
               /* Using cursor P0A847 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod), A3685DisParVal, A3686DisParObs, A3687DisParTxt, Short.valueOf(A6557DisParOrd), A12672DisParVl2, A13989DisParVMn, A13990DisParVMx, A14078DisParPLC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
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
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               A1664ParFasCod = W1664ParFasCod ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P0A848 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A5489DisQuiDsc = P0A848_A5489DisQuiDsc[0] ;
               A5380DisQuiRb = P0A848_A5380DisQuiRb[0] ;
               A5379DisQuiTp = P0A848_A5379DisQuiTp[0] ;
               A5378DisQuiNp = P0A848_A5378DisQuiNp[0] ;
               A764ProForCod = P0A848_A764ProForCod[0] ;
               A5377DisQuiLin = P0A848_A5377DisQuiLin[0] ;
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               /*
                  INSERT RECORD ON TABLE TXPDISQUI

               */
               W396EmprCod = A396EmprCod ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               W5377DisQuiLin = A5377DisQuiLin ;
               A396EmprCod = AV8Emprcod ;
               A361DisCod = AV9Discod ;
               /* Using cursor P0A849 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin), A764ProForCod, Short.valueOf(A5378DisQuiNp), Short.valueOf(A5379DisQuiTp), Short.valueOf(A5380DisQuiRb), A5489DisQuiDsc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
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
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               A5377DisQuiLin = W5377DisQuiLin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.procesospedidoanterior");
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
      P0A842_A12144ProStsFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A842_n12144ProStsFec = new boolean[] {false} ;
      P0A842_A12143ProSts = new byte[1] ;
      P0A842_n12143ProSts = new boolean[] {false} ;
      P0A842_A5334DisFasApr = new String[] {""} ;
      P0A842_n5334DisFasApr = new boolean[] {false} ;
      P0A842_A846UltFasLin = new short[1] ;
      P0A842_A361DisCod = new int[1] ;
      P0A842_A396EmprCod = new String[] {""} ;
      P0A842_A758ProCod = new String[] {""} ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      A5334DisFasApr = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      W5334DisFasApr = "" ;
      W12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      P0A844_A396EmprCod = new String[] {""} ;
      P0A844_A361DisCod = new int[1] ;
      P0A844_A758ProCod = new String[] {""} ;
      P0A844_A7744FasPreObl = new byte[1] ;
      P0A844_n7744FasPreObl = new boolean[] {false} ;
      P0A844_A5307DisNumPas = new short[1] ;
      P0A844_n5307DisNumPas = new boolean[] {false} ;
      P0A844_A5306DisVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n5306DisVelPro = new boolean[] {false} ;
      P0A844_A5305DisPrePie = new short[1] ;
      P0A844_n5305DisPrePie = new boolean[] {false} ;
      P0A844_A5304DisPreSal = new short[1] ;
      P0A844_n5304DisPreSal = new boolean[] {false} ;
      P0A844_A9841DisFasObs = new String[] {""} ;
      P0A844_A7918Dta_UOrd = new short[1] ;
      P0A844_n7918Dta_UOrd = new boolean[] {false} ;
      P0A844_A7917DisfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7917DisfasRb = new boolean[] {false} ;
      P0A844_A7916DisFasUpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7916DisFasUpL = new boolean[] {false} ;
      P0A844_A7915Disfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7915Disfastpp = new boolean[] {false} ;
      P0A844_A7747DisFasAut = new byte[1] ;
      P0A844_n7747DisFasAut = new boolean[] {false} ;
      P0A844_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7743DisFasRec = new boolean[] {false} ;
      P0A844_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7742DisFasDto = new boolean[] {false} ;
      P0A844_A7741DisFasUni = new String[] {""} ;
      P0A844_n7741DisFasUni = new boolean[] {false} ;
      P0A844_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A844_n7740DisFasPre = new boolean[] {false} ;
      P0A844_A5376DisQuiUl = new short[1] ;
      P0A844_A3793DisMaqPru = new String[] {""} ;
      P0A844_n3793DisMaqPru = new boolean[] {false} ;
      P0A844_A3697FasApr = new String[] {""} ;
      P0A844_A457FasCod = new String[] {""} ;
      P0A844_A368DisFasLin = new short[1] ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      A9841DisFasObs = "" ;
      A7917DisfasRb = DecimalUtil.ZERO ;
      A7916DisFasUpL = DecimalUtil.ZERO ;
      A7915Disfastpp = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A3793DisMaqPru = "" ;
      A3697FasApr = "" ;
      A457FasCod = "" ;
      P0A846_A3687DisParTxt = new String[] {""} ;
      P0A846_A396EmprCod = new String[] {""} ;
      P0A846_A361DisCod = new int[1] ;
      P0A846_A758ProCod = new String[] {""} ;
      P0A846_A368DisFasLin = new short[1] ;
      P0A846_A14078DisParPLC = new String[] {""} ;
      P0A846_A13990DisParVMx = new String[] {""} ;
      P0A846_A13989DisParVMn = new String[] {""} ;
      P0A846_A12672DisParVl2 = new String[] {""} ;
      P0A846_A6557DisParOrd = new short[1] ;
      P0A846_A3686DisParObs = new String[] {""} ;
      P0A846_A3685DisParVal = new String[] {""} ;
      P0A846_A1664ParFasCod = new short[1] ;
      A3687DisParTxt = "" ;
      A14078DisParPLC = "" ;
      A13990DisParVMx = "" ;
      A13989DisParVMn = "" ;
      A12672DisParVl2 = "" ;
      A3686DisParObs = "" ;
      A3685DisParVal = "" ;
      P0A848_A396EmprCod = new String[] {""} ;
      P0A848_A361DisCod = new int[1] ;
      P0A848_A758ProCod = new String[] {""} ;
      P0A848_A368DisFasLin = new short[1] ;
      P0A848_A5489DisQuiDsc = new String[] {""} ;
      P0A848_A5380DisQuiRb = new short[1] ;
      P0A848_A5379DisQuiTp = new short[1] ;
      P0A848_A5378DisQuiNp = new short[1] ;
      P0A848_A764ProForCod = new String[] {""} ;
      P0A848_A5377DisQuiLin = new short[1] ;
      A5489DisQuiDsc = "" ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.procesospedidoanterior__default(),
         new Object[] {
             new Object[] {
            P0A842_A12144ProStsFec, P0A842_n12144ProStsFec, P0A842_A12143ProSts, P0A842_n12143ProSts, P0A842_A5334DisFasApr, P0A842_n5334DisFasApr, P0A842_A846UltFasLin, P0A842_A361DisCod, P0A842_A396EmprCod, P0A842_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0A844_A396EmprCod, P0A844_A361DisCod, P0A844_A758ProCod, P0A844_A7744FasPreObl, P0A844_n7744FasPreObl, P0A844_A5307DisNumPas, P0A844_n5307DisNumPas, P0A844_A5306DisVelPro, P0A844_n5306DisVelPro, P0A844_A5305DisPrePie,
            P0A844_n5305DisPrePie, P0A844_A5304DisPreSal, P0A844_n5304DisPreSal, P0A844_A9841DisFasObs, P0A844_A7918Dta_UOrd, P0A844_n7918Dta_UOrd, P0A844_A7917DisfasRb, P0A844_n7917DisfasRb, P0A844_A7916DisFasUpL, P0A844_n7916DisFasUpL,
            P0A844_A7915Disfastpp, P0A844_n7915Disfastpp, P0A844_A7747DisFasAut, P0A844_n7747DisFasAut, P0A844_A7743DisFasRec, P0A844_n7743DisFasRec, P0A844_A7742DisFasDto, P0A844_n7742DisFasDto, P0A844_A7741DisFasUni, P0A844_n7741DisFasUni,
            P0A844_A7740DisFasPre, P0A844_n7740DisFasPre, P0A844_A5376DisQuiUl, P0A844_A3793DisMaqPru, P0A844_n3793DisMaqPru, P0A844_A3697FasApr, P0A844_A457FasCod, P0A844_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P0A846_A3687DisParTxt, P0A846_A396EmprCod, P0A846_A361DisCod, P0A846_A758ProCod, P0A846_A368DisFasLin, P0A846_A14078DisParPLC, P0A846_A13990DisParVMx, P0A846_A13989DisParVMn, P0A846_A12672DisParVl2, P0A846_A6557DisParOrd,
            P0A846_A3686DisParObs, P0A846_A3685DisParVal, P0A846_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0A848_A396EmprCod, P0A848_A361DisCod, P0A848_A758ProCod, P0A848_A368DisFasLin, P0A848_A5489DisQuiDsc, P0A848_A5380DisQuiRb, P0A848_A5379DisQuiTp, P0A848_A5378DisQuiNp, P0A848_A764ProForCod, P0A848_A5377DisQuiLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A12143ProSts ;
   private byte W12143ProSts ;
   private byte A7744FasPreObl ;
   private byte A7747DisFasAut ;
   private short A846UltFasLin ;
   private short W846UltFasLin ;
   private short Gx_err ;
   private short A5307DisNumPas ;
   private short A5305DisPrePie ;
   private short A5304DisPreSal ;
   private short A7918Dta_UOrd ;
   private short A5376DisQuiUl ;
   private short A368DisFasLin ;
   private short W368DisFasLin ;
   private short A6557DisParOrd ;
   private short A1664ParFasCod ;
   private short W1664ParFasCod ;
   private short A5380DisQuiRb ;
   private short A5379DisQuiTp ;
   private short A5378DisQuiNp ;
   private short A5377DisQuiLin ;
   private short W5377DisQuiLin ;
   private int AV9Discod ;
   private int AV10Anterior_Discod ;
   private int A361DisCod ;
   private int W361DisCod ;
   private int GX_INS38 ;
   private int GX_INS39 ;
   private int GX_INS517 ;
   private int GX_INS780 ;
   private java.math.BigDecimal A5306DisVelPro ;
   private java.math.BigDecimal A7917DisfasRb ;
   private java.math.BigDecimal A7916DisFasUpL ;
   private java.math.BigDecimal A7915Disfastpp ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7740DisFasPre ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A5334DisFasApr ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String W5334DisFasApr ;
   private String Gx_emsg ;
   private String A7741DisFasUni ;
   private String A3793DisMaqPru ;
   private String A3697FasApr ;
   private String A457FasCod ;
   private String A13990DisParVMx ;
   private String A13989DisParVMn ;
   private String A12672DisParVl2 ;
   private String A3686DisParObs ;
   private String A3685DisParVal ;
   private String A5489DisQuiDsc ;
   private String A764ProForCod ;
   private java.util.Date A12144ProStsFec ;
   private java.util.Date W12144ProStsFec ;
   private boolean n12144ProStsFec ;
   private boolean n12143ProSts ;
   private boolean n5334DisFasApr ;
   private boolean n7744FasPreObl ;
   private boolean n5307DisNumPas ;
   private boolean n5306DisVelPro ;
   private boolean n5305DisPrePie ;
   private boolean n5304DisPreSal ;
   private boolean n7918Dta_UOrd ;
   private boolean n7917DisfasRb ;
   private boolean n7916DisFasUpL ;
   private boolean n7915Disfastpp ;
   private boolean n7747DisFasAut ;
   private boolean n7743DisFasRec ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n7740DisFasPre ;
   private boolean n3793DisMaqPru ;
   private String A3687DisParTxt ;
   private String A9841DisFasObs ;
   private String A14078DisParPLC ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A842_A12144ProStsFec ;
   private boolean[] P0A842_n12144ProStsFec ;
   private byte[] P0A842_A12143ProSts ;
   private boolean[] P0A842_n12143ProSts ;
   private String[] P0A842_A5334DisFasApr ;
   private boolean[] P0A842_n5334DisFasApr ;
   private short[] P0A842_A846UltFasLin ;
   private int[] P0A842_A361DisCod ;
   private String[] P0A842_A396EmprCod ;
   private String[] P0A842_A758ProCod ;
   private String[] P0A844_A396EmprCod ;
   private int[] P0A844_A361DisCod ;
   private String[] P0A844_A758ProCod ;
   private byte[] P0A844_A7744FasPreObl ;
   private boolean[] P0A844_n7744FasPreObl ;
   private short[] P0A844_A5307DisNumPas ;
   private boolean[] P0A844_n5307DisNumPas ;
   private java.math.BigDecimal[] P0A844_A5306DisVelPro ;
   private boolean[] P0A844_n5306DisVelPro ;
   private short[] P0A844_A5305DisPrePie ;
   private boolean[] P0A844_n5305DisPrePie ;
   private short[] P0A844_A5304DisPreSal ;
   private boolean[] P0A844_n5304DisPreSal ;
   private String[] P0A844_A9841DisFasObs ;
   private short[] P0A844_A7918Dta_UOrd ;
   private boolean[] P0A844_n7918Dta_UOrd ;
   private java.math.BigDecimal[] P0A844_A7917DisfasRb ;
   private boolean[] P0A844_n7917DisfasRb ;
   private java.math.BigDecimal[] P0A844_A7916DisFasUpL ;
   private boolean[] P0A844_n7916DisFasUpL ;
   private java.math.BigDecimal[] P0A844_A7915Disfastpp ;
   private boolean[] P0A844_n7915Disfastpp ;
   private byte[] P0A844_A7747DisFasAut ;
   private boolean[] P0A844_n7747DisFasAut ;
   private java.math.BigDecimal[] P0A844_A7743DisFasRec ;
   private boolean[] P0A844_n7743DisFasRec ;
   private java.math.BigDecimal[] P0A844_A7742DisFasDto ;
   private boolean[] P0A844_n7742DisFasDto ;
   private String[] P0A844_A7741DisFasUni ;
   private boolean[] P0A844_n7741DisFasUni ;
   private java.math.BigDecimal[] P0A844_A7740DisFasPre ;
   private boolean[] P0A844_n7740DisFasPre ;
   private short[] P0A844_A5376DisQuiUl ;
   private String[] P0A844_A3793DisMaqPru ;
   private boolean[] P0A844_n3793DisMaqPru ;
   private String[] P0A844_A3697FasApr ;
   private String[] P0A844_A457FasCod ;
   private short[] P0A844_A368DisFasLin ;
   private String[] P0A846_A3687DisParTxt ;
   private String[] P0A846_A396EmprCod ;
   private int[] P0A846_A361DisCod ;
   private String[] P0A846_A758ProCod ;
   private short[] P0A846_A368DisFasLin ;
   private String[] P0A846_A14078DisParPLC ;
   private String[] P0A846_A13990DisParVMx ;
   private String[] P0A846_A13989DisParVMn ;
   private String[] P0A846_A12672DisParVl2 ;
   private short[] P0A846_A6557DisParOrd ;
   private String[] P0A846_A3686DisParObs ;
   private String[] P0A846_A3685DisParVal ;
   private short[] P0A846_A1664ParFasCod ;
   private String[] P0A848_A396EmprCod ;
   private int[] P0A848_A361DisCod ;
   private String[] P0A848_A758ProCod ;
   private short[] P0A848_A368DisFasLin ;
   private String[] P0A848_A5489DisQuiDsc ;
   private short[] P0A848_A5380DisQuiRb ;
   private short[] P0A848_A5379DisQuiTp ;
   private short[] P0A848_A5378DisQuiNp ;
   private String[] P0A848_A764ProForCod ;
   private short[] P0A848_A5377DisQuiLin ;
}

final  class procesospedidoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A842", "SELECT ProStsFec, ProSts, DisFasApr, UltFasLin, DisCod, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A843", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P0A844", "SELECT EmprCod, DisCod, ProCod, FasPreObl, DisNumPas, DisVelPro, DisPrePie, DisPreSal, DisFasObs, Dta_UOrd, DisfasRb, DisFasUpL, Disfastpp, DisFasAut, DisFasRec, DisFasDto, DisFasUni, DisFasPre, DisQuiUl, DisMaqPru, FasApr, FasCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A845", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P0A846", "SELECT DisParTxt, EmprCod, DisCod, ProCod, DisFasLin, DisParPLC, DisParVMx, DisParVMn, DisParVl2, DisParOrd, DisParObs, DisParVal, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A847", "INSERT INTO TXPDISPAR(EmprCod, DisCod, ProCod, DisFasLin, ParFasCod, DisParVal, DisParObs, DisParTxt, DisParOrd, DisParVl2, DisParVMn, DisParVMx, DisParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new ForEachCursor("P0A848", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiDsc, DisQuiRb, DisQuiTp, DisQuiNp, ProForCod, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0A849", "INSERT INTO TXPDISQUI(EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, ProForCod, DisQuiNp, DisQuiTp, DisQuiRb, DisQuiDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9);
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((String[]) buf[33])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               ((short[]) buf[37])[0] = rslt.getShort(23);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 60);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               stmt.setVarchar(18, (String)parms[27], 3000, false);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[37]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setLongVarchar(8, (String)parms[7], false);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 12);
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               stmt.setVarchar(13, (String)parms[12], 100, false);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               return;
      }
   }

}

