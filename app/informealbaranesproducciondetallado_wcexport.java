package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informealbaranesproducciondetallado_wcexport extends GXProcedure
{
   public informealbaranesproducciondetallado_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealbaranesproducciondetallado_wcexport.class ), "" );
   }

   public informealbaranesproducciondetallado_wcexport( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      informealbaranesproducciondetallado_wcexport.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      informealbaranesproducciondetallado_wcexport.this.aP0 = aP0;
      informealbaranesproducciondetallado_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV109Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char2[0] ;
      AV109Station = GXt_char1 ;
      GXv_char2[0] = AV81Emprcod ;
      GXv_char3[0] = AV108EmprNom ;
      GXv_char4[0] = AV110UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char2, GXv_char3, GXv_char4) ;
      informealbaranesproducciondetallado_wcexport.this.AV81Emprcod = GXv_char2[0] ;
      informealbaranesproducciondetallado_wcexport.this.AV108EmprNom = GXv_char3[0] ;
      informealbaranesproducciondetallado_wcexport.this.AV110UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV128moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV81Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      informealbaranesproducciondetallado_wcexport.this.GXt_int5 = GXv_int6[0] ;
      AV128moda21 = GXt_int5 ;
      if ( 1 == 0 )
      {
         GXv_SdtWWPContext7[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
         AV9WWPContext = GXv_SdtWWPContext7[0] ;
         /* Execute user subroutine: 'OPENDOCUMENT' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV13CellRow = 1 ;
         AV14FirstColumn = 1 ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'WRITEFILTERS' */
         S131 ();
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
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'CLOSEDOCUMENT' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13CellRow = 1 ;
      AV14FirstColumn = 1 ;
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S211 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S221 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S131 ();
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
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "InformeAlbaranesProduccionDetallado_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (GXutil.strcmp("", AV105TFIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV10ExcelDocument ;
         GXv_int9[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc8[0] ;
         informealbaranesproducciondetallado_wcexport.this.AV13CellRow = GXv_int9[0] ;
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV105TFIntDsc_Sel, GXv_char4) ;
         informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char1 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV104TFIntDsc)==0) ) )
         {
            GXv_exceldoc8[0] = AV10ExcelDocument ;
            GXv_int9[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc8[0] ;
            informealbaranesproducciondetallado_wcexport.this.AV13CellRow = GXv_int9[0] ;
            GXt_char1 = "" ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV104TFIntDsc, GXv_char4) ;
            informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char4[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char1 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV37VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector") ;
         AV29ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV31ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV132GXV1));
         if ( AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV31ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setColor( 11 );
            AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV82Clicod) ,
                                           Integer.valueOf(AV83Clicod_to) ,
                                           AV84ALbProfch ,
                                           AV85ALbProfch_to ,
                                           AV86Barser ,
                                           AV87Barser_to ,
                                           AV102BarColNom ,
                                           AV103BarColNom_to ,
                                           Integer.valueOf(AV90BarColNum) ,
                                           Integer.valueOf(AV91BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV92Prio ,
                                           AV88AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV89AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV119Barestreoi) ,
                                           Byte.valueOf(AV120barestreof) ,
                                           A2010BarTipDis ,
                                           AV121TipDisCod ,
                                           A5140AlbMarca ,
                                           AV81Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09532 */
      pr_default.execute(0, new Object[] {AV81Emprcod, AV92Prio, AV92Prio, Byte.valueOf(AV119Barestreoi), Byte.valueOf(AV120barestreof), AV121TipDisCod, AV121TipDisCod, Integer.valueOf(AV82Clicod), Integer.valueOf(AV83Clicod_to), AV84ALbProfch, AV85ALbProfch_to, AV86Barser, AV87Barser_to, AV102BarColNom, AV103BarColNom_to, Integer.valueOf(AV90BarColNum), Integer.valueOf(AV91BarColNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P09532_A217BarTipArt[0] ;
         n217BarTipArt = P09532_n217BarTipArt[0] ;
         A1253EmprGuiRem = P09532_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P09532_A5140AlbMarca[0] ;
         A2010BarTipDis = P09532_A2010BarTipDis[0] ;
         A148BarEstReo = P09532_A148BarEstReo[0] ;
         A136BarColNum = P09532_A136BarColNum[0] ;
         A135BarColNom = P09532_A135BarColNom[0] ;
         A212BarSer = P09532_A212BarSer[0] ;
         A34AlbProfch = P09532_A34AlbProfch[0] ;
         A1243GuiRemCli = P09532_A1243GuiRemCli[0] ;
         A39AlbProPri = P09532_A39AlbProPri[0] ;
         A252CliCod = P09532_A252CliCod[0] ;
         n252CliCod = P09532_n252CliCod[0] ;
         A218BarTipCol = P09532_A218BarTipCol[0] ;
         A1261BarAlbKgmE = P09532_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = P09532_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P09532_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = P09532_A1263BarAlbMtrE[0] ;
         A1461BarAlbPN = P09532_A1461BarAlbPN[0] ;
         A1265BarAlbPie = P09532_A1265BarAlbPie[0] ;
         A1234BarNomCli = P09532_A1234BarNomCli[0] ;
         A13711BarTipArtD = P09532_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09532_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P09532_A1652BarSerDsc[0] ;
         A155BarFecCli = P09532_A155BarFecCli[0] ;
         A30AlbProCod = P09532_A30AlbProCod[0] ;
         A1244GuiRemCln = P09532_A1244GuiRemCln[0] ;
         A130BarCodPar = P09532_A130BarCodPar[0] ;
         A132BarCodReo = P09532_A132BarCodReo[0] ;
         A129BarCod = P09532_A129BarCod[0] ;
         A143BarDisNum = P09532_A143BarDisNum[0] ;
         A4812BarEncCli = P09532_A4812BarEncCli[0] ;
         A396EmprCod = P09532_A396EmprCod[0] ;
         A217BarTipArt = P09532_A217BarTipArt[0] ;
         n217BarTipArt = P09532_n217BarTipArt[0] ;
         A2010BarTipDis = P09532_A2010BarTipDis[0] ;
         A148BarEstReo = P09532_A148BarEstReo[0] ;
         A136BarColNum = P09532_A136BarColNum[0] ;
         A135BarColNom = P09532_A135BarColNom[0] ;
         A212BarSer = P09532_A212BarSer[0] ;
         A252CliCod = P09532_A252CliCod[0] ;
         n252CliCod = P09532_n252CliCod[0] ;
         A218BarTipCol = P09532_A218BarTipCol[0] ;
         A1234BarNomCli = P09532_A1234BarNomCli[0] ;
         A1652BarSerDsc = P09532_A1652BarSerDsc[0] ;
         A155BarFecCli = P09532_A155BarFecCli[0] ;
         A143BarDisNum = P09532_A143BarDisNum[0] ;
         A4812BarEncCli = P09532_A4812BarEncCli[0] ;
         A1253EmprGuiRem = P09532_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P09532_A5140AlbMarca[0] ;
         A34AlbProfch = P09532_A34AlbProfch[0] ;
         A1243GuiRemCli = P09532_A1243GuiRemCli[0] ;
         A39AlbProPri = P09532_A39AlbProPri[0] ;
         A1244GuiRemCln = P09532_A1244GuiRemCln[0] ;
         A13711BarTipArtD = P09532_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P09532_n13711BarTipArtD[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char10[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char10) ;
         informealbaranesproducciondetallado_wcexport.this.A396EmprCod = GXv_char4[0] ;
         informealbaranesproducciondetallado_wcexport.this.A4812BarEncCli = GXv_char3[0] ;
         informealbaranesproducciondetallado_wcexport.this.A143BarDisNum = GXv_char2[0] ;
         informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV88AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV88AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV89AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV89AlbEncCli_to) <= 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV13CellRow = (int)(AV13CellRow+1) ;
               /* Execute user subroutine: 'BEFOREWRITELINE' */
               S172 ();
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
               AV37VisibleColumnCount = 0 ;
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A1243GuiRemCli );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1244GuiRemCln, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A30AlbProCod );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_dtime11 = GXutil.resetTime( A34AlbProfch );
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setDate( GXt_dtime11 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV23BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV23BarEncCli, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_dtime11 = GXutil.resetTime( A155BarFecCli );
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setDate( GXt_dtime11 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char1 = "" ;
                  GXv_char10[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char10) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char10[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXv_char10[0] = " " ;
                  GXv_char4[0] = " " ;
                  GXv_int9[0] = (short)(0) ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char3[0] = AV25TipColDsc ;
                  GXv_char2[0] = " " ;
                  GXv_int12[0] = 0 ;
                  GXv_char13[0] = " " ;
                  GXv_char14[0] = " " ;
                  GXv_int15[0] = (short)(0) ;
                  GXv_char16[0] = " " ;
                  GXv_char17[0] = " " ;
                  new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char10, GXv_char4, GXv_int9, GXv_int6, GXv_char3, GXv_char2, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_char17) ;
                  informealbaranesproducciondetallado_wcexport.this.AV25TipColDsc = GXv_char3[0] ;
                  GXt_char1 = "" ;
                  GXv_char17[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV25TipColDsc, GXv_char17) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char17[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXv_char17[0] = AV26IntDsc ;
                  GXv_char16[0] = " " ;
                  GXv_int15[0] = (short)(0) ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char14[0] = "" ;
                  GXv_char13[0] = " " ;
                  GXv_int12[0] = 0 ;
                  GXv_char10[0] = " " ;
                  GXv_char4[0] = " " ;
                  GXv_int9[0] = (short)(0) ;
                  GXv_char3[0] = " " ;
                  GXv_char2[0] = " " ;
                  new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char17, GXv_char16, GXv_int15, GXv_int6, GXv_char14, GXv_char13, GXv_int12, GXv_char10, GXv_char4, GXv_int9, GXv_char3, GXv_char2) ;
                  informealbaranesproducciondetallado_wcexport.this.AV26IntDsc = GXv_char17[0] ;
                  GXt_char1 = "" ;
                  GXv_char17[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV26IntDsc, GXv_char17) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char17[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setText( GXt_char1 );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_decimal18 = AV129BarKgm ;
                  GXv_decimal19[0] = GXt_decimal18 ;
                  new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal19) ;
                  informealbaranesproducciondetallado_wcexport.this.GXt_decimal18 = GXv_decimal19[0] ;
                  AV129BarKgm = GXt_decimal18 ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV129BarKgm)) );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV122BarAlbKgmE = A1261BarAlbKgmE ;
                  if ( AV128moda21 == 1 )
                  {
                     if ( A2243BarKgsCli.doubleValue() != 0 )
                     {
                        AV122BarAlbKgmE = A2243BarKgsCli ;
                     }
                  }
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV122BarAlbKgmE)) );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV123BarAlbMtrE = A1263BarAlbMtrE ;
                  if ( AV128moda21 == 1 )
                  {
                     if ( A1461BarAlbPN.doubleValue() != 0 )
                     {
                        AV123BarAlbMtrE = A1461BarAlbPN ;
                     }
                  }
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV123BarAlbMtrE)) );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV29ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV37VisibleColumnCount), 1, 1).setNumber( A1265BarAlbPie );
                  AV37VisibleColumnCount = (long)(AV37VisibleColumnCount+1) ;
               }
               /* Execute user subroutine: 'AFTERWRITELINE' */
               S182 ();
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
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
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

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV29ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "GuiRemCli", "", "Cliente", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "GuiRemCln", "", "Nombre", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlbProCod", "", "Albaran", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "AlbProfch", "", "Fecha Alb", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarEncCli", "", "Pedido Cli", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarFecCli", "", "Fecha Disposicion Cliente", false, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNHdr", "", "Hdr", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSer", "", "Articulo", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarSerDsc", "", "Descripcion", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarTipArtDsc", "", "Composicion", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarNomCli", "", "Color Cli", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNom", "", "Color", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarColNum", "", "Numero", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&TipColDsc", "", "Tc", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&IntDsc", "", "Intensidad", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarKgm", "", "Kilos Cru.", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarAlbKgmE", "Entregados", "Kilos", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&BarAlbMtrE", "Entregados", "Metros", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV29ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "BarAlbPie", "", "Piezas", true, "") ;
      AV29ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV33UserCustomValue ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeAlbaranesProduccionDetallado_WCColumnsSelector", GXv_char17) ;
      informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char17[0] ;
      AV33UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV30ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV30ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV29ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV30ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV29ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV134GXV2 = 1 ;
      while ( AV134GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV104TFIntDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV105TFIntDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV81Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIO") == 0 )
         {
            AV92Prio = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV82Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV83Clicod_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV84ALbProfch = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH_TO") == 0 )
         {
            AV85ALbProfch_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV86Barser = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV87Barser_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI") == 0 )
         {
            AV88AlbEncCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI_TO") == 0 )
         {
            AV89AlbEncCli_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV102BarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV103BarColNom_to = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV90BarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV91BarColNum_to = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREO") == 0 )
         {
            AV118Barestreo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOI") == 0 )
         {
            AV119Barestreoi = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOF") == 0 )
         {
            AV120barestreof = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPDISCOD") == 0 )
         {
            AV121TipDisCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV134GXV2 = (int)(AV134GXV2+1) ;
      }
   }

   public void S172( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S182( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S211( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char1 = AV109Station ;
      GXv_char17[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char17) ;
      informealbaranesproducciondetallado_wcexport.this.GXt_char1 = GXv_char17[0] ;
      AV109Station = GXt_char1 ;
      GXv_char17[0] = AV81Emprcod ;
      GXv_char16[0] = AV108EmprNom ;
      GXv_char14[0] = AV110UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV109Station, GXv_char17, GXv_char16, GXv_char14) ;
      informealbaranesproducciondetallado_wcexport.this.AV81Emprcod = GXv_char17[0] ;
      informealbaranesproducciondetallado_wcexport.this.AV108EmprNom = GXv_char16[0] ;
      informealbaranesproducciondetallado_wcexport.this.AV110UsurCod = GXv_char14[0] ;
      AV115ALbProfch_char = GXutil.upper( GXutil.trim( AV111WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch"))) ;
      AV111WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch");
      AV84ALbProfch = localUtil.ctod( AV115ALbProfch_char, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV116ALbProfch_to_char = GXutil.upper( GXutil.trim( AV111WebSession.getValue("InformeAlbaranesProduccionWC_ALbProfch_to"))) ;
      AV111WebSession.remove("InformeAlbaranesProduccionWC_ALbProfch_to");
      AV85ALbProfch_to = localUtil.ctod( AV116ALbProfch_to_char, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
   }

   public void S221( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV108EmprNom+" "+"("+AV135Pgmdesc+")" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Fecha Inicial: ", "")+" "+localUtil.dtoc( AV84ALbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setText( httpContext.getMessage( "Fecha Final: ", "")+" "+localUtil.dtoc( AV85ALbProfch_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
   }

   protected void cleanup( )
   {
      this.aP0[0] = informealbaranesproducciondetallado_wcexport.this.AV11Filename;
      this.aP1[0] = informealbaranesproducciondetallado_wcexport.this.AV12ErrorMessage;
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
      AV109Station = "" ;
      AV81Emprcod = "" ;
      AV108EmprNom = "" ;
      AV110UsurCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV105TFIntDsc_Sel = "" ;
      AV104TFIntDsc = "" ;
      GXv_exceldoc8 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV19Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV29ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      scmdbuf = "" ;
      AV84ALbProfch = GXutil.nullDate() ;
      AV85ALbProfch_to = GXutil.nullDate() ;
      AV86Barser = "" ;
      AV87Barser_to = "" ;
      AV102BarColNom = "" ;
      AV103BarColNom_to = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A39AlbProPri = "" ;
      AV92Prio = "" ;
      AV88AlbEncCli = "" ;
      A13878PedidoClie = "" ;
      AV89AlbEncCli_to = "" ;
      A2010BarTipDis = "" ;
      AV121TipDisCod = "" ;
      A5140AlbMarca = "" ;
      A396EmprCod = "" ;
      P09532_A217BarTipArt = new short[1] ;
      P09532_n217BarTipArt = new boolean[] {false} ;
      P09532_A1253EmprGuiRem = new String[] {""} ;
      P09532_A5140AlbMarca = new String[] {""} ;
      P09532_A2010BarTipDis = new String[] {""} ;
      P09532_A148BarEstReo = new byte[1] ;
      P09532_A136BarColNum = new int[1] ;
      P09532_A135BarColNom = new String[] {""} ;
      P09532_A212BarSer = new String[] {""} ;
      P09532_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09532_A1243GuiRemCli = new int[1] ;
      P09532_A39AlbProPri = new String[] {""} ;
      P09532_A252CliCod = new int[1] ;
      P09532_n252CliCod = new boolean[] {false} ;
      P09532_A218BarTipCol = new byte[1] ;
      P09532_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09532_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09532_n2243BarKgsCli = new boolean[] {false} ;
      P09532_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09532_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09532_A1265BarAlbPie = new int[1] ;
      P09532_A1234BarNomCli = new String[] {""} ;
      P09532_A13711BarTipArtD = new String[] {""} ;
      P09532_n13711BarTipArtD = new boolean[] {false} ;
      P09532_A1652BarSerDsc = new String[] {""} ;
      P09532_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09532_A30AlbProCod = new long[1] ;
      P09532_A1244GuiRemCln = new String[] {""} ;
      P09532_A130BarCodPar = new String[] {""} ;
      P09532_A132BarCodReo = new byte[1] ;
      P09532_A129BarCod = new int[1] ;
      P09532_A143BarDisNum = new String[] {""} ;
      P09532_A4812BarEncCli = new String[] {""} ;
      P09532_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A13711BarTipArtD = "" ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13696BarNHdr = "" ;
      AV23BarEncCli = "" ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV25TipColDsc = "" ;
      AV26IntDsc = "" ;
      GXv_int15 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV129BarKgm = DecimalUtil.ZERO ;
      GXt_decimal18 = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      AV122BarAlbKgmE = DecimalUtil.ZERO ;
      AV123BarAlbMtrE = DecimalUtil.ZERO ;
      AV33UserCustomValue = "" ;
      AV30ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char14 = new String[1] ;
      AV115ALbProfch_char = "" ;
      AV111WebSession = httpContext.getWebSession();
      AV116ALbProfch_to_char = "" ;
      AV135Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproducciondetallado_wcexport__default(),
         new Object[] {
             new Object[] {
            P09532_A217BarTipArt, P09532_n217BarTipArt, P09532_A1253EmprGuiRem, P09532_A5140AlbMarca, P09532_A2010BarTipDis, P09532_A148BarEstReo, P09532_A136BarColNum, P09532_A135BarColNom, P09532_A212BarSer, P09532_A34AlbProfch,
            P09532_A1243GuiRemCli, P09532_A39AlbProPri, P09532_A252CliCod, P09532_n252CliCod, P09532_A218BarTipCol, P09532_A1261BarAlbKgmE, P09532_A2243BarKgsCli, P09532_n2243BarKgsCli, P09532_A1263BarAlbMtrE, P09532_A1461BarAlbPN,
            P09532_A1265BarAlbPie, P09532_A1234BarNomCli, P09532_A13711BarTipArtD, P09532_n13711BarTipArtD, P09532_A1652BarSerDsc, P09532_A155BarFecCli, P09532_A30AlbProCod, P09532_A1244GuiRemCln, P09532_A130BarCodPar, P09532_A132BarCodReo,
            P09532_A129BarCod, P09532_A143BarDisNum, P09532_A4812BarEncCli, P09532_A396EmprCod
            }
         }
      );
      AV135Pgmdesc = httpContext.getMessage( "Informe Albaranes Producción Detallado", "") ;
      /* GeneXus formulas. */
      AV135Pgmdesc = httpContext.getMessage( "Informe Albaranes Producción Detallado", "") ;
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte A148BarEstReo ;
   private byte AV119Barestreoi ;
   private byte AV120barestreof ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int6[] ;
   private byte AV118Barestreo ;
   private short AV128moda21 ;
   private short AV16OrderedBy ;
   private short A217BarTipArt ;
   private short GXv_int15[] ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV132GXV1 ;
   private int AV82Clicod ;
   private int AV83Clicod_to ;
   private int AV90BarColNum ;
   private int AV91BarColNum_to ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int12[] ;
   private int AV134GXV2 ;
   private long AV37VisibleColumnCount ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV129BarKgm ;
   private java.math.BigDecimal GXt_decimal18 ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal AV122BarAlbKgmE ;
   private java.math.BigDecimal AV123BarAlbMtrE ;
   private String AV109Station ;
   private String AV81Emprcod ;
   private String AV108EmprNom ;
   private String AV110UsurCod ;
   private String AV105TFIntDsc_Sel ;
   private String AV104TFIntDsc ;
   private String scmdbuf ;
   private String AV86Barser ;
   private String AV87Barser_to ;
   private String AV102BarColNom ;
   private String AV103BarColNom_to ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A39AlbProPri ;
   private String AV92Prio ;
   private String AV88AlbEncCli ;
   private String A13878PedidoClie ;
   private String AV89AlbEncCli_to ;
   private String A2010BarTipDis ;
   private String AV121TipDisCod ;
   private String A5140AlbMarca ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String A1234BarNomCli ;
   private String A13711BarTipArtD ;
   private String A1652BarSerDsc ;
   private String A1244GuiRemCln ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13696BarNHdr ;
   private String AV23BarEncCli ;
   private String AV25TipColDsc ;
   private String AV26IntDsc ;
   private String GXv_char13[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String AV115ALbProfch_char ;
   private String AV116ALbProfch_to_char ;
   private String AV135Pgmdesc ;
   private java.util.Date GXt_dtime11 ;
   private java.util.Date AV84ALbProfch ;
   private java.util.Date AV85ALbProfch_to ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean n13711BarTipArtD ;
   private String AV32ColumnsSelectorXML ;
   private String AV33UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.WebSession AV111WebSession ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09532_A217BarTipArt ;
   private boolean[] P09532_n217BarTipArt ;
   private String[] P09532_A1253EmprGuiRem ;
   private String[] P09532_A5140AlbMarca ;
   private String[] P09532_A2010BarTipDis ;
   private byte[] P09532_A148BarEstReo ;
   private int[] P09532_A136BarColNum ;
   private String[] P09532_A135BarColNom ;
   private String[] P09532_A212BarSer ;
   private java.util.Date[] P09532_A34AlbProfch ;
   private int[] P09532_A1243GuiRemCli ;
   private String[] P09532_A39AlbProPri ;
   private int[] P09532_A252CliCod ;
   private boolean[] P09532_n252CliCod ;
   private byte[] P09532_A218BarTipCol ;
   private java.math.BigDecimal[] P09532_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P09532_A2243BarKgsCli ;
   private boolean[] P09532_n2243BarKgsCli ;
   private java.math.BigDecimal[] P09532_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09532_A1461BarAlbPN ;
   private int[] P09532_A1265BarAlbPie ;
   private String[] P09532_A1234BarNomCli ;
   private String[] P09532_A13711BarTipArtD ;
   private boolean[] P09532_n13711BarTipArtD ;
   private String[] P09532_A1652BarSerDsc ;
   private java.util.Date[] P09532_A155BarFecCli ;
   private long[] P09532_A30AlbProCod ;
   private String[] P09532_A1244GuiRemCln ;
   private String[] P09532_A130BarCodPar ;
   private byte[] P09532_A132BarCodReo ;
   private int[] P09532_A129BarCod ;
   private String[] P09532_A143BarDisNum ;
   private String[] P09532_A4812BarEncCli ;
   private String[] P09532_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV29ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV30ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV31ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class informealbaranesproducciondetallado_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09532( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV82Clicod ,
                                          int AV83Clicod_to ,
                                          java.util.Date AV84ALbProfch ,
                                          java.util.Date AV85ALbProfch_to ,
                                          String AV86Barser ,
                                          String AV87Barser_to ,
                                          String AV102BarColNom ,
                                          String AV103BarColNom_to ,
                                          int AV90BarColNum ,
                                          int AV91BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV92Prio ,
                                          String AV88AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV89AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV119Barestreoi ,
                                          byte AV120barestreof ,
                                          String A2010BarTipDis ,
                                          String AV121TipDisCod ,
                                          String A5140AlbMarca ,
                                          String AV81Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[17];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T2.BarTipArt AS BarTipArt, T3.EmprGuiRem AS EmprGuiRem, T3.AlbMarca, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli" ;
      scmdbuf += " AS GuiRemCli, T3.AlbProPri, T2.CliCod, T2.BarTipCol, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE, T1.BarAlbPN, T1.BarAlbPie, T2.BarNomCli, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T2.BarSerDsc, T2.BarFecCli, T1.AlbProCod, T4.CliNom AS GuiRemCln, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((TXPALBBAR" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T2.BarTipArt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV82Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (0==AV83Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV90BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV91BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbProfch" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbProfch DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_P09532(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09532", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 26);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((long[]) buf[26])[0] = rslt.getLong(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

