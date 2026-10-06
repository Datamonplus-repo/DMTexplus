package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwcnsprodexport extends GXProcedure
{
   public webwcnsprodexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwcnsprodexport.class ), "" );
   }

   public webwcnsprodexport( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      webwcnsprodexport.this.aP1 = new String[] {""};
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
      webwcnsprodexport.this.aP0 = aP0;
      webwcnsprodexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebWCnsProdExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV123BarNHdr, GXv_char3) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV96CliNom, GXv_char3) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
      GXt_dtime4 = GXutil.resetTime( AV91BarFecGen );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime4 );
      GXv_exceldoc5[0] = AV10ExcelDocument ;
      GXv_int6[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc5[0] ;
      webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime4 = GXutil.resetTime( AV92BarFecGen_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime4 );
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54BarEncCli, GXv_char3) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV118BarSer, GXv_char3) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV120BarColNom, GXv_char3) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setText( GXt_char2 );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setNumber( AV93BarSit );
      GXv_exceldoc5[0] = AV10ExcelDocument ;
      GXv_int6[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc5[0] ;
      webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setNumber( AV94BarSit_To );
      if ( ! ( (0==AV55TFCliCod) && (0==AV56TFCliCod_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFCliCod );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV58TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFCliNom_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFCliNom)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFCliNom, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarNHdr_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFBarNHdr)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarNHdr, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFBarAgrEst_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFBarAgrEst_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFBarAgrEst)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFBarAgrEst, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV62TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFBarSer_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFBarSer)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFBarSer, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV64TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFBarSerDsc_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFBarSerDsc, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65TFBarFecGen)) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_dtime4 = GXutil.resetTime( AV65TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime4 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67TFBarFecEnt)) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Prev Ent", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_dtime4 = GXutil.resetTime( AV67TFBarFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime4 );
      }
      if ( ! ( (GXutil.strcmp("", AV70TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFBarColNom_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFBarColNom)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFBarColNom, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV71TFBarColNum) && (0==AV72TFBarColNum_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV71TFBarColNum );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV72TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV74TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFBarNomCli_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFBarNomCli)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFBarNomCli, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV75TFBarNumCli) && (0==AV76TFBarNumCli_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Numero ", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV75TFBarNumCli );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV76TFBarNumCli_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV77TFBarKgm)) );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFBarMtr_To)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Metros", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFBarMtr)) );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV80TFBarMtr_To)) );
      }
      if ( ! ( (0==AV81TFBarPie) && (0==AV82TFBarPie_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV81TFBarPie );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV82TFBarPie_To );
      }
      if ( ! ( (0==AV83TFBarSit) && (0==AV84TFBarSit_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "St", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV83TFBarSit );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV84TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV100TFBarFasCod_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Ult fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV100TFBarFasCod_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV99TFBarFasCod)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Ult fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV99TFBarFasCod, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV102TFBarFasSig_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Sig Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFBarFasSig_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV101TFBarFasSig)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Sig Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101TFBarFasSig, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV112TFBarPart) && (0==AV113TFBarPart_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Partida", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV112TFBarPart );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV113TFBarPart_To );
      }
      if ( ! ( (GXutil.strcmp("", AV115TFBarItem3_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "N Enc Cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV115TFBarItem3_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV114TFBarItem3)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "N Enc Cli", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV114TFBarItem3, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV125TFBarRdto4) && (0==AV126TFBarRdto4_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "4 decimales", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV125TFBarRdto4 );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV126TFBarRdto4_To );
      }
      if ( ! ( (GXutil.strcmp("", AV128TFBarGots_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Gots", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV128TFBarGots_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV127TFBarGots)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Gots", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV127TFBarGots, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV130TFBarGrs_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Grs", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV130TFBarGrs_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV129TFBarGrs)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Grs", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV129TFBarGrs, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV132TFBarOcs_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Ocs", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV132TFBarOcs_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV131TFBarOcs)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Ocs", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV131TFBarOcs, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV134TFBarRcs_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Rcs", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV134TFBarRcs_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV133TFBarRcs)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Rcs", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV133TFBarRcs, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV136TFBarOeko_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV136TFBarOeko_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV135TFBarOeko)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Oeko", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV135TFBarOeko, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV137TFBarAccesorios_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Acc?", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         if ( GXutil.strcmp(AV137TFBarAccesorios_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV137TFBarAccesorios_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV139TFBarMarca_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Marca", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV139TFBarMarca_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV138TFBarMarca)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Marca", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV138TFBarMarca, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV140TFBar_MacCod) && (0==AV141TFBar_MacCod_To) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Macro", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV140TFBar_MacCod );
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, false, GXv_int6, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV141TFBar_MacCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV143TFBarFasCod2_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Fase Ult", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV143TFBarFasCod2_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV142TFBarFasCod2)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Fase Ult", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV142TFBarFasCod2, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV145TFBarFasDsc2_Sel)==0) ) )
      {
         GXv_exceldoc5[0] = AV10ExcelDocument ;
         GXv_int6[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc5[0] ;
         webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
         GXt_char2 = "" ;
         GXv_char3[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV145TFBarFasDsc2_Sel, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV144TFBarFasDsc2)==0) ) )
         {
            GXv_exceldoc5[0] = AV10ExcelDocument ;
            GXv_int6[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc5, true, GXv_int6, (short)(AV14FirstColumn), httpContext.getMessage( "Desc Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc5[0] ;
            webwcnsprodexport.this.AV13CellRow = GXv_int6[0] ;
            GXt_char2 = "" ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV144TFBarFasDsc2, GXv_char3) ;
            webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV46VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV34Session.getValue("WebWCnsProdColumnsSelector"), "") != 0 )
      {
         AV41ColumnsSelectorXML = AV34Session.getValue("WebWCnsProdColumnsSelector") ;
         AV38ColumnsSelector.fromxml(AV41ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV153GXV1 = 1 ;
      while ( AV153GXV1 <= AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV40ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV153GXV1));
         if ( AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV40ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setColor( 11 );
            AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
         }
         AV153GXV1 = (int)(AV153GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV155Webwcnsprodds_1_barnhdr = AV123BarNHdr ;
      AV156Webwcnsprodds_2_clinom = AV96CliNom ;
      AV157Webwcnsprodds_3_barfecgen = AV91BarFecGen ;
      AV158Webwcnsprodds_4_barfecgen_to = AV92BarFecGen_To ;
      AV159Webwcnsprodds_5_barenccli = AV54BarEncCli ;
      AV160Webwcnsprodds_6_barser = AV118BarSer ;
      AV161Webwcnsprodds_7_barcolnom = AV120BarColNom ;
      AV162Webwcnsprodds_8_barsit = AV93BarSit ;
      AV163Webwcnsprodds_9_barsit_to = AV94BarSit_To ;
      AV164Webwcnsprodds_10_tfclicod = AV55TFCliCod ;
      AV165Webwcnsprodds_11_tfclicod_to = AV56TFCliCod_To ;
      AV166Webwcnsprodds_12_tfclinom = AV57TFCliNom ;
      AV167Webwcnsprodds_13_tfclinom_sel = AV58TFCliNom_Sel ;
      AV168Webwcnsprodds_14_tfbarnhdr = AV49TFBarNHdr ;
      AV169Webwcnsprodds_15_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV170Webwcnsprodds_16_tfbaragrest = AV59TFBarAgrEst ;
      AV171Webwcnsprodds_17_tfbaragrest_sel = AV60TFBarAgrEst_Sel ;
      AV172Webwcnsprodds_18_tfbarser = AV61TFBarSer ;
      AV173Webwcnsprodds_19_tfbarser_sel = AV62TFBarSer_Sel ;
      AV174Webwcnsprodds_20_tfbarserdsc = AV63TFBarSerDsc ;
      AV175Webwcnsprodds_21_tfbarserdsc_sel = AV64TFBarSerDsc_Sel ;
      AV176Webwcnsprodds_22_tfbarfecgen = AV65TFBarFecGen ;
      AV177Webwcnsprodds_23_tfbarfecent = AV67TFBarFecEnt ;
      AV178Webwcnsprodds_24_tfbarcolnom = AV69TFBarColNom ;
      AV179Webwcnsprodds_25_tfbarcolnom_sel = AV70TFBarColNom_Sel ;
      AV180Webwcnsprodds_26_tfbarcolnum = AV71TFBarColNum ;
      AV181Webwcnsprodds_27_tfbarcolnum_to = AV72TFBarColNum_To ;
      AV182Webwcnsprodds_28_tfbarnomcli = AV73TFBarNomCli ;
      AV183Webwcnsprodds_29_tfbarnomcli_sel = AV74TFBarNomCli_Sel ;
      AV184Webwcnsprodds_30_tfbarnumcli = AV75TFBarNumCli ;
      AV185Webwcnsprodds_31_tfbarnumcli_to = AV76TFBarNumCli_To ;
      AV186Webwcnsprodds_32_tfbarkgm = AV77TFBarKgm ;
      AV187Webwcnsprodds_33_tfbarkgm_to = AV78TFBarKgm_To ;
      AV188Webwcnsprodds_34_tfbarmtr = AV79TFBarMtr ;
      AV189Webwcnsprodds_35_tfbarmtr_to = AV80TFBarMtr_To ;
      AV190Webwcnsprodds_36_tfbarpie = AV81TFBarPie ;
      AV191Webwcnsprodds_37_tfbarpie_to = AV82TFBarPie_To ;
      AV192Webwcnsprodds_38_tfbarsit = AV83TFBarSit ;
      AV193Webwcnsprodds_39_tfbarsit_to = AV84TFBarSit_To ;
      AV194Webwcnsprodds_40_tfbarfascod = AV99TFBarFasCod ;
      AV195Webwcnsprodds_41_tfbarfascod_sel = AV100TFBarFasCod_Sel ;
      AV196Webwcnsprodds_42_tfbarfassig = AV101TFBarFasSig ;
      AV197Webwcnsprodds_43_tfbarfassig_sel = AV102TFBarFasSig_Sel ;
      AV198Webwcnsprodds_44_tfbarpart = AV112TFBarPart ;
      AV199Webwcnsprodds_45_tfbarpart_to = AV113TFBarPart_To ;
      AV200Webwcnsprodds_46_tfbaritem3 = AV114TFBarItem3 ;
      AV201Webwcnsprodds_47_tfbaritem3_sel = AV115TFBarItem3_Sel ;
      AV202Webwcnsprodds_48_tfbarrdto4 = AV125TFBarRdto4 ;
      AV203Webwcnsprodds_49_tfbarrdto4_to = AV126TFBarRdto4_To ;
      AV204Webwcnsprodds_50_tfbargots = AV127TFBarGots ;
      AV205Webwcnsprodds_51_tfbargots_sel = AV128TFBarGots_Sel ;
      AV206Webwcnsprodds_52_tfbargrs = AV129TFBarGrs ;
      AV207Webwcnsprodds_53_tfbargrs_sel = AV130TFBarGrs_Sel ;
      AV208Webwcnsprodds_54_tfbarocs = AV131TFBarOcs ;
      AV209Webwcnsprodds_55_tfbarocs_sel = AV132TFBarOcs_Sel ;
      AV210Webwcnsprodds_56_tfbarrcs = AV133TFBarRcs ;
      AV211Webwcnsprodds_57_tfbarrcs_sel = AV134TFBarRcs_Sel ;
      AV212Webwcnsprodds_58_tfbaroeko = AV135TFBarOeko ;
      AV213Webwcnsprodds_59_tfbaroeko_sel = AV136TFBarOeko_Sel ;
      AV214Webwcnsprodds_60_tfbaraccesorios_sel = AV137TFBarAccesorios_Sel ;
      AV215Webwcnsprodds_61_tfbarmarca = AV138TFBarMarca ;
      AV216Webwcnsprodds_62_tfbarmarca_sel = AV139TFBarMarca_Sel ;
      AV217Webwcnsprodds_63_tfbar_maccod = AV140TFBar_MacCod ;
      AV218Webwcnsprodds_64_tfbar_maccod_to = AV141TFBar_MacCod_To ;
      AV219Webwcnsprodds_65_tfbarfascod2 = AV142TFBarFasCod2 ;
      AV220Webwcnsprodds_66_tfbarfascod2_sel = AV143TFBarFasCod2_Sel ;
      AV221Webwcnsprodds_67_tfbarfasdsc2 = AV144TFBarFasDsc2 ;
      AV222Webwcnsprodds_68_tfbarfasdsc2_sel = AV145TFBarFasDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV155Webwcnsprodds_1_barnhdr ,
                                           AV156Webwcnsprodds_2_clinom ,
                                           AV157Webwcnsprodds_3_barfecgen ,
                                           AV158Webwcnsprodds_4_barfecgen_to ,
                                           AV159Webwcnsprodds_5_barenccli ,
                                           AV160Webwcnsprodds_6_barser ,
                                           AV161Webwcnsprodds_7_barcolnom ,
                                           Byte.valueOf(AV162Webwcnsprodds_8_barsit) ,
                                           Byte.valueOf(AV163Webwcnsprodds_9_barsit_to) ,
                                           Integer.valueOf(AV164Webwcnsprodds_10_tfclicod) ,
                                           Integer.valueOf(AV165Webwcnsprodds_11_tfclicod_to) ,
                                           AV167Webwcnsprodds_13_tfclinom_sel ,
                                           AV166Webwcnsprodds_12_tfclinom ,
                                           AV169Webwcnsprodds_15_tfbarnhdr_sel ,
                                           AV168Webwcnsprodds_14_tfbarnhdr ,
                                           AV171Webwcnsprodds_17_tfbaragrest_sel ,
                                           AV170Webwcnsprodds_16_tfbaragrest ,
                                           AV173Webwcnsprodds_19_tfbarser_sel ,
                                           AV172Webwcnsprodds_18_tfbarser ,
                                           AV175Webwcnsprodds_21_tfbarserdsc_sel ,
                                           AV174Webwcnsprodds_20_tfbarserdsc ,
                                           AV176Webwcnsprodds_22_tfbarfecgen ,
                                           AV177Webwcnsprodds_23_tfbarfecent ,
                                           AV179Webwcnsprodds_25_tfbarcolnom_sel ,
                                           AV178Webwcnsprodds_24_tfbarcolnom ,
                                           Integer.valueOf(AV180Webwcnsprodds_26_tfbarcolnum) ,
                                           Integer.valueOf(AV181Webwcnsprodds_27_tfbarcolnum_to) ,
                                           AV183Webwcnsprodds_29_tfbarnomcli_sel ,
                                           AV182Webwcnsprodds_28_tfbarnomcli ,
                                           Integer.valueOf(AV184Webwcnsprodds_30_tfbarnumcli) ,
                                           Integer.valueOf(AV185Webwcnsprodds_31_tfbarnumcli_to) ,
                                           AV186Webwcnsprodds_32_tfbarkgm ,
                                           AV187Webwcnsprodds_33_tfbarkgm_to ,
                                           AV188Webwcnsprodds_34_tfbarmtr ,
                                           AV189Webwcnsprodds_35_tfbarmtr_to ,
                                           Byte.valueOf(AV192Webwcnsprodds_38_tfbarsit) ,
                                           Byte.valueOf(AV193Webwcnsprodds_39_tfbarsit_to) ,
                                           Short.valueOf(AV198Webwcnsprodds_44_tfbarpart) ,
                                           Short.valueOf(AV199Webwcnsprodds_45_tfbarpart_to) ,
                                           AV201Webwcnsprodds_47_tfbaritem3_sel ,
                                           AV200Webwcnsprodds_46_tfbaritem3 ,
                                           Short.valueOf(AV202Webwcnsprodds_48_tfbarrdto4) ,
                                           Short.valueOf(AV203Webwcnsprodds_49_tfbarrdto4_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A120BarAgrEst ,
                                           A1652BarSerDsc ,
                                           A157BarFecEnt ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A1503BarPart) ,
                                           A9777BarItem3 ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV52OrderedBy) ,
                                           Boolean.valueOf(AV53OrderedDsc) ,
                                           Integer.valueOf(AV190Webwcnsprodds_36_tfbarpie) ,
                                           Integer.valueOf(A198BarPie) ,
                                           Integer.valueOf(AV191Webwcnsprodds_37_tfbarpie_to) ,
                                           AV195Webwcnsprodds_41_tfbarfascod_sel ,
                                           AV194Webwcnsprodds_40_tfbarfascod ,
                                           A151BarFasCod ,
                                           AV197Webwcnsprodds_43_tfbarfassig_sel ,
                                           AV196Webwcnsprodds_42_tfbarfassig ,
                                           A1955BarFasSig ,
                                           AV205Webwcnsprodds_51_tfbargots_sel ,
                                           AV204Webwcnsprodds_50_tfbargots ,
                                           A13855BarGots ,
                                           AV207Webwcnsprodds_53_tfbargrs_sel ,
                                           AV206Webwcnsprodds_52_tfbargrs ,
                                           A13856BarGrs ,
                                           AV209Webwcnsprodds_55_tfbarocs_sel ,
                                           AV208Webwcnsprodds_54_tfbarocs ,
                                           A13857BarOcs ,
                                           AV211Webwcnsprodds_57_tfbarrcs_sel ,
                                           AV210Webwcnsprodds_56_tfbarrcs ,
                                           A13858BarRcs ,
                                           AV213Webwcnsprodds_59_tfbaroeko_sel ,
                                           AV212Webwcnsprodds_58_tfbaroeko ,
                                           A13859BarOeko ,
                                           AV214Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV216Webwcnsprodds_62_tfbarmarca_sel ,
                                           AV215Webwcnsprodds_61_tfbarmarca ,
                                           A13861BarMarca ,
                                           Integer.valueOf(AV217Webwcnsprodds_63_tfbar_maccod) ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           Integer.valueOf(AV218Webwcnsprodds_64_tfbar_maccod_to) ,
                                           AV220Webwcnsprodds_66_tfbarfascod2_sel ,
                                           AV219Webwcnsprodds_65_tfbarfascod2 ,
                                           A13863BarFasCod2 ,
                                           AV222Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           AV221Webwcnsprodds_67_tfbarfasdsc2 ,
                                           A13864BarFasDsc2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV194Webwcnsprodds_40_tfbarfascod = GXutil.padr( GXutil.rtrim( AV194Webwcnsprodds_40_tfbarfascod), 8, "%") ;
      lV196Webwcnsprodds_42_tfbarfassig = GXutil.padr( GXutil.rtrim( AV196Webwcnsprodds_42_tfbarfassig), 8, "%") ;
      lV215Webwcnsprodds_61_tfbarmarca = GXutil.padr( GXutil.rtrim( AV215Webwcnsprodds_61_tfbarmarca), 30, "%") ;
      lV219Webwcnsprodds_65_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV219Webwcnsprodds_65_tfbarfascod2), 8, "%") ;
      lV155Webwcnsprodds_1_barnhdr = GXutil.padr( GXutil.rtrim( AV155Webwcnsprodds_1_barnhdr), 11, "%") ;
      lV156Webwcnsprodds_2_clinom = GXutil.padr( GXutil.rtrim( AV156Webwcnsprodds_2_clinom), 30, "%") ;
      lV159Webwcnsprodds_5_barenccli = GXutil.padr( GXutil.rtrim( AV159Webwcnsprodds_5_barenccli), 20, "%") ;
      lV160Webwcnsprodds_6_barser = GXutil.padr( GXutil.rtrim( AV160Webwcnsprodds_6_barser), 16, "%") ;
      lV161Webwcnsprodds_7_barcolnom = GXutil.padr( GXutil.rtrim( AV161Webwcnsprodds_7_barcolnom), 13, "%") ;
      lV166Webwcnsprodds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV166Webwcnsprodds_12_tfclinom), 30, "%") ;
      lV168Webwcnsprodds_14_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV168Webwcnsprodds_14_tfbarnhdr), 11, "%") ;
      lV170Webwcnsprodds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV170Webwcnsprodds_16_tfbaragrest), 1, "%") ;
      lV172Webwcnsprodds_18_tfbarser = GXutil.padr( GXutil.rtrim( AV172Webwcnsprodds_18_tfbarser), 16, "%") ;
      lV174Webwcnsprodds_20_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV174Webwcnsprodds_20_tfbarserdsc), 26, "%") ;
      lV178Webwcnsprodds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV178Webwcnsprodds_24_tfbarcolnom), 13, "%") ;
      lV182Webwcnsprodds_28_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV182Webwcnsprodds_28_tfbarnomcli), 13, "%") ;
      lV200Webwcnsprodds_46_tfbaritem3 = GXutil.padr( GXutil.rtrim( AV200Webwcnsprodds_46_tfbaritem3), 20, "%") ;
      /* Using cursor P08CS14 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV195Webwcnsprodds_41_tfbarfascod_sel, AV194Webwcnsprodds_40_tfbarfascod, lV194Webwcnsprodds_40_tfbarfascod, AV195Webwcnsprodds_41_tfbarfascod_sel, AV195Webwcnsprodds_41_tfbarfascod_sel, AV197Webwcnsprodds_43_tfbarfassig_sel, AV196Webwcnsprodds_42_tfbarfassig, lV196Webwcnsprodds_42_tfbarfassig, AV197Webwcnsprodds_43_tfbarfassig_sel, AV197Webwcnsprodds_43_tfbarfassig_sel, AV214Webwcnsprodds_60_tfbaraccesorios_sel, AV214Webwcnsprodds_60_tfbaraccesorios_sel, AV216Webwcnsprodds_62_tfbarmarca_sel, AV215Webwcnsprodds_61_tfbarmarca, lV215Webwcnsprodds_61_tfbarmarca, AV216Webwcnsprodds_62_tfbarmarca_sel, AV216Webwcnsprodds_62_tfbarmarca_sel, Integer.valueOf(AV217Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV217Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV218Webwcnsprodds_64_tfbar_maccod_to), Integer.valueOf(AV218Webwcnsprodds_64_tfbar_maccod_to), AV220Webwcnsprodds_66_tfbarfascod2_sel, AV219Webwcnsprodds_65_tfbarfascod2, lV219Webwcnsprodds_65_tfbarfascod2, AV220Webwcnsprodds_66_tfbarfascod2_sel, AV220Webwcnsprodds_66_tfbarfascod2_sel, lV155Webwcnsprodds_1_barnhdr, lV156Webwcnsprodds_2_clinom, AV157Webwcnsprodds_3_barfecgen, AV158Webwcnsprodds_4_barfecgen_to, lV159Webwcnsprodds_5_barenccli, lV160Webwcnsprodds_6_barser, lV161Webwcnsprodds_7_barcolnom, Byte.valueOf(AV162Webwcnsprodds_8_barsit), Byte.valueOf(AV163Webwcnsprodds_9_barsit_to), Integer.valueOf(AV164Webwcnsprodds_10_tfclicod), Integer.valueOf(AV165Webwcnsprodds_11_tfclicod_to), lV166Webwcnsprodds_12_tfclinom, AV167Webwcnsprodds_13_tfclinom_sel, lV168Webwcnsprodds_14_tfbarnhdr, AV169Webwcnsprodds_15_tfbarnhdr_sel, lV170Webwcnsprodds_16_tfbaragrest, AV171Webwcnsprodds_17_tfbaragrest_sel, lV172Webwcnsprodds_18_tfbarser, AV173Webwcnsprodds_19_tfbarser_sel, lV174Webwcnsprodds_20_tfbarserdsc, AV175Webwcnsprodds_21_tfbarserdsc_sel, AV176Webwcnsprodds_22_tfbarfecgen, AV177Webwcnsprodds_23_tfbarfecent, lV178Webwcnsprodds_24_tfbarcolnom, AV179Webwcnsprodds_25_tfbarcolnom_sel, Integer.valueOf(AV180Webwcnsprodds_26_tfbarcolnum), Integer.valueOf(AV181Webwcnsprodds_27_tfbarcolnum_to), lV182Webwcnsprodds_28_tfbarnomcli, AV183Webwcnsprodds_29_tfbarnomcli_sel, Integer.valueOf(AV184Webwcnsprodds_30_tfbarnumcli), Integer.valueOf(AV185Webwcnsprodds_31_tfbarnumcli_to), AV186Webwcnsprodds_32_tfbarkgm, AV187Webwcnsprodds_33_tfbarkgm_to, AV188Webwcnsprodds_34_tfbarmtr, AV189Webwcnsprodds_35_tfbarmtr_to, Byte.valueOf(AV192Webwcnsprodds_38_tfbarsit), Byte.valueOf(AV193Webwcnsprodds_39_tfbarsit_to), Short.valueOf(AV198Webwcnsprodds_44_tfbarpart), Short.valueOf(AV199Webwcnsprodds_45_tfbarpart_to), lV200Webwcnsprodds_46_tfbaritem3, AV201Webwcnsprodds_47_tfbaritem3_sel, Short.valueOf(AV202Webwcnsprodds_48_tfbarrdto4), Short.valueOf(AV203Webwcnsprodds_49_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13769BarRdto4 = P08CS14_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08CS14_n13769BarRdto4[0] ;
         A9777BarItem3 = P08CS14_A9777BarItem3[0] ;
         A1503BarPart = P08CS14_A1503BarPart[0] ;
         A1235BarNumCli = P08CS14_A1235BarNumCli[0] ;
         A1234BarNomCli = P08CS14_A1234BarNomCli[0] ;
         A136BarColNum = P08CS14_A136BarColNum[0] ;
         A157BarFecEnt = P08CS14_A157BarFecEnt[0] ;
         A1652BarSerDsc = P08CS14_A1652BarSerDsc[0] ;
         A120BarAgrEst = P08CS14_A120BarAgrEst[0] ;
         A252CliCod = P08CS14_A252CliCod[0] ;
         n252CliCod = P08CS14_n252CliCod[0] ;
         A213BarSit = P08CS14_A213BarSit[0] ;
         A135BarColNom = P08CS14_A135BarColNom[0] ;
         A212BarSer = P08CS14_A212BarSer[0] ;
         A4812BarEncCli = P08CS14_A4812BarEncCli[0] ;
         A159BarFecGen = P08CS14_A159BarFecGen[0] ;
         A279CliNom = P08CS14_A279CliNom[0] ;
         A3746BarNPed = P08CS14_A3746BarNPed[0] ;
         A143BarDisNum = P08CS14_A143BarDisNum[0] ;
         A11852Nxt_ArtCl2 = P08CS14_A11852Nxt_ArtCl2[0] ;
         A4466BarAcaAnh = P08CS14_A4466BarAcaAnh[0] ;
         A13862Bar_MacCod = P08CS14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08CS14_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08CS14_A13861BarMarca[0] ;
         n13861BarMarca = P08CS14_n13861BarMarca[0] ;
         A13860BarAccesor = P08CS14_A13860BarAccesor[0] ;
         n13860BarAccesor = P08CS14_n13860BarAccesor[0] ;
         A1955BarFasSig = P08CS14_A1955BarFasSig[0] ;
         n1955BarFasSig = P08CS14_n1955BarFasSig[0] ;
         A151BarFasCod = P08CS14_A151BarFasCod[0] ;
         n151BarFasCod = P08CS14_n151BarFasCod[0] ;
         A184BarMtr = P08CS14_A184BarMtr[0] ;
         A166BarKgm = P08CS14_A166BarKgm[0] ;
         A130BarCodPar = P08CS14_A130BarCodPar[0] ;
         A132BarCodReo = P08CS14_A132BarCodReo[0] ;
         A129BarCod = P08CS14_A129BarCod[0] ;
         A199BarPie1 = P08CS14_A199BarPie1[0] ;
         A365DisDes = P08CS14_A365DisDes[0] ;
         A898BarPieNDes = P08CS14_A898BarPieNDes[0] ;
         A361DisCod = P08CS14_A361DisCod[0] ;
         A13863BarFasCod2 = P08CS14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08CS14_n13863BarFasCod2[0] ;
         A396EmprCod = P08CS14_A396EmprCod[0] ;
         A13862Bar_MacCod = P08CS14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08CS14_n13862Bar_MacCod[0] ;
         A279CliNom = P08CS14_A279CliNom[0] ;
         A13863BarFasCod2 = P08CS14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08CS14_n13863BarFasCod2[0] ;
         A13861BarMarca = P08CS14_A13861BarMarca[0] ;
         n13861BarMarca = P08CS14_n13861BarMarca[0] ;
         A13860BarAccesor = P08CS14_A13860BarAccesor[0] ;
         n13860BarAccesor = P08CS14_n13860BarAccesor[0] ;
         A1955BarFasSig = P08CS14_A1955BarFasSig[0] ;
         n1955BarFasSig = P08CS14_n1955BarFasSig[0] ;
         A151BarFasCod = P08CS14_A151BarFasCod[0] ;
         n151BarFasCod = P08CS14_n151BarFasCod[0] ;
         A184BarMtr = P08CS14_A184BarMtr[0] ;
         A166BarKgm = P08CS14_A166BarKgm[0] ;
         A199BarPie1 = P08CS14_A199BarPie1[0] ;
         A898BarPieNDes = P08CS14_A898BarPieNDes[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV205Webwcnsprodds_51_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV204Webwcnsprodds_50_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV204Webwcnsprodds_50_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV205Webwcnsprodds_51_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV205Webwcnsprodds_51_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV207Webwcnsprodds_53_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV206Webwcnsprodds_52_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV206Webwcnsprodds_52_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV207Webwcnsprodds_53_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV207Webwcnsprodds_53_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV209Webwcnsprodds_55_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV208Webwcnsprodds_54_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV208Webwcnsprodds_54_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV209Webwcnsprodds_55_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV209Webwcnsprodds_55_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV211Webwcnsprodds_57_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV210Webwcnsprodds_56_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV210Webwcnsprodds_56_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV211Webwcnsprodds_57_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV211Webwcnsprodds_57_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV213Webwcnsprodds_59_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV212Webwcnsprodds_58_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV212Webwcnsprodds_58_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV213Webwcnsprodds_59_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV213Webwcnsprodds_59_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( ! ( (GXutil.strcmp("", AV222Webwcnsprodds_68_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV221Webwcnsprodds_67_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV221Webwcnsprodds_67_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                       {
                                          if ( (GXutil.strcmp("", AV222Webwcnsprodds_68_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV222Webwcnsprodds_68_tfbarfasdsc2_sel) == 0 ) ) )
                                          {
                                             if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                             {
                                                A198BarPie = A898BarPieNDes ;
                                             }
                                             else
                                             {
                                                A198BarPie = A199BarPie1 ;
                                             }
                                             if ( (0==AV190Webwcnsprodds_36_tfbarpie) || ( ( A198BarPie >= AV190Webwcnsprodds_36_tfbarpie ) ) )
                                             {
                                                if ( (0==AV191Webwcnsprodds_37_tfbarpie_to) || ( ( A198BarPie <= AV191Webwcnsprodds_37_tfbarpie_to ) ) )
                                                {
                                                   A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
                                                      pr_default.close(0);
                                                      pr_default.close(0);
                                                      returnInSub = true;
                                                      if (true) return;
                                                   }
                                                   AV46VisibleColumnCount = 0 ;
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV111BarMacCod = GXutil.lval( A3746BarNPed) ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( AV111BarMacCod );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXv_int7[0] = AV146MacCod ;
                                                      new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
                                                      webwcnsprodexport.this.AV146MacCod = GXv_int7[0] ;
                                                      AV107Accesorios = ((AV146MacCod>0) ? "S" : "N") ;
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV107Accesorios, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A120BarAgrEst, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV121BarEncCliGrid = ((GXutil.strcmp("", A143BarDisNum)==0) ? A4812BarEncCli : A143BarDisNum) ;
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV121BarEncCliGrid, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_dtime4 = GXutil.resetTime( A159BarFecGen );
                                                      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_dtime4 = GXutil.resetTime( A157BarFecEnt );
                                                      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV108ObsEnc = "" ;
                                                      /* Using cursor P08CS15 */
                                                      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                                                      while ( (pr_default.getStatus(1) != 101) )
                                                      {
                                                         A377DisObsTxt = P08CS15_A377DisObsTxt[0] ;
                                                         A376DisObsLin = P08CS15_A376DisObsLin[0] ;
                                                         if ( GXutil.strcmp(AV108ObsEnc, " ") == 0 )
                                                         {
                                                            AV108ObsEnc = GXutil.trim( A377DisObsTxt) ;
                                                         }
                                                         else
                                                         {
                                                            AV108ObsEnc += " " + GXutil.trim( A377DisObsTxt) ;
                                                         }
                                                         pr_default.readNext(1);
                                                      }
                                                      pr_default.close(1);
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV108ObsEnc, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A1235BarNumCli );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A198BarPie );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = AV103FasDscUlt ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV103FasDscUlt = GXt_char2 ;
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103FasDscUlt, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1955BarFasSig, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = AV104FasDscSig ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV104FasDscSig = GXt_char2 ;
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV104FasDscSig, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      /* Using cursor P08CS16 */
                                                      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                      while ( (pr_default.getStatus(2) != 101) )
                                                      {
                                                         A34AlbProfch = P08CS16_A34AlbProfch[0] ;
                                                         A1261BarAlbKgmE = P08CS16_A1261BarAlbKgmE[0] ;
                                                         A1263BarAlbMtrE = P08CS16_A1263BarAlbMtrE[0] ;
                                                         A1265BarAlbPie = P08CS16_A1265BarAlbPie[0] ;
                                                         A30AlbProCod = P08CS16_A30AlbProCod[0] ;
                                                         A34AlbProfch = P08CS16_A34AlbProfch[0] ;
                                                         AV105AlbProcod = A30AlbProCod ;
                                                         AV106AlbProFec = A34AlbProfch ;
                                                         AV147BarAlbKgme = AV147BarAlbKgme.add(A1261BarAlbKgmE) ;
                                                         AV148BarAlbmtre = AV148BarAlbmtre.add(A1263BarAlbMtrE) ;
                                                         AV149Baralbpie = (int)(AV149Baralbpie+A1265BarAlbPie) ;
                                                         pr_default.readNext(2);
                                                      }
                                                      pr_default.close(2);
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( AV105AlbProcod );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      /* Using cursor P08CS17 */
                                                      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                      while ( (pr_default.getStatus(3) != 101) )
                                                      {
                                                         A1261BarAlbKgmE = P08CS17_A1261BarAlbKgmE[0] ;
                                                         A34AlbProfch = P08CS17_A34AlbProfch[0] ;
                                                         A30AlbProCod = P08CS17_A30AlbProCod[0] ;
                                                         A34AlbProfch = P08CS17_A34AlbProfch[0] ;
                                                         AV106AlbProFec = A34AlbProfch ;
                                                         pr_default.readNext(3);
                                                      }
                                                      pr_default.close(3);
                                                      GXt_dtime4 = GXutil.resetTime( AV106AlbProFec );
                                                      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setDate( GXt_dtime4 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV109Exportacion = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
                                                      GXt_char2 = "" ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV109Exportacion, GXv_char3) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char3[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXv_char3[0] = A396EmprCod ;
                                                      GXv_int7[0] = A252CliCod ;
                                                      GXv_int6[0] = A4466BarAcaAnh ;
                                                      GXv_char8[0] = AV150Tb1_dscfb ;
                                                      new app.pptable2(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int6, GXv_char8) ;
                                                      webwcnsprodexport.this.A396EmprCod = GXv_char3[0] ;
                                                      webwcnsprodexport.this.A252CliCod = GXv_int7[0] ;
                                                      webwcnsprodexport.this.A4466BarAcaAnh = GXv_int6[0] ;
                                                      webwcnsprodexport.this.AV150Tb1_dscfb = GXv_char8[0] ;
                                                      AV110Marca = GXutil.substring( AV150Tb1_dscfb, 1, 20) ;
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV110Marca, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A1503BarPart );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A9777BarItem3, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A13769BarRdto4 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13855BarGots, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13856BarGrs, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13857BarOcs, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13858BarRcs, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13859BarOeko, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13860BarAccesor, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+41)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13861BarMarca, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+42)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setNumber( A13862Bar_MacCod );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+43)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13863BarFasCod2, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV38ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+44)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = "" ;
                                                      GXv_char8[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13864BarFasDsc2, GXv_char8) ;
                                                      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
                                                      AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV46VisibleColumnCount), 1, 1).setText( GXt_char2 );
                                                      AV46VisibleColumnCount = (long)(AV46VisibleColumnCount+1) ;
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
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre Cliente", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarMacCod", "", "Nº Lote", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Accesorios", "", "Acc?", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAgrEst", "", "S=Bar.Agrupada N=No Agrupada", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarEncCliGrid", "", "Disp Cliente", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Serie", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecEnt", "", "Fecha Prev Ent", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&ObsEnc", "", "Obs", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Nombre Color", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero del Color", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNumCli", "", "Numero ", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarKgm", "", "Kilos", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMtr", "", "Metros", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPie", "", "Piezas", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "St", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasCod", "", "Ult fase", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&FasDscUlt", "", "Descripcion ", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasSig", "", "Sig Fase", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&FasDscSig", "", "Descripcion ", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&AlbProcod", "", "Nº Doc", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&AlbProFec", "", "Fecha", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarAlbKgmE", "", "Kilos Sal", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarAlbMtrE", "", "Metros Sal", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarAlbPie", "", "Piezas Sal", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Exportacion", "", "Exportacion", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Marca", "", "Marca", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPart", "", "Nº Partida", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarItem3", "", "N Enc Cli", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarRdto4", "", "4 decimales", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarGots", "", "Gots", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarGrs", "", "Grs", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarOcs", "", "Ocs", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarRcs", "", "Rcs", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarOeko", "", "Oeko", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAccesorios", "", "Acc?", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMarca", "", "Marca", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Bar_MacCod", "", "Macro", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV38ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV38ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char2 = AV42UserCustomValue ;
      GXv_char8[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWCnsProdColumnsSelector", GXv_char8) ;
      webwcnsprodexport.this.GXt_char2 = GXv_char8[0] ;
      AV42UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV42UserCustomValue)==0) ) )
      {
         AV39ColumnsSelectorAux.fromxml(AV42UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV38ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV39ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV38ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV34Session.getValue("WebWCnsProdGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWCnsProdGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV34Session.getValue("WebWCnsProdGridState"), null, null);
      }
      AV52OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV53OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV226GXV2 = 1 ;
      while ( AV226GXV2 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV226GXV2));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARNHDR") == 0 )
         {
            AV123BarNHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV96CliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV91BarFecGen = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV92BarFecGen_To = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARENCCLI") == 0 )
         {
            AV54BarEncCli = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV118BarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV120BarColNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSIT") == 0 )
         {
            AV93BarSit = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94BarSit_To = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV55TFCliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFCliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV57TFCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV58TFCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV49TFBarNHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV50TFBarNHdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV59TFBarAgrEst = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV60TFBarAgrEst_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV61TFBarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV62TFBarSer_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV63TFBarSerDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV64TFBarSerDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV65TFBarFecGen = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECENT") == 0 )
         {
            AV67TFBarFecEnt = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV69TFBarColNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV70TFBarColNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV71TFBarColNum = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFBarColNum_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV73TFBarNomCli = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV74TFBarNomCli_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV75TFBarNumCli = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFBarNumCli_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV77TFBarKgm = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV78TFBarKgm_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV79TFBarMtr = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV80TFBarMtr_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV81TFBarPie = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFBarPie_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV83TFBarSit = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFBarSit_To = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV99TFBarFasCod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV100TFBarFasCod_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV101TFBarFasSig = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV102TFBarFasSig_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV112TFBarPart = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV113TFBarPart_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3") == 0 )
         {
            AV114TFBarItem3 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3_SEL") == 0 )
         {
            AV115TFBarItem3_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV125TFBarRdto4 = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV126TFBarRdto4_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV127TFBarGots = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV128TFBarGots_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV129TFBarGrs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV130TFBarGrs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV131TFBarOcs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV132TFBarOcs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV133TFBarRcs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV134TFBarRcs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV135TFBarOeko = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV136TFBarOeko_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV137TFBarAccesorios_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV138TFBarMarca = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV139TFBarMarca_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV140TFBar_MacCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV141TFBar_MacCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV142TFBarFasCod2 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV143TFBarFasCod2_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV144TFBarFasDsc2 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV145TFBarFasDsc2_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV226GXV2 = (int)(AV226GXV2+1) ;
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
      this.aP0[0] = webwcnsprodexport.this.AV11Filename;
      this.aP1[0] = webwcnsprodexport.this.AV12ErrorMessage;
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
      AV123BarNHdr = "" ;
      AV96CliNom = "" ;
      AV91BarFecGen = GXutil.nullDate() ;
      AV92BarFecGen_To = GXutil.nullDate() ;
      AV54BarEncCli = "" ;
      AV118BarSer = "" ;
      AV120BarColNom = "" ;
      AV58TFCliNom_Sel = "" ;
      AV57TFCliNom = "" ;
      AV50TFBarNHdr_Sel = "" ;
      AV49TFBarNHdr = "" ;
      AV60TFBarAgrEst_Sel = "" ;
      AV59TFBarAgrEst = "" ;
      AV62TFBarSer_Sel = "" ;
      AV61TFBarSer = "" ;
      AV64TFBarSerDsc_Sel = "" ;
      AV63TFBarSerDsc = "" ;
      AV65TFBarFecGen = GXutil.nullDate() ;
      AV67TFBarFecEnt = GXutil.nullDate() ;
      AV70TFBarColNom_Sel = "" ;
      AV69TFBarColNom = "" ;
      AV74TFBarNomCli_Sel = "" ;
      AV73TFBarNomCli = "" ;
      AV77TFBarKgm = DecimalUtil.ZERO ;
      AV78TFBarKgm_To = DecimalUtil.ZERO ;
      AV79TFBarMtr = DecimalUtil.ZERO ;
      AV80TFBarMtr_To = DecimalUtil.ZERO ;
      AV100TFBarFasCod_Sel = "" ;
      AV99TFBarFasCod = "" ;
      AV102TFBarFasSig_Sel = "" ;
      AV101TFBarFasSig = "" ;
      AV115TFBarItem3_Sel = "" ;
      AV114TFBarItem3 = "" ;
      AV128TFBarGots_Sel = "" ;
      AV127TFBarGots = "" ;
      AV130TFBarGrs_Sel = "" ;
      AV129TFBarGrs = "" ;
      AV132TFBarOcs_Sel = "" ;
      AV131TFBarOcs = "" ;
      AV134TFBarRcs_Sel = "" ;
      AV133TFBarRcs = "" ;
      AV136TFBarOeko_Sel = "" ;
      AV135TFBarOeko = "" ;
      AV137TFBarAccesorios_Sel = "" ;
      AV139TFBarMarca_Sel = "" ;
      AV138TFBarMarca = "" ;
      AV143TFBarFasCod2_Sel = "" ;
      AV142TFBarFasCod2 = "" ;
      AV145TFBarFasDsc2_Sel = "" ;
      AV144TFBarFasDsc2 = "" ;
      GXv_exceldoc5 = new com.genexus.gxoffice.ExcelDoc[1] ;
      AV34Session = httpContext.getWebSession();
      AV41ColumnsSelectorXML = "" ;
      AV38ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV40ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      A3746BarNPed = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A9777BarItem3 = "" ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV155Webwcnsprodds_1_barnhdr = "" ;
      AV156Webwcnsprodds_2_clinom = "" ;
      AV157Webwcnsprodds_3_barfecgen = GXutil.nullDate() ;
      AV158Webwcnsprodds_4_barfecgen_to = GXutil.nullDate() ;
      AV159Webwcnsprodds_5_barenccli = "" ;
      AV160Webwcnsprodds_6_barser = "" ;
      AV161Webwcnsprodds_7_barcolnom = "" ;
      AV166Webwcnsprodds_12_tfclinom = "" ;
      AV167Webwcnsprodds_13_tfclinom_sel = "" ;
      AV168Webwcnsprodds_14_tfbarnhdr = "" ;
      AV169Webwcnsprodds_15_tfbarnhdr_sel = "" ;
      AV170Webwcnsprodds_16_tfbaragrest = "" ;
      AV171Webwcnsprodds_17_tfbaragrest_sel = "" ;
      AV172Webwcnsprodds_18_tfbarser = "" ;
      AV173Webwcnsprodds_19_tfbarser_sel = "" ;
      AV174Webwcnsprodds_20_tfbarserdsc = "" ;
      AV175Webwcnsprodds_21_tfbarserdsc_sel = "" ;
      AV176Webwcnsprodds_22_tfbarfecgen = GXutil.nullDate() ;
      AV177Webwcnsprodds_23_tfbarfecent = GXutil.nullDate() ;
      AV178Webwcnsprodds_24_tfbarcolnom = "" ;
      AV179Webwcnsprodds_25_tfbarcolnom_sel = "" ;
      AV182Webwcnsprodds_28_tfbarnomcli = "" ;
      AV183Webwcnsprodds_29_tfbarnomcli_sel = "" ;
      AV186Webwcnsprodds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV187Webwcnsprodds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV188Webwcnsprodds_34_tfbarmtr = DecimalUtil.ZERO ;
      AV189Webwcnsprodds_35_tfbarmtr_to = DecimalUtil.ZERO ;
      AV194Webwcnsprodds_40_tfbarfascod = "" ;
      AV195Webwcnsprodds_41_tfbarfascod_sel = "" ;
      AV196Webwcnsprodds_42_tfbarfassig = "" ;
      AV197Webwcnsprodds_43_tfbarfassig_sel = "" ;
      AV200Webwcnsprodds_46_tfbaritem3 = "" ;
      AV201Webwcnsprodds_47_tfbaritem3_sel = "" ;
      AV204Webwcnsprodds_50_tfbargots = "" ;
      AV205Webwcnsprodds_51_tfbargots_sel = "" ;
      AV206Webwcnsprodds_52_tfbargrs = "" ;
      AV207Webwcnsprodds_53_tfbargrs_sel = "" ;
      AV208Webwcnsprodds_54_tfbarocs = "" ;
      AV209Webwcnsprodds_55_tfbarocs_sel = "" ;
      AV210Webwcnsprodds_56_tfbarrcs = "" ;
      AV211Webwcnsprodds_57_tfbarrcs_sel = "" ;
      AV212Webwcnsprodds_58_tfbaroeko = "" ;
      AV213Webwcnsprodds_59_tfbaroeko_sel = "" ;
      AV214Webwcnsprodds_60_tfbaraccesorios_sel = "" ;
      AV215Webwcnsprodds_61_tfbarmarca = "" ;
      AV216Webwcnsprodds_62_tfbarmarca_sel = "" ;
      AV219Webwcnsprodds_65_tfbarfascod2 = "" ;
      AV220Webwcnsprodds_66_tfbarfascod2_sel = "" ;
      AV221Webwcnsprodds_67_tfbarfasdsc2 = "" ;
      AV222Webwcnsprodds_68_tfbarfasdsc2_sel = "" ;
      scmdbuf = "" ;
      lV194Webwcnsprodds_40_tfbarfascod = "" ;
      lV196Webwcnsprodds_42_tfbarfassig = "" ;
      lV215Webwcnsprodds_61_tfbarmarca = "" ;
      lV219Webwcnsprodds_65_tfbarfascod2 = "" ;
      lV155Webwcnsprodds_1_barnhdr = "" ;
      lV156Webwcnsprodds_2_clinom = "" ;
      lV159Webwcnsprodds_5_barenccli = "" ;
      lV160Webwcnsprodds_6_barser = "" ;
      lV161Webwcnsprodds_7_barcolnom = "" ;
      lV166Webwcnsprodds_12_tfclinom = "" ;
      lV168Webwcnsprodds_14_tfbarnhdr = "" ;
      lV170Webwcnsprodds_16_tfbaragrest = "" ;
      lV172Webwcnsprodds_18_tfbarser = "" ;
      lV174Webwcnsprodds_20_tfbarserdsc = "" ;
      lV178Webwcnsprodds_24_tfbarcolnom = "" ;
      lV182Webwcnsprodds_28_tfbarnomcli = "" ;
      lV200Webwcnsprodds_46_tfbaritem3 = "" ;
      P08CS14_A9713Tb1_Cod = new short[1] ;
      P08CS14_A13769BarRdto4 = new short[1] ;
      P08CS14_n13769BarRdto4 = new boolean[] {false} ;
      P08CS14_A9777BarItem3 = new String[] {""} ;
      P08CS14_A1503BarPart = new short[1] ;
      P08CS14_A1235BarNumCli = new int[1] ;
      P08CS14_A1234BarNomCli = new String[] {""} ;
      P08CS14_A136BarColNum = new int[1] ;
      P08CS14_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08CS14_A1652BarSerDsc = new String[] {""} ;
      P08CS14_A120BarAgrEst = new String[] {""} ;
      P08CS14_A252CliCod = new int[1] ;
      P08CS14_n252CliCod = new boolean[] {false} ;
      P08CS14_A213BarSit = new byte[1] ;
      P08CS14_A135BarColNom = new String[] {""} ;
      P08CS14_A212BarSer = new String[] {""} ;
      P08CS14_A4812BarEncCli = new String[] {""} ;
      P08CS14_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08CS14_A279CliNom = new String[] {""} ;
      P08CS14_A3746BarNPed = new String[] {""} ;
      P08CS14_A143BarDisNum = new String[] {""} ;
      P08CS14_A11852Nxt_ArtCl2 = new String[] {""} ;
      P08CS14_A4466BarAcaAnh = new short[1] ;
      P08CS14_A13862Bar_MacCod = new int[1] ;
      P08CS14_n13862Bar_MacCod = new boolean[] {false} ;
      P08CS14_A13861BarMarca = new String[] {""} ;
      P08CS14_n13861BarMarca = new boolean[] {false} ;
      P08CS14_A13860BarAccesor = new String[] {""} ;
      P08CS14_n13860BarAccesor = new boolean[] {false} ;
      P08CS14_A1955BarFasSig = new String[] {""} ;
      P08CS14_n1955BarFasSig = new boolean[] {false} ;
      P08CS14_A151BarFasCod = new String[] {""} ;
      P08CS14_n151BarFasCod = new boolean[] {false} ;
      P08CS14_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CS14_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CS14_A130BarCodPar = new String[] {""} ;
      P08CS14_A132BarCodReo = new byte[1] ;
      P08CS14_A129BarCod = new int[1] ;
      P08CS14_A199BarPie1 = new short[1] ;
      P08CS14_A365DisDes = new String[] {""} ;
      P08CS14_A898BarPieNDes = new int[1] ;
      P08CS14_A361DisCod = new int[1] ;
      P08CS14_A13863BarFasCod2 = new String[] {""} ;
      P08CS14_n13863BarFasCod2 = new boolean[] {false} ;
      P08CS14_A396EmprCod = new String[] {""} ;
      A365DisDes = "" ;
      AV107Accesorios = "" ;
      AV121BarEncCliGrid = "" ;
      AV108ObsEnc = "" ;
      P08CS15_A396EmprCod = new String[] {""} ;
      P08CS15_A361DisCod = new int[1] ;
      P08CS15_A377DisObsTxt = new String[] {""} ;
      P08CS15_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV103FasDscUlt = "" ;
      AV104FasDscSig = "" ;
      P08CS16_A396EmprCod = new String[] {""} ;
      P08CS16_A129BarCod = new int[1] ;
      P08CS16_A132BarCodReo = new byte[1] ;
      P08CS16_A130BarCodPar = new String[] {""} ;
      P08CS16_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08CS16_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CS16_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CS16_A1265BarAlbPie = new int[1] ;
      P08CS16_A30AlbProCod = new long[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV106AlbProFec = GXutil.nullDate() ;
      AV147BarAlbKgme = DecimalUtil.ZERO ;
      AV148BarAlbmtre = DecimalUtil.ZERO ;
      P08CS17_A396EmprCod = new String[] {""} ;
      P08CS17_A129BarCod = new int[1] ;
      P08CS17_A132BarCodReo = new byte[1] ;
      P08CS17_A130BarCodPar = new String[] {""} ;
      P08CS17_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CS17_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08CS17_A30AlbProCod = new long[1] ;
      GXt_dtime4 = GXutil.resetTime( GXutil.nullDate() );
      AV109Exportacion = "" ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new short[1] ;
      AV150Tb1_dscfb = "" ;
      AV110Marca = "" ;
      AV42UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char8 = new String[1] ;
      AV39ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwcnsprodexport__default(),
         new Object[] {
             new Object[] {
            P08CS14_A9713Tb1_Cod, P08CS14_A13769BarRdto4, P08CS14_n13769BarRdto4, P08CS14_A9777BarItem3, P08CS14_A1503BarPart, P08CS14_A1235BarNumCli, P08CS14_A1234BarNomCli, P08CS14_A136BarColNum, P08CS14_A157BarFecEnt, P08CS14_A1652BarSerDsc,
            P08CS14_A120BarAgrEst, P08CS14_A252CliCod, P08CS14_n252CliCod, P08CS14_A213BarSit, P08CS14_A135BarColNom, P08CS14_A212BarSer, P08CS14_A4812BarEncCli, P08CS14_A159BarFecGen, P08CS14_A279CliNom, P08CS14_A3746BarNPed,
            P08CS14_A143BarDisNum, P08CS14_A11852Nxt_ArtCl2, P08CS14_A4466BarAcaAnh, P08CS14_A13862Bar_MacCod, P08CS14_n13862Bar_MacCod, P08CS14_A13861BarMarca, P08CS14_n13861BarMarca, P08CS14_A13860BarAccesor, P08CS14_n13860BarAccesor, P08CS14_A1955BarFasSig,
            P08CS14_n1955BarFasSig, P08CS14_A151BarFasCod, P08CS14_n151BarFasCod, P08CS14_A184BarMtr, P08CS14_A166BarKgm, P08CS14_A130BarCodPar, P08CS14_A132BarCodReo, P08CS14_A129BarCod, P08CS14_A199BarPie1, P08CS14_A365DisDes,
            P08CS14_A898BarPieNDes, P08CS14_A361DisCod, P08CS14_A13863BarFasCod2, P08CS14_n13863BarFasCod2, P08CS14_A396EmprCod
            }
            , new Object[] {
            P08CS15_A396EmprCod, P08CS15_A361DisCod, P08CS15_A377DisObsTxt, P08CS15_A376DisObsLin
            }
            , new Object[] {
            P08CS16_A396EmprCod, P08CS16_A129BarCod, P08CS16_A132BarCodReo, P08CS16_A130BarCodPar, P08CS16_A34AlbProfch, P08CS16_A1261BarAlbKgmE, P08CS16_A1263BarAlbMtrE, P08CS16_A1265BarAlbPie, P08CS16_A30AlbProCod
            }
            , new Object[] {
            P08CS17_A396EmprCod, P08CS17_A129BarCod, P08CS17_A132BarCodReo, P08CS17_A130BarCodPar, P08CS17_A1261BarAlbKgmE, P08CS17_A34AlbProfch, P08CS17_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV93BarSit ;
   private byte AV94BarSit_To ;
   private byte AV83TFBarSit ;
   private byte AV84TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV162Webwcnsprodds_8_barsit ;
   private byte AV163Webwcnsprodds_9_barsit_to ;
   private byte AV192Webwcnsprodds_38_tfbarsit ;
   private byte AV193Webwcnsprodds_39_tfbarsit_to ;
   private byte A376DisObsLin ;
   private short AV112TFBarPart ;
   private short AV113TFBarPart_To ;
   private short AV125TFBarRdto4 ;
   private short AV126TFBarRdto4_To ;
   private short A4466BarAcaAnh ;
   private short A1503BarPart ;
   private short A13769BarRdto4 ;
   private short AV198Webwcnsprodds_44_tfbarpart ;
   private short AV199Webwcnsprodds_45_tfbarpart_to ;
   private short AV202Webwcnsprodds_48_tfbarrdto4 ;
   private short AV203Webwcnsprodds_49_tfbarrdto4_to ;
   private short AV52OrderedBy ;
   private short A199BarPie1 ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV55TFCliCod ;
   private int AV56TFCliCod_To ;
   private int AV71TFBarColNum ;
   private int AV72TFBarColNum_To ;
   private int AV75TFBarNumCli ;
   private int AV76TFBarNumCli_To ;
   private int AV81TFBarPie ;
   private int AV82TFBarPie_To ;
   private int AV140TFBar_MacCod ;
   private int AV141TFBar_MacCod_To ;
   private int AV153GXV1 ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int A13862Bar_MacCod ;
   private int AV164Webwcnsprodds_10_tfclicod ;
   private int AV165Webwcnsprodds_11_tfclicod_to ;
   private int AV180Webwcnsprodds_26_tfbarcolnum ;
   private int AV181Webwcnsprodds_27_tfbarcolnum_to ;
   private int AV184Webwcnsprodds_30_tfbarnumcli ;
   private int AV185Webwcnsprodds_31_tfbarnumcli_to ;
   private int AV190Webwcnsprodds_36_tfbarpie ;
   private int AV191Webwcnsprodds_37_tfbarpie_to ;
   private int AV217Webwcnsprodds_63_tfbar_maccod ;
   private int AV218Webwcnsprodds_64_tfbar_maccod_to ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int AV146MacCod ;
   private int A1265BarAlbPie ;
   private int AV149Baralbpie ;
   private int GXv_int7[] ;
   private int AV226GXV2 ;
   private long AV46VisibleColumnCount ;
   private long AV111BarMacCod ;
   private long A30AlbProCod ;
   private long AV105AlbProcod ;
   private java.math.BigDecimal AV77TFBarKgm ;
   private java.math.BigDecimal AV78TFBarKgm_To ;
   private java.math.BigDecimal AV79TFBarMtr ;
   private java.math.BigDecimal AV80TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV186Webwcnsprodds_32_tfbarkgm ;
   private java.math.BigDecimal AV187Webwcnsprodds_33_tfbarkgm_to ;
   private java.math.BigDecimal AV188Webwcnsprodds_34_tfbarmtr ;
   private java.math.BigDecimal AV189Webwcnsprodds_35_tfbarmtr_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV147BarAlbKgme ;
   private java.math.BigDecimal AV148BarAlbmtre ;
   private String AV123BarNHdr ;
   private String AV96CliNom ;
   private String AV54BarEncCli ;
   private String AV118BarSer ;
   private String AV120BarColNom ;
   private String AV58TFCliNom_Sel ;
   private String AV57TFCliNom ;
   private String AV50TFBarNHdr_Sel ;
   private String AV49TFBarNHdr ;
   private String AV60TFBarAgrEst_Sel ;
   private String AV59TFBarAgrEst ;
   private String AV62TFBarSer_Sel ;
   private String AV61TFBarSer ;
   private String AV64TFBarSerDsc_Sel ;
   private String AV63TFBarSerDsc ;
   private String AV70TFBarColNom_Sel ;
   private String AV69TFBarColNom ;
   private String AV74TFBarNomCli_Sel ;
   private String AV73TFBarNomCli ;
   private String AV100TFBarFasCod_Sel ;
   private String AV99TFBarFasCod ;
   private String AV102TFBarFasSig_Sel ;
   private String AV101TFBarFasSig ;
   private String AV115TFBarItem3_Sel ;
   private String AV114TFBarItem3 ;
   private String AV128TFBarGots_Sel ;
   private String AV127TFBarGots ;
   private String AV130TFBarGrs_Sel ;
   private String AV129TFBarGrs ;
   private String AV132TFBarOcs_Sel ;
   private String AV131TFBarOcs ;
   private String AV134TFBarRcs_Sel ;
   private String AV133TFBarRcs ;
   private String AV136TFBarOeko_Sel ;
   private String AV135TFBarOeko ;
   private String AV137TFBarAccesorios_Sel ;
   private String AV139TFBarMarca_Sel ;
   private String AV138TFBarMarca ;
   private String AV143TFBarFasCod2_Sel ;
   private String AV142TFBarFasCod2 ;
   private String AV145TFBarFasDsc2_Sel ;
   private String AV144TFBarFasDsc2 ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A3746BarNPed ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String A11852Nxt_ArtCl2 ;
   private String A9777BarItem3 ;
   private String A13855BarGots ;
   private String A13856BarGrs ;
   private String A13857BarOcs ;
   private String A13858BarRcs ;
   private String A13859BarOeko ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String A13863BarFasCod2 ;
   private String A13864BarFasDsc2 ;
   private String AV155Webwcnsprodds_1_barnhdr ;
   private String AV156Webwcnsprodds_2_clinom ;
   private String AV159Webwcnsprodds_5_barenccli ;
   private String AV160Webwcnsprodds_6_barser ;
   private String AV161Webwcnsprodds_7_barcolnom ;
   private String AV166Webwcnsprodds_12_tfclinom ;
   private String AV167Webwcnsprodds_13_tfclinom_sel ;
   private String AV168Webwcnsprodds_14_tfbarnhdr ;
   private String AV169Webwcnsprodds_15_tfbarnhdr_sel ;
   private String AV170Webwcnsprodds_16_tfbaragrest ;
   private String AV171Webwcnsprodds_17_tfbaragrest_sel ;
   private String AV172Webwcnsprodds_18_tfbarser ;
   private String AV173Webwcnsprodds_19_tfbarser_sel ;
   private String AV174Webwcnsprodds_20_tfbarserdsc ;
   private String AV175Webwcnsprodds_21_tfbarserdsc_sel ;
   private String AV178Webwcnsprodds_24_tfbarcolnom ;
   private String AV179Webwcnsprodds_25_tfbarcolnom_sel ;
   private String AV182Webwcnsprodds_28_tfbarnomcli ;
   private String AV183Webwcnsprodds_29_tfbarnomcli_sel ;
   private String AV194Webwcnsprodds_40_tfbarfascod ;
   private String AV195Webwcnsprodds_41_tfbarfascod_sel ;
   private String AV196Webwcnsprodds_42_tfbarfassig ;
   private String AV197Webwcnsprodds_43_tfbarfassig_sel ;
   private String AV200Webwcnsprodds_46_tfbaritem3 ;
   private String AV201Webwcnsprodds_47_tfbaritem3_sel ;
   private String AV204Webwcnsprodds_50_tfbargots ;
   private String AV205Webwcnsprodds_51_tfbargots_sel ;
   private String AV206Webwcnsprodds_52_tfbargrs ;
   private String AV207Webwcnsprodds_53_tfbargrs_sel ;
   private String AV208Webwcnsprodds_54_tfbarocs ;
   private String AV209Webwcnsprodds_55_tfbarocs_sel ;
   private String AV210Webwcnsprodds_56_tfbarrcs ;
   private String AV211Webwcnsprodds_57_tfbarrcs_sel ;
   private String AV212Webwcnsprodds_58_tfbaroeko ;
   private String AV213Webwcnsprodds_59_tfbaroeko_sel ;
   private String AV214Webwcnsprodds_60_tfbaraccesorios_sel ;
   private String AV215Webwcnsprodds_61_tfbarmarca ;
   private String AV216Webwcnsprodds_62_tfbarmarca_sel ;
   private String AV219Webwcnsprodds_65_tfbarfascod2 ;
   private String AV220Webwcnsprodds_66_tfbarfascod2_sel ;
   private String AV221Webwcnsprodds_67_tfbarfasdsc2 ;
   private String AV222Webwcnsprodds_68_tfbarfasdsc2_sel ;
   private String scmdbuf ;
   private String lV194Webwcnsprodds_40_tfbarfascod ;
   private String lV196Webwcnsprodds_42_tfbarfassig ;
   private String lV215Webwcnsprodds_61_tfbarmarca ;
   private String lV219Webwcnsprodds_65_tfbarfascod2 ;
   private String lV155Webwcnsprodds_1_barnhdr ;
   private String lV156Webwcnsprodds_2_clinom ;
   private String lV159Webwcnsprodds_5_barenccli ;
   private String lV160Webwcnsprodds_6_barser ;
   private String lV161Webwcnsprodds_7_barcolnom ;
   private String lV166Webwcnsprodds_12_tfclinom ;
   private String lV168Webwcnsprodds_14_tfbarnhdr ;
   private String lV170Webwcnsprodds_16_tfbaragrest ;
   private String lV172Webwcnsprodds_18_tfbarser ;
   private String lV174Webwcnsprodds_20_tfbarserdsc ;
   private String lV178Webwcnsprodds_24_tfbarcolnom ;
   private String lV182Webwcnsprodds_28_tfbarnomcli ;
   private String lV200Webwcnsprodds_46_tfbaritem3 ;
   private String A365DisDes ;
   private String AV107Accesorios ;
   private String AV121BarEncCliGrid ;
   private String A377DisObsTxt ;
   private String AV103FasDscUlt ;
   private String AV104FasDscSig ;
   private String AV109Exportacion ;
   private String GXv_char3[] ;
   private String AV150Tb1_dscfb ;
   private String AV110Marca ;
   private String GXt_char2 ;
   private String GXv_char8[] ;
   private java.util.Date GXt_dtime4 ;
   private java.util.Date AV91BarFecGen ;
   private java.util.Date AV92BarFecGen_To ;
   private java.util.Date AV65TFBarFecGen ;
   private java.util.Date AV67TFBarFecEnt ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date AV157Webwcnsprodds_3_barfecgen ;
   private java.util.Date AV158Webwcnsprodds_4_barfecgen_to ;
   private java.util.Date AV176Webwcnsprodds_22_tfbarfecgen ;
   private java.util.Date AV177Webwcnsprodds_23_tfbarfecent ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV106AlbProFec ;
   private boolean returnInSub ;
   private boolean AV53OrderedDsc ;
   private boolean n13769BarRdto4 ;
   private boolean n252CliCod ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n1955BarFasSig ;
   private boolean n151BarFasCod ;
   private boolean n13863BarFasCod2 ;
   private String AV41ColumnsSelectorXML ;
   private String AV42UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV108ObsEnc ;
   private com.genexus.webpanels.WebSession AV34Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P08CS14_A9713Tb1_Cod ;
   private short[] P08CS14_A13769BarRdto4 ;
   private boolean[] P08CS14_n13769BarRdto4 ;
   private String[] P08CS14_A9777BarItem3 ;
   private short[] P08CS14_A1503BarPart ;
   private int[] P08CS14_A1235BarNumCli ;
   private String[] P08CS14_A1234BarNomCli ;
   private int[] P08CS14_A136BarColNum ;
   private java.util.Date[] P08CS14_A157BarFecEnt ;
   private String[] P08CS14_A1652BarSerDsc ;
   private String[] P08CS14_A120BarAgrEst ;
   private int[] P08CS14_A252CliCod ;
   private boolean[] P08CS14_n252CliCod ;
   private byte[] P08CS14_A213BarSit ;
   private String[] P08CS14_A135BarColNom ;
   private String[] P08CS14_A212BarSer ;
   private String[] P08CS14_A4812BarEncCli ;
   private java.util.Date[] P08CS14_A159BarFecGen ;
   private String[] P08CS14_A279CliNom ;
   private String[] P08CS14_A3746BarNPed ;
   private String[] P08CS14_A143BarDisNum ;
   private String[] P08CS14_A11852Nxt_ArtCl2 ;
   private short[] P08CS14_A4466BarAcaAnh ;
   private int[] P08CS14_A13862Bar_MacCod ;
   private boolean[] P08CS14_n13862Bar_MacCod ;
   private String[] P08CS14_A13861BarMarca ;
   private boolean[] P08CS14_n13861BarMarca ;
   private String[] P08CS14_A13860BarAccesor ;
   private boolean[] P08CS14_n13860BarAccesor ;
   private String[] P08CS14_A1955BarFasSig ;
   private boolean[] P08CS14_n1955BarFasSig ;
   private String[] P08CS14_A151BarFasCod ;
   private boolean[] P08CS14_n151BarFasCod ;
   private java.math.BigDecimal[] P08CS14_A184BarMtr ;
   private java.math.BigDecimal[] P08CS14_A166BarKgm ;
   private String[] P08CS14_A130BarCodPar ;
   private byte[] P08CS14_A132BarCodReo ;
   private int[] P08CS14_A129BarCod ;
   private short[] P08CS14_A199BarPie1 ;
   private String[] P08CS14_A365DisDes ;
   private int[] P08CS14_A898BarPieNDes ;
   private int[] P08CS14_A361DisCod ;
   private String[] P08CS14_A13863BarFasCod2 ;
   private boolean[] P08CS14_n13863BarFasCod2 ;
   private String[] P08CS14_A396EmprCod ;
   private String[] P08CS15_A396EmprCod ;
   private int[] P08CS15_A361DisCod ;
   private String[] P08CS15_A377DisObsTxt ;
   private byte[] P08CS15_A376DisObsLin ;
   private String[] P08CS16_A396EmprCod ;
   private int[] P08CS16_A129BarCod ;
   private byte[] P08CS16_A132BarCodReo ;
   private String[] P08CS16_A130BarCodPar ;
   private java.util.Date[] P08CS16_A34AlbProfch ;
   private java.math.BigDecimal[] P08CS16_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P08CS16_A1263BarAlbMtrE ;
   private int[] P08CS16_A1265BarAlbPie ;
   private long[] P08CS16_A30AlbProCod ;
   private String[] P08CS17_A396EmprCod ;
   private int[] P08CS17_A129BarCod ;
   private byte[] P08CS17_A132BarCodReo ;
   private String[] P08CS17_A130BarCodPar ;
   private java.math.BigDecimal[] P08CS17_A1261BarAlbKgmE ;
   private java.util.Date[] P08CS17_A34AlbProfch ;
   private long[] P08CS17_A30AlbProCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc5[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV40ColumnsSelector_Column ;
}

final  class webwcnsprodexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CS14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV155Webwcnsprodds_1_barnhdr ,
                                           String AV156Webwcnsprodds_2_clinom ,
                                           java.util.Date AV157Webwcnsprodds_3_barfecgen ,
                                           java.util.Date AV158Webwcnsprodds_4_barfecgen_to ,
                                           String AV159Webwcnsprodds_5_barenccli ,
                                           String AV160Webwcnsprodds_6_barser ,
                                           String AV161Webwcnsprodds_7_barcolnom ,
                                           byte AV162Webwcnsprodds_8_barsit ,
                                           byte AV163Webwcnsprodds_9_barsit_to ,
                                           int AV164Webwcnsprodds_10_tfclicod ,
                                           int AV165Webwcnsprodds_11_tfclicod_to ,
                                           String AV167Webwcnsprodds_13_tfclinom_sel ,
                                           String AV166Webwcnsprodds_12_tfclinom ,
                                           String AV169Webwcnsprodds_15_tfbarnhdr_sel ,
                                           String AV168Webwcnsprodds_14_tfbarnhdr ,
                                           String AV171Webwcnsprodds_17_tfbaragrest_sel ,
                                           String AV170Webwcnsprodds_16_tfbaragrest ,
                                           String AV173Webwcnsprodds_19_tfbarser_sel ,
                                           String AV172Webwcnsprodds_18_tfbarser ,
                                           String AV175Webwcnsprodds_21_tfbarserdsc_sel ,
                                           String AV174Webwcnsprodds_20_tfbarserdsc ,
                                           java.util.Date AV176Webwcnsprodds_22_tfbarfecgen ,
                                           java.util.Date AV177Webwcnsprodds_23_tfbarfecent ,
                                           String AV179Webwcnsprodds_25_tfbarcolnom_sel ,
                                           String AV178Webwcnsprodds_24_tfbarcolnom ,
                                           int AV180Webwcnsprodds_26_tfbarcolnum ,
                                           int AV181Webwcnsprodds_27_tfbarcolnum_to ,
                                           String AV183Webwcnsprodds_29_tfbarnomcli_sel ,
                                           String AV182Webwcnsprodds_28_tfbarnomcli ,
                                           int AV184Webwcnsprodds_30_tfbarnumcli ,
                                           int AV185Webwcnsprodds_31_tfbarnumcli_to ,
                                           java.math.BigDecimal AV186Webwcnsprodds_32_tfbarkgm ,
                                           java.math.BigDecimal AV187Webwcnsprodds_33_tfbarkgm_to ,
                                           java.math.BigDecimal AV188Webwcnsprodds_34_tfbarmtr ,
                                           java.math.BigDecimal AV189Webwcnsprodds_35_tfbarmtr_to ,
                                           byte AV192Webwcnsprodds_38_tfbarsit ,
                                           byte AV193Webwcnsprodds_39_tfbarsit_to ,
                                           short AV198Webwcnsprodds_44_tfbarpart ,
                                           short AV199Webwcnsprodds_45_tfbarpart_to ,
                                           String AV201Webwcnsprodds_47_tfbaritem3_sel ,
                                           String AV200Webwcnsprodds_46_tfbaritem3 ,
                                           short AV202Webwcnsprodds_48_tfbarrdto4 ,
                                           short AV203Webwcnsprodds_49_tfbarrdto4_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           byte A213BarSit ,
                                           int A252CliCod ,
                                           String A120BarAgrEst ,
                                           String A1652BarSerDsc ,
                                           java.util.Date A157BarFecEnt ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A1503BarPart ,
                                           String A9777BarItem3 ,
                                           short A13769BarRdto4 ,
                                           short AV52OrderedBy ,
                                           boolean AV53OrderedDsc ,
                                           int AV190Webwcnsprodds_36_tfbarpie ,
                                           int A198BarPie ,
                                           int AV191Webwcnsprodds_37_tfbarpie_to ,
                                           String AV195Webwcnsprodds_41_tfbarfascod_sel ,
                                           String AV194Webwcnsprodds_40_tfbarfascod ,
                                           String A151BarFasCod ,
                                           String AV197Webwcnsprodds_43_tfbarfassig_sel ,
                                           String AV196Webwcnsprodds_42_tfbarfassig ,
                                           String A1955BarFasSig ,
                                           String AV205Webwcnsprodds_51_tfbargots_sel ,
                                           String AV204Webwcnsprodds_50_tfbargots ,
                                           String A13855BarGots ,
                                           String AV207Webwcnsprodds_53_tfbargrs_sel ,
                                           String AV206Webwcnsprodds_52_tfbargrs ,
                                           String A13856BarGrs ,
                                           String AV209Webwcnsprodds_55_tfbarocs_sel ,
                                           String AV208Webwcnsprodds_54_tfbarocs ,
                                           String A13857BarOcs ,
                                           String AV211Webwcnsprodds_57_tfbarrcs_sel ,
                                           String AV210Webwcnsprodds_56_tfbarrcs ,
                                           String A13858BarRcs ,
                                           String AV213Webwcnsprodds_59_tfbaroeko_sel ,
                                           String AV212Webwcnsprodds_58_tfbaroeko ,
                                           String A13859BarOeko ,
                                           String AV214Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV216Webwcnsprodds_62_tfbarmarca_sel ,
                                           String AV215Webwcnsprodds_61_tfbarmarca ,
                                           String A13861BarMarca ,
                                           int AV217Webwcnsprodds_63_tfbar_maccod ,
                                           int A13862Bar_MacCod ,
                                           int AV218Webwcnsprodds_64_tfbar_maccod_to ,
                                           String AV220Webwcnsprodds_66_tfbarfascod2_sel ,
                                           String AV219Webwcnsprodds_65_tfbarfascod2 ,
                                           String A13863BarFasCod2 ,
                                           String AV222Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           String AV221Webwcnsprodds_67_tfbarfasdsc2 ,
                                           String A13864BarFasDsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[71];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarRdto4, T1.BarItem3, T1.BarPart, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarFecEnt, T1.BarSerDsc, T1.BarAgrEst, T1.CliCod, T1.BarSit," ;
      scmdbuf += " T1.BarColNom, T1.BarSer, T1.BarEncCli, T1.BarFecGen, T3.CliNom, T1.BarNPed, T1.BarDisNum, T1.Nxt_ArtCl2, T1.BarAcaAnh, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod," ;
      scmdbuf += " COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarFasCod2, ' ') AS BarFasSig, COALESCE( T8.BarFasCod2, ' ') AS" ;
      scmdbuf += " BarFasCod, COALESCE( T9.BarMtr, 0) AS BarMtr, COALESCE( T9.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T9.BarPie1, 0) AS BarPie1, T1.DisDes," ;
      scmdbuf += " COALESCE( T9.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T10.MacCod)" ;
      scmdbuf += " AS Bar_MacCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod" ;
      scmdbuf += " = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T2 ON T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod" ;
      scmdbuf += " AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC1) AND (T10.BarFasEst = 2) GROUP BY T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T11.GXC2, 'N') AS BarAccesor, T10.EmprCod, T10.BarCod, T10.BarCodReo," ;
      scmdbuf += " T10.BarCodPar FROM (TXPBARCAD T10 LEFT JOIN (SELECT MIN('S') AS GXC2, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPLMACRO T12 INNER JOIN TXPBARCAD T13 ON T13.EmprCod" ;
      scmdbuf += " = T12.EmprCod) WHERE T12.EmprCod = ? and T12.MacBarCod = T13.BarCod and T12.MacBarReo = T13.BarCodReo and T12.MacBarPar = T13.BarCodPar GROUP BY T13.BarCod, T13.BarCodReo," ;
      scmdbuf += " T13.BarCodPar ) T11 ON T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod" ;
      scmdbuf += " = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, COALESCE( T11.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM ((TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo" ;
      scmdbuf += " = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) INNER JOIN (SELECT MIN(T13.BarOrdLin) AS GXC4, COALESCE( T14.BarFasLin, 0) AS BarFasLin, T13.EmprCod, T13.BarCod," ;
      scmdbuf += " T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS T13 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar" ;
      scmdbuf += " = T13.BarCodPar) WHERE (T13.BarOrdLin >= 0) AND (T13.BarOrdLin > COALESCE( T14.BarFasLin, 0)) AND (T13.BarFasEst = 0) GROUP BY T14.BarFasLin, T13.EmprCod, T13.BarCod," ;
      scmdbuf += " T13.BarCodReo, T13.BarCodPar ) T12 ON T12.EmprCod = T10.EmprCod AND T12.BarCod = T10.BarCod AND T12.BarCodReo = T10.BarCodReo AND T12.BarCodPar = T10.BarCodPar)" ;
      scmdbuf += " WHERE (T10.BarOrdLin = T12.GXC4) AND (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod," ;
      scmdbuf += " T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " GXC5, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod" ;
      scmdbuf += " AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC5) AND (T10.BarFasEst <> 0) GROUP" ;
      scmdbuf += " BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T9.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! (GXutil.strcmp("", AV155Webwcnsprodds_1_barnhdr)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Webwcnsprodds_2_clinom)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom like ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Webwcnsprodds_3_barfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV158Webwcnsprodds_4_barfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Webwcnsprodds_5_barenccli)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Webwcnsprodds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer like ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Webwcnsprodds_7_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom like ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV162Webwcnsprodds_8_barsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV163Webwcnsprodds_9_barsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV164Webwcnsprodds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV165Webwcnsprodds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Webwcnsprodds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV166Webwcnsprodds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Webwcnsprodds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Webwcnsprodds_15_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV168Webwcnsprodds_14_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Webwcnsprodds_15_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Webwcnsprodds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV170Webwcnsprodds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Webwcnsprodds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Webwcnsprodds_19_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV172Webwcnsprodds_18_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Webwcnsprodds_19_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV175Webwcnsprodds_21_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV174Webwcnsprodds_20_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Webwcnsprodds_21_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV176Webwcnsprodds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV177Webwcnsprodds_23_tfbarfecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecEnt >= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV179Webwcnsprodds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV178Webwcnsprodds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV179Webwcnsprodds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! (0==AV180Webwcnsprodds_26_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (0==AV181Webwcnsprodds_27_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV183Webwcnsprodds_29_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV182Webwcnsprodds_28_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Webwcnsprodds_29_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      if ( ! (0==AV184Webwcnsprodds_30_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[57] = (byte)(1) ;
      }
      if ( ! (0==AV185Webwcnsprodds_31_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Webwcnsprodds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Webwcnsprodds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV188Webwcnsprodds_34_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV189Webwcnsprodds_35_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[62] = (byte)(1) ;
      }
      if ( ! (0==AV192Webwcnsprodds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[63] = (byte)(1) ;
      }
      if ( ! (0==AV193Webwcnsprodds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[64] = (byte)(1) ;
      }
      if ( ! (0==AV198Webwcnsprodds_44_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int11[65] = (byte)(1) ;
      }
      if ( ! (0==AV199Webwcnsprodds_45_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int11[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Webwcnsprodds_47_tfbaritem3_sel)==0) && ( ! (GXutil.strcmp("", AV200Webwcnsprodds_46_tfbaritem3)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarItem3) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Webwcnsprodds_47_tfbaritem3_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarItem3 = ?)");
      }
      else
      {
         GXv_int11[68] = (byte)(1) ;
      }
      if ( ! (0==AV202Webwcnsprodds_48_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int11[69] = (byte)(1) ;
      }
      if ( ! (0==AV203Webwcnsprodds_49_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int11[70] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV52OrderedBy == 1 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV52OrderedBy == 1 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV52OrderedBy == 2 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV52OrderedBy == 3 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV52OrderedBy == 4 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV52OrderedBy == 5 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV52OrderedBy == 6 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt" ;
      }
      else if ( ( AV52OrderedBy == 7 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt DESC" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV52OrderedBy == 8 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV52OrderedBy == 9 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV52OrderedBy == 10 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV52OrderedBy == 11 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV52OrderedBy == 12 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV52OrderedBy == 13 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      else if ( ( AV52OrderedBy == 14 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarItem3" ;
      }
      else if ( ( AV52OrderedBy == 14 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarItem3 DESC" ;
      }
      else if ( ( AV52OrderedBy == 15 ) && ! AV53OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV52OrderedBy == 15 ) && ( AV53OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P08CS14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (java.util.Date)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , ((Number) dynConstraints[97]).intValue() , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CS14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CS15", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CS16", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CS17", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[35])[0] = rslt.getString(29, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(30);
               ((int[]) buf[37])[0] = rslt.getInt(31);
               ((short[]) buf[38])[0] = rslt.getShort(32);
               ((String[]) buf[39])[0] = rslt.getString(33, 1);
               ((int[]) buf[40])[0] = rslt.getInt(34);
               ((int[]) buf[41])[0] = rslt.getInt(35);
               ((String[]) buf[42])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(37, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 20);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[107]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 16);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[120]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[124]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 13);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[136]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[137]).shortValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 20);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 20);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[141]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

