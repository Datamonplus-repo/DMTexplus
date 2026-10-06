package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmformulaswwexport extends GXProcedure
{
   public tmformulaswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmformulaswwexport.class ), "" );
   }

   public tmformulaswwexport( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tmformulaswwexport.this.aP1 = new String[] {""};
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
      tmformulaswwexport.this.aP0 = aP0;
      tmformulaswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TMFormulasWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      GXt_dtime2 = GXutil.resetTime( AV115ForFec );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime2 = GXutil.resetTime( AV116ForFec_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime2 );
      GXv_exceldoc3[0] = AV10ExcelDocument ;
      GXv_int4[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Filter", "")) ;
      AV10ExcelDocument = GXv_exceldoc3[0] ;
      tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV127FilterFullText, GXv_char6) ;
      tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      if ( ! ( (0==AV66TFCliCod) && (0==AV67TFCliCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV66TFCliCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV67TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV69TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFCliNom_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFCliNom)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFCliNom, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFForSer_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFForSer)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFForSer, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV73TFForSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFForSerDsc_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV72TFForSerDsc)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFForSerDsc, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV75TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFForColNom_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFForColNom)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFForColNom, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV76TFForColNum) && (0==AV77TFForColNum_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV76TFForColNum );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV77TFForColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV107TFForNomCli_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV107TFForNomCli_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV106TFForNomCli)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106TFForNomCli, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( (0==AV78TFTipColCod) && (0==AV79TFTipColCod_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV78TFTipColCod );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV79TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV81TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_char5 = "" ;
         GXv_char6[0] = GXt_char5 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFTipColDsc_Sel, GXv_char6) ;
         tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFTipColDsc)==0) ) )
         {
            GXv_exceldoc3[0] = AV10ExcelDocument ;
            GXv_int4[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc3[0] ;
            tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFTipColDsc, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char5 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117TFForFec)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Formula", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV117TFForFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119TFForUltUti)) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Ult Uti", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         GXt_dtime2 = GXutil.resetTime( AV119TFForUltUti );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime2 );
      }
      if ( ! ( (0==AV121TFForNumCol) && (0==AV122TFForNumCol_To) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Interno F.", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV121TFForNumCol );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV122TFForNumCol_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125TFForRelBan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126TFForRelBan_To)==0) ) )
      {
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, true, GXv_int4, (short)(AV14FirstColumn), httpContext.getMessage( "Rb", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV125TFForRelBan)) );
         GXv_exceldoc3[0] = AV10ExcelDocument ;
         GXv_int4[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc3, false, GXv_int4, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc3[0] ;
         tmformulaswwexport.this.AV13CellRow = GXv_int4[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV126TFForRelBan_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV63VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV51Session.getValue("TMFormulasWWColumnsSelector"), "") != 0 )
      {
         AV58ColumnsSelectorXML = AV51Session.getValue("TMFormulasWWColumnsSelector") ;
         AV55ColumnsSelector.fromxml(AV58ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV130GXV1 = 1 ;
      while ( AV130GXV1 <= AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV57ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV130GXV1));
         if ( AV57ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV57ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV57ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV57ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setColor( 11 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         AV130GXV1 = (int)(AV130GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV132Tmformulaswwds_1_forfec = AV115ForFec ;
      AV133Tmformulaswwds_2_forfec_to = AV116ForFec_To ;
      AV134Tmformulaswwds_3_filterfulltext = AV127FilterFullText ;
      AV135Tmformulaswwds_4_tfclicod = AV66TFCliCod ;
      AV136Tmformulaswwds_5_tfclicod_to = AV67TFCliCod_To ;
      AV137Tmformulaswwds_6_tfclinom = AV68TFCliNom ;
      AV138Tmformulaswwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV139Tmformulaswwds_8_tfforser = AV70TFForSer ;
      AV140Tmformulaswwds_9_tfforser_sel = AV71TFForSer_Sel ;
      AV141Tmformulaswwds_10_tfforserdsc = AV72TFForSerDsc ;
      AV142Tmformulaswwds_11_tfforserdsc_sel = AV73TFForSerDsc_Sel ;
      AV143Tmformulaswwds_12_tfforcolnom = AV74TFForColNom ;
      AV144Tmformulaswwds_13_tfforcolnom_sel = AV75TFForColNom_Sel ;
      AV145Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV146Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV147Tmformulaswwds_16_tffornomcli = AV106TFForNomCli ;
      AV148Tmformulaswwds_17_tffornomcli_sel = AV107TFForNomCli_Sel ;
      AV149Tmformulaswwds_18_tftipcolcod = AV78TFTipColCod ;
      AV150Tmformulaswwds_19_tftipcolcod_to = AV79TFTipColCod_To ;
      AV151Tmformulaswwds_20_tftipcoldsc = AV80TFTipColDsc ;
      AV152Tmformulaswwds_21_tftipcoldsc_sel = AV81TFTipColDsc_Sel ;
      AV153Tmformulaswwds_22_tfforfec = AV117TFForFec ;
      AV154Tmformulaswwds_23_tfforultuti = AV119TFForUltUti ;
      AV155Tmformulaswwds_24_tffornumcol = AV121TFForNumCol ;
      AV156Tmformulaswwds_25_tffornumcol_to = AV122TFForNumCol_To ;
      AV157Tmformulaswwds_26_tfforrelban = AV125TFForRelBan ;
      AV158Tmformulaswwds_27_tfforrelban_to = AV126TFForRelBan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV132Tmformulaswwds_1_forfec ,
                                           AV133Tmformulaswwds_2_forfec_to ,
                                           AV134Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV135Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV136Tmformulaswwds_5_tfclicod_to) ,
                                           AV138Tmformulaswwds_7_tfclinom_sel ,
                                           AV137Tmformulaswwds_6_tfclinom ,
                                           AV140Tmformulaswwds_9_tfforser_sel ,
                                           AV139Tmformulaswwds_8_tfforser ,
                                           AV142Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV141Tmformulaswwds_10_tfforserdsc ,
                                           AV144Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV143Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV145Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV146Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV148Tmformulaswwds_17_tffornomcli_sel ,
                                           AV147Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV149Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV150Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV152Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV151Tmformulaswwds_20_tftipcoldsc ,
                                           AV153Tmformulaswwds_22_tfforfec ,
                                           AV154Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV155Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV156Tmformulaswwds_25_tffornumcol_to) ,
                                           AV157Tmformulaswwds_26_tfforrelban ,
                                           AV158Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV134Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV137Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV137Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV139Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV139Tmformulaswwds_8_tfforser), 16, "%") ;
      lV141Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV141Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV143Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV143Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV147Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV147Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV151Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV151Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor P08JP2 */
      pr_default.execute(0, new Object[] {AV132Tmformulaswwds_1_forfec, AV133Tmformulaswwds_2_forfec_to, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, lV134Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV135Tmformulaswwds_4_tfclicod), Integer.valueOf(AV136Tmformulaswwds_5_tfclicod_to), lV137Tmformulaswwds_6_tfclinom, AV138Tmformulaswwds_7_tfclinom_sel, lV139Tmformulaswwds_8_tfforser, AV140Tmformulaswwds_9_tfforser_sel, lV141Tmformulaswwds_10_tfforserdsc, AV142Tmformulaswwds_11_tfforserdsc_sel, lV143Tmformulaswwds_12_tfforcolnom, AV144Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV145Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV146Tmformulaswwds_15_tfforcolnum_to), lV147Tmformulaswwds_16_tffornomcli, AV148Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV149Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV150Tmformulaswwds_19_tftipcolcod_to), lV151Tmformulaswwds_20_tftipcoldsc, AV152Tmformulaswwds_21_tftipcoldsc_sel, AV153Tmformulaswwds_22_tfforfec, AV154Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV155Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV156Tmformulaswwds_25_tffornumcol_to), AV157Tmformulaswwds_26_tfforrelban, AV158Tmformulaswwds_27_tfforrelban_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08JP2_A396EmprCod[0] ;
         A2838ForRelBan = P08JP2_A2838ForRelBan[0] ;
         n2838ForRelBan = P08JP2_n2838ForRelBan[0] ;
         A486ForNumCol = P08JP2_A486ForNumCol[0] ;
         A496ForUltUti = P08JP2_A496ForUltUti[0] ;
         n496ForUltUti = P08JP2_n496ForUltUti[0] ;
         A832TipColDsc = P08JP2_A832TipColDsc[0] ;
         n832TipColDsc = P08JP2_n832TipColDsc[0] ;
         A831TipColCod = P08JP2_A831TipColCod[0] ;
         A1191ForNomCli = P08JP2_A1191ForNomCli[0] ;
         n1191ForNomCli = P08JP2_n1191ForNomCli[0] ;
         A483ForColNum = P08JP2_A483ForColNum[0] ;
         A482ForColNom = P08JP2_A482ForColNom[0] ;
         A5742ForSerDsc = P08JP2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08JP2_n5742ForSerDsc[0] ;
         A494ForSer = P08JP2_A494ForSer[0] ;
         A279CliNom = P08JP2_A279CliNom[0] ;
         A252CliCod = P08JP2_A252CliCod[0] ;
         A485ForFec = P08JP2_A485ForFec[0] ;
         n485ForFec = P08JP2_n485ForFec[0] ;
         A832TipColDsc = P08JP2_A832TipColDsc[0] ;
         n832TipColDsc = P08JP2_n832TipColDsc[0] ;
         A279CliNom = P08JP2_A279CliNom[0] ;
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
         AV63VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1191ForNomCli, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char5 = "" ;
            GXv_char6[0] = GXt_char5 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char6) ;
            tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setText( GXt_char5 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( A485ForFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime2 = GXutil.resetTime( A496ForUltUti );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setDate( GXt_dtime2 );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setNumber( A486ForNumCol );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV55ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV63VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2838ForRelBan)) );
            AV63VisibleColumnCount = (long)(AV63VisibleColumnCount+1) ;
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
      AV55ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSer", "", "Articulo", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSerDsc", "", "Descripcion", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNom", "", "Color", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNum", "", "Numero", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForNomCli", "", "Color Cliente", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColCod", "", "Tc", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColDsc", "", "Descripcion", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForFec", "", "Fecha Formula", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForUltUti", "", "Fecha Ult Uti", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV55ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForRelBan", "", "Rb", true, "") ;
      AV55ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char5 = AV59UserCustomValue ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMFormulasWWColumnsSelector", GXv_char6) ;
      tmformulaswwexport.this.GXt_char5 = GXv_char6[0] ;
      AV59UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV59UserCustomValue)==0) ) )
      {
         AV56ColumnsSelectorAux.fromxml(AV59UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV56ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV55ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV56ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV55ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("TMFormulasWWGridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMFormulasWWGridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("TMFormulasWWGridState"), null, null);
      }
      AV16OrderedBy = AV53GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV53GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV159GXV2 = 1 ;
      while ( AV159GXV2 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV159GXV2));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FORFEC") == 0 )
         {
            AV115ForFec = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV116ForFec_To = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV127FilterFullText = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV66TFCliCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFCliCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV68TFCliNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV69TFCliNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV70TFForSer = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV71TFForSer_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV72TFForSerDsc = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV73TFForSerDsc_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV74TFForColNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV75TFForColNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV76TFForColNum = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFForColNum_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV106TFForNomCli = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV107TFForNomCli_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV78TFTipColCod = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFTipColCod_To = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV80TFTipColDsc = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV81TFTipColDsc_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV117TFForFec = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV119TFForUltUti = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV121TFForNumCol = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV122TFForNumCol_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV125TFForRelBan = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV126TFForRelBan_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV159GXV2 = (int)(AV159GXV2+1) ;
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
      this.aP0[0] = tmformulaswwexport.this.AV11Filename;
      this.aP1[0] = tmformulaswwexport.this.AV12ErrorMessage;
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
      AV115ForFec = GXutil.nullDate() ;
      AV116ForFec_To = GXutil.nullDate() ;
      AV127FilterFullText = "" ;
      AV69TFCliNom_Sel = "" ;
      AV68TFCliNom = "" ;
      AV71TFForSer_Sel = "" ;
      AV70TFForSer = "" ;
      AV73TFForSerDsc_Sel = "" ;
      AV72TFForSerDsc = "" ;
      AV75TFForColNom_Sel = "" ;
      AV74TFForColNom = "" ;
      AV107TFForNomCli_Sel = "" ;
      AV106TFForNomCli = "" ;
      AV81TFTipColDsc_Sel = "" ;
      AV80TFTipColDsc = "" ;
      AV117TFForFec = GXutil.nullDate() ;
      AV119TFForUltUti = GXutil.nullDate() ;
      AV125TFForRelBan = DecimalUtil.ZERO ;
      AV126TFForRelBan_To = DecimalUtil.ZERO ;
      GXv_exceldoc3 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int4 = new short[1] ;
      AV51Session = httpContext.getWebSession();
      AV58ColumnsSelectorXML = "" ;
      AV55ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV57ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      AV132Tmformulaswwds_1_forfec = GXutil.nullDate() ;
      AV133Tmformulaswwds_2_forfec_to = GXutil.nullDate() ;
      AV134Tmformulaswwds_3_filterfulltext = "" ;
      AV137Tmformulaswwds_6_tfclinom = "" ;
      AV138Tmformulaswwds_7_tfclinom_sel = "" ;
      AV139Tmformulaswwds_8_tfforser = "" ;
      AV140Tmformulaswwds_9_tfforser_sel = "" ;
      AV141Tmformulaswwds_10_tfforserdsc = "" ;
      AV142Tmformulaswwds_11_tfforserdsc_sel = "" ;
      AV143Tmformulaswwds_12_tfforcolnom = "" ;
      AV144Tmformulaswwds_13_tfforcolnom_sel = "" ;
      AV147Tmformulaswwds_16_tffornomcli = "" ;
      AV148Tmformulaswwds_17_tffornomcli_sel = "" ;
      AV151Tmformulaswwds_20_tftipcoldsc = "" ;
      AV152Tmformulaswwds_21_tftipcoldsc_sel = "" ;
      AV153Tmformulaswwds_22_tfforfec = GXutil.nullDate() ;
      AV154Tmformulaswwds_23_tfforultuti = GXutil.nullDate() ;
      AV157Tmformulaswwds_26_tfforrelban = DecimalUtil.ZERO ;
      AV158Tmformulaswwds_27_tfforrelban_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV134Tmformulaswwds_3_filterfulltext = "" ;
      lV137Tmformulaswwds_6_tfclinom = "" ;
      lV139Tmformulaswwds_8_tfforser = "" ;
      lV141Tmformulaswwds_10_tfforserdsc = "" ;
      lV143Tmformulaswwds_12_tfforcolnom = "" ;
      lV147Tmformulaswwds_16_tffornomcli = "" ;
      lV151Tmformulaswwds_20_tftipcoldsc = "" ;
      P08JP2_A396EmprCod = new String[] {""} ;
      P08JP2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08JP2_n2838ForRelBan = new boolean[] {false} ;
      P08JP2_A486ForNumCol = new int[1] ;
      P08JP2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08JP2_n496ForUltUti = new boolean[] {false} ;
      P08JP2_A832TipColDsc = new String[] {""} ;
      P08JP2_n832TipColDsc = new boolean[] {false} ;
      P08JP2_A831TipColCod = new byte[1] ;
      P08JP2_A1191ForNomCli = new String[] {""} ;
      P08JP2_n1191ForNomCli = new boolean[] {false} ;
      P08JP2_A483ForColNum = new int[1] ;
      P08JP2_A482ForColNom = new String[] {""} ;
      P08JP2_A5742ForSerDsc = new String[] {""} ;
      P08JP2_n5742ForSerDsc = new boolean[] {false} ;
      P08JP2_A494ForSer = new String[] {""} ;
      P08JP2_A279CliNom = new String[] {""} ;
      P08JP2_A252CliCod = new int[1] ;
      P08JP2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08JP2_n485ForFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      AV59UserCustomValue = "" ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      AV56ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulaswwexport__default(),
         new Object[] {
             new Object[] {
            P08JP2_A396EmprCod, P08JP2_A2838ForRelBan, P08JP2_n2838ForRelBan, P08JP2_A486ForNumCol, P08JP2_A496ForUltUti, P08JP2_n496ForUltUti, P08JP2_A832TipColDsc, P08JP2_n832TipColDsc, P08JP2_A831TipColCod, P08JP2_A1191ForNomCli,
            P08JP2_n1191ForNomCli, P08JP2_A483ForColNum, P08JP2_A482ForColNom, P08JP2_A5742ForSerDsc, P08JP2_n5742ForSerDsc, P08JP2_A494ForSer, P08JP2_A279CliNom, P08JP2_A252CliCod, P08JP2_A485ForFec, P08JP2_n485ForFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV78TFTipColCod ;
   private byte AV79TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV149Tmformulaswwds_18_tftipcolcod ;
   private byte AV150Tmformulaswwds_19_tftipcolcod_to ;
   private short GXv_int4[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV66TFCliCod ;
   private int AV67TFCliCod_To ;
   private int AV76TFForColNum ;
   private int AV77TFForColNum_To ;
   private int AV121TFForNumCol ;
   private int AV122TFForNumCol_To ;
   private int AV130GXV1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV135Tmformulaswwds_4_tfclicod ;
   private int AV136Tmformulaswwds_5_tfclicod_to ;
   private int AV145Tmformulaswwds_14_tfforcolnum ;
   private int AV146Tmformulaswwds_15_tfforcolnum_to ;
   private int AV155Tmformulaswwds_24_tffornumcol ;
   private int AV156Tmformulaswwds_25_tffornumcol_to ;
   private int AV159GXV2 ;
   private long AV63VisibleColumnCount ;
   private java.math.BigDecimal AV125TFForRelBan ;
   private java.math.BigDecimal AV126TFForRelBan_To ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV157Tmformulaswwds_26_tfforrelban ;
   private java.math.BigDecimal AV158Tmformulaswwds_27_tfforrelban_to ;
   private String AV69TFCliNom_Sel ;
   private String AV68TFCliNom ;
   private String AV71TFForSer_Sel ;
   private String AV70TFForSer ;
   private String AV73TFForSerDsc_Sel ;
   private String AV72TFForSerDsc ;
   private String AV75TFForColNom_Sel ;
   private String AV74TFForColNom ;
   private String AV107TFForNomCli_Sel ;
   private String AV106TFForNomCli ;
   private String AV81TFTipColDsc_Sel ;
   private String AV80TFTipColDsc ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String AV137Tmformulaswwds_6_tfclinom ;
   private String AV138Tmformulaswwds_7_tfclinom_sel ;
   private String AV139Tmformulaswwds_8_tfforser ;
   private String AV140Tmformulaswwds_9_tfforser_sel ;
   private String AV141Tmformulaswwds_10_tfforserdsc ;
   private String AV142Tmformulaswwds_11_tfforserdsc_sel ;
   private String AV143Tmformulaswwds_12_tfforcolnom ;
   private String AV144Tmformulaswwds_13_tfforcolnom_sel ;
   private String AV147Tmformulaswwds_16_tffornomcli ;
   private String AV148Tmformulaswwds_17_tffornomcli_sel ;
   private String AV151Tmformulaswwds_20_tftipcoldsc ;
   private String AV152Tmformulaswwds_21_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV137Tmformulaswwds_6_tfclinom ;
   private String lV139Tmformulaswwds_8_tfforser ;
   private String lV141Tmformulaswwds_10_tfforserdsc ;
   private String lV143Tmformulaswwds_12_tfforcolnom ;
   private String lV147Tmformulaswwds_16_tffornomcli ;
   private String lV151Tmformulaswwds_20_tftipcoldsc ;
   private String A396EmprCod ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private java.util.Date GXt_dtime2 ;
   private java.util.Date AV115ForFec ;
   private java.util.Date AV116ForFec_To ;
   private java.util.Date AV117TFForFec ;
   private java.util.Date AV119TFForUltUti ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV132Tmformulaswwds_1_forfec ;
   private java.util.Date AV133Tmformulaswwds_2_forfec_to ;
   private java.util.Date AV153Tmformulaswwds_22_tfforfec ;
   private java.util.Date AV154Tmformulaswwds_23_tfforultuti ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n2838ForRelBan ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n485ForFec ;
   private String AV58ColumnsSelectorXML ;
   private String AV59UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV127FilterFullText ;
   private String AV134Tmformulaswwds_3_filterfulltext ;
   private String lV134Tmformulaswwds_3_filterfulltext ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08JP2_A396EmprCod ;
   private java.math.BigDecimal[] P08JP2_A2838ForRelBan ;
   private boolean[] P08JP2_n2838ForRelBan ;
   private int[] P08JP2_A486ForNumCol ;
   private java.util.Date[] P08JP2_A496ForUltUti ;
   private boolean[] P08JP2_n496ForUltUti ;
   private String[] P08JP2_A832TipColDsc ;
   private boolean[] P08JP2_n832TipColDsc ;
   private byte[] P08JP2_A831TipColCod ;
   private String[] P08JP2_A1191ForNomCli ;
   private boolean[] P08JP2_n1191ForNomCli ;
   private int[] P08JP2_A483ForColNum ;
   private String[] P08JP2_A482ForColNom ;
   private String[] P08JP2_A5742ForSerDsc ;
   private boolean[] P08JP2_n5742ForSerDsc ;
   private String[] P08JP2_A494ForSer ;
   private String[] P08JP2_A279CliNom ;
   private int[] P08JP2_A252CliCod ;
   private java.util.Date[] P08JP2_A485ForFec ;
   private boolean[] P08JP2_n485ForFec ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc3[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV55ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV56ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV57ColumnsSelector_Column ;
}

final  class tmformulaswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08JP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV132Tmformulaswwds_1_forfec ,
                                          java.util.Date AV133Tmformulaswwds_2_forfec_to ,
                                          String AV134Tmformulaswwds_3_filterfulltext ,
                                          int AV135Tmformulaswwds_4_tfclicod ,
                                          int AV136Tmformulaswwds_5_tfclicod_to ,
                                          String AV138Tmformulaswwds_7_tfclinom_sel ,
                                          String AV137Tmformulaswwds_6_tfclinom ,
                                          String AV140Tmformulaswwds_9_tfforser_sel ,
                                          String AV139Tmformulaswwds_8_tfforser ,
                                          String AV142Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV141Tmformulaswwds_10_tfforserdsc ,
                                          String AV144Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV143Tmformulaswwds_12_tfforcolnom ,
                                          int AV145Tmformulaswwds_14_tfforcolnum ,
                                          int AV146Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV148Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV147Tmformulaswwds_16_tffornomcli ,
                                          byte AV149Tmformulaswwds_18_tftipcolcod ,
                                          byte AV150Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV152Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV151Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV153Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV154Tmformulaswwds_23_tfforultuti ,
                                          int AV155Tmformulaswwds_24_tffornumcol ,
                                          int AV156Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV157Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV158Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[37];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T2.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom," ;
      scmdbuf += " T1.CliCod, T1.ForFec FROM ((TXPCFORMU T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
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
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV135Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV136Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV137Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV139Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV145Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV147Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV149Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV150Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV153Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV154Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV155Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV156Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
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
                  return conditional_P08JP2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08JP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               return;
      }
   }

}

