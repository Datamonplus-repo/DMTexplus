package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart6 extends GXProcedure
{
   public ppedart6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart6.class ), "" );
   }

   public ppedart6( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      ppedart6.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      ppedart6.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart6.this.AV11CliCod = aP1[0];
      this.aP1 = aP1;
      ppedart6.this.AV8DibCli = aP2[0];
      this.aP2 = aP2;
      ppedart6.this.AV10DibInt = aP3[0];
      this.aP3 = aP3;
      ppedart6.this.AV9SerEst = aP4[0];
      this.aP4 = aP4;
      ppedart6.this.AV12ColCom = aP5[0];
      this.aP5 = aP5;
      ppedart6.this.AV13ColFon = aP6[0];
      this.aP6 = aP6;
      ppedart6.this.AV14MolCol1 = aP7[0];
      this.aP7 = aP7;
      ppedart6.this.AV15MolCol2 = aP8[0];
      this.aP8 = aP8;
      ppedart6.this.AV16MolCol3 = aP9[0];
      this.aP9 = aP9;
      ppedart6.this.AV17MolCol4 = aP10[0];
      this.aP10 = aP10;
      ppedart6.this.AV18MolCol5 = aP11[0];
      this.aP11 = aP11;
      ppedart6.this.AV19MolCol6 = aP12[0];
      this.aP12 = aP12;
      ppedart6.this.AV20MolCol7 = aP13[0];
      this.aP13 = aP13;
      ppedart6.this.AV21MolCol8 = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P037I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11CliCod), AV8DibCli, Integer.valueOf(AV10DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4861DibCob = P037I2_A4861DibCob[0] ;
         n4861DibCob = P037I2_n4861DibCob[0] ;
         A7028ColBmp = P037I2_A7028ColBmp[0] ;
         n7028ColBmp = P037I2_n7028ColBmp[0] ;
         A5336ColCodExt = P037I2_A5336ColCodExt[0] ;
         n5336ColCodExt = P037I2_n5336ColCodExt[0] ;
         A583IntCod = P037I2_A583IntCod[0] ;
         n583IntCod = P037I2_n583IntCod[0] ;
         A2097ForObsULin = P037I2_A2097ForObsULin[0] ;
         n2097ForObsULin = P037I2_n2097ForObsULin[0] ;
         A2076ColEstMba = P037I2_A2076ColEstMba[0] ;
         n2076ColEstMba = P037I2_n2076ColEstMba[0] ;
         A2079ColMolCil = P037I2_A2079ColMolCil[0] ;
         n2079ColMolCil = P037I2_n2079ColMolCil[0] ;
         A2078ColFon = P037I2_A2078ColFon[0] ;
         A2074ColCom = P037I2_A2074ColCom[0] ;
         A2141SerEst = P037I2_A2141SerEst[0] ;
         A7140DibBmp = P037I2_A7140DibBmp[0] ;
         n7140DibBmp = P037I2_n7140DibBmp[0] ;
         A1823DibTipMaq = P037I2_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P037I2_n1823DibTipMaq[0] ;
         A1019DibMolCil = P037I2_A1019DibMolCil[0] ;
         n1019DibMolCil = P037I2_n1019DibMolCil[0] ;
         A2090DibMolCi2 = P037I2_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P037I2_n2090DibMolCi2[0] ;
         A13123DGAltCab = P037I2_A13123DGAltCab[0] ;
         n13123DGAltCab = P037I2_n13123DGAltCab[0] ;
         A13121DGDespID = P037I2_A13121DGDespID[0] ;
         n13121DGDespID = P037I2_n13121DGDespID[0] ;
         A13119DGPerfID = P037I2_A13119DGPerfID[0] ;
         n13119DGPerfID = P037I2_n13119DGPerfID[0] ;
         A13117DGCalID = P037I2_A13117DGCalID[0] ;
         n13117DGCalID = P037I2_n13117DGCalID[0] ;
         A11717ClaveIdUlt = P037I2_A11717ClaveIdUlt[0] ;
         n11717ClaveIdUlt = P037I2_n11717ClaveIdUlt[0] ;
         A10770ColGrm2 = P037I2_A10770ColGrm2[0] ;
         n10770ColGrm2 = P037I2_n10770ColGrm2[0] ;
         A8419ColNomCol = P037I2_A8419ColNomCol[0] ;
         n8419ColNomCol = P037I2_n8419ColNomCol[0] ;
         A499GrpFamCod = P037I2_A499GrpFamCod[0] ;
         n499GrpFamCod = P037I2_n499GrpFamCod[0] ;
         A1014DibInt = P037I2_A1014DibInt[0] ;
         A1013DibCli = P037I2_A1013DibCli[0] ;
         A252CliCod = P037I2_A252CliCod[0] ;
         A2075ColEstAnh = P037I2_A2075ColEstAnh[0] ;
         n2075ColEstAnh = P037I2_n2075ColEstAnh[0] ;
         A4861DibCob = P037I2_A4861DibCob[0] ;
         n4861DibCob = P037I2_n4861DibCob[0] ;
         A7140DibBmp = P037I2_A7140DibBmp[0] ;
         n7140DibBmp = P037I2_n7140DibBmp[0] ;
         A1823DibTipMaq = P037I2_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P037I2_n1823DibTipMaq[0] ;
         A1019DibMolCil = P037I2_A1019DibMolCil[0] ;
         n1019DibMolCil = P037I2_n1019DibMolCil[0] ;
         A2090DibMolCi2 = P037I2_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = P037I2_n2090DibMolCi2[0] ;
         A2075ColEstAnh = P037I2_A2075ColEstAnh[0] ;
         n2075ColEstAnh = P037I2_n2075ColEstAnh[0] ;
         /*
            INSERT RECORD ON TABLE TXPCFORES

         */
         W2141SerEst = A2141SerEst ;
         W2074ColCom = A2074ColCom ;
         W2078ColFon = A2078ColFon ;
         W2097ForObsULin = A2097ForObsULin ;
         n2097ForObsULin = false ;
         W583IntCod = A583IntCod ;
         n583IntCod = false ;
         W7028ColBmp = A7028ColBmp ;
         n7028ColBmp = false ;
         W2076ColEstMba = A2076ColEstMba ;
         n2076ColEstMba = false ;
         W2079ColMolCil = A2079ColMolCil ;
         n2079ColMolCil = false ;
         W2079ColMolCil = A2079ColMolCil ;
         n2079ColMolCil = false ;
         W5336ColCodExt = A5336ColCodExt ;
         n5336ColCodExt = false ;
         W2076ColEstMba = A2076ColEstMba ;
         n2076ColEstMba = false ;
         A2141SerEst = AV9SerEst ;
         A2074ColCom = AV12ColCom ;
         A2078ColFon = AV13ColFon ;
         A2097ForObsULin = (byte)(0) ;
         n2097ForObsULin = false ;
         A583IntCod = (byte)(0) ;
         n583IntCod = false ;
         A7028ColBmp = A7140DibBmp ;
         n7028ColBmp = false ;
         A2076ColEstMba = DecimalUtil.doubleToDec(0) ;
         n2076ColEstMba = false ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            A2079ColMolCil = A1019DibMolCil ;
            n2079ColMolCil = false ;
         }
         else
         {
            A2079ColMolCil = A2090DibMolCi2 ;
            n2079ColMolCil = false ;
         }
         A5336ColCodExt = "" ;
         n5336ColCodExt = false ;
         A2076ColEstMba = DecimalUtil.doubleToDec(100) ;
         n2076ColEstMba = false ;
         /* Using cursor P037I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Boolean.valueOf(n2079ColMolCil), Short.valueOf(A2079ColMolCil), Boolean.valueOf(n2076ColEstMba), A2076ColEstMba, Boolean.valueOf(n2097ForObsULin), Byte.valueOf(A2097ForObsULin), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n5336ColCodExt), A5336ColCodExt, Boolean.valueOf(n7028ColBmp), A7028ColBmp, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), Boolean.valueOf(n8419ColNomCol), A8419ColNomCol, Boolean.valueOf(n10770ColGrm2), A10770ColGrm2, Boolean.valueOf(n11717ClaveIdUlt), Short.valueOf(A11717ClaveIdUlt), Boolean.valueOf(n13117DGCalID), Short.valueOf(A13117DGCalID), Boolean.valueOf(n13119DGPerfID), Short.valueOf(A13119DGPerfID), Boolean.valueOf(n13121DGDespID), Short.valueOf(A13121DGDespID), Boolean.valueOf(n13123DGAltCab), A13123DGAltCab});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
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
         A2141SerEst = W2141SerEst ;
         A2074ColCom = W2074ColCom ;
         A2078ColFon = W2078ColFon ;
         A2097ForObsULin = W2097ForObsULin ;
         n2097ForObsULin = false ;
         A583IntCod = W583IntCod ;
         n583IntCod = false ;
         A7028ColBmp = W7028ColBmp ;
         n7028ColBmp = false ;
         A2076ColEstMba = W2076ColEstMba ;
         n2076ColEstMba = false ;
         A2079ColMolCil = W2079ColMolCil ;
         n2079ColMolCil = false ;
         A2079ColMolCil = W2079ColMolCil ;
         n2079ColMolCil = false ;
         A5336ColCodExt = W5336ColCodExt ;
         n5336ColCodExt = false ;
         A2076ColEstMba = W2076ColEstMba ;
         n2076ColEstMba = false ;
         /* End Insert */
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            AV22Cont = (byte)(0) ;
            /* Using cursor P037I4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1807DibLinCil = P037I4_A1807DibLinCil[0] ;
               A2089DibLinMol = P037I4_A2089DibLinMol[0] ;
               n2089DibLinMol = P037I4_n2089DibLinMol[0] ;
               A4860DibPrcCob = P037I4_A4860DibPrcCob[0] ;
               n4860DibPrcCob = P037I4_n4860DibPrcCob[0] ;
               AV22Cont = (byte)(AV22Cont+1) ;
               if ( AV22Cont == 1 )
               {
                  AV23MolCol = AV14MolCol1 ;
               }
               else if ( AV22Cont == 2 )
               {
                  AV23MolCol = AV15MolCol2 ;
               }
               else if ( AV22Cont == 3 )
               {
                  AV23MolCol = AV16MolCol3 ;
               }
               else if ( AV22Cont == 4 )
               {
                  AV23MolCol = AV17MolCol4 ;
               }
               else if ( AV22Cont == 5 )
               {
                  AV23MolCol = AV18MolCol5 ;
               }
               else if ( AV22Cont == 6 )
               {
                  AV23MolCol = AV19MolCol6 ;
               }
               else if ( AV22Cont == 7 )
               {
                  AV23MolCol = AV20MolCol7 ;
               }
               else if ( AV22Cont == 8 )
               {
                  AV23MolCol = AV21MolCol8 ;
               }
               AV24DibLinMol = A2089DibLinMol ;
               AV25MolCon = A4861DibCob.multiply((A4860DibPrcCob.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A2075ColEstAnh/ (double) (100)))).multiply(A2076ColEstMba) ;
               /* Execute user subroutine: 'LINEA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A252CliCod ;
               GXv_char3[0] = AV9SerEst ;
               GXv_char4[0] = A1013DibCli ;
               GXv_int5[0] = A1014DibInt ;
               GXv_char6[0] = AV12ColCom ;
               GXv_char7[0] = AV13ColFon ;
               GXv_int8[0] = A2089DibLinMol ;
               GXv_char9[0] = AV23MolCol ;
               GXv_int10[0] = (short)(0) ;
               new app.pestcol(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8, GXv_char9, GXv_int10) ;
               ppedart6.this.A396EmprCod = GXv_char1[0] ;
               ppedart6.this.A252CliCod = GXv_int2[0] ;
               ppedart6.this.AV9SerEst = GXv_char3[0] ;
               ppedart6.this.A1013DibCli = GXv_char4[0] ;
               ppedart6.this.A1014DibInt = GXv_int5[0] ;
               ppedart6.this.AV12ColCom = GXv_char6[0] ;
               ppedart6.this.AV13ColFon = GXv_char7[0] ;
               ppedart6.this.A2089DibLinMol = GXv_int8[0] ;
               ppedart6.this.AV23MolCol = GXv_char9[0] ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         else
         {
            AV22Cont = (byte)(0) ;
            /* Using cursor P037I5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1029DibLin = P037I5_A1029DibLin[0] ;
               A5381DibPrcCobM = P037I5_A5381DibPrcCobM[0] ;
               n5381DibPrcCobM = P037I5_n5381DibPrcCobM[0] ;
               AV22Cont = (byte)(AV22Cont+1) ;
               if ( AV22Cont == 1 )
               {
                  AV23MolCol = AV14MolCol1 ;
               }
               else if ( AV22Cont == 2 )
               {
                  AV23MolCol = AV15MolCol2 ;
               }
               else if ( AV22Cont == 3 )
               {
                  AV23MolCol = AV16MolCol3 ;
               }
               else if ( AV22Cont == 4 )
               {
                  AV23MolCol = AV17MolCol4 ;
               }
               else if ( AV22Cont == 5 )
               {
                  AV23MolCol = AV18MolCol5 ;
               }
               else if ( AV22Cont == 6 )
               {
                  AV23MolCol = AV19MolCol6 ;
               }
               else if ( AV22Cont == 7 )
               {
                  AV23MolCol = AV20MolCol7 ;
               }
               else if ( AV22Cont == 8 )
               {
                  AV23MolCol = AV21MolCol8 ;
               }
               AV24DibLinMol = (byte)(A1029DibLin) ;
               AV25MolCon = A4861DibCob.multiply((A5381DibPrcCobM.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(DecimalUtil.doubleToDec((A2075ColEstAnh/ (double) (100)))).multiply(A2076ColEstMba) ;
               /* Execute user subroutine: 'LINEA' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               GXv_char9[0] = A396EmprCod ;
               GXv_int5[0] = A252CliCod ;
               GXv_char7[0] = AV9SerEst ;
               GXv_char6[0] = A1013DibCli ;
               GXv_int2[0] = A1014DibInt ;
               GXv_char4[0] = AV12ColCom ;
               GXv_char3[0] = AV13ColFon ;
               GXv_int8[0] = (byte)(A1029DibLin) ;
               GXv_char1[0] = AV23MolCol ;
               GXv_int10[0] = (short)(0) ;
               new app.pestcol(remoteHandle, context).execute( GXv_char9, GXv_int5, GXv_char7, GXv_char6, GXv_int2, GXv_char4, GXv_char3, GXv_int8, GXv_char1, GXv_int10) ;
               ppedart6.this.A396EmprCod = GXv_char9[0] ;
               ppedart6.this.A252CliCod = GXv_int5[0] ;
               ppedart6.this.AV9SerEst = GXv_char7[0] ;
               ppedart6.this.A1013DibCli = GXv_char6[0] ;
               ppedart6.this.A1014DibInt = GXv_int2[0] ;
               ppedart6.this.AV12ColCom = GXv_char4[0] ;
               ppedart6.this.AV13ColFon = GXv_char3[0] ;
               ppedart6.this.A1029DibLin = GXv_int8[0] ;
               ppedart6.this.AV23MolCol = GXv_char1[0] ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'LINEA' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPMFORES

      */
      A2141SerEst = AV9SerEst ;
      A2074ColCom = AV12ColCom ;
      A2078ColFon = AV13ColFon ;
      A2098MolCod = AV24DibLinMol ;
      A2100MolCon = AV25MolCon ;
      n2100MolCon = false ;
      A2536ForPrdUL = (short)(0) ;
      n2536ForPrdUL = false ;
      A2650MolPesMin = DecimalUtil.doubleToDec(10) ;
      n2650MolPesMin = false ;
      A2649MolPesMax = DecimalUtil.doubleToDec(100) ;
      n2649MolPesMax = false ;
      A2655PasForUL = (short)(0) ;
      n2655PasForUL = false ;
      A4420MolCol = AV23MolCol ;
      n4420MolCol = false ;
      A2648MolForEst = ((GXutil.strcmp(AV23MolCol, "")!=0) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
      n2648MolForEst = false ;
      A8052Dg_codigo = (short)(0) ;
      n8052Dg_codigo = false ;
      /* Using cursor P037I6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n2536ForPrdUL), Short.valueOf(A2536ForPrdUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, Boolean.valueOf(n2648MolForEst), A2648MolForEst, Boolean.valueOf(n2649MolPesMax), A2649MolPesMax, Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), Boolean.valueOf(n4420MolCol), A4420MolCol, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart6.this.A396EmprCod;
      this.aP1[0] = ppedart6.this.AV11CliCod;
      this.aP2[0] = ppedart6.this.AV8DibCli;
      this.aP3[0] = ppedart6.this.AV10DibInt;
      this.aP4[0] = ppedart6.this.AV9SerEst;
      this.aP5[0] = ppedart6.this.AV12ColCom;
      this.aP6[0] = ppedart6.this.AV13ColFon;
      this.aP7[0] = ppedart6.this.AV14MolCol1;
      this.aP8[0] = ppedart6.this.AV15MolCol2;
      this.aP9[0] = ppedart6.this.AV16MolCol3;
      this.aP10[0] = ppedart6.this.AV17MolCol4;
      this.aP11[0] = ppedart6.this.AV18MolCol5;
      this.aP12[0] = ppedart6.this.AV19MolCol6;
      this.aP13[0] = ppedart6.this.AV20MolCol7;
      this.aP14[0] = ppedart6.this.AV21MolCol8;
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
      P037I2_A65ArtCod = new String[] {""} ;
      P037I2_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I2_n4861DibCob = new boolean[] {false} ;
      P037I2_A7028ColBmp = new String[] {""} ;
      P037I2_n7028ColBmp = new boolean[] {false} ;
      P037I2_A5336ColCodExt = new String[] {""} ;
      P037I2_n5336ColCodExt = new boolean[] {false} ;
      P037I2_A583IntCod = new byte[1] ;
      P037I2_n583IntCod = new boolean[] {false} ;
      P037I2_A2097ForObsULin = new byte[1] ;
      P037I2_n2097ForObsULin = new boolean[] {false} ;
      P037I2_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I2_n2076ColEstMba = new boolean[] {false} ;
      P037I2_A2079ColMolCil = new short[1] ;
      P037I2_n2079ColMolCil = new boolean[] {false} ;
      P037I2_A2078ColFon = new String[] {""} ;
      P037I2_A2074ColCom = new String[] {""} ;
      P037I2_A2141SerEst = new String[] {""} ;
      P037I2_A7140DibBmp = new String[] {""} ;
      P037I2_n7140DibBmp = new boolean[] {false} ;
      P037I2_A1823DibTipMaq = new String[] {""} ;
      P037I2_n1823DibTipMaq = new boolean[] {false} ;
      P037I2_A1019DibMolCil = new short[1] ;
      P037I2_n1019DibMolCil = new boolean[] {false} ;
      P037I2_A2090DibMolCi2 = new short[1] ;
      P037I2_n2090DibMolCi2 = new boolean[] {false} ;
      P037I2_A13123DGAltCab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I2_n13123DGAltCab = new boolean[] {false} ;
      P037I2_A13121DGDespID = new short[1] ;
      P037I2_n13121DGDespID = new boolean[] {false} ;
      P037I2_A13119DGPerfID = new short[1] ;
      P037I2_n13119DGPerfID = new boolean[] {false} ;
      P037I2_A13117DGCalID = new short[1] ;
      P037I2_n13117DGCalID = new boolean[] {false} ;
      P037I2_A11717ClaveIdUlt = new short[1] ;
      P037I2_n11717ClaveIdUlt = new boolean[] {false} ;
      P037I2_A10770ColGrm2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I2_n10770ColGrm2 = new boolean[] {false} ;
      P037I2_A8419ColNomCol = new String[] {""} ;
      P037I2_n8419ColNomCol = new boolean[] {false} ;
      P037I2_A499GrpFamCod = new byte[1] ;
      P037I2_n499GrpFamCod = new boolean[] {false} ;
      P037I2_A1014DibInt = new int[1] ;
      P037I2_A1013DibCli = new String[] {""} ;
      P037I2_A252CliCod = new int[1] ;
      P037I2_A396EmprCod = new String[] {""} ;
      P037I2_A2075ColEstAnh = new short[1] ;
      P037I2_n2075ColEstAnh = new boolean[] {false} ;
      A4861DibCob = DecimalUtil.ZERO ;
      A7028ColBmp = "" ;
      A5336ColCodExt = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A2141SerEst = "" ;
      A7140DibBmp = "" ;
      A1823DibTipMaq = "" ;
      A13123DGAltCab = DecimalUtil.ZERO ;
      A10770ColGrm2 = DecimalUtil.ZERO ;
      A8419ColNomCol = "" ;
      A1013DibCli = "" ;
      W2141SerEst = "" ;
      W2074ColCom = "" ;
      W2078ColFon = "" ;
      W7028ColBmp = "" ;
      W2076ColEstMba = DecimalUtil.ZERO ;
      W5336ColCodExt = "" ;
      Gx_emsg = "" ;
      P037I4_A396EmprCod = new String[] {""} ;
      P037I4_A1013DibCli = new String[] {""} ;
      P037I4_A252CliCod = new int[1] ;
      P037I4_A1014DibInt = new int[1] ;
      P037I4_A1807DibLinCil = new short[1] ;
      P037I4_A2089DibLinMol = new byte[1] ;
      P037I4_n2089DibLinMol = new boolean[] {false} ;
      P037I4_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I4_n4860DibPrcCob = new boolean[] {false} ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      AV23MolCol = "" ;
      AV25MolCon = DecimalUtil.ZERO ;
      P037I5_A396EmprCod = new String[] {""} ;
      P037I5_A1013DibCli = new String[] {""} ;
      P037I5_A252CliCod = new int[1] ;
      P037I5_A1014DibInt = new int[1] ;
      P037I5_A1029DibLin = new short[1] ;
      P037I5_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037I5_n5381DibPrcCobM = new boolean[] {false} ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      GXv_char9 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_int10 = new short[1] ;
      A2100MolCon = DecimalUtil.ZERO ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      A2649MolPesMax = DecimalUtil.ZERO ;
      A4420MolCol = "" ;
      A2648MolForEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart6__default(),
         new Object[] {
             new Object[] {
            P037I2_A65ArtCod, P037I2_A4861DibCob, P037I2_n4861DibCob, P037I2_A7028ColBmp, P037I2_n7028ColBmp, P037I2_A5336ColCodExt, P037I2_n5336ColCodExt, P037I2_A583IntCod, P037I2_n583IntCod, P037I2_A2097ForObsULin,
            P037I2_n2097ForObsULin, P037I2_A2076ColEstMba, P037I2_n2076ColEstMba, P037I2_A2079ColMolCil, P037I2_n2079ColMolCil, P037I2_A2078ColFon, P037I2_A2074ColCom, P037I2_A2141SerEst, P037I2_A7140DibBmp, P037I2_n7140DibBmp,
            P037I2_A1823DibTipMaq, P037I2_n1823DibTipMaq, P037I2_A1019DibMolCil, P037I2_n1019DibMolCil, P037I2_A2090DibMolCi2, P037I2_n2090DibMolCi2, P037I2_A13123DGAltCab, P037I2_n13123DGAltCab, P037I2_A13121DGDespID, P037I2_n13121DGDespID,
            P037I2_A13119DGPerfID, P037I2_n13119DGPerfID, P037I2_A13117DGCalID, P037I2_n13117DGCalID, P037I2_A11717ClaveIdUlt, P037I2_n11717ClaveIdUlt, P037I2_A10770ColGrm2, P037I2_n10770ColGrm2, P037I2_A8419ColNomCol, P037I2_n8419ColNomCol,
            P037I2_A499GrpFamCod, P037I2_n499GrpFamCod, P037I2_A1014DibInt, P037I2_A1013DibCli, P037I2_A252CliCod, P037I2_A396EmprCod, P037I2_A2075ColEstAnh, P037I2_n2075ColEstAnh
            }
            , new Object[] {
            }
            , new Object[] {
            P037I4_A396EmprCod, P037I4_A1013DibCli, P037I4_A252CliCod, P037I4_A1014DibInt, P037I4_A1807DibLinCil, P037I4_A2089DibLinMol, P037I4_n2089DibLinMol, P037I4_A4860DibPrcCob, P037I4_n4860DibPrcCob
            }
            , new Object[] {
            P037I5_A396EmprCod, P037I5_A1013DibCli, P037I5_A252CliCod, P037I5_A1014DibInt, P037I5_A1029DibLin, P037I5_A5381DibPrcCobM, P037I5_n5381DibPrcCobM
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte A2097ForObsULin ;
   private byte A499GrpFamCod ;
   private byte W2097ForObsULin ;
   private byte W583IntCod ;
   private byte AV22Cont ;
   private byte A2089DibLinMol ;
   private byte AV24DibLinMol ;
   private byte GXv_int8[] ;
   private byte A2098MolCod ;
   private short A2079ColMolCil ;
   private short A1019DibMolCil ;
   private short A2090DibMolCi2 ;
   private short A13121DGDespID ;
   private short A13119DGPerfID ;
   private short A13117DGCalID ;
   private short A11717ClaveIdUlt ;
   private short A2075ColEstAnh ;
   private short W2079ColMolCil ;
   private short Gx_err ;
   private short A1807DibLinCil ;
   private short A1029DibLin ;
   private short GXv_int10[] ;
   private short A2536ForPrdUL ;
   private short A2655PasForUL ;
   private short A8052Dg_codigo ;
   private int AV11CliCod ;
   private int AV10DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int GX_INS556 ;
   private int GXv_int5[] ;
   private int GXv_int2[] ;
   private int GX_INS557 ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A13123DGAltCab ;
   private java.math.BigDecimal A10770ColGrm2 ;
   private java.math.BigDecimal W2076ColEstMba ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal AV25MolCon ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal A2649MolPesMax ;
   private String A396EmprCod ;
   private String AV8DibCli ;
   private String AV9SerEst ;
   private String AV12ColCom ;
   private String AV13ColFon ;
   private String AV14MolCol1 ;
   private String AV15MolCol2 ;
   private String AV16MolCol3 ;
   private String AV17MolCol4 ;
   private String AV18MolCol5 ;
   private String AV19MolCol6 ;
   private String AV20MolCol7 ;
   private String AV21MolCol8 ;
   private String scmdbuf ;
   private String A7028ColBmp ;
   private String A5336ColCodExt ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A2141SerEst ;
   private String A7140DibBmp ;
   private String A1823DibTipMaq ;
   private String A8419ColNomCol ;
   private String A1013DibCli ;
   private String W2141SerEst ;
   private String W2074ColCom ;
   private String W2078ColFon ;
   private String W7028ColBmp ;
   private String W5336ColCodExt ;
   private String Gx_emsg ;
   private String AV23MolCol ;
   private String GXv_char9[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String A4420MolCol ;
   private String A2648MolForEst ;
   private boolean n4861DibCob ;
   private boolean n7028ColBmp ;
   private boolean n5336ColCodExt ;
   private boolean n583IntCod ;
   private boolean n2097ForObsULin ;
   private boolean n2076ColEstMba ;
   private boolean n2079ColMolCil ;
   private boolean n7140DibBmp ;
   private boolean n1823DibTipMaq ;
   private boolean n1019DibMolCil ;
   private boolean n2090DibMolCi2 ;
   private boolean n13123DGAltCab ;
   private boolean n13121DGDespID ;
   private boolean n13119DGPerfID ;
   private boolean n13117DGCalID ;
   private boolean n11717ClaveIdUlt ;
   private boolean n10770ColGrm2 ;
   private boolean n8419ColNomCol ;
   private boolean n499GrpFamCod ;
   private boolean n2075ColEstAnh ;
   private boolean n2089DibLinMol ;
   private boolean n4860DibPrcCob ;
   private boolean returnInSub ;
   private boolean n5381DibPrcCobM ;
   private boolean n2100MolCon ;
   private boolean n2536ForPrdUL ;
   private boolean n2650MolPesMin ;
   private boolean n2649MolPesMax ;
   private boolean n2655PasForUL ;
   private boolean n4420MolCol ;
   private boolean n2648MolForEst ;
   private boolean n8052Dg_codigo ;
   private String[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P037I2_A65ArtCod ;
   private java.math.BigDecimal[] P037I2_A4861DibCob ;
   private boolean[] P037I2_n4861DibCob ;
   private String[] P037I2_A7028ColBmp ;
   private boolean[] P037I2_n7028ColBmp ;
   private String[] P037I2_A5336ColCodExt ;
   private boolean[] P037I2_n5336ColCodExt ;
   private byte[] P037I2_A583IntCod ;
   private boolean[] P037I2_n583IntCod ;
   private byte[] P037I2_A2097ForObsULin ;
   private boolean[] P037I2_n2097ForObsULin ;
   private java.math.BigDecimal[] P037I2_A2076ColEstMba ;
   private boolean[] P037I2_n2076ColEstMba ;
   private short[] P037I2_A2079ColMolCil ;
   private boolean[] P037I2_n2079ColMolCil ;
   private String[] P037I2_A2078ColFon ;
   private String[] P037I2_A2074ColCom ;
   private String[] P037I2_A2141SerEst ;
   private String[] P037I2_A7140DibBmp ;
   private boolean[] P037I2_n7140DibBmp ;
   private String[] P037I2_A1823DibTipMaq ;
   private boolean[] P037I2_n1823DibTipMaq ;
   private short[] P037I2_A1019DibMolCil ;
   private boolean[] P037I2_n1019DibMolCil ;
   private short[] P037I2_A2090DibMolCi2 ;
   private boolean[] P037I2_n2090DibMolCi2 ;
   private java.math.BigDecimal[] P037I2_A13123DGAltCab ;
   private boolean[] P037I2_n13123DGAltCab ;
   private short[] P037I2_A13121DGDespID ;
   private boolean[] P037I2_n13121DGDespID ;
   private short[] P037I2_A13119DGPerfID ;
   private boolean[] P037I2_n13119DGPerfID ;
   private short[] P037I2_A13117DGCalID ;
   private boolean[] P037I2_n13117DGCalID ;
   private short[] P037I2_A11717ClaveIdUlt ;
   private boolean[] P037I2_n11717ClaveIdUlt ;
   private java.math.BigDecimal[] P037I2_A10770ColGrm2 ;
   private boolean[] P037I2_n10770ColGrm2 ;
   private String[] P037I2_A8419ColNomCol ;
   private boolean[] P037I2_n8419ColNomCol ;
   private byte[] P037I2_A499GrpFamCod ;
   private boolean[] P037I2_n499GrpFamCod ;
   private int[] P037I2_A1014DibInt ;
   private String[] P037I2_A1013DibCli ;
   private int[] P037I2_A252CliCod ;
   private String[] P037I2_A396EmprCod ;
   private short[] P037I2_A2075ColEstAnh ;
   private boolean[] P037I2_n2075ColEstAnh ;
   private String[] P037I4_A396EmprCod ;
   private String[] P037I4_A1013DibCli ;
   private int[] P037I4_A252CliCod ;
   private int[] P037I4_A1014DibInt ;
   private short[] P037I4_A1807DibLinCil ;
   private byte[] P037I4_A2089DibLinMol ;
   private boolean[] P037I4_n2089DibLinMol ;
   private java.math.BigDecimal[] P037I4_A4860DibPrcCob ;
   private boolean[] P037I4_n4860DibPrcCob ;
   private String[] P037I5_A396EmprCod ;
   private String[] P037I5_A1013DibCli ;
   private int[] P037I5_A252CliCod ;
   private int[] P037I5_A1014DibInt ;
   private short[] P037I5_A1029DibLin ;
   private java.math.BigDecimal[] P037I5_A5381DibPrcCobM ;
   private boolean[] P037I5_n5381DibPrcCobM ;
}

final  class ppedart6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037I2", "SELECT T3.ArtCod, T2.DibCob, T1.ColBmp, T1.ColCodExt, T1.IntCod, T1.ForObsULin, T1.ColEstMba, T1.ColMolCil, T1.ColFon, T1.ColCom, T1.SerEst, T2.DibBmp, T2.DibTipMaq, T2.DibMolCil, T2.DibMolCi2, T1.DGAltCab, T1.DGDespID, T1.DGPerfID, T1.DGCalID, T1.ClaveIdUlt, T1.ColGrm2, T1.ColNomCol, T1.GrpFamCod, T1.DibInt, T1.DibCli, T1.CliCod, T1.EmprCod, COALESCE( T3.ArtAcaMin, 0) AS ColEstAnh FROM ((TXPCFORES T1 INNER JOIN TXPCDIBUJ T2 ON T2.EmprCod = T1.EmprCod AND T2.DibCli = T1.DibCli AND T2.CliCod = T1.CliCod AND T2.DibInt = T1.DibInt) LEFT JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.SerEst) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.DibCli = ?) AND (T1.DibInt = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037I3", "INSERT INTO TXPCFORES(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ColMolCil, ColEstMba, ForObsULin, IntCod, ColCodExt, ColBmp, GrpFamCod, ColNomCol, ColGrm2, ClaveIdUlt, DGCalID, DGPerfID, DGDespID, DGAltCab) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORES")
         ,new ForEachCursor("P037I4", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMol, DibPrcCob FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037I5", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037I6", "INSERT INTO TXPMFORES(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, PasForUL, MolCol, Dg_codigo, MolPorVar, TaesId2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 128);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 12);
               ((String[]) buf[16])[0] = rslt.getString(10, 12);
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((String[]) buf[18])[0] = rslt.getString(12, 128);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 40);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(24);
               ((String[]) buf[43])[0] = rslt.getString(25, 16);
               ((int[]) buf[44])[0] = rslt.getInt(26);
               ((String[]) buf[45])[0] = rslt.getString(27, 3);
               ((short[]) buf[46])[0] = rslt.getShort(28);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[22], 40);
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
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[34], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[23]).shortValue());
               }
               return;
      }
   }

}

