package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetas_crecetexport extends GXProcedure
{
   public wcsituacionprocesoquimicorecetas_crecetexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsituacionprocesoquimicorecetas_crecetexport.class ), "" );
   }

   public wcsituacionprocesoquimicorecetas_crecetexport( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcsituacionprocesoquimicorecetas_crecetexport.this.aP1 = new String[] {""};
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
      wcsituacionprocesoquimicorecetas_crecetexport.this.aP0 = aP0;
      wcsituacionprocesoquimicorecetas_crecetexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCSituacionProcesoQuimicoRecetas_CRECETExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20FilterFullText, GXv_char5) ;
      wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFBarNHdr_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFBarNHdr, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV38TFCliCod) && (0==AV39TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV38TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV39TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV41TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFCliNom_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV40TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFCliNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV43TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarSer_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarSer, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFBarSerDsc_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarSerDsc, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV47TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarColNom_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFBarColNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV48TFBarColNum) && (0==AV49TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV48TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV49TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV51TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFBarNomCli_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarNomCli, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV53TFRecAcab_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetas_crecetexport.this.AV13CellRow = GXv_int3[0] ;
         AV55i = 1 ;
         AV58GXV1 = 1 ;
         while ( AV58GXV1 <= AV53TFRecAcab_Sels.size() )
         {
            AV54TFRecAcab_Sel = (String)AV53TFRecAcab_Sels.elementAt(-1+AV58GXV1) ;
            if ( AV55i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV54TFRecAcab_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Receta Tinte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV54TFRecAcab_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Receta acabado", "") );
            }
            AV55i = (long)(AV55i+1) ;
            AV58GXV1 = (int)(AV58GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV33VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV21Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV59GXV2 = 1 ;
      while ( AV59GXV2 <= AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV27ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV59GXV2));
         if ( AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setColor( 11 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         AV59GXV2 = (int)(AV59GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV20FilterFullText ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV36TFBarNHdr ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV38TFCliCod ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV39TFCliCod_To ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV40TFCliNom ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV41TFCliNom_Sel ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV42TFBarSer ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV43TFBarSer_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV44TFBarSerDsc ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV46TFBarColNom ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV48TFBarColNum ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV50TFBarNomCli ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV51TFBarNomCli_Sel ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV53TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV16Emprcod ,
                                           AV17Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CK2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17Proforcod, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09CK2_A2804RecLinMaq[0] ;
         A764ProForCod = P09CK2_A764ProForCod[0] ;
         A396EmprCod = P09CK2_A396EmprCod[0] ;
         A6039RecAcab = P09CK2_A6039RecAcab[0] ;
         n6039RecAcab = P09CK2_n6039RecAcab[0] ;
         A1234BarNomCli = P09CK2_A1234BarNomCli[0] ;
         A136BarColNum = P09CK2_A136BarColNum[0] ;
         A135BarColNom = P09CK2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CK2_A1652BarSerDsc[0] ;
         A212BarSer = P09CK2_A212BarSer[0] ;
         A279CliNom = P09CK2_A279CliNom[0] ;
         A252CliCod = P09CK2_A252CliCod[0] ;
         n252CliCod = P09CK2_n252CliCod[0] ;
         A130BarCodPar = P09CK2_A130BarCodPar[0] ;
         A132BarCodReo = P09CK2_A132BarCodReo[0] ;
         A129BarCod = P09CK2_A129BarCod[0] ;
         A1273RecLinPro = P09CK2_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CK2_A1234BarNomCli[0] ;
         A136BarColNum = P09CK2_A136BarColNum[0] ;
         A135BarColNom = P09CK2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CK2_A1652BarSerDsc[0] ;
         A212BarSer = P09CK2_A212BarSer[0] ;
         A252CliCod = P09CK2_A252CliCod[0] ;
         n252CliCod = P09CK2_n252CliCod[0] ;
         A279CliNom = P09CK2_A279CliNom[0] ;
         A6039RecAcab = P09CK2_A6039RecAcab[0] ;
         n6039RecAcab = P09CK2_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV33VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Receta Tinte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Receta acabado", "") );
            }
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Serie", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Nombre Color", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNum", "", "Numero del Color", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecAcab", "", "", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV29UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector", GXv_char5) ;
      wcsituacionprocesoquimicorecetas_crecetexport.this.GXt_char4 = GXv_char5[0] ;
      AV29UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      AV18OrderedBy = AV23GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV23GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV3 = 1 ;
      while ( AV79GXV3 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV3));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV36TFBarNHdr = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV37TFBarNHdr_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV42TFBarSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV43TFBarSer_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV44TFBarSerDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV45TFBarSerDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV46TFBarColNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV47TFBarColNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV50TFBarNomCli = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV51TFBarNomCli_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV52TFRecAcab_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFRecAcab_Sels.fromJSonString(AV52TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV17Proforcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV3 = (int)(AV79GXV3+1) ;
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
      this.aP0[0] = wcsituacionprocesoquimicorecetas_crecetexport.this.AV11Filename;
      this.aP1[0] = wcsituacionprocesoquimicorecetas_crecetexport.this.AV12ErrorMessage;
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
      AV37TFBarNHdr_Sel = "" ;
      AV36TFBarNHdr = "" ;
      AV41TFCliNom_Sel = "" ;
      AV40TFCliNom = "" ;
      AV43TFBarSer_Sel = "" ;
      AV42TFBarSer = "" ;
      AV45TFBarSerDsc_Sel = "" ;
      AV44TFBarSerDsc = "" ;
      AV47TFBarColNom_Sel = "" ;
      AV46TFBarColNom = "" ;
      AV51TFBarNomCli_Sel = "" ;
      AV50TFBarNomCli = "" ;
      AV53TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV54TFRecAcab_Sel = "" ;
      AV21Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV27ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6039RecAcab = "" ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = "" ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = "" ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = "" ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      lV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      AV16Emprcod = "" ;
      AV17Proforcod = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09CK2_A2804RecLinMaq = new short[1] ;
      P09CK2_A764ProForCod = new String[] {""} ;
      P09CK2_A396EmprCod = new String[] {""} ;
      P09CK2_A6039RecAcab = new String[] {""} ;
      P09CK2_n6039RecAcab = new boolean[] {false} ;
      P09CK2_A1234BarNomCli = new String[] {""} ;
      P09CK2_A136BarColNum = new int[1] ;
      P09CK2_A135BarColNom = new String[] {""} ;
      P09CK2_A1652BarSerDsc = new String[] {""} ;
      P09CK2_A212BarSer = new String[] {""} ;
      P09CK2_A279CliNom = new String[] {""} ;
      P09CK2_A252CliCod = new int[1] ;
      P09CK2_n252CliCod = new boolean[] {false} ;
      P09CK2_A130BarCodPar = new String[] {""} ;
      P09CK2_A132BarCodReo = new byte[1] ;
      P09CK2_A129BarCod = new int[1] ;
      P09CK2_A1273RecLinPro = new byte[1] ;
      AV29UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52TFRecAcab_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecetexport__default(),
         new Object[] {
             new Object[] {
            P09CK2_A2804RecLinMaq, P09CK2_A764ProForCod, P09CK2_A396EmprCod, P09CK2_A6039RecAcab, P09CK2_n6039RecAcab, P09CK2_A1234BarNomCli, P09CK2_A136BarColNum, P09CK2_A135BarColNom, P09CK2_A1652BarSerDsc, P09CK2_A212BarSer,
            P09CK2_A279CliNom, P09CK2_A252CliCod, P09CK2_n252CliCod, P09CK2_A130BarCodPar, P09CK2_A132BarCodReo, P09CK2_A129BarCod, P09CK2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV38TFCliCod ;
   private int AV39TFCliCod_To ;
   private int AV48TFBarColNum ;
   private int AV49TFBarColNum_To ;
   private int AV58GXV1 ;
   private int AV59GXV2 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ;
   private int AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ;
   private int AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ;
   private int AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ;
   private int AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV79GXV3 ;
   private long AV55i ;
   private long AV33VisibleColumnCount ;
   private String AV37TFBarNHdr_Sel ;
   private String AV36TFBarNHdr ;
   private String AV41TFCliNom_Sel ;
   private String AV40TFCliNom ;
   private String AV43TFBarSer_Sel ;
   private String AV42TFBarSer ;
   private String AV45TFBarSerDsc_Sel ;
   private String AV44TFBarSerDsc ;
   private String AV47TFBarColNom_Sel ;
   private String AV46TFBarColNom ;
   private String AV51TFBarNomCli_Sel ;
   private String AV50TFBarNomCli ;
   private String AV54TFRecAcab_Sel ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A6039RecAcab ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ;
   private String AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ;
   private String AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ;
   private String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ;
   private String AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ;
   private String scmdbuf ;
   private String lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String lV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String lV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String A130BarCodPar ;
   private String AV16Emprcod ;
   private String AV17Proforcod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n252CliCod ;
   private String AV28ColumnsSelectorXML ;
   private String AV29UserCustomValue ;
   private String AV52TFRecAcab_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV20FilterFullText ;
   private String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String lV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private GXSimpleCollection<String> AV53TFRecAcab_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09CK2_A2804RecLinMaq ;
   private String[] P09CK2_A764ProForCod ;
   private String[] P09CK2_A396EmprCod ;
   private String[] P09CK2_A6039RecAcab ;
   private boolean[] P09CK2_n6039RecAcab ;
   private String[] P09CK2_A1234BarNomCli ;
   private int[] P09CK2_A136BarColNum ;
   private String[] P09CK2_A135BarColNom ;
   private String[] P09CK2_A1652BarSerDsc ;
   private String[] P09CK2_A212BarSer ;
   private String[] P09CK2_A279CliNom ;
   private int[] P09CK2_A252CliCod ;
   private boolean[] P09CK2_n252CliCod ;
   private String[] P09CK2_A130BarCodPar ;
   private byte[] P09CK2_A132BarCodReo ;
   private int[] P09CK2_A129BarCod ;
   private byte[] P09CK2_A1273RecLinPro ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV27ColumnsSelector_Column ;
}

final  class wcsituacionprocesoquimicorecetas_crecetexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV16Emprcod ,
                                          String AV17Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.ProForCod, T1.EmprCod, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV78Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV18OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RecAcab" ;
      }
      else if ( ( AV18OrderedBy == 9 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RecAcab DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09CK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
      }
   }

}

