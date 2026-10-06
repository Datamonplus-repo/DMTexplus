package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class noaceptacionensayo_wcexport extends GXProcedure
{
   public noaceptacionensayo_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( noaceptacionensayo_wcexport.class ), "" );
   }

   public noaceptacionensayo_wcexport( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      noaceptacionensayo_wcexport.this.aP1 = new String[] {""};
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
      noaceptacionensayo_wcexport.this.aP0 = aP0;
      noaceptacionensayo_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "NoAceptacionEnsayo_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV21FilterFullText, GXv_char5) ;
      noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV38TFLb_numero) && (0==AV39TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFLb_numero_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFLb_opcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_opcion_Sel, GXv_char5) ;
         noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
            noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_opcion, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFLb_ColNom_Sel, GXv_char5) ;
         noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ColNom, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFLb_ColNum) && (0==AV45TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFLb_ColNum_To );
      }
      if ( ! ( (0==AV48TFCliCod) && (0==AV49TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFCliNom_Sel, GXv_char5) ;
         noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFCliNom, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFLb_Cartaz_Sel, GXv_char5) ;
         noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFLb_Cartaz, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFLb_cartazf)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Cole.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV54TFLb_cartazf );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFLb_FechaEn)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Env.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV56TFLb_FechaEn );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFLb_FechaR)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Recep.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV58TFLb_FechaR );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV71TFLb_Estado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV64i = 1 ;
         AV75GXV1 = 1 ;
         while ( AV75GXV1 <= AV71TFLb_Estado_Sels.size() )
         {
            AV72TFLb_Estado_Sel = ((Number) AV71TFLb_Estado_Sels.elementAt(-1+AV75GXV1)).byteValue() ;
            if ( AV64i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV72TFLb_Estado_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviado", "") );
            }
            else if ( AV72TFLb_Estado_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Recepcionado", "") );
            }
            AV64i = (long)(AV64i+1) ;
            AV75GXV1 = (int)(AV75GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65TFLb_FecNoa1)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV65TFLb_FecNoa1 );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV67TFLb_hhnoa1) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         noaceptacionensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV67TFLb_hhnoa1, "99:99") );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV35VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV22Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV30ColumnsSelectorXML = AV22Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector") ;
         AV27ColumnsSelector.fromxml(AV30ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV76GXV2 = 1 ;
      while ( AV76GXV2 <= AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV29ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV76GXV2));
         if ( AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV29ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setColor( 11 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         AV76GXV2 = (int)(AV76GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = AV21FilterFullText ;
      AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero = AV38TFLb_numero ;
      AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to = AV39TFLb_numero_To ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = AV40TFLb_opcion ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = AV41TFLb_opcion_Sel ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = AV42TFLb_ColNom ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = AV43TFLb_ColNom_Sel ;
      AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum = AV44TFLb_ColNum ;
      AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to = AV45TFLb_ColNum_To ;
      AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod = AV48TFCliCod ;
      AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to = AV49TFCliCod_To ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = AV50TFCliNom ;
      AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = AV51TFCliNom_Sel ;
      AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = AV52TFLb_Cartaz ;
      AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = AV53TFLb_Cartaz_Sel ;
      AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = AV54TFLb_cartazf ;
      AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = AV56TFLb_FechaEn ;
      AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = AV58TFLb_FechaR ;
      AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = AV71TFLb_Estado_Sels ;
      AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = AV65TFLb_FecNoa1 ;
      AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = AV67TFLb_hhnoa1 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                           AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) ,
                                           AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                           AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                           AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                           AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) ,
                                           Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) ,
                                           Integer.valueOf(AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) ,
                                           AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                           AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                           AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                           AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                           AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                           AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                           AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                           Integer.valueOf(AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels.size()) ,
                                           AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                           AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A6461Lb_FecNoa1 ,
                                           A10082Lb_hhnoa1 ,
                                           Short.valueOf(AV19OrderedBy) ,
                                           Boolean.valueOf(AV20OrderedDsc) ,
                                           AV16Emprcod ,
                                           Integer.valueOf(AV17Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext), "%", "") ;
      lV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom), 30, "%") ;
      lV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz), 20, "%") ;
      /* Using cursor P09OG2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, Integer.valueOf(AV17Lb_Numero), lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext, Integer.valueOf(AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero), Integer.valueOf(AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to), lV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion, AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel, lV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom, AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum), Integer.valueOf(AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to), Integer.valueOf(AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod), Integer.valueOf(AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to), lV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom, AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel, lV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz, AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel, AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf, AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen, AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar, AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1, AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09OG2_A396EmprCod[0] ;
         A10082Lb_hhnoa1 = P09OG2_A10082Lb_hhnoa1[0] ;
         A6461Lb_FecNoa1 = P09OG2_A6461Lb_FecNoa1[0] ;
         A5566Lb_Estado = P09OG2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OG2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OG2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OG2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OG2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OG2_A279CliNom[0] ;
         A252CliCod = P09OG2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OG2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OG2_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OG2_A5555Lb_opcion[0] ;
         A5532Lb_numero = P09OG2_A5532Lb_numero[0] ;
         A5594Lb_cartazf = P09OG2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OG2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OG2_A252CliCod[0] ;
         A5537Lb_ColNum = P09OG2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OG2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OG2_A279CliNom[0] ;
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
         AV35VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5555Lb_opcion, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5594Lb_cartazf );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5567Lb_FechaEn );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5563Lb_FechaR );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( "" );
            if ( A5566Lb_Estado == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviado", "") );
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Recepcionado", "") );
            }
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A6461Lb_FecNoa1 );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV27ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV35VisibleColumnCount), 1, 1).setText( localUtil.format( A10082Lb_hhnoa1, "99:99") );
            AV35VisibleColumnCount = (long)(AV35VisibleColumnCount+1) ;
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
      AV27ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_opcion", "", "Opcion", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_cartazf", "", "Fecha Cole.", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaEn", "", "Fecha Env.", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaR", "", "Fecha Recep.", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Estado", "", "E", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FecNoa1", "No Aceptacion", "Fecha", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV27ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_hhnoa1", "No Aceptacion", "Hora", true, "") ;
      AV27ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV31UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.NoAceptacionEnsayo_WCColumnsSelector", GXv_char5) ;
      noaceptacionensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV31UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV31UserCustomValue)==0) ) )
      {
         AV28ColumnsSelectorAux.fromxml(AV31UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV28ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV28ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV27ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("GestionLaboratorio.NoAceptacionEnsayo_WCGridState"), null, null);
      }
      AV19OrderedBy = AV24GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV20OrderedDsc = AV24GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV3 = 1 ;
      while ( AV99GXV3 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV3));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV38TFLb_numero = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFLb_numero_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV40TFLb_opcion = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV41TFLb_opcion_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV42TFLb_ColNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV43TFLb_ColNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV44TFLb_ColNum = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFLb_ColNum_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV48TFCliCod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFCliCod_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV50TFCliNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV51TFCliNom_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV52TFLb_Cartaz = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV53TFLb_Cartaz_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV54TFLb_cartazf = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV56TFLb_FechaEn = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV58TFLb_FechaR = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV70TFLb_Estado_SelsJson = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFLb_Estado_Sels.fromJSonString(AV70TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECNOA1") == 0 )
         {
            AV65TFLb_FecNoa1 = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_HHNOA1") == 0 )
         {
            AV67TFLb_hhnoa1 = GXutil.resetDate(localUtil.ctot( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV17Lb_Numero = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV18Lb_fechaR = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_OBSCR") == 0 )
         {
            AV69Lb_ObsCR = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV99GXV3 = (int)(AV99GXV3+1) ;
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
      this.aP0[0] = noaceptacionensayo_wcexport.this.AV11Filename;
      this.aP1[0] = noaceptacionensayo_wcexport.this.AV12ErrorMessage;
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
      AV21FilterFullText = "" ;
      AV41TFLb_opcion_Sel = "" ;
      AV40TFLb_opcion = "" ;
      AV43TFLb_ColNom_Sel = "" ;
      AV42TFLb_ColNom = "" ;
      AV51TFCliNom_Sel = "" ;
      AV50TFCliNom = "" ;
      AV53TFLb_Cartaz_Sel = "" ;
      AV52TFLb_Cartaz = "" ;
      AV54TFLb_cartazf = GXutil.nullDate() ;
      AV56TFLb_FechaEn = GXutil.nullDate() ;
      AV58TFLb_FechaR = GXutil.nullDate() ;
      AV71TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV65TFLb_FecNoa1 = GXutil.nullDate() ;
      AV67TFLb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV30ColumnsSelectorXML = "" ;
      AV27ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A5555Lb_opcion = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel = "" ;
      AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel = "" ;
      AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel = "" ;
      AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel = "" ;
      AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf = GXutil.nullDate() ;
      AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen = GXutil.nullDate() ;
      AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar = GXutil.nullDate() ;
      AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 = GXutil.nullDate() ;
      AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext = "" ;
      lV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion = "" ;
      lV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom = "" ;
      lV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom = "" ;
      lV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P09OG2_A396EmprCod = new String[] {""} ;
      P09OG2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OG2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OG2_A5566Lb_Estado = new byte[1] ;
      P09OG2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OG2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OG2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OG2_A5540Lb_Cartaz = new String[] {""} ;
      P09OG2_A279CliNom = new String[] {""} ;
      P09OG2_A252CliCod = new int[1] ;
      P09OG2_A5537Lb_ColNum = new int[1] ;
      P09OG2_A5536Lb_ColNom = new String[] {""} ;
      P09OG2_A5555Lb_opcion = new String[] {""} ;
      P09OG2_A5532Lb_numero = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV31UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV28ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV70TFLb_Estado_SelsJson = "" ;
      AV18Lb_fechaR = GXutil.nullDate() ;
      AV69Lb_ObsCR = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.noaceptacionensayo_wcexport__default(),
         new Object[] {
             new Object[] {
            P09OG2_A396EmprCod, P09OG2_A10082Lb_hhnoa1, P09OG2_A6461Lb_FecNoa1, P09OG2_A5566Lb_Estado, P09OG2_A5563Lb_FechaR, P09OG2_A5567Lb_FechaEn, P09OG2_A5594Lb_cartazf, P09OG2_A5540Lb_Cartaz, P09OG2_A279CliNom, P09OG2_A252CliCod,
            P09OG2_A5537Lb_ColNum, P09OG2_A5536Lb_ColNom, P09OG2_A5555Lb_opcion, P09OG2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV72TFLb_Estado_Sel ;
   private byte A5566Lb_Estado ;
   private short GXv_int3[] ;
   private short AV19OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFLb_numero ;
   private int AV39TFLb_numero_To ;
   private int AV44TFLb_ColNum ;
   private int AV45TFLb_ColNum_To ;
   private int AV48TFCliCod ;
   private int AV49TFCliCod_To ;
   private int AV75GXV1 ;
   private int AV76GXV2 ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ;
   private int AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ;
   private int AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ;
   private int AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ;
   private int AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ;
   private int AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ;
   private int AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ;
   private int AV17Lb_Numero ;
   private int AV99GXV3 ;
   private long AV64i ;
   private long AV35VisibleColumnCount ;
   private String AV41TFLb_opcion_Sel ;
   private String AV40TFLb_opcion ;
   private String AV43TFLb_ColNom_Sel ;
   private String AV42TFLb_ColNom ;
   private String AV51TFCliNom_Sel ;
   private String AV50TFCliNom ;
   private String AV53TFLb_Cartaz_Sel ;
   private String AV52TFLb_Cartaz ;
   private String A5555Lb_opcion ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ;
   private String AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ;
   private String AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ;
   private String AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ;
   private String lV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ;
   private String lV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ;
   private String lV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV67TFLb_hhnoa1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV54TFLb_cartazf ;
   private java.util.Date AV56TFLb_FechaEn ;
   private java.util.Date AV58TFLb_FechaR ;
   private java.util.Date AV65TFLb_FecNoa1 ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ;
   private java.util.Date AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ;
   private java.util.Date AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ;
   private java.util.Date AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ;
   private java.util.Date AV18Lb_fechaR ;
   private boolean returnInSub ;
   private boolean AV20OrderedDsc ;
   private String AV30ColumnsSelectorXML ;
   private String AV31UserCustomValue ;
   private String AV70TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV21FilterFullText ;
   private String AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String lV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ;
   private String AV69Lb_ObsCR ;
   private GXSimpleCollection<Byte> AV71TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OG2_A396EmprCod ;
   private java.util.Date[] P09OG2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P09OG2_A6461Lb_FecNoa1 ;
   private byte[] P09OG2_A5566Lb_Estado ;
   private java.util.Date[] P09OG2_A5563Lb_FechaR ;
   private java.util.Date[] P09OG2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OG2_A5594Lb_cartazf ;
   private String[] P09OG2_A5540Lb_Cartaz ;
   private String[] P09OG2_A279CliNom ;
   private int[] P09OG2_A252CliCod ;
   private int[] P09OG2_A5537Lb_ColNum ;
   private String[] P09OG2_A5536Lb_ColNom ;
   private String[] P09OG2_A5555Lb_opcion ;
   private int[] P09OG2_A5532Lb_numero ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV28ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV29ColumnsSelector_Column ;
}

final  class noaceptacionensayo_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels ,
                                          String AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext ,
                                          int AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero ,
                                          int AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to ,
                                          String AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel ,
                                          String AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion ,
                                          String AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel ,
                                          String AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom ,
                                          int AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum ,
                                          int AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to ,
                                          int AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod ,
                                          int AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to ,
                                          String AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel ,
                                          String AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom ,
                                          String AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel ,
                                          String AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz ,
                                          java.util.Date AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf ,
                                          java.util.Date AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen ,
                                          java.util.Date AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar ,
                                          int AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size ,
                                          java.util.Date AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1 ,
                                          java.util.Date AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1 ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          java.util.Date A10082Lb_hhnoa1 ,
                                          short AV19OrderedBy ,
                                          boolean AV20OrderedDsc ,
                                          String AV16Emprcod ,
                                          int AV17Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[29];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_hhnoa1, T1.Lb_FecNoa1, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_ColNum, T2.Lb_ColNom," ;
      scmdbuf += " T1.Lb_opcion, T1.Lb_numero FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = 1)");
      if ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_noaceptacionensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_noaceptacionensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_noaceptacionensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV81Gestionlaboratorio_noaceptacionensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Gestionlaboratorio_noaceptacionensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_noaceptacionensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_noaceptacionensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_noaceptacionensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_noaceptacionensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV87Gestionlaboratorio_noaceptacionensayo_wcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV88Gestionlaboratorio_noaceptacionensayo_wcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_noaceptacionensayo_wcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_noaceptacionensayo_wcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_noaceptacionensayo_wcds_14_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_noaceptacionensayo_wcds_15_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Gestionlaboratorio_noaceptacionensayo_wcds_16_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Gestionlaboratorio_noaceptacionensayo_wcds_17_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Gestionlaboratorio_noaceptacionensayo_wcds_18_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Gestionlaboratorio_noaceptacionensayo_wcds_19_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Gestionlaboratorio_noaceptacionensayo_wcds_20_tflb_fecnoa1)) )
      {
         addWhere(sWhereString, "(T1.Lb_FecNoa1 >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Gestionlaboratorio_noaceptacionensayo_wcds_21_tflb_hhnoa1) )
      {
         addWhere(sWhereString, "(T1.Lb_hhnoa1 >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV19OrderedBy == 1 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV19OrderedBy == 1 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV19OrderedBy == 2 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV19OrderedBy == 3 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV19OrderedBy == 4 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV19OrderedBy == 5 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV19OrderedBy == 6 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV19OrderedBy == 7 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV19OrderedBy == 8 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV19OrderedBy == 9 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV19OrderedBy == 10 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV19OrderedBy == 11 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FecNoa1" ;
      }
      else if ( ( AV19OrderedBy == 12 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FecNoa1 DESC" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ! AV20OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_hhnoa1" ;
      }
      else if ( ( AV19OrderedBy == 13 ) && ( AV20OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_hhnoa1 DESC" ;
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
                  return conditional_P09OG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = GXutil.resetDate(rslt.getGXDateTime(2));
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], true);
               }
               return;
      }
   }

}

