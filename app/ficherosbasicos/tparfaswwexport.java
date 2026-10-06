package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tparfaswwexport extends GXProcedure
{
   public tparfaswwexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparfaswwexport.class ), "" );
   }

   public tparfaswwexport( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      tparfaswwexport.this.aP1 = new String[] {""};
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
      tparfaswwexport.this.aP0 = aP0;
      tparfaswwexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "TPARFASWWExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV68FilterFullText, GXv_char5) ;
      tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV51TFParFasCod) && (0==AV52TFParFasCod_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Codigo Parametro Fase", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV51TFParFasCod );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV52TFParFasCod_To );
      }
      if ( ! ( (GXutil.strcmp("", AV54TFParFasDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV54TFParFasDsc_Sel, GXv_char5) ;
         tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV53TFParFasDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV53TFParFasDsc, GXv_char5) ;
            tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (0==AV63TFParUndID) && (0==AV64TFParUndID_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Unidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV63TFParUndID );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV64TFParUndID_To );
      }
      if ( ! ( (GXutil.strcmp("", AV66TFParUndDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV66TFParUndDsc_Sel, GXv_char5) ;
         tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV65TFParUndDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            tparfaswwexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV65TFParUndDsc, GXv_char5) ;
            tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV48VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV36Session.getValue("FicherosBasicos.TPARFASWWColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV36Session.getValue("FicherosBasicos.TPARFASWWColumnsSelector") ;
         AV40ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV42ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV73GXV1));
         if ( AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV42ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setColor( 11 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV75Ficherosbasicos_tparfaswwds_1_filterfulltext = AV68FilterFullText ;
      AV76Ficherosbasicos_tparfaswwds_2_tfparfascod = AV51TFParFasCod ;
      AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to = AV52TFParFasCod_To ;
      AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc = AV53TFParFasDsc ;
      AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = AV54TFParFasDsc_Sel ;
      AV80Ficherosbasicos_tparfaswwds_6_tfparundid = AV63TFParUndID ;
      AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to = AV64TFParUndID_To ;
      AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc = AV65TFParUndDsc ;
      AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = AV66TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                           Short.valueOf(AV76Ficherosbasicos_tparfaswwds_2_tfparfascod) ,
                                           Short.valueOf(AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to) ,
                                           AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                           AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                           Short.valueOf(AV80Ficherosbasicos_tparfaswwds_6_tfparundid) ,
                                           Short.valueOf(AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to) ,
                                           AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                           AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                           Short.valueOf(A1664ParFasCod) ,
                                           A1665ParFasDsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV75Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV75Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV75Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV75Ficherosbasicos_tparfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Ficherosbasicos_tparfaswwds_1_filterfulltext), "%", "") ;
      lV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc = GXutil.padr( GXutil.rtrim( AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc), 30, "%") ;
      lV82Ficherosbasicos_tparfaswwds_8_tfparunddsc = GXutil.padr( GXutil.rtrim( AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc), 15, "%") ;
      /* Using cursor P080O2 */
      pr_default.execute(0, new Object[] {lV75Ficherosbasicos_tparfaswwds_1_filterfulltext, lV75Ficherosbasicos_tparfaswwds_1_filterfulltext, lV75Ficherosbasicos_tparfaswwds_1_filterfulltext, lV75Ficherosbasicos_tparfaswwds_1_filterfulltext, Short.valueOf(AV76Ficherosbasicos_tparfaswwds_2_tfparfascod), Short.valueOf(AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to), lV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc, AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel, Short.valueOf(AV80Ficherosbasicos_tparfaswwds_6_tfparundid), Short.valueOf(AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to), lV82Ficherosbasicos_tparfaswwds_8_tfparunddsc, AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P080O2_A396EmprCod[0] ;
         A13204ParUndDsc = P080O2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080O2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080O2_A13203ParUndID[0] ;
         n13203ParUndID = P080O2_n13203ParUndID[0] ;
         A1665ParFasDsc = P080O2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P080O2_n1665ParFasDsc[0] ;
         A1664ParFasCod = P080O2_A1664ParFasCod[0] ;
         A13204ParUndDsc = P080O2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080O2_n13204ParUndDsc[0] ;
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
         AV48VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A1664ParFasCod );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1665ParFasDsc, GXv_char5) ;
            tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setNumber( A13203ParUndID );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV40ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13204ParUndDsc, GXv_char5) ;
            tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV48VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV48VisibleColumnCount = (long)(AV48VisibleColumnCount+1) ;
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
      AV40ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParFasCod", "", "Codigo Parametro Fase", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParFasDsc", "", "Descripcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParUndID", "", "Unidad", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV40ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "ParUndDsc", "", "Descripcion", true, "") ;
      AV40ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV44UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FicherosBasicos.TPARFASWWColumnsSelector", GXv_char5) ;
      tparfaswwexport.this.GXt_char4 = GXv_char5[0] ;
      AV44UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV41ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV41ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV40ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV41ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV40ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("FicherosBasicos.TPARFASWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("FicherosBasicos.TPARFASWWGridState"), null, null);
      }
      AV16OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV68FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASCOD") == 0 )
         {
            AV51TFParFasCod = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFParFasCod_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC") == 0 )
         {
            AV53TFParFasDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARFASDSC_SEL") == 0 )
         {
            AV54TFParFasDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV63TFParUndID = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFParUndID_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV65TFParUndDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV66TFParUndDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV84GXV2 = (int)(AV84GXV2+1) ;
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
      this.aP0[0] = tparfaswwexport.this.AV11Filename;
      this.aP1[0] = tparfaswwexport.this.AV12ErrorMessage;
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
      AV68FilterFullText = "" ;
      AV54TFParFasDsc_Sel = "" ;
      AV53TFParFasDsc = "" ;
      AV66TFParUndDsc_Sel = "" ;
      AV65TFParUndDsc = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV36Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      AV40ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV42ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A1665ParFasDsc = "" ;
      A13204ParUndDsc = "" ;
      AV75Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel = "" ;
      AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel = "" ;
      scmdbuf = "" ;
      lV75Ficherosbasicos_tparfaswwds_1_filterfulltext = "" ;
      lV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc = "" ;
      lV82Ficherosbasicos_tparfaswwds_8_tfparunddsc = "" ;
      P080O2_A396EmprCod = new String[] {""} ;
      P080O2_A13204ParUndDsc = new String[] {""} ;
      P080O2_n13204ParUndDsc = new boolean[] {false} ;
      P080O2_A13203ParUndID = new short[1] ;
      P080O2_n13203ParUndID = new boolean[] {false} ;
      P080O2_A1665ParFasDsc = new String[] {""} ;
      P080O2_n1665ParFasDsc = new boolean[] {false} ;
      P080O2_A1664ParFasCod = new short[1] ;
      A396EmprCod = "" ;
      AV44UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV41ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfaswwexport__default(),
         new Object[] {
             new Object[] {
            P080O2_A396EmprCod, P080O2_A13204ParUndDsc, P080O2_n13204ParUndDsc, P080O2_A13203ParUndID, P080O2_n13203ParUndID, P080O2_A1665ParFasDsc, P080O2_n1665ParFasDsc, P080O2_A1664ParFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV51TFParFasCod ;
   private short AV52TFParFasCod_To ;
   private short AV63TFParUndID ;
   private short AV64TFParUndID_To ;
   private short GXv_int3[] ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short AV76Ficherosbasicos_tparfaswwds_2_tfparfascod ;
   private short AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to ;
   private short AV80Ficherosbasicos_tparfaswwds_6_tfparundid ;
   private short AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV73GXV1 ;
   private int AV84GXV2 ;
   private long AV48VisibleColumnCount ;
   private String AV54TFParFasDsc_Sel ;
   private String AV53TFParFasDsc ;
   private String AV66TFParUndDsc_Sel ;
   private String AV65TFParUndDsc ;
   private String A1665ParFasDsc ;
   private String A13204ParUndDsc ;
   private String AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ;
   private String AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ;
   private String scmdbuf ;
   private String lV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc ;
   private String lV82Ficherosbasicos_tparfaswwds_8_tfparunddsc ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n13204ParUndDsc ;
   private boolean n13203ParUndID ;
   private boolean n1665ParFasDsc ;
   private String AV43ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV68FilterFullText ;
   private String AV75Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private String lV75Ficherosbasicos_tparfaswwds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P080O2_A396EmprCod ;
   private String[] P080O2_A13204ParUndDsc ;
   private boolean[] P080O2_n13204ParUndDsc ;
   private short[] P080O2_A13203ParUndID ;
   private boolean[] P080O2_n13203ParUndID ;
   private String[] P080O2_A1665ParFasDsc ;
   private boolean[] P080O2_n1665ParFasDsc ;
   private short[] P080O2_A1664ParFasCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV41ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV42ColumnsSelector_Column ;
}

final  class tparfaswwexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Ficherosbasicos_tparfaswwds_1_filterfulltext ,
                                          short AV76Ficherosbasicos_tparfaswwds_2_tfparfascod ,
                                          short AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to ,
                                          String AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel ,
                                          String AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc ,
                                          short AV80Ficherosbasicos_tparfaswwds_6_tfparundid ,
                                          short AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to ,
                                          String AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel ,
                                          String AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc ,
                                          short A1664ParFasCod ,
                                          String A1665ParFasDsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ParUndDsc, T1.ParUndID, T1.ParFasDsc, T1.ParFasCod FROM (TXPPARFAS T1 LEFT JOIN TXPPARUND T2 ON T2.EmprCod = T1.EmprCod AND T2.ParUndID = T1.ParUndID)" ;
      if ( ! (GXutil.strcmp("", AV75Ficherosbasicos_tparfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ParFasCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ParFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV76Ficherosbasicos_tparfaswwds_2_tfparfascod) )
      {
         addWhere(sWhereString, "(T1.ParFasCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV77Ficherosbasicos_tparfaswwds_3_tfparfascod_to) )
      {
         addWhere(sWhereString, "(T1.ParFasCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Ficherosbasicos_tparfaswwds_4_tfparfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ParFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Ficherosbasicos_tparfaswwds_5_tfparfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ParFasDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV80Ficherosbasicos_tparfaswwds_6_tfparundid) )
      {
         addWhere(sWhereString, "(T1.ParUndID >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV81Ficherosbasicos_tparfaswwds_7_tfparundid_to) )
      {
         addWhere(sWhereString, "(T1.ParUndID <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tparfaswwds_8_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tparfaswwds_9_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParUndDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParFasCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParFasCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParUndID" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParUndID DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParUndDsc DESC" ;
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
                  return conditional_P080O2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 15);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 15);
               }
               return;
      }
   }

}

