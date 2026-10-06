package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumenhdr_usuwcexport extends GXProcedure
{
   public informeproduccionresumenhdr_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenhdr_usuwcexport.class ), "" );
   }

   public informeproduccionresumenhdr_usuwcexport( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String[] aP6 )
   {
      informeproduccionresumenhdr_usuwcexport.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      informeproduccionresumenhdr_usuwcexport.this.AV16Emprcod = aP0;
      informeproduccionresumenhdr_usuwcexport.this.AV17HisEstReo = aP1;
      informeproduccionresumenhdr_usuwcexport.this.AV18MaqCod1 = aP2;
      informeproduccionresumenhdr_usuwcexport.this.AV19MaqCod2 = aP3;
      informeproduccionresumenhdr_usuwcexport.this.AV20HisProFec1 = aP4;
      informeproduccionresumenhdr_usuwcexport.this.AV21HisProFec2 = aP5;
      informeproduccionresumenhdr_usuwcexport.this.aP6 = aP6;
      informeproduccionresumenhdr_usuwcexport.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_int2 = AV79Grulec ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV16Emprcod, httpContext.getMessage( "GRUHDR", ""), GXv_int3) ;
      informeproduccionresumenhdr_usuwcexport.this.GXt_int2 = GXv_int3[0] ;
      AV79Grulec = GXt_int2 ;
      GXt_int2 = AV88lecotex ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV16Emprcod, httpContext.getMessage( "LECOTE", ""), GXv_int3) ;
      informeproduccionresumenhdr_usuwcexport.this.GXt_int2 = GXv_int3[0] ;
      AV88lecotex = GXt_int2 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S171 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "InformeProduccionResumenHdr-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV95TipoTxt = ((AV17HisEstReo==9) ? httpContext.getMessage( "Todo", "") : ((AV17HisEstReo==0) ? httpContext.getMessage( "Produccion Normal", "") : ((AV17HisEstReo==1) ? httpContext.getMessage( "Produccion RI", "") : httpContext.getMessage( "Produccion RE", "")))) ;
      AV10ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Informe Produccion por HDRs", "") );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setText( AV95TipoTxt );
      AV10ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Maquinas ", "")+AV18MaqCod1+" "+AV19MaqCod2+httpContext.getMessage( " Periodo ", "")+localUtil.ttoc( AV20HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " hasta ", "")+localUtil.ttoc( AV21HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
      AV13CellRow = 2 ;
      AV96CellCol = (short)(1) ;
      while ( AV96CellCol <= 40 )
      {
         AV10ExcelDocument.Cells((int)(AV13CellRow), AV96CellCol, 1, 1).setBold( (short)(1) );
         AV96CellCol = (short)(AV96CellCol+1) ;
      }
      AV10ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "HDR", "") );
      AV10ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV10ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV10ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV10ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV10ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Turno", "") );
      AV10ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Fin?", "") );
      AV10ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
      AV10ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Fin", "") );
      AV10ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "HhMm", "") );
      AV10ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV10ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV10ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV10ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV10ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Tono", "") );
      AV10ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Operario", "") );
      AV10ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV10ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
      AV10ExcelDocument.Cells(2, 21, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 22, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV10ExcelDocument.Cells(2, 23, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 24, 1, 1).setText( httpContext.getMessage( "Flag", "") );
      AV10ExcelDocument.Cells(2, 25, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV10ExcelDocument.Cells(2, 26, 1, 1).setText( httpContext.getMessage( "Dia Fin", "") );
      AV10ExcelDocument.Cells(2, 27, 1, 1).setText( httpContext.getMessage( "codigo", "") );
      AV10ExcelDocument.Cells(2, 28, 1, 1).setText( httpContext.getMessage( "defecto", "") );
      AV10ExcelDocument.Cells(2, 29, 1, 1).setText( httpContext.getMessage( "Paro", "") );
      AV10ExcelDocument.Cells(2, 30, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV10ExcelDocument.Cells(2, 31, 1, 1).setText( httpContext.getMessage( "TReal", "") );
      AV10ExcelDocument.Cells(2, 32, 1, 1).setText( httpContext.getMessage( "HorReaint", "") );
      AV10ExcelDocument.Cells(2, 33, 1, 1).setText( httpContext.getMessage( "Min.Real", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV13CellRow = 3 ;
      AV53Totkxls = DecimalUtil.doubleToDec(0) ;
      AV54Totmxls = DecimalUtil.doubleToDec(0) ;
      AV55TotkHDR = DecimalUtil.doubleToDec(0) ;
      AV56TotMtHDR = DecimalUtil.doubleToDec(0) ;
      AV57tiempom = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV17HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A4441HisProDTF ,
                                           AV20HisProFec1 ,
                                           AV21HisProFec2 ,
                                           AV16Emprcod ,
                                           AV18MaqCod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV19MaqCod2 } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A7B2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV18MaqCod1, AV20HisProFec1, AV21HisProFec2, AV19MaqCod2, Byte.valueOf(AV17HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3612HisProReo = P0A7B2_A3612HisProReo[0] ;
         A602MaqCod = P0A7B2_A602MaqCod[0] ;
         A396EmprCod = P0A7B2_A396EmprCod[0] ;
         A129BarCod = P0A7B2_A129BarCod[0] ;
         A132BarCodReo = P0A7B2_A132BarCodReo[0] ;
         A130BarCodPar = P0A7B2_A130BarCodPar[0] ;
         A1525HisProKgr = P0A7B2_A1525HisProKgr[0] ;
         A1526HisProMtr = P0A7B2_A1526HisProMtr[0] ;
         A566HisProTur = P0A7B2_A566HisProTur[0] ;
         A279CliNom = P0A7B2_A279CliNom[0] ;
         A212BarSer = P0A7B2_A212BarSer[0] ;
         A135BarColNom = P0A7B2_A135BarColNom[0] ;
         A136BarColNum = P0A7B2_A136BarColNum[0] ;
         A557HisProF = P0A7B2_A557HisProF[0] ;
         A503GruOpeCod = P0A7B2_A503GruOpeCod[0] ;
         A461Fase = P0A7B2_A461Fase[0] ;
         A2247HisProTip = P0A7B2_A2247HisProTip[0] ;
         A3611HisProTc = P0A7B2_A3611HisProTc[0] ;
         A217BarTipArt = P0A7B2_A217BarTipArt[0] ;
         n217BarTipArt = P0A7B2_n217BarTipArt[0] ;
         A252CliCod = P0A7B2_A252CliCod[0] ;
         n252CliCod = P0A7B2_n252CliCod[0] ;
         A218BarTipCol = P0A7B2_A218BarTipCol[0] ;
         A5608HisProDf = P0A7B2_A5608HisProDf[0] ;
         A3610HisProLot = P0A7B2_A3610HisProLot[0] ;
         A6680HisproTdab = P0A7B2_A6680HisproTdab[0] ;
         A556HisProEst = P0A7B2_A556HisProEst[0] ;
         A833TipDefCod = P0A7B2_A833TipDefCod[0] ;
         n833TipDefCod = P0A7B2_n833TipDefCod[0] ;
         A148BarEstReo = P0A7B2_A148BarEstReo[0] ;
         A834TipDefDsc = P0A7B2_A834TipDefDsc[0] ;
         n834TipDefDsc = P0A7B2_n834TipDefDsc[0] ;
         A656ParCod = P0A7B2_A656ParCod[0] ;
         n656ParCod = P0A7B2_n656ParCod[0] ;
         A867ParCodNom = P0A7B2_A867ParCodNom[0] ;
         n867ParCodNom = P0A7B2_n867ParCodNom[0] ;
         A561HisProLin = P0A7B2_A561HisProLin[0] ;
         A558HisProFec = P0A7B2_A558HisProFec[0] ;
         A4440HisProDTI = P0A7B2_A4440HisProDTI[0] ;
         n4440HisProDTI = P0A7B2_n4440HisProDTI[0] ;
         A4441HisProDTF = P0A7B2_A4441HisProDTF[0] ;
         n4441HisProDTF = P0A7B2_n4441HisProDTF[0] ;
         A212BarSer = P0A7B2_A212BarSer[0] ;
         A135BarColNom = P0A7B2_A135BarColNom[0] ;
         A136BarColNum = P0A7B2_A136BarColNum[0] ;
         A217BarTipArt = P0A7B2_A217BarTipArt[0] ;
         n217BarTipArt = P0A7B2_n217BarTipArt[0] ;
         A252CliCod = P0A7B2_A252CliCod[0] ;
         n252CliCod = P0A7B2_n252CliCod[0] ;
         A218BarTipCol = P0A7B2_A218BarTipCol[0] ;
         A833TipDefCod = P0A7B2_A833TipDefCod[0] ;
         n833TipDefCod = P0A7B2_n833TipDefCod[0] ;
         A148BarEstReo = P0A7B2_A148BarEstReo[0] ;
         A279CliNom = P0A7B2_A279CliNom[0] ;
         A834TipDefDsc = P0A7B2_A834TipDefDsc[0] ;
         n834TipDefDsc = P0A7B2_n834TipDefDsc[0] ;
         A867ParCodNom = P0A7B2_A867ParCodNom[0] ;
         n867ParCodNom = P0A7B2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV58Op4 = httpContext.getMessage( "N", "") ;
         AV59Barcod4 = A129BarCod ;
         AV60barcodreo4 = A132BarCodReo ;
         AV61Barcodpar4 = A130BarCodPar ;
         AV62Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV29HisProLin = A561HisProLin ;
         AV30HisProFec = A558HisProFec ;
         AV63MaqCodhdr = A602MaqCod ;
         AV64HisProdtfHDR = A4441HisProDTF ;
         AV65HisProdtihdr = A4440HisProDTI ;
         AV66HisProkgrHDR = A1525HisProKgr ;
         AV67HisProMtrHDR = A1526HisProMtr ;
         AV68HisProturHDR = A566HisProTur ;
         AV31CliNom = A279CliNom ;
         AV32Barser = A212BarSer ;
         AV33BarcolNom = A135BarColNom ;
         AV34BarColnum = A136BarColNum ;
         AV35HisProF = A557HisProF ;
         AV36Opecod = A503GruOpeCod ;
         AV37Fascod = A461Fase ;
         GXt_char4 = AV38FasDsc ;
         GXv_char5[0] = GXt_char4 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
         informeproduccionresumenhdr_usuwcexport.this.GXt_char4 = GXv_char5[0] ;
         AV38FasDsc = GXt_char4 ;
         AV69Hisprotip4 = A2247HisProTip ;
         GXt_char4 = AV70TipArtDc ;
         GXv_char5[0] = GXt_char4 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char5) ;
         informeproduccionresumenhdr_usuwcexport.this.GXt_char4 = GXv_char5[0] ;
         AV70TipArtDc = GXt_char4 ;
         AV71HisProtc4 = A3611HisProTc ;
         GXt_char4 = AV72TipCOlDsc4 ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A3611HisProTc ;
         GXv_char6[0] = GXt_char4 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char6) ;
         informeproduccionresumenhdr_usuwcexport.this.A396EmprCod = GXv_char5[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A3611HisProTc = GXv_int3[0] ;
         informeproduccionresumenhdr_usuwcexport.this.GXt_char4 = GXv_char6[0] ;
         AV72TipCOlDsc4 = GXt_char4 ;
         AV73BarTipArt4 = A217BarTipArt ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char5[0] = A212BarSer ;
         GXv_char8[0] = A135BarColNom ;
         GXv_int9[0] = A136BarColNum ;
         GXv_int3[0] = A218BarTipCol ;
         GXv_char10[0] = "" ;
         GXv_char11[0] = AV39MatDsc ;
         GXv_int12[0] = AV40MatCod ;
         GXv_int13[0] = (byte)(0) ;
         GXv_char14[0] = "" ;
         GXv_char15[0] = "" ;
         GXv_int16[0] = 0 ;
         GXv_char17[0] = "" ;
         GXv_char18[0] = "" ;
         GXv_int19[0] = (short)(0) ;
         GXv_char20[0] = "" ;
         GXv_char21[0] = "" ;
         GXv_int22[0] = 0 ;
         GXv_decimal23[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime24[0] = AV74fechadt ;
         GXv_char25[0] = "" ;
         new app.pmasinf2(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_char8, GXv_int9, GXv_int3, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_char15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_char20, GXv_char21, GXv_int22, GXv_decimal23, GXv_dtime24, GXv_char25) ;
         informeproduccionresumenhdr_usuwcexport.this.A396EmprCod = GXv_char6[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A252CliCod = GXv_int7[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A212BarSer = GXv_char5[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A135BarColNom = GXv_char8[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A136BarColNum = GXv_int9[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A218BarTipCol = GXv_int3[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV39MatDsc = GXv_char11[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV40MatCod = GXv_int12[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV74fechadt = GXv_dtime24[0] ;
         GXv_char25[0] = A396EmprCod ;
         GXv_int22[0] = A252CliCod ;
         GXv_char21[0] = A212BarSer ;
         GXv_char20[0] = A135BarColNom ;
         GXv_int16[0] = A136BarColNum ;
         GXv_int13[0] = A218BarTipCol ;
         GXv_int26[0] = AV41ForRgb ;
         new app.pbusrgb(remoteHandle, context).execute( GXv_char25, GXv_int22, GXv_char21, GXv_char20, GXv_int16, GXv_int13, GXv_int26) ;
         informeproduccionresumenhdr_usuwcexport.this.A396EmprCod = GXv_char25[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A252CliCod = GXv_int22[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A212BarSer = GXv_char21[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A135BarColNom = GXv_char20[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A136BarColNum = GXv_int16[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A218BarTipCol = GXv_int13[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV41ForRgb = GXv_int26[0] ;
         GXv_int26[0] = AV41ForRgb ;
         GXv_int19[0] = AV75R ;
         GXv_int12[0] = AV76G ;
         GXv_int27[0] = AV77B ;
         new app.pleorgb(remoteHandle, context).execute( GXv_int26, GXv_int19, GXv_int12, GXv_int27) ;
         informeproduccionresumenhdr_usuwcexport.this.AV41ForRgb = GXv_int26[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV75R = GXv_int19[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV76G = GXv_int12[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV77B = GXv_int27[0] ;
         GXv_char25[0] = A396EmprCod ;
         GXv_char21[0] = A461Fase ;
         GXv_char20[0] = AV42FasActTin ;
         new app.pfasest(remoteHandle, context).execute( GXv_char25, GXv_char21, GXv_char20) ;
         informeproduccionresumenhdr_usuwcexport.this.A396EmprCod = GXv_char25[0] ;
         informeproduccionresumenhdr_usuwcexport.this.A461Fase = GXv_char21[0] ;
         informeproduccionresumenhdr_usuwcexport.this.AV42FasActTin = GXv_char20[0] ;
         AV43HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         AV44HisProDf = A5608HisProDf ;
         AV78FlagMarca = (byte)(0) ;
         AV78FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV43HisProLot)==0) ? 1 : 0)) ;
         if ( AV79Grulec == 0 )
         {
            if ( GXutil.strcmp(AV42FasActTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV78FlagMarca = (byte)(1) ;
            }
         }
         else
         {
            AV78FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV43HisProLot)==0)&&(GXutil.strcmp(AV42FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV78FlagMarca)) ;
         }
         AV45fase = A461Fase ;
         /* Execute user subroutine: 'FASPRO' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV80hhmmalfa = " " ;
         AV81Minutos = 0 ;
         AV46HisProTr2 = ((GXutil.strcmp(AV47FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
         AV82HorRea = (short)(0) ;
         AV83HorReaint = (short)(0) ;
         AV84MinRea = (short)(0) ;
         if ( A556HisProEst != 0 )
         {
            AV85HhMm = DecimalUtil.doubleToDec(AV46HisProTr2/ (double) (60)) ;
            AV82HorRea = (short)(AV46HisProTr2/ (double) (60)) ;
            AV83HorReaint = AV82HorRea ;
            AV84MinRea = (short)(AV46HisProTr2-(AV83HorReaint*60)) ;
            AV86Mmalfa = GXutil.padl( GXutil.trim( GXutil.str( AV84MinRea, 2, 0)), (short)(2), "0") ;
            AV87hhalfa = GXutil.str( GXutil.Int( AV83HorReaint), 10, 0) ;
            AV80hhmmalfa = AV87hhalfa + ":" + AV86Mmalfa ;
            AV81Minutos = (long)((GXutil.Int( AV83HorReaint)*60)+AV84MinRea) ;
         }
         AV48tipdefcod = (short)(((A148BarEstReo==0) ? 0 : A833TipDefCod)) ;
         AV49tipdefdsc = ((A148BarEstReo==0) ? "" : A834TipDefDsc) ;
         AV97ParCod = A656ParCod ;
         AV98Parcodnom = A867ParCodNom ;
         /* Execute user subroutine: 'COSTES' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV55TotkHDR = AV55TotkHDR.add(A1525HisProKgr) ;
         AV56TotMtHDR = AV56TotMtHDR.add(A1526HisProMtr) ;
         AV57tiempom = (int)(AV57tiempom+(((GXutil.strcmp(AV47FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV46HisProTr2 : ((AV78FlagMarca==1)&&(A556HisProEst!=0) ? AV46HisProTr2 : 0)))) ;
         AV10ExcelDocument.Cells((int)(AV13CellRow), 1, 1, 1).setText( AV62Hdr );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 2, 1, 1).setText( AV63MaqCodhdr );
         GXt_dtime28 = GXutil.resetTime( AV30HisProFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells((int)(AV13CellRow), 3, 1, 1).setDate( GXt_dtime28 );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66HisProkgrHDR)) );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67HisProMtrHDR)) );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 6, 1, 1).setNumber( AV68HisProturHDR );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 7, 1, 1).setText( AV35HisProF );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells((int)(AV13CellRow), 8, 1, 1).setDate( AV65HisProdtihdr );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells((int)(AV13CellRow), 9, 1, 1).setDate( AV64HisProdtfHDR );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 10, 1, 1).setText( AV80hhmmalfa );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 11, 1, 1).setText( AV31CliNom );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 12, 1, 1).setText( AV32Barser );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 13, 1, 1).setText( AV33BarcolNom );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 14, 1, 1).setNumber( AV34BarColnum );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 15, 1, 1).setNumber( AV40MatCod );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 16, 1, 1).setText( AV39MatDsc );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 17, 1, 1).setNumber( AV36Opecod );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 18, 1, 1).setText( AV37Fascod );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 19, 1, 1).setText( AV38FasDsc );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 20, 1, 1).setNumber( AV69Hisprotip4 );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 21, 1, 1).setText( AV70TipArtDc );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 22, 1, 1).setNumber( AV71HisProtc4 );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 23, 1, 1).setText( AV72TipCOlDsc4 );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 24, 1, 1).setNumber( AV78FlagMarca );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 25, 1, 1).setNumber( AV81Minutos );
         GXt_dtime28 = GXutil.resetTime( AV44HisProDf );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells((int)(AV13CellRow), 26, 1, 1).setDate( GXt_dtime28 );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 27, 1, 1).setNumber( AV48tipdefcod );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 28, 1, 1).setText( AV49tipdefdsc );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 29, 1, 1).setNumber( AV97ParCod );
         AV10ExcelDocument.Cells((int)(AV13CellRow), 30, 1, 1).setText( AV98Parcodnom );
         if ( AV88lecotex == 1 )
         {
            AV10ExcelDocument.Cells((int)(AV13CellRow), 31, 1, 1).setText( AV89Hdrp );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 32, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50HreBarKgm)) );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 33, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51HreTotKgm)) );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 34, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV90Costei)) );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 35, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91costet)) );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 36, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV92CosteK)) );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 37, 1, 1).setNumber( AV46HisProTr2 );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 38, 1, 1).setNumber( AV83HorReaint );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 39, 1, 1).setNumber( AV84MinRea );
         }
         else
         {
            AV10ExcelDocument.Cells((int)(AV13CellRow), 31, 1, 1).setNumber( AV46HisProTr2 );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 32, 1, 1).setNumber( AV83HorReaint );
            AV10ExcelDocument.Cells((int)(AV13CellRow), 33, 1, 1).setNumber( AV84MinRea );
         }
         AV13CellRow = (long)(AV13CellRow+1) ;
         AV53Totkxls = AV53Totkxls.add(AV66HisProkgrHDR) ;
         AV54Totmxls = AV54Totmxls.add(AV67HisProMtrHDR) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10ExcelDocument.Cells((int)(AV13CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53Totkxls)) );
      AV10ExcelDocument.Cells((int)(AV13CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54Totmxls)) );
   }

   public void S171( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S152( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV47FasDivTime = httpContext.getMessage( "N", "") ;
      /* Using cursor P0A7B3 */
      pr_default.execute(1, new Object[] {AV16Emprcod, AV45fase});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P0A7B3_A457FasCod[0] ;
         A396EmprCod = P0A7B3_A396EmprCod[0] ;
         A14054FasDivTime = P0A7B3_A14054FasDivTime[0] ;
         AV47FasDivTime = A14054FasDivTime ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S162( )
   {
      /* 'COSTES' Routine */
      returnInSub = false ;
      AV28BarKgsTt = DecimalUtil.ZERO ;
      AV52BarKgmTin = DecimalUtil.ZERO ;
      AV89Hdrp = "" ;
      /* Using cursor P0A7B4 */
      pr_default.execute(2, new Object[] {AV16Emprcod, Integer.valueOf(AV59Barcod4), Byte.valueOf(AV60barcodreo4), AV61Barcodpar4, AV18MaqCod1, AV19MaqCod2});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1945BarMaqTin = P0A7B4_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P0A7B4_n1945BarMaqTin[0] ;
         A1935BarParTin = P0A7B4_A1935BarParTin[0] ;
         n1935BarParTin = P0A7B4_n1935BarParTin[0] ;
         A1934BarReoTin = P0A7B4_A1934BarReoTin[0] ;
         n1934BarReoTin = P0A7B4_n1934BarReoTin[0] ;
         A1933BarCodTin = P0A7B4_A1933BarCodTin[0] ;
         n1933BarCodTin = P0A7B4_n1933BarCodTin[0] ;
         A396EmprCod = P0A7B4_A396EmprCod[0] ;
         A8563BarKgsTt = P0A7B4_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P0A7B4_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P0A7B4_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P0A7B4_n1947BarKgmTin[0] ;
         A3654BarCosPD = P0A7B4_A3654BarCosPD[0] ;
         n3654BarCosPD = P0A7B4_n3654BarCosPD[0] ;
         A3658BarCosPA = P0A7B4_A3658BarCosPA[0] ;
         n3658BarCosPA = P0A7B4_n3658BarCosPA[0] ;
         A3705BarCosCol = P0A7B4_A3705BarCosCol[0] ;
         n3705BarCosCol = P0A7B4_n3705BarCosCol[0] ;
         A3706BarCosAnc = P0A7B4_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P0A7B4_n3706BarCosAnc[0] ;
         A3656BarCosAD = P0A7B4_A3656BarCosAD[0] ;
         n3656BarCosAD = P0A7B4_n3656BarCosAD[0] ;
         A3657BarCosAA = P0A7B4_A3657BarCosAA[0] ;
         n3657BarCosAA = P0A7B4_n3657BarCosAA[0] ;
         A2316BarAgrLot = P0A7B4_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P0A7B4_n2316BarAgrLot[0] ;
         A3646EstTinAny = P0A7B4_A3646EstTinAny[0] ;
         A3647EstTinMes = P0A7B4_A3647EstTinMes[0] ;
         A3648EstTinDia = P0A7B4_A3648EstTinDia[0] ;
         A1929EstTinNr = P0A7B4_A1929EstTinNr[0] ;
         AV28BarKgsTt = A8563BarKgsTt ;
         AV52BarKgmTin = A1947BarKgmTin ;
         AV90Costei = A3705BarCosCol.add(A3658BarCosPA).add(A3654BarCosPD) ;
         AV91costet = A3657BarCosAA.add(A3656BarCosAD).add(A3706BarCosAnc).add(A3705BarCosCol).add(A3658BarCosPA).add(A3654BarCosPD) ;
         AV93Dif = AV90Costei.subtract(AV91costet) ;
         AV94Porc = DecimalUtil.doubleToDec(0) ;
         if ( AV90Costei.doubleValue() != 0 )
         {
            AV94Porc = GXutil.roundDecimal( (AV93Dif.divide(AV90Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
         }
         AV92CosteK = DecimalUtil.doubleToDec(0) ;
         if ( AV52BarKgmTin.doubleValue() > 0 )
         {
            AV92CosteK = GXutil.roundDecimal( AV91costet.divide(AV52BarKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
         }
         AV89Hdrp = GXutil.substring( A2316BarAgrLot, 1, 8) + "-" + GXutil.substring( A2316BarAgrLot, 9, 1) + GXutil.substring( A2316BarAgrLot, 10, 1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP6[0] = informeproduccionresumenhdr_usuwcexport.this.AV11Filename;
      this.aP7[0] = informeproduccionresumenhdr_usuwcexport.this.AV12ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Filename = "" ;
      AV12ErrorMessage = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV95TipoTxt = "" ;
      AV53Totkxls = DecimalUtil.ZERO ;
      AV54Totmxls = DecimalUtil.ZERO ;
      AV55TotkHDR = DecimalUtil.ZERO ;
      AV56TotMtHDR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P0A7B2_A3612HisProReo = new byte[1] ;
      P0A7B2_A602MaqCod = new String[] {""} ;
      P0A7B2_A396EmprCod = new String[] {""} ;
      P0A7B2_A129BarCod = new int[1] ;
      P0A7B2_A132BarCodReo = new byte[1] ;
      P0A7B2_A130BarCodPar = new String[] {""} ;
      P0A7B2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B2_A566HisProTur = new byte[1] ;
      P0A7B2_A279CliNom = new String[] {""} ;
      P0A7B2_A212BarSer = new String[] {""} ;
      P0A7B2_A135BarColNom = new String[] {""} ;
      P0A7B2_A136BarColNum = new int[1] ;
      P0A7B2_A557HisProF = new String[] {""} ;
      P0A7B2_A503GruOpeCod = new int[1] ;
      P0A7B2_A461Fase = new String[] {""} ;
      P0A7B2_A2247HisProTip = new short[1] ;
      P0A7B2_A3611HisProTc = new byte[1] ;
      P0A7B2_A217BarTipArt = new short[1] ;
      P0A7B2_n217BarTipArt = new boolean[] {false} ;
      P0A7B2_A252CliCod = new int[1] ;
      P0A7B2_n252CliCod = new boolean[] {false} ;
      P0A7B2_A218BarTipCol = new byte[1] ;
      P0A7B2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0A7B2_A3610HisProLot = new String[] {""} ;
      P0A7B2_A6680HisproTdab = new short[1] ;
      P0A7B2_A556HisProEst = new byte[1] ;
      P0A7B2_A833TipDefCod = new short[1] ;
      P0A7B2_n833TipDefCod = new boolean[] {false} ;
      P0A7B2_A148BarEstReo = new byte[1] ;
      P0A7B2_A834TipDefDsc = new String[] {""} ;
      P0A7B2_n834TipDefDsc = new boolean[] {false} ;
      P0A7B2_A656ParCod = new short[1] ;
      P0A7B2_n656ParCod = new boolean[] {false} ;
      P0A7B2_A867ParCodNom = new String[] {""} ;
      P0A7B2_n867ParCodNom = new boolean[] {false} ;
      P0A7B2_A561HisProLin = new int[1] ;
      P0A7B2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A7B2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0A7B2_n4440HisProDTI = new boolean[] {false} ;
      P0A7B2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0A7B2_n4441HisProDTF = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A557HisProF = "" ;
      A461Fase = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A3610HisProLot = "" ;
      A834TipDefDsc = "" ;
      A867ParCodNom = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV58Op4 = "" ;
      AV61Barcodpar4 = "" ;
      AV62Hdr = "" ;
      AV30HisProFec = GXutil.nullDate() ;
      AV63MaqCodhdr = "" ;
      AV64HisProdtfHDR = GXutil.resetTime( GXutil.nullDate() );
      AV65HisProdtihdr = GXutil.resetTime( GXutil.nullDate() );
      AV66HisProkgrHDR = DecimalUtil.ZERO ;
      AV67HisProMtrHDR = DecimalUtil.ZERO ;
      AV31CliNom = "" ;
      AV32Barser = "" ;
      AV33BarcolNom = "" ;
      AV35HisProF = "" ;
      AV37Fascod = "" ;
      AV38FasDsc = "" ;
      AV70TipArtDc = "" ;
      AV72TipCOlDsc4 = "" ;
      GXt_char4 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char10 = new String[1] ;
      AV39MatDsc = "" ;
      GXv_char11 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      AV74fechadt = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime24 = new java.util.Date[1] ;
      GXv_int22 = new int[1] ;
      GXv_int16 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int26 = new long[1] ;
      GXv_int19 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int27 = new short[1] ;
      GXv_char25 = new String[1] ;
      GXv_char21 = new String[1] ;
      AV42FasActTin = "" ;
      GXv_char20 = new String[1] ;
      AV43HisProLot = "" ;
      AV44HisProDf = GXutil.nullDate() ;
      AV45fase = "" ;
      AV80hhmmalfa = "" ;
      AV47FasDivTime = "" ;
      AV85HhMm = DecimalUtil.ZERO ;
      AV86Mmalfa = "" ;
      AV87hhalfa = "" ;
      AV49tipdefdsc = "" ;
      AV98Parcodnom = "" ;
      GXt_dtime28 = GXutil.resetTime( GXutil.nullDate() );
      AV89Hdrp = "" ;
      AV50HreBarKgm = DecimalUtil.ZERO ;
      AV51HreTotKgm = DecimalUtil.ZERO ;
      AV90Costei = DecimalUtil.ZERO ;
      AV91costet = DecimalUtil.ZERO ;
      AV92CosteK = DecimalUtil.ZERO ;
      P0A7B3_A457FasCod = new String[] {""} ;
      P0A7B3_A396EmprCod = new String[] {""} ;
      P0A7B3_A14054FasDivTime = new String[] {""} ;
      A457FasCod = "" ;
      A14054FasDivTime = "" ;
      AV28BarKgsTt = DecimalUtil.ZERO ;
      AV52BarKgmTin = DecimalUtil.ZERO ;
      P0A7B4_A1945BarMaqTin = new String[] {""} ;
      P0A7B4_n1945BarMaqTin = new boolean[] {false} ;
      P0A7B4_A1935BarParTin = new String[] {""} ;
      P0A7B4_n1935BarParTin = new boolean[] {false} ;
      P0A7B4_A1934BarReoTin = new byte[1] ;
      P0A7B4_n1934BarReoTin = new boolean[] {false} ;
      P0A7B4_A1933BarCodTin = new int[1] ;
      P0A7B4_n1933BarCodTin = new boolean[] {false} ;
      P0A7B4_A396EmprCod = new String[] {""} ;
      P0A7B4_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n8563BarKgsTt = new boolean[] {false} ;
      P0A7B4_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n1947BarKgmTin = new boolean[] {false} ;
      P0A7B4_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3654BarCosPD = new boolean[] {false} ;
      P0A7B4_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3658BarCosPA = new boolean[] {false} ;
      P0A7B4_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3705BarCosCol = new boolean[] {false} ;
      P0A7B4_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3706BarCosAnc = new boolean[] {false} ;
      P0A7B4_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3656BarCosAD = new boolean[] {false} ;
      P0A7B4_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A7B4_n3657BarCosAA = new boolean[] {false} ;
      P0A7B4_A2316BarAgrLot = new String[] {""} ;
      P0A7B4_n2316BarAgrLot = new boolean[] {false} ;
      P0A7B4_A3646EstTinAny = new short[1] ;
      P0A7B4_A3647EstTinMes = new byte[1] ;
      P0A7B4_A3648EstTinDia = new byte[1] ;
      P0A7B4_A1929EstTinNr = new short[1] ;
      A1945BarMaqTin = "" ;
      A1935BarParTin = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      AV93Dif = DecimalUtil.ZERO ;
      AV94Porc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenhdr_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P0A7B2_A3612HisProReo, P0A7B2_A602MaqCod, P0A7B2_A396EmprCod, P0A7B2_A129BarCod, P0A7B2_A132BarCodReo, P0A7B2_A130BarCodPar, P0A7B2_A1525HisProKgr, P0A7B2_A1526HisProMtr, P0A7B2_A566HisProTur, P0A7B2_A279CliNom,
            P0A7B2_A212BarSer, P0A7B2_A135BarColNom, P0A7B2_A136BarColNum, P0A7B2_A557HisProF, P0A7B2_A503GruOpeCod, P0A7B2_A461Fase, P0A7B2_A2247HisProTip, P0A7B2_A3611HisProTc, P0A7B2_A217BarTipArt, P0A7B2_n217BarTipArt,
            P0A7B2_A252CliCod, P0A7B2_n252CliCod, P0A7B2_A218BarTipCol, P0A7B2_A5608HisProDf, P0A7B2_A3610HisProLot, P0A7B2_A6680HisproTdab, P0A7B2_A556HisProEst, P0A7B2_A833TipDefCod, P0A7B2_n833TipDefCod, P0A7B2_A148BarEstReo,
            P0A7B2_A834TipDefDsc, P0A7B2_n834TipDefDsc, P0A7B2_A656ParCod, P0A7B2_n656ParCod, P0A7B2_A867ParCodNom, P0A7B2_n867ParCodNom, P0A7B2_A561HisProLin, P0A7B2_A558HisProFec, P0A7B2_A4440HisProDTI, P0A7B2_n4440HisProDTI,
            P0A7B2_A4441HisProDTF, P0A7B2_n4441HisProDTF
            }
            , new Object[] {
            P0A7B3_A457FasCod, P0A7B3_A396EmprCod, P0A7B3_A14054FasDivTime
            }
            , new Object[] {
            P0A7B4_A1945BarMaqTin, P0A7B4_n1945BarMaqTin, P0A7B4_A1935BarParTin, P0A7B4_n1935BarParTin, P0A7B4_A1934BarReoTin, P0A7B4_n1934BarReoTin, P0A7B4_A1933BarCodTin, P0A7B4_n1933BarCodTin, P0A7B4_A396EmprCod, P0A7B4_A8563BarKgsTt,
            P0A7B4_n8563BarKgsTt, P0A7B4_A1947BarKgmTin, P0A7B4_n1947BarKgmTin, P0A7B4_A3654BarCosPD, P0A7B4_n3654BarCosPD, P0A7B4_A3658BarCosPA, P0A7B4_n3658BarCosPA, P0A7B4_A3705BarCosCol, P0A7B4_n3705BarCosCol, P0A7B4_A3706BarCosAnc,
            P0A7B4_n3706BarCosAnc, P0A7B4_A3656BarCosAD, P0A7B4_n3656BarCosAD, P0A7B4_A3657BarCosAA, P0A7B4_n3657BarCosAA, P0A7B4_A2316BarAgrLot, P0A7B4_n2316BarAgrLot, P0A7B4_A3646EstTinAny, P0A7B4_A3647EstTinMes, P0A7B4_A3648EstTinDia,
            P0A7B4_A1929EstTinNr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17HisEstReo ;
   private byte AV79Grulec ;
   private byte AV88lecotex ;
   private byte GXt_int2 ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A3611HisProTc ;
   private byte A218BarTipCol ;
   private byte A556HisProEst ;
   private byte A148BarEstReo ;
   private byte AV60barcodreo4 ;
   private byte AV68HisProturHDR ;
   private byte GXv_int3[] ;
   private byte GXv_int13[] ;
   private byte AV78FlagMarca ;
   private byte A1934BarReoTin ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short AV96CellCol ;
   private short A2247HisProTip ;
   private short A217BarTipArt ;
   private short A6680HisproTdab ;
   private short A833TipDefCod ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV69Hisprotip4 ;
   private short AV71HisProtc4 ;
   private short AV73BarTipArt4 ;
   private short AV40MatCod ;
   private short AV75R ;
   private short GXv_int19[] ;
   private short AV76G ;
   private short GXv_int12[] ;
   private short AV77B ;
   private short GXv_int27[] ;
   private short AV46HisProTr2 ;
   private short AV82HorRea ;
   private short AV83HorReaint ;
   private short AV84MinRea ;
   private short AV48tipdefcod ;
   private short AV97ParCod ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short Gx_err ;
   private int AV15Random ;
   private int AV57tiempom ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int AV59Barcod4 ;
   private int AV29HisProLin ;
   private int AV34BarColnum ;
   private int AV36Opecod ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int GXv_int22[] ;
   private int GXv_int16[] ;
   private int A1933BarCodTin ;
   private long AV13CellRow ;
   private long AV41ForRgb ;
   private long GXv_int26[] ;
   private long AV81Minutos ;
   private java.math.BigDecimal AV53Totkxls ;
   private java.math.BigDecimal AV54Totmxls ;
   private java.math.BigDecimal AV55TotkHDR ;
   private java.math.BigDecimal AV56TotMtHDR ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV66HisProkgrHDR ;
   private java.math.BigDecimal AV67HisProMtrHDR ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal AV85HhMm ;
   private java.math.BigDecimal AV50HreBarKgm ;
   private java.math.BigDecimal AV51HreTotKgm ;
   private java.math.BigDecimal AV90Costei ;
   private java.math.BigDecimal AV91costet ;
   private java.math.BigDecimal AV92CosteK ;
   private java.math.BigDecimal AV28BarKgsTt ;
   private java.math.BigDecimal AV52BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal AV93Dif ;
   private java.math.BigDecimal AV94Porc ;
   private String AV16Emprcod ;
   private String AV18MaqCod1 ;
   private String AV19MaqCod2 ;
   private String AV95TipoTxt ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A557HisProF ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String A834TipDefDsc ;
   private String A867ParCodNom ;
   private String AV58Op4 ;
   private String AV61Barcodpar4 ;
   private String AV62Hdr ;
   private String AV63MaqCodhdr ;
   private String AV31CliNom ;
   private String AV32Barser ;
   private String AV33BarcolNom ;
   private String AV35HisProF ;
   private String AV37Fascod ;
   private String AV38FasDsc ;
   private String AV70TipArtDc ;
   private String AV72TipCOlDsc4 ;
   private String GXt_char4 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char10[] ;
   private String AV39MatDsc ;
   private String GXv_char11[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char25[] ;
   private String GXv_char21[] ;
   private String AV42FasActTin ;
   private String GXv_char20[] ;
   private String AV43HisProLot ;
   private String AV45fase ;
   private String AV80hhmmalfa ;
   private String AV47FasDivTime ;
   private String AV86Mmalfa ;
   private String AV87hhalfa ;
   private String AV49tipdefdsc ;
   private String AV98Parcodnom ;
   private String AV89Hdrp ;
   private String A457FasCod ;
   private String A14054FasDivTime ;
   private String A1945BarMaqTin ;
   private String A1935BarParTin ;
   private String A2316BarAgrLot ;
   private java.util.Date AV20HisProFec1 ;
   private java.util.Date AV21HisProFec2 ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV64HisProdtfHDR ;
   private java.util.Date AV65HisProdtihdr ;
   private java.util.Date AV74fechadt ;
   private java.util.Date GXv_dtime24[] ;
   private java.util.Date GXt_dtime28 ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV30HisProFec ;
   private java.util.Date AV44HisProDf ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n1945BarMaqTin ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n3654BarCosPD ;
   private boolean n3658BarCosPA ;
   private boolean n3705BarCosCol ;
   private boolean n3706BarCosAnc ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n2316BarAgrLot ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A7B2_A3612HisProReo ;
   private String[] P0A7B2_A602MaqCod ;
   private String[] P0A7B2_A396EmprCod ;
   private int[] P0A7B2_A129BarCod ;
   private byte[] P0A7B2_A132BarCodReo ;
   private String[] P0A7B2_A130BarCodPar ;
   private java.math.BigDecimal[] P0A7B2_A1525HisProKgr ;
   private java.math.BigDecimal[] P0A7B2_A1526HisProMtr ;
   private byte[] P0A7B2_A566HisProTur ;
   private String[] P0A7B2_A279CliNom ;
   private String[] P0A7B2_A212BarSer ;
   private String[] P0A7B2_A135BarColNom ;
   private int[] P0A7B2_A136BarColNum ;
   private String[] P0A7B2_A557HisProF ;
   private int[] P0A7B2_A503GruOpeCod ;
   private String[] P0A7B2_A461Fase ;
   private short[] P0A7B2_A2247HisProTip ;
   private byte[] P0A7B2_A3611HisProTc ;
   private short[] P0A7B2_A217BarTipArt ;
   private boolean[] P0A7B2_n217BarTipArt ;
   private int[] P0A7B2_A252CliCod ;
   private boolean[] P0A7B2_n252CliCod ;
   private byte[] P0A7B2_A218BarTipCol ;
   private java.util.Date[] P0A7B2_A5608HisProDf ;
   private String[] P0A7B2_A3610HisProLot ;
   private short[] P0A7B2_A6680HisproTdab ;
   private byte[] P0A7B2_A556HisProEst ;
   private short[] P0A7B2_A833TipDefCod ;
   private boolean[] P0A7B2_n833TipDefCod ;
   private byte[] P0A7B2_A148BarEstReo ;
   private String[] P0A7B2_A834TipDefDsc ;
   private boolean[] P0A7B2_n834TipDefDsc ;
   private short[] P0A7B2_A656ParCod ;
   private boolean[] P0A7B2_n656ParCod ;
   private String[] P0A7B2_A867ParCodNom ;
   private boolean[] P0A7B2_n867ParCodNom ;
   private int[] P0A7B2_A561HisProLin ;
   private java.util.Date[] P0A7B2_A558HisProFec ;
   private java.util.Date[] P0A7B2_A4440HisProDTI ;
   private boolean[] P0A7B2_n4440HisProDTI ;
   private java.util.Date[] P0A7B2_A4441HisProDTF ;
   private boolean[] P0A7B2_n4441HisProDTF ;
   private String[] P0A7B3_A457FasCod ;
   private String[] P0A7B3_A396EmprCod ;
   private String[] P0A7B3_A14054FasDivTime ;
   private String[] P0A7B4_A1945BarMaqTin ;
   private boolean[] P0A7B4_n1945BarMaqTin ;
   private String[] P0A7B4_A1935BarParTin ;
   private boolean[] P0A7B4_n1935BarParTin ;
   private byte[] P0A7B4_A1934BarReoTin ;
   private boolean[] P0A7B4_n1934BarReoTin ;
   private int[] P0A7B4_A1933BarCodTin ;
   private boolean[] P0A7B4_n1933BarCodTin ;
   private String[] P0A7B4_A396EmprCod ;
   private java.math.BigDecimal[] P0A7B4_A8563BarKgsTt ;
   private boolean[] P0A7B4_n8563BarKgsTt ;
   private java.math.BigDecimal[] P0A7B4_A1947BarKgmTin ;
   private boolean[] P0A7B4_n1947BarKgmTin ;
   private java.math.BigDecimal[] P0A7B4_A3654BarCosPD ;
   private boolean[] P0A7B4_n3654BarCosPD ;
   private java.math.BigDecimal[] P0A7B4_A3658BarCosPA ;
   private boolean[] P0A7B4_n3658BarCosPA ;
   private java.math.BigDecimal[] P0A7B4_A3705BarCosCol ;
   private boolean[] P0A7B4_n3705BarCosCol ;
   private java.math.BigDecimal[] P0A7B4_A3706BarCosAnc ;
   private boolean[] P0A7B4_n3706BarCosAnc ;
   private java.math.BigDecimal[] P0A7B4_A3656BarCosAD ;
   private boolean[] P0A7B4_n3656BarCosAD ;
   private java.math.BigDecimal[] P0A7B4_A3657BarCosAA ;
   private boolean[] P0A7B4_n3657BarCosAA ;
   private String[] P0A7B4_A2316BarAgrLot ;
   private boolean[] P0A7B4_n2316BarAgrLot ;
   private short[] P0A7B4_A3646EstTinAny ;
   private byte[] P0A7B4_A3647EstTinMes ;
   private byte[] P0A7B4_A3648EstTinDia ;
   private short[] P0A7B4_A1929EstTinNr ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class informeproduccionresumenhdr_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A7B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV17HisEstReo ,
                                          byte A3612HisProReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV20HisProFec1 ,
                                          java.util.Date AV21HisProFec2 ,
                                          String AV16Emprcod ,
                                          String AV18MaqCod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV19MaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[6];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.HisProReo, T1.MaqCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T1.HisProMtr, T1.HisProTur, T3.CliNom, T2.BarSer, T2.BarColNom," ;
      scmdbuf += " T2.BarColNum, T1.HisProF, T1.GruOpeCod, T1.Fase, T1.HisProTip, T1.HisProTc, T2.BarTipArt, T2.CliCod, T2.BarTipCol, T1.HisProDf, T1.HisProLot, T1.HisproTdab, T1.HisProEst," ;
      scmdbuf += " T2.TipDefCod, T2.BarEstReo, T4.TipDefDsc, T1.ParCod, T5.ParCodNom, T1.HisProLin, T1.HisProFec, T1.HisProDTI, T1.HisProDTF FROM ((((TXPLHIPRO T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T2.TipDefCod) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T5.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! ( AV17HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0A7B2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A7B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A7B3", "SELECT FasCod, EmprCod, FasDivTime FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A7B4", "SELECT BarMaqTin, BarParTin, BarReoTin, BarCodTin, EmprCod, BarKgsTt, BarKgmTin, BarCosPD, BarCosPA, BarCosCol, BarCosAnc, BarCosAD, BarCosAA, BarAgrLot, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarMaqTin >= ?) AND (BarMaqTin <= ?) ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 10);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((short[]) buf[27])[0] = rslt.getShort(26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(31);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(32);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               ((byte[]) buf[28])[0] = rslt.getByte(16);
               ((byte[]) buf[29])[0] = rslt.getByte(17);
               ((short[]) buf[30])[0] = rslt.getShort(18);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
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
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

