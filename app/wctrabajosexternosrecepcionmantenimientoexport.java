package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wctrabajosexternosrecepcionmantenimientoexport extends GXProcedure
{
   public wctrabajosexternosrecepcionmantenimientoexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctrabajosexternosrecepcionmantenimientoexport.class ), "" );
   }

   public wctrabajosexternosrecepcionmantenimientoexport( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wctrabajosexternosrecepcionmantenimientoexport.this.aP1 = new String[] {""};
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
      wctrabajosexternosrecepcionmantenimientoexport.this.aP0 = aP0;
      wctrabajosexternosrecepcionmantenimientoexport.this.aP1 = aP1;
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV15Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "WCTrabajosExternosRecepcionMantenimientoExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV41TFRpExHdLi) && (0==AV42TFRpExHdLi_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFRpExHdLi );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFRpExHdLi_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39TFRpExHdFe)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV39TFRpExHdFe );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV37TFRpExHdAlb) && (0==AV38TFRpExHdAlb_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV37TFRpExHdAlb );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV38TFRpExHdAlb_To );
      }
      if ( ! ( (0==AV43TFCliCod) && (0==AV44TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFCliNom_Sel, GXv_char5) ;
         wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFCliNom, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarSer_Sel, GXv_char5) ;
         wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarSer, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarSerDsc_Sel, GXv_char5) ;
         wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarSerDsc, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV92GXV1));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = AV18FilterFullText ;
      AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli = AV41TFRpExHdLi ;
      AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to = AV42TFRpExHdLi_To ;
      AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = AV39TFRpExHdFe ;
      AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb = AV37TFRpExHdAlb ;
      AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to = AV38TFRpExHdAlb_To ;
      AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod = AV43TFCliCod ;
      AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to = AV44TFCliCod_To ;
      AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = AV45TFCliNom ;
      AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = AV46TFCliNom_Sel ;
      AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = AV47TFBarSer ;
      AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = AV48TFBarSer_Sel ;
      AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = AV49TFBarSerDsc ;
      AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                           Short.valueOf(AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) ,
                                           Short.valueOf(AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) ,
                                           AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                           Integer.valueOf(AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) ,
                                           Integer.valueOf(AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) ,
                                           Integer.valueOf(AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) ,
                                           Integer.valueOf(AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) ,
                                           AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                           AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                           AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                           AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                           AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                           AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                           Short.valueOf(A2713RpExHdLi) ,
                                           Integer.valueOf(A2714RpExHdAlb) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A2711RpExHdFe ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV54EmprCod ,
                                           Short.valueOf(AV55Mancod) ,
                                           AV56RpExHdFe ,
                                           A396EmprCod ,
                                           Short.valueOf(A2248ManCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext), "%", "") ;
      lV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = GXutil.padr( GXutil.rtrim( AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom), 30, "%") ;
      lV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = GXutil.padr( GXutil.rtrim( AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser), 16, "%") ;
      lV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc), 26, "%") ;
      /* Using cursor P091G2 */
      pr_default.execute(0, new Object[] {AV54EmprCod, Short.valueOf(AV55Mancod), AV56RpExHdFe, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext, Short.valueOf(AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli), Short.valueOf(AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to), AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe, Integer.valueOf(AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb), Integer.valueOf(AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to), Integer.valueOf(AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod), Integer.valueOf(AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to), lV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom, AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel, lV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser, AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel, lV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc, AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2248ManCod = P091G2_A2248ManCod[0] ;
         A396EmprCod = P091G2_A396EmprCod[0] ;
         A1652BarSerDsc = P091G2_A1652BarSerDsc[0] ;
         A212BarSer = P091G2_A212BarSer[0] ;
         A279CliNom = P091G2_A279CliNom[0] ;
         A252CliCod = P091G2_A252CliCod[0] ;
         n252CliCod = P091G2_n252CliCod[0] ;
         A2714RpExHdAlb = P091G2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091G2_n2714RpExHdAlb[0] ;
         A2711RpExHdFe = P091G2_A2711RpExHdFe[0] ;
         A2713RpExHdLi = P091G2_A2713RpExHdLi[0] ;
         A2716RpExHdCns = P091G2_A2716RpExHdCns[0] ;
         n2716RpExHdCns = P091G2_n2716RpExHdCns[0] ;
         A6262RpExSalLn = P091G2_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P091G2_n6262RpExSalLn[0] ;
         A130BarCodPar = P091G2_A130BarCodPar[0] ;
         A132BarCodReo = P091G2_A132BarCodReo[0] ;
         A129BarCod = P091G2_A129BarCod[0] ;
         A2715RpExHdKgs = P091G2_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = P091G2_n2715RpExHdKgs[0] ;
         A2847RpExHdMts = P091G2_A2847RpExHdMts[0] ;
         n2847RpExHdMts = P091G2_n2847RpExHdMts[0] ;
         A2717RpExHdTip = P091G2_A2717RpExHdTip[0] ;
         n2717RpExHdTip = P091G2_n2717RpExHdTip[0] ;
         A1652BarSerDsc = P091G2_A1652BarSerDsc[0] ;
         A212BarSer = P091G2_A212BarSer[0] ;
         A252CliCod = P091G2_A252CliCod[0] ;
         n252CliCod = P091G2_n252CliCod[0] ;
         A279CliNom = P091G2_A279CliNom[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV34VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A2713RpExHdLi );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A2711RpExHdFe );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A2714RpExHdAlb );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV23RpExHdCns = A2716RpExHdCns ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( AV23RpExHdCns );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int7 = AV85Pzs ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int8[0] = A2714RpExHdAlb ;
            GXv_int9[0] = A129BarCod ;
            GXv_int10[0] = A132BarCodReo ;
            GXv_char11[0] = A130BarCodPar ;
            GXv_int3[0] = A2248ManCod ;
            GXv_int12[0] = A6262RpExSalLn ;
            GXv_int13[0] = (byte)(AV89FlagLin) ;
            GXv_int14[0] = GXt_int7 ;
            new app.piezaspendientesexhdpz(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_int9, GXv_int10, GXv_char11, GXv_int3, GXv_int12, GXv_int13, GXv_int14) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A396EmprCod = GXv_char5[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2714RpExHdAlb = GXv_int8[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A129BarCod = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A132BarCodReo = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A130BarCodPar = GXv_char11[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2248ManCod = GXv_int3[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A6262RpExSalLn = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV89FlagLin = GXv_int13[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_int7 = GXv_int14[0] ;
            AV85Pzs = (short)(GXt_int7) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( AV85Pzs );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV24RpExHdKgs = A2715RpExHdKgs ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24RpExHdKgs)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_decimal15 = AV86Kgs ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int14[0] = A2714RpExHdAlb ;
            GXv_int9[0] = A129BarCod ;
            GXv_int13[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int12[0] = A2248ManCod ;
            GXv_int3[0] = A6262RpExSalLn ;
            GXv_int10[0] = (byte)(AV89FlagLin) ;
            GXv_decimal16[0] = GXt_decimal15 ;
            new app.kilospendientesexhdpz(remoteHandle, context).execute( GXv_char11, GXv_int14, GXv_int9, GXv_int13, GXv_char5, GXv_int12, GXv_int3, GXv_int10, GXv_decimal16) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A396EmprCod = GXv_char11[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2714RpExHdAlb = GXv_int14[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A129BarCod = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A132BarCodReo = GXv_int13[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A130BarCodPar = GXv_char5[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2248ManCod = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A6262RpExSalLn = GXv_int3[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV89FlagLin = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_decimal15 = GXv_decimal16[0] ;
            AV86Kgs = GXt_decimal15 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86Kgs)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV25RpExHdMts = A2847RpExHdMts ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV25RpExHdMts)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_decimal15 = AV87Mts ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int14[0] = A2714RpExHdAlb ;
            GXv_int9[0] = A129BarCod ;
            GXv_int13[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int12[0] = A2248ManCod ;
            GXv_int3[0] = A6262RpExSalLn ;
            GXv_int10[0] = (byte)(AV89FlagLin) ;
            GXv_decimal16[0] = GXt_decimal15 ;
            new app.metrospendientesexhdpz(remoteHandle, context).execute( GXv_char11, GXv_int14, GXv_int9, GXv_int13, GXv_char5, GXv_int12, GXv_int3, GXv_int10, GXv_decimal16) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A396EmprCod = GXv_char11[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2714RpExHdAlb = GXv_int14[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A129BarCod = GXv_int9[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A132BarCodReo = GXv_int13[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A130BarCodPar = GXv_char5[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A2248ManCod = GXv_int12[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.A6262RpExSalLn = GXv_int3[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.AV89FlagLin = GXv_int10[0] ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_decimal15 = GXv_decimal16[0] ;
            AV87Mts = GXt_decimal15 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87Mts)) );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57RpExHdTip = A2717RpExHdTip ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( AV57RpExHdTip), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Parcial", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV57RpExHdTip), httpContext.getMessage( "T", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Total", "") );
            }
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV88Flag = ((GXutil.strcmp(AV57RpExHdTip, "T")==0) ? "S" : "N") ;
            GXt_char4 = "" ;
            GXv_char11[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88Flag, GXv_char11) ;
            wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char11[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "RpExHdLi", "", "#", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "RpExHdFe", "", "Fecha Recepcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "RpExHdAlb", "", "Nº Documento", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "CliCod", "", "Cliente", false, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "CliNom", "", "Nombre Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarSer", "", "Serie", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&RpExHdCns", "Recepcion", "Piezas", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Pzs", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&RpExHdKgs", "Recepcion", "Kgs", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Kgs", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&RpExHdMts", "Recepcion", "Metros", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Mts", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&RpExHdTip", "", "Tipo Entrega", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Flag", "", "Cerrar Fase?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXv_SdtWWPColumnsSelector17[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, "&Informacion", "", "Inf Fase", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector17[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char11[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCTrabajosExternosRecepcionMantenimientoColumnsSelector", GXv_char11) ;
      wctrabajosexternosrecepcionmantenimientoexport.this.GXt_char4 = GXv_char11[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector17[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector18[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector17, GXv_SdtWWPColumnsSelector18) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector17[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCTrabajosExternosRecepcionMantenimientoGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV108GXV2 = 1 ;
      while ( AV108GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDLI") == 0 )
         {
            AV41TFRpExHdLi = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFRpExHdLi_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDFE") == 0 )
         {
            AV39TFRpExHdFe = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPEXHDALB") == 0 )
         {
            AV37TFRpExHdAlb = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFRpExHdAlb_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV43TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV45TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV46TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV47TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV48TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV49TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV50TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV108GXV2 = (int)(AV108GXV2+1) ;
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

   protected void cleanup( )
   {
      this.aP0[0] = wctrabajosexternosrecepcionmantenimientoexport.this.AV11Filename;
      this.aP1[0] = wctrabajosexternosrecepcionmantenimientoexport.this.AV12ErrorMessage;
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
      AV18FilterFullText = "" ;
      AV39TFRpExHdFe = GXutil.nullDate() ;
      AV46TFCliNom_Sel = "" ;
      AV45TFCliNom = "" ;
      AV48TFBarSer_Sel = "" ;
      AV47TFBarSer = "" ;
      AV50TFBarSerDsc_Sel = "" ;
      AV49TFBarSerDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV19Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A2711RpExHdFe = GXutil.nullDate() ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2717RpExHdTip = "" ;
      AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe = GXutil.nullDate() ;
      AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel = "" ;
      AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel = "" ;
      AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel = "" ;
      scmdbuf = "" ;
      lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext = "" ;
      lV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom = "" ;
      lV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser = "" ;
      lV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc = "" ;
      AV54EmprCod = "" ;
      AV56RpExHdFe = GXutil.nullDate() ;
      P091G2_A2248ManCod = new short[1] ;
      P091G2_A396EmprCod = new String[] {""} ;
      P091G2_A1652BarSerDsc = new String[] {""} ;
      P091G2_A212BarSer = new String[] {""} ;
      P091G2_A279CliNom = new String[] {""} ;
      P091G2_A252CliCod = new int[1] ;
      P091G2_n252CliCod = new boolean[] {false} ;
      P091G2_A2714RpExHdAlb = new int[1] ;
      P091G2_n2714RpExHdAlb = new boolean[] {false} ;
      P091G2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091G2_A2713RpExHdLi = new short[1] ;
      P091G2_A2716RpExHdCns = new short[1] ;
      P091G2_n2716RpExHdCns = new boolean[] {false} ;
      P091G2_A6262RpExSalLn = new short[1] ;
      P091G2_n6262RpExSalLn = new boolean[] {false} ;
      P091G2_A130BarCodPar = new String[] {""} ;
      P091G2_A132BarCodReo = new byte[1] ;
      P091G2_A129BarCod = new int[1] ;
      P091G2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091G2_n2715RpExHdKgs = new boolean[] {false} ;
      P091G2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091G2_n2847RpExHdMts = new boolean[] {false} ;
      P091G2_A2717RpExHdTip = new String[] {""} ;
      P091G2_n2717RpExHdTip = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_int8 = new int[1] ;
      AV24RpExHdKgs = DecimalUtil.ZERO ;
      AV86Kgs = DecimalUtil.ZERO ;
      AV25RpExHdMts = DecimalUtil.ZERO ;
      AV87Mts = DecimalUtil.ZERO ;
      GXt_decimal15 = DecimalUtil.ZERO ;
      GXv_int14 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int3 = new short[1] ;
      GXv_int10 = new byte[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      AV57RpExHdTip = "" ;
      AV88Flag = "" ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char11 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector17 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctrabajosexternosrecepcionmantenimientoexport__default(),
         new Object[] {
             new Object[] {
            P091G2_A2248ManCod, P091G2_A396EmprCod, P091G2_A1652BarSerDsc, P091G2_A212BarSer, P091G2_A279CliNom, P091G2_A252CliCod, P091G2_n252CliCod, P091G2_A2714RpExHdAlb, P091G2_n2714RpExHdAlb, P091G2_A2711RpExHdFe,
            P091G2_A2713RpExHdLi, P091G2_A2716RpExHdCns, P091G2_n2716RpExHdCns, P091G2_A6262RpExSalLn, P091G2_n6262RpExSalLn, P091G2_A130BarCodPar, P091G2_A132BarCodReo, P091G2_A129BarCod, P091G2_A2715RpExHdKgs, P091G2_n2715RpExHdKgs,
            P091G2_A2847RpExHdMts, P091G2_n2847RpExHdMts, P091G2_A2717RpExHdTip, P091G2_n2717RpExHdTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int13[] ;
   private byte GXv_int10[] ;
   private short AV41TFRpExHdLi ;
   private short AV42TFRpExHdLi_To ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A2248ManCod ;
   private short A6262RpExSalLn ;
   private short AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ;
   private short AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ;
   private short AV16OrderedBy ;
   private short AV55Mancod ;
   private short AV23RpExHdCns ;
   private short AV85Pzs ;
   private short AV89FlagLin ;
   private short GXv_int12[] ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV37TFRpExHdAlb ;
   private int AV38TFRpExHdAlb_To ;
   private int AV43TFCliCod ;
   private int AV44TFCliCod_To ;
   private int AV92GXV1 ;
   private int A2714RpExHdAlb ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ;
   private int AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ;
   private int AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ;
   private int AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int GXv_int14[] ;
   private int GXv_int9[] ;
   private int AV108GXV2 ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal AV24RpExHdKgs ;
   private java.math.BigDecimal AV86Kgs ;
   private java.math.BigDecimal AV25RpExHdMts ;
   private java.math.BigDecimal AV87Mts ;
   private java.math.BigDecimal GXt_decimal15 ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String AV46TFCliNom_Sel ;
   private String AV45TFCliNom ;
   private String AV48TFBarSer_Sel ;
   private String AV47TFBarSer ;
   private String AV50TFBarSerDsc_Sel ;
   private String AV49TFBarSerDsc ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2717RpExHdTip ;
   private String AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ;
   private String AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ;
   private String AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ;
   private String scmdbuf ;
   private String lV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ;
   private String lV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ;
   private String lV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ;
   private String AV54EmprCod ;
   private String GXv_char5[] ;
   private String AV57RpExHdTip ;
   private String AV88Flag ;
   private String GXt_char4 ;
   private String GXv_char11[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV39TFRpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private java.util.Date AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ;
   private java.util.Date AV56RpExHdFe ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n2714RpExHdAlb ;
   private boolean n2716RpExHdCns ;
   private boolean n6262RpExSalLn ;
   private boolean n2715RpExHdKgs ;
   private boolean n2847RpExHdMts ;
   private boolean n2717RpExHdTip ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private String lV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P091G2_A2248ManCod ;
   private String[] P091G2_A396EmprCod ;
   private String[] P091G2_A1652BarSerDsc ;
   private String[] P091G2_A212BarSer ;
   private String[] P091G2_A279CliNom ;
   private int[] P091G2_A252CliCod ;
   private boolean[] P091G2_n252CliCod ;
   private int[] P091G2_A2714RpExHdAlb ;
   private boolean[] P091G2_n2714RpExHdAlb ;
   private java.util.Date[] P091G2_A2711RpExHdFe ;
   private short[] P091G2_A2713RpExHdLi ;
   private short[] P091G2_A2716RpExHdCns ;
   private boolean[] P091G2_n2716RpExHdCns ;
   private short[] P091G2_A6262RpExSalLn ;
   private boolean[] P091G2_n6262RpExSalLn ;
   private String[] P091G2_A130BarCodPar ;
   private byte[] P091G2_A132BarCodReo ;
   private int[] P091G2_A129BarCod ;
   private java.math.BigDecimal[] P091G2_A2715RpExHdKgs ;
   private boolean[] P091G2_n2715RpExHdKgs ;
   private java.math.BigDecimal[] P091G2_A2847RpExHdMts ;
   private boolean[] P091G2_n2847RpExHdMts ;
   private String[] P091G2_A2717RpExHdTip ;
   private boolean[] P091G2_n2717RpExHdTip ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector17[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wctrabajosexternosrecepcionmantenimientoexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext ,
                                          short AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli ,
                                          short AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to ,
                                          java.util.Date AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe ,
                                          int AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb ,
                                          int AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to ,
                                          int AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod ,
                                          int AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to ,
                                          String AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel ,
                                          String AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom ,
                                          String AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel ,
                                          String AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser ,
                                          String AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel ,
                                          String AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc ,
                                          short A2713RpExHdLi ,
                                          int A2714RpExHdAlb ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.util.Date A2711RpExHdFe ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV54EmprCod ,
                                          short AV55Mancod ,
                                          java.util.Date AV56RpExHdFe ,
                                          String A396EmprCod ,
                                          short A2248ManCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[22];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.ManCod, T1.EmprCod, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.RpExHdAlb, T1.RpExHdFe, T1.RpExHdLi, T1.RpExHdCns, T1.RpExSalLn, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.RpExHdKgs, T1.RpExHdMts, T1.RpExHdTip FROM ((TXPLREXHD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ManCod = ? and T1.RpExHdFe = ?)");
      if ( ! (GXutil.strcmp("", AV94Wctrabajosexternosrecepcionmantenimientods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RpExHdLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RpExHdAlb,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV95Wctrabajosexternosrecepcionmantenimientods_2_tfrpexhdli) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV96Wctrabajosexternosrecepcionmantenimientods_3_tfrpexhdli_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdLi <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Wctrabajosexternosrecepcionmantenimientods_4_tfrpexhdfe)) )
      {
         addWhere(sWhereString, "(T1.RpExHdFe >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV98Wctrabajosexternosrecepcionmantenimientods_5_tfrpexhdalb) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV99Wctrabajosexternosrecepcionmantenimientods_6_tfrpexhdalb_to) )
      {
         addWhere(sWhereString, "(T1.RpExHdAlb <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV100Wctrabajosexternosrecepcionmantenimientods_7_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Wctrabajosexternosrecepcionmantenimientods_8_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV102Wctrabajosexternosrecepcionmantenimientods_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wctrabajosexternosrecepcionmantenimientods_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV104Wctrabajosexternosrecepcionmantenimientods_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wctrabajosexternosrecepcionmantenimientods_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Wctrabajosexternosrecepcionmantenimientods_13_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Wctrabajosexternosrecepcionmantenimientods_14_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdLi" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdLi DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdFe" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdFe DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RpExHdAlb" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RpExHdAlb DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_P091G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               return;
      }
   }

}

