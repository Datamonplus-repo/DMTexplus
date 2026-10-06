package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrelacionensayosexport extends GXProcedure
{
   public wcrelacionensayosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrelacionensayosexport.class ), "" );
   }

   public wcrelacionensayosexport( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wcrelacionensayosexport.this.aP1 = new String[] {""};
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
      wcrelacionensayosexport.this.aP0 = aP0;
      wcrelacionensayosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCRelacionEnsayosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55FilterFullText, GXv_char5) ;
      wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV33TFLb_numero) && (0==AV34TFLb_numero_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Ensayo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFLb_numero );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFLb_numero_To );
      }
      if ( ! ( (0==AV35TFCliCod) && (0==AV36TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV35TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV36TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV38TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFCliNom_Sel, GXv_char5) ;
         wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
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
            wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFCliNom, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV40TFLb_ArtCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40TFLb_ArtCod_Sel, GXv_char5) ;
         wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
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
            wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFLb_ArtCod, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV42TFLb_ArtDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFLb_ArtDsc_Sel, GXv_char5) ;
         wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV41TFLb_ArtDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV41TFLb_ArtDsc, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV44TFLb_ColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFLb_ColNom_Sel, GXv_char5) ;
         wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV43TFLb_ColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFLb_ColNom, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFLb_ColNum) && (0==AV46TFLb_ColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFLb_ColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFLb_ColNum_To );
      }
      if ( ! ( (0==AV47TFTipColCod) && (0==AV48TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tc", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV47TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV48TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV50TFTipColDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFTipColDsc_Sel, GXv_char5) ;
         wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFTipColDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            wcrelacionensayosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFTipColDsc, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("WCRelacionEnsayosColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("WCRelacionEnsayosColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Wcrelacionensayosds_1_filterfulltext = AV55FilterFullText ;
      AV61Wcrelacionensayosds_2_tflb_numero = AV33TFLb_numero ;
      AV62Wcrelacionensayosds_3_tflb_numero_to = AV34TFLb_numero_To ;
      AV63Wcrelacionensayosds_4_tfclicod = AV35TFCliCod ;
      AV64Wcrelacionensayosds_5_tfclicod_to = AV36TFCliCod_To ;
      AV65Wcrelacionensayosds_6_tfclinom = AV37TFCliNom ;
      AV66Wcrelacionensayosds_7_tfclinom_sel = AV38TFCliNom_Sel ;
      AV67Wcrelacionensayosds_8_tflb_artcod = AV39TFLb_ArtCod ;
      AV68Wcrelacionensayosds_9_tflb_artcod_sel = AV40TFLb_ArtCod_Sel ;
      AV69Wcrelacionensayosds_10_tflb_artdsc = AV41TFLb_ArtDsc ;
      AV70Wcrelacionensayosds_11_tflb_artdsc_sel = AV42TFLb_ArtDsc_Sel ;
      AV71Wcrelacionensayosds_12_tflb_colnom = AV43TFLb_ColNom ;
      AV72Wcrelacionensayosds_13_tflb_colnom_sel = AV44TFLb_ColNom_Sel ;
      AV73Wcrelacionensayosds_14_tflb_colnum = AV45TFLb_ColNum ;
      AV74Wcrelacionensayosds_15_tflb_colnum_to = AV46TFLb_ColNum_To ;
      AV75Wcrelacionensayosds_16_tftipcolcod = AV47TFTipColCod ;
      AV76Wcrelacionensayosds_17_tftipcolcod_to = AV48TFTipColCod_To ;
      AV77Wcrelacionensayosds_18_tftipcoldsc = AV49TFTipColDsc ;
      AV78Wcrelacionensayosds_19_tftipcoldsc_sel = AV50TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Wcrelacionensayosds_1_filterfulltext ,
                                           Integer.valueOf(AV61Wcrelacionensayosds_2_tflb_numero) ,
                                           Integer.valueOf(AV62Wcrelacionensayosds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV63Wcrelacionensayosds_4_tfclicod) ,
                                           Integer.valueOf(AV64Wcrelacionensayosds_5_tfclicod_to) ,
                                           AV66Wcrelacionensayosds_7_tfclinom_sel ,
                                           AV65Wcrelacionensayosds_6_tfclinom ,
                                           AV68Wcrelacionensayosds_9_tflb_artcod_sel ,
                                           AV67Wcrelacionensayosds_8_tflb_artcod ,
                                           AV70Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                           AV69Wcrelacionensayosds_10_tflb_artdsc ,
                                           AV72Wcrelacionensayosds_13_tflb_colnom_sel ,
                                           AV71Wcrelacionensayosds_12_tflb_colnom ,
                                           Integer.valueOf(AV73Wcrelacionensayosds_14_tflb_colnum) ,
                                           Integer.valueOf(AV74Wcrelacionensayosds_15_tflb_colnum_to) ,
                                           Byte.valueOf(AV75Wcrelacionensayosds_16_tftipcolcod) ,
                                           Byte.valueOf(AV76Wcrelacionensayosds_17_tftipcolcod_to) ,
                                           AV78Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                           AV77Wcrelacionensayosds_18_tftipcoldsc ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A5533Lb_ArtCod ,
                                           A5534Lb_ArtDsc ,
                                           A5536Lb_ColNom ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV52Emprcod ,
                                           AV53MacProCod ,
                                           A396EmprCod ,
                                           A1514MacProCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV60Wcrelacionensayosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Wcrelacionensayosds_1_filterfulltext), "%", "") ;
      lV65Wcrelacionensayosds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV65Wcrelacionensayosds_6_tfclinom), 30, "%") ;
      lV67Wcrelacionensayosds_8_tflb_artcod = GXutil.padr( GXutil.rtrim( AV67Wcrelacionensayosds_8_tflb_artcod), 16, "%") ;
      lV69Wcrelacionensayosds_10_tflb_artdsc = GXutil.padr( GXutil.rtrim( AV69Wcrelacionensayosds_10_tflb_artdsc), 26, "%") ;
      lV71Wcrelacionensayosds_12_tflb_colnom = GXutil.padr( GXutil.rtrim( AV71Wcrelacionensayosds_12_tflb_colnom), 13, "%") ;
      lV77Wcrelacionensayosds_18_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV77Wcrelacionensayosds_18_tftipcoldsc), 30, "%") ;
      /* Using cursor P08HP2 */
      pr_default.execute(0, new Object[] {AV52Emprcod, AV53MacProCod, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, lV60Wcrelacionensayosds_1_filterfulltext, Integer.valueOf(AV61Wcrelacionensayosds_2_tflb_numero), Integer.valueOf(AV62Wcrelacionensayosds_3_tflb_numero_to), Integer.valueOf(AV63Wcrelacionensayosds_4_tfclicod), Integer.valueOf(AV64Wcrelacionensayosds_5_tfclicod_to), lV65Wcrelacionensayosds_6_tfclinom, AV66Wcrelacionensayosds_7_tfclinom_sel, lV67Wcrelacionensayosds_8_tflb_artcod, AV68Wcrelacionensayosds_9_tflb_artcod_sel, lV69Wcrelacionensayosds_10_tflb_artdsc, AV70Wcrelacionensayosds_11_tflb_artdsc_sel, lV71Wcrelacionensayosds_12_tflb_colnom, AV72Wcrelacionensayosds_13_tflb_colnom_sel, Integer.valueOf(AV73Wcrelacionensayosds_14_tflb_colnum), Integer.valueOf(AV74Wcrelacionensayosds_15_tflb_colnum_to), Byte.valueOf(AV75Wcrelacionensayosds_16_tftipcolcod), Byte.valueOf(AV76Wcrelacionensayosds_17_tftipcolcod_to), lV77Wcrelacionensayosds_18_tftipcoldsc, AV78Wcrelacionensayosds_19_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1514MacProCod = P08HP2_A1514MacProCod[0] ;
         n1514MacProCod = P08HP2_n1514MacProCod[0] ;
         A396EmprCod = P08HP2_A396EmprCod[0] ;
         A832TipColDsc = P08HP2_A832TipColDsc[0] ;
         n832TipColDsc = P08HP2_n832TipColDsc[0] ;
         A831TipColCod = P08HP2_A831TipColCod[0] ;
         n831TipColCod = P08HP2_n831TipColCod[0] ;
         A5537Lb_ColNum = P08HP2_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P08HP2_A5536Lb_ColNom[0] ;
         A5534Lb_ArtDsc = P08HP2_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P08HP2_A5533Lb_ArtCod[0] ;
         A279CliNom = P08HP2_A279CliNom[0] ;
         A252CliCod = P08HP2_A252CliCod[0] ;
         A5532Lb_numero = P08HP2_A5532Lb_numero[0] ;
         A832TipColDsc = P08HP2_A832TipColDsc[0] ;
         n832TipColDsc = P08HP2_n832TipColDsc[0] ;
         A279CliNom = P08HP2_A279CliNom[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A5532Lb_numero );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5533Lb_ArtCod, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5534Lb_ArtDsc, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5536Lb_ColNom, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A5537Lb_ColNum );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A832TipColDsc, GXv_char5) ;
            wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_numero", "", "Nº Ensayo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ArtCod", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ArtDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ColNom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Lb_ColNum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColCod", "", "Tc", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCRelacionEnsayosColumnsSelector", GXv_char5) ;
      wcrelacionensayosexport.this.GXt_char4 = GXv_char5[0] ;
      AV26UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("WCRelacionEnsayosGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRelacionEnsayosGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("WCRelacionEnsayosGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV2 = 1 ;
      while ( AV79GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV33TFLb_numero = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFLb_numero_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFCliCod_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV39TFLb_ArtCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV40TFLb_ArtCod_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC") == 0 )
         {
            AV41TFLb_ArtDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTDSC_SEL") == 0 )
         {
            AV42TFLb_ArtDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM") == 0 )
         {
            AV43TFLb_ColNom = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOM_SEL") == 0 )
         {
            AV44TFLb_ColNom_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV45TFLb_ColNum = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFLb_ColNum_To = (int)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV47TFTipColCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFTipColCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV49TFTipColDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV50TFTipColDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV52Emprcod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPROCOD") == 0 )
         {
            AV53MacProCod = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MACPRODSC") == 0 )
         {
            AV54MacProDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV2 = (int)(AV79GXV2+1) ;
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
      this.aP0[0] = wcrelacionensayosexport.this.AV11Filename;
      this.aP1[0] = wcrelacionensayosexport.this.AV12ErrorMessage;
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
      AV55FilterFullText = "" ;
      AV38TFCliNom_Sel = "" ;
      AV37TFCliNom = "" ;
      AV40TFLb_ArtCod_Sel = "" ;
      AV39TFLb_ArtCod = "" ;
      AV42TFLb_ArtDsc_Sel = "" ;
      AV41TFLb_ArtDsc = "" ;
      AV44TFLb_ColNom_Sel = "" ;
      AV43TFLb_ColNom = "" ;
      AV50TFTipColDsc_Sel = "" ;
      AV49TFTipColDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5536Lb_ColNom = "" ;
      A832TipColDsc = "" ;
      AV60Wcrelacionensayosds_1_filterfulltext = "" ;
      AV65Wcrelacionensayosds_6_tfclinom = "" ;
      AV66Wcrelacionensayosds_7_tfclinom_sel = "" ;
      AV67Wcrelacionensayosds_8_tflb_artcod = "" ;
      AV68Wcrelacionensayosds_9_tflb_artcod_sel = "" ;
      AV69Wcrelacionensayosds_10_tflb_artdsc = "" ;
      AV70Wcrelacionensayosds_11_tflb_artdsc_sel = "" ;
      AV71Wcrelacionensayosds_12_tflb_colnom = "" ;
      AV72Wcrelacionensayosds_13_tflb_colnom_sel = "" ;
      AV77Wcrelacionensayosds_18_tftipcoldsc = "" ;
      AV78Wcrelacionensayosds_19_tftipcoldsc_sel = "" ;
      scmdbuf = "" ;
      lV60Wcrelacionensayosds_1_filterfulltext = "" ;
      lV65Wcrelacionensayosds_6_tfclinom = "" ;
      lV67Wcrelacionensayosds_8_tflb_artcod = "" ;
      lV69Wcrelacionensayosds_10_tflb_artdsc = "" ;
      lV71Wcrelacionensayosds_12_tflb_colnom = "" ;
      lV77Wcrelacionensayosds_18_tftipcoldsc = "" ;
      AV52Emprcod = "" ;
      AV53MacProCod = "" ;
      A396EmprCod = "" ;
      A1514MacProCod = "" ;
      P08HP2_A1514MacProCod = new String[] {""} ;
      P08HP2_n1514MacProCod = new boolean[] {false} ;
      P08HP2_A396EmprCod = new String[] {""} ;
      P08HP2_A832TipColDsc = new String[] {""} ;
      P08HP2_n832TipColDsc = new boolean[] {false} ;
      P08HP2_A831TipColCod = new byte[1] ;
      P08HP2_n831TipColCod = new boolean[] {false} ;
      P08HP2_A5537Lb_ColNum = new int[1] ;
      P08HP2_A5536Lb_ColNom = new String[] {""} ;
      P08HP2_A5534Lb_ArtDsc = new String[] {""} ;
      P08HP2_A5533Lb_ArtCod = new String[] {""} ;
      P08HP2_A279CliNom = new String[] {""} ;
      P08HP2_A252CliCod = new int[1] ;
      P08HP2_A5532Lb_numero = new int[1] ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54MacProDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrelacionensayosexport__default(),
         new Object[] {
             new Object[] {
            P08HP2_A1514MacProCod, P08HP2_n1514MacProCod, P08HP2_A396EmprCod, P08HP2_A832TipColDsc, P08HP2_n832TipColDsc, P08HP2_A831TipColCod, P08HP2_n831TipColCod, P08HP2_A5537Lb_ColNum, P08HP2_A5536Lb_ColNom, P08HP2_A5534Lb_ArtDsc,
            P08HP2_A5533Lb_ArtCod, P08HP2_A279CliNom, P08HP2_A252CliCod, P08HP2_A5532Lb_numero
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV47TFTipColCod ;
   private byte AV48TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV75Wcrelacionensayosds_16_tftipcolcod ;
   private byte AV76Wcrelacionensayosds_17_tftipcolcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV33TFLb_numero ;
   private int AV34TFLb_numero_To ;
   private int AV35TFCliCod ;
   private int AV36TFCliCod_To ;
   private int AV45TFLb_ColNum ;
   private int AV46TFLb_ColNum_To ;
   private int AV58GXV1 ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV61Wcrelacionensayosds_2_tflb_numero ;
   private int AV62Wcrelacionensayosds_3_tflb_numero_to ;
   private int AV63Wcrelacionensayosds_4_tfclicod ;
   private int AV64Wcrelacionensayosds_5_tfclicod_to ;
   private int AV73Wcrelacionensayosds_14_tflb_colnum ;
   private int AV74Wcrelacionensayosds_15_tflb_colnum_to ;
   private int AV79GXV2 ;
   private long AV30VisibleColumnCount ;
   private String AV38TFCliNom_Sel ;
   private String AV37TFCliNom ;
   private String AV40TFLb_ArtCod_Sel ;
   private String AV39TFLb_ArtCod ;
   private String AV42TFLb_ArtDsc_Sel ;
   private String AV41TFLb_ArtDsc ;
   private String AV44TFLb_ColNom_Sel ;
   private String AV43TFLb_ColNom ;
   private String AV50TFTipColDsc_Sel ;
   private String AV49TFTipColDsc ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5536Lb_ColNom ;
   private String A832TipColDsc ;
   private String AV65Wcrelacionensayosds_6_tfclinom ;
   private String AV66Wcrelacionensayosds_7_tfclinom_sel ;
   private String AV67Wcrelacionensayosds_8_tflb_artcod ;
   private String AV68Wcrelacionensayosds_9_tflb_artcod_sel ;
   private String AV69Wcrelacionensayosds_10_tflb_artdsc ;
   private String AV70Wcrelacionensayosds_11_tflb_artdsc_sel ;
   private String AV71Wcrelacionensayosds_12_tflb_colnom ;
   private String AV72Wcrelacionensayosds_13_tflb_colnom_sel ;
   private String AV77Wcrelacionensayosds_18_tftipcoldsc ;
   private String AV78Wcrelacionensayosds_19_tftipcoldsc_sel ;
   private String scmdbuf ;
   private String lV65Wcrelacionensayosds_6_tfclinom ;
   private String lV67Wcrelacionensayosds_8_tflb_artcod ;
   private String lV69Wcrelacionensayosds_10_tflb_artdsc ;
   private String lV71Wcrelacionensayosds_12_tflb_colnom ;
   private String lV77Wcrelacionensayosds_18_tftipcoldsc ;
   private String AV52Emprcod ;
   private String AV53MacProCod ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV54MacProDsc ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n1514MacProCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV55FilterFullText ;
   private String AV60Wcrelacionensayosds_1_filterfulltext ;
   private String lV60Wcrelacionensayosds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HP2_A1514MacProCod ;
   private boolean[] P08HP2_n1514MacProCod ;
   private String[] P08HP2_A396EmprCod ;
   private String[] P08HP2_A832TipColDsc ;
   private boolean[] P08HP2_n832TipColDsc ;
   private byte[] P08HP2_A831TipColCod ;
   private boolean[] P08HP2_n831TipColCod ;
   private int[] P08HP2_A5537Lb_ColNum ;
   private String[] P08HP2_A5536Lb_ColNom ;
   private String[] P08HP2_A5534Lb_ArtDsc ;
   private String[] P08HP2_A5533Lb_ArtCod ;
   private String[] P08HP2_A279CliNom ;
   private int[] P08HP2_A252CliCod ;
   private int[] P08HP2_A5532Lb_numero ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class wcrelacionensayosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Wcrelacionensayosds_1_filterfulltext ,
                                          int AV61Wcrelacionensayosds_2_tflb_numero ,
                                          int AV62Wcrelacionensayosds_3_tflb_numero_to ,
                                          int AV63Wcrelacionensayosds_4_tfclicod ,
                                          int AV64Wcrelacionensayosds_5_tfclicod_to ,
                                          String AV66Wcrelacionensayosds_7_tfclinom_sel ,
                                          String AV65Wcrelacionensayosds_6_tfclinom ,
                                          String AV68Wcrelacionensayosds_9_tflb_artcod_sel ,
                                          String AV67Wcrelacionensayosds_8_tflb_artcod ,
                                          String AV70Wcrelacionensayosds_11_tflb_artdsc_sel ,
                                          String AV69Wcrelacionensayosds_10_tflb_artdsc ,
                                          String AV72Wcrelacionensayosds_13_tflb_colnom_sel ,
                                          String AV71Wcrelacionensayosds_12_tflb_colnom ,
                                          int AV73Wcrelacionensayosds_14_tflb_colnum ,
                                          int AV74Wcrelacionensayosds_15_tflb_colnum_to ,
                                          byte AV75Wcrelacionensayosds_16_tftipcolcod ,
                                          byte AV76Wcrelacionensayosds_17_tftipcolcod_to ,
                                          String AV78Wcrelacionensayosds_19_tftipcoldsc_sel ,
                                          String AV77Wcrelacionensayosds_18_tftipcoldsc ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A5533Lb_ArtCod ,
                                          String A5534Lb_ArtDsc ,
                                          String A5536Lb_ColNom ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV52Emprcod ,
                                          String AV53MacProCod ,
                                          String A396EmprCod ,
                                          String A1514MacProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MacProCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T3.CliNom, T1.CliCod, T1.Lb_numero FROM ((TXPENS001" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MacProCod = ?)");
      if ( ! (GXutil.strcmp("", AV60Wcrelacionensayosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.Lb_ColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
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
      if ( ! (0==AV61Wcrelacionensayosds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Wcrelacionensayosds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcrelacionensayosds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcrelacionensayosds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Wcrelacionensayosds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Wcrelacionensayosds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Wcrelacionensayosds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcrelacionensayosds_9_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcrelacionensayosds_8_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcrelacionensayosds_9_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Wcrelacionensayosds_11_tflb_artdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Wcrelacionensayosds_10_tflb_artdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Wcrelacionensayosds_11_tflb_artdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ArtDsc = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Wcrelacionensayosds_13_tflb_colnom_sel)==0) && ( ! (GXutil.strcmp("", AV71Wcrelacionensayosds_12_tflb_colnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_ColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Wcrelacionensayosds_13_tflb_colnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcrelacionensayosds_14_tflb_colnum) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcrelacionensayosds_15_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T1.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV75Wcrelacionensayosds_16_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcrelacionensayosds_17_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Wcrelacionensayosds_19_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Wcrelacionensayosds_18_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Wcrelacionensayosds_19_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_numero" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_numero DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ArtDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Lb_ColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
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
                  return conditional_P08HP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               return;
      }
   }

}

