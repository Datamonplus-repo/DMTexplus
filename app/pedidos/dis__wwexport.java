package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis__wwexport extends GXProcedure
{
   public dis__wwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis__wwexport.class ), "" );
   }

   public dis__wwexport( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      dis__wwexport.this.aP1 = new String[] {""};
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
      dis__wwexport.this.aP0 = aP0;
      dis__wwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "Dis__WWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV62TFDisUsrCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFDisUsrCod_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFDisUsrCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFDisUsrCod, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV58TFDisEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV60i = 1 ;
         AV84GXV1 = 1 ;
         while ( AV84GXV1 <= AV58TFDisEst_Sels.size() )
         {
            AV59TFDisEst_Sel = ((Number) AV58TFDisEst_Sels.elementAt(-1+AV84GXV1)).byteValue() ;
            if ( AV60i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV59TFDisEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Pedido", "") );
            }
            else if ( AV59TFDisEst_Sel == 3 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Produccion", "") );
            }
            AV60i = (long)(AV60i+1) ;
            AV84GXV1 = (int)(AV84GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV67TFDisCliNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV67TFDisCliNum_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV66TFDisCliNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFDisCliNum, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV69TFDisEncCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFDisEncCli_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV68TFDisEncCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ped. Cli.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68TFDisEncCli, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV34TFDisCod) && (0==AV35TFDisCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nr.Enc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFDisCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFDisCod_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFDisFecCli)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Data ped.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFDisFecCli );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFDisFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Data reg.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV38TFDisFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFDisFecEnt)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Data entr.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV41TFDisFecEnt );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (0==AV43TFCliCod) && (0==AV44TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV46TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFCliNom_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV45TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFCliNom, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFDisArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDisArtCod_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFDisArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFDisArtCod, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFDisArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFDisArtDsc_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFDisArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDisArtDsc, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFDisColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFDisColNom_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFDisColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFDisColNom, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV53TFDisColNum) && (0==AV54TFDisColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cor. Núm", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFDisColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFDisColNum_To );
      }
      if ( ! ( (0==AV55TFDisTipCol) && (0==AV56TFDisTipCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV55TFDisTipCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV56TFDisTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV71TFDisNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFDisNomCli_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFDisNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFDisNomCli, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV72TFDisNumCli) && (0==AV73TFDisNumCli_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV72TFDisNumCli );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV73TFDisNumCli_To );
      }
      if ( ! ( (GXutil.strcmp("", AV75TFMaqCodDis_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFMaqCodDis_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFMaqCodDis)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Maquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFMaqCodDis, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV76TFDisNumPie) && (0==AV77TFDisNumPie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Piezas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV76TFDisNumPie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV77TFDisNumPie_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFDisNumUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFDisNumUni_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidades", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV78TFDisNumUni)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV79TFDisNumUni_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV81TFDisUniMed_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV81TFDisUniMed_Sel, GXv_char5) ;
         dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV80TFDisUniMed)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und.", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            dis__wwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFDisUniMed, GXv_char5) ;
            dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis__WWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Pedidos.Dis__WWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV85GXV2 = 1 ;
      while ( AV85GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV85GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV85GXV2 = (int)(AV85GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV87Pedidos_dis__wwds_1_filterfulltext = AV18FilterFullText ;
      AV88Pedidos_dis__wwds_2_tfdisusrcod = AV61TFDisUsrCod ;
      AV89Pedidos_dis__wwds_3_tfdisusrcod_sel = AV62TFDisUsrCod_Sel ;
      AV90Pedidos_dis__wwds_4_tfdisest_sels = AV58TFDisEst_Sels ;
      AV91Pedidos_dis__wwds_5_tfdisclinum = AV66TFDisCliNum ;
      AV92Pedidos_dis__wwds_6_tfdisclinum_sel = AV67TFDisCliNum_Sel ;
      AV93Pedidos_dis__wwds_7_tfdisenccli = AV68TFDisEncCli ;
      AV94Pedidos_dis__wwds_8_tfdisenccli_sel = AV69TFDisEncCli_Sel ;
      AV95Pedidos_dis__wwds_9_tfdiscod = AV34TFDisCod ;
      AV96Pedidos_dis__wwds_10_tfdiscod_to = AV35TFDisCod_To ;
      AV97Pedidos_dis__wwds_11_tfdisfeccli = AV36TFDisFecCli ;
      AV98Pedidos_dis__wwds_12_tfdisfec = AV38TFDisFec ;
      AV99Pedidos_dis__wwds_13_tfdisfecent = AV41TFDisFecEnt ;
      AV100Pedidos_dis__wwds_14_tfclicod = AV43TFCliCod ;
      AV101Pedidos_dis__wwds_15_tfclicod_to = AV44TFCliCod_To ;
      AV102Pedidos_dis__wwds_16_tfclinom = AV45TFCliNom ;
      AV103Pedidos_dis__wwds_17_tfclinom_sel = AV46TFCliNom_Sel ;
      AV104Pedidos_dis__wwds_18_tfdisartcod = AV47TFDisArtCod ;
      AV105Pedidos_dis__wwds_19_tfdisartcod_sel = AV48TFDisArtCod_Sel ;
      AV106Pedidos_dis__wwds_20_tfdisartdsc = AV49TFDisArtDsc ;
      AV107Pedidos_dis__wwds_21_tfdisartdsc_sel = AV50TFDisArtDsc_Sel ;
      AV108Pedidos_dis__wwds_22_tfdiscolnom = AV51TFDisColNom ;
      AV109Pedidos_dis__wwds_23_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV110Pedidos_dis__wwds_24_tfdiscolnum = AV53TFDisColNum ;
      AV111Pedidos_dis__wwds_25_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV112Pedidos_dis__wwds_26_tfdistipcol = AV55TFDisTipCol ;
      AV113Pedidos_dis__wwds_27_tfdistipcol_to = AV56TFDisTipCol_To ;
      AV114Pedidos_dis__wwds_28_tfdisnomcli = AV70TFDisNomCli ;
      AV115Pedidos_dis__wwds_29_tfdisnomcli_sel = AV71TFDisNomCli_Sel ;
      AV116Pedidos_dis__wwds_30_tfdisnumcli = AV72TFDisNumCli ;
      AV117Pedidos_dis__wwds_31_tfdisnumcli_to = AV73TFDisNumCli_To ;
      AV118Pedidos_dis__wwds_32_tfmaqcoddis = AV74TFMaqCodDis ;
      AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV75TFMaqCodDis_Sel ;
      AV120Pedidos_dis__wwds_34_tfdisnumpie = AV76TFDisNumPie ;
      AV121Pedidos_dis__wwds_35_tfdisnumpie_to = AV77TFDisNumPie_To ;
      AV122Pedidos_dis__wwds_36_tfdisnumuni = AV78TFDisNumUni ;
      AV123Pedidos_dis__wwds_37_tfdisnumuni_to = AV79TFDisNumUni_To ;
      AV124Pedidos_dis__wwds_38_tfdisunimed = AV80TFDisUniMed ;
      AV125Pedidos_dis__wwds_39_tfdisunimed_sel = AV81TFDisUniMed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV90Pedidos_dis__wwds_4_tfdisest_sels ,
                                           AV89Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                           AV88Pedidos_dis__wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV90Pedidos_dis__wwds_4_tfdisest_sels.size()) ,
                                           AV92Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                           AV91Pedidos_dis__wwds_5_tfdisclinum ,
                                           AV94Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                           AV93Pedidos_dis__wwds_7_tfdisenccli ,
                                           Integer.valueOf(AV95Pedidos_dis__wwds_9_tfdiscod) ,
                                           Integer.valueOf(AV96Pedidos_dis__wwds_10_tfdiscod_to) ,
                                           AV97Pedidos_dis__wwds_11_tfdisfeccli ,
                                           AV98Pedidos_dis__wwds_12_tfdisfec ,
                                           AV99Pedidos_dis__wwds_13_tfdisfecent ,
                                           Integer.valueOf(AV100Pedidos_dis__wwds_14_tfclicod) ,
                                           Integer.valueOf(AV101Pedidos_dis__wwds_15_tfclicod_to) ,
                                           AV103Pedidos_dis__wwds_17_tfclinom_sel ,
                                           AV102Pedidos_dis__wwds_16_tfclinom ,
                                           AV105Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                           AV104Pedidos_dis__wwds_18_tfdisartcod ,
                                           AV107Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                           AV106Pedidos_dis__wwds_20_tfdisartdsc ,
                                           AV109Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                           AV108Pedidos_dis__wwds_22_tfdiscolnom ,
                                           Integer.valueOf(AV110Pedidos_dis__wwds_24_tfdiscolnum) ,
                                           Integer.valueOf(AV111Pedidos_dis__wwds_25_tfdiscolnum_to) ,
                                           Byte.valueOf(AV112Pedidos_dis__wwds_26_tfdistipcol) ,
                                           Byte.valueOf(AV113Pedidos_dis__wwds_27_tfdistipcol_to) ,
                                           AV115Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                           AV114Pedidos_dis__wwds_28_tfdisnomcli ,
                                           Integer.valueOf(AV116Pedidos_dis__wwds_30_tfdisnumcli) ,
                                           Integer.valueOf(AV117Pedidos_dis__wwds_31_tfdisnumcli_to) ,
                                           AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                           AV118Pedidos_dis__wwds_32_tfmaqcoddis ,
                                           Short.valueOf(AV120Pedidos_dis__wwds_34_tfdisnumpie) ,
                                           Short.valueOf(AV121Pedidos_dis__wwds_35_tfdisnumpie_to) ,
                                           AV122Pedidos_dis__wwds_36_tfdisnumuni ,
                                           AV123Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                           AV125Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                           AV124Pedidos_dis__wwds_38_tfdisunimed ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           Short.valueOf(A374DisNumPie) ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV87Pedidos_dis__wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV88Pedidos_dis__wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis__wwds_2_tfdisusrcod), 8, "%") ;
      lV91Pedidos_dis__wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV91Pedidos_dis__wwds_5_tfdisclinum), 8, "%") ;
      lV93Pedidos_dis__wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV93Pedidos_dis__wwds_7_tfdisenccli), 20, "%") ;
      lV102Pedidos_dis__wwds_16_tfclinom = GXutil.padr( GXutil.rtrim( AV102Pedidos_dis__wwds_16_tfclinom), 30, "%") ;
      lV104Pedidos_dis__wwds_18_tfdisartcod = GXutil.padr( GXutil.rtrim( AV104Pedidos_dis__wwds_18_tfdisartcod), 16, "%") ;
      lV106Pedidos_dis__wwds_20_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis__wwds_20_tfdisartdsc), 26, "%") ;
      lV108Pedidos_dis__wwds_22_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV108Pedidos_dis__wwds_22_tfdiscolnom), 13, "%") ;
      lV114Pedidos_dis__wwds_28_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV114Pedidos_dis__wwds_28_tfdisnomcli), 13, "%") ;
      lV118Pedidos_dis__wwds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV118Pedidos_dis__wwds_32_tfmaqcoddis), 6, "%") ;
      lV124Pedidos_dis__wwds_38_tfdisunimed = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis__wwds_38_tfdisunimed), 1, "%") ;
      /* Using cursor P09VE2 */
      pr_default.execute(0, new Object[] {lV88Pedidos_dis__wwds_2_tfdisusrcod, AV89Pedidos_dis__wwds_3_tfdisusrcod_sel, lV91Pedidos_dis__wwds_5_tfdisclinum, AV92Pedidos_dis__wwds_6_tfdisclinum_sel, lV93Pedidos_dis__wwds_7_tfdisenccli, AV94Pedidos_dis__wwds_8_tfdisenccli_sel, Integer.valueOf(AV95Pedidos_dis__wwds_9_tfdiscod), Integer.valueOf(AV96Pedidos_dis__wwds_10_tfdiscod_to), AV97Pedidos_dis__wwds_11_tfdisfeccli, AV98Pedidos_dis__wwds_12_tfdisfec, AV99Pedidos_dis__wwds_13_tfdisfecent, Integer.valueOf(AV100Pedidos_dis__wwds_14_tfclicod), Integer.valueOf(AV101Pedidos_dis__wwds_15_tfclicod_to), lV102Pedidos_dis__wwds_16_tfclinom, AV103Pedidos_dis__wwds_17_tfclinom_sel, lV104Pedidos_dis__wwds_18_tfdisartcod, AV105Pedidos_dis__wwds_19_tfdisartcod_sel, lV106Pedidos_dis__wwds_20_tfdisartdsc, AV107Pedidos_dis__wwds_21_tfdisartdsc_sel, lV108Pedidos_dis__wwds_22_tfdiscolnom, AV109Pedidos_dis__wwds_23_tfdiscolnom_sel, Integer.valueOf(AV110Pedidos_dis__wwds_24_tfdiscolnum), Integer.valueOf(AV111Pedidos_dis__wwds_25_tfdiscolnum_to), Byte.valueOf(AV112Pedidos_dis__wwds_26_tfdistipcol), Byte.valueOf(AV113Pedidos_dis__wwds_27_tfdistipcol_to), lV114Pedidos_dis__wwds_28_tfdisnomcli, AV115Pedidos_dis__wwds_29_tfdisnomcli_sel, Integer.valueOf(AV116Pedidos_dis__wwds_30_tfdisnumcli), Integer.valueOf(AV117Pedidos_dis__wwds_31_tfdisnumcli_to), lV118Pedidos_dis__wwds_32_tfmaqcoddis, AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel, Short.valueOf(AV120Pedidos_dis__wwds_34_tfdisnumpie), Short.valueOf(AV121Pedidos_dis__wwds_35_tfdisnumpie_to), AV122Pedidos_dis__wwds_36_tfdisnumuni, AV123Pedidos_dis__wwds_37_tfdisnumuni_to, lV124Pedidos_dis__wwds_38_tfdisunimed, AV125Pedidos_dis__wwds_39_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A392DisUniMed = P09VE2_A392DisUniMed[0] ;
         A375DisNumUni = P09VE2_A375DisNumUni[0] ;
         A374DisNumPie = P09VE2_A374DisNumPie[0] ;
         A1122MaqCodDis = P09VE2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P09VE2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P09VE2_A1196DisNumCli[0] ;
         A1195DisNomCli = P09VE2_A1195DisNomCli[0] ;
         A390DisTipCol = P09VE2_A390DisTipCol[0] ;
         n390DisTipCol = P09VE2_n390DisTipCol[0] ;
         A363DisColNum = P09VE2_A363DisColNum[0] ;
         n363DisColNum = P09VE2_n363DisColNum[0] ;
         A362DisColNom = P09VE2_A362DisColNom[0] ;
         n362DisColNom = P09VE2_n362DisColNom[0] ;
         A337DisArtDsc = P09VE2_A337DisArtDsc[0] ;
         A335DisArtCod = P09VE2_A335DisArtCod[0] ;
         A279CliNom = P09VE2_A279CliNom[0] ;
         A252CliCod = P09VE2_A252CliCod[0] ;
         A371DisFecEnt = P09VE2_A371DisFecEnt[0] ;
         A369DisFec = P09VE2_A369DisFec[0] ;
         A370DisFecCli = P09VE2_A370DisFecCli[0] ;
         A361DisCod = P09VE2_A361DisCod[0] ;
         A4813DisEncCli = P09VE2_A4813DisEncCli[0] ;
         A360DisCliNum = P09VE2_A360DisCliNum[0] ;
         A4348DisUsrCod = P09VE2_A4348DisUsrCod[0] ;
         A367DisEst = P09VE2_A367DisEst[0] ;
         A396EmprCod = P09VE2_A396EmprCod[0] ;
         A279CliNom = P09VE2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV87Pedidos_dis__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV87Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV87Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
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
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4348DisUsrCod, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( A367DisEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Pedido", "") );
               }
               else if ( A367DisEst == 3 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Produccion", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A360DisCliNum, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4813DisEncCli, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A361DisCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A370DisFecCli );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A369DisFec );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_dtime6 = GXutil.resetTime( A371DisFecEnt );
               AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A335DisArtCod, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A337DisArtDsc, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A362DisColNom, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A363DisColNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A390DisTipCol );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1195DisNomCli, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1196DisNumCli );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1122MaqCodDis, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A374DisNumPie );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A375DisNumUni)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A392DisUniMed, GXv_char5) ;
               dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisUsrCod", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCliNum", "", "Ped. Cli.", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisEncCli", "", "Ped. Cli.", true, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisCod", "", "Nr.Enc", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFecCli", "", "Data ped.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFec", "", "Data reg.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisFecEnt", "", "Data entr.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtCod", "", "Artigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisArtDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNom", "", "Cor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisColNum", "", "Cor. Núm", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisTipCol", "", "TC", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNomCli", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumCli", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCodDis", "", "Maquina", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumPie", "", "Piezas", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisNumUni", "", "Unidades", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DisUniMed", "", "Und.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis__WWColumnsSelector", GXv_char5) ;
      dis__wwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis__WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis__WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Pedidos.Dis__WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV126GXV3 = 1 ;
      while ( AV126GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV61TFDisUsrCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV62TFDisUsrCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV57TFDisEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFDisEst_Sels.fromJSonString(AV57TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV66TFDisCliNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV67TFDisCliNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV68TFDisEncCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV69TFDisEncCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV34TFDisCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDisCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECCLI") == 0 )
         {
            AV36TFDisFecCli = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV38TFDisFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV41TFDisFecEnt = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV43TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV45TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV46TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV47TFDisArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV48TFDisArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV49TFDisArtDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV50TFDisArtDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV51TFDisColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV52TFDisColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV53TFDisColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFDisColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV55TFDisTipCol = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFDisTipCol_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV70TFDisNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV71TFDisNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV72TFDisNumCli = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFDisNumCli_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV74TFMaqCodDis = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV75TFMaqCodDis_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV76TFDisNumPie = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFDisNumPie_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV78TFDisNumUni = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFDisNumUni_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV80TFDisUniMed = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV81TFDisUniMed_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV126GXV3 = (int)(AV126GXV3+1) ;
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
      this.aP0[0] = dis__wwexport.this.AV11Filename;
      this.aP1[0] = dis__wwexport.this.AV12ErrorMessage;
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
      AV62TFDisUsrCod_Sel = "" ;
      AV61TFDisUsrCod = "" ;
      AV58TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV67TFDisCliNum_Sel = "" ;
      AV66TFDisCliNum = "" ;
      AV69TFDisEncCli_Sel = "" ;
      AV68TFDisEncCli = "" ;
      AV36TFDisFecCli = GXutil.nullDate() ;
      AV38TFDisFec = GXutil.nullDate() ;
      AV41TFDisFecEnt = GXutil.nullDate() ;
      AV46TFCliNom_Sel = "" ;
      AV45TFCliNom = "" ;
      AV48TFDisArtCod_Sel = "" ;
      AV47TFDisArtCod = "" ;
      AV50TFDisArtDsc_Sel = "" ;
      AV49TFDisArtDsc = "" ;
      AV52TFDisColNom_Sel = "" ;
      AV51TFDisColNom = "" ;
      AV71TFDisNomCli_Sel = "" ;
      AV70TFDisNomCli = "" ;
      AV75TFMaqCodDis_Sel = "" ;
      AV74TFMaqCodDis = "" ;
      AV78TFDisNumUni = DecimalUtil.ZERO ;
      AV79TFDisNumUni_To = DecimalUtil.ZERO ;
      AV81TFDisUniMed_Sel = "" ;
      AV80TFDisUniMed = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      A396EmprCod = "" ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4348DisUsrCod = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV87Pedidos_dis__wwds_1_filterfulltext = "" ;
      AV88Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      AV89Pedidos_dis__wwds_3_tfdisusrcod_sel = "" ;
      AV90Pedidos_dis__wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV91Pedidos_dis__wwds_5_tfdisclinum = "" ;
      AV92Pedidos_dis__wwds_6_tfdisclinum_sel = "" ;
      AV93Pedidos_dis__wwds_7_tfdisenccli = "" ;
      AV94Pedidos_dis__wwds_8_tfdisenccli_sel = "" ;
      AV97Pedidos_dis__wwds_11_tfdisfeccli = GXutil.nullDate() ;
      AV98Pedidos_dis__wwds_12_tfdisfec = GXutil.nullDate() ;
      AV99Pedidos_dis__wwds_13_tfdisfecent = GXutil.nullDate() ;
      AV102Pedidos_dis__wwds_16_tfclinom = "" ;
      AV103Pedidos_dis__wwds_17_tfclinom_sel = "" ;
      AV104Pedidos_dis__wwds_18_tfdisartcod = "" ;
      AV105Pedidos_dis__wwds_19_tfdisartcod_sel = "" ;
      AV106Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      AV107Pedidos_dis__wwds_21_tfdisartdsc_sel = "" ;
      AV108Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      AV109Pedidos_dis__wwds_23_tfdiscolnom_sel = "" ;
      AV114Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      AV115Pedidos_dis__wwds_29_tfdisnomcli_sel = "" ;
      AV118Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel = "" ;
      AV122Pedidos_dis__wwds_36_tfdisnumuni = DecimalUtil.ZERO ;
      AV123Pedidos_dis__wwds_37_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV124Pedidos_dis__wwds_38_tfdisunimed = "" ;
      AV125Pedidos_dis__wwds_39_tfdisunimed_sel = "" ;
      lV87Pedidos_dis__wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV88Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      lV91Pedidos_dis__wwds_5_tfdisclinum = "" ;
      lV93Pedidos_dis__wwds_7_tfdisenccli = "" ;
      lV102Pedidos_dis__wwds_16_tfclinom = "" ;
      lV104Pedidos_dis__wwds_18_tfdisartcod = "" ;
      lV106Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      lV108Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      lV114Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      lV118Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      lV124Pedidos_dis__wwds_38_tfdisunimed = "" ;
      P09VE2_A392DisUniMed = new String[] {""} ;
      P09VE2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VE2_A374DisNumPie = new short[1] ;
      P09VE2_A1122MaqCodDis = new String[] {""} ;
      P09VE2_n1122MaqCodDis = new boolean[] {false} ;
      P09VE2_A1196DisNumCli = new int[1] ;
      P09VE2_A1195DisNomCli = new String[] {""} ;
      P09VE2_A390DisTipCol = new byte[1] ;
      P09VE2_n390DisTipCol = new boolean[] {false} ;
      P09VE2_A363DisColNum = new int[1] ;
      P09VE2_n363DisColNum = new boolean[] {false} ;
      P09VE2_A362DisColNom = new String[] {""} ;
      P09VE2_n362DisColNom = new boolean[] {false} ;
      P09VE2_A337DisArtDsc = new String[] {""} ;
      P09VE2_A335DisArtCod = new String[] {""} ;
      P09VE2_A279CliNom = new String[] {""} ;
      P09VE2_A252CliCod = new int[1] ;
      P09VE2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09VE2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09VE2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09VE2_A361DisCod = new int[1] ;
      P09VE2_A4813DisEncCli = new String[] {""} ;
      P09VE2_A360DisCliNum = new String[] {""} ;
      P09VE2_A4348DisUsrCod = new String[] {""} ;
      P09VE2_A367DisEst = new byte[1] ;
      P09VE2_A396EmprCod = new String[] {""} ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV57TFDisEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis__wwexport__default(),
         new Object[] {
             new Object[] {
            P09VE2_A392DisUniMed, P09VE2_A375DisNumUni, P09VE2_A374DisNumPie, P09VE2_A1122MaqCodDis, P09VE2_n1122MaqCodDis, P09VE2_A1196DisNumCli, P09VE2_A1195DisNomCli, P09VE2_A390DisTipCol, P09VE2_n390DisTipCol, P09VE2_A363DisColNum,
            P09VE2_n363DisColNum, P09VE2_A362DisColNom, P09VE2_n362DisColNom, P09VE2_A337DisArtDsc, P09VE2_A335DisArtCod, P09VE2_A279CliNom, P09VE2_A252CliCod, P09VE2_A371DisFecEnt, P09VE2_A369DisFec, P09VE2_A370DisFecCli,
            P09VE2_A361DisCod, P09VE2_A4813DisEncCli, P09VE2_A360DisCliNum, P09VE2_A4348DisUsrCod, P09VE2_A367DisEst, P09VE2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59TFDisEst_Sel ;
   private byte AV55TFDisTipCol ;
   private byte AV56TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV112Pedidos_dis__wwds_26_tfdistipcol ;
   private byte AV113Pedidos_dis__wwds_27_tfdistipcol_to ;
   private short AV76TFDisNumPie ;
   private short AV77TFDisNumPie_To ;
   private short GXv_int3[] ;
   private short A374DisNumPie ;
   private short AV120Pedidos_dis__wwds_34_tfdisnumpie ;
   private short AV121Pedidos_dis__wwds_35_tfdisnumpie_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV84GXV1 ;
   private int AV34TFDisCod ;
   private int AV35TFDisCod_To ;
   private int AV43TFCliCod ;
   private int AV44TFCliCod_To ;
   private int AV53TFDisColNum ;
   private int AV54TFDisColNum_To ;
   private int AV72TFDisNumCli ;
   private int AV73TFDisNumCli_To ;
   private int AV85GXV2 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV95Pedidos_dis__wwds_9_tfdiscod ;
   private int AV96Pedidos_dis__wwds_10_tfdiscod_to ;
   private int AV100Pedidos_dis__wwds_14_tfclicod ;
   private int AV101Pedidos_dis__wwds_15_tfclicod_to ;
   private int AV110Pedidos_dis__wwds_24_tfdiscolnum ;
   private int AV111Pedidos_dis__wwds_25_tfdiscolnum_to ;
   private int AV116Pedidos_dis__wwds_30_tfdisnumcli ;
   private int AV117Pedidos_dis__wwds_31_tfdisnumcli_to ;
   private int AV90Pedidos_dis__wwds_4_tfdisest_sels_size ;
   private int AV126GXV3 ;
   private long AV60i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV78TFDisNumUni ;
   private java.math.BigDecimal AV79TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV122Pedidos_dis__wwds_36_tfdisnumuni ;
   private java.math.BigDecimal AV123Pedidos_dis__wwds_37_tfdisnumuni_to ;
   private String AV62TFDisUsrCod_Sel ;
   private String AV61TFDisUsrCod ;
   private String AV67TFDisCliNum_Sel ;
   private String AV66TFDisCliNum ;
   private String AV69TFDisEncCli_Sel ;
   private String AV68TFDisEncCli ;
   private String AV46TFCliNom_Sel ;
   private String AV45TFCliNom ;
   private String AV48TFDisArtCod_Sel ;
   private String AV47TFDisArtCod ;
   private String AV50TFDisArtDsc_Sel ;
   private String AV49TFDisArtDsc ;
   private String AV52TFDisColNom_Sel ;
   private String AV51TFDisColNom ;
   private String AV71TFDisNomCli_Sel ;
   private String AV70TFDisNomCli ;
   private String AV75TFMaqCodDis_Sel ;
   private String AV74TFMaqCodDis ;
   private String AV81TFDisUniMed_Sel ;
   private String AV80TFDisUniMed ;
   private String A396EmprCod ;
   private String A4348DisUsrCod ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1122MaqCodDis ;
   private String A392DisUniMed ;
   private String AV88Pedidos_dis__wwds_2_tfdisusrcod ;
   private String AV89Pedidos_dis__wwds_3_tfdisusrcod_sel ;
   private String AV91Pedidos_dis__wwds_5_tfdisclinum ;
   private String AV92Pedidos_dis__wwds_6_tfdisclinum_sel ;
   private String AV93Pedidos_dis__wwds_7_tfdisenccli ;
   private String AV94Pedidos_dis__wwds_8_tfdisenccli_sel ;
   private String AV102Pedidos_dis__wwds_16_tfclinom ;
   private String AV103Pedidos_dis__wwds_17_tfclinom_sel ;
   private String AV104Pedidos_dis__wwds_18_tfdisartcod ;
   private String AV105Pedidos_dis__wwds_19_tfdisartcod_sel ;
   private String AV106Pedidos_dis__wwds_20_tfdisartdsc ;
   private String AV107Pedidos_dis__wwds_21_tfdisartdsc_sel ;
   private String AV108Pedidos_dis__wwds_22_tfdiscolnom ;
   private String AV109Pedidos_dis__wwds_23_tfdiscolnom_sel ;
   private String AV114Pedidos_dis__wwds_28_tfdisnomcli ;
   private String AV115Pedidos_dis__wwds_29_tfdisnomcli_sel ;
   private String AV118Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel ;
   private String AV124Pedidos_dis__wwds_38_tfdisunimed ;
   private String AV125Pedidos_dis__wwds_39_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV88Pedidos_dis__wwds_2_tfdisusrcod ;
   private String lV91Pedidos_dis__wwds_5_tfdisclinum ;
   private String lV93Pedidos_dis__wwds_7_tfdisenccli ;
   private String lV102Pedidos_dis__wwds_16_tfclinom ;
   private String lV104Pedidos_dis__wwds_18_tfdisartcod ;
   private String lV106Pedidos_dis__wwds_20_tfdisartdsc ;
   private String lV108Pedidos_dis__wwds_22_tfdiscolnom ;
   private String lV114Pedidos_dis__wwds_28_tfdisnomcli ;
   private String lV118Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String lV124Pedidos_dis__wwds_38_tfdisunimed ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFDisFecCli ;
   private java.util.Date AV38TFDisFec ;
   private java.util.Date AV41TFDisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV97Pedidos_dis__wwds_11_tfdisfeccli ;
   private java.util.Date AV98Pedidos_dis__wwds_12_tfdisfec ;
   private java.util.Date AV99Pedidos_dis__wwds_13_tfdisfecent ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean Cond_result ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV57TFDisEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV87Pedidos_dis__wwds_1_filterfulltext ;
   private String lV87Pedidos_dis__wwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV58TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV90Pedidos_dis__wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09VE2_A392DisUniMed ;
   private java.math.BigDecimal[] P09VE2_A375DisNumUni ;
   private short[] P09VE2_A374DisNumPie ;
   private String[] P09VE2_A1122MaqCodDis ;
   private boolean[] P09VE2_n1122MaqCodDis ;
   private int[] P09VE2_A1196DisNumCli ;
   private String[] P09VE2_A1195DisNomCli ;
   private byte[] P09VE2_A390DisTipCol ;
   private boolean[] P09VE2_n390DisTipCol ;
   private int[] P09VE2_A363DisColNum ;
   private boolean[] P09VE2_n363DisColNum ;
   private String[] P09VE2_A362DisColNom ;
   private boolean[] P09VE2_n362DisColNom ;
   private String[] P09VE2_A337DisArtDsc ;
   private String[] P09VE2_A335DisArtCod ;
   private String[] P09VE2_A279CliNom ;
   private int[] P09VE2_A252CliCod ;
   private java.util.Date[] P09VE2_A371DisFecEnt ;
   private java.util.Date[] P09VE2_A369DisFec ;
   private java.util.Date[] P09VE2_A370DisFecCli ;
   private int[] P09VE2_A361DisCod ;
   private String[] P09VE2_A4813DisEncCli ;
   private String[] P09VE2_A360DisCliNum ;
   private String[] P09VE2_A4348DisUsrCod ;
   private byte[] P09VE2_A367DisEst ;
   private String[] P09VE2_A396EmprCod ;
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

final  class dis__wwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09VE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV90Pedidos_dis__wwds_4_tfdisest_sels ,
                                          String AV89Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                          String AV88Pedidos_dis__wwds_2_tfdisusrcod ,
                                          int AV90Pedidos_dis__wwds_4_tfdisest_sels_size ,
                                          String AV92Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                          String AV91Pedidos_dis__wwds_5_tfdisclinum ,
                                          String AV94Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                          String AV93Pedidos_dis__wwds_7_tfdisenccli ,
                                          int AV95Pedidos_dis__wwds_9_tfdiscod ,
                                          int AV96Pedidos_dis__wwds_10_tfdiscod_to ,
                                          java.util.Date AV97Pedidos_dis__wwds_11_tfdisfeccli ,
                                          java.util.Date AV98Pedidos_dis__wwds_12_tfdisfec ,
                                          java.util.Date AV99Pedidos_dis__wwds_13_tfdisfecent ,
                                          int AV100Pedidos_dis__wwds_14_tfclicod ,
                                          int AV101Pedidos_dis__wwds_15_tfclicod_to ,
                                          String AV103Pedidos_dis__wwds_17_tfclinom_sel ,
                                          String AV102Pedidos_dis__wwds_16_tfclinom ,
                                          String AV105Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                          String AV104Pedidos_dis__wwds_18_tfdisartcod ,
                                          String AV107Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                          String AV106Pedidos_dis__wwds_20_tfdisartdsc ,
                                          String AV109Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                          String AV108Pedidos_dis__wwds_22_tfdiscolnom ,
                                          int AV110Pedidos_dis__wwds_24_tfdiscolnum ,
                                          int AV111Pedidos_dis__wwds_25_tfdiscolnum_to ,
                                          byte AV112Pedidos_dis__wwds_26_tfdistipcol ,
                                          byte AV113Pedidos_dis__wwds_27_tfdistipcol_to ,
                                          String AV115Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                          String AV114Pedidos_dis__wwds_28_tfdisnomcli ,
                                          int AV116Pedidos_dis__wwds_30_tfdisnumcli ,
                                          int AV117Pedidos_dis__wwds_31_tfdisnumcli_to ,
                                          String AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                          String AV118Pedidos_dis__wwds_32_tfmaqcoddis ,
                                          short AV120Pedidos_dis__wwds_34_tfdisnumpie ,
                                          short AV121Pedidos_dis__wwds_35_tfdisnumpie_to ,
                                          java.math.BigDecimal AV122Pedidos_dis__wwds_36_tfdisnumuni ,
                                          java.math.BigDecimal AV123Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                          String AV125Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                          String AV124Pedidos_dis__wwds_38_tfdisunimed ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          short A374DisNumPie ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV87Pedidos_dis__wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[37];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV89Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis__wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( AV90Pedidos_dis__wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Pedidos_dis__wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV92Pedidos_dis__wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV91Pedidos_dis__wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Pedidos_dis__wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_dis__wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_dis__wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_dis__wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_dis__wwds_9_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_dis__wwds_10_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Pedidos_dis__wwds_11_tfdisfeccli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Pedidos_dis__wwds_12_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Pedidos_dis__wwds_13_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Pedidos_dis__wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV101Pedidos_dis__wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidos_dis__wwds_17_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidos_dis__wwds_16_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidos_dis__wwds_17_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidos_dis__wwds_19_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_dis__wwds_18_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_dis__wwds_19_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis__wwds_20_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_dis__wwds_22_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_dis__wwds_24_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_dis__wwds_25_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV112Pedidos_dis__wwds_26_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_dis__wwds_27_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV114Pedidos_dis__wwds_28_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis__wwds_30_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis__wwds_31_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV118Pedidos_dis__wwds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidos_dis__wwds_34_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidos_dis__wwds_35_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_dis__wwds_36_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_dis__wwds_37_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis__wwds_39_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis__wwds_38_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis__wwds_39_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV16OrderedBy == 15 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV16OrderedBy == 16 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV16OrderedBy == 17 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV16OrderedBy == 18 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV16OrderedBy == 19 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV16OrderedBy == 20 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV16OrderedBy == 21 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV16OrderedBy == 22 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
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
                  return conditional_P09VE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.math.BigDecimal)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Boolean) dynConstraints[61]).booleanValue() , (String)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 20);
               ((String[]) buf[22])[0] = rslt.getString(19, 8);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 3);
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
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               return;
      }
   }

}

