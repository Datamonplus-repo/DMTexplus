package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webconalbexport extends GXProcedure
{
   public webconalbexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webconalbexport.class ), "" );
   }

   public webconalbexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webconalbexport.this.aP1 = new String[] {""};
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
      webconalbexport.this.aP0 = aP0;
      webconalbexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebCONALBExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webconalbexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV135FilterFullText, GXv_char5) ;
      webconalbexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV51TFAlbRecCod) && (0==AV52TFAlbRecCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Recepcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFAlbRecCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFAlbRecCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV56TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFCliNom_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV55TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFCliNom, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFAlbRFen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV57TFAlbRFen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( ( AV60TFAlbRReo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Reclamacion?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV111i = 1 ;
         AV138GXV1 = 1 ;
         while ( AV138GXV1 <= AV60TFAlbRReo_Sels.size() )
         {
            AV61TFAlbRReo_Sel = (String)AV60TFAlbRReo_Sels.elementAt(-1+AV138GXV1) ;
            if ( AV111i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV61TFAlbRReo_Sel), httpContext.getMessage( "NO", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "NO", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV61TFAlbRReo_Sel), httpContext.getMessage( "SI", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "SI", "") );
            }
            AV111i = (long)(AV111i+1) ;
            AV138GXV1 = (int)(AV138GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFAlbRef_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFAlbRef_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFAlbRef)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFAlbRef, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFAlbRefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Referencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFAlbRefDsc_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFAlbRefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Referencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFAlbRefDsc, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFAlbRTartD_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFAlbRTartD_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFAlbRTartD)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFAlbRTartD, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFTrnNom_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFTrnNom, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFProceNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFProceNom_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFProceNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Procedencia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFProceNom, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbRUniEnt_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unds Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72TFAlbRUniEnt)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFAlbRUniEnt_To)) );
      }
      if ( ! ( ( AV134TFAlbRUni_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV111i = 1 ;
         AV139GXV2 = 1 ;
         while ( AV139GXV2 <= AV134TFAlbRUni_Sels.size() )
         {
            AV75TFAlbRUni_Sel = (String)AV134TFAlbRUni_Sels.elementAt(-1+AV139GXV2) ;
            if ( AV111i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV75TFAlbRUni_Sel), httpContext.getMessage( "K", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "K", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV75TFAlbRUni_Sel), httpContext.getMessage( "M", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "M", "") );
            }
            AV111i = (long)(AV111i+1) ;
            AV139GXV2 = (int)(AV139GXV2+1) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFAlbRUniUti_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unds Uti", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV76TFAlbRUniUti)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFAlbRUniUti_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFAlbRUniDis)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFAlbRUniDis_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unds Disp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFAlbRUniDis)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFAlbRUniDis_To)) );
      }
      if ( ! ( (0==AV80TFAlbRPieEnt) && (0==AV81TFAlbRPieEnt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pzs Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV80TFAlbRPieEnt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV81TFAlbRPieEnt_To );
      }
      if ( ! ( (0==AV82TFAlbRPieUti) && (0==AV83TFAlbRPieUti_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pzs Uti", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV82TFAlbRPieUti );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV83TFAlbRPieUti_To );
      }
      if ( ! ( (0==AV84TFAlbRPieDis) && (0==AV85TFAlbRPieDis_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Pzs Disp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV84TFAlbRPieDis );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV85TFAlbRPieDis_To );
      }
      if ( ! ( ( AV87TFAlbREst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV111i = 1 ;
         AV140GXV3 = 1 ;
         while ( AV140GXV3 <= AV87TFAlbREst_Sels.size() )
         {
            AV88TFAlbREst_Sel = ((Number) AV87TFAlbREst_Sels.elementAt(-1+AV140GXV3)).byteValue() ;
            if ( AV111i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV88TFAlbREst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Abierta", "") );
            }
            else if ( AV88TFAlbREst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cerrada", "") );
            }
            AV111i = (long)(AV111i+1) ;
            AV140GXV3 = (int)(AV140GXV3+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV96TFAlbrUsu_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFAlbrUsu_Sel, GXv_char5) ;
         webconalbexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV95TFAlbrUsu)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webconalbexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95TFAlbrUsu, GXv_char5) ;
            webconalbexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV97TFAlbrHor) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webconalbexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( localUtil.format( AV97TFAlbrHor, "99:99:99") );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("WebCONALBColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV36Session.getValue("WebCONALBColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV141GXV4 = 1 ;
      while ( AV141GXV4 <= AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV42ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV141GXV4));
         if ( AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setColor( 11 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         AV141GXV4 = (int)(AV141GXV4+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV143Webconalbds_1_filterfulltext = AV135FilterFullText ;
      AV144Webconalbds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV145Webconalbds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV146Webconalbds_4_tfclinom = AV55TFCliNom ;
      AV147Webconalbds_5_tfclinom_sel = AV56TFCliNom_Sel ;
      AV148Webconalbds_6_tfalbrfen = AV57TFAlbRFen ;
      AV149Webconalbds_7_tfalbrreo_sels = AV60TFAlbRReo_Sels ;
      AV150Webconalbds_8_tfalbref = AV62TFAlbRef ;
      AV151Webconalbds_9_tfalbref_sel = AV63TFAlbRef_Sel ;
      AV152Webconalbds_10_tfalbrefdsc = AV64TFAlbRefDsc ;
      AV153Webconalbds_11_tfalbrefdsc_sel = AV65TFAlbRefDsc_Sel ;
      AV154Webconalbds_12_tfalbrtartd = AV66TFAlbRTartD ;
      AV155Webconalbds_13_tfalbrtartd_sel = AV67TFAlbRTartD_Sel ;
      AV156Webconalbds_14_tftrnnom = AV68TFTrnNom ;
      AV157Webconalbds_15_tftrnnom_sel = AV69TFTrnNom_Sel ;
      AV158Webconalbds_16_tfprocenom = AV70TFProceNom ;
      AV159Webconalbds_17_tfprocenom_sel = AV71TFProceNom_Sel ;
      AV160Webconalbds_18_tfalbrunient = AV72TFAlbRUniEnt ;
      AV161Webconalbds_19_tfalbrunient_to = AV73TFAlbRUniEnt_To ;
      AV162Webconalbds_20_tfalbruni_sels = AV134TFAlbRUni_Sels ;
      AV163Webconalbds_21_tfalbruniuti = AV76TFAlbRUniUti ;
      AV164Webconalbds_22_tfalbruniuti_to = AV77TFAlbRUniUti_To ;
      AV165Webconalbds_23_tfalbrunidis = AV78TFAlbRUniDis ;
      AV166Webconalbds_24_tfalbrunidis_to = AV79TFAlbRUniDis_To ;
      AV167Webconalbds_25_tfalbrpieent = AV80TFAlbRPieEnt ;
      AV168Webconalbds_26_tfalbrpieent_to = AV81TFAlbRPieEnt_To ;
      AV169Webconalbds_27_tfalbrpieuti = AV82TFAlbRPieUti ;
      AV170Webconalbds_28_tfalbrpieuti_to = AV83TFAlbRPieUti_To ;
      AV171Webconalbds_29_tfalbrpiedis = AV84TFAlbRPieDis ;
      AV172Webconalbds_30_tfalbrpiedis_to = AV85TFAlbRPieDis_To ;
      AV173Webconalbds_31_tfalbrest_sels = AV87TFAlbREst_Sels ;
      AV174Webconalbds_32_tfalbrusu = AV95TFAlbrUsu ;
      AV175Webconalbds_33_tfalbrusu_sel = AV96TFAlbrUsu_Sel ;
      AV176Webconalbds_34_tfalbrhor = AV97TFAlbrHor ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV149Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV162Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV173Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV144Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV145Webconalbds_3_tfalbreccod_to) ,
                                           AV147Webconalbds_5_tfclinom_sel ,
                                           AV146Webconalbds_4_tfclinom ,
                                           AV148Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV149Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV151Webconalbds_9_tfalbref_sel ,
                                           AV150Webconalbds_8_tfalbref ,
                                           AV153Webconalbds_11_tfalbrefdsc_sel ,
                                           AV152Webconalbds_10_tfalbrefdsc ,
                                           AV155Webconalbds_13_tfalbrtartd_sel ,
                                           AV154Webconalbds_12_tfalbrtartd ,
                                           AV157Webconalbds_15_tftrnnom_sel ,
                                           AV156Webconalbds_14_tftrnnom ,
                                           AV159Webconalbds_17_tfprocenom_sel ,
                                           AV158Webconalbds_16_tfprocenom ,
                                           AV160Webconalbds_18_tfalbrunient ,
                                           AV161Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV162Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV163Webconalbds_21_tfalbruniuti ,
                                           AV164Webconalbds_22_tfalbruniuti_to ,
                                           AV165Webconalbds_23_tfalbrunidis ,
                                           AV166Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV167Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV168Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV169Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV170Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV171Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV172Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV173Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV175Webconalbds_33_tfalbrusu_sel ,
                                           AV174Webconalbds_32_tfalbrusu ,
                                           AV176Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV143Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV146Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV146Webconalbds_4_tfclinom), 30, "%") ;
      lV150Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV150Webconalbds_8_tfalbref), 16, "%") ;
      lV152Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV152Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV154Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV154Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV156Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV156Webconalbds_14_tftrnnom), 30, "%") ;
      lV158Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV158Webconalbds_16_tfprocenom), 30, "%") ;
      lV174Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV174Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084C2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV144Webconalbds_2_tfalbreccod), Integer.valueOf(AV145Webconalbds_3_tfalbreccod_to), lV146Webconalbds_4_tfclinom, AV147Webconalbds_5_tfclinom_sel, AV148Webconalbds_6_tfalbrfen, lV150Webconalbds_8_tfalbref, AV151Webconalbds_9_tfalbref_sel, lV152Webconalbds_10_tfalbrefdsc, AV153Webconalbds_11_tfalbrefdsc_sel, lV154Webconalbds_12_tfalbrtartd, AV155Webconalbds_13_tfalbrtartd_sel, lV156Webconalbds_14_tftrnnom, AV157Webconalbds_15_tftrnnom_sel, lV158Webconalbds_16_tfprocenom, AV159Webconalbds_17_tfprocenom_sel, AV160Webconalbds_18_tfalbrunient, AV161Webconalbds_19_tfalbrunient_to, AV163Webconalbds_21_tfalbruniuti, AV164Webconalbds_22_tfalbruniuti_to, AV165Webconalbds_23_tfalbrunidis, AV166Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV167Webconalbds_25_tfalbrpieent), Integer.valueOf(AV168Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV169Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV170Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV171Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV172Webconalbds_30_tfalbrpiedis_to), lV174Webconalbds_32_tfalbrusu, AV175Webconalbds_33_tfalbrusu_sel, AV176Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P084C2_A396EmprCod[0] ;
         A252CliCod = P084C2_A252CliCod[0] ;
         A6263AlbRTartC = P084C2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084C2_n6263AlbRTartC[0] ;
         A840TrnCod = P084C2_A840TrnCod[0] ;
         n840TrnCod = P084C2_n840TrnCod[0] ;
         A970ProceCod = P084C2_A970ProceCod[0] ;
         n970ProceCod = P084C2_n970ProceCod[0] ;
         A6179AlbrHor = P084C2_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084C2_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084C2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084C2_A57AlbRUniDis[0] ;
         A971ProceNom = P084C2_A971ProceNom[0] ;
         n971ProceNom = P084C2_n971ProceNom[0] ;
         A841TrnNom = P084C2_A841TrnNom[0] ;
         n841TrnNom = P084C2_n841TrnNom[0] ;
         A6264AlbRTartD = P084C2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084C2_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084C2_A3613AlbRefDsc[0] ;
         A45AlbRef = P084C2_A45AlbRef[0] ;
         A49AlbRFen = P084C2_A49AlbRFen[0] ;
         A279CliNom = P084C2_A279CliNom[0] ;
         A44AlbRecCod = P084C2_A44AlbRecCod[0] ;
         A47AlbREst = P084C2_A47AlbREst[0] ;
         A56AlbRUni = P084C2_A56AlbRUni[0] ;
         A55AlbRReo = P084C2_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084C2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084C2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084C2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084C2_A60AlbRUniUti[0] ;
         A279CliNom = P084C2_A279CliNom[0] ;
         A6264AlbRTartD = P084C2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084C2_n6264AlbRTartD[0] ;
         A841TrnNom = P084C2_A841TrnNom[0] ;
         n841TrnNom = P084C2_n841TrnNom[0] ;
         A971ProceNom = P084C2_A971ProceNom[0] ;
         n971ProceNom = P084C2_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV143Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV143Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV143Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
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
               returnInSub = true;
               if (true) return;
            }
            AV48VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A44AlbRecCod );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A49AlbRFen );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "NO", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "NO", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), httpContext.getMessage( "SI", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "SI", "") );
               }
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A45AlbRef, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3613AlbRefDsc, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6264AlbRTartD, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A971ProceNom, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A58AlbRUniEnt)) );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "K", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "K", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), httpContext.getMessage( "M", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "M", "") );
               }
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A60AlbRUniUti)) );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A57AlbRUniDis)) );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A52AlbRPieEnt );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A54AlbRPieUti );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A51AlbRPieDis );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( "" );
               if ( A47AlbREst == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Abierta", "") );
               }
               else if ( A47AlbREst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cerrada", "") );
               }
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6178AlbrUsu, GXv_char5) ;
               webconalbexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( localUtil.format( A6179AlbrHor, "99:99:99") );
               AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
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
      AV40ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRFen", "", "Fecha", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRTartD", "", "T Articulo", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ProceNom", "", "Procedencia", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniEnt", "", "Unds Ent", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Und", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniUti", "", "Unds Uti", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniDis", "", "Unds Disp", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieEnt", "", "Pzs Ent", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieUti", "", "Pzs Uti", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieDis", "", "Pzs Disp", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbREst", "", "Estado", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbrUsu", "", "Usuario", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbrHor", "", "Hora", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV44UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebCONALBColumnsSelector", GXv_char5) ;
      webconalbexport.this.GXt_char4 = GXv_char5[0] ;
      AV44UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV41ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV41ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV40ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV41ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV40ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("WebCONALBGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebCONALBGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("WebCONALBGridState"), null, null);
      }
      AV16OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV177GXV5 = 1 ;
      while ( AV177GXV5 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV177GXV5));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV135FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV55TFCliNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV56TFCliNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV59TFAlbRReo_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFAlbRReo_Sels.fromJSonString(AV59TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV62TFAlbRef = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV63TFAlbRef_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV64TFAlbRefDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV65TFAlbRefDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV66TFAlbRTartD = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV67TFAlbRTartD_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV68TFTrnNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV69TFTrnNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV70TFProceNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV71TFProceNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV72TFAlbRUniEnt = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFAlbRUniEnt_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV133TFAlbRUni_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV134TFAlbRUni_Sels.fromJSonString(AV133TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV76TFAlbRUniUti = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFAlbRUniUti_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV78TFAlbRUniDis = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFAlbRUniDis_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV80TFAlbRPieEnt = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFAlbRPieEnt_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV82TFAlbRPieUti = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFAlbRPieUti_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV84TFAlbRPieDis = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV85TFAlbRPieDis_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV86TFAlbREst_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV87TFAlbREst_Sels.fromJSonString(AV86TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU") == 0 )
         {
            AV95TFAlbrUsu = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU_SEL") == 0 )
         {
            AV96TFAlbrUsu_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV97TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         AV177GXV5 = (int)(AV177GXV5+1) ;
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
      this.aP0[0] = webconalbexport.this.AV11Filename;
      this.aP1[0] = webconalbexport.this.AV12ErrorMessage;
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
      AV135FilterFullText = "" ;
      AV56TFCliNom_Sel = "" ;
      AV55TFCliNom = "" ;
      AV57TFAlbRFen = GXutil.nullDate() ;
      AV60TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61TFAlbRReo_Sel = "" ;
      AV63TFAlbRef_Sel = "" ;
      AV62TFAlbRef = "" ;
      AV65TFAlbRefDsc_Sel = "" ;
      AV64TFAlbRefDsc = "" ;
      AV67TFAlbRTartD_Sel = "" ;
      AV66TFAlbRTartD = "" ;
      AV69TFTrnNom_Sel = "" ;
      AV68TFTrnNom = "" ;
      AV71TFProceNom_Sel = "" ;
      AV70TFProceNom = "" ;
      AV72TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV73TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV134TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV75TFAlbRUni_Sel = "" ;
      AV76TFAlbRUniUti = DecimalUtil.ZERO ;
      AV77TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV78TFAlbRUniDis = DecimalUtil.ZERO ;
      AV79TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV87TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV96TFAlbrUsu_Sel = "" ;
      AV95TFAlbrUsu = "" ;
      AV97TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV42ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A6178AlbrUsu = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV143Webconalbds_1_filterfulltext = "" ;
      AV146Webconalbds_4_tfclinom = "" ;
      AV147Webconalbds_5_tfclinom_sel = "" ;
      AV148Webconalbds_6_tfalbrfen = GXutil.nullDate() ;
      AV149Webconalbds_7_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV150Webconalbds_8_tfalbref = "" ;
      AV151Webconalbds_9_tfalbref_sel = "" ;
      AV152Webconalbds_10_tfalbrefdsc = "" ;
      AV153Webconalbds_11_tfalbrefdsc_sel = "" ;
      AV154Webconalbds_12_tfalbrtartd = "" ;
      AV155Webconalbds_13_tfalbrtartd_sel = "" ;
      AV156Webconalbds_14_tftrnnom = "" ;
      AV157Webconalbds_15_tftrnnom_sel = "" ;
      AV158Webconalbds_16_tfprocenom = "" ;
      AV159Webconalbds_17_tfprocenom_sel = "" ;
      AV160Webconalbds_18_tfalbrunient = DecimalUtil.ZERO ;
      AV161Webconalbds_19_tfalbrunient_to = DecimalUtil.ZERO ;
      AV162Webconalbds_20_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV163Webconalbds_21_tfalbruniuti = DecimalUtil.ZERO ;
      AV164Webconalbds_22_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV165Webconalbds_23_tfalbrunidis = DecimalUtil.ZERO ;
      AV166Webconalbds_24_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV173Webconalbds_31_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV174Webconalbds_32_tfalbrusu = "" ;
      AV175Webconalbds_33_tfalbrusu_sel = "" ;
      AV176Webconalbds_34_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      lV143Webconalbds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV146Webconalbds_4_tfclinom = "" ;
      lV150Webconalbds_8_tfalbref = "" ;
      lV152Webconalbds_10_tfalbrefdsc = "" ;
      lV154Webconalbds_12_tfalbrtartd = "" ;
      lV156Webconalbds_14_tftrnnom = "" ;
      lV158Webconalbds_16_tfprocenom = "" ;
      lV174Webconalbds_32_tfalbrusu = "" ;
      P084C2_A396EmprCod = new String[] {""} ;
      P084C2_A252CliCod = new int[1] ;
      P084C2_A6263AlbRTartC = new short[1] ;
      P084C2_n6263AlbRTartC = new boolean[] {false} ;
      P084C2_A840TrnCod = new short[1] ;
      P084C2_n840TrnCod = new boolean[] {false} ;
      P084C2_A970ProceCod = new short[1] ;
      P084C2_n970ProceCod = new boolean[] {false} ;
      P084C2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084C2_A6178AlbrUsu = new String[] {""} ;
      P084C2_A51AlbRPieDis = new int[1] ;
      P084C2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084C2_A971ProceNom = new String[] {""} ;
      P084C2_n971ProceNom = new boolean[] {false} ;
      P084C2_A841TrnNom = new String[] {""} ;
      P084C2_n841TrnNom = new boolean[] {false} ;
      P084C2_A6264AlbRTartD = new String[] {""} ;
      P084C2_n6264AlbRTartD = new boolean[] {false} ;
      P084C2_A3613AlbRefDsc = new String[] {""} ;
      P084C2_A45AlbRef = new String[] {""} ;
      P084C2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084C2_A279CliNom = new String[] {""} ;
      P084C2_A44AlbRecCod = new int[1] ;
      P084C2_A47AlbREst = new byte[1] ;
      P084C2_A56AlbRUni = new String[] {""} ;
      P084C2_A55AlbRReo = new String[] {""} ;
      P084C2_A52AlbRPieEnt = new int[1] ;
      P084C2_A54AlbRPieUti = new int[1] ;
      P084C2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084C2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV44UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59TFAlbRReo_SelsJson = "" ;
      AV133TFAlbRUni_SelsJson = "" ;
      AV86TFAlbREst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webconalbexport__default(),
         new Object[] {
             new Object[] {
            P084C2_A396EmprCod, P084C2_A252CliCod, P084C2_A6263AlbRTartC, P084C2_n6263AlbRTartC, P084C2_A840TrnCod, P084C2_n840TrnCod, P084C2_A970ProceCod, P084C2_n970ProceCod, P084C2_A6179AlbrHor, P084C2_A6178AlbrUsu,
            P084C2_A51AlbRPieDis, P084C2_A57AlbRUniDis, P084C2_A971ProceNom, P084C2_n971ProceNom, P084C2_A841TrnNom, P084C2_n841TrnNom, P084C2_A6264AlbRTartD, P084C2_n6264AlbRTartD, P084C2_A3613AlbRefDsc, P084C2_A45AlbRef,
            P084C2_A49AlbRFen, P084C2_A279CliNom, P084C2_A44AlbRecCod, P084C2_A47AlbREst, P084C2_A56AlbRUni, P084C2_A55AlbRReo, P084C2_A52AlbRPieEnt, P084C2_A54AlbRPieUti, P084C2_A58AlbRUniEnt, P084C2_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV88TFAlbREst_Sel ;
   private byte A47AlbREst ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV51TFAlbRecCod ;
   private int AV52TFAlbRecCod_To ;
   private int AV138GXV1 ;
   private int AV139GXV2 ;
   private int AV80TFAlbRPieEnt ;
   private int AV81TFAlbRPieEnt_To ;
   private int AV82TFAlbRPieUti ;
   private int AV83TFAlbRPieUti_To ;
   private int AV84TFAlbRPieDis ;
   private int AV85TFAlbRPieDis_To ;
   private int AV140GXV3 ;
   private int AV141GXV4 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV144Webconalbds_2_tfalbreccod ;
   private int AV145Webconalbds_3_tfalbreccod_to ;
   private int AV167Webconalbds_25_tfalbrpieent ;
   private int AV168Webconalbds_26_tfalbrpieent_to ;
   private int AV169Webconalbds_27_tfalbrpieuti ;
   private int AV170Webconalbds_28_tfalbrpieuti_to ;
   private int AV171Webconalbds_29_tfalbrpiedis ;
   private int AV172Webconalbds_30_tfalbrpiedis_to ;
   private int AV149Webconalbds_7_tfalbrreo_sels_size ;
   private int AV162Webconalbds_20_tfalbruni_sels_size ;
   private int AV173Webconalbds_31_tfalbrest_sels_size ;
   private int A252CliCod ;
   private int AV177GXV5 ;
   private long AV111i ;
   private long AV48VisibleColumnCount ;
   private java.math.BigDecimal AV72TFAlbRUniEnt ;
   private java.math.BigDecimal AV73TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV76TFAlbRUniUti ;
   private java.math.BigDecimal AV77TFAlbRUniUti_To ;
   private java.math.BigDecimal AV78TFAlbRUniDis ;
   private java.math.BigDecimal AV79TFAlbRUniDis_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV160Webconalbds_18_tfalbrunient ;
   private java.math.BigDecimal AV161Webconalbds_19_tfalbrunient_to ;
   private java.math.BigDecimal AV163Webconalbds_21_tfalbruniuti ;
   private java.math.BigDecimal AV164Webconalbds_22_tfalbruniuti_to ;
   private java.math.BigDecimal AV165Webconalbds_23_tfalbrunidis ;
   private java.math.BigDecimal AV166Webconalbds_24_tfalbrunidis_to ;
   private String AV56TFCliNom_Sel ;
   private String AV55TFCliNom ;
   private String AV61TFAlbRReo_Sel ;
   private String AV63TFAlbRef_Sel ;
   private String AV62TFAlbRef ;
   private String AV65TFAlbRefDsc_Sel ;
   private String AV64TFAlbRefDsc ;
   private String AV67TFAlbRTartD_Sel ;
   private String AV66TFAlbRTartD ;
   private String AV69TFTrnNom_Sel ;
   private String AV68TFTrnNom ;
   private String AV71TFProceNom_Sel ;
   private String AV70TFProceNom ;
   private String AV75TFAlbRUni_Sel ;
   private String AV96TFAlbrUsu_Sel ;
   private String AV95TFAlbrUsu ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A6264AlbRTartD ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A56AlbRUni ;
   private String A6178AlbrUsu ;
   private String AV146Webconalbds_4_tfclinom ;
   private String AV147Webconalbds_5_tfclinom_sel ;
   private String AV150Webconalbds_8_tfalbref ;
   private String AV151Webconalbds_9_tfalbref_sel ;
   private String AV152Webconalbds_10_tfalbrefdsc ;
   private String AV153Webconalbds_11_tfalbrefdsc_sel ;
   private String AV154Webconalbds_12_tfalbrtartd ;
   private String AV155Webconalbds_13_tfalbrtartd_sel ;
   private String AV156Webconalbds_14_tftrnnom ;
   private String AV157Webconalbds_15_tftrnnom_sel ;
   private String AV158Webconalbds_16_tfprocenom ;
   private String AV159Webconalbds_17_tfprocenom_sel ;
   private String AV174Webconalbds_32_tfalbrusu ;
   private String AV175Webconalbds_33_tfalbrusu_sel ;
   private String scmdbuf ;
   private String lV146Webconalbds_4_tfclinom ;
   private String lV150Webconalbds_8_tfalbref ;
   private String lV152Webconalbds_10_tfalbrefdsc ;
   private String lV154Webconalbds_12_tfalbrtartd ;
   private String lV156Webconalbds_14_tftrnnom ;
   private String lV158Webconalbds_16_tfprocenom ;
   private String lV174Webconalbds_32_tfalbrusu ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV97TFAlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV176Webconalbds_34_tfalbrhor ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV57TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV148Webconalbds_6_tfalbrfen ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n6264AlbRTartD ;
   private String AV43ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV59TFAlbRReo_SelsJson ;
   private String AV133TFAlbRUni_SelsJson ;
   private String AV86TFAlbREst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV135FilterFullText ;
   private String AV143Webconalbds_1_filterfulltext ;
   private String lV143Webconalbds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV87TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV173Webconalbds_31_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private GXSimpleCollection<String> AV60TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV134TFAlbRUni_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P084C2_A396EmprCod ;
   private int[] P084C2_A252CliCod ;
   private short[] P084C2_A6263AlbRTartC ;
   private boolean[] P084C2_n6263AlbRTartC ;
   private short[] P084C2_A840TrnCod ;
   private boolean[] P084C2_n840TrnCod ;
   private short[] P084C2_A970ProceCod ;
   private boolean[] P084C2_n970ProceCod ;
   private java.util.Date[] P084C2_A6179AlbrHor ;
   private String[] P084C2_A6178AlbrUsu ;
   private int[] P084C2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084C2_A57AlbRUniDis ;
   private String[] P084C2_A971ProceNom ;
   private boolean[] P084C2_n971ProceNom ;
   private String[] P084C2_A841TrnNom ;
   private boolean[] P084C2_n841TrnNom ;
   private String[] P084C2_A6264AlbRTartD ;
   private boolean[] P084C2_n6264AlbRTartD ;
   private String[] P084C2_A3613AlbRefDsc ;
   private String[] P084C2_A45AlbRef ;
   private java.util.Date[] P084C2_A49AlbRFen ;
   private String[] P084C2_A279CliNom ;
   private int[] P084C2_A44AlbRecCod ;
   private byte[] P084C2_A47AlbREst ;
   private String[] P084C2_A56AlbRUni ;
   private String[] P084C2_A55AlbRReo ;
   private int[] P084C2_A52AlbRPieEnt ;
   private int[] P084C2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084C2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084C2_A60AlbRUniUti ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV149Webconalbds_7_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV162Webconalbds_20_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV42ColumnsSelector_Column ;
}

final  class webconalbexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV149Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV162Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV173Webconalbds_31_tfalbrest_sels ,
                                          int AV144Webconalbds_2_tfalbreccod ,
                                          int AV145Webconalbds_3_tfalbreccod_to ,
                                          String AV147Webconalbds_5_tfclinom_sel ,
                                          String AV146Webconalbds_4_tfclinom ,
                                          java.util.Date AV148Webconalbds_6_tfalbrfen ,
                                          int AV149Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV151Webconalbds_9_tfalbref_sel ,
                                          String AV150Webconalbds_8_tfalbref ,
                                          String AV153Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV152Webconalbds_10_tfalbrefdsc ,
                                          String AV155Webconalbds_13_tfalbrtartd_sel ,
                                          String AV154Webconalbds_12_tfalbrtartd ,
                                          String AV157Webconalbds_15_tftrnnom_sel ,
                                          String AV156Webconalbds_14_tftrnnom ,
                                          String AV159Webconalbds_17_tfprocenom_sel ,
                                          String AV158Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV160Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV161Webconalbds_19_tfalbrunient_to ,
                                          int AV162Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV163Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV164Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV165Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV166Webconalbds_24_tfalbrunidis_to ,
                                          int AV167Webconalbds_25_tfalbrpieent ,
                                          int AV168Webconalbds_26_tfalbrpieent_to ,
                                          int AV169Webconalbds_27_tfalbrpieuti ,
                                          int AV170Webconalbds_28_tfalbrpieuti_to ,
                                          int AV171Webconalbds_29_tfalbrpiedis ,
                                          int AV172Webconalbds_30_tfalbrpiedis_to ,
                                          int AV173Webconalbds_31_tfalbrest_sels_size ,
                                          String AV175Webconalbds_33_tfalbrusu_sel ,
                                          String AV174Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV176Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV143Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[30];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV144Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (0==AV145Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV146Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV148Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( AV149Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV149Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV151Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV150Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV154Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV156Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV158Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV161Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( AV162Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV162Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV167Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV168Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV169Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV170Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV171Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV172Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( AV173Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV173Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV175Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV174Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV176Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ProceNom" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ProceNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrHor DESC" ;
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
                  return conditional_P084C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
      }
   }

}

