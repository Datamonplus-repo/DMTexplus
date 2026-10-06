package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart1 extends GXProcedure
{
   public ppedart1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart1.class ), "" );
   }

   public ppedart1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           String[] aP9 ,
                           int[] aP10 ,
                           String[] aP11 ,
                           String[] aP12 ,
                           java.math.BigDecimal[] aP13 ,
                           java.math.BigDecimal[] aP14 ,
                           String[] aP15 )
   {
      ppedart1.this.aP16 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        String[] aP15 ,
                        byte[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             String[] aP15 ,
                             byte[] aP16 )
   {
      ppedart1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart1.this.A8197PArId = aP1[0];
      this.aP1 = aP1;
      ppedart1.this.AV21PArCruCol = aP2[0];
      this.aP2 = aP2;
      ppedart1.this.AV22PArCruColN = aP3[0];
      this.aP3 = aP3;
      ppedart1.this.AV35TipColCod = aP4[0];
      this.aP4 = aP4;
      ppedart1.this.AV23PArCruDib = aP5[0];
      this.aP5 = aP5;
      ppedart1.this.AV24PArCruPin = aP6[0];
      this.aP6 = aP6;
      ppedart1.this.AV25PArCruMtr = aP7[0];
      this.aP7 = aP7;
      ppedart1.this.AV26ParCruKgs = aP8[0];
      this.aP8 = aP8;
      ppedart1.this.AV27oPArCruCol = aP9[0];
      this.aP9 = aP9;
      ppedart1.this.AV28oPArCruCoN = aP10[0];
      this.aP10 = aP10;
      ppedart1.this.AV29oPArCruDib = aP11[0];
      this.aP11 = aP11;
      ppedart1.this.AV30oPArCruPin = aP12[0];
      this.aP12 = aP12;
      ppedart1.this.AV31oPArCruMtr = aP13[0];
      this.aP13 = aP13;
      ppedart1.this.AV32oParCruKgs = aP14[0];
      this.aP14 = aP14;
      ppedart1.this.Gx_mode = aP15[0];
      this.aP15 = aP15;
      ppedart1.this.AV34DesCol = aP16[0];
      this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P037E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8205PArCliCod = P037E2_A8205PArCliCod[0] ;
         n8205PArCliCod = P037E2_n8205PArCliCod[0] ;
         A8208PArArtTCod = P037E2_A8208PArArtTCod[0] ;
         n8208PArArtTCod = P037E2_n8208PArArtTCod[0] ;
         A8210PArArtECod = P037E2_A8210PArArtECod[0] ;
         n8210PArArtECod = P037E2_n8210PArArtECod[0] ;
         A8213PArArtAnc = P037E2_A8213PArArtAnc[0] ;
         n8213PArArtAnc = P037E2_n8213PArArtAnc[0] ;
         AV39PArCliCod = A8205PArCliCod ;
         AV43PArArtTCod = A8208PArArtTCod ;
         AV44PArArtECod = A8210PArArtECod ;
         AV40PArArtAnc = A8213PArArtAnc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) || ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 ) )
      {
         n8249PArColKgm = false ;
         n8248PArColMtr = false ;
         n8244PArColPie = false ;
         /* Optimized UPDATE. */
         /* Using cursor P037E3 */
         pr_default.execute(1, new Object[] {AV32oParCruKgs, AV31oPArCruMtr, A396EmprCod, Integer.valueOf(A8197PArId), AV27oPArCruCol, Integer.valueOf(AV28oPArCruCoN)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr2");
         /* End optimized UPDATE. */
         n8255PArEstMtr = false ;
         n8254PArEstPie = false ;
         /* Optimized UPDATE. */
         /* Using cursor P037E4 */
         pr_default.execute(2, new Object[] {AV31oPArCruMtr, A396EmprCod, Integer.valueOf(A8197PArId), AV29oPArCruDib, AV30oPArCruPin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr3");
         /* End optimized UPDATE. */
      }
      /* Using cursor P037E5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8249PArColKgm = P037E5_A8249PArColKgm[0] ;
         n8249PArColKgm = P037E5_n8249PArColKgm[0] ;
         A8248PArColMtr = P037E5_A8248PArColMtr[0] ;
         n8248PArColMtr = P037E5_n8248PArColMtr[0] ;
         A8242PArColNom = P037E5_A8242PArColNom[0] ;
         A8243PArColNum = P037E5_A8243PArColNum[0] ;
         if ( ( A8248PArColMtr.doubleValue() <= 0 ) && ( A8249PArColKgm.doubleValue() <= 0 ) )
         {
            /* Using cursor P037E6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8242PArColNom, Integer.valueOf(A8243PArColNum)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr2");
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P037E7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A8255PArEstMtr = P037E7_A8255PArEstMtr[0] ;
         n8255PArEstMtr = P037E7_n8255PArEstMtr[0] ;
         A8250PArEstDib = P037E7_A8250PArEstDib[0] ;
         A8251PArEstPin = P037E7_A8251PArEstPin[0] ;
         if ( A8255PArEstMtr.doubleValue() <= 0 )
         {
            /* Using cursor P037E8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8250PArEstDib, A8251PArEstPin});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr3");
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P037E9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A8291PArAcaImpK = P037E9_A8291PArAcaImpK[0] ;
         n8291PArAcaImpK = P037E9_n8291PArAcaImpK[0] ;
         A8285PArAcaFasC = P037E9_A8285PArAcaFasC[0] ;
         if ( A8291PArAcaImpK <= 0 )
         {
            /* Using cursor P037E10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8285PArAcaFasC});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr4");
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /* Using cursor P037E11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A8297PArPTeImp = P037E11_A8297PArPTeImp[0] ;
         n8297PArPTeImp = P037E11_n8297PArPTeImp[0] ;
         A8293PArPTeInt = P037E11_A8293PArPTeInt[0] ;
         if ( A8297PArPTeImp <= 0 )
         {
            /* Using cursor P037E12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Byte.valueOf(A8293PArPTeInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr5");
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Using cursor P037E13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A8300PArPEsImp = P037E13_A8300PArPEsImp[0] ;
         n8300PArPEsImp = P037E13_n8300PArPEsImp[0] ;
         A8298PArPEsDib = P037E13_A8298PArPEsDib[0] ;
         A8299PArPEsPin = P037E13_A8299PArPEsPin[0] ;
         if ( A8300PArPEsImp <= 0 )
         {
            /* Using cursor P037E14 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8298PArPEsDib, A8299PArPEsPin});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr6");
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) || ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) )
      {
         if ( ( GXutil.strcmp(AV21PArCruCol, "") != 0 ) && ( GXutil.strcmp(AV21PArCruCol, httpContext.getMessage( "FONDO CLIENT", "")) != 0 ) )
         {
            AV57GXLvl60 = (byte)(0) ;
            n8249PArColKgm = false ;
            n8248PArColMtr = false ;
            n8244PArColPie = false ;
            /* Optimized UPDATE. */
            /* Using cursor P037E15 */
            pr_default.execute(13, new Object[] {AV26ParCruKgs, AV25PArCruMtr, A396EmprCod, Integer.valueOf(A8197PArId), AV21PArCruCol, Integer.valueOf(AV22PArCruColN)});
            if ( (pr_default.getStatus(13) != 101) )
            {
               AV57GXLvl60 = (byte)(1) ;
            }
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr2");
            /* End optimized UPDATE. */
            if ( AV57GXLvl60 == 0 )
            {
               AV58GXLvl67 = (byte)(0) ;
               /* Using cursor P037E16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV39PArCliCod), AV43PArArtTCod, AV21PArCruCol, Integer.valueOf(AV22PArCruColN)});
               while ( (pr_default.getStatus(14) != 101) )
               {
                  A483ForColNum = P037E16_A483ForColNum[0] ;
                  A482ForColNom = P037E16_A482ForColNom[0] ;
                  A494ForSer = P037E16_A494ForSer[0] ;
                  A252CliCod = P037E16_A252CliCod[0] ;
                  A583IntCod = P037E16_A583IntCod[0] ;
                  A831TipColCod = P037E16_A831TipColCod[0] ;
                  AV58GXLvl67 = (byte)(1) ;
                  AV45IntCod = A583IntCod ;
                  AV34DesCol = (byte)(0) ;
                  pr_default.readNext(14);
               }
               pr_default.close(14);
               if ( AV58GXLvl67 == 0 )
               {
                  AV45IntCod = (byte)(0) ;
                  AV34DesCol = (byte)(1) ;
               }
               /*
                  INSERT RECORD ON TABLE TXPPedAr5

               */
               A8293PArPTeInt = AV45IntCod ;
               /* Using cursor P037E17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Byte.valueOf(A8293PArPTeInt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr5");
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
               /* End Insert */
               /*
                  INSERT RECORD ON TABLE TXPPedAr2

               */
               A8242PArColNom = AV21PArCruCol ;
               A8243PArColNum = AV22PArCruColN ;
               A8244PArColPie = (short)(1) ;
               n8244PArColPie = false ;
               A8248PArColMtr = AV25PArCruMtr ;
               n8248PArColMtr = false ;
               A8249PArColKgm = AV26ParCruKgs ;
               n8249PArColKgm = false ;
               A8245PArColDes = AV34DesCol ;
               n8245PArColDes = false ;
               A8246PArColInt = AV45IntCod ;
               n8246PArColInt = false ;
               /* Using cursor P037E18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8242PArColNom, Integer.valueOf(A8243PArColNum), Boolean.valueOf(n8244PArColPie), Short.valueOf(A8244PArColPie), Boolean.valueOf(n8245PArColDes), Byte.valueOf(A8245PArColDes), Boolean.valueOf(n8246PArColInt), Byte.valueOf(A8246PArColInt), Boolean.valueOf(n8248PArColMtr), A8248PArColMtr, Boolean.valueOf(n8249PArColKgm), A8249PArColKgm});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr2");
               if ( (pr_default.getStatus(16) == 1) )
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
         }
         /* Using cursor P037E19 */
         pr_default.execute(17, new Object[] {A396EmprCod, AV23PArCruDib, Integer.valueOf(AV39PArCliCod)});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A1014DibInt = P037E19_A1014DibInt[0] ;
            A1013DibCli = P037E19_A1013DibCli[0] ;
            A252CliCod = P037E19_A252CliCod[0] ;
            A8193DibSep = P037E19_A8193DibSep[0] ;
            n8193DibSep = P037E19_n8193DibSep[0] ;
            A8192DibGra = P037E19_A8192DibGra[0] ;
            n8192DibGra = P037E19_n8192DibGra[0] ;
            AV42OkSep = (byte)(((GXutil.strcmp(A8193DibSep, httpContext.getMessage( "S", ""))==0) ? 1 : 0)) ;
            AV38OkGra = (byte)(((GXutil.strcmp(A8192DibGra, httpContext.getMessage( "S", ""))==0) ? 1 : 0)) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
         if ( AV42OkSep == 0 )
         {
            GXt_int1 = AV36OSSCod ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = AV23PArCruDib ;
            GXv_int4[0] = GXt_int1 ;
            new app.ppedart4(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
            ppedart1.this.A396EmprCod = GXv_char2[0] ;
            ppedart1.this.AV23PArCruDib = GXv_char3[0] ;
            ppedart1.this.GXt_int1 = GXv_int4[0] ;
            AV36OSSCod = GXt_int1 ;
         }
         if ( AV38OkGra == 0 )
         {
            GXt_int1 = AV37OGSCod ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = AV23PArCruDib ;
            GXv_int5[0] = AV40PArArtAnc ;
            GXv_int4[0] = GXt_int1 ;
            new app.ppedart3(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int5, GXv_int4) ;
            ppedart1.this.A396EmprCod = GXv_char3[0] ;
            ppedart1.this.AV23PArCruDib = GXv_char2[0] ;
            ppedart1.this.AV40PArArtAnc = (short)((short)(GXv_int5[0])) ;
            ppedart1.this.GXt_int1 = GXv_int4[0] ;
            AV37OGSCod = GXt_int1 ;
         }
         AV60GXLvl107 = (byte)(0) ;
         n8255PArEstMtr = false ;
         n8254PArEstPie = false ;
         /* Optimized UPDATE. */
         /* Using cursor P037E20 */
         pr_default.execute(18, new Object[] {AV25PArCruMtr, A396EmprCod, Integer.valueOf(A8197PArId), AV23PArCruDib, AV24PArCruPin});
         if ( (pr_default.getStatus(18) != 101) )
         {
            AV60GXLvl107 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr3");
         /* End optimized UPDATE. */
         if ( AV60GXLvl107 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPPedAr3

            */
            A8250PArEstDib = AV23PArCruDib ;
            A8251PArEstPin = AV24PArCruPin ;
            A8254PArEstPie = (short)(1) ;
            n8254PArEstPie = false ;
            A8255PArEstMtr = AV25PArCruMtr ;
            n8255PArEstMtr = false ;
            if ( ( AV36OSSCod <= 0 ) && ( AV42OkSep == 0 ) )
            {
               A8252PArEstSep = (byte)(1) ;
               n8252PArEstSep = false ;
            }
            else
            {
               A8252PArEstSep = (byte)(0) ;
               n8252PArEstSep = false ;
            }
            if ( ( AV37OGSCod <= 0 ) && ( AV38OkGra == 0 ) )
            {
               A8253PArEstGra = (byte)(1) ;
               n8253PArEstGra = false ;
            }
            else
            {
               A8253PArEstGra = (byte)(0) ;
               n8253PArEstGra = false ;
            }
            /* Using cursor P037E21 */
            pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8250PArEstDib, A8251PArEstPin, Boolean.valueOf(n8252PArEstSep), Byte.valueOf(A8252PArEstSep), Boolean.valueOf(n8253PArEstGra), Byte.valueOf(A8253PArEstGra), Boolean.valueOf(n8254PArEstPie), Short.valueOf(A8254PArEstPie), Boolean.valueOf(n8255PArEstMtr), A8255PArEstMtr});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr3");
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
            /* End Insert */
         }
         /* Using cursor P037E22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV39PArCliCod), AV43PArArtTCod});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A65ArtCod = P037E22_A65ArtCod[0] ;
            A252CliCod = P037E22_A252CliCod[0] ;
            A758ProCod = P037E22_A758ProCod[0] ;
            AV33ProCod = A758ProCod ;
            /* Execute user subroutine: 'PROCESOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(20);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(20);
         }
         pr_default.close(20);
         /* Using cursor P037E23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV39PArCliCod), AV44PArArtECod});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A65ArtCod = P037E23_A65ArtCod[0] ;
            A252CliCod = P037E23_A252CliCod[0] ;
            A758ProCod = P037E23_A758ProCod[0] ;
            AV33ProCod = A758ProCod ;
            /* Execute user subroutine: 'PROCESOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(21);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(21);
         }
         pr_default.close(21);
         /* Using cursor P037E24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A8246PArColInt = P037E24_A8246PArColInt[0] ;
            n8246PArColInt = P037E24_n8246PArColInt[0] ;
            A8243PArColNum = P037E24_A8243PArColNum[0] ;
            A8242PArColNom = P037E24_A8242PArColNom[0] ;
            /*
               INSERT RECORD ON TABLE TXPPedAr5

            */
            A8293PArPTeInt = A8246PArColInt ;
            /* Using cursor P037E25 */
            pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), Byte.valueOf(A8293PArPTeInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr5");
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
            pr_default.readNext(22);
         }
         pr_default.close(22);
         /* Using cursor P037E26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId)});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A8250PArEstDib = P037E26_A8250PArEstDib[0] ;
            A8251PArEstPin = P037E26_A8251PArEstPin[0] ;
            /*
               INSERT RECORD ON TABLE TXPPedAr6

            */
            A8298PArPEsDib = A8250PArEstDib ;
            A8299PArPEsPin = A8251PArEstPin ;
            /* Using cursor P037E27 */
            pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8298PArPEsDib, A8299PArPEsPin});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr6");
            if ( (pr_default.getStatus(25) == 1) )
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
            pr_default.readNext(24);
         }
         pr_default.close(24);
         /*
            INSERT RECORD ON TABLE TXPPedAr6

         */
         A8298PArPEsDib = AV23PArCruDib ;
         A8299PArPEsPin = AV24PArCruPin ;
         /* Using cursor P037E28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8298PArPEsDib, A8299PArPEsPin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr6");
         if ( (pr_default.getStatus(26) == 1) )
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
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESOS' Routine */
      returnInSub = false ;
      /* Using cursor P037E29 */
      pr_default.execute(27, new Object[] {A396EmprCod, AV33ProCod});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A457FasCod = P037E29_A457FasCod[0] ;
         A4903FasAcab = P037E29_A4903FasAcab[0] ;
         n4903FasAcab = P037E29_n4903FasAcab[0] ;
         A758ProCod = P037E29_A758ProCod[0] ;
         A7893Dtp_Tpp = P037E29_A7893Dtp_Tpp[0] ;
         n7893Dtp_Tpp = P037E29_n7893Dtp_Tpp[0] ;
         A774ProNumLin = P037E29_A774ProNumLin[0] ;
         A4903FasAcab = P037E29_A4903FasAcab[0] ;
         n4903FasAcab = P037E29_n4903FasAcab[0] ;
         if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPPedAr4

            */
            A8285PArAcaFasC = A457FasCod ;
            /* Using cursor P037E30 */
            pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A8197PArId), A8285PArAcaFasC});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAr4");
            if ( (pr_default.getStatus(28) == 1) )
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
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart1.this.A396EmprCod;
      this.aP1[0] = ppedart1.this.A8197PArId;
      this.aP2[0] = ppedart1.this.AV21PArCruCol;
      this.aP3[0] = ppedart1.this.AV22PArCruColN;
      this.aP4[0] = ppedart1.this.AV35TipColCod;
      this.aP5[0] = ppedart1.this.AV23PArCruDib;
      this.aP6[0] = ppedart1.this.AV24PArCruPin;
      this.aP7[0] = ppedart1.this.AV25PArCruMtr;
      this.aP8[0] = ppedart1.this.AV26ParCruKgs;
      this.aP9[0] = ppedart1.this.AV27oPArCruCol;
      this.aP10[0] = ppedart1.this.AV28oPArCruCoN;
      this.aP11[0] = ppedart1.this.AV29oPArCruDib;
      this.aP12[0] = ppedart1.this.AV30oPArCruPin;
      this.aP13[0] = ppedart1.this.AV31oPArCruMtr;
      this.aP14[0] = ppedart1.this.AV32oParCruKgs;
      this.aP15[0] = ppedart1.this.Gx_mode;
      this.aP16[0] = ppedart1.this.AV34DesCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppedart1");
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
      P037E2_A396EmprCod = new String[] {""} ;
      P037E2_A8197PArId = new int[1] ;
      P037E2_A8205PArCliCod = new int[1] ;
      P037E2_n8205PArCliCod = new boolean[] {false} ;
      P037E2_A8208PArArtTCod = new String[] {""} ;
      P037E2_n8208PArArtTCod = new boolean[] {false} ;
      P037E2_A8210PArArtECod = new String[] {""} ;
      P037E2_n8210PArArtECod = new boolean[] {false} ;
      P037E2_A8213PArArtAnc = new short[1] ;
      P037E2_n8213PArArtAnc = new boolean[] {false} ;
      A8208PArArtTCod = "" ;
      A8210PArArtECod = "" ;
      AV43PArArtTCod = "" ;
      AV44PArArtECod = "" ;
      P037E5_A396EmprCod = new String[] {""} ;
      P037E5_A8197PArId = new int[1] ;
      P037E5_A8249PArColKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037E5_n8249PArColKgm = new boolean[] {false} ;
      P037E5_A8248PArColMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037E5_n8248PArColMtr = new boolean[] {false} ;
      P037E5_A8242PArColNom = new String[] {""} ;
      P037E5_A8243PArColNum = new int[1] ;
      A8249PArColKgm = DecimalUtil.ZERO ;
      A8248PArColMtr = DecimalUtil.ZERO ;
      A8242PArColNom = "" ;
      P037E7_A396EmprCod = new String[] {""} ;
      P037E7_A8197PArId = new int[1] ;
      P037E7_A8255PArEstMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037E7_n8255PArEstMtr = new boolean[] {false} ;
      P037E7_A8250PArEstDib = new String[] {""} ;
      P037E7_A8251PArEstPin = new String[] {""} ;
      A8255PArEstMtr = DecimalUtil.ZERO ;
      A8250PArEstDib = "" ;
      A8251PArEstPin = "" ;
      P037E9_A396EmprCod = new String[] {""} ;
      P037E9_A8197PArId = new int[1] ;
      P037E9_A8291PArAcaImpK = new int[1] ;
      P037E9_n8291PArAcaImpK = new boolean[] {false} ;
      P037E9_A8285PArAcaFasC = new String[] {""} ;
      A8285PArAcaFasC = "" ;
      P037E11_A396EmprCod = new String[] {""} ;
      P037E11_A8197PArId = new int[1] ;
      P037E11_A8297PArPTeImp = new int[1] ;
      P037E11_n8297PArPTeImp = new boolean[] {false} ;
      P037E11_A8293PArPTeInt = new byte[1] ;
      P037E13_A396EmprCod = new String[] {""} ;
      P037E13_A8197PArId = new int[1] ;
      P037E13_A8300PArPEsImp = new int[1] ;
      P037E13_n8300PArPEsImp = new boolean[] {false} ;
      P037E13_A8298PArPEsDib = new String[] {""} ;
      P037E13_A8299PArPEsPin = new String[] {""} ;
      A8298PArPEsDib = "" ;
      A8299PArPEsPin = "" ;
      P037E16_A396EmprCod = new String[] {""} ;
      P037E16_A483ForColNum = new int[1] ;
      P037E16_A482ForColNom = new String[] {""} ;
      P037E16_A494ForSer = new String[] {""} ;
      P037E16_A252CliCod = new int[1] ;
      P037E16_A583IntCod = new byte[1] ;
      P037E16_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gx_emsg = "" ;
      P037E19_A396EmprCod = new String[] {""} ;
      P037E19_A1014DibInt = new int[1] ;
      P037E19_A1013DibCli = new String[] {""} ;
      P037E19_A252CliCod = new int[1] ;
      P037E19_A8193DibSep = new String[] {""} ;
      P037E19_n8193DibSep = new boolean[] {false} ;
      P037E19_A8192DibGra = new String[] {""} ;
      P037E19_n8192DibGra = new boolean[] {false} ;
      A1013DibCli = "" ;
      A8193DibSep = "" ;
      A8192DibGra = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_int4 = new int[1] ;
      P037E22_A396EmprCod = new String[] {""} ;
      P037E22_A65ArtCod = new String[] {""} ;
      P037E22_A252CliCod = new int[1] ;
      P037E22_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      AV33ProCod = "" ;
      P037E23_A396EmprCod = new String[] {""} ;
      P037E23_A65ArtCod = new String[] {""} ;
      P037E23_A252CliCod = new int[1] ;
      P037E23_A758ProCod = new String[] {""} ;
      P037E24_A396EmprCod = new String[] {""} ;
      P037E24_A8197PArId = new int[1] ;
      P037E24_A8246PArColInt = new byte[1] ;
      P037E24_n8246PArColInt = new boolean[] {false} ;
      P037E24_A8243PArColNum = new int[1] ;
      P037E24_A8242PArColNom = new String[] {""} ;
      P037E26_A396EmprCod = new String[] {""} ;
      P037E26_A8197PArId = new int[1] ;
      P037E26_A8250PArEstDib = new String[] {""} ;
      P037E26_A8251PArEstPin = new String[] {""} ;
      P037E29_A396EmprCod = new String[] {""} ;
      P037E29_A457FasCod = new String[] {""} ;
      P037E29_A4903FasAcab = new String[] {""} ;
      P037E29_n4903FasAcab = new boolean[] {false} ;
      P037E29_A758ProCod = new String[] {""} ;
      P037E29_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037E29_n7893Dtp_Tpp = new boolean[] {false} ;
      P037E29_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A4903FasAcab = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart1__default(),
         new Object[] {
             new Object[] {
            P037E2_A396EmprCod, P037E2_A8197PArId, P037E2_A8205PArCliCod, P037E2_n8205PArCliCod, P037E2_A8208PArArtTCod, P037E2_n8208PArArtTCod, P037E2_A8210PArArtECod, P037E2_n8210PArArtECod, P037E2_A8213PArArtAnc, P037E2_n8213PArArtAnc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037E5_A396EmprCod, P037E5_A8197PArId, P037E5_A8249PArColKgm, P037E5_n8249PArColKgm, P037E5_A8248PArColMtr, P037E5_n8248PArColMtr, P037E5_A8242PArColNom, P037E5_A8243PArColNum
            }
            , new Object[] {
            }
            , new Object[] {
            P037E7_A396EmprCod, P037E7_A8197PArId, P037E7_A8255PArEstMtr, P037E7_n8255PArEstMtr, P037E7_A8250PArEstDib, P037E7_A8251PArEstPin
            }
            , new Object[] {
            }
            , new Object[] {
            P037E9_A396EmprCod, P037E9_A8197PArId, P037E9_A8291PArAcaImpK, P037E9_n8291PArAcaImpK, P037E9_A8285PArAcaFasC
            }
            , new Object[] {
            }
            , new Object[] {
            P037E11_A396EmprCod, P037E11_A8197PArId, P037E11_A8297PArPTeImp, P037E11_n8297PArPTeImp, P037E11_A8293PArPTeInt
            }
            , new Object[] {
            }
            , new Object[] {
            P037E13_A396EmprCod, P037E13_A8197PArId, P037E13_A8300PArPEsImp, P037E13_n8300PArPEsImp, P037E13_A8298PArPEsDib, P037E13_A8299PArPEsPin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037E16_A396EmprCod, P037E16_A483ForColNum, P037E16_A482ForColNom, P037E16_A494ForSer, P037E16_A252CliCod, P037E16_A583IntCod, P037E16_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037E19_A396EmprCod, P037E19_A1014DibInt, P037E19_A1013DibCli, P037E19_A252CliCod, P037E19_A8193DibSep, P037E19_n8193DibSep, P037E19_A8192DibGra, P037E19_n8192DibGra
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037E22_A396EmprCod, P037E22_A65ArtCod, P037E22_A252CliCod, P037E22_A758ProCod
            }
            , new Object[] {
            P037E23_A396EmprCod, P037E23_A65ArtCod, P037E23_A252CliCod, P037E23_A758ProCod
            }
            , new Object[] {
            P037E24_A396EmprCod, P037E24_A8197PArId, P037E24_A8246PArColInt, P037E24_n8246PArColInt, P037E24_A8243PArColNum, P037E24_A8242PArColNom
            }
            , new Object[] {
            }
            , new Object[] {
            P037E26_A396EmprCod, P037E26_A8197PArId, P037E26_A8250PArEstDib, P037E26_A8251PArEstPin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037E29_A396EmprCod, P037E29_A457FasCod, P037E29_A4903FasAcab, P037E29_n4903FasAcab, P037E29_A758ProCod, P037E29_A7893Dtp_Tpp, P037E29_n7893Dtp_Tpp, P037E29_A774ProNumLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35TipColCod ;
   private byte AV34DesCol ;
   private byte A8293PArPTeInt ;
   private byte AV57GXLvl60 ;
   private byte AV58GXLvl67 ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV45IntCod ;
   private byte A8245PArColDes ;
   private byte A8246PArColInt ;
   private byte AV42OkSep ;
   private byte AV38OkGra ;
   private byte AV60GXLvl107 ;
   private byte A8252PArEstSep ;
   private byte A8253PArEstGra ;
   private short A8213PArArtAnc ;
   private short AV40PArArtAnc ;
   private short Gx_err ;
   private short A8244PArColPie ;
   private short A8254PArEstPie ;
   private short A774ProNumLin ;
   private int A8197PArId ;
   private int AV22PArCruColN ;
   private int AV28oPArCruCoN ;
   private int A8205PArCliCod ;
   private int AV39PArCliCod ;
   private int A8243PArColNum ;
   private int A8291PArAcaImpK ;
   private int A8297PArPTeImp ;
   private int A8300PArPEsImp ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int GX_INS1148 ;
   private int GX_INS1145 ;
   private int A1014DibInt ;
   private int AV36OSSCod ;
   private int AV37OGSCod ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int GX_INS1146 ;
   private int GX_INS1149 ;
   private int GX_INS1147 ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV25PArCruMtr ;
   private java.math.BigDecimal AV26ParCruKgs ;
   private java.math.BigDecimal AV31oPArCruMtr ;
   private java.math.BigDecimal AV32oParCruKgs ;
   private java.math.BigDecimal A8249PArColKgm ;
   private java.math.BigDecimal A8248PArColMtr ;
   private java.math.BigDecimal A8255PArEstMtr ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private String A396EmprCod ;
   private String AV21PArCruCol ;
   private String AV23PArCruDib ;
   private String AV24PArCruPin ;
   private String AV27oPArCruCol ;
   private String AV29oPArCruDib ;
   private String AV30oPArCruPin ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A8208PArArtTCod ;
   private String A8210PArArtECod ;
   private String AV43PArArtTCod ;
   private String AV44PArArtECod ;
   private String A8242PArColNom ;
   private String A8250PArEstDib ;
   private String A8251PArEstPin ;
   private String A8285PArAcaFasC ;
   private String A8298PArPEsDib ;
   private String A8299PArPEsPin ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_emsg ;
   private String A1013DibCli ;
   private String A8193DibSep ;
   private String A8192DibGra ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV33ProCod ;
   private String A457FasCod ;
   private String A4903FasAcab ;
   private boolean n8205PArCliCod ;
   private boolean n8208PArArtTCod ;
   private boolean n8210PArArtECod ;
   private boolean n8213PArArtAnc ;
   private boolean n8249PArColKgm ;
   private boolean n8248PArColMtr ;
   private boolean n8244PArColPie ;
   private boolean n8255PArEstMtr ;
   private boolean n8254PArEstPie ;
   private boolean n8291PArAcaImpK ;
   private boolean n8297PArPTeImp ;
   private boolean n8300PArPEsImp ;
   private boolean n8245PArColDes ;
   private boolean n8246PArColInt ;
   private boolean n8193DibSep ;
   private boolean n8192DibGra ;
   private boolean n8252PArEstSep ;
   private boolean n8253PArEstGra ;
   private boolean returnInSub ;
   private boolean n4903FasAcab ;
   private boolean n7893Dtp_Tpp ;
   private byte[] aP16 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private String[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P037E2_A396EmprCod ;
   private int[] P037E2_A8197PArId ;
   private int[] P037E2_A8205PArCliCod ;
   private boolean[] P037E2_n8205PArCliCod ;
   private String[] P037E2_A8208PArArtTCod ;
   private boolean[] P037E2_n8208PArArtTCod ;
   private String[] P037E2_A8210PArArtECod ;
   private boolean[] P037E2_n8210PArArtECod ;
   private short[] P037E2_A8213PArArtAnc ;
   private boolean[] P037E2_n8213PArArtAnc ;
   private String[] P037E5_A396EmprCod ;
   private int[] P037E5_A8197PArId ;
   private java.math.BigDecimal[] P037E5_A8249PArColKgm ;
   private boolean[] P037E5_n8249PArColKgm ;
   private java.math.BigDecimal[] P037E5_A8248PArColMtr ;
   private boolean[] P037E5_n8248PArColMtr ;
   private String[] P037E5_A8242PArColNom ;
   private int[] P037E5_A8243PArColNum ;
   private String[] P037E7_A396EmprCod ;
   private int[] P037E7_A8197PArId ;
   private java.math.BigDecimal[] P037E7_A8255PArEstMtr ;
   private boolean[] P037E7_n8255PArEstMtr ;
   private String[] P037E7_A8250PArEstDib ;
   private String[] P037E7_A8251PArEstPin ;
   private String[] P037E9_A396EmprCod ;
   private int[] P037E9_A8197PArId ;
   private int[] P037E9_A8291PArAcaImpK ;
   private boolean[] P037E9_n8291PArAcaImpK ;
   private String[] P037E9_A8285PArAcaFasC ;
   private String[] P037E11_A396EmprCod ;
   private int[] P037E11_A8197PArId ;
   private int[] P037E11_A8297PArPTeImp ;
   private boolean[] P037E11_n8297PArPTeImp ;
   private byte[] P037E11_A8293PArPTeInt ;
   private String[] P037E13_A396EmprCod ;
   private int[] P037E13_A8197PArId ;
   private int[] P037E13_A8300PArPEsImp ;
   private boolean[] P037E13_n8300PArPEsImp ;
   private String[] P037E13_A8298PArPEsDib ;
   private String[] P037E13_A8299PArPEsPin ;
   private String[] P037E16_A396EmprCod ;
   private int[] P037E16_A483ForColNum ;
   private String[] P037E16_A482ForColNom ;
   private String[] P037E16_A494ForSer ;
   private int[] P037E16_A252CliCod ;
   private byte[] P037E16_A583IntCod ;
   private byte[] P037E16_A831TipColCod ;
   private String[] P037E19_A396EmprCod ;
   private int[] P037E19_A1014DibInt ;
   private String[] P037E19_A1013DibCli ;
   private int[] P037E19_A252CliCod ;
   private String[] P037E19_A8193DibSep ;
   private boolean[] P037E19_n8193DibSep ;
   private String[] P037E19_A8192DibGra ;
   private boolean[] P037E19_n8192DibGra ;
   private String[] P037E22_A396EmprCod ;
   private String[] P037E22_A65ArtCod ;
   private int[] P037E22_A252CliCod ;
   private String[] P037E22_A758ProCod ;
   private String[] P037E23_A396EmprCod ;
   private String[] P037E23_A65ArtCod ;
   private int[] P037E23_A252CliCod ;
   private String[] P037E23_A758ProCod ;
   private String[] P037E24_A396EmprCod ;
   private int[] P037E24_A8197PArId ;
   private byte[] P037E24_A8246PArColInt ;
   private boolean[] P037E24_n8246PArColInt ;
   private int[] P037E24_A8243PArColNum ;
   private String[] P037E24_A8242PArColNom ;
   private String[] P037E26_A396EmprCod ;
   private int[] P037E26_A8197PArId ;
   private String[] P037E26_A8250PArEstDib ;
   private String[] P037E26_A8251PArEstPin ;
   private String[] P037E29_A396EmprCod ;
   private String[] P037E29_A457FasCod ;
   private String[] P037E29_A4903FasAcab ;
   private boolean[] P037E29_n4903FasAcab ;
   private String[] P037E29_A758ProCod ;
   private java.math.BigDecimal[] P037E29_A7893Dtp_Tpp ;
   private boolean[] P037E29_n7893Dtp_Tpp ;
   private short[] P037E29_A774ProNumLin ;
}

final  class ppedart1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037E2", "SELECT EmprCod, PArId, PArCliCod, PArArtTCod, PArArtECod, PArArtAnc FROM TXPPedArt WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P037E3", "UPDATE TXPPedAr2 SET PArColKgm=PArColKgm - ?, PArColMtr=PArColMtr - ?, PArColPie=PArColPie - 1  WHERE EmprCod = ? and PArId = ? and PArColNom = ? and PArColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr2")
         ,new UpdateCursor("P037E4", "UPDATE TXPPedAr3 SET PArEstMtr=PArEstMtr - ?, PArEstPie=PArEstPie - 1  WHERE EmprCod = ? and PArId = ? and PArEstDib = ? and PArEstPin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr3")
         ,new ForEachCursor("P037E5", "SELECT EmprCod, PArId, PArColKgm, PArColMtr, PArColNom, PArColNum FROM TXPPedAr2 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E6", "DELETE FROM TXPPedAr2  WHERE EmprCod = ? AND PArId = ? AND PArColNom = ? AND PArColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr2")
         ,new ForEachCursor("P037E7", "SELECT EmprCod, PArId, PArEstMtr, PArEstDib, PArEstPin FROM TXPPedAr3 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E8", "DELETE FROM TXPPedAr3  WHERE EmprCod = ? AND PArId = ? AND PArEstDib = ? AND PArEstPin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr3")
         ,new ForEachCursor("P037E9", "SELECT EmprCod, PArId, PArAcaImpK, PArAcaFasC FROM TXPPedAr4 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E10", "DELETE FROM TXPPedAr4  WHERE EmprCod = ? AND PArId = ? AND PArAcaFasC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr4")
         ,new ForEachCursor("P037E11", "SELECT EmprCod, PArId, PArPTeImp, PArPTeInt FROM TXPPedAr5 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E12", "DELETE FROM TXPPedAr5  WHERE EmprCod = ? AND PArId = ? AND PArPTeInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr5")
         ,new ForEachCursor("P037E13", "SELECT EmprCod, PArId, PArPEsImp, PArPEsDib, PArPEsPin FROM TXPPedAr6 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E14", "DELETE FROM TXPPedAr6  WHERE EmprCod = ? AND PArId = ? AND PArPEsDib = ? AND PArPEsPin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr6")
         ,new UpdateCursor("P037E15", "UPDATE TXPPedAr2 SET PArColKgm=PArColKgm + ?, PArColMtr=PArColMtr + ?, PArColPie=PArColPie + 1  WHERE EmprCod = ? and PArId = ? and PArColNom = ? and PArColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr2")
         ,new ForEachCursor("P037E16", "SELECT EmprCod, ForColNum, ForColNom, ForSer, CliCod, IntCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E17", "INSERT INTO TXPPedAr5(EmprCod, PArId, PArPTeInt, PArPTeImp, PArPTeDto, PArPTeRec, PArPTeAut) VALUES(?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr5")
         ,new UpdateCursor("P037E18", "INSERT INTO TXPPedAr2(EmprCod, PArId, PArColNom, PArColNum, PArColPie, PArColDes, PArColInt, PArColMtr, PArColKgm, PArColObs, PArColMaq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr2")
         ,new ForEachCursor("P037E19", "SELECT EmprCod, DibInt, DibCli, CliCod, DibSep, DibGra FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = 0 ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P037E20", "UPDATE TXPPedAr3 SET PArEstMtr=PArEstMtr + ?, PArEstPie=PArEstPie + 1  WHERE EmprCod = ? and PArId = ? and PArEstDib = ? and PArEstPin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr3")
         ,new UpdateCursor("P037E21", "INSERT INTO TXPPedAr3(EmprCod, PArId, PArEstDib, PArEstPin, PArEstSep, PArEstGra, PArEstPie, PArEstMtr, PArEstDes, PArEstCol1, PArEstCol2, PArEstCol3, PArEstCol4, PArEstCol5, PArEstCol6, PArEstCol7, PArEstCol8, PArEstMueF, PArEstSepF, PArEstGraF, PArEstObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr3")
         ,new ForEachCursor("P037E22", "SELECT EmprCod, ArtCod, CliCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037E23", "SELECT EmprCod, ArtCod, CliCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037E24", "SELECT EmprCod, PArId, PArColInt, PArColNum, PArColNom FROM TXPPedAr2 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E25", "INSERT INTO TXPPedAr5(EmprCod, PArId, PArPTeInt, PArPTeImp, PArPTeDto, PArPTeRec, PArPTeAut) VALUES(?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr5")
         ,new ForEachCursor("P037E26", "SELECT EmprCod, PArId, PArEstDib, PArEstPin FROM TXPPedAr3 WHERE EmprCod = ? and PArId = ? ORDER BY EmprCod, PArId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E27", "INSERT INTO TXPPedAr6(EmprCod, PArId, PArPEsDib, PArPEsPin, PArPEsImp, PArPEsDto, PArPEsRec, PArPEsAut) VALUES(?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr6")
         ,new UpdateCursor("P037E28", "INSERT INTO TXPPedAr6(EmprCod, PArId, PArPEsDib, PArPEsPin, PArPEsImp, PArPEsDto, PArPEsRec, PArPEsAut) VALUES(?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr6")
         ,new ForEachCursor("P037E29", "SELECT T1.EmprCod, T1.FasCod, T2.FasAcab, T1.ProCod, T1.Dtp_Tpp, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037E30", "INSERT INTO TXPPedAr4(EmprCod, PArId, PArAcaFasC, PArAcaImpK, PArAcaImpM, PArAcaAut) VALUES(?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAr4")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

