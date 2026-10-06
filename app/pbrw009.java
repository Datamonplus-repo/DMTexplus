package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbrw009 extends GXProcedure
{
   public pbrw009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbrw009.class ), "" );
   }

   public pbrw009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      pbrw009.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pbrw009.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbrw009.this.AV37Feci = aP1[0];
      this.aP1 = aP1;
      pbrw009.this.AV38Fecf = aP2[0];
      this.aP2 = aP2;
      pbrw009.this.AV41Prdnumi = aP3[0];
      this.aP3 = aP3;
      pbrw009.this.AV42Prdnumf = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31PrvAny = (short)(GXutil.year( AV37Feci)) ;
      /* Using cursor P05G42 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV41Prdnumi, Short.valueOf(AV31PrvAny), AV42Prdnumf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A681PrdAny = P05G42_A681PrdAny[0] ;
         A719PrdNum = P05G42_A719PrdNum[0] ;
         /* Optimized UPDATE. */
         /* Using cursor P05G43 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
         /* End optimized UPDATE. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05G44 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV31PrvAny)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A779PrvAny = P05G44_A779PrvAny[0] ;
         A795PrvNum = P05G44_A795PrvNum[0] ;
         n784PrvDevMes = false ;
         n791PrvEstCm1 = false ;
         n790PrvEstCm0 = false ;
         /* Optimized UPDATE. */
         /* Using cursor P05G45 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
         /* End optimized UPDATE. */
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P05G46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(AV31PrvAny), AV41Prdnumi, AV42Prdnumf});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A6146PrvPAny = P05G46_A6146PrvPAny[0] ;
         A6147PrvPPr = P05G46_A6147PrvPPr[0] ;
         A795PrvNum = P05G46_A795PrvNum[0] ;
         /* Optimized DELETE. */
         /* Using cursor P05G47 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
         /* End optimized DELETE. */
         /* Using cursor P05G48 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVESX");
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P05G49 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV41Prdnumi, Short.valueOf(AV31PrvAny), AV42Prdnumf});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A8360PrdProv = P05G49_A8360PrdProv[0] ;
         A8366PrdAnyo = P05G49_A8366PrdAnyo[0] ;
         A719PrdNum = P05G49_A719PrdNum[0] ;
         /* Optimized DELETE. */
         /* Using cursor P05G410 */
         pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
         /* End optimized DELETE. */
         /* Using cursor P05G411 */
         pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSEST");
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Application.commitDataStores(context, remoteHandle, pr_default, "pbrw009");
      /* Using cursor P05G412 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV37Feci, AV41Prdnumi, AV42Prdnumf, AV38Fecf});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A418EntUniEnt = P05G412_A418EntUniEnt[0] ;
         A719PrdNum = P05G412_A719PrdNum[0] ;
         A11Albaran = P05G412_A11Albaran[0] ;
         A415EntFecEnt = P05G412_A415EntFecEnt[0] ;
         A417EntPre = P05G412_A417EntPre[0] ;
         A795PrvNum = P05G412_A795PrvNum[0] ;
         A718PrdNom = P05G412_A718PrdNom[0] ;
         A658PedCod = P05G412_A658PedCod[0] ;
         n658PedCod = P05G412_n658PedCod[0] ;
         A666PedPri = P05G412_A666PedPri[0] ;
         A597LinEnt = P05G412_A597LinEnt[0] ;
         A6156EntPrvNum = P05G412_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P05G412_n6156EntPrvNum[0] ;
         A795PrvNum = P05G412_A795PrvNum[0] ;
         A718PrdNom = P05G412_A718PrdNom[0] ;
         A666PedPri = P05G412_A666PedPri[0] ;
         W396EmprCod = A396EmprCod ;
         AV33EmprCod = A396EmprCod ;
         AV31PrvAny = (short)(GXutil.year( A415EntFecEnt)) ;
         AV32PrvNumLin = (byte)(GXutil.month( A415EntFecEnt)) ;
         AV29ValCom = GXutil.roundDecimal( A418EntUniEnt.multiply(A417EntPre), 2) ;
         AV39EntPrvNum = A795PrvNum ;
         AV40PrdNom = A718PrdNom ;
         AV34PedPri = "1" ;
         if ( ! (0==A658PedCod) )
         {
            AV34PedPri = A666PedPri ;
         }
         AV30PrvNum = A795PrvNum ;
         Gx_msg = httpContext.getMessage( "Proveedor= ", "") + GXutil.str( AV30PrvNum, 6, 0) ;
         if ( A795PrvNum != 0 )
         {
            System.out.println( Gx_msg );
            /* Execute user subroutine: 'ESTA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(10);
               pr_default.close(10);
               pr_default.close(10);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /*
               INSERT RECORD ON TABLE TXPCPRDES

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A681PrdAny = AV31PrvAny ;
            A331DifValConA = DecimalUtil.doubleToDec(0) ;
            n331DifValConA = false ;
            /* Using cursor P05G413 */
            pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
            if ( (pr_default.getStatus(11) == 1) )
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
            A719PrdNum = W719PrdNum ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPLPRDES

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A681PrdAny = AV31PrvAny ;
            A720PrdNumMes = AV32PrvNumLin ;
            A745PrdUniCprM = A418EntUniEnt ;
            A749PrdValCprM = AV29ValCom ;
            /* Using cursor P05G414 */
            pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A745PrdUniCprM, A749PrdValCprM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
            if ( (pr_default.getStatus(12) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P05G415 */
               pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
               while ( (pr_default.getStatus(13) != 101) )
               {
                  A396EmprCod = P05G415_A396EmprCod[0] ;
                  A719PrdNum = P05G415_A719PrdNum[0] ;
                  A681PrdAny = P05G415_A681PrdAny[0] ;
                  A720PrdNumMes = P05G415_A720PrdNumMes[0] ;
                  A745PrdUniCprM = P05G415_A745PrdUniCprM[0] ;
                  A749PrdValCprM = P05G415_A749PrdValCprM[0] ;
                  A745PrdUniCprM = A745PrdUniCprM.add(A418EntUniEnt) ;
                  A749PrdValCprM = A749PrdValCprM.add(AV29ValCom) ;
                  /* Using cursor P05G416 */
                  pr_default.execute(14, new Object[] {A745PrdUniCprM, A749PrdValCprM, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(13);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPINSEST

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A8366PrdAnyo = AV31PrvAny ;
            A8360PrdProv = AV30PrvNum ;
            /* Using cursor P05G417 */
            pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSEST");
            if ( (pr_default.getStatus(15) == 1) )
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
            A719PrdNum = W719PrdNum ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPINSES1

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A8366PrdAnyo = AV31PrvAny ;
            A8360PrdProv = AV30PrvNum ;
            A8363PrdMesL = AV32PrvNumLin ;
            A8364PrdUndCpM = A418EntUniEnt ;
            A8365PrdUndCnM = AV29ValCom ;
            /* Using cursor P05G418 */
            pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL), A8364PrdUndCpM, A8365PrdUndCnM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
            if ( (pr_default.getStatus(16) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P05G419 */
               pr_default.execute(17, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
               while ( (pr_default.getStatus(17) != 101) )
               {
                  A396EmprCod = P05G419_A396EmprCod[0] ;
                  A719PrdNum = P05G419_A719PrdNum[0] ;
                  A8366PrdAnyo = P05G419_A8366PrdAnyo[0] ;
                  A8360PrdProv = P05G419_A8360PrdProv[0] ;
                  A8363PrdMesL = P05G419_A8363PrdMesL[0] ;
                  A8364PrdUndCpM = P05G419_A8364PrdUndCpM[0] ;
                  A8365PrdUndCnM = P05G419_A8365PrdUndCnM[0] ;
                  A8364PrdUndCpM = A8364PrdUndCpM.add(A418EntUniEnt) ;
                  A8365PrdUndCnM = A8365PrdUndCnM.add(AV29ValCom) ;
                  /* Using cursor P05G420 */
                  pr_default.execute(18, new Object[] {A8364PrdUndCpM, A8365PrdUndCnM, A396EmprCod, A719PrdNum, Short.valueOf(A8366PrdAnyo), Integer.valueOf(A8360PrdProv), Byte.valueOf(A8363PrdMesL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINSES1");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(17);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPPRVESX

            */
            W396EmprCod = A396EmprCod ;
            W795PrvNum = A795PrvNum ;
            A795PrvNum = AV30PrvNum ;
            A6146PrvPAny = AV31PrvAny ;
            A6147PrvPPr = A719PrdNum ;
            A6148PrvPNom = AV40PrdNom ;
            n6148PrvPNom = false ;
            /* Using cursor P05G421 */
            pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Boolean.valueOf(n6148PrvPNom), A6148PrvPNom});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVESX");
            if ( (pr_default.getStatus(19) == 1) )
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
            A795PrvNum = W795PrvNum ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPPRVES1

            */
            W396EmprCod = A396EmprCod ;
            W795PrvNum = A795PrvNum ;
            A795PrvNum = AV30PrvNum ;
            A6146PrvPAny = AV31PrvAny ;
            A6147PrvPPr = A719PrdNum ;
            A6152PrvPNumL = AV32PrvNumLin ;
            if ( GXutil.strcmp(AV34PedPri, "0") == 0 )
            {
               A6153PrvPEstCp0 = AV29ValCom ;
               n6153PrvPEstCp0 = false ;
            }
            else
            {
               A6154PrvPEstCp1 = AV29ValCom ;
               n6154PrvPEstCp1 = false ;
            }
            /* Using cursor P05G422 */
            pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL), Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
            if ( (pr_default.getStatus(20) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P05G423 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
               while ( (pr_default.getStatus(21) != 101) )
               {
                  A396EmprCod = P05G423_A396EmprCod[0] ;
                  A795PrvNum = P05G423_A795PrvNum[0] ;
                  A6146PrvPAny = P05G423_A6146PrvPAny[0] ;
                  A6147PrvPPr = P05G423_A6147PrvPPr[0] ;
                  A6152PrvPNumL = P05G423_A6152PrvPNumL[0] ;
                  A6153PrvPEstCp0 = P05G423_A6153PrvPEstCp0[0] ;
                  n6153PrvPEstCp0 = P05G423_n6153PrvPEstCp0[0] ;
                  A6154PrvPEstCp1 = P05G423_A6154PrvPEstCp1[0] ;
                  n6154PrvPEstCp1 = P05G423_n6154PrvPEstCp1[0] ;
                  if ( GXutil.strcmp(AV34PedPri, "0") == 0 )
                  {
                     A6153PrvPEstCp0 = A6153PrvPEstCp0.add(AV29ValCom) ;
                     n6153PrvPEstCp0 = false ;
                  }
                  else
                  {
                     A6154PrvPEstCp1 = A6154PrvPEstCp1.add(AV29ValCom) ;
                     n6154PrvPEstCp1 = false ;
                  }
                  /* Using cursor P05G424 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n6153PrvPEstCp0), A6153PrvPEstCp0, Boolean.valueOf(n6154PrvPEstCp1), A6154PrvPEstCp1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A6146PrvPAny), A6147PrvPPr, Byte.valueOf(A6152PrvPNumL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRVES1");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(21);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A795PrvNum = W795PrvNum ;
            /* End Insert */
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Proveedor= ", "") + GXutil.str( AV30PrvNum, 6, 0) + " / " + GXutil.str( A6156EntPrvNum, 6, 0) + " / " + GXutil.str( A597LinEnt, 4, 0) ;
            System.out.println( Gx_msg );
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso ...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'ESTA' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPCPRVES

      */
      A396EmprCod = AV33EmprCod ;
      A795PrvNum = AV30PrvNum ;
      A779PrvAny = AV31PrvAny ;
      A330DifEstCa1 = DecimalUtil.doubleToDec(0) ;
      n330DifEstCa1 = false ;
      /* Using cursor P05G425 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Boolean.valueOf(n330DifEstCa1), A330DifEstCa1});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
      if ( (pr_default.getStatus(23) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPLPRVES

      */
      A396EmprCod = AV33EmprCod ;
      A795PrvNum = AV30PrvNum ;
      A779PrvAny = AV31PrvAny ;
      A796PrvNumLin = AV32PrvNumLin ;
      if ( GXutil.strcmp(AV34PedPri, "0") == 0 )
      {
         A790PrvEstCm0 = AV29ValCom ;
         n790PrvEstCm0 = false ;
      }
      else
      {
         A791PrvEstCm1 = AV29ValCom ;
         n791PrvEstCm1 = false ;
      }
      /* Using cursor P05G426 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin), Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
      if ( (pr_default.getStatus(24) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P05G427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
         while ( (pr_default.getStatus(25) != 101) )
         {
            A396EmprCod = P05G427_A396EmprCod[0] ;
            A795PrvNum = P05G427_A795PrvNum[0] ;
            A779PrvAny = P05G427_A779PrvAny[0] ;
            A796PrvNumLin = P05G427_A796PrvNumLin[0] ;
            A790PrvEstCm0 = P05G427_A790PrvEstCm0[0] ;
            n790PrvEstCm0 = P05G427_n790PrvEstCm0[0] ;
            A791PrvEstCm1 = P05G427_A791PrvEstCm1[0] ;
            n791PrvEstCm1 = P05G427_n791PrvEstCm1[0] ;
            if ( GXutil.strcmp(AV34PedPri, "0") == 0 )
            {
               A790PrvEstCm0 = A790PrvEstCm0.add(AV29ValCom) ;
               n790PrvEstCm0 = false ;
            }
            else
            {
               A791PrvEstCm1 = A791PrvEstCm1.add(AV29ValCom) ;
               n791PrvEstCm1 = false ;
            }
            /* Using cursor P05G428 */
            pr_default.execute(26, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(25);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbrw009.this.A396EmprCod;
      this.aP1[0] = pbrw009.this.AV37Feci;
      this.aP2[0] = pbrw009.this.AV38Fecf;
      this.aP3[0] = pbrw009.this.AV41Prdnumi;
      this.aP4[0] = pbrw009.this.AV42Prdnumf;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbrw009");
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
      P05G42_A396EmprCod = new String[] {""} ;
      P05G42_A681PrdAny = new short[1] ;
      P05G42_A719PrdNum = new String[] {""} ;
      A719PrdNum = "" ;
      P05G44_A396EmprCod = new String[] {""} ;
      P05G44_A779PrvAny = new short[1] ;
      P05G44_A795PrvNum = new int[1] ;
      P05G46_A396EmprCod = new String[] {""} ;
      P05G46_A6146PrvPAny = new short[1] ;
      P05G46_A6147PrvPPr = new String[] {""} ;
      P05G46_A795PrvNum = new int[1] ;
      A6147PrvPPr = "" ;
      P05G49_A396EmprCod = new String[] {""} ;
      P05G49_A8360PrdProv = new int[1] ;
      P05G49_A8366PrdAnyo = new short[1] ;
      P05G49_A719PrdNum = new String[] {""} ;
      P05G412_A396EmprCod = new String[] {""} ;
      P05G412_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G412_A719PrdNum = new String[] {""} ;
      P05G412_A11Albaran = new String[] {""} ;
      P05G412_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05G412_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G412_A795PrvNum = new int[1] ;
      P05G412_A718PrdNom = new String[] {""} ;
      P05G412_A658PedCod = new int[1] ;
      P05G412_n658PedCod = new boolean[] {false} ;
      P05G412_A666PedPri = new String[] {""} ;
      P05G412_A597LinEnt = new short[1] ;
      P05G412_A6156EntPrvNum = new int[1] ;
      P05G412_n6156EntPrvNum = new boolean[] {false} ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A417EntPre = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A666PedPri = "" ;
      W396EmprCod = "" ;
      AV33EmprCod = "" ;
      AV29ValCom = DecimalUtil.ZERO ;
      AV40PrdNom = "" ;
      AV34PedPri = "" ;
      Gx_msg = "" ;
      W719PrdNum = "" ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A745PrdUniCprM = DecimalUtil.ZERO ;
      A749PrdValCprM = DecimalUtil.ZERO ;
      P05G415_A396EmprCod = new String[] {""} ;
      P05G415_A719PrdNum = new String[] {""} ;
      P05G415_A681PrdAny = new short[1] ;
      P05G415_A720PrdNumMes = new byte[1] ;
      P05G415_A745PrdUniCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G415_A749PrdValCprM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8364PrdUndCpM = DecimalUtil.ZERO ;
      A8365PrdUndCnM = DecimalUtil.ZERO ;
      P05G419_A396EmprCod = new String[] {""} ;
      P05G419_A719PrdNum = new String[] {""} ;
      P05G419_A8366PrdAnyo = new short[1] ;
      P05G419_A8360PrdProv = new int[1] ;
      P05G419_A8363PrdMesL = new byte[1] ;
      P05G419_A8364PrdUndCpM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G419_A8365PrdUndCnM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A6148PrvPNom = "" ;
      A6153PrvPEstCp0 = DecimalUtil.ZERO ;
      A6154PrvPEstCp1 = DecimalUtil.ZERO ;
      P05G423_A396EmprCod = new String[] {""} ;
      P05G423_A795PrvNum = new int[1] ;
      P05G423_A6146PrvPAny = new short[1] ;
      P05G423_A6147PrvPPr = new String[] {""} ;
      P05G423_A6152PrvPNumL = new byte[1] ;
      P05G423_A6153PrvPEstCp0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G423_n6153PrvPEstCp0 = new boolean[] {false} ;
      P05G423_A6154PrvPEstCp1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G423_n6154PrvPEstCp1 = new boolean[] {false} ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      P05G427_A396EmprCod = new String[] {""} ;
      P05G427_A795PrvNum = new int[1] ;
      P05G427_A779PrvAny = new short[1] ;
      P05G427_A796PrvNumLin = new byte[1] ;
      P05G427_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G427_n790PrvEstCm0 = new boolean[] {false} ;
      P05G427_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05G427_n791PrvEstCm1 = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pbrw009__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pbrw009__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pbrw009__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbrw009__default(),
         new Object[] {
             new Object[] {
            P05G42_A396EmprCod, P05G42_A681PrdAny, P05G42_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P05G44_A396EmprCod, P05G44_A779PrvAny, P05G44_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            P05G46_A396EmprCod, P05G46_A6146PrvPAny, P05G46_A6147PrvPPr, P05G46_A795PrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G49_A396EmprCod, P05G49_A8360PrdProv, P05G49_A8366PrdAnyo, P05G49_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G412_A396EmprCod, P05G412_A418EntUniEnt, P05G412_A719PrdNum, P05G412_A11Albaran, P05G412_A415EntFecEnt, P05G412_A417EntPre, P05G412_A795PrvNum, P05G412_A718PrdNom, P05G412_A658PedCod, P05G412_n658PedCod,
            P05G412_A666PedPri, P05G412_A597LinEnt, P05G412_A6156EntPrvNum, P05G412_n6156EntPrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G415_A396EmprCod, P05G415_A719PrdNum, P05G415_A681PrdAny, P05G415_A720PrdNumMes, P05G415_A745PrdUniCprM, P05G415_A749PrdValCprM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G419_A396EmprCod, P05G419_A719PrdNum, P05G419_A8366PrdAnyo, P05G419_A8360PrdProv, P05G419_A8363PrdMesL, P05G419_A8364PrdUndCpM, P05G419_A8365PrdUndCnM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G423_A396EmprCod, P05G423_A795PrvNum, P05G423_A6146PrvPAny, P05G423_A6147PrvPPr, P05G423_A6152PrvPNumL, P05G423_A6153PrvPEstCp0, P05G423_n6153PrvPEstCp0, P05G423_A6154PrvPEstCp1, P05G423_n6154PrvPEstCp1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P05G427_A396EmprCod, P05G427_A795PrvNum, P05G427_A779PrvAny, P05G427_A796PrvNumLin, P05G427_A790PrvEstCm0, P05G427_n790PrvEstCm0, P05G427_A791PrvEstCm1, P05G427_n791PrvEstCm1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32PrvNumLin ;
   private byte A720PrdNumMes ;
   private byte A8363PrdMesL ;
   private byte A6152PrvPNumL ;
   private byte A796PrvNumLin ;
   private short AV31PrvAny ;
   private short A681PrdAny ;
   private short A779PrvAny ;
   private short A6146PrvPAny ;
   private short A8366PrdAnyo ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int A8360PrdProv ;
   private int A658PedCod ;
   private int A6156EntPrvNum ;
   private int AV39EntPrvNum ;
   private int AV30PrvNum ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private int GX_INS1156 ;
   private int GX_INS1157 ;
   private int GX_INS896 ;
   private int W795PrvNum ;
   private int GX_INS897 ;
   private int GX_INS92 ;
   private int GX_INS93 ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal AV29ValCom ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A745PrdUniCprM ;
   private java.math.BigDecimal A749PrdValCprM ;
   private java.math.BigDecimal A8364PrdUndCpM ;
   private java.math.BigDecimal A8365PrdUndCnM ;
   private java.math.BigDecimal A6153PrvPEstCp0 ;
   private java.math.BigDecimal A6154PrvPEstCp1 ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private String A396EmprCod ;
   private String AV41Prdnumi ;
   private String AV42Prdnumf ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A6147PrvPPr ;
   private String A11Albaran ;
   private String A718PrdNom ;
   private String A666PedPri ;
   private String W396EmprCod ;
   private String AV33EmprCod ;
   private String AV40PrdNom ;
   private String AV34PedPri ;
   private String Gx_msg ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private String A6148PrvPNom ;
   private java.util.Date AV37Feci ;
   private java.util.Date AV38Fecf ;
   private java.util.Date A415EntFecEnt ;
   private boolean n784PrvDevMes ;
   private boolean n791PrvEstCm1 ;
   private boolean n790PrvEstCm0 ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private boolean returnInSub ;
   private boolean n331DifValConA ;
   private boolean n6148PrvPNom ;
   private boolean n6153PrvPEstCp0 ;
   private boolean n6154PrvPEstCp1 ;
   private boolean n330DifEstCa1 ;
   private String[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05G42_A396EmprCod ;
   private short[] P05G42_A681PrdAny ;
   private String[] P05G42_A719PrdNum ;
   private String[] P05G44_A396EmprCod ;
   private short[] P05G44_A779PrvAny ;
   private int[] P05G44_A795PrvNum ;
   private String[] P05G46_A396EmprCod ;
   private short[] P05G46_A6146PrvPAny ;
   private String[] P05G46_A6147PrvPPr ;
   private int[] P05G46_A795PrvNum ;
   private String[] P05G49_A396EmprCod ;
   private int[] P05G49_A8360PrdProv ;
   private short[] P05G49_A8366PrdAnyo ;
   private String[] P05G49_A719PrdNum ;
   private String[] P05G412_A396EmprCod ;
   private java.math.BigDecimal[] P05G412_A418EntUniEnt ;
   private String[] P05G412_A719PrdNum ;
   private String[] P05G412_A11Albaran ;
   private java.util.Date[] P05G412_A415EntFecEnt ;
   private java.math.BigDecimal[] P05G412_A417EntPre ;
   private int[] P05G412_A795PrvNum ;
   private String[] P05G412_A718PrdNom ;
   private int[] P05G412_A658PedCod ;
   private boolean[] P05G412_n658PedCod ;
   private String[] P05G412_A666PedPri ;
   private short[] P05G412_A597LinEnt ;
   private int[] P05G412_A6156EntPrvNum ;
   private boolean[] P05G412_n6156EntPrvNum ;
   private String[] P05G415_A396EmprCod ;
   private String[] P05G415_A719PrdNum ;
   private short[] P05G415_A681PrdAny ;
   private byte[] P05G415_A720PrdNumMes ;
   private java.math.BigDecimal[] P05G415_A745PrdUniCprM ;
   private java.math.BigDecimal[] P05G415_A749PrdValCprM ;
   private String[] P05G419_A396EmprCod ;
   private String[] P05G419_A719PrdNum ;
   private short[] P05G419_A8366PrdAnyo ;
   private int[] P05G419_A8360PrdProv ;
   private byte[] P05G419_A8363PrdMesL ;
   private java.math.BigDecimal[] P05G419_A8364PrdUndCpM ;
   private java.math.BigDecimal[] P05G419_A8365PrdUndCnM ;
   private String[] P05G423_A396EmprCod ;
   private int[] P05G423_A795PrvNum ;
   private short[] P05G423_A6146PrvPAny ;
   private String[] P05G423_A6147PrvPPr ;
   private byte[] P05G423_A6152PrvPNumL ;
   private java.math.BigDecimal[] P05G423_A6153PrvPEstCp0 ;
   private boolean[] P05G423_n6153PrvPEstCp0 ;
   private java.math.BigDecimal[] P05G423_A6154PrvPEstCp1 ;
   private boolean[] P05G423_n6154PrvPEstCp1 ;
   private String[] P05G427_A396EmprCod ;
   private int[] P05G427_A795PrvNum ;
   private short[] P05G427_A779PrvAny ;
   private byte[] P05G427_A796PrvNumLin ;
   private java.math.BigDecimal[] P05G427_A790PrvEstCm0 ;
   private boolean[] P05G427_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P05G427_A791PrvEstCm1 ;
   private boolean[] P05G427_n791PrvEstCm1 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pbrw009__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbrw009__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbrw009__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pbrw009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05G42", "SELECT EmprCod, PrdAny, PrdNum FROM TXPCPRDES WHERE (EmprCod = ? and PrdNum >= ? and PrdAny = ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, PrdAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05G43", "UPDATE TXPLPRDES SET PrdValCprM=0, PrdUniCprM=0  WHERE EmprCod = ? and PrdNum = ? and PrdAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P05G44", "SELECT EmprCod, PrvAny, PrvNum FROM TXPCPRVES WHERE EmprCod = ? and PrvAny = ? ORDER BY EmprCod, PrvAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05G45", "UPDATE TXPLPRVES SET PrvDevMes=0, PrvEstCm1=0, PrvEstCm0=0  WHERE EmprCod = ? and PrvNum = ? and PrvAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P05G46", "SELECT EmprCod, PrvPAny, PrvPPr, PrvNum FROM TXPPRVESX WHERE (EmprCod = ? and PrvPAny = ? and PrvPPr >= ?) AND (PrvPPr <= ?) ORDER BY EmprCod, PrvPAny, PrvPPr ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05G47", "DELETE FROM TXPPRVES1  WHERE EmprCod = ? and PrvNum = ? and PrvPAny = ? and PrvPPr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new UpdateCursor("P05G48", "DELETE FROM TXPPRVESX  WHERE EmprCod = ? AND PrvNum = ? AND PrvPAny = ? AND PrvPPr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVESX")
         ,new ForEachCursor("P05G49", "SELECT EmprCod, PrdProv, PrdAnyo, PrdNum FROM TXPINSEST WHERE (EmprCod = ? and PrdNum >= ? and PrdAnyo = ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum, PrdAnyo ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05G410", "DELETE FROM TXPINSES1  WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new UpdateCursor("P05G411", "DELETE FROM TXPINSEST  WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSEST")
         ,new ForEachCursor("P05G412", "SELECT T1.EmprCod, T1.EntUniEnt, T1.PrdNum, T1.Albaran, T1.EntFecEnt, T1.EntPre, T2.PrvNum, T2.PrdNom, T1.PedCod, T3.PedPri, T1.LinEnt, T1.EntPrvNum FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPCPEDID T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod = T1.PedCod) WHERE (T1.EmprCod = ? and T1.EntFecEnt >= ?) AND (T1.PrdNum >= ?) AND (T1.PrdNum <= ?) AND (SUBSTR(T1.Albaran, 1, 3) <> 'REC') AND (SUBSTR(T1.Albaran, 1, 3) <> 'INV') AND (SUBSTR(T1.Albaran, 1, 2) <> 'AD') AND (T1.EntFecEnt <= ?) ORDER BY T1.EmprCod, T1.EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05G413", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P05G414", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM, PrdUniConM, PrdValConM, PrdKilTin, PrdMtrTin) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P05G415", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdUniCprM, PrdValCprM FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05G416", "UPDATE TXPLPRDES SET PrdUniCprM=?, PrdValCprM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P05G417", "INSERT INTO TXPINSEST(EmprCod, PrdNum, PrdAnyo, PrdProv) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSEST")
         ,new UpdateCursor("P05G418", "INSERT INTO TXPINSES1(EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL, PrdUndCpM, PrdUndCnM) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new ForEachCursor("P05G419", "SELECT EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL, PrdUndCpM, PrdUndCnM FROM TXPINSES1 WHERE EmprCod = ? and PrdNum = ? and PrdAnyo = ? and PrdProv = ? and PrdMesL = ? ORDER BY EmprCod, PrdNum, PrdAnyo, PrdProv, PrdMesL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05G420", "UPDATE TXPINSES1 SET PrdUndCpM=?, PrdUndCnM=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAnyo = ? AND PrdProv = ? AND PrdMesL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINSES1")
         ,new UpdateCursor("P05G421", "INSERT INTO TXPPRVESX(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNom) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVESX")
         ,new UpdateCursor("P05G422", "INSERT INTO TXPPRVES1(EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL, PrvPEstCp0, PrvPEstCp1, PrvPDvMes) VALUES(?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new ForEachCursor("P05G423", "SELECT EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL, PrvPEstCp0, PrvPEstCp1 FROM TXPPRVES1 WHERE EmprCod = ? and PrvNum = ? and PrvPAny = ? and PrvPPr = ? and PrvPNumL = ? ORDER BY EmprCod, PrvNum, PrvPAny, PrvPPr, PrvPNumL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05G424", "UPDATE TXPPRVES1 SET PrvPEstCp0=?, PrvPEstCp1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvPAny = ? AND PrvPPr = ? AND PrvPNumL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRVES1")
         ,new UpdateCursor("P05G425", "INSERT INTO TXPCPRVES(EmprCod, PrvNum, PrvAny, DifEstCa1) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new UpdateCursor("P05G426", "INSERT INTO TXPLPRVES(EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvDevMes) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P05G427", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05G428", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 18 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 26);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 22 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setString(6, (String)parms[7], 6);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 26 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

