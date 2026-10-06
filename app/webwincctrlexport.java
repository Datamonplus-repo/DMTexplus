package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwincctrlexport extends GXProcedure
{
   public webwincctrlexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwincctrlexport.class ), "" );
   }

   public webwincctrlexport( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwincctrlexport.this.aP1 = new String[] {""};
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
      webwincctrlexport.this.aP0 = aP0;
      webwincctrlexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWIncCtrlExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_dtime4 = GXutil.resetTime( AV76Inc_Dia );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setItalic( (short)(1) );
      GXt_dtime4 = GXutil.resetTime( AV77Inc_Dia_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75FilterFullText, GXv_char6) ;
      webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFInc_Dia)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Dia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime4 = GXutil.resetTime( AV49TFInc_Dia );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime4 );
      }
      if ( ! ( (0==AV51TFInc_Linea) && (0==AV52TFInc_Linea_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFInc_Linea );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFInc_Linea_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV53TFInc_Hora) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV53TFInc_Hora, "99:99:99") );
      }
      if ( ! ( (GXutil.strcmp("", AV56TFInc_Usuario_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFInc_Usuario_Sel, GXv_char6) ;
         webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFInc_Usuario)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFInc_Usuario, GXv_char6) ;
            webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFInc_Terminal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFInc_Terminal_Sel, GXv_char6) ;
         webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFInc_Terminal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Terminal", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFInc_Terminal, GXv_char6) ;
            webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFInc_Prog_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFInc_Prog_Sel, GXv_char6) ;
         webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFInc_Prog)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Programa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFInc_Prog, GXv_char6) ;
            webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV64TFInc_Hdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Documento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFInc_Hdr_Sel, GXv_char6) ;
         webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFInc_Hdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Documento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwincctrlexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFInc_Hdr, GXv_char6) ;
            webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV46VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV34Session.getValue("WebWIncCtrlColumnsSelector"), "") != 0 )
      {
         AV41ColumnsSelectorXML = AV34Session.getValue("WebWIncCtrlColumnsSelector") ;
         AV38ColumnsSelector.fromxml(AV41ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV40ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV80GXV1));
         if ( AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setColor( 11 );
            AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV82Webwincctrlds_1_inc_dia = AV76Inc_Dia ;
      AV83Webwincctrlds_2_inc_dia_to = AV77Inc_Dia_To ;
      AV84Webwincctrlds_3_filterfulltext = AV75FilterFullText ;
      AV85Webwincctrlds_4_tfinc_dia = AV49TFInc_Dia ;
      AV86Webwincctrlds_5_tfinc_linea = AV51TFInc_Linea ;
      AV87Webwincctrlds_6_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV88Webwincctrlds_7_tfinc_hora = AV53TFInc_Hora ;
      AV89Webwincctrlds_8_tfinc_usuario = AV55TFInc_Usuario ;
      AV90Webwincctrlds_9_tfinc_usuario_sel = AV56TFInc_Usuario_Sel ;
      AV91Webwincctrlds_10_tfinc_terminal = AV57TFInc_Terminal ;
      AV92Webwincctrlds_11_tfinc_terminal_sel = AV58TFInc_Terminal_Sel ;
      AV93Webwincctrlds_12_tfinc_prog = AV59TFInc_Prog ;
      AV94Webwincctrlds_13_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV95Webwincctrlds_14_tfinc_hdr = AV63TFInc_Hdr ;
      AV96Webwincctrlds_15_tfinc_hdr_sel = AV64TFInc_Hdr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Webwincctrlds_1_inc_dia ,
                                           AV83Webwincctrlds_2_inc_dia_to ,
                                           AV85Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV86Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV87Webwincctrlds_6_tfinc_linea_to) ,
                                           AV88Webwincctrlds_7_tfinc_hora ,
                                           AV90Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV89Webwincctrlds_8_tfinc_usuario ,
                                           AV92Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV91Webwincctrlds_10_tfinc_terminal ,
                                           AV94Webwincctrlds_13_tfinc_prog_sel ,
                                           AV93Webwincctrlds_12_tfinc_prog ,
                                           AV96Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV95Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4932Inc_Hora ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV84Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P089I2 */
      pr_default.execute(0, new Object[] {AV82Webwincctrlds_1_inc_dia, AV83Webwincctrlds_2_inc_dia_to, AV85Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4929Inc_Dia = P089I2_A4929Inc_Dia[0] ;
         A396EmprCod = P089I2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV84Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV84Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV84Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV84Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV84Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV84Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV84Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV84Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13CellRow = (int)(AV13CellRow+1) ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            AV46VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime4 = GXutil.resetTime( A4929Inc_Dia );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A4931Inc_Linea );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( localUtil.format( A4932Inc_Hora, "99:99:99") );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4933Inc_Usuari, GXv_char6) ;
               webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4934Inc_Termin, GXv_char6) ;
               webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4935Inc_Prog, GXv_char6) ;
               webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13713Inc_Hdr, GXv_char6) ;
               webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char5 = "" ;
               GXv_char6[0] = GXt_char5 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4936Inc_Obs, GXv_char6) ;
               webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char5 );
               AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S182 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
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
      AV38ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Dia", "", "Dia", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Linea", "", "#", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Hora", "", "Hora", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Usuario", "", "Usuario", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Terminal", "", "Terminal", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Prog", "", "Programa", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Hdr", "", "Documento", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Inc_Obs", "", "Observación", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV42UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWIncCtrlColumnsSelector", GXv_char6) ;
      webwincctrlexport.this.GXt_char5 = GXv_char6[0] ;
      AV42UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV42UserCustomValue)==0) ) )
      {
         AV39ColumnsSelectorAux.fromxml(AV42UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV39ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV38ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV39ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV38ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV34Session.getValue("WebWIncCtrlGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWIncCtrlGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV34Session.getValue("WebWIncCtrlGridState"), null, null);
      }
      AV16OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV2 = 1 ;
      while ( AV97GXV2 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV2));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "INC_DIA") == 0 )
         {
            AV76Inc_Dia = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV77Inc_Dia_To = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV75FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV49TFInc_Dia = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV51TFInc_Linea = GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV52TFInc_Linea_To = GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV53TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV55TFInc_Usuario = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV56TFInc_Usuario_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV57TFInc_Terminal = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV58TFInc_Terminal_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV59TFInc_Prog = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV60TFInc_Prog_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV63TFInc_Hdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV64TFInc_Hdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV97GXV2 = (int)(AV97GXV2+1) ;
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
      this.aP0[0] = webwincctrlexport.this.AV11Filename;
      this.aP1[0] = webwincctrlexport.this.AV12ErrorMessage;
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
      AV76Inc_Dia = GXutil.nullDate() ;
      AV77Inc_Dia_To = GXutil.nullDate() ;
      AV75FilterFullText = "" ;
      AV49TFInc_Dia = GXutil.nullDate() ;
      AV53TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV56TFInc_Usuario_Sel = "" ;
      AV55TFInc_Usuario = "" ;
      AV58TFInc_Terminal_Sel = "" ;
      AV57TFInc_Terminal = "" ;
      AV60TFInc_Prog_Sel = "" ;
      AV59TFInc_Prog = "" ;
      AV64TFInc_Hdr_Sel = "" ;
      AV63TFInc_Hdr = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV34Session = httpContext.getWebSession();
      AV41ColumnsSelectorXML = "" ;
      AV38ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV40ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A13713Inc_Hdr = "" ;
      A4936Inc_Obs = "" ;
      AV82Webwincctrlds_1_inc_dia = GXutil.nullDate() ;
      AV83Webwincctrlds_2_inc_dia_to = GXutil.nullDate() ;
      AV84Webwincctrlds_3_filterfulltext = "" ;
      AV85Webwincctrlds_4_tfinc_dia = GXutil.nullDate() ;
      AV88Webwincctrlds_7_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV89Webwincctrlds_8_tfinc_usuario = "" ;
      AV90Webwincctrlds_9_tfinc_usuario_sel = "" ;
      AV91Webwincctrlds_10_tfinc_terminal = "" ;
      AV92Webwincctrlds_11_tfinc_terminal_sel = "" ;
      AV93Webwincctrlds_12_tfinc_prog = "" ;
      AV94Webwincctrlds_13_tfinc_prog_sel = "" ;
      AV95Webwincctrlds_14_tfinc_hdr = "" ;
      AV96Webwincctrlds_15_tfinc_hdr_sel = "" ;
      lV84Webwincctrlds_3_filterfulltext = "" ;
      scmdbuf = "" ;
      P089I2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089I2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV42UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV39ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwincctrlexport__default(),
         new Object[] {
             new Object[] {
            P089I2_A4929Inc_Dia, P089I2_A396EmprCod
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
   private int AV80GXV1 ;
   private int A5299Inc_Barcod ;
   private int AV97GXV2 ;
   private long AV51TFInc_Linea ;
   private long AV52TFInc_Linea_To ;
   private long AV46VisibleColumnCount ;
   private long A4931Inc_Linea ;
   private long AV86Webwincctrlds_5_tfinc_linea ;
   private long AV87Webwincctrlds_6_tfinc_linea_to ;
   private String AV56TFInc_Usuario_Sel ;
   private String AV55TFInc_Usuario ;
   private String AV58TFInc_Terminal_Sel ;
   private String AV57TFInc_Terminal ;
   private String AV60TFInc_Prog_Sel ;
   private String AV59TFInc_Prog ;
   private String AV64TFInc_Hdr_Sel ;
   private String AV63TFInc_Hdr ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String AV89Webwincctrlds_8_tfinc_usuario ;
   private String AV90Webwincctrlds_9_tfinc_usuario_sel ;
   private String AV91Webwincctrlds_10_tfinc_terminal ;
   private String AV92Webwincctrlds_11_tfinc_terminal_sel ;
   private String AV93Webwincctrlds_12_tfinc_prog ;
   private String AV94Webwincctrlds_13_tfinc_prog_sel ;
   private String AV95Webwincctrlds_14_tfinc_hdr ;
   private String AV96Webwincctrlds_15_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date AV53TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV88Webwincctrlds_7_tfinc_hora ;
   private java.util.Date GXt_dtime4 ;
   private java.util.Date AV76Inc_Dia ;
   private java.util.Date AV77Inc_Dia_To ;
   private java.util.Date AV49TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV82Webwincctrlds_1_inc_dia ;
   private java.util.Date AV83Webwincctrlds_2_inc_dia_to ;
   private java.util.Date AV85Webwincctrlds_4_tfinc_dia ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV41ColumnsSelectorXML ;
   private String AV42UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV75FilterFullText ;
   private String A4936Inc_Obs ;
   private String AV84Webwincctrlds_3_filterfulltext ;
   private String lV84Webwincctrlds_3_filterfulltext ;
   private com.genexus.webpanels.WebSession AV34Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P089I2_A4929Inc_Dia ;
   private String[] P089I2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV40ColumnsSelector_Column ;
}

final  class webwincctrlexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P089I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV82Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV83Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV85Webwincctrlds_4_tfinc_dia ,
                                          long AV86Webwincctrlds_5_tfinc_linea ,
                                          long AV87Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV88Webwincctrlds_7_tfinc_hora ,
                                          String AV90Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV89Webwincctrlds_8_tfinc_usuario ,
                                          String AV92Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV91Webwincctrlds_10_tfinc_terminal ,
                                          String AV94Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV93Webwincctrlds_12_tfinc_prog ,
                                          String AV96Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV95Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          java.util.Date A4932Inc_Hora ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV84Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[3];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P089I2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[3]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[4]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               return;
      }
   }

}

