package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cargasproduccionporfase_usuwcexport extends GXProcedure
{
   public cargasproduccionporfase_usuwcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporfase_usuwcexport.class ), "" );
   }

   public cargasproduccionporfase_usuwcexport( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      cargasproduccionporfase_usuwcexport.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      cargasproduccionporfase_usuwcexport.this.AV126jsonBarCod = aP0;
      cargasproduccionporfase_usuwcexport.this.aP1 = aP1;
      cargasproduccionporfase_usuwcexport.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV127cBarCod.fromJSonString(AV126jsonBarCod, null);
      if ( 1 == 0 )
      {
         GXv_SdtWWPContext1[0] = AV89WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV89WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'OPENDOCUMENT' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV16CellRow = 1 ;
         AV35FirstColumn = 1 ;
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
      GXv_SdtWWPContext1[0] = AV89WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV89WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_char2 = AV115Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char3[0] ;
      AV115Station = GXt_char2 ;
      GXv_char3[0] = AV27Emprcod ;
      GXv_char4[0] = AV116EmprNom ;
      GXv_char5[0] = AV117UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char3, GXv_char4, GXv_char5) ;
      cargasproduccionporfase_usuwcexport.this.AV27Emprcod = GXv_char3[0] ;
      cargasproduccionporfase_usuwcexport.this.AV116EmprNom = GXv_char4[0] ;
      cargasproduccionporfase_usuwcexport.this.AV117UsurCod = GXv_char5[0] ;
      GXt_int6 = AV121Rioplatense ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "RIOP00", ""), GXv_int7) ;
      cargasproduccionporfase_usuwcexport.this.GXt_int6 = GXv_int7[0] ;
      AV121Rioplatense = GXt_int6 ;
      GXt_int6 = AV122Carvitin ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int7) ;
      cargasproduccionporfase_usuwcexport.this.GXt_int6 = GXv_int7[0] ;
      AV122Carvitin = GXt_int6 ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16CellRow = 1 ;
      AV35FirstColumn = 1 ;
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
      AV44Random = (int)(GXutil.random( )*10000) ;
      AV33Filename = "CargasProduccionporFase_usuWCExport-" + GXutil.trim( GXutil.str( AV44Random, 8, 0)) + ".xlsx" ;
      AV29ExcelDocument.Open(AV33Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV29ExcelDocument.Clear();
   }

   public void S131( )
   {
      /* 'WRITEFILTERS' Routine */
      returnInSub = false ;
      if ( ! ( (GXutil.strcmp("", AV34FilterFullText)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Filter", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34FilterFullText, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      if ( ! ( (GXutil.strcmp("", AV93TFMaqCodBis_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Máquina", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV93TFMaqCodBis_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV92TFMaqCodBis)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Máquina", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV92TFMaqCodBis, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( ( AV58TFBarFasEst_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Estado Fase", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV39i = 1 ;
         AV130GXV1 = 1 ;
         while ( AV130GXV1 <= AV58TFBarFasEst_Sels.size() )
         {
            AV57TFBarFasEst_Sel = ((Number) AV58TFBarFasEst_Sels.elementAt(-1+AV130GXV1)).byteValue() ;
            if ( AV39i == 1 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV57TFBarFasEst_Sel == 0 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pendiente", "") );
            }
            else if ( AV57TFBarFasEst_Sel == 1 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Proceso (Fase Ini)", "") );
            }
            else if ( AV57TFBarFasEst_Sel == 2 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "En Proceso  (Fase Fin)", "") );
            }
            AV39i = (long)(AV39i+1) ;
            AV130GXV1 = (int)(AV130GXV1+1) ;
         }
      }
      if ( ! ( (0==AV83TFCliCod) && (0==AV84TFCliCod_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV83TFCliCod );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV84TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV86TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Nombre.Cli", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV86TFCliNom_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV85TFCliNom)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Nombre.Cli", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV85TFCliNom, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV70TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Hdr", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFBarNHdr_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV69TFBarNHdr)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Hdr", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV69TFBarNHdr, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV79TFBarSit) && (0==AV80TFBarSit_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Sit.", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV79TFBarSit );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV80TFBarSit_To );
      }
      if ( ! ( (GXutil.strcmp("", AV76TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Artículo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV76TFBarSer_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV75TFBarSer)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Artículo", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFBarSer, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV78TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV78TFBarSerDsc_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV77TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV77TFBarSerDsc, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV49TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarColNom_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFBarColNom)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarColNom, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV50TFBarColNum) && (0==AV51TFBarColNum_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Número", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV50TFBarColNum );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV51TFBarColNum_To );
      }
      if ( ! ( (0==AV81TFBarTipCol) && (0==AV82TFBarTipCol_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "TC", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV81TFBarTipCol );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV82TFBarTipCol_To );
      }
      if ( ! ( (GXutil.strcmp("", AV72TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Color.Cli", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV72TFBarNomCli_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV71TFBarNomCli)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Color.Cli", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFBarNomCli, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarKgm_To)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Kgs.", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65TFBarKgm)) );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66TFBarKgm_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarMtr_To)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Mts.", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV67TFBarMtr)) );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV68TFBarMtr_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV55TFBarFasCod_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), "") ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFBarFasCod_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFBarFasCod)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), "") ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFBarFasCod, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV61TFBarFasLin) && (0==AV62TFBarFasLin_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "#Ult.Fase", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV61TFBarFasLin );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV62TFBarFasLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV64TFBarFasSig_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), "") ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV64TFBarFasSig_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV63TFBarFasSig)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), "") ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFBarFasSig, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV73TFBarOrdLin) && (0==AV74TFBarOrdLin_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "# Act", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV73TFBarOrdLin );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV74TFBarOrdLin_To );
      }
      if ( ! ( (GXutil.strcmp("", AV102TFBarDibCli_Sel)==0) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Dibujo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         GXt_char2 = "" ;
         GXv_char5[0] = GXt_char2 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV102TFBarDibCli_Sel, GXv_char5) ;
         cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV101TFBarDibCli)==0) ) )
         {
            GXv_exceldoc8[0] = AV29ExcelDocument ;
            GXv_int9[0] = (short)(AV16CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Dibujo", "")) ;
            AV29ExcelDocument = GXv_exceldoc8[0] ;
            cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV101TFBarDibCli, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( GXt_char2 );
         }
      }
      if ( ! ( (0==AV46TFBarAcaAnh) && (0==AV47TFBarAcaAnh_To) ) )
      {
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, true, GXv_int9, (short)(AV35FirstColumn), httpContext.getMessage( "Caderno", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setNumber( AV46TFBarAcaAnh );
         GXv_exceldoc8[0] = AV29ExcelDocument ;
         GXv_int9[0] = (short)(AV16CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc8, false, GXv_int9, (short)(AV35FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV29ExcelDocument = GXv_exceldoc8[0] ;
         cargasproduccionporfase_usuwcexport.this.AV16CellRow = GXv_int9[0] ;
         AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+3, 1, 1).setNumber( AV47TFBarAcaAnh_To );
      }
      AV16CellRow = (int)(AV16CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV88VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV45Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector"), "") != 0 )
      {
         AV23ColumnsSelectorXML = AV45Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV23ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV131GXV2 = 1 ;
      while ( AV131GXV2 <= AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV21ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV131GXV2));
         if ( AV21ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV21ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV21ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV21ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setColor( 11 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         AV131GXV2 = (int)(AV131GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV58TFBarFasEst_Sels ,
                                           Integer.valueOf(A129BarCod) ,
                                           AV127cBarCod ,
                                           AV93TFMaqCodBis_Sel ,
                                           AV92TFMaqCodBis ,
                                           Integer.valueOf(AV58TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV83TFCliCod) ,
                                           Integer.valueOf(AV84TFCliCod_To) ,
                                           AV86TFCliNom_Sel ,
                                           AV85TFCliNom ,
                                           AV70TFBarNHdr_Sel ,
                                           AV69TFBarNHdr ,
                                           Byte.valueOf(AV79TFBarSit) ,
                                           Byte.valueOf(AV80TFBarSit_To) ,
                                           AV76TFBarSer_Sel ,
                                           AV75TFBarSer ,
                                           AV78TFBarSerDsc_Sel ,
                                           AV77TFBarSerDsc ,
                                           AV49TFBarColNom_Sel ,
                                           AV48TFBarColNom ,
                                           Integer.valueOf(AV50TFBarColNum) ,
                                           Integer.valueOf(AV51TFBarColNum_To) ,
                                           Byte.valueOf(AV81TFBarTipCol) ,
                                           Byte.valueOf(AV82TFBarTipCol_To) ,
                                           AV72TFBarNomCli_Sel ,
                                           AV71TFBarNomCli ,
                                           AV65TFBarKgm ,
                                           AV66TFBarKgm_To ,
                                           AV67TFBarMtr ,
                                           AV68TFBarMtr_To ,
                                           Short.valueOf(AV73TFBarOrdLin) ,
                                           Short.valueOf(AV74TFBarOrdLin_To) ,
                                           AV102TFBarDibCli_Sel ,
                                           AV101TFBarDibCli ,
                                           Short.valueOf(AV46TFBarAcaAnh) ,
                                           Short.valueOf(AV47TFBarAcaAnh_To) ,
                                           Integer.valueOf(AV127cBarCod.size()) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           Short.valueOf(AV42OrderedBy) ,
                                           Boolean.valueOf(AV43OrderedDsc) ,
                                           AV34FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV55TFBarFasCod_Sel ,
                                           AV54TFBarFasCod ,
                                           Short.valueOf(AV61TFBarFasLin) ,
                                           Short.valueOf(AV62TFBarFasLin_To) ,
                                           AV64TFBarFasSig_Sel ,
                                           AV63TFBarFasSig ,
                                           Integer.valueOf(AV17Clicod) ,
                                           Integer.valueOf(AV18Clicod_to) ,
                                           A159BarFecGen ,
                                           AV12BarFecgen ,
                                           AV13BarFecGen_to ,
                                           Byte.valueOf(AV14BarSIt) ,
                                           Byte.valueOf(AV15Barsit_to) ,
                                           Byte.valueOf(AV10BarfasEst) ,
                                           Byte.valueOf(AV11BarFasEst_to) ,
                                           Short.valueOf(AV9BarAcaAnh) ,
                                           AV27Emprcod ,
                                           AV30Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV34FilterFullText = GXutil.concat( GXutil.rtrim( AV34FilterFullText), "%", "") ;
      lV54TFBarFasCod = GXutil.padr( GXutil.rtrim( AV54TFBarFasCod), 8, "%") ;
      lV63TFBarFasSig = GXutil.padr( GXutil.rtrim( AV63TFBarFasSig), 8, "%") ;
      lV92TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV92TFMaqCodBis), 6, "%") ;
      lV85TFCliNom = GXutil.padr( GXutil.rtrim( AV85TFCliNom), 30, "%") ;
      lV69TFBarNHdr = GXutil.padr( GXutil.rtrim( AV69TFBarNHdr), 11, "%") ;
      lV75TFBarSer = GXutil.padr( GXutil.rtrim( AV75TFBarSer), 16, "%") ;
      lV77TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV77TFBarSerDsc), 26, "%") ;
      lV48TFBarColNom = GXutil.padr( GXutil.rtrim( AV48TFBarColNom), 13, "%") ;
      lV71TFBarNomCli = GXutil.padr( GXutil.rtrim( AV71TFBarNomCli), 13, "%") ;
      lV101TFBarDibCli = GXutil.padr( GXutil.rtrim( AV101TFBarDibCli), 16, "%") ;
      /* Using cursor P0AAW10 */
      pr_default.execute(0, new Object[] {AV27Emprcod, AV30Fascod, AV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, lV34FilterFullText, AV55TFBarFasCod_Sel, AV54TFBarFasCod, lV54TFBarFasCod, AV55TFBarFasCod_Sel, AV55TFBarFasCod_Sel, Short.valueOf(AV61TFBarFasLin), Short.valueOf(AV61TFBarFasLin), Short.valueOf(AV62TFBarFasLin_To), Short.valueOf(AV62TFBarFasLin_To), AV64TFBarFasSig_Sel, AV63TFBarFasSig, lV63TFBarFasSig, AV64TFBarFasSig_Sel, AV64TFBarFasSig_Sel, Integer.valueOf(AV17Clicod), Integer.valueOf(AV18Clicod_to), AV12BarFecgen, AV13BarFecGen_to, Byte.valueOf(AV14BarSIt), Byte.valueOf(AV15Barsit_to), Byte.valueOf(AV10BarfasEst), Byte.valueOf(AV11BarFasEst_to), Short.valueOf(AV9BarAcaAnh), Short.valueOf(AV9BarAcaAnh), lV92TFMaqCodBis, AV93TFMaqCodBis_Sel, Integer.valueOf(AV83TFCliCod), Integer.valueOf(AV84TFCliCod_To), lV85TFCliNom, AV86TFCliNom_Sel, lV69TFBarNHdr, AV70TFBarNHdr_Sel, Byte.valueOf(AV79TFBarSit), Byte.valueOf(AV80TFBarSit_To), lV75TFBarSer, AV76TFBarSer_Sel, lV77TFBarSerDsc, AV78TFBarSerDsc_Sel, lV48TFBarColNom, AV49TFBarColNom_Sel, Integer.valueOf(AV50TFBarColNum), Integer.valueOf(AV51TFBarColNum_To), Byte.valueOf(AV81TFBarTipCol), Byte.valueOf(AV82TFBarTipCol_To), lV71TFBarNomCli, AV72TFBarNomCli_Sel, AV65TFBarKgm, AV66TFBarKgm_To, AV67TFBarMtr, AV68TFBarMtr_To, Short.valueOf(AV73TFBarOrdLin), Short.valueOf(AV74TFBarOrdLin_To), lV101TFBarDibCli, AV102TFBarDibCli_Sel, Short.valueOf(AV46TFBarAcaAnh), Short.valueOf(AV47TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P0AAW10_A159BarFecGen[0] ;
         A457FasCod = P0AAW10_A457FasCod[0] ;
         A396EmprCod = P0AAW10_A396EmprCod[0] ;
         A4466BarAcaAnh = P0AAW10_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P0AAW10_A1798BarDibCli[0] ;
         A194BarOrdLin = P0AAW10_A194BarOrdLin[0] ;
         A1234BarNomCli = P0AAW10_A1234BarNomCli[0] ;
         A218BarTipCol = P0AAW10_A218BarTipCol[0] ;
         A136BarColNum = P0AAW10_A136BarColNum[0] ;
         A135BarColNom = P0AAW10_A135BarColNom[0] ;
         A1652BarSerDsc = P0AAW10_A1652BarSerDsc[0] ;
         A212BarSer = P0AAW10_A212BarSer[0] ;
         A213BarSit = P0AAW10_A213BarSit[0] ;
         A13696BarNHdr = P0AAW10_A13696BarNHdr[0] ;
         A279CliNom = P0AAW10_A279CliNom[0] ;
         A252CliCod = P0AAW10_A252CliCod[0] ;
         n252CliCod = P0AAW10_n252CliCod[0] ;
         A153BarFasEst = P0AAW10_A153BarFasEst[0] ;
         A603MaqCodBis = P0AAW10_A603MaqCodBis[0] ;
         A4812BarEncCli = P0AAW10_A4812BarEncCli[0] ;
         A143BarDisNum = P0AAW10_A143BarDisNum[0] ;
         A1955BarFasSig = P0AAW10_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AAW10_n1955BarFasSig[0] ;
         A154BarFasLin = P0AAW10_A154BarFasLin[0] ;
         n154BarFasLin = P0AAW10_n154BarFasLin[0] ;
         A151BarFasCod = P0AAW10_A151BarFasCod[0] ;
         n151BarFasCod = P0AAW10_n151BarFasCod[0] ;
         A184BarMtr = P0AAW10_A184BarMtr[0] ;
         A166BarKgm = P0AAW10_A166BarKgm[0] ;
         A129BarCod = P0AAW10_A129BarCod[0] ;
         A132BarCodReo = P0AAW10_A132BarCodReo[0] ;
         A130BarCodPar = P0AAW10_A130BarCodPar[0] ;
         A758ProCod = P0AAW10_A758ProCod[0] ;
         A159BarFecGen = P0AAW10_A159BarFecGen[0] ;
         A4466BarAcaAnh = P0AAW10_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P0AAW10_A1798BarDibCli[0] ;
         A1234BarNomCli = P0AAW10_A1234BarNomCli[0] ;
         A218BarTipCol = P0AAW10_A218BarTipCol[0] ;
         A136BarColNum = P0AAW10_A136BarColNum[0] ;
         A135BarColNom = P0AAW10_A135BarColNom[0] ;
         A1652BarSerDsc = P0AAW10_A1652BarSerDsc[0] ;
         A212BarSer = P0AAW10_A212BarSer[0] ;
         A213BarSit = P0AAW10_A213BarSit[0] ;
         A13696BarNHdr = P0AAW10_A13696BarNHdr[0] ;
         A252CliCod = P0AAW10_A252CliCod[0] ;
         n252CliCod = P0AAW10_n252CliCod[0] ;
         A4812BarEncCli = P0AAW10_A4812BarEncCli[0] ;
         A143BarDisNum = P0AAW10_A143BarDisNum[0] ;
         A279CliNom = P0AAW10_A279CliNom[0] ;
         A1955BarFasSig = P0AAW10_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AAW10_n1955BarFasSig[0] ;
         A154BarFasLin = P0AAW10_A154BarFasLin[0] ;
         n154BarFasLin = P0AAW10_n154BarFasLin[0] ;
         A151BarFasCod = P0AAW10_A151BarFasCod[0] ;
         n151BarFasCod = P0AAW10_n151BarFasCod[0] ;
         A184BarMtr = P0AAW10_A184BarMtr[0] ;
         A166BarKgm = P0AAW10_A166BarKgm[0] ;
         AV16CellRow = (int)(AV16CellRow+1) ;
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
         AV88VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( "" );
            if ( A153BarFasEst == 0 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pendiente", "") );
            }
            else if ( A153BarFasEst == 1 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso (Fase Ini)", "") );
            }
            else if ( A153BarFasEst == 2 )
            {
               AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "En Proceso  (Fase Fin)", "") );
            }
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
            {
               AV125BarEncCli = A4812BarEncCli ;
            }
            else
            {
               AV125BarEncCli = A143BarDisNum ;
            }
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV125BarEncCli, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setNumber( A213BarSit );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV31FasDscLast ;
            GXv_char5[0] = GXt_char2 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV31FasDscLast = GXt_char2 ;
            AV31FasDscLast = ((GXutil.strcmp("", A151BarFasCod)==0) ? " " : AV31FasDscLast) ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV31FasDscLast, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV32FasdscNext ;
            GXv_char5[0] = GXt_char2 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV32FasdscNext = GXt_char2 ;
            AV32FasdscNext = ((GXutil.strcmp("", A1955BarFasSig)==0) ? "" : AV32FasdscNext) ;
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV32FasdscNext, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( ( AV121Rioplatense == 1 ) || ( AV122Carvitin == 1 ) )
            {
               GXt_char2 = AV8AlbRLoc ;
               GXv_char5[0] = GXt_char2 ;
               new app.produccion.recuperalocalizacionalbr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char5) ;
               cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
               AV8AlbRLoc = GXt_char2 ;
            }
            GXt_char2 = "" ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV8AlbRLoc, GXv_char5) ;
            cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
            AV29ExcelDocument.Cells(AV16CellRow, (int)(AV35FirstColumn+AV88VisibleColumnCount), 1, 1).setText( GXt_char2 );
            AV88VisibleColumnCount = (long)(AV88VisibleColumnCount+1) ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S191( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV29ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV29ExcelDocument.Close();
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV29ExcelDocument.getErrCode() != 0 )
      {
         AV33Filename = "" ;
         AV28ErrorMessage = AV29ExcelDocument.getErrDescription() ;
         AV29ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Sel", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCodBis", "", "Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV118fio == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&HisProNFusos", "", "Nro.Fusos", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasEst", "", "Estado Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&BarEncCli", "", "Disp.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarNHdr", "", "Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarSit", "", "Sit.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarSer", "", "Artículo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarSerDsc", "", "Descripción", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarColNum", "", "Número", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarTipCol", "", "TC", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarNomCli", "", "Color.Cli", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarKgm", "", "Kgs.", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV118fio == 0 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarMtr", "", "Mts.", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasCod", "", "", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasLin", "", "#Ult.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&FasDscLast", "", "Ult.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarFasSig", "", "", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&FasdscNext", "", "Sig.Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarOrdLin", "", "# Act", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&FasDscAnt", "", "Fas.Ant", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Abierta", "", "E", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( ( AV119tintest == 1 ) || ( AV118fio == 1 ) )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarDibCli", "", "Dibujo", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV118fio == 0 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Estado", "", "Estado", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV118fio == 0 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&AlbRFen", "", "Fecha Entrada", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV120CnoEnc == 1 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "BarAcaAnh", "", "Caderno", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      if ( AV118fio == 0 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&AlbRLoc", "", "Local", true, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXt_char2 = AV87UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCColumnsSelector", GXv_char5) ;
      cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
      AV87UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV87UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV87UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      AV30Fascod = GXutil.upper( GXutil.trim( AV113WebSession.getValue("FiltroProduccionporFase_FasCod"))) ;
      AV113WebSession.remove("FiltroProduccionporFase_FasCod");
      GXt_char2 = AV114FasDsc ;
      GXv_char5[0] = GXt_char2 ;
      new app.pfasdsc(remoteHandle, context).execute( AV27Emprcod, AV30Fascod, GXv_char5) ;
      cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
      AV114FasDsc = GXt_char2 ;
      if ( GXutil.strcmp(AV45Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV45Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      AV42OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV43OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV133GXV3 = 1 ;
      while ( AV133GXV3 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV133GXV3));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV92TFMaqCodBis = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV93TFMaqCodBis_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV59TFBarFasEst_SelsJson = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFBarFasEst_Sels.fromJSonString(AV59TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV83TFCliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFCliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV85TFCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV86TFCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV69TFBarNHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV70TFBarNHdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV79TFBarSit = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFBarSit_To = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV75TFBarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV76TFBarSer_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV77TFBarSerDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV78TFBarSerDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV48TFBarColNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV49TFBarColNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV50TFBarColNum = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFBarColNum_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV81TFBarTipCol = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFBarTipCol_To = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV71TFBarNomCli = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV72TFBarNomCli_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV65TFBarKgm = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFBarKgm_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV67TFBarMtr = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFBarMtr_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV54TFBarFasCod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV55TFBarFasCod_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASLIN") == 0 )
         {
            AV61TFBarFasLin = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFBarFasLin_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV63TFBarFasSig = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV64TFBarFasSig_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV73TFBarOrdLin = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFBarOrdLin_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI") == 0 )
         {
            AV101TFBarDibCli = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI_SEL") == 0 )
         {
            AV102TFBarDibCli_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV46TFBarAcaAnh = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarAcaAnh_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV27Emprcod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV30Fascod = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV17Clicod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV18Clicod_to = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV12BarFecgen = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV13BarFecGen_to = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV14BarSIt = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV15Barsit_to = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST") == 0 )
         {
            AV10BarfasEst = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST_TO") == 0 )
         {
            AV11BarFasEst_to = (byte)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARACAANH") == 0 )
         {
            AV9BarAcaAnh = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV133GXV3 = (int)(AV133GXV3+1) ;
      }
      AV27Emprcod = AV113WebSession.getValue("EmprCod") ;
      AV30Fascod = AV113WebSession.getValue("FasCod") ;
      AV17Clicod = (int)(GXutil.lval( AV113WebSession.getValue("CliCod"))) ;
      AV18Clicod_to = (int)(GXutil.lval( AV113WebSession.getValue("CliCod_to"))) ;
      AV12BarFecgen = localUtil.ctod( AV113WebSession.getValue("BarFecGen"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV13BarFecGen_to = localUtil.ctod( AV113WebSession.getValue("BarFecGen_to"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV14BarSIt = (byte)(GXutil.lval( AV113WebSession.getValue("BarSit"))) ;
      AV15Barsit_to = (byte)(GXutil.lval( AV113WebSession.getValue("BarSit_to"))) ;
      AV10BarfasEst = (byte)(GXutil.lval( AV113WebSession.getValue("BarFasEst"))) ;
      AV11BarFasEst_to = (byte)(GXutil.lval( AV113WebSession.getValue("BarFasEst_to"))) ;
      AV9BarAcaAnh = (short)(GXutil.lval( AV113WebSession.getValue("BarAcaAnh"))) ;
      AV113WebSession.remove("EmprCod");
      AV113WebSession.remove("FasCod");
      AV113WebSession.remove("CliCod");
      AV113WebSession.remove("CliCod_to");
      AV113WebSession.remove("BarFecGen");
      AV113WebSession.remove("BarFecGen_to");
      AV113WebSession.remove("BarSit");
      AV113WebSession.remove("BarSit_to");
      AV113WebSession.remove("BarFasEst");
      AV113WebSession.remove("BarFasEst_to");
      AV113WebSession.remove("BarAcaAnh");
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
      GXt_char2 = AV115Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
      AV115Station = GXt_char2 ;
      GXv_char5[0] = AV27Emprcod ;
      GXv_char4[0] = AV116EmprNom ;
      GXv_char3[0] = AV117UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char5, GXv_char4, GXv_char3) ;
      cargasproduccionporfase_usuwcexport.this.AV27Emprcod = GXv_char5[0] ;
      cargasproduccionporfase_usuwcexport.this.AV116EmprNom = GXv_char4[0] ;
      cargasproduccionporfase_usuwcexport.this.AV117UsurCod = GXv_char3[0] ;
      AV30Fascod = GXutil.upper( GXutil.trim( AV113WebSession.getValue("FiltroProduccionporFase_FasCod"))) ;
      AV113WebSession.remove("FiltroProduccionporFase_FasCod");
      GXt_char2 = AV114FasDsc ;
      GXv_char5[0] = GXt_char2 ;
      new app.pfasdsc(remoteHandle, context).execute( AV27Emprcod, AV30Fascod, GXv_char5) ;
      cargasproduccionporfase_usuwcexport.this.GXt_char2 = GXv_char5[0] ;
      AV114FasDsc = GXt_char2 ;
   }

   public void S221( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+1, 1, 1).setText( AV116EmprNom+" "+"("+AV134Pgmdesc+")" );
      AV29ExcelDocument.Cells(AV16CellRow, AV35FirstColumn+2, 1, 1).setText( httpContext.getMessage( "Fase: ", "")+" "+AV30Fascod+" "+AV114FasDsc );
   }

   protected void cleanup( )
   {
      this.aP1[0] = cargasproduccionporfase_usuwcexport.this.AV33Filename;
      this.aP2[0] = cargasproduccionporfase_usuwcexport.this.AV28ErrorMessage;
      CloseOpenCursors();
      AV29ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Filename = "" ;
      AV28ErrorMessage = "" ;
      AV127cBarCod = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV89WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV115Station = "" ;
      AV27Emprcod = "" ;
      AV116EmprNom = "" ;
      AV117UsurCod = "" ;
      GXv_int7 = new byte[1] ;
      AV29ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV34FilterFullText = "" ;
      AV93TFMaqCodBis_Sel = "" ;
      AV92TFMaqCodBis = "" ;
      AV58TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86TFCliNom_Sel = "" ;
      AV85TFCliNom = "" ;
      AV70TFBarNHdr_Sel = "" ;
      AV69TFBarNHdr = "" ;
      AV76TFBarSer_Sel = "" ;
      AV75TFBarSer = "" ;
      AV78TFBarSerDsc_Sel = "" ;
      AV77TFBarSerDsc = "" ;
      AV49TFBarColNom_Sel = "" ;
      AV48TFBarColNom = "" ;
      AV72TFBarNomCli_Sel = "" ;
      AV71TFBarNomCli = "" ;
      AV65TFBarKgm = DecimalUtil.ZERO ;
      AV66TFBarKgm_To = DecimalUtil.ZERO ;
      AV67TFBarMtr = DecimalUtil.ZERO ;
      AV68TFBarMtr_To = DecimalUtil.ZERO ;
      AV55TFBarFasCod_Sel = "" ;
      AV54TFBarFasCod = "" ;
      AV64TFBarFasSig_Sel = "" ;
      AV63TFBarFasSig = "" ;
      AV102TFBarDibCli_Sel = "" ;
      AV101TFBarDibCli = "" ;
      GXv_exceldoc8 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int9 = new short[1] ;
      AV45Session = httpContext.getWebSession();
      AV23ColumnsSelectorXML = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV21ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      lV34FilterFullText = "" ;
      lV54TFBarFasCod = "" ;
      lV63TFBarFasSig = "" ;
      scmdbuf = "" ;
      lV92TFMaqCodBis = "" ;
      lV85TFCliNom = "" ;
      lV69TFBarNHdr = "" ;
      lV75TFBarSer = "" ;
      lV77TFBarSerDsc = "" ;
      lV48TFBarColNom = "" ;
      lV71TFBarNomCli = "" ;
      lV101TFBarDibCli = "" ;
      A603MaqCodBis = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      A13696BarNHdr = "" ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV12BarFecgen = GXutil.nullDate() ;
      AV13BarFecGen_to = GXutil.nullDate() ;
      AV30Fascod = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      P0AAW10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAW10_A457FasCod = new String[] {""} ;
      P0AAW10_A396EmprCod = new String[] {""} ;
      P0AAW10_A4466BarAcaAnh = new short[1] ;
      P0AAW10_A1798BarDibCli = new String[] {""} ;
      P0AAW10_A194BarOrdLin = new short[1] ;
      P0AAW10_A1234BarNomCli = new String[] {""} ;
      P0AAW10_A218BarTipCol = new byte[1] ;
      P0AAW10_A136BarColNum = new int[1] ;
      P0AAW10_A135BarColNom = new String[] {""} ;
      P0AAW10_A1652BarSerDsc = new String[] {""} ;
      P0AAW10_A212BarSer = new String[] {""} ;
      P0AAW10_A213BarSit = new byte[1] ;
      P0AAW10_A13696BarNHdr = new String[] {""} ;
      P0AAW10_A279CliNom = new String[] {""} ;
      P0AAW10_A252CliCod = new int[1] ;
      P0AAW10_n252CliCod = new boolean[] {false} ;
      P0AAW10_A153BarFasEst = new byte[1] ;
      P0AAW10_A603MaqCodBis = new String[] {""} ;
      P0AAW10_A4812BarEncCli = new String[] {""} ;
      P0AAW10_A143BarDisNum = new String[] {""} ;
      P0AAW10_A1955BarFasSig = new String[] {""} ;
      P0AAW10_n1955BarFasSig = new boolean[] {false} ;
      P0AAW10_A154BarFasLin = new short[1] ;
      P0AAW10_n154BarFasLin = new boolean[] {false} ;
      P0AAW10_A151BarFasCod = new String[] {""} ;
      P0AAW10_n151BarFasCod = new boolean[] {false} ;
      P0AAW10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAW10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAW10_A129BarCod = new int[1] ;
      P0AAW10_A132BarCodReo = new byte[1] ;
      P0AAW10_A130BarCodPar = new String[] {""} ;
      P0AAW10_A758ProCod = new String[] {""} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A758ProCod = "" ;
      AV125BarEncCli = "" ;
      AV31FasDscLast = "" ;
      AV32FasdscNext = "" ;
      AV8AlbRLoc = "" ;
      AV87UserCustomValue = "" ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV113WebSession = httpContext.getWebSession();
      AV114FasDsc = "" ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59TFBarFasEst_SelsJson = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV134Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporfase_usuwcexport__default(),
         new Object[] {
             new Object[] {
            P0AAW10_A159BarFecGen, P0AAW10_A457FasCod, P0AAW10_A396EmprCod, P0AAW10_A4466BarAcaAnh, P0AAW10_A1798BarDibCli, P0AAW10_A194BarOrdLin, P0AAW10_A1234BarNomCli, P0AAW10_A218BarTipCol, P0AAW10_A136BarColNum, P0AAW10_A135BarColNom,
            P0AAW10_A1652BarSerDsc, P0AAW10_A212BarSer, P0AAW10_A213BarSit, P0AAW10_A13696BarNHdr, P0AAW10_A279CliNom, P0AAW10_A252CliCod, P0AAW10_n252CliCod, P0AAW10_A153BarFasEst, P0AAW10_A603MaqCodBis, P0AAW10_A4812BarEncCli,
            P0AAW10_A143BarDisNum, P0AAW10_A1955BarFasSig, P0AAW10_n1955BarFasSig, P0AAW10_A154BarFasLin, P0AAW10_n154BarFasLin, P0AAW10_A151BarFasCod, P0AAW10_n151BarFasCod, P0AAW10_A184BarMtr, P0AAW10_A166BarKgm, P0AAW10_A129BarCod,
            P0AAW10_A132BarCodReo, P0AAW10_A130BarCodPar, P0AAW10_A758ProCod
            }
         }
      );
      AV134Pgmdesc = httpContext.getMessage( "Informe Producción por Fase", "") ;
      /* GeneXus formulas. */
      AV134Pgmdesc = httpContext.getMessage( "Informe Producción por Fase", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV121Rioplatense ;
   private byte AV122Carvitin ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte AV57TFBarFasEst_Sel ;
   private byte AV79TFBarSit ;
   private byte AV80TFBarSit_To ;
   private byte AV81TFBarTipCol ;
   private byte AV82TFBarTipCol_To ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV14BarSIt ;
   private byte AV15Barsit_to ;
   private byte AV10BarfasEst ;
   private byte AV11BarFasEst_to ;
   private byte AV118fio ;
   private byte AV119tintest ;
   private byte AV120CnoEnc ;
   private short AV61TFBarFasLin ;
   private short AV62TFBarFasLin_To ;
   private short AV73TFBarOrdLin ;
   private short AV74TFBarOrdLin_To ;
   private short AV46TFBarAcaAnh ;
   private short AV47TFBarAcaAnh_To ;
   private short GXv_int9[] ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short AV42OrderedBy ;
   private short A154BarFasLin ;
   private short AV9BarAcaAnh ;
   private short Gx_err ;
   private int AV16CellRow ;
   private int AV35FirstColumn ;
   private int AV44Random ;
   private int AV130GXV1 ;
   private int AV83TFCliCod ;
   private int AV84TFCliCod_To ;
   private int AV50TFBarColNum ;
   private int AV51TFBarColNum_To ;
   private int AV131GXV2 ;
   private int AV58TFBarFasEst_Sels_size ;
   private int AV127cBarCod_size ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV17Clicod ;
   private int AV18Clicod_to ;
   private int AV133GXV3 ;
   private long AV39i ;
   private long AV88VisibleColumnCount ;
   private java.math.BigDecimal AV65TFBarKgm ;
   private java.math.BigDecimal AV66TFBarKgm_To ;
   private java.math.BigDecimal AV67TFBarMtr ;
   private java.math.BigDecimal AV68TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV115Station ;
   private String AV27Emprcod ;
   private String AV116EmprNom ;
   private String AV117UsurCod ;
   private String AV93TFMaqCodBis_Sel ;
   private String AV92TFMaqCodBis ;
   private String AV86TFCliNom_Sel ;
   private String AV85TFCliNom ;
   private String AV70TFBarNHdr_Sel ;
   private String AV69TFBarNHdr ;
   private String AV76TFBarSer_Sel ;
   private String AV75TFBarSer ;
   private String AV78TFBarSerDsc_Sel ;
   private String AV77TFBarSerDsc ;
   private String AV49TFBarColNom_Sel ;
   private String AV48TFBarColNom ;
   private String AV72TFBarNomCli_Sel ;
   private String AV71TFBarNomCli ;
   private String AV55TFBarFasCod_Sel ;
   private String AV54TFBarFasCod ;
   private String AV64TFBarFasSig_Sel ;
   private String AV63TFBarFasSig ;
   private String AV102TFBarDibCli_Sel ;
   private String AV101TFBarDibCli ;
   private String lV54TFBarFasCod ;
   private String lV63TFBarFasSig ;
   private String scmdbuf ;
   private String lV92TFMaqCodBis ;
   private String lV85TFCliNom ;
   private String lV69TFBarNHdr ;
   private String lV75TFBarSer ;
   private String lV77TFBarSerDsc ;
   private String lV48TFBarColNom ;
   private String lV71TFBarNomCli ;
   private String lV101TFBarDibCli ;
   private String A603MaqCodBis ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1798BarDibCli ;
   private String A13696BarNHdr ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String AV30Fascod ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A758ProCod ;
   private String AV125BarEncCli ;
   private String AV31FasDscLast ;
   private String AV32FasdscNext ;
   private String AV8AlbRLoc ;
   private String AV114FasDsc ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV134Pgmdesc ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV12BarFecgen ;
   private java.util.Date AV13BarFecGen_to ;
   private boolean returnInSub ;
   private boolean AV43OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n1955BarFasSig ;
   private boolean n154BarFasLin ;
   private boolean n151BarFasCod ;
   private String AV23ColumnsSelectorXML ;
   private String AV87UserCustomValue ;
   private String AV59TFBarFasEst_SelsJson ;
   private String AV126jsonBarCod ;
   private String AV33Filename ;
   private String AV28ErrorMessage ;
   private String AV34FilterFullText ;
   private String lV34FilterFullText ;
   private GXSimpleCollection<Byte> AV58TFBarFasEst_Sels ;
   private GXSimpleCollection<Integer> AV127cBarCod ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private com.genexus.webpanels.WebSession AV113WebSession ;
   private String[] aP2 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0AAW10_A159BarFecGen ;
   private String[] P0AAW10_A457FasCod ;
   private String[] P0AAW10_A396EmprCod ;
   private short[] P0AAW10_A4466BarAcaAnh ;
   private String[] P0AAW10_A1798BarDibCli ;
   private short[] P0AAW10_A194BarOrdLin ;
   private String[] P0AAW10_A1234BarNomCli ;
   private byte[] P0AAW10_A218BarTipCol ;
   private int[] P0AAW10_A136BarColNum ;
   private String[] P0AAW10_A135BarColNom ;
   private String[] P0AAW10_A1652BarSerDsc ;
   private String[] P0AAW10_A212BarSer ;
   private byte[] P0AAW10_A213BarSit ;
   private String[] P0AAW10_A13696BarNHdr ;
   private String[] P0AAW10_A279CliNom ;
   private int[] P0AAW10_A252CliCod ;
   private boolean[] P0AAW10_n252CliCod ;
   private byte[] P0AAW10_A153BarFasEst ;
   private String[] P0AAW10_A603MaqCodBis ;
   private String[] P0AAW10_A4812BarEncCli ;
   private String[] P0AAW10_A143BarDisNum ;
   private String[] P0AAW10_A1955BarFasSig ;
   private boolean[] P0AAW10_n1955BarFasSig ;
   private short[] P0AAW10_A154BarFasLin ;
   private boolean[] P0AAW10_n154BarFasLin ;
   private String[] P0AAW10_A151BarFasCod ;
   private boolean[] P0AAW10_n151BarFasCod ;
   private java.math.BigDecimal[] P0AAW10_A184BarMtr ;
   private java.math.BigDecimal[] P0AAW10_A166BarKgm ;
   private int[] P0AAW10_A129BarCod ;
   private byte[] P0AAW10_A132BarCodReo ;
   private String[] P0AAW10_A130BarCodPar ;
   private String[] P0AAW10_A758ProCod ;
   private com.genexus.gxoffice.ExcelDoc AV29ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV21ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV89WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class cargasproduccionporfase_usuwcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAW10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV58TFBarFasEst_Sels ,
                                           int A129BarCod ,
                                           GXSimpleCollection<Integer> AV127cBarCod ,
                                           String AV93TFMaqCodBis_Sel ,
                                           String AV92TFMaqCodBis ,
                                           int AV58TFBarFasEst_Sels_size ,
                                           int AV83TFCliCod ,
                                           int AV84TFCliCod_To ,
                                           String AV86TFCliNom_Sel ,
                                           String AV85TFCliNom ,
                                           String AV70TFBarNHdr_Sel ,
                                           String AV69TFBarNHdr ,
                                           byte AV79TFBarSit ,
                                           byte AV80TFBarSit_To ,
                                           String AV76TFBarSer_Sel ,
                                           String AV75TFBarSer ,
                                           String AV78TFBarSerDsc_Sel ,
                                           String AV77TFBarSerDsc ,
                                           String AV49TFBarColNom_Sel ,
                                           String AV48TFBarColNom ,
                                           int AV50TFBarColNum ,
                                           int AV51TFBarColNum_To ,
                                           byte AV81TFBarTipCol ,
                                           byte AV82TFBarTipCol_To ,
                                           String AV72TFBarNomCli_Sel ,
                                           String AV71TFBarNomCli ,
                                           java.math.BigDecimal AV65TFBarKgm ,
                                           java.math.BigDecimal AV66TFBarKgm_To ,
                                           java.math.BigDecimal AV67TFBarMtr ,
                                           java.math.BigDecimal AV68TFBarMtr_To ,
                                           short AV73TFBarOrdLin ,
                                           short AV74TFBarOrdLin_To ,
                                           String AV102TFBarDibCli_Sel ,
                                           String AV101TFBarDibCli ,
                                           short AV46TFBarAcaAnh ,
                                           short AV47TFBarAcaAnh_To ,
                                           int AV127cBarCod_size ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           short AV42OrderedBy ,
                                           boolean AV43OrderedDsc ,
                                           String AV34FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV55TFBarFasCod_Sel ,
                                           String AV54TFBarFasCod ,
                                           short AV61TFBarFasLin ,
                                           short AV62TFBarFasLin_To ,
                                           String AV64TFBarFasSig_Sel ,
                                           String AV63TFBarFasSig ,
                                           int AV17Clicod ,
                                           int AV18Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV12BarFecgen ,
                                           java.util.Date AV13BarFecGen_to ,
                                           byte AV14BarSIt ,
                                           byte AV15Barsit_to ,
                                           byte AV10BarfasEst ,
                                           byte AV11BarFasEst_to ,
                                           short AV9BarAcaAnh ,
                                           String AV27Emprcod ,
                                           String AV30Fascod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[79];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, T2.BarEncCli, T2.BarDisNum, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE(" ;
      scmdbuf += " T6.BarFasSig, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM" ;
      scmdbuf += " (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin" ;
      scmdbuf += " >= 0) AND (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar )" ;
      scmdbuf += " T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND" ;
      scmdbuf += " (T8.BarOrdLin >= 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod" ;
      scmdbuf += " = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV93TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV92TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( AV58TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV58TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV83TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV84TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV85TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV69TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( ! (0==AV79TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( ! (0==AV80TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV75TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV77TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[62] = (byte)(1) ;
      }
      if ( ! (0==AV50TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[63] = (byte)(1) ;
      }
      if ( ! (0==AV51TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[64] = (byte)(1) ;
      }
      if ( ! (0==AV81TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int12[65] = (byte)(1) ;
      }
      if ( ! (0==AV82TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int12[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV71TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int12[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int12[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int12[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int12[72] = (byte)(1) ;
      }
      if ( ! (0==AV73TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int12[73] = (byte)(1) ;
      }
      if ( ! (0==AV74TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int12[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV101TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int12[76] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int12[77] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int12[78] = (byte)(1) ;
      }
      if ( ! ( AV127cBarCod_size <= 0 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127cBarCod, "T1.BarCod IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV42OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV42OrderedBy == 7 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV42OrderedBy == 8 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV42OrderedBy == 8 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV42OrderedBy == 9 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV42OrderedBy == 9 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV42OrderedBy == 10 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV42OrderedBy == 10 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV42OrderedBy == 11 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV42OrderedBy == 11 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV42OrderedBy == 12 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV42OrderedBy == 12 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV42OrderedBy == 13 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV42OrderedBy == 13 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV42OrderedBy == 14 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarDibCli" ;
      }
      else if ( ( AV42OrderedBy == 14 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarDibCli DESC" ;
      }
      else if ( ( AV42OrderedBy == 15 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh" ;
      }
      else if ( ( AV42OrderedBy == 15 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh DESC" ;
      }
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P0AAW10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (GXSimpleCollection<Integer>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Number) dynConstraints[65]).shortValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , ((Number) dynConstraints[68]).intValue() , ((Number) dynConstraints[69]).intValue() , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).byteValue() , ((Number) dynConstraints[74]).byteValue() , ((Number) dynConstraints[75]).byteValue() , ((Number) dynConstraints[76]).byteValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAW10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((byte[]) buf[30])[0] = rslt.getByte(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 1);
               ((String[]) buf[32])[0] = rslt.getString(29, 8);
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
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
      }
   }

}

