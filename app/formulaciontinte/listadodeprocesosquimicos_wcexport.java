package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprocesosquimicos_wcexport extends GXProcedure
{
   public listadodeprocesosquimicos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprocesosquimicos_wcexport.class ), "" );
   }

   public listadodeprocesosquimicos_wcexport( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      listadodeprocesosquimicos_wcexport.this.aP1 = new String[] {""};
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
      listadodeprocesosquimicos_wcexport.this.aP0 = aP0;
      listadodeprocesosquimicos_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProcesosQuimicos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV35TFProForCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFProForCod_Sel, GXv_char5) ;
         listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV34TFProForCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Proceso", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV34TFProForCod, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV37TFProForDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFProForDsc_Sel, GXv_char5) ;
         listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFProForDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFProForDsc, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV48TFProForMat_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Materia", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFProForMat_Sel, GXv_char5) ;
         listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFProForMat)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Materia", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFProForMat, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV45TFProForTie) && (0==AV46TFProForTie_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFProForTie );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFProForTie_To );
      }
      if ( ! ( (0==AV53TFProForTmx) && (0==AV54TFProForTmx_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Temp.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV53TFProForTmx );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV54TFProForTmx_To );
      }
      if ( ! ( (0==AV49TFProNumPro) && (0==AV50TFProNumPro_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Prog.", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV49TFProNumPro );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV50TFProNumPro_To );
      }
      if ( ! ( (0==AV51TFProNumRec) && (0==AV52TFProNumRec_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nº Receta", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFProNumRec );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         listadodeprocesosquimicos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFProNumRec_To );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV31VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV57GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV34TFProForCod ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV35TFProForCod_Sel ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV36TFProForDsc ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV37TFProForDsc_Sel ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV47TFProForMat ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV48TFProForMat_Sel ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV45TFProForTie ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV46TFProForTie_To ;
      AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV53TFProForTmx ;
      AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV54TFProForTmx_To ;
      AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV49TFProNumPro ;
      AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV50TFProNumPro_To ;
      AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV51TFProNumRec ;
      AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV52TFProNumRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV40Proforcodfrom ,
                                           AV41Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A13133ProForAct ,
                                           AV44Proforact ,
                                           AV39Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09EA2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, AV44Proforact, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV40Proforcodfrom, AV41Proforcodto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P09EA2_A13133ProForAct[0] ;
         A396EmprCod = P09EA2_A396EmprCod[0] ;
         A2393ProNumRec = P09EA2_A2393ProNumRec[0] ;
         A2392ProNumPro = P09EA2_A2392ProNumPro[0] ;
         A772ProForTmx = P09EA2_A772ProForTmx[0] ;
         A771ProForTie = P09EA2_A771ProForTie[0] ;
         A769ProForMat = P09EA2_A769ProForMat[0] ;
         A766ProForDsc = P09EA2_A766ProForDsc[0] ;
         A764ProForCod = P09EA2_A764ProForCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A764ProForCod, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A766ProForDsc, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A769ProForMat, GXv_char5) ;
            listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A771ProForTie );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A772ProForTmx );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2392ProNumPro );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2393ProNumRec );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
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
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForCod", "", "Proceso", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForDsc", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForMat", "", "Materia", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForTie", "", "Tiempo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProForTmx", "", "Temp.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProNumPro", "", "Nº Prog.", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ProNumRec", "", "Nº Receta", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector", GXv_char5) ;
      listadodeprocesosquimicos_wcexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV2 = 1 ;
      while ( AV74GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV34TFProForCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV35TFProForCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV36TFProForDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV37TFProForDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT") == 0 )
         {
            AV47TFProForMat = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT_SEL") == 0 )
         {
            AV48TFProForMat_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV45TFProForTie = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFProForTie_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV53TFProForTmx = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFProForTmx_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMPRO") == 0 )
         {
            AV49TFProNumPro = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFProNumPro_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMREC") == 0 )
         {
            AV51TFProNumRec = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFProNumRec_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IMPCOD") == 0 )
         {
            AV42Impcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODFROM") == 0 )
         {
            AV40Proforcodfrom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODTO") == 0 )
         {
            AV41Proforcodto = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORABS") == 0 )
         {
            AV43ProforAbs = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORACT") == 0 )
         {
            AV44Proforact = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV2 = (int)(AV74GXV2+1) ;
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
      this.aP0[0] = listadodeprocesosquimicos_wcexport.this.AV11Filename;
      this.aP1[0] = listadodeprocesosquimicos_wcexport.this.AV12ErrorMessage;
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
      AV35TFProForCod_Sel = "" ;
      AV34TFProForCod = "" ;
      AV37TFProForDsc_Sel = "" ;
      AV36TFProForDsc = "" ;
      AV48TFProForMat_Sel = "" ;
      AV47TFProForMat = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A769ProForMat = "" ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = "" ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = "" ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = "" ;
      scmdbuf = "" ;
      lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV40Proforcodfrom = "" ;
      AV41Proforcodto = "" ;
      A13133ProForAct = "" ;
      AV44Proforact = "" ;
      AV39Emprcod = "" ;
      A396EmprCod = "" ;
      P09EA2_A13133ProForAct = new String[] {""} ;
      P09EA2_A396EmprCod = new String[] {""} ;
      P09EA2_A2393ProNumRec = new int[1] ;
      P09EA2_A2392ProNumPro = new int[1] ;
      P09EA2_A772ProForTmx = new short[1] ;
      P09EA2_A771ProForTie = new short[1] ;
      P09EA2_A769ProForMat = new String[] {""} ;
      P09EA2_A766ProForDsc = new String[] {""} ;
      P09EA2_A764ProForCod = new String[] {""} ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42Impcod = "" ;
      AV43ProforAbs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeprocesosquimicos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09EA2_A13133ProForAct, P09EA2_A396EmprCod, P09EA2_A2393ProNumRec, P09EA2_A2392ProNumPro, P09EA2_A772ProForTmx, P09EA2_A771ProForTie, P09EA2_A769ProForMat, P09EA2_A766ProForDsc, P09EA2_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV45TFProForTie ;
   private short AV46TFProForTie_To ;
   private short AV53TFProForTmx ;
   private short AV54TFProForTmx_To ;
   private short GXv_int3[] ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ;
   private short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ;
   private short AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ;
   private short AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV49TFProNumPro ;
   private int AV50TFProNumPro_To ;
   private int AV51TFProNumRec ;
   private int AV52TFProNumRec_To ;
   private int AV57GXV1 ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ;
   private int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ;
   private int AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ;
   private int AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ;
   private int AV74GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV43ProforAbs ;
   private String AV35TFProForCod_Sel ;
   private String AV34TFProForCod ;
   private String AV37TFProForDsc_Sel ;
   private String AV36TFProForDsc ;
   private String AV48TFProForMat_Sel ;
   private String AV47TFProForMat ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A769ProForMat ;
   private String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ;
   private String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ;
   private String AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ;
   private String scmdbuf ;
   private String lV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String lV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String lV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV40Proforcodfrom ;
   private String AV41Proforcodto ;
   private String A13133ProForAct ;
   private String AV44Proforact ;
   private String AV39Emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String AV42Impcod ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String lV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EA2_A13133ProForAct ;
   private String[] P09EA2_A396EmprCod ;
   private int[] P09EA2_A2393ProNumRec ;
   private int[] P09EA2_A2392ProNumPro ;
   private short[] P09EA2_A772ProForTmx ;
   private short[] P09EA2_A771ProForTie ;
   private String[] P09EA2_A769ProForMat ;
   private String[] P09EA2_A766ProForDsc ;
   private String[] P09EA2_A764ProForCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV25ColumnsSelector_Column ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeprocesosquimicos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV40Proforcodfrom ,
                                          String AV41Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A13133ProForAct ,
                                          String AV44Proforact ,
                                          String AV39Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[25];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ProForAct, EmprCod, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForMat, ProForDsc, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
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
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForMat" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForMat DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTie" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTie DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTmx" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTmx DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumPro" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumPro DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumRec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumRec DESC" ;
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
                  return conditional_P09EA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
      }
   }

}

