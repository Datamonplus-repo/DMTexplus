package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tinditexwwexport extends GXProcedure
{
   public tinditexwwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinditexwwexport.class ), "" );
   }

   public tinditexwwexport( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tinditexwwexport.this.aP1 = new String[] {""};
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
      tinditexwwexport.this.aP0 = aP0;
      tinditexwwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TINDITEXWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV60FilterFullText, GXv_char5) ;
      tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV53TFCod_Idtx_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Id Certificado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFCod_Idtx_Sel, GXv_char5) ;
         tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV52TFCod_Idtx)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Id Certificado", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV52TFCod_Idtx, GXv_char5) ;
            tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV55TFDsc_Idtx_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Certificado", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV55TFDsc_Idtx_Sel, GXv_char5) ;
         tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV54TFDsc_Idtx)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Certificado", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFDsc_Idtx, GXv_char5) ;
            tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( ( AV57TFImp_Idtx_Sels.size() == 0 ) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Imprimir", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tinditexwwexport.this.AV13CellRow = GXv_int3[0] ;
         AV59i = 1 ;
         AV63GXV1 = 1 ;
         while ( AV63GXV1 <= AV57TFImp_Idtx_Sels.size() )
         {
            AV58TFImp_Idtx_Sel = (String)AV57TFImp_Idtx_Sels.elementAt(-1+AV63GXV1) ;
            if ( AV59i == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( "" );
            }
            else
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+", " );
            }
            if ( GXutil.strcmp(GXutil.trim( AV58TFImp_Idtx_Sel), httpContext.getMessage( "N", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "N", "") );
            }
            else if ( GXutil.strcmp(GXutil.trim( AV58TFImp_Idtx_Sel), httpContext.getMessage( "S", "")) == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).getText()+httpContext.getMessage( "S", "") );
            }
            AV59i = (long)(AV59i+1) ;
            AV63GXV1 = (int)(AV63GXV1+1) ;
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV45VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV33Session.getValue("FicherosBasicos.TINDITEXWWColumnsSelector"), "") != 0 )
      {
         AV40ColumnsSelectorXML = AV33Session.getValue("FicherosBasicos.TINDITEXWWColumnsSelector") ;
         AV37ColumnsSelector.fromxml(AV40ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV64GXV2 = 1 ;
      while ( AV64GXV2 <= AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV39ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV64GXV2));
         if ( AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV39ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setColor( 11 );
            AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
         }
         AV64GXV2 = (int)(AV64GXV2+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV66Ficherosbasicos_tinditexwwds_1_filterfulltext = AV60FilterFullText ;
      AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx = AV52TFCod_Idtx ;
      AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = AV53TFCod_Idtx_Sel ;
      AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = AV54TFDsc_Idtx ;
      AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = AV55TFDsc_Idtx_Sel ;
      AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = AV57TFImp_Idtx_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A12703Imp_Idtx ,
                                           AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                           AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                           AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                           AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                           AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                           Integer.valueOf(AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels.size()) ,
                                           A10887Cod_Idtx ,
                                           A10888Dsc_Idtx ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV66Ficherosbasicos_tinditexwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx), 4, "%") ;
      lV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = GXutil.padr( GXutil.rtrim( AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx), 60, "%") ;
      /* Using cursor P07XG2 */
      pr_default.execute(0, new Object[] {lV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx, AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel, lV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx, AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10888Dsc_Idtx = P07XG2_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P07XG2_n10888Dsc_Idtx[0] ;
         A10887Cod_Idtx = P07XG2_A10887Cod_Idtx[0] ;
         A12703Imp_Idtx = P07XG2_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P07XG2_n12703Imp_Idtx[0] ;
         A396EmprCod = P07XG2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV66Ficherosbasicos_tinditexwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A10887Cod_Idtx) , GXutil.padr( "%" + GXutil.upper( AV66Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10888Dsc_Idtx) , GXutil.padr( "%" + GXutil.upper( AV66Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV66Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
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
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10887Cod_Idtx, GXv_char5) ;
               tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_char4 = "" ;
               GXv_char5[0] = GXt_char4 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A10888Dsc_Idtx, GXv_char5) ;
               tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( GXt_char4 );
               AV45VisibleColumnCount = (long)(AV45VisibleColumnCount+1) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV37ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( "" );
               if ( GXutil.strcmp(GXutil.trim( A12703Imp_Idtx), httpContext.getMessage( "N", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "N", "") );
               }
               else if ( GXutil.strcmp(GXutil.trim( A12703Imp_Idtx), httpContext.getMessage( "S", "")) == 0 )
               {
                  AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV45VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "S", "") );
               }
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Cod_Idtx", "", "Id Certificado", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Dsc_Idtx", "", "Certificado", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV37ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Imp_Idtx", "", "Imprimir", true, "") ;
      AV37ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV41UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TINDITEXWWColumnsSelector", GXv_char5) ;
      tinditexwwexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV33Session.getValue("FicherosBasicos.TINDITEXWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      AV16OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV3 = 1 ;
      while ( AV72GXV3 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV3));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX") == 0 )
         {
            AV52TFCod_Idtx = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX_SEL") == 0 )
         {
            AV53TFCod_Idtx_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX") == 0 )
         {
            AV54TFDsc_Idtx = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX_SEL") == 0 )
         {
            AV55TFDsc_Idtx_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMP_IDTX_SEL") == 0 )
         {
            AV56TFImp_Idtx_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV57TFImp_Idtx_Sels.fromJSonString(AV56TFImp_Idtx_SelsJson, null);
         }
         AV72GXV3 = (int)(AV72GXV3+1) ;
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
      this.aP0[0] = tinditexwwexport.this.AV11Filename;
      this.aP1[0] = tinditexwwexport.this.AV12ErrorMessage;
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
      AV60FilterFullText = "" ;
      AV53TFCod_Idtx_Sel = "" ;
      AV52TFCod_Idtx = "" ;
      AV55TFDsc_Idtx_Sel = "" ;
      AV54TFDsc_Idtx = "" ;
      AV57TFImp_Idtx_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV58TFImp_Idtx_Sel = "" ;
      AV33Session = httpContext.getWebSession();
      AV40ColumnsSelectorXML = "" ;
      AV37ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV39ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      A12703Imp_Idtx = "" ;
      AV66Ficherosbasicos_tinditexwwds_1_filterfulltext = "" ;
      AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = "" ;
      AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = "" ;
      AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      lV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      P07XG2_A10888Dsc_Idtx = new String[] {""} ;
      P07XG2_n10888Dsc_Idtx = new boolean[] {false} ;
      P07XG2_A10887Cod_Idtx = new String[] {""} ;
      P07XG2_A12703Imp_Idtx = new String[] {""} ;
      P07XG2_n12703Imp_Idtx = new boolean[] {false} ;
      P07XG2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV41UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV38ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56TFImp_Idtx_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tinditexwwexport__default(),
         new Object[] {
             new Object[] {
            P07XG2_A10888Dsc_Idtx, P07XG2_n10888Dsc_Idtx, P07XG2_A10887Cod_Idtx, P07XG2_A12703Imp_Idtx, P07XG2_n12703Imp_Idtx, P07XG2_A396EmprCod
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
   private int AV63GXV1 ;
   private int AV64GXV2 ;
   private int AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ;
   private int AV72GXV3 ;
   private long AV59i ;
   private long AV45VisibleColumnCount ;
   private String AV53TFCod_Idtx_Sel ;
   private String AV52TFCod_Idtx ;
   private String AV55TFDsc_Idtx_Sel ;
   private String AV54TFDsc_Idtx ;
   private String AV58TFImp_Idtx_Sel ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A12703Imp_Idtx ;
   private String AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ;
   private String AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ;
   private String scmdbuf ;
   private String lV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String lV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String AV40ColumnsSelectorXML ;
   private String AV41UserCustomValue ;
   private String AV56TFImp_Idtx_SelsJson ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV60FilterFullText ;
   private String AV66Ficherosbasicos_tinditexwwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private GXSimpleCollection<String> AV57TFImp_Idtx_Sels ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07XG2_A10888Dsc_Idtx ;
   private boolean[] P07XG2_n10888Dsc_Idtx ;
   private String[] P07XG2_A10887Cod_Idtx ;
   private String[] P07XG2_A12703Imp_Idtx ;
   private boolean[] P07XG2_n12703Imp_Idtx ;
   private String[] P07XG2_A396EmprCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private GXSimpleCollection<String> AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ;
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

final  class tinditexwwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07XG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A12703Imp_Idtx ,
                                          GXSimpleCollection<String> AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                          String AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                          String AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                          String AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                          String AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                          int AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ,
                                          String A10887Cod_Idtx ,
                                          String A10888Dsc_Idtx ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV66Ficherosbasicos_tinditexwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[4];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT Dsc_Idtx, Cod_Idtx, Imp_Idtx, EmprCod FROM TXPINDITE" ;
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tinditexwwds_2_tfcod_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Cod_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Cod_Idtx = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV69Ficherosbasicos_tinditexwwds_4_tfdsc_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Dsc_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Dsc_Idtx = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV71Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels, "Imp_Idtx IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Dsc_Idtx" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Dsc_Idtx DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Cod_Idtx" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Cod_Idtx DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY Imp_Idtx" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Imp_Idtx DESC" ;
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
                  return conditional_P07XG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07XG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[4], 4);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               return;
      }
   }

}

