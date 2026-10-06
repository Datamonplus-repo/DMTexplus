package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetasexport extends GXProcedure
{
   public wcsituacionprocesoquimicorecetasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsituacionprocesoquimicorecetasexport.class ), "" );
   }

   public wcsituacionprocesoquimicorecetasexport( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcsituacionprocesoquimicorecetasexport.this.aP1 = new String[] {""};
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
      wcsituacionprocesoquimicorecetasexport.this.aP0 = aP0;
      wcsituacionprocesoquimicorecetasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCSituacionProcesoQuimicoRecetasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV57FilterFullText, GXv_char5) ;
      wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV35TFCliCod) && (0==AV36TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFBarSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFBarSer_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFBarSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFBarSer, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFBarSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFBarSerDsc_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFBarSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción Serie", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFBarSerDsc, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFBarColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFBarColNom_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFBarColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFBarColNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFBarColNum) && (0==AV46TFBarColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero del Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFBarColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFBarColNum_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFBarNomCli_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFBarNomCli_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFBarNomCli)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Color Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFBarNomCli, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFBarNHdr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFBarNHdr_Sel, GXv_char5) ;
         wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFBarNHdr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "N Hdr", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFBarNHdr, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV55TFRecAcab_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcsituacionprocesoquimicorecetasexport.this.AV13CellRow = GXv_int3[0] ;
         AV53i = 1 ;
         AV60GXV1 = 1 ;
         while ( AV60GXV1 <= AV55TFRecAcab_Sels.size() )
         {
            AV56TFRecAcab_Sel = (String)AV55TFRecAcab_Sels.elementAt(-1+AV60GXV1) ;
            if ( AV53i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV56TFRecAcab_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Receta Tinte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV56TFRecAcab_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "Receta acabado", "") );
            }
            AV53i = (long)(AV53i+1) ;
            AV60GXV1 = (int)(AV60GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV32VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV20Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV20Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV61GXV2 = 1 ;
      while ( AV61GXV2 <= AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV26ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV61GXV2));
         if ( AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV26ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setColor( 11 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         AV61GXV2 = (int)(AV61GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV57FilterFullText ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV35TFCliCod ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV36TFCliCod_To ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV37TFCliNom ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV39TFBarSer ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV40TFBarSer_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV41TFBarSerDsc ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV42TFBarSerDsc_Sel ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV43TFBarColNom ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV44TFBarColNom_Sel ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV45TFBarColNum ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV46TFBarColNum_To ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV47TFBarNomCli ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV48TFBarNomCli_Sel ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV55TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV17Proforcod ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IP2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, Integer.valueOf(AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08IP2_A396EmprCod[0] ;
         A1234BarNomCli = P08IP2_A1234BarNomCli[0] ;
         A136BarColNum = P08IP2_A136BarColNum[0] ;
         A135BarColNom = P08IP2_A135BarColNom[0] ;
         A1652BarSerDsc = P08IP2_A1652BarSerDsc[0] ;
         A212BarSer = P08IP2_A212BarSer[0] ;
         A279CliNom = P08IP2_A279CliNom[0] ;
         A252CliCod = P08IP2_A252CliCod[0] ;
         n252CliCod = P08IP2_n252CliCod[0] ;
         A130BarCodPar = P08IP2_A130BarCodPar[0] ;
         A132BarCodReo = P08IP2_A132BarCodReo[0] ;
         A129BarCod = P08IP2_A129BarCod[0] ;
         A279CliNom = P08IP2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
         AV32VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char5) ;
            wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( "" );
            if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Receta Tinte", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV32VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "Receta acabado", "") );
            }
            AV32VisibleColumnCount = (long)(AV32VisibleColumnCount+1) ;
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Nombre Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNum", "", "Numero del Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecAcab", "", "", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV28UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector", GXv_char5) ;
      wcsituacionprocesoquimicorecetasexport.this.GXt_char4 = GXv_char5[0] ;
      AV28UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV28UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV28UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      AV18OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV19OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV3 = 1 ;
      while ( AV81GXV3 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV3));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV57FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFCliCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV39TFBarSer = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV40TFBarSer_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV41TFBarSerDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV42TFBarSerDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV43TFBarColNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV44TFBarColNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV45TFBarColNum = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarColNum_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV47TFBarNomCli = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV48TFBarNomCli_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV49TFBarNHdr = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV50TFBarNHdr_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV54TFRecAcab_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFRecAcab_Sels.fromJSonString(AV54TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV17Proforcod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV3 = (int)(AV81GXV3+1) ;
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
      this.aP0[0] = wcsituacionprocesoquimicorecetasexport.this.AV11Filename;
      this.aP1[0] = wcsituacionprocesoquimicorecetasexport.this.AV12ErrorMessage;
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
      AV57FilterFullText = "" ;
      AV38TFCliNom_Sel = "" ;
      AV37TFCliNom = "" ;
      AV40TFBarSer_Sel = "" ;
      AV39TFBarSer = "" ;
      AV42TFBarSerDsc_Sel = "" ;
      AV41TFBarSerDsc = "" ;
      AV44TFBarColNom_Sel = "" ;
      AV43TFBarColNom = "" ;
      AV48TFBarNomCli_Sel = "" ;
      AV47TFBarNomCli = "" ;
      AV50TFBarNHdr_Sel = "" ;
      AV49TFBarNHdr = "" ;
      AV55TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV56TFRecAcab_Sel = "" ;
      AV20Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A13696BarNHdr = "" ;
      A6039RecAcab = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = "" ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = "" ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = "" ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = "" ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      lV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      lV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      A130BarCodPar = "" ;
      AV17Proforcod = "" ;
      AV16Emprcod = "" ;
      A396EmprCod = "" ;
      P08IP2_A396EmprCod = new String[] {""} ;
      P08IP2_A1234BarNomCli = new String[] {""} ;
      P08IP2_A136BarColNum = new int[1] ;
      P08IP2_A135BarColNom = new String[] {""} ;
      P08IP2_A1652BarSerDsc = new String[] {""} ;
      P08IP2_A212BarSer = new String[] {""} ;
      P08IP2_A279CliNom = new String[] {""} ;
      P08IP2_A252CliCod = new int[1] ;
      P08IP2_n252CliCod = new boolean[] {false} ;
      P08IP2_A130BarCodPar = new String[] {""} ;
      P08IP2_A132BarCodReo = new byte[1] ;
      P08IP2_A129BarCod = new int[1] ;
      AV28UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFRecAcab_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetasexport__default(),
         new Object[] {
             new Object[] {
            P08IP2_A396EmprCod, P08IP2_A1234BarNomCli, P08IP2_A136BarColNum, P08IP2_A135BarColNom, P08IP2_A1652BarSerDsc, P08IP2_A212BarSer, P08IP2_A279CliNom, P08IP2_A252CliCod, P08IP2_n252CliCod, P08IP2_A130BarCodPar,
            P08IP2_A132BarCodReo, P08IP2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short GXv_int3[] ;
   private short AV18OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV45TFBarColNum ;
   private int AV46TFBarColNum_To ;
   private int AV60GXV1 ;
   private int AV61GXV2 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ;
   private int AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ;
   private int AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ;
   private int AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ;
   private int AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV81GXV3 ;
   private long AV53i ;
   private long AV32VisibleColumnCount ;
   private String AV38TFCliNom_Sel ;
   private String AV37TFCliNom ;
   private String AV40TFBarSer_Sel ;
   private String AV39TFBarSer ;
   private String AV42TFBarSerDsc_Sel ;
   private String AV41TFBarSerDsc ;
   private String AV44TFBarColNom_Sel ;
   private String AV43TFBarColNom ;
   private String AV48TFBarNomCli_Sel ;
   private String AV47TFBarNomCli ;
   private String AV50TFBarNHdr_Sel ;
   private String AV49TFBarNHdr ;
   private String AV56TFRecAcab_Sel ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13696BarNHdr ;
   private String A6039RecAcab ;
   private String AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ;
   private String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ;
   private String AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ;
   private String AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ;
   private String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ;
   private String scmdbuf ;
   private String lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String lV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String lV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String lV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String A130BarCodPar ;
   private String AV17Proforcod ;
   private String AV16Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV19OrderedDsc ;
   private boolean n252CliCod ;
   private String AV27ColumnsSelectorXML ;
   private String AV28UserCustomValue ;
   private String AV54TFRecAcab_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV57FilterFullText ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private GXSimpleCollection<String> AV55TFRecAcab_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08IP2_A396EmprCod ;
   private String[] P08IP2_A1234BarNomCli ;
   private int[] P08IP2_A136BarColNum ;
   private String[] P08IP2_A135BarColNom ;
   private String[] P08IP2_A1652BarSerDsc ;
   private String[] P08IP2_A212BarSer ;
   private String[] P08IP2_A279CliNom ;
   private int[] P08IP2_A252CliCod ;
   private boolean[] P08IP2_n252CliCod ;
   private String[] P08IP2_A130BarCodPar ;
   private byte[] P08IP2_A132BarCodReo ;
   private int[] P08IP2_A129BarCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV26ColumnsSelector_Column ;
}

final  class wcsituacionprocesoquimicorecetasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV17Proforcod ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 8 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08IP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
      }
   }

}

