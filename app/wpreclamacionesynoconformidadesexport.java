package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpreclamacionesynoconformidadesexport extends GXProcedure
{
   public wpreclamacionesynoconformidadesexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpreclamacionesynoconformidadesexport.class ), "" );
   }

   public wpreclamacionesynoconformidadesexport( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wpreclamacionesynoconformidadesexport.this.aP1 = new String[] {""};
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
      wpreclamacionesynoconformidadesexport.this.aP0 = aP0;
      wpreclamacionesynoconformidadesexport.this.aP1 = aP1;
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
      AV11Filename = "WPReclamacionesyNoConformidadesExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      if ( ! ( (GXutil.strcmp("", AV145FilterFullText)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV145FilterFullText, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      if ( ! ( ( AV137TFHisEstReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV127i = 1 ;
         AV152GXV1 = 1 ;
         while ( AV152GXV1 <= AV137TFHisEstReo_Sels.size() )
         {
            AV138TFHisEstReo_Sel = ((Number) AV137TFHisEstReo_Sels.elementAt(-1+AV152GXV1)).byteValue() ;
            if ( AV127i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV138TFHisEstReo_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NC", "") );
            }
            else if ( AV138TFHisEstReo_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "RC", "") );
            }
            AV127i = (long)(AV127i+1) ;
            AV152GXV1 = (int)(AV152GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65TFHisReoFec)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66TFHisReoFec_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV65TFHisReoFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV66TFHisReoFec_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV134TFHisReoHDR_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV134TFHisReoHDR_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV133TFHisReoHDR)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV133TFHisReoHDR, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV140TFHisreoLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV140TFHisreoLote_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV139TFHisreoLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV139TFHisreoLote, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCliNom_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFCliNom, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFHisBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFHisBarSer_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFHisBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFHisBarSer, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV80TFHisReoDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFHisReoDsc_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFHisReoDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFHisReoDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFHisColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFHisColNom_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFHisColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFHisColNom, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV114TFHisNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV114TFHisNomCli_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV113TFHisNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV113TFHisNomCli, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV119TFHisOpeTur) && (0==AV120TFHisOpeTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV119TFHisOpeTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV120TFHisOpeTur_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFMaqCod_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFMaqCod, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFHisBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFHisBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFHisBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFHisBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFHisBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFHisBarMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFHisBarMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFHisBarMtr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141TFCostCausa)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142TFCostCausa_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coste Causa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV141TFCostCausa)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV142TFCostCausa_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143TFHisreoValorCausa)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144TFHisreoValorCausa_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV143TFHisreoValorCausa)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV144TFHisreoValorCausa_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV86TFTipDefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFTipDefDsc_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV85TFTipDefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFTipDefDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV84TFDscCausa_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tratamiento", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFDscCausa_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV83TFDscCausa)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tratamiento", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFDscCausa, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV108TFRps_Dsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Responsabilidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV108TFRps_Dsc_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV107TFRps_Dsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Responsabilidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV107TFRps_Dsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV75TFHisReoTn) && (0==AV76TFHisReoTn_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Int", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV75TFHisReoTn );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV76TFHisReoTn_To );
      }
      if ( ! ( (0==AV117TFHisOpecod) && (0==AV118TFHisOpecod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV117TFHisOpecod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV118TFHisOpecod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV94TFHisAcCo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV94TFHisAcCo_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV93TFHisAcCo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFHisAcCo, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV96TFHisAcCot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFHisAcCot_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV95TFHisAcCot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95TFHisAcCot, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV98TFHisAdEAcCo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis de Corrección", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFHisAdEAcCo_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV97TFHisAdEAcCo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis de Corrección", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFHisAdEAcCo, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV100TFHisAdEAcCt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFHisAdEAcCt_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV99TFHisAdEAcCt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFHisAdEAcCt, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV147TFHisTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "de Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV147TFHisTipArtDsc_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV146TFHisTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "de Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV146TFHisTipArtDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV149TFHisTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV149TFHisTipColDsc_Sel, GXv_char5) ;
         wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV148TFHisTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpreclamacionesynoconformidadesexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV148TFHisTipColDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("WPReclamacionesyNoConformidadesColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("WPReclamacionesyNoConformidadesColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV153GXV2 = 1 ;
      while ( AV153GXV2 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV153GXV2));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV153GXV2 = (int)(AV153GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV155Wpreclamacionesynoconformidadesds_1_filterfulltext = AV145FilterFullText ;
      AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels = AV137TFHisEstReo_Sels ;
      AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec = AV65TFHisReoFec ;
      AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to = AV66TFHisReoFec_To ;
      AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr = AV133TFHisReoHDR ;
      AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel = AV134TFHisReoHDR_Sel ;
      AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote = AV139TFHisreoLote ;
      AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel = AV140TFHisreoLote_Sel ;
      AV163Wpreclamacionesynoconformidadesds_9_tfclinom = AV47TFCliNom ;
      AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel = AV48TFCliNom_Sel ;
      AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser = AV49TFHisBarSer ;
      AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel = AV50TFHisBarSer_Sel ;
      AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc = AV79TFHisReoDsc ;
      AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel = AV80TFHisReoDsc_Sel ;
      AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom = AV51TFHisColNom ;
      AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel = AV52TFHisColNom_Sel ;
      AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli = AV113TFHisNomCli ;
      AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel = AV114TFHisNomCli_Sel ;
      AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur = AV119TFHisOpeTur ;
      AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to = AV120TFHisOpeTur_To ;
      AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod = AV63TFMaqCod ;
      AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel = AV64TFMaqCod_Sel ;
      AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm = AV59TFHisBarKgm ;
      AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to = AV60TFHisBarKgm_To ;
      AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr = AV61TFHisBarMtr ;
      AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to = AV62TFHisBarMtr_To ;
      AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa = AV141TFCostCausa ;
      AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to = AV142TFCostCausa_To ;
      AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa = AV143TFHisreoValorCausa ;
      AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to = AV144TFHisreoValorCausa_To ;
      AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc = AV85TFTipDefDsc ;
      AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel = AV86TFTipDefDsc_Sel ;
      AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa = AV83TFDscCausa ;
      AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel = AV84TFDscCausa_Sel ;
      AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc = AV107TFRps_Dsc ;
      AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel = AV108TFRps_Dsc_Sel ;
      AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn = AV75TFHisReoTn ;
      AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to = AV76TFHisReoTn_To ;
      AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod = AV117TFHisOpecod ;
      AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to = AV118TFHisOpecod_To ;
      AV195Wpreclamacionesynoconformidadesds_41_tfhisacco = AV93TFHisAcCo ;
      AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel = AV94TFHisAcCo_Sel ;
      AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot = AV95TFHisAcCot ;
      AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel = AV96TFHisAcCot_Sel ;
      AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco = AV97TFHisAdEAcCo ;
      AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel = AV98TFHisAdEAcCo_Sel ;
      AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct = AV99TFHisAdEAcCt ;
      AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel = AV100TFHisAdEAcCt_Sel ;
      AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = AV146TFHisTipArtDsc ;
      AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel = AV147TFHisTipArtDsc_Sel ;
      AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = AV148TFHisTipColDsc ;
      AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel = AV149TFHisTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ,
                                           AV155Wpreclamacionesynoconformidadesds_1_filterfulltext ,
                                           Integer.valueOf(AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels.size()) ,
                                           AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec ,
                                           AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ,
                                           AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ,
                                           AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr ,
                                           AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ,
                                           AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote ,
                                           AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel ,
                                           AV163Wpreclamacionesynoconformidadesds_9_tfclinom ,
                                           AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ,
                                           AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser ,
                                           AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ,
                                           AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc ,
                                           AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ,
                                           AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom ,
                                           AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ,
                                           AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli ,
                                           Byte.valueOf(AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur) ,
                                           Byte.valueOf(AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to) ,
                                           AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ,
                                           AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod ,
                                           AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ,
                                           AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ,
                                           AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ,
                                           AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ,
                                           AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa ,
                                           AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ,
                                           AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ,
                                           AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ,
                                           AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ,
                                           AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc ,
                                           AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ,
                                           AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa ,
                                           AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ,
                                           AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc ,
                                           Integer.valueOf(AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn) ,
                                           Integer.valueOf(AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to) ,
                                           Integer.valueOf(AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod) ,
                                           Integer.valueOf(AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to) ,
                                           AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ,
                                           AV195Wpreclamacionesynoconformidadesds_41_tfhisacco ,
                                           AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ,
                                           AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot ,
                                           AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ,
                                           AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco ,
                                           AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ,
                                           AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct ,
                                           AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ,
                                           AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ,
                                           AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ,
                                           AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ,
                                           Integer.valueOf(A539HisBarCod) ,
                                           Byte.valueOf(A545HisCodReo) ,
                                           A544HisCodPar ,
                                           A13698HisreoLote ,
                                           A279CliNom ,
                                           A542HisBarSer ,
                                           A2299HisReoDsc ,
                                           A546HisColNom ,
                                           A8889HisNomCli ,
                                           Byte.valueOf(A12950HisOpeTur) ,
                                           A602MaqCod ,
                                           A540HisBarKgm ,
                                           A541HisBarMtr ,
                                           A13699CostCausa ,
                                           A834TipDefDsc ,
                                           A5086DscCausa ,
                                           A7001Rps_Dsc ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Integer.valueOf(A12949HisOpecod) ,
                                           A5662HisAcCo ,
                                           A5693HisAcCot ,
                                           A5694HisAdEAcCo ,
                                           A5695HisAdEAcCt ,
                                           A13843HisTipArtD ,
                                           A13844HisTipColD ,
                                           A569HisReoFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr), 11, "%") ;
      lV161Wpreclamacionesynoconformidadesds_7_tfhisreolote = GXutil.padr( GXutil.rtrim( AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote), 20, "%") ;
      lV163Wpreclamacionesynoconformidadesds_9_tfclinom = GXutil.padr( GXutil.rtrim( AV163Wpreclamacionesynoconformidadesds_9_tfclinom), 30, "%") ;
      lV165Wpreclamacionesynoconformidadesds_11_tfhisbarser = GXutil.padr( GXutil.rtrim( AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser), 16, "%") ;
      lV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc), 26, "%") ;
      lV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom), 13, "%") ;
      lV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli), 13, "%") ;
      lV175Wpreclamacionesynoconformidadesds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod), 6, "%") ;
      lV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc), 30, "%") ;
      lV187Wpreclamacionesynoconformidadesds_33_tfdsccausa = GXutil.padr( GXutil.rtrim( AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa), 60, "%") ;
      lV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc), 40, "%") ;
      lV195Wpreclamacionesynoconformidadesds_41_tfhisacco = GXutil.concat( GXutil.rtrim( AV195Wpreclamacionesynoconformidadesds_41_tfhisacco), "%", "") ;
      lV197Wpreclamacionesynoconformidadesds_43_tfhisaccot = GXutil.concat( GXutil.rtrim( AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot), "%", "") ;
      lV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco), "%", "") ;
      lV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct), "%", "") ;
      lV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc), 30, "%") ;
      lV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc), 30, "%") ;
      /* Using cursor P087E2 */
      pr_default.execute(0, new Object[] {lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, lV155Wpreclamacionesynoconformidadesds_1_filterfulltext, AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec, AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to, lV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr, AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel, lV161Wpreclamacionesynoconformidadesds_7_tfhisreolote, AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel, lV163Wpreclamacionesynoconformidadesds_9_tfclinom, AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel, lV165Wpreclamacionesynoconformidadesds_11_tfhisbarser, AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel, lV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc, AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel, lV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom, AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel, lV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli, AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel, Byte.valueOf(AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur), Byte.valueOf(AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to), lV175Wpreclamacionesynoconformidadesds_21_tfmaqcod, AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel, AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm, AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to, AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr, AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to, AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa, AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to, AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa, AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to, lV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc, AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel, lV187Wpreclamacionesynoconformidadesds_33_tfdsccausa, AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel, lV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc, AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel, Integer.valueOf(AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn), Integer.valueOf(AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to), Integer.valueOf(AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod), Integer.valueOf(AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to), lV195Wpreclamacionesynoconformidadesds_41_tfhisacco, AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel, lV197Wpreclamacionesynoconformidadesds_43_tfhisaccot, AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel, lV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco, AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel, lV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct, AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel, lV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc, AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel, lV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc, AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P087E2_A396EmprCod[0] ;
         A252CliCod = P087E2_A252CliCod[0] ;
         n252CliCod = P087E2_n252CliCod[0] ;
         A571HisTipArt = P087E2_A571HisTipArt[0] ;
         n571HisTipArt = P087E2_n571HisTipArt[0] ;
         A572HisTipCol = P087E2_A572HisTipCol[0] ;
         n572HisTipCol = P087E2_n572HisTipCol[0] ;
         A833TipDefCod = P087E2_A833TipDefCod[0] ;
         A5085CodCausa = P087E2_A5085CodCausa[0] ;
         n5085CodCausa = P087E2_n5085CodCausa[0] ;
         A7000Rps_Cod = P087E2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P087E2_n7000Rps_Cod[0] ;
         A13844HisTipColD = P087E2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087E2_n13844HisTipColD[0] ;
         A13843HisTipArtD = P087E2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087E2_n13843HisTipArtD[0] ;
         A5695HisAdEAcCt = P087E2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P087E2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P087E2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P087E2_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = P087E2_A5693HisAcCot[0] ;
         n5693HisAcCot = P087E2_n5693HisAcCot[0] ;
         A5662HisAcCo = P087E2_A5662HisAcCo[0] ;
         n5662HisAcCo = P087E2_n5662HisAcCo[0] ;
         A12949HisOpecod = P087E2_A12949HisOpecod[0] ;
         n12949HisOpecod = P087E2_n12949HisOpecod[0] ;
         A2297HisReoTn = P087E2_A2297HisReoTn[0] ;
         n2297HisReoTn = P087E2_n2297HisReoTn[0] ;
         A7001Rps_Dsc = P087E2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087E2_n7001Rps_Dsc[0] ;
         A5086DscCausa = P087E2_A5086DscCausa[0] ;
         n5086DscCausa = P087E2_n5086DscCausa[0] ;
         A834TipDefDsc = P087E2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087E2_n834TipDefDsc[0] ;
         A541HisBarMtr = P087E2_A541HisBarMtr[0] ;
         n541HisBarMtr = P087E2_n541HisBarMtr[0] ;
         A602MaqCod = P087E2_A602MaqCod[0] ;
         n602MaqCod = P087E2_n602MaqCod[0] ;
         A12950HisOpeTur = P087E2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P087E2_n12950HisOpeTur[0] ;
         A8889HisNomCli = P087E2_A8889HisNomCli[0] ;
         n8889HisNomCli = P087E2_n8889HisNomCli[0] ;
         A546HisColNom = P087E2_A546HisColNom[0] ;
         n546HisColNom = P087E2_n546HisColNom[0] ;
         A2299HisReoDsc = P087E2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P087E2_n2299HisReoDsc[0] ;
         A542HisBarSer = P087E2_A542HisBarSer[0] ;
         n542HisBarSer = P087E2_n542HisBarSer[0] ;
         A279CliNom = P087E2_A279CliNom[0] ;
         A13698HisreoLote = P087E2_A13698HisreoLote[0] ;
         n13698HisreoLote = P087E2_n13698HisreoLote[0] ;
         A569HisReoFec = P087E2_A569HisReoFec[0] ;
         n569HisReoFec = P087E2_n569HisReoFec[0] ;
         A548HisEstReo = P087E2_A548HisEstReo[0] ;
         n548HisEstReo = P087E2_n548HisEstReo[0] ;
         A544HisCodPar = P087E2_A544HisCodPar[0] ;
         A545HisCodReo = P087E2_A545HisCodReo[0] ;
         A539HisBarCod = P087E2_A539HisBarCod[0] ;
         A13699CostCausa = P087E2_A13699CostCausa[0] ;
         n13699CostCausa = P087E2_n13699CostCausa[0] ;
         A540HisBarKgm = P087E2_A540HisBarKgm[0] ;
         n540HisBarKgm = P087E2_n540HisBarKgm[0] ;
         A279CliNom = P087E2_A279CliNom[0] ;
         A13843HisTipArtD = P087E2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087E2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P087E2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087E2_n13844HisTipColD[0] ;
         A834TipDefDsc = P087E2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087E2_n834TipDefDsc[0] ;
         A5086DscCausa = P087E2_A5086DscCausa[0] ;
         n5086DscCausa = P087E2_n5086DscCausa[0] ;
         A13699CostCausa = P087E2_A13699CostCausa[0] ;
         n13699CostCausa = P087E2_n13699CostCausa[0] ;
         A7001Rps_Dsc = P087E2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087E2_n7001Rps_Dsc[0] ;
         A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
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
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
            if ( A548HisEstReo == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NC", "") );
            }
            else if ( A548HisEstReo == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "RC", "") );
            }
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A569HisReoFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13697HisReoHDR, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13698HisreoLote, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A542HisBarSer, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2299HisReoDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A546HisColNom, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8889HisNomCli, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A12950HisOpeTur );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A540HisBarKgm)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A541HisBarMtr)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13699CostCausa)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13700HisreoValo)) );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A834TipDefDsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5086DscCausa, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7001Rps_Dsc, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A2297HisReoTn );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A12949HisOpecod );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5662HisAcCo, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5693HisAcCot, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5694HisAdEAcCo, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5695HisAdEAcCt, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13843HisTipArtD, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13844HisTipColD, GXv_char5) ;
            wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisEstReo", "", "Tipo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoFec", "", "Fecha", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoHDR", "", "Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisreoLote", "", "Lote", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarSer", "", "Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoDsc", "", "Descripcion", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisColNom", "", "Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisNomCli", "", "Color Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisOpeTur", "", "T", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Maquina", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarKgm", "", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarMtr", "", "Metros", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CostCausa", "", "Coste Causa", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisreoValorCausa", "", "Valor", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipDefDsc", "", "Defecto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DscCausa", "", "Tratamiento", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Rps_Dsc", "", "Responsabilidad", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoTn", "", "N Int", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisOpecod", "", "Operario", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAcCo", "", "Acciones Corrección a implementar:", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAcCot", "", "Acciones Correctivas a Implementar:", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAdEAcCo", "", "Analisis de Corrección", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAdEAcCt", "", "Analisis  Accion Correctivas", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisTipArtDsc", "", "de Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisTipColDsc", "", "Tipo Colorante", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPReclamacionesyNoConformidadesColumnsSelector", GXv_char5) ;
      wpreclamacionesynoconformidadesexport.this.GXt_char4 = GXv_char5[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("WPReclamacionesyNoConformidadesGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPReclamacionesyNoConformidadesGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("WPReclamacionesyNoConformidadesGridState"), null, null);
      }
      AV16OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV207GXV3 = 1 ;
      while ( AV207GXV3 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV207GXV3));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV145FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV136TFHisEstReo_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV137TFHisEstReo_Sels.fromJSonString(AV136TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV65TFHisReoFec = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV66TFHisReoFec_To = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV133TFHisReoHDR = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV134TFHisReoHDR_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV139TFHisreoLote = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV140TFHisreoLote_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV49TFHisBarSer = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV50TFHisBarSer_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV79TFHisReoDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV80TFHisReoDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV51TFHisColNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV52TFHisColNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV113TFHisNomCli = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV114TFHisNomCli_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV119TFHisOpeTur = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV120TFHisOpeTur_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV63TFMaqCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV64TFMaqCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV59TFHisBarKgm = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisBarKgm_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV61TFHisBarMtr = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisBarMtr_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV141TFCostCausa = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV142TFCostCausa_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV143TFHisreoValorCausa = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV144TFHisreoValorCausa_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV85TFTipDefDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV86TFTipDefDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV83TFDscCausa = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV84TFDscCausa_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV107TFRps_Dsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV108TFRps_Dsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV75TFHisReoTn = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFHisReoTn_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV117TFHisOpecod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV118TFHisOpecod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV93TFHisAcCo = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV94TFHisAcCo_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV95TFHisAcCot = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV96TFHisAcCot_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV97TFHisAdEAcCo = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV98TFHisAdEAcCo_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV99TFHisAdEAcCt = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV100TFHisAdEAcCt_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV146TFHisTipArtDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV147TFHisTipArtDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV148TFHisTipColDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV149TFHisTipColDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV207GXV3 = (int)(AV207GXV3+1) ;
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
      this.aP0[0] = wpreclamacionesynoconformidadesexport.this.AV11Filename;
      this.aP1[0] = wpreclamacionesynoconformidadesexport.this.AV12ErrorMessage;
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
      AV145FilterFullText = "" ;
      AV137TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV65TFHisReoFec = GXutil.nullDate() ;
      AV66TFHisReoFec_To = GXutil.nullDate() ;
      AV134TFHisReoHDR_Sel = "" ;
      AV133TFHisReoHDR = "" ;
      AV140TFHisreoLote_Sel = "" ;
      AV139TFHisreoLote = "" ;
      AV48TFCliNom_Sel = "" ;
      AV47TFCliNom = "" ;
      AV50TFHisBarSer_Sel = "" ;
      AV49TFHisBarSer = "" ;
      AV80TFHisReoDsc_Sel = "" ;
      AV79TFHisReoDsc = "" ;
      AV52TFHisColNom_Sel = "" ;
      AV51TFHisColNom = "" ;
      AV114TFHisNomCli_Sel = "" ;
      AV113TFHisNomCli = "" ;
      AV64TFMaqCod_Sel = "" ;
      AV63TFMaqCod = "" ;
      AV59TFHisBarKgm = DecimalUtil.ZERO ;
      AV60TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV61TFHisBarMtr = DecimalUtil.ZERO ;
      AV62TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV141TFCostCausa = DecimalUtil.ZERO ;
      AV142TFCostCausa_To = DecimalUtil.ZERO ;
      AV143TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV144TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV86TFTipDefDsc_Sel = "" ;
      AV85TFTipDefDsc = "" ;
      AV84TFDscCausa_Sel = "" ;
      AV83TFDscCausa = "" ;
      AV108TFRps_Dsc_Sel = "" ;
      AV107TFRps_Dsc = "" ;
      AV94TFHisAcCo_Sel = "" ;
      AV93TFHisAcCo = "" ;
      AV96TFHisAcCot_Sel = "" ;
      AV95TFHisAcCot = "" ;
      AV98TFHisAdEAcCo_Sel = "" ;
      AV97TFHisAdEAcCo = "" ;
      AV100TFHisAdEAcCt_Sel = "" ;
      AV99TFHisAdEAcCt = "" ;
      AV147TFHisTipArtDsc_Sel = "" ;
      AV146TFHisTipArtDsc = "" ;
      AV149TFHisTipColDsc_Sel = "" ;
      AV148TFHisTipColDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A569HisReoFec = GXutil.nullDate() ;
      A13697HisReoHDR = "" ;
      A13698HisreoLote = "" ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A13700HisreoValo = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A13843HisTipArtD = "" ;
      A13844HisTipColD = "" ;
      AV155Wpreclamacionesynoconformidadesds_1_filterfulltext = "" ;
      AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec = GXutil.nullDate() ;
      AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to = GXutil.nullDate() ;
      AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr = "" ;
      AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel = "" ;
      AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote = "" ;
      AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel = "" ;
      AV163Wpreclamacionesynoconformidadesds_9_tfclinom = "" ;
      AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel = "" ;
      AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser = "" ;
      AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel = "" ;
      AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc = "" ;
      AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel = "" ;
      AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom = "" ;
      AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel = "" ;
      AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli = "" ;
      AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel = "" ;
      AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod = "" ;
      AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel = "" ;
      AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm = DecimalUtil.ZERO ;
      AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr = DecimalUtil.ZERO ;
      AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa = DecimalUtil.ZERO ;
      AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to = DecimalUtil.ZERO ;
      AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc = "" ;
      AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel = "" ;
      AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa = "" ;
      AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel = "" ;
      AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc = "" ;
      AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel = "" ;
      AV195Wpreclamacionesynoconformidadesds_41_tfhisacco = "" ;
      AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel = "" ;
      AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot = "" ;
      AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel = "" ;
      AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco = "" ;
      AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel = "" ;
      AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct = "" ;
      AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel = "" ;
      AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = "" ;
      AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel = "" ;
      AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = "" ;
      AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV155Wpreclamacionesynoconformidadesds_1_filterfulltext = "" ;
      lV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr = "" ;
      lV161Wpreclamacionesynoconformidadesds_7_tfhisreolote = "" ;
      lV163Wpreclamacionesynoconformidadesds_9_tfclinom = "" ;
      lV165Wpreclamacionesynoconformidadesds_11_tfhisbarser = "" ;
      lV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc = "" ;
      lV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom = "" ;
      lV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli = "" ;
      lV175Wpreclamacionesynoconformidadesds_21_tfmaqcod = "" ;
      lV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc = "" ;
      lV187Wpreclamacionesynoconformidadesds_33_tfdsccausa = "" ;
      lV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc = "" ;
      lV195Wpreclamacionesynoconformidadesds_41_tfhisacco = "" ;
      lV197Wpreclamacionesynoconformidadesds_43_tfhisaccot = "" ;
      lV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco = "" ;
      lV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct = "" ;
      lV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = "" ;
      lV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = "" ;
      A544HisCodPar = "" ;
      P087E2_A396EmprCod = new String[] {""} ;
      P087E2_A252CliCod = new int[1] ;
      P087E2_n252CliCod = new boolean[] {false} ;
      P087E2_A571HisTipArt = new short[1] ;
      P087E2_n571HisTipArt = new boolean[] {false} ;
      P087E2_A572HisTipCol = new byte[1] ;
      P087E2_n572HisTipCol = new boolean[] {false} ;
      P087E2_A833TipDefCod = new short[1] ;
      P087E2_A5085CodCausa = new short[1] ;
      P087E2_n5085CodCausa = new boolean[] {false} ;
      P087E2_A7000Rps_Cod = new short[1] ;
      P087E2_n7000Rps_Cod = new boolean[] {false} ;
      P087E2_A13844HisTipColD = new String[] {""} ;
      P087E2_n13844HisTipColD = new boolean[] {false} ;
      P087E2_A13843HisTipArtD = new String[] {""} ;
      P087E2_n13843HisTipArtD = new boolean[] {false} ;
      P087E2_A5695HisAdEAcCt = new String[] {""} ;
      P087E2_n5695HisAdEAcCt = new boolean[] {false} ;
      P087E2_A5694HisAdEAcCo = new String[] {""} ;
      P087E2_n5694HisAdEAcCo = new boolean[] {false} ;
      P087E2_A5693HisAcCot = new String[] {""} ;
      P087E2_n5693HisAcCot = new boolean[] {false} ;
      P087E2_A5662HisAcCo = new String[] {""} ;
      P087E2_n5662HisAcCo = new boolean[] {false} ;
      P087E2_A12949HisOpecod = new int[1] ;
      P087E2_n12949HisOpecod = new boolean[] {false} ;
      P087E2_A2297HisReoTn = new int[1] ;
      P087E2_n2297HisReoTn = new boolean[] {false} ;
      P087E2_A7001Rps_Dsc = new String[] {""} ;
      P087E2_n7001Rps_Dsc = new boolean[] {false} ;
      P087E2_A5086DscCausa = new String[] {""} ;
      P087E2_n5086DscCausa = new boolean[] {false} ;
      P087E2_A834TipDefDsc = new String[] {""} ;
      P087E2_n834TipDefDsc = new boolean[] {false} ;
      P087E2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087E2_n541HisBarMtr = new boolean[] {false} ;
      P087E2_A602MaqCod = new String[] {""} ;
      P087E2_n602MaqCod = new boolean[] {false} ;
      P087E2_A12950HisOpeTur = new byte[1] ;
      P087E2_n12950HisOpeTur = new boolean[] {false} ;
      P087E2_A8889HisNomCli = new String[] {""} ;
      P087E2_n8889HisNomCli = new boolean[] {false} ;
      P087E2_A546HisColNom = new String[] {""} ;
      P087E2_n546HisColNom = new boolean[] {false} ;
      P087E2_A2299HisReoDsc = new String[] {""} ;
      P087E2_n2299HisReoDsc = new boolean[] {false} ;
      P087E2_A542HisBarSer = new String[] {""} ;
      P087E2_n542HisBarSer = new boolean[] {false} ;
      P087E2_A279CliNom = new String[] {""} ;
      P087E2_A13698HisreoLote = new String[] {""} ;
      P087E2_n13698HisreoLote = new boolean[] {false} ;
      P087E2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P087E2_n569HisReoFec = new boolean[] {false} ;
      P087E2_A548HisEstReo = new byte[1] ;
      P087E2_n548HisEstReo = new boolean[] {false} ;
      P087E2_A544HisCodPar = new String[] {""} ;
      P087E2_A545HisCodReo = new byte[1] ;
      P087E2_A539HisBarCod = new int[1] ;
      P087E2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087E2_n13699CostCausa = new boolean[] {false} ;
      P087E2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087E2_n540HisBarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV136TFHisEstReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpreclamacionesynoconformidadesexport__default(),
         new Object[] {
             new Object[] {
            P087E2_A396EmprCod, P087E2_A252CliCod, P087E2_n252CliCod, P087E2_A571HisTipArt, P087E2_n571HisTipArt, P087E2_A572HisTipCol, P087E2_n572HisTipCol, P087E2_A833TipDefCod, P087E2_A5085CodCausa, P087E2_n5085CodCausa,
            P087E2_A7000Rps_Cod, P087E2_n7000Rps_Cod, P087E2_A13844HisTipColD, P087E2_n13844HisTipColD, P087E2_A13843HisTipArtD, P087E2_n13843HisTipArtD, P087E2_A5695HisAdEAcCt, P087E2_n5695HisAdEAcCt, P087E2_A5694HisAdEAcCo, P087E2_n5694HisAdEAcCo,
            P087E2_A5693HisAcCot, P087E2_n5693HisAcCot, P087E2_A5662HisAcCo, P087E2_n5662HisAcCo, P087E2_A12949HisOpecod, P087E2_n12949HisOpecod, P087E2_A2297HisReoTn, P087E2_n2297HisReoTn, P087E2_A7001Rps_Dsc, P087E2_n7001Rps_Dsc,
            P087E2_A5086DscCausa, P087E2_n5086DscCausa, P087E2_A834TipDefDsc, P087E2_n834TipDefDsc, P087E2_A541HisBarMtr, P087E2_n541HisBarMtr, P087E2_A602MaqCod, P087E2_n602MaqCod, P087E2_A12950HisOpeTur, P087E2_n12950HisOpeTur,
            P087E2_A8889HisNomCli, P087E2_n8889HisNomCli, P087E2_A546HisColNom, P087E2_n546HisColNom, P087E2_A2299HisReoDsc, P087E2_n2299HisReoDsc, P087E2_A542HisBarSer, P087E2_n542HisBarSer, P087E2_A279CliNom, P087E2_A13698HisreoLote,
            P087E2_n13698HisreoLote, P087E2_A569HisReoFec, P087E2_n569HisReoFec, P087E2_A548HisEstReo, P087E2_n548HisEstReo, P087E2_A544HisCodPar, P087E2_A545HisCodReo, P087E2_A539HisBarCod, P087E2_A13699CostCausa, P087E2_n13699CostCausa,
            P087E2_A540HisBarKgm, P087E2_n540HisBarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV138TFHisEstReo_Sel ;
   private byte AV119TFHisOpeTur ;
   private byte AV120TFHisOpeTur_To ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur ;
   private byte AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV152GXV1 ;
   private int AV75TFHisReoTn ;
   private int AV76TFHisReoTn_To ;
   private int AV117TFHisOpecod ;
   private int AV118TFHisOpecod_To ;
   private int AV153GXV2 ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn ;
   private int AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to ;
   private int AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod ;
   private int AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to ;
   private int AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV207GXV3 ;
   private long AV127i ;
   private long AV32VisibleColumnCount ;
   private java.math.BigDecimal AV59TFHisBarKgm ;
   private java.math.BigDecimal AV60TFHisBarKgm_To ;
   private java.math.BigDecimal AV61TFHisBarMtr ;
   private java.math.BigDecimal AV62TFHisBarMtr_To ;
   private java.math.BigDecimal AV141TFCostCausa ;
   private java.math.BigDecimal AV142TFCostCausa_To ;
   private java.math.BigDecimal AV143TFHisreoValorCausa ;
   private java.math.BigDecimal AV144TFHisreoValorCausa_To ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ;
   private java.math.BigDecimal AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ;
   private java.math.BigDecimal AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ;
   private java.math.BigDecimal AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ;
   private java.math.BigDecimal AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa ;
   private java.math.BigDecimal AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ;
   private java.math.BigDecimal AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ;
   private java.math.BigDecimal AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ;
   private String AV134TFHisReoHDR_Sel ;
   private String AV133TFHisReoHDR ;
   private String AV140TFHisreoLote_Sel ;
   private String AV139TFHisreoLote ;
   private String AV48TFCliNom_Sel ;
   private String AV47TFCliNom ;
   private String AV50TFHisBarSer_Sel ;
   private String AV49TFHisBarSer ;
   private String AV80TFHisReoDsc_Sel ;
   private String AV79TFHisReoDsc ;
   private String AV52TFHisColNom_Sel ;
   private String AV51TFHisColNom ;
   private String AV114TFHisNomCli_Sel ;
   private String AV113TFHisNomCli ;
   private String AV64TFMaqCod_Sel ;
   private String AV63TFMaqCod ;
   private String AV86TFTipDefDsc_Sel ;
   private String AV85TFTipDefDsc ;
   private String AV84TFDscCausa_Sel ;
   private String AV83TFDscCausa ;
   private String AV108TFRps_Dsc_Sel ;
   private String AV107TFRps_Dsc ;
   private String AV147TFHisTipArtDsc_Sel ;
   private String AV146TFHisTipArtDsc ;
   private String AV149TFHisTipColDsc_Sel ;
   private String AV148TFHisTipColDsc ;
   private String A13697HisReoHDR ;
   private String A13698HisreoLote ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A13843HisTipArtD ;
   private String A13844HisTipColD ;
   private String AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr ;
   private String AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ;
   private String AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote ;
   private String AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ;
   private String AV163Wpreclamacionesynoconformidadesds_9_tfclinom ;
   private String AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel ;
   private String AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser ;
   private String AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ;
   private String AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc ;
   private String AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ;
   private String AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom ;
   private String AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ;
   private String AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli ;
   private String AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ;
   private String AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod ;
   private String AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ;
   private String AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc ;
   private String AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ;
   private String AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa ;
   private String AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ;
   private String AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc ;
   private String AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ;
   private String AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ;
   private String AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ;
   private String AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ;
   private String AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ;
   private String scmdbuf ;
   private String lV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr ;
   private String lV161Wpreclamacionesynoconformidadesds_7_tfhisreolote ;
   private String lV163Wpreclamacionesynoconformidadesds_9_tfclinom ;
   private String lV165Wpreclamacionesynoconformidadesds_11_tfhisbarser ;
   private String lV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc ;
   private String lV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom ;
   private String lV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli ;
   private String lV175Wpreclamacionesynoconformidadesds_21_tfmaqcod ;
   private String lV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc ;
   private String lV187Wpreclamacionesynoconformidadesds_33_tfdsccausa ;
   private String lV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc ;
   private String lV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ;
   private String lV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ;
   private String A544HisCodPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV65TFHisReoFec ;
   private java.util.Date AV66TFHisReoFec_To ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec ;
   private java.util.Date AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private boolean n572HisTipCol ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n13844HisTipColD ;
   private boolean n13843HisTipArtD ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5662HisAcCo ;
   private boolean n12949HisOpecod ;
   private boolean n2297HisReoTn ;
   private boolean n7001Rps_Dsc ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n541HisBarMtr ;
   private boolean n602MaqCod ;
   private boolean n12950HisOpeTur ;
   private boolean n8889HisNomCli ;
   private boolean n546HisColNom ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n13698HisreoLote ;
   private boolean n569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n13699CostCausa ;
   private boolean n540HisBarKgm ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV136TFHisEstReo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV145FilterFullText ;
   private String AV94TFHisAcCo_Sel ;
   private String AV93TFHisAcCo ;
   private String AV96TFHisAcCot_Sel ;
   private String AV95TFHisAcCot ;
   private String AV98TFHisAdEAcCo_Sel ;
   private String AV97TFHisAdEAcCo ;
   private String AV100TFHisAdEAcCt_Sel ;
   private String AV99TFHisAdEAcCt ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String AV155Wpreclamacionesynoconformidadesds_1_filterfulltext ;
   private String AV195Wpreclamacionesynoconformidadesds_41_tfhisacco ;
   private String AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ;
   private String AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot ;
   private String AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ;
   private String AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco ;
   private String AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ;
   private String AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct ;
   private String AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ;
   private String lV155Wpreclamacionesynoconformidadesds_1_filterfulltext ;
   private String lV195Wpreclamacionesynoconformidadesds_41_tfhisacco ;
   private String lV197Wpreclamacionesynoconformidadesds_43_tfhisaccot ;
   private String lV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco ;
   private String lV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct ;
   private GXSimpleCollection<Byte> AV137TFHisEstReo_Sels ;
   private GXSimpleCollection<Byte> AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P087E2_A396EmprCod ;
   private int[] P087E2_A252CliCod ;
   private boolean[] P087E2_n252CliCod ;
   private short[] P087E2_A571HisTipArt ;
   private boolean[] P087E2_n571HisTipArt ;
   private byte[] P087E2_A572HisTipCol ;
   private boolean[] P087E2_n572HisTipCol ;
   private short[] P087E2_A833TipDefCod ;
   private short[] P087E2_A5085CodCausa ;
   private boolean[] P087E2_n5085CodCausa ;
   private short[] P087E2_A7000Rps_Cod ;
   private boolean[] P087E2_n7000Rps_Cod ;
   private String[] P087E2_A13844HisTipColD ;
   private boolean[] P087E2_n13844HisTipColD ;
   private String[] P087E2_A13843HisTipArtD ;
   private boolean[] P087E2_n13843HisTipArtD ;
   private String[] P087E2_A5695HisAdEAcCt ;
   private boolean[] P087E2_n5695HisAdEAcCt ;
   private String[] P087E2_A5694HisAdEAcCo ;
   private boolean[] P087E2_n5694HisAdEAcCo ;
   private String[] P087E2_A5693HisAcCot ;
   private boolean[] P087E2_n5693HisAcCot ;
   private String[] P087E2_A5662HisAcCo ;
   private boolean[] P087E2_n5662HisAcCo ;
   private int[] P087E2_A12949HisOpecod ;
   private boolean[] P087E2_n12949HisOpecod ;
   private int[] P087E2_A2297HisReoTn ;
   private boolean[] P087E2_n2297HisReoTn ;
   private String[] P087E2_A7001Rps_Dsc ;
   private boolean[] P087E2_n7001Rps_Dsc ;
   private String[] P087E2_A5086DscCausa ;
   private boolean[] P087E2_n5086DscCausa ;
   private String[] P087E2_A834TipDefDsc ;
   private boolean[] P087E2_n834TipDefDsc ;
   private java.math.BigDecimal[] P087E2_A541HisBarMtr ;
   private boolean[] P087E2_n541HisBarMtr ;
   private String[] P087E2_A602MaqCod ;
   private boolean[] P087E2_n602MaqCod ;
   private byte[] P087E2_A12950HisOpeTur ;
   private boolean[] P087E2_n12950HisOpeTur ;
   private String[] P087E2_A8889HisNomCli ;
   private boolean[] P087E2_n8889HisNomCli ;
   private String[] P087E2_A546HisColNom ;
   private boolean[] P087E2_n546HisColNom ;
   private String[] P087E2_A2299HisReoDsc ;
   private boolean[] P087E2_n2299HisReoDsc ;
   private String[] P087E2_A542HisBarSer ;
   private boolean[] P087E2_n542HisBarSer ;
   private String[] P087E2_A279CliNom ;
   private String[] P087E2_A13698HisreoLote ;
   private boolean[] P087E2_n13698HisreoLote ;
   private java.util.Date[] P087E2_A569HisReoFec ;
   private boolean[] P087E2_n569HisReoFec ;
   private byte[] P087E2_A548HisEstReo ;
   private boolean[] P087E2_n548HisEstReo ;
   private String[] P087E2_A544HisCodPar ;
   private byte[] P087E2_A545HisCodReo ;
   private int[] P087E2_A539HisBarCod ;
   private java.math.BigDecimal[] P087E2_A13699CostCausa ;
   private boolean[] P087E2_n13699CostCausa ;
   private java.math.BigDecimal[] P087E2_A540HisBarKgm ;
   private boolean[] P087E2_n540HisBarKgm ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class wpreclamacionesynoconformidadesexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P087E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ,
                                          String AV155Wpreclamacionesynoconformidadesds_1_filterfulltext ,
                                          int AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec ,
                                          java.util.Date AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ,
                                          String AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ,
                                          String AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr ,
                                          String AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ,
                                          String AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote ,
                                          String AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel ,
                                          String AV163Wpreclamacionesynoconformidadesds_9_tfclinom ,
                                          String AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ,
                                          String AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser ,
                                          String AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ,
                                          String AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc ,
                                          String AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ,
                                          String AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom ,
                                          String AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ,
                                          String AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli ,
                                          byte AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur ,
                                          byte AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to ,
                                          String AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ,
                                          String AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod ,
                                          java.math.BigDecimal AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ,
                                          java.math.BigDecimal AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ,
                                          java.math.BigDecimal AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa ,
                                          java.math.BigDecimal AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ,
                                          java.math.BigDecimal AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ,
                                          String AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ,
                                          String AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc ,
                                          String AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ,
                                          String AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa ,
                                          String AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ,
                                          String AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc ,
                                          int AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn ,
                                          int AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to ,
                                          int AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod ,
                                          int AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to ,
                                          String AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ,
                                          String AV195Wpreclamacionesynoconformidadesds_41_tfhisacco ,
                                          String AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ,
                                          String AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot ,
                                          String AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ,
                                          String AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco ,
                                          String AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ,
                                          String AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct ,
                                          String AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ,
                                          String AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ,
                                          String AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ,
                                          String AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[75];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.HisTipArt AS HisTipArt, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc" ;
      scmdbuf += " AS HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod," ;
      scmdbuf += " T1.HisOpeTur, T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod," ;
      scmdbuf += " T6.CostCausa, T1.HisBarKgm FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod)" ;
      if ( ! (GXutil.strcmp("", AV155Wpreclamacionesynoconformidadesds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
         GXv_int9[1] = (byte)(1) ;
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
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
         GXv_int9[16] = (byte)(1) ;
         GXv_int9[17] = (byte)(1) ;
         GXv_int9[18] = (byte)(1) ;
         GXv_int9[19] = (byte)(1) ;
         GXv_int9[20] = (byte)(1) ;
         GXv_int9[21] = (byte)(1) ;
         GXv_int9[22] = (byte)(1) ;
         GXv_int9[23] = (byte)(1) ;
         GXv_int9[24] = (byte)(1) ;
      }
      if ( AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV156Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Wpreclamacionesynoconformidadesds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Wpreclamacionesynoconformidadesds_4_tfhisreofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV159Wpreclamacionesynoconformidadesds_5_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV161Wpreclamacionesynoconformidadesds_7_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV163Wpreclamacionesynoconformidadesds_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Wpreclamacionesynoconformidadesds_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV165Wpreclamacionesynoconformidadesds_11_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV167Wpreclamacionesynoconformidadesds_13_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Wpreclamacionesynoconformidadesds_15_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV171Wpreclamacionesynoconformidadesds_17_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV173Wpreclamacionesynoconformidadesds_19_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (0==AV174Wpreclamacionesynoconformidadesds_20_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV175Wpreclamacionesynoconformidadesds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Wpreclamacionesynoconformidadesds_23_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Wpreclamacionesynoconformidadesds_25_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Wpreclamacionesynoconformidadesds_27_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Wpreclamacionesynoconformidadesds_28_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV185Wpreclamacionesynoconformidadesds_31_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV187Wpreclamacionesynoconformidadesds_33_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV189Wpreclamacionesynoconformidadesds_35_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (0==AV191Wpreclamacionesynoconformidadesds_37_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (0==AV192Wpreclamacionesynoconformidadesds_38_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (0==AV193Wpreclamacionesynoconformidadesds_39_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( ! (0==AV194Wpreclamacionesynoconformidadesds_40_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV195Wpreclamacionesynoconformidadesds_41_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV196Wpreclamacionesynoconformidadesds_42_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV197Wpreclamacionesynoconformidadesds_43_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV199Wpreclamacionesynoconformidadesds_45_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV201Wpreclamacionesynoconformidadesds_47_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV203Wpreclamacionesynoconformidadesds_49_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV204Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int9[72] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV205Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV206Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int9[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisEstReo" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisEstReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisreoLote" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisreoLote DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarSer" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisColNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisNomCli" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisOpeTur" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisOpeTur DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarKgm" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarKgm DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarMtr" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarMtr DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.CostCausa" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CostCausa DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipDefDsc" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipDefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.DscCausa" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.DscCausa DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T7.Rps_Dsc" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T7.Rps_Dsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoTn" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoTn DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisOpecod" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisOpecod DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAcCo" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAcCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAcCot" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAcCot DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCo" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCt" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCt DESC" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
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
                  return conditional_P087E2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).byteValue() , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (java.util.Date)dynConstraints[79] , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((String[]) buf[49])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((int[]) buf[57])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 3);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 3);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 3);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 3);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 60);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 60);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 40);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 40);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[138], 3276);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[139], 3276);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[140], 2000);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 2000);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 2000);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[143], 2000);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[144], 2000);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 30);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 30);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 30);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 30);
               }
               return;
      }
   }

}

