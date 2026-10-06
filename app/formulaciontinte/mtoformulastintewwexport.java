package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtoformulastintewwexport extends GXProcedure
{
   public mtoformulastintewwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastintewwexport.class ), "" );
   }

   public mtoformulastintewwexport( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mtoformulastintewwexport.this.aP1 = new String[] {""};
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
      mtoformulastintewwexport.this.aP0 = aP0;
      mtoformulastintewwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "MtoFormulasTinteWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV40TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCliNom, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFForSer_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFForSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFForSer, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFForSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFForSerDsc_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFForSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFForSerDsc, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV72TFForTipArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFForTipArtDsc_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFForTipArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFForTipArtDsc, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV46TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFForColNom_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFForColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFForColNom, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFForNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFForNomCli_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFForNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFForNomCli, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV51TFTipColCod) && (0==AV52TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFTipColDsc_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFTipColDsc, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFForUltUti)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFForUltUti_To)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Ult Uti", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV57TFForUltUti );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV58TFForUltUti_To );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV59TFForNumCol) && (0==AV60TFForNumCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Formula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV59TFForNumCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV60TFForNumCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV74TFForTonal_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFForTonal_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV73TFForTonal)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV73TFForTonal, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFForRelBan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFForRelBan_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "RB", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFForRelBan)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62TFForRelBan_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV76TFForOpcCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Op", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFForOpcCli_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFForOpcCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Op", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFForOpcCli, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFIntDsc_Sel, GXv_char5) ;
         mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFIntDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFIntDsc, GXv_char5) ;
            mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV79TFForPro_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Prov?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV79TFForPro_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV79TFForPro_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( ( AV88TFForBlo_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Bloq?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mtoformulastintewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV63i = 1 ;
         AV94GXV1 = 1 ;
         while ( AV94GXV1 <= AV88TFForBlo_Sels.size() )
         {
            AV89TFForBlo_Sel = (String)AV88TFForBlo_Sels.elementAt(-1+AV94GXV1) ;
            if ( AV63i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV89TFForBlo_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV89TFForBlo_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV63i = (long)(AV63i+1) ;
            AV94GXV1 = (int)(AV94GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV34VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.MtoFormulasTinteWWColumnsSelector"), "") != 0 )
      {
         AV29ColumnsSelectorXML = AV21Session.getValue("FormulacionTinte.MtoFormulasTinteWWColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV29ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV95GXV2 = 1 ;
      while ( AV95GXV2 <= AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV28ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV95GXV2));
         if ( AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV28ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setColor( 11 );
            AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
         }
         AV95GXV2 = (int)(AV95GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV20FilterFullText ;
      AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV39TFCliNom ;
      AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV40TFCliNom_Sel ;
      AV100Formulaciontinte_mtoformulastintewwds_4_tfforser = AV41TFForSer ;
      AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV42TFForSer_Sel ;
      AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV43TFForSerDsc ;
      AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV44TFForSerDsc_Sel ;
      AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV71TFForTipArtDsc ;
      AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV72TFForTipArtDsc_Sel ;
      AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV45TFForColNom ;
      AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV46TFForColNom_Sel ;
      AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV49TFForNomCli ;
      AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV50TFForNomCli_Sel ;
      AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV51TFTipColCod ;
      AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV52TFTipColCod_To ;
      AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV53TFTipColDsc ;
      AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV54TFTipColDsc_Sel ;
      AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV57TFForUltUti ;
      AV115Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV58TFForUltUti_To ;
      AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV59TFForNumCol ;
      AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV60TFForNumCol_To ;
      AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV73TFForTonal ;
      AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV74TFForTonal_Sel ;
      AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV61TFForRelBan ;
      AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV62TFForRelBan_To ;
      AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV75TFForOpcCli ;
      AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV76TFForOpcCli_Sel ;
      AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV77TFIntDsc ;
      AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV78TFIntDsc_Sel ;
      AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV79TFForPro_Sel ;
      AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV88TFForBlo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV100Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV18ForFec ,
                                           AV91ForFecto ,
                                           Integer.valueOf(AV84CliCodform) ,
                                           Integer.valueOf(AV85CliCodto) ,
                                           Integer.valueOf(AV86Forcolnum) ,
                                           AV90ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV98Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV100Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV100Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV118Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor P095H2 */
      pr_default.execute(0, new Object[] {AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV98Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV100Formulaciontinte_mtoformulastintewwds_4_tfforser, AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV118Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV18ForFec, AV91ForFecto, Integer.valueOf(AV84CliCodform), Integer.valueOf(AV85CliCodto), Integer.valueOf(AV86Forcolnum), AV90ForColNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P095H2_A583IntCod[0] ;
         A4384ForTipArt = P095H2_A4384ForTipArt[0] ;
         n4384ForTipArt = P095H2_n4384ForTipArt[0] ;
         A485ForFec = P095H2_A485ForFec[0] ;
         n485ForFec = P095H2_n485ForFec[0] ;
         A10045CliAct = P095H2_A10045CliAct[0] ;
         A483ForColNum = P095H2_A483ForColNum[0] ;
         A252CliCod = P095H2_A252CliCod[0] ;
         A2749ForPro = P095H2_A2749ForPro[0] ;
         n2749ForPro = P095H2_n2749ForPro[0] ;
         A584IntDsc = P095H2_A584IntDsc[0] ;
         n584IntDsc = P095H2_n584IntDsc[0] ;
         A3560ForOpcCli = P095H2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P095H2_n3560ForOpcCli[0] ;
         A2838ForRelBan = P095H2_A2838ForRelBan[0] ;
         n2838ForRelBan = P095H2_n2838ForRelBan[0] ;
         A995ForTonal = P095H2_A995ForTonal[0] ;
         n995ForTonal = P095H2_n995ForTonal[0] ;
         A486ForNumCol = P095H2_A486ForNumCol[0] ;
         A496ForUltUti = P095H2_A496ForUltUti[0] ;
         n496ForUltUti = P095H2_n496ForUltUti[0] ;
         A832TipColDsc = P095H2_A832TipColDsc[0] ;
         n832TipColDsc = P095H2_n832TipColDsc[0] ;
         A831TipColCod = P095H2_A831TipColCod[0] ;
         A1191ForNomCli = P095H2_A1191ForNomCli[0] ;
         n1191ForNomCli = P095H2_n1191ForNomCli[0] ;
         A482ForColNom = P095H2_A482ForColNom[0] ;
         A5742ForSerDsc = P095H2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P095H2_n5742ForSerDsc[0] ;
         A494ForSer = P095H2_A494ForSer[0] ;
         A279CliNom = P095H2_A279CliNom[0] ;
         A7781ForBlo = P095H2_A7781ForBlo[0] ;
         n7781ForBlo = P095H2_n7781ForBlo[0] ;
         A396EmprCod = P095H2_A396EmprCod[0] ;
         A13929ForTipArtD = P095H2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095H2_n13929ForTipArtD[0] ;
         A10045CliAct = P095H2_A10045CliAct[0] ;
         A279CliNom = P095H2_A279CliNom[0] ;
         A584IntDsc = P095H2_A584IntDsc[0] ;
         n584IntDsc = P095H2_n584IntDsc[0] ;
         A832TipColDsc = P095H2_A832TipColDsc[0] ;
         n832TipColDsc = P095H2_n832TipColDsc[0] ;
         A13929ForTipArtD = P095H2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P095H2_n13929ForTipArtD[0] ;
         if ( (GXutil.strcmp("", AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) ) )
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
            AV34VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13929ForTipArtD, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1191ForNomCli, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A485ForFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A496ForUltUti );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( A486ForNumCol );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A995ForTonal, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A2838ForRelBan)) );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A3560ForOpcCli, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A584IntDsc, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2749ForPro, GXv_char5) ;
               mtoformulastintewwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_int7 = AV80Num_hdrs ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int8[0] = A252CliCod ;
               GXv_char9[0] = A494ForSer ;
               GXv_char10[0] = A482ForColNom ;
               GXv_int11[0] = A483ForColNum ;
               GXv_int12[0] = A831TipColCod ;
               GXv_int13[0] = GXt_int7 ;
               new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_int13) ;
               mtoformulastintewwexport.this.A396EmprCod = GXv_char5[0] ;
               mtoformulastintewwexport.this.A252CliCod = GXv_int8[0] ;
               mtoformulastintewwexport.this.A494ForSer = GXv_char9[0] ;
               mtoformulastintewwexport.this.A482ForColNom = GXv_char10[0] ;
               mtoformulastintewwexport.this.A483ForColNum = GXv_int11[0] ;
               mtoformulastintewwexport.this.A831TipColCod = GXv_int12[0] ;
               mtoformulastintewwexport.this.GXt_int7 = GXv_int13[0] ;
               AV80Num_hdrs = (short)(GXt_int7) ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( AV80Num_hdrs );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_int7 = AV83Num_hdrsH ;
               GXv_int13[0] = GXt_int7 ;
               new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int13) ;
               mtoformulastintewwexport.this.GXt_int7 = GXv_int13[0] ;
               AV83Num_hdrsH = GXt_int7 ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV34VisibleColumnCount), 1, 1).setNumber( AV83Num_hdrsH );
               AV34VisibleColumnCount = (long)(AV34VisibleColumnCount+1) ;
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
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForSer", "", "Articulo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForSerDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForTipArtDsc", "", "Tipo de Articulo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForColNom", "", "Color", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForColNum", "", "Numero", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForNomCli", "", "Color Cliente", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipColCod", "", "Tc", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "TipColDsc", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForFec", "", "Fecha Formula", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForUltUti", "", "Fecha Ult Uti", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForNumCol", "", "Nº Formula", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForTonal", "", "Coleccion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForRelBan", "", "RB", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForOpcCli", "", "Op", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "IntDsc", "", "Intensidad", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForPro", "", "Prov?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "ForBlo", "", "Bloq?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Num_hdrs", "", "Prd.?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Listado", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&Num_hdrsH", "", "Hist.?", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&ListadoH", "", "", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV30UserCustomValue ;
      GXv_char10[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinteWWColumnsSelector", GXv_char10) ;
      mtoformulastintewwexport.this.GXt_char4 = GXv_char10[0] ;
      AV30UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV30UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV30UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.MtoFormulasTinteWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.MtoFormulasTinteWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FormulacionTinte.MtoFormulasTinteWWGridState"), null, null);
      }
      AV16OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV128GXV3 = 1 ;
      while ( AV128GXV3 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV3));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV39TFCliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV40TFCliNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV41TFForSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV42TFForSer_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV43TFForSerDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV44TFForSerDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV71TFForTipArtDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV72TFForTipArtDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV45TFForColNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV46TFForColNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV49TFForNomCli = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV50TFForNomCli_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV51TFTipColCod = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFTipColCod_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV53TFTipColDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV54TFTipColDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV57TFForUltUti = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV58TFForUltUti_To = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV59TFForNumCol = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFForNumCol_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV73TFForTonal = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL_SEL") == 0 )
         {
            AV74TFForTonal_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV61TFForRelBan = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFForRelBan_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI") == 0 )
         {
            AV75TFForOpcCli = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI_SEL") == 0 )
         {
            AV76TFForOpcCli_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV77TFIntDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV78TFIntDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRO_SEL") == 0 )
         {
            AV79TFForPro_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV87TFForBlo_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV88TFForBlo_Sels.fromJSonString(AV87TFForBlo_SelsJson, null);
         }
         AV128GXV3 = (int)(AV128GXV3+1) ;
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
      this.aP0[0] = mtoformulastintewwexport.this.AV11Filename;
      this.aP1[0] = mtoformulastintewwexport.this.AV12ErrorMessage;
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
      AV20FilterFullText = "" ;
      AV40TFCliNom_Sel = "" ;
      AV39TFCliNom = "" ;
      AV42TFForSer_Sel = "" ;
      AV41TFForSer = "" ;
      AV44TFForSerDsc_Sel = "" ;
      AV43TFForSerDsc = "" ;
      AV72TFForTipArtDsc_Sel = "" ;
      AV71TFForTipArtDsc = "" ;
      AV46TFForColNom_Sel = "" ;
      AV45TFForColNom = "" ;
      AV50TFForNomCli_Sel = "" ;
      AV49TFForNomCli = "" ;
      AV54TFTipColDsc_Sel = "" ;
      AV53TFTipColDsc = "" ;
      AV57TFForUltUti = GXutil.nullDate() ;
      AV58TFForUltUti_To = GXutil.nullDate() ;
      AV74TFForTonal_Sel = "" ;
      AV73TFForTonal = "" ;
      AV61TFForRelBan = DecimalUtil.ZERO ;
      AV62TFForRelBan_To = DecimalUtil.ZERO ;
      AV76TFForOpcCli_Sel = "" ;
      AV75TFForOpcCli = "" ;
      AV78TFIntDsc_Sel = "" ;
      AV77TFIntDsc = "" ;
      AV79TFForPro_Sel = "" ;
      AV88TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV89TFForBlo_Sel = "" ;
      AV21Session = httpContext.getWebSession();
      AV29ColumnsSelectorXML = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A995ForTonal = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3560ForOpcCli = "" ;
      A584IntDsc = "" ;
      A2749ForPro = "" ;
      A7781ForBlo = "" ;
      A396EmprCod = "" ;
      AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext = "" ;
      AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = "" ;
      AV100Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = "" ;
      AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = "" ;
      AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = "" ;
      AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = "" ;
      AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = "" ;
      AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = "" ;
      AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti = GXutil.nullDate() ;
      AV115Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = GXutil.nullDate() ;
      AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = "" ;
      AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban = DecimalUtil.ZERO ;
      AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = DecimalUtil.ZERO ;
      AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = "" ;
      AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = "" ;
      AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = "" ;
      AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      scmdbuf = "" ;
      lV98Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      lV100Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      lV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      lV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      lV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      lV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      lV118Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      lV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      lV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      AV18ForFec = GXutil.nullDate() ;
      AV91ForFecto = GXutil.nullDate() ;
      AV90ForColNom = "" ;
      A10045CliAct = "" ;
      P095H2_A829TipArtCod = new short[1] ;
      P095H2_A583IntCod = new byte[1] ;
      P095H2_A4384ForTipArt = new short[1] ;
      P095H2_n4384ForTipArt = new boolean[] {false} ;
      P095H2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P095H2_n485ForFec = new boolean[] {false} ;
      P095H2_A10045CliAct = new String[] {""} ;
      P095H2_A483ForColNum = new int[1] ;
      P095H2_A252CliCod = new int[1] ;
      P095H2_A2749ForPro = new String[] {""} ;
      P095H2_n2749ForPro = new boolean[] {false} ;
      P095H2_A584IntDsc = new String[] {""} ;
      P095H2_n584IntDsc = new boolean[] {false} ;
      P095H2_A3560ForOpcCli = new String[] {""} ;
      P095H2_n3560ForOpcCli = new boolean[] {false} ;
      P095H2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095H2_n2838ForRelBan = new boolean[] {false} ;
      P095H2_A995ForTonal = new String[] {""} ;
      P095H2_n995ForTonal = new boolean[] {false} ;
      P095H2_A486ForNumCol = new int[1] ;
      P095H2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P095H2_n496ForUltUti = new boolean[] {false} ;
      P095H2_A832TipColDsc = new String[] {""} ;
      P095H2_n832TipColDsc = new boolean[] {false} ;
      P095H2_A831TipColCod = new byte[1] ;
      P095H2_A1191ForNomCli = new String[] {""} ;
      P095H2_n1191ForNomCli = new boolean[] {false} ;
      P095H2_A482ForColNom = new String[] {""} ;
      P095H2_A5742ForSerDsc = new String[] {""} ;
      P095H2_n5742ForSerDsc = new boolean[] {false} ;
      P095H2_A494ForSer = new String[] {""} ;
      P095H2_A279CliNom = new String[] {""} ;
      P095H2_A7781ForBlo = new String[] {""} ;
      P095H2_n7781ForBlo = new boolean[] {false} ;
      P095H2_A396EmprCod = new String[] {""} ;
      P095H2_A13929ForTipArtD = new String[] {""} ;
      P095H2_n13929ForTipArtD = new boolean[] {false} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new int[1] ;
      AV30UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char10 = new String[1] ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV87TFForBlo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastintewwexport__default(),
         new Object[] {
             new Object[] {
            P095H2_A829TipArtCod, P095H2_A583IntCod, P095H2_A4384ForTipArt, P095H2_n4384ForTipArt, P095H2_A485ForFec, P095H2_n485ForFec, P095H2_A10045CliAct, P095H2_A483ForColNum, P095H2_A252CliCod, P095H2_A2749ForPro,
            P095H2_n2749ForPro, P095H2_A584IntDsc, P095H2_n584IntDsc, P095H2_A3560ForOpcCli, P095H2_n3560ForOpcCli, P095H2_A2838ForRelBan, P095H2_n2838ForRelBan, P095H2_A995ForTonal, P095H2_n995ForTonal, P095H2_A486ForNumCol,
            P095H2_A496ForUltUti, P095H2_n496ForUltUti, P095H2_A832TipColDsc, P095H2_n832TipColDsc, P095H2_A831TipColCod, P095H2_A1191ForNomCli, P095H2_n1191ForNomCli, P095H2_A482ForColNom, P095H2_A5742ForSerDsc, P095H2_n5742ForSerDsc,
            P095H2_A494ForSer, P095H2_A279CliNom, P095H2_A7781ForBlo, P095H2_n7781ForBlo, P095H2_A396EmprCod, P095H2_A13929ForTipArtD, P095H2_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51TFTipColCod ;
   private byte AV52TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ;
   private byte AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ;
   private byte A583IntCod ;
   private byte GXv_int12[] ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A4384ForTipArt ;
   private short AV80Num_hdrs ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV59TFForNumCol ;
   private int AV60TFForNumCol_To ;
   private int AV94GXV1 ;
   private int AV95GXV2 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol ;
   private int AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ;
   private int AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ;
   private int AV84CliCodform ;
   private int AV85CliCodto ;
   private int AV86Forcolnum ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int AV83Num_hdrsH ;
   private int GXt_int7 ;
   private int GXv_int13[] ;
   private int AV128GXV3 ;
   private long AV63i ;
   private long AV34VisibleColumnCount ;
   private java.math.BigDecimal AV61TFForRelBan ;
   private java.math.BigDecimal AV62TFForRelBan_To ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban ;
   private java.math.BigDecimal AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ;
   private String AV40TFCliNom_Sel ;
   private String AV39TFCliNom ;
   private String AV42TFForSer_Sel ;
   private String AV41TFForSer ;
   private String AV44TFForSerDsc_Sel ;
   private String AV43TFForSerDsc ;
   private String AV72TFForTipArtDsc_Sel ;
   private String AV71TFForTipArtDsc ;
   private String AV46TFForColNom_Sel ;
   private String AV45TFForColNom ;
   private String AV50TFForNomCli_Sel ;
   private String AV49TFForNomCli ;
   private String AV54TFTipColDsc_Sel ;
   private String AV53TFTipColDsc ;
   private String AV74TFForTonal_Sel ;
   private String AV73TFForTonal ;
   private String AV76TFForOpcCli_Sel ;
   private String AV75TFForOpcCli ;
   private String AV78TFIntDsc_Sel ;
   private String AV77TFIntDsc ;
   private String AV79TFForPro_Sel ;
   private String AV89TFForBlo_Sel ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A13929ForTipArtD ;
   private String A482ForColNom ;
   private String A1191ForNomCli ;
   private String A832TipColDsc ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
   private String A584IntDsc ;
   private String A2749ForPro ;
   private String A7781ForBlo ;
   private String A396EmprCod ;
   private String AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ;
   private String AV100Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ;
   private String AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ;
   private String AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ;
   private String AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ;
   private String AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ;
   private String AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ;
   private String AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ;
   private String AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ;
   private String AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ;
   private String AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ;
   private String lV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String scmdbuf ;
   private String lV98Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String lV100Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String lV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String lV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String lV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String lV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String lV118Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String lV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String lV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String AV90ForColNom ;
   private String A10045CliAct ;
   private String GXv_char5[] ;
   private String GXv_char9[] ;
   private String GXt_char4 ;
   private String GXv_char10[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV57TFForUltUti ;
   private java.util.Date AV58TFForUltUti_To ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti ;
   private java.util.Date AV115Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to ;
   private java.util.Date AV18ForFec ;
   private java.util.Date AV91ForFecto ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n4384ForTipArt ;
   private boolean n485ForFec ;
   private boolean n2749ForPro ;
   private boolean n584IntDsc ;
   private boolean n3560ForOpcCli ;
   private boolean n2838ForRelBan ;
   private boolean n995ForTonal ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private String AV29ColumnsSelectorXML ;
   private String AV30UserCustomValue ;
   private String AV87TFForBlo_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private GXSimpleCollection<String> AV88TFForBlo_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P095H2_A829TipArtCod ;
   private byte[] P095H2_A583IntCod ;
   private short[] P095H2_A4384ForTipArt ;
   private boolean[] P095H2_n4384ForTipArt ;
   private java.util.Date[] P095H2_A485ForFec ;
   private boolean[] P095H2_n485ForFec ;
   private String[] P095H2_A10045CliAct ;
   private int[] P095H2_A483ForColNum ;
   private int[] P095H2_A252CliCod ;
   private String[] P095H2_A2749ForPro ;
   private boolean[] P095H2_n2749ForPro ;
   private String[] P095H2_A584IntDsc ;
   private boolean[] P095H2_n584IntDsc ;
   private String[] P095H2_A3560ForOpcCli ;
   private boolean[] P095H2_n3560ForOpcCli ;
   private java.math.BigDecimal[] P095H2_A2838ForRelBan ;
   private boolean[] P095H2_n2838ForRelBan ;
   private String[] P095H2_A995ForTonal ;
   private boolean[] P095H2_n995ForTonal ;
   private int[] P095H2_A486ForNumCol ;
   private java.util.Date[] P095H2_A496ForUltUti ;
   private boolean[] P095H2_n496ForUltUti ;
   private String[] P095H2_A832TipColDsc ;
   private boolean[] P095H2_n832TipColDsc ;
   private byte[] P095H2_A831TipColCod ;
   private String[] P095H2_A1191ForNomCli ;
   private boolean[] P095H2_n1191ForNomCli ;
   private String[] P095H2_A482ForColNom ;
   private String[] P095H2_A5742ForSerDsc ;
   private boolean[] P095H2_n5742ForSerDsc ;
   private String[] P095H2_A494ForSer ;
   private String[] P095H2_A279CliNom ;
   private String[] P095H2_A7781ForBlo ;
   private boolean[] P095H2_n7781ForBlo ;
   private String[] P095H2_A396EmprCod ;
   private String[] P095H2_A13929ForTipArtD ;
   private boolean[] P095H2_n13929ForTipArtD ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV28ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class mtoformulastintewwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV100Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV18ForFec ,
                                          java.util.Date AV91ForFecto ,
                                          int AV84CliCodform ,
                                          int AV85CliCodto ,
                                          int AV86Forcolnum ,
                                          String AV90ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV97Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV105Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV104Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[38];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.IntCod, T1.ForTipArt, T1.ForFec, T2.CliAct, T1.ForColNum, T1.CliCod, T1.ForPro, T3.IntDsc, T1.ForOpcCli, T1.ForRelBan, T1.ForTonal, T1.ForNumCol," ;
      scmdbuf += " T1.ForUltUti, T4.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.ForBlo, T1.EmprCod, COALESCE( T5.TipArtDsc, ' ') AS" ;
      scmdbuf += " ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV100Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV116Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (0==AV117Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV118Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV122Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV84CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV85CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (0==AV86Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ForFec DESC" ;
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
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
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
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPro" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P095H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               ((String[]) buf[25])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 13);
               ((String[]) buf[28])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 16);
               ((String[]) buf[31])[0] = rslt.getString(21, 30);
               ((String[]) buf[32])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(23, 3);
               ((String[]) buf[35])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               return;
      }
   }

}

