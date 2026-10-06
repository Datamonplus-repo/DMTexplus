package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tintenswwexport extends GXProcedure
{
   public tintenswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tintenswwexport.class ), "" );
   }

   public tintenswwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tintenswwexport.this.aP1 = new String[] {""};
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
      tintenswwexport.this.aP0 = aP0;
      tintenswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TINTENSWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38FilterFullText, GXv_char5) ;
      tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV33TFIntCod) && (0==AV34TFIntCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV33TFIntCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV34TFIntCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV36TFIntDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFIntDsc_Sel, GXv_char5) ;
         tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV35TFIntDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Intensidad", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV35TFIntDsc, GXv_char5) ;
            tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV45TFIntAct_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Activa?", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         if ( GXutil.strcmp(AV45TFIntAct_Sel, httpContext.getMessage( "S", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSChecked", "") );
         }
         else if ( GXutil.strcmp(AV45TFIntAct_Sel, httpContext.getMessage( "N", "")) == 0 )
         {
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( httpContext.getMessage( "WWP_TSUnChecked", "") );
         }
      }
      if ( ! ( (0==AV41TFIntOrder) && (0==AV42TFIntOrder_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Orden", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV41TFIntOrder );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV42TFIntOrder_To );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFIntLava)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFIntLava_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Tiempo de Lavado(hh,mm)", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV43TFIntLava)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tintenswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFIntLava_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.TINTENSWWColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("FormulacionTinte.TINTENSWWColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV48GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV50Formulaciontinte_tintenswwds_1_filterfulltext = AV38FilterFullText ;
      AV51Formulaciontinte_tintenswwds_2_tfintcod = AV33TFIntCod ;
      AV52Formulaciontinte_tintenswwds_3_tfintcod_to = AV34TFIntCod_To ;
      AV53Formulaciontinte_tintenswwds_4_tfintdsc = AV35TFIntDsc ;
      AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel = AV36TFIntDsc_Sel ;
      AV55Formulaciontinte_tintenswwds_6_tfintact_sel = AV45TFIntAct_Sel ;
      AV56Formulaciontinte_tintenswwds_7_tfintorder = AV41TFIntOrder ;
      AV57Formulaciontinte_tintenswwds_8_tfintorder_to = AV42TFIntOrder_To ;
      AV58Formulaciontinte_tintenswwds_9_tfintlava = AV43TFIntLava ;
      AV59Formulaciontinte_tintenswwds_10_tfintlava_to = AV44TFIntLava_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Formulaciontinte_tintenswwds_1_filterfulltext ,
                                           Byte.valueOf(AV51Formulaciontinte_tintenswwds_2_tfintcod) ,
                                           Byte.valueOf(AV52Formulaciontinte_tintenswwds_3_tfintcod_to) ,
                                           AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                           AV53Formulaciontinte_tintenswwds_4_tfintdsc ,
                                           AV55Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                           Short.valueOf(AV56Formulaciontinte_tintenswwds_7_tfintorder) ,
                                           Short.valueOf(AV57Formulaciontinte_tintenswwds_8_tfintorder_to) ,
                                           AV58Formulaciontinte_tintenswwds_9_tfintlava ,
                                           AV59Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Short.valueOf(A13296IntOrder) ,
                                           A5991IntLava ,
                                           A14255IntAct ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV50Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_tintenswwds_4_tfintdsc = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_tintenswwds_4_tfintdsc), 30, "%") ;
      /* Using cursor P08H22 */
      pr_default.execute(0, new Object[] {lV50Formulaciontinte_tintenswwds_1_filterfulltext, lV50Formulaciontinte_tintenswwds_1_filterfulltext, lV50Formulaciontinte_tintenswwds_1_filterfulltext, lV50Formulaciontinte_tintenswwds_1_filterfulltext, Byte.valueOf(AV51Formulaciontinte_tintenswwds_2_tfintcod), Byte.valueOf(AV52Formulaciontinte_tintenswwds_3_tfintcod_to), lV53Formulaciontinte_tintenswwds_4_tfintdsc, AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel, AV55Formulaciontinte_tintenswwds_6_tfintact_sel, Short.valueOf(AV56Formulaciontinte_tintenswwds_7_tfintorder), Short.valueOf(AV57Formulaciontinte_tintenswwds_8_tfintorder_to), AV58Formulaciontinte_tintenswwds_9_tfintlava, AV59Formulaciontinte_tintenswwds_10_tfintlava_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5991IntLava = P08H22_A5991IntLava[0] ;
         n5991IntLava = P08H22_n5991IntLava[0] ;
         A13296IntOrder = P08H22_A13296IntOrder[0] ;
         n13296IntOrder = P08H22_n13296IntOrder[0] ;
         A14255IntAct = P08H22_A14255IntAct[0] ;
         A584IntDsc = P08H22_A584IntDsc[0] ;
         n584IntDsc = P08H22_n584IntDsc[0] ;
         A583IntCod = P08H22_A583IntCod[0] ;
         A396EmprCod = P08H22_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A583IntCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A584IntDsc, GXv_char5) ;
            tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14255IntAct, GXv_char5) ;
            tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A13296IntOrder );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A5991IntLava)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IntCod", "", "Codigo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IntDsc", "", "Intensidad", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IntAct", "", "Activa?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IntOrder", "", "Orden", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "IntLava", "", "Tiempo de Lavado(hh,mm)", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV26UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TINTENSWWColumnsSelector", GXv_char5) ;
      tintenswwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV18Session.getValue("FormulacionTinte.TINTENSWWGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      AV16OrderedBy = AV20GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV20GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV2 = 1 ;
      while ( AV60GXV2 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV2));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV33TFIntCod = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFIntCod_To = (byte)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV35TFIntDsc = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV36TFIntDsc_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV45TFIntAct_Sel = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTORDER") == 0 )
         {
            AV41TFIntOrder = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFIntOrder_To = (short)(GXutil.lval( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTLAVA") == 0 )
         {
            AV43TFIntLava = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFIntLava_To = CommonUtil.decimalVal( AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV60GXV2 = (int)(AV60GXV2+1) ;
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
      this.aP0[0] = tintenswwexport.this.AV11Filename;
      this.aP1[0] = tintenswwexport.this.AV12ErrorMessage;
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
      AV38FilterFullText = "" ;
      AV36TFIntDsc_Sel = "" ;
      AV35TFIntDsc = "" ;
      AV45TFIntAct_Sel = "" ;
      AV43TFIntLava = DecimalUtil.ZERO ;
      AV44TFIntLava_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A584IntDsc = "" ;
      A14255IntAct = "" ;
      A5991IntLava = DecimalUtil.ZERO ;
      AV50Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      AV53Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel = "" ;
      AV55Formulaciontinte_tintenswwds_6_tfintact_sel = "" ;
      AV58Formulaciontinte_tintenswwds_9_tfintlava = DecimalUtil.ZERO ;
      AV59Formulaciontinte_tintenswwds_10_tfintlava_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV50Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      lV53Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      P08H22_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08H22_n5991IntLava = new boolean[] {false} ;
      P08H22_A13296IntOrder = new short[1] ;
      P08H22_n13296IntOrder = new boolean[] {false} ;
      P08H22_A14255IntAct = new String[] {""} ;
      P08H22_A584IntDsc = new String[] {""} ;
      P08H22_n584IntDsc = new boolean[] {false} ;
      P08H22_A583IntCod = new byte[1] ;
      P08H22_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV26UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintenswwexport__default(),
         new Object[] {
             new Object[] {
            P08H22_A5991IntLava, P08H22_n5991IntLava, P08H22_A13296IntOrder, P08H22_n13296IntOrder, P08H22_A14255IntAct, P08H22_A584IntDsc, P08H22_n584IntDsc, P08H22_A583IntCod, P08H22_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33TFIntCod ;
   private byte AV34TFIntCod_To ;
   private byte A583IntCod ;
   private byte AV51Formulaciontinte_tintenswwds_2_tfintcod ;
   private byte AV52Formulaciontinte_tintenswwds_3_tfintcod_to ;
   private short AV41TFIntOrder ;
   private short AV42TFIntOrder_To ;
   private short GXv_int3[] ;
   private short A13296IntOrder ;
   private short AV56Formulaciontinte_tintenswwds_7_tfintorder ;
   private short AV57Formulaciontinte_tintenswwds_8_tfintorder_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV48GXV1 ;
   private int AV60GXV2 ;
   private long AV30VisibleColumnCount ;
   private java.math.BigDecimal AV43TFIntLava ;
   private java.math.BigDecimal AV44TFIntLava_To ;
   private java.math.BigDecimal A5991IntLava ;
   private java.math.BigDecimal AV58Formulaciontinte_tintenswwds_9_tfintlava ;
   private java.math.BigDecimal AV59Formulaciontinte_tintenswwds_10_tfintlava_to ;
   private String AV36TFIntDsc_Sel ;
   private String AV35TFIntDsc ;
   private String AV45TFIntAct_Sel ;
   private String A584IntDsc ;
   private String A14255IntAct ;
   private String AV53Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel ;
   private String AV55Formulaciontinte_tintenswwds_6_tfintact_sel ;
   private String scmdbuf ;
   private String lV53Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5991IntLava ;
   private boolean n13296IntOrder ;
   private boolean n584IntDsc ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV38FilterFullText ;
   private String AV50Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String lV50Formulaciontinte_tintenswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08H22_A5991IntLava ;
   private boolean[] P08H22_n5991IntLava ;
   private short[] P08H22_A13296IntOrder ;
   private boolean[] P08H22_n13296IntOrder ;
   private String[] P08H22_A14255IntAct ;
   private String[] P08H22_A584IntDsc ;
   private boolean[] P08H22_n584IntDsc ;
   private byte[] P08H22_A583IntCod ;
   private String[] P08H22_A396EmprCod ;
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

final  class tintenswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Formulaciontinte_tintenswwds_1_filterfulltext ,
                                          byte AV51Formulaciontinte_tintenswwds_2_tfintcod ,
                                          byte AV52Formulaciontinte_tintenswwds_3_tfintcod_to ,
                                          String AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                          String AV53Formulaciontinte_tintenswwds_4_tfintdsc ,
                                          String AV55Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                          short AV56Formulaciontinte_tintenswwds_7_tfintorder ,
                                          short AV57Formulaciontinte_tintenswwds_8_tfintorder_to ,
                                          java.math.BigDecimal AV58Formulaciontinte_tintenswwds_9_tfintlava ,
                                          java.math.BigDecimal AV59Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          short A13296IntOrder ,
                                          java.math.BigDecimal A5991IntLava ,
                                          String A14255IntAct ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT IntLava, IntOrder, IntAct, IntDsc, IntCod, EmprCod FROM TXPINTENS" ;
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_tintenswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(IntCod,'90'), 2) like '%' || ?) or ( UPPER(IntDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(IntOrder,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(IntLava,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_tintenswwds_2_tfintcod) )
      {
         addWhere(sWhereString, "(IntCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_tintenswwds_3_tfintcod_to) )
      {
         addWhere(sWhereString, "(IntCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_tintenswwds_4_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(IntDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_tintenswwds_6_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(IntAct = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_tintenswwds_7_tfintorder) )
      {
         addWhere(sWhereString, "(IntOrder >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_tintenswwds_8_tfintorder_to) )
      {
         addWhere(sWhereString, "(IntOrder <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_tintenswwds_9_tfintlava)==0) )
      {
         addWhere(sWhereString, "(IntLava >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Formulaciontinte_tintenswwds_10_tfintlava_to)==0) )
      {
         addWhere(sWhereString, "(IntLava <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY IntCod" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY IntDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY IntAct" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntAct DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY IntOrder" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntOrder DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY IntLava" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntLava DESC" ;
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
                  return conditional_P08H22(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               return;
      }
   }

}

