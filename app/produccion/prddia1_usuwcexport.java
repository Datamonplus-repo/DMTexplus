package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prddia1_usuwcexport extends GXProcedure
{
   public prddia1_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prddia1_usuwcexport.class ), "" );
   }

   public prddia1_usuwcexport( int remoteHandle ,
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
      prddia1_usuwcexport.this.aP21 = new String[] {""};
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
      prddia1_usuwcexport.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      prddia1_usuwcexport.this.AV9Maqcod = aP1[0];
      this.aP1 = aP1;
      prddia1_usuwcexport.this.AV10Maqcod_to = aP2[0];
      this.aP2 = aP2;
      prddia1_usuwcexport.this.AV11Hisprodtf = aP3[0];
      this.aP3 = aP3;
      prddia1_usuwcexport.this.AV12Hisprodtf_to = aP4[0];
      this.aP4 = aP4;
      prddia1_usuwcexport.this.AV50Clicod = aP5[0];
      this.aP5 = aP5;
      prddia1_usuwcexport.this.AV51Clicod_to = aP6[0];
      this.aP6 = aP6;
      prddia1_usuwcexport.this.AV44Barcolnom = aP7[0];
      this.aP7 = aP7;
      prddia1_usuwcexport.this.AV45Barcolnom_to = aP8[0];
      this.aP8 = aP8;
      prddia1_usuwcexport.this.AV53Fase = aP9[0];
      this.aP9 = aP9;
      prddia1_usuwcexport.this.AV54Fase_to = aP10[0];
      this.aP10 = aP10;
      prddia1_usuwcexport.this.AV56Opecod = aP11[0];
      this.aP11 = aP11;
      prddia1_usuwcexport.this.AV57Opecod_to = aP12[0];
      this.aP12 = aP12;
      prddia1_usuwcexport.this.AV47Barser = aP13[0];
      this.aP13 = aP13;
      prddia1_usuwcexport.this.AV48Barser_to = aP14[0];
      this.aP14 = aP14;
      prddia1_usuwcexport.this.AV60Sidia = aP15[0];
      this.aP15 = aP15;
      prddia1_usuwcexport.this.AV61SiMaquina = aP16[0];
      this.aP16 = aP16;
      prddia1_usuwcexport.this.AV62Imprimirparos = aP17[0];
      this.aP17 = aP17;
      prddia1_usuwcexport.this.AV63intcodfrom = aP18[0];
      this.aP18 = aP18;
      prddia1_usuwcexport.this.AV64intcodto = aP19[0];
      this.aP19 = aP19;
      prddia1_usuwcexport.this.AV68Filename = aP20[0];
      this.aP20 = aP20;
      prddia1_usuwcexport.this.AV69ErrorMessage = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV32Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      prddia1_usuwcexport.this.GXt_int1 = GXv_int2[0] ;
      AV32Grulec = GXt_int1 ;
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
      AV70Random = (int)(GXutil.random( )*10000) ;
      AV68Filename = "Informe Produccion Diaria I (Resumen)" + GXutil.trim( GXutil.str( AV70Random, 8, 0)) + ".xlsx" ;
      AV15Exceldocument.Open(AV68Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV15Exceldocument.Clear();
      AV70Random = (int)(GXutil.random( )*10000) ;
      AV68Filename = "InformeProduccionDiariaResumen-" + GXutil.trim( GXutil.str( AV70Random, 8, 0)) + ".xlsx" ;
      AV15Exceldocument.Open(AV68Filename);
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
         AV68Filename = "" ;
         AV69ErrorMessage = AV15Exceldocument.getErrDescription() ;
         AV15Exceldocument.Close();
         returnInSub = true;
         if (true) return;
      }
      if ( AV15Exceldocument.getErrCode() != 0 )
      {
         AV68Filename = "" ;
         AV69ErrorMessage = AV15Exceldocument.getErrDescription() ;
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
      while ( AV17CellCol <= 27 )
      {
         AV15Exceldocument.Cells((int)(AV16CellRow), (int)(AV17CellCol), 1, 1).setBold( (short)(1) );
         AV15Exceldocument.Cells((int)(AV16CellRow), (int)(AV17CellCol), 1, 1).setColor( 11 );
         AV17CellCol = (long)(AV17CellCol+1) ;
      }
      AV15Exceldocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV15Exceldocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV15Exceldocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Dia", "") );
      AV15Exceldocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV15Exceldocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV15Exceldocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV15Exceldocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Horas", "") );
      AV15Exceldocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV15Exceldocument.Cells(1, 9, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
      AV15Exceldocument.Cells(1, 10, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Horas", "") );
      AV15Exceldocument.Cells(1, 11, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Minutos", "") );
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
      /* Using cursor P0AAJ2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV9Maqcod, AV11Hisprodtf, AV12Hisprodtf_to, Integer.valueOf(AV56Opecod), Integer.valueOf(AV57Opecod_to), Integer.valueOf(AV50Clicod), Integer.valueOf(AV51Clicod_to), AV53Fase, AV54Fase_to, AV47Barser, AV48Barser_to, AV44Barcolnom, AV45Barcolnom_to, Byte.valueOf(AV63intcodfrom), Byte.valueOf(AV64intcodto), AV10Maqcod_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAAJ2 = false ;
         A136BarColNum = P0AAJ2_A136BarColNum[0] ;
         A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
         A6680HisproTdab = P0AAJ2_A6680HisproTdab[0] ;
         A130BarCodPar = P0AAJ2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAJ2_A132BarCodReo[0] ;
         A129BarCod = P0AAJ2_A129BarCod[0] ;
         A3610HisProLot = P0AAJ2_A3610HisProLot[0] ;
         A656ParCod = P0AAJ2_A656ParCod[0] ;
         n656ParCod = P0AAJ2_n656ParCod[0] ;
         A1526HisProMtr = P0AAJ2_A1526HisProMtr[0] ;
         A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
         n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
         A5608HisProDf = P0AAJ2_A5608HisProDf[0] ;
         A503GruOpeCod = P0AAJ2_A503GruOpeCod[0] ;
         A252CliCod = P0AAJ2_A252CliCod[0] ;
         n252CliCod = P0AAJ2_n252CliCod[0] ;
         A461Fase = P0AAJ2_A461Fase[0] ;
         A212BarSer = P0AAJ2_A212BarSer[0] ;
         A135BarColNom = P0AAJ2_A135BarColNom[0] ;
         A1525HisProKgr = P0AAJ2_A1525HisProKgr[0] ;
         A602MaqCod = P0AAJ2_A602MaqCod[0] ;
         A396EmprCod = P0AAJ2_A396EmprCod[0] ;
         A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
         n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
         A4440HisProDTI = P0AAJ2_A4440HisProDTI[0] ;
         n4440HisProDTI = P0AAJ2_n4440HisProDTI[0] ;
         A4441HisProDTF = P0AAJ2_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AAJ2_n4441HisProDTF[0] ;
         A558HisProFec = P0AAJ2_A558HisProFec[0] ;
         A561HisProLin = P0AAJ2_A561HisProLin[0] ;
         A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
         n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
         A136BarColNum = P0AAJ2_A136BarColNum[0] ;
         A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
         A252CliCod = P0AAJ2_A252CliCod[0] ;
         n252CliCod = P0AAJ2_n252CliCod[0] ;
         A212BarSer = P0AAJ2_A212BarSer[0] ;
         A135BarColNom = P0AAJ2_A135BarColNom[0] ;
         A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
         n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAJ2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkAAJ2 = false ;
            A136BarColNum = P0AAJ2_A136BarColNum[0] ;
            A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
            A6680HisproTdab = P0AAJ2_A6680HisproTdab[0] ;
            A130BarCodPar = P0AAJ2_A130BarCodPar[0] ;
            A132BarCodReo = P0AAJ2_A132BarCodReo[0] ;
            A129BarCod = P0AAJ2_A129BarCod[0] ;
            A3610HisProLot = P0AAJ2_A3610HisProLot[0] ;
            A656ParCod = P0AAJ2_A656ParCod[0] ;
            n656ParCod = P0AAJ2_n656ParCod[0] ;
            A1526HisProMtr = P0AAJ2_A1526HisProMtr[0] ;
            A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
            n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
            A5608HisProDf = P0AAJ2_A5608HisProDf[0] ;
            A503GruOpeCod = P0AAJ2_A503GruOpeCod[0] ;
            A252CliCod = P0AAJ2_A252CliCod[0] ;
            n252CliCod = P0AAJ2_n252CliCod[0] ;
            A461Fase = P0AAJ2_A461Fase[0] ;
            A212BarSer = P0AAJ2_A212BarSer[0] ;
            A135BarColNom = P0AAJ2_A135BarColNom[0] ;
            A1525HisProKgr = P0AAJ2_A1525HisProKgr[0] ;
            A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
            n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
            A4440HisProDTI = P0AAJ2_A4440HisProDTI[0] ;
            n4440HisProDTI = P0AAJ2_n4440HisProDTI[0] ;
            A4441HisProDTF = P0AAJ2_A4441HisProDTF[0] ;
            n4441HisProDTF = P0AAJ2_n4441HisProDTF[0] ;
            A558HisProFec = P0AAJ2_A558HisProFec[0] ;
            A561HisProLin = P0AAJ2_A561HisProLin[0] ;
            A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
            n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
            A136BarColNum = P0AAJ2_A136BarColNum[0] ;
            A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
            A252CliCod = P0AAJ2_A252CliCod[0] ;
            n252CliCod = P0AAJ2_n252CliCod[0] ;
            A212BarSer = P0AAJ2_A212BarSer[0] ;
            A135BarColNom = P0AAJ2_A135BarColNom[0] ;
            A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
            n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
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
                                       if ( A13904BarIntColo >= AV63intcodfrom )
                                       {
                                          if ( A13904BarIntColo <= AV64intcodto )
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
                                                               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAJ2_A602MaqCod[0], A602MaqCod) == 0 ) )
                                                               {
                                                                  brkAAJ2 = false ;
                                                                  A136BarColNum = P0AAJ2_A136BarColNum[0] ;
                                                                  A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
                                                                  A6680HisproTdab = P0AAJ2_A6680HisproTdab[0] ;
                                                                  A130BarCodPar = P0AAJ2_A130BarCodPar[0] ;
                                                                  A132BarCodReo = P0AAJ2_A132BarCodReo[0] ;
                                                                  A129BarCod = P0AAJ2_A129BarCod[0] ;
                                                                  A3610HisProLot = P0AAJ2_A3610HisProLot[0] ;
                                                                  A656ParCod = P0AAJ2_A656ParCod[0] ;
                                                                  n656ParCod = P0AAJ2_n656ParCod[0] ;
                                                                  A1526HisProMtr = P0AAJ2_A1526HisProMtr[0] ;
                                                                  A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
                                                                  n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
                                                                  A5608HisProDf = P0AAJ2_A5608HisProDf[0] ;
                                                                  A503GruOpeCod = P0AAJ2_A503GruOpeCod[0] ;
                                                                  A252CliCod = P0AAJ2_A252CliCod[0] ;
                                                                  n252CliCod = P0AAJ2_n252CliCod[0] ;
                                                                  A461Fase = P0AAJ2_A461Fase[0] ;
                                                                  A212BarSer = P0AAJ2_A212BarSer[0] ;
                                                                  A135BarColNom = P0AAJ2_A135BarColNom[0] ;
                                                                  A1525HisProKgr = P0AAJ2_A1525HisProKgr[0] ;
                                                                  A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
                                                                  n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
                                                                  A4440HisProDTI = P0AAJ2_A4440HisProDTI[0] ;
                                                                  n4440HisProDTI = P0AAJ2_n4440HisProDTI[0] ;
                                                                  A4441HisProDTF = P0AAJ2_A4441HisProDTF[0] ;
                                                                  n4441HisProDTF = P0AAJ2_n4441HisProDTF[0] ;
                                                                  A558HisProFec = P0AAJ2_A558HisProFec[0] ;
                                                                  A561HisProLin = P0AAJ2_A561HisProLin[0] ;
                                                                  A606MaqDsc = P0AAJ2_A606MaqDsc[0] ;
                                                                  n606MaqDsc = P0AAJ2_n606MaqDsc[0] ;
                                                                  A136BarColNum = P0AAJ2_A136BarColNum[0] ;
                                                                  A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
                                                                  A252CliCod = P0AAJ2_A252CliCod[0] ;
                                                                  n252CliCod = P0AAJ2_n252CliCod[0] ;
                                                                  A212BarSer = P0AAJ2_A212BarSer[0] ;
                                                                  A135BarColNom = P0AAJ2_A135BarColNom[0] ;
                                                                  A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
                                                                  n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
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
                                                                                             if ( A13904BarIntColo >= AV63intcodfrom )
                                                                                             {
                                                                                                if ( A13904BarIntColo <= AV64intcodto )
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
                                                                                                                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAJ2_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.dateCompare(GXutil.resetTime(P0AAJ2_A5608HisProDf[0]), GXutil.resetTime(A5608HisProDf)) )
                                                                                                                     {
                                                                                                                        brkAAJ2 = false ;
                                                                                                                        A136BarColNum = P0AAJ2_A136BarColNum[0] ;
                                                                                                                        A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
                                                                                                                        A6680HisproTdab = P0AAJ2_A6680HisproTdab[0] ;
                                                                                                                        A130BarCodPar = P0AAJ2_A130BarCodPar[0] ;
                                                                                                                        A132BarCodReo = P0AAJ2_A132BarCodReo[0] ;
                                                                                                                        A129BarCod = P0AAJ2_A129BarCod[0] ;
                                                                                                                        A3610HisProLot = P0AAJ2_A3610HisProLot[0] ;
                                                                                                                        A656ParCod = P0AAJ2_A656ParCod[0] ;
                                                                                                                        n656ParCod = P0AAJ2_n656ParCod[0] ;
                                                                                                                        A1526HisProMtr = P0AAJ2_A1526HisProMtr[0] ;
                                                                                                                        A503GruOpeCod = P0AAJ2_A503GruOpeCod[0] ;
                                                                                                                        A252CliCod = P0AAJ2_A252CliCod[0] ;
                                                                                                                        n252CliCod = P0AAJ2_n252CliCod[0] ;
                                                                                                                        A461Fase = P0AAJ2_A461Fase[0] ;
                                                                                                                        A212BarSer = P0AAJ2_A212BarSer[0] ;
                                                                                                                        A135BarColNom = P0AAJ2_A135BarColNom[0] ;
                                                                                                                        A1525HisProKgr = P0AAJ2_A1525HisProKgr[0] ;
                                                                                                                        A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
                                                                                                                        n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
                                                                                                                        A4440HisProDTI = P0AAJ2_A4440HisProDTI[0] ;
                                                                                                                        n4440HisProDTI = P0AAJ2_n4440HisProDTI[0] ;
                                                                                                                        A4441HisProDTF = P0AAJ2_A4441HisProDTF[0] ;
                                                                                                                        n4441HisProDTF = P0AAJ2_n4441HisProDTF[0] ;
                                                                                                                        A558HisProFec = P0AAJ2_A558HisProFec[0] ;
                                                                                                                        A561HisProLin = P0AAJ2_A561HisProLin[0] ;
                                                                                                                        A136BarColNum = P0AAJ2_A136BarColNum[0] ;
                                                                                                                        A218BarTipCol = P0AAJ2_A218BarTipCol[0] ;
                                                                                                                        A252CliCod = P0AAJ2_A252CliCod[0] ;
                                                                                                                        n252CliCod = P0AAJ2_n252CliCod[0] ;
                                                                                                                        A212BarSer = P0AAJ2_A212BarSer[0] ;
                                                                                                                        A135BarColNom = P0AAJ2_A135BarColNom[0] ;
                                                                                                                        A13904BarIntColo = P0AAJ2_A13904BarIntColo[0] ;
                                                                                                                        n13904BarIntColo = P0AAJ2_n13904BarIntColo[0] ;
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
                                                                                                                                                   if ( A13904BarIntColo >= AV63intcodfrom )
                                                                                                                                                   {
                                                                                                                                                      if ( A13904BarIntColo <= AV64intcodto )
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
                                                                                                                                                                           GXv_char3[0] = A396EmprCod ;
                                                                                                                                                                           GXv_char4[0] = A461Fase ;
                                                                                                                                                                           GXv_char5[0] = AV65FasDivTime ;
                                                                                                                                                                           new app.pfasdivtime(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
                                                                                                                                                                           prddia1_usuwcexport.this.A396EmprCod = GXv_char3[0] ;
                                                                                                                                                                           prddia1_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                                           prddia1_usuwcexport.this.AV65FasDivTime = GXv_char5[0] ;
                                                                                                                                                                           AV66HisProTr2 = ((GXutil.strcmp(AV65FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
                                                                                                                                                                           AV39HhMm = DecimalUtil.doubleToDec(AV66HisProTr2/ (double) (60)) ;
                                                                                                                                                                           AV40HorRea = (short)(AV66HisProTr2/ (double) (60)) ;
                                                                                                                                                                           AV41HorReaint = DecimalUtil.doubleToDec((AV40HorRea)) ;
                                                                                                                                                                           AV42MinRea = DecimalUtil.doubleToDec(AV66HisProTr2).subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                                                                           AV59Minutos = (AV41HorReaint.multiply(DecimalUtil.doubleToDec(60))).add(AV42MinRea) ;
                                                                                                                                                                           GXt_char6 = AV29FasActtin ;
                                                                                                                                                                           GXv_char5[0] = A396EmprCod ;
                                                                                                                                                                           GXv_char4[0] = A461Fase ;
                                                                                                                                                                           GXv_char3[0] = GXt_char6 ;
                                                                                                                                                                           new app.pfasest(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
                                                                                                                                                                           prddia1_usuwcexport.this.A396EmprCod = GXv_char5[0] ;
                                                                                                                                                                           prddia1_usuwcexport.this.A461Fase = GXv_char4[0] ;
                                                                                                                                                                           prddia1_usuwcexport.this.GXt_char6 = GXv_char3[0] ;
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
                                                                                                                                                                           if ( (0==A656ParCod) )
                                                                                                                                                                           {
                                                                                                                                                                              AV34TotaltiempoMaquinaDia = AV34TotaltiempoMaquinaDia.add((((GXutil.strcmp(AV65FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV59Minutos : ((AV30FlagMarca==1) ? AV59Minutos : DecimalUtil.doubleToDec(0))))) ;
                                                                                                                                                                           }
                                                                                                                                                                           else
                                                                                                                                                                           {
                                                                                                                                                                              AV33TotaltiempoparoMaquinaDia = AV33TotaltiempoparoMaquinaDia.add((((AV30FlagMarca==1) ? AV59Minutos : DecimalUtil.doubleToDec(0)))) ;
                                                                                                                                                                           }
                                                                                                                                                                           AV19TotalkMaquinaDia = AV19TotalkMaquinaDia.add(A1525HisProKgr) ;
                                                                                                                                                                           AV20TotalmMaquinaDia = AV20TotalmMaquinaDia.add(A1526HisProMtr) ;
                                                                                                                                                                           Gx_msg = httpContext.getMessage( "Procesando Maquina..", "") + A602MaqCod ;
                                                                                                                                                                           System.out.println( Gx_msg );
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
                                                                                                                        brkAAJ2 = true ;
                                                                                                                        pr_default.readNext(0);
                                                                                                                     }
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( A606MaqDsc );
                                                                                                                     GXt_dtime7 = GXutil.resetTime( A5608HisProDf );
                                                                                                                     AV15Exceldocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 3, 1, 1).setDate( GXt_dtime7 );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19TotalkMaquinaDia)) );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV20TotalmMaquinaDia)) );
                                                                                                                     AV39HhMm = AV34TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                                                                                     AV40HorRea = (short)(DecimalUtil.decToDouble(AV34TotaltiempoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                                                                                     AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                                     AV42MinRea = AV34TotaltiempoMaquinaDia.subtract(AV41HorReaint.multiply(DecimalUtil.doubleToDec(60))) ;
                                                                                                                     AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV34TotaltiempoMaquinaDia)) );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                     AV71intMinRea = (byte)(GXutil.Int( DecimalUtil.decToDouble(AV42MinRea))) ;
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setNumber( AV71intMinRea );
                                                                                                                     AV39HhMm = AV33TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
                                                                                                                     AV40HorRea = (short)(DecimalUtil.decToDouble(AV33TotaltiempoparoMaquinaDia.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
                                                                                                                     AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
                                                                                                                     AV42MinRea = AV33TotaltiempoparoMaquinaDia.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
                                                                                                                     AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setColor( 3 );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV33TotaltiempoparoMaquinaDia)) );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setColor( 3 );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setColor( 3 );
                                                                                                                     AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV42MinRea)) );
                                                                                                                     AV21TotalkMaquina = AV21TotalkMaquina.add(AV19TotalkMaquinaDia) ;
                                                                                                                     AV22TotalmMaquina = AV22TotalmMaquina.add(AV20TotalmMaquinaDia) ;
                                                                                                                     AV35TotaltiempoMaquina = AV35TotaltiempoMaquina.add(AV34TotaltiempoMaquinaDia) ;
                                                                                                                     AV36TotaltiempoparoMaquina = AV36TotaltiempoparoMaquina.add(AV33TotaltiempoparoMaquinaDia) ;
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
                                                                  if ( ! brkAAJ2 )
                                                                  {
                                                                     brkAAJ2 = true ;
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
               }
            }
            if ( ! brkAAJ2 )
            {
               brkAAJ2 = true ;
               pr_default.readNext(0);
            }
         }
         AV15Exceldocument.Cells((int)(AV16CellRow), 1, 1, 1).setText( A602MaqCod );
         AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( A606MaqDsc );
         AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotalkMaquina)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV22TotalmMaquina)) );
         AV39HhMm = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV35TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
         AV40HorRea = (short)(GXutil.Int( DecimalUtil.decToDouble(AV35TotaltiempoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN)))) ;
         AV41HorReaint = DecimalUtil.doubleToDec(GXutil.Int( AV40HorRea)) ;
         AV42MinRea = AV35TotaltiempoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
         AV42MinRea = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV42MinRea))) ;
         AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
         AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV35TotaltiempoMaquina)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV42MinRea)) );
         AV39HhMm = AV36TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
         AV40HorRea = (short)(DecimalUtil.decToDouble(AV36TotaltiempoparoMaquina.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
         AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
         AV42MinRea = AV36TotaltiempoparoMaquina.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
         AV43HhMm_t = GXutil.str( AV41HorReaint, 10, 2) + ":" + GXutil.str( AV42MinRea, 10, 2) ;
         AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV36TotaltiempoparoMaquina)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
         AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setColor( 3 );
         AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV42MinRea)) );
         AV16CellRow = (long)(AV16CellRow+2) ;
         AV23TotalkGeneral = AV23TotalkGeneral.add(AV21TotalkMaquina) ;
         AV24TotalmGeneral = AV24TotalmGeneral.add(AV22TotalmMaquina) ;
         AV37Totaltiempogeneral = AV37Totaltiempogeneral.add(AV35TotaltiempoMaquina) ;
         AV38Totaltiempoparogeneral = AV38Totaltiempoparogeneral.add(AV36TotaltiempoparoMaquina) ;
         if ( ! brkAAJ2 )
         {
            brkAAJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV15Exceldocument.Cells((int)(AV16CellRow), 2, 1, 1).setText( httpContext.getMessage( "Total General", "") );
      AV15Exceldocument.Cells((int)(AV16CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23TotalkGeneral)) );
      AV15Exceldocument.Cells((int)(AV16CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotalmGeneral)) );
      AV39HhMm = AV37Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
      AV40HorRea = (short)(DecimalUtil.decToDouble(AV37Totaltiempogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
      AV42MinRea = AV37Totaltiempogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
      AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
      AV15Exceldocument.Cells((int)(AV16CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV37Totaltiempogeneral)) );
      AV72GeneralHorReaint = (short)(DecimalUtil.decToDouble(AV41HorReaint)) ;
      AV73GeneralMinRea = (short)(DecimalUtil.decToDouble(AV42MinRea)) ;
      AV15Exceldocument.Cells((int)(AV16CellRow), 7, 1, 1).setNumber( GXutil.Int( AV72GeneralHorReaint) );
      AV15Exceldocument.Cells((int)(AV16CellRow), 8, 1, 1).setNumber( GXutil.Int( AV73GeneralMinRea) );
      AV39HhMm = AV38Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
      AV40HorRea = (short)(DecimalUtil.decToDouble(AV38Totaltiempoparogeneral.divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN))) ;
      AV41HorReaint = DecimalUtil.doubleToDec(AV40HorRea) ;
      AV42MinRea = AV38Totaltiempoparogeneral.subtract((AV41HorReaint.multiply(DecimalUtil.doubleToDec(60)))) ;
      AV43HhMm_t = GXutil.format( "%1:%2", GXutil.str( AV41HorReaint, 10, 2), GXutil.str( AV42MinRea, 10, 2), "", "", "", "", "", "", "") ;
      AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells((int)(AV16CellRow), 9, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV38Totaltiempoparogeneral)) );
      AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells((int)(AV16CellRow), 10, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV41HorReaint)) );
      AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setColor( 3 );
      AV15Exceldocument.Cells((int)(AV16CellRow), 11, 1, 1).setNumber( GXutil.Int( DecimalUtil.decToDouble(AV42MinRea)) );
   }

   protected void cleanup( )
   {
      this.aP0[0] = prddia1_usuwcexport.this.AV8Emprcod;
      this.aP1[0] = prddia1_usuwcexport.this.AV9Maqcod;
      this.aP2[0] = prddia1_usuwcexport.this.AV10Maqcod_to;
      this.aP3[0] = prddia1_usuwcexport.this.AV11Hisprodtf;
      this.aP4[0] = prddia1_usuwcexport.this.AV12Hisprodtf_to;
      this.aP5[0] = prddia1_usuwcexport.this.AV50Clicod;
      this.aP6[0] = prddia1_usuwcexport.this.AV51Clicod_to;
      this.aP7[0] = prddia1_usuwcexport.this.AV44Barcolnom;
      this.aP8[0] = prddia1_usuwcexport.this.AV45Barcolnom_to;
      this.aP9[0] = prddia1_usuwcexport.this.AV53Fase;
      this.aP10[0] = prddia1_usuwcexport.this.AV54Fase_to;
      this.aP11[0] = prddia1_usuwcexport.this.AV56Opecod;
      this.aP12[0] = prddia1_usuwcexport.this.AV57Opecod_to;
      this.aP13[0] = prddia1_usuwcexport.this.AV47Barser;
      this.aP14[0] = prddia1_usuwcexport.this.AV48Barser_to;
      this.aP15[0] = prddia1_usuwcexport.this.AV60Sidia;
      this.aP16[0] = prddia1_usuwcexport.this.AV61SiMaquina;
      this.aP17[0] = prddia1_usuwcexport.this.AV62Imprimirparos;
      this.aP18[0] = prddia1_usuwcexport.this.AV63intcodfrom;
      this.aP19[0] = prddia1_usuwcexport.this.AV64intcodto;
      this.aP20[0] = prddia1_usuwcexport.this.AV68Filename;
      this.aP21[0] = prddia1_usuwcexport.this.AV69ErrorMessage;
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
      A396EmprCod = "" ;
      GXv_int2 = new byte[1] ;
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
      P0AAJ2_A494ForSer = new String[] {""} ;
      P0AAJ2_A482ForColNom = new String[] {""} ;
      P0AAJ2_A483ForColNum = new int[1] ;
      P0AAJ2_A831TipColCod = new byte[1] ;
      P0AAJ2_A136BarColNum = new int[1] ;
      P0AAJ2_A218BarTipCol = new byte[1] ;
      P0AAJ2_A6680HisproTdab = new short[1] ;
      P0AAJ2_A130BarCodPar = new String[] {""} ;
      P0AAJ2_A132BarCodReo = new byte[1] ;
      P0AAJ2_A129BarCod = new int[1] ;
      P0AAJ2_A3610HisProLot = new String[] {""} ;
      P0AAJ2_A656ParCod = new short[1] ;
      P0AAJ2_n656ParCod = new boolean[] {false} ;
      P0AAJ2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAJ2_A606MaqDsc = new String[] {""} ;
      P0AAJ2_n606MaqDsc = new boolean[] {false} ;
      P0AAJ2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAJ2_A503GruOpeCod = new int[1] ;
      P0AAJ2_A252CliCod = new int[1] ;
      P0AAJ2_n252CliCod = new boolean[] {false} ;
      P0AAJ2_A461Fase = new String[] {""} ;
      P0AAJ2_A212BarSer = new String[] {""} ;
      P0AAJ2_A135BarColNom = new String[] {""} ;
      P0AAJ2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAJ2_A602MaqCod = new String[] {""} ;
      P0AAJ2_A396EmprCod = new String[] {""} ;
      P0AAJ2_A13904BarIntColo = new byte[1] ;
      P0AAJ2_n13904BarIntColo = new boolean[] {false} ;
      P0AAJ2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAJ2_n4440HisProDTI = new boolean[] {false} ;
      P0AAJ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAJ2_n4441HisProDTF = new boolean[] {false} ;
      P0AAJ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAJ2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A5608HisProDf = GXutil.nullDate() ;
      A461Fase = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV65FasDivTime = "" ;
      AV39HhMm = DecimalUtil.ZERO ;
      AV41HorReaint = DecimalUtil.ZERO ;
      AV42MinRea = DecimalUtil.ZERO ;
      AV59Minutos = DecimalUtil.ZERO ;
      AV29FasActtin = "" ;
      GXt_char6 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV31HisProLot = "" ;
      Gx_msg = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      AV43HhMm_t = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.prddia1_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P0AAJ2_A494ForSer, P0AAJ2_A482ForColNom, P0AAJ2_A483ForColNum, P0AAJ2_A831TipColCod, P0AAJ2_A136BarColNum, P0AAJ2_A218BarTipCol, P0AAJ2_A6680HisproTdab, P0AAJ2_A130BarCodPar, P0AAJ2_A132BarCodReo, P0AAJ2_A129BarCod,
            P0AAJ2_A3610HisProLot, P0AAJ2_A656ParCod, P0AAJ2_n656ParCod, P0AAJ2_A1526HisProMtr, P0AAJ2_A606MaqDsc, P0AAJ2_n606MaqDsc, P0AAJ2_A5608HisProDf, P0AAJ2_A503GruOpeCod, P0AAJ2_A252CliCod, P0AAJ2_n252CliCod,
            P0AAJ2_A461Fase, P0AAJ2_A212BarSer, P0AAJ2_A135BarColNom, P0AAJ2_A1525HisProKgr, P0AAJ2_A602MaqCod, P0AAJ2_A396EmprCod, P0AAJ2_A13904BarIntColo, P0AAJ2_n13904BarIntColo, P0AAJ2_A4440HisProDTI, P0AAJ2_n4440HisProDTI,
            P0AAJ2_A4441HisProDTF, P0AAJ2_n4441HisProDTF, P0AAJ2_A558HisProFec, P0AAJ2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60Sidia ;
   private byte AV61SiMaquina ;
   private byte AV62Imprimirparos ;
   private byte AV63intcodfrom ;
   private byte AV64intcodto ;
   private byte AV32Grulec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte A13904BarIntColo ;
   private byte AV30FlagMarca ;
   private byte AV71intMinRea ;
   private short A6680HisproTdab ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV66HisProTr2 ;
   private short AV40HorRea ;
   private short AV72GeneralHorReaint ;
   private short AV73GeneralMinRea ;
   private short Gx_err ;
   private int AV50Clicod ;
   private int AV51Clicod_to ;
   private int AV56Opecod ;
   private int AV57Opecod_to ;
   private int AV70Random ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
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
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String A461Fase ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A602MaqCod ;
   private String AV65FasDivTime ;
   private String AV29FasActtin ;
   private String GXt_char6 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV31HisProLot ;
   private String Gx_msg ;
   private String AV43HhMm_t ;
   private java.util.Date AV11Hisprodtf ;
   private java.util.Date AV12Hisprodtf_to ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date GXt_dtime7 ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brkAAJ2 ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n252CliCod ;
   private boolean n13904BarIntColo ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV68Filename ;
   private String AV69ErrorMessage ;
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
   private String[] P0AAJ2_A494ForSer ;
   private String[] P0AAJ2_A482ForColNom ;
   private int[] P0AAJ2_A483ForColNum ;
   private byte[] P0AAJ2_A831TipColCod ;
   private int[] P0AAJ2_A136BarColNum ;
   private byte[] P0AAJ2_A218BarTipCol ;
   private short[] P0AAJ2_A6680HisproTdab ;
   private String[] P0AAJ2_A130BarCodPar ;
   private byte[] P0AAJ2_A132BarCodReo ;
   private int[] P0AAJ2_A129BarCod ;
   private String[] P0AAJ2_A3610HisProLot ;
   private short[] P0AAJ2_A656ParCod ;
   private boolean[] P0AAJ2_n656ParCod ;
   private java.math.BigDecimal[] P0AAJ2_A1526HisProMtr ;
   private String[] P0AAJ2_A606MaqDsc ;
   private boolean[] P0AAJ2_n606MaqDsc ;
   private java.util.Date[] P0AAJ2_A5608HisProDf ;
   private int[] P0AAJ2_A503GruOpeCod ;
   private int[] P0AAJ2_A252CliCod ;
   private boolean[] P0AAJ2_n252CliCod ;
   private String[] P0AAJ2_A461Fase ;
   private String[] P0AAJ2_A212BarSer ;
   private String[] P0AAJ2_A135BarColNom ;
   private java.math.BigDecimal[] P0AAJ2_A1525HisProKgr ;
   private String[] P0AAJ2_A602MaqCod ;
   private String[] P0AAJ2_A396EmprCod ;
   private byte[] P0AAJ2_A13904BarIntColo ;
   private boolean[] P0AAJ2_n13904BarIntColo ;
   private java.util.Date[] P0AAJ2_A4440HisProDTI ;
   private boolean[] P0AAJ2_n4440HisProDTI ;
   private java.util.Date[] P0AAJ2_A4441HisProDTF ;
   private boolean[] P0AAJ2_n4441HisProDTF ;
   private java.util.Date[] P0AAJ2_A558HisProFec ;
   private int[] P0AAJ2_A561HisProLin ;
   private com.genexus.gxoffice.ExcelDoc AV15Exceldocument ;
}

final  class prddia1_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAJ2", "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T3.BarColNum, T3.BarTipCol, T1.HisproTdab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.ParCod, T1.HisProMtr, T2.MaqDsc, T1.HisProDf, T1.GruOpeCod, T3.CliCod, T1.Fase, T3.BarSer, T3.BarColNom, T1.HisProKgr, T1.MaqCod, T1.EmprCod, COALESCE( T4.IntCod, 0) AS BarIntColo, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod AND T4.ForSer = T3.BarSer AND T4.ForColNom = T3.BarColNom AND T4.ForColNum = T3.BarColNum AND T4.TipColCod = T3.BarTipCol) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.GruOpeCod >= ?) AND (T1.GruOpeCod <= ?) AND (T3.CliCod >= ?) AND (T3.CliCod <= ?) AND (T1.Fase >= ?) AND (T1.Fase <= ?) AND (T3.BarSer >= ?) AND (T3.BarSer <= ?) AND (T3.BarColNom >= ?) AND (T3.BarColNom <= ?) AND (COALESCE( T4.IntCod, 0) >= ?) AND (COALESCE( T4.IntCod, 0) <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProDf ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 8);
               ((String[]) buf[21])[0] = rslt.getString(19, 16);
               ((String[]) buf[22])[0] = rslt.getString(20, 13);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[24])[0] = rslt.getString(22, 6);
               ((String[]) buf[25])[0] = rslt.getString(23, 3);
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
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 6);
               return;
      }
   }

}

