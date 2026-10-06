package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidodevolucionwwexport extends GXProcedure
{
   public almacentejidodevolucionwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidodevolucionwwexport.class ), "" );
   }

   public almacentejidodevolucionwwexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      almacentejidodevolucionwwexport.this.aP1 = new String[] {""};
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
      almacentejidodevolucionwwexport.this.aP0 = aP0;
      almacentejidodevolucionwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "AlmacenTejidoDevolucionWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFDevCruId) && (0==AV35TFDevCruId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Devolucion Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFDevCruId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFDevCruId_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFDevCruFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFDevCruFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV38TFDevCruSal) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha-Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV38TFDevCruSal );
      }
      if ( ! ( (0==AV40TFCliCod) && (0==AV41TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFCliNom_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFCliNom, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV44TFTrnCod) && (0==AV45TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFTrnNom_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFTrnNom, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFDevCruMat_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDevCruMat_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFDevCruMat)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDevCruMat, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFDevCruAtId_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ATDocCodeID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFDevCruAtId_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFDevCruAtId)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ATDocCodeID", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFDevCruAtId, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV53TFDevCruStt_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Status", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV61i = 1 ;
         AV66GXV1 = 1 ;
         while ( AV66GXV1 <= AV53TFDevCruStt_Sels.size() )
         {
            AV54TFDevCruStt_Sel = (String)AV53TFDevCruStt_Sels.elementAt(-1+AV66GXV1) ;
            if ( AV61i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV54TFDevCruStt_Sel), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFDevCruStt_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulado", "") );
            }
            AV61i = (long)(AV61i+1) ;
            AV66GXV1 = (int)(AV66GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFDevCruHash_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFDevCruHash_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV57TFDevCruHash)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFDevCruHash, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFDevCruDesc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFDevCruDesc_Sel, GXv_char5) ;
         almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV59TFDevCruDesc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            almacentejidodevolucionwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFDevCruDesc, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV67GXV2 = 1 ;
      while ( AV67GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV67GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV67GXV2 = (int)(AV67GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = AV18FilterFullText ;
      AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid = AV34TFDevCruId ;
      AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to = AV35TFDevCruId_To ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = AV36TFDevCruFec ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = AV38TFDevCruSal ;
      AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod = AV40TFCliCod ;
      AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to = AV41TFCliCod_To ;
      AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = AV42TFCliNom ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = AV43TFCliNom_Sel ;
      AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod = AV44TFTrnCod ;
      AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to = AV45TFTrnCod_To ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = AV46TFTrnNom ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = AV47TFTrnNom_Sel ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = AV48TFDevCruMat ;
      AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = AV49TFDevCruMat_Sel ;
      AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = AV50TFDevCruAtId ;
      AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = AV51TFDevCruAtId_Sel ;
      AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = AV53TFDevCruStt_Sels ;
      AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = AV57TFDevCruHash ;
      AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = AV58TFDevCruHash_Sel ;
      AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = AV59TFDevCruDesc ;
      AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = AV60TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                           AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                           Integer.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) ,
                                           AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                           AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) ,
                                           Integer.valueOf(AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) ,
                                           AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                           AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                           Short.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) ,
                                           Short.valueOf(AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) ,
                                           AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                           AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                           AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                           AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                           AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                           AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels.size()) ,
                                           AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                           AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                           AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                           AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext), "%", "") ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom), 30, "%") ;
      lV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom), 30, "%") ;
      lV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat), 20, "%") ;
      lV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid), 20, "%") ;
      lV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash), 200, "%") ;
      lV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09JC2 */
      pr_default.execute(0, new Object[] {lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext, Integer.valueOf(AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid), Integer.valueOf(AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to), AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec, AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal, Integer.valueOf(AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod), Integer.valueOf(AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to), lV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom, AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel, Short.valueOf(AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod), Short.valueOf(AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to), lV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom, AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel, lV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat, AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel, lV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid, AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel, lV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash, AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel, lV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc, AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09JC2_A396EmprCod[0] ;
         A11675DevCruDesc = P09JC2_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09JC2_A11674DevCruHash[0] ;
         A11678DevCruStt = P09JC2_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09JC2_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09JC2_A11672DevCruMat[0] ;
         A841TrnNom = P09JC2_A841TrnNom[0] ;
         n841TrnNom = P09JC2_n841TrnNom[0] ;
         A840TrnCod = P09JC2_A840TrnCod[0] ;
         n840TrnCod = P09JC2_n840TrnCod[0] ;
         A279CliNom = P09JC2_A279CliNom[0] ;
         A252CliCod = P09JC2_A252CliCod[0] ;
         A11673DevCruSal = P09JC2_A11673DevCruSal[0] ;
         A11670DevCruFec = P09JC2_A11670DevCruFec[0] ;
         A11669DevCruId = P09JC2_A11669DevCruId[0] ;
         A841TrnNom = P09JC2_A841TrnNom[0] ;
         n841TrnNom = P09JC2_n841TrnNom[0] ;
         A279CliNom = P09JC2_A279CliNom[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A11669DevCruId );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A11670DevCruFec );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A11673DevCruSal );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A840TrnCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A841TrnNom, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11672DevCruMat, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11680DevCruAtId, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A11678DevCruStt), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Anulado", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11674DevCruHash, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11675DevCruDesc, GXv_char5) ;
            almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruId", "", "Devolucion Id", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruFec", "", "Fecha", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruSal", "Salida", "Fecha-Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnCod", "", "Cod Transp", false, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TrnNom", "", "Transportista", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruMat", "", "Matricula", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruAtId", "", "ATDocCodeID", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruStt", "", "Status", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruHash", "Hash", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruDesc", "Hash", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AlmacenSinDetalle.AlmacenTejidoDevolucionWWColumnsSelector", GXv_char5) ;
      almacentejidodevolucionwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("AlmacenSinDetalle.AlmacenTejidoDevolucionWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV91GXV3 = 1 ;
      while ( AV91GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUID") == 0 )
         {
            AV34TFDevCruId = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDevCruId_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUFEC") == 0 )
         {
            AV36TFDevCruFec = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSAL") == 0 )
         {
            AV38TFDevCruSal = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV40TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV42TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV43TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV44TFTrnCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFTrnCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV46TFTrnNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV47TFTrnNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV48TFDevCruMat = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV49TFDevCruMat_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV50TFDevCruAtId = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV51TFDevCruAtId_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV52TFDevCruStt_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFDevCruStt_Sels.fromJSonString(AV52TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH") == 0 )
         {
            AV57TFDevCruHash = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUHASH_SEL") == 0 )
         {
            AV58TFDevCruHash_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC") == 0 )
         {
            AV59TFDevCruDesc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUDESC_SEL") == 0 )
         {
            AV60TFDevCruDesc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV91GXV3 = (int)(AV91GXV3+1) ;
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
      this.aP0[0] = almacentejidodevolucionwwexport.this.AV11Filename;
      this.aP1[0] = almacentejidodevolucionwwexport.this.AV12ErrorMessage;
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
      AV36TFDevCruFec = GXutil.nullDate() ;
      AV38TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV43TFCliNom_Sel = "" ;
      AV42TFCliNom = "" ;
      AV47TFTrnNom_Sel = "" ;
      AV46TFTrnNom = "" ;
      AV49TFDevCruMat_Sel = "" ;
      AV48TFDevCruMat = "" ;
      AV51TFDevCruAtId_Sel = "" ;
      AV50TFDevCruAtId = "" ;
      AV53TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFDevCruStt_Sel = "" ;
      AV58TFDevCruHash_Sel = "" ;
      AV57TFDevCruHash = "" ;
      AV60TFDevCruDesc_Sel = "" ;
      AV59TFDevCruDesc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A11670DevCruFec = GXutil.nullDate() ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A11672DevCruMat = "" ;
      A11680DevCruAtId = "" ;
      A11678DevCruStt = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel = "" ;
      AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel = "" ;
      AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel = "" ;
      AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel = "" ;
      AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel = "" ;
      AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel = "" ;
      scmdbuf = "" ;
      lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext = "" ;
      lV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom = "" ;
      lV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom = "" ;
      lV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat = "" ;
      lV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid = "" ;
      lV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash = "" ;
      lV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc = "" ;
      P09JC2_A396EmprCod = new String[] {""} ;
      P09JC2_A11675DevCruDesc = new String[] {""} ;
      P09JC2_A11674DevCruHash = new String[] {""} ;
      P09JC2_A11678DevCruStt = new String[] {""} ;
      P09JC2_A11680DevCruAtId = new String[] {""} ;
      P09JC2_A11672DevCruMat = new String[] {""} ;
      P09JC2_A841TrnNom = new String[] {""} ;
      P09JC2_n841TrnNom = new boolean[] {false} ;
      P09JC2_A840TrnCod = new short[1] ;
      P09JC2_n840TrnCod = new boolean[] {false} ;
      P09JC2_A279CliNom = new String[] {""} ;
      P09JC2_A252CliCod = new int[1] ;
      P09JC2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09JC2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09JC2_A11669DevCruId = new int[1] ;
      A396EmprCod = "" ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52TFDevCruStt_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidodevolucionwwexport__default(),
         new Object[] {
             new Object[] {
            P09JC2_A396EmprCod, P09JC2_A11675DevCruDesc, P09JC2_A11674DevCruHash, P09JC2_A11678DevCruStt, P09JC2_A11680DevCruAtId, P09JC2_A11672DevCruMat, P09JC2_A841TrnNom, P09JC2_n841TrnNom, P09JC2_A840TrnCod, P09JC2_n840TrnCod,
            P09JC2_A279CliNom, P09JC2_A252CliCod, P09JC2_A11673DevCruSal, P09JC2_A11670DevCruFec, P09JC2_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV44TFTrnCod ;
   private short AV45TFTrnCod_To ;
   private short GXv_int3[] ;
   private short A840TrnCod ;
   private short AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ;
   private short AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFDevCruId ;
   private int AV35TFDevCruId_To ;
   private int AV40TFCliCod ;
   private int AV41TFCliCod_To ;
   private int AV66GXV1 ;
   private int AV67GXV2 ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ;
   private int AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ;
   private int AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ;
   private int AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ;
   private int AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ;
   private int AV91GXV3 ;
   private long AV61i ;
   private long AV31VisibleColumnCount ;
   private String AV43TFCliNom_Sel ;
   private String AV42TFCliNom ;
   private String AV47TFTrnNom_Sel ;
   private String AV46TFTrnNom ;
   private String AV49TFDevCruMat_Sel ;
   private String AV48TFDevCruMat ;
   private String AV51TFDevCruAtId_Sel ;
   private String AV50TFDevCruAtId ;
   private String AV54TFDevCruStt_Sel ;
   private String AV58TFDevCruHash_Sel ;
   private String AV57TFDevCruHash ;
   private String AV60TFDevCruDesc_Sel ;
   private String AV59TFDevCruDesc ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String A11672DevCruMat ;
   private String A11680DevCruAtId ;
   private String A11678DevCruStt ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ;
   private String AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ;
   private String AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ;
   private String AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ;
   private String AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ;
   private String AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ;
   private String scmdbuf ;
   private String lV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ;
   private String lV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ;
   private String lV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ;
   private String lV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ;
   private String lV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ;
   private String lV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV38TFDevCruSal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV52TFDevCruStt_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private String lV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV53TFDevCruStt_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09JC2_A396EmprCod ;
   private String[] P09JC2_A11675DevCruDesc ;
   private String[] P09JC2_A11674DevCruHash ;
   private String[] P09JC2_A11678DevCruStt ;
   private String[] P09JC2_A11680DevCruAtId ;
   private String[] P09JC2_A11672DevCruMat ;
   private String[] P09JC2_A841TrnNom ;
   private boolean[] P09JC2_n841TrnNom ;
   private short[] P09JC2_A840TrnCod ;
   private boolean[] P09JC2_n840TrnCod ;
   private String[] P09JC2_A279CliNom ;
   private int[] P09JC2_A252CliCod ;
   private java.util.Date[] P09JC2_A11673DevCruSal ;
   private java.util.Date[] P09JC2_A11670DevCruFec ;
   private int[] P09JC2_A11669DevCruId ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ;
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

final  class almacentejidodevolucionwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels ,
                                          String AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext ,
                                          int AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid ,
                                          int AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to ,
                                          java.util.Date AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec ,
                                          java.util.Date AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal ,
                                          int AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod ,
                                          int AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to ,
                                          String AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel ,
                                          String AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom ,
                                          short AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod ,
                                          short AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to ,
                                          String AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel ,
                                          String AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom ,
                                          String AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel ,
                                          String AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat ,
                                          String AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel ,
                                          String AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid ,
                                          int AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size ,
                                          String AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel ,
                                          String AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash ,
                                          String AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel ,
                                          String AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[30];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal, T1.DevCruFec," ;
      scmdbuf += " T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_almacentejidodevolucionwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
      }
      if ( ! (0==AV70Almacensindetalle_almacentejidodevolucionwwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Almacensindetalle_almacentejidodevolucionwwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Almacensindetalle_almacentejidodevolucionwwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Almacensindetalle_almacentejidodevolucionwwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV74Almacensindetalle_almacentejidodevolucionwwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV75Almacensindetalle_almacentejidodevolucionwwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_almacentejidodevolucionwwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_almacentejidodevolucionwwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV78Almacensindetalle_almacentejidodevolucionwwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV79Almacensindetalle_almacentejidodevolucionwwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_almacentejidodevolucionwwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_almacentejidodevolucionwwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_almacentejidodevolucionwwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_almacentejidodevolucionwwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_almacentejidodevolucionwwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_almacentejidodevolucionwwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Almacensindetalle_almacentejidodevolucionwwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV87Almacensindetalle_almacentejidodevolucionwwds_19_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Almacensindetalle_almacentejidodevolucionwwds_20_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV89Almacensindetalle_almacentejidodevolucionwwds_21_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Almacensindetalle_almacentejidodevolucionwwds_22_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruSal" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruSal DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruMat" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruMat DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruAtId DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruStt" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruStt DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruHash" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruHash DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc DESC" ;
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
                  return conditional_P09JC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 300);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 200);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 300);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 300);
               }
               return;
      }
   }

}

