package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rccestdet_export extends GXProcedure
{
   public rccestdet_export( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rccestdet_export.class ), "" );
   }

   public rccestdet_export( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 ,
                             String[] aP22 )
   {
      rccestdet_export.this.aP23 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
      return aP23[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        int[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        int[] aP20 ,
                        int[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 )
   {
      rccestdet_export.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rccestdet_export.this.AV13BarIni = aP1[0];
      this.aP1 = aP1;
      rccestdet_export.this.AV12BarFin = aP2[0];
      this.aP2 = aP2;
      rccestdet_export.this.AV38ReoIni = aP3[0];
      this.aP3 = aP3;
      rccestdet_export.this.AV37ReoFin = aP4[0];
      this.aP4 = aP4;
      rccestdet_export.this.AV35ParIni = aP5[0];
      this.aP5 = aP5;
      rccestdet_export.this.AV34ParFin = aP6[0];
      this.aP6 = aP6;
      rccestdet_export.this.AV22CliIni = aP7[0];
      this.aP7 = aP7;
      rccestdet_export.this.AV21CliFin = aP8[0];
      this.aP8 = aP8;
      rccestdet_export.this.AV18CCTIni = aP9[0];
      this.aP9 = aP9;
      rccestdet_export.this.AV17CCTFin = aP10[0];
      this.aP10 = aP10;
      rccestdet_export.this.AV27FchIni = aP11[0];
      this.aP11 = aP11;
      rccestdet_export.this.AV26FchFin = aP12[0];
      this.aP12 = aP12;
      rccestdet_export.this.AV31NivIni = aP13[0];
      this.aP13 = aP13;
      rccestdet_export.this.AV30NivFin = aP14[0];
      this.aP14 = aP14;
      rccestdet_export.this.AV39TipoCtr = aP15[0];
      this.aP15 = aP15;
      rccestdet_export.this.AV15Barseri = aP16[0];
      this.aP16 = aP16;
      rccestdet_export.this.AV14barserf = aP17[0];
      this.aP17 = aP17;
      rccestdet_export.this.AV8Barcolnom = aP18[0];
      this.aP18 = aP18;
      rccestdet_export.this.AV9Barcolnomf = aP19[0];
      this.aP19 = aP19;
      rccestdet_export.this.AV10Barcolnum = aP20[0];
      this.aP20 = aP20;
      rccestdet_export.this.AV11Barcolnumf = aP21[0];
      this.aP21 = aP21;
      rccestdet_export.this.aP22 = aP22;
      rccestdet_export.this.aP23 = aP23;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S151 ();
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
      AV20CellRow = 3 ;
      /* Execute user subroutine: 'WRITEDATA' */
      S121 ();
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
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV20CellRow = 2 ;
      AV19CellCol = 1 ;
      while ( AV19CellCol <= 50 )
      {
         AV24ExcelDocument.Cells(AV20CellRow, AV19CellCol, 1, 1).setBold( (short)(1) );
         AV24ExcelDocument.Cells(AV20CellRow, AV19CellCol, 1, 1).setColor( 11 );
         AV19CellCol = (int)(AV19CellCol+1) ;
      }
      AV24ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV24ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV24ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV24ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV24ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV24ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV24ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
      AV24ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV24ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV24ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Codigo Htd", "") );
      AV24ExcelDocument.Cells(2, 11, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV24ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Operario", "") );
      AV24ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV24ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV24ExcelDocument.Cells(2, 15, 1, 1).setText( "#" );
      AV24ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV24ExcelDocument.Cells(2, 17, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV24ExcelDocument.Cells(2, 18, 1, 1).setText( httpContext.getMessage( "Obs", "") );
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      /* Using cursor P0ANM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarIni), Integer.valueOf(AV13BarIni), Integer.valueOf(AV12BarFin), Integer.valueOf(AV12BarFin), Byte.valueOf(AV38ReoIni), Byte.valueOf(AV38ReoIni), Byte.valueOf(AV37ReoFin), Byte.valueOf(AV37ReoFin), AV35ParIni, AV35ParIni, AV34ParFin, AV34ParFin, Integer.valueOf(AV22CliIni), Integer.valueOf(AV22CliIni), Integer.valueOf(AV21CliFin), Integer.valueOf(AV21CliFin), AV15Barseri, AV15Barseri, AV14barserf, AV14barserf, AV8Barcolnom, AV8Barcolnom, AV9Barcolnomf, AV9Barcolnomf, Integer.valueOf(AV10Barcolnum), Integer.valueOf(AV10Barcolnum), Integer.valueOf(AV11Barcolnumf), Integer.valueOf(AV11Barcolnumf), Integer.valueOf(AV18CCTIni), Integer.valueOf(AV18CCTIni), Integer.valueOf(AV17CCTFin), Integer.valueOf(AV17CCTFin), AV27FchIni, AV27FchIni, AV26FchFin, AV26FchFin, AV39TipoCtr});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4037CCTTpoCtr = P0ANM2_A4037CCTTpoCtr[0] ;
         A194BarOrdLin = P0ANM2_A194BarOrdLin[0] ;
         A252CliCod = P0ANM2_A252CliCod[0] ;
         n252CliCod = P0ANM2_n252CliCod[0] ;
         A457FasCod = P0ANM2_A457FasCod[0] ;
         A4032CCOpeCod = P0ANM2_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P0ANM2_n4032CCOpeCod[0] ;
         A3281CcObs = P0ANM2_A3281CcObs[0] ;
         n3281CcObs = P0ANM2_n3281CcObs[0] ;
         A279CliNom = P0ANM2_A279CliNom[0] ;
         A212BarSer = P0ANM2_A212BarSer[0] ;
         A1652BarSerDsc = P0ANM2_A1652BarSerDsc[0] ;
         A135BarColNom = P0ANM2_A135BarColNom[0] ;
         A136BarColNum = P0ANM2_A136BarColNum[0] ;
         A4036CCTDsc = P0ANM2_A4036CCTDsc[0] ;
         A4033CCFch = P0ANM2_A4033CCFch[0] ;
         n4033CCFch = P0ANM2_n4033CCFch[0] ;
         A4031CCTCod = P0ANM2_A4031CCTCod[0] ;
         A758ProCod = P0ANM2_A758ProCod[0] ;
         A130BarCodPar = P0ANM2_A130BarCodPar[0] ;
         A132BarCodReo = P0ANM2_A132BarCodReo[0] ;
         A129BarCod = P0ANM2_A129BarCod[0] ;
         A252CliCod = P0ANM2_A252CliCod[0] ;
         n252CliCod = P0ANM2_n252CliCod[0] ;
         A212BarSer = P0ANM2_A212BarSer[0] ;
         A1652BarSerDsc = P0ANM2_A1652BarSerDsc[0] ;
         A135BarColNom = P0ANM2_A135BarColNom[0] ;
         A136BarColNum = P0ANM2_A136BarColNum[0] ;
         A457FasCod = P0ANM2_A457FasCod[0] ;
         A279CliNom = P0ANM2_A279CliNom[0] ;
         A4037CCTTpoCtr = P0ANM2_A4037CCTTpoCtr[0] ;
         A4036CCTDsc = P0ANM2_A4036CCTDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV16Ccobs = A3281CcObs ;
         /* Using cursor P0ANM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV22CliIni), Integer.valueOf(AV22CliIni), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV21CliFin), Integer.valueOf(AV21CliFin), A212BarSer, AV15Barseri, AV15Barseri, A212BarSer, AV14barserf, AV14barserf, A135BarColNom, AV8Barcolnom, AV8Barcolnom, A135BarColNom, AV9Barcolnomf, AV9Barcolnomf, Integer.valueOf(A136BarColNum), Integer.valueOf(AV10Barcolnum), Integer.valueOf(AV10Barcolnum), Integer.valueOf(A136BarColNum), Integer.valueOf(AV11Barcolnumf), Integer.valueOf(AV11Barcolnumf), AV31NivIni, AV31NivIni, AV30NivFin, AV30NivFin, AV39TipoCtr});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4037CCTTpoCtr = P0ANM3_A4037CCTTpoCtr[0] ;
            A4043CCTLinDsc = P0ANM3_A4043CCTLinDsc[0] ;
            A4035CCVal = P0ANM3_A4035CCVal[0] ;
            A4034CCTLin = P0ANM3_A4034CCTLin[0] ;
            A4037CCTTpoCtr = P0ANM3_A4037CCTTpoCtr[0] ;
            A4043CCTLinDsc = P0ANM3_A4043CCTLinDsc[0] ;
            AV29Forrgb = 0 ;
            GXv_char1[0] = AV25fasdsc ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A457FasCod, GXv_char1) ;
            rccestdet_export.this.AV25fasdsc = GXv_char1[0] ;
            GXv_char1[0] = AV33Openom ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A4032CCOpeCod, GXv_char1) ;
            rccestdet_export.this.AV33Openom = GXv_char1[0] ;
            AV40Nlin = (short)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
            AV32obs = GXutil.gxgetmli( A3281CcObs, (short)(1), (short)(100)) ;
            AV24ExcelDocument.Cells(AV20CellRow, 1, 1, 1).setText( A13696BarNHdr );
            AV24ExcelDocument.Cells(AV20CellRow, 2, 1, 1).setText( A279CliNom );
            AV24ExcelDocument.Cells(AV20CellRow, 3, 1, 1).setText( A212BarSer );
            AV24ExcelDocument.Cells(AV20CellRow, 4, 1, 1).setText( A1652BarSerDsc );
            AV24ExcelDocument.Cells(AV20CellRow, 5, 1, 1).setText( A135BarColNom );
            AV24ExcelDocument.Cells(AV20CellRow, 6, 1, 1).setNumber( A136BarColNum );
            AV24ExcelDocument.Cells(AV20CellRow, 7, 1, 1).setText( A758ProCod );
            AV24ExcelDocument.Cells(AV20CellRow, 8, 1, 1).setText( A457FasCod );
            AV24ExcelDocument.Cells(AV20CellRow, 9, 1, 1).setText( AV25fasdsc );
            AV24ExcelDocument.Cells(AV20CellRow, 10, 1, 1).setNumber( A4031CCTCod );
            AV24ExcelDocument.Cells(AV20CellRow, 11, 1, 1).setText( A4036CCTDsc );
            AV24ExcelDocument.Cells(AV20CellRow, 12, 1, 1).setNumber( A4032CCOpeCod );
            AV24ExcelDocument.Cells(AV20CellRow, 13, 1, 1).setText( AV33Openom );
            GXt_dtime2 = GXutil.resetTime( A4033CCFch );
            AV24ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV24ExcelDocument.Cells(AV20CellRow, 14, 1, 1).setDate( GXt_dtime2 );
            AV24ExcelDocument.Cells(AV20CellRow, 15, 1, 1).setNumber( A4034CCTLin );
            AV24ExcelDocument.Cells(AV20CellRow, 16, 1, 1).setText( A4043CCTLinDsc );
            AV24ExcelDocument.Cells(AV20CellRow, 17, 1, 1).setText( A4035CCVal );
            AV24ExcelDocument.Cells(AV20CellRow, 18, 1, 1).setText( AV32obs );
            AV20CellRow = (int)(AV20CellRow+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV24ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV24ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV36Random = (int)(GXutil.random( )*10000) ;
      AV28Filename = "Estadisticas_Export-" + GXutil.trim( GXutil.str( AV36Random, 8, 0)) + ".xlsx" ;
      AV24ExcelDocument.Open(AV28Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV24ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV24ExcelDocument.getErrCode() != 0 )
      {
         AV28Filename = "" ;
         AV23ErrorMessage = AV24ExcelDocument.getErrDescription() ;
         AV24ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = rccestdet_export.this.A396EmprCod;
      this.aP1[0] = rccestdet_export.this.AV13BarIni;
      this.aP2[0] = rccestdet_export.this.AV12BarFin;
      this.aP3[0] = rccestdet_export.this.AV38ReoIni;
      this.aP4[0] = rccestdet_export.this.AV37ReoFin;
      this.aP5[0] = rccestdet_export.this.AV35ParIni;
      this.aP6[0] = rccestdet_export.this.AV34ParFin;
      this.aP7[0] = rccestdet_export.this.AV22CliIni;
      this.aP8[0] = rccestdet_export.this.AV21CliFin;
      this.aP9[0] = rccestdet_export.this.AV18CCTIni;
      this.aP10[0] = rccestdet_export.this.AV17CCTFin;
      this.aP11[0] = rccestdet_export.this.AV27FchIni;
      this.aP12[0] = rccestdet_export.this.AV26FchFin;
      this.aP13[0] = rccestdet_export.this.AV31NivIni;
      this.aP14[0] = rccestdet_export.this.AV30NivFin;
      this.aP15[0] = rccestdet_export.this.AV39TipoCtr;
      this.aP16[0] = rccestdet_export.this.AV15Barseri;
      this.aP17[0] = rccestdet_export.this.AV14barserf;
      this.aP18[0] = rccestdet_export.this.AV8Barcolnom;
      this.aP19[0] = rccestdet_export.this.AV9Barcolnomf;
      this.aP20[0] = rccestdet_export.this.AV10Barcolnum;
      this.aP21[0] = rccestdet_export.this.AV11Barcolnumf;
      this.aP22[0] = rccestdet_export.this.AV28Filename;
      this.aP23[0] = rccestdet_export.this.AV23ErrorMessage;
      CloseOpenCursors();
      AV24ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Filename = "" ;
      AV23ErrorMessage = "" ;
      AV24ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0ANM2_A396EmprCod = new String[] {""} ;
      P0ANM2_A4037CCTTpoCtr = new String[] {""} ;
      P0ANM2_A194BarOrdLin = new short[1] ;
      P0ANM2_A252CliCod = new int[1] ;
      P0ANM2_n252CliCod = new boolean[] {false} ;
      P0ANM2_A457FasCod = new String[] {""} ;
      P0ANM2_A4032CCOpeCod = new int[1] ;
      P0ANM2_n4032CCOpeCod = new boolean[] {false} ;
      P0ANM2_A3281CcObs = new String[] {""} ;
      P0ANM2_n3281CcObs = new boolean[] {false} ;
      P0ANM2_A279CliNom = new String[] {""} ;
      P0ANM2_A212BarSer = new String[] {""} ;
      P0ANM2_A1652BarSerDsc = new String[] {""} ;
      P0ANM2_A135BarColNom = new String[] {""} ;
      P0ANM2_A136BarColNum = new int[1] ;
      P0ANM2_A4036CCTDsc = new String[] {""} ;
      P0ANM2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0ANM2_n4033CCFch = new boolean[] {false} ;
      P0ANM2_A4031CCTCod = new int[1] ;
      P0ANM2_A758ProCod = new String[] {""} ;
      P0ANM2_A130BarCodPar = new String[] {""} ;
      P0ANM2_A132BarCodReo = new byte[1] ;
      P0ANM2_A129BarCod = new int[1] ;
      A4037CCTTpoCtr = "" ;
      A457FasCod = "" ;
      A3281CcObs = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A4036CCTDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV16Ccobs = "" ;
      P0ANM3_A396EmprCod = new String[] {""} ;
      P0ANM3_A129BarCod = new int[1] ;
      P0ANM3_A132BarCodReo = new byte[1] ;
      P0ANM3_A130BarCodPar = new String[] {""} ;
      P0ANM3_A758ProCod = new String[] {""} ;
      P0ANM3_A194BarOrdLin = new short[1] ;
      P0ANM3_A4031CCTCod = new int[1] ;
      P0ANM3_A4037CCTTpoCtr = new String[] {""} ;
      P0ANM3_A4043CCTLinDsc = new String[] {""} ;
      P0ANM3_A4035CCVal = new String[] {""} ;
      P0ANM3_A4034CCTLin = new short[1] ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      AV25fasdsc = "" ;
      AV33Openom = "" ;
      GXv_char1 = new String[1] ;
      AV32obs = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.rccestdet_export__default(),
         new Object[] {
             new Object[] {
            P0ANM2_A396EmprCod, P0ANM2_A4037CCTTpoCtr, P0ANM2_A194BarOrdLin, P0ANM2_A252CliCod, P0ANM2_n252CliCod, P0ANM2_A457FasCod, P0ANM2_A4032CCOpeCod, P0ANM2_n4032CCOpeCod, P0ANM2_A3281CcObs, P0ANM2_n3281CcObs,
            P0ANM2_A279CliNom, P0ANM2_A212BarSer, P0ANM2_A1652BarSerDsc, P0ANM2_A135BarColNom, P0ANM2_A136BarColNum, P0ANM2_A4036CCTDsc, P0ANM2_A4033CCFch, P0ANM2_n4033CCFch, P0ANM2_A4031CCTCod, P0ANM2_A758ProCod,
            P0ANM2_A130BarCodPar, P0ANM2_A132BarCodReo, P0ANM2_A129BarCod
            }
            , new Object[] {
            P0ANM3_A396EmprCod, P0ANM3_A129BarCod, P0ANM3_A132BarCodReo, P0ANM3_A130BarCodPar, P0ANM3_A758ProCod, P0ANM3_A194BarOrdLin, P0ANM3_A4031CCTCod, P0ANM3_A4037CCTTpoCtr, P0ANM3_A4043CCTLinDsc, P0ANM3_A4035CCVal,
            P0ANM3_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38ReoIni ;
   private byte AV37ReoFin ;
   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short AV40Nlin ;
   private short Gx_err ;
   private int AV13BarIni ;
   private int AV12BarFin ;
   private int AV22CliIni ;
   private int AV21CliFin ;
   private int AV18CCTIni ;
   private int AV17CCTFin ;
   private int AV10Barcolnum ;
   private int AV11Barcolnumf ;
   private int AV20CellRow ;
   private int AV19CellCol ;
   private int A252CliCod ;
   private int A4032CCOpeCod ;
   private int A136BarColNum ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private int AV36Random ;
   private long AV29Forrgb ;
   private String A396EmprCod ;
   private String AV35ParIni ;
   private String AV34ParFin ;
   private String AV31NivIni ;
   private String AV30NivFin ;
   private String AV39TipoCtr ;
   private String AV15Barseri ;
   private String AV14barserf ;
   private String AV8Barcolnom ;
   private String AV9Barcolnomf ;
   private String scmdbuf ;
   private String A4037CCTTpoCtr ;
   private String A457FasCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A4036CCTDsc ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A4043CCTLinDsc ;
   private String A4035CCVal ;
   private String AV25fasdsc ;
   private String AV33Openom ;
   private String GXv_char1[] ;
   private String AV32obs ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV27FchIni ;
   private java.util.Date AV26FchFin ;
   private java.util.Date A4033CCFch ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n4032CCOpeCod ;
   private boolean n3281CcObs ;
   private boolean n4033CCFch ;
   private String AV28Filename ;
   private String AV23ErrorMessage ;
   private String A3281CcObs ;
   private String AV16Ccobs ;
   private String[] aP23 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private int[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private int[] aP20 ;
   private int[] aP21 ;
   private String[] aP22 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANM2_A396EmprCod ;
   private String[] P0ANM2_A4037CCTTpoCtr ;
   private short[] P0ANM2_A194BarOrdLin ;
   private int[] P0ANM2_A252CliCod ;
   private boolean[] P0ANM2_n252CliCod ;
   private String[] P0ANM2_A457FasCod ;
   private int[] P0ANM2_A4032CCOpeCod ;
   private boolean[] P0ANM2_n4032CCOpeCod ;
   private String[] P0ANM2_A3281CcObs ;
   private boolean[] P0ANM2_n3281CcObs ;
   private String[] P0ANM2_A279CliNom ;
   private String[] P0ANM2_A212BarSer ;
   private String[] P0ANM2_A1652BarSerDsc ;
   private String[] P0ANM2_A135BarColNom ;
   private int[] P0ANM2_A136BarColNum ;
   private String[] P0ANM2_A4036CCTDsc ;
   private java.util.Date[] P0ANM2_A4033CCFch ;
   private boolean[] P0ANM2_n4033CCFch ;
   private int[] P0ANM2_A4031CCTCod ;
   private String[] P0ANM2_A758ProCod ;
   private String[] P0ANM2_A130BarCodPar ;
   private byte[] P0ANM2_A132BarCodReo ;
   private int[] P0ANM2_A129BarCod ;
   private String[] P0ANM3_A396EmprCod ;
   private int[] P0ANM3_A129BarCod ;
   private byte[] P0ANM3_A132BarCodReo ;
   private String[] P0ANM3_A130BarCodPar ;
   private String[] P0ANM3_A758ProCod ;
   private short[] P0ANM3_A194BarOrdLin ;
   private int[] P0ANM3_A4031CCTCod ;
   private String[] P0ANM3_A4037CCTTpoCtr ;
   private String[] P0ANM3_A4043CCTLinDsc ;
   private String[] P0ANM3_A4035CCVal ;
   private short[] P0ANM3_A4034CCTLin ;
   private com.genexus.gxoffice.ExcelDoc AV24ExcelDocument ;
}

final  class rccestdet_export__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANM2", "SELECT T1.EmprCod, T5.CCTTpoCtr, T1.BarOrdLin, T2.CliCod, T3.FasCod, T1.CCOpeCod, T1.CcObs, T4.CliNom, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T5.CCTDsc, T1.CCFch, T1.CCTCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod) INNER JOIN TXPBARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod AND T3.BarOrdLin = T1.BarOrdLin) INNER JOIN TXPCCDef T5 ON T5.EmprCod = T1.EmprCod AND T5.CCTCod = T1.CCTCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod >= ? or ( (? = 0))) AND (T1.BarCod <= ? or ( (? = 0))) AND (T1.BarCodReo >= ? or ( (? = 0))) AND (T1.BarCodReo <= ? or ( (? = 0))) AND (T1.BarCodPar >= ? or ( (rtrim(?) IS NULL))) AND (T1.BarCodPar <= ? or ( (rtrim(?) IS NULL))) AND (T2.CliCod >= ? or ( (? = 0))) AND (T2.CliCod <= ? or ( (? = 0))) AND (T2.BarSer >= ? or (rtrim(?) IS NULL)) AND (T2.BarSer <= ? or (rtrim(?) IS NULL)) AND (T2.BarColNom >= ? or (rtrim(?) IS NULL)) AND (T2.BarColNom <= ? or (rtrim(?) IS NULL)) AND (T2.BarColNum >= ? or (? = 0)) AND (T2.BarColNum <= ? or (? = 0)) AND (T1.CCTCod >= ? or ( (? = 0))) AND (T1.CCTCod <= ? or ( (? = 0))) AND (T1.CCFch >= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T1.CCFch <= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T5.CCTTpoCtr = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ANM3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T2.CCTTpoCtr, T3.CCTLinDsc, T1.CCVal, T1.CCTLin FROM ((TXPCC1 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (? >= ? or ( (? = 0))) AND (? <= ? or ( (? = 0))) AND (? >= ? or (rtrim(?) IS NULL)) AND (? <= ? or (rtrim(?) IS NULL)) AND (? >= ? or (rtrim(?) IS NULL)) AND (? <= ? or (rtrim(?) IS NULL)) AND (? >= ? or (? = 0)) AND (? <= ? or (? = 0)) AND (RTRIM(LTRIM(T1.CCVal)) >= ? or ( (rtrim(?) IS NULL))) AND (RTRIM(LTRIM(T1.CCVal)) <= ? or ( (rtrim(?) IS NULL))) AND (T2.CCTTpoCtr = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 13);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 8);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((int[]) buf[22])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((short[]) buf[10])[0] = rslt.getShort(11);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setString(20, (String)parms[19], 16);
               stmt.setString(21, (String)parms[20], 16);
               stmt.setString(22, (String)parms[21], 13);
               stmt.setString(23, (String)parms[22], 13);
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 13);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setDate(34, (java.util.Date)parms[33]);
               stmt.setDate(35, (java.util.Date)parms[34]);
               stmt.setDate(36, (java.util.Date)parms[35]);
               stmt.setDate(37, (java.util.Date)parms[36]);
               stmt.setString(38, (String)parms[37], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[12]).intValue());
               }
               stmt.setInt(12, ((Number) parms[13]).intValue());
               stmt.setInt(13, ((Number) parms[14]).intValue());
               stmt.setString(14, (String)parms[15], 16);
               stmt.setString(15, (String)parms[16], 16);
               stmt.setString(16, (String)parms[17], 16);
               stmt.setString(17, (String)parms[18], 16);
               stmt.setString(18, (String)parms[19], 16);
               stmt.setString(19, (String)parms[20], 16);
               stmt.setString(20, (String)parms[21], 13);
               stmt.setString(21, (String)parms[22], 13);
               stmt.setString(22, (String)parms[23], 13);
               stmt.setString(23, (String)parms[24], 13);
               stmt.setString(24, (String)parms[25], 13);
               stmt.setString(25, (String)parms[26], 13);
               stmt.setInt(26, ((Number) parms[27]).intValue());
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setInt(28, ((Number) parms[29]).intValue());
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setInt(31, ((Number) parms[32]).intValue());
               stmt.setString(32, (String)parms[33], 1);
               stmt.setString(33, (String)parms[34], 1);
               stmt.setString(34, (String)parms[35], 1);
               stmt.setString(35, (String)parms[36], 1);
               stmt.setString(36, (String)parms[37], 1);
               return;
      }
   }

}

