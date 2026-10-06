package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipmaqwwexport extends GXProcedure
{
   public ttipmaqwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipmaqwwexport.class ), "" );
   }

   public ttipmaqwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ttipmaqwwexport.this.aP1 = new String[] {""};
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
      ttipmaqwwexport.this.aP0 = aP0;
      ttipmaqwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TTIPMAQWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55FilterFullText, GXv_char5) ;
      ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV49TFTipMaqCod_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Máquina", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFTipMaqCod_Sel, GXv_char5) ;
         ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV48TFTipMaqCod)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tipo de Máquina", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFTipMaqCod, GXv_char5) ;
            ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV51TFTipMaqDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFTipMaqDsc_Sel, GXv_char5) ;
         ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV50TFTipMaqDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripción", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFTipMaqDsc, GXv_char5) ;
            ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFTipMaqC24)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFTipMaqC24_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Carga por 24 Horas", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV52TFTipMaqC24)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         ttipmaqwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53TFTipMaqC24_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("FicherosBasicos.TTIPMAQWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("FicherosBasicos.TTIPMAQWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV58GXV1));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = AV55FilterFullText ;
      AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = AV48TFTipMaqCod ;
      AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
      AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = AV52TFTipMaqC24 ;
      AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = AV53TFTipMaqC24_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                           AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                           AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                           AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                           AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                           AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                           AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           A12447TipMaqC24 ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod), 4, "%") ;
      lV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc), 30, "%") ;
      /* Using cursor P080C2 */
      pr_default.execute(0, new Object[] {lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod, AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel, lV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc, AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel, AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24, AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12447TipMaqC24 = P080C2_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P080C2_n12447TipMaqC24[0] ;
         A1012TipMaqDsc = P080C2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P080C2_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P080C2_A1011TipMaqCod[0] ;
         A396EmprCod = P080C2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV45VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1011TipMaqCod, GXv_char5) ;
            ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1012TipMaqDsc, GXv_char5) ;
            ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A12447TipMaqC24)) );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
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
      AV37ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqCod", "", "Tipo de Máquina", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqDsc", "", "Descripción", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipMaqC24", "", "Carga por 24 Horas", false, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TTIPMAQWWColumnsSelector", GXv_char5) ;
      ttipmaqwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV41UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV41UserCustomValue)==0) ) )
      {
         AV38ColumnsSelectorAux.fromxml(AV41UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV38ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV37ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV38ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV37ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV2 = 1 ;
      while ( AV67GXV2 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV2));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV48TFTipMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV49TFTipMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV50TFTipMaqDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV51TFTipMaqDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQC24") == 0 )
         {
            AV52TFTipMaqC24 = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFTipMaqC24_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV67GXV2 = (int)(AV67GXV2+1) ;
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
      this.aP0[0] = ttipmaqwwexport.this.AV11Filename;
      this.aP1[0] = ttipmaqwwexport.this.AV12ErrorMessage;
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
      AV49TFTipMaqCod_Sel = "" ;
      AV48TFTipMaqCod = "" ;
      AV51TFTipMaqDsc_Sel = "" ;
      AV50TFTipMaqDsc = "" ;
      AV52TFTipMaqC24 = DecimalUtil.ZERO ;
      AV53TFTipMaqC24_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      A12447TipMaqC24 = DecimalUtil.ZERO ;
      AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = "" ;
      AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = "" ;
      AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = DecimalUtil.ZERO ;
      AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      lV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      lV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      P080C2_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080C2_n12447TipMaqC24 = new boolean[] {false} ;
      P080C2_A1012TipMaqDsc = new String[] {""} ;
      P080C2_n1012TipMaqDsc = new boolean[] {false} ;
      P080C2_A1011TipMaqCod = new String[] {""} ;
      P080C2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipmaqwwexport__default(),
         new Object[] {
             new Object[] {
            P080C2_A12447TipMaqC24, P080C2_n12447TipMaqC24, P080C2_A1012TipMaqDsc, P080C2_n1012TipMaqDsc, P080C2_A1011TipMaqCod, P080C2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV58GXV1 ;
   private int AV67GXV2 ;
   private long AV45VisibleColumnCount ;
   private java.math.BigDecimal AV52TFTipMaqC24 ;
   private java.math.BigDecimal AV53TFTipMaqC24_To ;
   private java.math.BigDecimal A12447TipMaqC24 ;
   private java.math.BigDecimal AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ;
   private java.math.BigDecimal AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ;
   private String AV49TFTipMaqCod_Sel ;
   private String AV48TFTipMaqCod ;
   private String AV51TFTipMaqDsc_Sel ;
   private String AV50TFTipMaqDsc ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private String AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ;
   private String AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String lV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n12447TipMaqC24 ;
   private boolean n1012TipMaqDsc ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV55FilterFullText ;
   private String AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String lV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P080C2_A12447TipMaqC24 ;
   private boolean[] P080C2_n12447TipMaqC24 ;
   private String[] P080C2_A1012TipMaqDsc ;
   private boolean[] P080C2_n1012TipMaqDsc ;
   private String[] P080C2_A1011TipMaqCod ;
   private String[] P080C2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV38ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV39ColumnsSelector_Column ;
}

final  class ttipmaqwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                          String AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                          String AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                          String AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                          String AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                          java.math.BigDecimal AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                          java.math.BigDecimal AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          java.math.BigDecimal A12447TipMaqC24 ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[9];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TipMaqC24, TipMaqDsc, TipMaqCod, EmprCod FROM TXPTIPMAQ" ;
      if ( ! (GXutil.strcmp("", AV60Ficherosbasicos_ttipmaqwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMaqCod) like '%' || UPPER(?)) or ( UPPER(TipMaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipMaqC24,'9999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV61Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqCod = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqDsc = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipMaqC24" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipMaqC24 DESC" ;
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
                  return conditional_P080C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

