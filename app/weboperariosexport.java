package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class weboperariosexport extends GXProcedure
{
   public weboperariosexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( weboperariosexport.class ), "" );
   }

   public weboperariosexport( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      weboperariosexport.this.aP1 = new String[] {""};
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
      weboperariosexport.this.aP0 = aP0;
      weboperariosexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WebOperariosExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55FilterFullText, GXv_char5) ;
      weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV29GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV18DynamicFiltersSelector1 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV18DynamicFiltersSelector1, "OPENOM") == 0 )
         {
            AV19DynamicFiltersOperator1 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV20OpeNom1 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            if ( ! (GXutil.strcmp("", AV20OpeNom1)==0) )
            {
               AV13CellRow = (int)(AV13CellRow+1) ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
               if ( AV19DynamicFiltersOperator1 == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
               }
               else if ( AV19DynamicFiltersOperator1 == 1 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
               }
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV20OpeNom1, GXv_char5) ;
               weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
            }
         }
         if ( AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV21DynamicFiltersEnabled2 = true ;
            AV29GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV22DynamicFiltersSelector2 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "OPENOM") == 0 )
            {
               AV23DynamicFiltersOperator2 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV24OpeNom2 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               if ( ! (GXutil.strcmp("", AV24OpeNom2)==0) )
               {
                  AV13CellRow = (int)(AV13CellRow+1) ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                  if ( AV23DynamicFiltersOperator2 == 0 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
                  }
                  else if ( AV23DynamicFiltersOperator2 == 1 )
                  {
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
                  }
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                  GXt_char4 = "" ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV24OpeNom2, GXv_char5) ;
                  weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
                  AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
               }
            }
            if ( AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV25DynamicFiltersEnabled3 = true ;
               AV29GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV32GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV26DynamicFiltersSelector3 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "OPENOM") == 0 )
               {
                  AV27DynamicFiltersOperator3 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV28OpeNom3 = AV29GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  if ( ! (GXutil.strcmp("", AV28OpeNom3)==0) )
                  {
                     AV13CellRow = (int)(AV13CellRow+1) ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setBold( (short)(1) );
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setColor( 3 );
                     if ( AV27DynamicFiltersOperator3 == 0 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterContains", ""), "", "", "", "", "", "", "") );
                     }
                     else if ( AV27DynamicFiltersOperator3 == 1 )
                     {
                        AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn, 1, 1).setText( GXutil.format( "%1 (%2)", httpContext.getMessage( "Nombre", ""), httpContext.getMessage( "WWP_FilterLike", ""), "", "", "", "", "", "", "") );
                     }
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setItalic( (short)(1) );
                     GXt_char4 = "" ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV28OpeNom3, GXv_char5) ;
                     weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
                     AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
                  }
               }
            }
         }
      }
      if ( ! ( (0==AV45TFOpeCod) && (0==AV46TFOpeCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Operario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV45TFOpeCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV46TFOpeCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV48TFOpeNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV48TFOpeNom_Sel, GXv_char5) ;
         weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV47TFOpeNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFOpeNom, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV50TFOpeNom2_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre II", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV50TFOpeNom2_Sel, GXv_char5) ;
         weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV49TFOpeNom2)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Nombre II", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV49TFOpeNom2, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV52TFOpeAct_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A/I", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFOpeAct_Sel, GXv_char5) ;
         weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV51TFOpeAct)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "A/I", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            weboperariosexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV51TFOpeAct, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV30Session.getValue("WebOperariosColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV30Session.getValue("WebOperariosColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV36ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV60GXV1));
         if ( AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV36ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setColor( 11 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV62Weboperariosds_1_filterfulltext = AV55FilterFullText ;
      AV63Weboperariosds_2_dynamicfiltersselector1 = AV18DynamicFiltersSelector1 ;
      AV64Weboperariosds_3_dynamicfiltersoperator1 = AV19DynamicFiltersOperator1 ;
      AV65Weboperariosds_4_openom1 = AV20OpeNom1 ;
      AV66Weboperariosds_5_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV67Weboperariosds_6_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV68Weboperariosds_7_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV69Weboperariosds_8_openom2 = AV24OpeNom2 ;
      AV70Weboperariosds_9_dynamicfiltersenabled3 = AV25DynamicFiltersEnabled3 ;
      AV71Weboperariosds_10_dynamicfiltersselector3 = AV26DynamicFiltersSelector3 ;
      AV72Weboperariosds_11_dynamicfiltersoperator3 = AV27DynamicFiltersOperator3 ;
      AV73Weboperariosds_12_openom3 = AV28OpeNom3 ;
      AV74Weboperariosds_13_tfopecod = AV45TFOpeCod ;
      AV75Weboperariosds_14_tfopecod_to = AV46TFOpeCod_To ;
      AV76Weboperariosds_15_tfopenom = AV47TFOpeNom ;
      AV77Weboperariosds_16_tfopenom_sel = AV48TFOpeNom_Sel ;
      AV78Weboperariosds_17_tfopenom2 = AV49TFOpeNom2 ;
      AV79Weboperariosds_18_tfopenom2_sel = AV50TFOpeNom2_Sel ;
      AV80Weboperariosds_19_tfopeact = AV51TFOpeAct ;
      AV81Weboperariosds_20_tfopeact_sel = AV52TFOpeAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Weboperariosds_1_filterfulltext ,
                                           AV63Weboperariosds_2_dynamicfiltersselector1 ,
                                           Short.valueOf(AV64Weboperariosds_3_dynamicfiltersoperator1) ,
                                           AV65Weboperariosds_4_openom1 ,
                                           Boolean.valueOf(AV66Weboperariosds_5_dynamicfiltersenabled2) ,
                                           AV67Weboperariosds_6_dynamicfiltersselector2 ,
                                           Short.valueOf(AV68Weboperariosds_7_dynamicfiltersoperator2) ,
                                           AV69Weboperariosds_8_openom2 ,
                                           Boolean.valueOf(AV70Weboperariosds_9_dynamicfiltersenabled3) ,
                                           AV71Weboperariosds_10_dynamicfiltersselector3 ,
                                           Short.valueOf(AV72Weboperariosds_11_dynamicfiltersoperator3) ,
                                           AV73Weboperariosds_12_openom3 ,
                                           Integer.valueOf(AV74Weboperariosds_13_tfopecod) ,
                                           Integer.valueOf(AV75Weboperariosds_14_tfopecod_to) ,
                                           AV77Weboperariosds_16_tfopenom_sel ,
                                           AV76Weboperariosds_15_tfopenom ,
                                           AV79Weboperariosds_18_tfopenom2_sel ,
                                           AV78Weboperariosds_17_tfopenom2 ,
                                           AV81Weboperariosds_20_tfopeact_sel ,
                                           AV80Weboperariosds_19_tfopeact ,
                                           Integer.valueOf(A652OpeCod) ,
                                           A653OpeNom ,
                                           A6869OpeNom2 ,
                                           A8482OpeAct ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV62Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Weboperariosds_1_filterfulltext), "%", "") ;
      lV62Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Weboperariosds_1_filterfulltext), "%", "") ;
      lV62Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Weboperariosds_1_filterfulltext), "%", "") ;
      lV62Weboperariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Weboperariosds_1_filterfulltext), "%", "") ;
      lV65Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_4_openom1), 30, "%") ;
      lV65Weboperariosds_4_openom1 = GXutil.padr( GXutil.rtrim( AV65Weboperariosds_4_openom1), 30, "%") ;
      lV69Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV69Weboperariosds_8_openom2), 30, "%") ;
      lV69Weboperariosds_8_openom2 = GXutil.padr( GXutil.rtrim( AV69Weboperariosds_8_openom2), 30, "%") ;
      lV73Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV73Weboperariosds_12_openom3), 30, "%") ;
      lV73Weboperariosds_12_openom3 = GXutil.padr( GXutil.rtrim( AV73Weboperariosds_12_openom3), 30, "%") ;
      lV76Weboperariosds_15_tfopenom = GXutil.padr( GXutil.rtrim( AV76Weboperariosds_15_tfopenom), 30, "%") ;
      lV78Weboperariosds_17_tfopenom2 = GXutil.padr( GXutil.rtrim( AV78Weboperariosds_17_tfopenom2), 30, "%") ;
      lV80Weboperariosds_19_tfopeact = GXutil.padr( GXutil.rtrim( AV80Weboperariosds_19_tfopeact), 1, "%") ;
      /* Using cursor P08B22 */
      pr_default.execute(0, new Object[] {lV62Weboperariosds_1_filterfulltext, lV62Weboperariosds_1_filterfulltext, lV62Weboperariosds_1_filterfulltext, lV62Weboperariosds_1_filterfulltext, lV65Weboperariosds_4_openom1, lV65Weboperariosds_4_openom1, lV69Weboperariosds_8_openom2, lV69Weboperariosds_8_openom2, lV73Weboperariosds_12_openom3, lV73Weboperariosds_12_openom3, Integer.valueOf(AV74Weboperariosds_13_tfopecod), Integer.valueOf(AV75Weboperariosds_14_tfopecod_to), lV76Weboperariosds_15_tfopenom, AV77Weboperariosds_16_tfopenom_sel, lV78Weboperariosds_17_tfopenom2, AV79Weboperariosds_18_tfopenom2_sel, lV80Weboperariosds_19_tfopeact, AV81Weboperariosds_20_tfopeact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P08B22_A8482OpeAct[0] ;
         n8482OpeAct = P08B22_n8482OpeAct[0] ;
         A6869OpeNom2 = P08B22_A6869OpeNom2[0] ;
         n6869OpeNom2 = P08B22_n6869OpeNom2[0] ;
         A652OpeCod = P08B22_A652OpeCod[0] ;
         A653OpeNom = P08B22_A653OpeNom[0] ;
         n653OpeNom = P08B22_n653OpeNom[0] ;
         A396EmprCod = P08B22_A396EmprCod[0] ;
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
            AV54Seleccion = "N" ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54Seleccion, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setNumber( A652OpeCod );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A653OpeNom, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A6869OpeNom2, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV42VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV42VisibleColumnCount = (long)(AV42VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A8482OpeAct, GXv_char5) ;
            weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccion", "", "", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OpeCod", "", "Operario", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OpeNom", "", "Nombre", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OpeNom2", "", "Nombre II", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "OpeAct", "", "A/I", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV38UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebOperariosColumnsSelector", GXv_char5) ;
      weboperariosexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV30Session.getValue("WebOperariosGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebOperariosGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV30Session.getValue("WebOperariosGridState"), null, null);
      }
      AV16OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV2 = 1 ;
      while ( AV82GXV2 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV2));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPECOD") == 0 )
         {
            AV45TFOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM") == 0 )
         {
            AV47TFOpeNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM_SEL") == 0 )
         {
            AV48TFOpeNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2") == 0 )
         {
            AV49TFOpeNom2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPENOM2_SEL") == 0 )
         {
            AV50TFOpeNom2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT") == 0 )
         {
            AV51TFOpeAct = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOPEACT_SEL") == 0 )
         {
            AV52TFOpeAct_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV82GXV2 = (int)(AV82GXV2+1) ;
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
      this.aP0[0] = weboperariosexport.this.AV11Filename;
      this.aP1[0] = weboperariosexport.this.AV12ErrorMessage;
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
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV18DynamicFiltersSelector1 = "" ;
      AV20OpeNom1 = "" ;
      AV22DynamicFiltersSelector2 = "" ;
      AV24OpeNom2 = "" ;
      AV26DynamicFiltersSelector3 = "" ;
      AV28OpeNom3 = "" ;
      AV48TFOpeNom_Sel = "" ;
      AV47TFOpeNom = "" ;
      AV50TFOpeNom2_Sel = "" ;
      AV49TFOpeNom2 = "" ;
      AV52TFOpeAct_Sel = "" ;
      AV51TFOpeAct = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV30Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV36ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A8482OpeAct = "" ;
      AV62Weboperariosds_1_filterfulltext = "" ;
      AV63Weboperariosds_2_dynamicfiltersselector1 = "" ;
      AV65Weboperariosds_4_openom1 = "" ;
      AV67Weboperariosds_6_dynamicfiltersselector2 = "" ;
      AV69Weboperariosds_8_openom2 = "" ;
      AV71Weboperariosds_10_dynamicfiltersselector3 = "" ;
      AV73Weboperariosds_12_openom3 = "" ;
      AV76Weboperariosds_15_tfopenom = "" ;
      AV77Weboperariosds_16_tfopenom_sel = "" ;
      AV78Weboperariosds_17_tfopenom2 = "" ;
      AV79Weboperariosds_18_tfopenom2_sel = "" ;
      AV80Weboperariosds_19_tfopeact = "" ;
      AV81Weboperariosds_20_tfopeact_sel = "" ;
      scmdbuf = "" ;
      lV62Weboperariosds_1_filterfulltext = "" ;
      lV65Weboperariosds_4_openom1 = "" ;
      lV69Weboperariosds_8_openom2 = "" ;
      lV73Weboperariosds_12_openom3 = "" ;
      lV76Weboperariosds_15_tfopenom = "" ;
      lV78Weboperariosds_17_tfopenom2 = "" ;
      lV80Weboperariosds_19_tfopeact = "" ;
      P08B22_A8482OpeAct = new String[] {""} ;
      P08B22_n8482OpeAct = new boolean[] {false} ;
      P08B22_A6869OpeNom2 = new String[] {""} ;
      P08B22_n6869OpeNom2 = new boolean[] {false} ;
      P08B22_A652OpeCod = new int[1] ;
      P08B22_A653OpeNom = new String[] {""} ;
      P08B22_n653OpeNom = new boolean[] {false} ;
      P08B22_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV54Seleccion = "" ;
      AV38UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.weboperariosexport__default(),
         new Object[] {
             new Object[] {
            P08B22_A8482OpeAct, P08B22_n8482OpeAct, P08B22_A6869OpeNom2, P08B22_n6869OpeNom2, P08B22_A652OpeCod, P08B22_A653OpeNom, P08B22_n653OpeNom, P08B22_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19DynamicFiltersOperator1 ;
   private short AV23DynamicFiltersOperator2 ;
   private short AV27DynamicFiltersOperator3 ;
   private short GXv_int3[] ;
   private short AV64Weboperariosds_3_dynamicfiltersoperator1 ;
   private short AV68Weboperariosds_7_dynamicfiltersoperator2 ;
   private short AV72Weboperariosds_11_dynamicfiltersoperator3 ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV45TFOpeCod ;
   private int AV46TFOpeCod_To ;
   private int AV60GXV1 ;
   private int A652OpeCod ;
   private int AV74Weboperariosds_13_tfopecod ;
   private int AV75Weboperariosds_14_tfopecod_to ;
   private int AV82GXV2 ;
   private long AV42VisibleColumnCount ;
   private String AV20OpeNom1 ;
   private String AV24OpeNom2 ;
   private String AV28OpeNom3 ;
   private String AV48TFOpeNom_Sel ;
   private String AV47TFOpeNom ;
   private String AV50TFOpeNom2_Sel ;
   private String AV49TFOpeNom2 ;
   private String AV52TFOpeAct_Sel ;
   private String AV51TFOpeAct ;
   private String A653OpeNom ;
   private String A6869OpeNom2 ;
   private String A8482OpeAct ;
   private String AV65Weboperariosds_4_openom1 ;
   private String AV69Weboperariosds_8_openom2 ;
   private String AV73Weboperariosds_12_openom3 ;
   private String AV76Weboperariosds_15_tfopenom ;
   private String AV77Weboperariosds_16_tfopenom_sel ;
   private String AV78Weboperariosds_17_tfopenom2 ;
   private String AV79Weboperariosds_18_tfopenom2_sel ;
   private String AV80Weboperariosds_19_tfopeact ;
   private String AV81Weboperariosds_20_tfopeact_sel ;
   private String scmdbuf ;
   private String lV65Weboperariosds_4_openom1 ;
   private String lV69Weboperariosds_8_openom2 ;
   private String lV73Weboperariosds_12_openom3 ;
   private String lV76Weboperariosds_15_tfopenom ;
   private String lV78Weboperariosds_17_tfopenom2 ;
   private String lV80Weboperariosds_19_tfopeact ;
   private String A396EmprCod ;
   private String AV54Seleccion ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV21DynamicFiltersEnabled2 ;
   private boolean AV25DynamicFiltersEnabled3 ;
   private boolean AV66Weboperariosds_5_dynamicfiltersenabled2 ;
   private boolean AV70Weboperariosds_9_dynamicfiltersenabled3 ;
   private boolean AV17OrderedDsc ;
   private boolean n8482OpeAct ;
   private boolean n6869OpeNom2 ;
   private boolean n653OpeNom ;
   private String AV37ColumnsSelectorXML ;
   private String AV38UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV55FilterFullText ;
   private String AV18DynamicFiltersSelector1 ;
   private String AV22DynamicFiltersSelector2 ;
   private String AV26DynamicFiltersSelector3 ;
   private String AV62Weboperariosds_1_filterfulltext ;
   private String AV63Weboperariosds_2_dynamicfiltersselector1 ;
   private String AV67Weboperariosds_6_dynamicfiltersselector2 ;
   private String AV71Weboperariosds_10_dynamicfiltersselector3 ;
   private String lV62Weboperariosds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV30Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08B22_A8482OpeAct ;
   private boolean[] P08B22_n8482OpeAct ;
   private String[] P08B22_A6869OpeNom2 ;
   private boolean[] P08B22_n6869OpeNom2 ;
   private int[] P08B22_A652OpeCod ;
   private String[] P08B22_A653OpeNom ;
   private boolean[] P08B22_n653OpeNom ;
   private String[] P08B22_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV29GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV36ColumnsSelector_Column ;
}

final  class weboperariosexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Weboperariosds_1_filterfulltext ,
                                          String AV63Weboperariosds_2_dynamicfiltersselector1 ,
                                          short AV64Weboperariosds_3_dynamicfiltersoperator1 ,
                                          String AV65Weboperariosds_4_openom1 ,
                                          boolean AV66Weboperariosds_5_dynamicfiltersenabled2 ,
                                          String AV67Weboperariosds_6_dynamicfiltersselector2 ,
                                          short AV68Weboperariosds_7_dynamicfiltersoperator2 ,
                                          String AV69Weboperariosds_8_openom2 ,
                                          boolean AV70Weboperariosds_9_dynamicfiltersenabled3 ,
                                          String AV71Weboperariosds_10_dynamicfiltersselector3 ,
                                          short AV72Weboperariosds_11_dynamicfiltersoperator3 ,
                                          String AV73Weboperariosds_12_openom3 ,
                                          int AV74Weboperariosds_13_tfopecod ,
                                          int AV75Weboperariosds_14_tfopecod_to ,
                                          String AV77Weboperariosds_16_tfopenom_sel ,
                                          String AV76Weboperariosds_15_tfopenom ,
                                          String AV79Weboperariosds_18_tfopenom2_sel ,
                                          String AV78Weboperariosds_17_tfopenom2 ,
                                          String AV81Weboperariosds_20_tfopeact_sel ,
                                          String AV80Weboperariosds_19_tfopeact ,
                                          int A652OpeCod ,
                                          String A653OpeNom ,
                                          String A6869OpeNom2 ,
                                          String A8482OpeAct ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT OpeAct, OpeNom2, OpeCod, OpeNom, EmprCod FROM TXPOPERAR" ;
      if ( ! (GXutil.strcmp("", AV62Weboperariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(OpeCod,'999990'), 2) like '%' || ?) or ( UPPER(OpeNom) like '%' || UPPER(?)) or ( UPPER(OpeNom2) like '%' || UPPER(?)) or ( UPPER(OpeAct) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV63Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_3_dynamicfiltersoperator1 == 0 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV63Weboperariosds_2_dynamicfiltersselector1, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV64Weboperariosds_3_dynamicfiltersoperator1 == 1 ) && ( ! (GXutil.strcmp("", AV65Weboperariosds_4_openom1)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV66Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV67Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV68Weboperariosds_7_dynamicfiltersoperator2 == 0 ) && ( ! (GXutil.strcmp("", AV69Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( AV66Weboperariosds_5_dynamicfiltersenabled2 && ( GXutil.strcmp(AV67Weboperariosds_6_dynamicfiltersselector2, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV68Weboperariosds_7_dynamicfiltersoperator2 == 1 ) && ( ! (GXutil.strcmp("", AV69Weboperariosds_8_openom2)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV70Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV71Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV72Weboperariosds_11_dynamicfiltersoperator3 == 0 ) && ( ! (GXutil.strcmp("", AV73Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like '%' || ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( AV70Weboperariosds_9_dynamicfiltersenabled3 && ( GXutil.strcmp(AV71Weboperariosds_10_dynamicfiltersselector3, httpContext.getMessage( "OPENOM", "")) == 0 ) && ( AV72Weboperariosds_11_dynamicfiltersoperator3 == 1 ) && ( ! (GXutil.strcmp("", AV73Weboperariosds_12_openom3)==0) ) )
      {
         addWhere(sWhereString, "(OpeNom like ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV74Weboperariosds_13_tfopecod) )
      {
         addWhere(sWhereString, "(OpeCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV75Weboperariosds_14_tfopecod_to) )
      {
         addWhere(sWhereString, "(OpeCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Weboperariosds_16_tfopenom_sel)==0) && ( ! (GXutil.strcmp("", AV76Weboperariosds_15_tfopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Weboperariosds_16_tfopenom_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Weboperariosds_18_tfopenom2_sel)==0) && ( ! (GXutil.strcmp("", AV78Weboperariosds_17_tfopenom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Weboperariosds_18_tfopenom2_sel)==0) )
      {
         addWhere(sWhereString, "(OpeNom2 = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Weboperariosds_20_tfopeact_sel)==0) && ( ! (GXutil.strcmp("", AV80Weboperariosds_19_tfopeact)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(OpeAct) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Weboperariosds_20_tfopeact_sel)==0) )
      {
         addWhere(sWhereString, "(OpeAct = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeNom2" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeNom2 DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY OpeAct" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY OpeAct DESC" ;
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
                  return conditional_P08B22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , ((Boolean) dynConstraints[8]).booleanValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

