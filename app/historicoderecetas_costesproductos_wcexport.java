package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoderecetas_costesproductos_wcexport extends GXProcedure
{
   public historicoderecetas_costesproductos_wcexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_costesproductos_wcexport.class ), "" );
   }

   public historicoderecetas_costesproductos_wcexport( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      historicoderecetas_costesproductos_wcexport.this.aP1 = new String[] {""};
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
      historicoderecetas_costesproductos_wcexport.this.aP0 = aP0;
      historicoderecetas_costesproductos_wcexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "HistoricodeRecetas_CostesProductos_WCExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV18FilterFullText, GXv_char5) ;
      historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      if ( ! ( (GXutil.strcmp("", AV37TFHrePrdNum_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV37TFHrePrdNum_Sel, GXv_char5) ;
         historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV36TFHrePrdNum)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Producto", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV36TFHrePrdNum, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (GXutil.strcmp("", AV39TFHrePrdDsc_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV39TFHrePrdDsc_Sel, GXv_char5) ;
         historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV38TFHrePrdDsc)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Descripcion", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV38TFHrePrdDsc, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFHrePrdCant)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFHrePrdCant_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Cantidad", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV40TFHrePrdCant)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV41TFHrePrdCant_To)) );
      }
      if ( ! ( (GXutil.strcmp("", AV43TFHrePrdUDs_Sel)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         GXt_char4 = "" ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV43TFHrePrdUDs_Sel, GXv_char5) ;
         historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      }
      else
      {
         if ( ! ( (GXutil.strcmp("", AV42TFHrePrdUDs)==0) ) )
         {
            GXv_exceldoc2[0] = AV10ExcelDocument ;
            GXv_int3[0] = (short)(AV13CellRow) ;
            new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Und", "")) ;
            AV10ExcelDocument = GXv_exceldoc2[0] ;
            historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV42TFHrePrdUDs, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFHrePrePrd)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFHrePrePrd_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Precio", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV44TFHrePrePrd)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV45TFHrePrePrd_To)) );
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdFacCon)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdFacCon_To)==0) ) )
      {
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, true, GXv_int3, (short)(AV14FirstColumn), httpContext.getMessage( "Factor", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46TFPrdFacCon)) );
         GXv_exceldoc2[0] = AV10ExcelDocument ;
         GXv_int3[0] = (short)(AV13CellRow) ;
         new app.wwpbaseobjects.wwp_exportwritefilter(remoteHandle, context).execute( GXv_exceldoc2, false, GXv_int3, (short)(AV14FirstColumn+2), httpContext.getMessage( "WWP_TSTo", "")) ;
         AV10ExcelDocument = GXv_exceldoc2[0] ;
         historicoderecetas_costesproductos_wcexport.this.AV13CellRow = GXv_int3[0] ;
         AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47TFPrdFacCon_To)) );
      }
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV33VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCColumnsSelector"), "") != 0 )
      {
         AV28ColumnsSelectorXML = AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV28ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV27ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV57GXV1));
         if ( AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV27ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setColor( 11 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = AV18FilterFullText ;
      AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = AV36TFHrePrdNum ;
      AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = AV38TFHrePrdDsc ;
      AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = AV40TFHrePrdCant ;
      AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = AV41TFHrePrdCant_To ;
      AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds = AV42TFHrePrdUDs ;
      AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = AV44TFHrePrePrd ;
      AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = AV45TFHrePrePrd_To ;
      AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = AV46TFPrdFacCon ;
      AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = AV47TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                           AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                           AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                           AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                           AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                           AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                           AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                           AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                           AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                           AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                           AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                           AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                           AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           A719PrdNum ,
                                           AV49Emprcod ,
                                           Integer.valueOf(AV50HreBarCod) ,
                                           Byte.valueOf(AV51HreBarReo) ,
                                           AV52HreBarpar ,
                                           Byte.valueOf(AV53HreNumCie) ,
                                           Short.valueOf(AV54HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum), 6, "%") ;
      lV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc), 26, "%") ;
      lV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds = GXutil.padr( GXutil.rtrim( AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds), 5, "%") ;
      /* Using cursor P09A42 */
      pr_default.execute(0, new Object[] {AV49Emprcod, Integer.valueOf(AV50HreBarCod), Byte.valueOf(AV51HreBarReo), AV52HreBarpar, Byte.valueOf(AV53HreNumCie), Short.valueOf(AV54HreLinMaq), lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum, AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel, lV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc, AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel, AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant, AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to, lV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds, AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel, AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd, AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to, AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon, AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09A42_A719PrdNum[0] ;
         n719PrdNum = P09A42_n719PrdNum[0] ;
         A4545HreLinMaq = P09A42_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A42_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A42_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A42_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A42_A4492HreBarCod[0] ;
         A396EmprCod = P09A42_A396EmprCod[0] ;
         A707PrdFacCon = P09A42_A707PrdFacCon[0] ;
         A4967HrePrePrd = P09A42_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09A42_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P09A42_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09A42_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P09A42_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09A42_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P09A42_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09A42_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P09A42_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09A42_n4558HrePrdNum[0] ;
         A4565HreCanAny = P09A42_A4565HreCanAny[0] ;
         n4565HreCanAny = P09A42_n4565HreCanAny[0] ;
         A4550HreLinPro = P09A42_A4550HreLinPro[0] ;
         A4557HreRecLin = P09A42_A4557HreRecLin[0] ;
         A707PrdFacCon = P09A42_A707PrdFacCon[0] ;
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
         AV33VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4558HrePrdNum, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4559HrePrdDsc, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4563HrePrdCant)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV72Cantad = ((A4565HreCanAny.doubleValue()>0) ? A4565HreCanAny : DecimalUtil.doubleToDec(0)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23HrePrdCant)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4561HrePrdUDs, GXv_char5) ;
            historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV24Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV72Cantad)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24Costelinea)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A4967HrePrePrd)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV33VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A707PrdFacCon)) );
            AV33VisibleColumnCount = (long)(AV33VisibleColumnCount+1) ;
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
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdNum", "", "Producto", false, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdDsc", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdCant", "", "Cantidad", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&HrePrdCant", "", "Cant Ad", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdUDs", "", "Und", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Costelinea", "", "Coste", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrePrd", "", "Precio", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdFacCon", "", "Factor", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV29UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_CostesProductos_WCColumnsSelector", GXv_char5) ;
      historicoderecetas_costesproductos_wcexport.this.GXt_char4 = GXv_char5[0] ;
      AV29UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV29UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV29UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV2 = 1 ;
      while ( AV73GXV2 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV2));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV36TFHrePrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV37TFHrePrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV38TFHrePrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV39TFHrePrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV40TFHrePrdCant = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHrePrdCant_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV42TFHrePrdUDs = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV43TFHrePrdUDs_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV44TFHrePrePrd = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFHrePrePrd_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV46TFPrdFacCon = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdFacCon_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV50HreBarCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV51HreBarReo = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV52HreBarpar = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV53HreNumCie = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV54HreLinMaq = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV73GXV2 = (int)(AV73GXV2+1) ;
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
      this.aP0[0] = historicoderecetas_costesproductos_wcexport.this.AV11Filename;
      this.aP1[0] = historicoderecetas_costesproductos_wcexport.this.AV12ErrorMessage;
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
      AV37TFHrePrdNum_Sel = "" ;
      AV36TFHrePrdNum = "" ;
      AV39TFHrePrdDsc_Sel = "" ;
      AV38TFHrePrdDsc = "" ;
      AV40TFHrePrdCant = DecimalUtil.ZERO ;
      AV41TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV43TFHrePrdUDs_Sel = "" ;
      AV42TFHrePrdUDs = "" ;
      AV44TFHrePrePrd = DecimalUtil.ZERO ;
      AV45TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV46TFPrdFacCon = DecimalUtil.ZERO ;
      AV47TFPrdFacCon_To = DecimalUtil.ZERO ;
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV19Session = httpContext.getWebSession();
      AV28ColumnsSelectorXML = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV27ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = "" ;
      AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = "" ;
      AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = DecimalUtil.ZERO ;
      AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = "" ;
      AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = DecimalUtil.ZERO ;
      AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = DecimalUtil.ZERO ;
      AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      lV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      lV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      lV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      A719PrdNum = "" ;
      AV49Emprcod = "" ;
      AV52HreBarpar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A42_A719PrdNum = new String[] {""} ;
      P09A42_n719PrdNum = new boolean[] {false} ;
      P09A42_A4545HreLinMaq = new short[1] ;
      P09A42_A4495HreNumCie = new byte[1] ;
      P09A42_A4494HreBarPar = new String[] {""} ;
      P09A42_A4493HreBarReo = new byte[1] ;
      P09A42_A4492HreBarCod = new int[1] ;
      P09A42_A396EmprCod = new String[] {""} ;
      P09A42_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A42_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A42_n4967HrePrePrd = new boolean[] {false} ;
      P09A42_A4561HrePrdUDs = new String[] {""} ;
      P09A42_n4561HrePrdUDs = new boolean[] {false} ;
      P09A42_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A42_n4563HrePrdCant = new boolean[] {false} ;
      P09A42_A4559HrePrdDsc = new String[] {""} ;
      P09A42_n4559HrePrdDsc = new boolean[] {false} ;
      P09A42_A4558HrePrdNum = new String[] {""} ;
      P09A42_n4558HrePrdNum = new boolean[] {false} ;
      P09A42_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A42_n4565HreCanAny = new boolean[] {false} ;
      P09A42_A4550HreLinPro = new byte[1] ;
      P09A42_A4557HreRecLin = new short[1] ;
      AV72Cantad = DecimalUtil.ZERO ;
      AV23HrePrdCant = DecimalUtil.ZERO ;
      AV24Costelinea = DecimalUtil.ZERO ;
      AV29UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_costesproductos_wcexport__default(),
         new Object[] {
             new Object[] {
            P09A42_A719PrdNum, P09A42_n719PrdNum, P09A42_A4545HreLinMaq, P09A42_A4495HreNumCie, P09A42_A4494HreBarPar, P09A42_A4493HreBarReo, P09A42_A4492HreBarCod, P09A42_A396EmprCod, P09A42_A707PrdFacCon, P09A42_A4967HrePrePrd,
            P09A42_n4967HrePrePrd, P09A42_A4561HrePrdUDs, P09A42_n4561HrePrdUDs, P09A42_A4563HrePrdCant, P09A42_n4563HrePrdCant, P09A42_A4559HrePrdDsc, P09A42_n4559HrePrdDsc, P09A42_A4558HrePrdNum, P09A42_n4558HrePrdNum, P09A42_A4565HreCanAny,
            P09A42_n4565HreCanAny, P09A42_A4550HreLinPro, P09A42_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV51HreBarReo ;
   private byte AV53HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short GXv_int3[] ;
   private short AV16OrderedBy ;
   private short AV54HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV57GXV1 ;
   private int AV50HreBarCod ;
   private int A4492HreBarCod ;
   private int AV73GXV2 ;
   private long AV33VisibleColumnCount ;
   private java.math.BigDecimal AV40TFHrePrdCant ;
   private java.math.BigDecimal AV41TFHrePrdCant_To ;
   private java.math.BigDecimal AV44TFHrePrePrd ;
   private java.math.BigDecimal AV45TFHrePrePrd_To ;
   private java.math.BigDecimal AV46TFPrdFacCon ;
   private java.math.BigDecimal AV47TFPrdFacCon_To ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ;
   private java.math.BigDecimal AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ;
   private java.math.BigDecimal AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ;
   private java.math.BigDecimal AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ;
   private java.math.BigDecimal AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ;
   private java.math.BigDecimal AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ;
   private java.math.BigDecimal AV72Cantad ;
   private java.math.BigDecimal AV23HrePrdCant ;
   private java.math.BigDecimal AV24Costelinea ;
   private String AV37TFHrePrdNum_Sel ;
   private String AV36TFHrePrdNum ;
   private String AV39TFHrePrdDsc_Sel ;
   private String AV38TFHrePrdDsc ;
   private String AV43TFHrePrdUDs_Sel ;
   private String AV42TFHrePrdUDs ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ;
   private String AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ;
   private String AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ;
   private String scmdbuf ;
   private String lV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String lV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String lV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String A719PrdNum ;
   private String AV49Emprcod ;
   private String AV52HreBarpar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4565HreCanAny ;
   private String AV28ColumnsSelectorXML ;
   private String AV29UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV18FilterFullText ;
   private String AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private String lV59Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09A42_A719PrdNum ;
   private boolean[] P09A42_n719PrdNum ;
   private short[] P09A42_A4545HreLinMaq ;
   private byte[] P09A42_A4495HreNumCie ;
   private String[] P09A42_A4494HreBarPar ;
   private byte[] P09A42_A4493HreBarReo ;
   private int[] P09A42_A4492HreBarCod ;
   private String[] P09A42_A396EmprCod ;
   private java.math.BigDecimal[] P09A42_A707PrdFacCon ;
   private java.math.BigDecimal[] P09A42_A4967HrePrePrd ;
   private boolean[] P09A42_n4967HrePrePrd ;
   private String[] P09A42_A4561HrePrdUDs ;
   private boolean[] P09A42_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P09A42_A4563HrePrdCant ;
   private boolean[] P09A42_n4563HrePrdCant ;
   private String[] P09A42_A4559HrePrdDsc ;
   private boolean[] P09A42_n4559HrePrdDsc ;
   private String[] P09A42_A4558HrePrdNum ;
   private boolean[] P09A42_n4558HrePrdNum ;
   private java.math.BigDecimal[] P09A42_A4565HreCanAny ;
   private boolean[] P09A42_n4565HreCanAny ;
   private byte[] P09A42_A4550HreLinPro ;
   private short[] P09A42_A4557HreRecLin ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV27ColumnsSelector_Column ;
}

final  class historicoderecetas_costesproductos_wcexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                          String AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                          String AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                          String AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                          String AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                          java.math.BigDecimal AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                          java.math.BigDecimal AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                          String AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                          String AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                          java.math.BigDecimal AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                          java.math.BigDecimal AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                          java.math.BigDecimal AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV49Emprcod ,
                                          int AV50HreBarCod ,
                                          byte AV51HreBarReo ,
                                          String AV52HreBarpar ,
                                          byte AV53HreNumCie ,
                                          short AV54HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreCanAny, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( ! (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.HrePrdUDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrePrd,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdFacCon,'90.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Historicoderecetas_costesproductos_wcds_2_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Historicoderecetas_costesproductos_wcds_4_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Historicoderecetas_costesproductos_wcds_6_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV66Historicoderecetas_costesproductos_wcds_8_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Historicoderecetas_costesproductos_wcds_10_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Historicoderecetas_costesproductos_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon DESC" ;
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
                  return conditional_P09A42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((short[]) buf[22])[0] = rslt.getShort(16);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               return;
      }
   }

}

