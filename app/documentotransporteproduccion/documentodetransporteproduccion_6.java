package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_6 extends GXProcedure
{
   public documentodetransporteproduccion_6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_6.class ), "" );
   }

   public documentodetransporteproduccion_6( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 ,
                            int aP2 ,
                            short aP3 ,
                            java.util.Date aP4 ,
                            String aP5 ,
                            String[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 )
   {
      documentodetransporteproduccion_6.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        short aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             short aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 )
   {
      documentodetransporteproduccion_6.this.AV32Emprcod = aP0;
      documentodetransporteproduccion_6.this.AV44AlbProCodout = aP1;
      documentodetransporteproduccion_6.this.AV75Clicod = aP2;
      documentodetransporteproduccion_6.this.AV54Cod_pais = aP3;
      documentodetransporteproduccion_6.this.AV71AlbProfch = aP4;
      documentodetransporteproduccion_6.this.AV86Directory = aP5;
      documentodetransporteproduccion_6.this.AV13Filename = aP6[0];
      this.aP6 = aP6;
      documentodetransporteproduccion_6.this.aP7 = aP7;
      documentodetransporteproduccion_6.this.aP8 = aP8;
      documentodetransporteproduccion_6.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV69PATHPDF ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV32Emprcod, httpContext.getMessage( "WEBPDF", ""), GXv_char2) ;
      documentodetransporteproduccion_6.this.GXt_char1 = GXv_char2[0] ;
      AV69PATHPDF = GXt_char1 ;
      AV70RutaAdjunto = "" ;
      AV72Archivo = GXutil.trim( GXutil.str( AV75Clicod, 6, 0)) + "_" + GXutil.trim( GXutil.str( AV44AlbProCodout, 10, 0)) + "_" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( AV71AlbProfch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV71AlbProfch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV71AlbProfch), 10, 0)), (short)(2), "0") ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10CellRow = 4 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV79Lmetpi == 1 )
      {
         /* Execute user subroutine: 'CLOSEDOCUMENT' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV83ret = GXutil.sleep( 2) ;
      /* Execute user subroutine: 'APPLYTEMPLATE' */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV83ret = GXutil.sleep( 2) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80IsRegister = false ;
      AV77TotalK = DecimalUtil.doubleToDec(0) ;
      AV78TotalM = DecimalUtil.doubleToDec(0) ;
      AV61Numb = (short)(0) ;
      AV62TotK = DecimalUtil.doubleToDec(0) ;
      AV63Totm = DecimalUtil.doubleToDec(0) ;
      AV79Lmetpi = (short)(0) ;
      /* Using cursor P0A6Z2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, Long.valueOf(AV44AlbProCodout)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0A6Z2_A252CliCod[0] ;
         n252CliCod = P0A6Z2_n252CliCod[0] ;
         A1234BarNomCli = P0A6Z2_A1234BarNomCli[0] ;
         A1235BarNumCli = P0A6Z2_A1235BarNumCli[0] ;
         A143BarDisNum = P0A6Z2_A143BarDisNum[0] ;
         A135BarColNom = P0A6Z2_A135BarColNom[0] ;
         A136BarColNum = P0A6Z2_A136BarColNum[0] ;
         A1652BarSerDsc = P0A6Z2_A1652BarSerDsc[0] ;
         A130BarCodPar = P0A6Z2_A130BarCodPar[0] ;
         A132BarCodReo = P0A6Z2_A132BarCodReo[0] ;
         A129BarCod = P0A6Z2_A129BarCod[0] ;
         A396EmprCod = P0A6Z2_A396EmprCod[0] ;
         A30AlbProCod = P0A6Z2_A30AlbProCod[0] ;
         A13012CliImpReop = P0A6Z2_A13012CliImpReop[0] ;
         A5291BarTipCor = P0A6Z2_A5291BarTipCor[0] ;
         A252CliCod = P0A6Z2_A252CliCod[0] ;
         n252CliCod = P0A6Z2_n252CliCod[0] ;
         A1234BarNomCli = P0A6Z2_A1234BarNomCli[0] ;
         A1235BarNumCli = P0A6Z2_A1235BarNumCli[0] ;
         A143BarDisNum = P0A6Z2_A143BarDisNum[0] ;
         A135BarColNom = P0A6Z2_A135BarColNom[0] ;
         A136BarColNum = P0A6Z2_A136BarColNum[0] ;
         A1652BarSerDsc = P0A6Z2_A1652BarSerDsc[0] ;
         A5291BarTipCor = P0A6Z2_A5291BarTipCor[0] ;
         A13012CliImpReop = P0A6Z2_A13012CliImpReop[0] ;
         AV55BarCod = A129BarCod ;
         AV56BarCodReo = A132BarCodReo ;
         AV68BarCodPar = A130BarCodPar ;
         /* Execute user subroutine: 'BARFAS' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV57CliImpReop = A13012CliImpReop ;
         if ( GXutil.strcmp(A5291BarTipCor, httpContext.getMessage( "SI", "")) == 0 )
         {
            /* Using cursor P0A6Z3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4917MetPieObs = P0A6Z3_A4917MetPieObs[0] ;
               A2815MetPieMet = P0A6Z3_A2815MetPieMet[0] ;
               A2814MetPieKil = P0A6Z3_A2814MetPieKil[0] ;
               A2813MetPieCod = P0A6Z3_A2813MetPieCod[0] ;
               A2809MetTerCod = P0A6Z3_A2809MetTerCod[0] ;
               AV60ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
               if ( AV60ValNum == AV59BarOrdLin )
               {
                  AV64Hdr = ((GXutil.strcmp(AV57CliImpReop, httpContext.getMessage( "N", ""))==0) ? GXutil.str( A129BarCod, 8, 0) : ((A132BarCodReo==0) ? GXutil.str( A129BarCod, 8, 0) : GXutil.str( A129BarCod, 8, 0)+" "+GXutil.str( A132BarCodReo, 1, 0))) ;
                  AV65SiLineas = (short)(1) ;
                  AV61Numb = (short)(AV61Numb+1) ;
                  AV12ExcelDocument.Cells(AV10CellRow, 1, 1, 1).setText( GXutil.str( A1235BarNumCli, 6, 0)+"-"+GXutil.trim( A1234BarNomCli) );
                  AV12ExcelDocument.Cells(AV10CellRow, 2, 1, 1).setText( A143BarDisNum );
                  AV12ExcelDocument.Cells(AV10CellRow, 3, 1, 1).setText( GXutil.str( A136BarColNum, 6, 0)+"-"+GXutil.trim( A135BarColNom) );
                  AV12ExcelDocument.Cells(AV10CellRow, 4, 1, 1).setText( GXutil.trim( AV64Hdr) );
                  AV66Texto = ((GXutil.len( GXutil.trim( A2813MetPieCod))==9) ? GXutil.substring( A2813MetPieCod, 5, 5) : GXutil.trim( A2813MetPieCod)) ;
                  AV12ExcelDocument.Cells(AV10CellRow, 5, 1, 1).setText( GXutil.trim( AV66Texto) );
                  AV12ExcelDocument.Cells(AV10CellRow, 6, 1, 1).setText( A1652BarSerDsc+"-"+A1234BarNomCli );
                  AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2815MetPieMet)) );
                  AV66Texto = "" ;
                  AV12ExcelDocument.Cells(AV10CellRow, 8, 1, 1).setText( GXutil.trim( AV66Texto) );
                  AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2814MetPieKil)) );
                  AV10CellRow = (int)(AV10CellRow+1) ;
                  AV62TotK = AV62TotK.add(A2814MetPieKil) ;
                  AV63Totm = AV63Totm.add(A2815MetPieMet) ;
                  AV79Lmetpi = (short)(1) ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV12ExcelDocument.Cells(AV10CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63Totm)) );
            AV12ExcelDocument.Cells(AV10CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TotK)) );
            AV10CellRow = (int)(AV10CellRow+1) ;
            AV61Numb = (short)(0) ;
            AV62TotK = DecimalUtil.doubleToDec(0) ;
            AV63Totm = DecimalUtil.doubleToDec(0) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV12ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV12ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV69PATHPDF)==0) )
      {
         AV74file.setSource( GXutil.trim( AV69PATHPDF)+"PackingList"+"_"+GXutil.trim( AV72Archivo)+".xlsx" );
      }
      else
      {
         AV74file.setSource( "PackingList"+"_"+GXutil.trim( AV72Archivo)+".xlsx" );
      }
      if ( AV74file.exists() )
      {
         AV74file.delete();
      }
      AV13Filename = AV74file.getAbsoluteName() ;
      AV12ExcelDocument.setAutoFit( (short)(1) );
      AV12ExcelDocument.Open(AV13Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV70RutaAdjunto = AV13Filename ;
   }

   public void S161( )
   {
      /* 'APPLYTEMPLATE' Routine */
      returnInSub = false ;
      AV84Template = GXutil.format( httpContext.getMessage( "%1PackingList_Template.xlsx", ""), AV69PATHPDF, "", "", "", "", "", "", "", "") ;
      AV84Template = GXutil.strReplace( AV84Template, "\\", "\\\\") ;
      AV85Report = GXutil.strReplace( AV13Filename, "\\", "\\\\") ;
      AV82AppTool.applytemplateexcel(AV84Template, AV85Report, AV85Report);
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV12ExcelDocument.getErrCode() != 0 )
      {
         AV13Filename = "" ;
         AV11ErrorMessage = AV12ExcelDocument.getErrDescription() ;
         AV12ExcelDocument.Close();
      }
   }

   public void S122( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV58Ordlin = (short)(0) ;
      /* Using cursor P0A6Z4 */
      pr_default.execute(2, new Object[] {AV32Emprcod, Integer.valueOf(AV55BarCod), Byte.valueOf(AV56BarCodReo), AV68BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0A6Z4_A396EmprCod[0] ;
         A129BarCod = P0A6Z4_A129BarCod[0] ;
         A132BarCodReo = P0A6Z4_A132BarCodReo[0] ;
         A130BarCodPar = P0A6Z4_A130BarCodPar[0] ;
         A4917MetPieObs = P0A6Z4_A4917MetPieObs[0] ;
         A2813MetPieCod = P0A6Z4_A2813MetPieCod[0] ;
         A2809MetTerCod = P0A6Z4_A2809MetTerCod[0] ;
         AV58Ordlin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV59BarOrdLin = (short)(0) ;
      /* Using cursor P0A6Z5 */
      pr_default.execute(3, new Object[] {AV32Emprcod, Integer.valueOf(AV55BarCod), Byte.valueOf(AV56BarCodReo), AV68BarCodPar, Short.valueOf(AV58Ordlin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P0A6Z5_A457FasCod[0] ;
         A194BarOrdLin = P0A6Z5_A194BarOrdLin[0] ;
         A130BarCodPar = P0A6Z5_A130BarCodPar[0] ;
         A132BarCodReo = P0A6Z5_A132BarCodReo[0] ;
         A129BarCod = P0A6Z5_A129BarCod[0] ;
         A396EmprCod = P0A6Z5_A396EmprCod[0] ;
         A153BarFasEst = P0A6Z5_A153BarFasEst[0] ;
         A6011FasTip = P0A6Z5_A6011FasTip[0] ;
         n6011FasTip = P0A6Z5_n6011FasTip[0] ;
         A758ProCod = P0A6Z5_A758ProCod[0] ;
         A6011FasTip = P0A6Z5_A6011FasTip[0] ;
         n6011FasTip = P0A6Z5_n6011FasTip[0] ;
         if ( ( GXutil.strcmp(A6011FasTip, "S") == 0 ) && ( A153BarFasEst > 0 ) )
         {
            AV59BarOrdLin = A194BarOrdLin ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP6[0] = documentodetransporteproduccion_6.this.AV13Filename;
      this.aP7[0] = documentodetransporteproduccion_6.this.AV11ErrorMessage;
      this.aP8[0] = documentodetransporteproduccion_6.this.AV70RutaAdjunto;
      this.aP9[0] = documentodetransporteproduccion_6.this.AV79Lmetpi;
      CloseOpenCursors();
      AV12ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11ErrorMessage = "" ;
      AV70RutaAdjunto = "" ;
      AV69PATHPDF = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV72Archivo = "" ;
      AV77TotalK = DecimalUtil.ZERO ;
      AV78TotalM = DecimalUtil.ZERO ;
      AV62TotK = DecimalUtil.ZERO ;
      AV63Totm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0A6Z2_A252CliCod = new int[1] ;
      P0A6Z2_n252CliCod = new boolean[] {false} ;
      P0A6Z2_A1234BarNomCli = new String[] {""} ;
      P0A6Z2_A1235BarNumCli = new int[1] ;
      P0A6Z2_A143BarDisNum = new String[] {""} ;
      P0A6Z2_A135BarColNom = new String[] {""} ;
      P0A6Z2_A136BarColNum = new int[1] ;
      P0A6Z2_A1652BarSerDsc = new String[] {""} ;
      P0A6Z2_A130BarCodPar = new String[] {""} ;
      P0A6Z2_A132BarCodReo = new byte[1] ;
      P0A6Z2_A129BarCod = new int[1] ;
      P0A6Z2_A396EmprCod = new String[] {""} ;
      P0A6Z2_A30AlbProCod = new long[1] ;
      P0A6Z2_A13012CliImpReop = new String[] {""} ;
      P0A6Z2_A5291BarTipCor = new String[] {""} ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A13012CliImpReop = "" ;
      A5291BarTipCor = "" ;
      AV68BarCodPar = "" ;
      AV57CliImpReop = "" ;
      P0A6Z3_A396EmprCod = new String[] {""} ;
      P0A6Z3_A129BarCod = new int[1] ;
      P0A6Z3_A132BarCodReo = new byte[1] ;
      P0A6Z3_A130BarCodPar = new String[] {""} ;
      P0A6Z3_A4917MetPieObs = new String[] {""} ;
      P0A6Z3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6Z3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6Z3_A2813MetPieCod = new String[] {""} ;
      P0A6Z3_A2809MetTerCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV64Hdr = "" ;
      AV12ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV66Texto = "" ;
      AV74file = new com.genexus.util.GXFile();
      AV84Template = "" ;
      AV85Report = "" ;
      AV82AppTool = new app.SdtAppTool(remoteHandle, context);
      P0A6Z4_A396EmprCod = new String[] {""} ;
      P0A6Z4_A129BarCod = new int[1] ;
      P0A6Z4_A132BarCodReo = new byte[1] ;
      P0A6Z4_A130BarCodPar = new String[] {""} ;
      P0A6Z4_A4917MetPieObs = new String[] {""} ;
      P0A6Z4_A2813MetPieCod = new String[] {""} ;
      P0A6Z4_A2809MetTerCod = new String[] {""} ;
      P0A6Z5_A457FasCod = new String[] {""} ;
      P0A6Z5_A194BarOrdLin = new short[1] ;
      P0A6Z5_A130BarCodPar = new String[] {""} ;
      P0A6Z5_A132BarCodReo = new byte[1] ;
      P0A6Z5_A129BarCod = new int[1] ;
      P0A6Z5_A396EmprCod = new String[] {""} ;
      P0A6Z5_A153BarFasEst = new byte[1] ;
      P0A6Z5_A6011FasTip = new String[] {""} ;
      P0A6Z5_n6011FasTip = new boolean[] {false} ;
      P0A6Z5_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A6011FasTip = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_6__default(),
         new Object[] {
             new Object[] {
            P0A6Z2_A252CliCod, P0A6Z2_n252CliCod, P0A6Z2_A1234BarNomCli, P0A6Z2_A1235BarNumCli, P0A6Z2_A143BarDisNum, P0A6Z2_A135BarColNom, P0A6Z2_A136BarColNum, P0A6Z2_A1652BarSerDsc, P0A6Z2_A130BarCodPar, P0A6Z2_A132BarCodReo,
            P0A6Z2_A129BarCod, P0A6Z2_A396EmprCod, P0A6Z2_A30AlbProCod, P0A6Z2_A13012CliImpReop, P0A6Z2_A5291BarTipCor
            }
            , new Object[] {
            P0A6Z3_A396EmprCod, P0A6Z3_A129BarCod, P0A6Z3_A132BarCodReo, P0A6Z3_A130BarCodPar, P0A6Z3_A4917MetPieObs, P0A6Z3_A2815MetPieMet, P0A6Z3_A2814MetPieKil, P0A6Z3_A2813MetPieCod, P0A6Z3_A2809MetTerCod
            }
            , new Object[] {
            P0A6Z4_A396EmprCod, P0A6Z4_A129BarCod, P0A6Z4_A132BarCodReo, P0A6Z4_A130BarCodPar, P0A6Z4_A4917MetPieObs, P0A6Z4_A2813MetPieCod, P0A6Z4_A2809MetTerCod
            }
            , new Object[] {
            P0A6Z5_A457FasCod, P0A6Z5_A194BarOrdLin, P0A6Z5_A130BarCodPar, P0A6Z5_A132BarCodReo, P0A6Z5_A129BarCod, P0A6Z5_A396EmprCod, P0A6Z5_A153BarFasEst, P0A6Z5_A6011FasTip, P0A6Z5_n6011FasTip, P0A6Z5_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV56BarCodReo ;
   private byte A153BarFasEst ;
   private short AV54Cod_pais ;
   private short AV79Lmetpi ;
   private short AV83ret ;
   private short AV61Numb ;
   private short AV60ValNum ;
   private short AV59BarOrdLin ;
   private short AV65SiLineas ;
   private short AV58Ordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV75Clicod ;
   private int AV10CellRow ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV55BarCod ;
   private long AV44AlbProCodout ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV77TotalK ;
   private java.math.BigDecimal AV78TotalM ;
   private java.math.BigDecimal AV62TotK ;
   private java.math.BigDecimal AV63Totm ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String AV32Emprcod ;
   private String AV69PATHPDF ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A13012CliImpReop ;
   private String A5291BarTipCor ;
   private String AV68BarCodPar ;
   private String AV57CliImpReop ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV64Hdr ;
   private String AV66Texto ;
   private String A457FasCod ;
   private String A6011FasTip ;
   private String A758ProCod ;
   private java.util.Date AV71AlbProfch ;
   private boolean returnInSub ;
   private boolean AV80IsRegister ;
   private boolean n252CliCod ;
   private boolean n6011FasTip ;
   private String AV86Directory ;
   private String AV13Filename ;
   private String AV11ErrorMessage ;
   private String AV70RutaAdjunto ;
   private String AV72Archivo ;
   private String A4917MetPieObs ;
   private String AV84Template ;
   private String AV85Report ;
   private com.genexus.util.GXFile AV74file ;
   private short[] aP9 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A6Z2_A252CliCod ;
   private boolean[] P0A6Z2_n252CliCod ;
   private String[] P0A6Z2_A1234BarNomCli ;
   private int[] P0A6Z2_A1235BarNumCli ;
   private String[] P0A6Z2_A143BarDisNum ;
   private String[] P0A6Z2_A135BarColNom ;
   private int[] P0A6Z2_A136BarColNum ;
   private String[] P0A6Z2_A1652BarSerDsc ;
   private String[] P0A6Z2_A130BarCodPar ;
   private byte[] P0A6Z2_A132BarCodReo ;
   private int[] P0A6Z2_A129BarCod ;
   private String[] P0A6Z2_A396EmprCod ;
   private long[] P0A6Z2_A30AlbProCod ;
   private String[] P0A6Z2_A13012CliImpReop ;
   private String[] P0A6Z2_A5291BarTipCor ;
   private String[] P0A6Z3_A396EmprCod ;
   private int[] P0A6Z3_A129BarCod ;
   private byte[] P0A6Z3_A132BarCodReo ;
   private String[] P0A6Z3_A130BarCodPar ;
   private String[] P0A6Z3_A4917MetPieObs ;
   private java.math.BigDecimal[] P0A6Z3_A2815MetPieMet ;
   private java.math.BigDecimal[] P0A6Z3_A2814MetPieKil ;
   private String[] P0A6Z3_A2813MetPieCod ;
   private String[] P0A6Z3_A2809MetTerCod ;
   private String[] P0A6Z4_A396EmprCod ;
   private int[] P0A6Z4_A129BarCod ;
   private byte[] P0A6Z4_A132BarCodReo ;
   private String[] P0A6Z4_A130BarCodPar ;
   private String[] P0A6Z4_A4917MetPieObs ;
   private String[] P0A6Z4_A2813MetPieCod ;
   private String[] P0A6Z4_A2809MetTerCod ;
   private String[] P0A6Z5_A457FasCod ;
   private short[] P0A6Z5_A194BarOrdLin ;
   private String[] P0A6Z5_A130BarCodPar ;
   private byte[] P0A6Z5_A132BarCodReo ;
   private int[] P0A6Z5_A129BarCod ;
   private String[] P0A6Z5_A396EmprCod ;
   private byte[] P0A6Z5_A153BarFasEst ;
   private String[] P0A6Z5_A6011FasTip ;
   private boolean[] P0A6Z5_n6011FasTip ;
   private String[] P0A6Z5_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV12ExcelDocument ;
   private app.SdtAppTool AV82AppTool ;
}

final  class documentodetransporteproduccion_6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6Z2", "SELECT T2.CliCod, T2.BarNomCli, T2.BarNumCli, T2.BarDisNum, T2.BarColNom, T2.BarColNum, T2.BarSerDsc, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.AlbProCod, T3.CliImpReop, T2.BarTipCor FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6Z3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieMet, MetPieKil, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6Z4", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6Z5", "SELECT T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFasEst, T2.FasTip, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarOrdLin = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 13);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((long[]) buf[12])[0] = rslt.getLong(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

