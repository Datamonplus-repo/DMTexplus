package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcpartesproduccionmaquinaexport extends GXProcedure
{
   public wcpartesproduccionmaquinaexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcpartesproduccionmaquinaexport.class ), "" );
   }

   public wcpartesproduccionmaquinaexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcpartesproduccionmaquinaexport.this.aP1 = new String[] {""};
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
      wcpartesproduccionmaquinaexport.this.aP0 = aP0;
      wcpartesproduccionmaquinaexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCPartesProduccionMaquinaExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78FilterFullText, GXv_char5) ;
      wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      GXt_dtime6 = GXutil.resetTime( AV70HisProFec );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+0, 1, 1).setDate( GXt_dtime6 );
      GXv_exceldoc2[0] = AV10ExcelDocument ;
      GXv_int3[0] = (short)(AV13CellRow) ;
      new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+1), httpContext.getMessage( "WWP_MiddleText", "")) ;
      AV10ExcelDocument = GXv_exceldoc2[0] ;
      wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setItalic( (short)(1) );
      GXt_dtime6 = GXutil.resetTime( AV71HisProFec_To );
      AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setDate( GXt_dtime6 );
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFHisProFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFHisProFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV38TFGruOpeCod) && (0==AV39TFGruOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFGruOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFGruOpeCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV77TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFBarNHdr_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV76TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFBarNHdr, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFCliCod) && (0==AV43TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFCliNom_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFCliNom, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarSer_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarSer, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarSerDsc_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarSerDsc, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarColNom_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarColNom, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFFase_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFFase_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFFase)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFFase, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFFaseDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFFaseDsc_Sel, GXv_char5) ;
         wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFFaseDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFFaseDsc, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFHisProKgr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFHisProKgr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV56TFHisProKgr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV57TFHisProKgr_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFHisProMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFHisProMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFHisProMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFHisProMtr_To)) );
      }
      if ( ! ( (0==AV60TFHisProTur) && (0==AV61TFHisProTur_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "T", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV60TFHisProTur );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV61TFHisProTur_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV62TFHisProDTI) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Inicio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV62TFHisProDTI );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV64TFHisProDTF) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fin", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV64TFHisProDTF );
      }
      if ( ! ( (0==AV73TFHisProTr2) && (0==AV74TFHisProTr2_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV73TFHisProTr2 );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcpartesproduccionmaquinaexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV74TFHisProTr2_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("WCPartesProduccionMaquinaColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV18Session.getValue("WCPartesProduccionMaquinaColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV81GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV83Wcpartesproduccionmaquinads_1_emprcod = AV69Emprcod ;
      AV84Wcpartesproduccionmaquinads_2_maqcod = AV67MaqCod ;
      AV85Wcpartesproduccionmaquinads_3_maqdsc = AV68MaqDsc ;
      AV86Wcpartesproduccionmaquinads_4_filterfulltext = AV78FilterFullText ;
      AV87Wcpartesproduccionmaquinads_5_hisprofec = AV70HisProFec ;
      AV88Wcpartesproduccionmaquinads_6_hisprofec_to = AV71HisProFec_To ;
      AV89Wcpartesproduccionmaquinads_7_tfhisprofec = AV36TFHisProFec ;
      AV90Wcpartesproduccionmaquinads_8_tfgruopecod = AV38TFGruOpeCod ;
      AV91Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV39TFGruOpeCod_To ;
      AV92Wcpartesproduccionmaquinads_10_tfbarnhdr = AV76TFBarNHdr ;
      AV93Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV77TFBarNHdr_Sel ;
      AV94Wcpartesproduccionmaquinads_12_tfclicod = AV42TFCliCod ;
      AV95Wcpartesproduccionmaquinads_13_tfclicod_to = AV43TFCliCod_To ;
      AV96Wcpartesproduccionmaquinads_14_tfclinom = AV44TFCliNom ;
      AV97Wcpartesproduccionmaquinads_15_tfclinom_sel = AV45TFCliNom_Sel ;
      AV98Wcpartesproduccionmaquinads_16_tfbarser = AV46TFBarSer ;
      AV99Wcpartesproduccionmaquinads_17_tfbarser_sel = AV47TFBarSer_Sel ;
      AV100Wcpartesproduccionmaquinads_18_tfbarserdsc = AV48TFBarSerDsc ;
      AV101Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV102Wcpartesproduccionmaquinads_20_tfbarcolnom = AV50TFBarColNom ;
      AV103Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV104Wcpartesproduccionmaquinads_22_tffase = AV52TFFase ;
      AV105Wcpartesproduccionmaquinads_23_tffase_sel = AV53TFFase_Sel ;
      AV106Wcpartesproduccionmaquinads_24_tffasedsc = AV54TFFaseDsc ;
      AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV55TFFaseDsc_Sel ;
      AV108Wcpartesproduccionmaquinads_26_tfhisprokgr = AV56TFHisProKgr ;
      AV109Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV57TFHisProKgr_To ;
      AV110Wcpartesproduccionmaquinads_28_tfhispromtr = AV58TFHisProMtr ;
      AV111Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV59TFHisProMtr_To ;
      AV112Wcpartesproduccionmaquinads_30_tfhisprotur = AV60TFHisProTur ;
      AV113Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV61TFHisProTur_To ;
      AV114Wcpartesproduccionmaquinads_32_tfhisprodti = AV62TFHisProDTI ;
      AV115Wcpartesproduccionmaquinads_33_tfhisprodtf = AV64TFHisProDTF ;
      AV116Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV73TFHisProTr2 ;
      AV117Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV74TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV87Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV88Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV89Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV90Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV91Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV93Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV92Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV94Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV95Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV97Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV96Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV99Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV98Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV101Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV100Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV103Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV102Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV105Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV104Wcpartesproduccionmaquinads_22_tffase ,
                                           AV108Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV109Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV110Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV111Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV112Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV113Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV114Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV115Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV116Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV117Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV86Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV106Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           A606MaqDsc ,
                                           AV85Wcpartesproduccionmaquinads_3_maqdsc ,
                                           AV83Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV84Wcpartesproduccionmaquinads_2_maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV106Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV106Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor P08DH2 */
      pr_default.execute(0, new Object[] {AV83Wcpartesproduccionmaquinads_1_emprcod, AV84Wcpartesproduccionmaquinads_2_maqcod, AV86Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV86Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV86Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV86Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV86Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV86Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV86Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV86Wcpartesproduccionmaquinads_4_filterfulltext, AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV106Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV106Wcpartesproduccionmaquinads_24_tffasedsc, AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV85Wcpartesproduccionmaquinads_3_maqdsc, AV87Wcpartesproduccionmaquinads_5_hisprofec, AV88Wcpartesproduccionmaquinads_6_hisprofec_to, AV89Wcpartesproduccionmaquinads_7_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P08DH2_A558HisProFec[0] ;
         A606MaqDsc = P08DH2_A606MaqDsc[0] ;
         n606MaqDsc = P08DH2_n606MaqDsc[0] ;
         A602MaqCod = P08DH2_A602MaqCod[0] ;
         A396EmprCod = P08DH2_A396EmprCod[0] ;
         A606MaqDsc = P08DH2_A606MaqDsc[0] ;
         n606MaqDsc = P08DH2_n606MaqDsc[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A558HisProFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A503GruOpeCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = AV22OpeNom ;
            GXv_char5[0] = GXt_char4 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV22OpeNom = GXt_char4 ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV22OpeNom, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A461Fase, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A7258FaseDsc, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1526HisProMtr)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A566HisProTur );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4440HisProDTI );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4441HisProDTF );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5605HisProTr2 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV118Hhmm = (short)(A5605HisProTr2/ (double) (60)) ;
            AV119Horrea = (short)(A5605HisProTr2/ (double) (60)) ;
            AV120Horreaint = DecimalUtil.doubleToDec(GXutil.Int( AV119Horrea)) ;
            AV121Minrea = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A5605HisProTr2).subtract((AV120Horreaint.multiply(DecimalUtil.doubleToDec(60)))))) ;
            AV122Minrea2 = (short)(AV121Minrea/ (double) (100)) ;
            AV75Hm = GXutil.padl( GXutil.trim( GXutil.str( AV120Horreaint, 10, 2)), (short)(2), "0") + ":" + GXutil.padl( GXutil.trim( GXutil.str( AV121Minrea, 4, 0)), (short)(2), "0") ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75Hm, GXv_char5) ;
            wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "GruOpeCod", "", "Operario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&OpeNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Serie", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Nombre Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Fase", "", "Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FaseDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProKgr", "", "Kgs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProMtr", "", "Mts", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProTur", "", "T", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTI", "", "Inicio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProDTF", "", "Fin", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "HisProTr2", "", "Mm", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Hm", "", "HhMm", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionMaquinaColumnsSelector", GXv_char5) ;
      wcpartesproduccionmaquinaexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("WCPartesProduccionMaquinaGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCPartesProduccionMaquinaGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCPartesProduccionMaquinaGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV123GXV2 = 1 ;
      while ( AV123GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV123GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPROFEC") == 0 )
         {
            AV70HisProFec = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV71HisProFec_To = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV36TFHisProFec = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV38TFGruOpeCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFGruOpeCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV76TFBarNHdr = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV77TFBarNHdr_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV48TFBarSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV49TFBarSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV50TFBarColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV51TFBarColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV52TFFase = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV53TFFase_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV54TFFaseDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV55TFFaseDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV56TFHisProKgr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFHisProKgr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV58TFHisProMtr = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFHisProMtr_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV60TFHisProTur = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFHisProTur_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV62TFHisProDTI = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV64TFHisProDTF = localUtil.ctot( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV73TFHisProTr2 = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFHisProTr2_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV67MaqCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQDSC") == 0 )
         {
            AV68MaqDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV123GXV2 = (int)(AV123GXV2+1) ;
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
      this.aP0[0] = wcpartesproduccionmaquinaexport.this.AV11Filename;
      this.aP1[0] = wcpartesproduccionmaquinaexport.this.AV12ErrorMessage;
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
      AV78FilterFullText = "" ;
      AV70HisProFec = GXutil.nullDate() ;
      AV71HisProFec_To = GXutil.nullDate() ;
      AV36TFHisProFec = GXutil.nullDate() ;
      AV77TFBarNHdr_Sel = "" ;
      AV76TFBarNHdr = "" ;
      AV45TFCliNom_Sel = "" ;
      AV44TFCliNom = "" ;
      AV47TFBarSer_Sel = "" ;
      AV46TFBarSer = "" ;
      AV49TFBarSerDsc_Sel = "" ;
      AV48TFBarSerDsc = "" ;
      AV51TFBarColNom_Sel = "" ;
      AV50TFBarColNom = "" ;
      AV53TFFase_Sel = "" ;
      AV52TFFase = "" ;
      AV55TFFaseDsc_Sel = "" ;
      AV54TFFaseDsc = "" ;
      AV56TFHisProKgr = DecimalUtil.ZERO ;
      AV57TFHisProKgr_To = DecimalUtil.ZERO ;
      AV58TFHisProMtr = DecimalUtil.ZERO ;
      AV59TFHisProMtr_To = DecimalUtil.ZERO ;
      AV62TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV64TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A558HisProFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV83Wcpartesproduccionmaquinads_1_emprcod = "" ;
      AV69Emprcod = "" ;
      AV84Wcpartesproduccionmaquinads_2_maqcod = "" ;
      AV67MaqCod = "" ;
      AV85Wcpartesproduccionmaquinads_3_maqdsc = "" ;
      AV68MaqDsc = "" ;
      AV86Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      AV87Wcpartesproduccionmaquinads_5_hisprofec = GXutil.nullDate() ;
      AV88Wcpartesproduccionmaquinads_6_hisprofec_to = GXutil.nullDate() ;
      AV89Wcpartesproduccionmaquinads_7_tfhisprofec = GXutil.nullDate() ;
      AV92Wcpartesproduccionmaquinads_10_tfbarnhdr = "" ;
      AV93Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = "" ;
      AV96Wcpartesproduccionmaquinads_14_tfclinom = "" ;
      AV97Wcpartesproduccionmaquinads_15_tfclinom_sel = "" ;
      AV98Wcpartesproduccionmaquinads_16_tfbarser = "" ;
      AV99Wcpartesproduccionmaquinads_17_tfbarser_sel = "" ;
      AV100Wcpartesproduccionmaquinads_18_tfbarserdsc = "" ;
      AV101Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = "" ;
      AV102Wcpartesproduccionmaquinads_20_tfbarcolnom = "" ;
      AV103Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = "" ;
      AV104Wcpartesproduccionmaquinads_22_tffase = "" ;
      AV105Wcpartesproduccionmaquinads_23_tffase_sel = "" ;
      AV106Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel = "" ;
      AV108Wcpartesproduccionmaquinads_26_tfhisprokgr = DecimalUtil.ZERO ;
      AV109Wcpartesproduccionmaquinads_27_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV110Wcpartesproduccionmaquinads_28_tfhispromtr = DecimalUtil.ZERO ;
      AV111Wcpartesproduccionmaquinads_29_tfhispromtr_to = DecimalUtil.ZERO ;
      AV114Wcpartesproduccionmaquinads_32_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV115Wcpartesproduccionmaquinads_33_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      lV86Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      lV106Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      scmdbuf = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      P08DH2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08DH2_A606MaqDsc = new String[] {""} ;
      P08DH2_n606MaqDsc = new boolean[] {false} ;
      P08DH2_A602MaqCod = new String[] {""} ;
      P08DH2_A396EmprCod = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV22OpeNom = "" ;
      AV120Horreaint = DecimalUtil.ZERO ;
      AV75Hm = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccionmaquinaexport__default(),
         new Object[] {
             new Object[] {
            P08DH2_A558HisProFec, P08DH2_A606MaqDsc, P08DH2_n606MaqDsc, P08DH2_A602MaqCod, P08DH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV60TFHisProTur ;
   private byte AV61TFHisProTur_To ;
   private byte A566HisProTur ;
   private byte AV112Wcpartesproduccionmaquinads_30_tfhisprotur ;
   private byte AV113Wcpartesproduccionmaquinads_31_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private short AV73TFHisProTr2 ;
   private short AV74TFHisProTr2_To ;
   private short GXv_int3[] ;
   private short A5605HisProTr2 ;
   private short AV116Wcpartesproduccionmaquinads_34_tfhisprotr2 ;
   private short AV117Wcpartesproduccionmaquinads_35_tfhisprotr2_to ;
   private short AV16OrderedBy ;
   private short AV118Hhmm ;
   private short AV119Horrea ;
   private short AV121Minrea ;
   private short AV122Minrea2 ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFGruOpeCod ;
   private int AV39TFGruOpeCod_To ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV81GXV1 ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int AV90Wcpartesproduccionmaquinads_8_tfgruopecod ;
   private int AV91Wcpartesproduccionmaquinads_9_tfgruopecod_to ;
   private int AV94Wcpartesproduccionmaquinads_12_tfclicod ;
   private int AV95Wcpartesproduccionmaquinads_13_tfclicod_to ;
   private int A129BarCod ;
   private int AV123GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV56TFHisProKgr ;
   private java.math.BigDecimal AV57TFHisProKgr_To ;
   private java.math.BigDecimal AV58TFHisProMtr ;
   private java.math.BigDecimal AV59TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV108Wcpartesproduccionmaquinads_26_tfhisprokgr ;
   private java.math.BigDecimal AV109Wcpartesproduccionmaquinads_27_tfhisprokgr_to ;
   private java.math.BigDecimal AV110Wcpartesproduccionmaquinads_28_tfhispromtr ;
   private java.math.BigDecimal AV111Wcpartesproduccionmaquinads_29_tfhispromtr_to ;
   private java.math.BigDecimal AV120Horreaint ;
   private String AV77TFBarNHdr_Sel ;
   private String AV76TFBarNHdr ;
   private String AV45TFCliNom_Sel ;
   private String AV44TFCliNom ;
   private String AV47TFBarSer_Sel ;
   private String AV46TFBarSer ;
   private String AV49TFBarSerDsc_Sel ;
   private String AV48TFBarSerDsc ;
   private String AV51TFBarColNom_Sel ;
   private String AV50TFBarColNom ;
   private String AV53TFFase_Sel ;
   private String AV52TFFase ;
   private String AV55TFFaseDsc_Sel ;
   private String AV54TFFaseDsc ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String AV83Wcpartesproduccionmaquinads_1_emprcod ;
   private String AV69Emprcod ;
   private String AV84Wcpartesproduccionmaquinads_2_maqcod ;
   private String AV67MaqCod ;
   private String AV85Wcpartesproduccionmaquinads_3_maqdsc ;
   private String AV68MaqDsc ;
   private String AV92Wcpartesproduccionmaquinads_10_tfbarnhdr ;
   private String AV93Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ;
   private String AV96Wcpartesproduccionmaquinads_14_tfclinom ;
   private String AV97Wcpartesproduccionmaquinads_15_tfclinom_sel ;
   private String AV98Wcpartesproduccionmaquinads_16_tfbarser ;
   private String AV99Wcpartesproduccionmaquinads_17_tfbarser_sel ;
   private String AV100Wcpartesproduccionmaquinads_18_tfbarserdsc ;
   private String AV101Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ;
   private String AV102Wcpartesproduccionmaquinads_20_tfbarcolnom ;
   private String AV103Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ;
   private String AV104Wcpartesproduccionmaquinads_22_tffase ;
   private String AV105Wcpartesproduccionmaquinads_23_tffase_sel ;
   private String AV106Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel ;
   private String lV106Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String AV22OpeNom ;
   private String AV75Hm ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV62TFHisProDTI ;
   private java.util.Date AV64TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV114Wcpartesproduccionmaquinads_32_tfhisprodti ;
   private java.util.Date AV115Wcpartesproduccionmaquinads_33_tfhisprodtf ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV70HisProFec ;
   private java.util.Date AV71HisProFec_To ;
   private java.util.Date AV36TFHisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV87Wcpartesproduccionmaquinads_5_hisprofec ;
   private java.util.Date AV88Wcpartesproduccionmaquinads_6_hisprofec_to ;
   private java.util.Date AV89Wcpartesproduccionmaquinads_7_tfhisprofec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n606MaqDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV78FilterFullText ;
   private String AV86Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String lV86Wcpartesproduccionmaquinads_4_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08DH2_A558HisProFec ;
   private String[] P08DH2_A606MaqDsc ;
   private boolean[] P08DH2_n606MaqDsc ;
   private String[] P08DH2_A602MaqCod ;
   private String[] P08DH2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class wcpartesproduccionmaquinaexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV88Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV89Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV90Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV91Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV93Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV92Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV94Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV95Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV97Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV96Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV99Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV98Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV101Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV100Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV103Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV102Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV105Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV104Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV108Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV109Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV110Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV111Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV112Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV113Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV114Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV115Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV116Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV117Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV86Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV107Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV106Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV85Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV83Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV84Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[40];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T2.MaqDsc, T1.MaqCod, T1.EmprCod FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc, T1.HisProFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
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
                  return conditional_P08DH2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
      }
   }

}

