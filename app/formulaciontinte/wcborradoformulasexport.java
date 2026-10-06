package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcborradoformulasexport extends GXProcedure
{
   public wcborradoformulasexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcborradoformulasexport.class ), "" );
   }

   public wcborradoformulasexport( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcborradoformulasexport.this.aP1 = new String[] {""};
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
      wcborradoformulasexport.this.aP0 = aP0;
      wcborradoformulasexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCBorradoFormulasExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66FilterFullText, GXv_char5) ;
      wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV33TFCliCod) && (0==AV34TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV36TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFCliNom_Sel, GXv_char5) ;
         wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFCliNom, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV38TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFForSer_Sel, GXv_char5) ;
         wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV37TFForSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFForSer, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFForSerDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFForSerDsc_Sel, GXv_char5) ;
         wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV39TFForSerDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFForSerDsc, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFForColNom_Sel, GXv_char5) ;
         wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFForColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFForColNom, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV43TFForColNum) && (0==AV44TFForColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV43TFForColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV44TFForColNum_To );
      }
      if ( ! ( (0==AV45TFTipColCod) && (0==AV46TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFTipColDsc_Sel, GXv_char5) ;
         wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFTipColDsc, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV49TFForNumCol) && (0==AV50TFForNumCol_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Interno", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFForNumCol );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFForNumCol_To );
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51TFForUltUti)) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fec Ult Uti", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcborradoformulasexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_dtime6 = GXutil.resetTime( AV51TFForUltUti );
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( GXt_dtime6 );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("FormulacionTinte.WCBorradoFormulasColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV69GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = AV66FilterFullText ;
      AV72Formulaciontinte_wcborradoformulasds_2_tfclicod = AV33TFCliCod ;
      AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to = AV34TFCliCod_To ;
      AV74Formulaciontinte_wcborradoformulasds_4_tfclinom = AV35TFCliNom ;
      AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = AV36TFCliNom_Sel ;
      AV76Formulaciontinte_wcborradoformulasds_6_tfforser = AV37TFForSer ;
      AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel = AV38TFForSer_Sel ;
      AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc = AV39TFForSerDsc ;
      AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = AV40TFForSerDsc_Sel ;
      AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom = AV41TFForColNom ;
      AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = AV42TFForColNom_Sel ;
      AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum = AV43TFForColNum ;
      AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to = AV44TFForColNum_To ;
      AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod = AV45TFTipColCod ;
      AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to = AV46TFTipColCod_To ;
      AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = AV47TFTipColDsc ;
      AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol = AV49TFForNumCol ;
      AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to = AV50TFForNumCol_To ;
      AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti = AV51TFForUltUti ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                           Integer.valueOf(AV72Formulaciontinte_wcborradoformulasds_2_tfclicod) ,
                                           Integer.valueOf(AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to) ,
                                           AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                           AV74Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                           AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                           AV76Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                           AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                           AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                           AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                           AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod) ,
                                           Byte.valueOf(AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) ,
                                           AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                           AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                           Integer.valueOf(AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol) ,
                                           Integer.valueOf(AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) ,
                                           AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV57Forser_to ,
                                           AV59Forcolnom_to ,
                                           Integer.valueOf(AV61Forcolnum_to) ,
                                           Byte.valueOf(AV63TipColCod_to) ,
                                           AV65ForUltUti ,
                                           AV64Emprcod ,
                                           Integer.valueOf(AV54Clicod) ,
                                           AV56Forser ,
                                           AV58Forcolnom ,
                                           Integer.valueOf(AV60Forcolnum) ,
                                           Byte.valueOf(AV62TipColCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV55Clicod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext), "%", "") ;
      lV74Formulaciontinte_wcborradoformulasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcborradoformulasds_4_tfclinom), 30, "%") ;
      lV76Formulaciontinte_wcborradoformulasds_6_tfforser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_wcborradoformulasds_6_tfforser), 16, "%") ;
      lV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc), 26, "%") ;
      lV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom), 13, "%") ;
      lV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08KW2 */
      pr_default.execute(0, new Object[] {AV64Emprcod, Integer.valueOf(AV54Clicod), AV56Forser, AV58Forcolnom, Integer.valueOf(AV60Forcolnum), Byte.valueOf(AV62TipColCod), AV57Forser_to, AV59Forcolnom_to, Integer.valueOf(AV61Forcolnum_to), Byte.valueOf(AV63TipColCod_to), AV65ForUltUti, AV65ForUltUti, Integer.valueOf(AV55Clicod_to), lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext, Integer.valueOf(AV72Formulaciontinte_wcborradoformulasds_2_tfclicod), Integer.valueOf(AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to), lV74Formulaciontinte_wcborradoformulasds_4_tfclinom, AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel, lV76Formulaciontinte_wcborradoformulasds_6_tfforser, AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel, lV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc, AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel, lV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom, AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel, Integer.valueOf(AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum), Integer.valueOf(AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to), Byte.valueOf(AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod), Byte.valueOf(AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to), lV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc, AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel, Integer.valueOf(AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol), Integer.valueOf(AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to), AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08KW2_A396EmprCod[0] ;
         A496ForUltUti = P08KW2_A496ForUltUti[0] ;
         n496ForUltUti = P08KW2_n496ForUltUti[0] ;
         A486ForNumCol = P08KW2_A486ForNumCol[0] ;
         A832TipColDsc = P08KW2_A832TipColDsc[0] ;
         n832TipColDsc = P08KW2_n832TipColDsc[0] ;
         A831TipColCod = P08KW2_A831TipColCod[0] ;
         A483ForColNum = P08KW2_A483ForColNum[0] ;
         A482ForColNom = P08KW2_A482ForColNom[0] ;
         A5742ForSerDsc = P08KW2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08KW2_n5742ForSerDsc[0] ;
         A494ForSer = P08KW2_A494ForSer[0] ;
         A279CliNom = P08KW2_A279CliNom[0] ;
         A252CliCod = P08KW2_A252CliCod[0] ;
         A832TipColDsc = P08KW2_A832TipColDsc[0] ;
         n832TipColDsc = P08KW2_n832TipColDsc[0] ;
         A279CliNom = P08KW2_A279CliNom[0] ;
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
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5742ForSerDsc, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char5) ;
            wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A486ForNumCol );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A496ForUltUti );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSer", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForSerDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForColNum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColCod", "", "Tc", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipColDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForNumCol", "", "Nº Interno", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ForUltUti", "", "Fec Ult Uti", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCBorradoFormulasColumnsSelector", GXv_char5) ;
      wcborradoformulasexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("FormulacionTinte.WCBorradoFormulasGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV91GXV2 = 1 ;
      while ( AV91GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV66FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV33TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV35TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV36TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV37TFForSer = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV38TFForSer_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV39TFForSerDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV40TFForSerDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV41TFForColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV42TFForColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV43TFForColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFForColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV45TFTipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFTipColCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV47TFTipColDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV48TFTipColDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV49TFForNumCol = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFForNumCol_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV51TFForUltUti = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV64Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV54Clicod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV55Clicod_to = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV56Forser = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV57Forser_to = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV58Forcolnom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV59Forcolnom_to = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV60Forcolnum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV61Forcolnum_to = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV62TipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV63TipColCod_to = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV65ForUltUti = localUtil.ctod( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV91GXV2 = (int)(AV91GXV2+1) ;
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
      this.aP0[0] = wcborradoformulasexport.this.AV11Filename;
      this.aP1[0] = wcborradoformulasexport.this.AV12ErrorMessage;
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
      AV66FilterFullText = "" ;
      AV36TFCliNom_Sel = "" ;
      AV35TFCliNom = "" ;
      AV38TFForSer_Sel = "" ;
      AV37TFForSer = "" ;
      AV40TFForSerDsc_Sel = "" ;
      AV39TFForSerDsc = "" ;
      AV42TFForColNom_Sel = "" ;
      AV41TFForColNom = "" ;
      AV48TFTipColDsc_Sel = "" ;
      AV47TFTipColDsc = "" ;
      AV51TFForUltUti = GXutil.nullDate() ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      AV74Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel = "" ;
      AV76Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel = "" ;
      AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel = "" ;
      AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel = "" ;
      AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel = "" ;
      AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext = "" ;
      lV74Formulaciontinte_wcborradoformulasds_4_tfclinom = "" ;
      lV76Formulaciontinte_wcborradoformulasds_6_tfforser = "" ;
      lV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc = "" ;
      lV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom = "" ;
      lV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc = "" ;
      AV57Forser_to = "" ;
      AV59Forcolnom_to = "" ;
      AV65ForUltUti = GXutil.nullDate() ;
      AV64Emprcod = "" ;
      AV56Forser = "" ;
      AV58Forcolnom = "" ;
      A396EmprCod = "" ;
      P08KW2_A396EmprCod = new String[] {""} ;
      P08KW2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P08KW2_n496ForUltUti = new boolean[] {false} ;
      P08KW2_A486ForNumCol = new int[1] ;
      P08KW2_A832TipColDsc = new String[] {""} ;
      P08KW2_n832TipColDsc = new boolean[] {false} ;
      P08KW2_A831TipColCod = new byte[1] ;
      P08KW2_A483ForColNum = new int[1] ;
      P08KW2_A482ForColNom = new String[] {""} ;
      P08KW2_A5742ForSerDsc = new String[] {""} ;
      P08KW2_n5742ForSerDsc = new boolean[] {false} ;
      P08KW2_A494ForSer = new String[] {""} ;
      P08KW2_A279CliNom = new String[] {""} ;
      P08KW2_A252CliCod = new int[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcborradoformulasexport__default(),
         new Object[] {
             new Object[] {
            P08KW2_A396EmprCod, P08KW2_A496ForUltUti, P08KW2_n496ForUltUti, P08KW2_A486ForNumCol, P08KW2_A832TipColDsc, P08KW2_n832TipColDsc, P08KW2_A831TipColCod, P08KW2_A483ForColNum, P08KW2_A482ForColNom, P08KW2_A5742ForSerDsc,
            P08KW2_n5742ForSerDsc, P08KW2_A494ForSer, P08KW2_A279CliNom, P08KW2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45TFTipColCod ;
   private byte AV46TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod ;
   private byte AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ;
   private byte AV63TipColCod_to ;
   private byte AV62TipColCod ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV33TFCliCod ;
   private int AV34TFCliCod_To ;
   private int AV43TFForColNum ;
   private int AV44TFForColNum_To ;
   private int AV49TFForNumCol ;
   private int AV50TFForNumCol_To ;
   private int AV69GXV1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV72Formulaciontinte_wcborradoformulasds_2_tfclicod ;
   private int AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to ;
   private int AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum ;
   private int AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ;
   private int AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol ;
   private int AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ;
   private int AV61Forcolnum_to ;
   private int AV54Clicod ;
   private int AV60Forcolnum ;
   private int AV55Clicod_to ;
   private int AV91GXV2 ;
   private long AV30VisibleColumnCount ;
   private String AV36TFCliNom_Sel ;
   private String AV35TFCliNom ;
   private String AV38TFForSer_Sel ;
   private String AV37TFForSer ;
   private String AV40TFForSerDsc_Sel ;
   private String AV39TFForSerDsc ;
   private String AV42TFForColNom_Sel ;
   private String AV41TFForColNom ;
   private String AV48TFTipColDsc_Sel ;
   private String AV47TFTipColDsc ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String AV74Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ;
   private String AV76Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel ;
   private String AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ;
   private String AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ;
   private String AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV74Formulaciontinte_wcborradoformulasds_4_tfclinom ;
   private String lV76Formulaciontinte_wcborradoformulasds_6_tfforser ;
   private String lV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc ;
   private String lV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom ;
   private String lV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ;
   private String AV57Forser_to ;
   private String AV59Forcolnom_to ;
   private String AV64Emprcod ;
   private String AV56Forser ;
   private String AV58Forcolnom ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV51TFForUltUti ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti ;
   private java.util.Date AV65ForUltUti ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n496ForUltUti ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV66FilterFullText ;
   private String AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private String lV71Formulaciontinte_wcborradoformulasds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08KW2_A396EmprCod ;
   private java.util.Date[] P08KW2_A496ForUltUti ;
   private boolean[] P08KW2_n496ForUltUti ;
   private int[] P08KW2_A486ForNumCol ;
   private String[] P08KW2_A832TipColDsc ;
   private boolean[] P08KW2_n832TipColDsc ;
   private byte[] P08KW2_A831TipColCod ;
   private int[] P08KW2_A483ForColNum ;
   private String[] P08KW2_A482ForColNom ;
   private String[] P08KW2_A5742ForSerDsc ;
   private boolean[] P08KW2_n5742ForSerDsc ;
   private String[] P08KW2_A494ForSer ;
   private String[] P08KW2_A279CliNom ;
   private int[] P08KW2_A252CliCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class wcborradoformulasexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext ,
                                          int AV72Formulaciontinte_wcborradoformulasds_2_tfclicod ,
                                          int AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to ,
                                          String AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel ,
                                          String AV74Formulaciontinte_wcborradoformulasds_4_tfclinom ,
                                          String AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel ,
                                          String AV76Formulaciontinte_wcborradoformulasds_6_tfforser ,
                                          String AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel ,
                                          String AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc ,
                                          String AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel ,
                                          String AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom ,
                                          int AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum ,
                                          int AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to ,
                                          byte AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod ,
                                          byte AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to ,
                                          String AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel ,
                                          String AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc ,
                                          int AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol ,
                                          int AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to ,
                                          java.util.Date AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.util.Date A496ForUltUti ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV57Forser_to ,
                                          String AV59Forcolnom_to ,
                                          int AV61Forcolnum_to ,
                                          byte AV63TipColCod_to ,
                                          java.util.Date AV65ForUltUti ,
                                          String AV64Emprcod ,
                                          int AV54Clicod ,
                                          String AV56Forser ,
                                          String AV58Forcolnom ,
                                          int AV60Forcolnum ,
                                          byte AV62TipColCod ,
                                          String A396EmprCod ,
                                          int AV55Clicod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[41];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForUltUti, T1.ForNumCol, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod FROM ((TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod >= ? and T1.ForSer >= ? and T1.ForColNom >= ? and T1.ForColNum >= ? and T1.TipColCod >= ?)");
      addWhere(sWhereString, "(T1.ForSer <= ?)");
      addWhere(sWhereString, "(T1.ForColNom <= ?)");
      addWhere(sWhereString, "(T1.ForColNum <= ?)");
      addWhere(sWhereString, "(T1.TipColCod <= ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_wcborradoformulasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?))");
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
      }
      if ( ! (0==AV72Formulaciontinte_wcborradoformulasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_wcborradoformulasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcborradoformulasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcborradoformulasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcborradoformulasds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcborradoformulasds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcborradoformulasds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcborradoformulasds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcborradoformulasds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_wcborradoformulasds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcborradoformulasds_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_wcborradoformulasds_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_wcborradoformulasds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_wcborradoformulasds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcborradoformulasds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_wcborradoformulasds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_wcborradoformulasds_18_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_wcborradoformulasds_19_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Formulaciontinte_wcborradoformulasds_20_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
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
                  return conditional_P08KW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[81]);
               }
               return;
      }
   }

}

