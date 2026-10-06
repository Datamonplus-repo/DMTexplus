package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwlismerexport extends GXProcedure
{
   public webwlismerexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlismerexport.class ), "" );
   }

   public webwlismerexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwlismerexport.this.aP1 = new String[] {""};
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
      webwlismerexport.this.aP0 = aP0;
      webwlismerexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWlismerExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77FilterFullText, GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      GXt_dtime6 = GXutil.resetTime( AV62BarFecSal );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime6 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime6 = GXutil.resetTime( AV63BarFecSal_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime6 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV64CliCod );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( AV65CliCod_To );
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66BarSer, GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67BarSer_To, GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68BarColNom, GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char4 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69BarColNom_To, GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( GXt_char4 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV70BarColNum );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( AV71BarColNum_To );
      if ( ! ( (0==AV35TFCliCod) && (0==AV36TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarNHdr_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFBarNHdr, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV41TFBarTipArt) && (0==AV42TFBarTipArt_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFBarTipArt );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFBarTipArt_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarSer_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarSer, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarSerDsc_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarSerDsc, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarColNom_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarColNom, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarNomCli_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarNomCli, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV53TFBarColNum) && (0==AV54TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFBarColNum_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV74TFBarFecSal)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV74TFBarFecSal );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFBarFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV55TFBarFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFBarKgm_To)) );
      }
      if ( ! ( (0==AV78TFBarRdto4) && (0==AV79TFBarRdto4_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "4 decimales", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV78TFBarRdto4 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV79TFBarRdto4_To );
      }
      if ( ! ( (GXutil.strcmp("", AV81TFBarGots_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Gots", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFBarGots_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFBarGots)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Gots", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFBarGots, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV83TFBarGrs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Grs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFBarGrs_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFBarGrs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Grs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFBarGrs, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV85TFBarOcs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ocs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFBarOcs_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV84TFBarOcs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ocs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV84TFBarOcs, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV87TFBarRcs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rcs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFBarRcs_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV86TFBarRcs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rcs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFBarRcs, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV89TFBarOeko_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV89TFBarOeko_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV88TFBarOeko)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFBarOeko, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV90TFBarAccesorios_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Acc?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV90TFBarAccesorios_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV90TFBarAccesorios_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV92TFBarMarca_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Marca", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFBarMarca_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV91TFBarMarca)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Marca", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV91TFBarMarca, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV93TFBar_MacCod) && (0==AV94TFBar_MacCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Macro", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV93TFBar_MacCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV94TFBar_MacCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV96TFBarFasCod2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase Ult", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96TFBarFasCod2_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV95TFBarFasCod2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase Ult", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV95TFBarFasCod2, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV98TFBarFasDsc2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV98TFBarFasDsc2_Sel, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV97TFBarFasDsc2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            webwlismerexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV97TFBarFasDsc2, GXv_char5) ;
            webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("WebWlismerColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV18Session.getValue("WebWlismerColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV101GXV1));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV103Webwlismerds_1_filterfulltext = AV77FilterFullText ;
      AV104Webwlismerds_2_barfecsal = AV62BarFecSal ;
      AV105Webwlismerds_3_barfecsal_to = AV63BarFecSal_To ;
      AV106Webwlismerds_4_clicod = AV64CliCod ;
      AV107Webwlismerds_5_clicod_to = AV65CliCod_To ;
      AV108Webwlismerds_6_barser = AV66BarSer ;
      AV109Webwlismerds_7_barser_to = AV67BarSer_To ;
      AV110Webwlismerds_8_barcolnom = AV68BarColNom ;
      AV111Webwlismerds_9_barcolnom_to = AV69BarColNom_To ;
      AV112Webwlismerds_10_barcolnum = AV70BarColNum ;
      AV113Webwlismerds_11_barcolnum_to = AV71BarColNum_To ;
      AV114Webwlismerds_12_tfclicod = AV35TFCliCod ;
      AV115Webwlismerds_13_tfclicod_to = AV36TFCliCod_To ;
      AV116Webwlismerds_14_tfclinom = AV37TFCliNom ;
      AV117Webwlismerds_15_tfclinom_sel = AV38TFCliNom_Sel ;
      AV118Webwlismerds_16_tfbarnhdr = AV39TFBarNHdr ;
      AV119Webwlismerds_17_tfbarnhdr_sel = AV40TFBarNHdr_Sel ;
      AV120Webwlismerds_18_tfbartipart = AV41TFBarTipArt ;
      AV121Webwlismerds_19_tfbartipart_to = AV42TFBarTipArt_To ;
      AV122Webwlismerds_20_tfbarser = AV45TFBarSer ;
      AV123Webwlismerds_21_tfbarser_sel = AV46TFBarSer_Sel ;
      AV124Webwlismerds_22_tfbarserdsc = AV47TFBarSerDsc ;
      AV125Webwlismerds_23_tfbarserdsc_sel = AV48TFBarSerDsc_Sel ;
      AV126Webwlismerds_24_tfbarcolnom = AV49TFBarColNom ;
      AV127Webwlismerds_25_tfbarcolnom_sel = AV50TFBarColNom_Sel ;
      AV128Webwlismerds_26_tfbarnomcli = AV51TFBarNomCli ;
      AV129Webwlismerds_27_tfbarnomcli_sel = AV52TFBarNomCli_Sel ;
      AV130Webwlismerds_28_tfbarcolnum = AV53TFBarColNum ;
      AV131Webwlismerds_29_tfbarcolnum_to = AV54TFBarColNum_To ;
      AV132Webwlismerds_30_tfbarfecsal = AV74TFBarFecSal ;
      AV133Webwlismerds_31_tfbarfeccli = AV55TFBarFecCli ;
      AV134Webwlismerds_32_tfbarkgm = AV57TFBarKgm ;
      AV135Webwlismerds_33_tfbarkgm_to = AV58TFBarKgm_To ;
      AV136Webwlismerds_34_tfbarrdto4 = AV78TFBarRdto4 ;
      AV137Webwlismerds_35_tfbarrdto4_to = AV79TFBarRdto4_To ;
      AV138Webwlismerds_36_tfbargots = AV80TFBarGots ;
      AV139Webwlismerds_37_tfbargots_sel = AV81TFBarGots_Sel ;
      AV140Webwlismerds_38_tfbargrs = AV82TFBarGrs ;
      AV141Webwlismerds_39_tfbargrs_sel = AV83TFBarGrs_Sel ;
      AV142Webwlismerds_40_tfbarocs = AV84TFBarOcs ;
      AV143Webwlismerds_41_tfbarocs_sel = AV85TFBarOcs_Sel ;
      AV144Webwlismerds_42_tfbarrcs = AV86TFBarRcs ;
      AV145Webwlismerds_43_tfbarrcs_sel = AV87TFBarRcs_Sel ;
      AV146Webwlismerds_44_tfbaroeko = AV88TFBarOeko ;
      AV147Webwlismerds_45_tfbaroeko_sel = AV89TFBarOeko_Sel ;
      AV148Webwlismerds_46_tfbaraccesorios_sel = AV90TFBarAccesorios_Sel ;
      AV149Webwlismerds_47_tfbarmarca = AV91TFBarMarca ;
      AV150Webwlismerds_48_tfbarmarca_sel = AV92TFBarMarca_Sel ;
      AV151Webwlismerds_49_tfbar_maccod = AV93TFBar_MacCod ;
      AV152Webwlismerds_50_tfbar_maccod_to = AV94TFBar_MacCod_To ;
      AV153Webwlismerds_51_tfbarfascod2 = AV95TFBarFasCod2 ;
      AV154Webwlismerds_52_tfbarfascod2_sel = AV96TFBarFasCod2_Sel ;
      AV155Webwlismerds_53_tfbarfasdsc2 = AV97TFBarFasDsc2 ;
      AV156Webwlismerds_54_tfbarfasdsc2_sel = AV98TFBarFasDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV104Webwlismerds_2_barfecsal ,
                                           AV105Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV106Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV107Webwlismerds_5_clicod_to) ,
                                           AV108Webwlismerds_6_barser ,
                                           AV109Webwlismerds_7_barser_to ,
                                           AV110Webwlismerds_8_barcolnom ,
                                           AV111Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV112Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV113Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV114Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV115Webwlismerds_13_tfclicod_to) ,
                                           AV117Webwlismerds_15_tfclinom_sel ,
                                           AV116Webwlismerds_14_tfclinom ,
                                           AV119Webwlismerds_17_tfbarnhdr_sel ,
                                           AV118Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV120Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV121Webwlismerds_19_tfbartipart_to) ,
                                           AV123Webwlismerds_21_tfbarser_sel ,
                                           AV122Webwlismerds_20_tfbarser ,
                                           AV125Webwlismerds_23_tfbarserdsc_sel ,
                                           AV124Webwlismerds_22_tfbarserdsc ,
                                           AV127Webwlismerds_25_tfbarcolnom_sel ,
                                           AV126Webwlismerds_24_tfbarcolnom ,
                                           AV129Webwlismerds_27_tfbarnomcli_sel ,
                                           AV128Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV130Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV131Webwlismerds_29_tfbarcolnum_to) ,
                                           AV132Webwlismerds_30_tfbarfecsal ,
                                           AV133Webwlismerds_31_tfbarfeccli ,
                                           AV134Webwlismerds_32_tfbarkgm ,
                                           AV135Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV136Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV137Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV103Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV139Webwlismerds_37_tfbargots_sel ,
                                           AV138Webwlismerds_36_tfbargots ,
                                           AV141Webwlismerds_39_tfbargrs_sel ,
                                           AV140Webwlismerds_38_tfbargrs ,
                                           AV143Webwlismerds_41_tfbarocs_sel ,
                                           AV142Webwlismerds_40_tfbarocs ,
                                           AV145Webwlismerds_43_tfbarrcs_sel ,
                                           AV144Webwlismerds_42_tfbarrcs ,
                                           AV147Webwlismerds_45_tfbaroeko_sel ,
                                           AV146Webwlismerds_44_tfbaroeko ,
                                           AV148Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV150Webwlismerds_48_tfbarmarca_sel ,
                                           AV149Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV151Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV152Webwlismerds_50_tfbar_maccod_to) ,
                                           AV154Webwlismerds_52_tfbarfascod2_sel ,
                                           AV153Webwlismerds_51_tfbarfascod2 ,
                                           AV156Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV155Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV149Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV149Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV153Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV153Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV116Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV116Webwlismerds_14_tfclinom), 30, "%") ;
      lV118Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV118Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV122Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV122Webwlismerds_20_tfbarser), 16, "%") ;
      lV124Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV124Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV126Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV126Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV128Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV128Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FJ8 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV148Webwlismerds_46_tfbaraccesorios_sel, AV148Webwlismerds_46_tfbaraccesorios_sel, AV150Webwlismerds_48_tfbarmarca_sel, AV149Webwlismerds_47_tfbarmarca, lV149Webwlismerds_47_tfbarmarca, AV150Webwlismerds_48_tfbarmarca_sel, AV150Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV151Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV151Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV152Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV152Webwlismerds_50_tfbar_maccod_to), AV154Webwlismerds_52_tfbarfascod2_sel, AV153Webwlismerds_51_tfbarfascod2, lV153Webwlismerds_51_tfbarfascod2, AV154Webwlismerds_52_tfbarfascod2_sel, AV154Webwlismerds_52_tfbarfascod2_sel, AV104Webwlismerds_2_barfecsal, AV105Webwlismerds_3_barfecsal_to, Integer.valueOf(AV106Webwlismerds_4_clicod), Integer.valueOf(AV107Webwlismerds_5_clicod_to), AV108Webwlismerds_6_barser, AV109Webwlismerds_7_barser_to, AV110Webwlismerds_8_barcolnom, AV111Webwlismerds_9_barcolnom_to, Integer.valueOf(AV112Webwlismerds_10_barcolnum), Integer.valueOf(AV113Webwlismerds_11_barcolnum_to), Integer.valueOf(AV114Webwlismerds_12_tfclicod), Integer.valueOf(AV115Webwlismerds_13_tfclicod_to), lV116Webwlismerds_14_tfclinom, AV117Webwlismerds_15_tfclinom_sel, lV118Webwlismerds_16_tfbarnhdr, AV119Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV120Webwlismerds_18_tfbartipart), Short.valueOf(AV121Webwlismerds_19_tfbartipart_to), lV122Webwlismerds_20_tfbarser, AV123Webwlismerds_21_tfbarser_sel, lV124Webwlismerds_22_tfbarserdsc, AV125Webwlismerds_23_tfbarserdsc_sel, lV126Webwlismerds_24_tfbarcolnom, AV127Webwlismerds_25_tfbarcolnom_sel, lV128Webwlismerds_26_tfbarnomcli, AV129Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV130Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV131Webwlismerds_29_tfbarcolnum_to), AV132Webwlismerds_30_tfbarfecsal, AV133Webwlismerds_31_tfbarfeccli, AV134Webwlismerds_32_tfbarkgm, AV135Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV136Webwlismerds_34_tfbarrdto4), Short.valueOf(AV137Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P08FJ8_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FJ8_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FJ8_n13769BarRdto4[0] ;
         A155BarFecCli = P08FJ8_A155BarFecCli[0] ;
         A1234BarNomCli = P08FJ8_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FJ8_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FJ8_A217BarTipArt[0] ;
         n217BarTipArt = P08FJ8_n217BarTipArt[0] ;
         A13696BarNHdr = P08FJ8_A13696BarNHdr[0] ;
         A279CliNom = P08FJ8_A279CliNom[0] ;
         A136BarColNum = P08FJ8_A136BarColNum[0] ;
         A135BarColNom = P08FJ8_A135BarColNom[0] ;
         A212BarSer = P08FJ8_A212BarSer[0] ;
         A252CliCod = P08FJ8_A252CliCod[0] ;
         n252CliCod = P08FJ8_n252CliCod[0] ;
         A161BarFecSal = P08FJ8_A161BarFecSal[0] ;
         A143BarDisNum = P08FJ8_A143BarDisNum[0] ;
         A4812BarEncCli = P08FJ8_A4812BarEncCli[0] ;
         A13862Bar_MacCod = P08FJ8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FJ8_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FJ8_A13861BarMarca[0] ;
         n13861BarMarca = P08FJ8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FJ8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FJ8_n13860BarAccesor[0] ;
         A166BarKgm = P08FJ8_A166BarKgm[0] ;
         n166BarKgm = P08FJ8_n166BarKgm[0] ;
         A129BarCod = P08FJ8_A129BarCod[0] ;
         A132BarCodReo = P08FJ8_A132BarCodReo[0] ;
         A130BarCodPar = P08FJ8_A130BarCodPar[0] ;
         A361DisCod = P08FJ8_A361DisCod[0] ;
         A13863BarFasCod2 = P08FJ8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FJ8_n13863BarFasCod2[0] ;
         A396EmprCod = P08FJ8_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FJ8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FJ8_n13862Bar_MacCod[0] ;
         A279CliNom = P08FJ8_A279CliNom[0] ;
         A13863BarFasCod2 = P08FJ8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FJ8_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FJ8_A13861BarMarca[0] ;
         n13861BarMarca = P08FJ8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FJ8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FJ8_n13860BarAccesor[0] ;
         A166BarKgm = P08FJ8_A166BarKgm[0] ;
         n166BarKgm = P08FJ8_n166BarKgm[0] ;
         GXt_char4 = A13855BarGots ;
         GXv_char5[0] = GXt_char4 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
         webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
         A13855BarGots = GXt_char4 ;
         if ( ! ( (GXutil.strcmp("", AV139Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV138Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV138Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV139Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV139Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char4 = A13856BarGrs ;
               GXv_char5[0] = GXt_char4 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
               webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
               A13856BarGrs = GXt_char4 ;
               if ( ! ( (GXutil.strcmp("", AV141Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV140Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV140Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV141Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV141Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char4 = A13857BarOcs ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                     webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                     A13857BarOcs = GXt_char4 ;
                     if ( ! ( (GXutil.strcmp("", AV143Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV142Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV143Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV143Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char4 = A13858BarRcs ;
                           GXv_char5[0] = GXt_char4 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                           webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                           A13858BarRcs = GXt_char4 ;
                           if ( ! ( (GXutil.strcmp("", AV145Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV144Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV144Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV145Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV145Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char4 = A13859BarOeko ;
                                 GXv_char5[0] = GXt_char4 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                                 webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                 A13859BarOeko = GXt_char4 ;
                                 if ( ! ( (GXutil.strcmp("", AV147Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV146Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV146Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV147Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV147Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char4 = A13864BarFasDsc2 ;
                                       GXv_char5[0] = GXt_char4 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char5) ;
                                       webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                       A13864BarFasDsc2 = GXt_char4 ;
                                       if ( (GXutil.strcmp("", AV103Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV103Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV103Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV156Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV155Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV155Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV156Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV156Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
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
                                                   pr_default.close(0);
                                                   pr_default.close(0);
                                                   returnInSub = true;
                                                   if (true) return;
                                                }
                                                AV32VisibleColumnCount = 0 ;
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A217BarTipArt );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = AV76TipArtDsc ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV76TipArtDsc = GXt_char4 ;
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TipArtDsc, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV22BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22BarEncCli, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_dtime6 = GXutil.resetTime( A161BarFecSal );
                                                   AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_dtime6 = GXutil.resetTime( A155BarFecCli );
                                                   AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A13769BarRdto4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13855BarGots, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13856BarGrs, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13857BarOcs, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13858BarRcs, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13859BarOeko, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13860BarAccesor, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13861BarMarca, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A13862Bar_MacCod );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13863BarFasCod2, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
                                                   AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
                                                   AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char4 = "" ;
                                                   GXv_char5[0] = GXt_char4 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13864BarFasDsc2, GXv_char5) ;
                                                   webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
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
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "N° Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarTipArt", "", "Codigo Tipo Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&TipArtDsc", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Nombre Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNum", "", "Numero del Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarKgm", "", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarRdto4", "", "4 decimales", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarGots", "", "Gots", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarGrs", "", "Grs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOcs", "", "Ocs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarRcs", "", "Rcs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOeko", "", "Oeko", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarAccesorios", "", "Acc?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMarca", "", "Marca", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Bar_MacCod", "", "Macro", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWlismerColumnsSelector", GXv_char5) ;
      webwlismerexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("WebWlismerGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWlismerGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WebWlismerGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV157GXV2 = 1 ;
      while ( AV157GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV157GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECSAL") == 0 )
         {
            AV62BarFecSal = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV63BarFecSal_To = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV64CliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65CliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV66BarSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV67BarSer_To = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV68BarColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV69BarColNom_To = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV70BarColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71BarColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV39TFBarNHdr = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV40TFBarNHdr_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV41TFBarTipArt = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFBarTipArt_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV45TFBarSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV46TFBarSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV47TFBarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV48TFBarSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV49TFBarColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV50TFBarColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV51TFBarNomCli = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV52TFBarNomCli_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV53TFBarColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFBarColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV74TFBarFecSal = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV55TFBarFecCli = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV57TFBarKgm = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFBarKgm_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV78TFBarRdto4 = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFBarRdto4_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV80TFBarGots = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV81TFBarGots_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV82TFBarGrs = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV83TFBarGrs_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV84TFBarOcs = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV85TFBarOcs_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV86TFBarRcs = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV87TFBarRcs_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV88TFBarOeko = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV89TFBarOeko_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV90TFBarAccesorios_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV91TFBarMarca = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV92TFBarMarca_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV93TFBar_MacCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFBar_MacCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV95TFBarFasCod2 = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV96TFBarFasCod2_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV97TFBarFasDsc2 = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV98TFBarFasDsc2_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV157GXV2 = (int)(AV157GXV2+1) ;
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
      this.aP0[0] = webwlismerexport.this.AV11Filename;
      this.aP1[0] = webwlismerexport.this.AV12ErrorMessage;
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
      AV77FilterFullText = "" ;
      AV62BarFecSal = GXutil.nullDate() ;
      AV63BarFecSal_To = GXutil.nullDate() ;
      AV66BarSer = "" ;
      AV67BarSer_To = "" ;
      AV68BarColNom = "" ;
      AV69BarColNom_To = "" ;
      AV38TFCliNom_Sel = "" ;
      AV37TFCliNom = "" ;
      AV40TFBarNHdr_Sel = "" ;
      AV39TFBarNHdr = "" ;
      AV46TFBarSer_Sel = "" ;
      AV45TFBarSer = "" ;
      AV48TFBarSerDsc_Sel = "" ;
      AV47TFBarSerDsc = "" ;
      AV50TFBarColNom_Sel = "" ;
      AV49TFBarColNom = "" ;
      AV52TFBarNomCli_Sel = "" ;
      AV51TFBarNomCli = "" ;
      AV74TFBarFecSal = GXutil.nullDate() ;
      AV55TFBarFecCli = GXutil.nullDate() ;
      AV57TFBarKgm = DecimalUtil.ZERO ;
      AV58TFBarKgm_To = DecimalUtil.ZERO ;
      AV81TFBarGots_Sel = "" ;
      AV80TFBarGots = "" ;
      AV83TFBarGrs_Sel = "" ;
      AV82TFBarGrs = "" ;
      AV85TFBarOcs_Sel = "" ;
      AV84TFBarOcs = "" ;
      AV87TFBarRcs_Sel = "" ;
      AV86TFBarRcs = "" ;
      AV89TFBarOeko_Sel = "" ;
      AV88TFBarOeko = "" ;
      AV90TFBarAccesorios_Sel = "" ;
      AV92TFBarMarca_Sel = "" ;
      AV91TFBarMarca = "" ;
      AV96TFBarFasCod2_Sel = "" ;
      AV95TFBarFasCod2 = "" ;
      AV98TFBarFasDsc2_Sel = "" ;
      AV97TFBarFasDsc2 = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV103Webwlismerds_1_filterfulltext = "" ;
      AV104Webwlismerds_2_barfecsal = GXutil.nullDate() ;
      AV105Webwlismerds_3_barfecsal_to = GXutil.nullDate() ;
      AV108Webwlismerds_6_barser = "" ;
      AV109Webwlismerds_7_barser_to = "" ;
      AV110Webwlismerds_8_barcolnom = "" ;
      AV111Webwlismerds_9_barcolnom_to = "" ;
      AV116Webwlismerds_14_tfclinom = "" ;
      AV117Webwlismerds_15_tfclinom_sel = "" ;
      AV118Webwlismerds_16_tfbarnhdr = "" ;
      AV119Webwlismerds_17_tfbarnhdr_sel = "" ;
      AV122Webwlismerds_20_tfbarser = "" ;
      AV123Webwlismerds_21_tfbarser_sel = "" ;
      AV124Webwlismerds_22_tfbarserdsc = "" ;
      AV125Webwlismerds_23_tfbarserdsc_sel = "" ;
      AV126Webwlismerds_24_tfbarcolnom = "" ;
      AV127Webwlismerds_25_tfbarcolnom_sel = "" ;
      AV128Webwlismerds_26_tfbarnomcli = "" ;
      AV129Webwlismerds_27_tfbarnomcli_sel = "" ;
      AV132Webwlismerds_30_tfbarfecsal = GXutil.nullDate() ;
      AV133Webwlismerds_31_tfbarfeccli = GXutil.nullDate() ;
      AV134Webwlismerds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV135Webwlismerds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV138Webwlismerds_36_tfbargots = "" ;
      AV139Webwlismerds_37_tfbargots_sel = "" ;
      AV140Webwlismerds_38_tfbargrs = "" ;
      AV141Webwlismerds_39_tfbargrs_sel = "" ;
      AV142Webwlismerds_40_tfbarocs = "" ;
      AV143Webwlismerds_41_tfbarocs_sel = "" ;
      AV144Webwlismerds_42_tfbarrcs = "" ;
      AV145Webwlismerds_43_tfbarrcs_sel = "" ;
      AV146Webwlismerds_44_tfbaroeko = "" ;
      AV147Webwlismerds_45_tfbaroeko_sel = "" ;
      AV148Webwlismerds_46_tfbaraccesorios_sel = "" ;
      AV149Webwlismerds_47_tfbarmarca = "" ;
      AV150Webwlismerds_48_tfbarmarca_sel = "" ;
      AV153Webwlismerds_51_tfbarfascod2 = "" ;
      AV154Webwlismerds_52_tfbarfascod2_sel = "" ;
      AV155Webwlismerds_53_tfbarfasdsc2 = "" ;
      AV156Webwlismerds_54_tfbarfasdsc2_sel = "" ;
      scmdbuf = "" ;
      lV149Webwlismerds_47_tfbarmarca = "" ;
      lV153Webwlismerds_51_tfbarfascod2 = "" ;
      lV116Webwlismerds_14_tfclinom = "" ;
      lV118Webwlismerds_16_tfbarnhdr = "" ;
      lV122Webwlismerds_20_tfbarser = "" ;
      lV124Webwlismerds_22_tfbarserdsc = "" ;
      lV126Webwlismerds_24_tfbarcolnom = "" ;
      lV128Webwlismerds_26_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      P08FJ8_A9713Tb1_Cod = new short[1] ;
      P08FJ8_A4466BarAcaAnh = new short[1] ;
      P08FJ8_A13769BarRdto4 = new short[1] ;
      P08FJ8_n13769BarRdto4 = new boolean[] {false} ;
      P08FJ8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FJ8_A1234BarNomCli = new String[] {""} ;
      P08FJ8_A1652BarSerDsc = new String[] {""} ;
      P08FJ8_A217BarTipArt = new short[1] ;
      P08FJ8_n217BarTipArt = new boolean[] {false} ;
      P08FJ8_A13696BarNHdr = new String[] {""} ;
      P08FJ8_A279CliNom = new String[] {""} ;
      P08FJ8_A136BarColNum = new int[1] ;
      P08FJ8_A135BarColNom = new String[] {""} ;
      P08FJ8_A212BarSer = new String[] {""} ;
      P08FJ8_A252CliCod = new int[1] ;
      P08FJ8_n252CliCod = new boolean[] {false} ;
      P08FJ8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FJ8_A143BarDisNum = new String[] {""} ;
      P08FJ8_A4812BarEncCli = new String[] {""} ;
      P08FJ8_A13862Bar_MacCod = new int[1] ;
      P08FJ8_n13862Bar_MacCod = new boolean[] {false} ;
      P08FJ8_A13861BarMarca = new String[] {""} ;
      P08FJ8_n13861BarMarca = new boolean[] {false} ;
      P08FJ8_A13860BarAccesor = new String[] {""} ;
      P08FJ8_n13860BarAccesor = new boolean[] {false} ;
      P08FJ8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FJ8_n166BarKgm = new boolean[] {false} ;
      P08FJ8_A129BarCod = new int[1] ;
      P08FJ8_A132BarCodReo = new byte[1] ;
      P08FJ8_A130BarCodPar = new String[] {""} ;
      P08FJ8_A361DisCod = new int[1] ;
      P08FJ8_A13863BarFasCod2 = new String[] {""} ;
      P08FJ8_n13863BarFasCod2 = new boolean[] {false} ;
      P08FJ8_A396EmprCod = new String[] {""} ;
      AV76TipArtDsc = "" ;
      AV22BarEncCli = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlismerexport__default(),
         new Object[] {
             new Object[] {
            P08FJ8_A9713Tb1_Cod, P08FJ8_A4466BarAcaAnh, P08FJ8_A13769BarRdto4, P08FJ8_n13769BarRdto4, P08FJ8_A155BarFecCli, P08FJ8_A1234BarNomCli, P08FJ8_A1652BarSerDsc, P08FJ8_A217BarTipArt, P08FJ8_n217BarTipArt, P08FJ8_A13696BarNHdr,
            P08FJ8_A279CliNom, P08FJ8_A136BarColNum, P08FJ8_A135BarColNom, P08FJ8_A212BarSer, P08FJ8_A252CliCod, P08FJ8_n252CliCod, P08FJ8_A161BarFecSal, P08FJ8_A143BarDisNum, P08FJ8_A4812BarEncCli, P08FJ8_A13862Bar_MacCod,
            P08FJ8_n13862Bar_MacCod, P08FJ8_A13861BarMarca, P08FJ8_n13861BarMarca, P08FJ8_A13860BarAccesor, P08FJ8_n13860BarAccesor, P08FJ8_A166BarKgm, P08FJ8_n166BarKgm, P08FJ8_A129BarCod, P08FJ8_A132BarCodReo, P08FJ8_A130BarCodPar,
            P08FJ8_A361DisCod, P08FJ8_A13863BarFasCod2, P08FJ8_n13863BarFasCod2, P08FJ8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV41TFBarTipArt ;
   private short AV42TFBarTipArt_To ;
   private short AV78TFBarRdto4 ;
   private short AV79TFBarRdto4_To ;
   private short GXv_int3[] ;
   private short A217BarTipArt ;
   private short A13769BarRdto4 ;
   private short AV120Webwlismerds_18_tfbartipart ;
   private short AV121Webwlismerds_19_tfbartipart_to ;
   private short AV136Webwlismerds_34_tfbarrdto4 ;
   private short AV137Webwlismerds_35_tfbarrdto4_to ;
   private short AV16OrderedBy ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV64CliCod ;
   private int AV65CliCod_To ;
   private int AV70BarColNum ;
   private int AV71BarColNum_To ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV53TFBarColNum ;
   private int AV54TFBarColNum_To ;
   private int AV93TFBar_MacCod ;
   private int AV94TFBar_MacCod_To ;
   private int AV101GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13862Bar_MacCod ;
   private int AV106Webwlismerds_4_clicod ;
   private int AV107Webwlismerds_5_clicod_to ;
   private int AV112Webwlismerds_10_barcolnum ;
   private int AV113Webwlismerds_11_barcolnum_to ;
   private int AV114Webwlismerds_12_tfclicod ;
   private int AV115Webwlismerds_13_tfclicod_to ;
   private int AV130Webwlismerds_28_tfbarcolnum ;
   private int AV131Webwlismerds_29_tfbarcolnum_to ;
   private int AV151Webwlismerds_49_tfbar_maccod ;
   private int AV152Webwlismerds_50_tfbar_maccod_to ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV157GXV2 ;
   private long AV32VisibleColumnCount ;
   private java.math.BigDecimal AV57TFBarKgm ;
   private java.math.BigDecimal AV58TFBarKgm_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV134Webwlismerds_32_tfbarkgm ;
   private java.math.BigDecimal AV135Webwlismerds_33_tfbarkgm_to ;
   private String AV66BarSer ;
   private String AV67BarSer_To ;
   private String AV68BarColNom ;
   private String AV69BarColNom_To ;
   private String AV38TFCliNom_Sel ;
   private String AV37TFCliNom ;
   private String AV40TFBarNHdr_Sel ;
   private String AV39TFBarNHdr ;
   private String AV46TFBarSer_Sel ;
   private String AV45TFBarSer ;
   private String AV48TFBarSerDsc_Sel ;
   private String AV47TFBarSerDsc ;
   private String AV50TFBarColNom_Sel ;
   private String AV49TFBarColNom ;
   private String AV52TFBarNomCli_Sel ;
   private String AV51TFBarNomCli ;
   private String AV81TFBarGots_Sel ;
   private String AV80TFBarGots ;
   private String AV83TFBarGrs_Sel ;
   private String AV82TFBarGrs ;
   private String AV85TFBarOcs_Sel ;
   private String AV84TFBarOcs ;
   private String AV87TFBarRcs_Sel ;
   private String AV86TFBarRcs ;
   private String AV89TFBarOeko_Sel ;
   private String AV88TFBarOeko ;
   private String AV90TFBarAccesorios_Sel ;
   private String AV92TFBarMarca_Sel ;
   private String AV91TFBarMarca ;
   private String AV96TFBarFasCod2_Sel ;
   private String AV95TFBarFasCod2 ;
   private String AV98TFBarFasDsc2_Sel ;
   private String AV97TFBarFasDsc2 ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13855BarGots ;
   private String A13856BarGrs ;
   private String A13857BarOcs ;
   private String A13858BarRcs ;
   private String A13859BarOeko ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String A13863BarFasCod2 ;
   private String A13864BarFasDsc2 ;
   private String AV108Webwlismerds_6_barser ;
   private String AV109Webwlismerds_7_barser_to ;
   private String AV110Webwlismerds_8_barcolnom ;
   private String AV111Webwlismerds_9_barcolnom_to ;
   private String AV116Webwlismerds_14_tfclinom ;
   private String AV117Webwlismerds_15_tfclinom_sel ;
   private String AV118Webwlismerds_16_tfbarnhdr ;
   private String AV119Webwlismerds_17_tfbarnhdr_sel ;
   private String AV122Webwlismerds_20_tfbarser ;
   private String AV123Webwlismerds_21_tfbarser_sel ;
   private String AV124Webwlismerds_22_tfbarserdsc ;
   private String AV125Webwlismerds_23_tfbarserdsc_sel ;
   private String AV126Webwlismerds_24_tfbarcolnom ;
   private String AV127Webwlismerds_25_tfbarcolnom_sel ;
   private String AV128Webwlismerds_26_tfbarnomcli ;
   private String AV129Webwlismerds_27_tfbarnomcli_sel ;
   private String AV138Webwlismerds_36_tfbargots ;
   private String AV139Webwlismerds_37_tfbargots_sel ;
   private String AV140Webwlismerds_38_tfbargrs ;
   private String AV141Webwlismerds_39_tfbargrs_sel ;
   private String AV142Webwlismerds_40_tfbarocs ;
   private String AV143Webwlismerds_41_tfbarocs_sel ;
   private String AV144Webwlismerds_42_tfbarrcs ;
   private String AV145Webwlismerds_43_tfbarrcs_sel ;
   private String AV146Webwlismerds_44_tfbaroeko ;
   private String AV147Webwlismerds_45_tfbaroeko_sel ;
   private String AV148Webwlismerds_46_tfbaraccesorios_sel ;
   private String AV149Webwlismerds_47_tfbarmarca ;
   private String AV150Webwlismerds_48_tfbarmarca_sel ;
   private String AV153Webwlismerds_51_tfbarfascod2 ;
   private String AV154Webwlismerds_52_tfbarfascod2_sel ;
   private String AV155Webwlismerds_53_tfbarfasdsc2 ;
   private String AV156Webwlismerds_54_tfbarfasdsc2_sel ;
   private String scmdbuf ;
   private String lV149Webwlismerds_47_tfbarmarca ;
   private String lV153Webwlismerds_51_tfbarfascod2 ;
   private String lV116Webwlismerds_14_tfclinom ;
   private String lV118Webwlismerds_16_tfbarnhdr ;
   private String lV122Webwlismerds_20_tfbarser ;
   private String lV124Webwlismerds_22_tfbarserdsc ;
   private String lV126Webwlismerds_24_tfbarcolnom ;
   private String lV128Webwlismerds_26_tfbarnomcli ;
   private String A130BarCodPar ;
   private String AV76TipArtDsc ;
   private String AV22BarEncCli ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV62BarFecSal ;
   private java.util.Date AV63BarFecSal_To ;
   private java.util.Date AV74TFBarFecSal ;
   private java.util.Date AV55TFBarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV104Webwlismerds_2_barfecsal ;
   private java.util.Date AV105Webwlismerds_3_barfecsal_to ;
   private java.util.Date AV132Webwlismerds_30_tfbarfecsal ;
   private java.util.Date AV133Webwlismerds_31_tfbarfeccli ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13769BarRdto4 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n166BarKgm ;
   private boolean n13863BarFasCod2 ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV77FilterFullText ;
   private String AV103Webwlismerds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08FJ8_A9713Tb1_Cod ;
   private short[] P08FJ8_A4466BarAcaAnh ;
   private short[] P08FJ8_A13769BarRdto4 ;
   private boolean[] P08FJ8_n13769BarRdto4 ;
   private java.util.Date[] P08FJ8_A155BarFecCli ;
   private String[] P08FJ8_A1234BarNomCli ;
   private String[] P08FJ8_A1652BarSerDsc ;
   private short[] P08FJ8_A217BarTipArt ;
   private boolean[] P08FJ8_n217BarTipArt ;
   private String[] P08FJ8_A13696BarNHdr ;
   private String[] P08FJ8_A279CliNom ;
   private int[] P08FJ8_A136BarColNum ;
   private String[] P08FJ8_A135BarColNom ;
   private String[] P08FJ8_A212BarSer ;
   private int[] P08FJ8_A252CliCod ;
   private boolean[] P08FJ8_n252CliCod ;
   private java.util.Date[] P08FJ8_A161BarFecSal ;
   private String[] P08FJ8_A143BarDisNum ;
   private String[] P08FJ8_A4812BarEncCli ;
   private int[] P08FJ8_A13862Bar_MacCod ;
   private boolean[] P08FJ8_n13862Bar_MacCod ;
   private String[] P08FJ8_A13861BarMarca ;
   private boolean[] P08FJ8_n13861BarMarca ;
   private String[] P08FJ8_A13860BarAccesor ;
   private boolean[] P08FJ8_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FJ8_A166BarKgm ;
   private boolean[] P08FJ8_n166BarKgm ;
   private int[] P08FJ8_A129BarCod ;
   private byte[] P08FJ8_A132BarCodReo ;
   private String[] P08FJ8_A130BarCodPar ;
   private int[] P08FJ8_A361DisCod ;
   private String[] P08FJ8_A13863BarFasCod2 ;
   private boolean[] P08FJ8_n13863BarFasCod2 ;
   private String[] P08FJ8_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class webwlismerexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FJ8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV104Webwlismerds_2_barfecsal ,
                                          java.util.Date AV105Webwlismerds_3_barfecsal_to ,
                                          int AV106Webwlismerds_4_clicod ,
                                          int AV107Webwlismerds_5_clicod_to ,
                                          String AV108Webwlismerds_6_barser ,
                                          String AV109Webwlismerds_7_barser_to ,
                                          String AV110Webwlismerds_8_barcolnom ,
                                          String AV111Webwlismerds_9_barcolnom_to ,
                                          int AV112Webwlismerds_10_barcolnum ,
                                          int AV113Webwlismerds_11_barcolnum_to ,
                                          int AV114Webwlismerds_12_tfclicod ,
                                          int AV115Webwlismerds_13_tfclicod_to ,
                                          String AV117Webwlismerds_15_tfclinom_sel ,
                                          String AV116Webwlismerds_14_tfclinom ,
                                          String AV119Webwlismerds_17_tfbarnhdr_sel ,
                                          String AV118Webwlismerds_16_tfbarnhdr ,
                                          short AV120Webwlismerds_18_tfbartipart ,
                                          short AV121Webwlismerds_19_tfbartipart_to ,
                                          String AV123Webwlismerds_21_tfbarser_sel ,
                                          String AV122Webwlismerds_20_tfbarser ,
                                          String AV125Webwlismerds_23_tfbarserdsc_sel ,
                                          String AV124Webwlismerds_22_tfbarserdsc ,
                                          String AV127Webwlismerds_25_tfbarcolnom_sel ,
                                          String AV126Webwlismerds_24_tfbarcolnom ,
                                          String AV129Webwlismerds_27_tfbarnomcli_sel ,
                                          String AV128Webwlismerds_26_tfbarnomcli ,
                                          int AV130Webwlismerds_28_tfbarcolnum ,
                                          int AV131Webwlismerds_29_tfbarcolnum_to ,
                                          java.util.Date AV132Webwlismerds_30_tfbarfecsal ,
                                          java.util.Date AV133Webwlismerds_31_tfbarfeccli ,
                                          java.math.BigDecimal AV134Webwlismerds_32_tfbarkgm ,
                                          java.math.BigDecimal AV135Webwlismerds_33_tfbarkgm_to ,
                                          short AV136Webwlismerds_34_tfbarrdto4 ,
                                          short AV137Webwlismerds_35_tfbarrdto4_to ,
                                          java.util.Date A161BarFecSal ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          short A13769BarRdto4 ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV103Webwlismerds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13855BarGots ,
                                          String A13856BarGrs ,
                                          String A13857BarOcs ,
                                          String A13858BarRcs ,
                                          String A13859BarOeko ,
                                          String A13861BarMarca ,
                                          int A13862Bar_MacCod ,
                                          String A13863BarFasCod2 ,
                                          String A13864BarFasDsc2 ,
                                          String AV139Webwlismerds_37_tfbargots_sel ,
                                          String AV138Webwlismerds_36_tfbargots ,
                                          String AV141Webwlismerds_39_tfbargrs_sel ,
                                          String AV140Webwlismerds_38_tfbargrs ,
                                          String AV143Webwlismerds_41_tfbarocs_sel ,
                                          String AV142Webwlismerds_40_tfbarocs ,
                                          String AV145Webwlismerds_43_tfbarrcs_sel ,
                                          String AV144Webwlismerds_42_tfbarrcs ,
                                          String AV147Webwlismerds_45_tfbaroeko_sel ,
                                          String AV146Webwlismerds_44_tfbaroeko ,
                                          String AV148Webwlismerds_46_tfbaraccesorios_sel ,
                                          String A13860BarAccesor ,
                                          String AV150Webwlismerds_48_tfbarmarca_sel ,
                                          String AV149Webwlismerds_47_tfbarmarca ,
                                          int AV151Webwlismerds_49_tfbar_maccod ,
                                          int AV152Webwlismerds_50_tfbar_maccod_to ,
                                          String AV154Webwlismerds_52_tfbarfascod2_sel ,
                                          String AV153Webwlismerds_51_tfbarfascod2 ,
                                          String AV156Webwlismerds_54_tfbarfasdsc2_sel ,
                                          String AV155Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[52];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T8.MacCod) AS Bar_MacCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ?" ;
      scmdbuf += " and T8.MacBarCod = T9.BarCod and T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod =" ;
      scmdbuf += " T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod" ;
      scmdbuf += " AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON" ;
      scmdbuf += " T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod)" ;
      scmdbuf += " WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar" ;
      scmdbuf += " ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV106Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV112Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV113Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV114Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV115Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV116Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV118Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV120Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV121Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV122Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV128Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (0==AV131Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (0==AV136Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (0==AV137Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
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
                  return conditional_P08FJ8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).intValue() , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FJ8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((byte[]) buf[28])[0] = rslt.getByte(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 1);
               ((int[]) buf[30])[0] = rslt.getInt(24);
               ((String[]) buf[31])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 3);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
      }
   }

}

