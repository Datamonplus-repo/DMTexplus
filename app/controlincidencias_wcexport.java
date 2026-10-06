package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlincidencias_wcexport extends GXProcedure
{
   public controlincidencias_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlincidencias_wcexport.class ), "" );
   }

   public controlincidencias_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      controlincidencias_wcexport.this.aP1 = new String[] {""};
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
      controlincidencias_wcexport.this.aP0 = aP0;
      controlincidencias_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ControlIncidencias_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFInc_Dia)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV34TFInc_Dia );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV36TFInc_Linea) && (0==AV37TFInc_Linea_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Linea", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFInc_Linea );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFInc_Linea_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV38TFInc_Hora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV38TFInc_Hora, "99:99:99") );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFInc_Usuario_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFInc_Usuario_Sel, GXv_char5) ;
         controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFInc_Usuario)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFInc_Usuario, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFInc_Terminal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFInc_Terminal_Sel, GXv_char5) ;
         controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFInc_Terminal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFInc_Terminal, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFInc_Prog_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFInc_Prog_Sel, GXv_char5) ;
         controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFInc_Prog)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFInc_Prog, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFInc_Hdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFInc_Hdr_Sel, GXv_char5) ;
         controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFInc_Hdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº documento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFInc_Hdr, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFInc_obsTxt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFInc_obsTxt_Sel, GXv_char5) ;
         controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFInc_obsTxt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            controlincidencias_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFInc_obsTxt, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlIncidencias_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("ControlIncidencias_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV56GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Controlincidencias_wcds_1_filterfulltext = AV18FilterFullText ;
      AV59Controlincidencias_wcds_2_tfinc_dia = AV34TFInc_Dia ;
      AV60Controlincidencias_wcds_3_tfinc_linea = AV36TFInc_Linea ;
      AV61Controlincidencias_wcds_4_tfinc_linea_to = AV37TFInc_Linea_To ;
      AV62Controlincidencias_wcds_5_tfinc_hora = AV38TFInc_Hora ;
      AV63Controlincidencias_wcds_6_tfinc_usuario = AV40TFInc_Usuario ;
      AV64Controlincidencias_wcds_7_tfinc_usuario_sel = AV41TFInc_Usuario_Sel ;
      AV65Controlincidencias_wcds_8_tfinc_terminal = AV42TFInc_Terminal ;
      AV66Controlincidencias_wcds_9_tfinc_terminal_sel = AV43TFInc_Terminal_Sel ;
      AV67Controlincidencias_wcds_10_tfinc_prog = AV44TFInc_Prog ;
      AV68Controlincidencias_wcds_11_tfinc_prog_sel = AV45TFInc_Prog_Sel ;
      AV69Controlincidencias_wcds_12_tfinc_hdr = AV46TFInc_Hdr ;
      AV70Controlincidencias_wcds_13_tfinc_hdr_sel = AV47TFInc_Hdr_Sel ;
      AV71Controlincidencias_wcds_14_tfinc_obstxt = AV48TFInc_obsTxt ;
      AV72Controlincidencias_wcds_15_tfinc_obstxt_sel = AV49TFInc_obsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Controlincidencias_wcds_1_filterfulltext ,
                                           AV59Controlincidencias_wcds_2_tfinc_dia ,
                                           Long.valueOf(AV60Controlincidencias_wcds_3_tfinc_linea) ,
                                           Long.valueOf(AV61Controlincidencias_wcds_4_tfinc_linea_to) ,
                                           AV62Controlincidencias_wcds_5_tfinc_hora ,
                                           AV64Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                           AV63Controlincidencias_wcds_6_tfinc_usuario ,
                                           AV66Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                           AV65Controlincidencias_wcds_8_tfinc_terminal ,
                                           AV68Controlincidencias_wcds_11_tfinc_prog_sel ,
                                           AV67Controlincidencias_wcds_10_tfinc_prog ,
                                           AV70Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                           AV69Controlincidencias_wcds_12_tfinc_hdr ,
                                           AV72Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                           AV71Controlincidencias_wcds_14_tfinc_obstxt ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4936Inc_Obs ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV51Emprcod ,
                                           AV52Inc_dia ,
                                           A396EmprCod ,
                                           AV53Inc_dia_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV58Controlincidencias_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Controlincidencias_wcds_1_filterfulltext), "%", "") ;
      lV63Controlincidencias_wcds_6_tfinc_usuario = GXutil.padr( GXutil.rtrim( AV63Controlincidencias_wcds_6_tfinc_usuario), 8, "%") ;
      lV65Controlincidencias_wcds_8_tfinc_terminal = GXutil.padr( GXutil.rtrim( AV65Controlincidencias_wcds_8_tfinc_terminal), 10, "%") ;
      lV67Controlincidencias_wcds_10_tfinc_prog = GXutil.padr( GXutil.rtrim( AV67Controlincidencias_wcds_10_tfinc_prog), 10, "%") ;
      lV69Controlincidencias_wcds_12_tfinc_hdr = GXutil.padr( GXutil.rtrim( AV69Controlincidencias_wcds_12_tfinc_hdr), 11, "%") ;
      lV71Controlincidencias_wcds_14_tfinc_obstxt = GXutil.concat( GXutil.rtrim( AV71Controlincidencias_wcds_14_tfinc_obstxt), "%", "") ;
      /* Using cursor P09492 */
      pr_default.execute(0, new Object[] {AV51Emprcod, AV52Inc_dia, AV53Inc_dia_to, lV58Controlincidencias_wcds_1_filterfulltext, lV58Controlincidencias_wcds_1_filterfulltext, lV58Controlincidencias_wcds_1_filterfulltext, lV58Controlincidencias_wcds_1_filterfulltext, lV58Controlincidencias_wcds_1_filterfulltext, lV58Controlincidencias_wcds_1_filterfulltext, AV59Controlincidencias_wcds_2_tfinc_dia, Long.valueOf(AV60Controlincidencias_wcds_3_tfinc_linea), Long.valueOf(AV61Controlincidencias_wcds_4_tfinc_linea_to), AV62Controlincidencias_wcds_5_tfinc_hora, lV63Controlincidencias_wcds_6_tfinc_usuario, AV64Controlincidencias_wcds_7_tfinc_usuario_sel, lV65Controlincidencias_wcds_8_tfinc_terminal, AV66Controlincidencias_wcds_9_tfinc_terminal_sel, lV67Controlincidencias_wcds_10_tfinc_prog, AV68Controlincidencias_wcds_11_tfinc_prog_sel, lV69Controlincidencias_wcds_12_tfinc_hdr, AV70Controlincidencias_wcds_13_tfinc_hdr_sel, lV71Controlincidencias_wcds_14_tfinc_obstxt, AV72Controlincidencias_wcds_15_tfinc_obstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09492_A396EmprCod[0] ;
         A4935Inc_Prog = P09492_A4935Inc_Prog[0] ;
         A4934Inc_Termin = P09492_A4934Inc_Termin[0] ;
         A4933Inc_Usuari = P09492_A4933Inc_Usuari[0] ;
         A4932Inc_Hora = P09492_A4932Inc_Hora[0] ;
         A4931Inc_Linea = P09492_A4931Inc_Linea[0] ;
         A4929Inc_Dia = P09492_A4929Inc_Dia[0] ;
         A5301Inc_BarPar = P09492_A5301Inc_BarPar[0] ;
         A5300Inc_BarReo = P09492_A5300Inc_BarReo[0] ;
         A5299Inc_Barcod = P09492_A5299Inc_Barcod[0] ;
         A4936Inc_Obs = P09492_A4936Inc_Obs[0] ;
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A4929Inc_Dia );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A4931Inc_Linea );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( localUtil.format( A4932Inc_Hora, "99:99:99") );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4933Inc_Usuari, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4934Inc_Termin, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4935Inc_Prog, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13713Inc_Hdr, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13712Inc_obsTxt, GXv_char5) ;
            controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Dia", "", "Dia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Linea", "", "Linea", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Hora", "", "Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Usuario", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Terminal", "", "Terminal", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Prog", "", "Programa", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Hdr", "", "Nº documento", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_obsTxt", "", "Observaciones", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlIncidencias_WCColumnsSelector", GXv_char5) ;
      controlincidencias_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlIncidencias_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlIncidencias_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("ControlIncidencias_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV2 = 1 ;
      while ( AV73GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV34TFInc_Dia = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV36TFInc_Linea = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV37TFInc_Linea_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV38TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV40TFInc_Usuario = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV41TFInc_Usuario_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV42TFInc_Terminal = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV43TFInc_Terminal_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV44TFInc_Prog = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV45TFInc_Prog_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV46TFInc_Hdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV47TFInc_Hdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT") == 0 )
         {
            AV48TFInc_obsTxt = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_OBSTXT_SEL") == 0 )
         {
            AV49TFInc_obsTxt_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA") == 0 )
         {
            AV52Inc_dia = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INC_DIA_TO") == 0 )
         {
            AV53Inc_dia_to = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV73GXV2 = (int)(AV73GXV2+1) ;
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
      this.aP0[0] = controlincidencias_wcexport.this.AV11Filename;
      this.aP1[0] = controlincidencias_wcexport.this.AV12ErrorMessage;
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
      AV34TFInc_Dia = GXutil.nullDate() ;
      AV38TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV41TFInc_Usuario_Sel = "" ;
      AV40TFInc_Usuario = "" ;
      AV43TFInc_Terminal_Sel = "" ;
      AV42TFInc_Terminal = "" ;
      AV45TFInc_Prog_Sel = "" ;
      AV44TFInc_Prog = "" ;
      AV47TFInc_Hdr_Sel = "" ;
      AV46TFInc_Hdr = "" ;
      AV49TFInc_obsTxt_Sel = "" ;
      AV48TFInc_obsTxt = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A13713Inc_Hdr = "" ;
      A13712Inc_obsTxt = "" ;
      AV58Controlincidencias_wcds_1_filterfulltext = "" ;
      AV59Controlincidencias_wcds_2_tfinc_dia = GXutil.nullDate() ;
      AV62Controlincidencias_wcds_5_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV63Controlincidencias_wcds_6_tfinc_usuario = "" ;
      AV64Controlincidencias_wcds_7_tfinc_usuario_sel = "" ;
      AV65Controlincidencias_wcds_8_tfinc_terminal = "" ;
      AV66Controlincidencias_wcds_9_tfinc_terminal_sel = "" ;
      AV67Controlincidencias_wcds_10_tfinc_prog = "" ;
      AV68Controlincidencias_wcds_11_tfinc_prog_sel = "" ;
      AV69Controlincidencias_wcds_12_tfinc_hdr = "" ;
      AV70Controlincidencias_wcds_13_tfinc_hdr_sel = "" ;
      AV71Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      AV72Controlincidencias_wcds_15_tfinc_obstxt_sel = "" ;
      scmdbuf = "" ;
      lV58Controlincidencias_wcds_1_filterfulltext = "" ;
      lV63Controlincidencias_wcds_6_tfinc_usuario = "" ;
      lV65Controlincidencias_wcds_8_tfinc_terminal = "" ;
      lV67Controlincidencias_wcds_10_tfinc_prog = "" ;
      lV69Controlincidencias_wcds_12_tfinc_hdr = "" ;
      lV71Controlincidencias_wcds_14_tfinc_obstxt = "" ;
      A5301Inc_BarPar = "" ;
      A4936Inc_Obs = "" ;
      AV51Emprcod = "" ;
      AV52Inc_dia = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV53Inc_dia_to = GXutil.nullDate() ;
      P09492_A396EmprCod = new String[] {""} ;
      P09492_A4935Inc_Prog = new String[] {""} ;
      P09492_A4934Inc_Termin = new String[] {""} ;
      P09492_A4933Inc_Usuari = new String[] {""} ;
      P09492_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      P09492_A4931Inc_Linea = new long[1] ;
      P09492_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P09492_A5301Inc_BarPar = new String[] {""} ;
      P09492_A5300Inc_BarReo = new byte[1] ;
      P09492_A5299Inc_Barcod = new int[1] ;
      P09492_A4936Inc_Obs = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlincidencias_wcexport__default(),
         new Object[] {
             new Object[] {
            P09492_A396EmprCod, P09492_A4935Inc_Prog, P09492_A4934Inc_Termin, P09492_A4933Inc_Usuari, P09492_A4932Inc_Hora, P09492_A4931Inc_Linea, P09492_A4929Inc_Dia, P09492_A5301Inc_BarPar, P09492_A5300Inc_BarReo, P09492_A5299Inc_Barcod,
            P09492_A4936Inc_Obs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5300Inc_BarReo ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV56GXV1 ;
   private int A5299Inc_Barcod ;
   private int AV73GXV2 ;
   private long AV36TFInc_Linea ;
   private long AV37TFInc_Linea_To ;
   private long AV31VisibleColumnCount ;
   private long A4931Inc_Linea ;
   private long AV60Controlincidencias_wcds_3_tfinc_linea ;
   private long AV61Controlincidencias_wcds_4_tfinc_linea_to ;
   private String AV41TFInc_Usuario_Sel ;
   private String AV40TFInc_Usuario ;
   private String AV43TFInc_Terminal_Sel ;
   private String AV42TFInc_Terminal ;
   private String AV45TFInc_Prog_Sel ;
   private String AV44TFInc_Prog ;
   private String AV47TFInc_Hdr_Sel ;
   private String AV46TFInc_Hdr ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String AV63Controlincidencias_wcds_6_tfinc_usuario ;
   private String AV64Controlincidencias_wcds_7_tfinc_usuario_sel ;
   private String AV65Controlincidencias_wcds_8_tfinc_terminal ;
   private String AV66Controlincidencias_wcds_9_tfinc_terminal_sel ;
   private String AV67Controlincidencias_wcds_10_tfinc_prog ;
   private String AV68Controlincidencias_wcds_11_tfinc_prog_sel ;
   private String AV69Controlincidencias_wcds_12_tfinc_hdr ;
   private String AV70Controlincidencias_wcds_13_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String lV63Controlincidencias_wcds_6_tfinc_usuario ;
   private String lV65Controlincidencias_wcds_8_tfinc_terminal ;
   private String lV67Controlincidencias_wcds_10_tfinc_prog ;
   private String lV69Controlincidencias_wcds_12_tfinc_hdr ;
   private String A5301Inc_BarPar ;
   private String AV51Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV38TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV62Controlincidencias_wcds_5_tfinc_hora ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV34TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV59Controlincidencias_wcds_2_tfinc_dia ;
   private java.util.Date AV52Inc_dia ;
   private java.util.Date AV53Inc_dia_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV49TFInc_obsTxt_Sel ;
   private String AV48TFInc_obsTxt ;
   private String A13712Inc_obsTxt ;
   private String AV58Controlincidencias_wcds_1_filterfulltext ;
   private String AV71Controlincidencias_wcds_14_tfinc_obstxt ;
   private String AV72Controlincidencias_wcds_15_tfinc_obstxt_sel ;
   private String lV58Controlincidencias_wcds_1_filterfulltext ;
   private String lV71Controlincidencias_wcds_14_tfinc_obstxt ;
   private String A4936Inc_Obs ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09492_A396EmprCod ;
   private String[] P09492_A4935Inc_Prog ;
   private String[] P09492_A4934Inc_Termin ;
   private String[] P09492_A4933Inc_Usuari ;
   private java.util.Date[] P09492_A4932Inc_Hora ;
   private long[] P09492_A4931Inc_Linea ;
   private java.util.Date[] P09492_A4929Inc_Dia ;
   private String[] P09492_A5301Inc_BarPar ;
   private byte[] P09492_A5300Inc_BarReo ;
   private int[] P09492_A5299Inc_Barcod ;
   private String[] P09492_A4936Inc_Obs ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class controlincidencias_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09492( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Controlincidencias_wcds_1_filterfulltext ,
                                          java.util.Date AV59Controlincidencias_wcds_2_tfinc_dia ,
                                          long AV60Controlincidencias_wcds_3_tfinc_linea ,
                                          long AV61Controlincidencias_wcds_4_tfinc_linea_to ,
                                          java.util.Date AV62Controlincidencias_wcds_5_tfinc_hora ,
                                          String AV64Controlincidencias_wcds_7_tfinc_usuario_sel ,
                                          String AV63Controlincidencias_wcds_6_tfinc_usuario ,
                                          String AV66Controlincidencias_wcds_9_tfinc_terminal_sel ,
                                          String AV65Controlincidencias_wcds_8_tfinc_terminal ,
                                          String AV68Controlincidencias_wcds_11_tfinc_prog_sel ,
                                          String AV67Controlincidencias_wcds_10_tfinc_prog ,
                                          String AV70Controlincidencias_wcds_13_tfinc_hdr_sel ,
                                          String AV69Controlincidencias_wcds_12_tfinc_hdr ,
                                          String AV72Controlincidencias_wcds_15_tfinc_obstxt_sel ,
                                          String AV71Controlincidencias_wcds_14_tfinc_obstxt ,
                                          long A4931Inc_Linea ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          String A4936Inc_Obs ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV51Emprcod ,
                                          java.util.Date AV52Inc_dia ,
                                          String A396EmprCod ,
                                          java.util.Date AV53Inc_dia_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[23];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Prog, Inc_Termin, Inc_Usuari, Inc_Hora, Inc_Linea, Inc_Dia, Inc_BarPar, Inc_BarReo, Inc_Barcod, Inc_Obs FROM TXPCRTIN1" ;
      addWhere(sWhereString, "(EmprCod = ? and Inc_Dia >= ?)");
      addWhere(sWhereString, "(Inc_Dia <= ?)");
      if ( ! (GXutil.strcmp("", AV58Controlincidencias_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Inc_Linea,'9999999990'), 2) like '%' || ?) or ( UPPER(Inc_Usuari) like '%' || UPPER(?)) or ( UPPER(Inc_Termin) like '%' || UPPER(?)) or ( UPPER(Inc_Prog) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?)) or ( UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Controlincidencias_wcds_2_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlincidencias_wcds_3_tfinc_linea) )
      {
         addWhere(sWhereString, "(Inc_Linea >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlincidencias_wcds_4_tfinc_linea_to) )
      {
         addWhere(sWhereString, "(Inc_Linea <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Controlincidencias_wcds_5_tfinc_hora) )
      {
         addWhere(sWhereString, "(Inc_Hora >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Controlincidencias_wcds_7_tfinc_usuario_sel)==0) && ( ! (GXutil.strcmp("", AV63Controlincidencias_wcds_6_tfinc_usuario)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Usuari) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Controlincidencias_wcds_7_tfinc_usuario_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Usuari = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Controlincidencias_wcds_9_tfinc_terminal_sel)==0) && ( ! (GXutil.strcmp("", AV65Controlincidencias_wcds_8_tfinc_terminal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Termin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Controlincidencias_wcds_9_tfinc_terminal_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Termin = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Controlincidencias_wcds_11_tfinc_prog_sel)==0) && ( ! (GXutil.strcmp("", AV67Controlincidencias_wcds_10_tfinc_prog)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Inc_Prog) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Controlincidencias_wcds_11_tfinc_prog_sel)==0) )
      {
         addWhere(sWhereString, "(Inc_Prog = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Controlincidencias_wcds_13_tfinc_hdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Controlincidencias_wcds_12_tfinc_hdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Controlincidencias_wcds_13_tfinc_hdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_Barcod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(Inc_BarReo,'90'), 2))) || Inc_BarPar = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) && ( ! (GXutil.strcmp("", AV71Controlincidencias_wcds_14_tfinc_obstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(Inc_Obs, 1, 400)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Controlincidencias_wcds_15_tfinc_obstxt_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(Inc_Obs, 1, 400) = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Linea" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Linea DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Hora" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Hora DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Usuari" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Usuari DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Termin" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Termin DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Prog" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Prog DESC" ;
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
                  return conditional_P09492(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09492", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], true);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 10);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 400);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 400);
               }
               return;
      }
   }

}

