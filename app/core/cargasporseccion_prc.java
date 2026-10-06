package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasporseccion_prc extends GXProcedure
{
   public cargasporseccion_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasporseccion_prc.class ), "" );
   }

   public cargasporseccion_prc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      cargasporseccion_prc.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      cargasporseccion_prc.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      cargasporseccion_prc.this.AV10MaqcodInout = aP1[0];
      this.aP1 = aP1;
      cargasporseccion_prc.this.AV13Tipo = aP2[0];
      this.aP2 = aP2;
      cargasporseccion_prc.this.AV9FasesToJson = aP3[0];
      this.aP3 = aP3;
      cargasporseccion_prc.this.aP4 = aP4;
      cargasporseccion_prc.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11FasesColeccion.fromJSonString(AV9FasesToJson, null);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22CellColumn = 1 ;
      while ( AV22CellColumn <= 22 )
      {
         AV18ExcelDocument.Cells(1, AV22CellColumn, 1, 1).setBold( (short)(1) );
         AV18ExcelDocument.Cells(1, AV22CellColumn, 1, 1).setColor( 11 );
         AV22CellColumn = (int)(AV22CellColumn+1) ;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21CellRow = 2 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A457FasCod ,
                                           AV11FasesColeccion ,
                                           Byte.valueOf(A213BarSit) ,
                                           A603MaqCodBis ,
                                           AV10MaqcodInout ,
                                           Integer.valueOf(AV11FasesColeccion.size()) ,
                                           AV8Emprcod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A153BarFasEst) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV10MaqcodInout = GXutil.padr( GXutil.rtrim( AV10MaqcodInout), 6, "%") ;
      /* Using cursor P09879 */
      pr_default.execute(0, new Object[] {AV8Emprcod, lV10MaqcodInout, Integer.valueOf(AV11FasesColeccion.size())});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09879_A252CliCod[0] ;
         n252CliCod = P09879_n252CliCod[0] ;
         A153BarFasEst = P09879_A153BarFasEst[0] ;
         A457FasCod = P09879_A457FasCod[0] ;
         A603MaqCodBis = P09879_A603MaqCodBis[0] ;
         A213BarSit = P09879_A213BarSit[0] ;
         A194BarOrdLin = P09879_A194BarOrdLin[0] ;
         A279CliNom = P09879_A279CliNom[0] ;
         A155BarFecCli = P09879_A155BarFecCli[0] ;
         A158BarFecFpr = P09879_A158BarFecFpr[0] ;
         A159BarFecGen = P09879_A159BarFecGen[0] ;
         A212BarSer = P09879_A212BarSer[0] ;
         A1652BarSerDsc = P09879_A1652BarSerDsc[0] ;
         A135BarColNom = P09879_A135BarColNom[0] ;
         A136BarColNum = P09879_A136BarColNum[0] ;
         A218BarTipCol = P09879_A218BarTipCol[0] ;
         A460FasDsc = P09879_A460FasDsc[0] ;
         A184BarMtr = P09879_A184BarMtr[0] ;
         A166BarKgm = P09879_A166BarKgm[0] ;
         A151BarFasCod = P09879_A151BarFasCod[0] ;
         n151BarFasCod = P09879_n151BarFasCod[0] ;
         A156BarFecCum = P09879_A156BarFecCum[0] ;
         n156BarFecCum = P09879_n156BarFecCum[0] ;
         A199BarPie1 = P09879_A199BarPie1[0] ;
         A365DisDes = P09879_A365DisDes[0] ;
         A898BarPieNDes = P09879_A898BarPieNDes[0] ;
         A130BarCodPar = P09879_A130BarCodPar[0] ;
         A132BarCodReo = P09879_A132BarCodReo[0] ;
         A129BarCod = P09879_A129BarCod[0] ;
         A143BarDisNum = P09879_A143BarDisNum[0] ;
         A4812BarEncCli = P09879_A4812BarEncCli[0] ;
         A396EmprCod = P09879_A396EmprCod[0] ;
         A758ProCod = P09879_A758ProCod[0] ;
         A460FasDsc = P09879_A460FasDsc[0] ;
         A252CliCod = P09879_A252CliCod[0] ;
         n252CliCod = P09879_n252CliCod[0] ;
         A213BarSit = P09879_A213BarSit[0] ;
         A155BarFecCli = P09879_A155BarFecCli[0] ;
         A158BarFecFpr = P09879_A158BarFecFpr[0] ;
         A159BarFecGen = P09879_A159BarFecGen[0] ;
         A212BarSer = P09879_A212BarSer[0] ;
         A1652BarSerDsc = P09879_A1652BarSerDsc[0] ;
         A135BarColNom = P09879_A135BarColNom[0] ;
         A136BarColNum = P09879_A136BarColNum[0] ;
         A218BarTipCol = P09879_A218BarTipCol[0] ;
         A365DisDes = P09879_A365DisDes[0] ;
         A143BarDisNum = P09879_A143BarDisNum[0] ;
         A4812BarEncCli = P09879_A4812BarEncCli[0] ;
         A279CliNom = P09879_A279CliNom[0] ;
         A184BarMtr = P09879_A184BarMtr[0] ;
         A166BarKgm = P09879_A166BarKgm[0] ;
         A199BarPie1 = P09879_A199BarPie1[0] ;
         A898BarPieNDes = P09879_A898BarPieNDes[0] ;
         A151BarFasCod = P09879_A151BarFasCod[0] ;
         n151BarFasCod = P09879_n151BarFasCod[0] ;
         A156BarFecCum = P09879_A156BarFecCum[0] ;
         n156BarFecCum = P09879_n156BarFecCum[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         cargasporseccion_prc.this.A396EmprCod = GXv_char2[0] ;
         cargasporseccion_prc.this.A4812BarEncCli = GXv_char3[0] ;
         cargasporseccion_prc.this.A143BarDisNum = GXv_char4[0] ;
         cargasporseccion_prc.this.GXt_char1 = GXv_char5[0] ;
         A13878PedidoClie = GXt_char1 ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV14BarOrdAnt = (short)(A194BarOrdLin-100) ;
         if ( AV14BarOrdAnt > 0 )
         {
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A129BarCod ;
               GXv_int7[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_int8[0] = AV14BarOrdAnt ;
               GXv_int9[0] = (byte)(AV15FlagAnt) ;
               GXv_int10[0] = AV23Linea ;
               new app.pfasanti(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int7, GXv_char4, GXv_int8, GXv_int9, GXv_int10) ;
               cargasporseccion_prc.this.A396EmprCod = GXv_char5[0] ;
               cargasporseccion_prc.this.A129BarCod = GXv_int6[0] ;
               cargasporseccion_prc.this.A132BarCodReo = GXv_int7[0] ;
               cargasporseccion_prc.this.A130BarCodPar = GXv_char4[0] ;
               cargasporseccion_prc.this.AV14BarOrdAnt = GXv_int8[0] ;
               cargasporseccion_prc.this.AV15FlagAnt = GXv_int9[0] ;
               cargasporseccion_prc.this.AV23Linea = GXv_int10[0] ;
            }
            else
            {
               AV15FlagAnt = (short)(2) ;
            }
            GXv_char5[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int9[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int10[0] = A194BarOrdLin ;
            GXv_int7[0] = (byte)(AV16EstS) ;
            new app.prestof(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int9, GXv_char4, GXv_int10, GXv_int7) ;
            cargasporseccion_prc.this.A396EmprCod = GXv_char5[0] ;
            cargasporseccion_prc.this.A129BarCod = GXv_int6[0] ;
            cargasporseccion_prc.this.A132BarCodReo = GXv_int9[0] ;
            cargasporseccion_prc.this.A130BarCodPar = GXv_char4[0] ;
            cargasporseccion_prc.this.A194BarOrdLin = GXv_int10[0] ;
            cargasporseccion_prc.this.AV16EstS = GXv_int7[0] ;
            if ( AV16EstS > 0 )
            {
               AV15FlagAnt = (short)(0) ;
            }
         }
         else
         {
            AV15FlagAnt = (short)(2) ;
         }
         if ( AV15FlagAnt == 2 )
         {
            AV18ExcelDocument.Cells(AV21CellRow, 1, 1, 1).setText( A279CliNom );
            GXt_dtime11 = GXutil.resetTime( A155BarFecCli );
            AV18ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV18ExcelDocument.Cells(AV21CellRow, 2, 1, 1).setDate( GXt_dtime11 );
            AV18ExcelDocument.Cells(AV21CellRow, 3, 1, 1).setText( A13878PedidoClie );
            GXt_dtime11 = GXutil.resetTime( A158BarFecFpr );
            AV18ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV18ExcelDocument.Cells(AV21CellRow, 4, 1, 1).setDate( GXt_dtime11 );
            GXt_dtime11 = GXutil.resetTime( A159BarFecGen );
            AV18ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV18ExcelDocument.Cells(AV21CellRow, 5, 1, 1).setDate( GXt_dtime11 );
            AV18ExcelDocument.Cells(AV21CellRow, 6, 1, 1).setText( A13696BarNHdr );
            AV18ExcelDocument.Cells(AV21CellRow, 7, 1, 1).setText( A212BarSer );
            AV18ExcelDocument.Cells(AV21CellRow, 8, 1, 1).setText( A1652BarSerDsc );
            AV18ExcelDocument.Cells(AV21CellRow, 9, 1, 1).setText( A135BarColNom );
            AV18ExcelDocument.Cells(AV21CellRow, 10, 1, 1).setNumber( A136BarColNum );
            AV18ExcelDocument.Cells(AV21CellRow, 11, 1, 1).setNumber( A218BarTipCol );
            AV18ExcelDocument.Cells(AV21CellRow, 12, 1, 1).setText( A603MaqCodBis );
            AV18ExcelDocument.Cells(AV21CellRow, 13, 1, 1).setText( A457FasCod );
            AV18ExcelDocument.Cells(AV21CellRow, 14, 1, 1).setText( A460FasDsc );
            AV18ExcelDocument.Cells(AV21CellRow, 15, 1, 1).setText( ((A153BarFasEst==0) ? httpContext.getMessage( "Pendiente", "") : ((A153BarFasEst==1) ? httpContext.getMessage( "Inciada", "") : httpContext.getMessage( "Finalizada", ""))) );
            AV18ExcelDocument.Cells(AV21CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
            AV18ExcelDocument.Cells(AV21CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
            AV18ExcelDocument.Cells(AV21CellRow, 18, 1, 1).setNumber( A198BarPie );
            AV18ExcelDocument.Cells(AV21CellRow, 19, 1, 1).setText( A151BarFasCod );
            GXt_char1 = "" ;
            GXv_char5[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char5) ;
            cargasporseccion_prc.this.GXt_char1 = GXv_char5[0] ;
            AV18ExcelDocument.Cells(AV21CellRow, 20, 1, 1).setText( GXt_char1 );
            GXt_dtime11 = GXutil.resetTime( A156BarFecCum );
            AV18ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV18ExcelDocument.Cells(AV21CellRow, 21, 1, 1).setDate( GXt_dtime11 );
            AV18ExcelDocument.Cells(AV21CellRow, 22, 1, 1).setNumber( A213BarSit );
            AV21CellRow = (int)(AV21CellRow+1) ;
            AV27totk = AV27totk.add(A166BarKgm) ;
            AV25totm = AV25totm.add(A184BarMtr) ;
            AV26totp = (int)(AV26totp+A198BarPie) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25totm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27totk)==0) || ! (0==AV26totp) )
      {
         AV18ExcelDocument.Cells(AV21CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25totm)) );
         AV18ExcelDocument.Cells(AV21CellRow, 17, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27totk)) );
         AV18ExcelDocument.Cells(AV21CellRow, 18, 1, 1).setNumber( AV26totp );
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
      AV17Random = (int)(GXutil.random( )*10000) ;
      AV19Filename = "InformeProduccionCargaporSeccion-" + ((GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", ""))==0) ? httpContext.getMessage( "Directa", "") : httpContext.getMessage( "General", "")) + GXutil.trim( GXutil.str( AV17Random, 8, 0)) + ".xlsx" ;
      AV18ExcelDocument.Open(AV19Filename);
      AV18ExcelDocument.setAutoFit( (short)(0) );
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV18ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV18ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV18ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV18ExcelDocument.getErrCode() != 0 )
      {
         AV19Filename = "" ;
         AV20ErrorMessage = AV18ExcelDocument.getErrDescription() ;
         AV18ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV18ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV18ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Fecha Disp Cli", "") );
      AV18ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Pedido Cliente", "") );
      AV18ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Fecha Ent Prev", "") );
      AV18ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Fecha HDR", "") );
      AV18ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "HDR Nº", "") );
      AV18ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV18ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV18ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV18ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV18ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "TC", "") );
      AV18ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV18ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV18ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV18ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Estado", "") );
      AV18ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV18ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV18ExcelDocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV18ExcelDocument.Cells(1, 19, 1, 1).setText( httpContext.getMessage( "Ult Fase", "") );
      AV18ExcelDocument.Cells(1, 20, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV18ExcelDocument.Cells(1, 21, 1, 1).setText( httpContext.getMessage( "Fec Ult Fase", "") );
      AV18ExcelDocument.Cells(1, 22, 1, 1).setText( httpContext.getMessage( "St", "") );
   }

   protected void cleanup( )
   {
      this.aP0[0] = cargasporseccion_prc.this.AV8Emprcod;
      this.aP1[0] = cargasporseccion_prc.this.AV10MaqcodInout;
      this.aP2[0] = cargasporseccion_prc.this.AV13Tipo;
      this.aP3[0] = cargasporseccion_prc.this.AV9FasesToJson;
      this.aP4[0] = cargasporseccion_prc.this.AV19Filename;
      this.aP5[0] = cargasporseccion_prc.this.AV20ErrorMessage;
      CloseOpenCursors();
      AV18ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Filename = "" ;
      AV20ErrorMessage = "" ;
      AV11FasesColeccion = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      lV10MaqcodInout = "" ;
      scmdbuf = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A396EmprCod = "" ;
      P09879_A252CliCod = new int[1] ;
      P09879_n252CliCod = new boolean[] {false} ;
      P09879_A153BarFasEst = new byte[1] ;
      P09879_A457FasCod = new String[] {""} ;
      P09879_A603MaqCodBis = new String[] {""} ;
      P09879_A213BarSit = new byte[1] ;
      P09879_A194BarOrdLin = new short[1] ;
      P09879_A279CliNom = new String[] {""} ;
      P09879_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09879_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09879_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09879_A212BarSer = new String[] {""} ;
      P09879_A1652BarSerDsc = new String[] {""} ;
      P09879_A135BarColNom = new String[] {""} ;
      P09879_A136BarColNum = new int[1] ;
      P09879_A218BarTipCol = new byte[1] ;
      P09879_A460FasDsc = new String[] {""} ;
      P09879_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09879_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09879_A151BarFasCod = new String[] {""} ;
      P09879_n151BarFasCod = new boolean[] {false} ;
      P09879_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09879_n156BarFecCum = new boolean[] {false} ;
      P09879_A199BarPie1 = new short[1] ;
      P09879_A365DisDes = new String[] {""} ;
      P09879_A898BarPieNDes = new int[1] ;
      P09879_A130BarCodPar = new String[] {""} ;
      P09879_A132BarCodReo = new byte[1] ;
      P09879_A129BarCod = new int[1] ;
      P09879_A143BarDisNum = new String[] {""} ;
      P09879_A4812BarEncCli = new String[] {""} ;
      P09879_A396EmprCod = new String[] {""} ;
      P09879_A758ProCod = new String[] {""} ;
      A279CliNom = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A460FasDsc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A758ProCod = "" ;
      A13878PedidoClie = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      A13696BarNHdr = "" ;
      GXv_int8 = new short[1] ;
      GXv_int6 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV27totk = DecimalUtil.ZERO ;
      AV25totm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.cargasporseccion_prc__default(),
         new Object[] {
             new Object[] {
            P09879_A252CliCod, P09879_n252CliCod, P09879_A153BarFasEst, P09879_A457FasCod, P09879_A603MaqCodBis, P09879_A213BarSit, P09879_A194BarOrdLin, P09879_A279CliNom, P09879_A155BarFecCli, P09879_A158BarFecFpr,
            P09879_A159BarFecGen, P09879_A212BarSer, P09879_A1652BarSerDsc, P09879_A135BarColNom, P09879_A136BarColNum, P09879_A218BarTipCol, P09879_A460FasDsc, P09879_A184BarMtr, P09879_A166BarKgm, P09879_A151BarFasCod,
            P09879_n151BarFasCod, P09879_A156BarFecCum, P09879_n156BarFecCum, P09879_A199BarPie1, P09879_A365DisDes, P09879_A898BarPieNDes, P09879_A130BarCodPar, P09879_A132BarCodReo, P09879_A129BarCod, P09879_A143BarDisNum,
            P09879_A4812BarEncCli, P09879_A396EmprCod, P09879_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A153BarFasEst ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int9[] ;
   private byte GXv_int7[] ;
   private short A194BarOrdLin ;
   private short A199BarPie1 ;
   private short AV14BarOrdAnt ;
   private short GXv_int8[] ;
   private short AV15FlagAnt ;
   private short AV23Linea ;
   private short GXv_int10[] ;
   private short AV16EstS ;
   private short Gx_err ;
   private int AV22CellColumn ;
   private int AV21CellRow ;
   private int AV11FasesColeccion_size ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int GXv_int6[] ;
   private int AV26totp ;
   private int AV17Random ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV27totk ;
   private java.math.BigDecimal AV25totm ;
   private String AV8Emprcod ;
   private String AV10MaqcodInout ;
   private String AV13Tipo ;
   private String lV10MaqcodInout ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A460FasDsc ;
   private String A151BarFasCod ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A758ProCod ;
   private String A13878PedidoClie ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String A13696BarNHdr ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime11 ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A156BarFecCum ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n156BarFecCum ;
   private String AV9FasesToJson ;
   private String AV19Filename ;
   private String AV20ErrorMessage ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09879_A252CliCod ;
   private boolean[] P09879_n252CliCod ;
   private byte[] P09879_A153BarFasEst ;
   private String[] P09879_A457FasCod ;
   private String[] P09879_A603MaqCodBis ;
   private byte[] P09879_A213BarSit ;
   private short[] P09879_A194BarOrdLin ;
   private String[] P09879_A279CliNom ;
   private java.util.Date[] P09879_A155BarFecCli ;
   private java.util.Date[] P09879_A158BarFecFpr ;
   private java.util.Date[] P09879_A159BarFecGen ;
   private String[] P09879_A212BarSer ;
   private String[] P09879_A1652BarSerDsc ;
   private String[] P09879_A135BarColNom ;
   private int[] P09879_A136BarColNum ;
   private byte[] P09879_A218BarTipCol ;
   private String[] P09879_A460FasDsc ;
   private java.math.BigDecimal[] P09879_A184BarMtr ;
   private java.math.BigDecimal[] P09879_A166BarKgm ;
   private String[] P09879_A151BarFasCod ;
   private boolean[] P09879_n151BarFasCod ;
   private java.util.Date[] P09879_A156BarFecCum ;
   private boolean[] P09879_n156BarFecCum ;
   private short[] P09879_A199BarPie1 ;
   private String[] P09879_A365DisDes ;
   private int[] P09879_A898BarPieNDes ;
   private String[] P09879_A130BarCodPar ;
   private byte[] P09879_A132BarCodReo ;
   private int[] P09879_A129BarCod ;
   private String[] P09879_A143BarDisNum ;
   private String[] P09879_A4812BarEncCli ;
   private String[] P09879_A396EmprCod ;
   private String[] P09879_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV18ExcelDocument ;
   private GXSimpleCollection<String> AV11FasesColeccion ;
}

final  class cargasporseccion_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09879( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A457FasCod ,
                                          GXSimpleCollection<String> AV11FasesColeccion ,
                                          byte A213BarSit ,
                                          String A603MaqCodBis ,
                                          String AV10MaqcodInout ,
                                          int AV11FasesColeccion_size ,
                                          String AV8Emprcod ,
                                          String A396EmprCod ,
                                          byte A153BarFasEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[3];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.CliCod, T1.BarFasEst, T1.FasCod, T1.MaqCodBis, T3.BarSit, T1.BarOrdLin, T4.CliNom, T3.BarFecCli, T3.BarFecFpr, T3.BarFecGen, T3.BarSer, T3.BarSerDsc, T3.BarColNom," ;
      scmdbuf += " T3.BarColNum, T3.BarTipCol, T2.FasDsc, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE(" ;
      scmdbuf += " T7.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum, COALESCE( T5.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T3.BarDisNum, T3.BarEncCli, T1.EmprCod, T1.ProCod FROM ((((((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod" ;
      scmdbuf += " = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT" ;
      scmdbuf += " JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod" ;
      scmdbuf += " = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.BarFecRea) AS BarFecCum, COALESCE( T9.BarProCod, '') AS BarProCod, COALESCE( T10.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MIN(T11.ProCod) AS BarProCod, COALESCE( T12.BarFasLin," ;
      scmdbuf += " 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND" ;
      scmdbuf += " T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE T11.BarOrdLin = COALESCE( T12.BarFasLin, 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod," ;
      scmdbuf += " T11.BarCodReo, T11.BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE T8.ProCod = COALESCE( T9.BarProCod," ;
      scmdbuf += " '') and T8.BarOrdLin = COALESCE( T10.BarFasLin, 0) GROUP BY T9.BarProCod, T10.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T7 ON T7.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarFasEst = 0)");
      addWhere(sWhereString, "(T3.BarSit < 9)");
      addWhere(sWhereString, "(T1.MaqCodBis like ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV11FasesColeccion, "T1.FasCod IN (", ")")+" or ? = 0)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarFasEst, T1.MaqCodBis" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09879(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09879", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 28);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(25);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 8);
               ((String[]) buf[30])[0] = rslt.getString(28, 20);
               ((String[]) buf[31])[0] = rslt.getString(29, 3);
               ((String[]) buf[32])[0] = rslt.getString(30, 8);
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
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
      }
   }

}

