package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recepciondeensayocliente_wcexport extends GXProcedure
{
   public recepciondeensayocliente_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recepciondeensayocliente_wcexport.class ), "" );
   }

   public recepciondeensayocliente_wcexport( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      recepciondeensayocliente_wcexport.this.aP1 = new String[] {""};
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
      recepciondeensayocliente_wcexport.this.aP0 = aP0;
      recepciondeensayocliente_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "RecepciondeEnsayoCliente_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV36TFLb_numero) && (0==AV37TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFLb_numero_To );
      }
      if ( ! ( (0==AV88TFCliCod) && (0==AV89TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV88TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV89TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV91TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFLb_ArtCod_Sel, GXv_char5) ;
         recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV90TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFLb_ArtCod, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV93TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFLb_ColNomC_Sel, GXv_char5) ;
         recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV92TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFLb_ColNomC, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV113TFLb_ColNum) && (0==AV114TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV113TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV114TFLb_ColNum_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94TFLb_Rb)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFLb_Rb_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rb", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV94TFLb_Rb)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV95TFLb_Rb_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFLb_opcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_opcion_Sel, GXv_char5) ;
         recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFLb_opcion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_opcion, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFLb_numop) && (0==AV55TFLb_numop_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFLb_numop );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFLb_numop_To );
      }
      if ( ! ( (GXutil.strcmp("", AV97TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFLb_Cartaz_Sel, GXv_char5) ;
         recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV96TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFLb_Cartaz, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98TFLb_FechaE)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV98TFLb_FechaE );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFLb_FechaEn)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Envio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV42TFLb_FechaEn );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFLb_FechaR)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV46TFLb_FechaR );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV101TFLb_Estado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV80i = 1 ;
         AV118GXV1 = 1 ;
         while ( AV118GXV1 <= AV101TFLb_Estado_Sels.size() )
         {
            AV102TFLb_Estado_Sel = ((Number) AV101TFLb_Estado_Sels.elementAt(-1+AV118GXV1)).byteValue() ;
            if ( AV80i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV102TFLb_Estado_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviado", "") );
            }
            else if ( AV102TFLb_Estado_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Recepcionado", "") );
            }
            AV80i = (long)(AV80i+1) ;
            AV118GXV1 = (int)(AV118GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV77TFLb_ObsCR_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Obs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFLb_ObsCR_Sel, GXv_char5) ;
         recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV76TFLb_ObsCR)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Obs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            recepciondeensayocliente_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFLb_ObsCR, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV119GXV2 = 1 ;
      while ( AV119GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV119GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV119GXV2 = (int)(AV119GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = AV18FilterFullText ;
      AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero = AV36TFLb_numero ;
      AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to = AV37TFLb_numero_To ;
      AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod = AV88TFCliCod ;
      AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to = AV89TFCliCod_To ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = AV90TFLb_ArtCod ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = AV91TFLb_ArtCod_Sel ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = AV92TFLb_ColNomC ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = AV93TFLb_ColNomC_Sel ;
      AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum = AV113TFLb_ColNum ;
      AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to = AV114TFLb_ColNum_To ;
      AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = AV94TFLb_Rb ;
      AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = AV95TFLb_Rb_To ;
      AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = AV40TFLb_opcion ;
      AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = AV41TFLb_opcion_Sel ;
      AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop = AV54TFLb_numop ;
      AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to = AV55TFLb_numop_To ;
      AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = AV96TFLb_Cartaz ;
      AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = AV97TFLb_Cartaz_Sel ;
      AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = AV98TFLb_FechaE ;
      AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = AV42TFLb_FechaEn ;
      AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = AV46TFLb_FechaR ;
      AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = AV101TFLb_Estado_Sels ;
      AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = AV76TFLb_ObsCR ;
      AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = AV77TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                           AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) ,
                                           AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                           AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                           AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                           AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) ,
                                           AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                           AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                           AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                           AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                           Byte.valueOf(AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) ,
                                           Byte.valueOf(AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) ,
                                           AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                           AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                           AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                           AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                           AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                           Integer.valueOf(AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels.size()) ,
                                           AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                           AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                           Integer.valueOf(AV82Clicod) ,
                                           AV83Lb_Cartaz ,
                                           AV84Lb_ColNom ,
                                           Integer.valueOf(AV85Lb_numero) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A5536Lb_ColNom ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(AV86Lb_estado) ,
                                           AV81Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext), "%", "") ;
      lV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod), 16, "%") ;
      lV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc), 13, "%") ;
      lV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = GXutil.padr( GXutil.rtrim( AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion), 1, "%") ;
      lV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz), 20, "%") ;
      lV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = GXutil.concat( GXutil.rtrim( AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr), "%", "") ;
      lV83Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV83Lb_Cartaz), 20, "%") ;
      lV84Lb_ColNom = GXutil.padr( GXutil.rtrim( AV84Lb_ColNom), 13, "%") ;
      /* Using cursor P09NS2 */
      pr_default.execute(0, new Object[] {AV81Emprcod, Byte.valueOf(AV86Lb_estado), Byte.valueOf(AV86Lb_estado), lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext, Integer.valueOf(AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero), Integer.valueOf(AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to), Integer.valueOf(AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod), Integer.valueOf(AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to), lV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod, AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel, lV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc, AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum), Integer.valueOf(AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to), AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb, AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to, lV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion, AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel, Byte.valueOf(AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop), Byte.valueOf(AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to), lV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz, AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel, AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae, AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen, AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar, lV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr, AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel, Integer.valueOf(AV82Clicod), lV83Lb_Cartaz, lV84Lb_ColNom, Integer.valueOf(AV85Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6461Lb_FecNoa1 = P09NS2_A6461Lb_FecNoa1[0] ;
         A5569Lb_EstEns = P09NS2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NS2_A5536Lb_ColNom[0] ;
         A396EmprCod = P09NS2_A396EmprCod[0] ;
         A10822Lb_ObsCR = P09NS2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09NS2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NS2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NS2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NS2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NS2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NS2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NS2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NS2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NS2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NS2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NS2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NS2_A252CliCod[0] ;
         A5532Lb_numero = P09NS2_A5532Lb_numero[0] ;
         A5597Lb_TipRec = P09NS2_A5597Lb_TipRec[0] ;
         A6631Lb_ProvDef = P09NS2_A6631Lb_ProvDef[0] ;
         A5569Lb_EstEns = P09NS2_A5569Lb_EstEns[0] ;
         A5536Lb_ColNom = P09NS2_A5536Lb_ColNom[0] ;
         A5541Lb_FechaE = P09NS2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NS2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NS2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P09NS2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NS2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NS2_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NS2_A252CliCod[0] ;
         A5597Lb_TipRec = P09NS2_A5597Lb_TipRec[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5547Lb_Rb)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5555Lb_opcion, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV111Lb_TipRec = A5597Lb_TipRec ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( AV111Lb_TipRec == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Receta", "") );
            }
            else if ( AV111Lb_TipRec == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Añadida", "") );
            }
            else if ( AV111Lb_TipRec == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Conf.", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5718Lb_numop );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5567Lb_FechaEn );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5563Lb_FechaR );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( A5566Lb_Estado == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviado", "") );
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Recepcionado", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV115Lb_ProvDef = A6631Lb_ProvDef ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( AV115Lb_ProvDef), httpContext.getMessage( "D", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "D", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV115Lb_ProvDef), httpContext.getMessage( "P", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "P", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10822Lb_ObsCR, GXv_char5) ;
            recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Rb", "", "Rb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_opcion", "", "Opcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_TipRec", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numop", "", "Nº", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaR", "Fecha", "Recepcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Estado", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&SeleccionarEliminar", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV81Emprcod, httpContext.getMessage( "MODA21", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_ProvDef", "", "P_D", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ObsCR", "", "Obs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente_WCColumnsSelector", GXv_char5) ;
      recepciondeensayocliente_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV146GXV3 = 1 ;
      while ( AV146GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV36TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV88TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV89TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV90TFLb_ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV91TFLb_ArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV92TFLb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV93TFLb_ColNomC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV113TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV114TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV94TFLb_Rb = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV95TFLb_Rb_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV40TFLb_opcion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV41TFLb_opcion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV54TFLb_numop = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFLb_numop_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV96TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV97TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV98TFLb_FechaE = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV42TFLb_FechaEn = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV46TFLb_FechaR = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV100TFLb_Estado_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV101TFLb_Estado_Sels.fromJSonString(AV100TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV76TFLb_ObsCR = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV77TFLb_ObsCR_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV81Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV82Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV83Lb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV84Lb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV85Lb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV87Lb_fechaR = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTADO") == 0 )
         {
            AV86Lb_estado = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV146GXV3 = (int)(AV146GXV3+1) ;
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
      this.aP0[0] = recepciondeensayocliente_wcexport.this.AV11Filename;
      this.aP1[0] = recepciondeensayocliente_wcexport.this.AV12ErrorMessage;
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
      AV91TFLb_ArtCod_Sel = "" ;
      AV90TFLb_ArtCod = "" ;
      AV93TFLb_ColNomC_Sel = "" ;
      AV92TFLb_ColNomC = "" ;
      AV94TFLb_Rb = DecimalUtil.ZERO ;
      AV95TFLb_Rb_To = DecimalUtil.ZERO ;
      AV41TFLb_opcion_Sel = "" ;
      AV40TFLb_opcion = "" ;
      AV97TFLb_Cartaz_Sel = "" ;
      AV96TFLb_Cartaz = "" ;
      AV98TFLb_FechaE = GXutil.nullDate() ;
      AV42TFLb_FechaEn = GXutil.nullDate() ;
      AV46TFLb_FechaR = GXutil.nullDate() ;
      AV101TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV77TFLb_ObsCR_Sel = "" ;
      AV76TFLb_ObsCR = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6631Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel = "" ;
      AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel = "" ;
      AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb = DecimalUtil.ZERO ;
      AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to = DecimalUtil.ZERO ;
      AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel = "" ;
      AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel = "" ;
      AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae = GXutil.nullDate() ;
      AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen = GXutil.nullDate() ;
      AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar = GXutil.nullDate() ;
      AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel = "" ;
      scmdbuf = "" ;
      lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext = "" ;
      lV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod = "" ;
      lV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc = "" ;
      lV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion = "" ;
      lV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz = "" ;
      lV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr = "" ;
      lV83Lb_Cartaz = "" ;
      lV84Lb_ColNom = "" ;
      AV83Lb_Cartaz = "" ;
      AV84Lb_ColNom = "" ;
      A5536Lb_ColNom = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      AV81Emprcod = "" ;
      A396EmprCod = "" ;
      P09NS2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09NS2_A5569Lb_EstEns = new byte[1] ;
      P09NS2_A5536Lb_ColNom = new String[] {""} ;
      P09NS2_A396EmprCod = new String[] {""} ;
      P09NS2_A10822Lb_ObsCR = new String[] {""} ;
      P09NS2_A5566Lb_Estado = new byte[1] ;
      P09NS2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NS2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NS2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NS2_A5540Lb_Cartaz = new String[] {""} ;
      P09NS2_A5718Lb_numop = new byte[1] ;
      P09NS2_A5555Lb_opcion = new String[] {""} ;
      P09NS2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NS2_A5537Lb_ColNum = new int[1] ;
      P09NS2_A5538Lb_ColNomC = new String[] {""} ;
      P09NS2_A5533Lb_ArtCod = new String[] {""} ;
      P09NS2_A252CliCod = new int[1] ;
      P09NS2_A5532Lb_numero = new int[1] ;
      P09NS2_A5597Lb_TipRec = new byte[1] ;
      P09NS2_A6631Lb_ProvDef = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV115Lb_ProvDef = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV100TFLb_Estado_SelsJson = "" ;
      AV87Lb_fechaR = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepciondeensayocliente_wcexport__default(),
         new Object[] {
             new Object[] {
            P09NS2_A6461Lb_FecNoa1, P09NS2_A5569Lb_EstEns, P09NS2_A5536Lb_ColNom, P09NS2_A396EmprCod, P09NS2_A10822Lb_ObsCR, P09NS2_A5566Lb_Estado, P09NS2_A5563Lb_FechaR, P09NS2_A5567Lb_FechaEn, P09NS2_A5541Lb_FechaE, P09NS2_A5540Lb_Cartaz,
            P09NS2_A5718Lb_numop, P09NS2_A5555Lb_opcion, P09NS2_A5547Lb_Rb, P09NS2_A5537Lb_ColNum, P09NS2_A5538Lb_ColNomC, P09NS2_A5533Lb_ArtCod, P09NS2_A252CliCod, P09NS2_A5532Lb_numero, P09NS2_A5597Lb_TipRec, P09NS2_A6631Lb_ProvDef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54TFLb_numop ;
   private byte AV55TFLb_numop_To ;
   private byte AV102TFLb_Estado_Sel ;
   private byte A5597Lb_TipRec ;
   private byte A5718Lb_numop ;
   private byte A5566Lb_Estado ;
   private byte AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ;
   private byte AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ;
   private byte A5569Lb_EstEns ;
   private byte AV86Lb_estado ;
   private byte AV111Lb_TipRec ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV36TFLb_numero ;
   private int AV37TFLb_numero_To ;
   private int AV88TFCliCod ;
   private int AV89TFCliCod_To ;
   private int AV113TFLb_ColNum ;
   private int AV114TFLb_ColNum_To ;
   private int AV118GXV1 ;
   private int AV119GXV2 ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ;
   private int AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ;
   private int AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ;
   private int AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ;
   private int AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ;
   private int AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ;
   private int AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ;
   private int AV82Clicod ;
   private int AV85Lb_numero ;
   private int AV146GXV3 ;
   private long AV80i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV94TFLb_Rb ;
   private java.math.BigDecimal AV95TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ;
   private java.math.BigDecimal AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ;
   private String AV91TFLb_ArtCod_Sel ;
   private String AV90TFLb_ArtCod ;
   private String AV93TFLb_ColNomC_Sel ;
   private String AV92TFLb_ColNomC ;
   private String AV41TFLb_opcion_Sel ;
   private String AV40TFLb_opcion ;
   private String AV97TFLb_Cartaz_Sel ;
   private String AV96TFLb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String A6631Lb_ProvDef ;
   private String AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ;
   private String AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ;
   private String AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ;
   private String AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ;
   private String lV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ;
   private String lV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ;
   private String lV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ;
   private String lV83Lb_Cartaz ;
   private String lV84Lb_ColNom ;
   private String AV83Lb_Cartaz ;
   private String AV84Lb_ColNom ;
   private String A5536Lb_ColNom ;
   private String AV81Emprcod ;
   private String A396EmprCod ;
   private String AV115Lb_ProvDef ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV98TFLb_FechaE ;
   private java.util.Date AV42TFLb_FechaEn ;
   private java.util.Date AV46TFLb_FechaR ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ;
   private java.util.Date AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ;
   private java.util.Date AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV87Lb_fechaR ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean Cond_result ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV100TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV77TFLb_ObsCR_Sel ;
   private String AV76TFLb_ObsCR ;
   private String A10822Lb_ObsCR ;
   private String AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private String AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ;
   private String lV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ;
   private String lV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ;
   private GXSimpleCollection<Byte> AV101TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09NS2_A6461Lb_FecNoa1 ;
   private byte[] P09NS2_A5569Lb_EstEns ;
   private String[] P09NS2_A5536Lb_ColNom ;
   private String[] P09NS2_A396EmprCod ;
   private String[] P09NS2_A10822Lb_ObsCR ;
   private byte[] P09NS2_A5566Lb_Estado ;
   private java.util.Date[] P09NS2_A5563Lb_FechaR ;
   private java.util.Date[] P09NS2_A5567Lb_FechaEn ;
   private java.util.Date[] P09NS2_A5541Lb_FechaE ;
   private String[] P09NS2_A5540Lb_Cartaz ;
   private byte[] P09NS2_A5718Lb_numop ;
   private String[] P09NS2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NS2_A5547Lb_Rb ;
   private int[] P09NS2_A5537Lb_ColNum ;
   private String[] P09NS2_A5538Lb_ColNomC ;
   private String[] P09NS2_A5533Lb_ArtCod ;
   private int[] P09NS2_A252CliCod ;
   private int[] P09NS2_A5532Lb_numero ;
   private byte[] P09NS2_A5597Lb_TipRec ;
   private String[] P09NS2_A6631Lb_ProvDef ;
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

final  class recepciondeensayocliente_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels ,
                                          String AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext ,
                                          int AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero ,
                                          int AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to ,
                                          int AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod ,
                                          int AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to ,
                                          String AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel ,
                                          String AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod ,
                                          String AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel ,
                                          String AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc ,
                                          int AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum ,
                                          int AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to ,
                                          java.math.BigDecimal AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb ,
                                          java.math.BigDecimal AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to ,
                                          String AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel ,
                                          String AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion ,
                                          byte AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop ,
                                          byte AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to ,
                                          String AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel ,
                                          String AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz ,
                                          java.util.Date AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae ,
                                          java.util.Date AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen ,
                                          java.util.Date AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar ,
                                          int AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size ,
                                          String AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel ,
                                          String AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr ,
                                          int AV82Clicod ,
                                          String AV83Lb_Cartaz ,
                                          String AV84Lb_ColNom ,
                                          int AV85Lb_numero ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A5536Lb_ColNom ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          byte A5569Lb_EstEns ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte AV86Lb_estado ,
                                          String AV81Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[41];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_FecNoa1, T2.Lb_EstEns, T2.Lb_ColNom, T1.EmprCod, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop, T1.Lb_opcion," ;
      scmdbuf += " T2.Lb_Rb, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod, T1.Lb_numero, T2.Lb_TipRec, T1.Lb_ProvDef FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      if ( ! (GXutil.strcmp("", AV121Gestionlaboratorio_recepciondeensayocliente_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV122Gestionlaboratorio_recepciondeensayocliente_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV123Gestionlaboratorio_recepciondeensayocliente_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV124Gestionlaboratorio_recepciondeensayocliente_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV125Gestionlaboratorio_recepciondeensayocliente_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV126Gestionlaboratorio_recepciondeensayocliente_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Gestionlaboratorio_recepciondeensayocliente_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV128Gestionlaboratorio_recepciondeensayocliente_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Gestionlaboratorio_recepciondeensayocliente_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV130Gestionlaboratorio_recepciondeensayocliente_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Gestionlaboratorio_recepciondeensayocliente_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Gestionlaboratorio_recepciondeensayocliente_wcds_12_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Gestionlaboratorio_recepciondeensayocliente_wcds_13_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV134Gestionlaboratorio_recepciondeensayocliente_wcds_14_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Gestionlaboratorio_recepciondeensayocliente_wcds_15_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV136Gestionlaboratorio_recepciondeensayocliente_wcds_16_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Gestionlaboratorio_recepciondeensayocliente_wcds_17_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV138Gestionlaboratorio_recepciondeensayocliente_wcds_18_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Gestionlaboratorio_recepciondeensayocliente_wcds_19_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Gestionlaboratorio_recepciondeensayocliente_wcds_20_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Gestionlaboratorio_recepciondeensayocliente_wcds_21_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Gestionlaboratorio_recepciondeensayocliente_wcds_22_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV143Gestionlaboratorio_recepciondeensayocliente_wcds_23_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV144Gestionlaboratorio_recepciondeensayocliente_wcds_24_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Gestionlaboratorio_recepciondeensayocliente_wcds_25_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV82Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV85Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNomC DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Rb DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numop" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numop DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_FechaE DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR DESC" ;
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
                  return conditional_P09NS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , ((Number) dynConstraints[47]).byteValue() , (java.util.Date)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 20);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 300);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 300);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

