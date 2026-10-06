package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpncyrcexport extends GXProcedure
{
   public wpncyrcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpncyrcexport.class ), "" );
   }

   public wpncyrcexport( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wpncyrcexport.this.aP1 = new String[] {""};
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
      wpncyrcexport.this.aP0 = aP0;
      wpncyrcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WPNcyRcExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV107FilterFullText, GXv_char5) ;
      wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( ( AV53TFHisEstReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV57i = 1 ;
         AV118GXV1 = 1 ;
         while ( AV118GXV1 <= AV53TFHisEstReo_Sels.size() )
         {
            AV54TFHisEstReo_Sel = ((Number) AV53TFHisEstReo_Sels.elementAt(-1+AV118GXV1)).byteValue() ;
            if ( AV57i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV54TFHisEstReo_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NC", "") );
            }
            else if ( AV54TFHisEstReo_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "RC", "") );
            }
            AV57i = (long)(AV57i+1) ;
            AV118GXV1 = (int)(AV118GXV1+1) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFHisReoFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV58TFHisReoFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV56TFHisReoHDR_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFHisReoHDR_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFHisReoHDR)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFHisReoHDR, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV66TFHisreoLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFHisreoLote_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFHisreoLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFHisreoLote, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV68TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFCliNom_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV67TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFCliNom, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV70TFHisBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFHisBarSer_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFHisBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFHisBarSer, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFHisReoDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFHisReoDsc_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFHisReoDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFHisReoDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFHisColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFHisColNom_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFHisColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFHisColNom, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV76TFHisNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFHisNomCli_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFHisNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFHisNomCli, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV77TFHisOpeTur) && (0==AV78TFHisOpeTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV77TFHisOpeTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV78TFHisOpeTur_To );
      }
      if ( ! ( (GXutil.strcmp("", AV80TFMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFMaqCod_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Código Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFMaqCod, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFHisBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFHisBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV81TFHisBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82TFHisBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFHisBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFHisBarMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV83TFHisBarMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV84TFHisBarMtr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFCostCausa)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFCostCausa_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coste", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV85TFCostCausa)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV86TFCostCausa_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFHisreoValorCausa)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFHisreoValorCausa_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Valor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV87TFHisreoValorCausa)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV88TFHisreoValorCausa_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV90TFTipDefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV90TFTipDefDsc_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV89TFTipDefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFTipDefDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV92TFDscCausa_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Causa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFDscCausa_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV91TFDscCausa)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Causa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFDscCausa, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV94TFRps_Dsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Responsabilidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV94TFRps_Dsc_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV93TFRps_Dsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Responsabilidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFRps_Dsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV95TFHisReoTn) && (0==AV96TFHisReoTn_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Int", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV95TFHisReoTn );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV96TFHisReoTn_To );
      }
      if ( ! ( (0==AV97TFHisOpecod) && (0==AV98TFHisOpecod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV97TFHisOpecod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV98TFHisOpecod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV100TFHisAcCo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFHisAcCo_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV99TFHisAcCo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFHisAcCo, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV102TFHisAcCot_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFHisAcCot_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV101TFHisAcCot)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101TFHisAcCot, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV104TFHisAdEAcCo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis de Corrección", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV104TFHisAdEAcCo_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV103TFHisAdEAcCo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis de Corrección", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103TFHisAdEAcCo, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV106TFHisAdEAcCt_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106TFHisAdEAcCt_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV105TFHisAdEAcCt)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV105TFHisAdEAcCt, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV113TFHisTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "de Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV113TFHisTipArtDsc_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV112TFHisTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "de Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV112TFHisTipArtDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV115TFHisTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV115TFHisTipColDsc_Sel, GXv_char5) ;
         wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV114TFHisTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wpncyrcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV114TFHisTipColDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV49VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV37Session.getValue("WPNcyRcColumnsSelector"), "") != 0 )
      {
         AV44ColumnsSelectorXML = AV37Session.getValue("WPNcyRcColumnsSelector") ;
         AV41ColumnsSelector.fromxml(AV44ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV119GXV2 = 1 ;
      while ( AV119GXV2 <= AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV43ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV119GXV2));
         if ( AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV43ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setColor( 11 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         AV119GXV2 = (int)(AV119GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV121Wpncyrcds_1_filterfulltext = AV107FilterFullText ;
      AV122Wpncyrcds_2_tfhisestreo_sels = AV53TFHisEstReo_Sels ;
      AV123Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV124Wpncyrcds_4_tfhisreohdr = AV55TFHisReoHDR ;
      AV125Wpncyrcds_5_tfhisreohdr_sel = AV56TFHisReoHDR_Sel ;
      AV126Wpncyrcds_6_tfhisreolote = AV65TFHisreoLote ;
      AV127Wpncyrcds_7_tfhisreolote_sel = AV66TFHisreoLote_Sel ;
      AV128Wpncyrcds_8_tfclinom = AV67TFCliNom ;
      AV129Wpncyrcds_9_tfclinom_sel = AV68TFCliNom_Sel ;
      AV130Wpncyrcds_10_tfhisbarser = AV69TFHisBarSer ;
      AV131Wpncyrcds_11_tfhisbarser_sel = AV70TFHisBarSer_Sel ;
      AV132Wpncyrcds_12_tfhisreodsc = AV71TFHisReoDsc ;
      AV133Wpncyrcds_13_tfhisreodsc_sel = AV72TFHisReoDsc_Sel ;
      AV134Wpncyrcds_14_tfhiscolnom = AV73TFHisColNom ;
      AV135Wpncyrcds_15_tfhiscolnom_sel = AV74TFHisColNom_Sel ;
      AV136Wpncyrcds_16_tfhisnomcli = AV75TFHisNomCli ;
      AV137Wpncyrcds_17_tfhisnomcli_sel = AV76TFHisNomCli_Sel ;
      AV138Wpncyrcds_18_tfhisopetur = AV77TFHisOpeTur ;
      AV139Wpncyrcds_19_tfhisopetur_to = AV78TFHisOpeTur_To ;
      AV140Wpncyrcds_20_tfmaqcod = AV79TFMaqCod ;
      AV141Wpncyrcds_21_tfmaqcod_sel = AV80TFMaqCod_Sel ;
      AV142Wpncyrcds_22_tfhisbarkgm = AV81TFHisBarKgm ;
      AV143Wpncyrcds_23_tfhisbarkgm_to = AV82TFHisBarKgm_To ;
      AV144Wpncyrcds_24_tfhisbarmtr = AV83TFHisBarMtr ;
      AV145Wpncyrcds_25_tfhisbarmtr_to = AV84TFHisBarMtr_To ;
      AV146Wpncyrcds_26_tfcostcausa = AV85TFCostCausa ;
      AV147Wpncyrcds_27_tfcostcausa_to = AV86TFCostCausa_To ;
      AV148Wpncyrcds_28_tfhisreovalorcausa = AV87TFHisreoValorCausa ;
      AV149Wpncyrcds_29_tfhisreovalorcausa_to = AV88TFHisreoValorCausa_To ;
      AV150Wpncyrcds_30_tftipdefdsc = AV89TFTipDefDsc ;
      AV151Wpncyrcds_31_tftipdefdsc_sel = AV90TFTipDefDsc_Sel ;
      AV152Wpncyrcds_32_tfdsccausa = AV91TFDscCausa ;
      AV153Wpncyrcds_33_tfdsccausa_sel = AV92TFDscCausa_Sel ;
      AV154Wpncyrcds_34_tfrps_dsc = AV93TFRps_Dsc ;
      AV155Wpncyrcds_35_tfrps_dsc_sel = AV94TFRps_Dsc_Sel ;
      AV156Wpncyrcds_36_tfhisreotn = AV95TFHisReoTn ;
      AV157Wpncyrcds_37_tfhisreotn_to = AV96TFHisReoTn_To ;
      AV158Wpncyrcds_38_tfhisopecod = AV97TFHisOpecod ;
      AV159Wpncyrcds_39_tfhisopecod_to = AV98TFHisOpecod_To ;
      AV160Wpncyrcds_40_tfhisacco = AV99TFHisAcCo ;
      AV161Wpncyrcds_41_tfhisacco_sel = AV100TFHisAcCo_Sel ;
      AV162Wpncyrcds_42_tfhisaccot = AV101TFHisAcCot ;
      AV163Wpncyrcds_43_tfhisaccot_sel = AV102TFHisAcCot_Sel ;
      AV164Wpncyrcds_44_tfhisadeacco = AV103TFHisAdEAcCo ;
      AV165Wpncyrcds_45_tfhisadeacco_sel = AV104TFHisAdEAcCo_Sel ;
      AV166Wpncyrcds_46_tfhisadeacct = AV105TFHisAdEAcCt ;
      AV167Wpncyrcds_47_tfhisadeacct_sel = AV106TFHisAdEAcCt_Sel ;
      AV168Wpncyrcds_48_tfhistipartdsc = AV112TFHisTipArtDsc ;
      AV169Wpncyrcds_49_tfhistipartdsc_sel = AV113TFHisTipArtDsc_Sel ;
      AV170Wpncyrcds_50_tfhistipcoldsc = AV114TFHisTipColDsc ;
      AV171Wpncyrcds_51_tfhistipcoldsc_sel = AV115TFHisTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV122Wpncyrcds_2_tfhisestreo_sels ,
                                           AV121Wpncyrcds_1_filterfulltext ,
                                           Integer.valueOf(AV122Wpncyrcds_2_tfhisestreo_sels.size()) ,
                                           AV123Wpncyrcds_3_tfhisreofec ,
                                           AV125Wpncyrcds_5_tfhisreohdr_sel ,
                                           AV124Wpncyrcds_4_tfhisreohdr ,
                                           AV127Wpncyrcds_7_tfhisreolote_sel ,
                                           AV126Wpncyrcds_6_tfhisreolote ,
                                           AV129Wpncyrcds_9_tfclinom_sel ,
                                           AV128Wpncyrcds_8_tfclinom ,
                                           AV131Wpncyrcds_11_tfhisbarser_sel ,
                                           AV130Wpncyrcds_10_tfhisbarser ,
                                           AV133Wpncyrcds_13_tfhisreodsc_sel ,
                                           AV132Wpncyrcds_12_tfhisreodsc ,
                                           AV135Wpncyrcds_15_tfhiscolnom_sel ,
                                           AV134Wpncyrcds_14_tfhiscolnom ,
                                           AV137Wpncyrcds_17_tfhisnomcli_sel ,
                                           AV136Wpncyrcds_16_tfhisnomcli ,
                                           Byte.valueOf(AV138Wpncyrcds_18_tfhisopetur) ,
                                           Byte.valueOf(AV139Wpncyrcds_19_tfhisopetur_to) ,
                                           AV141Wpncyrcds_21_tfmaqcod_sel ,
                                           AV140Wpncyrcds_20_tfmaqcod ,
                                           AV142Wpncyrcds_22_tfhisbarkgm ,
                                           AV143Wpncyrcds_23_tfhisbarkgm_to ,
                                           AV144Wpncyrcds_24_tfhisbarmtr ,
                                           AV145Wpncyrcds_25_tfhisbarmtr_to ,
                                           AV146Wpncyrcds_26_tfcostcausa ,
                                           AV147Wpncyrcds_27_tfcostcausa_to ,
                                           AV148Wpncyrcds_28_tfhisreovalorcausa ,
                                           AV149Wpncyrcds_29_tfhisreovalorcausa_to ,
                                           AV151Wpncyrcds_31_tftipdefdsc_sel ,
                                           AV150Wpncyrcds_30_tftipdefdsc ,
                                           AV153Wpncyrcds_33_tfdsccausa_sel ,
                                           AV152Wpncyrcds_32_tfdsccausa ,
                                           AV155Wpncyrcds_35_tfrps_dsc_sel ,
                                           AV154Wpncyrcds_34_tfrps_dsc ,
                                           Integer.valueOf(AV156Wpncyrcds_36_tfhisreotn) ,
                                           Integer.valueOf(AV157Wpncyrcds_37_tfhisreotn_to) ,
                                           Integer.valueOf(AV158Wpncyrcds_38_tfhisopecod) ,
                                           Integer.valueOf(AV159Wpncyrcds_39_tfhisopecod_to) ,
                                           AV161Wpncyrcds_41_tfhisacco_sel ,
                                           AV160Wpncyrcds_40_tfhisacco ,
                                           AV163Wpncyrcds_43_tfhisaccot_sel ,
                                           AV162Wpncyrcds_42_tfhisaccot ,
                                           AV165Wpncyrcds_45_tfhisadeacco_sel ,
                                           AV164Wpncyrcds_44_tfhisadeacco ,
                                           AV167Wpncyrcds_47_tfhisadeacct_sel ,
                                           AV166Wpncyrcds_46_tfhisadeacct ,
                                           AV169Wpncyrcds_49_tfhistipartdsc_sel ,
                                           AV168Wpncyrcds_48_tfhistipartdsc ,
                                           AV171Wpncyrcds_51_tfhistipcoldsc_sel ,
                                           AV170Wpncyrcds_50_tfhistipcoldsc ,
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
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV121Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV121Wpncyrcds_1_filterfulltext), "%", "") ;
      lV124Wpncyrcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV124Wpncyrcds_4_tfhisreohdr), 11, "%") ;
      lV126Wpncyrcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV126Wpncyrcds_6_tfhisreolote), 20, "%") ;
      lV128Wpncyrcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV128Wpncyrcds_8_tfclinom), 30, "%") ;
      lV130Wpncyrcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV130Wpncyrcds_10_tfhisbarser), 16, "%") ;
      lV132Wpncyrcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV132Wpncyrcds_12_tfhisreodsc), 26, "%") ;
      lV134Wpncyrcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV134Wpncyrcds_14_tfhiscolnom), 13, "%") ;
      lV136Wpncyrcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV136Wpncyrcds_16_tfhisnomcli), 13, "%") ;
      lV140Wpncyrcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV140Wpncyrcds_20_tfmaqcod), 6, "%") ;
      lV150Wpncyrcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV150Wpncyrcds_30_tftipdefdsc), 30, "%") ;
      lV152Wpncyrcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV152Wpncyrcds_32_tfdsccausa), 60, "%") ;
      lV154Wpncyrcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV154Wpncyrcds_34_tfrps_dsc), 40, "%") ;
      lV160Wpncyrcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV160Wpncyrcds_40_tfhisacco), "%", "") ;
      lV162Wpncyrcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV162Wpncyrcds_42_tfhisaccot), "%", "") ;
      lV164Wpncyrcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV164Wpncyrcds_44_tfhisadeacco), "%", "") ;
      lV166Wpncyrcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV166Wpncyrcds_46_tfhisadeacct), "%", "") ;
      lV168Wpncyrcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV168Wpncyrcds_48_tfhistipartdsc), 30, "%") ;
      lV170Wpncyrcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV170Wpncyrcds_50_tfhistipcoldsc), 30, "%") ;
      /* Using cursor P087I2 */
      pr_default.execute(0, new Object[] {lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, lV121Wpncyrcds_1_filterfulltext, AV123Wpncyrcds_3_tfhisreofec, lV124Wpncyrcds_4_tfhisreohdr, AV125Wpncyrcds_5_tfhisreohdr_sel, lV126Wpncyrcds_6_tfhisreolote, AV127Wpncyrcds_7_tfhisreolote_sel, lV128Wpncyrcds_8_tfclinom, AV129Wpncyrcds_9_tfclinom_sel, lV130Wpncyrcds_10_tfhisbarser, AV131Wpncyrcds_11_tfhisbarser_sel, lV132Wpncyrcds_12_tfhisreodsc, AV133Wpncyrcds_13_tfhisreodsc_sel, lV134Wpncyrcds_14_tfhiscolnom, AV135Wpncyrcds_15_tfhiscolnom_sel, lV136Wpncyrcds_16_tfhisnomcli, AV137Wpncyrcds_17_tfhisnomcli_sel, Byte.valueOf(AV138Wpncyrcds_18_tfhisopetur), Byte.valueOf(AV139Wpncyrcds_19_tfhisopetur_to), lV140Wpncyrcds_20_tfmaqcod, AV141Wpncyrcds_21_tfmaqcod_sel, AV142Wpncyrcds_22_tfhisbarkgm, AV143Wpncyrcds_23_tfhisbarkgm_to, AV144Wpncyrcds_24_tfhisbarmtr, AV145Wpncyrcds_25_tfhisbarmtr_to, AV146Wpncyrcds_26_tfcostcausa, AV147Wpncyrcds_27_tfcostcausa_to, AV148Wpncyrcds_28_tfhisreovalorcausa, AV149Wpncyrcds_29_tfhisreovalorcausa_to, lV150Wpncyrcds_30_tftipdefdsc, AV151Wpncyrcds_31_tftipdefdsc_sel, lV152Wpncyrcds_32_tfdsccausa, AV153Wpncyrcds_33_tfdsccausa_sel, lV154Wpncyrcds_34_tfrps_dsc, AV155Wpncyrcds_35_tfrps_dsc_sel, Integer.valueOf(AV156Wpncyrcds_36_tfhisreotn), Integer.valueOf(AV157Wpncyrcds_37_tfhisreotn_to), Integer.valueOf(AV158Wpncyrcds_38_tfhisopecod), Integer.valueOf(AV159Wpncyrcds_39_tfhisopecod_to), lV160Wpncyrcds_40_tfhisacco, AV161Wpncyrcds_41_tfhisacco_sel, lV162Wpncyrcds_42_tfhisaccot, AV163Wpncyrcds_43_tfhisaccot_sel, lV164Wpncyrcds_44_tfhisadeacco, AV165Wpncyrcds_45_tfhisadeacco_sel, lV166Wpncyrcds_46_tfhisadeacct, AV167Wpncyrcds_47_tfhisadeacct_sel, lV168Wpncyrcds_48_tfhistipartdsc, AV169Wpncyrcds_49_tfhistipartdsc_sel, lV170Wpncyrcds_50_tfhistipcoldsc, AV171Wpncyrcds_51_tfhistipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P087I2_A396EmprCod[0] ;
         A252CliCod = P087I2_A252CliCod[0] ;
         n252CliCod = P087I2_n252CliCod[0] ;
         A571HisTipArt = P087I2_A571HisTipArt[0] ;
         n571HisTipArt = P087I2_n571HisTipArt[0] ;
         A572HisTipCol = P087I2_A572HisTipCol[0] ;
         n572HisTipCol = P087I2_n572HisTipCol[0] ;
         A833TipDefCod = P087I2_A833TipDefCod[0] ;
         A5085CodCausa = P087I2_A5085CodCausa[0] ;
         n5085CodCausa = P087I2_n5085CodCausa[0] ;
         A7000Rps_Cod = P087I2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P087I2_n7000Rps_Cod[0] ;
         A13844HisTipColD = P087I2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087I2_n13844HisTipColD[0] ;
         A13843HisTipArtD = P087I2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087I2_n13843HisTipArtD[0] ;
         A5695HisAdEAcCt = P087I2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P087I2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P087I2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P087I2_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = P087I2_A5693HisAcCot[0] ;
         n5693HisAcCot = P087I2_n5693HisAcCot[0] ;
         A5662HisAcCo = P087I2_A5662HisAcCo[0] ;
         n5662HisAcCo = P087I2_n5662HisAcCo[0] ;
         A12949HisOpecod = P087I2_A12949HisOpecod[0] ;
         n12949HisOpecod = P087I2_n12949HisOpecod[0] ;
         A2297HisReoTn = P087I2_A2297HisReoTn[0] ;
         n2297HisReoTn = P087I2_n2297HisReoTn[0] ;
         A7001Rps_Dsc = P087I2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087I2_n7001Rps_Dsc[0] ;
         A5086DscCausa = P087I2_A5086DscCausa[0] ;
         n5086DscCausa = P087I2_n5086DscCausa[0] ;
         A834TipDefDsc = P087I2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087I2_n834TipDefDsc[0] ;
         A541HisBarMtr = P087I2_A541HisBarMtr[0] ;
         n541HisBarMtr = P087I2_n541HisBarMtr[0] ;
         A602MaqCod = P087I2_A602MaqCod[0] ;
         n602MaqCod = P087I2_n602MaqCod[0] ;
         A12950HisOpeTur = P087I2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P087I2_n12950HisOpeTur[0] ;
         A8889HisNomCli = P087I2_A8889HisNomCli[0] ;
         n8889HisNomCli = P087I2_n8889HisNomCli[0] ;
         A546HisColNom = P087I2_A546HisColNom[0] ;
         n546HisColNom = P087I2_n546HisColNom[0] ;
         A2299HisReoDsc = P087I2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P087I2_n2299HisReoDsc[0] ;
         A542HisBarSer = P087I2_A542HisBarSer[0] ;
         n542HisBarSer = P087I2_n542HisBarSer[0] ;
         A279CliNom = P087I2_A279CliNom[0] ;
         A13698HisreoLote = P087I2_A13698HisreoLote[0] ;
         n13698HisreoLote = P087I2_n13698HisreoLote[0] ;
         A569HisReoFec = P087I2_A569HisReoFec[0] ;
         n569HisReoFec = P087I2_n569HisReoFec[0] ;
         A548HisEstReo = P087I2_A548HisEstReo[0] ;
         n548HisEstReo = P087I2_n548HisEstReo[0] ;
         A544HisCodPar = P087I2_A544HisCodPar[0] ;
         A545HisCodReo = P087I2_A545HisCodReo[0] ;
         A539HisBarCod = P087I2_A539HisBarCod[0] ;
         A13699CostCausa = P087I2_A13699CostCausa[0] ;
         n13699CostCausa = P087I2_n13699CostCausa[0] ;
         A540HisBarKgm = P087I2_A540HisBarKgm[0] ;
         n540HisBarKgm = P087I2_n540HisBarKgm[0] ;
         A279CliNom = P087I2_A279CliNom[0] ;
         A13843HisTipArtD = P087I2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087I2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P087I2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087I2_n13844HisTipColD[0] ;
         A834TipDefDsc = P087I2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087I2_n834TipDefDsc[0] ;
         A5086DscCausa = P087I2_A5086DscCausa[0] ;
         n5086DscCausa = P087I2_n5086DscCausa[0] ;
         A13699CostCausa = P087I2_A13699CostCausa[0] ;
         n13699CostCausa = P087I2_n13699CostCausa[0] ;
         A7001Rps_Dsc = P087I2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087I2_n7001Rps_Dsc[0] ;
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
         AV49VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( "" );
            if ( A548HisEstReo == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NC", "") );
            }
            else if ( A548HisEstReo == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "RC", "") );
            }
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A569HisReoFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13697HisReoHDR, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13698HisreoLote, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A542HisBarSer, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2299HisReoDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A546HisColNom, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8889HisNomCli, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A12950HisOpeTur );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A602MaqCod, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A540HisBarKgm)) );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A541HisBarMtr)) );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13699CostCausa)) );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A13700HisreoValo)) );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A834TipDefDsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5086DscCausa, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7001Rps_Dsc, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A2297HisReoTn );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setNumber( A12949HisOpecod );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5662HisAcCo, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5693HisAcCot, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5694HisAdEAcCo, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5695HisAdEAcCt, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13843HisTipArtD, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV41ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13844HisTipColD, GXv_char5) ;
            wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV49VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV49VisibleColumnCount = (long)(AV49VisibleColumnCount+1) ;
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
      AV41ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisEstReo", "", "Tipo", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoFec", "", "Fecha", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoHDR", "", "Hdr", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisreoLote", "", "Lote", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarSer", "", "Articulo", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoDsc", "", "Descripcion", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisColNom", "", "Color", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisNomCli", "", "Color Cliente", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisOpeTur", "", "T", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Código Máquina", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarKgm", "", "Kilos", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisBarMtr", "", "Metros", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CostCausa", "", "Coste", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisreoValorCausa", "", "Valor", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipDefDsc", "", "Defecto", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DscCausa", "", "Causa", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Rps_Dsc", "", "Responsabilidad", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisReoTn", "", "N Int", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisOpecod", "", "Operario", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAcCo", "", "Acciones Corrección a implementar:", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAcCot", "", "Acciones Correctivas a Implementar:", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAdEAcCo", "", "Analisis de Corrección", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisAdEAcCt", "", "Analisis  Accion Correctivas", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisTipArtDsc", "", "de Articulo", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisTipColDsc", "", "Tipo Colorante", true, "") ;
      AV41ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV45UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPNcyRcColumnsSelector", GXv_char5) ;
      wpncyrcexport.this.GXt_char4 = GXv_char5[0] ;
      AV45UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV45UserCustomValue)==0) ) )
      {
         AV42ColumnsSelectorAux.fromxml(AV45UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV42ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV41ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV42ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV41ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WPNcyRcGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPNcyRcGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WPNcyRcGridState"), null, null);
      }
      AV16OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV172GXV3 = 1 ;
      while ( AV172GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV172GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV107FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV52TFHisEstReo_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFHisEstReo_Sels.fromJSonString(AV52TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV58TFHisReoFec = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV55TFHisReoHDR = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV56TFHisReoHDR_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV65TFHisreoLote = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV66TFHisreoLote_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV67TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV68TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV69TFHisBarSer = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV70TFHisBarSer_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV71TFHisReoDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV72TFHisReoDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV73TFHisColNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV74TFHisColNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV75TFHisNomCli = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV76TFHisNomCli_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV77TFHisOpeTur = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFHisOpeTur_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV79TFMaqCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV80TFMaqCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV81TFHisBarKgm = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV82TFHisBarKgm_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV83TFHisBarMtr = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFHisBarMtr_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV85TFCostCausa = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFCostCausa_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV87TFHisreoValorCausa = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFHisreoValorCausa_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV89TFTipDefDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV90TFTipDefDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV91TFDscCausa = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV92TFDscCausa_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV93TFRps_Dsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV94TFRps_Dsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV95TFHisReoTn = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV96TFHisReoTn_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV97TFHisOpecod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFHisOpecod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV99TFHisAcCo = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV100TFHisAcCo_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV101TFHisAcCot = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV102TFHisAcCot_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV103TFHisAdEAcCo = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV104TFHisAdEAcCo_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV105TFHisAdEAcCt = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV106TFHisAdEAcCt_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV112TFHisTipArtDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV113TFHisTipArtDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV114TFHisTipColDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV115TFHisTipColDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV172GXV3 = (int)(AV172GXV3+1) ;
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
      this.aP0[0] = wpncyrcexport.this.AV11Filename;
      this.aP1[0] = wpncyrcexport.this.AV12ErrorMessage;
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
      AV107FilterFullText = "" ;
      AV53TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFHisReoFec = GXutil.nullDate() ;
      AV56TFHisReoHDR_Sel = "" ;
      AV55TFHisReoHDR = "" ;
      AV66TFHisreoLote_Sel = "" ;
      AV65TFHisreoLote = "" ;
      AV68TFCliNom_Sel = "" ;
      AV67TFCliNom = "" ;
      AV70TFHisBarSer_Sel = "" ;
      AV69TFHisBarSer = "" ;
      AV72TFHisReoDsc_Sel = "" ;
      AV71TFHisReoDsc = "" ;
      AV74TFHisColNom_Sel = "" ;
      AV73TFHisColNom = "" ;
      AV76TFHisNomCli_Sel = "" ;
      AV75TFHisNomCli = "" ;
      AV80TFMaqCod_Sel = "" ;
      AV79TFMaqCod = "" ;
      AV81TFHisBarKgm = DecimalUtil.ZERO ;
      AV82TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV83TFHisBarMtr = DecimalUtil.ZERO ;
      AV84TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV85TFCostCausa = DecimalUtil.ZERO ;
      AV86TFCostCausa_To = DecimalUtil.ZERO ;
      AV87TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV88TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV90TFTipDefDsc_Sel = "" ;
      AV89TFTipDefDsc = "" ;
      AV92TFDscCausa_Sel = "" ;
      AV91TFDscCausa = "" ;
      AV94TFRps_Dsc_Sel = "" ;
      AV93TFRps_Dsc = "" ;
      AV100TFHisAcCo_Sel = "" ;
      AV99TFHisAcCo = "" ;
      AV102TFHisAcCot_Sel = "" ;
      AV101TFHisAcCot = "" ;
      AV104TFHisAdEAcCo_Sel = "" ;
      AV103TFHisAdEAcCo = "" ;
      AV106TFHisAdEAcCt_Sel = "" ;
      AV105TFHisAdEAcCt = "" ;
      AV113TFHisTipArtDsc_Sel = "" ;
      AV112TFHisTipArtDsc = "" ;
      AV115TFHisTipColDsc_Sel = "" ;
      AV114TFHisTipColDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV37Session = httpContext.getWebSession();
      AV44ColumnsSelectorXML = "" ;
      AV41ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
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
      AV121Wpncyrcds_1_filterfulltext = "" ;
      AV122Wpncyrcds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV123Wpncyrcds_3_tfhisreofec = GXutil.nullDate() ;
      AV124Wpncyrcds_4_tfhisreohdr = "" ;
      AV125Wpncyrcds_5_tfhisreohdr_sel = "" ;
      AV126Wpncyrcds_6_tfhisreolote = "" ;
      AV127Wpncyrcds_7_tfhisreolote_sel = "" ;
      AV128Wpncyrcds_8_tfclinom = "" ;
      AV129Wpncyrcds_9_tfclinom_sel = "" ;
      AV130Wpncyrcds_10_tfhisbarser = "" ;
      AV131Wpncyrcds_11_tfhisbarser_sel = "" ;
      AV132Wpncyrcds_12_tfhisreodsc = "" ;
      AV133Wpncyrcds_13_tfhisreodsc_sel = "" ;
      AV134Wpncyrcds_14_tfhiscolnom = "" ;
      AV135Wpncyrcds_15_tfhiscolnom_sel = "" ;
      AV136Wpncyrcds_16_tfhisnomcli = "" ;
      AV137Wpncyrcds_17_tfhisnomcli_sel = "" ;
      AV140Wpncyrcds_20_tfmaqcod = "" ;
      AV141Wpncyrcds_21_tfmaqcod_sel = "" ;
      AV142Wpncyrcds_22_tfhisbarkgm = DecimalUtil.ZERO ;
      AV143Wpncyrcds_23_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV144Wpncyrcds_24_tfhisbarmtr = DecimalUtil.ZERO ;
      AV145Wpncyrcds_25_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV146Wpncyrcds_26_tfcostcausa = DecimalUtil.ZERO ;
      AV147Wpncyrcds_27_tfcostcausa_to = DecimalUtil.ZERO ;
      AV148Wpncyrcds_28_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV149Wpncyrcds_29_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV150Wpncyrcds_30_tftipdefdsc = "" ;
      AV151Wpncyrcds_31_tftipdefdsc_sel = "" ;
      AV152Wpncyrcds_32_tfdsccausa = "" ;
      AV153Wpncyrcds_33_tfdsccausa_sel = "" ;
      AV154Wpncyrcds_34_tfrps_dsc = "" ;
      AV155Wpncyrcds_35_tfrps_dsc_sel = "" ;
      AV160Wpncyrcds_40_tfhisacco = "" ;
      AV161Wpncyrcds_41_tfhisacco_sel = "" ;
      AV162Wpncyrcds_42_tfhisaccot = "" ;
      AV163Wpncyrcds_43_tfhisaccot_sel = "" ;
      AV164Wpncyrcds_44_tfhisadeacco = "" ;
      AV165Wpncyrcds_45_tfhisadeacco_sel = "" ;
      AV166Wpncyrcds_46_tfhisadeacct = "" ;
      AV167Wpncyrcds_47_tfhisadeacct_sel = "" ;
      AV168Wpncyrcds_48_tfhistipartdsc = "" ;
      AV169Wpncyrcds_49_tfhistipartdsc_sel = "" ;
      AV170Wpncyrcds_50_tfhistipcoldsc = "" ;
      AV171Wpncyrcds_51_tfhistipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV121Wpncyrcds_1_filterfulltext = "" ;
      lV124Wpncyrcds_4_tfhisreohdr = "" ;
      lV126Wpncyrcds_6_tfhisreolote = "" ;
      lV128Wpncyrcds_8_tfclinom = "" ;
      lV130Wpncyrcds_10_tfhisbarser = "" ;
      lV132Wpncyrcds_12_tfhisreodsc = "" ;
      lV134Wpncyrcds_14_tfhiscolnom = "" ;
      lV136Wpncyrcds_16_tfhisnomcli = "" ;
      lV140Wpncyrcds_20_tfmaqcod = "" ;
      lV150Wpncyrcds_30_tftipdefdsc = "" ;
      lV152Wpncyrcds_32_tfdsccausa = "" ;
      lV154Wpncyrcds_34_tfrps_dsc = "" ;
      lV160Wpncyrcds_40_tfhisacco = "" ;
      lV162Wpncyrcds_42_tfhisaccot = "" ;
      lV164Wpncyrcds_44_tfhisadeacco = "" ;
      lV166Wpncyrcds_46_tfhisadeacct = "" ;
      lV168Wpncyrcds_48_tfhistipartdsc = "" ;
      lV170Wpncyrcds_50_tfhistipcoldsc = "" ;
      A544HisCodPar = "" ;
      P087I2_A396EmprCod = new String[] {""} ;
      P087I2_A252CliCod = new int[1] ;
      P087I2_n252CliCod = new boolean[] {false} ;
      P087I2_A571HisTipArt = new short[1] ;
      P087I2_n571HisTipArt = new boolean[] {false} ;
      P087I2_A572HisTipCol = new byte[1] ;
      P087I2_n572HisTipCol = new boolean[] {false} ;
      P087I2_A833TipDefCod = new short[1] ;
      P087I2_A5085CodCausa = new short[1] ;
      P087I2_n5085CodCausa = new boolean[] {false} ;
      P087I2_A7000Rps_Cod = new short[1] ;
      P087I2_n7000Rps_Cod = new boolean[] {false} ;
      P087I2_A13844HisTipColD = new String[] {""} ;
      P087I2_n13844HisTipColD = new boolean[] {false} ;
      P087I2_A13843HisTipArtD = new String[] {""} ;
      P087I2_n13843HisTipArtD = new boolean[] {false} ;
      P087I2_A5695HisAdEAcCt = new String[] {""} ;
      P087I2_n5695HisAdEAcCt = new boolean[] {false} ;
      P087I2_A5694HisAdEAcCo = new String[] {""} ;
      P087I2_n5694HisAdEAcCo = new boolean[] {false} ;
      P087I2_A5693HisAcCot = new String[] {""} ;
      P087I2_n5693HisAcCot = new boolean[] {false} ;
      P087I2_A5662HisAcCo = new String[] {""} ;
      P087I2_n5662HisAcCo = new boolean[] {false} ;
      P087I2_A12949HisOpecod = new int[1] ;
      P087I2_n12949HisOpecod = new boolean[] {false} ;
      P087I2_A2297HisReoTn = new int[1] ;
      P087I2_n2297HisReoTn = new boolean[] {false} ;
      P087I2_A7001Rps_Dsc = new String[] {""} ;
      P087I2_n7001Rps_Dsc = new boolean[] {false} ;
      P087I2_A5086DscCausa = new String[] {""} ;
      P087I2_n5086DscCausa = new boolean[] {false} ;
      P087I2_A834TipDefDsc = new String[] {""} ;
      P087I2_n834TipDefDsc = new boolean[] {false} ;
      P087I2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087I2_n541HisBarMtr = new boolean[] {false} ;
      P087I2_A602MaqCod = new String[] {""} ;
      P087I2_n602MaqCod = new boolean[] {false} ;
      P087I2_A12950HisOpeTur = new byte[1] ;
      P087I2_n12950HisOpeTur = new boolean[] {false} ;
      P087I2_A8889HisNomCli = new String[] {""} ;
      P087I2_n8889HisNomCli = new boolean[] {false} ;
      P087I2_A546HisColNom = new String[] {""} ;
      P087I2_n546HisColNom = new boolean[] {false} ;
      P087I2_A2299HisReoDsc = new String[] {""} ;
      P087I2_n2299HisReoDsc = new boolean[] {false} ;
      P087I2_A542HisBarSer = new String[] {""} ;
      P087I2_n542HisBarSer = new boolean[] {false} ;
      P087I2_A279CliNom = new String[] {""} ;
      P087I2_A13698HisreoLote = new String[] {""} ;
      P087I2_n13698HisreoLote = new boolean[] {false} ;
      P087I2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P087I2_n569HisReoFec = new boolean[] {false} ;
      P087I2_A548HisEstReo = new byte[1] ;
      P087I2_n548HisEstReo = new boolean[] {false} ;
      P087I2_A544HisCodPar = new String[] {""} ;
      P087I2_A545HisCodReo = new byte[1] ;
      P087I2_A539HisBarCod = new int[1] ;
      P087I2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087I2_n13699CostCausa = new boolean[] {false} ;
      P087I2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087I2_n540HisBarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV45UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV42ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52TFHisEstReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpncyrcexport__default(),
         new Object[] {
             new Object[] {
            P087I2_A396EmprCod, P087I2_A252CliCod, P087I2_n252CliCod, P087I2_A571HisTipArt, P087I2_n571HisTipArt, P087I2_A572HisTipCol, P087I2_n572HisTipCol, P087I2_A833TipDefCod, P087I2_A5085CodCausa, P087I2_n5085CodCausa,
            P087I2_A7000Rps_Cod, P087I2_n7000Rps_Cod, P087I2_A13844HisTipColD, P087I2_n13844HisTipColD, P087I2_A13843HisTipArtD, P087I2_n13843HisTipArtD, P087I2_A5695HisAdEAcCt, P087I2_n5695HisAdEAcCt, P087I2_A5694HisAdEAcCo, P087I2_n5694HisAdEAcCo,
            P087I2_A5693HisAcCot, P087I2_n5693HisAcCot, P087I2_A5662HisAcCo, P087I2_n5662HisAcCo, P087I2_A12949HisOpecod, P087I2_n12949HisOpecod, P087I2_A2297HisReoTn, P087I2_n2297HisReoTn, P087I2_A7001Rps_Dsc, P087I2_n7001Rps_Dsc,
            P087I2_A5086DscCausa, P087I2_n5086DscCausa, P087I2_A834TipDefDsc, P087I2_n834TipDefDsc, P087I2_A541HisBarMtr, P087I2_n541HisBarMtr, P087I2_A602MaqCod, P087I2_n602MaqCod, P087I2_A12950HisOpeTur, P087I2_n12950HisOpeTur,
            P087I2_A8889HisNomCli, P087I2_n8889HisNomCli, P087I2_A546HisColNom, P087I2_n546HisColNom, P087I2_A2299HisReoDsc, P087I2_n2299HisReoDsc, P087I2_A542HisBarSer, P087I2_n542HisBarSer, P087I2_A279CliNom, P087I2_A13698HisreoLote,
            P087I2_n13698HisreoLote, P087I2_A569HisReoFec, P087I2_n569HisReoFec, P087I2_A548HisEstReo, P087I2_n548HisEstReo, P087I2_A544HisCodPar, P087I2_A545HisCodReo, P087I2_A539HisBarCod, P087I2_A13699CostCausa, P087I2_n13699CostCausa,
            P087I2_A540HisBarKgm, P087I2_n540HisBarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV54TFHisEstReo_Sel ;
   private byte AV77TFHisOpeTur ;
   private byte AV78TFHisOpeTur_To ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte AV138Wpncyrcds_18_tfhisopetur ;
   private byte AV139Wpncyrcds_19_tfhisopetur_to ;
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
   private int AV118GXV1 ;
   private int AV95TFHisReoTn ;
   private int AV96TFHisReoTn_To ;
   private int AV97TFHisOpecod ;
   private int AV98TFHisOpecod_To ;
   private int AV119GXV2 ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int AV156Wpncyrcds_36_tfhisreotn ;
   private int AV157Wpncyrcds_37_tfhisreotn_to ;
   private int AV158Wpncyrcds_38_tfhisopecod ;
   private int AV159Wpncyrcds_39_tfhisopecod_to ;
   private int AV122Wpncyrcds_2_tfhisestreo_sels_size ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV172GXV3 ;
   private long AV57i ;
   private long AV49VisibleColumnCount ;
   private java.math.BigDecimal AV81TFHisBarKgm ;
   private java.math.BigDecimal AV82TFHisBarKgm_To ;
   private java.math.BigDecimal AV83TFHisBarMtr ;
   private java.math.BigDecimal AV84TFHisBarMtr_To ;
   private java.math.BigDecimal AV85TFCostCausa ;
   private java.math.BigDecimal AV86TFCostCausa_To ;
   private java.math.BigDecimal AV87TFHisreoValorCausa ;
   private java.math.BigDecimal AV88TFHisreoValorCausa_To ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV142Wpncyrcds_22_tfhisbarkgm ;
   private java.math.BigDecimal AV143Wpncyrcds_23_tfhisbarkgm_to ;
   private java.math.BigDecimal AV144Wpncyrcds_24_tfhisbarmtr ;
   private java.math.BigDecimal AV145Wpncyrcds_25_tfhisbarmtr_to ;
   private java.math.BigDecimal AV146Wpncyrcds_26_tfcostcausa ;
   private java.math.BigDecimal AV147Wpncyrcds_27_tfcostcausa_to ;
   private java.math.BigDecimal AV148Wpncyrcds_28_tfhisreovalorcausa ;
   private java.math.BigDecimal AV149Wpncyrcds_29_tfhisreovalorcausa_to ;
   private String AV56TFHisReoHDR_Sel ;
   private String AV55TFHisReoHDR ;
   private String AV66TFHisreoLote_Sel ;
   private String AV65TFHisreoLote ;
   private String AV68TFCliNom_Sel ;
   private String AV67TFCliNom ;
   private String AV70TFHisBarSer_Sel ;
   private String AV69TFHisBarSer ;
   private String AV72TFHisReoDsc_Sel ;
   private String AV71TFHisReoDsc ;
   private String AV74TFHisColNom_Sel ;
   private String AV73TFHisColNom ;
   private String AV76TFHisNomCli_Sel ;
   private String AV75TFHisNomCli ;
   private String AV80TFMaqCod_Sel ;
   private String AV79TFMaqCod ;
   private String AV90TFTipDefDsc_Sel ;
   private String AV89TFTipDefDsc ;
   private String AV92TFDscCausa_Sel ;
   private String AV91TFDscCausa ;
   private String AV94TFRps_Dsc_Sel ;
   private String AV93TFRps_Dsc ;
   private String AV113TFHisTipArtDsc_Sel ;
   private String AV112TFHisTipArtDsc ;
   private String AV115TFHisTipColDsc_Sel ;
   private String AV114TFHisTipColDsc ;
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
   private String AV124Wpncyrcds_4_tfhisreohdr ;
   private String AV125Wpncyrcds_5_tfhisreohdr_sel ;
   private String AV126Wpncyrcds_6_tfhisreolote ;
   private String AV127Wpncyrcds_7_tfhisreolote_sel ;
   private String AV128Wpncyrcds_8_tfclinom ;
   private String AV129Wpncyrcds_9_tfclinom_sel ;
   private String AV130Wpncyrcds_10_tfhisbarser ;
   private String AV131Wpncyrcds_11_tfhisbarser_sel ;
   private String AV132Wpncyrcds_12_tfhisreodsc ;
   private String AV133Wpncyrcds_13_tfhisreodsc_sel ;
   private String AV134Wpncyrcds_14_tfhiscolnom ;
   private String AV135Wpncyrcds_15_tfhiscolnom_sel ;
   private String AV136Wpncyrcds_16_tfhisnomcli ;
   private String AV137Wpncyrcds_17_tfhisnomcli_sel ;
   private String AV140Wpncyrcds_20_tfmaqcod ;
   private String AV141Wpncyrcds_21_tfmaqcod_sel ;
   private String AV150Wpncyrcds_30_tftipdefdsc ;
   private String AV151Wpncyrcds_31_tftipdefdsc_sel ;
   private String AV152Wpncyrcds_32_tfdsccausa ;
   private String AV153Wpncyrcds_33_tfdsccausa_sel ;
   private String AV154Wpncyrcds_34_tfrps_dsc ;
   private String AV155Wpncyrcds_35_tfrps_dsc_sel ;
   private String AV168Wpncyrcds_48_tfhistipartdsc ;
   private String AV169Wpncyrcds_49_tfhistipartdsc_sel ;
   private String AV170Wpncyrcds_50_tfhistipcoldsc ;
   private String AV171Wpncyrcds_51_tfhistipcoldsc_sel ;
   private String scmdbuf ;
   private String lV124Wpncyrcds_4_tfhisreohdr ;
   private String lV126Wpncyrcds_6_tfhisreolote ;
   private String lV128Wpncyrcds_8_tfclinom ;
   private String lV130Wpncyrcds_10_tfhisbarser ;
   private String lV132Wpncyrcds_12_tfhisreodsc ;
   private String lV134Wpncyrcds_14_tfhiscolnom ;
   private String lV136Wpncyrcds_16_tfhisnomcli ;
   private String lV140Wpncyrcds_20_tfmaqcod ;
   private String lV150Wpncyrcds_30_tftipdefdsc ;
   private String lV152Wpncyrcds_32_tfdsccausa ;
   private String lV154Wpncyrcds_34_tfrps_dsc ;
   private String lV168Wpncyrcds_48_tfhistipartdsc ;
   private String lV170Wpncyrcds_50_tfhistipcoldsc ;
   private String A544HisCodPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV58TFHisReoFec ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV123Wpncyrcds_3_tfhisreofec ;
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
   private String AV44ColumnsSelectorXML ;
   private String AV45UserCustomValue ;
   private String AV52TFHisEstReo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV107FilterFullText ;
   private String AV100TFHisAcCo_Sel ;
   private String AV99TFHisAcCo ;
   private String AV102TFHisAcCot_Sel ;
   private String AV101TFHisAcCot ;
   private String AV104TFHisAdEAcCo_Sel ;
   private String AV103TFHisAdEAcCo ;
   private String AV106TFHisAdEAcCt_Sel ;
   private String AV105TFHisAdEAcCt ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String AV121Wpncyrcds_1_filterfulltext ;
   private String AV160Wpncyrcds_40_tfhisacco ;
   private String AV161Wpncyrcds_41_tfhisacco_sel ;
   private String AV162Wpncyrcds_42_tfhisaccot ;
   private String AV163Wpncyrcds_43_tfhisaccot_sel ;
   private String AV164Wpncyrcds_44_tfhisadeacco ;
   private String AV165Wpncyrcds_45_tfhisadeacco_sel ;
   private String AV166Wpncyrcds_46_tfhisadeacct ;
   private String AV167Wpncyrcds_47_tfhisadeacct_sel ;
   private String lV121Wpncyrcds_1_filterfulltext ;
   private String lV160Wpncyrcds_40_tfhisacco ;
   private String lV162Wpncyrcds_42_tfhisaccot ;
   private String lV164Wpncyrcds_44_tfhisadeacco ;
   private String lV166Wpncyrcds_46_tfhisadeacct ;
   private GXSimpleCollection<Byte> AV53TFHisEstReo_Sels ;
   private GXSimpleCollection<Byte> AV122Wpncyrcds_2_tfhisestreo_sels ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P087I2_A396EmprCod ;
   private int[] P087I2_A252CliCod ;
   private boolean[] P087I2_n252CliCod ;
   private short[] P087I2_A571HisTipArt ;
   private boolean[] P087I2_n571HisTipArt ;
   private byte[] P087I2_A572HisTipCol ;
   private boolean[] P087I2_n572HisTipCol ;
   private short[] P087I2_A833TipDefCod ;
   private short[] P087I2_A5085CodCausa ;
   private boolean[] P087I2_n5085CodCausa ;
   private short[] P087I2_A7000Rps_Cod ;
   private boolean[] P087I2_n7000Rps_Cod ;
   private String[] P087I2_A13844HisTipColD ;
   private boolean[] P087I2_n13844HisTipColD ;
   private String[] P087I2_A13843HisTipArtD ;
   private boolean[] P087I2_n13843HisTipArtD ;
   private String[] P087I2_A5695HisAdEAcCt ;
   private boolean[] P087I2_n5695HisAdEAcCt ;
   private String[] P087I2_A5694HisAdEAcCo ;
   private boolean[] P087I2_n5694HisAdEAcCo ;
   private String[] P087I2_A5693HisAcCot ;
   private boolean[] P087I2_n5693HisAcCot ;
   private String[] P087I2_A5662HisAcCo ;
   private boolean[] P087I2_n5662HisAcCo ;
   private int[] P087I2_A12949HisOpecod ;
   private boolean[] P087I2_n12949HisOpecod ;
   private int[] P087I2_A2297HisReoTn ;
   private boolean[] P087I2_n2297HisReoTn ;
   private String[] P087I2_A7001Rps_Dsc ;
   private boolean[] P087I2_n7001Rps_Dsc ;
   private String[] P087I2_A5086DscCausa ;
   private boolean[] P087I2_n5086DscCausa ;
   private String[] P087I2_A834TipDefDsc ;
   private boolean[] P087I2_n834TipDefDsc ;
   private java.math.BigDecimal[] P087I2_A541HisBarMtr ;
   private boolean[] P087I2_n541HisBarMtr ;
   private String[] P087I2_A602MaqCod ;
   private boolean[] P087I2_n602MaqCod ;
   private byte[] P087I2_A12950HisOpeTur ;
   private boolean[] P087I2_n12950HisOpeTur ;
   private String[] P087I2_A8889HisNomCli ;
   private boolean[] P087I2_n8889HisNomCli ;
   private String[] P087I2_A546HisColNom ;
   private boolean[] P087I2_n546HisColNom ;
   private String[] P087I2_A2299HisReoDsc ;
   private boolean[] P087I2_n2299HisReoDsc ;
   private String[] P087I2_A542HisBarSer ;
   private boolean[] P087I2_n542HisBarSer ;
   private String[] P087I2_A279CliNom ;
   private String[] P087I2_A13698HisreoLote ;
   private boolean[] P087I2_n13698HisreoLote ;
   private java.util.Date[] P087I2_A569HisReoFec ;
   private boolean[] P087I2_n569HisReoFec ;
   private byte[] P087I2_A548HisEstReo ;
   private boolean[] P087I2_n548HisEstReo ;
   private String[] P087I2_A544HisCodPar ;
   private byte[] P087I2_A545HisCodReo ;
   private int[] P087I2_A539HisBarCod ;
   private java.math.BigDecimal[] P087I2_A13699CostCausa ;
   private boolean[] P087I2_n13699CostCausa ;
   private java.math.BigDecimal[] P087I2_A540HisBarKgm ;
   private boolean[] P087I2_n540HisBarKgm ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV42ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV43ColumnsSelector_Column ;
}

final  class wpncyrcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P087I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV122Wpncyrcds_2_tfhisestreo_sels ,
                                          String AV121Wpncyrcds_1_filterfulltext ,
                                          int AV122Wpncyrcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV123Wpncyrcds_3_tfhisreofec ,
                                          String AV125Wpncyrcds_5_tfhisreohdr_sel ,
                                          String AV124Wpncyrcds_4_tfhisreohdr ,
                                          String AV127Wpncyrcds_7_tfhisreolote_sel ,
                                          String AV126Wpncyrcds_6_tfhisreolote ,
                                          String AV129Wpncyrcds_9_tfclinom_sel ,
                                          String AV128Wpncyrcds_8_tfclinom ,
                                          String AV131Wpncyrcds_11_tfhisbarser_sel ,
                                          String AV130Wpncyrcds_10_tfhisbarser ,
                                          String AV133Wpncyrcds_13_tfhisreodsc_sel ,
                                          String AV132Wpncyrcds_12_tfhisreodsc ,
                                          String AV135Wpncyrcds_15_tfhiscolnom_sel ,
                                          String AV134Wpncyrcds_14_tfhiscolnom ,
                                          String AV137Wpncyrcds_17_tfhisnomcli_sel ,
                                          String AV136Wpncyrcds_16_tfhisnomcli ,
                                          byte AV138Wpncyrcds_18_tfhisopetur ,
                                          byte AV139Wpncyrcds_19_tfhisopetur_to ,
                                          String AV141Wpncyrcds_21_tfmaqcod_sel ,
                                          String AV140Wpncyrcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV142Wpncyrcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV143Wpncyrcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV144Wpncyrcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV145Wpncyrcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV146Wpncyrcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV147Wpncyrcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV148Wpncyrcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV149Wpncyrcds_29_tfhisreovalorcausa_to ,
                                          String AV151Wpncyrcds_31_tftipdefdsc_sel ,
                                          String AV150Wpncyrcds_30_tftipdefdsc ,
                                          String AV153Wpncyrcds_33_tfdsccausa_sel ,
                                          String AV152Wpncyrcds_32_tfdsccausa ,
                                          String AV155Wpncyrcds_35_tfrps_dsc_sel ,
                                          String AV154Wpncyrcds_34_tfrps_dsc ,
                                          int AV156Wpncyrcds_36_tfhisreotn ,
                                          int AV157Wpncyrcds_37_tfhisreotn_to ,
                                          int AV158Wpncyrcds_38_tfhisopecod ,
                                          int AV159Wpncyrcds_39_tfhisopecod_to ,
                                          String AV161Wpncyrcds_41_tfhisacco_sel ,
                                          String AV160Wpncyrcds_40_tfhisacco ,
                                          String AV163Wpncyrcds_43_tfhisaccot_sel ,
                                          String AV162Wpncyrcds_42_tfhisaccot ,
                                          String AV165Wpncyrcds_45_tfhisadeacco_sel ,
                                          String AV164Wpncyrcds_44_tfhisadeacco ,
                                          String AV167Wpncyrcds_47_tfhisadeacct_sel ,
                                          String AV166Wpncyrcds_46_tfhisadeacct ,
                                          String AV169Wpncyrcds_49_tfhistipartdsc_sel ,
                                          String AV168Wpncyrcds_48_tfhistipartdsc ,
                                          String AV171Wpncyrcds_51_tfhistipcoldsc_sel ,
                                          String AV170Wpncyrcds_50_tfhistipcoldsc ,
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
      byte[] GXv_int9 = new byte[74];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.HisTipArt AS HisTipArt, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc" ;
      scmdbuf += " AS HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod," ;
      scmdbuf += " T1.HisOpeTur, T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod," ;
      scmdbuf += " T6.CostCausa, T1.HisBarKgm FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod)" ;
      if ( ! (GXutil.strcmp("", AV121Wpncyrcds_1_filterfulltext)==0) )
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
      if ( AV122Wpncyrcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV122Wpncyrcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Wpncyrcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Wpncyrcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV124Wpncyrcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Wpncyrcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Wpncyrcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV126Wpncyrcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Wpncyrcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Wpncyrcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV128Wpncyrcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Wpncyrcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Wpncyrcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV130Wpncyrcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Wpncyrcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Wpncyrcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV132Wpncyrcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Wpncyrcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Wpncyrcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Wpncyrcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Wpncyrcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Wpncyrcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV136Wpncyrcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Wpncyrcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (0==AV138Wpncyrcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (0==AV139Wpncyrcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wpncyrcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV140Wpncyrcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wpncyrcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Wpncyrcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Wpncyrcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Wpncyrcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Wpncyrcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Wpncyrcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Wpncyrcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Wpncyrcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Wpncyrcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Wpncyrcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV150Wpncyrcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Wpncyrcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Wpncyrcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV152Wpncyrcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Wpncyrcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Wpncyrcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV154Wpncyrcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Wpncyrcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (0==AV156Wpncyrcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (0==AV157Wpncyrcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (0==AV158Wpncyrcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (0==AV159Wpncyrcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Wpncyrcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV160Wpncyrcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Wpncyrcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Wpncyrcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV162Wpncyrcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Wpncyrcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Wpncyrcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV164Wpncyrcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Wpncyrcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Wpncyrcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV166Wpncyrcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Wpncyrcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Wpncyrcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV168Wpncyrcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Wpncyrcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int9[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Wpncyrcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV170Wpncyrcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Wpncyrcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int9[73] = (byte)(1) ;
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
                  return conditional_P087I2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 11);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 26);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[114]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[115]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 3);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 3);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 3);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 3);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 60);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 60);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 40);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 40);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[132]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[136], 3276);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[137], 3276);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[138], 2000);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[139], 2000);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[140], 2000);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 2000);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 2000);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[143], 2000);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 30);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 30);
               }
               return;
      }
   }

}

