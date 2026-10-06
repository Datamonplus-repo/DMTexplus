package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prddia00_usuwcexport extends GXProcedure
{
   public prddia00_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prddia00_usuwcexport.class ), "" );
   }

   public prddia00_usuwcexport( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             int aP11 ,
                             int aP12 ,
                             String aP13 ,
                             String aP14 ,
                             byte aP15 ,
                             byte aP16 ,
                             byte aP17 ,
                             byte aP18 ,
                             byte aP19 ,
                             String[] aP20 )
   {
      prddia00_usuwcexport.this.aP21 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        int aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        int aP11 ,
                        int aP12 ,
                        String aP13 ,
                        String aP14 ,
                        byte aP15 ,
                        byte aP16 ,
                        byte aP17 ,
                        byte aP18 ,
                        byte aP19 ,
                        String[] aP20 ,
                        String[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             int aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             int aP11 ,
                             int aP12 ,
                             String aP13 ,
                             String aP14 ,
                             byte aP15 ,
                             byte aP16 ,
                             byte aP17 ,
                             byte aP18 ,
                             byte aP19 ,
                             String[] aP20 ,
                             String[] aP21 )
   {
      prddia00_usuwcexport.this.AV8Emprcod = aP0;
      prddia00_usuwcexport.this.AV9Maqcod = aP1;
      prddia00_usuwcexport.this.AV10Maqcod_to = aP2;
      prddia00_usuwcexport.this.AV11Hisprodtf = aP3;
      prddia00_usuwcexport.this.AV12Hisprodtf_to = aP4;
      prddia00_usuwcexport.this.AV50Clicod = aP5;
      prddia00_usuwcexport.this.AV51Clicod_to = aP6;
      prddia00_usuwcexport.this.AV44Barcolnom = aP7;
      prddia00_usuwcexport.this.AV45Barcolnom_to = aP8;
      prddia00_usuwcexport.this.AV53Fase = aP9;
      prddia00_usuwcexport.this.AV54Fase_to = aP10;
      prddia00_usuwcexport.this.AV56Opecod = aP11;
      prddia00_usuwcexport.this.AV57Opecod_to = aP12;
      prddia00_usuwcexport.this.AV47Barser = aP13;
      prddia00_usuwcexport.this.AV48Barser_to = aP14;
      prddia00_usuwcexport.this.AV60Sidia = aP15;
      prddia00_usuwcexport.this.AV61SiMaquina = aP16;
      prddia00_usuwcexport.this.AV62Imprimirparos = aP17;
      prddia00_usuwcexport.this.AV64intcodfrom = aP18;
      prddia00_usuwcexport.this.AV65intcodto = aP19;
      prddia00_usuwcexport.this.aP20 = aP20;
      prddia00_usuwcexport.this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV32Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      prddia00_usuwcexport.this.GXt_int1 = GXv_int2[0] ;
      AV32Grulec = GXt_int1 ;
      GXt_int1 = AV63jpf ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "JPF", ""), GXv_int2) ;
      prddia00_usuwcexport.this.GXt_int1 = GXv_int2[0] ;
      AV63jpf = GXt_int1 ;
      GXt_int1 = AV68fio ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "FIO", ""), GXv_int2) ;
      prddia00_usuwcexport.this.GXt_int1 = GXv_int2[0] ;
      AV68fio = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV72Random = (int)(GXutil.random( )*10000) ;
      AV70Filename = "InformeProduccionDiaria-" + GXutil.trim( GXutil.str( AV72Random, 8, 0)) + ".xlsx" ;
      AV15Exceldocument.Open(AV70Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV15Exceldocument.Clear();
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV15Exceldocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV15Exceldocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV15Exceldocument.getErrCode() != 0 )
      {
         AV70Filename = "" ;
         AV71ErrorMessage = AV15Exceldocument.getErrDescription() ;
         AV15Exceldocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV16CellRow = 1 ;
      AV17CellCol = 1 ;
      while ( AV17CellCol <= 30 )
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), (int)(AV17CellCol), 1, 1).setBold( (short)(1) );
         AV15Exceldocument.Cells((int)(AV16CellRow), (int)(AV17CellCol), 1, 1).setColor( 11 );
         AV17CellCol = (long)(AV17CellCol+1) ;
      }
      if ( (0==AV63jpf) )
      {
         AV15Exceldocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
         AV15Exceldocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
         AV15Exceldocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Dia", "") );
         AV15Exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
         AV15Exceldocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "N HDR", "") );
         AV15Exceldocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "A?", "") );
         AV15Exceldocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Lote", "") );
         AV15Exceldocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Ped Cli", "") );
         AV15Exceldocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Fecha Hdr", "") );
         AV15Exceldocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
         AV15Exceldocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
         AV15Exceldocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
         AV15Exceldocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Color", "") );
         AV15Exceldocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Numero", "") );
         AV15Exceldocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Tc", "") );
         AV15Exceldocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Intensidad", "") );
         AV15Exceldocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Operario/Paro", "") );
         AV15Exceldocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Fase", "") );
         AV15Exceldocument.Cells(1, 19, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
         if ( (0==AV68fio) )
         {
            AV15Exceldocument.Cells(1, 20, 1, 1).setText( httpContext.getMessage( "Metros", "") );
         }
         AV15Exceldocument.Cells(1, 21, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
         AV15Exceldocument.Cells(1, 22, 1, 1).setText( httpContext.getMessage( "Fin", "") );
         AV15Exceldocument.Cells(1, 23, 1, 1).setText( httpContext.getMessage( "Turno", "") );
         AV15Exceldocument.Cells(1, 24, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
         AV15Exceldocument.Cells(1, 25, 1, 1).setText( httpContext.getMessage( "Horas", "") );
         AV15Exceldocument.Cells(1, 26, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
         AV15Exceldocument.Cells(1, 27, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells(1, 27, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
         AV15Exceldocument.Cells(1, 28, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells(1, 28, 1, 1).setText( httpContext.getMessage( "Horas", "") );
         AV15Exceldocument.Cells(1, 29, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells(1, 29, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
         if ( AV68fio == 1 )
         {
            AV15Exceldocument.Cells(1, 30, 1, 1).setText( httpContext.getMessage( "Nº Fusos", "") );
         }
      }
      else
      {
         AV15Exceldocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
         AV15Exceldocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Dia", "") );
         AV15Exceldocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
         AV15Exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "OS", "") );
         AV15Exceldocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "OF", "") );
         AV15Exceldocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
         AV15Exceldocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
         AV15Exceldocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Tipo Articulo", "") );
         AV15Exceldocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
         AV15Exceldocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Color", "") );
         AV15Exceldocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "gm2 cru", "") );
         AV15Exceldocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "largura cru", "") );
         AV15Exceldocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Operario/Paro", "") );
         AV15Exceldocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
         AV15Exceldocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Metros", "") );
         AV15Exceldocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
         AV15Exceldocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Fin", "") );
         AV15Exceldocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Turno", "") );
         AV15Exceldocument.Cells(1, 19, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV16CellRow = 2 ;
      AV21TotalkMaquina = DecimalUtil.ZERO ;
      AV22TotalmMaquina = DecimalUtil.ZERO ;
      AV35TotaltiempoMaquina = DecimalUtil.ZERO ;
      AV36TotaltiempoparoMaquina = DecimalUtil.ZERO ;
      AV19TotalkMaquinaDia = DecimalUtil.ZERO ;
      AV20TotalmMaquinaDia = DecimalUtil.ZERO ;
      AV34TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
      AV33TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
      AV23TotalkGeneral = DecimalUtil.ZERO ;
      AV24TotalmGeneral = DecimalUtil.ZERO ;
      AV37Totaltiempogeneral = DecimalUtil.ZERO ;
      AV38Totaltiempoparogeneral = DecimalUtil.ZERO ;
      /* Using cursor P09TS2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV9Maqcod, AV11Hisprodtf, AV12Hisprodtf_to, Integer.valueOf(AV56Opecod), Integer.valueOf(AV57Opecod_to), Integer.valueOf(AV50Clicod), Integer.valueOf(AV51Clicod_to), AV53Fase, AV54Fase_to, AV47Barser, AV48Barser_to, AV44Barcolnom, AV45Barcolnom_to, AV10Maqcod_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9TS2 = false ;
         A6680HisproTdab = P09TS2_A6680HisproTdab[0] ;
         A130BarCodPar = P09TS2_A130BarCodPar[0] ;
         A132BarCodReo = P09TS2_A132BarCodReo[0] ;
         A129BarCod = P09TS2_A129BarCod[0] ;
         A3610HisProLot = P09TS2_A3610HisProLot[0] ;
         A217BarTipArt = P09TS2_A217BarTipArt[0] ;
         n217BarTipArt = P09TS2_n217BarTipArt[0] ;
         A136BarColNum = P09TS2_A136BarColNum[0] ;
         A218BarTipCol = P09TS2_A218BarTipCol[0] ;
         A656ParCod = P09TS2_A656ParCod[0] ;
         n656ParCod = P09TS2_n656ParCod[0] ;
         A606MaqDsc = P09TS2_A606MaqDsc[0] ;
         n606MaqDsc = P09TS2_n606MaqDsc[0] ;
         A279CliNom = P09TS2_A279CliNom[0] ;
         A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
         A143BarDisNum = P09TS2_A143BarDisNum[0] ;
         A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
         A159BarFecGen = P09TS2_A159BarFecGen[0] ;
         A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
         A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
         A1526HisProMtr = P09TS2_A1526HisProMtr[0] ;
         A566HisProTur = P09TS2_A566HisProTur[0] ;
         A14197HisProNFus = P09TS2_A14197HisProNFus[0] ;
         A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
         A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
         A867ParCodNom = P09TS2_A867ParCodNom[0] ;
         n867ParCodNom = P09TS2_n867ParCodNom[0] ;
         A5608HisProDf = P09TS2_A5608HisProDf[0] ;
         A503GruOpeCod = P09TS2_A503GruOpeCod[0] ;
         A252CliCod = P09TS2_A252CliCod[0] ;
         n252CliCod = P09TS2_n252CliCod[0] ;
         A461Fase = P09TS2_A461Fase[0] ;
         A212BarSer = P09TS2_A212BarSer[0] ;
         A135BarColNom = P09TS2_A135BarColNom[0] ;
         A1525HisProKgr = P09TS2_A1525HisProKgr[0] ;
         A602MaqCod = P09TS2_A602MaqCod[0] ;
         A396EmprCod = P09TS2_A396EmprCod[0] ;
         A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
         n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
         A4440HisProDTI = P09TS2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09TS2_n4440HisProDTI[0] ;
         A4441HisProDTF = P09TS2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09TS2_n4441HisProDTF[0] ;
         A558HisProFec = P09TS2_A558HisProFec[0] ;
         A561HisProLin = P09TS2_A561HisProLin[0] ;
         A606MaqDsc = P09TS2_A606MaqDsc[0] ;
         n606MaqDsc = P09TS2_n606MaqDsc[0] ;
         A217BarTipArt = P09TS2_A217BarTipArt[0] ;
         n217BarTipArt = P09TS2_n217BarTipArt[0] ;
         A136BarColNum = P09TS2_A136BarColNum[0] ;
         A218BarTipCol = P09TS2_A218BarTipCol[0] ;
         A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
         A143BarDisNum = P09TS2_A143BarDisNum[0] ;
         A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
         A159BarFecGen = P09TS2_A159BarFecGen[0] ;
         A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
         A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
         A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
         A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
         A252CliCod = P09TS2_A252CliCod[0] ;
         n252CliCod = P09TS2_n252CliCod[0] ;
         A212BarSer = P09TS2_A212BarSer[0] ;
         A135BarColNom = P09TS2_A135BarColNom[0] ;
         A279CliNom = P09TS2_A279CliNom[0] ;
         A867ParCodNom = P09TS2_A867ParCodNom[0] ;
         n867ParCodNom = P09TS2_n867ParCodNom[0] ;
         A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
         n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09TS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09TS2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9TS2 = false ;
            A6680HisproTdab = P09TS2_A6680HisproTdab[0] ;
            A130BarCodPar = P09TS2_A130BarCodPar[0] ;
            A132BarCodReo = P09TS2_A132BarCodReo[0] ;
            A129BarCod = P09TS2_A129BarCod[0] ;
            A3610HisProLot = P09TS2_A3610HisProLot[0] ;
            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
            A136BarColNum = P09TS2_A136BarColNum[0] ;
            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
            A656ParCod = P09TS2_A656ParCod[0] ;
            n656ParCod = P09TS2_n656ParCod[0] ;
            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
            A279CliNom = P09TS2_A279CliNom[0] ;
            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
            A1526HisProMtr = P09TS2_A1526HisProMtr[0] ;
            A566HisProTur = P09TS2_A566HisProTur[0] ;
            A14197HisProNFus = P09TS2_A14197HisProNFus[0] ;
            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
            A5608HisProDf = P09TS2_A5608HisProDf[0] ;
            A503GruOpeCod = P09TS2_A503GruOpeCod[0] ;
            A252CliCod = P09TS2_A252CliCod[0] ;
            n252CliCod = P09TS2_n252CliCod[0] ;
            A461Fase = P09TS2_A461Fase[0] ;
            A212BarSer = P09TS2_A212BarSer[0] ;
            A135BarColNom = P09TS2_A135BarColNom[0] ;
            A1525HisProKgr = P09TS2_A1525HisProKgr[0] ;
            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
            A4440HisProDTI = P09TS2_A4440HisProDTI[0] ;
            n4440HisProDTI = P09TS2_n4440HisProDTI[0] ;
            A4441HisProDTF = P09TS2_A4441HisProDTF[0] ;
            n4441HisProDTF = P09TS2_n4441HisProDTF[0] ;
            A558HisProFec = P09TS2_A558HisProFec[0] ;
            A561HisProLin = P09TS2_A561HisProLin[0] ;
            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
            A136BarColNum = P09TS2_A136BarColNum[0] ;
            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
            A252CliCod = P09TS2_A252CliCod[0] ;
            n252CliCod = P09TS2_n252CliCod[0] ;
            A212BarSer = P09TS2_A212BarSer[0] ;
            A135BarColNom = P09TS2_A135BarColNom[0] ;
            A279CliNom = P09TS2_A279CliNom[0] ;
            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
            if ( GXutil.strcmp(A396EmprCod, AV8Emprcod) == 0 )
            {
               if ( GXutil.strcmp(A602MaqCod, AV9Maqcod) >= 0 )
               {
                  if ( GXutil.strcmp(A602MaqCod, AV10Maqcod_to) <= 0 )
                  {
                     if ( A252CliCod >= AV50Clicod )
                     {
                        if ( A252CliCod <= AV51Clicod_to )
                        {
                           if ( GXutil.strcmp(A212BarSer, AV47Barser) >= 0 )
                           {
                              if ( GXutil.strcmp(A212BarSer, AV48Barser_to) <= 0 )
                              {
                                 if ( GXutil.strcmp(A135BarColNom, AV44Barcolnom) >= 0 )
                                 {
                                    if ( GXutil.strcmp(A135BarColNom, AV45Barcolnom_to) <= 0 )
                                    {
                                       if ( (( A4441HisProDTF.after( AV11Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV11Hisprodtf) )) )
                                       {
                                          if ( (( A4441HisProDTF.before( AV12Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV12Hisprodtf_to) )) )
                                          {
                                             if ( A503GruOpeCod >= AV56Opecod )
                                             {
                                                if ( A503GruOpeCod <= AV57Opecod_to )
                                                {
                                                   if ( GXutil.strcmp(A461Fase, AV53Fase) >= 0 )
                                                   {
                                                      if ( GXutil.strcmp(A461Fase, AV54Fase_to) <= 0 )
                                                      {
                                                         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                         {
                                                            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                         }
                                                         else
                                                         {
                                                            A5605HisProTr2 = (short)(0) ;
                                                         }
                                                         AV21TotalkMaquina = DecimalUtil.ZERO ;
                                                         AV22TotalmMaquina = DecimalUtil.ZERO ;
                                                         AV35TotaltiempoMaquina = DecimalUtil.ZERO ;
                                                         AV36TotaltiempoparoMaquina = DecimalUtil.ZERO ;
                                                         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09TS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09TS2_A602MaqCod[0], A602MaqCod) == 0 ) )
                                                         {
                                                            brk9TS2 = false ;
                                                            A6680HisproTdab = P09TS2_A6680HisproTdab[0] ;
                                                            A130BarCodPar = P09TS2_A130BarCodPar[0] ;
                                                            A132BarCodReo = P09TS2_A132BarCodReo[0] ;
                                                            A129BarCod = P09TS2_A129BarCod[0] ;
                                                            A3610HisProLot = P09TS2_A3610HisProLot[0] ;
                                                            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
                                                            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
                                                            A136BarColNum = P09TS2_A136BarColNum[0] ;
                                                            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
                                                            A656ParCod = P09TS2_A656ParCod[0] ;
                                                            n656ParCod = P09TS2_n656ParCod[0] ;
                                                            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
                                                            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
                                                            A279CliNom = P09TS2_A279CliNom[0] ;
                                                            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
                                                            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
                                                            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
                                                            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
                                                            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
                                                            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
                                                            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
                                                            A1526HisProMtr = P09TS2_A1526HisProMtr[0] ;
                                                            A566HisProTur = P09TS2_A566HisProTur[0] ;
                                                            A14197HisProNFus = P09TS2_A14197HisProNFus[0] ;
                                                            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
                                                            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
                                                            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
                                                            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
                                                            A5608HisProDf = P09TS2_A5608HisProDf[0] ;
                                                            A503GruOpeCod = P09TS2_A503GruOpeCod[0] ;
                                                            A252CliCod = P09TS2_A252CliCod[0] ;
                                                            n252CliCod = P09TS2_n252CliCod[0] ;
                                                            A461Fase = P09TS2_A461Fase[0] ;
                                                            A212BarSer = P09TS2_A212BarSer[0] ;
                                                            A135BarColNom = P09TS2_A135BarColNom[0] ;
                                                            A1525HisProKgr = P09TS2_A1525HisProKgr[0] ;
                                                            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
                                                            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
                                                            A4440HisProDTI = P09TS2_A4440HisProDTI[0] ;
                                                            n4440HisProDTI = P09TS2_n4440HisProDTI[0] ;
                                                            A4441HisProDTF = P09TS2_A4441HisProDTF[0] ;
                                                            n4441HisProDTF = P09TS2_n4441HisProDTF[0] ;
                                                            A558HisProFec = P09TS2_A558HisProFec[0] ;
                                                            A561HisProLin = P09TS2_A561HisProLin[0] ;
                                                            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
                                                            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
                                                            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
                                                            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
                                                            A136BarColNum = P09TS2_A136BarColNum[0] ;
                                                            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
                                                            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
                                                            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
                                                            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
                                                            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
                                                            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
                                                            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
                                                            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
                                                            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
                                                            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
                                                            A252CliCod = P09TS2_A252CliCod[0] ;
                                                            n252CliCod = P09TS2_n252CliCod[0] ;
                                                            A212BarSer = P09TS2_A212BarSer[0] ;
                                                            A135BarColNom = P09TS2_A135BarColNom[0] ;
                                                            A279CliNom = P09TS2_A279CliNom[0] ;
                                                            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
                                                            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
                                                            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
                                                            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
                                                            if ( GXutil.strcmp(A396EmprCod, AV8Emprcod) == 0 )
                                                            {
                                                               if ( GXutil.strcmp(A602MaqCod, AV9Maqcod) >= 0 )
                                                               {
                                                                  if ( GXutil.strcmp(A602MaqCod, AV10Maqcod_to) <= 0 )
                                                                  {
                                                                     if ( A252CliCod >= AV50Clicod )
                                                                     {
                                                                        if ( A252CliCod <= AV51Clicod_to )
                                                                        {
                                                                           if ( GXutil.strcmp(A212BarSer, AV47Barser) >= 0 )
                                                                           {
                                                                              if ( GXutil.strcmp(A212BarSer, AV48Barser_to) <= 0 )
                                                                              {
                                                                                 if ( GXutil.strcmp(A135BarColNom, AV44Barcolnom) >= 0 )
                                                                                 {
                                                                                    if ( GXutil.strcmp(A135BarColNom, AV45Barcolnom_to) <= 0 )
                                                                                    {
                                                                                       if ( (( A4441HisProDTF.after( AV11Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV11Hisprodtf) )) )
                                                                                       {
                                                                                          if ( (( A4441HisProDTF.before( AV12Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV12Hisprodtf_to) )) )
                                                                                          {
                                                                                             if ( A503GruOpeCod >= AV56Opecod )
                                                                                             {
                                                                                                if ( A503GruOpeCod <= AV57Opecod_to )
                                                                                                {
                                                                                                   if ( GXutil.strcmp(A461Fase, AV53Fase) >= 0 )
                                                                                                   {
                                                                                                      if ( GXutil.strcmp(A461Fase, AV54Fase_to) <= 0 )
                                                                                                      {
                                                                                                         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                                                                         {
                                                                                                            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                                                                         }
                                                                                                         else
                                                                                                         {
                                                                                                            A5605HisProTr2 = (short)(0) ;
                                                                                                         }
                                                                                                         AV19TotalkMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV20TotalmMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV34TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV33TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09TS2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09TS2_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P09TS2_A5608HisProDf[0]), GXutil.resetTime(A5608HisProDf)) )
                                                                                                         {
                                                                                                            brk9TS2 = false ;
                                                                                                            A6680HisproTdab = P09TS2_A6680HisproTdab[0] ;
                                                                                                            A130BarCodPar = P09TS2_A130BarCodPar[0] ;
                                                                                                            A132BarCodReo = P09TS2_A132BarCodReo[0] ;
                                                                                                            A129BarCod = P09TS2_A129BarCod[0] ;
                                                                                                            A3610HisProLot = P09TS2_A3610HisProLot[0] ;
                                                                                                            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
                                                                                                            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
                                                                                                            A136BarColNum = P09TS2_A136BarColNum[0] ;
                                                                                                            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
                                                                                                            A656ParCod = P09TS2_A656ParCod[0] ;
                                                                                                            n656ParCod = P09TS2_n656ParCod[0] ;
                                                                                                            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
                                                                                                            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
                                                                                                            A279CliNom = P09TS2_A279CliNom[0] ;
                                                                                                            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
                                                                                                            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
                                                                                                            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
                                                                                                            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
                                                                                                            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
                                                                                                            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
                                                                                                            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
                                                                                                            A1526HisProMtr = P09TS2_A1526HisProMtr[0] ;
                                                                                                            A566HisProTur = P09TS2_A566HisProTur[0] ;
                                                                                                            A14197HisProNFus = P09TS2_A14197HisProNFus[0] ;
                                                                                                            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
                                                                                                            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
                                                                                                            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
                                                                                                            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
                                                                                                            A503GruOpeCod = P09TS2_A503GruOpeCod[0] ;
                                                                                                            A252CliCod = P09TS2_A252CliCod[0] ;
                                                                                                            n252CliCod = P09TS2_n252CliCod[0] ;
                                                                                                            A461Fase = P09TS2_A461Fase[0] ;
                                                                                                            A212BarSer = P09TS2_A212BarSer[0] ;
                                                                                                            A135BarColNom = P09TS2_A135BarColNom[0] ;
                                                                                                            A1525HisProKgr = P09TS2_A1525HisProKgr[0] ;
                                                                                                            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
                                                                                                            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
                                                                                                            A4440HisProDTI = P09TS2_A4440HisProDTI[0] ;
                                                                                                            n4440HisProDTI = P09TS2_n4440HisProDTI[0] ;
                                                                                                            A4441HisProDTF = P09TS2_A4441HisProDTF[0] ;
                                                                                                            n4441HisProDTF = P09TS2_n4441HisProDTF[0] ;
                                                                                                            A558HisProFec = P09TS2_A558HisProFec[0] ;
                                                                                                            A561HisProLin = P09TS2_A561HisProLin[0] ;
                                                                                                            A606MaqDsc = P09TS2_A606MaqDsc[0] ;
                                                                                                            n606MaqDsc = P09TS2_n606MaqDsc[0] ;
                                                                                                            A217BarTipArt = P09TS2_A217BarTipArt[0] ;
                                                                                                            n217BarTipArt = P09TS2_n217BarTipArt[0] ;
                                                                                                            A136BarColNum = P09TS2_A136BarColNum[0] ;
                                                                                                            A218BarTipCol = P09TS2_A218BarTipCol[0] ;
                                                                                                            A120BarAgrEst = P09TS2_A120BarAgrEst[0] ;
                                                                                                            A143BarDisNum = P09TS2_A143BarDisNum[0] ;
                                                                                                            A4812BarEncCli = P09TS2_A4812BarEncCli[0] ;
                                                                                                            A159BarFecGen = P09TS2_A159BarFecGen[0] ;
                                                                                                            A1652BarSerDsc = P09TS2_A1652BarSerDsc[0] ;
                                                                                                            A13907BarSerDsc2 = P09TS2_A13907BarSerDsc2[0] ;
                                                                                                            n13907BarSerDsc2 = P09TS2_n13907BarSerDsc2[0] ;
                                                                                                            A1226BarGraCru = P09TS2_A1226BarGraCru[0] ;
                                                                                                            A127BarAncCru1 = P09TS2_A127BarAncCru1[0] ;
                                                                                                            A252CliCod = P09TS2_A252CliCod[0] ;
                                                                                                            n252CliCod = P09TS2_n252CliCod[0] ;
                                                                                                            A212BarSer = P09TS2_A212BarSer[0] ;
                                                                                                            A135BarColNom = P09TS2_A135BarColNom[0] ;
                                                                                                            A279CliNom = P09TS2_A279CliNom[0] ;
                                                                                                            A867ParCodNom = P09TS2_A867ParCodNom[0] ;
                                                                                                            n867ParCodNom = P09TS2_n867ParCodNom[0] ;
                                                                                                            A13904BarIntColo = P09TS2_A13904BarIntColo[0] ;
                                                                                                            n13904BarIntColo = P09TS2_n13904BarIntColo[0] ;
                                                                                                            if ( GXutil.strcmp(A396EmprCod, AV8Emprcod) == 0 )
                                                                                                            {
                                                                                                               if ( GXutil.strcmp(A602MaqCod, AV9Maqcod) >= 0 )
                                                                                                               {
                                                                                                                  if ( GXutil.strcmp(A602MaqCod, AV10Maqcod_to) <= 0 )
                                                                                                                  {
                                                                                                                     if ( A252CliCod >= AV50Clicod )
                                                                                                                     {
                                                                                                                        if ( A252CliCod <= AV51Clicod_to )
                                                                                                                        {
                                                                                                                           if ( GXutil.strcmp(A212BarSer, AV47Barser) >= 0 )
                                                                                                                           {
                                                                                                                              if ( GXutil.strcmp(A212BarSer, AV48Barser_to) <= 0 )
                                                                                                                              {
                                                                                                                                 if ( GXutil.strcmp(A135BarColNom, AV44Barcolnom) >= 0 )
                                                                                                                                 {
                                                                                                                                    if ( GXutil.strcmp(A135BarColNom, AV45Barcolnom_to) <= 0 )
                                                                                                                                    {
                                                                                                                                       if ( (( A4441HisProDTF.after( AV11Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV11Hisprodtf) )) )
                                                                                                                                       {
                                                                                                                                          if ( (( A4441HisProDTF.before( AV12Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV12Hisprodtf_to) )) )
                                                                                                                                          {
                                                                                                                                             if ( A503GruOpeCod >= AV56Opecod )
                                                                                                                                             {
                                                                                                                                                if ( A503GruOpeCod <= AV57Opecod_to )
                                                                                                                                                {
                                                                                                                                                   if ( GXutil.strcmp(A461Fase, AV53Fase) >= 0 )
                                                                                                                                                   {
                                                                                                                                                      if ( GXutil.strcmp(A461Fase, AV54Fase_to) <= 0 )
                                                                                                                                                      {
                                                                                                                                                         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                                                                                                                         {
                                                                                                                                                            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                                                                                                                         }
                                                                                                                                                         else
                                                                                                                                                         {
                                                                                                                                                            A5605HisProTr2 = (short)(0) ;
                                                                                                                                                         }
                                                                                                                                                         if ( A13904BarIntColo >= AV64intcodfrom )
                                                                                                                                                         {
                                                                                                                                                            if ( A13904BarIntColo <= AV65intcodto )
                                                                                                                                                            {
                                                                                                                                                               GXv_char3[0] = A396EmprCod ;
                                                                                                                                                               GXv_char4[0] = A461Fase ;
                                                                                                                                                               GXv_char5[0] = AV66FasDivTime ;
                                                                                                                                                               new app.pfasdivtime(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
                                                                                                                                                               prddia00_usuwcexport.this.A396EmprCod = GXv_char3[0] ;
                                                                                                                                                               prddia00_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                               prddia00_usuwcexport.this.AV66FasDivTime = GXv_char5[0] ;
                                                                                                                                                               AV67HisProTr2 = ((GXutil.strcmp(AV66FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
                                                                                                                                                               AV39HhMm = DecimalUtil.doubleToDec(AV67HisProTr2/ (double) (60)) ;
                                                                                                                                                               AV40HorRea = (short)(AV67HisProTr2/ (double) (60)) ;
                                                                                                                                                               AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
                                                                                                                                                               AV42MinRea = DecimalUtil.doubleToDec(AV67HisProTr2).subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                                                               AV59Minutos = DecimalUtil.doubleToDec(AV67HisProTr2) ;
                                                                                                                                                               GXt_char6 = AV29FasActtin ;
                                                                                                                                                               GXv_char5[0] = A396EmprCod ;
                                                                                                                                                               GXv_char4[0] = A461Fase ;
                                                                                                                                                               GXv_char3[0] = GXt_char6 ;
                                                                                                                                                               new app.pfasest(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
                                                                                                                                                               prddia00_usuwcexport.this.A396EmprCod = GXv_char5[0] ;
                                                                                                                                                               prddia00_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                               prddia00_usuwcexport.this.GXt_char6 = GXv_char3[0] ;
                                                                                                                                                               AV29FasActtin = GXt_char6 ;
                                                                                                                                                               AV30FlagMarca = (byte)(0) ;
                                                                                                                                                               AV31HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                                                                                                                                               AV30FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV31HisProLot)==0) ? 1 : AV30FlagMarca)) ;
                                                                                                                                                               if ( AV32Grulec == 0 )
                                                                                                                                                               {
                                                                                                                                                                  if ( GXutil.strcmp(AV29FasActtin, httpContext.getMessage( "N", "")) == 0 )
                                                                                                                                                                  {
                                                                                                                                                                     AV30FlagMarca = (byte)(1) ;
                                                                                                                                                                  }
                                                                                                                                                               }
                                                                                                                                                               else
                                                                                                                                                               {
                                                                                                                                                                  if ( ( GXutil.strcmp(A3610HisProLot, AV31HisProLot) == 0 ) && ( GXutil.strcmp(AV29FasActtin, httpContext.getMessage( "N", "")) == 0 ) )
                                                                                                                                                                  {
                                                                                                                                                                     AV30FlagMarca = (byte)(1) ;
                                                                                                                                                                  }
                                                                                                                                                               }
                                                                                                                                                               GXt_char6 = AV25TipArtDsc ;
                                                                                                                                                               GXv_char5[0] = GXt_char6 ;
                                                                                                                                                               new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char5) ;
                                                                                                                                                               prddia00_usuwcexport.this.GXt_char6 = GXv_char5[0] ;
                                                                                                                                                               AV25TipArtDsc = GXt_char6 ;
                                                                                                                                                               GXt_char6 = AV27OpeNom ;
                                                                                                                                                               GXv_char5[0] = GXt_char6 ;
                                                                                                                                                               new app.produccion.openom_pr(remoteHandle, context).execute( AV8Emprcod, A503GruOpeCod, GXv_char5) ;
                                                                                                                                                               prddia00_usuwcexport.this.GXt_char6 = GXv_char5[0] ;
                                                                                                                                                               AV27OpeNom = GXt_char6 ;
                                                                                                                                                               GXt_char6 = AV28FasDsc ;
                                                                                                                                                               GXv_char5[0] = GXt_char6 ;
                                                                                                                                                               new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char5) ;
                                                                                                                                                               prddia00_usuwcexport.this.GXt_char6 = GXv_char5[0] ;
                                                                                                                                                               AV28FasDsc = GXt_char6 ;
                                                                                                                                                               GXv_char5[0] = AV26IntDsc ;
                                                                                                                                                               GXv_char4[0] = " " ;
                                                                                                                                                               GXv_int7[0] = (short)(0) ;
                                                                                                                                                               GXv_int2[0] = (byte)(0) ;
                                                                                                                                                               GXv_char3[0] = " " ;
                                                                                                                                                               GXv_char8[0] = " " ;
                                                                                                                                                               GXv_int9[0] = 0 ;
                                                                                                                                                               GXv_char10[0] = " " ;
                                                                                                                                                               GXv_char11[0] = " " ;
                                                                                                                                                               GXv_int12[0] = (short)(0) ;
                                                                                                                                                               GXv_char13[0] = " " ;
                                                                                                                                                               GXv_char14[0] = " " ;
                                                                                                                                                               new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char5, GXv_char4, GXv_int7, GXv_int2, GXv_char3, GXv_char8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
                                                                                                                                                               prddia00_usuwcexport.this.AV26IntDsc = GXv_char5[0] ;
                                                                                                                                                               if ( (0==A656ParCod) )
                                                                                                                                                               {
                                                                                                                                                                  if ( (0==AV63jpf) )
                                                                                                                                                                  {
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( A606MaqDsc );
                                                                                                                                                                     GXt_dtime15 = GXutil.resetTime( A5608HisProDf );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setText( A279CliNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setText( GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setText( A120BarAgrEst );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setText( A3610HisProLot );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setText( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
                                                                                                                                                                     GXt_dtime15 = GXutil.resetTime( A159BarFecGen );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setText( A212BarSer );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setText( ((GXutil.strcmp(A13907BarSerDsc2, " ")==0) ? GXutil.trim( A1652BarSerDsc) : GXutil.trim( A13907BarSerDsc2)) );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setText( AV25TipArtDsc );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setText( A135BarColNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( A136BarColNum );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( A218BarTipCol );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setText( AV26IntDsc );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setText( AV27OpeNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setText( AV28FasDsc );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                                                                                                                                                     if ( (0==AV68fio) )
                                                                                                                                                                     {
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                                                                                                                                                     }
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 21, 1, 1).setDate( A4440HisProDTI );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 22, 1, 1).setDate( A4441HisProDTF );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 23, 1, 1).setNumber( A566HisProTur );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 24, 1, 1).setNumber( AV67HisProTr2 );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 25, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 26, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42MinRea)) );
                                                                                                                                                                     if ( AV68fio == 1 )
                                                                                                                                                                     {
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 27, 1, 1).setNumber( A14197HisProNFus );
                                                                                                                                                                     }
                                                                                                                                                                  }
                                                                                                                                                                  else
                                                                                                                                                                  {
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                                                                     GXt_dtime15 = GXutil.resetTime( A5608HisProDf );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setText( A279CliNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setText( GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setText( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setText( A212BarSer );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setText( ((GXutil.strcmp(A13907BarSerDsc2, " ")==0) ? GXutil.trim( A1652BarSerDsc) : GXutil.trim( A13907BarSerDsc2)) );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setText( AV25TipArtDsc );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setText( A135BarColNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setText( AV26IntDsc );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setNumber( A1226BarGraCru );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setNumber( A127BarAncCru1 );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setText( AV27OpeNom );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setDate( A4440HisProDTI );
                                                                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setDate( A4441HisProDTF );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setNumber( A566HisProTur );
                                                                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( AV67HisProTr2 );
                                                                                                                                                                  }
                                                                                                                                                                  AV19TotalkMaquinaDia = AV19TotalkMaquinaDia.add(A1525HisProKgr) ;
                                                                                                                                                                  AV20TotalmMaquinaDia = AV20TotalmMaquinaDia.add(A1526HisProMtr) ;
                                                                                                                                                                  AV34TotaltiempoMaquinaDia = AV34TotaltiempoMaquinaDia.add((((GXutil.strcmp(AV66FasDivTime, httpContext.getMessage( "S", ""))==0) ? DecimalUtil.doubleToDec(AV67HisProTr2) : ((AV30FlagMarca==1) ? DecimalUtil.doubleToDec(AV67HisProTr2) : DecimalUtil.doubleToDec(0))))) ;
                                                                                                                                                                  AV16CellRow = (long)(AV16CellRow+1) ;
                                                                                                                                                               }
                                                                                                                                                               else
                                                                                                                                                               {
                                                                                                                                                                  if ( AV62Imprimirparos == 1 )
                                                                                                                                                                  {
                                                                                                                                                                     if ( (0==AV63jpf) )
                                                                                                                                                                     {
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( A606MaqDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setColor( 3 );
                                                                                                                                                                        GXt_dtime15 = GXutil.resetTime( A5608HisProDf );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setText( A279CliNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setText( GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setText( A120BarAgrEst );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setText( A3610HisProLot );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setText( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setColor( 3 );
                                                                                                                                                                        GXt_dtime15 = GXutil.resetTime( A159BarFecGen );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setText( A212BarSer );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setText( A1652BarSerDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setText( AV25TipArtDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setText( A135BarColNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( A136BarColNum );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( A218BarTipCol );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setText( AV26IntDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setText( A867ParCodNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setText( AV28FasDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                                                                                                                                                        if ( (0==AV68fio) )
                                                                                                                                                                        {
                                                                                                                                                                           AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setColor( 3 );
                                                                                                                                                                           AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                                                                                                                                                        }
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 21, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 21, 1, 1).setDate( A4440HisProDTI );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 22, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 22, 1, 1).setDate( A4441HisProDTF );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 23, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 23, 1, 1).setNumber( A566HisProTur );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 27, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 27, 1, 1).setNumber( AV67HisProTr2 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 29, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 29, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42MinRea)) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 30, 1, 1).setNumber( A6680HisproTdab );
                                                                                                                                                                     }
                                                                                                                                                                     else
                                                                                                                                                                     {
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setColor( 3 );
                                                                                                                                                                        GXt_dtime15 = GXutil.resetTime( A5608HisProDf );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setDate( GXt_dtime15 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setText( A279CliNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setText( GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setText( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setText( A212BarSer );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setText( A1652BarSerDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setText( AV25TipArtDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setText( A135BarColNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setText( AV26IntDsc );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 12, 1, 1).setText( " " );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 13, 1, 1).setText( A867ParCodNom );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 16, 1, 1).setDate( A4440HisProDTI );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 17, 1, 1).setDate( A4441HisProDTF );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 18, 1, 1).setNumber( A566HisProTur );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setColor( 3 );
                                                                                                                                                                        AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV42MinRea)) );
                                                                                                                                                                     }
                                                                                                                                                                     AV33TotaltiempoparoMaquinaDia = AV33TotaltiempoparoMaquinaDia.add((((AV30FlagMarca==1) ? DecimalUtil.doubleToDec(AV67HisProTr2) : DecimalUtil.doubleToDec(0)))) ;
                                                                                                                                                                     AV16CellRow = (long)(AV16CellRow+1) ;
                                                                                                                                                                  }
                                                                                                                                                               }
                                                                                                                                                            }
                                                                                                                                                         }
                                                                                                                                                      }
                                                                                                                                                   }
                                                                                                                                                }
                                                                                                                                             }
                                                                                                                                          }
                                                                                                                                       }
                                                                                                                                    }
                                                                                                                                 }
                                                                                                                              }
                                                                                                                           }
                                                                                                                        }
                                                                                                                     }
                                                                                                                  }
                                                                                                               }
                                                                                                            }
                                                                                                            brk9TS2 = true ;
                                                                                                            pr_default.readNext(0);
                                                                                                         }
                                                                                                         if ( AV60Sidia == 1 )
                                                                                                         {
                                                                                                            GXt_dtime15 = GXutil.resetTime( A5608HisProDf );
                                                                                                            AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                            AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setDate( GXt_dtime15 );
                                                                                                            if ( (0==AV63jpf) )
                                                                                                            {
                                                                                                               AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19TotalkMaquinaDia)) );
                                                                                                               AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20TotalmMaquinaDia)) );
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                               AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19TotalkMaquinaDia)) );
                                                                                                               AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20TotalmMaquinaDia)) );
                                                                                                            }
                                                                                                            AV39HhMm = AV34TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                                                                            AV40HorRea = (short)(DecimalUtil.decToDouble(AV34TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                                                                            AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                            AV42MinRea = AV34TotaltiempoMaquinaDia.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                            AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                            AV15Exceldocument.Cells((int)(AV16CellRow), 25, 1, 1).setText( AV43HhMm_t );
                                                                                                            if ( AV62Imprimirparos == 1 )
                                                                                                            {
                                                                                                               AV39HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV33TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
                                                                                                               AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV33TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
                                                                                                               AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
                                                                                                               AV42MinRea = AV33TotaltiempoparoMaquinaDia.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                               AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                               if ( (0==AV63jpf) )
                                                                                                               {
                                                                                                                  AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setColor( 3 );
                                                                                                                  AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setText( AV43HhMm_t );
                                                                                                               }
                                                                                                               else
                                                                                                               {
                                                                                                                  AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setColor( 3 );
                                                                                                                  AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setText( AV43HhMm_t );
                                                                                                               }
                                                                                                            }
                                                                                                            AV16CellRow = (long)(AV16CellRow+1) ;
                                                                                                         }
                                                                                                         AV21TotalkMaquina = AV21TotalkMaquina.add(AV19TotalkMaquinaDia) ;
                                                                                                         AV22TotalmMaquina = AV22TotalmMaquina.add(AV20TotalmMaquinaDia) ;
                                                                                                         AV35TotaltiempoMaquina = AV35TotaltiempoMaquina.add(AV34TotaltiempoMaquinaDia) ;
                                                                                                         AV36TotaltiempoparoMaquina = AV36TotaltiempoparoMaquina.add(AV33TotaltiempoparoMaquinaDia) ;
                                                                                                         AV19TotalkMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV20TotalmMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV34TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                         AV33TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                      }
                                                                                                   }
                                                                                                }
                                                                                             }
                                                                                          }
                                                                                       }
                                                                                    }
                                                                                 }
                                                                              }
                                                                           }
                                                                        }
                                                                     }
                                                                  }
                                                               }
                                                            }
                                                            if ( ! brk9TS2 )
                                                            {
                                                               brk9TS2 = true ;
                                                               pr_default.readNext(0);
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            if ( ! brk9TS2 )
            {
               brk9TS2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( AV61SiMaquina == 1 )
         {
            AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
            AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( A606MaqDsc );
            if ( (0==AV63jpf) )
            {
               AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotalkMaquina)) );
               AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotalmMaquina)) );
            }
            else
            {
               AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotalkMaquina)) );
               AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotalmMaquina)) );
            }
            AV39HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV35TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
            AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV35TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
            AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
            AV42MinRea = AV35TotaltiempoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
            AV42MinRea = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV42MinRea))) ;
            AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
            AV15Exceldocument.Cells((int)(AV16CellRow), 25, 1, 1).setText( AV43HhMm_t );
            if ( AV62Imprimirparos == 1 )
            {
               AV39HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV36TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
               AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV36TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
               AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
               AV42MinRea = AV36TotaltiempoparoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
               AV42MinRea = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV42MinRea))) ;
               AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
               if ( (0==AV63jpf) )
               {
                  AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setColor( 3 );
                  AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setText( AV43HhMm_t );
               }
               else
               {
                  AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setColor( 3 );
                  AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setText( AV43HhMm_t );
               }
            }
            AV16CellRow = (long)(AV16CellRow+1) ;
         }
         AV23TotalkGeneral = AV23TotalkGeneral.add(AV21TotalkMaquina) ;
         AV24TotalmGeneral = AV24TotalmGeneral.add(AV22TotalmMaquina) ;
         AV37Totaltiempogeneral = AV37Totaltiempogeneral.add(AV35TotaltiempoMaquina) ;
         AV38Totaltiempoparogeneral = AV38Totaltiempoparogeneral.add(AV36TotaltiempoparoMaquina) ;
         AV21TotalkMaquina = DecimalUtil.ZERO ;
         AV22TotalmMaquina = DecimalUtil.ZERO ;
         AV36TotaltiempoparoMaquina = DecimalUtil.ZERO ;
         if ( ! brk9TS2 )
         {
            brk9TS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( httpContext.getMessage( "Total General", "") );
      if ( (0==AV63jpf) )
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23TotalkGeneral)) );
         if ( (0==AV68fio) )
         {
            AV15Exceldocument.Cells((int)(AV16CellRow), 20, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotalmGeneral)) );
         }
      }
      else
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23TotalkGeneral)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotalmGeneral)) );
      }
      AV39HhMm = AV37Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
      AV40HorRea = (short)(DecimalUtil.decToDouble(AV37Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
      AV42MinRea = AV37Totaltiempogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
      AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
      if ( (0==AV63jpf) )
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), 25, 1, 1).setText( AV43HhMm_t );
      }
      else
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setText( AV43HhMm_t );
      }
      if ( AV62Imprimirparos == 1 )
      {
         AV39HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV38Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
         AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV38Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
         AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
         AV42MinRea = AV38Totaltiempoparogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
         AV42MinRea = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV42MinRea))) ;
         AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
         if ( (0==AV63jpf) )
         {
            AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setColor( 3 );
            AV15Exceldocument.Cells((int)(AV16CellRow), 28, 1, 1).setText( AV43HhMm_t );
         }
         else
         {
            AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setColor( 3 );
            AV15Exceldocument.Cells((int)(AV16CellRow), 19, 1, 1).setText( AV43HhMm_t );
         }
      }
   }

   protected void cleanup( )
   {
      this.aP20[0] = prddia00_usuwcexport.this.AV70Filename;
      this.aP21[0] = prddia00_usuwcexport.this.AV71ErrorMessage;
      CloseOpenCursors();
      AV15Exceldocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV70Filename = "" ;
      AV71ErrorMessage = "" ;
      AV15Exceldocument = new com.genexus.gxoffice.ExcelDoc();
      AV21TotalkMaquina = DecimalUtil.ZERO ;
      AV22TotalmMaquina = DecimalUtil.ZERO ;
      AV35TotaltiempoMaquina = DecimalUtil.ZERO ;
      AV36TotaltiempoparoMaquina = DecimalUtil.ZERO ;
      AV19TotalkMaquinaDia = DecimalUtil.ZERO ;
      AV20TotalmMaquinaDia = DecimalUtil.ZERO ;
      AV34TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
      AV33TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
      AV23TotalkGeneral = DecimalUtil.ZERO ;
      AV24TotalmGeneral = DecimalUtil.ZERO ;
      AV37Totaltiempogeneral = DecimalUtil.ZERO ;
      AV38Totaltiempoparogeneral = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09TS2_A494ForSer = new String[] {""} ;
      P09TS2_A482ForColNom = new String[] {""} ;
      P09TS2_A483ForColNum = new int[1] ;
      P09TS2_A831TipColCod = new byte[1] ;
      P09TS2_A6680HisproTdab = new short[1] ;
      P09TS2_A130BarCodPar = new String[] {""} ;
      P09TS2_A132BarCodReo = new byte[1] ;
      P09TS2_A129BarCod = new int[1] ;
      P09TS2_A3610HisProLot = new String[] {""} ;
      P09TS2_A217BarTipArt = new short[1] ;
      P09TS2_n217BarTipArt = new boolean[] {false} ;
      P09TS2_A136BarColNum = new int[1] ;
      P09TS2_A218BarTipCol = new byte[1] ;
      P09TS2_A656ParCod = new short[1] ;
      P09TS2_n656ParCod = new boolean[] {false} ;
      P09TS2_A606MaqDsc = new String[] {""} ;
      P09TS2_n606MaqDsc = new boolean[] {false} ;
      P09TS2_A279CliNom = new String[] {""} ;
      P09TS2_A120BarAgrEst = new String[] {""} ;
      P09TS2_A143BarDisNum = new String[] {""} ;
      P09TS2_A4812BarEncCli = new String[] {""} ;
      P09TS2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09TS2_A1652BarSerDsc = new String[] {""} ;
      P09TS2_A13907BarSerDsc2 = new String[] {""} ;
      P09TS2_n13907BarSerDsc2 = new boolean[] {false} ;
      P09TS2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09TS2_A566HisProTur = new byte[1] ;
      P09TS2_A14197HisProNFus = new int[1] ;
      P09TS2_A1226BarGraCru = new short[1] ;
      P09TS2_A127BarAncCru1 = new short[1] ;
      P09TS2_A867ParCodNom = new String[] {""} ;
      P09TS2_n867ParCodNom = new boolean[] {false} ;
      P09TS2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P09TS2_A503GruOpeCod = new int[1] ;
      P09TS2_A252CliCod = new int[1] ;
      P09TS2_n252CliCod = new boolean[] {false} ;
      P09TS2_A461Fase = new String[] {""} ;
      P09TS2_A212BarSer = new String[] {""} ;
      P09TS2_A135BarColNom = new String[] {""} ;
      P09TS2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09TS2_A602MaqCod = new String[] {""} ;
      P09TS2_A396EmprCod = new String[] {""} ;
      P09TS2_A13904BarIntColo = new byte[1] ;
      P09TS2_n13904BarIntColo = new boolean[] {false} ;
      P09TS2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09TS2_n4440HisProDTI = new boolean[] {false} ;
      P09TS2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09TS2_n4441HisProDTF = new boolean[] {false} ;
      P09TS2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09TS2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A279CliNom = "" ;
      A120BarAgrEst = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A13907BarSerDsc2 = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A461Fase = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV66FasDivTime = "" ;
      AV39HhMm = DecimalUtil.ZERO ;
      AV41HorReaint = DecimalUtil.ZERO ;
      AV42MinRea = DecimalUtil.ZERO ;
      AV59Minutos = DecimalUtil.ZERO ;
      AV29FasActtin = "" ;
      AV31HisProLot = "" ;
      AV25TipArtDsc = "" ;
      AV27OpeNom = "" ;
      AV28FasDsc = "" ;
      GXt_char6 = "" ;
      AV26IntDsc = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXt_dtime15 = GXutil.resetTime( GXutil.nullDate() );
      AV43HhMm_t = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.prddia00_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P09TS2_A494ForSer, P09TS2_A482ForColNom, P09TS2_A483ForColNum, P09TS2_A831TipColCod, P09TS2_A6680HisproTdab, P09TS2_A130BarCodPar, P09TS2_A132BarCodReo, P09TS2_A129BarCod, P09TS2_A3610HisProLot, P09TS2_A217BarTipArt,
            P09TS2_n217BarTipArt, P09TS2_A136BarColNum, P09TS2_A218BarTipCol, P09TS2_A656ParCod, P09TS2_n656ParCod, P09TS2_A606MaqDsc, P09TS2_n606MaqDsc, P09TS2_A279CliNom, P09TS2_A120BarAgrEst, P09TS2_A143BarDisNum,
            P09TS2_A4812BarEncCli, P09TS2_A159BarFecGen, P09TS2_A1652BarSerDsc, P09TS2_A13907BarSerDsc2, P09TS2_n13907BarSerDsc2, P09TS2_A1526HisProMtr, P09TS2_A566HisProTur, P09TS2_A14197HisProNFus, P09TS2_A1226BarGraCru, P09TS2_A127BarAncCru1,
            P09TS2_A867ParCodNom, P09TS2_n867ParCodNom, P09TS2_A5608HisProDf, P09TS2_A503GruOpeCod, P09TS2_A252CliCod, P09TS2_n252CliCod, P09TS2_A461Fase, P09TS2_A212BarSer, P09TS2_A135BarColNom, P09TS2_A1525HisProKgr,
            P09TS2_A602MaqCod, P09TS2_A396EmprCod, P09TS2_A13904BarIntColo, P09TS2_n13904BarIntColo, P09TS2_A4440HisProDTI, P09TS2_n4440HisProDTI, P09TS2_A4441HisProDTF, P09TS2_n4441HisProDTF, P09TS2_A558HisProFec, P09TS2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60Sidia ;
   private byte AV61SiMaquina ;
   private byte AV62Imprimirparos ;
   private byte AV64intcodfrom ;
   private byte AV65intcodto ;
   private byte AV32Grulec ;
   private byte AV63jpf ;
   private byte AV68fio ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A566HisProTur ;
   private byte A13904BarIntColo ;
   private byte AV30FlagMarca ;
   private byte GXv_int2[] ;
   private short A6680HisproTdab ;
   private short A217BarTipArt ;
   private short A656ParCod ;
   private short A1226BarGraCru ;
   private short A127BarAncCru1 ;
   private short A5605HisProTr2 ;
   private short AV67HisProTr2 ;
   private short AV40HorRea ;
   private short GXv_int7[] ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int AV50Clicod ;
   private int AV51Clicod_to ;
   private int AV56Opecod ;
   private int AV57Opecod_to ;
   private int AV72Random ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A14197HisProNFus ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int GXv_int9[] ;
   private long AV16CellRow ;
   private long AV17CellCol ;
   private java.math.BigDecimal AV21TotalkMaquina ;
   private java.math.BigDecimal AV22TotalmMaquina ;
   private java.math.BigDecimal AV35TotaltiempoMaquina ;
   private java.math.BigDecimal AV36TotaltiempoparoMaquina ;
   private java.math.BigDecimal AV19TotalkMaquinaDia ;
   private java.math.BigDecimal AV20TotalmMaquinaDia ;
   private java.math.BigDecimal AV34TotaltiempoMaquinaDia ;
   private java.math.BigDecimal AV33TotaltiempoparoMaquinaDia ;
   private java.math.BigDecimal AV23TotalkGeneral ;
   private java.math.BigDecimal AV24TotalmGeneral ;
   private java.math.BigDecimal AV37Totaltiempogeneral ;
   private java.math.BigDecimal AV38Totaltiempoparogeneral ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV39HhMm ;
   private java.math.BigDecimal AV41HorReaint ;
   private java.math.BigDecimal AV42MinRea ;
   private java.math.BigDecimal AV59Minutos ;
   private String AV8Emprcod ;
   private String AV9Maqcod ;
   private String AV10Maqcod_to ;
   private String AV44Barcolnom ;
   private String AV45Barcolnom_to ;
   private String AV53Fase ;
   private String AV54Fase_to ;
   private String AV47Barser ;
   private String AV48Barser_to ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String A279CliNom ;
   private String A120BarAgrEst ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A1652BarSerDsc ;
   private String A867ParCodNom ;
   private String A461Fase ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String AV66FasDivTime ;
   private String AV29FasActtin ;
   private String AV31HisProLot ;
   private String AV25TipArtDsc ;
   private String AV27OpeNom ;
   private String AV28FasDsc ;
   private String GXt_char6 ;
   private String AV26IntDsc ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char8[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String AV43HhMm_t ;
   private java.util.Date AV11Hisprodtf ;
   private java.util.Date AV12Hisprodtf_to ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXt_dtime15 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk9TS2 ;
   private boolean n217BarTipArt ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n13907BarSerDsc2 ;
   private boolean n867ParCodNom ;
   private boolean n252CliCod ;
   private boolean n13904BarIntColo ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV70Filename ;
   private String AV71ErrorMessage ;
   private String A13907BarSerDsc2 ;
   private String[] aP21 ;
   private String[] aP20 ;
   private IDataStoreProvider pr_default ;
   private String[] P09TS2_A494ForSer ;
   private String[] P09TS2_A482ForColNom ;
   private int[] P09TS2_A483ForColNum ;
   private byte[] P09TS2_A831TipColCod ;
   private short[] P09TS2_A6680HisproTdab ;
   private String[] P09TS2_A130BarCodPar ;
   private byte[] P09TS2_A132BarCodReo ;
   private int[] P09TS2_A129BarCod ;
   private String[] P09TS2_A3610HisProLot ;
   private short[] P09TS2_A217BarTipArt ;
   private boolean[] P09TS2_n217BarTipArt ;
   private int[] P09TS2_A136BarColNum ;
   private byte[] P09TS2_A218BarTipCol ;
   private short[] P09TS2_A656ParCod ;
   private boolean[] P09TS2_n656ParCod ;
   private String[] P09TS2_A606MaqDsc ;
   private boolean[] P09TS2_n606MaqDsc ;
   private String[] P09TS2_A279CliNom ;
   private String[] P09TS2_A120BarAgrEst ;
   private String[] P09TS2_A143BarDisNum ;
   private String[] P09TS2_A4812BarEncCli ;
   private java.util.Date[] P09TS2_A159BarFecGen ;
   private String[] P09TS2_A1652BarSerDsc ;
   private String[] P09TS2_A13907BarSerDsc2 ;
   private boolean[] P09TS2_n13907BarSerDsc2 ;
   private java.math.BigDecimal[] P09TS2_A1526HisProMtr ;
   private byte[] P09TS2_A566HisProTur ;
   private int[] P09TS2_A14197HisProNFus ;
   private short[] P09TS2_A1226BarGraCru ;
   private short[] P09TS2_A127BarAncCru1 ;
   private String[] P09TS2_A867ParCodNom ;
   private boolean[] P09TS2_n867ParCodNom ;
   private java.util.Date[] P09TS2_A5608HisProDf ;
   private int[] P09TS2_A503GruOpeCod ;
   private int[] P09TS2_A252CliCod ;
   private boolean[] P09TS2_n252CliCod ;
   private String[] P09TS2_A461Fase ;
   private String[] P09TS2_A212BarSer ;
   private String[] P09TS2_A135BarColNom ;
   private java.math.BigDecimal[] P09TS2_A1525HisProKgr ;
   private String[] P09TS2_A602MaqCod ;
   private String[] P09TS2_A396EmprCod ;
   private byte[] P09TS2_A13904BarIntColo ;
   private boolean[] P09TS2_n13904BarIntColo ;
   private java.util.Date[] P09TS2_A4440HisProDTI ;
   private boolean[] P09TS2_n4440HisProDTI ;
   private java.util.Date[] P09TS2_A4441HisProDTF ;
   private boolean[] P09TS2_n4441HisProDTF ;
   private java.util.Date[] P09TS2_A558HisProFec ;
   private int[] P09TS2_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV15Exceldocument ;
}

final  class prddia00_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TS2", "SELECT T6.ForSer, T6.ForColNom, T6.ForColNum, T6.TipColCod, T1.HisproTdab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T3.BarTipArt, T3.BarColNum, T3.BarTipCol, T1.ParCod, T2.MaqDsc, T4.CliNom, T3.BarAgrEst, T3.BarDisNum, T3.BarEncCli, T3.BarFecGen, T3.BarSerDsc, T3.BarSerDsc2, T1.HisProMtr, T1.HisProTur, T1.HisProNFus, T3.BarGraCru, T3.BarAncCru1, T5.ParCodNom, T1.HisProDf, T1.GruOpeCod, T3.CliCod, T1.Fase, T3.BarSer, T3.BarColNom, T1.HisProKgr, T1.MaqCod, T1.EmprCod, COALESCE( T6.IntCod, 0) AS BarIntColo, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN TXPCFORMU T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T3.CliCod AND T6.ForSer = T3.BarSer AND T6.ForColNom = T3.BarColNom AND T6.ForColNum = T3.BarColNum AND T6.TipColCod = T3.BarTipCol) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod = T1.EmprCod AND T5.ParCod = T1.ParCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.GruOpeCod >= ?) AND (T1.GruOpeCod <= ?) AND (T3.CliCod >= ?) AND (T3.CliCod <= ?) AND (T1.Fase >= ?) AND (T1.Fase <= ?) AND (T3.BarSer >= ?) AND (T3.BarSer <= ?) AND (T3.BarColNom >= ?) AND (T3.BarColNom <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProDf, T1.HisProDTI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((String[]) buf[19])[0] = rslt.getString(17, 8);
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 26);
               ((String[]) buf[23])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((short[]) buf[29])[0] = rslt.getShort(26);
               ((String[]) buf[30])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((int[]) buf[34])[0] = rslt.getInt(30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(31, 8);
               ((String[]) buf[37])[0] = rslt.getString(32, 16);
               ((String[]) buf[38])[0] = rslt.getString(33, 13);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[40])[0] = rslt.getString(35, 6);
               ((String[]) buf[41])[0] = rslt.getString(36, 3);
               ((byte[]) buf[42])[0] = rslt.getByte(37);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(38);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDateTime(39);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDate(40);
               ((int[]) buf[49])[0] = rslt.getInt(41);
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
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 16);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 13);
               stmt.setString(14, (String)parms[13], 13);
               stmt.setString(15, (String)parms[14], 6);
               return;
      }
   }

}

