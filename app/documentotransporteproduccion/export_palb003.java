package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class export_palb003 extends GXProcedure
{
   public export_palb003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( export_palb003.class ), "" );
   }

   public export_palb003( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             int[] aP17 ,
                             int[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             int[] aP22 ,
                             int[] aP23 ,
                             String[] aP24 ,
                             String[] aP25 ,
                             byte[] aP26 ,
                             byte[] aP27 ,
                             long[] aP28 ,
                             long[] aP29 ,
                             short[] aP30 ,
                             short[] aP31 ,
                             String[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 )
   {
      export_palb003.this.aP35 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35);
      return aP35[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        int[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        int[] aP17 ,
                        int[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 ,
                        int[] aP22 ,
                        int[] aP23 ,
                        String[] aP24 ,
                        String[] aP25 ,
                        byte[] aP26 ,
                        byte[] aP27 ,
                        long[] aP28 ,
                        long[] aP29 ,
                        short[] aP30 ,
                        short[] aP31 ,
                        String[] aP32 ,
                        String[] aP33 ,
                        String[] aP34 ,
                        String[] aP35 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             int[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             int[] aP17 ,
                             int[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 ,
                             int[] aP22 ,
                             int[] aP23 ,
                             String[] aP24 ,
                             String[] aP25 ,
                             byte[] aP26 ,
                             byte[] aP27 ,
                             long[] aP28 ,
                             long[] aP29 ,
                             short[] aP30 ,
                             short[] aP31 ,
                             String[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 )
   {
      export_palb003.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      export_palb003.this.AV64ImpCod = aP1[0];
      this.aP1 = aP1;
      export_palb003.this.AV78Prio = aP2[0];
      this.aP2 = aP2;
      export_palb003.this.AV74PCliCod = aP3[0];
      this.aP3 = aP3;
      export_palb003.this.AV107UCliCod = aP4[0];
      this.aP4 = aP4;
      export_palb003.this.AV76PFecha = aP5[0];
      this.aP5 = aP5;
      export_palb003.this.AV109UFecha = aP6[0];
      this.aP6 = aP6;
      export_palb003.this.AV73PBarSer = aP7[0];
      this.aP7 = aP7;
      export_palb003.this.AV106UBarSer = aP8[0];
      this.aP8 = aP8;
      export_palb003.this.AV75PDisNum = aP9[0];
      this.aP9 = aP9;
      export_palb003.this.AV108UDisNum = aP10[0];
      this.aP10 = aP10;
      export_palb003.this.AV63Fuente = aP11[0];
      this.aP11 = aP11;
      export_palb003.this.AV23Barcodi = aP12[0];
      this.aP12 = aP12;
      export_palb003.this.AV27Barcodreof = aP13[0];
      this.aP13 = aP13;
      export_palb003.this.AV25Barcodparf = aP14[0];
      this.aP14 = aP14;
      export_palb003.this.AV30Barcolnomi = aP15[0];
      this.aP15 = aP15;
      export_palb003.this.AV29Barcolnomf = aP16[0];
      this.aP16 = aP16;
      export_palb003.this.AV33Barcolnumi = aP17[0];
      this.aP17 = aP17;
      export_palb003.this.AV32Barcolnumf = aP18[0];
      this.aP18 = aP18;
      export_palb003.this.AV41BarMaqEst1 = aP19[0];
      this.aP19 = aP19;
      export_palb003.this.AV42BarMaqEst2 = aP20[0];
      this.aP20 = aP20;
      export_palb003.this.AV80Serie = aP21[0];
      this.aP21 = aP21;
      export_palb003.this.AV71Nfi = aP22[0];
      this.aP22 = aP22;
      export_palb003.this.AV70Nff = aP23[0];
      this.aP23 = aP23;
      export_palb003.this.AV39Barlar = aP24[0];
      this.aP24 = aP24;
      export_palb003.this.AV87Tipdiscod = aP25[0];
      this.aP25 = aP25;
      export_palb003.this.AV35Barestreo = aP26[0];
      this.aP26 = aP26;
      export_palb003.this.AV58DetalleRollos = aP27[0];
      this.aP27 = aP27;
      export_palb003.this.AV17AlbProCod1 = aP28[0];
      this.aP28 = aP28;
      export_palb003.this.AV16Albprocod_to = aP29[0];
      this.aP29 = aP29;
      export_palb003.this.AV48Bartipart = aP30[0];
      this.aP30 = aP30;
      export_palb003.this.AV49Bartipart_to = aP31[0];
      this.aP31 = aP31;
      export_palb003.this.AV18BarAcaQuifrom = aP32[0];
      this.aP32 = aP32;
      export_palb003.this.AV19BarAcaQuito = aP33[0];
      this.aP33 = aP33;
      export_palb003.this.aP34 = aP34;
      export_palb003.this.aP35 = aP35;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV68Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      export_palb003.this.GXt_int1 = GXv_int2[0] ;
      AV68Moda21 = GXt_int1 ;
      /* Using cursor P0ASQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P0ASQ2_A407EmprNom[0] ;
         n407EmprNom = P0ASQ2_n407EmprNom[0] ;
         AV72NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV88TipDisDsc = httpContext.getMessage( "Todo", "") ;
      /* Using cursor P0ASQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV87Tipdiscod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5098TipDisCod = P0ASQ3_A5098TipDisCod[0] ;
         A5097TipDisDsc = P0ASQ3_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P0ASQ3_n5097TipDisDsc[0] ;
         AV88TipDisDsc = A5097TipDisDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV35Barestreo == 0 )
      {
         AV89TipProd = httpContext.getMessage( "Prod Normal", "") ;
      }
      else if ( AV35Barestreo == 1 )
      {
         AV89TipProd = httpContext.getMessage( "Prod NC", "") ;
      }
      else if ( AV35Barestreo == 2 )
      {
         AV89TipProd = httpContext.getMessage( "Prod RC", "") ;
      }
      else if ( AV35Barestreo == 9 )
      {
         AV89TipProd = httpContext.getMessage( "Todo", "") ;
      }
      AV37Barestreoi = (byte)(0) ;
      AV36BarEstreof = (byte)(2) ;
      if ( AV35Barestreo == 2 )
      {
         AV37Barestreoi = (byte)(2) ;
         AV36BarEstreof = (byte)(2) ;
      }
      if ( AV35Barestreo == 1 )
      {
         AV37Barestreoi = (byte)(1) ;
         AV36BarEstreof = (byte)(1) ;
      }
      if ( AV35Barestreo == 0 )
      {
         AV37Barestreoi = (byte)(0) ;
         AV36BarEstreof = (byte)(0) ;
      }
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
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
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(1, 1, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(1, 1, 1, 1).setText( AV88TipDisDsc );
      AV11ExcelDocument.Cells(1, 3, 1, 1).setBold( (short)(1) );
      AV11ExcelDocument.Cells(1, 3, 1, 1).setColor( 11 );
      AV11ExcelDocument.Cells(1, 3, 1, 1).setText( AV89TipProd );
      AV9CellRow = 2 ;
      AV8CellCol = 1 ;
      while ( AV8CellCol <= 50 )
      {
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setBold( (short)(1) );
         AV11ExcelDocument.Cells(AV9CellRow, AV8CellCol, 1, 1).setColor( 11 );
         AV8CellCol = (int)(AV8CellCol+1) ;
      }
      AV11ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV11ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV11ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Albaran", "") );
      AV11ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV11ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Ped. Cli.", "") );
      AV11ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Fecha Ped. Cli.", "") );
      AV11ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Nº HDR", "") );
      AV11ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV11ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Color Cli.", "") );
      AV11ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV11ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV11ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Kgs. Crudo", "") );
      AV11ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Kgs. Ent.", "") );
      AV11ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Mts. Ent.", "") );
      AV11ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Pzs. Ent.", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV67last_clicod = 0 ;
      AV91TotKilC = DecimalUtil.doubleToDec(0) ;
      AV97TotMetC = DecimalUtil.doubleToDec(0) ;
      AV101TotPieC = 0 ;
      AV95totkilocrudoc = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ASQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV74PCliCod), Long.valueOf(AV17AlbProCod1), AV76PFecha, AV109UFecha, AV78Prio, AV78Prio, Long.valueOf(AV16Albprocod_to), Integer.valueOf(AV107UCliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A34AlbProfch = P0ASQ4_A34AlbProfch[0] ;
         A30AlbProCod = P0ASQ4_A30AlbProCod[0] ;
         A5140AlbMarca = P0ASQ4_A5140AlbMarca[0] ;
         A39AlbProPri = P0ASQ4_A39AlbProPri[0] ;
         A1243GuiRemCli = P0ASQ4_A1243GuiRemCli[0] ;
         if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) != 0 )
         {
            AV50CliCod = A1243GuiRemCli ;
            /* Execute user subroutine: 'CLIENTE' */
            S134 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            if ( ( AV67last_clicod != AV50CliCod ) && ( AV67last_clicod > 0 ) )
            {
               AV9CellRow = (int)(AV9CellRow+1) ;
               AV11ExcelDocument.Cells(AV9CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TotKilC)) );
               AV11ExcelDocument.Cells(AV9CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV97TotMetC)) );
               AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setNumber( AV101TotPieC );
               AV9CellRow = (int)(AV9CellRow+1) ;
               AV91TotKilC = DecimalUtil.doubleToDec(0) ;
               AV97TotMetC = DecimalUtil.doubleToDec(0) ;
               AV101TotPieC = 0 ;
               AV95totkilocrudoc = DecimalUtil.doubleToDec(0) ;
            }
            /* Using cursor P0ASQ6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV73PBarSer, AV106UBarSer, AV75PDisNum, AV108UDisNum, AV30Barcolnomi, AV29Barcolnomf, Integer.valueOf(AV33Barcolnumi), Integer.valueOf(AV32Barcolnumf), Integer.valueOf(AV23Barcodi), Integer.valueOf(AV23Barcodi), Byte.valueOf(AV27Barcodreof), Byte.valueOf(AV27Barcodreof), AV25Barcodparf, AV25Barcodparf, Byte.valueOf(AV37Barestreoi), Byte.valueOf(AV36BarEstreof), AV87Tipdiscod, AV87Tipdiscod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A2010BarTipDis = P0ASQ6_A2010BarTipDis[0] ;
               A148BarEstReo = P0ASQ6_A148BarEstReo[0] ;
               A136BarColNum = P0ASQ6_A136BarColNum[0] ;
               A135BarColNom = P0ASQ6_A135BarColNom[0] ;
               A212BarSer = P0ASQ6_A212BarSer[0] ;
               A1261BarAlbKgmE = P0ASQ6_A1261BarAlbKgmE[0] ;
               A1263BarAlbMtrE = P0ASQ6_A1263BarAlbMtrE[0] ;
               A2243BarKgsCli = P0ASQ6_A2243BarKgsCli[0] ;
               n2243BarKgsCli = P0ASQ6_n2243BarKgsCli[0] ;
               A1461BarAlbPN = P0ASQ6_A1461BarAlbPN[0] ;
               A1234BarNomCli = P0ASQ6_A1234BarNomCli[0] ;
               A155BarFecCli = P0ASQ6_A155BarFecCli[0] ;
               A1265BarAlbPie = P0ASQ6_A1265BarAlbPie[0] ;
               A166BarKgm = P0ASQ6_A166BarKgm[0] ;
               n166BarKgm = P0ASQ6_n166BarKgm[0] ;
               A130BarCodPar = P0ASQ6_A130BarCodPar[0] ;
               A132BarCodReo = P0ASQ6_A132BarCodReo[0] ;
               A129BarCod = P0ASQ6_A129BarCod[0] ;
               A143BarDisNum = P0ASQ6_A143BarDisNum[0] ;
               A4812BarEncCli = P0ASQ6_A4812BarEncCli[0] ;
               A2010BarTipDis = P0ASQ6_A2010BarTipDis[0] ;
               A148BarEstReo = P0ASQ6_A148BarEstReo[0] ;
               A136BarColNum = P0ASQ6_A136BarColNum[0] ;
               A135BarColNom = P0ASQ6_A135BarColNom[0] ;
               A212BarSer = P0ASQ6_A212BarSer[0] ;
               A1234BarNomCli = P0ASQ6_A1234BarNomCli[0] ;
               A155BarFecCli = P0ASQ6_A155BarFecCli[0] ;
               A143BarDisNum = P0ASQ6_A143BarDisNum[0] ;
               A4812BarEncCli = P0ASQ6_A4812BarEncCli[0] ;
               A166BarKgm = P0ASQ6_A166BarKgm[0] ;
               n166BarKgm = P0ASQ6_n166BarKgm[0] ;
               GXt_char3 = A13878PedidoClie ;
               GXv_char4[0] = A396EmprCod ;
               GXv_char5[0] = A4812BarEncCli ;
               GXv_char6[0] = A143BarDisNum ;
               GXv_char7[0] = GXt_char3 ;
               new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
               export_palb003.this.A396EmprCod = GXv_char4[0] ;
               export_palb003.this.A4812BarEncCli = GXv_char5[0] ;
               export_palb003.this.A143BarDisNum = GXv_char6[0] ;
               export_palb003.this.GXt_char3 = GXv_char7[0] ;
               A13878PedidoClie = GXt_char3 ;
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV20BarAlbKgmE = A1261BarAlbKgmE ;
               AV21BarAlbMtrE = A1263BarAlbMtrE ;
               if ( AV68Moda21 == 1 )
               {
                  if ( A2243BarKgsCli.doubleValue() != 0 )
                  {
                     AV20BarAlbKgmE = A2243BarKgsCli ;
                  }
                  if ( A1461BarAlbPN.doubleValue() != 0 )
                  {
                     AV21BarAlbMtrE = A1461BarAlbPN ;
                  }
               }
               AV28BarColNom = A135BarColNom ;
               AV31BarColNum = A136BarColNum ;
               AV43barNomcli = A1234BarNomCli ;
               AV38BarKgm = A166BarKgm ;
               AV22Barcod = A129BarCod ;
               AV26BarCodreo = A132BarCodReo ;
               AV24Barcodpar = A130BarCodPar ;
               AV15ALbProcod = A30AlbProCod ;
               AV34Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
               AV11ExcelDocument.Cells(AV9CellRow, 1, 1, 1).setNumber( AV50CliCod );
               AV11ExcelDocument.Cells(AV9CellRow, 2, 1, 1).setText( AV55CliNom );
               AV11ExcelDocument.Cells(AV9CellRow, 3, 1, 1).setNumber( A30AlbProCod );
               GXt_dtime8 = GXutil.resetTime( A34AlbProfch );
               AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV11ExcelDocument.Cells(AV9CellRow, 4, 1, 1).setDate( GXt_dtime8 );
               AV11ExcelDocument.Cells(AV9CellRow, 5, 1, 1).setText( A13878PedidoClie );
               GXt_dtime8 = GXutil.resetTime( A155BarFecCli );
               AV11ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV11ExcelDocument.Cells(AV9CellRow, 6, 1, 1).setDate( GXt_dtime8 );
               AV11ExcelDocument.Cells(AV9CellRow, 7, 1, 1).setText( A13696BarNHdr );
               AV11ExcelDocument.Cells(AV9CellRow, 8, 1, 1).setText( A212BarSer );
               AV11ExcelDocument.Cells(AV9CellRow, 9, 1, 1).setText( AV43barNomcli );
               AV11ExcelDocument.Cells(AV9CellRow, 10, 1, 1).setText( AV28BarColNom );
               AV11ExcelDocument.Cells(AV9CellRow, 11, 1, 1).setNumber( AV31BarColNum );
               AV11ExcelDocument.Cells(AV9CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38BarKgm)) );
               AV11ExcelDocument.Cells(AV9CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20BarAlbKgmE)) );
               AV11ExcelDocument.Cells(AV9CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21BarAlbMtrE)) );
               AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setNumber( A1265BarAlbPie );
               AV9CellRow = (int)(AV9CellRow+1) ;
               AV91TotKilC = AV91TotKilC.add(AV20BarAlbKgmE) ;
               AV97TotMetC = AV97TotMetC.add(AV21BarAlbMtrE) ;
               AV101TotPieC = (int)(AV101TotPieC+A1265BarAlbPie) ;
               AV95totkilocrudoc = AV95totkilocrudoc.add(A166BarKgm) ;
               AV90TotKil = AV90TotKil.add(AV20BarAlbKgmE) ;
               AV96TotMet = AV96TotMet.add(AV21BarAlbMtrE) ;
               AV100TotPie = (int)(AV100TotPie+A1265BarAlbPie) ;
               AV94totkilocrudo = AV94totkilocrudo.add(A166BarKgm) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV67last_clicod = AV50CliCod ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV11ExcelDocument.Cells(AV9CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TotKilC)) );
      AV11ExcelDocument.Cells(AV9CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV97TotMetC)) );
      AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setNumber( AV101TotPieC );
      AV9CellRow = (int)(AV9CellRow+1) ;
      AV11ExcelDocument.Cells(AV9CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV90TotKil)) );
      AV11ExcelDocument.Cells(AV9CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV96TotMet)) );
      AV11ExcelDocument.Cells(AV9CellRow, 15, 1, 1).setNumber( AV100TotPie );
   }

   public void S134( )
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      /* Using cursor P0ASQ7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV50CliCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A252CliCod = P0ASQ7_A252CliCod[0] ;
         A279CliNom = P0ASQ7_A279CliNom[0] ;
         AV55CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S141( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV12Filename = "InformeProduccionDetalleExport-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".xlsx" ;
      AV11ExcelDocument.Open(AV12Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV11ExcelDocument.Clear();
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV11ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV11ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV11ExcelDocument.getErrCode() != 0 )
      {
         AV12Filename = "" ;
         AV10ErrorMessage = AV11ExcelDocument.getErrDescription() ;
         AV11ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = export_palb003.this.A396EmprCod;
      this.aP1[0] = export_palb003.this.AV64ImpCod;
      this.aP2[0] = export_palb003.this.AV78Prio;
      this.aP3[0] = export_palb003.this.AV74PCliCod;
      this.aP4[0] = export_palb003.this.AV107UCliCod;
      this.aP5[0] = export_palb003.this.AV76PFecha;
      this.aP6[0] = export_palb003.this.AV109UFecha;
      this.aP7[0] = export_palb003.this.AV73PBarSer;
      this.aP8[0] = export_palb003.this.AV106UBarSer;
      this.aP9[0] = export_palb003.this.AV75PDisNum;
      this.aP10[0] = export_palb003.this.AV108UDisNum;
      this.aP11[0] = export_palb003.this.AV63Fuente;
      this.aP12[0] = export_palb003.this.AV23Barcodi;
      this.aP13[0] = export_palb003.this.AV27Barcodreof;
      this.aP14[0] = export_palb003.this.AV25Barcodparf;
      this.aP15[0] = export_palb003.this.AV30Barcolnomi;
      this.aP16[0] = export_palb003.this.AV29Barcolnomf;
      this.aP17[0] = export_palb003.this.AV33Barcolnumi;
      this.aP18[0] = export_palb003.this.AV32Barcolnumf;
      this.aP19[0] = export_palb003.this.AV41BarMaqEst1;
      this.aP20[0] = export_palb003.this.AV42BarMaqEst2;
      this.aP21[0] = export_palb003.this.AV80Serie;
      this.aP22[0] = export_palb003.this.AV71Nfi;
      this.aP23[0] = export_palb003.this.AV70Nff;
      this.aP24[0] = export_palb003.this.AV39Barlar;
      this.aP25[0] = export_palb003.this.AV87Tipdiscod;
      this.aP26[0] = export_palb003.this.AV35Barestreo;
      this.aP27[0] = export_palb003.this.AV58DetalleRollos;
      this.aP28[0] = export_palb003.this.AV17AlbProCod1;
      this.aP29[0] = export_palb003.this.AV16Albprocod_to;
      this.aP30[0] = export_palb003.this.AV48Bartipart;
      this.aP31[0] = export_palb003.this.AV49Bartipart_to;
      this.aP32[0] = export_palb003.this.AV18BarAcaQuifrom;
      this.aP33[0] = export_palb003.this.AV19BarAcaQuito;
      this.aP34[0] = export_palb003.this.AV12Filename;
      this.aP35[0] = export_palb003.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV11ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Filename = "" ;
      AV10ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0ASQ2_A396EmprCod = new String[] {""} ;
      P0ASQ2_A407EmprNom = new String[] {""} ;
      P0ASQ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV72NomEmp = "" ;
      AV88TipDisDsc = "" ;
      P0ASQ3_A396EmprCod = new String[] {""} ;
      P0ASQ3_A5098TipDisCod = new String[] {""} ;
      P0ASQ3_A5097TipDisDsc = new String[] {""} ;
      P0ASQ3_n5097TipDisDsc = new boolean[] {false} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      AV89TipProd = "" ;
      AV11ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV91TotKilC = DecimalUtil.ZERO ;
      AV97TotMetC = DecimalUtil.ZERO ;
      AV95totkilocrudoc = DecimalUtil.ZERO ;
      P0ASQ4_A396EmprCod = new String[] {""} ;
      P0ASQ4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASQ4_A30AlbProCod = new long[1] ;
      P0ASQ4_A5140AlbMarca = new String[] {""} ;
      P0ASQ4_A39AlbProPri = new String[] {""} ;
      P0ASQ4_A1243GuiRemCli = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A5140AlbMarca = "" ;
      A39AlbProPri = "" ;
      P0ASQ6_A30AlbProCod = new long[1] ;
      P0ASQ6_A2010BarTipDis = new String[] {""} ;
      P0ASQ6_A148BarEstReo = new byte[1] ;
      P0ASQ6_A136BarColNum = new int[1] ;
      P0ASQ6_A135BarColNom = new String[] {""} ;
      P0ASQ6_A212BarSer = new String[] {""} ;
      P0ASQ6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASQ6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASQ6_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASQ6_n2243BarKgsCli = new boolean[] {false} ;
      P0ASQ6_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASQ6_A1234BarNomCli = new String[] {""} ;
      P0ASQ6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASQ6_A1265BarAlbPie = new int[1] ;
      P0ASQ6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASQ6_n166BarKgm = new boolean[] {false} ;
      P0ASQ6_A396EmprCod = new String[] {""} ;
      P0ASQ6_A130BarCodPar = new String[] {""} ;
      P0ASQ6_A132BarCodReo = new byte[1] ;
      P0ASQ6_A129BarCod = new int[1] ;
      P0ASQ6_A143BarDisNum = new String[] {""} ;
      P0ASQ6_A4812BarEncCli = new String[] {""} ;
      A2010BarTipDis = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13878PedidoClie = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      A13696BarNHdr = "" ;
      AV20BarAlbKgmE = DecimalUtil.ZERO ;
      AV21BarAlbMtrE = DecimalUtil.ZERO ;
      AV28BarColNom = "" ;
      AV43barNomcli = "" ;
      AV38BarKgm = DecimalUtil.ZERO ;
      AV24Barcodpar = "" ;
      AV34Barenccli = "" ;
      AV55CliNom = "" ;
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV90TotKil = DecimalUtil.ZERO ;
      AV96TotMet = DecimalUtil.ZERO ;
      AV94totkilocrudo = DecimalUtil.ZERO ;
      P0ASQ7_A396EmprCod = new String[] {""} ;
      P0ASQ7_A252CliCod = new int[1] ;
      P0ASQ7_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.export_palb003__default(),
         new Object[] {
             new Object[] {
            P0ASQ2_A396EmprCod, P0ASQ2_A407EmprNom, P0ASQ2_n407EmprNom
            }
            , new Object[] {
            P0ASQ3_A396EmprCod, P0ASQ3_A5098TipDisCod, P0ASQ3_A5097TipDisDsc, P0ASQ3_n5097TipDisDsc
            }
            , new Object[] {
            P0ASQ4_A396EmprCod, P0ASQ4_A34AlbProfch, P0ASQ4_A30AlbProCod, P0ASQ4_A5140AlbMarca, P0ASQ4_A39AlbProPri, P0ASQ4_A1243GuiRemCli
            }
            , new Object[] {
            P0ASQ6_A30AlbProCod, P0ASQ6_A2010BarTipDis, P0ASQ6_A148BarEstReo, P0ASQ6_A136BarColNum, P0ASQ6_A135BarColNom, P0ASQ6_A212BarSer, P0ASQ6_A1261BarAlbKgmE, P0ASQ6_A1263BarAlbMtrE, P0ASQ6_A2243BarKgsCli, P0ASQ6_n2243BarKgsCli,
            P0ASQ6_A1461BarAlbPN, P0ASQ6_A1234BarNomCli, P0ASQ6_A155BarFecCli, P0ASQ6_A1265BarAlbPie, P0ASQ6_A166BarKgm, P0ASQ6_n166BarKgm, P0ASQ6_A396EmprCod, P0ASQ6_A130BarCodPar, P0ASQ6_A132BarCodReo, P0ASQ6_A129BarCod,
            P0ASQ6_A143BarDisNum, P0ASQ6_A4812BarEncCli
            }
            , new Object[] {
            P0ASQ7_A396EmprCod, P0ASQ7_A252CliCod, P0ASQ7_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV63Fuente ;
   private byte AV27Barcodreof ;
   private byte AV35Barestreo ;
   private byte AV58DetalleRollos ;
   private byte AV68Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV37Barestreoi ;
   private byte AV36BarEstreof ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV26BarCodreo ;
   private short AV48Bartipart ;
   private short AV49Bartipart_to ;
   private short Gx_err ;
   private int AV74PCliCod ;
   private int AV107UCliCod ;
   private int AV23Barcodi ;
   private int AV33Barcolnumi ;
   private int AV32Barcolnumf ;
   private int AV71Nfi ;
   private int AV70Nff ;
   private int AV9CellRow ;
   private int AV8CellCol ;
   private int AV67last_clicod ;
   private int AV101TotPieC ;
   private int A1243GuiRemCli ;
   private int AV50CliCod ;
   private int A136BarColNum ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int AV31BarColNum ;
   private int AV22Barcod ;
   private int AV100TotPie ;
   private int A252CliCod ;
   private int AV13Random ;
   private long AV17AlbProCod1 ;
   private long AV16Albprocod_to ;
   private long A30AlbProCod ;
   private long AV15ALbProcod ;
   private java.math.BigDecimal AV91TotKilC ;
   private java.math.BigDecimal AV97TotMetC ;
   private java.math.BigDecimal AV95totkilocrudoc ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV20BarAlbKgmE ;
   private java.math.BigDecimal AV21BarAlbMtrE ;
   private java.math.BigDecimal AV38BarKgm ;
   private java.math.BigDecimal AV90TotKil ;
   private java.math.BigDecimal AV96TotMet ;
   private java.math.BigDecimal AV94totkilocrudo ;
   private String A396EmprCod ;
   private String AV64ImpCod ;
   private String AV78Prio ;
   private String AV73PBarSer ;
   private String AV106UBarSer ;
   private String AV75PDisNum ;
   private String AV108UDisNum ;
   private String AV25Barcodparf ;
   private String AV30Barcolnomi ;
   private String AV29Barcolnomf ;
   private String AV41BarMaqEst1 ;
   private String AV42BarMaqEst2 ;
   private String AV80Serie ;
   private String AV39Barlar ;
   private String AV87Tipdiscod ;
   private String AV18BarAcaQuifrom ;
   private String AV19BarAcaQuito ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV72NomEmp ;
   private String AV88TipDisDsc ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String AV89TipProd ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String A2010BarTipDis ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13878PedidoClie ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String A13696BarNHdr ;
   private String AV28BarColNom ;
   private String AV43barNomcli ;
   private String AV24Barcodpar ;
   private String AV34Barenccli ;
   private String AV55CliNom ;
   private String A279CliNom ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date AV76PFecha ;
   private java.util.Date AV109UFecha ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private boolean n407EmprNom ;
   private boolean n5097TipDisDsc ;
   private boolean returnInSub ;
   private boolean n2243BarKgsCli ;
   private boolean n166BarKgm ;
   private String AV12Filename ;
   private String AV10ErrorMessage ;
   private String[] aP35 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private int[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private int[] aP17 ;
   private int[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private String[] aP21 ;
   private int[] aP22 ;
   private int[] aP23 ;
   private String[] aP24 ;
   private String[] aP25 ;
   private byte[] aP26 ;
   private byte[] aP27 ;
   private long[] aP28 ;
   private long[] aP29 ;
   private short[] aP30 ;
   private short[] aP31 ;
   private String[] aP32 ;
   private String[] aP33 ;
   private String[] aP34 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ASQ2_A396EmprCod ;
   private String[] P0ASQ2_A407EmprNom ;
   private boolean[] P0ASQ2_n407EmprNom ;
   private String[] P0ASQ3_A396EmprCod ;
   private String[] P0ASQ3_A5098TipDisCod ;
   private String[] P0ASQ3_A5097TipDisDsc ;
   private boolean[] P0ASQ3_n5097TipDisDsc ;
   private String[] P0ASQ4_A396EmprCod ;
   private java.util.Date[] P0ASQ4_A34AlbProfch ;
   private long[] P0ASQ4_A30AlbProCod ;
   private String[] P0ASQ4_A5140AlbMarca ;
   private String[] P0ASQ4_A39AlbProPri ;
   private int[] P0ASQ4_A1243GuiRemCli ;
   private long[] P0ASQ6_A30AlbProCod ;
   private String[] P0ASQ6_A2010BarTipDis ;
   private byte[] P0ASQ6_A148BarEstReo ;
   private int[] P0ASQ6_A136BarColNum ;
   private String[] P0ASQ6_A135BarColNom ;
   private String[] P0ASQ6_A212BarSer ;
   private java.math.BigDecimal[] P0ASQ6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0ASQ6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0ASQ6_A2243BarKgsCli ;
   private boolean[] P0ASQ6_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0ASQ6_A1461BarAlbPN ;
   private String[] P0ASQ6_A1234BarNomCli ;
   private java.util.Date[] P0ASQ6_A155BarFecCli ;
   private int[] P0ASQ6_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ASQ6_A166BarKgm ;
   private boolean[] P0ASQ6_n166BarKgm ;
   private String[] P0ASQ6_A396EmprCod ;
   private String[] P0ASQ6_A130BarCodPar ;
   private byte[] P0ASQ6_A132BarCodReo ;
   private int[] P0ASQ6_A129BarCod ;
   private String[] P0ASQ6_A143BarDisNum ;
   private String[] P0ASQ6_A4812BarEncCli ;
   private String[] P0ASQ7_A396EmprCod ;
   private int[] P0ASQ7_A252CliCod ;
   private String[] P0ASQ7_A279CliNom ;
   private com.genexus.gxoffice.ExcelDoc AV11ExcelDocument ;
}

final  class export_palb003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ASQ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ASQ3", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? and TipDisCod = ? ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ASQ4", "SELECT EmprCod, AlbProfch, AlbProCod, AlbMarca, AlbProPri, GuiRemCli FROM TXPCALPRD WHERE (EmprCod = ? and GuiRemCli >= ? and AlbProCod >= ? and AlbProfch >= ?) AND (AlbProfch <= ?) AND (AlbProPri = ? or ? = '2') AND (AlbProCod <= ?) AND (GuiRemCli <= ?) ORDER BY EmprCod, GuiRemCli, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ASQ6", "SELECT T1.AlbProCod, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarKgsCli, T1.BarAlbPN, T2.BarNomCli, T2.BarFecCli, T1.BarAlbPie, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T2.BarSer >= ? and T2.BarSer <= ?) AND (T2.BarDisNum >= ? and T2.BarDisNum <= ?) AND (T2.BarColNom >= ? and T2.BarColNom <= ?) AND (T2.BarColNum >= ? and T2.BarColNum <= ?) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (T2.BarEstReo >= ?) AND (T2.BarEstReo <= ?) AND (T2.BarTipDis = ? or ? = '*') ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ASQ7", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((String[]) buf[21])[0] = rslt.getString(20, 20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

