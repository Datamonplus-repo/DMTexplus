package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class aprobacioninternaensayo_wcexport extends GXProcedure
{
   public aprobacioninternaensayo_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprobacioninternaensayo_wcexport.class ), "" );
   }

   public aprobacioninternaensayo_wcexport( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      aprobacioninternaensayo_wcexport.this.aP1 = new String[] {""};
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
      aprobacioninternaensayo_wcexport.this.aP0 = aP0;
      aprobacioninternaensayo_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "AprobacionInternaEnsayo_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV59TFLb_numero) && (0==AV60TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFLb_numero_To );
      }
      if ( ! ( (GXutil.strcmp("", AV35TFLb_opcion_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFLb_opcion_Sel, GXv_char5) ;
         aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFLb_opcion)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Opcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFLb_opcion, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFLb_ColNom_Sel, GXv_char5) ;
         aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFLb_ColNom, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFLb_ColNum) && (0==AV39TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFLb_ColNum_To );
      }
      if ( ! ( (0==AV40TFLb_TipRec) && (0==AV41TFLb_TipRec_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFLb_TipRec );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFLb_TipRec_To );
      }
      if ( ! ( (0==AV42TFCliCod) && (0==AV43TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFCliNom_Sel, GXv_char5) ;
         aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFCliNom, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFLb_Cartaz_Sel, GXv_char5) ;
         aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFLb_Cartaz, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48TFLb_cartazf)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Cole.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV48TFLb_cartazf );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50TFLb_FechaEn)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Env.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV50TFLb_FechaEn );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFLb_FechaR)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Recep.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV52TFLb_FechaR );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV66TFLb_Estado_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV58i = 1 ;
         AV70GXV1 = 1 ;
         while ( AV70GXV1 <= AV66TFLb_Estado_Sels.size() )
         {
            AV67TFLb_Estado_Sel = ((Number) AV66TFLb_Estado_Sels.elementAt(-1+AV70GXV1)).byteValue() ;
            if ( AV58i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV67TFLb_Estado_Sel == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Aprob. INterna", "") );
            }
            else if ( AV67TFLb_Estado_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Recepcionado", "") );
            }
            else if ( AV67TFLb_Estado_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Enviado", "") );
            }
            AV58i = (long)(AV58i+1) ;
            AV70GXV1 = (int)(AV70GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV57TFLb_ObsCR_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFLb_ObsCR_Sel, GXv_char5) ;
         aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFLb_ObsCR)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            aprobacioninternaensayo_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFLb_ObsCR, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV71GXV2 = 1 ;
      while ( AV71GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV71GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV71GXV2 = (int)(AV71GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = AV18FilterFullText ;
      AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero = AV59TFLb_numero ;
      AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to = AV60TFLb_numero_To ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = AV34TFLb_opcion ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = AV35TFLb_opcion_Sel ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = AV36TFLb_ColNom ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = AV37TFLb_ColNom_Sel ;
      AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum = AV38TFLb_ColNum ;
      AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to = AV39TFLb_ColNum_To ;
      AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec = AV40TFLb_TipRec ;
      AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to = AV41TFLb_TipRec_To ;
      AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod = AV42TFCliCod ;
      AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to = AV43TFCliCod_To ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = AV44TFCliNom ;
      AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = AV45TFCliNom_Sel ;
      AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = AV46TFLb_Cartaz ;
      AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = AV47TFLb_Cartaz_Sel ;
      AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = AV48TFLb_cartazf ;
      AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = AV50TFLb_FechaEn ;
      AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = AV52TFLb_FechaR ;
      AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = AV66TFLb_Estado_Sels ;
      AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = AV56TFLb_ObsCR ;
      AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = AV57TFLb_ObsCR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                           AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) ,
                                           AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                           AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                           AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                           AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                           Integer.valueOf(AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) ,
                                           Integer.valueOf(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) ,
                                           Byte.valueOf(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) ,
                                           Byte.valueOf(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) ,
                                           Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) ,
                                           Integer.valueOf(AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) ,
                                           AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                           AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                           AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                           AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                           AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                           AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                           AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                           Integer.valueOf(AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels.size()) ,
                                           AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                           AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A5597Lb_TipRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A10822Lb_ObsCR ,
                                           A5594Lb_cartazf ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV61Emprcod ,
                                           Integer.valueOf(AV62Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext), "%", "") ;
      lV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = GXutil.padr( GXutil.rtrim( AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion), 1, "%") ;
      lV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = GXutil.padr( GXutil.rtrim( AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom), 13, "%") ;
      lV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom), 30, "%") ;
      lV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz), 20, "%") ;
      lV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = GXutil.concat( GXutil.rtrim( AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr), "%", "") ;
      /* Using cursor P09OA2 */
      pr_default.execute(0, new Object[] {AV61Emprcod, Integer.valueOf(AV62Lb_Numero), lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext, Integer.valueOf(AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero), Integer.valueOf(AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to), lV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion, AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel, lV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom, AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel, Integer.valueOf(AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum), Integer.valueOf(AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to), Byte.valueOf(AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec), Byte.valueOf(AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to), Integer.valueOf(AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod), Integer.valueOf(AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to), lV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom, AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel, lV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz, AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel, AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf, AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen, AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar, lV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr, AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09OA2_A5532Lb_numero[0] ;
         A396EmprCod = P09OA2_A396EmprCod[0] ;
         A10822Lb_ObsCR = P09OA2_A10822Lb_ObsCR[0] ;
         A5566Lb_Estado = P09OA2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09OA2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09OA2_A5567Lb_FechaEn[0] ;
         A5594Lb_cartazf = P09OA2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OA2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OA2_A279CliNom[0] ;
         A252CliCod = P09OA2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OA2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OA2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OA2_A5536Lb_ColNom[0] ;
         A5555Lb_opcion = P09OA2_A5555Lb_opcion[0] ;
         A5594Lb_cartazf = P09OA2_A5594Lb_cartazf[0] ;
         A5540Lb_Cartaz = P09OA2_A5540Lb_Cartaz[0] ;
         A252CliCod = P09OA2_A252CliCod[0] ;
         A5597Lb_TipRec = P09OA2_A5597Lb_TipRec[0] ;
         A5537Lb_ColNum = P09OA2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OA2_A5536Lb_ColNom[0] ;
         A279CliNom = P09OA2_A279CliNom[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5555Lb_opcion, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5597Lb_TipRec );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5594Lb_cartazf );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5567Lb_FechaEn );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5563Lb_FechaR );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( A5566Lb_Estado == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Aprob. INterna", "") );
            }
            else if ( A5566Lb_Estado == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Recepcionado", "") );
            }
            else if ( A5566Lb_Estado == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Enviado", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10822Lb_ObsCR, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV64HayProcesos = "N" ;
            /* Using cursor P09OA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5551Lb_lineaPq = P09OA3_A5551Lb_lineaPq[0] ;
               AV64HayProcesos = "S" ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64HayProcesos, GXv_char5) ;
            aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "Op", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_opcion", "", "Opcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_TipRec", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_cartazf", "", "Fecha Cole.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaEn", "", "Fecha Env.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaR", "", "Fecha Recep.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Estado", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ObsCR", "", "Observaciones", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&SeleccionarEliminar", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&HayProcesos", "", "Procesos?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.AprobacionInternaEnsayo_WCColumnsSelector", GXv_char5) ;
      aprobacioninternaensayo_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("GestionLaboratorio.AprobacionInternaEnsayo_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV3 = 1 ;
      while ( AV97GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV59TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV34TFLb_opcion = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV35TFLb_opcion_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV36TFLb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV37TFLb_ColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV38TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPREC") == 0 )
         {
            AV40TFLb_TipRec = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFLb_TipRec_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV46TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV47TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZF") == 0 )
         {
            AV48TFLb_cartazf = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV50TFLb_FechaEn = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV52TFLb_FechaR = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV65TFLb_Estado_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV66TFLb_Estado_Sels.fromJSonString(AV65TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR") == 0 )
         {
            AV56TFLb_ObsCR = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSCR_SEL") == 0 )
         {
            AV57TFLb_ObsCR_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV62Lb_Numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAR") == 0 )
         {
            AV63Lb_fechaR = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV97GXV3 = (int)(AV97GXV3+1) ;
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
      this.aP0[0] = aprobacioninternaensayo_wcexport.this.AV11Filename;
      this.aP1[0] = aprobacioninternaensayo_wcexport.this.AV12ErrorMessage;
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
      AV35TFLb_opcion_Sel = "" ;
      AV34TFLb_opcion = "" ;
      AV37TFLb_ColNom_Sel = "" ;
      AV36TFLb_ColNom = "" ;
      AV45TFCliNom_Sel = "" ;
      AV44TFCliNom = "" ;
      AV47TFLb_Cartaz_Sel = "" ;
      AV46TFLb_Cartaz = "" ;
      AV48TFLb_cartazf = GXutil.nullDate() ;
      AV50TFLb_FechaEn = GXutil.nullDate() ;
      AV52TFLb_FechaR = GXutil.nullDate() ;
      AV66TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV57TFLb_ObsCR_Sel = "" ;
      AV56TFLb_ObsCR = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A5555Lb_opcion = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A10822Lb_ObsCR = "" ;
      AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel = "" ;
      AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel = "" ;
      AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel = "" ;
      AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel = "" ;
      AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf = GXutil.nullDate() ;
      AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen = GXutil.nullDate() ;
      AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar = GXutil.nullDate() ;
      AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel = "" ;
      scmdbuf = "" ;
      lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext = "" ;
      lV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion = "" ;
      lV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom = "" ;
      lV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom = "" ;
      lV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz = "" ;
      lV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr = "" ;
      AV61Emprcod = "" ;
      A396EmprCod = "" ;
      P09OA2_A5532Lb_numero = new int[1] ;
      P09OA2_A396EmprCod = new String[] {""} ;
      P09OA2_A10822Lb_ObsCR = new String[] {""} ;
      P09OA2_A5566Lb_Estado = new byte[1] ;
      P09OA2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OA2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OA2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OA2_A5540Lb_Cartaz = new String[] {""} ;
      P09OA2_A279CliNom = new String[] {""} ;
      P09OA2_A252CliCod = new int[1] ;
      P09OA2_A5597Lb_TipRec = new byte[1] ;
      P09OA2_A5537Lb_ColNum = new int[1] ;
      P09OA2_A5536Lb_ColNom = new String[] {""} ;
      P09OA2_A5555Lb_opcion = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV64HayProcesos = "" ;
      P09OA3_A396EmprCod = new String[] {""} ;
      P09OA3_A5532Lb_numero = new int[1] ;
      P09OA3_A5551Lb_lineaPq = new short[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV65TFLb_Estado_SelsJson = "" ;
      AV63Lb_fechaR = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.aprobacioninternaensayo_wcexport__default(),
         new Object[] {
             new Object[] {
            P09OA2_A5532Lb_numero, P09OA2_A396EmprCod, P09OA2_A10822Lb_ObsCR, P09OA2_A5566Lb_Estado, P09OA2_A5563Lb_FechaR, P09OA2_A5567Lb_FechaEn, P09OA2_A5594Lb_cartazf, P09OA2_A5540Lb_Cartaz, P09OA2_A279CliNom, P09OA2_A252CliCod,
            P09OA2_A5597Lb_TipRec, P09OA2_A5537Lb_ColNum, P09OA2_A5536Lb_ColNom, P09OA2_A5555Lb_opcion
            }
            , new Object[] {
            P09OA3_A396EmprCod, P09OA3_A5532Lb_numero, P09OA3_A5551Lb_lineaPq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40TFLb_TipRec ;
   private byte AV41TFLb_TipRec_To ;
   private byte AV67TFLb_Estado_Sel ;
   private byte A5597Lb_TipRec ;
   private byte A5566Lb_Estado ;
   private byte AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ;
   private byte AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV59TFLb_numero ;
   private int AV60TFLb_numero_To ;
   private int AV38TFLb_ColNum ;
   private int AV39TFLb_ColNum_To ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV70GXV1 ;
   private int AV71GXV2 ;
   private int A5532Lb_numero ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ;
   private int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ;
   private int AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ;
   private int AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ;
   private int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ;
   private int AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ;
   private int AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ;
   private int AV62Lb_Numero ;
   private int AV97GXV3 ;
   private long AV58i ;
   private long AV31VisibleColumnCount ;
   private String AV35TFLb_opcion_Sel ;
   private String AV34TFLb_opcion ;
   private String AV37TFLb_ColNom_Sel ;
   private String AV36TFLb_ColNom ;
   private String AV45TFCliNom_Sel ;
   private String AV44TFCliNom ;
   private String AV47TFLb_Cartaz_Sel ;
   private String AV46TFLb_Cartaz ;
   private String A5555Lb_opcion ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ;
   private String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ;
   private String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ;
   private String AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ;
   private String lV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ;
   private String lV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ;
   private String lV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ;
   private String AV61Emprcod ;
   private String A396EmprCod ;
   private String AV64HayProcesos ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV48TFLb_cartazf ;
   private java.util.Date AV50TFLb_FechaEn ;
   private java.util.Date AV52TFLb_FechaR ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ;
   private java.util.Date AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ;
   private java.util.Date AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ;
   private java.util.Date AV63Lb_fechaR ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV65TFLb_Estado_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV57TFLb_ObsCR_Sel ;
   private String AV56TFLb_ObsCR ;
   private String A10822Lb_ObsCR ;
   private String AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private String AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ;
   private String lV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ;
   private String lV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ;
   private GXSimpleCollection<Byte> AV66TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OA2_A5532Lb_numero ;
   private String[] P09OA2_A396EmprCod ;
   private String[] P09OA2_A10822Lb_ObsCR ;
   private byte[] P09OA2_A5566Lb_Estado ;
   private java.util.Date[] P09OA2_A5563Lb_FechaR ;
   private java.util.Date[] P09OA2_A5567Lb_FechaEn ;
   private java.util.Date[] P09OA2_A5594Lb_cartazf ;
   private String[] P09OA2_A5540Lb_Cartaz ;
   private String[] P09OA2_A279CliNom ;
   private int[] P09OA2_A252CliCod ;
   private byte[] P09OA2_A5597Lb_TipRec ;
   private int[] P09OA2_A5537Lb_ColNum ;
   private String[] P09OA2_A5536Lb_ColNom ;
   private String[] P09OA2_A5555Lb_opcion ;
   private String[] P09OA3_A396EmprCod ;
   private int[] P09OA3_A5532Lb_numero ;
   private short[] P09OA3_A5551Lb_lineaPq ;
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

final  class aprobacioninternaensayo_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels ,
                                          String AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext ,
                                          int AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero ,
                                          int AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to ,
                                          String AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel ,
                                          String AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion ,
                                          String AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel ,
                                          String AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom ,
                                          int AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum ,
                                          int AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to ,
                                          byte AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec ,
                                          byte AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to ,
                                          int AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod ,
                                          int AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to ,
                                          String AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel ,
                                          String AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom ,
                                          String AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel ,
                                          String AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz ,
                                          java.util.Date AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf ,
                                          java.util.Date AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen ,
                                          java.util.Date AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar ,
                                          int AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size ,
                                          String AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel ,
                                          String AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A5597Lb_TipRec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A10822Lb_ObsCR ,
                                          java.util.Date A5594Lb_cartazf ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV61Emprcod ,
                                          int AV62Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[33];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_ObsCR, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_cartazf, T2.Lb_Cartaz, T3.CliNom, T2.CliCod, T2.Lb_TipRec, T2.Lb_ColNum," ;
      scmdbuf += " T2.Lb_ColNom, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_aprobacioninternaensayo_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_TipRec,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_ObsCR) like '%' || UPPER(?)))");
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
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV74Gestionlaboratorio_aprobacioninternaensayo_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV75Gestionlaboratorio_aprobacioninternaensayo_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_aprobacioninternaensayo_wcds_4_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Gestionlaboratorio_aprobacioninternaensayo_wcds_5_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Gestionlaboratorio_aprobacioninternaensayo_wcds_6_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Gestionlaboratorio_aprobacioninternaensayo_wcds_7_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_aprobacioninternaensayo_wcds_8_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV81Gestionlaboratorio_aprobacioninternaensayo_wcds_9_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV82Gestionlaboratorio_aprobacioninternaensayo_wcds_10_tflb_tiprec) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Gestionlaboratorio_aprobacioninternaensayo_wcds_11_tflb_tiprec_to) )
      {
         addWhere(sWhereString, "(T2.Lb_TipRec <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Gestionlaboratorio_aprobacioninternaensayo_wcds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_aprobacioninternaensayo_wcds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV86Gestionlaboratorio_aprobacioninternaensayo_wcds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_aprobacioninternaensayo_wcds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_aprobacioninternaensayo_wcds_16_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_aprobacioninternaensayo_wcds_17_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_aprobacioninternaensayo_wcds_18_tflb_cartazf)) )
      {
         addWhere(sWhereString, "(T2.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_aprobacioninternaensayo_wcds_19_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Gestionlaboratorio_aprobacioninternaensayo_wcds_20_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Gestionlaboratorio_aprobacioninternaensayo_wcds_21_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) && ( ! (GXutil.strcmp("", AV94Gestionlaboratorio_aprobacioninternaensayo_wcds_22_tflb_obscr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ObsCR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Gestionlaboratorio_aprobacioninternaensayo_wcds_23_tflb_obscr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ObsCR = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_opcion DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_TipRec" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_TipRec DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_Cartaz DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.Lb_cartazf DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaEn DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaR DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Estado DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ObsCR" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
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
                  return conditional_P09OA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OA3", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 300);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

