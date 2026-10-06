package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultasituacioncoleccion_wcexport extends GXProcedure
{
   public consultasituacioncoleccion_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultasituacioncoleccion_wcexport.class ), "" );
   }

   public consultasituacioncoleccion_wcexport( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultasituacioncoleccion_wcexport.this.aP1 = new String[] {""};
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
      consultasituacioncoleccion_wcexport.this.aP0 = aP0;
      consultasituacioncoleccion_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaSituacionColeccion_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFCliNom_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFCliNom, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV38TFLb_Cartaz_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFLb_Cartaz_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFLb_Cartaz)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Coleccion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFLb_Cartaz, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_ArtCod_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFLb_ArtCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFLb_ArtCod, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFLb_ColNomC_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ColNomC_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFLb_ColNomC)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_ColNomC, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFLb_ColNom_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFLb_ColNom, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV46TFLb_ColNum) && (0==AV47TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV46TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV47TFLb_ColNum_To );
      }
      if ( ! ( (0==AV48TFLb_numero) && (0==AV49TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº de Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFLb_numero_To );
      }
      if ( ! ( (GXutil.strcmp("", AV71TFLb_Tipo_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFLb_Tipo_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFLb_Tipo)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFLb_Tipo, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV77TFLb_EstEns_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "E", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV36i = 1 ;
         AV85GXV1 = 1 ;
         while ( AV85GXV1 <= AV77TFLb_EstEns_Sels.size() )
         {
            AV78TFLb_EstEns_Sel = ((Number) AV77TFLb_EstEns_Sels.elementAt(-1+AV85GXV1)).byteValue() ;
            if ( AV36i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( AV78TFLb_EstEns_Sel == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Pdte. Act. Prod.", "") );
            }
            else if ( AV78TFLb_EstEns_Sel == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Act. Prod.", "") );
            }
            else if ( AV78TFLb_EstEns_Sel == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Cerrado", "") );
            }
            AV36i = (long)(AV36i+1) ;
            AV85GXV1 = (int)(AV85GXV1+1) ;
         }
      }
      if ( ! ( (GXutil.strcmp("", AV75TFLb_Local_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV75TFLb_Local_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV74TFLb_Local)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Localizacion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV74TFLb_Local, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81TFLb_FechaE)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Entrada", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV81TFLb_FechaE );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFLb_Rb)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFLb_Rb_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Rb", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72TFLb_Rb)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73TFLb_Rb_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV80TFLb_obsLb_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Obs", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV80TFLb_obsLb_Sel, GXv_char5) ;
         consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV79TFLb_obsLb)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Obs", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            consultasituacioncoleccion_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV79TFLb_obsLb, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV86GXV2 = 1 ;
      while ( AV86GXV2 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV86GXV2));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV86GXV2 = (int)(AV86GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = AV18FilterFullText ;
      AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = AV34TFCliNom ;
      AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = AV35TFCliNom_Sel ;
      AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = AV37TFLb_Cartaz ;
      AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = AV38TFLb_Cartaz_Sel ;
      AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = AV39TFLb_ArtCod ;
      AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = AV41TFLb_ColNomC ;
      AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = AV42TFLb_ColNomC_Sel ;
      AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = AV44TFLb_ColNom ;
      AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = AV45TFLb_ColNom_Sel ;
      AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum = AV46TFLb_ColNum ;
      AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to = AV47TFLb_ColNum_To ;
      AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero = AV48TFLb_numero ;
      AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to = AV49TFLb_numero_To ;
      AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = AV70TFLb_Tipo ;
      AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = AV71TFLb_Tipo_Sel ;
      AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = AV77TFLb_EstEns_Sels ;
      AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = AV74TFLb_Local ;
      AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = AV75TFLb_Local_Sel ;
      AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = AV81TFLb_FechaE ;
      AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = AV72TFLb_Rb ;
      AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = AV73TFLb_Rb_To ;
      AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = AV79TFLb_obsLb ;
      AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = AV80TFLb_obsLb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                           AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                           AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                           AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                           AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                           AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                           AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                           AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                           AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                           AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                           AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                           AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                           Integer.valueOf(AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) ,
                                           Integer.valueOf(AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) ,
                                           Integer.valueOf(AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) ,
                                           Integer.valueOf(AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) ,
                                           AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                           AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                           Integer.valueOf(AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels.size()) ,
                                           AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                           AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                           AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                           AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                           AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                           AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                           AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                           Integer.valueOf(AV53Clicod) ,
                                           Integer.valueOf(AV55Lb_numero) ,
                                           AV60Lb_cartazffrom ,
                                           AV61Lb_cartazfto ,
                                           AV57Lb_FechaEfrom ,
                                           AV58Lb_FechaEto ,
                                           Integer.valueOf(AV63Lb_ColNum) ,
                                           A279CliNom ,
                                           A5540Lb_Cartaz ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5570Lb_Tipo ,
                                           A5701Lb_Local ,
                                           A5547Lb_Rb ,
                                           A10883Lb_obsLb ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5594Lb_cartazf ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV59Lb_Cartaz ,
                                           AV54Lb_Artcod ,
                                           AV64Lb_ColNomC ,
                                           AV62Lb_ColNom ,
                                           Byte.valueOf(AV65Lb_EstEns) ,
                                           AV69Lb_Tipo ,
                                           AV52Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV59Lb_Cartaz), 20, "%") ;
      lV54Lb_Artcod = GXutil.padr( GXutil.rtrim( AV54Lb_Artcod), 16, "%") ;
      lV64Lb_ColNomC = GXutil.padr( GXutil.rtrim( AV64Lb_ColNomC), 13, "%") ;
      lV62Lb_ColNom = GXutil.padr( GXutil.rtrim( AV62Lb_ColNom), 13, "%") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext), "%", "") ;
      lV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom), 30, "%") ;
      lV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz), 20, "%") ;
      lV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod), 16, "%") ;
      lV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc), 13, "%") ;
      lV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = GXutil.padr( GXutil.rtrim( AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom), 13, "%") ;
      lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = GXutil.padr( GXutil.rtrim( AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo), 1, "%") ;
      lV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = GXutil.padr( GXutil.rtrim( AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local), 10, "%") ;
      lV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = GXutil.concat( GXutil.rtrim( AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb), "%", "") ;
      /* Using cursor P09OM2 */
      pr_default.execute(0, new Object[] {AV52Emprcod, lV59Lb_Cartaz, AV59Lb_Cartaz, lV54Lb_Artcod, AV54Lb_Artcod, lV64Lb_ColNomC, AV64Lb_ColNomC, lV62Lb_ColNom, AV62Lb_ColNom, Byte.valueOf(AV65Lb_EstEns), Byte.valueOf(AV65Lb_EstEns), AV69Lb_Tipo, AV69Lb_Tipo, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext, lV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom, AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel, lV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz, AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel, lV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod, AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel, lV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc, AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel, lV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom, AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel, Integer.valueOf(AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum), Integer.valueOf(AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to), Integer.valueOf(AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero), Integer.valueOf(AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to), lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo, AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel, lV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local, AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel, AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae, AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb, AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to, lV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb, AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel, Integer.valueOf(AV53Clicod), Integer.valueOf(AV55Lb_numero), AV60Lb_cartazffrom, AV61Lb_cartazfto, AV57Lb_FechaEfrom, AV58Lb_FechaEto, Integer.valueOf(AV63Lb_ColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P09OM2_A5532Lb_numero[0] ;
         A396EmprCod = P09OM2_A396EmprCod[0] ;
         A5594Lb_cartazf = P09OM2_A5594Lb_cartazf[0] ;
         A252CliCod = P09OM2_A252CliCod[0] ;
         A10883Lb_obsLb = P09OM2_A10883Lb_obsLb[0] ;
         A5547Lb_Rb = P09OM2_A5547Lb_Rb[0] ;
         A5541Lb_FechaE = P09OM2_A5541Lb_FechaE[0] ;
         A5701Lb_Local = P09OM2_A5701Lb_Local[0] ;
         A5569Lb_EstEns = P09OM2_A5569Lb_EstEns[0] ;
         A5570Lb_Tipo = P09OM2_A5570Lb_Tipo[0] ;
         A5537Lb_ColNum = P09OM2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P09OM2_A5536Lb_ColNom[0] ;
         A5538Lb_ColNomC = P09OM2_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09OM2_A5533Lb_ArtCod[0] ;
         A5540Lb_Cartaz = P09OM2_A5540Lb_Cartaz[0] ;
         A279CliNom = P09OM2_A279CliNom[0] ;
         A279CliNom = P09OM2_A279CliNom[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5540Lb_Cartaz, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5538Lb_ColNomC, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5570Lb_Tipo, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( "" );
            if ( A5569Lb_EstEns == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Pdte. Act. Prod.", "") );
            }
            else if ( A5569Lb_EstEns == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Act. Prod.", "") );
            }
            else if ( A5569Lb_EstEns == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Cerrado", "") );
            }
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV67Lb_FechaR = GXutil.nullDate() ;
            AV66Lb_opcion = "" ;
            /* Using cursor P09OM3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5563Lb_FechaR = P09OM3_A5563Lb_FechaR[0] ;
               A5555Lb_opcion = P09OM3_A5555Lb_opcion[0] ;
               if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) )
               {
                  AV67Lb_FechaR = A5563Lb_FechaR ;
                  AV66Lb_opcion = A5555Lb_opcion ;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66Lb_opcion, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5701Lb_Local, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A5541Lb_FechaE );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV43Lb_FechaEn = GXutil.nullDate() ;
            /* Using cursor P09OM4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5567Lb_FechaEn = P09OM4_A5567Lb_FechaEn[0] ;
               A5555Lb_opcion = P09OM4_A5555Lb_opcion[0] ;
               AV43Lb_FechaEn = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5567Lb_FechaEn)) ? A5567Lb_FechaEn : AV43Lb_FechaEn) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXt_dtime6 = GXutil.resetTime( AV43Lb_FechaEn );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV67Lb_FechaR = GXutil.nullDate() ;
            /* Using cursor P09OM5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5563Lb_FechaR = P09OM5_A5563Lb_FechaR[0] ;
               A5555Lb_opcion = P09OM5_A5555Lb_opcion[0] ;
               AV67Lb_FechaR = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) ? A5563Lb_FechaR : AV67Lb_FechaR) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            GXt_dtime6 = GXutil.resetTime( AV67Lb_FechaR );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV68Lb_FecNoa1 = GXutil.nullDate() ;
            /* Using cursor P09OM6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A6461Lb_FecNoa1 = P09OM6_A6461Lb_FecNoa1[0] ;
               A5555Lb_opcion = P09OM6_A5555Lb_opcion[0] ;
               AV68Lb_FecNoa1 = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) ? A6461Lb_FecNoa1 : AV68Lb_FecNoa1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            GXt_dtime6 = GXutil.resetTime( AV68Lb_FecNoa1 );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5547Lb_Rb)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10883Lb_obsLb, GXv_char5) ;
            consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Cartaz", "", "Coleccion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNomC", "", "Color Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_ColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Tipo", "", "Tipo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_EstEns", "", "E", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_opcion", "", "Opcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Local", "", "Localizacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_FechaE", "Fecha", "Entrada", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_FechaEn", "Fecha", "Envio", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_FechaR", "Fecha", " Recepcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Lb_FecNoa1", "Fecha", "No aceptacion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_Rb", "", "Rb", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Lb_obsLb", "", "Obs", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ConsultaSituacionColeccion_WCColumnsSelector", GXv_char5) ;
      consultasituacioncoleccion_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("GestionLaboratorio.ConsultaSituacionColeccion_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV117GXV3 = 1 ;
      while ( AV117GXV3 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV117GXV3));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV37TFLb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV38TFLb_Cartaz_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV39TFLb_ArtCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV40TFLb_ArtCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV41TFLb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV42TFLb_ColNomC_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV44TFLb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV45TFLb_ColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV46TFLb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFLb_ColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV48TFLb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFLb_numero_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO") == 0 )
         {
            AV70TFLb_Tipo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_TIPO_SEL") == 0 )
         {
            AV71TFLb_Tipo_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTENS_SEL") == 0 )
         {
            AV76TFLb_EstEns_SelsJson = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV77TFLb_EstEns_Sels.fromJSonString(AV76TFLb_EstEns_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL") == 0 )
         {
            AV74TFLb_Local = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LOCAL_SEL") == 0 )
         {
            AV75TFLb_Local_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV81TFLb_FechaE = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV72TFLb_Rb = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFLb_Rb_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB") == 0 )
         {
            AV79TFLb_obsLb = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OBSLB_SEL") == 0 )
         {
            AV80TFLb_obsLb_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV53Clicod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ARTCOD") == 0 )
         {
            AV54Lb_Artcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV55Lb_numero = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_ESTENS") == 0 )
         {
            AV65Lb_EstEns = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAEFROM") == 0 )
         {
            AV57Lb_FechaEfrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_FECHAETO") == 0 )
         {
            AV58Lb_FechaEto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZ") == 0 )
         {
            AV59Lb_Cartaz = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFFROM") == 0 )
         {
            AV60Lb_cartazffrom = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_CARTAZFTO") == 0 )
         {
            AV61Lb_cartazfto = localUtil.ctod( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOM") == 0 )
         {
            AV62Lb_ColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNUM") == 0 )
         {
            AV63Lb_ColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_COLNOMC") == 0 )
         {
            AV64Lb_ColNomC = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_TIPO") == 0 )
         {
            AV69Lb_Tipo = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV117GXV3 = (int)(AV117GXV3+1) ;
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
      this.aP0[0] = consultasituacioncoleccion_wcexport.this.AV11Filename;
      this.aP1[0] = consultasituacioncoleccion_wcexport.this.AV12ErrorMessage;
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
      AV35TFCliNom_Sel = "" ;
      AV34TFCliNom = "" ;
      AV38TFLb_Cartaz_Sel = "" ;
      AV37TFLb_Cartaz = "" ;
      AV40TFLb_ArtCod_Sel = "" ;
      AV39TFLb_ArtCod = "" ;
      AV42TFLb_ColNomC_Sel = "" ;
      AV41TFLb_ColNomC = "" ;
      AV45TFLb_ColNom_Sel = "" ;
      AV44TFLb_ColNom = "" ;
      AV71TFLb_Tipo_Sel = "" ;
      AV70TFLb_Tipo = "" ;
      AV77TFLb_EstEns_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV75TFLb_Local_Sel = "" ;
      AV74TFLb_Local = "" ;
      AV81TFLb_FechaE = GXutil.nullDate() ;
      AV72TFLb_Rb = DecimalUtil.ZERO ;
      AV73TFLb_Rb_To = DecimalUtil.ZERO ;
      AV80TFLb_obsLb_Sel = "" ;
      AV79TFLb_obsLb = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5570Lb_Tipo = "" ;
      A5701Lb_Local = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A10883Lb_obsLb = "" ;
      AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel = "" ;
      AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel = "" ;
      AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel = "" ;
      AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel = "" ;
      AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel = "" ;
      AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel = "" ;
      AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel = "" ;
      AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae = GXutil.nullDate() ;
      AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb = DecimalUtil.ZERO ;
      AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to = DecimalUtil.ZERO ;
      AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel = "" ;
      lV59Lb_Cartaz = "" ;
      lV54Lb_Artcod = "" ;
      lV64Lb_ColNomC = "" ;
      lV62Lb_ColNom = "" ;
      scmdbuf = "" ;
      lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext = "" ;
      lV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom = "" ;
      lV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz = "" ;
      lV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod = "" ;
      lV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc = "" ;
      lV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom = "" ;
      lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo = "" ;
      lV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local = "" ;
      lV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb = "" ;
      AV60Lb_cartazffrom = GXutil.nullDate() ;
      AV61Lb_cartazfto = GXutil.nullDate() ;
      AV57Lb_FechaEfrom = GXutil.nullDate() ;
      AV58Lb_FechaEto = GXutil.nullDate() ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      AV59Lb_Cartaz = "" ;
      AV54Lb_Artcod = "" ;
      AV64Lb_ColNomC = "" ;
      AV62Lb_ColNom = "" ;
      AV69Lb_Tipo = "" ;
      AV52Emprcod = "" ;
      A396EmprCod = "" ;
      P09OM2_A5532Lb_numero = new int[1] ;
      P09OM2_A396EmprCod = new String[] {""} ;
      P09OM2_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM2_A252CliCod = new int[1] ;
      P09OM2_A10883Lb_obsLb = new String[] {""} ;
      P09OM2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09OM2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM2_A5701Lb_Local = new String[] {""} ;
      P09OM2_A5569Lb_EstEns = new byte[1] ;
      P09OM2_A5570Lb_Tipo = new String[] {""} ;
      P09OM2_A5537Lb_ColNum = new int[1] ;
      P09OM2_A5536Lb_ColNom = new String[] {""} ;
      P09OM2_A5538Lb_ColNomC = new String[] {""} ;
      P09OM2_A5533Lb_ArtCod = new String[] {""} ;
      P09OM2_A5540Lb_Cartaz = new String[] {""} ;
      P09OM2_A279CliNom = new String[] {""} ;
      AV67Lb_FechaR = GXutil.nullDate() ;
      AV66Lb_opcion = "" ;
      P09OM3_A396EmprCod = new String[] {""} ;
      P09OM3_A5532Lb_numero = new int[1] ;
      P09OM3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM3_A5555Lb_opcion = new String[] {""} ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV43Lb_FechaEn = GXutil.nullDate() ;
      P09OM4_A396EmprCod = new String[] {""} ;
      P09OM4_A5532Lb_numero = new int[1] ;
      P09OM4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM4_A5555Lb_opcion = new String[] {""} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      P09OM5_A396EmprCod = new String[] {""} ;
      P09OM5_A5532Lb_numero = new int[1] ;
      P09OM5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM5_A5555Lb_opcion = new String[] {""} ;
      AV68Lb_FecNoa1 = GXutil.nullDate() ;
      P09OM6_A396EmprCod = new String[] {""} ;
      P09OM6_A5532Lb_numero = new int[1] ;
      P09OM6_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P09OM6_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76TFLb_EstEns_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.consultasituacioncoleccion_wcexport__default(),
         new Object[] {
             new Object[] {
            P09OM2_A5532Lb_numero, P09OM2_A396EmprCod, P09OM2_A5594Lb_cartazf, P09OM2_A252CliCod, P09OM2_A10883Lb_obsLb, P09OM2_A5547Lb_Rb, P09OM2_A5541Lb_FechaE, P09OM2_A5701Lb_Local, P09OM2_A5569Lb_EstEns, P09OM2_A5570Lb_Tipo,
            P09OM2_A5537Lb_ColNum, P09OM2_A5536Lb_ColNom, P09OM2_A5538Lb_ColNomC, P09OM2_A5533Lb_ArtCod, P09OM2_A5540Lb_Cartaz, P09OM2_A279CliNom
            }
            , new Object[] {
            P09OM3_A396EmprCod, P09OM3_A5532Lb_numero, P09OM3_A5563Lb_FechaR, P09OM3_A5555Lb_opcion
            }
            , new Object[] {
            P09OM4_A396EmprCod, P09OM4_A5532Lb_numero, P09OM4_A5567Lb_FechaEn, P09OM4_A5555Lb_opcion
            }
            , new Object[] {
            P09OM5_A396EmprCod, P09OM5_A5532Lb_numero, P09OM5_A5563Lb_FechaR, P09OM5_A5555Lb_opcion
            }
            , new Object[] {
            P09OM6_A396EmprCod, P09OM6_A5532Lb_numero, P09OM6_A6461Lb_FecNoa1, P09OM6_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV78TFLb_EstEns_Sel ;
   private byte A5569Lb_EstEns ;
   private byte AV65Lb_EstEns ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV46TFLb_ColNum ;
   private int AV47TFLb_ColNum_To ;
   private int AV48TFLb_numero ;
   private int AV49TFLb_numero_To ;
   private int AV85GXV1 ;
   private int AV86GXV2 ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private int AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ;
   private int AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ;
   private int AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ;
   private int AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ;
   private int AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ;
   private int AV53Clicod ;
   private int AV55Lb_numero ;
   private int AV63Lb_ColNum ;
   private int A252CliCod ;
   private int AV117GXV3 ;
   private long AV36i ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV72TFLb_Rb ;
   private java.math.BigDecimal AV73TFLb_Rb_To ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ;
   private java.math.BigDecimal AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ;
   private String AV35TFCliNom_Sel ;
   private String AV34TFCliNom ;
   private String AV38TFLb_Cartaz_Sel ;
   private String AV37TFLb_Cartaz ;
   private String AV40TFLb_ArtCod_Sel ;
   private String AV39TFLb_ArtCod ;
   private String AV42TFLb_ColNomC_Sel ;
   private String AV41TFLb_ColNomC ;
   private String AV45TFLb_ColNom_Sel ;
   private String AV44TFLb_ColNom ;
   private String AV71TFLb_Tipo_Sel ;
   private String AV70TFLb_Tipo ;
   private String AV75TFLb_Local_Sel ;
   private String AV74TFLb_Local ;
   private String A279CliNom ;
   private String A5540Lb_Cartaz ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5570Lb_Tipo ;
   private String A5701Lb_Local ;
   private String AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ;
   private String AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ;
   private String AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ;
   private String AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ;
   private String AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ;
   private String AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ;
   private String AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ;
   private String lV59Lb_Cartaz ;
   private String lV54Lb_Artcod ;
   private String lV64Lb_ColNomC ;
   private String lV62Lb_ColNom ;
   private String scmdbuf ;
   private String lV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ;
   private String lV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ;
   private String lV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ;
   private String lV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ;
   private String lV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ;
   private String lV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ;
   private String lV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ;
   private String AV59Lb_Cartaz ;
   private String AV54Lb_Artcod ;
   private String AV64Lb_ColNomC ;
   private String AV62Lb_ColNom ;
   private String AV69Lb_Tipo ;
   private String AV52Emprcod ;
   private String A396EmprCod ;
   private String AV66Lb_opcion ;
   private String A5555Lb_opcion ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV81TFLb_FechaE ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ;
   private java.util.Date AV60Lb_cartazffrom ;
   private java.util.Date AV61Lb_cartazfto ;
   private java.util.Date AV57Lb_FechaEfrom ;
   private java.util.Date AV58Lb_FechaEto ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date AV67Lb_FechaR ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV43Lb_FechaEn ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV68Lb_FecNoa1 ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV76TFLb_EstEns_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV80TFLb_obsLb_Sel ;
   private String AV79TFLb_obsLb ;
   private String A10883Lb_obsLb ;
   private String AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private String AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ;
   private String lV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ;
   private String lV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ;
   private GXSimpleCollection<Byte> AV77TFLb_EstEns_Sels ;
   private GXSimpleCollection<Byte> AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P09OM2_A5532Lb_numero ;
   private String[] P09OM2_A396EmprCod ;
   private java.util.Date[] P09OM2_A5594Lb_cartazf ;
   private int[] P09OM2_A252CliCod ;
   private String[] P09OM2_A10883Lb_obsLb ;
   private java.math.BigDecimal[] P09OM2_A5547Lb_Rb ;
   private java.util.Date[] P09OM2_A5541Lb_FechaE ;
   private String[] P09OM2_A5701Lb_Local ;
   private byte[] P09OM2_A5569Lb_EstEns ;
   private String[] P09OM2_A5570Lb_Tipo ;
   private int[] P09OM2_A5537Lb_ColNum ;
   private String[] P09OM2_A5536Lb_ColNom ;
   private String[] P09OM2_A5538Lb_ColNomC ;
   private String[] P09OM2_A5533Lb_ArtCod ;
   private String[] P09OM2_A5540Lb_Cartaz ;
   private String[] P09OM2_A279CliNom ;
   private String[] P09OM3_A396EmprCod ;
   private int[] P09OM3_A5532Lb_numero ;
   private java.util.Date[] P09OM3_A5563Lb_FechaR ;
   private String[] P09OM3_A5555Lb_opcion ;
   private String[] P09OM4_A396EmprCod ;
   private int[] P09OM4_A5532Lb_numero ;
   private java.util.Date[] P09OM4_A5567Lb_FechaEn ;
   private String[] P09OM4_A5555Lb_opcion ;
   private String[] P09OM5_A396EmprCod ;
   private int[] P09OM5_A5532Lb_numero ;
   private java.util.Date[] P09OM5_A5563Lb_FechaR ;
   private String[] P09OM5_A5555Lb_opcion ;
   private String[] P09OM6_A396EmprCod ;
   private int[] P09OM6_A5532Lb_numero ;
   private java.util.Date[] P09OM6_A6461Lb_FecNoa1 ;
   private String[] P09OM6_A5555Lb_opcion ;
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

final  class consultasituacioncoleccion_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09OM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5569Lb_EstEns ,
                                          GXSimpleCollection<Byte> AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels ,
                                          String AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext ,
                                          String AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel ,
                                          String AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom ,
                                          String AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel ,
                                          String AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz ,
                                          String AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel ,
                                          String AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod ,
                                          String AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel ,
                                          String AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc ,
                                          String AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel ,
                                          String AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom ,
                                          int AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum ,
                                          int AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to ,
                                          int AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero ,
                                          int AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to ,
                                          String AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel ,
                                          String AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo ,
                                          int AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size ,
                                          String AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel ,
                                          String AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local ,
                                          java.util.Date AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae ,
                                          java.math.BigDecimal AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb ,
                                          java.math.BigDecimal AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to ,
                                          String AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel ,
                                          String AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb ,
                                          int AV53Clicod ,
                                          int AV55Lb_numero ,
                                          java.util.Date AV60Lb_cartazffrom ,
                                          java.util.Date AV61Lb_cartazfto ,
                                          java.util.Date AV57Lb_FechaEfrom ,
                                          java.util.Date AV58Lb_FechaEto ,
                                          int AV63Lb_ColNum ,
                                          String A279CliNom ,
                                          String A5540Lb_Cartaz ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          int A5532Lb_numero ,
                                          String A5570Lb_Tipo ,
                                          String A5701Lb_Local ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A10883Lb_obsLb ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A252CliCod ,
                                          java.util.Date A5594Lb_cartazf ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV59Lb_Cartaz ,
                                          String AV54Lb_Artcod ,
                                          String AV64Lb_ColNomC ,
                                          String AV62Lb_ColNom ,
                                          byte AV65Lb_EstEns ,
                                          String AV69Lb_Tipo ,
                                          String AV52Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[55];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_cartazf, T1.CliCod, T1.Lb_obsLb, T1.Lb_Rb, T1.Lb_FechaE, T1.Lb_Local, T1.Lb_EstEns, T1.Lb_Tipo, T1.Lb_ColNum, T1.Lb_ColNom," ;
      scmdbuf += " T1.Lb_ColNomC, T1.Lb_ArtCod, T1.Lb_Cartaz, T2.CliNom FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Cartaz like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ArtCod like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNomC like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_ColNom like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.Lb_EstEns = ? or ? = 9)");
      addWhere(sWhereString, "(T1.Lb_Tipo = ? or ? = '*')");
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_consultasituacioncoleccion_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_Cartaz) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNomC) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( UPPER(T1.Lb_Tipo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_EstEns,'90'), 2) like '%' || ?) or ( UPPER(T1.Lb_Local) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_obsLb) like '%' || UPPER(?)))");
      }
      else
      {
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
      }
      if ( (GXutil.strcmp("", AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV89Gestionlaboratorio_consultasituacioncoleccion_wcds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Gestionlaboratorio_consultasituacioncoleccion_wcds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV91Gestionlaboratorio_consultasituacioncoleccion_wcds_4_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Gestionlaboratorio_consultasituacioncoleccion_wcds_5_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Gestionlaboratorio_consultasituacioncoleccion_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Gestionlaboratorio_consultasituacioncoleccion_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV95Gestionlaboratorio_consultasituacioncoleccion_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Gestionlaboratorio_consultasituacioncoleccion_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV97Gestionlaboratorio_consultasituacioncoleccion_wcds_10_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Gestionlaboratorio_consultasituacioncoleccion_wcds_11_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV99Gestionlaboratorio_consultasituacioncoleccion_wcds_12_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV100Gestionlaboratorio_consultasituacioncoleccion_wcds_13_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV101Gestionlaboratorio_consultasituacioncoleccion_wcds_14_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV102Gestionlaboratorio_consultasituacioncoleccion_wcds_15_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) && ( ! (GXutil.strcmp("", AV103Gestionlaboratorio_consultasituacioncoleccion_wcds_16_tflb_tipo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Tipo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Gestionlaboratorio_consultasituacioncoleccion_wcds_17_tflb_tipo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Tipo = ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV105Gestionlaboratorio_consultasituacioncoleccion_wcds_18_tflb_estens_sels, "T1.Lb_EstEns IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) && ( ! (GXutil.strcmp("", AV106Gestionlaboratorio_consultasituacioncoleccion_wcds_19_tflb_local)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_Local) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Gestionlaboratorio_consultasituacioncoleccion_wcds_20_tflb_local_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Local = ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Gestionlaboratorio_consultasituacioncoleccion_wcds_21_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Gestionlaboratorio_consultasituacioncoleccion_wcds_22_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Gestionlaboratorio_consultasituacioncoleccion_wcds_23_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) && ( ! (GXutil.strcmp("", AV111Gestionlaboratorio_consultasituacioncoleccion_wcds_24_tflb_obslb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_obsLb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Gestionlaboratorio_consultasituacioncoleccion_wcds_25_tflb_obslb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_obsLb = ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (0==AV53Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV55Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Lb_cartazffrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61Lb_cartazfto)) )
      {
         addWhere(sWhereString, "(T1.Lb_cartazf <= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (0==AV63Lb_ColNum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum = ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_FechaE DESC" ;
      }
      else if ( AV16OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
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
         scmdbuf += " ORDER BY T1.Lb_Cartaz" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Cartaz DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNomC DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Tipo DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_EstEns DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Local" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Local DESC" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb" ;
      }
      else if ( ( AV16OrderedBy == 13 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_Rb DESC" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_obsLb" ;
      }
      else if ( ( AV16OrderedBy == 14 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_obsLb DESC" ;
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
                  return conditional_P09OM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OM3", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OM4", "SELECT EmprCod, Lb_numero, Lb_FechaEn, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OM5", "SELECT EmprCod, Lb_numero, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OM6", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 16);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 10);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 300);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 300);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

