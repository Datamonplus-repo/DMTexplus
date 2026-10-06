package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanualexport extends GXProcedure
{
   public cierrerecetastinte_adicionesmanualexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_adicionesmanualexport.class ), "" );
   }

   public cierrerecetastinte_adicionesmanualexport( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      cierrerecetastinte_adicionesmanualexport.this.aP1 = new String[] {""};
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
      cierrerecetastinte_adicionesmanualexport.this.aP0 = aP0;
      cierrerecetastinte_adicionesmanualexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_AdicionesManualExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (0==AV42TFRecLinMAL) && (0==AV43TFRecLinMAL_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "#") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV42TFRecLinMAL );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV43TFRecLinMAL_To );
      }
      if ( ! ( (0==AV44TFRecNumAny) && (0==AV45TFRecNumAny_To) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), "##") ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( AV44TFRecNumAny );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( AV45TFRecNumAny_To );
      }
      if ( ! ( (GXutil.strcmp("", AV47TFPrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV47TFPrdNum_Sel, GXv_char5) ;
         cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV46TFPrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV46TFPrdNum, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV71TFPrdNom_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV71TFPrdNom_Sel, GXv_char5) ;
         cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV70TFPrdNom)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV70TFPrdNom, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCFin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCFin_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48TFPrdCFin)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49TFPrdCFin_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV59TFLanyUsr_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV59TFLanyUsr_Sel, GXv_char5) ;
         cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV58TFLanyUsr)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Usuario", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV58TFLanyUsr, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.nullDate(), AV60TFLanyFec) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Fecha Hora", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setDate( AV60TFLanyFec );
      }
      if ( ! ( (GXutil.strcmp("", AV63TFLanyLote_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV63TFLanyLote_Sel, GXv_char5) ;
         cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV62TFLanyLote)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Lote", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            cierrerecetastinte_adicionesmanualexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV62TFLanyLote, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector"), "") != 0 )
      {
         AV26ColumnsSelectorXML = AV19Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV26ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV25ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV79GXV1));
         if ( AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV25ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setColor( 11 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV18FilterFullText ;
      AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV42TFRecLinMAL ;
      AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV43TFRecLinMAL_To ;
      AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV44TFRecNumAny ;
      AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV45TFRecNumAny_To ;
      AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV46TFPrdNum ;
      AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV70TFPrdNom ;
      AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV71TFPrdNom_Sel ;
      AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV48TFPrdCFin ;
      AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV49TFPrdCFin_To ;
      AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV58TFLanyUsr ;
      AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV59TFLanyUsr_Sel ;
      AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV60TFLanyFec ;
      AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV62TFLanyLote ;
      AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV63TFLanyLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV72Emprcod ,
                                           Integer.valueOf(AV73Barcod) ,
                                           Byte.valueOf(AV74Barcodreo) ,
                                           AV75Barcodpar ,
                                           Short.valueOf(AV76RecLinMAL) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV95Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094Q2 */
      pr_default.execute(0, new Object[] {AV72Emprcod, Integer.valueOf(AV73Barcod), Byte.valueOf(AV74Barcodreo), AV75Barcodpar, Short.valueOf(AV76RecLinMAL), lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV95Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P094Q2_A130BarCodPar[0] ;
         A132BarCodReo = P094Q2_A132BarCodReo[0] ;
         A129BarCod = P094Q2_A129BarCod[0] ;
         A396EmprCod = P094Q2_A396EmprCod[0] ;
         A5807LanyLote = P094Q2_A5807LanyLote[0] ;
         n5807LanyLote = P094Q2_n5807LanyLote[0] ;
         A4579LanyFec = P094Q2_A4579LanyFec[0] ;
         n4579LanyFec = P094Q2_n4579LanyFec[0] ;
         A4578LanyUsr = P094Q2_A4578LanyUsr[0] ;
         n4578LanyUsr = P094Q2_n4578LanyUsr[0] ;
         A1378PrdCFin = P094Q2_A1378PrdCFin[0] ;
         n1378PrdCFin = P094Q2_n1378PrdCFin[0] ;
         A718PrdNom = P094Q2_A718PrdNom[0] ;
         A719PrdNum = P094Q2_A719PrdNum[0] ;
         A1377RecNumAny = P094Q2_A1377RecNumAny[0] ;
         A2808RecLinMAL = P094Q2_A2808RecLinMAL[0] ;
         A718PrdNom = P094Q2_A718PrdNom[0] ;
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
         AV31VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A2808RecLinMAL );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( A1377RecNumAny );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A719PrdNum, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A718PrdNom, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1378PrdCFin)) );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4578LanyUsr, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setDate( A4579LanyFec );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A5807LanyLote, GXv_char5) ;
            cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV31VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV31VisibleColumnCount = (long)(AV31VisibleColumnCount+1) ;
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
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinMAL", "", "#", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecNumAny", "", "##", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdCFin", "", "Cantidad", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "LanyUsr", "", "Usuario", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "LanyFec", "", "Fecha Hora", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "LanyLote", "", "Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV27UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualColumnsSelector", GXv_char5) ;
      cierrerecetastinte_adicionesmanualexport.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV2 = 1 ;
      while ( AV97GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAL") == 0 )
         {
            AV42TFRecLinMAL = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFRecLinMAL_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV44TFRecNumAny = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecNumAny_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV46TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV47TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV70TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV71TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV48TFPrdCFin = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFPrdCFin_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR") == 0 )
         {
            AV58TFLanyUsr = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR_SEL") == 0 )
         {
            AV59TFLanyUsr_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYFEC") == 0 )
         {
            AV60TFLanyFec = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV62TFLanyLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV63TFLanyLote_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV97GXV2 = (int)(AV97GXV2+1) ;
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
      this.aP0[0] = cierrerecetastinte_adicionesmanualexport.this.AV11Filename;
      this.aP1[0] = cierrerecetastinte_adicionesmanualexport.this.AV12ErrorMessage;
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
      AV47TFPrdNum_Sel = "" ;
      AV46TFPrdNum = "" ;
      AV71TFPrdNom_Sel = "" ;
      AV70TFPrdNom = "" ;
      AV48TFPrdCFin = DecimalUtil.ZERO ;
      AV49TFPrdCFin_To = DecimalUtil.ZERO ;
      AV59TFLanyUsr_Sel = "" ;
      AV58TFLanyUsr = "" ;
      AV60TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV63TFLanyLote_Sel = "" ;
      AV62TFLanyLote = "" ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV26ColumnsSelectorXML = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = "" ;
      AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = "" ;
      AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = DecimalUtil.ZERO ;
      AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = DecimalUtil.ZERO ;
      AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = "" ;
      AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = "" ;
      scmdbuf = "" ;
      lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      lV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      lV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      lV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      lV95Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV72Emprcod = "" ;
      AV75Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P094Q2_A130BarCodPar = new String[] {""} ;
      P094Q2_A132BarCodReo = new byte[1] ;
      P094Q2_A129BarCod = new int[1] ;
      P094Q2_A396EmprCod = new String[] {""} ;
      P094Q2_A5807LanyLote = new String[] {""} ;
      P094Q2_n5807LanyLote = new boolean[] {false} ;
      P094Q2_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094Q2_n4579LanyFec = new boolean[] {false} ;
      P094Q2_A4578LanyUsr = new String[] {""} ;
      P094Q2_n4578LanyUsr = new boolean[] {false} ;
      P094Q2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094Q2_n1378PrdCFin = new boolean[] {false} ;
      P094Q2_A718PrdNom = new String[] {""} ;
      P094Q2_A719PrdNum = new String[] {""} ;
      P094Q2_A1377RecNumAny = new byte[1] ;
      P094Q2_A2808RecLinMAL = new short[1] ;
      AV27UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanualexport__default(),
         new Object[] {
             new Object[] {
            P094Q2_A130BarCodPar, P094Q2_A132BarCodReo, P094Q2_A129BarCod, P094Q2_A396EmprCod, P094Q2_A5807LanyLote, P094Q2_n5807LanyLote, P094Q2_A4579LanyFec, P094Q2_n4579LanyFec, P094Q2_A4578LanyUsr, P094Q2_n4578LanyUsr,
            P094Q2_A1378PrdCFin, P094Q2_n1378PrdCFin, P094Q2_A718PrdNom, P094Q2_A719PrdNum, P094Q2_A1377RecNumAny, P094Q2_A2808RecLinMAL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TFRecNumAny ;
   private byte AV45TFRecNumAny_To ;
   private byte A1377RecNumAny ;
   private byte AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ;
   private byte AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ;
   private byte AV74Barcodreo ;
   private byte A132BarCodReo ;
   private short AV42TFRecLinMAL ;
   private short AV43TFRecLinMAL_To ;
   private short GXv_int3[] ;
   private short A2808RecLinMAL ;
   private short AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ;
   private short AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ;
   private short AV16OrderedBy ;
   private short AV76RecLinMAL ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV79GXV1 ;
   private int AV73Barcod ;
   private int A129BarCod ;
   private int AV97GXV2 ;
   private long AV31VisibleColumnCount ;
   private java.math.BigDecimal AV48TFPrdCFin ;
   private java.math.BigDecimal AV49TFPrdCFin_To ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ;
   private java.math.BigDecimal AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ;
   private String AV47TFPrdNum_Sel ;
   private String AV46TFPrdNum ;
   private String AV71TFPrdNom_Sel ;
   private String AV70TFPrdNom ;
   private String AV59TFLanyUsr_Sel ;
   private String AV58TFLanyUsr ;
   private String AV63TFLanyLote_Sel ;
   private String AV62TFLanyLote ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ;
   private String AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ;
   private String AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ;
   private String AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ;
   private String scmdbuf ;
   private String lV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String lV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String lV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String lV95Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV72Emprcod ;
   private String AV75Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date AV60TFLanyFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n5807LanyLote ;
   private boolean n4579LanyFec ;
   private boolean n4578LanyUsr ;
   private boolean n1378PrdCFin ;
   private String AV26ColumnsSelectorXML ;
   private String AV27UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String lV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P094Q2_A130BarCodPar ;
   private byte[] P094Q2_A132BarCodReo ;
   private int[] P094Q2_A129BarCod ;
   private String[] P094Q2_A396EmprCod ;
   private String[] P094Q2_A5807LanyLote ;
   private boolean[] P094Q2_n5807LanyLote ;
   private java.util.Date[] P094Q2_A4579LanyFec ;
   private boolean[] P094Q2_n4579LanyFec ;
   private String[] P094Q2_A4578LanyUsr ;
   private boolean[] P094Q2_n4578LanyUsr ;
   private java.math.BigDecimal[] P094Q2_A1378PrdCFin ;
   private boolean[] P094Q2_n1378PrdCFin ;
   private String[] P094Q2_A718PrdNom ;
   private String[] P094Q2_A719PrdNum ;
   private byte[] P094Q2_A1377RecNumAny ;
   private short[] P094Q2_A2808RecLinMAL ;
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

final  class cierrerecetastinte_adicionesmanualexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV72Emprcod ,
                                          int AV73Barcod ,
                                          byte AV74Barcodreo ,
                                          String AV75Barcodpar ,
                                          short AV76RecLinMAL ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny, T1.RecLinMAL FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV81Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV83Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV84Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV85Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV88Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV95Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecNumAny" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecNumAny DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMAL DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCFin" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCFin DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyUsr" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyUsr DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyFec" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyFec DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.LanyLote" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.LanyLote DESC" ;
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
                  return conditional_P094Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
      }
   }

}

