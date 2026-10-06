package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclimatwwexport extends GXProcedure
{
   public tclimatwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimatwwexport.class ), "" );
   }

   public tclimatwwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tclimatwwexport.this.aP1 = new String[] {""};
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
      tclimatwwexport.this.aP0 = aP0;
      tclimatwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TCLIMATWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53FilterFullText, GXv_char5) ;
      tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV45TFCliCod) && (0==AV46TFCliCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFCliCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFCliCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFCliNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFCliNom_Sel, GXv_char5) ;
         tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFCliNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre Cliente", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFCliNom, GXv_char5) ;
            tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFCliColAb_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Sigla", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFCliColAb_Sel, GXv_char5) ;
         tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFCliColAb)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Sigla", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tclimatwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFCliColAb, GXv_char5) ;
            tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV42VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV30Session.getValue("FormulacionTinte.TCLIMATWWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("FormulacionTinte.TCLIMATWWColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV56GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Formulaciontinte_tclimatwwds_1_filterfulltext = AV53FilterFullText ;
      AV59Formulaciontinte_tclimatwwds_2_tfclicod = AV45TFCliCod ;
      AV60Formulaciontinte_tclimatwwds_3_tfclicod_to = AV46TFCliCod_To ;
      AV61Formulaciontinte_tclimatwwds_4_tfclinom = AV47TFCliNom ;
      AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel = AV48TFCliNom_Sel ;
      AV63Formulaciontinte_tclimatwwds_6_tfclicolab = AV49TFCliColAb ;
      AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel = AV50TFCliColAb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                           Integer.valueOf(AV59Formulaciontinte_tclimatwwds_2_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_tclimatwwds_3_tfclicod_to) ,
                                           AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                           AV61Formulaciontinte_tclimatwwds_4_tfclinom ,
                                           AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                           AV63Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A13237CliColAb ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV58Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_tclimatwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_tclimatwwds_4_tfclinom), 30, "%") ;
      lV63Formulaciontinte_tclimatwwds_6_tfclicolab = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_tclimatwwds_6_tfclicolab), 3, "%") ;
      /* Using cursor P08HE2 */
      pr_default.execute(0, new Object[] {lV58Formulaciontinte_tclimatwwds_1_filterfulltext, lV58Formulaciontinte_tclimatwwds_1_filterfulltext, lV58Formulaciontinte_tclimatwwds_1_filterfulltext, Integer.valueOf(AV59Formulaciontinte_tclimatwwds_2_tfclicod), Integer.valueOf(AV60Formulaciontinte_tclimatwwds_3_tfclicod_to), lV61Formulaciontinte_tclimatwwds_4_tfclinom, AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel, lV63Formulaciontinte_tclimatwwds_6_tfclicolab, AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13237CliColAb = P08HE2_A13237CliColAb[0] ;
         n13237CliColAb = P08HE2_n13237CliColAb[0] ;
         A279CliNom = P08HE2_A279CliNom[0] ;
         A252CliCod = P08HE2_A252CliCod[0] ;
         A396EmprCod = P08HE2_A396EmprCod[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV42VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13237CliColAb, GXv_char5) ;
            tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
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
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliColAb", "", "Sigla", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TCLIMATWWColumnsSelector", GXv_char5) ;
      tclimatwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV38UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV30Session.getValue("FormulacionTinte.TCLIMATWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TCLIMATWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("FormulacionTinte.TCLIMATWWGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV65GXV2 = 1 ;
      while ( AV65GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV53FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV45TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOLAB") == 0 )
         {
            AV49TFCliColAb = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOLAB_SEL") == 0 )
         {
            AV50TFCliColAb_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV2 = (int)(AV65GXV2+1) ;
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
      this.aP0[0] = tclimatwwexport.this.AV11Filename;
      this.aP1[0] = tclimatwwexport.this.AV12ErrorMessage;
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
      AV53FilterFullText = "" ;
      AV48TFCliNom_Sel = "" ;
      AV47TFCliNom = "" ;
      AV50TFCliColAb_Sel = "" ;
      AV49TFCliColAb = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A279CliNom = "" ;
      A13237CliColAb = "" ;
      AV58Formulaciontinte_tclimatwwds_1_filterfulltext = "" ;
      AV61Formulaciontinte_tclimatwwds_4_tfclinom = "" ;
      AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel = "" ;
      AV63Formulaciontinte_tclimatwwds_6_tfclicolab = "" ;
      AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel = "" ;
      scmdbuf = "" ;
      lV58Formulaciontinte_tclimatwwds_1_filterfulltext = "" ;
      lV61Formulaciontinte_tclimatwwds_4_tfclinom = "" ;
      lV63Formulaciontinte_tclimatwwds_6_tfclicolab = "" ;
      P08HE2_A13237CliColAb = new String[] {""} ;
      P08HE2_n13237CliColAb = new boolean[] {false} ;
      P08HE2_A279CliNom = new String[] {""} ;
      P08HE2_A252CliCod = new int[1] ;
      P08HE2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tclimatwwexport__default(),
         new Object[] {
             new Object[] {
            P08HE2_A13237CliColAb, P08HE2_n13237CliColAb, P08HE2_A279CliNom, P08HE2_A252CliCod, P08HE2_A396EmprCod
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
   private int AV45TFCliCod ;
   private int AV46TFCliCod_To ;
   private int AV56GXV1 ;
   private int A252CliCod ;
   private int AV59Formulaciontinte_tclimatwwds_2_tfclicod ;
   private int AV60Formulaciontinte_tclimatwwds_3_tfclicod_to ;
   private int AV65GXV2 ;
   private long AV42VisibleColumnCount ;
   private String AV48TFCliNom_Sel ;
   private String AV47TFCliNom ;
   private String AV50TFCliColAb_Sel ;
   private String AV49TFCliColAb ;
   private String A279CliNom ;
   private String A13237CliColAb ;
   private String AV61Formulaciontinte_tclimatwwds_4_tfclinom ;
   private String AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel ;
   private String AV63Formulaciontinte_tclimatwwds_6_tfclicolab ;
   private String AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel ;
   private String scmdbuf ;
   private String lV61Formulaciontinte_tclimatwwds_4_tfclinom ;
   private String lV63Formulaciontinte_tclimatwwds_6_tfclicolab ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13237CliColAb ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV53FilterFullText ;
   private String AV58Formulaciontinte_tclimatwwds_1_filterfulltext ;
   private String lV58Formulaciontinte_tclimatwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HE2_A13237CliColAb ;
   private boolean[] P08HE2_n13237CliColAb ;
   private String[] P08HE2_A279CliNom ;
   private int[] P08HE2_A252CliCod ;
   private String[] P08HE2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class tclimatwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                          int AV59Formulaciontinte_tclimatwwds_2_tfclicod ,
                                          int AV60Formulaciontinte_tclimatwwds_3_tfclicod_to ,
                                          String AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                          String AV61Formulaciontinte_tclimatwwds_4_tfclinom ,
                                          String AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                          String AV63Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A13237CliColAb ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[9];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT CliColAb, CliNom, CliCod, EmprCod FROM TXPCLIENT" ;
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_tclimatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(CliNom) like '%' || UPPER(?)) or ( UPPER(CliColAb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_tclimatwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_tclimatwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_tclimatwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_tclimatwwds_6_tfclicolab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliColAb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) )
      {
         addWhere(sWhereString, "(CliColAb = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY CliNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliNom DESC" ;
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
         scmdbuf += " ORDER BY CliColAb" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliColAb DESC" ;
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
                  return conditional_P08HE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               return;
      }
   }

}

