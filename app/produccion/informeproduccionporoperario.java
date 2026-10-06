package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionporoperario extends GXProcedure
{
   public informeproduccionporoperario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionporoperario.class ), "" );
   }

   public informeproduccionporoperario( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 )
   {
      informeproduccionporoperario.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        int[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      informeproduccionporoperario.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      informeproduccionporoperario.this.AV34hISPRODTI = aP1[0];
      this.aP1 = aP1;
      informeproduccionporoperario.this.AV50Pmaq = aP2[0];
      this.aP2 = aP2;
      informeproduccionporoperario.this.AV51Poper = aP3[0];
      this.aP3 = aP3;
      informeproduccionporoperario.this.AV33Hisprodtf = aP4[0];
      this.aP4 = aP4;
      informeproduccionporoperario.this.AV64Umaq = aP5[0];
      this.aP5 = aP5;
      informeproduccionporoperario.this.AV65Uoper = aP6[0];
      this.aP6 = aP6;
      informeproduccionporoperario.this.AV53TipMaqcod = aP7[0];
      this.aP7 = aP7;
      informeproduccionporoperario.this.AV16ArtCodi = aP8[0];
      this.aP8 = aP8;
      informeproduccionporoperario.this.AV15ArtCodf = aP9[0];
      this.aP9 = aP9;
      informeproduccionporoperario.this.AV18Barcolnomi = aP10[0];
      this.aP10 = aP10;
      informeproduccionporoperario.this.AV17Barcolnomf = aP11[0];
      this.aP11 = aP11;
      informeproduccionporoperario.this.AV20Barcolnumi = aP12[0];
      this.aP12 = aP12;
      informeproduccionporoperario.this.AV19Barcolnumf = aP13[0];
      this.aP13 = aP13;
      informeproduccionporoperario.this.AV9Filename = aP14[0];
      this.aP14 = aP14;
      informeproduccionporoperario.this.AV10ErrorMessage = aP15[0];
      this.aP15 = aP15;
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
      AV11Random = (int)(GXutil.random( )*10000) ;
      AV9Filename = "InformeProduccionporOperario-" + GXutil.trim( GXutil.str( AV11Random, 8, 0)) + ".xlsx" ;
      AV8ExcelDocument.Open(AV9Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV8ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV8ExcelDocument.Cells(1, 10, 1, 1).setBold( (short)(1) );
      AV8ExcelDocument.Cells(1, 10, 1, 1).setColor( 11 );
      AV8ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
      AV8ExcelDocument.Cells(1, 12, 1, 1).setBold( (short)(1) );
      AV8ExcelDocument.Cells(1, 12, 1, 1).setColor( 11 );
      AV8ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Fin", "") );
      AV12CellRow = 2 ;
      AV13CellCol = 1 ;
      while ( AV13CellCol <= 15 )
      {
         AV8ExcelDocument.Cells((int)(AV12CellRow), (int)(AV13CellCol), 1, 1).setBold( (short)(1) );
         AV8ExcelDocument.Cells((int)(AV12CellRow), (int)(AV13CellCol), 1, 1).setColor( 11 );
         AV13CellCol = (long)(AV13CellCol+1) ;
      }
      AV8ExcelDocument.Cells((int)(AV12CellRow), 1, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 2, 1, 1).setText( httpContext.getMessage( "Operario", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 3, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 4, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 5, 1, 1).setText( httpContext.getMessage( "Orden", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 6, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 7, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 8, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 9, 1, 1).setText( httpContext.getMessage( "Turno", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 10, 1, 1).setText( httpContext.getMessage( "Hh", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 11, 1, 1).setText( httpContext.getMessage( "Mm", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 12, 1, 1).setText( httpContext.getMessage( "Hh", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 13, 1, 1).setText( httpContext.getMessage( "Mm", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 14, 1, 1).setText( httpContext.getMessage( "Inicio", "") );
      AV8ExcelDocument.Cells((int)(AV12CellRow), 15, 1, 1).setText( httpContext.getMessage( "Fin", "") );
   }

   public void S141( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV12CellRow = 3 ;
      /* Using cursor P099U2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV51Poper), A396EmprCod, AV34hISPRODTI, AV50Pmaq, AV64Umaq, AV53TipMaqcod, AV53TipMaqcod, AV16ArtCodi, AV15ArtCodf, AV18Barcolnomi, AV17Barcolnomf, Integer.valueOf(AV20Barcolnumi), Integer.valueOf(AV19Barcolnumf), Integer.valueOf(AV65Uoper)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk99U2 = false ;
         A136BarColNum = P099U2_A136BarColNum[0] ;
         A135BarColNom = P099U2_A135BarColNom[0] ;
         A212BarSer = P099U2_A212BarSer[0] ;
         A1011TipMaqCod = P099U2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P099U2_n1011TipMaqCod[0] ;
         A602MaqCod = P099U2_A602MaqCod[0] ;
         A1525HisProKgr = P099U2_A1525HisProKgr[0] ;
         A1526HisProMtr = P099U2_A1526HisProMtr[0] ;
         A461Fase = P099U2_A461Fase[0] ;
         A3610HisProLot = P099U2_A3610HisProLot[0] ;
         A656ParCod = P099U2_A656ParCod[0] ;
         n656ParCod = P099U2_n656ParCod[0] ;
         A556HisProEst = P099U2_A556HisProEst[0] ;
         A503GruOpeCod = P099U2_A503GruOpeCod[0] ;
         A606MaqDsc = P099U2_A606MaqDsc[0] ;
         n606MaqDsc = P099U2_n606MaqDsc[0] ;
         A194BarOrdLin = P099U2_A194BarOrdLin[0] ;
         A566HisProTur = P099U2_A566HisProTur[0] ;
         A560HisProHin = P099U2_A560HisProHin[0] ;
         A563HisProMin = P099U2_A563HisProMin[0] ;
         A559HisProHfi = P099U2_A559HisProHfi[0] ;
         A562HisProMfi = P099U2_A562HisProMfi[0] ;
         A867ParCodNom = P099U2_A867ParCodNom[0] ;
         n867ParCodNom = P099U2_n867ParCodNom[0] ;
         A130BarCodPar = P099U2_A130BarCodPar[0] ;
         A132BarCodReo = P099U2_A132BarCodReo[0] ;
         A129BarCod = P099U2_A129BarCod[0] ;
         A561HisProLin = P099U2_A561HisProLin[0] ;
         A558HisProFec = P099U2_A558HisProFec[0] ;
         A4440HisProDTI = P099U2_A4440HisProDTI[0] ;
         n4440HisProDTI = P099U2_n4440HisProDTI[0] ;
         A4441HisProDTF = P099U2_A4441HisProDTF[0] ;
         n4441HisProDTF = P099U2_n4441HisProDTF[0] ;
         A1011TipMaqCod = P099U2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P099U2_n1011TipMaqCod[0] ;
         A606MaqDsc = P099U2_A606MaqDsc[0] ;
         n606MaqDsc = P099U2_n606MaqDsc[0] ;
         A867ParCodNom = P099U2_A867ParCodNom[0] ;
         n867ParCodNom = P099U2_n867ParCodNom[0] ;
         A136BarColNum = P099U2_A136BarColNum[0] ;
         A135BarColNom = P099U2_A135BarColNom[0] ;
         A212BarSer = P099U2_A212BarSer[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV28FlagImp = (byte)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( P099U2_A503GruOpeCod[0] == A503GruOpeCod ) )
         {
            brk99U2 = false ;
            A136BarColNum = P099U2_A136BarColNum[0] ;
            A135BarColNom = P099U2_A135BarColNom[0] ;
            A212BarSer = P099U2_A212BarSer[0] ;
            A1011TipMaqCod = P099U2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P099U2_n1011TipMaqCod[0] ;
            A602MaqCod = P099U2_A602MaqCod[0] ;
            A1525HisProKgr = P099U2_A1525HisProKgr[0] ;
            A1526HisProMtr = P099U2_A1526HisProMtr[0] ;
            A461Fase = P099U2_A461Fase[0] ;
            A3610HisProLot = P099U2_A3610HisProLot[0] ;
            A656ParCod = P099U2_A656ParCod[0] ;
            n656ParCod = P099U2_n656ParCod[0] ;
            A556HisProEst = P099U2_A556HisProEst[0] ;
            A606MaqDsc = P099U2_A606MaqDsc[0] ;
            n606MaqDsc = P099U2_n606MaqDsc[0] ;
            A194BarOrdLin = P099U2_A194BarOrdLin[0] ;
            A566HisProTur = P099U2_A566HisProTur[0] ;
            A560HisProHin = P099U2_A560HisProHin[0] ;
            A563HisProMin = P099U2_A563HisProMin[0] ;
            A559HisProHfi = P099U2_A559HisProHfi[0] ;
            A562HisProMfi = P099U2_A562HisProMfi[0] ;
            A867ParCodNom = P099U2_A867ParCodNom[0] ;
            n867ParCodNom = P099U2_n867ParCodNom[0] ;
            A130BarCodPar = P099U2_A130BarCodPar[0] ;
            A132BarCodReo = P099U2_A132BarCodReo[0] ;
            A129BarCod = P099U2_A129BarCod[0] ;
            A561HisProLin = P099U2_A561HisProLin[0] ;
            A558HisProFec = P099U2_A558HisProFec[0] ;
            A4440HisProDTI = P099U2_A4440HisProDTI[0] ;
            n4440HisProDTI = P099U2_n4440HisProDTI[0] ;
            A4441HisProDTF = P099U2_A4441HisProDTF[0] ;
            n4441HisProDTF = P099U2_n4441HisProDTF[0] ;
            A1011TipMaqCod = P099U2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P099U2_n1011TipMaqCod[0] ;
            A606MaqDsc = P099U2_A606MaqDsc[0] ;
            n606MaqDsc = P099U2_n606MaqDsc[0] ;
            A867ParCodNom = P099U2_A867ParCodNom[0] ;
            n867ParCodNom = P099U2_n867ParCodNom[0] ;
            A136BarColNum = P099U2_A136BarColNum[0] ;
            A135BarColNom = P099U2_A135BarColNom[0] ;
            A212BarSer = P099U2_A212BarSer[0] ;
            if ( GXutil.strcmp(P099U2_A396EmprCod[0], A396EmprCod) == 0 )
            {
               if ( ( GXutil.strcmp(A1011TipMaqCod, AV53TipMaqcod) == 0 ) || (GXutil.strcmp("", AV53TipMaqcod)==0) )
               {
                  if ( ( GXutil.strcmp(A212BarSer, AV16ArtCodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV15ArtCodf) <= 0 ) )
                  {
                     if ( ( GXutil.strcmp(A135BarColNom, AV18Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV17Barcolnomf) <= 0 ) )
                     {
                        if ( ( A136BarColNum >= AV20Barcolnumi ) && ( A136BarColNum <= AV19Barcolnumf ) )
                        {
                           if ( (( A4441HisProDTF.after( AV34hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV34hISPRODTI) )) )
                           {
                              if ( ( GXutil.strcmp(A602MaqCod, AV50Pmaq) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV64Umaq) <= 0 ) )
                              {
                                 if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                 {
                                    A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                                 }
                                 else
                                 {
                                    A5605HisProTr2 = (short)(0) ;
                                 }
                                 AV56TotKgs = AV56TotKgs.add(A1525HisProKgr) ;
                                 AV57TotMts = AV57TotMts.add(A1526HisProMtr) ;
                                 GXv_char1[0] = A396EmprCod ;
                                 GXv_char2[0] = A461Fase ;
                                 GXv_char3[0] = AV24FasActTin ;
                                 new app.pfasest(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3) ;
                                 informeproduccionporoperario.this.A396EmprCod = GXv_char1[0] ;
                                 informeproduccionporoperario.this.A461Fase = GXv_char2[0] ;
                                 informeproduccionporoperario.this.AV24FasActTin = GXv_char3[0] ;
                                 AV29FlagMarca = (byte)(0) ;
                                 AV35Hisprolot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                 if ( GXutil.strcmp(A3610HisProLot, AV35Hisprolot) == 0 )
                                 {
                                    AV29FlagMarca = (byte)(1) ;
                                 }
                                 if ( GXutil.strcmp(AV24FasActTin, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    AV29FlagMarca = (byte)(1) ;
                                 }
                                 AV36HisProTr2 = A5605HisProTr2 ;
                                 if ( (0==A656ParCod) )
                                 {
                                    if ( ! (0==A556HisProEst) )
                                    {
                                       if ( AV29FlagMarca == 1 )
                                       {
                                          AV59TotRea = (int)(AV59TotRea+AV36HisProTr2) ;
                                       }
                                    }
                                 }
                                 else
                                 {
                                    if ( ! (0==A556HisProEst) )
                                    {
                                       if ( AV29FlagMarca == 1 )
                                       {
                                          AV58TotPar = (int)(AV58TotPar+AV36HisProTr2) ;
                                       }
                                    }
                                 }
                                 if ( (0==A656ParCod) )
                                 {
                                    AV32Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                    GXv_char3[0] = A396EmprCod ;
                                    GXv_int4[0] = A503GruOpeCod ;
                                    GXv_char2[0] = AV48Openom ;
                                    GXv_int5[0] = AV27Flag ;
                                    new app.pbusope(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_int5) ;
                                    informeproduccionporoperario.this.A396EmprCod = GXv_char3[0] ;
                                    informeproduccionporoperario.this.A503GruOpeCod = GXv_int4[0] ;
                                    informeproduccionporoperario.this.AV48Openom = GXv_char2[0] ;
                                    informeproduccionporoperario.this.AV27Flag = GXv_int5[0] ;
                                    GXv_char3[0] = AV26FasDsc ;
                                    new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
                                    informeproduccionporoperario.this.AV26FasDsc = GXv_char3[0] ;
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 1, 1, 1).setText( AV32Hdr );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 2, 1, 1).setNumber( A503GruOpeCod );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 3, 1, 1).setText( AV48Openom );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 4, 1, 1).setText( A606MaqDsc );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 5, 1, 1).setNumber( A194BarOrdLin );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 6, 1, 1).setText( AV26FasDsc );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 9, 1, 1).setNumber( A566HisProTur );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 10, 1, 1).setNumber( A560HisProHin );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 11, 1, 1).setNumber( A563HisProMin );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 12, 1, 1).setNumber( A559HisProHfi );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 13, 1, 1).setNumber( A562HisProMfi );
                                    AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 14, 1, 1).setDate( A4440HisProDTI );
                                    AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 15, 1, 1).setDate( A4441HisProDTF );
                                    AV12CellRow = (long)(AV12CellRow+1) ;
                                 }
                                 else
                                 {
                                    AV32Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 1, 1, 1).setText( AV32Hdr );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 3, 1, 1).setText( A867ParCodNom );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 9, 1, 1).setNumber( A566HisProTur );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 10, 1, 1).setNumber( A560HisProHin );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 11, 1, 1).setNumber( A563HisProMin );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 12, 1, 1).setNumber( A559HisProHfi );
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 13, 1, 1).setNumber( A562HisProMfi );
                                    AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 14, 1, 1).setDate( A4440HisProDTI );
                                    AV8ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV8ExcelDocument.Cells((int)(AV12CellRow), 15, 1, 1).setDate( A4441HisProDTF );
                                    AV12CellRow = (long)(AV12CellRow+1) ;
                                 }
                                 AV28FlagImp = (byte)(1) ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk99U2 = true ;
            pr_default.readNext(0);
         }
         /* Using cursor P099U3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A652OpeCod = P099U3_A652OpeCod[0] ;
            A653OpeNom = P099U3_A653OpeNom[0] ;
            n653OpeNom = P099U3_n653OpeNom[0] ;
            AV48Openom = A653OpeNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV42HorReaint = (short)(GXutil.Int( AV59TotRea/ (double) (60))) ;
         AV45MinRea = (byte)(AV59TotRea-(AV42HorReaint*60)) ;
         AV66vHorMin = GXutil.str( AV42HorReaint, 4, 0) + ":" + GXutil.str( AV45MinRea, 2, 0) ;
         AV40HorParint = (short)(GXutil.Int( AV58TotPar/ (double) (60))) ;
         AV44MinPar = (byte)(AV58TotPar-(AV40HorParint*60)) ;
         AV67vHorMinP = GXutil.str( AV40HorParint, 4, 0) + ":" + GXutil.str( AV44MinPar, 2, 0) ;
         AV12CellRow = (long)(AV12CellRow+1) ;
         AV8ExcelDocument.Cells((int)(AV12CellRow), 2, 1, 1).setNumber( A503GruOpeCod );
         AV8ExcelDocument.Cells((int)(AV12CellRow), 3, 1, 1).setText( AV48Openom );
         AV8ExcelDocument.Cells((int)(AV12CellRow), 7, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TotMts)) );
         AV8ExcelDocument.Cells((int)(AV12CellRow), 8, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TotKgs)) );
         AV8ExcelDocument.Cells((int)(AV12CellRow), 10, 1, 1).setText( AV66vHorMin );
         AV8ExcelDocument.Cells((int)(AV12CellRow), 11, 1, 1).setText( AV67vHorMinP );
         AV12CellRow = (long)(AV12CellRow+2) ;
         AV56TotKgs = DecimalUtil.doubleToDec(0) ;
         AV57TotMts = DecimalUtil.doubleToDec(0) ;
         AV58TotPar = 0 ;
         AV59TotRea = 0 ;
         if ( ! brk99U2 )
         {
            brk99U2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV8ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV8ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV8ExcelDocument.getErrCode() != 0 )
      {
         AV9Filename = "" ;
         AV10ErrorMessage = AV8ExcelDocument.getErrDescription() ;
         AV8ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = informeproduccionporoperario.this.A396EmprCod;
      this.aP1[0] = informeproduccionporoperario.this.AV34hISPRODTI;
      this.aP2[0] = informeproduccionporoperario.this.AV50Pmaq;
      this.aP3[0] = informeproduccionporoperario.this.AV51Poper;
      this.aP4[0] = informeproduccionporoperario.this.AV33Hisprodtf;
      this.aP5[0] = informeproduccionporoperario.this.AV64Umaq;
      this.aP6[0] = informeproduccionporoperario.this.AV65Uoper;
      this.aP7[0] = informeproduccionporoperario.this.AV53TipMaqcod;
      this.aP8[0] = informeproduccionporoperario.this.AV16ArtCodi;
      this.aP9[0] = informeproduccionporoperario.this.AV15ArtCodf;
      this.aP10[0] = informeproduccionporoperario.this.AV18Barcolnomi;
      this.aP11[0] = informeproduccionporoperario.this.AV17Barcolnomf;
      this.aP12[0] = informeproduccionporoperario.this.AV20Barcolnumi;
      this.aP13[0] = informeproduccionporoperario.this.AV19Barcolnumf;
      this.aP14[0] = informeproduccionporoperario.this.AV9Filename;
      this.aP15[0] = informeproduccionporoperario.this.AV10ErrorMessage;
      CloseOpenCursors();
      AV8ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P099U2_A396EmprCod = new String[] {""} ;
      P099U2_A136BarColNum = new int[1] ;
      P099U2_A135BarColNom = new String[] {""} ;
      P099U2_A212BarSer = new String[] {""} ;
      P099U2_A1011TipMaqCod = new String[] {""} ;
      P099U2_n1011TipMaqCod = new boolean[] {false} ;
      P099U2_A602MaqCod = new String[] {""} ;
      P099U2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099U2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099U2_A461Fase = new String[] {""} ;
      P099U2_A3610HisProLot = new String[] {""} ;
      P099U2_A656ParCod = new short[1] ;
      P099U2_n656ParCod = new boolean[] {false} ;
      P099U2_A556HisProEst = new byte[1] ;
      P099U2_A503GruOpeCod = new int[1] ;
      P099U2_A606MaqDsc = new String[] {""} ;
      P099U2_n606MaqDsc = new boolean[] {false} ;
      P099U2_A194BarOrdLin = new short[1] ;
      P099U2_A566HisProTur = new byte[1] ;
      P099U2_A560HisProHin = new byte[1] ;
      P099U2_A563HisProMin = new byte[1] ;
      P099U2_A559HisProHfi = new byte[1] ;
      P099U2_A562HisProMfi = new byte[1] ;
      P099U2_A867ParCodNom = new String[] {""} ;
      P099U2_n867ParCodNom = new boolean[] {false} ;
      P099U2_A130BarCodPar = new String[] {""} ;
      P099U2_A132BarCodReo = new byte[1] ;
      P099U2_A129BarCod = new int[1] ;
      P099U2_A561HisProLin = new int[1] ;
      P099U2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P099U2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P099U2_n4440HisProDTI = new boolean[] {false} ;
      P099U2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P099U2_n4441HisProDTF = new boolean[] {false} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1011TipMaqCod = "" ;
      A602MaqCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A461Fase = "" ;
      A3610HisProLot = "" ;
      A606MaqDsc = "" ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV56TotKgs = DecimalUtil.ZERO ;
      AV57TotMts = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      AV24FasActTin = "" ;
      AV35Hisprolot = "" ;
      AV32Hdr = "" ;
      GXv_int4 = new int[1] ;
      AV48Openom = "" ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new byte[1] ;
      AV26FasDsc = "" ;
      GXv_char3 = new String[1] ;
      P099U3_A396EmprCod = new String[] {""} ;
      P099U3_A652OpeCod = new int[1] ;
      P099U3_A653OpeNom = new String[] {""} ;
      P099U3_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      AV66vHorMin = "" ;
      AV67vHorMinP = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionporoperario__default(),
         new Object[] {
             new Object[] {
            P099U2_A396EmprCod, P099U2_A136BarColNum, P099U2_A135BarColNom, P099U2_A212BarSer, P099U2_A1011TipMaqCod, P099U2_n1011TipMaqCod, P099U2_A602MaqCod, P099U2_A1525HisProKgr, P099U2_A1526HisProMtr, P099U2_A461Fase,
            P099U2_A3610HisProLot, P099U2_A656ParCod, P099U2_n656ParCod, P099U2_A556HisProEst, P099U2_A503GruOpeCod, P099U2_A606MaqDsc, P099U2_n606MaqDsc, P099U2_A194BarOrdLin, P099U2_A566HisProTur, P099U2_A560HisProHin,
            P099U2_A563HisProMin, P099U2_A559HisProHfi, P099U2_A562HisProMfi, P099U2_A867ParCodNom, P099U2_n867ParCodNom, P099U2_A130BarCodPar, P099U2_A132BarCodReo, P099U2_A129BarCod, P099U2_A561HisProLin, P099U2_A558HisProFec,
            P099U2_A4440HisProDTI, P099U2_n4440HisProDTI, P099U2_A4441HisProDTF, P099U2_n4441HisProDTF
            }
            , new Object[] {
            P099U3_A396EmprCod, P099U3_A652OpeCod, P099U3_A653OpeNom, P099U3_n653OpeNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A556HisProEst ;
   private byte A566HisProTur ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A132BarCodReo ;
   private byte AV28FlagImp ;
   private byte AV29FlagMarca ;
   private byte AV27Flag ;
   private byte GXv_int5[] ;
   private byte AV45MinRea ;
   private byte AV44MinPar ;
   private short A656ParCod ;
   private short A194BarOrdLin ;
   private short A5605HisProTr2 ;
   private short AV36HisProTr2 ;
   private short AV42HorReaint ;
   private short AV40HorParint ;
   private short Gx_err ;
   private int AV51Poper ;
   private int AV65Uoper ;
   private int AV20Barcolnumi ;
   private int AV19Barcolnumf ;
   private int AV11Random ;
   private int A136BarColNum ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV59TotRea ;
   private int AV58TotPar ;
   private int GXv_int4[] ;
   private int A652OpeCod ;
   private long AV12CellRow ;
   private long AV13CellCol ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV56TotKgs ;
   private java.math.BigDecimal AV57TotMts ;
   private String A396EmprCod ;
   private String AV50Pmaq ;
   private String AV64Umaq ;
   private String AV53TipMaqcod ;
   private String AV16ArtCodi ;
   private String AV15ArtCodf ;
   private String AV18Barcolnomi ;
   private String AV17Barcolnomf ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1011TipMaqCod ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String AV24FasActTin ;
   private String AV35Hisprolot ;
   private String AV32Hdr ;
   private String AV48Openom ;
   private String GXv_char2[] ;
   private String AV26FasDsc ;
   private String GXv_char3[] ;
   private String A653OpeNom ;
   private String AV66vHorMin ;
   private String AV67vHorMinP ;
   private java.util.Date AV34hISPRODTI ;
   private java.util.Date AV33Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk99U2 ;
   private boolean n1011TipMaqCod ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n653OpeNom ;
   private String AV9Filename ;
   private String AV10ErrorMessage ;
   private String[] aP15 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private int[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P099U2_A396EmprCod ;
   private int[] P099U2_A136BarColNum ;
   private String[] P099U2_A135BarColNom ;
   private String[] P099U2_A212BarSer ;
   private String[] P099U2_A1011TipMaqCod ;
   private boolean[] P099U2_n1011TipMaqCod ;
   private String[] P099U2_A602MaqCod ;
   private java.math.BigDecimal[] P099U2_A1525HisProKgr ;
   private java.math.BigDecimal[] P099U2_A1526HisProMtr ;
   private String[] P099U2_A461Fase ;
   private String[] P099U2_A3610HisProLot ;
   private short[] P099U2_A656ParCod ;
   private boolean[] P099U2_n656ParCod ;
   private byte[] P099U2_A556HisProEst ;
   private int[] P099U2_A503GruOpeCod ;
   private String[] P099U2_A606MaqDsc ;
   private boolean[] P099U2_n606MaqDsc ;
   private short[] P099U2_A194BarOrdLin ;
   private byte[] P099U2_A566HisProTur ;
   private byte[] P099U2_A560HisProHin ;
   private byte[] P099U2_A563HisProMin ;
   private byte[] P099U2_A559HisProHfi ;
   private byte[] P099U2_A562HisProMfi ;
   private String[] P099U2_A867ParCodNom ;
   private boolean[] P099U2_n867ParCodNom ;
   private String[] P099U2_A130BarCodPar ;
   private byte[] P099U2_A132BarCodReo ;
   private int[] P099U2_A129BarCod ;
   private int[] P099U2_A561HisProLin ;
   private java.util.Date[] P099U2_A558HisProFec ;
   private java.util.Date[] P099U2_A4440HisProDTI ;
   private boolean[] P099U2_n4440HisProDTI ;
   private java.util.Date[] P099U2_A4441HisProDTF ;
   private boolean[] P099U2_n4441HisProDTF ;
   private String[] P099U3_A396EmprCod ;
   private int[] P099U3_A652OpeCod ;
   private String[] P099U3_A653OpeNom ;
   private boolean[] P099U3_n653OpeNom ;
   private com.genexus.gxoffice.ExcelDoc AV8ExcelDocument ;
}

final  class informeproduccionporoperario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099U2", "SELECT T1.EmprCod, T4.BarColNum, T4.BarColNom, T4.BarSer, T2.TipMaqCod, T1.MaqCod, T1.HisProKgr, T1.HisProMtr, T1.Fase, T1.HisProLot, T1.ParCod, T1.HisProEst, T1.GruOpeCod, T2.MaqDsc, T1.BarOrdLin, T1.HisProTur, T1.HisProHin, T1.HisProMin, T1.HisProHfi, T1.HisProMfi, T3.ParCodNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLin, T1.HisProFec, T1.HisProDTI, T1.HisProDTF FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE (T1.GruOpeCod >= ?) AND (T1.EmprCod = ?) AND (T1.HisProDTF >= ?) AND (T1.MaqCod >= ? and T1.MaqCod <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T4.BarSer >= ? and T4.BarSer <= ?) AND (T4.BarColNom >= ? and T4.BarColNom <= ?) AND (T4.BarColNum >= ? and T4.BarColNum <= ?) AND (T1.GruOpeCod <= ?) ORDER BY T1.GruOpeCod, T1.HisProFec, T1.HisProLin, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099U3", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((int[]) buf[28])[0] = rslt.getInt(25);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

