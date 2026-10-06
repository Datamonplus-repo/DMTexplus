package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsfslv extends GXProcedure
{
   public pinsfslv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsfslv.class ), "" );
   }

   public pinsfslv( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pinsfslv.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pinsfslv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsfslv.this.AV49Barcod = aP1[0];
      this.aP1 = aP1;
      pinsfslv.this.AV50Barcodreo = aP2[0];
      this.aP2 = aP2;
      pinsfslv.this.AV51Barcodpar = aP3[0];
      this.aP3 = aP3;
      pinsfslv.this.AV52Procod = aP4[0];
      this.aP4 = aP4;
      pinsfslv.this.AV65BarOrdlin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04XV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV49Barcod), Byte.valueOf(AV50Barcodreo), AV51Barcodpar, AV52Procod, Short.valueOf(AV65BarOrdlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04XV2_A130BarCodPar[0] ;
         A132BarCodReo = P04XV2_A132BarCodReo[0] ;
         A129BarCod = P04XV2_A129BarCod[0] ;
         A194BarOrdLin = P04XV2_A194BarOrdLin[0] ;
         A758ProCod = P04XV2_A758ProCod[0] ;
         A457FasCod = P04XV2_A457FasCod[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         AV31FasCod = A457FasCod ;
         AV66FasQuiLin = (short)(0) ;
         /* Using cursor P04XV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV31FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6018ProForFab = P04XV3_A6018ProForFab[0] ;
            n6018ProForFab = P04XV3_n6018ProForFab[0] ;
            A771ProForTie = P04XV3_A771ProForTie[0] ;
            A772ProForTmx = P04XV3_A772ProForTmx[0] ;
            A4706ProForRb = P04XV3_A4706ProForRb[0] ;
            A6876ProForPhx = P04XV3_A6876ProForPhx[0] ;
            n6876ProForPhx = P04XV3_n6876ProForPhx[0] ;
            A6877ProForPhn = P04XV3_A6877ProForPhn[0] ;
            n6877ProForPhn = P04XV3_n6877ProForPhn[0] ;
            A773ProForUli = P04XV3_A773ProForUli[0] ;
            A4651FasForNPro = P04XV3_A4651FasForNPro[0] ;
            n4651FasForNPro = P04XV3_n4651FasForNPro[0] ;
            A4652FasForTPau = P04XV3_A4652FasForTPau[0] ;
            n4652FasForTPau = P04XV3_n4652FasForTPau[0] ;
            A4653FasForRb = P04XV3_A4653FasForRb[0] ;
            n4653FasForRb = P04XV3_n4653FasForRb[0] ;
            A764ProForCod = P04XV3_A764ProForCod[0] ;
            A457FasCod = P04XV3_A457FasCod[0] ;
            A4650FasForLin = P04XV3_A4650FasForLin[0] ;
            A6018ProForFab = P04XV3_A6018ProForFab[0] ;
            n6018ProForFab = P04XV3_n6018ProForFab[0] ;
            A771ProForTie = P04XV3_A771ProForTie[0] ;
            A772ProForTmx = P04XV3_A772ProForTmx[0] ;
            A4706ProForRb = P04XV3_A4706ProForRb[0] ;
            A6876ProForPhx = P04XV3_A6876ProForPhx[0] ;
            n6876ProForPhx = P04XV3_n6876ProForPhx[0] ;
            A6877ProForPhn = P04XV3_A6877ProForPhn[0] ;
            n6877ProForPhn = P04XV3_n6877ProForPhn[0] ;
            A773ProForUli = P04XV3_A773ProForUli[0] ;
            W396EmprCod = A396EmprCod ;
            AV62Proforcod = A764ProForCod ;
            AV66FasQuiLin = (short)(AV66FasQuiLin+1) ;
            /*
               INSERT RECORD ON TABLE TXPFASQUI

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            W764ProForCod = A764ProForCod ;
            A758ProCod = AV52Procod ;
            A194BarOrdLin = AV65BarOrdlin ;
            A5371FasQuiLin = AV66FasQuiLin ;
            A5373FasQuiNp = A4651FasForNPro ;
            A5374FasQuiTp = A4652FasForTPau ;
            A5375FasQuiRb = A4653FasForRb ;
            A6599FasMaqPl = " " ;
            A6600FasFecPl = GXutil.nullDate() ;
            A6601FasOrdPl = (byte)(0) ;
            A6602FasStPl = (byte)(0) ;
            A6663FasQuiAnc = (short)(0) ;
            A6664FasQuiGrm = (short)(0) ;
            A6665FasQuiObs = " " ;
            A9722FasQuiVel = DecimalUtil.doubleToDec(0) ;
            A11506FasQuiAv = " " ;
            A12125FasQuiAI = " " ;
            A12124FasQuiAs = " " ;
            /* Using cursor P04XV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A6665FasQuiObs, A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            A764ProForCod = W764ProForCod ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPDT005

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            A758ProCod = AV52Procod ;
            A194BarOrdLin = AV65BarOrdlin ;
            A7934Dtb_Ordl = AV66FasQuiLin ;
            A7935Dtb_CPQ = A764ProForCod ;
            n7935Dtb_CPQ = false ;
            A7937Dtb_ForFab = A6018ProForFab ;
            n7937Dtb_ForFab = false ;
            A7938Dtb_Fortie = A771ProForTie ;
            n7938Dtb_Fortie = false ;
            A7939Dtb_ForTmx = A772ProForTmx ;
            n7939Dtb_ForTmx = false ;
            A7940Dtb_ForRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
            n7940Dtb_ForRb = false ;
            A7941Dtb_ForPhx = A6876ProForPhx ;
            n7941Dtb_ForPhx = false ;
            A7942Dtb_ForPhn = A6877ProForPhn ;
            n7942Dtb_ForPhn = false ;
            A7943Dtb_ForUli = A773ProForUli ;
            n7943Dtb_ForUli = false ;
            /* Using cursor P04XV5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            /* End Insert */
            /* Execute user subroutine: 'DT0051' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P04XV6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV31FasCod});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9723Cod_par = P04XV6_A9723Cod_par[0] ;
            A457FasCod = P04XV6_A457FasCod[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPBarPar

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W194BarOrdLin = A194BarOrdLin ;
            A758ProCod = AV52Procod ;
            A194BarOrdLin = AV65BarOrdlin ;
            A1664ParFasCod = A9723Cod_par ;
            A3295BarParVal = " " ;
            A3296BarParObs = " " ;
            A3693BarParTxt = " " ;
            n3693BarParTxt = false ;
            A9737BarValPar = GXutil.space( (short)(8)) ;
            /* Using cursor P04XV7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A194BarOrdLin = W194BarOrdLin ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DT0051' Routine */
      returnInSub = false ;
      /* Using cursor P04XV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV62Proforcod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A767ProForLin = P04XV8_A767ProForLin[0] ;
         A770ProForPrd = P04XV8_A770ProForPrd[0] ;
         A762ProForCan = P04XV8_A762ProForCan[0] ;
         A490ForPrdUMe = P04XV8_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P04XV8_n490ForPrdUMe[0] ;
         A764ProForCod = P04XV8_A764ProForCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDT0051

         */
         W396EmprCod = A396EmprCod ;
         W490ForPrdUMe = A490ForPrdUMe ;
         n490ForPrdUMe = false ;
         A129BarCod = AV49Barcod ;
         A132BarCodReo = AV50Barcodreo ;
         A130BarCodPar = AV51Barcodpar ;
         A758ProCod = AV52Procod ;
         A194BarOrdLin = AV65BarOrdlin ;
         A7934Dtb_Ordl = AV66FasQuiLin ;
         A7944Dtb_ForLin = A767ProForLin ;
         A7945Dtb_Prdnum = A770ProForPrd ;
         n7945Dtb_Prdnum = false ;
         n490ForPrdUMe = false ;
         A7947Dtb_Forcan = A762ProForCan ;
         n7947Dtb_Forcan = false ;
         A8477Dtb_clave1 = " " ;
         n8477Dtb_clave1 = false ;
         A8478Dtb_clave2 = " " ;
         n8478Dtb_clave2 = false ;
         /* Using cursor P04XV9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin), Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
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
         A490ForPrdUMe = W490ForPrdUMe ;
         n490ForPrdUMe = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsfslv.this.A396EmprCod;
      this.aP1[0] = pinsfslv.this.AV49Barcod;
      this.aP2[0] = pinsfslv.this.AV50Barcodreo;
      this.aP3[0] = pinsfslv.this.AV51Barcodpar;
      this.aP4[0] = pinsfslv.this.AV52Procod;
      this.aP5[0] = pinsfslv.this.AV65BarOrdlin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsfslv");
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
      P04XV2_A396EmprCod = new String[] {""} ;
      P04XV2_A130BarCodPar = new String[] {""} ;
      P04XV2_A132BarCodReo = new byte[1] ;
      P04XV2_A129BarCod = new int[1] ;
      P04XV2_A194BarOrdLin = new short[1] ;
      P04XV2_A758ProCod = new String[] {""} ;
      P04XV2_A457FasCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      AV31FasCod = "" ;
      P04XV3_A396EmprCod = new String[] {""} ;
      P04XV3_A6018ProForFab = new String[] {""} ;
      P04XV3_n6018ProForFab = new boolean[] {false} ;
      P04XV3_A771ProForTie = new short[1] ;
      P04XV3_A772ProForTmx = new short[1] ;
      P04XV3_A4706ProForRb = new short[1] ;
      P04XV3_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XV3_n6876ProForPhx = new boolean[] {false} ;
      P04XV3_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XV3_n6877ProForPhn = new boolean[] {false} ;
      P04XV3_A773ProForUli = new short[1] ;
      P04XV3_A4651FasForNPro = new short[1] ;
      P04XV3_n4651FasForNPro = new boolean[] {false} ;
      P04XV3_A4652FasForTPau = new short[1] ;
      P04XV3_n4652FasForTPau = new boolean[] {false} ;
      P04XV3_A4653FasForRb = new short[1] ;
      P04XV3_n4653FasForRb = new boolean[] {false} ;
      P04XV3_A764ProForCod = new String[] {""} ;
      P04XV3_A457FasCod = new String[] {""} ;
      P04XV3_A4650FasForLin = new short[1] ;
      A6018ProForFab = "" ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      AV62Proforcod = "" ;
      W764ProForCod = "" ;
      A6599FasMaqPl = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6665FasQuiObs = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A11506FasQuiAv = "" ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      Gx_emsg = "" ;
      A7935Dtb_CPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      P04XV6_A396EmprCod = new String[] {""} ;
      P04XV6_A9723Cod_par = new short[1] ;
      P04XV6_A457FasCod = new String[] {""} ;
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A3693BarParTxt = "" ;
      A9737BarValPar = "" ;
      P04XV8_A396EmprCod = new String[] {""} ;
      P04XV8_A767ProForLin = new short[1] ;
      P04XV8_A770ProForPrd = new String[] {""} ;
      P04XV8_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XV8_A490ForPrdUMe = new byte[1] ;
      P04XV8_n490ForPrdUMe = new boolean[] {false} ;
      P04XV8_A764ProForCod = new String[] {""} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A7945Dtb_Prdnum = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8477Dtb_clave1 = "" ;
      A8478Dtb_clave2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsfslv__default(),
         new Object[] {
             new Object[] {
            P04XV2_A396EmprCod, P04XV2_A130BarCodPar, P04XV2_A132BarCodReo, P04XV2_A129BarCod, P04XV2_A194BarOrdLin, P04XV2_A758ProCod, P04XV2_A457FasCod
            }
            , new Object[] {
            P04XV3_A396EmprCod, P04XV3_A6018ProForFab, P04XV3_n6018ProForFab, P04XV3_A771ProForTie, P04XV3_A772ProForTmx, P04XV3_A4706ProForRb, P04XV3_A6876ProForPhx, P04XV3_n6876ProForPhx, P04XV3_A6877ProForPhn, P04XV3_n6877ProForPhn,
            P04XV3_A773ProForUli, P04XV3_A4651FasForNPro, P04XV3_n4651FasForNPro, P04XV3_A4652FasForTPau, P04XV3_n4652FasForTPau, P04XV3_A4653FasForRb, P04XV3_n4653FasForRb, P04XV3_A764ProForCod, P04XV3_A457FasCod, P04XV3_A4650FasForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04XV6_A396EmprCod, P04XV6_A9723Cod_par, P04XV6_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04XV8_A396EmprCod, P04XV8_A767ProForLin, P04XV8_A770ProForPrd, P04XV8_A762ProForCan, P04XV8_A490ForPrdUMe, P04XV8_A764ProForCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50Barcodreo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A6601FasOrdPl ;
   private byte A6602FasStPl ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV65BarOrdlin ;
   private short A194BarOrdLin ;
   private short W194BarOrdLin ;
   private short AV66FasQuiLin ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A773ProForUli ;
   private short A4651FasForNPro ;
   private short A4652FasForTPau ;
   private short A4653FasForRb ;
   private short A4650FasForLin ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short A6663FasQuiAnc ;
   private short A6664FasQuiGrm ;
   private short Gx_err ;
   private short A7934Dtb_Ordl ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A7943Dtb_ForUli ;
   private short A9723Cod_par ;
   private short A1664ParFasCod ;
   private short A767ProForLin ;
   private short A7944Dtb_ForLin ;
   private int AV49Barcod ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS779 ;
   private int GX_INS1108 ;
   private int GX_INS475 ;
   private int GX_INS1109 ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private String A396EmprCod ;
   private String AV51Barcodpar ;
   private String AV52Procod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String AV31FasCod ;
   private String A6018ProForFab ;
   private String A764ProForCod ;
   private String AV62Proforcod ;
   private String W764ProForCod ;
   private String A6599FasMaqPl ;
   private String A11506FasQuiAv ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private String Gx_emsg ;
   private String A7935Dtb_CPQ ;
   private String A7937Dtb_ForFab ;
   private String A3295BarParVal ;
   private String A3296BarParObs ;
   private String A9737BarValPar ;
   private String A770ProForPrd ;
   private String A7945Dtb_Prdnum ;
   private String A8477Dtb_clave1 ;
   private String A8478Dtb_clave2 ;
   private java.util.Date A6600FasFecPl ;
   private boolean n6018ProForFab ;
   private boolean n6876ProForPhx ;
   private boolean n6877ProForPhn ;
   private boolean n4651FasForNPro ;
   private boolean n4652FasForTPau ;
   private boolean n4653FasForRb ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n7943Dtb_ForUli ;
   private boolean returnInSub ;
   private boolean n3693BarParTxt ;
   private boolean n490ForPrdUMe ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8477Dtb_clave1 ;
   private boolean n8478Dtb_clave2 ;
   private String A6665FasQuiObs ;
   private String A3693BarParTxt ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XV2_A396EmprCod ;
   private String[] P04XV2_A130BarCodPar ;
   private byte[] P04XV2_A132BarCodReo ;
   private int[] P04XV2_A129BarCod ;
   private short[] P04XV2_A194BarOrdLin ;
   private String[] P04XV2_A758ProCod ;
   private String[] P04XV2_A457FasCod ;
   private String[] P04XV3_A396EmprCod ;
   private String[] P04XV3_A6018ProForFab ;
   private boolean[] P04XV3_n6018ProForFab ;
   private short[] P04XV3_A771ProForTie ;
   private short[] P04XV3_A772ProForTmx ;
   private short[] P04XV3_A4706ProForRb ;
   private java.math.BigDecimal[] P04XV3_A6876ProForPhx ;
   private boolean[] P04XV3_n6876ProForPhx ;
   private java.math.BigDecimal[] P04XV3_A6877ProForPhn ;
   private boolean[] P04XV3_n6877ProForPhn ;
   private short[] P04XV3_A773ProForUli ;
   private short[] P04XV3_A4651FasForNPro ;
   private boolean[] P04XV3_n4651FasForNPro ;
   private short[] P04XV3_A4652FasForTPau ;
   private boolean[] P04XV3_n4652FasForTPau ;
   private short[] P04XV3_A4653FasForRb ;
   private boolean[] P04XV3_n4653FasForRb ;
   private String[] P04XV3_A764ProForCod ;
   private String[] P04XV3_A457FasCod ;
   private short[] P04XV3_A4650FasForLin ;
   private String[] P04XV6_A396EmprCod ;
   private short[] P04XV6_A9723Cod_par ;
   private String[] P04XV6_A457FasCod ;
   private String[] P04XV8_A396EmprCod ;
   private short[] P04XV8_A767ProForLin ;
   private String[] P04XV8_A770ProForPrd ;
   private java.math.BigDecimal[] P04XV8_A762ProForCan ;
   private byte[] P04XV8_A490ForPrdUMe ;
   private boolean[] P04XV8_n490ForPrdUMe ;
   private String[] P04XV8_A764ProForCod ;
}

final  class pinsfslv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XV2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04XV3", "SELECT T1.EmprCod, T2.ProForFab, T2.ProForTie, T2.ProForTmx, T2.ProForRb, T2.ProForPhx, T2.ProForPhn, T2.ProForUli, T1.FasForNPro, T1.FasForTPau, T1.FasForRb, T1.ProForCod, T1.FasCod, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XV4", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P04XV5", "INSERT INTO TXPDT005(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new ForEachCursor("P04XV6", "SELECT EmprCod, Cod_par, FasCod FROM TXPPARFSS WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, Cod_par ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XV7", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P04XV8", "SELECT EmprCod, ProForLin, ProForPrd, ProForCan, ForPrdUMe, ProForCod FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XV9", "INSERT INTO TXPDT0051(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, ForPrdUMe, Dtb_Forcan, Dtb_clave1, Dtb_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 6);
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((short[]) buf[19])[0] = rslt.getShort(14);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 400, false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 1);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 2);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[22]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 30);
               }
               return;
      }
   }

}

