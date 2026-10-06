package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wchistoricorecetaslcontiexport extends GXProcedure
{
   public wchistoricorecetaslcontiexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wchistoricorecetaslcontiexport.class ), "" );
   }

   public wchistoricorecetaslcontiexport( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      wchistoricorecetaslcontiexport.this.aP1 = new String[] {""};
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
      wchistoricorecetaslcontiexport.this.aP0 = aP0;
      wchistoricorecetaslcontiexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "WCHistoricoRecetasLcontiExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      wchistoricorecetaslcontiexport.this.AV13CellRow = GXv_int3[0] ;
      GXt_char4 = "" ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( AV40FilterFullText, GXv_char5) ;
      wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
      AV10ExcelDocument.Cells(AV13CellRow, AV14FirstColumn+1, 1, 1).setText( GXt_char4 );
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV58VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV41Session.getValue("WCHistoricoRecetasLcontiColumnsSelector"), "") != 0 )
      {
         AV53ColumnsSelectorXML = AV41Session.getValue("WCHistoricoRecetasLcontiColumnsSelector") ;
         AV50ColumnsSelector.fromxml(AV53ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV52ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV102GXV1));
         if ( AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV52ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setColor( 11 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV104Wchistoricorecetaslcontids_1_filterfulltext = AV40FilterFullText ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV104Wchistoricorecetaslcontids_1_filterfulltext ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV39OrderedDsc) ,
                                           A13759EstFecCier ,
                                           AV17Fec1 ,
                                           AV18Fec3 ,
                                           Integer.valueOf(AV19PCliCod) ,
                                           Integer.valueOf(AV20CliCodP) ,
                                           Integer.valueOf(AV21PBarCod) ,
                                           Integer.valueOf(AV22Barcodp) ,
                                           Byte.valueOf(AV23PBarCodReo) ,
                                           Byte.valueOf(AV24BarCodReoP) ,
                                           AV25PBarCodPar ,
                                           AV26BarCodParP ,
                                           AV27PSerie ,
                                           AV28SerieP ,
                                           AV29PColor ,
                                           AV30ColorP ,
                                           Integer.valueOf(AV31PColNum) ,
                                           Integer.valueOf(AV32ColNumP) ,
                                           AV33DispCli1 ,
                                           AV34DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV35HreRacab ,
                                           AV36MaqCodi ,
                                           AV37MaqCod3 ,
                                           AV16Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      /* Using cursor P08YG2 */
      pr_default.execute(0, new Object[] {AV16Emprcod, AV17Fec1, AV18Fec3, Integer.valueOf(AV19PCliCod), Integer.valueOf(AV20CliCodP), Integer.valueOf(AV21PBarCod), Integer.valueOf(AV22Barcodp), Byte.valueOf(AV23PBarCodReo), Byte.valueOf(AV24BarCodReoP), AV25PBarCodPar, AV26BarCodParP, AV27PSerie, AV28SerieP, AV29PColor, AV30ColorP, Integer.valueOf(AV31PColNum), Integer.valueOf(AV32ColNumP), AV33DispCli1, AV34DispCli3, AV35HreRacab, AV35HreRacab, AV36MaqCodi, AV37MaqCod3, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext, lV104Wchistoricorecetaslcontids_1_filterfulltext});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6634BarRecAcb = P08YG2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YG2_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08YG2_A13759EstFecCier[0] ;
         A396EmprCod = P08YG2_A396EmprCod[0] ;
         A3650BarNumAna = P08YG2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YG2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YG2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YG2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YG2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YG2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YG2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YG2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YG2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YG2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YG2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YG2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YG2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YG2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YG2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YG2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YG2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YG2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YG2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YG2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YG2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YG2_n1940BarColNoT[0] ;
         A1937BarDscTin = P08YG2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YG2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YG2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YG2_n1936BarSerTin[0] ;
         A279CliNom = P08YG2_A279CliNom[0] ;
         A252CliCod = P08YG2_A252CliCod[0] ;
         A2316BarAgrLot = P08YG2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YG2_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08YG2_A1929EstTinNr[0] ;
         A3705BarCosCol = P08YG2_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YG2_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YG2_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YG2_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YG2_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YG2_n3654BarCosPD[0] ;
         A3706BarCosAnc = P08YG2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YG2_n3706BarCosAnc[0] ;
         A3657BarCosAA = P08YG2_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YG2_n3657BarCosAA[0] ;
         A3656BarCosAD = P08YG2_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YG2_n3656BarCosAD[0] ;
         A1935BarParTin = P08YG2_A1935BarParTin[0] ;
         n1935BarParTin = P08YG2_n1935BarParTin[0] ;
         A1934BarReoTin = P08YG2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YG2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YG2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YG2_n1933BarCodTin[0] ;
         A3646EstTinAny = P08YG2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YG2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YG2_A3648EstTinDia[0] ;
         A279CliNom = P08YG2_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
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
         AV58VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime6 = GXutil.resetTime( A13759EstFecCier );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setDate( GXt_dtime6 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1929EstTinNr );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13841Barnhdr_lc, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2316BarAgrLot, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1936BarSerTin, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1937BarDscTin, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1940BarColNoT, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1941BarColNuT );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1942BarTipCoT );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1947BarKgmTin)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A8563BarKgsTt)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1948BarMtrTin)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A12993BarMtsTt)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char5[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1945BarMaqTin, GXv_char5) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char5[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A1946BarVolTin );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int7 = AV45ForNumArc ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_char9[0] = A1936BarSerTin ;
            GXv_char10[0] = A1940BarColNoT ;
            GXv_int11[0] = A1941BarColNuT ;
            GXv_int12[0] = A1942BarTipCoT ;
            GXv_int13[0] = GXt_int7 ;
            new app.pleoarc(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char9, GXv_char10, GXv_int11, GXv_int12, GXv_int13) ;
            wchistoricorecetaslcontiexport.this.A396EmprCod = GXv_char5[0] ;
            wchistoricorecetaslcontiexport.this.A252CliCod = GXv_int8[0] ;
            wchistoricorecetaslcontiexport.this.A1936BarSerTin = GXv_char9[0] ;
            wchistoricorecetaslcontiexport.this.A1940BarColNoT = GXv_char10[0] ;
            wchistoricorecetaslcontiexport.this.A1941BarColNuT = GXv_int11[0] ;
            wchistoricorecetaslcontiexport.this.A1942BarTipCoT = GXv_int12[0] ;
            wchistoricorecetaslcontiexport.this.GXt_int7 = GXv_int13[0] ;
            AV45ForNumArc = GXt_int7 ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( AV45ForNumArc );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char4 = "" ;
            GXv_char10[0] = GXt_char4 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A11762BarDispCli, GXv_char10) ;
            wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char10[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setText( GXt_char4 );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( A3650BarNumAna );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV46CostesI = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV46CostesI)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV47CostesA = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV47CostesA)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (AV46CostesI.add(AV47CostesA)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV48CosteKg)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV49CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (AV46CostesI.add(AV47CostesA)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV58VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV49CosteMT)) );
            AV58VisibleColumnCount = (long)(AV58VisibleColumnCount+1) ;
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
      AV50ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EstFecCier", "", "Fecha", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "EstTinNr", "", "#", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "Barnhdr_lconti", "", "Hdr", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarAgrLot", "", "Lote", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliCod", "", "Cliente", false, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "CliNom", "", "Nombre Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarSerTin", "", "Articulo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarDscTin", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNoT", "", "Color", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarColNuT", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarTipCoT", "", "Tc", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarKgmTin", "", "Kgs", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMtrTin", "", "Mts", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarMaqTin", "", "Maquina", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarVolTin", "", "Volumen", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&ForNumArc", "", "Nº Ensayo", false, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarDispCli", "", "Disp Cli", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "BarNumAna", "", "Nº Adi", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CostesI", "", "Costes I", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CostesA", "", "Costes Ad", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CosteKg", "", "Coste kg", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "&CosteMT", "", "Coste mt", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char4 = AV54UserCustomValue ;
      GXv_char10[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCHistoricoRecetasLcontiColumnsSelector", GXv_char10) ;
      wchistoricorecetaslcontiexport.this.GXt_char4 = GXv_char10[0] ;
      AV54UserCustomValue = GXt_char4 ;
      if ( ! ( (GXutil.strcmp("", AV54UserCustomValue)==0) ) )
      {
         AV51ColumnsSelectorAux.fromxml(AV54UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV51ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV50ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV51ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV50ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("WCHistoricoRecetasLcontiGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCHistoricoRecetasLcontiGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("WCHistoricoRecetasLcontiGridState"), null, null);
      }
      AV38OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV39OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV2 = 1 ;
      while ( AV105GXV2 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV2));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV16Emprcod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV17Fec1 = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV18Fec3 = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV19PCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV20CliCodP = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV21PBarCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV22Barcodp = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV23PBarCodReo = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV24BarCodReoP = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV25PBarCodPar = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV26BarCodParP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV27PSerie = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV28SerieP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV29PColor = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV30ColorP = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV31PColNum = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV32ColNumP = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV33DispCli1 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV34DispCli3 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV35HreRacab = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV36MaqCodi = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV37MaqCod3 = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV105GXV2 = (int)(AV105GXV2+1) ;
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
      this.aP0[0] = wchistoricorecetaslcontiexport.this.AV11Filename;
      this.aP1[0] = wchistoricorecetaslcontiexport.this.AV12ErrorMessage;
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
      AV40FilterFullText = "" ;
      AV41Session = httpContext.getWebSession();
      AV53ColumnsSelectorXML = "" ;
      AV50ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV52ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      A13759EstFecCier = GXutil.nullDate() ;
      A13841Barnhdr_lc = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A396EmprCod = "" ;
      A11762BarDispCli = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      AV104Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV104Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      A1935BarParTin = "" ;
      AV17Fec1 = GXutil.nullDate() ;
      AV18Fec3 = GXutil.nullDate() ;
      AV25PBarCodPar = "" ;
      AV26BarCodParP = "" ;
      AV27PSerie = "" ;
      AV28SerieP = "" ;
      AV29PColor = "" ;
      AV30ColorP = "" ;
      AV33DispCli1 = "" ;
      AV34DispCli3 = "" ;
      A6634BarRecAcb = "" ;
      AV35HreRacab = "" ;
      AV36MaqCodi = "" ;
      AV37MaqCod3 = "" ;
      AV16Emprcod = "" ;
      P08YG2_A6634BarRecAcb = new String[] {""} ;
      P08YG2_n6634BarRecAcb = new boolean[] {false} ;
      P08YG2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YG2_A396EmprCod = new String[] {""} ;
      P08YG2_A3650BarNumAna = new short[1] ;
      P08YG2_n3650BarNumAna = new boolean[] {false} ;
      P08YG2_A11762BarDispCli = new String[] {""} ;
      P08YG2_n11762BarDispCli = new boolean[] {false} ;
      P08YG2_A1946BarVolTin = new int[1] ;
      P08YG2_n1946BarVolTin = new boolean[] {false} ;
      P08YG2_A1945BarMaqTin = new String[] {""} ;
      P08YG2_n1945BarMaqTin = new boolean[] {false} ;
      P08YG2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n12993BarMtsTt = new boolean[] {false} ;
      P08YG2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n1948BarMtrTin = new boolean[] {false} ;
      P08YG2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n8563BarKgsTt = new boolean[] {false} ;
      P08YG2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n1947BarKgmTin = new boolean[] {false} ;
      P08YG2_A1942BarTipCoT = new byte[1] ;
      P08YG2_n1942BarTipCoT = new boolean[] {false} ;
      P08YG2_A1941BarColNuT = new int[1] ;
      P08YG2_n1941BarColNuT = new boolean[] {false} ;
      P08YG2_A1940BarColNoT = new String[] {""} ;
      P08YG2_n1940BarColNoT = new boolean[] {false} ;
      P08YG2_A1937BarDscTin = new String[] {""} ;
      P08YG2_n1937BarDscTin = new boolean[] {false} ;
      P08YG2_A1936BarSerTin = new String[] {""} ;
      P08YG2_n1936BarSerTin = new boolean[] {false} ;
      P08YG2_A279CliNom = new String[] {""} ;
      P08YG2_A252CliCod = new int[1] ;
      P08YG2_A2316BarAgrLot = new String[] {""} ;
      P08YG2_n2316BarAgrLot = new boolean[] {false} ;
      P08YG2_A1929EstTinNr = new short[1] ;
      P08YG2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3705BarCosCol = new boolean[] {false} ;
      P08YG2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3658BarCosPA = new boolean[] {false} ;
      P08YG2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3654BarCosPD = new boolean[] {false} ;
      P08YG2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3706BarCosAnc = new boolean[] {false} ;
      P08YG2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3657BarCosAA = new boolean[] {false} ;
      P08YG2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YG2_n3656BarCosAD = new boolean[] {false} ;
      P08YG2_A1935BarParTin = new String[] {""} ;
      P08YG2_n1935BarParTin = new boolean[] {false} ;
      P08YG2_A1934BarReoTin = new byte[1] ;
      P08YG2_n1934BarReoTin = new boolean[] {false} ;
      P08YG2_A1933BarCodTin = new int[1] ;
      P08YG2_n1933BarCodTin = new boolean[] {false} ;
      P08YG2_A3646EstTinAny = new short[1] ;
      P08YG2_A3647EstTinMes = new byte[1] ;
      P08YG2_A3648EstTinDia = new byte[1] ;
      GXt_dtime6 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int13 = new int[1] ;
      AV46CostesI = DecimalUtil.ZERO ;
      AV47CostesA = DecimalUtil.ZERO ;
      AV48CosteKg = DecimalUtil.ZERO ;
      AV49CosteMT = DecimalUtil.ZERO ;
      AV54UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char10 = new String[1] ;
      AV51ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wchistoricorecetaslcontiexport__default(),
         new Object[] {
             new Object[] {
            P08YG2_A6634BarRecAcb, P08YG2_n6634BarRecAcb, P08YG2_A13759EstFecCier, P08YG2_A396EmprCod, P08YG2_A3650BarNumAna, P08YG2_n3650BarNumAna, P08YG2_A11762BarDispCli, P08YG2_n11762BarDispCli, P08YG2_A1946BarVolTin, P08YG2_n1946BarVolTin,
            P08YG2_A1945BarMaqTin, P08YG2_n1945BarMaqTin, P08YG2_A12993BarMtsTt, P08YG2_n12993BarMtsTt, P08YG2_A1948BarMtrTin, P08YG2_n1948BarMtrTin, P08YG2_A8563BarKgsTt, P08YG2_n8563BarKgsTt, P08YG2_A1947BarKgmTin, P08YG2_n1947BarKgmTin,
            P08YG2_A1942BarTipCoT, P08YG2_n1942BarTipCoT, P08YG2_A1941BarColNuT, P08YG2_n1941BarColNuT, P08YG2_A1940BarColNoT, P08YG2_n1940BarColNoT, P08YG2_A1937BarDscTin, P08YG2_n1937BarDscTin, P08YG2_A1936BarSerTin, P08YG2_n1936BarSerTin,
            P08YG2_A279CliNom, P08YG2_A252CliCod, P08YG2_A2316BarAgrLot, P08YG2_n2316BarAgrLot, P08YG2_A1929EstTinNr, P08YG2_A3705BarCosCol, P08YG2_n3705BarCosCol, P08YG2_A3658BarCosPA, P08YG2_n3658BarCosPA, P08YG2_A3654BarCosPD,
            P08YG2_n3654BarCosPD, P08YG2_A3706BarCosAnc, P08YG2_n3706BarCosAnc, P08YG2_A3657BarCosAA, P08YG2_n3657BarCosAA, P08YG2_A3656BarCosAD, P08YG2_n3656BarCosAD, P08YG2_A1935BarParTin, P08YG2_n1935BarParTin, P08YG2_A1934BarReoTin,
            P08YG2_n1934BarReoTin, P08YG2_A1933BarCodTin, P08YG2_n1933BarCodTin, P08YG2_A3646EstTinAny, P08YG2_A3647EstTinMes, P08YG2_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1942BarTipCoT ;
   private byte A1934BarReoTin ;
   private byte AV23PBarCodReo ;
   private byte AV24BarCodReoP ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte GXv_int12[] ;
   private short GXv_int3[] ;
   private short A1929EstTinNr ;
   private short A3650BarNumAna ;
   private short AV38OrderedBy ;
   private short A3646EstTinAny ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV102GXV1 ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A1933BarCodTin ;
   private int AV19PCliCod ;
   private int AV20CliCodP ;
   private int AV21PBarCod ;
   private int AV22Barcodp ;
   private int AV31PColNum ;
   private int AV32ColNumP ;
   private int AV45ForNumArc ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int13[] ;
   private int AV105GXV2 ;
   private long AV58VisibleColumnCount ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal AV46CostesI ;
   private java.math.BigDecimal AV47CostesA ;
   private java.math.BigDecimal AV48CosteKg ;
   private java.math.BigDecimal AV49CosteMT ;
   private String A13841Barnhdr_lc ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A396EmprCod ;
   private String A11762BarDispCli ;
   private String scmdbuf ;
   private String A1935BarParTin ;
   private String AV25PBarCodPar ;
   private String AV26BarCodParP ;
   private String AV27PSerie ;
   private String AV28SerieP ;
   private String AV29PColor ;
   private String AV30ColorP ;
   private String AV33DispCli1 ;
   private String AV34DispCli3 ;
   private String A6634BarRecAcb ;
   private String AV35HreRacab ;
   private String AV36MaqCodi ;
   private String AV37MaqCod3 ;
   private String AV16Emprcod ;
   private String GXv_char5[] ;
   private String GXv_char9[] ;
   private String GXt_char4 ;
   private String GXv_char10[] ;
   private java.util.Date GXt_dtime6 ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date AV17Fec1 ;
   private java.util.Date AV18Fec3 ;
   private boolean returnInSub ;
   private boolean AV39OrderedDsc ;
   private boolean n6634BarRecAcb ;
   private boolean n3650BarNumAna ;
   private boolean n11762BarDispCli ;
   private boolean n1946BarVolTin ;
   private boolean n1945BarMaqTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n1942BarTipCoT ;
   private boolean n1941BarColNuT ;
   private boolean n1940BarColNoT ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3706BarCosAnc ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private String AV53ColumnsSelectorXML ;
   private String AV54UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String AV40FilterFullText ;
   private String AV104Wchistoricorecetaslcontids_1_filterfulltext ;
   private String lV104Wchistoricorecetaslcontids_1_filterfulltext ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08YG2_A6634BarRecAcb ;
   private boolean[] P08YG2_n6634BarRecAcb ;
   private java.util.Date[] P08YG2_A13759EstFecCier ;
   private String[] P08YG2_A396EmprCod ;
   private short[] P08YG2_A3650BarNumAna ;
   private boolean[] P08YG2_n3650BarNumAna ;
   private String[] P08YG2_A11762BarDispCli ;
   private boolean[] P08YG2_n11762BarDispCli ;
   private int[] P08YG2_A1946BarVolTin ;
   private boolean[] P08YG2_n1946BarVolTin ;
   private String[] P08YG2_A1945BarMaqTin ;
   private boolean[] P08YG2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YG2_A12993BarMtsTt ;
   private boolean[] P08YG2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YG2_A1948BarMtrTin ;
   private boolean[] P08YG2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YG2_A8563BarKgsTt ;
   private boolean[] P08YG2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YG2_A1947BarKgmTin ;
   private boolean[] P08YG2_n1947BarKgmTin ;
   private byte[] P08YG2_A1942BarTipCoT ;
   private boolean[] P08YG2_n1942BarTipCoT ;
   private int[] P08YG2_A1941BarColNuT ;
   private boolean[] P08YG2_n1941BarColNuT ;
   private String[] P08YG2_A1940BarColNoT ;
   private boolean[] P08YG2_n1940BarColNoT ;
   private String[] P08YG2_A1937BarDscTin ;
   private boolean[] P08YG2_n1937BarDscTin ;
   private String[] P08YG2_A1936BarSerTin ;
   private boolean[] P08YG2_n1936BarSerTin ;
   private String[] P08YG2_A279CliNom ;
   private int[] P08YG2_A252CliCod ;
   private String[] P08YG2_A2316BarAgrLot ;
   private boolean[] P08YG2_n2316BarAgrLot ;
   private short[] P08YG2_A1929EstTinNr ;
   private java.math.BigDecimal[] P08YG2_A3705BarCosCol ;
   private boolean[] P08YG2_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YG2_A3658BarCosPA ;
   private boolean[] P08YG2_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YG2_A3654BarCosPD ;
   private boolean[] P08YG2_n3654BarCosPD ;
   private java.math.BigDecimal[] P08YG2_A3706BarCosAnc ;
   private boolean[] P08YG2_n3706BarCosAnc ;
   private java.math.BigDecimal[] P08YG2_A3657BarCosAA ;
   private boolean[] P08YG2_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YG2_A3656BarCosAD ;
   private boolean[] P08YG2_n3656BarCosAD ;
   private String[] P08YG2_A1935BarParTin ;
   private boolean[] P08YG2_n1935BarParTin ;
   private byte[] P08YG2_A1934BarReoTin ;
   private boolean[] P08YG2_n1934BarReoTin ;
   private int[] P08YG2_A1933BarCodTin ;
   private boolean[] P08YG2_n1933BarCodTin ;
   private short[] P08YG2_A3646EstTinAny ;
   private byte[] P08YG2_A3647EstTinMes ;
   private byte[] P08YG2_A3648EstTinDia ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private com.genexus.gxoffice.ExcelDoc GXv_exceldoc2[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV52ColumnsSelector_Column ;
}

final  class wchistoricorecetaslcontiexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          short AV38OrderedBy ,
                                          boolean AV39OrderedDsc ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV17Fec1 ,
                                          java.util.Date AV18Fec3 ,
                                          int AV19PCliCod ,
                                          int AV20CliCodP ,
                                          int AV21PBarCod ,
                                          int AV22Barcodp ,
                                          byte AV23PBarCodReo ,
                                          byte AV24BarCodReoP ,
                                          String AV25PBarCodPar ,
                                          String AV26BarCodParP ,
                                          String AV27PSerie ,
                                          String AV28SerieP ,
                                          String AV29PColor ,
                                          String AV30ColorP ,
                                          int AV31PColNum ,
                                          int AV32ColNumP ,
                                          String AV33DispCli1 ,
                                          String AV34DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV35HreRacab ,
                                          String AV36MaqCodi ,
                                          String AV37MaqCod3 ,
                                          String AV16Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[41];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.BarRecAcb, T1.EstFecCier, T1.EmprCod, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.BarCosAnc, T1.BarCosAA," ;
      scmdbuf += " T1.BarCosAD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV104Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
         GXv_int16[24] = (byte)(1) ;
         GXv_int16[25] = (byte)(1) ;
         GXv_int16[26] = (byte)(1) ;
         GXv_int16[27] = (byte)(1) ;
         GXv_int16[28] = (byte)(1) ;
         GXv_int16[29] = (byte)(1) ;
         GXv_int16[30] = (byte)(1) ;
         GXv_int16[31] = (byte)(1) ;
         GXv_int16[32] = (byte)(1) ;
         GXv_int16[33] = (byte)(1) ;
         GXv_int16[34] = (byte)(1) ;
         GXv_int16[35] = (byte)(1) ;
         GXv_int16[36] = (byte)(1) ;
         GXv_int16[37] = (byte)(1) ;
         GXv_int16[38] = (byte)(1) ;
         GXv_int16[39] = (byte)(1) ;
         GXv_int16[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV38OrderedBy == 1 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV38OrderedBy == 1 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV38OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV38OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV38OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV38OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV38OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV38OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumAna DESC" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P08YG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(28);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(29);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(30);
               ((byte[]) buf[54])[0] = rslt.getByte(31);
               ((byte[]) buf[55])[0] = rslt.getByte(32);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               return;
      }
   }

}

