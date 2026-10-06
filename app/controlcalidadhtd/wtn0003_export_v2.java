package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wtn0003_export_v2 extends GXProcedure
{
   public wtn0003_export_v2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wtn0003_export_v2.class ), "" );
   }

   public wtn0003_export_v2( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             int aP9 ,
                             int aP10 ,
                             java.util.Date aP11 ,
                             java.util.Date aP12 ,
                             String aP13 ,
                             String aP14 ,
                             String aP15 ,
                             String aP16 ,
                             String aP17 ,
                             int aP18 ,
                             int aP19 ,
                             String aP20 ,
                             String aP21 ,
                             String aP22 ,
                             String[] aP23 )
   {
      wtn0003_export_v2.this.aP24 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
      return aP24[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        int aP9 ,
                        int aP10 ,
                        java.util.Date aP11 ,
                        java.util.Date aP12 ,
                        String aP13 ,
                        String aP14 ,
                        String aP15 ,
                        String aP16 ,
                        String aP17 ,
                        int aP18 ,
                        int aP19 ,
                        String aP20 ,
                        String aP21 ,
                        String aP22 ,
                        String[] aP23 ,
                        String[] aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             int aP9 ,
                             int aP10 ,
                             java.util.Date aP11 ,
                             java.util.Date aP12 ,
                             String aP13 ,
                             String aP14 ,
                             String aP15 ,
                             String aP16 ,
                             String aP17 ,
                             int aP18 ,
                             int aP19 ,
                             String aP20 ,
                             String aP21 ,
                             String aP22 ,
                             String[] aP23 ,
                             String[] aP24 )
   {
      wtn0003_export_v2.this.A396EmprCod = aP0;
      wtn0003_export_v2.this.AV13BarCodi = aP1;
      wtn0003_export_v2.this.AV45CodReoi = aP2;
      wtn0003_export_v2.this.AV43CodPari = aP3;
      wtn0003_export_v2.this.AV12BarCodf = aP4;
      wtn0003_export_v2.this.AV44CodReof = aP5;
      wtn0003_export_v2.this.AV42CodParf = aP6;
      wtn0003_export_v2.this.AV55DisNumi = aP7;
      wtn0003_export_v2.this.AV54DisNumf = aP8;
      wtn0003_export_v2.this.AV41CliCodi = aP9;
      wtn0003_export_v2.this.AV40CliCodf = aP10;
      wtn0003_export_v2.this.AV27CCFCHi = aP11;
      wtn0003_export_v2.this.AV26CCFCHf = aP12;
      wtn0003_export_v2.this.AV25BarSeri = aP13;
      wtn0003_export_v2.this.AV24BarSerf = aP14;
      wtn0003_export_v2.this.AV21Barmdlcod = aP15;
      wtn0003_export_v2.this.AV16Barcolnom = aP16;
      wtn0003_export_v2.this.AV17Barcolnomf = aP17;
      wtn0003_export_v2.this.AV18Barcolnum = aP18;
      wtn0003_export_v2.this.AV19barcolnumf = aP19;
      wtn0003_export_v2.this.AV104Enccli1 = aP20;
      wtn0003_export_v2.this.AV105Enccli2 = aP21;
      wtn0003_export_v2.this.AV49ControlesdeCalidad_json = aP22;
      wtn0003_export_v2.this.aP23 = aP23;
      wtn0003_export_v2.this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV110Enc20c) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int2) ;
      wtn0003_export_v2.this.GXt_int1 = GXv_int2[0] ;
      AV110Enc20c = GXt_int1 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV51ControlesdeCalidad_SDT.fromJSonString(AV49ControlesdeCalidad_json, null);
      AV29CCtcodCollection.clear();
      AV28CCtcod = 0 ;
      AV113GXV1 = 1 ;
      while ( AV113GXV1 <= AV51ControlesdeCalidad_SDT.size() )
      {
         AV8ControlesdeCalidad_SDTItem = (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)((app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)AV51ControlesdeCalidad_SDT.elementAt(-1+AV113GXV1));
         if ( AV8ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar() )
         {
            AV29CCtcodCollection.add((int)(AV8ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod()), 0);
            AV28CCtcod = AV8ControlesdeCalidad_SDTItem.getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod() ;
         }
         AV113GXV1 = (int)(AV113GXV1+1) ;
      }
      AV30CCtcodCollection_json = AV29CCtcodCollection.toJSonString(false) ;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV38CellRow = (short)(2) ;
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
      AV38CellRow = (short)(1) ;
      AV37CellCol = (short)(1) ;
      while ( AV37CellCol <= 100 )
      {
         AV60ExcelDocument.Cells(AV38CellRow, AV37CellCol, 1, 1).setBold( (short)(1) );
         AV60ExcelDocument.Cells(AV38CellRow, AV37CellCol, 1, 1).setColor( 11 );
         AV37CellCol = (short)(AV37CellCol+1) ;
      }
      AV60ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV60ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV60ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV60ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV60ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Composicion", "") );
      AV60ExcelDocument.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Pedido", "") );
      AV60ExcelDocument.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV60ExcelDocument.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV60ExcelDocument.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV60ExcelDocument.Cells(1, 10, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV60ExcelDocument.Cells(1, 11, 1, 1).setText( httpContext.getMessage( "Piezas", "") );
      AV60ExcelDocument.Cells(1, 12, 1, 1).setText( httpContext.getMessage( "Codigo", "") );
      AV60ExcelDocument.Cells(1, 13, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV60ExcelDocument.Cells(1, 14, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV60ExcelDocument.Cells(1, 15, 1, 1).setText( httpContext.getMessage( "Fecha", "") );
      AV60ExcelDocument.Cells(1, 16, 1, 1).setText( httpContext.getMessage( "Observaciones", "") );
      AV60ExcelDocument.Cells(1, 17, 1, 1).setText( httpContext.getMessage( "Operario", "") );
      AV60ExcelDocument.Cells(1, 18, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV37CellCol = (short)(19) ;
      /* Using cursor P0AQ72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV28CCtcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4031CCTCod = P0AQ72_A4031CCTCod[0] ;
         A4043CCTLinDsc = P0AQ72_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AQ72_A4034CCTLin[0] ;
         AV60ExcelDocument.Cells(1, AV37CellCol, 1, 1).setText( A4043CCTLinDsc );
         AV37CellCol = (short)(AV37CellCol+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      lV21Barmdlcod = GXutil.padr( GXutil.rtrim( AV21Barmdlcod), 13, "%") ;
      /* Using cursor P0AQ74 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCodi), Byte.valueOf(AV45CodReoi), AV43CodPari, AV27CCFCHi, Byte.valueOf(AV44CodReof), AV42CodParf, Integer.valueOf(AV41CliCodi), Integer.valueOf(AV40CliCodf), AV25BarSeri, AV24BarSerf, AV26CCFCHf, lV21Barmdlcod, AV21Barmdlcod, AV16Barcolnom, AV17Barcolnomf, Integer.valueOf(AV18Barcolnum), Integer.valueOf(AV19barcolnumf), Integer.valueOf(AV28CCtcod), Integer.valueOf(AV12BarCodf)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4031CCTCod = P0AQ74_A4031CCTCod[0] ;
         A252CliCod = P0AQ74_A252CliCod[0] ;
         n252CliCod = P0AQ74_n252CliCod[0] ;
         A279CliNom = P0AQ74_A279CliNom[0] ;
         A212BarSer = P0AQ74_A212BarSer[0] ;
         A1652BarSerDsc = P0AQ74_A1652BarSerDsc[0] ;
         A135BarColNom = P0AQ74_A135BarColNom[0] ;
         A136BarColNum = P0AQ74_A136BarColNum[0] ;
         A457FasCod = P0AQ74_A457FasCod[0] ;
         A460FasDsc = P0AQ74_A460FasDsc[0] ;
         A4033CCFch = P0AQ74_A4033CCFch[0] ;
         n4033CCFch = P0AQ74_n4033CCFch[0] ;
         A3281CcObs = P0AQ74_A3281CcObs[0] ;
         n3281CcObs = P0AQ74_n3281CcObs[0] ;
         A4032CCOpeCod = P0AQ74_A4032CCOpeCod[0] ;
         n4032CCOpeCod = P0AQ74_n4032CCOpeCod[0] ;
         A194BarOrdLin = P0AQ74_A194BarOrdLin[0] ;
         A758ProCod = P0AQ74_A758ProCod[0] ;
         A130BarCodPar = P0AQ74_A130BarCodPar[0] ;
         A132BarCodReo = P0AQ74_A132BarCodReo[0] ;
         A129BarCod = P0AQ74_A129BarCod[0] ;
         A4609BarMdlCod = P0AQ74_A4609BarMdlCod[0] ;
         A4812BarEncCli = P0AQ74_A4812BarEncCli[0] ;
         A143BarDisNum = P0AQ74_A143BarDisNum[0] ;
         A217BarTipArt = P0AQ74_A217BarTipArt[0] ;
         n217BarTipArt = P0AQ74_n217BarTipArt[0] ;
         A166BarKgm = P0AQ74_A166BarKgm[0] ;
         A199BarPie1 = P0AQ74_A199BarPie1[0] ;
         A365DisDes = P0AQ74_A365DisDes[0] ;
         A898BarPieNDes = P0AQ74_A898BarPieNDes[0] ;
         A252CliCod = P0AQ74_A252CliCod[0] ;
         n252CliCod = P0AQ74_n252CliCod[0] ;
         A212BarSer = P0AQ74_A212BarSer[0] ;
         A1652BarSerDsc = P0AQ74_A1652BarSerDsc[0] ;
         A135BarColNom = P0AQ74_A135BarColNom[0] ;
         A136BarColNum = P0AQ74_A136BarColNum[0] ;
         A4609BarMdlCod = P0AQ74_A4609BarMdlCod[0] ;
         A4812BarEncCli = P0AQ74_A4812BarEncCli[0] ;
         A143BarDisNum = P0AQ74_A143BarDisNum[0] ;
         A217BarTipArt = P0AQ74_A217BarTipArt[0] ;
         n217BarTipArt = P0AQ74_n217BarTipArt[0] ;
         A365DisDes = P0AQ74_A365DisDes[0] ;
         A457FasCod = P0AQ74_A457FasCod[0] ;
         A460FasDsc = P0AQ74_A460FasDsc[0] ;
         A279CliNom = P0AQ74_A279CliNom[0] ;
         A166BarKgm = P0AQ74_A166BarKgm[0] ;
         A199BarPie1 = P0AQ74_A199BarPie1[0] ;
         A898BarPieNDes = P0AQ74_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( ( AV110Enc20c == 0 ) && ( ( GXutil.strcmp(A143BarDisNum, AV55DisNumi) >= 0 ) && ( GXutil.strcmp(A143BarDisNum, AV54DisNumf) <= 0 ) ) || ( AV110Enc20c == 1 ) && ( ( GXutil.strcmp(A4812BarEncCli, AV104Enccli1) >= 0 ) && ( GXutil.strcmp(A4812BarEncCli, AV105Enccli2) <= 0 ) ) )
         {
            AV20Barenccli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
            AV72Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            GXv_char3[0] = AV101Tipartdsc ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char3) ;
            wtn0003_export_v2.this.AV101Tipartdsc = GXv_char3[0] ;
            GXv_char3[0] = AV89Openom ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A4032CCOpeCod, GXv_char3) ;
            wtn0003_export_v2.this.AV89Openom = GXv_char3[0] ;
            AV89Openom = ((A4032CCOpeCod==0) ? " " : AV89Openom) ;
            AV37CellCol = (short)(19) ;
            AV116GXLvl95 = (byte)(0) ;
            /* Using cursor P0AQ75 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4035CCVal = P0AQ75_A4035CCVal[0] ;
               A4048CCTLinTpoI = P0AQ75_A4048CCTLinTpoI[0] ;
               A4034CCTLin = P0AQ75_A4034CCTLin[0] ;
               A4048CCTLinTpoI = P0AQ75_A4048CCTLinTpoI[0] ;
               AV116GXLvl95 = (byte)(1) ;
               AV106CCTValDsc = GXutil.trim( A4035CCVal) ;
               AV107CCtcodIN = A4031CCTCod ;
               AV108CCTLin = A4034CCTLin ;
               if ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", "")) == 0 )
               {
                  AV109CCValIN = (byte)(GXutil.lval( GXutil.trim( A4035CCVal))) ;
                  /* Execute user subroutine: 'CCDEF2' */
                  S134 ();
                  if ( returnInSub )
                  {
                     pr_default.close(2);
                     pr_default.close(2);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               AV60ExcelDocument.Cells(AV38CellRow, 1, 1, 1).setNumber( A252CliCod );
               AV60ExcelDocument.Cells(AV38CellRow, 2, 1, 1).setText( A279CliNom );
               AV60ExcelDocument.Cells(AV38CellRow, 3, 1, 1).setText( A212BarSer );
               AV60ExcelDocument.Cells(AV38CellRow, 4, 1, 1).setText( A1652BarSerDsc );
               AV60ExcelDocument.Cells(AV38CellRow, 5, 1, 1).setText( AV101Tipartdsc );
               AV60ExcelDocument.Cells(AV38CellRow, 6, 1, 1).setText( AV20Barenccli );
               AV60ExcelDocument.Cells(AV38CellRow, 7, 1, 1).setText( A135BarColNom );
               AV60ExcelDocument.Cells(AV38CellRow, 8, 1, 1).setNumber( A136BarColNum );
               AV60ExcelDocument.Cells(AV38CellRow, 9, 1, 1).setText( AV72Hdr );
               AV60ExcelDocument.Cells(AV38CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
               AV60ExcelDocument.Cells(AV38CellRow, 11, 1, 1).setNumber( A198BarPie );
               AV60ExcelDocument.Cells(AV38CellRow, 12, 1, 1).setNumber( A4031CCTCod );
               AV60ExcelDocument.Cells(AV38CellRow, 13, 1, 1).setText( A457FasCod );
               AV60ExcelDocument.Cells(AV38CellRow, 14, 1, 1).setText( A460FasDsc );
               GXt_dtime4 = GXutil.resetTime( A4033CCFch );
               AV60ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV60ExcelDocument.Cells(AV38CellRow, 15, 1, 1).setDate( GXt_dtime4 );
               AV60ExcelDocument.Cells(AV38CellRow, 16, 1, 1).setText( A3281CcObs );
               AV60ExcelDocument.Cells(AV38CellRow, 17, 1, 1).setNumber( A4032CCOpeCod );
               AV60ExcelDocument.Cells(AV38CellRow, 18, 1, 1).setText( AV89Openom );
               AV60ExcelDocument.Cells(AV38CellRow, AV37CellCol, 1, 1).setText( AV106CCTValDsc );
               AV37CellCol = (short)(AV37CellCol+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV116GXLvl95 == 0 )
            {
               AV60ExcelDocument.Cells(AV38CellRow, 1, 1, 1).setNumber( A252CliCod );
               AV60ExcelDocument.Cells(AV38CellRow, 2, 1, 1).setText( A279CliNom );
               AV60ExcelDocument.Cells(AV38CellRow, 3, 1, 1).setText( A212BarSer );
               AV60ExcelDocument.Cells(AV38CellRow, 4, 1, 1).setText( A1652BarSerDsc );
               AV60ExcelDocument.Cells(AV38CellRow, 5, 1, 1).setText( AV101Tipartdsc );
               AV60ExcelDocument.Cells(AV38CellRow, 6, 1, 1).setText( AV20Barenccli );
               AV60ExcelDocument.Cells(AV38CellRow, 7, 1, 1).setText( A135BarColNom );
               AV60ExcelDocument.Cells(AV38CellRow, 8, 1, 1).setNumber( A136BarColNum );
               AV60ExcelDocument.Cells(AV38CellRow, 9, 1, 1).setText( AV72Hdr );
               AV60ExcelDocument.Cells(AV38CellRow, 10, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
               AV60ExcelDocument.Cells(AV38CellRow, 11, 1, 1).setNumber( A198BarPie );
               AV60ExcelDocument.Cells(AV38CellRow, 12, 1, 1).setNumber( A4031CCTCod );
               AV60ExcelDocument.Cells(AV38CellRow, 13, 1, 1).setText( A457FasCod );
               AV60ExcelDocument.Cells(AV38CellRow, 14, 1, 1).setText( A460FasDsc );
               GXt_dtime4 = GXutil.resetTime( A4033CCFch );
               AV60ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV60ExcelDocument.Cells(AV38CellRow, 15, 1, 1).setDate( GXt_dtime4 );
               AV60ExcelDocument.Cells(AV38CellRow, 16, 1, 1).setText( A3281CcObs );
               AV60ExcelDocument.Cells(AV38CellRow, 17, 1, 1).setNumber( A4032CCOpeCod );
               AV60ExcelDocument.Cells(AV38CellRow, 18, 1, 1).setText( AV89Openom );
            }
            AV38CellRow = (short)(AV38CellRow+1) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV96Random = (int)(GXutil.random( )*10000) ;
      AV66Filename = "InformeControlesCalidadv2Export-" + GXutil.trim( GXutil.str( AV96Random, 8, 0)) + ".xlsx" ;
      AV60ExcelDocument.Open(AV66Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV60ExcelDocument.Clear();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV60ExcelDocument.getErrCode() != 0 )
      {
         AV66Filename = "" ;
         AV59ErrorMessage = AV60ExcelDocument.getErrDescription() ;
         AV60ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV60ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV60ExcelDocument.Close();
   }

   public void S134( )
   {
      /* 'CCDEF2' Routine */
      returnInSub = false ;
      AV106CCTValDsc = "" ;
      /* Using cursor P0AQ76 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV107CCtcodIN), Short.valueOf(AV108CCTLin), Byte.valueOf(AV109CCValIN)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4049CCTValLin = P0AQ76_A4049CCTValLin[0] ;
         A4034CCTLin = P0AQ76_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ76_A4031CCTCod[0] ;
         A4050CCTValDsc = P0AQ76_A4050CCTValDsc[0] ;
         AV106CCTValDsc = A4050CCTValDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP23[0] = wtn0003_export_v2.this.AV66Filename;
      this.aP24[0] = wtn0003_export_v2.this.AV59ErrorMessage;
      CloseOpenCursors();
      AV60ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66Filename = "" ;
      AV59ErrorMessage = "" ;
      GXv_int2 = new byte[1] ;
      AV51ControlesdeCalidad_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item>(app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV29CCtcodCollection = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV8ControlesdeCalidad_SDTItem = new app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item(remoteHandle, context);
      AV30CCtcodCollection_json = "" ;
      AV60ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      scmdbuf = "" ;
      P0AQ72_A396EmprCod = new String[] {""} ;
      P0AQ72_A4031CCTCod = new int[1] ;
      P0AQ72_A4043CCTLinDsc = new String[] {""} ;
      P0AQ72_A4034CCTLin = new short[1] ;
      A4043CCTLinDsc = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A3281CcObs = "" ;
      lV21Barmdlcod = "" ;
      P0AQ74_A396EmprCod = new String[] {""} ;
      P0AQ74_A4031CCTCod = new int[1] ;
      P0AQ74_A252CliCod = new int[1] ;
      P0AQ74_n252CliCod = new boolean[] {false} ;
      P0AQ74_A279CliNom = new String[] {""} ;
      P0AQ74_A212BarSer = new String[] {""} ;
      P0AQ74_A1652BarSerDsc = new String[] {""} ;
      P0AQ74_A135BarColNom = new String[] {""} ;
      P0AQ74_A136BarColNum = new int[1] ;
      P0AQ74_A457FasCod = new String[] {""} ;
      P0AQ74_A460FasDsc = new String[] {""} ;
      P0AQ74_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQ74_n4033CCFch = new boolean[] {false} ;
      P0AQ74_A3281CcObs = new String[] {""} ;
      P0AQ74_n3281CcObs = new boolean[] {false} ;
      P0AQ74_A4032CCOpeCod = new int[1] ;
      P0AQ74_n4032CCOpeCod = new boolean[] {false} ;
      P0AQ74_A194BarOrdLin = new short[1] ;
      P0AQ74_A758ProCod = new String[] {""} ;
      P0AQ74_A130BarCodPar = new String[] {""} ;
      P0AQ74_A132BarCodReo = new byte[1] ;
      P0AQ74_A129BarCod = new int[1] ;
      P0AQ74_A4609BarMdlCod = new String[] {""} ;
      P0AQ74_A4812BarEncCli = new String[] {""} ;
      P0AQ74_A143BarDisNum = new String[] {""} ;
      P0AQ74_A217BarTipArt = new short[1] ;
      P0AQ74_n217BarTipArt = new boolean[] {false} ;
      P0AQ74_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQ74_A199BarPie1 = new short[1] ;
      P0AQ74_A365DisDes = new String[] {""} ;
      P0AQ74_A898BarPieNDes = new int[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A4609BarMdlCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A365DisDes = "" ;
      AV20Barenccli = "" ;
      AV72Hdr = "" ;
      AV101Tipartdsc = "" ;
      AV89Openom = "" ;
      GXv_char3 = new String[1] ;
      P0AQ75_A396EmprCod = new String[] {""} ;
      P0AQ75_A129BarCod = new int[1] ;
      P0AQ75_A132BarCodReo = new byte[1] ;
      P0AQ75_A130BarCodPar = new String[] {""} ;
      P0AQ75_A758ProCod = new String[] {""} ;
      P0AQ75_A194BarOrdLin = new short[1] ;
      P0AQ75_A4031CCTCod = new int[1] ;
      P0AQ75_A4035CCVal = new String[] {""} ;
      P0AQ75_A4048CCTLinTpoI = new String[] {""} ;
      P0AQ75_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      A4048CCTLinTpoI = "" ;
      AV106CCTValDsc = "" ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      P0AQ76_A396EmprCod = new String[] {""} ;
      P0AQ76_A4049CCTValLin = new byte[1] ;
      P0AQ76_A4034CCTLin = new short[1] ;
      P0AQ76_A4031CCTCod = new int[1] ;
      P0AQ76_A4050CCTValDsc = new String[] {""} ;
      A4050CCTValDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wtn0003_export_v2__default(),
         new Object[] {
             new Object[] {
            P0AQ72_A396EmprCod, P0AQ72_A4031CCTCod, P0AQ72_A4043CCTLinDsc, P0AQ72_A4034CCTLin
            }
            , new Object[] {
            P0AQ74_A396EmprCod, P0AQ74_A4031CCTCod, P0AQ74_A252CliCod, P0AQ74_n252CliCod, P0AQ74_A279CliNom, P0AQ74_A212BarSer, P0AQ74_A1652BarSerDsc, P0AQ74_A135BarColNom, P0AQ74_A136BarColNum, P0AQ74_A457FasCod,
            P0AQ74_A460FasDsc, P0AQ74_A4033CCFch, P0AQ74_n4033CCFch, P0AQ74_A3281CcObs, P0AQ74_n3281CcObs, P0AQ74_A4032CCOpeCod, P0AQ74_n4032CCOpeCod, P0AQ74_A194BarOrdLin, P0AQ74_A758ProCod, P0AQ74_A130BarCodPar,
            P0AQ74_A132BarCodReo, P0AQ74_A129BarCod, P0AQ74_A4609BarMdlCod, P0AQ74_A4812BarEncCli, P0AQ74_A143BarDisNum, P0AQ74_A217BarTipArt, P0AQ74_n217BarTipArt, P0AQ74_A166BarKgm, P0AQ74_A199BarPie1, P0AQ74_A365DisDes,
            P0AQ74_A898BarPieNDes
            }
            , new Object[] {
            P0AQ75_A396EmprCod, P0AQ75_A129BarCod, P0AQ75_A132BarCodReo, P0AQ75_A130BarCodPar, P0AQ75_A758ProCod, P0AQ75_A194BarOrdLin, P0AQ75_A4031CCTCod, P0AQ75_A4035CCVal, P0AQ75_A4048CCTLinTpoI, P0AQ75_A4034CCTLin
            }
            , new Object[] {
            P0AQ76_A396EmprCod, P0AQ76_A4049CCTValLin, P0AQ76_A4034CCTLin, P0AQ76_A4031CCTCod, P0AQ76_A4050CCTValDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45CodReoi ;
   private byte AV44CodReof ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte AV116GXLvl95 ;
   private byte AV109CCValIN ;
   private byte A4049CCTValLin ;
   private short AV110Enc20c ;
   private short AV38CellRow ;
   private short AV37CellCol ;
   private short A4034CCTLin ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV108CCTLin ;
   private short Gx_err ;
   private int AV13BarCodi ;
   private int AV12BarCodf ;
   private int AV41CliCodi ;
   private int AV40CliCodf ;
   private int AV18Barcolnum ;
   private int AV19barcolnumf ;
   private int AV28CCtcod ;
   private int AV113GXV1 ;
   private int A4031CCTCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A4032CCOpeCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int AV107CCtcodIN ;
   private int AV96Random ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String AV43CodPari ;
   private String AV42CodParf ;
   private String AV55DisNumi ;
   private String AV54DisNumf ;
   private String AV25BarSeri ;
   private String AV24BarSerf ;
   private String AV21Barmdlcod ;
   private String AV16Barcolnom ;
   private String AV17Barcolnomf ;
   private String AV104Enccli1 ;
   private String AV105Enccli2 ;
   private String scmdbuf ;
   private String A4043CCTLinDsc ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String lV21Barmdlcod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A4609BarMdlCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String AV20Barenccli ;
   private String AV72Hdr ;
   private String AV101Tipartdsc ;
   private String AV89Openom ;
   private String GXv_char3[] ;
   private String A4035CCVal ;
   private String A4048CCTLinTpoI ;
   private String AV106CCTValDsc ;
   private String A4050CCTValDsc ;
   private java.util.Date GXt_dtime4 ;
   private java.util.Date AV27CCFCHi ;
   private java.util.Date AV26CCFCHf ;
   private java.util.Date A4033CCFch ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n3281CcObs ;
   private boolean n4032CCOpeCod ;
   private boolean n217BarTipArt ;
   private String AV49ControlesdeCalidad_json ;
   private String AV30CCtcodCollection_json ;
   private String AV66Filename ;
   private String AV59ErrorMessage ;
   private String A3281CcObs ;
   private GXSimpleCollection<Integer> AV29CCtcodCollection ;
   private String[] aP24 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQ72_A396EmprCod ;
   private int[] P0AQ72_A4031CCTCod ;
   private String[] P0AQ72_A4043CCTLinDsc ;
   private short[] P0AQ72_A4034CCTLin ;
   private String[] P0AQ74_A396EmprCod ;
   private int[] P0AQ74_A4031CCTCod ;
   private int[] P0AQ74_A252CliCod ;
   private boolean[] P0AQ74_n252CliCod ;
   private String[] P0AQ74_A279CliNom ;
   private String[] P0AQ74_A212BarSer ;
   private String[] P0AQ74_A1652BarSerDsc ;
   private String[] P0AQ74_A135BarColNom ;
   private int[] P0AQ74_A136BarColNum ;
   private String[] P0AQ74_A457FasCod ;
   private String[] P0AQ74_A460FasDsc ;
   private java.util.Date[] P0AQ74_A4033CCFch ;
   private boolean[] P0AQ74_n4033CCFch ;
   private String[] P0AQ74_A3281CcObs ;
   private boolean[] P0AQ74_n3281CcObs ;
   private int[] P0AQ74_A4032CCOpeCod ;
   private boolean[] P0AQ74_n4032CCOpeCod ;
   private short[] P0AQ74_A194BarOrdLin ;
   private String[] P0AQ74_A758ProCod ;
   private String[] P0AQ74_A130BarCodPar ;
   private byte[] P0AQ74_A132BarCodReo ;
   private int[] P0AQ74_A129BarCod ;
   private String[] P0AQ74_A4609BarMdlCod ;
   private String[] P0AQ74_A4812BarEncCli ;
   private String[] P0AQ74_A143BarDisNum ;
   private short[] P0AQ74_A217BarTipArt ;
   private boolean[] P0AQ74_n217BarTipArt ;
   private java.math.BigDecimal[] P0AQ74_A166BarKgm ;
   private short[] P0AQ74_A199BarPie1 ;
   private String[] P0AQ74_A365DisDes ;
   private int[] P0AQ74_A898BarPieNDes ;
   private String[] P0AQ75_A396EmprCod ;
   private int[] P0AQ75_A129BarCod ;
   private byte[] P0AQ75_A132BarCodReo ;
   private String[] P0AQ75_A130BarCodPar ;
   private String[] P0AQ75_A758ProCod ;
   private short[] P0AQ75_A194BarOrdLin ;
   private int[] P0AQ75_A4031CCTCod ;
   private String[] P0AQ75_A4035CCVal ;
   private String[] P0AQ75_A4048CCTLinTpoI ;
   private short[] P0AQ75_A4034CCTLin ;
   private String[] P0AQ76_A396EmprCod ;
   private byte[] P0AQ76_A4049CCTValLin ;
   private short[] P0AQ76_A4034CCTLin ;
   private int[] P0AQ76_A4031CCTCod ;
   private String[] P0AQ76_A4050CCTValDsc ;
   private com.genexus.gxoffice.ExcelDoc AV60ExcelDocument ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item> AV51ControlesdeCalidad_SDT ;
   private app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item AV8ControlesdeCalidad_SDTItem ;
}

final  class wtn0003_export_v2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ72", "SELECT EmprCod, CCTCod, CCTLinDsc, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ74", "SELECT T1.EmprCod, T1.CCTCod, T2.CliCod, T5.CliNom, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T3.FasCod, T4.FasDsc, T1.CCFch, T1.CcObs, T1.CCOpeCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarMdlCod, T2.BarEncCli, T2.BarDisNum, T2.BarTipArt, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T6.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes FROM (((((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod) INNER JOIN TXPBARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod AND T3.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T3.FasCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod >= ? and T1.BarCodReo >= ? and T1.BarCodPar >= ? and T1.CCFch >= ?) AND (T1.BarCodReo <= ?) AND (T1.BarCodPar <= ?) AND (T2.CliCod >= ? and T2.CliCod <= ?) AND (T2.BarSer >= ? and T2.BarSer <= ?) AND (T1.CCFch <= ?) AND (T2.BarMdlCod like ? or (rtrim(?) IS NULL)) AND (T2.BarColNom >= ? and T2.BarColNom <= ?) AND (T2.BarColNum >= ? and T2.BarColNum <= ?) AND (T1.CCTCod = ?) AND (T1.BarCod <= ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CCFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ75", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T2.CCTLinTpoI, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ76", "SELECT EmprCod, CCTValLin, CCTLin, CCTCod, CCTValDsc FROM TXPCCDef2 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? and CCTValLin = ? ORDER BY EmprCod, CCTCod, CCTLin, CCTValLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((String[]) buf[18])[0] = rslt.getString(15, 8);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               ((String[]) buf[23])[0] = rslt.getString(20, 20);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 1);
               ((int[]) buf[30])[0] = rslt.getInt(26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 16);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setString(13, (String)parms[12], 13);
               stmt.setString(14, (String)parms[13], 13);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

