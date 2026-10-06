package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasproduccionporproceso_wcexport extends GXProcedure
{
   public cargasproduccionporproceso_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporproceso_wcexport.class ), "" );
   }

   public cargasproduccionporproceso_wcexport( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cargasproduccionporproceso_wcexport.this.aP1 = new String[] {""};
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
      cargasproduccionporproceso_wcexport.this.aP0 = aP0;
      cargasproduccionporproceso_wcexport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S211 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S221 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
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
      AV11Filename = "./PrivateTempStorage/" + "CargasProduccionporProceso_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( ( AV76TFProFasEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Estado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV64i = 1 ;
         AV89GXV1 = 1 ;
         while ( AV89GXV1 <= AV76TFProFasEst_Sels.size() )
         {
            AV77TFProFasEst_Sel = ((Number) AV76TFProFasEst_Sels.elementAt(-1+AV89GXV1)).byteValue() ;
            if ( AV64i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV77TFProFasEst_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( AV77TFProFasEst_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Proceso (Fase Iniciada)", "") );
            }
            else if ( AV77TFProFasEst_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Proceso (Fase Realizada)", "") );
            }
            AV64i = (long)(AV64i+1) ;
            AV89GXV1 = (int)(AV89GXV1+1) ;
         }
      }
      if ( ! ( (0==AV36TFCliCod) && (0==AV37TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV36TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV37TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV39TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cli.Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFCliNom_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cli.Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFBarCod) && (0==AV41TFBarCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFBarCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFBarCod_To );
      }
      if ( ! ( (0==AV42TFBarCodReo) && (0==AV43TFBarCodReo_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "R", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFBarCodReo );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFBarCodReo_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarCodPar_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarCodPar_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarCodPar)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "P", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarCodPar, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFBarSit) && (0==AV47TFBarSit_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Sit.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFBarSit );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarSer_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarSer, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarSerDsc_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarSerDsc, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFBarColNom_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFBarColNom, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV54TFBarColNum) && (0==AV55TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Número", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV54TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV55TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV57TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57TFBarNomCli_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV56TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cli", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV56TFBarNomCli, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Kgs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV58TFBarKgm)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV59TFBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Mts", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV60TFBarMtr)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61TFBarMtr_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFBarFasCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ult.Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFBarFasCod_Sel, GXv_char5) ;
         cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFBarFasCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Ult.Fase", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cargasproduccionporproceso_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFBarFasCod, GXv_char5) ;
            cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.CargasProduccionporProceso_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("Produccion.CargasProduccionporProceso_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV90GXV2 = 1 ;
      while ( AV90GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV90GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV90GXV2 = (int)(AV90GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV76TFProFasEst_Sels ,
                                           Integer.valueOf(AV36TFCliCod) ,
                                           Integer.valueOf(AV37TFCliCod_To) ,
                                           AV39TFCliNom_Sel ,
                                           AV38TFCliNom ,
                                           Integer.valueOf(AV40TFBarCod) ,
                                           Integer.valueOf(AV41TFBarCod_To) ,
                                           Byte.valueOf(AV42TFBarCodReo) ,
                                           Byte.valueOf(AV43TFBarCodReo_To) ,
                                           AV45TFBarCodPar_Sel ,
                                           AV44TFBarCodPar ,
                                           Byte.valueOf(AV46TFBarSit) ,
                                           Byte.valueOf(AV47TFBarSit_To) ,
                                           AV49TFBarSer_Sel ,
                                           AV48TFBarSer ,
                                           AV51TFBarSerDsc_Sel ,
                                           AV50TFBarSerDsc ,
                                           AV53TFBarColNom_Sel ,
                                           AV52TFBarColNom ,
                                           Integer.valueOf(AV54TFBarColNum) ,
                                           Integer.valueOf(AV55TFBarColNum_To) ,
                                           AV57TFBarNomCli_Sel ,
                                           AV56TFBarNomCli ,
                                           AV58TFBarKgm ,
                                           AV59TFBarKgm_To ,
                                           AV60TFBarMtr ,
                                           AV61TFBarMtr_To ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV18FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV76TFProFasEst_Sels.size()) ,
                                           AV63TFBarFasCod_Sel ,
                                           AV62TFBarFasCod ,
                                           Integer.valueOf(AV66CliCod) ,
                                           Integer.valueOf(AV67CliCod_to) ,
                                           A159BarFecGen ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           Byte.valueOf(AV70BarSit) ,
                                           Byte.valueOf(AV71BarSit_to) ,
                                           A14284ProEst ,
                                           Byte.valueOf(AV72ProFasEst) ,
                                           AV79EmprCod ,
                                           AV65Procod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV18FilterFullText = GXutil.concat( GXutil.rtrim( AV18FilterFullText), "%", "") ;
      lV62TFBarFasCod = GXutil.padr( GXutil.rtrim( AV62TFBarFasCod), 8, "%") ;
      lV38TFCliNom = GXutil.padr( GXutil.rtrim( AV38TFCliNom), 30, "%") ;
      lV44TFBarCodPar = GXutil.padr( GXutil.rtrim( AV44TFBarCodPar), 1, "%") ;
      lV48TFBarSer = GXutil.padr( GXutil.rtrim( AV48TFBarSer), 16, "%") ;
      lV50TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV50TFBarSerDsc), 26, "%") ;
      lV52TFBarColNom = GXutil.padr( GXutil.rtrim( AV52TFBarColNom), 13, "%") ;
      lV56TFBarNomCli = GXutil.padr( GXutil.rtrim( AV56TFBarNomCli), 13, "%") ;
      /* Using cursor P09ZD6 */
      pr_default.execute(0, new Object[] {AV79EmprCod, AV65Procod, AV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, lV18FilterFullText, Integer.valueOf(AV76TFProFasEst_Sels.size()), AV63TFBarFasCod_Sel, AV62TFBarFasCod, lV62TFBarFasCod, AV63TFBarFasCod_Sel, AV63TFBarFasCod_Sel, Integer.valueOf(AV66CliCod), Integer.valueOf(AV67CliCod_to), AV68BarFecGen, AV69BarFecGen_to, Byte.valueOf(AV70BarSit), Byte.valueOf(AV71BarSit_to), Byte.valueOf(AV72ProFasEst), Integer.valueOf(AV36TFCliCod), Integer.valueOf(AV37TFCliCod_To), lV38TFCliNom, AV39TFCliNom_Sel, Integer.valueOf(AV40TFBarCod), Integer.valueOf(AV41TFBarCod_To), Byte.valueOf(AV42TFBarCodReo), Byte.valueOf(AV43TFBarCodReo_To), lV44TFBarCodPar, AV45TFBarCodPar_Sel, Byte.valueOf(AV46TFBarSit), Byte.valueOf(AV47TFBarSit_To), lV48TFBarSer, AV49TFBarSer_Sel, lV50TFBarSerDsc, AV51TFBarSerDsc_Sel, lV52TFBarColNom, AV53TFBarColNom_Sel, Integer.valueOf(AV54TFBarColNum), Integer.valueOf(AV55TFBarColNum_To), lV56TFBarNomCli, AV57TFBarNomCli_Sel, AV58TFBarKgm, AV59TFBarKgm_To, AV60TFBarMtr, AV61TFBarMtr_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14284ProEst = P09ZD6_A14284ProEst[0] ;
         A159BarFecGen = P09ZD6_A159BarFecGen[0] ;
         A758ProCod = P09ZD6_A758ProCod[0] ;
         A396EmprCod = P09ZD6_A396EmprCod[0] ;
         A1234BarNomCli = P09ZD6_A1234BarNomCli[0] ;
         A136BarColNum = P09ZD6_A136BarColNum[0] ;
         A135BarColNom = P09ZD6_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZD6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZD6_A212BarSer[0] ;
         A213BarSit = P09ZD6_A213BarSit[0] ;
         A130BarCodPar = P09ZD6_A130BarCodPar[0] ;
         A132BarCodReo = P09ZD6_A132BarCodReo[0] ;
         A129BarCod = P09ZD6_A129BarCod[0] ;
         A279CliNom = P09ZD6_A279CliNom[0] ;
         A252CliCod = P09ZD6_A252CliCod[0] ;
         n252CliCod = P09ZD6_n252CliCod[0] ;
         A4812BarEncCli = P09ZD6_A4812BarEncCli[0] ;
         A143BarDisNum = P09ZD6_A143BarDisNum[0] ;
         A151BarFasCod = P09ZD6_A151BarFasCod[0] ;
         n151BarFasCod = P09ZD6_n151BarFasCod[0] ;
         A184BarMtr = P09ZD6_A184BarMtr[0] ;
         A166BarKgm = P09ZD6_A166BarKgm[0] ;
         A760ProFasEst = P09ZD6_A760ProFasEst[0] ;
         n760ProFasEst = P09ZD6_n760ProFasEst[0] ;
         A14284ProEst = P09ZD6_A14284ProEst[0] ;
         A159BarFecGen = P09ZD6_A159BarFecGen[0] ;
         A1234BarNomCli = P09ZD6_A1234BarNomCli[0] ;
         A136BarColNum = P09ZD6_A136BarColNum[0] ;
         A135BarColNom = P09ZD6_A135BarColNom[0] ;
         A1652BarSerDsc = P09ZD6_A1652BarSerDsc[0] ;
         A212BarSer = P09ZD6_A212BarSer[0] ;
         A213BarSit = P09ZD6_A213BarSit[0] ;
         A252CliCod = P09ZD6_A252CliCod[0] ;
         n252CliCod = P09ZD6_n252CliCod[0] ;
         A4812BarEncCli = P09ZD6_A4812BarEncCli[0] ;
         A143BarDisNum = P09ZD6_A143BarDisNum[0] ;
         A279CliNom = P09ZD6_A279CliNom[0] ;
         A151BarFasCod = P09ZD6_A151BarFasCod[0] ;
         n151BarFasCod = P09ZD6_n151BarFasCod[0] ;
         A184BarMtr = P09ZD6_A184BarMtr[0] ;
         A166BarKgm = P09ZD6_A166BarKgm[0] ;
         A760ProFasEst = P09ZD6_A760ProFasEst[0] ;
         n760ProFasEst = P09ZD6_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
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
            AV31VisibleColumnCount = 0 ;
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
               if ( A760ProFasEst == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
               }
               else if ( A760ProFasEst == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso (Fase Iniciada)", "") );
               }
               else if ( A760ProFasEst == 2 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso (Fase Realizada)", "") );
               }
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
               {
                  AV80BarEncCli = A4812BarEncCli ;
               }
               else
               {
                  AV80BarEncCli = A143BarDisNum ;
               }
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80BarEncCli, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A129BarCod );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A132BarCodReo );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A130BarCodPar, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A213BarSit );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
               AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char5) ;
               cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProFasEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Cli.Nombre", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&BarEncCli", "", "Disp. Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCod", "", "Hdr", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodReo", "", "R", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarCodPar", "", "P", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSit", "", "Sit.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Artículo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNum", "", "Número", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNomCli", "", "Color Cli", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarKgm", "", "Kgs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarMtr", "", "Mts", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarFasCod", "", "Ult.Fase", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporProceso_WCColumnsSelector", GXv_char5) ;
      cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV27UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV27UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV27UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporProceso_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Produccion.CargasProduccionporProceso_WCGridState"), null, null);
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
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST_SEL") == 0 )
         {
            AV75TFProFasEst_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFProFasEst_Sels.fromJSonString(AV75TFProFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV36TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV38TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV39TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV40TFBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV42TFBarCodReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFBarCodReo_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV44TFBarCodPar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV45TFBarCodPar_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV46TFBarSit = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarSit_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV56TFBarNomCli = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV57TFBarNomCli_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV58TFBarKgm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFBarKgm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV60TFBarMtr = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFBarMtr_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV62TFBarFasCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV63TFBarFasCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV92GXV3 = (int)(AV92GXV3+1) ;
      }
      AV79EmprCod = AV78WebSession.getValue("EmprCod") ;
      AV65Procod = AV78WebSession.getValue("ProCod") ;
      AV66CliCod = (int)(GXutil.lval( AV78WebSession.getValue("CliCod"))) ;
      AV67CliCod_to = (int)(GXutil.lval( AV78WebSession.getValue("CliCod_to"))) ;
      AV68BarFecGen = localUtil.ctod( AV78WebSession.getValue("BarFecGen"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV69BarFecGen_to = localUtil.ctod( AV78WebSession.getValue("BarFecGen_to"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV70BarSit = (byte)(GXutil.lval( AV78WebSession.getValue("BarSit"))) ;
      AV71BarSit_to = (byte)(GXutil.lval( AV78WebSession.getValue("BarSit_to"))) ;
      AV72ProFasEst = (byte)(GXutil.lval( AV78WebSession.getValue("ProFasEst"))) ;
      AV78WebSession.remove("EmprCod");
      AV78WebSession.remove("ProCod");
      AV78WebSession.remove("CliCod");
      AV78WebSession.remove("CliCod_to");
      AV78WebSession.remove("BarFecGen");
      AV78WebSession.remove("BarFecGen_to");
      AV78WebSession.remove("BarSit");
      AV78WebSession.remove("BarSit_to");
      AV78WebSession.remove("ProFasEst");
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

   public void S211( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char4 = AV84Station ;
      GXv_char5[0] = GXt_char4 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV84Station = GXt_char4 ;
      GXv_char5[0] = AV79EmprCod ;
      GXv_char8[0] = AV81EmprNom ;
      GXv_char9[0] = AV83UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV84Station, GXv_char5, GXv_char8, GXv_char9) ;
      cargasproduccionporproceso_wcexport.this.AV79EmprCod = GXv_char5[0] ;
      cargasproduccionporproceso_wcexport.this.AV81EmprNom = GXv_char8[0] ;
      cargasproduccionporproceso_wcexport.this.AV83UsurCod = GXv_char9[0] ;
      AV65Procod = GXutil.upper( GXutil.trim( AV78WebSession.getValue("FiltroProduccionporProceso_ProCod"))) ;
      AV78WebSession.remove("FiltroProduccionporProceso_ProCod");
      GXt_char4 = AV82ProDsc ;
      GXv_char9[0] = AV79EmprCod ;
      GXv_char8[0] = AV65Procod ;
      GXv_char5[0] = GXt_char4 ;
      new app.pprodsc(remoteHandle, context).execute( GXv_char9, GXv_char8, GXv_char5) ;
      cargasproduccionporproceso_wcexport.this.AV79EmprCod = GXv_char9[0] ;
      cargasproduccionporproceso_wcexport.this.AV65Procod = GXv_char8[0] ;
      cargasproduccionporproceso_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV82ProDsc = GXt_char4 ;
   }

   public void S221( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV81EmprNom+" "+"("+AV93Pgmdesc+")" );
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Proceso: ", "")+" "+AV65Procod+" "+AV82ProDsc );
   }

   protected void cleanup( )
   {
      this.aP0[0] = cargasproduccionporproceso_wcexport.this.AV11Filename;
      this.aP1[0] = cargasproduccionporproceso_wcexport.this.AV12ErrorMessage;
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
      AV76TFProFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV39TFCliNom_Sel = "" ;
      AV38TFCliNom = "" ;
      AV45TFBarCodPar_Sel = "" ;
      AV44TFBarCodPar = "" ;
      AV49TFBarSer_Sel = "" ;
      AV48TFBarSer = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV50TFBarSerDsc = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV57TFBarNomCli_Sel = "" ;
      AV56TFBarNomCli = "" ;
      AV58TFBarKgm = DecimalUtil.ZERO ;
      AV59TFBarKgm_To = DecimalUtil.ZERO ;
      AV60TFBarMtr = DecimalUtil.ZERO ;
      AV61TFBarMtr_To = DecimalUtil.ZERO ;
      AV63TFBarFasCod_Sel = "" ;
      AV62TFBarFasCod = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      lV18FilterFullText = "" ;
      scmdbuf = "" ;
      lV62TFBarFasCod = "" ;
      lV38TFCliNom = "" ;
      lV44TFBarCodPar = "" ;
      lV48TFBarSer = "" ;
      lV50TFBarSerDsc = "" ;
      lV52TFBarColNom = "" ;
      lV56TFBarNomCli = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV68BarFecGen = GXutil.nullDate() ;
      AV69BarFecGen_to = GXutil.nullDate() ;
      A14284ProEst = "" ;
      AV79EmprCod = "" ;
      AV65Procod = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      P09ZD6_A14284ProEst = new String[] {""} ;
      P09ZD6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZD6_A758ProCod = new String[] {""} ;
      P09ZD6_A396EmprCod = new String[] {""} ;
      P09ZD6_A1234BarNomCli = new String[] {""} ;
      P09ZD6_A136BarColNum = new int[1] ;
      P09ZD6_A135BarColNom = new String[] {""} ;
      P09ZD6_A1652BarSerDsc = new String[] {""} ;
      P09ZD6_A212BarSer = new String[] {""} ;
      P09ZD6_A213BarSit = new byte[1] ;
      P09ZD6_A130BarCodPar = new String[] {""} ;
      P09ZD6_A132BarCodReo = new byte[1] ;
      P09ZD6_A129BarCod = new int[1] ;
      P09ZD6_A279CliNom = new String[] {""} ;
      P09ZD6_A252CliCod = new int[1] ;
      P09ZD6_n252CliCod = new boolean[] {false} ;
      P09ZD6_A4812BarEncCli = new String[] {""} ;
      P09ZD6_A143BarDisNum = new String[] {""} ;
      P09ZD6_A151BarFasCod = new String[] {""} ;
      P09ZD6_n151BarFasCod = new boolean[] {false} ;
      P09ZD6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZD6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09ZD6_A760ProFasEst = new byte[1] ;
      P09ZD6_n760ProFasEst = new boolean[] {false} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      AV80BarEncCli = "" ;
      AV27UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV75TFProFasEst_SelsJson = "" ;
      AV78WebSession = httpContext.getWebSession();
      AV84Station = "" ;
      AV81EmprNom = "" ;
      AV83UsurCod = "" ;
      AV82ProDsc = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV93Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporproceso_wcexport__default(),
         new Object[] {
             new Object[] {
            P09ZD6_A14284ProEst, P09ZD6_A159BarFecGen, P09ZD6_A758ProCod, P09ZD6_A396EmprCod, P09ZD6_A1234BarNomCli, P09ZD6_A136BarColNum, P09ZD6_A135BarColNom, P09ZD6_A1652BarSerDsc, P09ZD6_A212BarSer, P09ZD6_A213BarSit,
            P09ZD6_A130BarCodPar, P09ZD6_A132BarCodReo, P09ZD6_A129BarCod, P09ZD6_A279CliNom, P09ZD6_A252CliCod, P09ZD6_n252CliCod, P09ZD6_A4812BarEncCli, P09ZD6_A143BarDisNum, P09ZD6_A151BarFasCod, P09ZD6_n151BarFasCod,
            P09ZD6_A184BarMtr, P09ZD6_A166BarKgm, P09ZD6_A760ProFasEst, P09ZD6_n760ProFasEst
            }
         }
      );
      AV93Pgmdesc = httpContext.getMessage( "Informe Producción por Proceso", "") ;
      /* GeneXus formulas. */
      AV93Pgmdesc = httpContext.getMessage( "Informe Producción por Proceso", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV77TFProFasEst_Sel ;
   private byte AV42TFBarCodReo ;
   private byte AV43TFBarCodReo_To ;
   private byte AV46TFBarSit ;
   private byte AV47TFBarSit_To ;
   private byte A760ProFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV70BarSit ;
   private byte AV71BarSit_to ;
   private byte AV72ProFasEst ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV89GXV1 ;
   private int AV36TFCliCod ;
   private int AV37TFCliCod_To ;
   private int AV40TFBarCod ;
   private int AV41TFBarCod_To ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV90GXV2 ;
   private int AV76TFProFasEst_Sels_size ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV66CliCod ;
   private int AV67CliCod_to ;
   private int AV92GXV3 ;
   private long AV64i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV58TFBarKgm ;
   private java.math.BigDecimal AV59TFBarKgm_To ;
   private java.math.BigDecimal AV60TFBarMtr ;
   private java.math.BigDecimal AV61TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV39TFCliNom_Sel ;
   private String AV38TFCliNom ;
   private String AV45TFBarCodPar_Sel ;
   private String AV44TFBarCodPar ;
   private String AV49TFBarSer_Sel ;
   private String AV48TFBarSer ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV50TFBarSerDsc ;
   private String AV53TFBarColNom_Sel ;
   private String AV52TFBarColNom ;
   private String AV57TFBarNomCli_Sel ;
   private String AV56TFBarNomCli ;
   private String AV63TFBarFasCod_Sel ;
   private String AV62TFBarFasCod ;
   private String scmdbuf ;
   private String lV62TFBarFasCod ;
   private String lV38TFCliNom ;
   private String lV44TFBarCodPar ;
   private String lV48TFBarSer ;
   private String lV50TFBarSerDsc ;
   private String lV52TFBarColNom ;
   private String lV56TFBarNomCli ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A14284ProEst ;
   private String AV79EmprCod ;
   private String AV65Procod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String AV80BarEncCli ;
   private String AV84Station ;
   private String AV81EmprNom ;
   private String AV83UsurCod ;
   private String AV82ProDsc ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String AV93Pgmdesc ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV68BarFecGen ;
   private java.util.Date AV69BarFecGen_to ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n760ProFasEst ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV75TFProFasEst_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String lV18FilterFullText ;
   private GXSimpleCollection<Byte> AV76TFProFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.WebSession AV78WebSession ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZD6_A14284ProEst ;
   private java.util.Date[] P09ZD6_A159BarFecGen ;
   private String[] P09ZD6_A758ProCod ;
   private String[] P09ZD6_A396EmprCod ;
   private String[] P09ZD6_A1234BarNomCli ;
   private int[] P09ZD6_A136BarColNum ;
   private String[] P09ZD6_A135BarColNom ;
   private String[] P09ZD6_A1652BarSerDsc ;
   private String[] P09ZD6_A212BarSer ;
   private byte[] P09ZD6_A213BarSit ;
   private String[] P09ZD6_A130BarCodPar ;
   private byte[] P09ZD6_A132BarCodReo ;
   private int[] P09ZD6_A129BarCod ;
   private String[] P09ZD6_A279CliNom ;
   private int[] P09ZD6_A252CliCod ;
   private boolean[] P09ZD6_n252CliCod ;
   private String[] P09ZD6_A4812BarEncCli ;
   private String[] P09ZD6_A143BarDisNum ;
   private String[] P09ZD6_A151BarFasCod ;
   private boolean[] P09ZD6_n151BarFasCod ;
   private java.math.BigDecimal[] P09ZD6_A184BarMtr ;
   private java.math.BigDecimal[] P09ZD6_A166BarKgm ;
   private byte[] P09ZD6_A760ProFasEst ;
   private boolean[] P09ZD6_n760ProFasEst ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
}

final  class cargasproduccionporproceso_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ZD6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A760ProFasEst ,
                                          GXSimpleCollection<Byte> AV76TFProFasEst_Sels ,
                                          int AV36TFCliCod ,
                                          int AV37TFCliCod_To ,
                                          String AV39TFCliNom_Sel ,
                                          String AV38TFCliNom ,
                                          int AV40TFBarCod ,
                                          int AV41TFBarCod_To ,
                                          byte AV42TFBarCodReo ,
                                          byte AV43TFBarCodReo_To ,
                                          String AV45TFBarCodPar_Sel ,
                                          String AV44TFBarCodPar ,
                                          byte AV46TFBarSit ,
                                          byte AV47TFBarSit_To ,
                                          String AV49TFBarSer_Sel ,
                                          String AV48TFBarSer ,
                                          String AV51TFBarSerDsc_Sel ,
                                          String AV50TFBarSerDsc ,
                                          String AV53TFBarColNom_Sel ,
                                          String AV52TFBarColNom ,
                                          int AV54TFBarColNum ,
                                          int AV55TFBarColNum_To ,
                                          String AV57TFBarNomCli_Sel ,
                                          String AV56TFBarNomCli ,
                                          java.math.BigDecimal AV58TFBarKgm ,
                                          java.math.BigDecimal AV59TFBarKgm_To ,
                                          java.math.BigDecimal AV60TFBarMtr ,
                                          java.math.BigDecimal AV61TFBarMtr_To ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV18FilterFullText ,
                                          String A151BarFasCod ,
                                          int AV76TFProFasEst_Sels_size ,
                                          String AV63TFBarFasCod_Sel ,
                                          String AV62TFBarFasCod ,
                                          int AV66CliCod ,
                                          int AV67CliCod_to ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV68BarFecGen ,
                                          java.util.Date AV69BarFecGen_to ,
                                          byte AV70BarSit ,
                                          byte AV71BarSit_to ,
                                          String A14284ProEst ,
                                          byte AV72ProFasEst ,
                                          String AV79EmprCod ,
                                          String AV65Procod ,
                                          String A396EmprCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[57];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.ProEst, T3.BarFecGen, T1.ProCod, T1.EmprCod, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, T3.BarEncCli, T3.BarDisNum, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, COALESCE( T7.ProFasEst, 0) AS ProFasEst FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER" ;
      scmdbuf += " JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON" ;
      scmdbuf += " T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV76TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV36TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV37TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV42TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV43TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.CliCod, T3.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarNomCli" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarNomCli DESC" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09ZD6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZD6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 8);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
      }
   }

}

