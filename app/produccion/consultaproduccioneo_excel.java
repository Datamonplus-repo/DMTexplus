package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaproduccioneo_excel extends GXProcedure
{
   public consultaproduccioneo_excel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccioneo_excel.class ), "" );
   }

   public consultaproduccioneo_excel( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultaproduccioneo_excel.this.aP1 = new String[] {""};
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
      consultaproduccioneo_excel.this.aP0 = aP0;
      consultaproduccioneo_excel.this.aP1 = aP1;
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
      AV67Emprcod = AV9WWPContext.getgxTv_SdtWWPContext_Emprcod() ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
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
      S211 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEMAINTITLE' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEFILTERS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S171 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S201 ();
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
      AV11Filename = "ConsultaProduccion_Tabla_MaterializadaExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV11Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEMAINTITLE' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 11 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( httpContext.getMessage( "Consulta de Produccion", "") );
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (GXutil.strcmp("", AV117FilterFullText)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultaproduccioneo_excel.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV117FilterFullText, GXv_char5) ;
         consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S151( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV126VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector"), "") != 0 )
      {
         AV121ColumnsSelectorXML = AV18Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector") ;
         AV118ColumnsSelector.fromxml(AV121ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S161 ();
         if (returnInSub) return;
      }
      AV120ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      AV120ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Isvisible( true );
      AV120ColumnsSelector_Column.setgxTv_SdtWWPColumnsSelector_Column_Columnname( httpContext.getMessage( "Empresa", "") );
      AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().add(AV120ColumnsSelector_Column, 1);
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV120ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV132GXV1));
         if ( AV120ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV120ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV120ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV120ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setColor( 11 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
      }
      AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().removeItem(1);
   }

   public void S171( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = AV117FilterFullText ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                           AV68bardisnumfrom ,
                                           AV69bardisnumto ,
                                           Integer.valueOf(AV70CliCodfrom) ,
                                           Integer.valueOf(AV71CliCodto) ,
                                           Byte.valueOf(AV72BarSitfrom) ,
                                           Byte.valueOf(AV73BarSitto) ,
                                           AV74barfecgenfrom ,
                                           AV75barfecgento ,
                                           AV76barfecsalfrom ,
                                           AV77barfecsalto ,
                                           AV78BarFecClifrom ,
                                           AV79barfecclito ,
                                           AV80BarFecFprfrom ,
                                           AV81barfecfprto ,
                                           AV82BarSerfrom ,
                                           AV83BarSerto ,
                                           AV84BarColNomfrom ,
                                           AV85BarColNomto ,
                                           Integer.valueOf(AV86BarColnumfrom) ,
                                           Integer.valueOf(AV87BarColNumto) ,
                                           AV88BarNomClifrom ,
                                           AV89BarNomClito ,
                                           Integer.valueOf(AV90BarNumClifrom) ,
                                           Integer.valueOf(AV91Barnumclito) ,
                                           Short.valueOf(AV92BarTipArtfrom) ,
                                           Short.valueOf(AV93BarTipArtto) ,
                                           AV94TFBarPlf ,
                                           Integer.valueOf(AV95BarCodfrom) ,
                                           Integer.valueOf(AV96BarCodto) ,
                                           Byte.valueOf(AV97BarCodreofrom) ,
                                           Byte.valueOf(AV98BarCodreoto) ,
                                           AV99BarCodparfrom ,
                                           AV100BarCodparto ,
                                           AV101Cod_idtx ,
                                           AV102BarGirar ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV67Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext), "%", "") ;
      /* Using cursor P0ABB2 */
      pr_default.execute(0, new Object[] {AV67Emprcod, lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext, AV68bardisnumfrom, AV69bardisnumto, Integer.valueOf(AV70CliCodfrom), Integer.valueOf(AV71CliCodto), Byte.valueOf(AV72BarSitfrom), Byte.valueOf(AV73BarSitto), AV74barfecgenfrom, AV75barfecgento, AV76barfecsalfrom, AV77barfecsalto, AV78BarFecClifrom, AV79barfecclito, AV80BarFecFprfrom, AV81barfecfprto, AV82BarSerfrom, AV83BarSerto, AV84BarColNomfrom, AV85BarColNomto, Integer.valueOf(AV86BarColnumfrom), Integer.valueOf(AV87BarColNumto), AV88BarNomClifrom, AV89BarNomClito, Integer.valueOf(AV90BarNumClifrom), Integer.valueOf(AV91Barnumclito), Short.valueOf(AV92BarTipArtfrom), Short.valueOf(AV93BarTipArtto), AV94TFBarPlf, Integer.valueOf(AV95BarCodfrom), Integer.valueOf(AV96BarCodto), Byte.valueOf(AV97BarCodreofrom), Byte.valueOf(AV98BarCodreoto), AV99BarCodparfrom, AV100BarCodparto, AV101Cod_idtx, AV102BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14317CP_BARGIRA = P0ABB2_A14317CP_BARGIRA[0] ;
         A14323CP_BARPROP = P0ABB2_A14323CP_BARPROP[0] ;
         A14303CP_BARCODP = P0ABB2_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = P0ABB2_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = P0ABB2_A14301CP_BARCOD[0] ;
         A14306CP_BARPLF = P0ABB2_A14306CP_BARPLF[0] ;
         A14316CP_BARTIPA = P0ABB2_A14316CP_BARTIPA[0] ;
         A14305CP_BARNUMC = P0ABB2_A14305CP_BARNUMC[0] ;
         A14315CP_BARNOMC = P0ABB2_A14315CP_BARNOMC[0] ;
         A14332CP_BARCOLU = P0ABB2_A14332CP_BARCOLU[0] ;
         A14331CP_BARCOLO = P0ABB2_A14331CP_BARCOLO[0] ;
         A14311CP_BARSER = P0ABB2_A14311CP_BARSER[0] ;
         A14304CP_BARFECF = P0ABB2_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = P0ABB2_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = P0ABB2_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = P0ABB2_A14308CP_BARFECG[0] ;
         A14307CP_BARSIT = P0ABB2_A14307CP_BARSIT[0] ;
         A14326CP_CLICOD = P0ABB2_A14326CP_CLICOD[0] ;
         A14328CP_EMPRCOD = P0ABB2_A14328CP_EMPRCOD[0] ;
         A14324CP_BARDISN = P0ABB2_A14324CP_BARDISN[0] ;
         A14327CP_CLINOM = P0ABB2_A14327CP_CLINOM[0] ;
         A14341CP_DISUSRC = P0ABB2_A14341CP_DISUSRC[0] ;
         A14334CP_DSC_BAR = P0ABB2_A14334CP_DSC_BAR[0] ;
         A14340CP_BARALBM = P0ABB2_A14340CP_BARALBM[0] ;
         A14339CP_BARALBK = P0ABB2_A14339CP_BARALBK[0] ;
         A14338CP_BARPIE = P0ABB2_A14338CP_BARPIE[0] ;
         A14337CP_BARMTR = P0ABB2_A14337CP_BARMTR[0] ;
         A14336CP_BARKGM = P0ABB2_A14336CP_BARKGM[0] ;
         A14343CP_TARTDSC = P0ABB2_A14343CP_TARTDSC[0] ;
         A14312CP_BARSERD = P0ABB2_A14312CP_BARSERD[0] ;
         A14319CP_BARAGRE = P0ABB2_A14319CP_BARAGRE[0] ;
         A14297CP_ID = P0ABB2_A14297CP_ID[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV126VisibleColumnCount = 0 ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14328CP_EMPRCOD, GXv_char5) ;
         consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
         AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14326CP_CLICOD );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14327CP_CLINOM, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14324CP_BARDISN, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14301CP_BARCOD );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14302CP_BARCODR );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14303CP_BARCODP, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14319CP_BARAGRE, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14311CP_BARSER, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14312CP_BARSERD, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14316CP_BARTIPA );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14343CP_TARTDSC, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14331CP_BARCOLO, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14332CP_BARCOLU );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14315CP_BARNOMC, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14336CP_BARKGM)) );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14337CP_BARMTR)) );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14338CP_BARPIE );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( A14307CP_BARSIT );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14308CP_BARFECG );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14309CP_BARFECC );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14304CP_BARFECF );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14310CP_BARFECS );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14339CP_BARALBK)) );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14340CP_BARALBM)) );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14317CP_BARGIRA, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14323CP_BARPROP, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14334CP_DSC_BAR, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV118ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14341CP_DISUSRC, GXv_char5) ;
            consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV126VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV126VisibleColumnCount = (long)(AV126VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S192 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S201( )
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

   public void S161( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV118ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_CLICOD", "", "Cliente", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_CLINOM", "", "Nombre", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARDISNUM", "", "Ped. Cli.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOD", "", "Nº Hdr", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCODREO", "", "R", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCODPAR", "", "P", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARAGREST", "", "A?", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSER", "", "Articulo", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSERDSC", "", "Descripcion", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARTIPART", "", "Tip. Art.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_TARTDSC", "", "Descripcion", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOLO", "", "Color", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOLU", "", "Numero", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARNOMCLI", "", "Color Cli.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARKGM", "", "KIlos", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARMTR", "", "Metros", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARPIE", "", "Piezas", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSIT", "", "Sit.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECGEN", "Fecha", "Fecha HDR", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECCLI", "Fecha", "Ped. Cli.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECFPR", "Fecha", "Ent. Prev.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECSAL", "", "Salida", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarFasCod", "", "Ult. Fase", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarFasSig", "", "Sig. Fase", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbUltimo", "", "Ultimo Alb.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARALBK", "", "Kgs. Sal.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARALBM", "", "Mts. Sal.", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbFact", "", "Factura", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARGIRAR", "", "Coleccion", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARPROPER", "", "Ctw", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_DSC_BAR", "", "Descripcion", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV118ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_DISUSRC", "", "Usuario", true, "") ;
      AV118ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV122UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultaProduccion_Tabla_MaterializadaColumnsSelector", GXv_char5) ;
      consultaproduccioneo_excel.this.GXt_char4 = GXv_char5[0] ;
      AV122UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV122UserCustomValue)==0) ) )
      {
         AV119ColumnsSelectorAux.fromxml(AV122UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV119ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV118ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV119ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV118ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S211( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultaProduccion_Tabla_MaterializadaGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("Produccion.ConsultaProduccion_Tabla_MaterializadaGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV135GXV2 = 1 ;
      while ( AV135GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV135GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV117FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV135GXV2 = (int)(AV135GXV2+1) ;
      }
   }

   public void S182( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = consultaproduccioneo_excel.this.AV11Filename;
      this.aP1[0] = consultaproduccioneo_excel.this.AV12ErrorMessage;
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
      AV67Emprcod = "" ;
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV117FilterFullText = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV121ColumnsSelectorXML = "" ;
      AV118ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV120ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14328CP_EMPRCOD = "" ;
      A14327CP_CLINOM = "" ;
      A14324CP_BARDISN = "" ;
      A14303CP_BARCODP = "" ;
      A14319CP_BARAGRE = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14343CP_TARTDSC = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext = "" ;
      AV68bardisnumfrom = "" ;
      AV69bardisnumto = "" ;
      AV74barfecgenfrom = GXutil.nullDate() ;
      AV75barfecgento = GXutil.nullDate() ;
      AV76barfecsalfrom = GXutil.nullDate() ;
      AV77barfecsalto = GXutil.nullDate() ;
      AV78BarFecClifrom = GXutil.nullDate() ;
      AV79barfecclito = GXutil.nullDate() ;
      AV80BarFecFprfrom = GXutil.nullDate() ;
      AV81barfecfprto = GXutil.nullDate() ;
      AV82BarSerfrom = "" ;
      AV83BarSerto = "" ;
      AV84BarColNomfrom = "" ;
      AV85BarColNomto = "" ;
      AV88BarNomClifrom = "" ;
      AV89BarNomClito = "" ;
      AV94TFBarPlf = "" ;
      AV99BarCodparfrom = "" ;
      AV100BarCodparto = "" ;
      AV101Cod_idtx = "" ;
      AV102BarGirar = "" ;
      A14306CP_BARPLF = "" ;
      P0ABB2_A14317CP_BARGIRA = new String[] {""} ;
      P0ABB2_A14323CP_BARPROP = new String[] {""} ;
      P0ABB2_A14303CP_BARCODP = new String[] {""} ;
      P0ABB2_A14302CP_BARCODR = new byte[1] ;
      P0ABB2_A14301CP_BARCOD = new int[1] ;
      P0ABB2_A14306CP_BARPLF = new String[] {""} ;
      P0ABB2_A14316CP_BARTIPA = new short[1] ;
      P0ABB2_A14305CP_BARNUMC = new int[1] ;
      P0ABB2_A14315CP_BARNOMC = new String[] {""} ;
      P0ABB2_A14332CP_BARCOLU = new int[1] ;
      P0ABB2_A14331CP_BARCOLO = new String[] {""} ;
      P0ABB2_A14311CP_BARSER = new String[] {""} ;
      P0ABB2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABB2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABB2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABB2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0ABB2_A14307CP_BARSIT = new byte[1] ;
      P0ABB2_A14326CP_CLICOD = new int[1] ;
      P0ABB2_A14328CP_EMPRCOD = new String[] {""} ;
      P0ABB2_A14324CP_BARDISN = new String[] {""} ;
      P0ABB2_A14327CP_CLINOM = new String[] {""} ;
      P0ABB2_A14341CP_DISUSRC = new String[] {""} ;
      P0ABB2_A14334CP_DSC_BAR = new String[] {""} ;
      P0ABB2_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABB2_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABB2_A14338CP_BARPIE = new int[1] ;
      P0ABB2_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABB2_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABB2_A14343CP_TARTDSC = new String[] {""} ;
      P0ABB2_A14312CP_BARSERD = new String[] {""} ;
      P0ABB2_A14319CP_BARAGRE = new String[] {""} ;
      P0ABB2_A14297CP_ID = new long[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV122UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV119ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultaproduccioneo_excel__default(),
         new Object[] {
             new Object[] {
            P0ABB2_A14317CP_BARGIRA, P0ABB2_A14323CP_BARPROP, P0ABB2_A14303CP_BARCODP, P0ABB2_A14302CP_BARCODR, P0ABB2_A14301CP_BARCOD, P0ABB2_A14306CP_BARPLF, P0ABB2_A14316CP_BARTIPA, P0ABB2_A14305CP_BARNUMC, P0ABB2_A14315CP_BARNOMC, P0ABB2_A14332CP_BARCOLU,
            P0ABB2_A14331CP_BARCOLO, P0ABB2_A14311CP_BARSER, P0ABB2_A14304CP_BARFECF, P0ABB2_A14309CP_BARFECC, P0ABB2_A14310CP_BARFECS, P0ABB2_A14308CP_BARFECG, P0ABB2_A14307CP_BARSIT, P0ABB2_A14326CP_CLICOD, P0ABB2_A14328CP_EMPRCOD, P0ABB2_A14324CP_BARDISN,
            P0ABB2_A14327CP_CLINOM, P0ABB2_A14341CP_DISUSRC, P0ABB2_A14334CP_DSC_BAR, P0ABB2_A14340CP_BARALBM, P0ABB2_A14339CP_BARALBK, P0ABB2_A14338CP_BARPIE, P0ABB2_A14337CP_BARMTR, P0ABB2_A14336CP_BARKGM, P0ABB2_A14343CP_TARTDSC, P0ABB2_A14312CP_BARSERD,
            P0ABB2_A14319CP_BARAGRE, P0ABB2_A14297CP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private byte AV72BarSitfrom ;
   private byte AV73BarSitto ;
   private byte AV97BarCodreofrom ;
   private byte AV98BarCodreoto ;
   private short GXv_int3[] ;
   private short A14316CP_BARTIPA ;
   private short AV92BarTipArtfrom ;
   private short AV93BarTipArtto ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV132GXV1 ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int AV70CliCodfrom ;
   private int AV71CliCodto ;
   private int AV86BarColnumfrom ;
   private int AV87BarColNumto ;
   private int AV90BarNumClifrom ;
   private int AV91Barnumclito ;
   private int AV95BarCodfrom ;
   private int AV96BarCodto ;
   private int A14305CP_BARNUMC ;
   private int AV135GXV2 ;
   private long AV126VisibleColumnCount ;
   private long A14297CP_ID ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String AV67Emprcod ;
   private String A14328CP_EMPRCOD ;
   private String A14324CP_BARDISN ;
   private String A14303CP_BARCODP ;
   private String A14319CP_BARAGRE ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14323CP_BARPROP ;
   private String A14341CP_DISUSRC ;
   private String scmdbuf ;
   private String AV68bardisnumfrom ;
   private String AV69bardisnumto ;
   private String AV82BarSerfrom ;
   private String AV83BarSerto ;
   private String AV84BarColNomfrom ;
   private String AV85BarColNomto ;
   private String AV88BarNomClifrom ;
   private String AV89BarNomClito ;
   private String AV94TFBarPlf ;
   private String AV99BarCodparfrom ;
   private String AV100BarCodparto ;
   private String AV101Cod_idtx ;
   private String AV102BarGirar ;
   private String A14306CP_BARPLF ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date AV74barfecgenfrom ;
   private java.util.Date AV75barfecgento ;
   private java.util.Date AV76barfecsalfrom ;
   private java.util.Date AV77barfecsalto ;
   private java.util.Date AV78BarFecClifrom ;
   private java.util.Date AV79barfecclito ;
   private java.util.Date AV80BarFecFprfrom ;
   private java.util.Date AV81barfecfprto ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV121ColumnsSelectorXML ;
   private String AV122UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV117FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private String AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ;
   private String lV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABB2_A14317CP_BARGIRA ;
   private String[] P0ABB2_A14323CP_BARPROP ;
   private String[] P0ABB2_A14303CP_BARCODP ;
   private byte[] P0ABB2_A14302CP_BARCODR ;
   private int[] P0ABB2_A14301CP_BARCOD ;
   private String[] P0ABB2_A14306CP_BARPLF ;
   private short[] P0ABB2_A14316CP_BARTIPA ;
   private int[] P0ABB2_A14305CP_BARNUMC ;
   private String[] P0ABB2_A14315CP_BARNOMC ;
   private int[] P0ABB2_A14332CP_BARCOLU ;
   private String[] P0ABB2_A14331CP_BARCOLO ;
   private String[] P0ABB2_A14311CP_BARSER ;
   private java.util.Date[] P0ABB2_A14304CP_BARFECF ;
   private java.util.Date[] P0ABB2_A14309CP_BARFECC ;
   private java.util.Date[] P0ABB2_A14310CP_BARFECS ;
   private java.util.Date[] P0ABB2_A14308CP_BARFECG ;
   private byte[] P0ABB2_A14307CP_BARSIT ;
   private int[] P0ABB2_A14326CP_CLICOD ;
   private String[] P0ABB2_A14328CP_EMPRCOD ;
   private String[] P0ABB2_A14324CP_BARDISN ;
   private String[] P0ABB2_A14327CP_CLINOM ;
   private String[] P0ABB2_A14341CP_DISUSRC ;
   private String[] P0ABB2_A14334CP_DSC_BAR ;
   private java.math.BigDecimal[] P0ABB2_A14340CP_BARALBM ;
   private java.math.BigDecimal[] P0ABB2_A14339CP_BARALBK ;
   private int[] P0ABB2_A14338CP_BARPIE ;
   private java.math.BigDecimal[] P0ABB2_A14337CP_BARMTR ;
   private java.math.BigDecimal[] P0ABB2_A14336CP_BARKGM ;
   private String[] P0ABB2_A14343CP_TARTDSC ;
   private String[] P0ABB2_A14312CP_BARSERD ;
   private String[] P0ABB2_A14319CP_BARAGRE ;
   private long[] P0ABB2_A14297CP_ID ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV118ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV119ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV120ColumnsSelector_Column ;
}

final  class consultaproduccioneo_excel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ABB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext ,
                                          String AV68bardisnumfrom ,
                                          String AV69bardisnumto ,
                                          int AV70CliCodfrom ,
                                          int AV71CliCodto ,
                                          byte AV72BarSitfrom ,
                                          byte AV73BarSitto ,
                                          java.util.Date AV74barfecgenfrom ,
                                          java.util.Date AV75barfecgento ,
                                          java.util.Date AV76barfecsalfrom ,
                                          java.util.Date AV77barfecsalto ,
                                          java.util.Date AV78BarFecClifrom ,
                                          java.util.Date AV79barfecclito ,
                                          java.util.Date AV80BarFecFprfrom ,
                                          java.util.Date AV81barfecfprto ,
                                          String AV82BarSerfrom ,
                                          String AV83BarSerto ,
                                          String AV84BarColNomfrom ,
                                          String AV85BarColNomto ,
                                          int AV86BarColnumfrom ,
                                          int AV87BarColNumto ,
                                          String AV88BarNomClifrom ,
                                          String AV89BarNomClito ,
                                          int AV90BarNumClifrom ,
                                          int AV91Barnumclito ,
                                          short AV92BarTipArtfrom ,
                                          short AV93BarTipArtto ,
                                          String AV94TFBarPlf ,
                                          int AV95BarCodfrom ,
                                          int AV96BarCodto ,
                                          byte AV97BarCodreofrom ,
                                          byte AV98BarCodreoto ,
                                          String AV99BarCodparfrom ,
                                          String AV100BarCodparto ,
                                          String AV101Cod_idtx ,
                                          String AV102BarGirar ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV67Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[38];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARPLF, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_BARSER, CP_BARFECF, CP_BARFECC," ;
      scmdbuf += " CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_EMPRCOD, CP_BARDISN, CP_CLINOM, CP_DISUSRC, CP_DSC_BAR, CP_BARALBM, CP_BARALBK, CP_BARPIE, CP_BARMTR, CP_BARKGM," ;
      scmdbuf += " CP_TARTDSC, CP_BARSERD, CP_BARAGRE, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV134Produccion_consultaproduccion_tabla_materializadads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69bardisnumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV70CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV71CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV72BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79barfecclito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81barfecfprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV86BarColnumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV87BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV90BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV91Barnumclito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV92BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV93BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV95BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV96BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodreofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV98BarCodreoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100BarCodparto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY CP_EMPRCOD, CP_CLICOD, CP_BARDISN, CP_BARFECG" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLICOD" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLICOD DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLINOM" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLINOM DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARDISN" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARDISN DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOD" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOD DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODR" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODR DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODP" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODP DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARAGRE" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARAGRE DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSER" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSER DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSERD" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSERD DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARTIPA" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARTIPA DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_TARTDSC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_TARTDSC DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLO" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLO DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLU" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLU DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARNOMC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARNOMC DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARKGM" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARKGM DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARMTR" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARMTR DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARPIE" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARPIE DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSIT" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSIT DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECG" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECG DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECC DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECF" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECF DESC" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECS" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECS DESC" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARALBK" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARALBK DESC" ;
      }
      else if ( ( AV16OrderedBy == 25 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARALBM" ;
      }
      else if ( ( AV16OrderedBy == 25 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARALBM DESC" ;
      }
      else if ( ( AV16OrderedBy == 26 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARGIRA" ;
      }
      else if ( ( AV16OrderedBy == 26 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARGIRA DESC" ;
      }
      else if ( ( AV16OrderedBy == 27 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARPROP" ;
      }
      else if ( ( AV16OrderedBy == 27 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARPROP DESC" ;
      }
      else if ( ( AV16OrderedBy == 28 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_DSC_BAR" ;
      }
      else if ( ( AV16OrderedBy == 28 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_DSC_BAR DESC" ;
      }
      else if ( ( AV16OrderedBy == 29 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_DISUSRC" ;
      }
      else if ( ( AV16OrderedBy == 29 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_DISUSRC DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P0ABB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 8);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getVarchar(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 1);
               ((long[]) buf[31])[0] = rslt.getLong(32);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               return;
      }
   }

}

