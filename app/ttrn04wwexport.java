package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn04wwexport extends GXProcedure
{
   public ttrn04wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn04wwexport.class ), "" );
   }

   public ttrn04wwexport( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttrn04wwexport.this.aP1 = new String[] {""};
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
      ttrn04wwexport.this.aP0 = aP0;
      ttrn04wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn04WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV118FilterFullText, GXv_char5) ;
      ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV109TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV109TFBarNHdr_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV108TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N° Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV108TFBarNHdr, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV70TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFCliNom_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFCliNom, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV121TFBarEncCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disposicion Cliente Nueva", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV121TFBarEncCli_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV120TFBarEncCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Disposicion Cliente Nueva", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV120TFBarEncCli, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFBarSer_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFBarSer, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV74TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFBarSerDsc_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFBarSerDsc, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV123TFBarTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV123TFBarTipArtDsc_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV122TFBarTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV122TFBarTipArtDsc, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV67TFCliCod) && (0==AV68TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV67TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV68TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV78TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFBarColNom_Sel, GXv_char5) ;
         ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFBarColNom, GXv_char5) ;
            ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV79TFBarColNum) && (0==AV80TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV79TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV80TFBarColNum_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83TFBarFecGen)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Generacion Barcada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV83TFBarFecGen );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85TFBarFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV85TFBarFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89TFBarFecSal)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV89TFBarFecSal );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV116TFBarSit) && (0==AV117TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "St", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV116TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV117TFBarSit_To );
      }
      if ( ! ( (0==AV119TFHayRec_Sel) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Receta?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttrn04wwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( AV119TFHayRec_Sel == 1 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( AV119TFHayRec_Sel == 2 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV54VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV42Session.getValue("TTrn04WWColumnsSelector"), "") != 0 )
      {
         AV49ColumnsSelectorXML = AV42Session.getValue("TTrn04WWColumnsSelector") ;
         AV46ColumnsSelector.fromxml(AV49ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV128GXV1 = 1 ;
      while ( AV128GXV1 <= AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV48ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV128GXV1));
         if ( AV48ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV48ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV48ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV48ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setColor( 11 );
            AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
         }
         AV128GXV1 = (int)(AV128GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV130Ttrn04wwds_1_filterfulltext = AV118FilterFullText ;
      AV131Ttrn04wwds_2_tfbarnhdr = AV108TFBarNHdr ;
      AV132Ttrn04wwds_3_tfbarnhdr_sel = AV109TFBarNHdr_Sel ;
      AV133Ttrn04wwds_4_tfclinom = AV69TFCliNom ;
      AV134Ttrn04wwds_5_tfclinom_sel = AV70TFCliNom_Sel ;
      AV135Ttrn04wwds_6_tfbarenccli = AV120TFBarEncCli ;
      AV136Ttrn04wwds_7_tfbarenccli_sel = AV121TFBarEncCli_Sel ;
      AV137Ttrn04wwds_8_tfbarser = AV71TFBarSer ;
      AV138Ttrn04wwds_9_tfbarser_sel = AV72TFBarSer_Sel ;
      AV139Ttrn04wwds_10_tfbarserdsc = AV73TFBarSerDsc ;
      AV140Ttrn04wwds_11_tfbarserdsc_sel = AV74TFBarSerDsc_Sel ;
      AV141Ttrn04wwds_12_tfbartipartdsc = AV122TFBarTipArtDsc ;
      AV142Ttrn04wwds_13_tfbartipartdsc_sel = AV123TFBarTipArtDsc_Sel ;
      AV143Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV144Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV145Ttrn04wwds_16_tfbarcolnom = AV77TFBarColNom ;
      AV146Ttrn04wwds_17_tfbarcolnom_sel = AV78TFBarColNom_Sel ;
      AV147Ttrn04wwds_18_tfbarcolnum = AV79TFBarColNum ;
      AV148Ttrn04wwds_19_tfbarcolnum_to = AV80TFBarColNum_To ;
      AV149Ttrn04wwds_20_tfbarfecgen = AV83TFBarFecGen ;
      AV150Ttrn04wwds_21_tfbarfeccli = AV85TFBarFecCli ;
      AV151Ttrn04wwds_22_tfbarfecsal = AV89TFBarFecSal ;
      AV152Ttrn04wwds_23_tfbarsit = AV116TFBarSit ;
      AV153Ttrn04wwds_24_tfbarsit_to = AV117TFBarSit_To ;
      AV154Ttrn04wwds_25_tfhayrec_sel = AV119TFHayRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV130Ttrn04wwds_1_filterfulltext ,
                                           AV132Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV131Ttrn04wwds_2_tfbarnhdr ,
                                           AV134Ttrn04wwds_5_tfclinom_sel ,
                                           AV133Ttrn04wwds_4_tfclinom ,
                                           AV136Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV135Ttrn04wwds_6_tfbarenccli ,
                                           AV138Ttrn04wwds_9_tfbarser_sel ,
                                           AV137Ttrn04wwds_8_tfbarser ,
                                           AV140Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV139Ttrn04wwds_10_tfbarserdsc ,
                                           AV142Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV141Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV143Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV144Ttrn04wwds_15_tfclicod_to) ,
                                           AV146Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV145Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV147Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV148Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV149Ttrn04wwds_20_tfbarfecgen ,
                                           AV150Ttrn04wwds_21_tfbarfeccli ,
                                           AV151Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV152Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV153Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           Byte.valueOf(AV154Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV130Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV130Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV131Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV131Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV133Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV133Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV135Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV135Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV137Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV137Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV139Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV139Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV141Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV141Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV145Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV145Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088I2 */
      pr_default.execute(0, new Object[] {lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV130Ttrn04wwds_1_filterfulltext, lV131Ttrn04wwds_2_tfbarnhdr, AV132Ttrn04wwds_3_tfbarnhdr_sel, lV133Ttrn04wwds_4_tfclinom, AV134Ttrn04wwds_5_tfclinom_sel, lV135Ttrn04wwds_6_tfbarenccli, AV136Ttrn04wwds_7_tfbarenccli_sel, lV137Ttrn04wwds_8_tfbarser, AV138Ttrn04wwds_9_tfbarser_sel, lV139Ttrn04wwds_10_tfbarserdsc, AV140Ttrn04wwds_11_tfbarserdsc_sel, lV141Ttrn04wwds_12_tfbartipartdsc, AV142Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV143Ttrn04wwds_14_tfclicod), Integer.valueOf(AV144Ttrn04wwds_15_tfclicod_to), lV145Ttrn04wwds_16_tfbarcolnom, AV146Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV147Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV148Ttrn04wwds_19_tfbarcolnum_to), AV149Ttrn04wwds_20_tfbarfecgen, AV150Ttrn04wwds_21_tfbarfeccli, AV151Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV152Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV153Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P088I2_A217BarTipArt[0] ;
         n217BarTipArt = P088I2_n217BarTipArt[0] ;
         A213BarSit = P088I2_A213BarSit[0] ;
         A161BarFecSal = P088I2_A161BarFecSal[0] ;
         A155BarFecCli = P088I2_A155BarFecCli[0] ;
         A159BarFecGen = P088I2_A159BarFecGen[0] ;
         A136BarColNum = P088I2_A136BarColNum[0] ;
         A135BarColNom = P088I2_A135BarColNom[0] ;
         A252CliCod = P088I2_A252CliCod[0] ;
         n252CliCod = P088I2_n252CliCod[0] ;
         A13711BarTipArtD = P088I2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088I2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088I2_A1652BarSerDsc[0] ;
         A212BarSer = P088I2_A212BarSer[0] ;
         A4812BarEncCli = P088I2_A4812BarEncCli[0] ;
         A279CliNom = P088I2_A279CliNom[0] ;
         A130BarCodPar = P088I2_A130BarCodPar[0] ;
         A132BarCodReo = P088I2_A132BarCodReo[0] ;
         A129BarCod = P088I2_A129BarCod[0] ;
         A396EmprCod = P088I2_A396EmprCod[0] ;
         A13711BarTipArtD = P088I2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088I2_n13711BarTipArtD[0] ;
         A279CliNom = P088I2_A279CliNom[0] ;
         GXt_int7 = A13710HayRec ;
         GXv_int8[0] = GXt_int7 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
         ttrn04wwexport.this.GXt_int7 = GXv_int8[0] ;
         A13710HayRec = GXt_int7 ;
         if ( ( AV154Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV154Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
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
                  returnInSub = true;
                  if (true) return;
               }
               AV54VisibleColumnCount = 0 ;
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4812BarEncCli, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( A252CliCod );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
                  ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setText( GXt_char4 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_dtime6 = GXutil.resetTime( A159BarFecGen );
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_dtime6 = GXutil.resetTime( A155BarFecCli );
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_dtime6 = GXutil.resetTime( A161BarFecSal );
                  AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( A213BarSit );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV46ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV54VisibleColumnCount), 1, 1).setNumber( A13710HayRec );
                  AV54VisibleColumnCount = (long)(AV54VisibleColumnCount+1) ;
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
      AV46ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre Cliente", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarEncCli", "", "Disposicion Cliente Nueva", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Serie", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", false, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Nombre Color", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero del Color", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "St", true, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV46ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "HayRec", "", "Receta?", false, "") ;
      AV46ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char4 = AV50UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn04WWColumnsSelector", GXv_char5) ;
      ttrn04wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV50UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV50UserCustomValue)==0) ) )
      {
         AV47ColumnsSelectorAux.fromxml(AV50UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV47ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV46ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV47ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV46ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue("TTrn04WWGridState"), "") == 0 )
      {
         AV44GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn04WWGridState"), null, null);
      }
      else
      {
         AV44GridState.fromxml(AV42Session.getValue("TTrn04WWGridState"), null, null);
      }
      AV16OrderedBy = AV44GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV44GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV155GXV2 = 1 ;
      while ( AV155GXV2 <= AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV45GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV155GXV2));
         if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV118FilterFullText = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV108TFBarNHdr = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV109TFBarNHdr_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV69TFCliNom = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV70TFCliNom_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV120TFBarEncCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV121TFBarEncCli_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV71TFBarSer = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV72TFBarSer_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV73TFBarSerDsc = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV74TFBarSerDsc_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV122TFBarTipArtDsc = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV123TFBarTipArtDsc_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV67TFCliCod = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFCliCod_To = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV77TFBarColNom = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV78TFBarColNom_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV79TFBarColNum = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFBarColNum_To = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV83TFBarFecGen = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV85TFBarFecCli = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV89TFBarFecSal = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV116TFBarSit = (byte)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV117TFBarSit_To = (byte)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV119TFHayRec_Sel = (byte)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV155GXV2 = (int)(AV155GXV2+1) ;
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
      this.aP0[0] = ttrn04wwexport.this.AV11Filename;
      this.aP1[0] = ttrn04wwexport.this.AV12ErrorMessage;
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
      AV118FilterFullText = "" ;
      AV109TFBarNHdr_Sel = "" ;
      AV108TFBarNHdr = "" ;
      AV70TFCliNom_Sel = "" ;
      AV69TFCliNom = "" ;
      AV121TFBarEncCli_Sel = "" ;
      AV120TFBarEncCli = "" ;
      AV72TFBarSer_Sel = "" ;
      AV71TFBarSer = "" ;
      AV74TFBarSerDsc_Sel = "" ;
      AV73TFBarSerDsc = "" ;
      AV123TFBarTipArtDsc_Sel = "" ;
      AV122TFBarTipArtDsc = "" ;
      AV78TFBarColNom_Sel = "" ;
      AV77TFBarColNom = "" ;
      AV83TFBarFecGen = GXutil.nullDate() ;
      AV85TFBarFecCli = GXutil.nullDate() ;
      AV89TFBarFecSal = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV42Session = httpContext.getWebSession();
      AV49ColumnsSelectorXML = "" ;
      AV46ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV48ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      AV130Ttrn04wwds_1_filterfulltext = "" ;
      AV131Ttrn04wwds_2_tfbarnhdr = "" ;
      AV132Ttrn04wwds_3_tfbarnhdr_sel = "" ;
      AV133Ttrn04wwds_4_tfclinom = "" ;
      AV134Ttrn04wwds_5_tfclinom_sel = "" ;
      AV135Ttrn04wwds_6_tfbarenccli = "" ;
      AV136Ttrn04wwds_7_tfbarenccli_sel = "" ;
      AV137Ttrn04wwds_8_tfbarser = "" ;
      AV138Ttrn04wwds_9_tfbarser_sel = "" ;
      AV139Ttrn04wwds_10_tfbarserdsc = "" ;
      AV140Ttrn04wwds_11_tfbarserdsc_sel = "" ;
      AV141Ttrn04wwds_12_tfbartipartdsc = "" ;
      AV142Ttrn04wwds_13_tfbartipartdsc_sel = "" ;
      AV145Ttrn04wwds_16_tfbarcolnom = "" ;
      AV146Ttrn04wwds_17_tfbarcolnom_sel = "" ;
      AV149Ttrn04wwds_20_tfbarfecgen = GXutil.nullDate() ;
      AV150Ttrn04wwds_21_tfbarfeccli = GXutil.nullDate() ;
      AV151Ttrn04wwds_22_tfbarfecsal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV130Ttrn04wwds_1_filterfulltext = "" ;
      lV131Ttrn04wwds_2_tfbarnhdr = "" ;
      lV133Ttrn04wwds_4_tfclinom = "" ;
      lV135Ttrn04wwds_6_tfbarenccli = "" ;
      lV137Ttrn04wwds_8_tfbarser = "" ;
      lV139Ttrn04wwds_10_tfbarserdsc = "" ;
      lV141Ttrn04wwds_12_tfbartipartdsc = "" ;
      lV145Ttrn04wwds_16_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      P088I2_A217BarTipArt = new short[1] ;
      P088I2_n217BarTipArt = new boolean[] {false} ;
      P088I2_A213BarSit = new byte[1] ;
      P088I2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088I2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088I2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088I2_A136BarColNum = new int[1] ;
      P088I2_A135BarColNom = new String[] {""} ;
      P088I2_A252CliCod = new int[1] ;
      P088I2_n252CliCod = new boolean[] {false} ;
      P088I2_A13711BarTipArtD = new String[] {""} ;
      P088I2_n13711BarTipArtD = new boolean[] {false} ;
      P088I2_A1652BarSerDsc = new String[] {""} ;
      P088I2_A212BarSer = new String[] {""} ;
      P088I2_A4812BarEncCli = new String[] {""} ;
      P088I2_A279CliNom = new String[] {""} ;
      P088I2_A130BarCodPar = new String[] {""} ;
      P088I2_A132BarCodReo = new byte[1] ;
      P088I2_A129BarCod = new int[1] ;
      P088I2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXv_int8 = new byte[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV50UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV47ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV44GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04wwexport__default(),
         new Object[] {
             new Object[] {
            P088I2_A217BarTipArt, P088I2_n217BarTipArt, P088I2_A213BarSit, P088I2_A161BarFecSal, P088I2_A155BarFecCli, P088I2_A159BarFecGen, P088I2_A136BarColNum, P088I2_A135BarColNom, P088I2_A252CliCod, P088I2_n252CliCod,
            P088I2_A13711BarTipArtD, P088I2_n13711BarTipArtD, P088I2_A1652BarSerDsc, P088I2_A212BarSer, P088I2_A4812BarEncCli, P088I2_A279CliNom, P088I2_A130BarCodPar, P088I2_A132BarCodReo, P088I2_A129BarCod, P088I2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV116TFBarSit ;
   private byte AV117TFBarSit_To ;
   private byte AV119TFHayRec_Sel ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte AV152Ttrn04wwds_23_tfbarsit ;
   private byte AV153Ttrn04wwds_24_tfbarsit_to ;
   private byte AV154Ttrn04wwds_25_tfhayrec_sel ;
   private byte A132BarCodReo ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV67TFCliCod ;
   private int AV68TFCliCod_To ;
   private int AV79TFBarColNum ;
   private int AV80TFBarColNum_To ;
   private int AV128GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV143Ttrn04wwds_14_tfclicod ;
   private int AV144Ttrn04wwds_15_tfclicod_to ;
   private int AV147Ttrn04wwds_18_tfbarcolnum ;
   private int AV148Ttrn04wwds_19_tfbarcolnum_to ;
   private int A129BarCod ;
   private int AV155GXV2 ;
   private long AV54VisibleColumnCount ;
   private String AV109TFBarNHdr_Sel ;
   private String AV108TFBarNHdr ;
   private String AV70TFCliNom_Sel ;
   private String AV69TFCliNom ;
   private String AV121TFBarEncCli_Sel ;
   private String AV120TFBarEncCli ;
   private String AV72TFBarSer_Sel ;
   private String AV71TFBarSer ;
   private String AV74TFBarSerDsc_Sel ;
   private String AV73TFBarSerDsc ;
   private String AV123TFBarTipArtDsc_Sel ;
   private String AV122TFBarTipArtDsc ;
   private String AV78TFBarColNom_Sel ;
   private String AV77TFBarColNom ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String AV131Ttrn04wwds_2_tfbarnhdr ;
   private String AV132Ttrn04wwds_3_tfbarnhdr_sel ;
   private String AV133Ttrn04wwds_4_tfclinom ;
   private String AV134Ttrn04wwds_5_tfclinom_sel ;
   private String AV135Ttrn04wwds_6_tfbarenccli ;
   private String AV136Ttrn04wwds_7_tfbarenccli_sel ;
   private String AV137Ttrn04wwds_8_tfbarser ;
   private String AV138Ttrn04wwds_9_tfbarser_sel ;
   private String AV139Ttrn04wwds_10_tfbarserdsc ;
   private String AV140Ttrn04wwds_11_tfbarserdsc_sel ;
   private String AV141Ttrn04wwds_12_tfbartipartdsc ;
   private String AV142Ttrn04wwds_13_tfbartipartdsc_sel ;
   private String AV145Ttrn04wwds_16_tfbarcolnom ;
   private String AV146Ttrn04wwds_17_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV131Ttrn04wwds_2_tfbarnhdr ;
   private String lV133Ttrn04wwds_4_tfclinom ;
   private String lV135Ttrn04wwds_6_tfbarenccli ;
   private String lV137Ttrn04wwds_8_tfbarser ;
   private String lV139Ttrn04wwds_10_tfbarserdsc ;
   private String lV141Ttrn04wwds_12_tfbartipartdsc ;
   private String lV145Ttrn04wwds_16_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV83TFBarFecGen ;
   private java.util.Date AV85TFBarFecCli ;
   private java.util.Date AV89TFBarFecSal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV149Ttrn04wwds_20_tfbarfecgen ;
   private java.util.Date AV150Ttrn04wwds_21_tfbarfeccli ;
   private java.util.Date AV151Ttrn04wwds_22_tfbarfecsal ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private String AV49ColumnsSelectorXML ;
   private String AV50UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV118FilterFullText ;
   private String AV130Ttrn04wwds_1_filterfulltext ;
   private String lV130Ttrn04wwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P088I2_A217BarTipArt ;
   private boolean[] P088I2_n217BarTipArt ;
   private byte[] P088I2_A213BarSit ;
   private java.util.Date[] P088I2_A161BarFecSal ;
   private java.util.Date[] P088I2_A155BarFecCli ;
   private java.util.Date[] P088I2_A159BarFecGen ;
   private int[] P088I2_A136BarColNum ;
   private String[] P088I2_A135BarColNom ;
   private int[] P088I2_A252CliCod ;
   private boolean[] P088I2_n252CliCod ;
   private String[] P088I2_A13711BarTipArtD ;
   private boolean[] P088I2_n13711BarTipArtD ;
   private String[] P088I2_A1652BarSerDsc ;
   private String[] P088I2_A212BarSer ;
   private String[] P088I2_A4812BarEncCli ;
   private String[] P088I2_A279CliNom ;
   private String[] P088I2_A130BarCodPar ;
   private byte[] P088I2_A132BarCodReo ;
   private int[] P088I2_A129BarCod ;
   private String[] P088I2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV44GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV45GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV46ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV47ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV48ColumnsSelector_Column ;
}

final  class ttrn04wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P088I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV130Ttrn04wwds_1_filterfulltext ,
                                          String AV132Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV131Ttrn04wwds_2_tfbarnhdr ,
                                          String AV134Ttrn04wwds_5_tfclinom_sel ,
                                          String AV133Ttrn04wwds_4_tfclinom ,
                                          String AV136Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV135Ttrn04wwds_6_tfbarenccli ,
                                          String AV138Ttrn04wwds_9_tfbarser_sel ,
                                          String AV137Ttrn04wwds_8_tfbarser ,
                                          String AV140Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV139Ttrn04wwds_10_tfbarserdsc ,
                                          String AV142Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV141Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV143Ttrn04wwds_14_tfclicod ,
                                          int AV144Ttrn04wwds_15_tfclicod_to ,
                                          String AV146Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV145Ttrn04wwds_16_tfbarcolnom ,
                                          int AV147Ttrn04wwds_18_tfbarcolnum ,
                                          int AV148Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV149Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV150Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV151Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV152Ttrn04wwds_23_tfbarsit ,
                                          byte AV153Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          byte AV154Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[33];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV130Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
         GXv_int11[1] = (byte)(1) ;
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV131Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV133Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV135Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV137Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV141Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV143Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV144Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV145Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV147Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV148Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV150Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV151Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV152Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV153Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
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
         scmdbuf += " ORDER BY T1.BarEncCli" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarEncCli DESC" ;
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
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
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
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
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
                  return conditional_P088I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
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
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
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
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
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
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

