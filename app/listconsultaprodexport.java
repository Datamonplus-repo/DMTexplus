package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listconsultaprodexport extends GXProcedure
{
   public listconsultaprodexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listconsultaprodexport.class ), "" );
   }

   public listconsultaprodexport( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             java.util.Date aP11 ,
                             java.util.Date aP12 ,
                             java.util.Date aP13 ,
                             java.util.Date aP14 ,
                             String aP15 ,
                             String aP16 ,
                             short aP17 ,
                             short aP18 ,
                             String aP19 ,
                             String aP20 ,
                             int aP21 ,
                             int aP22 ,
                             String aP23 ,
                             String aP24 ,
                             int aP25 ,
                             int aP26 ,
                             short aP27 ,
                             short aP28 ,
                             String aP29 ,
                             int aP30 ,
                             int aP31 ,
                             byte aP32 ,
                             byte aP33 ,
                             String aP34 ,
                             String aP35 ,
                             String aP36 ,
                             String aP37 ,
                             String[] aP38 )
   {
      listconsultaprodexport.this.aP39 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
      return aP39[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        java.util.Date aP9 ,
                        java.util.Date aP10 ,
                        java.util.Date aP11 ,
                        java.util.Date aP12 ,
                        java.util.Date aP13 ,
                        java.util.Date aP14 ,
                        String aP15 ,
                        String aP16 ,
                        short aP17 ,
                        short aP18 ,
                        String aP19 ,
                        String aP20 ,
                        int aP21 ,
                        int aP22 ,
                        String aP23 ,
                        String aP24 ,
                        int aP25 ,
                        int aP26 ,
                        short aP27 ,
                        short aP28 ,
                        String aP29 ,
                        int aP30 ,
                        int aP31 ,
                        byte aP32 ,
                        byte aP33 ,
                        String aP34 ,
                        String aP35 ,
                        String aP36 ,
                        String aP37 ,
                        String[] aP38 ,
                        String[] aP39 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             java.util.Date aP11 ,
                             java.util.Date aP12 ,
                             java.util.Date aP13 ,
                             java.util.Date aP14 ,
                             String aP15 ,
                             String aP16 ,
                             short aP17 ,
                             short aP18 ,
                             String aP19 ,
                             String aP20 ,
                             int aP21 ,
                             int aP22 ,
                             String aP23 ,
                             String aP24 ,
                             int aP25 ,
                             int aP26 ,
                             short aP27 ,
                             short aP28 ,
                             String aP29 ,
                             int aP30 ,
                             int aP31 ,
                             byte aP32 ,
                             byte aP33 ,
                             String aP34 ,
                             String aP35 ,
                             String aP36 ,
                             String aP37 ,
                             String[] aP38 ,
                             String[] aP39 )
   {
      listconsultaprodexport.this.AV33Emprcod = aP0;
      listconsultaprodexport.this.AV36CliCodfrom = aP1;
      listconsultaprodexport.this.AV37CliCodto = aP2;
      listconsultaprodexport.this.AV34bardisnumfrom = aP3;
      listconsultaprodexport.this.AV35bardisnumto = aP4;
      listconsultaprodexport.this.AV40barfecgenfrom = aP5;
      listconsultaprodexport.this.AV41barfecgento = aP6;
      listconsultaprodexport.this.AV38BarSitfrom = aP7;
      listconsultaprodexport.this.AV39BarSitto = aP8;
      listconsultaprodexport.this.AV44BarFecClifrom = aP9;
      listconsultaprodexport.this.AV45barfecclito = aP10;
      listconsultaprodexport.this.AV46BarFecFprfrom = aP11;
      listconsultaprodexport.this.AV47barfecfprto = aP12;
      listconsultaprodexport.this.AV42barfecsalfrom = aP13;
      listconsultaprodexport.this.AV43barfecsalto = aP14;
      listconsultaprodexport.this.AV48BarSerfrom = aP15;
      listconsultaprodexport.this.AV49BarSerto = aP16;
      listconsultaprodexport.this.AV58BarTipArtfrom = aP17;
      listconsultaprodexport.this.AV59BarTipArtto = aP18;
      listconsultaprodexport.this.AV50BarColNomfrom = aP19;
      listconsultaprodexport.this.AV51BarColNomto = aP20;
      listconsultaprodexport.this.AV52BarColnumfrom = aP21;
      listconsultaprodexport.this.AV53BarColNumto = aP22;
      listconsultaprodexport.this.AV54BarNomClifrom = aP23;
      listconsultaprodexport.this.AV55BarNomClito = aP24;
      listconsultaprodexport.this.AV56BarNumClifrom = aP25;
      listconsultaprodexport.this.AV57Barnumclito = aP26;
      listconsultaprodexport.this.AV58BarTipArtfrom = aP27;
      listconsultaprodexport.this.AV59BarTipArtto = aP28;
      listconsultaprodexport.this.AV68muestras = aP29;
      listconsultaprodexport.this.AV60BarCodfrom = aP30;
      listconsultaprodexport.this.AV61BarCodto = aP31;
      listconsultaprodexport.this.AV62BarCodreofrom = aP32;
      listconsultaprodexport.this.AV63BarCodreoto = aP33;
      listconsultaprodexport.this.AV64BarCodparfrom = aP34;
      listconsultaprodexport.this.AV65BarCodparto = aP35;
      listconsultaprodexport.this.AV66Cod_idtx = aP36;
      listconsultaprodexport.this.AV67BarGirar = aP37;
      listconsultaprodexport.this.aP38 = aP38;
      listconsultaprodexport.this.aP39 = aP39;
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
      AV11Filename = "./PrivateTempStorage/" + "ListConsultaProdExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      listconsultaprodexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV16FilterFullText, GXv_char5) ;
      listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV29VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV17Session.getValue("ListConsultaProdColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV17Session.getValue("ListConsultaProdColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).setgxTv_SdtWWPColumnsSelector_Column_Isvisible( false );
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV23ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV82GXV1));
         if ( AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV23ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setColor( 11 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16FilterFullText ,
                                           AV34bardisnumfrom ,
                                           AV35bardisnumto ,
                                           Integer.valueOf(AV36CliCodfrom) ,
                                           Integer.valueOf(AV37CliCodto) ,
                                           Byte.valueOf(AV38BarSitfrom) ,
                                           Byte.valueOf(AV39BarSitto) ,
                                           AV40barfecgenfrom ,
                                           AV41barfecgento ,
                                           AV42barfecsalfrom ,
                                           AV43barfecsalto ,
                                           AV44BarFecClifrom ,
                                           AV45barfecclito ,
                                           AV46BarFecFprfrom ,
                                           AV47barfecfprto ,
                                           AV48BarSerfrom ,
                                           AV49BarSerto ,
                                           AV50BarColNomfrom ,
                                           AV51BarColNomto ,
                                           Integer.valueOf(AV52BarColnumfrom) ,
                                           Integer.valueOf(AV53BarColNumto) ,
                                           AV54BarNomClifrom ,
                                           AV55BarNomClito ,
                                           Integer.valueOf(AV56BarNumClifrom) ,
                                           Integer.valueOf(AV57Barnumclito) ,
                                           Short.valueOf(AV58BarTipArtfrom) ,
                                           Short.valueOf(AV59BarTipArtto) ,
                                           Integer.valueOf(AV60BarCodfrom) ,
                                           Integer.valueOf(AV61BarCodto) ,
                                           Byte.valueOf(AV62BarCodreofrom) ,
                                           Byte.valueOf(AV63BarCodreoto) ,
                                           AV64BarCodparfrom ,
                                           AV65BarCodparto ,
                                           AV66Cod_idtx ,
                                           AV67BarGirar ,
                                           AV68muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Byte.valueOf(A14352CP_BARESTR) ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           A14336CP_BARKGM ,
                                           A14337CP_BARMTR ,
                                           Integer.valueOf(A14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14351CP_BARMAQC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           Short.valueOf(AV69OrderedBy) ,
                                           Boolean.valueOf(AV70OrderedDsc) ,
                                           AV33Emprcod ,
                                           A14328CP_EMPRCOD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      lV16FilterFullText = GXutil.concat( GXutil.rtrim( AV16FilterFullText), "%", "") ;
      /* Using cursor P0AD52 */
      pr_default.execute(0, new Object[] {AV33Emprcod, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, lV16FilterFullText, AV34bardisnumfrom, AV35bardisnumto, Integer.valueOf(AV36CliCodfrom), Integer.valueOf(AV37CliCodto), Byte.valueOf(AV38BarSitfrom), Byte.valueOf(AV39BarSitto), AV40barfecgenfrom, AV41barfecgento, AV42barfecsalfrom, AV43barfecsalto, AV44BarFecClifrom, AV45barfecclito, AV46BarFecFprfrom, AV47barfecfprto, AV48BarSerfrom, AV49BarSerto, AV50BarColNomfrom, AV51BarColNomto, Integer.valueOf(AV52BarColnumfrom), Integer.valueOf(AV53BarColNumto), AV54BarNomClifrom, AV55BarNomClito, Integer.valueOf(AV56BarNumClifrom), Integer.valueOf(AV57Barnumclito), Short.valueOf(AV58BarTipArtfrom), Short.valueOf(AV59BarTipArtto), Integer.valueOf(AV60BarCodfrom), Integer.valueOf(AV61BarCodto), Byte.valueOf(AV62BarCodreofrom), Byte.valueOf(AV63BarCodreoto), AV64BarCodparfrom, AV65BarCodparto, AV66Cod_idtx, AV67BarGirar, AV68muestras});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14306CP_BARPLF = P0AD52_A14306CP_BARPLF[0] ;
         A14305CP_BARNUMC = P0AD52_A14305CP_BARNUMC[0] ;
         A14304CP_BARFECF = P0AD52_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = P0AD52_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = P0AD52_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = P0AD52_A14308CP_BARFECG[0] ;
         A14328CP_EMPRCOD = P0AD52_A14328CP_EMPRCOD[0] ;
         A14351CP_BARMAQC = P0AD52_A14351CP_BARMAQC[0] ;
         A14341CP_DISUSRC = P0AD52_A14341CP_DISUSRC[0] ;
         A14334CP_DSC_BAR = P0AD52_A14334CP_DSC_BAR[0] ;
         A14323CP_BARPROP = P0AD52_A14323CP_BARPROP[0] ;
         A14317CP_BARGIRA = P0AD52_A14317CP_BARGIRA[0] ;
         A14340CP_BARALBM = P0AD52_A14340CP_BARALBM[0] ;
         A14339CP_BARALBK = P0AD52_A14339CP_BARALBK[0] ;
         A14307CP_BARSIT = P0AD52_A14307CP_BARSIT[0] ;
         A14338CP_BARPIE = P0AD52_A14338CP_BARPIE[0] ;
         A14337CP_BARMTR = P0AD52_A14337CP_BARMTR[0] ;
         A14336CP_BARKGM = P0AD52_A14336CP_BARKGM[0] ;
         A14315CP_BARNOMC = P0AD52_A14315CP_BARNOMC[0] ;
         A14332CP_BARCOLU = P0AD52_A14332CP_BARCOLU[0] ;
         A14331CP_BARCOLO = P0AD52_A14331CP_BARCOLO[0] ;
         A14343CP_TARTDSC = P0AD52_A14343CP_TARTDSC[0] ;
         A14316CP_BARTIPA = P0AD52_A14316CP_BARTIPA[0] ;
         A14312CP_BARSERD = P0AD52_A14312CP_BARSERD[0] ;
         A14311CP_BARSER = P0AD52_A14311CP_BARSER[0] ;
         A14319CP_BARAGRE = P0AD52_A14319CP_BARAGRE[0] ;
         A14303CP_BARCODP = P0AD52_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = P0AD52_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = P0AD52_A14301CP_BARCOD[0] ;
         A14352CP_BARESTR = P0AD52_A14352CP_BARESTR[0] ;
         A14324CP_BARDISN = P0AD52_A14324CP_BARDISN[0] ;
         A14327CP_CLINOM = P0AD52_A14327CP_CLINOM[0] ;
         A14326CP_CLICOD = P0AD52_A14326CP_CLICOD[0] ;
         A14297CP_ID = P0AD52_A14297CP_ID[0] ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV29VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14326CP_CLICOD );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14327CP_CLINOM, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14324CP_BARDISN, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( "" );
            if ( A14352CP_BARESTR == 0 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( "- " );
            }
            else if ( A14352CP_BARESTR == 1 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( "-" );
            }
            else if ( A14352CP_BARESTR == 2 )
            {
               AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( httpContext.getMessage( "RC", "") );
            }
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14301CP_BARCOD );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14302CP_BARCODR );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14303CP_BARCODP, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14319CP_BARAGRE, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14311CP_BARSER, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14312CP_BARSERD, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14316CP_BARTIPA );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14343CP_TARTDSC, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14331CP_BARCOLO, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14332CP_BARCOLU );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14315CP_BARNOMC, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14336CP_BARKGM)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14337CP_BARMTR)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14338CP_BARPIE );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( A14307CP_BARSIT );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14308CP_BARFECG );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14309CP_BARFECC );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14304CP_BARFECF );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A14310CP_BARFECS );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14339CP_BARALBK)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A14340CP_BARALBM)) );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14317CP_BARGIRA, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14323CP_BARPROP, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14334CP_DSC_BAR, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14341CP_DISUSRC, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14351CP_BARMAQC, GXv_char5) ;
            listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV29VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV29VisibleColumnCount = (long)(AV29VisibleColumnCount+1) ;
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
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_CLICOD", "", "Cliente", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_CLINOM", "", "Nombre", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARDISNUM", "", "Ped. Cli.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARESTR", "", "Tipo", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOD", "", "Nº Hdr", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCODREO", "", "R", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCODPAR", "", "P", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARAGREST", "", "A?", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSER", "", "Articulo", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSERDSC", "", "Descripcion", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARTIPART", "", "Tip. Art.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_TARTDSC", "", "Descripcion", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOLO", "", "Color", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARCOLU", "", "Numero", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARNOMCLI", "", "Color Cli.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARKGM", "", "KIlos", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARMTR", "", "Metros", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARPIE", "", "Piezas", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARSIT", "", "Sit.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECGEN", "Fecha", "Fecha HDR", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECCLI", "Fecha", "Ped. Cli.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECFPR", "Fecha", "Ent. Prev.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARFECSAL", "", "Salida", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarFasCod", "", "Ult. Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarFasSig", "", "Sig. Fase", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbUltimo", "", "Ultimo Alb.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARALBK", "", "Kgs. Sal.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARALBM", "", "Mts. Sal.", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbFact", "", "Factura", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARGIRAR", "", "Coleccion", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARPROPER", "", "Ctw", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_DSC_BAR", "", "Descripcion", false, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_DISUSRC", "", "Usuario", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CP_BARMAQCD", "", "Maquina", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char4 = AV25UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListConsultaProdColumnsSelector", GXv_char5) ;
      listconsultaprodexport.this.GXt_char4 = GXv_char5[0] ;
      AV25UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV17Session.getValue("ListConsultaProdGridState"), "") == 0 )
      {
         AV19GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListConsultaProdGridState"), null, null);
      }
      else
      {
         AV19GridState.fromxml(AV17Session.getValue("ListConsultaProdGridState"), null, null);
      }
      AV69OrderedBy = AV19GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV70OrderedDsc = AV19GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV2 = 1 ;
      while ( AV84GXV2 <= AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV20GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV19GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV2));
         if ( GXutil.strcmp(AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV20GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      this.aP38[0] = listconsultaprodexport.this.AV11Filename;
      this.aP39[0] = listconsultaprodexport.this.AV12ErrorMessage;
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
      GXv_exceldoc2 = new com.genexus.gxoffice.ExcelDoc[1] ;
      GXv_int3 = new short[1] ;
      AV16FilterFullText = "" ;
      AV17Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV23ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      scmdbuf = "" ;
      lV16FilterFullText = "" ;
      A14327CP_CLINOM = "" ;
      A14324CP_BARDISN = "" ;
      A14303CP_BARCODP = "" ;
      A14319CP_BARAGRE = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14343CP_TARTDSC = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      A14351CP_BARMAQC = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      A14328CP_EMPRCOD = "" ;
      P0AD52_A14306CP_BARPLF = new String[] {""} ;
      P0AD52_A14305CP_BARNUMC = new int[1] ;
      P0AD52_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD52_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD52_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD52_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0AD52_A14328CP_EMPRCOD = new String[] {""} ;
      P0AD52_A14351CP_BARMAQC = new String[] {""} ;
      P0AD52_A14341CP_DISUSRC = new String[] {""} ;
      P0AD52_A14334CP_DSC_BAR = new String[] {""} ;
      P0AD52_A14323CP_BARPROP = new String[] {""} ;
      P0AD52_A14317CP_BARGIRA = new String[] {""} ;
      P0AD52_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD52_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD52_A14307CP_BARSIT = new byte[1] ;
      P0AD52_A14338CP_BARPIE = new int[1] ;
      P0AD52_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD52_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AD52_A14315CP_BARNOMC = new String[] {""} ;
      P0AD52_A14332CP_BARCOLU = new int[1] ;
      P0AD52_A14331CP_BARCOLO = new String[] {""} ;
      P0AD52_A14343CP_TARTDSC = new String[] {""} ;
      P0AD52_A14316CP_BARTIPA = new short[1] ;
      P0AD52_A14312CP_BARSERD = new String[] {""} ;
      P0AD52_A14311CP_BARSER = new String[] {""} ;
      P0AD52_A14319CP_BARAGRE = new String[] {""} ;
      P0AD52_A14303CP_BARCODP = new String[] {""} ;
      P0AD52_A14302CP_BARCODR = new byte[1] ;
      P0AD52_A14301CP_BARCOD = new int[1] ;
      P0AD52_A14352CP_BARESTR = new byte[1] ;
      P0AD52_A14324CP_BARDISN = new String[] {""} ;
      P0AD52_A14327CP_CLINOM = new String[] {""} ;
      P0AD52_A14326CP_CLICOD = new int[1] ;
      P0AD52_A14297CP_ID = new long[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      AV25UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV19GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV20GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listconsultaprodexport__default(),
         new Object[] {
             new Object[] {
            P0AD52_A14306CP_BARPLF, P0AD52_A14305CP_BARNUMC, P0AD52_A14304CP_BARFECF, P0AD52_A14309CP_BARFECC, P0AD52_A14310CP_BARFECS, P0AD52_A14308CP_BARFECG, P0AD52_A14328CP_EMPRCOD, P0AD52_A14351CP_BARMAQC, P0AD52_A14341CP_DISUSRC, P0AD52_A14334CP_DSC_BAR,
            P0AD52_A14323CP_BARPROP, P0AD52_A14317CP_BARGIRA, P0AD52_A14340CP_BARALBM, P0AD52_A14339CP_BARALBK, P0AD52_A14307CP_BARSIT, P0AD52_A14338CP_BARPIE, P0AD52_A14337CP_BARMTR, P0AD52_A14336CP_BARKGM, P0AD52_A14315CP_BARNOMC, P0AD52_A14332CP_BARCOLU,
            P0AD52_A14331CP_BARCOLO, P0AD52_A14343CP_TARTDSC, P0AD52_A14316CP_BARTIPA, P0AD52_A14312CP_BARSERD, P0AD52_A14311CP_BARSER, P0AD52_A14319CP_BARAGRE, P0AD52_A14303CP_BARCODP, P0AD52_A14302CP_BARCODR, P0AD52_A14301CP_BARCOD, P0AD52_A14352CP_BARESTR,
            P0AD52_A14324CP_BARDISN, P0AD52_A14327CP_CLINOM, P0AD52_A14326CP_CLICOD, P0AD52_A14297CP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV38BarSitfrom ;
   private byte AV39BarSitto ;
   private byte AV62BarCodreofrom ;
   private byte AV63BarCodreoto ;
   private byte A14352CP_BARESTR ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private short AV58BarTipArtfrom ;
   private short AV59BarTipArtto ;
   private short GXv_int3[] ;
   private short A14316CP_BARTIPA ;
   private short AV69OrderedBy ;
   private short Gx_err ;
   private int AV36CliCodfrom ;
   private int AV37CliCodto ;
   private int AV52BarColnumfrom ;
   private int AV53BarColNumto ;
   private int AV56BarNumClifrom ;
   private int AV57Barnumclito ;
   private int AV60BarCodfrom ;
   private int AV61BarCodto ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV82GXV1 ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int A14305CP_BARNUMC ;
   private int AV84GXV2 ;
   private long AV29VisibleColumnCount ;
   private long A14297CP_ID ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String AV33Emprcod ;
   private String AV34bardisnumfrom ;
   private String AV35bardisnumto ;
   private String AV48BarSerfrom ;
   private String AV49BarSerto ;
   private String AV50BarColNomfrom ;
   private String AV51BarColNomto ;
   private String AV54BarNomClifrom ;
   private String AV55BarNomClito ;
   private String AV68muestras ;
   private String AV64BarCodparfrom ;
   private String AV65BarCodparto ;
   private String AV66Cod_idtx ;
   private String AV67BarGirar ;
   private String scmdbuf ;
   private String A14324CP_BARDISN ;
   private String A14303CP_BARCODP ;
   private String A14319CP_BARAGRE ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14323CP_BARPROP ;
   private String A14341CP_DISUSRC ;
   private String A14351CP_BARMAQC ;
   private String A14306CP_BARPLF ;
   private String A14328CP_EMPRCOD ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date AV40barfecgenfrom ;
   private java.util.Date AV41barfecgento ;
   private java.util.Date AV44BarFecClifrom ;
   private java.util.Date AV45barfecclito ;
   private java.util.Date AV46BarFecFprfrom ;
   private java.util.Date AV47barfecfprto ;
   private java.util.Date AV42barfecsalfrom ;
   private java.util.Date AV43barfecsalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private boolean returnInSub ;
   private boolean AV70OrderedDsc ;
   private String AV24ColumnsSelectorXML ;
   private String AV25UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV16FilterFullText ;
   private String lV16FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private com.genexus.webpanels.WebSession AV17Session ;
   private String[] aP39 ;
   private String[] aP38 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AD52_A14306CP_BARPLF ;
   private int[] P0AD52_A14305CP_BARNUMC ;
   private java.util.Date[] P0AD52_A14304CP_BARFECF ;
   private java.util.Date[] P0AD52_A14309CP_BARFECC ;
   private java.util.Date[] P0AD52_A14310CP_BARFECS ;
   private java.util.Date[] P0AD52_A14308CP_BARFECG ;
   private String[] P0AD52_A14328CP_EMPRCOD ;
   private String[] P0AD52_A14351CP_BARMAQC ;
   private String[] P0AD52_A14341CP_DISUSRC ;
   private String[] P0AD52_A14334CP_DSC_BAR ;
   private String[] P0AD52_A14323CP_BARPROP ;
   private String[] P0AD52_A14317CP_BARGIRA ;
   private java.math.BigDecimal[] P0AD52_A14340CP_BARALBM ;
   private java.math.BigDecimal[] P0AD52_A14339CP_BARALBK ;
   private byte[] P0AD52_A14307CP_BARSIT ;
   private int[] P0AD52_A14338CP_BARPIE ;
   private java.math.BigDecimal[] P0AD52_A14337CP_BARMTR ;
   private java.math.BigDecimal[] P0AD52_A14336CP_BARKGM ;
   private String[] P0AD52_A14315CP_BARNOMC ;
   private int[] P0AD52_A14332CP_BARCOLU ;
   private String[] P0AD52_A14331CP_BARCOLO ;
   private String[] P0AD52_A14343CP_TARTDSC ;
   private short[] P0AD52_A14316CP_BARTIPA ;
   private String[] P0AD52_A14312CP_BARSERD ;
   private String[] P0AD52_A14311CP_BARSER ;
   private String[] P0AD52_A14319CP_BARAGRE ;
   private String[] P0AD52_A14303CP_BARCODP ;
   private byte[] P0AD52_A14302CP_BARCODR ;
   private int[] P0AD52_A14301CP_BARCOD ;
   private byte[] P0AD52_A14352CP_BARESTR ;
   private String[] P0AD52_A14324CP_BARDISN ;
   private String[] P0AD52_A14327CP_CLINOM ;
   private int[] P0AD52_A14326CP_CLICOD ;
   private long[] P0AD52_A14297CP_ID ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV19GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV20GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV23ColumnsSelector_Column ;
}

final  class listconsultaprodexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AD52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV16FilterFullText ,
                                          String AV34bardisnumfrom ,
                                          String AV35bardisnumto ,
                                          int AV36CliCodfrom ,
                                          int AV37CliCodto ,
                                          byte AV38BarSitfrom ,
                                          byte AV39BarSitto ,
                                          java.util.Date AV40barfecgenfrom ,
                                          java.util.Date AV41barfecgento ,
                                          java.util.Date AV42barfecsalfrom ,
                                          java.util.Date AV43barfecsalto ,
                                          java.util.Date AV44BarFecClifrom ,
                                          java.util.Date AV45barfecclito ,
                                          java.util.Date AV46BarFecFprfrom ,
                                          java.util.Date AV47barfecfprto ,
                                          String AV48BarSerfrom ,
                                          String AV49BarSerto ,
                                          String AV50BarColNomfrom ,
                                          String AV51BarColNomto ,
                                          int AV52BarColnumfrom ,
                                          int AV53BarColNumto ,
                                          String AV54BarNomClifrom ,
                                          String AV55BarNomClito ,
                                          int AV56BarNumClifrom ,
                                          int AV57Barnumclito ,
                                          short AV58BarTipArtfrom ,
                                          short AV59BarTipArtto ,
                                          int AV60BarCodfrom ,
                                          int AV61BarCodto ,
                                          byte AV62BarCodreofrom ,
                                          byte AV63BarCodreoto ,
                                          String AV64BarCodparfrom ,
                                          String AV65BarCodparto ,
                                          String AV66Cod_idtx ,
                                          String AV67BarGirar ,
                                          String AV68muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          byte A14352CP_BARESTR ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          String A14351CP_BARMAQC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          short AV69OrderedBy ,
                                          boolean AV70OrderedDsc ,
                                          String AV33Emprcod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[62];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT CP_BARPLF, CP_BARNUMC, CP_BARFECF, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_EMPRCOD, CP_BARMAQC, CP_DISUSRC, CP_DSC_BAR, CP_BARPROP, CP_BARGIRA, CP_BARALBM," ;
      scmdbuf += " CP_BARALBK, CP_BARSIT, CP_BARPIE, CP_BARMTR, CP_BARKGM, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_TARTDSC, CP_BARTIPA, CP_BARSERD, CP_BARSER, CP_BARAGRE, CP_BARCODP," ;
      scmdbuf += " CP_BARCODR, CP_BARCOD, CP_BARESTR, CP_BARDISN, CP_CLINOM, CP_CLICOD, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV16FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARESTR,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)) or ( UPPER(CP_BARMAQC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
         GXv_int9[2] = (byte)(1) ;
         GXv_int9[3] = (byte)(1) ;
         GXv_int9[4] = (byte)(1) ;
         GXv_int9[5] = (byte)(1) ;
         GXv_int9[6] = (byte)(1) ;
         GXv_int9[7] = (byte)(1) ;
         GXv_int9[8] = (byte)(1) ;
         GXv_int9[9] = (byte)(1) ;
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
         GXv_int9[16] = (byte)(1) ;
         GXv_int9[17] = (byte)(1) ;
         GXv_int9[18] = (byte)(1) ;
         GXv_int9[19] = (byte)(1) ;
         GXv_int9[20] = (byte)(1) ;
         GXv_int9[21] = (byte)(1) ;
         GXv_int9[22] = (byte)(1) ;
         GXv_int9[23] = (byte)(1) ;
         GXv_int9[24] = (byte)(1) ;
         GXv_int9[25] = (byte)(1) ;
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35bardisnumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV36CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV37CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV38BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV39BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45barfecclito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47barfecfprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( ! (0==AV52BarColnumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (0==AV53BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! (0==AV56BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (0==AV57Barnumclito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( ! (0==AV58BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (0==AV59BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV60BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (0==AV61BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( ! (0==AV62BarCodreofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( ! (0==AV63BarCodreoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarCodparto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV69OrderedBy == 1 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLICOD" ;
      }
      else if ( ( AV69OrderedBy == 1 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLICOD DESC" ;
      }
      else if ( ( AV69OrderedBy == 2 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_CLINOM" ;
      }
      else if ( ( AV69OrderedBy == 2 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_CLINOM DESC" ;
      }
      else if ( ( AV69OrderedBy == 3 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARDISN" ;
      }
      else if ( ( AV69OrderedBy == 3 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARDISN DESC" ;
      }
      else if ( ( AV69OrderedBy == 4 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARESTR" ;
      }
      else if ( ( AV69OrderedBy == 4 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARESTR DESC" ;
      }
      else if ( ( AV69OrderedBy == 5 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOD" ;
      }
      else if ( ( AV69OrderedBy == 5 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOD DESC" ;
      }
      else if ( ( AV69OrderedBy == 6 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODR" ;
      }
      else if ( ( AV69OrderedBy == 6 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODR DESC" ;
      }
      else if ( ( AV69OrderedBy == 7 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCODP" ;
      }
      else if ( ( AV69OrderedBy == 7 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCODP DESC" ;
      }
      else if ( ( AV69OrderedBy == 8 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARAGRE" ;
      }
      else if ( ( AV69OrderedBy == 8 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARAGRE DESC" ;
      }
      else if ( ( AV69OrderedBy == 9 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSER" ;
      }
      else if ( ( AV69OrderedBy == 9 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSER DESC" ;
      }
      else if ( ( AV69OrderedBy == 10 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSERD" ;
      }
      else if ( ( AV69OrderedBy == 10 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSERD DESC" ;
      }
      else if ( ( AV69OrderedBy == 11 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARTIPA" ;
      }
      else if ( ( AV69OrderedBy == 11 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARTIPA DESC" ;
      }
      else if ( ( AV69OrderedBy == 12 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_TARTDSC" ;
      }
      else if ( ( AV69OrderedBy == 12 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_TARTDSC DESC" ;
      }
      else if ( ( AV69OrderedBy == 13 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLO" ;
      }
      else if ( ( AV69OrderedBy == 13 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLO DESC" ;
      }
      else if ( ( AV69OrderedBy == 14 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARCOLU" ;
      }
      else if ( ( AV69OrderedBy == 14 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARCOLU DESC" ;
      }
      else if ( ( AV69OrderedBy == 15 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARNOMC" ;
      }
      else if ( ( AV69OrderedBy == 15 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARNOMC DESC" ;
      }
      else if ( ( AV69OrderedBy == 16 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARKGM" ;
      }
      else if ( ( AV69OrderedBy == 16 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARKGM DESC" ;
      }
      else if ( ( AV69OrderedBy == 17 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARMTR" ;
      }
      else if ( ( AV69OrderedBy == 17 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARMTR DESC" ;
      }
      else if ( ( AV69OrderedBy == 18 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARPIE" ;
      }
      else if ( ( AV69OrderedBy == 18 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARPIE DESC" ;
      }
      else if ( ( AV69OrderedBy == 19 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARSIT" ;
      }
      else if ( ( AV69OrderedBy == 19 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARSIT DESC" ;
      }
      else if ( ( AV69OrderedBy == 20 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECG" ;
      }
      else if ( ( AV69OrderedBy == 20 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECG DESC" ;
      }
      else if ( ( AV69OrderedBy == 21 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECC" ;
      }
      else if ( ( AV69OrderedBy == 21 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECC DESC" ;
      }
      else if ( ( AV69OrderedBy == 22 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECF" ;
      }
      else if ( ( AV69OrderedBy == 22 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECF DESC" ;
      }
      else if ( ( AV69OrderedBy == 23 ) && ! AV70OrderedDsc )
      {
         scmdbuf += " ORDER BY CP_BARFECS" ;
      }
      else if ( ( AV69OrderedBy == 23 ) && ( AV70OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CP_BARFECS DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P0AD52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).shortValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (java.math.BigDecimal)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , (java.util.Date)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , ((Boolean) dynConstraints[69]).booleanValue() , (String)dynConstraints[70] , (String)dynConstraints[71] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 13);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getVarchar(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 16);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((String[]) buf[26])[0] = rslt.getString(27, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 8);
               ((String[]) buf[31])[0] = rslt.getVarchar(32);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((long[]) buf[33])[0] = rslt.getLong(34);
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
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[118]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 4);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 20);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               return;
      }
   }

}

