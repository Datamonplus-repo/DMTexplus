package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prddia2_usuwcexport extends GXProcedure
{
   public prddia2_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prddia2_usuwcexport.class ), "" );
   }

   public prddia2_usuwcexport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             byte[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 )
   {
      prddia2_usuwcexport.this.aP21 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        byte[] aP15 ,
                        byte[] aP16 ,
                        byte[] aP17 ,
                        byte[] aP18 ,
                        byte[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             byte[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 )
   {
      prddia2_usuwcexport.this.AV21Emprcod = aP0[0];
      this.aP0 = aP0;
      prddia2_usuwcexport.this.AV47Maqcod = aP1[0];
      this.aP1 = aP1;
      prddia2_usuwcexport.this.AV48Maqcod_to = aP2[0];
      this.aP2 = aP2;
      prddia2_usuwcexport.this.AV36Hisprodtf = aP3[0];
      this.aP3 = aP3;
      prddia2_usuwcexport.this.AV37Hisprodtf_to = aP4[0];
      this.aP4 = aP4;
      prddia2_usuwcexport.this.AV18Clicod = aP5[0];
      this.aP5 = aP5;
      prddia2_usuwcexport.this.AV19Clicod_to = aP6[0];
      this.aP6 = aP6;
      prddia2_usuwcexport.this.AV9Barcolnom = aP7[0];
      this.aP7 = aP7;
      prddia2_usuwcexport.this.AV10Barcolnom_to = aP8[0];
      this.aP8 = aP8;
      prddia2_usuwcexport.this.AV27Fase = aP9[0];
      this.aP9 = aP9;
      prddia2_usuwcexport.this.AV28Fase_to = aP10[0];
      this.aP10 = aP10;
      prddia2_usuwcexport.this.AV52Opecod = aP11[0];
      this.aP11 = aP11;
      prddia2_usuwcexport.this.AV53Opecod_to = aP12[0];
      this.aP12 = aP12;
      prddia2_usuwcexport.this.AV12Barser = aP13[0];
      this.aP13 = aP13;
      prddia2_usuwcexport.this.AV13Barser_to = aP14[0];
      this.aP14 = aP14;
      prddia2_usuwcexport.this.AV57Sidia = aP15[0];
      this.aP15 = aP15;
      prddia2_usuwcexport.this.AV58SiMaquina = aP16[0];
      this.aP16 = aP16;
      prddia2_usuwcexport.this.AV42Imprimirparos = aP17[0];
      this.aP17 = aP17;
      prddia2_usuwcexport.this.AV43intcodfrom = aP18[0];
      this.aP18 = aP18;
      prddia2_usuwcexport.this.AV44intcodto = aP19[0];
      this.aP19 = aP19;
      prddia2_usuwcexport.this.AV31Filename = aP20[0];
      this.aP20 = aP20;
      prddia2_usuwcexport.this.AV22ErrorMessage = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV33Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      prddia2_usuwcexport.this.GXt_int1 = GXv_int2[0] ;
      AV33Grulec = GXt_int1 ;
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
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV56Random = (int)(GXutil.random( )*10000) ;
      AV31Filename = "Produccion diaria II (Resumen)" + GXutil.trim( GXutil.str( AV56Random, 8, 0)) + ".xlsx" ;
      AV23Exceldocument.Open(AV31Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV23Exceldocument.Clear();
      AV56Random = (int)(GXutil.random( )*10000) ;
      AV31Filename = "InformeProduccionDiariaResumen_ll-" + GXutil.trim( GXutil.str( AV56Random, 8, 0)) + ".xlsx" ;
      AV23Exceldocument.Open(AV31Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV23Exceldocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV17CellRow = 1 ;
      AV16CellCol = 1 ;
      while ( AV16CellCol <= 27 )
      {
         AV23Exceldocument.Cells((int)(AV17CellRow), (int)(AV16CellCol), 1, 1).setBold( (short)(1) );
         AV23Exceldocument.Cells((int)(AV17CellRow), (int)(AV16CellCol), 1, 1).setColor( 11 );
         AV16CellCol = (long)(AV16CellCol+1) ;
      }
      AV23Exceldocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV23Exceldocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV23Exceldocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Dia", "") );
      AV23Exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV23Exceldocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV23Exceldocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV23Exceldocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Horas", "") );
      AV23Exceldocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV23Exceldocument.Cells(1, 9, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV23Exceldocument.Cells(1, 10, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Horas", "") );
      AV23Exceldocument.Cells(1, 11, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV17CellRow = 2 ;
      AV61TotalkMaquina = DecimalUtil.ZERO ;
      AV64TotalmMaquina = DecimalUtil.ZERO ;
      AV67TotaltiempoMaquina = DecimalUtil.ZERO ;
      AV70TotaltiempoparoMaquina = DecimalUtil.ZERO ;
      AV62TotalkMaquinaDia = DecimalUtil.ZERO ;
      AV65TotalmMaquinaDia = DecimalUtil.ZERO ;
      AV68TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
      AV71TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
      AV60TotalkGeneral = DecimalUtil.ZERO ;
      AV63TotalmGeneral = DecimalUtil.ZERO ;
      AV66Totaltiempogeneral = DecimalUtil.ZERO ;
      AV69Totaltiempoparogeneral = DecimalUtil.ZERO ;
      /* Using cursor P0AAF2 */
      pr_default.execute(0, new Object[] {AV21Emprcod, AV47Maqcod, AV48Maqcod_to, AV36Hisprodtf, AV37Hisprodtf_to, Integer.valueOf(AV52Opecod), Integer.valueOf(AV53Opecod_to), Integer.valueOf(AV18Clicod), Integer.valueOf(AV19Clicod_to), AV27Fase, AV28Fase_to, AV12Barser, AV13Barser_to, AV9Barcolnom, AV10Barcolnom_to, Byte.valueOf(AV43intcodfrom), Byte.valueOf(AV44intcodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAAF2 = false ;
         A136BarColNum = P0AAF2_A136BarColNum[0] ;
         A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
         A396EmprCod = P0AAF2_A396EmprCod[0] ;
         A6680HisproTdab = P0AAF2_A6680HisproTdab[0] ;
         A130BarCodPar = P0AAF2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAF2_A132BarCodReo[0] ;
         A129BarCod = P0AAF2_A129BarCod[0] ;
         A3610HisProLot = P0AAF2_A3610HisProLot[0] ;
         A656ParCod = P0AAF2_A656ParCod[0] ;
         n656ParCod = P0AAF2_n656ParCod[0] ;
         A1526HisProMtr = P0AAF2_A1526HisProMtr[0] ;
         A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
         n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
         A602MaqCod = P0AAF2_A602MaqCod[0] ;
         A503GruOpeCod = P0AAF2_A503GruOpeCod[0] ;
         A252CliCod = P0AAF2_A252CliCod[0] ;
         n252CliCod = P0AAF2_n252CliCod[0] ;
         A461Fase = P0AAF2_A461Fase[0] ;
         A212BarSer = P0AAF2_A212BarSer[0] ;
         A135BarColNom = P0AAF2_A135BarColNom[0] ;
         A1525HisProKgr = P0AAF2_A1525HisProKgr[0] ;
         A5608HisProDf = P0AAF2_A5608HisProDf[0] ;
         A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
         n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
         A4440HisProDTI = P0AAF2_A4440HisProDTI[0] ;
         n4440HisProDTI = P0AAF2_n4440HisProDTI[0] ;
         A4441HisProDTF = P0AAF2_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AAF2_n4441HisProDTF[0] ;
         A558HisProFec = P0AAF2_A558HisProFec[0] ;
         A561HisProLin = P0AAF2_A561HisProLin[0] ;
         A136BarColNum = P0AAF2_A136BarColNum[0] ;
         A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
         A252CliCod = P0AAF2_A252CliCod[0] ;
         n252CliCod = P0AAF2_n252CliCod[0] ;
         A212BarSer = P0AAF2_A212BarSer[0] ;
         A135BarColNom = P0AAF2_A135BarColNom[0] ;
         A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
         n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
         A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
         n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAF2_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P0AAF2_A5608HisProDf[0]), GXutil.resetTime(A5608HisProDf)) )
         {
            brkAAF2 = false ;
            A136BarColNum = P0AAF2_A136BarColNum[0] ;
            A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
            A6680HisproTdab = P0AAF2_A6680HisproTdab[0] ;
            A130BarCodPar = P0AAF2_A130BarCodPar[0] ;
            A132BarCodReo = P0AAF2_A132BarCodReo[0] ;
            A129BarCod = P0AAF2_A129BarCod[0] ;
            A3610HisProLot = P0AAF2_A3610HisProLot[0] ;
            A656ParCod = P0AAF2_A656ParCod[0] ;
            n656ParCod = P0AAF2_n656ParCod[0] ;
            A1526HisProMtr = P0AAF2_A1526HisProMtr[0] ;
            A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
            n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
            A602MaqCod = P0AAF2_A602MaqCod[0] ;
            A503GruOpeCod = P0AAF2_A503GruOpeCod[0] ;
            A252CliCod = P0AAF2_A252CliCod[0] ;
            n252CliCod = P0AAF2_n252CliCod[0] ;
            A461Fase = P0AAF2_A461Fase[0] ;
            A212BarSer = P0AAF2_A212BarSer[0] ;
            A135BarColNom = P0AAF2_A135BarColNom[0] ;
            A1525HisProKgr = P0AAF2_A1525HisProKgr[0] ;
            A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
            n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
            A4440HisProDTI = P0AAF2_A4440HisProDTI[0] ;
            n4440HisProDTI = P0AAF2_n4440HisProDTI[0] ;
            A4441HisProDTF = P0AAF2_A4441HisProDTF[0] ;
            n4441HisProDTF = P0AAF2_n4441HisProDTF[0] ;
            A558HisProFec = P0AAF2_A558HisProFec[0] ;
            A561HisProLin = P0AAF2_A561HisProLin[0] ;
            A136BarColNum = P0AAF2_A136BarColNum[0] ;
            A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
            A252CliCod = P0AAF2_A252CliCod[0] ;
            n252CliCod = P0AAF2_n252CliCod[0] ;
            A212BarSer = P0AAF2_A212BarSer[0] ;
            A135BarColNom = P0AAF2_A135BarColNom[0] ;
            A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
            n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
            A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
            n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
            if ( GXutil.strcmp(A602MaqCod, AV48Maqcod_to) <= 0 )
            {
               if ( GXutil.strcmp(A602MaqCod, AV47Maqcod) >= 0 )
               {
                  if ( GXutil.strcmp(A396EmprCod, AV21Emprcod) == 0 )
                  {
                     if ( A252CliCod >= AV18Clicod )
                     {
                        if ( A252CliCod <= AV19Clicod_to )
                        {
                           if ( GXutil.strcmp(A212BarSer, AV12Barser) >= 0 )
                           {
                              if ( GXutil.strcmp(A212BarSer, AV13Barser_to) <= 0 )
                              {
                                 if ( GXutil.strcmp(A135BarColNom, AV9Barcolnom) >= 0 )
                                 {
                                    if ( GXutil.strcmp(A135BarColNom, AV10Barcolnom_to) <= 0 )
                                    {
                                       if ( A13904BarIntColo >= AV43intcodfrom )
                                       {
                                          if ( A13904BarIntColo <= AV44intcodto )
                                          {
                                             if ( (( A4441HisProDTF.after( AV36Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV36Hisprodtf) )) )
                                             {
                                                if ( (( A4441HisProDTF.before( AV37Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV37Hisprodtf_to) )) )
                                                {
                                                   if ( A503GruOpeCod >= AV52Opecod )
                                                   {
                                                      if ( A503GruOpeCod <= AV53Opecod_to )
                                                      {
                                                         if ( GXutil.strcmp(A461Fase, AV27Fase) >= 0 )
                                                         {
                                                            if ( GXutil.strcmp(A461Fase, AV28Fase_to) <= 0 )
                                                            {
                                                               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                               {
                                                                  A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                               }
                                                               else
                                                               {
                                                                  A5605HisProTr2 = (short)(0) ;
                                                               }
                                                               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAF2_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P0AAF2_A5608HisProDf[0]), GXutil.resetTime(A5608HisProDf)) )
                                                               {
                                                                  brkAAF2 = false ;
                                                                  A136BarColNum = P0AAF2_A136BarColNum[0] ;
                                                                  A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
                                                                  A6680HisproTdab = P0AAF2_A6680HisproTdab[0] ;
                                                                  A130BarCodPar = P0AAF2_A130BarCodPar[0] ;
                                                                  A132BarCodReo = P0AAF2_A132BarCodReo[0] ;
                                                                  A129BarCod = P0AAF2_A129BarCod[0] ;
                                                                  A3610HisProLot = P0AAF2_A3610HisProLot[0] ;
                                                                  A656ParCod = P0AAF2_A656ParCod[0] ;
                                                                  n656ParCod = P0AAF2_n656ParCod[0] ;
                                                                  A1526HisProMtr = P0AAF2_A1526HisProMtr[0] ;
                                                                  A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
                                                                  n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
                                                                  A602MaqCod = P0AAF2_A602MaqCod[0] ;
                                                                  A503GruOpeCod = P0AAF2_A503GruOpeCod[0] ;
                                                                  A252CliCod = P0AAF2_A252CliCod[0] ;
                                                                  n252CliCod = P0AAF2_n252CliCod[0] ;
                                                                  A461Fase = P0AAF2_A461Fase[0] ;
                                                                  A212BarSer = P0AAF2_A212BarSer[0] ;
                                                                  A135BarColNom = P0AAF2_A135BarColNom[0] ;
                                                                  A1525HisProKgr = P0AAF2_A1525HisProKgr[0] ;
                                                                  A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
                                                                  n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
                                                                  A4440HisProDTI = P0AAF2_A4440HisProDTI[0] ;
                                                                  n4440HisProDTI = P0AAF2_n4440HisProDTI[0] ;
                                                                  A4441HisProDTF = P0AAF2_A4441HisProDTF[0] ;
                                                                  n4441HisProDTF = P0AAF2_n4441HisProDTF[0] ;
                                                                  A558HisProFec = P0AAF2_A558HisProFec[0] ;
                                                                  A561HisProLin = P0AAF2_A561HisProLin[0] ;
                                                                  A136BarColNum = P0AAF2_A136BarColNum[0] ;
                                                                  A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
                                                                  A252CliCod = P0AAF2_A252CliCod[0] ;
                                                                  n252CliCod = P0AAF2_n252CliCod[0] ;
                                                                  A212BarSer = P0AAF2_A212BarSer[0] ;
                                                                  A135BarColNom = P0AAF2_A135BarColNom[0] ;
                                                                  A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
                                                                  n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
                                                                  A606MaqDsc = P0AAF2_A606MaqDsc[0] ;
                                                                  n606MaqDsc = P0AAF2_n606MaqDsc[0] ;
                                                                  if ( GXutil.strcmp(A602MaqCod, AV48Maqcod_to) <= 0 )
                                                                  {
                                                                     if ( GXutil.strcmp(A602MaqCod, AV47Maqcod) >= 0 )
                                                                     {
                                                                        if ( GXutil.strcmp(A396EmprCod, AV21Emprcod) == 0 )
                                                                        {
                                                                           if ( A252CliCod >= AV18Clicod )
                                                                           {
                                                                              if ( A252CliCod <= AV19Clicod_to )
                                                                              {
                                                                                 if ( GXutil.strcmp(A212BarSer, AV12Barser) >= 0 )
                                                                                 {
                                                                                    if ( GXutil.strcmp(A212BarSer, AV13Barser_to) <= 0 )
                                                                                    {
                                                                                       if ( GXutil.strcmp(A135BarColNom, AV9Barcolnom) >= 0 )
                                                                                       {
                                                                                          if ( GXutil.strcmp(A135BarColNom, AV10Barcolnom_to) <= 0 )
                                                                                          {
                                                                                             if ( A13904BarIntColo >= AV43intcodfrom )
                                                                                             {
                                                                                                if ( A13904BarIntColo <= AV44intcodto )
                                                                                                {
                                                                                                   if ( (( A4441HisProDTF.after( AV36Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV36Hisprodtf) )) )
                                                                                                   {
                                                                                                      if ( (( A4441HisProDTF.before( AV37Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV37Hisprodtf_to) )) )
                                                                                                      {
                                                                                                         if ( A503GruOpeCod >= AV52Opecod )
                                                                                                         {
                                                                                                            if ( A503GruOpeCod <= AV53Opecod_to )
                                                                                                            {
                                                                                                               if ( GXutil.strcmp(A461Fase, AV27Fase) >= 0 )
                                                                                                               {
                                                                                                                  if ( GXutil.strcmp(A461Fase, AV28Fase_to) <= 0 )
                                                                                                                  {
                                                                                                                     if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                                                                                     {
                                                                                                                        A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                                                                                     }
                                                                                                                     else
                                                                                                                     {
                                                                                                                        A5605HisProTr2 = (short)(0) ;
                                                                                                                     }
                                                                                                                     AV62TotalkMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV65TotalmMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV68TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV71TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAF2_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P0AAF2_A5608HisProDf[0]), GXutil.resetTime(A5608HisProDf)) && ( GXutil.strcmp(P0AAF2_A602MaqCod[0], A602MaqCod) == 0 ) )
                                                                                                                     {
                                                                                                                        brkAAF2 = false ;
                                                                                                                        A136BarColNum = P0AAF2_A136BarColNum[0] ;
                                                                                                                        A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
                                                                                                                        A6680HisproTdab = P0AAF2_A6680HisproTdab[0] ;
                                                                                                                        A130BarCodPar = P0AAF2_A130BarCodPar[0] ;
                                                                                                                        A132BarCodReo = P0AAF2_A132BarCodReo[0] ;
                                                                                                                        A129BarCod = P0AAF2_A129BarCod[0] ;
                                                                                                                        A3610HisProLot = P0AAF2_A3610HisProLot[0] ;
                                                                                                                        A656ParCod = P0AAF2_A656ParCod[0] ;
                                                                                                                        n656ParCod = P0AAF2_n656ParCod[0] ;
                                                                                                                        A1526HisProMtr = P0AAF2_A1526HisProMtr[0] ;
                                                                                                                        A503GruOpeCod = P0AAF2_A503GruOpeCod[0] ;
                                                                                                                        A252CliCod = P0AAF2_A252CliCod[0] ;
                                                                                                                        n252CliCod = P0AAF2_n252CliCod[0] ;
                                                                                                                        A461Fase = P0AAF2_A461Fase[0] ;
                                                                                                                        A212BarSer = P0AAF2_A212BarSer[0] ;
                                                                                                                        A135BarColNom = P0AAF2_A135BarColNom[0] ;
                                                                                                                        A1525HisProKgr = P0AAF2_A1525HisProKgr[0] ;
                                                                                                                        A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
                                                                                                                        n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
                                                                                                                        A4440HisProDTI = P0AAF2_A4440HisProDTI[0] ;
                                                                                                                        n4440HisProDTI = P0AAF2_n4440HisProDTI[0] ;
                                                                                                                        A4441HisProDTF = P0AAF2_A4441HisProDTF[0] ;
                                                                                                                        n4441HisProDTF = P0AAF2_n4441HisProDTF[0] ;
                                                                                                                        A558HisProFec = P0AAF2_A558HisProFec[0] ;
                                                                                                                        A561HisProLin = P0AAF2_A561HisProLin[0] ;
                                                                                                                        A136BarColNum = P0AAF2_A136BarColNum[0] ;
                                                                                                                        A218BarTipCol = P0AAF2_A218BarTipCol[0] ;
                                                                                                                        A252CliCod = P0AAF2_A252CliCod[0] ;
                                                                                                                        n252CliCod = P0AAF2_n252CliCod[0] ;
                                                                                                                        A212BarSer = P0AAF2_A212BarSer[0] ;
                                                                                                                        A135BarColNom = P0AAF2_A135BarColNom[0] ;
                                                                                                                        A13904BarIntColo = P0AAF2_A13904BarIntColo[0] ;
                                                                                                                        n13904BarIntColo = P0AAF2_n13904BarIntColo[0] ;
                                                                                                                        if ( GXutil.strcmp(A396EmprCod, AV21Emprcod) == 0 )
                                                                                                                        {
                                                                                                                           if ( GXutil.strcmp(A602MaqCod, AV47Maqcod) >= 0 )
                                                                                                                           {
                                                                                                                              if ( GXutil.strcmp(A602MaqCod, AV48Maqcod_to) <= 0 )
                                                                                                                              {
                                                                                                                                 if ( A252CliCod >= AV18Clicod )
                                                                                                                                 {
                                                                                                                                    if ( A252CliCod <= AV19Clicod_to )
                                                                                                                                    {
                                                                                                                                       if ( GXutil.strcmp(A212BarSer, AV12Barser) >= 0 )
                                                                                                                                       {
                                                                                                                                          if ( GXutil.strcmp(A212BarSer, AV13Barser_to) <= 0 )
                                                                                                                                          {
                                                                                                                                             if ( GXutil.strcmp(A135BarColNom, AV9Barcolnom) >= 0 )
                                                                                                                                             {
                                                                                                                                                if ( GXutil.strcmp(A135BarColNom, AV10Barcolnom_to) <= 0 )
                                                                                                                                                {
                                                                                                                                                   if ( A13904BarIntColo >= AV43intcodfrom )
                                                                                                                                                   {
                                                                                                                                                      if ( A13904BarIntColo <= AV44intcodto )
                                                                                                                                                      {
                                                                                                                                                         if ( (( A4441HisProDTF.after( AV36Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV36Hisprodtf) )) )
                                                                                                                                                         {
                                                                                                                                                            if ( (( A4441HisProDTF.before( AV37Hisprodtf_to ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV37Hisprodtf_to) )) )
                                                                                                                                                            {
                                                                                                                                                               if ( A503GruOpeCod >= AV52Opecod )
                                                                                                                                                               {
                                                                                                                                                                  if ( A503GruOpeCod <= AV53Opecod_to )
                                                                                                                                                                  {
                                                                                                                                                                     if ( GXutil.strcmp(A461Fase, AV27Fase) >= 0 )
                                                                                                                                                                     {
                                                                                                                                                                        if ( GXutil.strcmp(A461Fase, AV28Fase_to) <= 0 )
                                                                                                                                                                        {
                                                                                                                                                                           if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                                                                                                                                                           {
                                                                                                                                                                              A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                                                                                                                                                           }
                                                                                                                                                                           else
                                                                                                                                                                           {
                                                                                                                                                                              A5605HisProTr2 = (short)(0) ;
                                                                                                                                                                           }
                                                                                                                                                                           GXv_char3[0] = A396EmprCod ;
                                                                                                                                                                           GXv_char4[0] = A461Fase ;
                                                                                                                                                                           GXv_char5[0] = AV25FasDivTime ;
                                                                                                                                                                           new app.pfasdivtime(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
                                                                                                                                                                           prddia2_usuwcexport.this.A396EmprCod = GXv_char3[0] ;
                                                                                                                                                                           prddia2_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                                           prddia2_usuwcexport.this.AV25FasDivTime = GXv_char5[0] ;
                                                                                                                                                                           AV39HisProTr2 = ((GXutil.strcmp(AV25FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
                                                                                                                                                                           AV34HhMm = DecimalUtil.doubleToDec(A5605HisProTr2/ (double) (60)) ;
                                                                                                                                                                           AV40HorRea = (short)(A5605HisProTr2/ (double) (60)) ;
                                                                                                                                                                           AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                                                                                           AV49MinRea = DecimalUtil.doubleToDec(A5605HisProTr2).subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                                                                           AV50Minutos = (AV41HorReaint.multiply(DecimalUtil.doubleToDec(60))).add(AV49MinRea) ;
                                                                                                                                                                           GXt_char6 = AV24FasActtin ;
                                                                                                                                                                           GXv_char5[0] = A396EmprCod ;
                                                                                                                                                                           GXv_char4[0] = A461Fase ;
                                                                                                                                                                           GXv_char3[0] = GXt_char6 ;
                                                                                                                                                                           new app.pfasest(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
                                                                                                                                                                           prddia2_usuwcexport.this.A396EmprCod = GXv_char5[0] ;
                                                                                                                                                                           prddia2_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                                           prddia2_usuwcexport.this.GXt_char6 = GXv_char3[0] ;
                                                                                                                                                                           AV24FasActtin = GXt_char6 ;
                                                                                                                                                                           AV32FlagMarca = (byte)(0) ;
                                                                                                                                                                           AV38HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                                                                                                                                                           AV32FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV38HisProLot)==0) ? 1 : AV32FlagMarca)) ;
                                                                                                                                                                           if ( AV33Grulec == 0 )
                                                                                                                                                                           {
                                                                                                                                                                              if ( GXutil.strcmp(AV24FasActtin, httpContext.getMessage( "N", "")) == 0 )
                                                                                                                                                                              {
                                                                                                                                                                                 AV32FlagMarca = (byte)(1) ;
                                                                                                                                                                              }
                                                                                                                                                                           }
                                                                                                                                                                           else
                                                                                                                                                                           {
                                                                                                                                                                              if ( ( GXutil.strcmp(A3610HisProLot, AV38HisProLot) == 0 ) && ( GXutil.strcmp(AV24FasActtin, httpContext.getMessage( "N", "")) == 0 ) )
                                                                                                                                                                              {
                                                                                                                                                                                 AV32FlagMarca = (byte)(1) ;
                                                                                                                                                                              }
                                                                                                                                                                           }
                                                                                                                                                                           if ( (0==A656ParCod) )
                                                                                                                                                                           {
                                                                                                                                                                              AV62TotalkMaquinaDia = AV62TotalkMaquinaDia.add(A1525HisProKgr) ;
                                                                                                                                                                              AV65TotalmMaquinaDia = AV65TotalmMaquinaDia.add(A1526HisProMtr) ;
                                                                                                                                                                              AV68TotaltiempoMaquinaDia = AV68TotaltiempoMaquinaDia.add((((GXutil.strcmp(AV25FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV50Minutos : ((AV32FlagMarca==1) ? AV50Minutos : DecimalUtil.doubleToDec(0))))) ;
                                                                                                                                                                           }
                                                                                                                                                                           else
                                                                                                                                                                           {
                                                                                                                                                                              AV71TotaltiempoparoMaquinaDia = AV71TotaltiempoparoMaquinaDia.add((((AV32FlagMarca==1) ? AV50Minutos : DecimalUtil.doubleToDec(0)))) ;
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
                                                                                                                        brkAAF2 = true ;
                                                                                                                        pr_default.readNext(0);
                                                                                                                     }
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 2, 1, 1).setText( A606MaqDsc );
                                                                                                                     GXt_dtime7 = GXutil.resetTime( A5608HisProDf );
                                                                                                                     AV23Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 3, 1, 1).setDate( GXt_dtime7 );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TotalkMaquinaDia)) );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TotalmMaquinaDia)) );
                                                                                                                     AV34HhMm = AV68TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                                                                                     AV40HorRea = (short)(DecimalUtil.decToDouble(AV68TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                                                                                     AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                                     AV49MinRea = AV68TotaltiempoMaquinaDia.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                     AV35HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV49MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TotaltiempoMaquinaDia)) );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 7, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                     AV72intMinRea = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV49MinRea))) ;
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 8, 1, 1).setNumber( AV72intMinRea );
                                                                                                                     AV34HhMm = AV71TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                                                                                     AV40HorRea = (short)(DecimalUtil.decToDouble(AV71TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                                                                                     AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                                     AV49MinRea = AV71TotaltiempoparoMaquinaDia.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                     AV35HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV49MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setColor( 3 );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TotaltiempoparoMaquinaDia)) );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setColor( 3 );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setColor( 3 );
                                                                                                                     AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV49MinRea)) );
                                                                                                                     AV61TotalkMaquina = AV61TotalkMaquina.add(AV62TotalkMaquinaDia) ;
                                                                                                                     AV64TotalmMaquina = AV64TotalmMaquina.add(AV65TotalmMaquinaDia) ;
                                                                                                                     AV67TotaltiempoMaquina = AV67TotaltiempoMaquina.add(AV68TotaltiempoMaquinaDia) ;
                                                                                                                     AV70TotaltiempoparoMaquina = AV70TotaltiempoparoMaquina.add(AV71TotaltiempoparoMaquinaDia) ;
                                                                                                                     AV62TotalkMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV65TotalmMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV68TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV71TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
                                                                                                                     AV17CellRow = (long)(AV17CellRow+1) ;
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
                                                                  if ( ! brkAAF2 )
                                                                  {
                                                                     brkAAF2 = true ;
                                                                     pr_default.readNext(0);
                                                                  }
                                                               }
                                                               GXt_dtime7 = GXutil.resetTime( A5608HisProDf );
                                                               AV23Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 3, 1, 1).setDate( GXt_dtime7 );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TotalkMaquina)) );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64TotalmMaquina)) );
                                                               AV34HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV67TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
                                                               AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV67TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
                                                               AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
                                                               AV49MinRea = AV67TotaltiempoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                               AV49MinRea = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV49MinRea))) ;
                                                               AV35HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV49MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TotaltiempoMaquina)) );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 7, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 8, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV49MinRea)) );
                                                               AV34HhMm = AV70TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                               AV40HorRea = (short)(DecimalUtil.decToDouble(AV70TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                               AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                               AV49MinRea = AV70TotaltiempoparoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                               AV35HhMm_t = GXutil.str( AV41HorReaint, 10, 2) + ":" + GXutil.str( AV49MinRea, 10, 2) ;
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setColor( 3 );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TotaltiempoparoMaquina)) );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setColor( 3 );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setColor( 3 );
                                                               AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV49MinRea)) );
                                                               AV17CellRow = (long)(AV17CellRow+2) ;
                                                               AV60TotalkGeneral = AV60TotalkGeneral.add(AV61TotalkMaquina) ;
                                                               AV63TotalmGeneral = AV63TotalmGeneral.add(AV64TotalmMaquina) ;
                                                               AV66Totaltiempogeneral = AV66Totaltiempogeneral.add(AV67TotaltiempoMaquina) ;
                                                               AV69Totaltiempoparogeneral = AV69Totaltiempoparogeneral.add(AV70TotaltiempoparoMaquina) ;
                                                               AV61TotalkMaquina = DecimalUtil.ZERO ;
                                                               AV64TotalmMaquina = DecimalUtil.ZERO ;
                                                               AV67TotaltiempoMaquina = DecimalUtil.ZERO ;
                                                               AV70TotaltiempoparoMaquina = DecimalUtil.ZERO ;
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
            if ( ! brkAAF2 )
            {
               brkAAF2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brkAAF2 )
         {
            brkAAF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV23Exceldocument.Cells((int)(AV17CellRow), 2, 1, 1).setText( httpContext.getMessage( "Total General", "") );
      AV23Exceldocument.Cells((int)(AV17CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TotalkGeneral)) );
      AV23Exceldocument.Cells((int)(AV17CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63TotalmGeneral)) );
      AV34HhMm = AV66Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
      AV40HorRea = (short)(DecimalUtil.decToDouble(AV66Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
      AV49MinRea = AV66Totaltiempogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
      AV35HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV49MinRea, 10, 2), "", "", "", "", "", "", "") ;
      AV23Exceldocument.Cells((int)(AV17CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66Totaltiempogeneral)) );
      AV73GeneralHorReaint = (short)(DecimalUtil.decToDouble(AV41HorReaint)) ;
      AV74GeneralMinRea = (short)(DecimalUtil.decToDouble(AV49MinRea)) ;
      AV23Exceldocument.Cells((int)(AV17CellRow), 7, 1, 1).setNumber( GXutil.Int( AV73GeneralHorReaint) );
      AV23Exceldocument.Cells((int)(AV17CellRow), 8, 1, 1).setNumber( GXutil.Int( AV74GeneralMinRea) );
      AV34HhMm = AV69Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
      AV40HorRea = (short)(DecimalUtil.decToDouble(AV69Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
      AV49MinRea = AV69Totaltiempoparogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
      AV35HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV49MinRea, 10, 2), "", "", "", "", "", "", "") ;
      AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells((int)(AV17CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV69Totaltiempoparogeneral)) );
      AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells((int)(AV17CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
      AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setColor( 3 );
      AV23Exceldocument.Cells((int)(AV17CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV49MinRea)) );
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV23Exceldocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV23Exceldocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV23Exceldocument.getErrCode() != 0 )
      {
         AV31Filename = "" ;
         AV22ErrorMessage = AV23Exceldocument.getErrDescription() ;
         AV23Exceldocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = prddia2_usuwcexport.this.AV21Emprcod;
      this.aP1[0] = prddia2_usuwcexport.this.AV47Maqcod;
      this.aP2[0] = prddia2_usuwcexport.this.AV48Maqcod_to;
      this.aP3[0] = prddia2_usuwcexport.this.AV36Hisprodtf;
      this.aP4[0] = prddia2_usuwcexport.this.AV37Hisprodtf_to;
      this.aP5[0] = prddia2_usuwcexport.this.AV18Clicod;
      this.aP6[0] = prddia2_usuwcexport.this.AV19Clicod_to;
      this.aP7[0] = prddia2_usuwcexport.this.AV9Barcolnom;
      this.aP8[0] = prddia2_usuwcexport.this.AV10Barcolnom_to;
      this.aP9[0] = prddia2_usuwcexport.this.AV27Fase;
      this.aP10[0] = prddia2_usuwcexport.this.AV28Fase_to;
      this.aP11[0] = prddia2_usuwcexport.this.AV52Opecod;
      this.aP12[0] = prddia2_usuwcexport.this.AV53Opecod_to;
      this.aP13[0] = prddia2_usuwcexport.this.AV12Barser;
      this.aP14[0] = prddia2_usuwcexport.this.AV13Barser_to;
      this.aP15[0] = prddia2_usuwcexport.this.AV57Sidia;
      this.aP16[0] = prddia2_usuwcexport.this.AV58SiMaquina;
      this.aP17[0] = prddia2_usuwcexport.this.AV42Imprimirparos;
      this.aP18[0] = prddia2_usuwcexport.this.AV43intcodfrom;
      this.aP19[0] = prddia2_usuwcexport.this.AV44intcodto;
      this.aP20[0] = prddia2_usuwcexport.this.AV31Filename;
      this.aP21[0] = prddia2_usuwcexport.this.AV22ErrorMessage;
      CloseOpenCursors();
      AV23Exceldocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      GXv_int2 = new byte[1] ;
      AV23Exceldocument = new com.genexus.gxoffice.ExcelDoc();
      AV61TotalkMaquina = DecimalUtil.ZERO ;
      AV64TotalmMaquina = DecimalUtil.ZERO ;
      AV67TotaltiempoMaquina = DecimalUtil.ZERO ;
      AV70TotaltiempoparoMaquina = DecimalUtil.ZERO ;
      AV62TotalkMaquinaDia = DecimalUtil.ZERO ;
      AV65TotalmMaquinaDia = DecimalUtil.ZERO ;
      AV68TotaltiempoMaquinaDia = DecimalUtil.ZERO ;
      AV71TotaltiempoparoMaquinaDia = DecimalUtil.ZERO ;
      AV60TotalkGeneral = DecimalUtil.ZERO ;
      AV63TotalmGeneral = DecimalUtil.ZERO ;
      AV66Totaltiempogeneral = DecimalUtil.ZERO ;
      AV69Totaltiempoparogeneral = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AAF2_A494ForSer = new String[] {""} ;
      P0AAF2_A482ForColNom = new String[] {""} ;
      P0AAF2_A483ForColNum = new int[1] ;
      P0AAF2_A831TipColCod = new byte[1] ;
      P0AAF2_A136BarColNum = new int[1] ;
      P0AAF2_A218BarTipCol = new byte[1] ;
      P0AAF2_A396EmprCod = new String[] {""} ;
      P0AAF2_A6680HisproTdab = new short[1] ;
      P0AAF2_A130BarCodPar = new String[] {""} ;
      P0AAF2_A132BarCodReo = new byte[1] ;
      P0AAF2_A129BarCod = new int[1] ;
      P0AAF2_A3610HisProLot = new String[] {""} ;
      P0AAF2_A656ParCod = new short[1] ;
      P0AAF2_n656ParCod = new boolean[] {false} ;
      P0AAF2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAF2_A606MaqDsc = new String[] {""} ;
      P0AAF2_n606MaqDsc = new boolean[] {false} ;
      P0AAF2_A602MaqCod = new String[] {""} ;
      P0AAF2_A503GruOpeCod = new int[1] ;
      P0AAF2_A252CliCod = new int[1] ;
      P0AAF2_n252CliCod = new boolean[] {false} ;
      P0AAF2_A461Fase = new String[] {""} ;
      P0AAF2_A212BarSer = new String[] {""} ;
      P0AAF2_A135BarColNom = new String[] {""} ;
      P0AAF2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAF2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAF2_A13904BarIntColo = new byte[1] ;
      P0AAF2_n13904BarIntColo = new boolean[] {false} ;
      P0AAF2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAF2_n4440HisProDTI = new boolean[] {false} ;
      P0AAF2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAF2_n4441HisProDTF = new boolean[] {false} ;
      P0AAF2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAF2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      A461Fase = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A5608HisProDf = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV25FasDivTime = "" ;
      AV34HhMm = DecimalUtil.ZERO ;
      AV41HorReaint = DecimalUtil.ZERO ;
      AV49MinRea = DecimalUtil.ZERO ;
      AV50Minutos = DecimalUtil.ZERO ;
      AV24FasActtin = "" ;
      GXt_char6 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV38HisProLot = "" ;
      AV35HhMm_t = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.prddia2_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P0AAF2_A494ForSer, P0AAF2_A482ForColNom, P0AAF2_A483ForColNum, P0AAF2_A831TipColCod, P0AAF2_A136BarColNum, P0AAF2_A218BarTipCol, P0AAF2_A396EmprCod, P0AAF2_A6680HisproTdab, P0AAF2_A130BarCodPar, P0AAF2_A132BarCodReo,
            P0AAF2_A129BarCod, P0AAF2_A3610HisProLot, P0AAF2_A656ParCod, P0AAF2_n656ParCod, P0AAF2_A1526HisProMtr, P0AAF2_A606MaqDsc, P0AAF2_n606MaqDsc, P0AAF2_A602MaqCod, P0AAF2_A503GruOpeCod, P0AAF2_A252CliCod,
            P0AAF2_n252CliCod, P0AAF2_A461Fase, P0AAF2_A212BarSer, P0AAF2_A135BarColNom, P0AAF2_A1525HisProKgr, P0AAF2_A5608HisProDf, P0AAF2_A13904BarIntColo, P0AAF2_n13904BarIntColo, P0AAF2_A4440HisProDTI, P0AAF2_n4440HisProDTI,
            P0AAF2_A4441HisProDTF, P0AAF2_n4441HisProDTF, P0AAF2_A558HisProFec, P0AAF2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV57Sidia ;
   private byte AV58SiMaquina ;
   private byte AV42Imprimirparos ;
   private byte AV43intcodfrom ;
   private byte AV44intcodto ;
   private byte AV33Grulec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte A13904BarIntColo ;
   private byte AV32FlagMarca ;
   private byte AV72intMinRea ;
   private short A6680HisproTdab ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV39HisProTr2 ;
   private short AV40HorRea ;
   private short AV73GeneralHorReaint ;
   private short AV74GeneralMinRea ;
   private short Gx_err ;
   private int AV18Clicod ;
   private int AV19Clicod_to ;
   private int AV52Opecod ;
   private int AV53Opecod_to ;
   private int AV56Random ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private long AV17CellRow ;
   private long AV16CellCol ;
   private java.math.BigDecimal AV61TotalkMaquina ;
   private java.math.BigDecimal AV64TotalmMaquina ;
   private java.math.BigDecimal AV67TotaltiempoMaquina ;
   private java.math.BigDecimal AV70TotaltiempoparoMaquina ;
   private java.math.BigDecimal AV62TotalkMaquinaDia ;
   private java.math.BigDecimal AV65TotalmMaquinaDia ;
   private java.math.BigDecimal AV68TotaltiempoMaquinaDia ;
   private java.math.BigDecimal AV71TotaltiempoparoMaquinaDia ;
   private java.math.BigDecimal AV60TotalkGeneral ;
   private java.math.BigDecimal AV63TotalmGeneral ;
   private java.math.BigDecimal AV66Totaltiempogeneral ;
   private java.math.BigDecimal AV69Totaltiempoparogeneral ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV34HhMm ;
   private java.math.BigDecimal AV41HorReaint ;
   private java.math.BigDecimal AV49MinRea ;
   private java.math.BigDecimal AV50Minutos ;
   private String AV21Emprcod ;
   private String AV47Maqcod ;
   private String AV48Maqcod_to ;
   private String AV9Barcolnom ;
   private String AV10Barcolnom_to ;
   private String AV27Fase ;
   private String AV28Fase_to ;
   private String AV12Barser ;
   private String AV13Barser_to ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV25FasDivTime ;
   private String AV24FasActtin ;
   private String GXt_char6 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV38HisProLot ;
   private String AV35HhMm_t ;
   private java.util.Date AV36Hisprodtf ;
   private java.util.Date AV37Hisprodtf_to ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXt_dtime7 ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brkAAF2 ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n252CliCod ;
   private boolean n13904BarIntColo ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV31Filename ;
   private String AV22ErrorMessage ;
   private String[] aP21 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private int[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private byte[] aP15 ;
   private byte[] aP16 ;
   private byte[] aP17 ;
   private byte[] aP18 ;
   private byte[] aP19 ;
   private String[] aP20 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAF2_A494ForSer ;
   private String[] P0AAF2_A482ForColNom ;
   private int[] P0AAF2_A483ForColNum ;
   private byte[] P0AAF2_A831TipColCod ;
   private int[] P0AAF2_A136BarColNum ;
   private byte[] P0AAF2_A218BarTipCol ;
   private String[] P0AAF2_A396EmprCod ;
   private short[] P0AAF2_A6680HisproTdab ;
   private String[] P0AAF2_A130BarCodPar ;
   private byte[] P0AAF2_A132BarCodReo ;
   private int[] P0AAF2_A129BarCod ;
   private String[] P0AAF2_A3610HisProLot ;
   private short[] P0AAF2_A656ParCod ;
   private boolean[] P0AAF2_n656ParCod ;
   private java.math.BigDecimal[] P0AAF2_A1526HisProMtr ;
   private String[] P0AAF2_A606MaqDsc ;
   private boolean[] P0AAF2_n606MaqDsc ;
   private String[] P0AAF2_A602MaqCod ;
   private int[] P0AAF2_A503GruOpeCod ;
   private int[] P0AAF2_A252CliCod ;
   private boolean[] P0AAF2_n252CliCod ;
   private String[] P0AAF2_A461Fase ;
   private String[] P0AAF2_A212BarSer ;
   private String[] P0AAF2_A135BarColNom ;
   private java.math.BigDecimal[] P0AAF2_A1525HisProKgr ;
   private java.util.Date[] P0AAF2_A5608HisProDf ;
   private byte[] P0AAF2_A13904BarIntColo ;
   private boolean[] P0AAF2_n13904BarIntColo ;
   private java.util.Date[] P0AAF2_A4440HisProDTI ;
   private boolean[] P0AAF2_n4440HisProDTI ;
   private java.util.Date[] P0AAF2_A4441HisProDTF ;
   private boolean[] P0AAF2_n4441HisProDTF ;
   private java.util.Date[] P0AAF2_A558HisProFec ;
   private int[] P0AAF2_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV23Exceldocument ;
}

final  class prddia2_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAF2", "SELECT T3.ForSer, T3.ForColNom, T3.ForColNum, T3.TipColCod, T2.BarColNum, T2.BarTipCol, T1.EmprCod, T1.HisproTdab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.ParCod, T1.HisProMtr, T4.MaqDsc, T1.MaqCod, T1.GruOpeCod, T2.CliCod, T1.Fase, T2.BarSer, T2.BarColNom, T1.HisProKgr, T1.HisProDf, COALESCE( T3.IntCod, 0) AS BarIntColo, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod AND T3.ForSer = T2.BarSer AND T3.ForColNom = T2.BarColNom AND T3.ForColNum = T2.BarColNum AND T3.TipColCod = T2.BarTipCol) INNER JOIN TXPMAQUIN T4 ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ?) AND (T1.MaqCod >= ?) AND (T1.MaqCod <= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.GruOpeCod >= ?) AND (T1.GruOpeCod <= ?) AND (T2.CliCod >= ?) AND (T2.CliCod <= ?) AND (T1.Fase >= ?) AND (T1.Fase <= ?) AND (T2.BarSer >= ?) AND (T2.BarSer <= ?) AND (T2.BarColNom >= ?) AND (T2.BarColNom <= ?) AND (COALESCE( T3.IntCod, 0) >= ?) AND (COALESCE( T3.IntCod, 0) <= ?) ORDER BY T1.EmprCod, T1.HisProDf, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 10);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 8);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 13);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(23);
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(27);
               ((int[]) buf[33])[0] = rslt.getInt(28);
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setString(14, (String)parms[13], 13);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               return;
      }
   }

}

