package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devolucionalmacentejidocrudosindetallewwexport extends GXProcedure
{
   public devolucionalmacentejidocrudosindetallewwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devolucionalmacentejidocrudosindetallewwexport.class ), "" );
   }

   public devolucionalmacentejidocrudosindetallewwexport( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      devolucionalmacentejidocrudosindetallewwexport.this.aP1 = new String[] {""};
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
      devolucionalmacentejidocrudosindetallewwexport.this.aP0 = aP0;
      devolucionalmacentejidocrudosindetallewwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "DevolucionAlmacenTejidoCrudosindetalleWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFDevCruId) && (0==AV35TFDevCruId_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Devolucion Id", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFDevCruId );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFDevCruId_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36TFDevCruFec)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV36TFDevCruFec );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV55TFDevCruSal) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha-Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV55TFDevCruSal );
      }
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCliNom_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV42TFTrnCod) && (0==AV43TFTrnCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cod Transp", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFTrnCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFTrnCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFTrnNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFTrnNom_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFTrnNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Transportista", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFTrnNom, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFDevCruMat_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFDevCruMat_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFDevCruMat)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Matricula", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFDevCruMat, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV62TFDevCruAtId_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ATDocCodeID", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFDevCruAtId_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV61TFDevCruAtId)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "ATDocCodeID", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV61TFDevCruAtId, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV54TFDevCruStt_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Status", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         AV50i = 1 ;
         AV65GXV1 = 1 ;
         while ( AV65GXV1 <= AV54TFDevCruStt_Sels.size() )
         {
            AV52TFDevCruStt_Sel = (String)AV54TFDevCruStt_Sels.elementAt(-1+AV65GXV1) ;
            if ( AV50i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV52TFDevCruStt_Sel), "") == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Activo", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV52TFDevCruStt_Sel), httpContext.getMessage( "A", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Anulado", "") );
            }
            AV50i = (long)(AV50i+1) ;
            AV65GXV1 = (int)(AV65GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFDevCruObs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFDevCruObs_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFDevCruObs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Observaciones", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFDevCruObs, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV58TFDevCruHash_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFDevCruHash_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFDevCruHash, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV60TFDevCruDesc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60TFDevCruDesc_Sel, GXv_char5) ;
         devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
            devolucionalmacentejidocrudosindetallewwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFDevCruDesc, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV66GXV2 = 1 ;
      while ( AV66GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV66GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV66GXV2 = (int)(AV66GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = AV18FilterFullText ;
      AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid = AV34TFDevCruId ;
      AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to = AV35TFDevCruId_To ;
      AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = AV36TFDevCruFec ;
      AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = AV55TFDevCruSal ;
      AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod = AV38TFCliCod ;
      AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to = AV39TFCliCod_To ;
      AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = AV40TFCliNom ;
      AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = AV41TFCliNom_Sel ;
      AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod = AV42TFTrnCod ;
      AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to = AV43TFTrnCod_To ;
      AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = AV44TFTrnNom ;
      AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = AV45TFTrnNom_Sel ;
      AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = AV46TFDevCruMat ;
      AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = AV47TFDevCruMat_Sel ;
      AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = AV61TFDevCruAtId ;
      AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = AV62TFDevCruAtId_Sel ;
      AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = AV54TFDevCruStt_Sels ;
      AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = AV48TFDevCruObs ;
      AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = AV49TFDevCruObs_Sel ;
      AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = AV57TFDevCruHash ;
      AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = AV58TFDevCruHash_Sel ;
      AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = AV59TFDevCruDesc ;
      AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = AV60TFDevCruDesc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11678DevCruStt ,
                                           AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                           AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                           Integer.valueOf(AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) ,
                                           Integer.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) ,
                                           AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                           AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                           Integer.valueOf(AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) ,
                                           Integer.valueOf(AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) ,
                                           AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                           AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                           Short.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) ,
                                           Short.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) ,
                                           AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                           AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                           AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                           AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                           AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                           AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                           Integer.valueOf(AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels.size()) ,
                                           AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                           AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                           AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                           AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                           AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                           AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                           Integer.valueOf(A11669DevCruId) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A11672DevCruMat ,
                                           A11680DevCruAtId ,
                                           A11682DevCruObs ,
                                           A11674DevCruHash ,
                                           A11675DevCruDesc ,
                                           A11670DevCruFec ,
                                           A11673DevCruSal ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext), "%", "") ;
      lV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom), 30, "%") ;
      lV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = GXutil.padr( GXutil.rtrim( AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom), 30, "%") ;
      lV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = GXutil.padr( GXutil.rtrim( AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat), 20, "%") ;
      lV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = GXutil.padr( GXutil.rtrim( AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid), 20, "%") ;
      lV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = GXutil.concat( GXutil.rtrim( AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs), "%", "") ;
      lV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = GXutil.padr( GXutil.rtrim( AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash), 200, "%") ;
      lV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = GXutil.padr( GXutil.rtrim( AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc), 300, "%") ;
      /* Using cursor P09052 */
      pr_default.execute(0, new Object[] {lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext, Integer.valueOf(AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid), Integer.valueOf(AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to), AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec, AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal, Integer.valueOf(AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod), Integer.valueOf(AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to), lV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom, AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel, Short.valueOf(AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod), Short.valueOf(AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to), lV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom, AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel, lV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat, AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel, lV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid, AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel, lV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs, AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel, lV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash, AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel, lV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc, AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09052_A396EmprCod[0] ;
         A11675DevCruDesc = P09052_A11675DevCruDesc[0] ;
         A11674DevCruHash = P09052_A11674DevCruHash[0] ;
         A11682DevCruObs = P09052_A11682DevCruObs[0] ;
         A11678DevCruStt = P09052_A11678DevCruStt[0] ;
         A11680DevCruAtId = P09052_A11680DevCruAtId[0] ;
         A11672DevCruMat = P09052_A11672DevCruMat[0] ;
         A841TrnNom = P09052_A841TrnNom[0] ;
         n841TrnNom = P09052_n841TrnNom[0] ;
         A840TrnCod = P09052_A840TrnCod[0] ;
         n840TrnCod = P09052_n840TrnCod[0] ;
         A279CliNom = P09052_A279CliNom[0] ;
         A252CliCod = P09052_A252CliCod[0] ;
         A11673DevCruSal = P09052_A11673DevCruSal[0] ;
         A11670DevCruFec = P09052_A11670DevCruFec[0] ;
         A11669DevCruId = P09052_A11669DevCruId[0] ;
         A841TrnNom = P09052_A841TrnNom[0] ;
         n841TrnNom = P09052_n841TrnNom[0] ;
         A279CliNom = P09052_A279CliNom[0] ;
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
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11672DevCruMat, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11680DevCruAtId, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11682DevCruObs, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11674DevCruHash, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11675DevCruDesc, GXv_char5) ;
            devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruObs", "", "Observaciones", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruHash", "Hash", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "DevCruDesc", "Hash", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "DevolucionAlmacenTejidoCrudosindetalleWWColumnsSelector", GXv_char5) ;
      devolucionalmacentejidocrudosindetallewwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("DevolucionAlmacenTejidoCrudosindetalleWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV92GXV3 = 1 ;
      while ( AV92GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV3));
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
            AV55TFDevCruSal = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV42TFTrnCod = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFTrnCod_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV44TFTrnNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV45TFTrnNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT") == 0 )
         {
            AV46TFDevCruMat = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUMAT_SEL") == 0 )
         {
            AV47TFDevCruMat_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID") == 0 )
         {
            AV61TFDevCruAtId = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUATID_SEL") == 0 )
         {
            AV62TFDevCruAtId_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUSTT_SEL") == 0 )
         {
            AV53TFDevCruStt_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFDevCruStt_Sels.fromJSonString(AV53TFDevCruStt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS") == 0 )
         {
            AV48TFDevCruObs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUOBS_SEL") == 0 )
         {
            AV49TFDevCruObs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         AV92GXV3 = (int)(AV92GXV3+1) ;
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
      this.aP0[0] = devolucionalmacentejidocrudosindetallewwexport.this.AV11Filename;
      this.aP1[0] = devolucionalmacentejidocrudosindetallewwexport.this.AV12ErrorMessage;
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
      AV55TFDevCruSal = GXutil.resetTime( GXutil.nullDate() );
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV45TFTrnNom_Sel = "" ;
      AV44TFTrnNom = "" ;
      AV47TFDevCruMat_Sel = "" ;
      AV46TFDevCruMat = "" ;
      AV62TFDevCruAtId_Sel = "" ;
      AV61TFDevCruAtId = "" ;
      AV54TFDevCruStt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFDevCruStt_Sel = "" ;
      AV49TFDevCruObs_Sel = "" ;
      AV48TFDevCruObs = "" ;
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
      A11682DevCruObs = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec = GXutil.nullDate() ;
      AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal = GXutil.resetTime( GXutil.nullDate() );
      AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel = "" ;
      AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel = "" ;
      AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel = "" ;
      AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel = "" ;
      AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel = "" ;
      AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel = "" ;
      AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel = "" ;
      scmdbuf = "" ;
      lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext = "" ;
      lV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom = "" ;
      lV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom = "" ;
      lV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat = "" ;
      lV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid = "" ;
      lV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs = "" ;
      lV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash = "" ;
      lV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc = "" ;
      P09052_A396EmprCod = new String[] {""} ;
      P09052_A11675DevCruDesc = new String[] {""} ;
      P09052_A11674DevCruHash = new String[] {""} ;
      P09052_A11682DevCruObs = new String[] {""} ;
      P09052_A11678DevCruStt = new String[] {""} ;
      P09052_A11680DevCruAtId = new String[] {""} ;
      P09052_A11672DevCruMat = new String[] {""} ;
      P09052_A841TrnNom = new String[] {""} ;
      P09052_n841TrnNom = new boolean[] {false} ;
      P09052_A840TrnCod = new short[1] ;
      P09052_n840TrnCod = new boolean[] {false} ;
      P09052_A279CliNom = new String[] {""} ;
      P09052_A252CliCod = new int[1] ;
      P09052_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09052_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09052_A11669DevCruId = new int[1] ;
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
      AV53TFDevCruStt_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.devolucionalmacentejidocrudosindetallewwexport__default(),
         new Object[] {
             new Object[] {
            P09052_A396EmprCod, P09052_A11675DevCruDesc, P09052_A11674DevCruHash, P09052_A11682DevCruObs, P09052_A11678DevCruStt, P09052_A11680DevCruAtId, P09052_A11672DevCruMat, P09052_A841TrnNom, P09052_n841TrnNom, P09052_A840TrnCod,
            P09052_n840TrnCod, P09052_A279CliNom, P09052_A252CliCod, P09052_A11673DevCruSal, P09052_A11670DevCruFec, P09052_A11669DevCruId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV42TFTrnCod ;
   private short AV43TFTrnCod_To ;
   private short GXv_int3[] ;
   private short A840TrnCod ;
   private short AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ;
   private short AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFDevCruId ;
   private int AV35TFDevCruId_To ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV65GXV1 ;
   private int AV66GXV2 ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ;
   private int AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ;
   private int AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ;
   private int AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ;
   private int AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ;
   private int AV92GXV3 ;
   private long AV50i ;
   private long AV31VisibleColumnCount ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV45TFTrnNom_Sel ;
   private String AV44TFTrnNom ;
   private String AV47TFDevCruMat_Sel ;
   private String AV46TFDevCruMat ;
   private String AV62TFDevCruAtId_Sel ;
   private String AV61TFDevCruAtId ;
   private String AV52TFDevCruStt_Sel ;
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
   private String AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ;
   private String AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ;
   private String AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ;
   private String AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ;
   private String AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ;
   private String AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ;
   private String scmdbuf ;
   private String lV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ;
   private String lV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ;
   private String lV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ;
   private String lV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ;
   private String lV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ;
   private String lV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV55TFDevCruSal ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV36TFDevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV53TFDevCruStt_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV49TFDevCruObs_Sel ;
   private String AV48TFDevCruObs ;
   private String A11682DevCruObs ;
   private String AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private String AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ;
   private String lV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ;
   private String lV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private GXSimpleCollection<String> AV54TFDevCruStt_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09052_A396EmprCod ;
   private String[] P09052_A11675DevCruDesc ;
   private String[] P09052_A11674DevCruHash ;
   private String[] P09052_A11682DevCruObs ;
   private String[] P09052_A11678DevCruStt ;
   private String[] P09052_A11680DevCruAtId ;
   private String[] P09052_A11672DevCruMat ;
   private String[] P09052_A841TrnNom ;
   private boolean[] P09052_n841TrnNom ;
   private short[] P09052_A840TrnCod ;
   private boolean[] P09052_n840TrnCod ;
   private String[] P09052_A279CliNom ;
   private int[] P09052_A252CliCod ;
   private java.util.Date[] P09052_A11673DevCruSal ;
   private java.util.Date[] P09052_A11670DevCruFec ;
   private int[] P09052_A11669DevCruId ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ;
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

final  class devolucionalmacentejidocrudosindetallewwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09052( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11678DevCruStt ,
                                          GXSimpleCollection<String> AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels ,
                                          String AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext ,
                                          int AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid ,
                                          int AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to ,
                                          java.util.Date AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec ,
                                          java.util.Date AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal ,
                                          int AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod ,
                                          int AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to ,
                                          String AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel ,
                                          String AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom ,
                                          short AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod ,
                                          short AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to ,
                                          String AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel ,
                                          String AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom ,
                                          String AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel ,
                                          String AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat ,
                                          String AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel ,
                                          String AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid ,
                                          int AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size ,
                                          String AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel ,
                                          String AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs ,
                                          String AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel ,
                                          String AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash ,
                                          String AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel ,
                                          String AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc ,
                                          int A11669DevCruId ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A11672DevCruMat ,
                                          String A11680DevCruAtId ,
                                          String A11682DevCruObs ,
                                          String A11674DevCruHash ,
                                          String A11675DevCruDesc ,
                                          java.util.Date A11670DevCruFec ,
                                          java.util.Date A11673DevCruSal ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[33];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevCruDesc, T1.DevCruHash, T1.DevCruObs, T1.DevCruStt, T1.DevCruAtId, T1.DevCruMat, T2.TrnNom, T1.TrnCod, T3.CliNom, T1.CliCod, T1.DevCruSal," ;
      scmdbuf += " T1.DevCruFec, T1.DevCruId FROM ((TXPDEVCRU T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV68Devolucionalmacentejidocrudosindetallewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.DevCruId,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.DevCruMat) like '%' || UPPER(?)) or ( UPPER(T1.DevCruAtId) like '%' || UPPER(?)) or ( UPPER(T1.DevCruStt) like '%' || UPPER(?)) or ( UPPER(T1.DevCruObs) like '%' || UPPER(?)) or ( UPPER(T1.DevCruHash) like '%' || UPPER(?)) or ( UPPER(T1.DevCruDesc) like '%' || UPPER(?)))");
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
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Devolucionalmacentejidocrudosindetallewwds_2_tfdevcruid) )
      {
         addWhere(sWhereString, "(T1.DevCruId >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Devolucionalmacentejidocrudosindetallewwds_3_tfdevcruid_to) )
      {
         addWhere(sWhereString, "(T1.DevCruId <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Devolucionalmacentejidocrudosindetallewwds_4_tfdevcrufec)) )
      {
         addWhere(sWhereString, "(T1.DevCruFec >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV72Devolucionalmacentejidocrudosindetallewwds_5_tfdevcrusal) )
      {
         addWhere(sWhereString, "(T1.DevCruSal >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV73Devolucionalmacentejidocrudosindetallewwds_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Devolucionalmacentejidocrudosindetallewwds_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV75Devolucionalmacentejidocrudosindetallewwds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Devolucionalmacentejidocrudosindetallewwds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV77Devolucionalmacentejidocrudosindetallewwds_10_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV78Devolucionalmacentejidocrudosindetallewwds_11_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Devolucionalmacentejidocrudosindetallewwds_12_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Devolucionalmacentejidocrudosindetallewwds_13_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) && ( ! (GXutil.strcmp("", AV81Devolucionalmacentejidocrudosindetallewwds_14_tfdevcrumat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Devolucionalmacentejidocrudosindetallewwds_15_tfdevcrumat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruMat = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) && ( ! (GXutil.strcmp("", AV83Devolucionalmacentejidocrudosindetallewwds_16_tfdevcruatid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruAtId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Devolucionalmacentejidocrudosindetallewwds_17_tfdevcruatid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruAtId = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Devolucionalmacentejidocrudosindetallewwds_18_tfdevcrustt_sels, "T1.DevCruStt IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) && ( ! (GXutil.strcmp("", AV86Devolucionalmacentejidocrudosindetallewwds_19_tfdevcruobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Devolucionalmacentejidocrudosindetallewwds_20_tfdevcruobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruObs = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) && ( ! (GXutil.strcmp("", AV88Devolucionalmacentejidocrudosindetallewwds_21_tfdevcruhash)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruHash) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Devolucionalmacentejidocrudosindetallewwds_22_tfdevcruhash_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruHash = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) && ( ! (GXutil.strcmp("", AV90Devolucionalmacentejidocrudosindetallewwds_23_tfdevcrudesc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DevCruDesc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Devolucionalmacentejidocrudosindetallewwds_24_tfdevcrudesc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruDesc = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruId" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruId DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruFec" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruFec DESC" ;
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
         scmdbuf += " ORDER BY T1.DevCruObs" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruObs DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruHash" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevCruHash DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevCruDesc" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
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
                  return conditional_P09052(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09052", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 200);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 200);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 200);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 200);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 300);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 300);
               }
               return;
      }
   }

}

