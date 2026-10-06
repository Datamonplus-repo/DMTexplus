package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class packinglist_prc extends GXProcedure
{
   public packinglist_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( packinglist_prc.class ), "" );
   }

   public packinglist_prc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            String[] aP4 ,
                            String[] aP5 )
   {
      packinglist_prc.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 )
   {
      packinglist_prc.this.A396EmprCod = aP0;
      packinglist_prc.this.A129BarCod = aP1;
      packinglist_prc.this.A132BarCodReo = aP2;
      packinglist_prc.this.A130BarCodPar = aP3;
      packinglist_prc.this.aP4 = aP4;
      packinglist_prc.this.aP5 = aP5;
      packinglist_prc.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16CellRow = (short)(1) ;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16CellRow = (short)(2) ;
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV14Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "PackingList-" + GXutil.trim( GXutil.str( AV14Random, 8, 0)) + ".xlsx" ;
      AV15ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV15ExcelDocument.Clear();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV15ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV13ErrorMessage = AV15ExcelDocument.getErrDescription() ;
         AV15ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      /* Using cursor P0AAP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P0AAP2_A252CliCod[0] ;
         n252CliCod = P0AAP2_n252CliCod[0] ;
         A10301Cod_pais = P0AAP2_A10301Cod_pais[0] ;
         n10301Cod_pais = P0AAP2_n10301Cod_pais[0] ;
         A10301Cod_pais = P0AAP2_A10301Cod_pais[0] ;
         n10301Cod_pais = P0AAP2_n10301Cod_pais[0] ;
         AV10BarCod = A129BarCod ;
         AV11BarCodReo = A132BarCodReo ;
         AV8BarCodPar = A130BarCodPar ;
         AV20Cod_pais = A10301Cod_pais ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV16CellRow = (short)(1) ;
      AV17CellCol = (short)(1) ;
      while ( AV17CellCol <= 100 )
      {
         AV15ExcelDocument.Cells(AV16CellRow, AV17CellCol, 1, 1).setBold( (short)(1) );
         AV15ExcelDocument.Cells(AV16CellRow, AV17CellCol, 1, 1).setColor( 11 );
         AV17CellCol = (short)(AV17CellCol+1) ;
      }
      AV28Tit1 = httpContext.getMessage( "Référence", "") ;
      AV29Tit2 = httpContext.getMessage( "Commande", "") ;
      AV30Tit3 = httpContext.getMessage( "Couleur Bande Adhésive", "") ;
      AV31Tit4 = httpContext.getMessage( "Ordem de Serviço Número", "") ;
      AV32Tit5 = httpContext.getMessage( "Número Rouleaux", "") ;
      AV33Tit6 = httpContext.getMessage( "NºPartida Referência do Tear", "") ;
      AV34Tit7 = httpContext.getMessage( "Mètre", "") ;
      AV35Tit8 = httpContext.getMessage( "Poids Net", "") ;
      AV36Tit9 = httpContext.getMessage( "Poid Brut", "") ;
      /* Using cursor P0AAP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(AV20Cod_pais)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10323Ft_Cod = P0AAP3_A10323Ft_Cod[0] ;
         A10301Cod_pais = P0AAP3_A10301Cod_pais[0] ;
         n10301Cod_pais = P0AAP3_n10301Cod_pais[0] ;
         A10325Ft_it1 = P0AAP3_A10325Ft_it1[0] ;
         n10325Ft_it1 = P0AAP3_n10325Ft_it1[0] ;
         A10326Ft_it2 = P0AAP3_A10326Ft_it2[0] ;
         n10326Ft_it2 = P0AAP3_n10326Ft_it2[0] ;
         A10327Ft_it3 = P0AAP3_A10327Ft_it3[0] ;
         n10327Ft_it3 = P0AAP3_n10327Ft_it3[0] ;
         A10328Ft_it4 = P0AAP3_A10328Ft_it4[0] ;
         n10328Ft_it4 = P0AAP3_n10328Ft_it4[0] ;
         A10329Ft_it5 = P0AAP3_A10329Ft_it5[0] ;
         n10329Ft_it5 = P0AAP3_n10329Ft_it5[0] ;
         A10330Ft_it6 = P0AAP3_A10330Ft_it6[0] ;
         n10330Ft_it6 = P0AAP3_n10330Ft_it6[0] ;
         A10331Ft_it7 = P0AAP3_A10331Ft_it7[0] ;
         n10331Ft_it7 = P0AAP3_n10331Ft_it7[0] ;
         A10332Ft_it8 = P0AAP3_A10332Ft_it8[0] ;
         n10332Ft_it8 = P0AAP3_n10332Ft_it8[0] ;
         A10333Ft_it9 = P0AAP3_A10333Ft_it9[0] ;
         n10333Ft_it9 = P0AAP3_n10333Ft_it9[0] ;
         AV28Tit1 = A10325Ft_it1 ;
         AV29Tit2 = A10326Ft_it2 ;
         AV30Tit3 = A10327Ft_it3 ;
         AV31Tit4 = A10328Ft_it4 ;
         AV32Tit5 = A10329Ft_it5 ;
         AV33Tit6 = A10330Ft_it6 ;
         AV34Tit7 = A10331Ft_it7 ;
         AV35Tit8 = A10332Ft_it8 ;
         AV36Tit9 = A10333Ft_it9 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV15ExcelDocument.Cells(1, 1, 1, 1).setText( AV28Tit1 );
      AV15ExcelDocument.Cells(1, 2, 1, 1).setText( AV29Tit2 );
      AV15ExcelDocument.Cells(1, 3, 1, 1).setText( AV30Tit3 );
      AV15ExcelDocument.Cells(1, 4, 1, 1).setText( AV31Tit4 );
      AV15ExcelDocument.Cells(1, 5, 1, 1).setText( AV32Tit5 );
      AV15ExcelDocument.Cells(1, 6, 1, 1).setText( AV33Tit6 );
      AV15ExcelDocument.Cells(1, 7, 1, 1).setText( AV34Tit7 );
      AV15ExcelDocument.Cells(1, 8, 1, 1).setText( AV35Tit8 );
      AV15ExcelDocument.Cells(1, 9, 1, 1).setText( AV36Tit9 );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV27numr = (short)(0) ;
      AV21SiLineas = (short)(0) ;
      /* Using cursor P0AAP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1234BarNomCli = P0AAP4_A1234BarNomCli[0] ;
         A1235BarNumCli = P0AAP4_A1235BarNumCli[0] ;
         A143BarDisNum = P0AAP4_A143BarDisNum[0] ;
         A135BarColNom = P0AAP4_A135BarColNom[0] ;
         A136BarColNum = P0AAP4_A136BarColNum[0] ;
         A1652BarSerDsc = P0AAP4_A1652BarSerDsc[0] ;
         AV10BarCod = A129BarCod ;
         AV11BarCodReo = A132BarCodReo ;
         AV8BarCodPar = A130BarCodPar ;
         /* Execute user subroutine: 'BARFAS' */
         S154 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV22Numb = (short)(0) ;
         AV25TotK = DecimalUtil.doubleToDec(0) ;
         AV26Totm = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AAP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4917MetPieObs = P0AAP5_A4917MetPieObs[0] ;
            A2815MetPieMet = P0AAP5_A2815MetPieMet[0] ;
            A2814MetPieKil = P0AAP5_A2814MetPieKil[0] ;
            A2813MetPieCod = P0AAP5_A2813MetPieCod[0] ;
            A2809MetTerCod = P0AAP5_A2809MetTerCod[0] ;
            AV23ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
            if ( AV23ValNum == AV19BarOrdLin )
            {
               AV21SiLineas = (short)(1) ;
               AV22Numb = (short)(AV22Numb+1) ;
               AV15ExcelDocument.Cells(AV16CellRow, 1, 1, 1).setText( GXutil.str( A1235BarNumCli, 6, 0)+"-"+GXutil.trim( A1234BarNomCli) );
               AV15ExcelDocument.Cells(AV16CellRow, 2, 1, 1).setText( A143BarDisNum );
               AV15ExcelDocument.Cells(AV16CellRow, 3, 1, 1).setText( GXutil.str( A136BarColNum, 6, 0)+"-"+GXutil.trim( A135BarColNom) );
               AV15ExcelDocument.Cells(AV16CellRow, 4, 1, 1).setNumber( A129BarCod );
               AV24Texto = ((GXutil.len( GXutil.trim( A2813MetPieCod))==9) ? GXutil.substring( A2813MetPieCod, 5, 5) : GXutil.trim( A2813MetPieCod)) ;
               AV15ExcelDocument.Cells(AV16CellRow, 5, 1, 1).setText( AV24Texto );
               AV15ExcelDocument.Cells(AV16CellRow, 6, 1, 1).setText( GXutil.trim( A1652BarSerDsc)+"-"+GXutil.trim( A1234BarNomCli) );
               AV15ExcelDocument.Cells(AV16CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2815MetPieMet)) );
               AV15ExcelDocument.Cells(AV16CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2814MetPieKil)) );
               AV16CellRow = (short)(AV16CellRow+1) ;
               AV25TotK = AV25TotK.add(A2814MetPieKil) ;
               AV26Totm = AV26Totm.add(A2815MetPieMet) ;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV15ExcelDocument.Cells(AV16CellRow, 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26Totm)) );
         AV15ExcelDocument.Cells(AV16CellRow, 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25TotK)) );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV15ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV15ExcelDocument.Close();
   }

   public void S154( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV18Ordlin = (short)(0) ;
      /* Using cursor P0AAP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV8BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4917MetPieObs = P0AAP6_A4917MetPieObs[0] ;
         A2813MetPieCod = P0AAP6_A2813MetPieCod[0] ;
         A2809MetTerCod = P0AAP6_A2809MetTerCod[0] ;
         AV18Ordlin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV19BarOrdLin = (short)(0) ;
      /* Using cursor P0AAP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV8BarCodPar, Short.valueOf(AV18Ordlin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A457FasCod = P0AAP7_A457FasCod[0] ;
         A194BarOrdLin = P0AAP7_A194BarOrdLin[0] ;
         A153BarFasEst = P0AAP7_A153BarFasEst[0] ;
         A6011FasTip = P0AAP7_A6011FasTip[0] ;
         n6011FasTip = P0AAP7_n6011FasTip[0] ;
         A758ProCod = P0AAP7_A758ProCod[0] ;
         A6011FasTip = P0AAP7_A6011FasTip[0] ;
         n6011FasTip = P0AAP7_n6011FasTip[0] ;
         if ( ( GXutil.strcmp(A6011FasTip, "S") == 0 ) && ( A153BarFasEst > 0 ) )
         {
            AV19BarOrdLin = A194BarOrdLin ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP4[0] = packinglist_prc.this.AV12Filename;
      this.aP5[0] = packinglist_prc.this.AV13ErrorMessage;
      this.aP6[0] = packinglist_prc.this.AV21SiLineas;
      CloseOpenCursors();
      AV15ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV13ErrorMessage = "" ;
      AV15ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0AAP2_A252CliCod = new int[1] ;
      P0AAP2_n252CliCod = new boolean[] {false} ;
      P0AAP2_A396EmprCod = new String[] {""} ;
      P0AAP2_A129BarCod = new int[1] ;
      P0AAP2_A132BarCodReo = new byte[1] ;
      P0AAP2_A130BarCodPar = new String[] {""} ;
      P0AAP2_A10301Cod_pais = new short[1] ;
      P0AAP2_n10301Cod_pais = new boolean[] {false} ;
      AV8BarCodPar = "" ;
      AV28Tit1 = "" ;
      AV29Tit2 = "" ;
      AV30Tit3 = "" ;
      AV31Tit4 = "" ;
      AV32Tit5 = "" ;
      AV33Tit6 = "" ;
      AV34Tit7 = "" ;
      AV35Tit8 = "" ;
      AV36Tit9 = "" ;
      P0AAP3_A396EmprCod = new String[] {""} ;
      P0AAP3_A10323Ft_Cod = new String[] {""} ;
      P0AAP3_A10301Cod_pais = new short[1] ;
      P0AAP3_n10301Cod_pais = new boolean[] {false} ;
      P0AAP3_A10325Ft_it1 = new String[] {""} ;
      P0AAP3_n10325Ft_it1 = new boolean[] {false} ;
      P0AAP3_A10326Ft_it2 = new String[] {""} ;
      P0AAP3_n10326Ft_it2 = new boolean[] {false} ;
      P0AAP3_A10327Ft_it3 = new String[] {""} ;
      P0AAP3_n10327Ft_it3 = new boolean[] {false} ;
      P0AAP3_A10328Ft_it4 = new String[] {""} ;
      P0AAP3_n10328Ft_it4 = new boolean[] {false} ;
      P0AAP3_A10329Ft_it5 = new String[] {""} ;
      P0AAP3_n10329Ft_it5 = new boolean[] {false} ;
      P0AAP3_A10330Ft_it6 = new String[] {""} ;
      P0AAP3_n10330Ft_it6 = new boolean[] {false} ;
      P0AAP3_A10331Ft_it7 = new String[] {""} ;
      P0AAP3_n10331Ft_it7 = new boolean[] {false} ;
      P0AAP3_A10332Ft_it8 = new String[] {""} ;
      P0AAP3_n10332Ft_it8 = new boolean[] {false} ;
      P0AAP3_A10333Ft_it9 = new String[] {""} ;
      P0AAP3_n10333Ft_it9 = new boolean[] {false} ;
      A10323Ft_Cod = "" ;
      A10325Ft_it1 = "" ;
      A10326Ft_it2 = "" ;
      A10327Ft_it3 = "" ;
      A10328Ft_it4 = "" ;
      A10329Ft_it5 = "" ;
      A10330Ft_it6 = "" ;
      A10331Ft_it7 = "" ;
      A10332Ft_it8 = "" ;
      A10333Ft_it9 = "" ;
      P0AAP4_A396EmprCod = new String[] {""} ;
      P0AAP4_A129BarCod = new int[1] ;
      P0AAP4_A132BarCodReo = new byte[1] ;
      P0AAP4_A130BarCodPar = new String[] {""} ;
      P0AAP4_A1234BarNomCli = new String[] {""} ;
      P0AAP4_A1235BarNumCli = new int[1] ;
      P0AAP4_A143BarDisNum = new String[] {""} ;
      P0AAP4_A135BarColNom = new String[] {""} ;
      P0AAP4_A136BarColNum = new int[1] ;
      P0AAP4_A1652BarSerDsc = new String[] {""} ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      AV25TotK = DecimalUtil.ZERO ;
      AV26Totm = DecimalUtil.ZERO ;
      P0AAP5_A396EmprCod = new String[] {""} ;
      P0AAP5_A129BarCod = new int[1] ;
      P0AAP5_A132BarCodReo = new byte[1] ;
      P0AAP5_A130BarCodPar = new String[] {""} ;
      P0AAP5_A4917MetPieObs = new String[] {""} ;
      P0AAP5_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAP5_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAP5_A2813MetPieCod = new String[] {""} ;
      P0AAP5_A2809MetTerCod = new String[] {""} ;
      A4917MetPieObs = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV24Texto = "" ;
      P0AAP6_A396EmprCod = new String[] {""} ;
      P0AAP6_A129BarCod = new int[1] ;
      P0AAP6_A132BarCodReo = new byte[1] ;
      P0AAP6_A130BarCodPar = new String[] {""} ;
      P0AAP6_A4917MetPieObs = new String[] {""} ;
      P0AAP6_A2813MetPieCod = new String[] {""} ;
      P0AAP6_A2809MetTerCod = new String[] {""} ;
      P0AAP7_A457FasCod = new String[] {""} ;
      P0AAP7_A396EmprCod = new String[] {""} ;
      P0AAP7_A194BarOrdLin = new short[1] ;
      P0AAP7_A130BarCodPar = new String[] {""} ;
      P0AAP7_A132BarCodReo = new byte[1] ;
      P0AAP7_A129BarCod = new int[1] ;
      P0AAP7_A153BarFasEst = new byte[1] ;
      P0AAP7_A6011FasTip = new String[] {""} ;
      P0AAP7_n6011FasTip = new boolean[] {false} ;
      P0AAP7_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A6011FasTip = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.packinglist_prc__default(),
         new Object[] {
             new Object[] {
            P0AAP2_A252CliCod, P0AAP2_n252CliCod, P0AAP2_A396EmprCod, P0AAP2_A129BarCod, P0AAP2_A132BarCodReo, P0AAP2_A130BarCodPar, P0AAP2_A10301Cod_pais, P0AAP2_n10301Cod_pais
            }
            , new Object[] {
            P0AAP3_A396EmprCod, P0AAP3_A10323Ft_Cod, P0AAP3_A10301Cod_pais, P0AAP3_A10325Ft_it1, P0AAP3_n10325Ft_it1, P0AAP3_A10326Ft_it2, P0AAP3_n10326Ft_it2, P0AAP3_A10327Ft_it3, P0AAP3_n10327Ft_it3, P0AAP3_A10328Ft_it4,
            P0AAP3_n10328Ft_it4, P0AAP3_A10329Ft_it5, P0AAP3_n10329Ft_it5, P0AAP3_A10330Ft_it6, P0AAP3_n10330Ft_it6, P0AAP3_A10331Ft_it7, P0AAP3_n10331Ft_it7, P0AAP3_A10332Ft_it8, P0AAP3_n10332Ft_it8, P0AAP3_A10333Ft_it9,
            P0AAP3_n10333Ft_it9
            }
            , new Object[] {
            P0AAP4_A396EmprCod, P0AAP4_A129BarCod, P0AAP4_A132BarCodReo, P0AAP4_A130BarCodPar, P0AAP4_A1234BarNomCli, P0AAP4_A1235BarNumCli, P0AAP4_A143BarDisNum, P0AAP4_A135BarColNom, P0AAP4_A136BarColNum, P0AAP4_A1652BarSerDsc
            }
            , new Object[] {
            P0AAP5_A396EmprCod, P0AAP5_A129BarCod, P0AAP5_A132BarCodReo, P0AAP5_A130BarCodPar, P0AAP5_A4917MetPieObs, P0AAP5_A2815MetPieMet, P0AAP5_A2814MetPieKil, P0AAP5_A2813MetPieCod, P0AAP5_A2809MetTerCod
            }
            , new Object[] {
            P0AAP6_A396EmprCod, P0AAP6_A129BarCod, P0AAP6_A132BarCodReo, P0AAP6_A130BarCodPar, P0AAP6_A4917MetPieObs, P0AAP6_A2813MetPieCod, P0AAP6_A2809MetTerCod
            }
            , new Object[] {
            P0AAP7_A457FasCod, P0AAP7_A396EmprCod, P0AAP7_A194BarOrdLin, P0AAP7_A130BarCodPar, P0AAP7_A132BarCodReo, P0AAP7_A129BarCod, P0AAP7_A153BarFasEst, P0AAP7_A6011FasTip, P0AAP7_n6011FasTip, P0AAP7_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11BarCodReo ;
   private byte A153BarFasEst ;
   private short AV21SiLineas ;
   private short AV16CellRow ;
   private short A10301Cod_pais ;
   private short AV20Cod_pais ;
   private short AV17CellCol ;
   private short AV27numr ;
   private short AV22Numb ;
   private short AV23ValNum ;
   private short AV19BarOrdLin ;
   private short AV18Ordlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV14Random ;
   private int A252CliCod ;
   private int AV10BarCod ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private java.math.BigDecimal AV25TotK ;
   private java.math.BigDecimal AV26Totm ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String AV8BarCodPar ;
   private String AV28Tit1 ;
   private String AV29Tit2 ;
   private String AV30Tit3 ;
   private String AV31Tit4 ;
   private String AV32Tit5 ;
   private String AV33Tit6 ;
   private String AV34Tit7 ;
   private String AV35Tit8 ;
   private String AV36Tit9 ;
   private String A10323Ft_Cod ;
   private String A10325Ft_it1 ;
   private String A10326Ft_it2 ;
   private String A10327Ft_it3 ;
   private String A10328Ft_it4 ;
   private String A10329Ft_it5 ;
   private String A10330Ft_it6 ;
   private String A10331Ft_it7 ;
   private String A10332Ft_it8 ;
   private String A10333Ft_it9 ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV24Texto ;
   private String A457FasCod ;
   private String A6011FasTip ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n10301Cod_pais ;
   private boolean n10325Ft_it1 ;
   private boolean n10326Ft_it2 ;
   private boolean n10327Ft_it3 ;
   private boolean n10328Ft_it4 ;
   private boolean n10329Ft_it5 ;
   private boolean n10330Ft_it6 ;
   private boolean n10331Ft_it7 ;
   private boolean n10332Ft_it8 ;
   private boolean n10333Ft_it9 ;
   private boolean n6011FasTip ;
   private String AV12Filename ;
   private String AV13ErrorMessage ;
   private String A4917MetPieObs ;
   private short[] aP6 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AAP2_A252CliCod ;
   private boolean[] P0AAP2_n252CliCod ;
   private String[] P0AAP2_A396EmprCod ;
   private int[] P0AAP2_A129BarCod ;
   private byte[] P0AAP2_A132BarCodReo ;
   private String[] P0AAP2_A130BarCodPar ;
   private short[] P0AAP2_A10301Cod_pais ;
   private boolean[] P0AAP2_n10301Cod_pais ;
   private String[] P0AAP3_A396EmprCod ;
   private String[] P0AAP3_A10323Ft_Cod ;
   private short[] P0AAP3_A10301Cod_pais ;
   private boolean[] P0AAP3_n10301Cod_pais ;
   private String[] P0AAP3_A10325Ft_it1 ;
   private boolean[] P0AAP3_n10325Ft_it1 ;
   private String[] P0AAP3_A10326Ft_it2 ;
   private boolean[] P0AAP3_n10326Ft_it2 ;
   private String[] P0AAP3_A10327Ft_it3 ;
   private boolean[] P0AAP3_n10327Ft_it3 ;
   private String[] P0AAP3_A10328Ft_it4 ;
   private boolean[] P0AAP3_n10328Ft_it4 ;
   private String[] P0AAP3_A10329Ft_it5 ;
   private boolean[] P0AAP3_n10329Ft_it5 ;
   private String[] P0AAP3_A10330Ft_it6 ;
   private boolean[] P0AAP3_n10330Ft_it6 ;
   private String[] P0AAP3_A10331Ft_it7 ;
   private boolean[] P0AAP3_n10331Ft_it7 ;
   private String[] P0AAP3_A10332Ft_it8 ;
   private boolean[] P0AAP3_n10332Ft_it8 ;
   private String[] P0AAP3_A10333Ft_it9 ;
   private boolean[] P0AAP3_n10333Ft_it9 ;
   private String[] P0AAP4_A396EmprCod ;
   private int[] P0AAP4_A129BarCod ;
   private byte[] P0AAP4_A132BarCodReo ;
   private String[] P0AAP4_A130BarCodPar ;
   private String[] P0AAP4_A1234BarNomCli ;
   private int[] P0AAP4_A1235BarNumCli ;
   private String[] P0AAP4_A143BarDisNum ;
   private String[] P0AAP4_A135BarColNom ;
   private int[] P0AAP4_A136BarColNum ;
   private String[] P0AAP4_A1652BarSerDsc ;
   private String[] P0AAP5_A396EmprCod ;
   private int[] P0AAP5_A129BarCod ;
   private byte[] P0AAP5_A132BarCodReo ;
   private String[] P0AAP5_A130BarCodPar ;
   private String[] P0AAP5_A4917MetPieObs ;
   private java.math.BigDecimal[] P0AAP5_A2815MetPieMet ;
   private java.math.BigDecimal[] P0AAP5_A2814MetPieKil ;
   private String[] P0AAP5_A2813MetPieCod ;
   private String[] P0AAP5_A2809MetTerCod ;
   private String[] P0AAP6_A396EmprCod ;
   private int[] P0AAP6_A129BarCod ;
   private byte[] P0AAP6_A132BarCodReo ;
   private String[] P0AAP6_A130BarCodPar ;
   private String[] P0AAP6_A4917MetPieObs ;
   private String[] P0AAP6_A2813MetPieCod ;
   private String[] P0AAP6_A2809MetTerCod ;
   private String[] P0AAP7_A457FasCod ;
   private String[] P0AAP7_A396EmprCod ;
   private short[] P0AAP7_A194BarOrdLin ;
   private String[] P0AAP7_A130BarCodPar ;
   private byte[] P0AAP7_A132BarCodReo ;
   private int[] P0AAP7_A129BarCod ;
   private byte[] P0AAP7_A153BarFasEst ;
   private String[] P0AAP7_A6011FasTip ;
   private boolean[] P0AAP7_n6011FasTip ;
   private String[] P0AAP7_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV15ExcelDocument ;
}

final  class packinglist_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAP2", "SELECT T1.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.Cod_pais FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AAP3", "SELECT EmprCod, Ft_Cod, Cod_pais, Ft_it1, Ft_it2, Ft_it3, Ft_it4, Ft_it5, Ft_it6, Ft_it7, Ft_it8, Ft_it9 FROM TXPTR0600 WHERE EmprCod = ? and Cod_pais = ? and Ft_Cod = '1' ORDER BY EmprCod, Cod_pais, Ft_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AAP4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNomCli, BarNumCli, BarDisNum, BarColNom, BarColNum, BarSerDsc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AAP5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieMet, MetPieKil, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAP6", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieObs, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AAP7", "SELECT T1.FasCod, T1.EmprCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasEst, T2.FasTip, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarOrdLin = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               return;
            case 3 :
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
      }
   }

}

