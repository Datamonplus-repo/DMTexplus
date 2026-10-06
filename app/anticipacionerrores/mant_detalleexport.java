package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_detalleexport extends GXProcedure
{
   public mant_detalleexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_detalleexport.class ), "" );
   }

   public mant_detalleexport( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      mant_detalleexport.this.aP1 = new String[] {""};
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
      mant_detalleexport.this.aP0 = aP0;
      mant_detalleexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "MAnt_DetalleExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFMADetFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFMADetFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFMADetEmprCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFMADetEmprCod_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFMADetEmprCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Empresa", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFMADetEmprCod, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFMADetCliCod) && (0==AV41TFMADetCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFMADetCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFMADetCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFMADetCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFMADetCliNom_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFMADetCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFMADetCliNom, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFMADetArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFMADetArtCod_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFMADetArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFMADetArtCod, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV83TFMADetArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV83TFMADetArtDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV82TFMADetArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV82TFMADetArtDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV50TFMADetColNum) && (0==AV51TFMADetColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nro.Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV50TFMADetColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV51TFMADetColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFMADetColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFMADetColNom_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFMADetColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFMADetColNom, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV52TFMADetColCod) && (0==AV53TFMADetColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Colorante", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV52TFMADetColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV53TFMADetColCod_To );
      }
      if ( ! ( (0==AV54TFMADetMatCod) && (0==AV55TFMADetMatCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód Matiz", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFMADetMatCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFMADetMatCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV86TFMADetMatDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matiz", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFMADetMatDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV85TFMADetMatDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matiz", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFMADetMatDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV58TFMADetIntCod) && (0==AV59TFMADetIntCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV58TFMADetIntCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV59TFMADetIntCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV88TFMADetIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV88TFMADetIntDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV87TFMADetIntDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV87TFMADetIntDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV63TFMADetMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFMADetMaqCod_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFMADetMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód. máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFMADetMaqCod, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV65TFMADetMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFMADetMaqDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV64TFMADetMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFMADetMaqDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFMADetTipMCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFMADetTipMCod_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFMADetTipMCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cód.  Tipo Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFMADetTipMCod, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFMADetTipMDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFMADetTipMDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFMADetTipMDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFMADetTipMDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV100TFMADetDefCod) && (0==AV101TFMADetDefCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV100TFMADetDefCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV101TFMADetDefCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV103TFMADetDefDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV103TFMADetDefDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV102TFMADetDefDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Defecto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFMADetDefDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV104TFMADetCatCod) && (0==AV105TFMADetCatCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Categoria Defecto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV104TFMADetCatCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV105TFMADetCatCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV107TFMADetCatDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Categoria", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV107TFMADetCatDsc_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV106TFMADetCatDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Categoria", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV106TFMADetCatDsc, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV110TFMADetHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HDR", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV110TFMADetHdr_Sel, GXv_char5) ;
         mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV109TFMADetHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "HDR", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV109TFMADetHdr, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFMADetKilProd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFMADetKilProd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV70TFMADetKilProd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV71TFMADetKilProd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFMADetKilReo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFMADetKilReo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Reoperados", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72TFMADetKilReo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFMADetKilReo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFMADetKilTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFMADetKilTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kilos Total", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV90TFMADetKilTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV91TFMADetKilTot_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113TFMADetMetProd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114TFMADetMetProd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Produccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV113TFMADetMetProd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV114TFMADetMetProd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115TFMADetMetReo)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116TFMADetMetReo_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Reoperados", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV115TFMADetMetReo)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV116TFMADetMetReo_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117TFMADetMetTot)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118TFMADetMetTot_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Metros Total", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV117TFMADetMetTot)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         mant_detalleexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV118TFMADetMetTot_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAnt_DetalleColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AnticipacionErrores.MAnt_DetalleColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV121GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV123Anticipacionerrores_mant_detalleds_1_filterfulltext = AV18FilterFullText ;
      AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec = AV36TFMADetFec ;
      AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = AV38TFMADetEmprCod ;
      AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = AV39TFMADetEmprCod_Sel ;
      AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod = AV40TFMADetCliCod ;
      AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to = AV41TFMADetCliCod_To ;
      AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom = AV42TFMADetCliNom ;
      AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = AV43TFMADetCliNom_Sel ;
      AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod = AV44TFMADetArtCod ;
      AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = AV45TFMADetArtCod_Sel ;
      AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = AV82TFMADetArtDsc ;
      AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = AV83TFMADetArtDsc_Sel ;
      AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum = AV50TFMADetColNum ;
      AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to = AV51TFMADetColNum_To ;
      AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = AV48TFMADetColNom ;
      AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = AV49TFMADetColNom_Sel ;
      AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod = AV52TFMADetColCod ;
      AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to = AV53TFMADetColCod_To ;
      AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod = AV54TFMADetMatCod ;
      AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to = AV55TFMADetMatCod_To ;
      AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = AV85TFMADetMatDsc ;
      AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = AV86TFMADetMatDsc_Sel ;
      AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod = AV58TFMADetIntCod ;
      AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to = AV59TFMADetIntCod_To ;
      AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = AV87TFMADetIntDsc ;
      AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = AV88TFMADetIntDsc_Sel ;
      AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = AV62TFMADetMaqCod ;
      AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = AV63TFMADetMaqCod_Sel ;
      AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = AV64TFMADetMaqDsc ;
      AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = AV65TFMADetMaqDsc_Sel ;
      AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = AV66TFMADetTipMCod ;
      AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = AV67TFMADetTipMCod_Sel ;
      AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = AV68TFMADetTipMDsc ;
      AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = AV69TFMADetTipMDsc_Sel ;
      AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod = AV100TFMADetDefCod ;
      AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to = AV101TFMADetDefCod_To ;
      AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = AV102TFMADetDefDsc ;
      AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = AV103TFMADetDefDsc_Sel ;
      AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod = AV104TFMADetCatCod ;
      AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to = AV105TFMADetCatCod_To ;
      AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = AV106TFMADetCatDsc ;
      AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = AV107TFMADetCatDsc_Sel ;
      AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr = AV109TFMADetHdr ;
      AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = AV110TFMADetHdr_Sel ;
      AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = AV70TFMADetKilProd ;
      AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = AV71TFMADetKilProd_To ;
      AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = AV72TFMADetKilReo ;
      AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = AV73TFMADetKilReo_To ;
      AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = AV90TFMADetKilTot ;
      AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = AV91TFMADetKilTot_To ;
      AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = AV113TFMADetMetProd ;
      AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = AV114TFMADetMetProd_To ;
      AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = AV115TFMADetMetReo ;
      AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = AV116TFMADetMetReo_To ;
      AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot = AV117TFMADetMetTot ;
      AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = AV118TFMADetMetTot_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14590MADetTipMC ,
                                           AV84TipMaqCodCollection ,
                                           AV123Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                           AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                           AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                           AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                           Integer.valueOf(AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod) ,
                                           Integer.valueOf(AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) ,
                                           AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                           AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                           AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                           AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                           AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                           AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                           Integer.valueOf(AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) ,
                                           Integer.valueOf(AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) ,
                                           AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                           AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                           Byte.valueOf(AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) ,
                                           Byte.valueOf(AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) ,
                                           Short.valueOf(AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) ,
                                           Short.valueOf(AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) ,
                                           AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                           AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                           Byte.valueOf(AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod) ,
                                           Byte.valueOf(AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) ,
                                           AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                           AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                           AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                           AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                           AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                           AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                           AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                           AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                           AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                           AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                           Short.valueOf(AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) ,
                                           Short.valueOf(AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) ,
                                           AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                           AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                           Short.valueOf(AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) ,
                                           Short.valueOf(AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) ,
                                           AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                           AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                           AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                           AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                           AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                           AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                           AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                           AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                           AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                           AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                           AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                           AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                           AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                           AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                           AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                           AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                           AV77ArtCod ,
                                           Integer.valueOf(AV78ForColNum) ,
                                           AV108MADetMaqCod ,
                                           Integer.valueOf(AV84TipMaqCodCollection.size()) ,
                                           Short.valueOf(AV96MADetDefCod) ,
                                           Short.valueOf(AV97MADetCatCod) ,
                                           A14587MADetEmprC ,
                                           Integer.valueOf(A14585MADetCliCo) ,
                                           A14651MADetCliNo ,
                                           A14588MADetArtCo ,
                                           A14652MADetArtDs ,
                                           Integer.valueOf(A14589MADetColNu) ,
                                           A14653MADetColNo ,
                                           Byte.valueOf(A14654MADetColCo) ,
                                           Short.valueOf(A14592MADetMatCo) ,
                                           A14655MADetMatDs ,
                                           Byte.valueOf(A14593MADetIntCo) ,
                                           A14660MADetIntDs ,
                                           A14591MADetMaqCo ,
                                           A14656MADetMaqDs ,
                                           A14657MADetTipMD ,
                                           Short.valueOf(A14662MADetDefCo) ,
                                           A14663MADetDefDs ,
                                           Short.valueOf(A14664MADetCatCo) ,
                                           A14665MADetCatDs ,
                                           Integer.valueOf(A14666MADetBarCo) ,
                                           Byte.valueOf(A14667MADetBarRe) ,
                                           A14668MADetBarPa ,
                                           A14658MADetKilPr ,
                                           A14659MADetKilRe ,
                                           A14661MADetKilTo ,
                                           A14670MADetMetPr ,
                                           A14671MADetMetRe ,
                                           A14672MADetMetTo ,
                                           A14586MADetFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV75MADetEmprCod ,
                                           AV89sdtMTok.getgxTv_SdtsdtMTok_Mtkn() ,
                                           AV89sdtMTok.getgxTv_SdtsdtMTok_Mtknusu() ,
                                           Integer.valueOf(AV76CliCod) ,
                                           A14583MADetTkn ,
                                           A14584MADetUsu } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV123Anticipacionerrores_mant_detalleds_1_filterfulltext), "%", "") ;
      lV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = GXutil.padr( GXutil.rtrim( AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod), 3, "%") ;
      lV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom = GXutil.concat( GXutil.rtrim( AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom), "%", "") ;
      lV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod = GXutil.padr( GXutil.rtrim( AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod), 16, "%") ;
      lV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = GXutil.concat( GXutil.rtrim( AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc), "%", "") ;
      lV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = GXutil.padr( GXutil.rtrim( AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom), 13, "%") ;
      lV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = GXutil.concat( GXutil.rtrim( AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc), "%", "") ;
      lV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = GXutil.concat( GXutil.rtrim( AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc), "%", "") ;
      lV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = GXutil.padr( GXutil.rtrim( AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod), 6, "%") ;
      lV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = GXutil.concat( GXutil.rtrim( AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc), "%", "") ;
      lV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = GXutil.padr( GXutil.rtrim( AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod), 4, "%") ;
      lV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = GXutil.concat( GXutil.rtrim( AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc), "%", "") ;
      lV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = GXutil.concat( GXutil.rtrim( AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc), "%", "") ;
      lV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = GXutil.concat( GXutil.rtrim( AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc), "%", "") ;
      lV165Anticipacionerrores_mant_detalleds_43_tfmadethdr = GXutil.padr( GXutil.rtrim( AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr), 10, "%") ;
      /* Using cursor P0AUM2 */
      pr_default.execute(0, new Object[] {AV89sdtMTok.getgxTv_SdtsdtMTok_Mtkn(), AV89sdtMTok.getgxTv_SdtsdtMTok_Mtknusu(), Integer.valueOf(AV76CliCod), AV75MADetEmprCod, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, lV123Anticipacionerrores_mant_detalleds_1_filterfulltext, AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec, lV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod, AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel, Integer.valueOf(AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod), Integer.valueOf(AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to), lV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom, AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel, lV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod, AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel, lV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc, AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel, Integer.valueOf(AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum), Integer.valueOf(AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to), lV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom, AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel, Byte.valueOf(AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod), Byte.valueOf(AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to), Short.valueOf(AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod), Short.valueOf(AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to), lV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc, AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel, Byte.valueOf(AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod), Byte.valueOf(AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to), lV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc, AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel, lV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod, AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel, lV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc, AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel, lV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod, AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel, lV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc, AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel, Short.valueOf(AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod), Short.valueOf(AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to), lV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc, AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel, Short.valueOf(AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod), Short.valueOf(AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to), lV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc, AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel, lV165Anticipacionerrores_mant_detalleds_43_tfmadethdr, AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel, AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod, AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to, AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo, AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to, AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot, AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to, AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod, AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to, AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo, AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to, AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot, AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to, AV77ArtCod, Integer.valueOf(AV78ForColNum), AV108MADetMaqCod, Short.valueOf(AV96MADetDefCod), Short.valueOf(AV97MADetCatCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14583MADetTkn = P0AUM2_A14583MADetTkn[0] ;
         A14584MADetUsu = P0AUM2_A14584MADetUsu[0] ;
         A14672MADetMetTo = P0AUM2_A14672MADetMetTo[0] ;
         n14672MADetMetTo = P0AUM2_n14672MADetMetTo[0] ;
         A14671MADetMetRe = P0AUM2_A14671MADetMetRe[0] ;
         n14671MADetMetRe = P0AUM2_n14671MADetMetRe[0] ;
         A14670MADetMetPr = P0AUM2_A14670MADetMetPr[0] ;
         n14670MADetMetPr = P0AUM2_n14670MADetMetPr[0] ;
         A14661MADetKilTo = P0AUM2_A14661MADetKilTo[0] ;
         A14659MADetKilRe = P0AUM2_A14659MADetKilRe[0] ;
         A14658MADetKilPr = P0AUM2_A14658MADetKilPr[0] ;
         n14658MADetKilPr = P0AUM2_n14658MADetKilPr[0] ;
         A14665MADetCatDs = P0AUM2_A14665MADetCatDs[0] ;
         n14665MADetCatDs = P0AUM2_n14665MADetCatDs[0] ;
         A14664MADetCatCo = P0AUM2_A14664MADetCatCo[0] ;
         n14664MADetCatCo = P0AUM2_n14664MADetCatCo[0] ;
         A14663MADetDefDs = P0AUM2_A14663MADetDefDs[0] ;
         n14663MADetDefDs = P0AUM2_n14663MADetDefDs[0] ;
         A14662MADetDefCo = P0AUM2_A14662MADetDefCo[0] ;
         n14662MADetDefCo = P0AUM2_n14662MADetDefCo[0] ;
         A14657MADetTipMD = P0AUM2_A14657MADetTipMD[0] ;
         n14657MADetTipMD = P0AUM2_n14657MADetTipMD[0] ;
         A14590MADetTipMC = P0AUM2_A14590MADetTipMC[0] ;
         A14656MADetMaqDs = P0AUM2_A14656MADetMaqDs[0] ;
         n14656MADetMaqDs = P0AUM2_n14656MADetMaqDs[0] ;
         A14591MADetMaqCo = P0AUM2_A14591MADetMaqCo[0] ;
         A14660MADetIntDs = P0AUM2_A14660MADetIntDs[0] ;
         n14660MADetIntDs = P0AUM2_n14660MADetIntDs[0] ;
         A14593MADetIntCo = P0AUM2_A14593MADetIntCo[0] ;
         A14655MADetMatDs = P0AUM2_A14655MADetMatDs[0] ;
         n14655MADetMatDs = P0AUM2_n14655MADetMatDs[0] ;
         A14592MADetMatCo = P0AUM2_A14592MADetMatCo[0] ;
         A14654MADetColCo = P0AUM2_A14654MADetColCo[0] ;
         A14653MADetColNo = P0AUM2_A14653MADetColNo[0] ;
         A14589MADetColNu = P0AUM2_A14589MADetColNu[0] ;
         A14652MADetArtDs = P0AUM2_A14652MADetArtDs[0] ;
         n14652MADetArtDs = P0AUM2_n14652MADetArtDs[0] ;
         A14588MADetArtCo = P0AUM2_A14588MADetArtCo[0] ;
         A14651MADetCliNo = P0AUM2_A14651MADetCliNo[0] ;
         n14651MADetCliNo = P0AUM2_n14651MADetCliNo[0] ;
         A14585MADetCliCo = P0AUM2_A14585MADetCliCo[0] ;
         A14587MADetEmprC = P0AUM2_A14587MADetEmprC[0] ;
         A14586MADetFec = P0AUM2_A14586MADetFec[0] ;
         A14582MADetId = P0AUM2_A14582MADetId[0] ;
         A14668MADetBarPa = P0AUM2_A14668MADetBarPa[0] ;
         A14667MADetBarRe = P0AUM2_A14667MADetBarRe[0] ;
         A14666MADetBarCo = P0AUM2_A14666MADetBarCo[0] ;
         A14669MADetHdr = GXutil.trim( GXutil.str( A14666MADetBarCo, 8, 0)) + GXutil.trim( GXutil.str( A14667MADetBarRe, 1, 0)) + A14668MADetBarPa ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14586MADetFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14587MADetEmprC, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14585MADetCliCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14651MADetCliNo, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14588MADetArtCo, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14652MADetArtDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14589MADetColNu );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14653MADetColNo, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14654MADetColCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14592MADetMatCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14655MADetMatDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14593MADetIntCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14660MADetIntDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14591MADetMaqCo, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14656MADetMaqDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14590MADetTipMC, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14657MADetTipMD, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14662MADetDefCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14663MADetDefDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A14664MADetCatCo );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14665MADetCatDs, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14669MADetHdr, GXv_char5) ;
            mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14658MADetKilPr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14659MADetKilRe)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14661MADetKilTo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14670MADetMetPr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14671MADetMetRe)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14672MADetMetTo)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetEmprCod", "", "Empresa", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetCliCod", "", "Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetCliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetArtCod", "", "Artículo", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetArtDsc", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetColNum", "", "Nro.Color", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetColCod", "", "Tipo Colorante", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMatCod", "", "Cód Matiz", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMatDsc", "", "Matiz", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetIntCod", "", "Cód. Intensidad", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetIntDsc", "", "Intensidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMaqCod", "", "Cód. máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMaqDsc", "", "Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetTipMCod", "", "Cód.  Tipo Máquina", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetTipMDsc", "", "Tipo Máquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetDefCod", "", "Defecto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetDefDsc", "", "Defecto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetCatCod", "", "Categoria Defecto", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetCatDsc", "", "Categoria", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetHdr", "", "HDR", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetKilProd", "", "Kilos Produccion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetKilReo", "", "Kilos Reoperados", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetKilTot", "", "Kilos Total", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMetProd", "", "Metros Produccion", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMetReo", "", "Metros Reoperados", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MADetMetTot", "", "Metros Total", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnticipacionErrores.MAnt_DetalleColumnsSelector", GXv_char5) ;
      mant_detalleexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnticipacionErrores.MAnt_DetalleGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnticipacionErrores.MAnt_DetalleGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AnticipacionErrores.MAnt_DetalleGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV179GXV2 = 1 ;
      while ( AV179GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV179GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETFEC") == 0 )
         {
            AV36TFMADetFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETEMPRCOD") == 0 )
         {
            AV38TFMADetEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETEMPRCOD_SEL") == 0 )
         {
            AV39TFMADetEmprCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLICOD") == 0 )
         {
            AV40TFMADetCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMADetCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLINOM") == 0 )
         {
            AV42TFMADetCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCLINOM_SEL") == 0 )
         {
            AV43TFMADetCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTCOD") == 0 )
         {
            AV44TFMADetArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTCOD_SEL") == 0 )
         {
            AV45TFMADetArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTDSC") == 0 )
         {
            AV82TFMADetArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETARTDSC_SEL") == 0 )
         {
            AV83TFMADetArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNUM") == 0 )
         {
            AV50TFMADetColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFMADetColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNOM") == 0 )
         {
            AV48TFMADetColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLNOM_SEL") == 0 )
         {
            AV49TFMADetColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCOLCOD") == 0 )
         {
            AV52TFMADetColCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFMADetColCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATCOD") == 0 )
         {
            AV54TFMADetMatCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFMADetMatCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATDSC") == 0 )
         {
            AV85TFMADetMatDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMATDSC_SEL") == 0 )
         {
            AV86TFMADetMatDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTCOD") == 0 )
         {
            AV58TFMADetIntCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFMADetIntCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTDSC") == 0 )
         {
            AV87TFMADetIntDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETINTDSC_SEL") == 0 )
         {
            AV88TFMADetIntDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQCOD") == 0 )
         {
            AV62TFMADetMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQCOD_SEL") == 0 )
         {
            AV63TFMADetMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQDSC") == 0 )
         {
            AV64TFMADetMaqDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMAQDSC_SEL") == 0 )
         {
            AV65TFMADetMaqDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMCOD") == 0 )
         {
            AV66TFMADetTipMCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMCOD_SEL") == 0 )
         {
            AV67TFMADetTipMCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMDSC") == 0 )
         {
            AV68TFMADetTipMDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETTIPMDSC_SEL") == 0 )
         {
            AV69TFMADetTipMDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFCOD") == 0 )
         {
            AV100TFMADetDefCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV101TFMADetDefCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFDSC") == 0 )
         {
            AV102TFMADetDefDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETDEFDSC_SEL") == 0 )
         {
            AV103TFMADetDefDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATCOD") == 0 )
         {
            AV104TFMADetCatCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV105TFMADetCatCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATDSC") == 0 )
         {
            AV106TFMADetCatDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETCATDSC_SEL") == 0 )
         {
            AV107TFMADetCatDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETHDR") == 0 )
         {
            AV109TFMADetHdr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETHDR_SEL") == 0 )
         {
            AV110TFMADetHdr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILPROD") == 0 )
         {
            AV70TFMADetKilProd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFMADetKilProd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILREO") == 0 )
         {
            AV72TFMADetKilReo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFMADetKilReo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETKILTOT") == 0 )
         {
            AV90TFMADetKilTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV91TFMADetKilTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETPROD") == 0 )
         {
            AV113TFMADetMetProd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV114TFMADetMetProd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETREO") == 0 )
         {
            AV115TFMADetMetReo = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV116TFMADetMetReo_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMADETMETTOT") == 0 )
         {
            AV117TFMADetMetTot = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV118TFMADetMetTot_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MADETEMPRCOD") == 0 )
         {
            AV75MADetEmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV76CliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV77ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV78ForColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPMAQCODJSON") == 0 )
         {
            AV79TipMaqCodJSON = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAINICIO") == 0 )
         {
            AV80FechaInicio = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHAFIN") == 0 )
         {
            AV81FechaFin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MADETMAQCOD") == 0 )
         {
            AV108MADetMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MADETDEFCOD") == 0 )
         {
            AV96MADetDefCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MADETCATCOD") == 0 )
         {
            AV97MADetCatCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MTKNUSU") == 0 )
         {
            AV98MTknUsu = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MTKN") == 0 )
         {
            AV99MTkn = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV179GXV2 = (int)(AV179GXV2+1) ;
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
      this.aP0[0] = mant_detalleexport.this.AV11Filename;
      this.aP1[0] = mant_detalleexport.this.AV12ErrorMessage;
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
      AV36TFMADetFec = GXutil.nullDate() ;
      AV39TFMADetEmprCod_Sel = "" ;
      AV38TFMADetEmprCod = "" ;
      AV43TFMADetCliNom_Sel = "" ;
      AV42TFMADetCliNom = "" ;
      AV45TFMADetArtCod_Sel = "" ;
      AV44TFMADetArtCod = "" ;
      AV83TFMADetArtDsc_Sel = "" ;
      AV82TFMADetArtDsc = "" ;
      AV49TFMADetColNom_Sel = "" ;
      AV48TFMADetColNom = "" ;
      AV86TFMADetMatDsc_Sel = "" ;
      AV85TFMADetMatDsc = "" ;
      AV88TFMADetIntDsc_Sel = "" ;
      AV87TFMADetIntDsc = "" ;
      AV63TFMADetMaqCod_Sel = "" ;
      AV62TFMADetMaqCod = "" ;
      AV65TFMADetMaqDsc_Sel = "" ;
      AV64TFMADetMaqDsc = "" ;
      AV67TFMADetTipMCod_Sel = "" ;
      AV66TFMADetTipMCod = "" ;
      AV69TFMADetTipMDsc_Sel = "" ;
      AV68TFMADetTipMDsc = "" ;
      AV103TFMADetDefDsc_Sel = "" ;
      AV102TFMADetDefDsc = "" ;
      AV107TFMADetCatDsc_Sel = "" ;
      AV106TFMADetCatDsc = "" ;
      AV110TFMADetHdr_Sel = "" ;
      AV109TFMADetHdr = "" ;
      AV70TFMADetKilProd = DecimalUtil.ZERO ;
      AV71TFMADetKilProd_To = DecimalUtil.ZERO ;
      AV72TFMADetKilReo = DecimalUtil.ZERO ;
      AV73TFMADetKilReo_To = DecimalUtil.ZERO ;
      AV90TFMADetKilTot = DecimalUtil.ZERO ;
      AV91TFMADetKilTot_To = DecimalUtil.ZERO ;
      AV113TFMADetMetProd = DecimalUtil.ZERO ;
      AV114TFMADetMetProd_To = DecimalUtil.ZERO ;
      AV115TFMADetMetReo = DecimalUtil.ZERO ;
      AV116TFMADetMetReo_To = DecimalUtil.ZERO ;
      AV117TFMADetMetTot = DecimalUtil.ZERO ;
      AV118TFMADetMetTot_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A14586MADetFec = GXutil.nullDate() ;
      A14587MADetEmprC = "" ;
      A14651MADetCliNo = "" ;
      A14588MADetArtCo = "" ;
      A14652MADetArtDs = "" ;
      A14653MADetColNo = "" ;
      A14655MADetMatDs = "" ;
      A14660MADetIntDs = "" ;
      A14591MADetMaqCo = "" ;
      A14656MADetMaqDs = "" ;
      A14590MADetTipMC = "" ;
      A14657MADetTipMD = "" ;
      A14663MADetDefDs = "" ;
      A14665MADetCatDs = "" ;
      A14669MADetHdr = "" ;
      A14658MADetKilPr = DecimalUtil.ZERO ;
      A14659MADetKilRe = DecimalUtil.ZERO ;
      A14661MADetKilTo = DecimalUtil.ZERO ;
      A14670MADetMetPr = DecimalUtil.ZERO ;
      A14671MADetMetRe = DecimalUtil.ZERO ;
      A14672MADetMetTo = DecimalUtil.ZERO ;
      AV123Anticipacionerrores_mant_detalleds_1_filterfulltext = "" ;
      AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec = GXutil.nullDate() ;
      AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = "" ;
      AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel = "" ;
      AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom = "" ;
      AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel = "" ;
      AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod = "" ;
      AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel = "" ;
      AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = "" ;
      AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel = "" ;
      AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = "" ;
      AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel = "" ;
      AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = "" ;
      AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel = "" ;
      AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = "" ;
      AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel = "" ;
      AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = "" ;
      AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel = "" ;
      AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = "" ;
      AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel = "" ;
      AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = "" ;
      AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel = "" ;
      AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = "" ;
      AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel = "" ;
      AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = "" ;
      AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel = "" ;
      AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = "" ;
      AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel = "" ;
      AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr = "" ;
      AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel = "" ;
      AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod = DecimalUtil.ZERO ;
      AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to = DecimalUtil.ZERO ;
      AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo = DecimalUtil.ZERO ;
      AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to = DecimalUtil.ZERO ;
      AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot = DecimalUtil.ZERO ;
      AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to = DecimalUtil.ZERO ;
      AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod = DecimalUtil.ZERO ;
      AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to = DecimalUtil.ZERO ;
      AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo = DecimalUtil.ZERO ;
      AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to = DecimalUtil.ZERO ;
      AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot = DecimalUtil.ZERO ;
      AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to = DecimalUtil.ZERO ;
      AV89sdtMTok = new app.anticipacionerrores.SdtsdtMTok(remoteHandle, context);
      AV84TipMaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV123Anticipacionerrores_mant_detalleds_1_filterfulltext = "" ;
      lV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod = "" ;
      lV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom = "" ;
      lV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod = "" ;
      lV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc = "" ;
      lV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom = "" ;
      lV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc = "" ;
      lV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc = "" ;
      lV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod = "" ;
      lV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc = "" ;
      lV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod = "" ;
      lV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc = "" ;
      lV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc = "" ;
      lV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc = "" ;
      lV165Anticipacionerrores_mant_detalleds_43_tfmadethdr = "" ;
      AV77ArtCod = "" ;
      AV108MADetMaqCod = "" ;
      A14668MADetBarPa = "" ;
      AV75MADetEmprCod = "" ;
      A14583MADetTkn = "" ;
      A14584MADetUsu = "" ;
      P0AUM2_A14583MADetTkn = new String[] {""} ;
      P0AUM2_A14584MADetUsu = new String[] {""} ;
      P0AUM2_A14672MADetMetTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_n14672MADetMetTo = new boolean[] {false} ;
      P0AUM2_A14671MADetMetRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_n14671MADetMetRe = new boolean[] {false} ;
      P0AUM2_A14670MADetMetPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_n14670MADetMetPr = new boolean[] {false} ;
      P0AUM2_A14661MADetKilTo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_A14659MADetKilRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_A14658MADetKilPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUM2_n14658MADetKilPr = new boolean[] {false} ;
      P0AUM2_A14665MADetCatDs = new String[] {""} ;
      P0AUM2_n14665MADetCatDs = new boolean[] {false} ;
      P0AUM2_A14664MADetCatCo = new short[1] ;
      P0AUM2_n14664MADetCatCo = new boolean[] {false} ;
      P0AUM2_A14663MADetDefDs = new String[] {""} ;
      P0AUM2_n14663MADetDefDs = new boolean[] {false} ;
      P0AUM2_A14662MADetDefCo = new short[1] ;
      P0AUM2_n14662MADetDefCo = new boolean[] {false} ;
      P0AUM2_A14657MADetTipMD = new String[] {""} ;
      P0AUM2_n14657MADetTipMD = new boolean[] {false} ;
      P0AUM2_A14590MADetTipMC = new String[] {""} ;
      P0AUM2_A14656MADetMaqDs = new String[] {""} ;
      P0AUM2_n14656MADetMaqDs = new boolean[] {false} ;
      P0AUM2_A14591MADetMaqCo = new String[] {""} ;
      P0AUM2_A14660MADetIntDs = new String[] {""} ;
      P0AUM2_n14660MADetIntDs = new boolean[] {false} ;
      P0AUM2_A14593MADetIntCo = new byte[1] ;
      P0AUM2_A14655MADetMatDs = new String[] {""} ;
      P0AUM2_n14655MADetMatDs = new boolean[] {false} ;
      P0AUM2_A14592MADetMatCo = new short[1] ;
      P0AUM2_A14654MADetColCo = new byte[1] ;
      P0AUM2_A14653MADetColNo = new String[] {""} ;
      P0AUM2_A14589MADetColNu = new int[1] ;
      P0AUM2_A14652MADetArtDs = new String[] {""} ;
      P0AUM2_n14652MADetArtDs = new boolean[] {false} ;
      P0AUM2_A14588MADetArtCo = new String[] {""} ;
      P0AUM2_A14651MADetCliNo = new String[] {""} ;
      P0AUM2_n14651MADetCliNo = new boolean[] {false} ;
      P0AUM2_A14585MADetCliCo = new int[1] ;
      P0AUM2_A14587MADetEmprC = new String[] {""} ;
      P0AUM2_A14586MADetFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AUM2_A14582MADetId = new long[1] ;
      P0AUM2_A14668MADetBarPa = new String[] {""} ;
      P0AUM2_A14667MADetBarRe = new byte[1] ;
      P0AUM2_A14666MADetBarCo = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV98MTknUsu = "" ;
      AV99MTkn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_detalleexport__default(),
         new Object[] {
             new Object[] {
            P0AUM2_A14583MADetTkn, P0AUM2_A14584MADetUsu, P0AUM2_A14672MADetMetTo, P0AUM2_n14672MADetMetTo, P0AUM2_A14671MADetMetRe, P0AUM2_n14671MADetMetRe, P0AUM2_A14670MADetMetPr, P0AUM2_n14670MADetMetPr, P0AUM2_A14661MADetKilTo, P0AUM2_A14659MADetKilRe,
            P0AUM2_A14658MADetKilPr, P0AUM2_n14658MADetKilPr, P0AUM2_A14665MADetCatDs, P0AUM2_n14665MADetCatDs, P0AUM2_A14664MADetCatCo, P0AUM2_n14664MADetCatCo, P0AUM2_A14663MADetDefDs, P0AUM2_n14663MADetDefDs, P0AUM2_A14662MADetDefCo, P0AUM2_n14662MADetDefCo,
            P0AUM2_A14657MADetTipMD, P0AUM2_n14657MADetTipMD, P0AUM2_A14590MADetTipMC, P0AUM2_A14656MADetMaqDs, P0AUM2_n14656MADetMaqDs, P0AUM2_A14591MADetMaqCo, P0AUM2_A14660MADetIntDs, P0AUM2_n14660MADetIntDs, P0AUM2_A14593MADetIntCo, P0AUM2_A14655MADetMatDs,
            P0AUM2_n14655MADetMatDs, P0AUM2_A14592MADetMatCo, P0AUM2_A14654MADetColCo, P0AUM2_A14653MADetColNo, P0AUM2_A14589MADetColNu, P0AUM2_A14652MADetArtDs, P0AUM2_n14652MADetArtDs, P0AUM2_A14588MADetArtCo, P0AUM2_A14651MADetCliNo, P0AUM2_n14651MADetCliNo,
            P0AUM2_A14585MADetCliCo, P0AUM2_A14587MADetEmprC, P0AUM2_A14586MADetFec, P0AUM2_A14582MADetId, P0AUM2_A14668MADetBarPa, P0AUM2_A14667MADetBarRe, P0AUM2_A14666MADetBarCo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV52TFMADetColCod ;
   private byte AV53TFMADetColCod_To ;
   private byte AV58TFMADetIntCod ;
   private byte AV59TFMADetIntCod_To ;
   private byte A14654MADetColCo ;
   private byte A14593MADetIntCo ;
   private byte AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ;
   private byte AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ;
   private byte AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod ;
   private byte AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ;
   private byte A14667MADetBarRe ;
   private short AV54TFMADetMatCod ;
   private short AV55TFMADetMatCod_To ;
   private short AV100TFMADetDefCod ;
   private short AV101TFMADetDefCod_To ;
   private short AV104TFMADetCatCod ;
   private short AV105TFMADetCatCod_To ;
   private short GXv_int3[] ;
   private short A14592MADetMatCo ;
   private short A14662MADetDefCo ;
   private short A14664MADetCatCo ;
   private short AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ;
   private short AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ;
   private short AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ;
   private short AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ;
   private short AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ;
   private short AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ;
   private short AV96MADetDefCod ;
   private short AV97MADetCatCod ;
   private short AV16OrderedBy ;
   private short AV79TipMaqCodJSON ;
   private short AV80FechaInicio ;
   private short AV81FechaFin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV40TFMADetCliCod ;
   private int AV41TFMADetCliCod_To ;
   private int AV50TFMADetColNum ;
   private int AV51TFMADetColNum_To ;
   private int AV121GXV1 ;
   private int A14585MADetCliCo ;
   private int A14589MADetColNu ;
   private int AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod ;
   private int AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ;
   private int AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ;
   private int AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ;
   private int AV84TipMaqCodCollection_size ;
   private int AV78ForColNum ;
   private int A14666MADetBarCo ;
   private int AV76CliCod ;
   private int AV179GXV2 ;
   private long AV31VisibleColumnCount ;
   private long A14582MADetId ;
   private java.math.BigDecimal AV70TFMADetKilProd ;
   private java.math.BigDecimal AV71TFMADetKilProd_To ;
   private java.math.BigDecimal AV72TFMADetKilReo ;
   private java.math.BigDecimal AV73TFMADetKilReo_To ;
   private java.math.BigDecimal AV90TFMADetKilTot ;
   private java.math.BigDecimal AV91TFMADetKilTot_To ;
   private java.math.BigDecimal AV113TFMADetMetProd ;
   private java.math.BigDecimal AV114TFMADetMetProd_To ;
   private java.math.BigDecimal AV115TFMADetMetReo ;
   private java.math.BigDecimal AV116TFMADetMetReo_To ;
   private java.math.BigDecimal AV117TFMADetMetTot ;
   private java.math.BigDecimal AV118TFMADetMetTot_To ;
   private java.math.BigDecimal A14658MADetKilPr ;
   private java.math.BigDecimal A14659MADetKilRe ;
   private java.math.BigDecimal A14661MADetKilTo ;
   private java.math.BigDecimal A14670MADetMetPr ;
   private java.math.BigDecimal A14671MADetMetRe ;
   private java.math.BigDecimal A14672MADetMetTo ;
   private java.math.BigDecimal AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ;
   private java.math.BigDecimal AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ;
   private java.math.BigDecimal AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ;
   private java.math.BigDecimal AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ;
   private java.math.BigDecimal AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ;
   private java.math.BigDecimal AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ;
   private java.math.BigDecimal AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ;
   private java.math.BigDecimal AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ;
   private java.math.BigDecimal AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ;
   private java.math.BigDecimal AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ;
   private java.math.BigDecimal AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot ;
   private java.math.BigDecimal AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ;
   private String AV39TFMADetEmprCod_Sel ;
   private String AV38TFMADetEmprCod ;
   private String AV45TFMADetArtCod_Sel ;
   private String AV44TFMADetArtCod ;
   private String AV49TFMADetColNom_Sel ;
   private String AV48TFMADetColNom ;
   private String AV63TFMADetMaqCod_Sel ;
   private String AV62TFMADetMaqCod ;
   private String AV67TFMADetTipMCod_Sel ;
   private String AV66TFMADetTipMCod ;
   private String AV110TFMADetHdr_Sel ;
   private String AV109TFMADetHdr ;
   private String A14587MADetEmprC ;
   private String A14588MADetArtCo ;
   private String A14653MADetColNo ;
   private String A14591MADetMaqCo ;
   private String A14590MADetTipMC ;
   private String A14669MADetHdr ;
   private String AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ;
   private String AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ;
   private String AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod ;
   private String AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ;
   private String AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ;
   private String AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ;
   private String AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ;
   private String AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ;
   private String AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ;
   private String AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ;
   private String AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr ;
   private String AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ;
   private String AV89sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ;
   private String scmdbuf ;
   private String lV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ;
   private String lV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod ;
   private String lV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ;
   private String lV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ;
   private String lV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ;
   private String lV165Anticipacionerrores_mant_detalleds_43_tfmadethdr ;
   private String AV77ArtCod ;
   private String AV108MADetMaqCod ;
   private String A14668MADetBarPa ;
   private String AV75MADetEmprCod ;
   private String A14584MADetUsu ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV98MTknUsu ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFMADetFec ;
   private java.util.Date A14586MADetFec ;
   private java.util.Date AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n14672MADetMetTo ;
   private boolean n14671MADetMetRe ;
   private boolean n14670MADetMetPr ;
   private boolean n14658MADetKilPr ;
   private boolean n14665MADetCatDs ;
   private boolean n14664MADetCatCo ;
   private boolean n14663MADetDefDs ;
   private boolean n14662MADetDefCo ;
   private boolean n14657MADetTipMD ;
   private boolean n14656MADetMaqDs ;
   private boolean n14660MADetIntDs ;
   private boolean n14655MADetMatDs ;
   private boolean n14652MADetArtDs ;
   private boolean n14651MADetCliNo ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV43TFMADetCliNom_Sel ;
   private String AV42TFMADetCliNom ;
   private String AV83TFMADetArtDsc_Sel ;
   private String AV82TFMADetArtDsc ;
   private String AV86TFMADetMatDsc_Sel ;
   private String AV85TFMADetMatDsc ;
   private String AV88TFMADetIntDsc_Sel ;
   private String AV87TFMADetIntDsc ;
   private String AV65TFMADetMaqDsc_Sel ;
   private String AV64TFMADetMaqDsc ;
   private String AV69TFMADetTipMDsc_Sel ;
   private String AV68TFMADetTipMDsc ;
   private String AV103TFMADetDefDsc_Sel ;
   private String AV102TFMADetDefDsc ;
   private String AV107TFMADetCatDsc_Sel ;
   private String AV106TFMADetCatDsc ;
   private String A14651MADetCliNo ;
   private String A14652MADetArtDs ;
   private String A14655MADetMatDs ;
   private String A14660MADetIntDs ;
   private String A14656MADetMaqDs ;
   private String A14657MADetTipMD ;
   private String A14663MADetDefDs ;
   private String A14665MADetCatDs ;
   private String AV123Anticipacionerrores_mant_detalleds_1_filterfulltext ;
   private String AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom ;
   private String AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ;
   private String AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ;
   private String AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ;
   private String AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ;
   private String AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ;
   private String AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ;
   private String AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ;
   private String AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ;
   private String AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ;
   private String AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ;
   private String AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ;
   private String AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ;
   private String AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ;
   private String AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ;
   private String AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ;
   private String AV89sdtMTok_getgxTv_SdtsdtMTok_Mtkn ;
   private String lV123Anticipacionerrores_mant_detalleds_1_filterfulltext ;
   private String lV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom ;
   private String lV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ;
   private String lV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ;
   private String lV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ;
   private String lV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ;
   private String lV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ;
   private String lV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ;
   private String lV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ;
   private String A14583MADetTkn ;
   private String AV99MTkn ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV84TipMaqCodCollection ;
   private app.anticipacionerrores.SdtsdtMTok AV89sdtMTok ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUM2_A14583MADetTkn ;
   private String[] P0AUM2_A14584MADetUsu ;
   private java.math.BigDecimal[] P0AUM2_A14672MADetMetTo ;
   private boolean[] P0AUM2_n14672MADetMetTo ;
   private java.math.BigDecimal[] P0AUM2_A14671MADetMetRe ;
   private boolean[] P0AUM2_n14671MADetMetRe ;
   private java.math.BigDecimal[] P0AUM2_A14670MADetMetPr ;
   private boolean[] P0AUM2_n14670MADetMetPr ;
   private java.math.BigDecimal[] P0AUM2_A14661MADetKilTo ;
   private java.math.BigDecimal[] P0AUM2_A14659MADetKilRe ;
   private java.math.BigDecimal[] P0AUM2_A14658MADetKilPr ;
   private boolean[] P0AUM2_n14658MADetKilPr ;
   private String[] P0AUM2_A14665MADetCatDs ;
   private boolean[] P0AUM2_n14665MADetCatDs ;
   private short[] P0AUM2_A14664MADetCatCo ;
   private boolean[] P0AUM2_n14664MADetCatCo ;
   private String[] P0AUM2_A14663MADetDefDs ;
   private boolean[] P0AUM2_n14663MADetDefDs ;
   private short[] P0AUM2_A14662MADetDefCo ;
   private boolean[] P0AUM2_n14662MADetDefCo ;
   private String[] P0AUM2_A14657MADetTipMD ;
   private boolean[] P0AUM2_n14657MADetTipMD ;
   private String[] P0AUM2_A14590MADetTipMC ;
   private String[] P0AUM2_A14656MADetMaqDs ;
   private boolean[] P0AUM2_n14656MADetMaqDs ;
   private String[] P0AUM2_A14591MADetMaqCo ;
   private String[] P0AUM2_A14660MADetIntDs ;
   private boolean[] P0AUM2_n14660MADetIntDs ;
   private byte[] P0AUM2_A14593MADetIntCo ;
   private String[] P0AUM2_A14655MADetMatDs ;
   private boolean[] P0AUM2_n14655MADetMatDs ;
   private short[] P0AUM2_A14592MADetMatCo ;
   private byte[] P0AUM2_A14654MADetColCo ;
   private String[] P0AUM2_A14653MADetColNo ;
   private int[] P0AUM2_A14589MADetColNu ;
   private String[] P0AUM2_A14652MADetArtDs ;
   private boolean[] P0AUM2_n14652MADetArtDs ;
   private String[] P0AUM2_A14588MADetArtCo ;
   private String[] P0AUM2_A14651MADetCliNo ;
   private boolean[] P0AUM2_n14651MADetCliNo ;
   private int[] P0AUM2_A14585MADetCliCo ;
   private String[] P0AUM2_A14587MADetEmprC ;
   private java.util.Date[] P0AUM2_A14586MADetFec ;
   private long[] P0AUM2_A14582MADetId ;
   private String[] P0AUM2_A14668MADetBarPa ;
   private byte[] P0AUM2_A14667MADetBarRe ;
   private int[] P0AUM2_A14666MADetBarCo ;
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

final  class mant_detalleexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14590MADetTipMC ,
                                          GXSimpleCollection<String> AV84TipMaqCodCollection ,
                                          String AV123Anticipacionerrores_mant_detalleds_1_filterfulltext ,
                                          java.util.Date AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec ,
                                          String AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel ,
                                          String AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod ,
                                          int AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod ,
                                          int AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to ,
                                          String AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel ,
                                          String AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom ,
                                          String AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel ,
                                          String AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod ,
                                          String AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel ,
                                          String AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc ,
                                          int AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum ,
                                          int AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to ,
                                          String AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel ,
                                          String AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom ,
                                          byte AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod ,
                                          byte AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to ,
                                          short AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod ,
                                          short AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to ,
                                          String AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel ,
                                          String AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc ,
                                          byte AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod ,
                                          byte AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to ,
                                          String AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel ,
                                          String AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc ,
                                          String AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel ,
                                          String AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod ,
                                          String AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel ,
                                          String AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc ,
                                          String AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel ,
                                          String AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod ,
                                          String AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel ,
                                          String AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc ,
                                          short AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod ,
                                          short AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to ,
                                          String AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel ,
                                          String AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc ,
                                          short AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod ,
                                          short AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to ,
                                          String AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel ,
                                          String AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc ,
                                          String AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel ,
                                          String AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr ,
                                          java.math.BigDecimal AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod ,
                                          java.math.BigDecimal AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to ,
                                          java.math.BigDecimal AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo ,
                                          java.math.BigDecimal AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to ,
                                          java.math.BigDecimal AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot ,
                                          java.math.BigDecimal AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to ,
                                          java.math.BigDecimal AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod ,
                                          java.math.BigDecimal AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to ,
                                          java.math.BigDecimal AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo ,
                                          java.math.BigDecimal AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to ,
                                          java.math.BigDecimal AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot ,
                                          java.math.BigDecimal AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to ,
                                          String AV77ArtCod ,
                                          int AV78ForColNum ,
                                          String AV108MADetMaqCod ,
                                          int AV84TipMaqCodCollection_size ,
                                          short AV96MADetDefCod ,
                                          short AV97MADetCatCod ,
                                          String A14587MADetEmprC ,
                                          int A14585MADetCliCo ,
                                          String A14651MADetCliNo ,
                                          String A14588MADetArtCo ,
                                          String A14652MADetArtDs ,
                                          int A14589MADetColNu ,
                                          String A14653MADetColNo ,
                                          byte A14654MADetColCo ,
                                          short A14592MADetMatCo ,
                                          String A14655MADetMatDs ,
                                          byte A14593MADetIntCo ,
                                          String A14660MADetIntDs ,
                                          String A14591MADetMaqCo ,
                                          String A14656MADetMaqDs ,
                                          String A14657MADetTipMD ,
                                          short A14662MADetDefCo ,
                                          String A14663MADetDefDs ,
                                          short A14664MADetCatCo ,
                                          String A14665MADetCatDs ,
                                          int A14666MADetBarCo ,
                                          byte A14667MADetBarRe ,
                                          String A14668MADetBarPa ,
                                          java.math.BigDecimal A14658MADetKilPr ,
                                          java.math.BigDecimal A14659MADetKilRe ,
                                          java.math.BigDecimal A14661MADetKilTo ,
                                          java.math.BigDecimal A14670MADetMetPr ,
                                          java.math.BigDecimal A14671MADetMetRe ,
                                          java.math.BigDecimal A14672MADetMetTo ,
                                          java.util.Date A14586MADetFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV75MADetEmprCod ,
                                          String AV89sdtMTok_getgxTv_SdtsdtMTok_Mtkn ,
                                          String AV89sdtMTok_getgxTv_SdtsdtMTok_Mtknusu ,
                                          int AV76CliCod ,
                                          String A14583MADetTkn ,
                                          String A14584MADetUsu )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[91];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT MADetTkn, MADetUsu, MADetMetTo, MADetMetRe, MADetMetPr, MADetKilTo, MADetKilRe, MADetKilPr, MADetCatDs, MADetCatCo, MADetDefDs, MADetDefCo, MADetTipMD, MADetTipMC," ;
      scmdbuf += " MADetMaqDs, MADetMaqCo, MADetIntDs, MADetIntCo, MADetMatDs, MADetMatCo, MADetColCo, MADetColNo, MADetColNu, MADetArtDs, MADetArtCo, MADetCliNo, MADetCliCo, MADetEmprC," ;
      scmdbuf += " MADetFec, MADetId, MADetBarPa, MADetBarRe, MADetBarCo FROM MADet" ;
      addWhere(sWhereString, "(MADetTkn = ? and MADetUsu = ? and MADetCliCo = ?)");
      addWhere(sWhereString, "(MADetEmprC = ?)");
      if ( ! (GXutil.strcmp("", AV123Anticipacionerrores_mant_detalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MADetEmprC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCliCo,'999990'), 2) like '%' || ?) or ( UPPER(MADetCliNo) like '%' || UPPER(?)) or ( UPPER(MADetArtCo) like '%' || UPPER(?)) or ( UPPER(MADetArtDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColNu,'999990'), 2) like '%' || ?) or ( UPPER(MADetColNo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetColCo,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMatCo,'990'), 2) like '%' || ?) or ( UPPER(MADetMatDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetIntCo,'90'), 2) like '%' || ?) or ( UPPER(MADetIntDs) like '%' || UPPER(?)) or ( UPPER(MADetMaqCo) like '%' || UPPER(?)) or ( UPPER(MADetMaqDs) like '%' || UPPER(?)) or ( UPPER(MADetTipMC) like '%' || UPPER(?)) or ( UPPER(MADetTipMD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetDefCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetDefDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetCatCo,'9990'), 2) like '%' || ?) or ( UPPER(MADetCatDs) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MADetKilPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetKilTo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetPr,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetRe,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MADetMetTo,'999999990.99'), 2) like '%' || ?))");
      }
      else
      {
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
         GXv_int9[25] = (byte)(1) ;
         GXv_int9[26] = (byte)(1) ;
         GXv_int9[27] = (byte)(1) ;
         GXv_int9[28] = (byte)(1) ;
         GXv_int9[29] = (byte)(1) ;
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Anticipacionerrores_mant_detalleds_2_tfmadetfec)) )
      {
         addWhere(sWhereString, "(MADetFec >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV125Anticipacionerrores_mant_detalleds_3_tfmadetemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetEmprC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Anticipacionerrores_mant_detalleds_4_tfmadetemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetEmprC = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV127Anticipacionerrores_mant_detalleds_5_tfmadetclicod) )
      {
         addWhere(sWhereString, "(MADetCliCo >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV128Anticipacionerrores_mant_detalleds_6_tfmadetclicod_to) )
      {
         addWhere(sWhereString, "(MADetCliCo <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) && ( ! (GXutil.strcmp("", AV129Anticipacionerrores_mant_detalleds_7_tfmadetclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCliNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Anticipacionerrores_mant_detalleds_8_tfmadetclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCliNo = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) && ( ! (GXutil.strcmp("", AV131Anticipacionerrores_mant_detalleds_9_tfmadetartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Anticipacionerrores_mant_detalleds_10_tfmadetartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV133Anticipacionerrores_mant_detalleds_11_tfmadetartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetArtDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Anticipacionerrores_mant_detalleds_12_tfmadetartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetArtDs = ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (0==AV135Anticipacionerrores_mant_detalleds_13_tfmadetcolnum) )
      {
         addWhere(sWhereString, "(MADetColNu >= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (0==AV136Anticipacionerrores_mant_detalleds_14_tfmadetcolnum_to) )
      {
         addWhere(sWhereString, "(MADetColNu <= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV137Anticipacionerrores_mant_detalleds_15_tfmadetcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetColNo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Anticipacionerrores_mant_detalleds_16_tfmadetcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MADetColNo = ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV139Anticipacionerrores_mant_detalleds_17_tfmadetcolcod) )
      {
         addWhere(sWhereString, "(MADetColCo >= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (0==AV140Anticipacionerrores_mant_detalleds_18_tfmadetcolcod_to) )
      {
         addWhere(sWhereString, "(MADetColCo <= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (0==AV141Anticipacionerrores_mant_detalleds_19_tfmadetmatcod) )
      {
         addWhere(sWhereString, "(MADetMatCo >= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV142Anticipacionerrores_mant_detalleds_20_tfmadetmatcod_to) )
      {
         addWhere(sWhereString, "(MADetMatCo <= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV143Anticipacionerrores_mant_detalleds_21_tfmadetmatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Anticipacionerrores_mant_detalleds_22_tfmadetmatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMatDs = ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (0==AV145Anticipacionerrores_mant_detalleds_23_tfmadetintcod) )
      {
         addWhere(sWhereString, "(MADetIntCo >= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV146Anticipacionerrores_mant_detalleds_24_tfmadetintcod_to) )
      {
         addWhere(sWhereString, "(MADetIntCo <= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV147Anticipacionerrores_mant_detalleds_25_tfmadetintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetIntDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Anticipacionerrores_mant_detalleds_26_tfmadetintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetIntDs = ?)");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV149Anticipacionerrores_mant_detalleds_27_tfmadetmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Anticipacionerrores_mant_detalleds_28_tfmadetmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV151Anticipacionerrores_mant_detalleds_29_tfmadetmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetMaqDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Anticipacionerrores_mant_detalleds_30_tfmadetmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetMaqDs = ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV153Anticipacionerrores_mant_detalleds_31_tfmadettipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Anticipacionerrores_mant_detalleds_32_tfmadettipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMC = ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Anticipacionerrores_mant_detalleds_33_tfmadettipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetTipMD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Anticipacionerrores_mant_detalleds_34_tfmadettipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetTipMD = ?)");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( ! (0==AV157Anticipacionerrores_mant_detalleds_35_tfmadetdefcod) )
      {
         addWhere(sWhereString, "(MADetDefCo >= ?)");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( ! (0==AV158Anticipacionerrores_mant_detalleds_36_tfmadetdefcod_to) )
      {
         addWhere(sWhereString, "(MADetDefCo <= ?)");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Anticipacionerrores_mant_detalleds_37_tfmadetdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetDefDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Anticipacionerrores_mant_detalleds_38_tfmadetdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetDefDs = ?)");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( ! (0==AV161Anticipacionerrores_mant_detalleds_39_tfmadetcatcod) )
      {
         addWhere(sWhereString, "(MADetCatCo >= ?)");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( ! (0==AV162Anticipacionerrores_mant_detalleds_40_tfmadetcatcod_to) )
      {
         addWhere(sWhereString, "(MADetCatCo <= ?)");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV163Anticipacionerrores_mant_detalleds_41_tfmadetcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MADetCatDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Anticipacionerrores_mant_detalleds_42_tfmadetcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MADetCatDs = ?)");
      }
      else
      {
         GXv_int9[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Anticipacionerrores_mant_detalleds_43_tfmadethdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Anticipacionerrores_mant_detalleds_44_tfmadethdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarCo,'99999990'), 2))) || RTRIM(LTRIM(SUBSTR(TO_CHAR(MADetBarRe,'90'), 2))) || MADetBarPa = ?)");
      }
      else
      {
         GXv_int9[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Anticipacionerrores_mant_detalleds_45_tfmadetkilprod)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr >= ?)");
      }
      else
      {
         GXv_int9[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV168Anticipacionerrores_mant_detalleds_46_tfmadetkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilPr <= ?)");
      }
      else
      {
         GXv_int9[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV169Anticipacionerrores_mant_detalleds_47_tfmadetkilreo)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe >= ?)");
      }
      else
      {
         GXv_int9[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV170Anticipacionerrores_mant_detalleds_48_tfmadetkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilRe <= ?)");
      }
      else
      {
         GXv_int9[77] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV171Anticipacionerrores_mant_detalleds_49_tfmadetkiltot)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo >= ?)");
      }
      else
      {
         GXv_int9[78] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV172Anticipacionerrores_mant_detalleds_50_tfmadetkiltot_to)==0) )
      {
         addWhere(sWhereString, "(MADetKilTo <= ?)");
      }
      else
      {
         GXv_int9[79] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV173Anticipacionerrores_mant_detalleds_51_tfmadetmetprod)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr >= ?)");
      }
      else
      {
         GXv_int9[80] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Anticipacionerrores_mant_detalleds_52_tfmadetmetprod_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetPr <= ?)");
      }
      else
      {
         GXv_int9[81] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Anticipacionerrores_mant_detalleds_53_tfmadetmetreo)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe >= ?)");
      }
      else
      {
         GXv_int9[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Anticipacionerrores_mant_detalleds_54_tfmadetmetreo_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetRe <= ?)");
      }
      else
      {
         GXv_int9[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Anticipacionerrores_mant_detalleds_55_tfmadetmettot)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo >= ?)");
      }
      else
      {
         GXv_int9[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Anticipacionerrores_mant_detalleds_56_tfmadetmettot_to)==0) )
      {
         addWhere(sWhereString, "(MADetMetTo <= ?)");
      }
      else
      {
         GXv_int9[85] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77ArtCod)==0) )
      {
         addWhere(sWhereString, "(MADetArtCo = ?)");
      }
      else
      {
         GXv_int9[86] = (byte)(1) ;
      }
      if ( ! (0==AV78ForColNum) )
      {
         addWhere(sWhereString, "(MADetColNu = ?)");
      }
      else
      {
         GXv_int9[87] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108MADetMaqCod)==0) )
      {
         addWhere(sWhereString, "(MADetMaqCo = ?)");
      }
      else
      {
         GXv_int9[88] = (byte)(1) ;
      }
      if ( AV84TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84TipMaqCodCollection, "MADetTipMC IN (", ")")+")");
      }
      if ( ! (0==AV96MADetDefCod) )
      {
         addWhere(sWhereString, "(MADetDefCo = ?)");
      }
      else
      {
         GXv_int9[89] = (byte)(1) ;
      }
      if ( ! (0==AV97MADetCatCod) )
      {
         addWhere(sWhereString, "(MADetCatCo = ?)");
      }
      else
      {
         GXv_int9[90] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY MADetFec, MADetId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetEmprC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetEmprC DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetCliCo" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetCliCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetCliNo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetCliNo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetArtCo" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetArtCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetArtDs" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetArtDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetColNu" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetColNu DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetColNo" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetColNo DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetColCo" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetColCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMatCo" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMatCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMatDs" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMatDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetIntCo" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetIntCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetIntDs" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetIntDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMaqCo" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMaqCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMaqDs" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMaqDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetTipMC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetTipMC DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetTipMD" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetTipMD DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetDefCo" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetDefCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetDefDs" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetDefDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetCatCo" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetCatCo DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetCatDs" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetCatDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetKilPr" ;
      }
      else if ( ( AV16OrderedBy == 23 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetKilPr DESC" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetKilRe" ;
      }
      else if ( ( AV16OrderedBy == 24 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetKilRe DESC" ;
      }
      else if ( ( AV16OrderedBy == 25 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetKilTo" ;
      }
      else if ( ( AV16OrderedBy == 25 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetKilTo DESC" ;
      }
      else if ( ( AV16OrderedBy == 26 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMetPr" ;
      }
      else if ( ( AV16OrderedBy == 26 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMetPr DESC" ;
      }
      else if ( ( AV16OrderedBy == 27 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMetRe" ;
      }
      else if ( ( AV16OrderedBy == 27 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMetRe DESC" ;
      }
      else if ( ( AV16OrderedBy == 28 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY MADetMetTo" ;
      }
      else if ( ( AV16OrderedBy == 28 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MADetMetTo DESC" ;
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
                  return conditional_P0AUM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).shortValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).byteValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).byteValue() , (String)dynConstraints[85] , (java.math.BigDecimal)dynConstraints[86] , (java.math.BigDecimal)dynConstraints[87] , (java.math.BigDecimal)dynConstraints[88] , (java.math.BigDecimal)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (java.math.BigDecimal)dynConstraints[91] , (java.util.Date)dynConstraints[92] , ((Number) dynConstraints[93]).shortValue() , ((Boolean) dynConstraints[94]).booleanValue() , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((String[]) buf[23])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 6);
               ((String[]) buf[26])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((String[]) buf[29])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((byte[]) buf[32])[0] = rslt.getByte(21);
               ((String[]) buf[33])[0] = rslt.getString(22, 13);
               ((int[]) buf[34])[0] = rslt.getInt(23);
               ((String[]) buf[35])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(25, 16);
               ((String[]) buf[38])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(27);
               ((String[]) buf[41])[0] = rslt.getString(28, 3);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(29);
               ((long[]) buf[43])[0] = rslt.getLong(30);
               ((String[]) buf[44])[0] = rslt.getString(31, 1);
               ((byte[]) buf[45])[0] = rslt.getByte(32);
               ((int[]) buf[46])[0] = rslt.getInt(33);
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
                  stmt.setVarchar(sIdx, (String)parms[91], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[119], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[122]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[127], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[128], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[131], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[132], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[137]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[139]).shortValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 255);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 255);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[143]).byteValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 255);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[146], 255);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 6);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 255);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 255);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 4);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 4);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 255);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 255);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[157], 255);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[158], 255);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[161], 255);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[162], 255);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 10);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 10);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[166], 2);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[168], 2);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[169], 2);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[170], 2);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[176], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[177], 16);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[178]).intValue());
               }
               if ( ((Number) parms[88]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[179], 6);
               }
               if ( ((Number) parms[89]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[180]).shortValue());
               }
               if ( ((Number) parms[90]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[181]).shortValue());
               }
               return;
      }
   }

}

