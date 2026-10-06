package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionlabdipenviados_y_o_aceptados_wcexport extends GXProcedure
{
   public impresionlabdipenviados_y_o_aceptados_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionlabdipenviados_y_o_aceptados_wcexport.class ), "" );
   }

   public impresionlabdipenviados_y_o_aceptados_wcexport( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      impresionlabdipenviados_y_o_aceptados_wcexport.this.aP1 = new String[] {""};
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
      impresionlabdipenviados_y_o_aceptados_wcexport.this.aP0 = aP0;
      impresionlabdipenviados_y_o_aceptados_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ImpresionLabDipEnviados_y_o_Aceptados_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV27FilterFullText, GXv_char5) ;
      impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV43TFLb_numero) && (0==AV44TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFLb_numero_To );
      }
      if ( ! ( (0==AV45TFCliCod) && (0==AV46TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFLb_ArtCod_Sel, GXv_char5) ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFLb_ArtCod, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFLb_ColNomC_Sel, GXv_char5) ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFLb_ColNomC, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFLb_Rb)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFLb_Rb_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rb", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51TFLb_Rb)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFLb_Rb_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFLb_opcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFLb_opcion_Sel, GXv_char5) ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFLb_opcion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFLb_opcion, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV55TFLb_numop) && (0==AV56TFLb_numop_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFLb_numop );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFLb_numop_To );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFLb_Cartaz_Sel, GXv_char5) ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFLb_Cartaz, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFLb_FechaE)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV59TFLb_FechaE );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFLb_FechaEn)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Envio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV61TFLb_FechaEn );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV64TFLb_Estado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         impresionlabdipenviados_y_o_aceptados_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV66i = 1 ;
         AV70GXV1 = 1 ;
         while ( AV70GXV1 <= AV64TFLb_Estado_Sels.size() )
         {
            AV65TFLb_Estado_Sel = ((Number) AV64TFLb_Estado_Sels.elementAt(-1+AV70GXV1)).byteValue() ;
            if ( AV66i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV65TFLb_Estado_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NO Enviado", "") );
            }
            else if ( AV65TFLb_Estado_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviado", "") );
            }
            else if ( AV65TFLb_Estado_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Recepcionado", "") );
            }
            AV66i = (long)(AV66i+1) ;
            AV70GXV1 = (int)(AV70GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV40VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV28Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector"), "") != 0 )
      {
         AV35ColumnsSelectorXML = AV28Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector") ;
         AV32ColumnsSelector.fromxml(AV35ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV71GXV2 = 1 ;
      while ( AV71GXV2 <= AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV34ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV71GXV2));
         if ( AV34ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV34ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV34ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV34ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setColor( 11 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         AV71GXV2 = (int)(AV71GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = AV27FilterFullText ;
      AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero = AV43TFLb_numero ;
      AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to = AV44TFLb_numero_To ;
      AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod = AV45TFCliCod ;
      AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to = AV46TFCliCod_To ;
      AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = AV47TFLb_ArtCod ;
      AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = AV48TFLb_ArtCod_Sel ;
      AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = AV49TFLb_ColNomC ;
      AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = AV50TFLb_ColNomC_Sel ;
      AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = AV51TFLb_Rb ;
      AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = AV52TFLb_Rb_To ;
      AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = AV53TFLb_opcion ;
      AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = AV54TFLb_opcion_Sel ;
      AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop = AV55TFLb_numop ;
      AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to = AV56TFLb_numop_To ;
      AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = AV57TFLb_Cartaz ;
      AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = AV58TFLb_Cartaz_Sel ;
      AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = AV59TFLb_FechaE ;
      AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = AV61TFLb_FechaEn ;
      AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = AV64TFLb_Estado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                           AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) ,
                                           AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                           AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                           AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                           AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                           AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                           AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                           AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                           AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                           Byte.valueOf(AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) ,
                                           Byte.valueOf(AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) ,
                                           AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                           AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                           AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                           AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                           Integer.valueOf(AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels.size()) ,
                                           Integer.valueOf(AV17Clicod) ,
                                           AV18Lb_Cartaz ,
                                           AV19Lb_ColNom ,
                                           Integer.valueOf(AV20Lb_numero) ,
                                           AV21Lb_FechaEfrom ,
                                           AV22Lb_FechaEto ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV25OrderedBy) ,
                                           Boolean.valueOf(AV26OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod), 16, "%") ;
      lV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc), 13, "%") ;
      lV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = GXutil.padr( GXutil.rtrim( AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion), 1, "%") ;
      lV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz), 20, "%") ;
      lV18Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV18Lb_Cartaz), 20, "%") ;
      lV19Lb_ColNom = GXutil.padr( GXutil.rtrim( AV19Lb_ColNom), 13, "%") ;
      /* Using cursor P09UN2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext, Integer.valueOf(AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero), Integer.valueOf(AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to), Integer.valueOf(AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod), Integer.valueOf(AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to), lV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod, AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel, lV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc, AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel, AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb, AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to, lV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion, AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel, Byte.valueOf(AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop), Byte.valueOf(AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to), lV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz, AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel, AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae, AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen, Integer.valueOf(AV17Clicod), lV18Lb_Cartaz, lV19Lb_ColNom, Integer.valueOf(AV20Lb_numero), AV21Lb_FechaEfrom, AV22Lb_FechaEto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5569Lb_EstEns = P09UN2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UN2_A5536Lb_ColNom[0] ;
         A396EmprCod = P09UN2_A396EmprCod[0] ;
         A5566Lb_Estado = P09UN2_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P09UN2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09UN2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UN2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09UN2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09UN2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09UN2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UN2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UN2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UN2_A252CliCod[0] ;
         A5532Lb_numero = P09UN2_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09UN2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09UN2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09UN2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09UN2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09UN2_A5547Lb_Rb[0] ;
         A5538Lb_ColNomC = P09UN2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09UN2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09UN2_A252CliCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV40VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5547Lb_Rb)) );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5555Lb_opcion, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setNumber( A5718Lb_numop );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5567Lb_FechaEn );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV32ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( "" );
            if ( A5566Lb_Estado == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NO Enviado", "") );
            }
            else if ( A5566Lb_Estado == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviado", "") );
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV40VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Recepcionado", "") );
            }
            AV40VisibleColumnCount = (long)(AV40VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      AV32ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Rb", "", "Rb", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_opcion", "", "Opcion", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numop", "", "Nº", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "", "Fecha Entrada", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV32ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Estado", "", "Estado", true, "") ;
      AV32ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV36UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCColumnsSelector", GXv_char5) ;
      impresionlabdipenviados_y_o_aceptados_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV36UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV36UserCustomValue)==0) ) )
      {
         AV33ColumnsSelectorAux.fromxml(AV36UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV33ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV32ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV33ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV32ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_WCGridState"), null, null);
      }
      AV25OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV26OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV93GXV3 = 1 ;
      while ( AV93GXV3 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV3));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV27FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV43TFLb_numero = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFLb_numero_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV45TFCliCod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCliCod_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV47TFLb_ArtCod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV48TFLb_ArtCod_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV49TFLb_ColNomC = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV50TFLb_ColNomC_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV51TFLb_Rb = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFLb_Rb_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV53TFLb_opcion = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV54TFLb_opcion_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV55TFLb_numop = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFLb_numop_To = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV57TFLb_Cartaz = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV58TFLb_Cartaz_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV59TFLb_FechaE = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV61TFLb_FechaEn = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV63TFLb_Estado_SelsJson = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV64TFLb_Estado_Sels.fromJSonString(AV63TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV17Clicod = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV18Lb_Cartaz = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV19Lb_ColNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV20Lb_numero = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV21Lb_FechaEfrom = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV22Lb_FechaEto = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEN") == 0 )
         {
            AV23Lb_fechaEn = localUtil.ctod( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV24Lb_estado = (byte)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV93GXV3 = (int)(AV93GXV3+1) ;
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
      this.aP0[0] = impresionlabdipenviados_y_o_aceptados_wcexport.this.AV11Filename;
      this.aP1[0] = impresionlabdipenviados_y_o_aceptados_wcexport.this.AV12ErrorMessage;
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
      AV27FilterFullText = "" ;
      AV48TFLb_ArtCod_Sel = "" ;
      AV47TFLb_ArtCod = "" ;
      AV50TFLb_ColNomC_Sel = "" ;
      AV49TFLb_ColNomC = "" ;
      AV51TFLb_Rb = DecimalUtil.ZERO ;
      AV52TFLb_Rb_To = DecimalUtil.ZERO ;
      AV54TFLb_opcion_Sel = "" ;
      AV53TFLb_opcion = "" ;
      AV58TFLb_Cartaz_Sel = "" ;
      AV57TFLb_Cartaz = "" ;
      AV59TFLb_FechaE = GXutil.nullDate() ;
      AV61TFLb_FechaEn = GXutil.nullDate() ;
      AV64TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV28Session = httpContext.getWebSession();
      AV35ColumnsSelectorXML = "" ;
      AV32ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV34ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel = "" ;
      AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel = "" ;
      AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb = DecimalUtil.ZERO ;
      AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to = DecimalUtil.ZERO ;
      AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel = "" ;
      AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel = "" ;
      AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae = GXutil.nullDate() ;
      AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext = "" ;
      lV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod = "" ;
      lV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc = "" ;
      lV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion = "" ;
      lV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz = "" ;
      lV18Lb_Cartaz = "" ;
      lV19Lb_ColNom = "" ;
      AV18Lb_Cartaz = "" ;
      AV19Lb_ColNom = "" ;
      AV21Lb_FechaEfrom = GXutil.nullDate() ;
      AV22Lb_FechaEto = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P09UN2_A5569Lb_EstEns = new byte[1] ;
      P09UN2_A5536Lb_ColNom = new String[] {""} ;
      P09UN2_A396EmprCod = new String[] {""} ;
      P09UN2_A5566Lb_Estado = new byte[1] ;
      P09UN2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09UN2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09UN2_A5540Lb_Cartaz = new String[] {""} ;
      P09UN2_A5718Lb_numop = new byte[1] ;
      P09UN2_A5555Lb_opcion = new String[] {""} ;
      P09UN2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UN2_A5538Lb_ColNomC = new String[] {""} ;
      P09UN2_A5533Lb_ArtCod = new String[] {""} ;
      P09UN2_A252CliCod = new int[1] ;
      P09UN2_A5532Lb_numero = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV36UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV33ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV63TFLb_Estado_SelsJson = "" ;
      AV23Lb_fechaEn = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_wcexport__default(),
         new Object[] {
             new Object[] {
            P09UN2_A5569Lb_EstEns, P09UN2_A5536Lb_ColNom, P09UN2_A396EmprCod, P09UN2_A5566Lb_Estado, P09UN2_A5567Lb_FechaEn, P09UN2_A5541Lb_FechaE, P09UN2_A5540Lb_Cartaz, P09UN2_A5718Lb_numop, P09UN2_A5555Lb_opcion, P09UN2_A5547Lb_Rb,
            P09UN2_A5538Lb_ColNomC, P09UN2_A5533Lb_ArtCod, P09UN2_A252CliCod, P09UN2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55TFLb_numop ;
   private byte AV56TFLb_numop_To ;
   private byte AV65TFLb_Estado_Sel ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ;
   private byte AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ;
   private byte A5569Lb_EstEns ;
   private byte AV24Lb_estado ;
   private short GXv_int3[] ;
   private short AV25OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV43TFLb_numero ;
   private int AV44TFLb_numero_To ;
   private int AV45TFCliCod ;
   private int AV46TFCliCod_To ;
   private int AV70GXV1 ;
   private int AV71GXV2 ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ;
   private int AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ;
   private int AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ;
   private int AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ;
   private int AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ;
   private int AV17Clicod ;
   private int AV20Lb_numero ;
   private int AV93GXV3 ;
   private long AV66i ;
   private long AV40VisibleColumnCount ;
   private java.math.BigDecimal AV51TFLb_Rb ;
   private java.math.BigDecimal AV52TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ;
   private java.math.BigDecimal AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ;
   private String AV48TFLb_ArtCod_Sel ;
   private String AV47TFLb_ArtCod ;
   private String AV50TFLb_ColNomC_Sel ;
   private String AV49TFLb_ColNomC ;
   private String AV54TFLb_opcion_Sel ;
   private String AV53TFLb_opcion ;
   private String AV58TFLb_Cartaz_Sel ;
   private String AV57TFLb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ;
   private String AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ;
   private String AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ;
   private String AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ;
   private String lV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ;
   private String lV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ;
   private String lV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ;
   private String lV18Lb_Cartaz ;
   private String lV19Lb_ColNom ;
   private String AV18Lb_Cartaz ;
   private String AV19Lb_ColNom ;
   private String A5536Lb_ColNom ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV59TFLb_FechaE ;
   private java.util.Date AV61TFLb_FechaEn ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ;
   private java.util.Date AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ;
   private java.util.Date AV21Lb_FechaEfrom ;
   private java.util.Date AV22Lb_FechaEto ;
   private java.util.Date AV23Lb_fechaEn ;
   private boolean returnInSub ;
   private boolean AV26OrderedDsc ;
   private String AV35ColumnsSelectorXML ;
   private String AV36UserCustomValue ;
   private String AV63TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV27FilterFullText ;
   private String AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private String lV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV64TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09UN2_A5569Lb_EstEns ;
   private String[] P09UN2_A5536Lb_ColNom ;
   private String[] P09UN2_A396EmprCod ;
   private byte[] P09UN2_A5566Lb_Estado ;
   private java.util.Date[] P09UN2_A5567Lb_FechaEn ;
   private java.util.Date[] P09UN2_A5541Lb_FechaE ;
   private String[] P09UN2_A5540Lb_Cartaz ;
   private byte[] P09UN2_A5718Lb_numop ;
   private String[] P09UN2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09UN2_A5547Lb_Rb ;
   private String[] P09UN2_A5538Lb_ColNomC ;
   private String[] P09UN2_A5533Lb_ArtCod ;
   private int[] P09UN2_A252CliCod ;
   private int[] P09UN2_A5532Lb_numero ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV32ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV34ColumnsSelector_Column ;
}

final  class impresionlabdipenviados_y_o_aceptados_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels ,
                                          String AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext ,
                                          int AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero ,
                                          int AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to ,
                                          int AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod ,
                                          int AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to ,
                                          String AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel ,
                                          String AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod ,
                                          String AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel ,
                                          String AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb ,
                                          java.math.BigDecimal AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to ,
                                          String AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel ,
                                          String AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion ,
                                          byte AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop ,
                                          byte AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to ,
                                          String AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel ,
                                          String AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz ,
                                          java.util.Date AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae ,
                                          java.util.Date AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen ,
                                          int AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size ,
                                          int AV17Clicod ,
                                          String AV18Lb_Cartaz ,
                                          String AV19Lb_ColNom ,
                                          int AV20Lb_numero ,
                                          java.util.Date AV21Lb_FechaEfrom ,
                                          java.util.Date AV22Lb_FechaEto ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          String A5536Lb_ColNom ,
                                          short AV25OrderedBy ,
                                          boolean AV26OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[34];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T2.Lb_EstEns, T2.Lb_ColNom, T1.EmprCod, T1.Lb_Estado, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion, T2.Lb_Rb, T2.Lb_ColNomC, T2.Lb_ArtCod," ;
      scmdbuf += " T2.CliCod, T1.Lb_numero FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV80Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_10_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_11_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_12_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_13_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_14_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV87Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_15_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_18_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_impresionlabdipenviados_y_o_aceptados_wcds_20_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV17Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV20Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV25OrderedBy == 1 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV25OrderedBy == 1 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV25OrderedBy == 2 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV25OrderedBy == 2 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV25OrderedBy == 3 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV25OrderedBy == 3 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV25OrderedBy == 4 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV25OrderedBy == 4 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV25OrderedBy == 5 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV25OrderedBy == 5 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV25OrderedBy == 6 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV25OrderedBy == 6 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV25OrderedBy == 7 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV25OrderedBy == 7 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV25OrderedBy == 8 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV25OrderedBy == 8 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV25OrderedBy == 9 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV25OrderedBy == 9 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV25OrderedBy == 10 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV25OrderedBy == 10 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV25OrderedBy == 11 ) && ! AV26OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV25OrderedBy == 11 ) && ( AV26OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
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
                  return conditional_P09UN2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               return;
      }
   }

}

