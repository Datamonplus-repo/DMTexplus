package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tobsforwwexport extends GXProcedure
{
   public tobsforwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tobsforwwexport.class ), "" );
   }

   public tobsforwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tobsforwwexport.this.aP1 = new String[] {""};
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
      tobsforwwexport.this.aP0 = aP0;
      tobsforwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TOBSFORWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV34TFCliCod) && (0==AV35TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV34TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV35TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV37TFForSer_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Articulo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFForSer_Sel, GXv_char5) ;
         tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFForSer)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Articulo", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFForSer, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFForColNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFForColNom_Sel, GXv_char5) ;
         tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFForColNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Color", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFForColNom, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV40TFForColNum) && (0==AV41TFForColNum_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Numero", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV40TFForColNum );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV41TFForColNum_To );
      }
      if ( ! ( (0==AV42TFTipColCod) && (0==AV43TFTipColCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFTipColCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFTipColCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV45TFForCurva_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Imagen Curva", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV45TFForCurva_Sel, GXv_char5) ;
         tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV44TFForCurva)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Imagen Curva", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tobsforwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV44TFForCurva, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TOBSFORWWColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.TOBSFORWWColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV49GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV51Formulaciontinte_tobsforwwds_1_filterfulltext = AV18FilterFullText ;
      AV52Formulaciontinte_tobsforwwds_2_tfclicod = AV34TFCliCod ;
      AV53Formulaciontinte_tobsforwwds_3_tfclicod_to = AV35TFCliCod_To ;
      AV54Formulaciontinte_tobsforwwds_4_tfforser = AV36TFForSer ;
      AV55Formulaciontinte_tobsforwwds_5_tfforser_sel = AV37TFForSer_Sel ;
      AV56Formulaciontinte_tobsforwwds_6_tfforcolnom = AV38TFForColNom ;
      AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = AV39TFForColNom_Sel ;
      AV58Formulaciontinte_tobsforwwds_8_tfforcolnum = AV40TFForColNum ;
      AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to = AV41TFForColNum_To ;
      AV60Formulaciontinte_tobsforwwds_10_tftipcolcod = AV42TFTipColCod ;
      AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to = AV43TFTipColCod_To ;
      AV62Formulaciontinte_tobsforwwds_12_tfforcurva = AV44TFForCurva ;
      AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel = AV45TFForCurva_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                           Integer.valueOf(AV52Formulaciontinte_tobsforwwds_2_tfclicod) ,
                                           Integer.valueOf(AV53Formulaciontinte_tobsforwwds_3_tfclicod_to) ,
                                           AV55Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                           AV54Formulaciontinte_tobsforwwds_4_tfforser ,
                                           AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                           AV56Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                           Integer.valueOf(AV58Formulaciontinte_tobsforwwds_8_tfforcolnum) ,
                                           Integer.valueOf(AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to) ,
                                           Byte.valueOf(AV60Formulaciontinte_tobsforwwds_10_tftipcolcod) ,
                                           Byte.valueOf(AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to) ,
                                           AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                           AV62Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A12200ForCurva ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Formulaciontinte_tobsforwwds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_tobsforwwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_tobsforwwds_4_tfforser), 16, "%") ;
      lV56Formulaciontinte_tobsforwwds_6_tfforcolnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_tobsforwwds_6_tfforcolnom), 13, "%") ;
      lV62Formulaciontinte_tobsforwwds_12_tfforcurva = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_tobsforwwds_12_tfforcurva), 128, "%") ;
      /* Using cursor P08KP2 */
      pr_default.execute(0, new Object[] {lV51Formulaciontinte_tobsforwwds_1_filterfulltext, lV51Formulaciontinte_tobsforwwds_1_filterfulltext, lV51Formulaciontinte_tobsforwwds_1_filterfulltext, lV51Formulaciontinte_tobsforwwds_1_filterfulltext, lV51Formulaciontinte_tobsforwwds_1_filterfulltext, lV51Formulaciontinte_tobsforwwds_1_filterfulltext, Integer.valueOf(AV52Formulaciontinte_tobsforwwds_2_tfclicod), Integer.valueOf(AV53Formulaciontinte_tobsforwwds_3_tfclicod_to), lV54Formulaciontinte_tobsforwwds_4_tfforser, AV55Formulaciontinte_tobsforwwds_5_tfforser_sel, lV56Formulaciontinte_tobsforwwds_6_tfforcolnom, AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel, Integer.valueOf(AV58Formulaciontinte_tobsforwwds_8_tfforcolnum), Integer.valueOf(AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to), Byte.valueOf(AV60Formulaciontinte_tobsforwwds_10_tftipcolcod), Byte.valueOf(AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to), lV62Formulaciontinte_tobsforwwds_12_tfforcurva, AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12200ForCurva = P08KP2_A12200ForCurva[0] ;
         n12200ForCurva = P08KP2_n12200ForCurva[0] ;
         A831TipColCod = P08KP2_A831TipColCod[0] ;
         A483ForColNum = P08KP2_A483ForColNum[0] ;
         A482ForColNom = P08KP2_A482ForColNom[0] ;
         A494ForSer = P08KP2_A494ForSer[0] ;
         A252CliCod = P08KP2_A252CliCod[0] ;
         A651ObsUltLin = P08KP2_A651ObsUltLin[0] ;
         n651ObsUltLin = P08KP2_n651ObsUltLin[0] ;
         A396EmprCod = P08KP2_A396EmprCod[0] ;
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
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A494ForSer, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A482ForColNom, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A483ForColNum );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A831TipColCod );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A12200ForCurva, GXv_char5) ;
            tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForSer", "", "Codigo Articulo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForColNom", "", "Color", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForColNum", "", "Numero", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColCod", "", "Codigo", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ForCurva", "", "Imagen Curva", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TOBSFORWWColumnsSelector", GXv_char5) ;
      tobsforwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TOBSFORWWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("FormulacionTinte.TOBSFORWWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV64GXV2 = 1 ;
      while ( AV64GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV36TFForSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV37TFForSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV38TFForColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV39TFForColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV40TFForColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFForColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV42TFTipColCod = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFTipColCod_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA") == 0 )
         {
            AV44TFForCurva = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCURVA_SEL") == 0 )
         {
            AV45TFForCurva_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV64GXV2 = (int)(AV64GXV2+1) ;
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
      this.aP0[0] = tobsforwwexport.this.AV11Filename;
      this.aP1[0] = tobsforwwexport.this.AV12ErrorMessage;
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
      AV37TFForSer_Sel = "" ;
      AV36TFForSer = "" ;
      AV39TFForColNom_Sel = "" ;
      AV38TFForColNom = "" ;
      AV45TFForCurva_Sel = "" ;
      AV44TFForCurva = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A12200ForCurva = "" ;
      AV51Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      AV54Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      AV55Formulaciontinte_tobsforwwds_5_tfforser_sel = "" ;
      AV56Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel = "" ;
      AV62Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel = "" ;
      scmdbuf = "" ;
      lV51Formulaciontinte_tobsforwwds_1_filterfulltext = "" ;
      lV54Formulaciontinte_tobsforwwds_4_tfforser = "" ;
      lV56Formulaciontinte_tobsforwwds_6_tfforcolnom = "" ;
      lV62Formulaciontinte_tobsforwwds_12_tfforcurva = "" ;
      P08KP2_A12200ForCurva = new String[] {""} ;
      P08KP2_n12200ForCurva = new boolean[] {false} ;
      P08KP2_A831TipColCod = new byte[1] ;
      P08KP2_A483ForColNum = new int[1] ;
      P08KP2_A482ForColNom = new String[] {""} ;
      P08KP2_A494ForSer = new String[] {""} ;
      P08KP2_A252CliCod = new int[1] ;
      P08KP2_A651ObsUltLin = new short[1] ;
      P08KP2_n651ObsUltLin = new boolean[] {false} ;
      P08KP2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tobsforwwexport__default(),
         new Object[] {
             new Object[] {
            P08KP2_A12200ForCurva, P08KP2_n12200ForCurva, P08KP2_A831TipColCod, P08KP2_A483ForColNum, P08KP2_A482ForColNom, P08KP2_A494ForSer, P08KP2_A252CliCod, P08KP2_A651ObsUltLin, P08KP2_n651ObsUltLin, P08KP2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42TFTipColCod ;
   private byte AV43TFTipColCod_To ;
   private byte A831TipColCod ;
   private byte AV60Formulaciontinte_tobsforwwds_10_tftipcolcod ;
   private byte AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short A651ObsUltLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV40TFForColNum ;
   private int AV41TFForColNum_To ;
   private int AV49GXV1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV52Formulaciontinte_tobsforwwds_2_tfclicod ;
   private int AV53Formulaciontinte_tobsforwwds_3_tfclicod_to ;
   private int AV58Formulaciontinte_tobsforwwds_8_tfforcolnum ;
   private int AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to ;
   private int AV64GXV2 ;
   private long AV31VisibleColumnCount ;
   private String AV37TFForSer_Sel ;
   private String AV36TFForSer ;
   private String AV39TFForColNom_Sel ;
   private String AV38TFForColNom ;
   private String AV45TFForCurva_Sel ;
   private String AV44TFForCurva ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A12200ForCurva ;
   private String AV54Formulaciontinte_tobsforwwds_4_tfforser ;
   private String AV55Formulaciontinte_tobsforwwds_5_tfforser_sel ;
   private String AV56Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ;
   private String AV62Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_tobsforwwds_4_tfforser ;
   private String lV56Formulaciontinte_tobsforwwds_6_tfforcolnom ;
   private String lV62Formulaciontinte_tobsforwwds_12_tfforcurva ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n12200ForCurva ;
   private boolean n651ObsUltLin ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV51Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private String lV51Formulaciontinte_tobsforwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08KP2_A12200ForCurva ;
   private boolean[] P08KP2_n12200ForCurva ;
   private byte[] P08KP2_A831TipColCod ;
   private int[] P08KP2_A483ForColNum ;
   private String[] P08KP2_A482ForColNom ;
   private String[] P08KP2_A494ForSer ;
   private int[] P08KP2_A252CliCod ;
   private short[] P08KP2_A651ObsUltLin ;
   private boolean[] P08KP2_n651ObsUltLin ;
   private String[] P08KP2_A396EmprCod ;
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

final  class tobsforwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08KP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Formulaciontinte_tobsforwwds_1_filterfulltext ,
                                          int AV52Formulaciontinte_tobsforwwds_2_tfclicod ,
                                          int AV53Formulaciontinte_tobsforwwds_3_tfclicod_to ,
                                          String AV55Formulaciontinte_tobsforwwds_5_tfforser_sel ,
                                          String AV54Formulaciontinte_tobsforwwds_4_tfforser ,
                                          String AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel ,
                                          String AV56Formulaciontinte_tobsforwwds_6_tfforcolnom ,
                                          int AV58Formulaciontinte_tobsforwwds_8_tfforcolnum ,
                                          int AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to ,
                                          byte AV60Formulaciontinte_tobsforwwds_10_tftipcolcod ,
                                          byte AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to ,
                                          String AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel ,
                                          String AV62Formulaciontinte_tobsforwwds_12_tfforcurva ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A12200ForCurva ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT ForCurva, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ObsUltLin, EmprCod FROM TXPCFORMU" ;
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_tobsforwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(ForSer) like '%' || UPPER(?)) or ( UPPER(ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TipColCod,'90'), 2) like '%' || ?) or ( UPPER(ForCurva) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_tobsforwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_tobsforwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_tobsforwwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_tobsforwwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_tobsforwwds_6_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_tobsforwwds_7_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_tobsforwwds_8_tfforcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_tobsforwwds_9_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_tobsforwwds_10_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_tobsforwwds_11_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_tobsforwwds_12_tfforcurva)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForCurva) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_tobsforwwds_13_tfforcurva_sel)==0) )
      {
         addWhere(sWhereString, "(ForCurva = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY ObsUltLin" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForSer" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForColNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForColNum" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColCod" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY ForCurva" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ForCurva DESC" ;
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
                  return conditional_P08KP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08KP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 128);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 128);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 128);
               }
               return;
      }
   }

}

