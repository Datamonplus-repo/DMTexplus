package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_testexport extends GXProcedure
{
   public consultadeproduccion_testexport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_testexport.class ), "" );
   }

   public consultadeproduccion_testexport( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      consultadeproduccion_testexport.this.aP1 = new String[] {""};
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
      consultadeproduccion_testexport.this.aP0 = aP0;
      consultadeproduccion_testexport.this.aP1 = aP1;
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_TestExport-" + GXutil.trim( GXutil.str( AV15Random, 8, 0)) + ".xlsx" ;
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
      AV13CellRow = (int)(AV13CellRow+2) ;
   }

   public void S141( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30VisibleColumnCount = 0 ;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultadeProduccion_TestColumnsSelector"), "") != 0 )
      {
         AV25ColumnsSelectorXML = AV18Session.getValue("Produccion.ConsultadeProduccion_TestColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV25ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S151 ();
         if (returnInSub) return;
      }
      AV133GXV1 = 1 ;
      while ( AV133GXV1 <= AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().size() )
      {
         AV24ColumnsSelector_Column = (app.wwpbaseobjects.SdtWWPColumnsSelector_Column)((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+AV133GXV1));
         if ( AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( httpContext.getMessage( ((GXutil.strcmp("", AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname())==0) ? AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Columnname() : AV24ColumnsSelector_Column.getgxTv_SdtWWPColumnsSelector_Column_Displayname()), "") );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setBold( (short)(1) );
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setColor( 11 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         AV133GXV1 = (int)(AV133GXV1+1) ;
      }
   }

   public void S161( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV102bardisnumfrom ,
                                           AV103bardisnumto ,
                                           Integer.valueOf(AV42CliCodfrom) ,
                                           Integer.valueOf(AV43CliCodto) ,
                                           Byte.valueOf(AV44BarSitfrom) ,
                                           Byte.valueOf(AV45BarSitto) ,
                                           AV46BarFecGenfrom ,
                                           AV47BarFecGento ,
                                           AV104barfecsalfrom ,
                                           AV105barfecsalto ,
                                           AV106BarFecClifrom ,
                                           AV107barfecclito ,
                                           AV108BarFecFprfrom ,
                                           AV109barfecfprto ,
                                           AV110BarSerfrom ,
                                           AV111BarSerto ,
                                           AV112BarColNomfrom ,
                                           AV113BarColNomto ,
                                           Integer.valueOf(AV114BarColnumfrom) ,
                                           Integer.valueOf(AV115BarColNumto) ,
                                           AV116BarNomClifrom ,
                                           AV117BarNomClito ,
                                           Integer.valueOf(AV118BarNumClifrom) ,
                                           Integer.valueOf(AV119Barnumclito) ,
                                           Short.valueOf(AV120BarTipArtfrom) ,
                                           Short.valueOf(AV121BarTipArtto) ,
                                           AV122TFBarPlf ,
                                           Integer.valueOf(AV123BarCodfrom) ,
                                           Integer.valueOf(AV124BarCodto) ,
                                           Byte.valueOf(AV125BarCodreofrom) ,
                                           Byte.valueOf(AV126BarCodreoto) ,
                                           AV127BarCodparfrom ,
                                           AV128BarCodparto ,
                                           AV129Cod_idtx ,
                                           AV130BarGirar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A3030BarPlf ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AA29 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV102bardisnumfrom, AV103bardisnumto, Integer.valueOf(AV42CliCodfrom), Integer.valueOf(AV43CliCodto), Byte.valueOf(AV44BarSitfrom), Byte.valueOf(AV45BarSitto), AV46BarFecGenfrom, AV47BarFecGento, AV104barfecsalfrom, AV105barfecsalto, AV106BarFecClifrom, AV107barfecclito, AV108BarFecFprfrom, AV109barfecfprto, AV110BarSerfrom, AV111BarSerto, AV112BarColNomfrom, AV113BarColNomto, Integer.valueOf(AV114BarColnumfrom), Integer.valueOf(AV115BarColNumto), AV116BarNomClifrom, AV117BarNomClito, Integer.valueOf(AV118BarNumClifrom), Integer.valueOf(AV119Barnumclito), Short.valueOf(AV120BarTipArtfrom), Short.valueOf(AV121BarTipArtto), AV122TFBarPlf, Integer.valueOf(AV123BarCodfrom), Integer.valueOf(AV124BarCodto), Byte.valueOf(AV125BarCodreofrom), Byte.valueOf(AV126BarCodreoto), AV127BarCodparfrom, AV128BarCodparto, AV129Cod_idtx, AV130BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2454BarGirar = P0AA29_A2454BarGirar[0] ;
         A3030BarPlf = P0AA29_A3030BarPlf[0] ;
         A217BarTipArt = P0AA29_A217BarTipArt[0] ;
         n217BarTipArt = P0AA29_n217BarTipArt[0] ;
         A1235BarNumCli = P0AA29_A1235BarNumCli[0] ;
         A1234BarNomCli = P0AA29_A1234BarNomCli[0] ;
         A136BarColNum = P0AA29_A136BarColNum[0] ;
         A135BarColNom = P0AA29_A135BarColNom[0] ;
         A212BarSer = P0AA29_A212BarSer[0] ;
         A158BarFecFpr = P0AA29_A158BarFecFpr[0] ;
         A155BarFecCli = P0AA29_A155BarFecCli[0] ;
         A161BarFecSal = P0AA29_A161BarFecSal[0] ;
         A159BarFecGen = P0AA29_A159BarFecGen[0] ;
         A213BarSit = P0AA29_A213BarSit[0] ;
         A252CliCod = P0AA29_A252CliCod[0] ;
         n252CliCod = P0AA29_n252CliCod[0] ;
         A143BarDisNum = P0AA29_A143BarDisNum[0] ;
         A279CliNom = P0AA29_A279CliNom[0] ;
         A120BarAgrEst = P0AA29_A120BarAgrEst[0] ;
         A1652BarSerDsc = P0AA29_A1652BarSerDsc[0] ;
         A13711BarTipArtD = P0AA29_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0AA29_n13711BarTipArtD[0] ;
         A4466BarAcaAnh = P0AA29_A4466BarAcaAnh[0] ;
         A4348DisUsrCod = P0AA29_A4348DisUsrCod[0] ;
         A166BarKgm = P0AA29_A166BarKgm[0] ;
         A184BarMtr = P0AA29_A184BarMtr[0] ;
         A151BarFasCod = P0AA29_A151BarFasCod[0] ;
         n151BarFasCod = P0AA29_n151BarFasCod[0] ;
         A1955BarFasSig = P0AA29_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AA29_n1955BarFasSig[0] ;
         A13933BarCuadern = P0AA29_A13933BarCuadern[0] ;
         n13933BarCuadern = P0AA29_n13933BarCuadern[0] ;
         A361DisCod = P0AA29_A361DisCod[0] ;
         A2829BarProPer = P0AA29_A2829BarProPer[0] ;
         A396EmprCod = P0AA29_A396EmprCod[0] ;
         A199BarPie1 = P0AA29_A199BarPie1[0] ;
         A365DisDes = P0AA29_A365DisDes[0] ;
         A898BarPieNDes = P0AA29_A898BarPieNDes[0] ;
         A130BarCodPar = P0AA29_A130BarCodPar[0] ;
         A132BarCodReo = P0AA29_A132BarCodReo[0] ;
         A129BarCod = P0AA29_A129BarCod[0] ;
         A4348DisUsrCod = P0AA29_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P0AA29_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0AA29_n13711BarTipArtD[0] ;
         A279CliNom = P0AA29_A279CliNom[0] ;
         A13933BarCuadern = P0AA29_A13933BarCuadern[0] ;
         n13933BarCuadern = P0AA29_n13933BarCuadern[0] ;
         A166BarKgm = P0AA29_A166BarKgm[0] ;
         A184BarMtr = P0AA29_A184BarMtr[0] ;
         A199BarPie1 = P0AA29_A199BarPie1[0] ;
         A898BarPieNDes = P0AA29_A898BarPieNDes[0] ;
         A151BarFasCod = P0AA29_A151BarFasCod[0] ;
         n151BarFasCod = P0AA29_n151BarFasCod[0] ;
         A1955BarFasSig = P0AA29_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AA29_n1955BarFasSig[0] ;
         GXt_int2 = A13935BarAlbFact ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         consultadeproduccion_testexport.this.GXt_int2 = GXv_int3[0] ;
         A13935BarAlbFact = GXt_int2 ;
         GXt_int4 = A13930BarAlbUlti ;
         GXv_int5[0] = GXt_int4 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
         consultadeproduccion_testexport.this.GXt_int4 = GXv_int5[0] ;
         A13930BarAlbUlti = GXt_int4 ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         GXt_char6 = A13934BarNormas ;
         GXv_char7[0] = GXt_char6 ;
         new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char7) ;
         consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
         A13934BarNormas = GXt_char6 ;
         GXt_char6 = A14204BarProPerI ;
         GXv_char7[0] = GXt_char6 ;
         new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char7) ;
         consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
         A14204BarProPerI = GXt_char6 ;
         AV13CellRow = (int)(AV13CellRow+1) ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV30VisibleColumnCount = 0 ;
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A252CliCod );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A279CliNom, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A143BarDisNum, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13696BarNHdr, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A120BarAgrEst, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A212BarSer, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1652BarSerDsc, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A217BarTipArt );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13711BarTipArtD, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A135BarColNom, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A136BarColNum );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1234BarNomCli, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A166BarKgm)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A184BarMtr)) );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A198BarPie );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A213BarSit );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime8 = GXutil.resetTime( A159BarFecGen );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime8 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime8 = GXutil.resetTime( A155BarFecCli );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime8 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime8 = GXutil.resetTime( A158BarFecFpr );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime8 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_dtime8 = GXutil.resetTime( A161BarFecSal );
            AV10ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setDate( GXt_dtime8 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A151BarFasCod, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A1955BarFasSig, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A13930BarAlbUlti );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A13935BarAlbFact );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2454BarGirar, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setNumber( A4466BarAcaAnh );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13933BarCuadern, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A2829BarProPer, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A14204BarProPerI, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A13934BarNormas, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char6 = "" ;
            GXv_char7[0] = GXt_char6 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( A4348DisUsrCod, GXv_char7) ;
            consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
            AV10ExcelDocument.Cells(AV13CellRow, (int)(AV14FirstColumn+AV30VisibleColumnCount), 1, 1).setText( GXt_char6 );
            AV30VisibleColumnCount = (long)(AV30VisibleColumnCount+1) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
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
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarDisNum", "", "Ped.  Cli.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAgrEst", "", "A?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipArt", "", "Tip Art", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Color Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarKgm", "", "Kilos", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMtr", "", "Metros", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPie", "", "Piezas", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "Situacion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "Fecha", "Fecha HDR", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecCli", "Fecha", "Disp Cli", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecFpr", "Fecha", " Ent Prev", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecSal", "Fecha", "Salida", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasCod", "", "Ult. Fase", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasSig", "", "Sig. Fase", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAlbUltimo", "", "Ultimo Albaran", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAlbFact", "", "Factura", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarGirar", "", "Coleccion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( AV41Emprcod, httpContext.getMessage( "CNOENC", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAcaAnh", "", "Cuaderno", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarCuaderno", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarProPer", "", "CTW", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarProPerIdtx", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      if ( AV135Stnorm.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNormas", "", "Normas Estandars Textiles", true, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "", "", "", false, "") ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
      GXv_SdtWWPColumnsSelector9[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "DisUsrCod", "", "Usuario", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char6 = AV26UserCustomValue ;
      GXv_char7[0] = GXt_char6 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_TestColumnsSelector", GXv_char7) ;
      consultadeproduccion_testexport.this.GXt_char6 = GXv_char7[0] ;
      AV26UserCustomValue = GXt_char6 ;
      if ( ! ( (GXutil.strcmp("", AV26UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV26UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.ConsultadeProduccion_TestGridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_TestGridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV18Session.getValue("Produccion.ConsultadeProduccion_TestGridState"), null, null);
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
      this.aP0[0] = consultadeproduccion_testexport.this.AV11Filename;
      this.aP1[0] = consultadeproduccion_testexport.this.AV12ErrorMessage;
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
      AV18Session = httpContext.getWebSession();
      AV25ColumnsSelectorXML = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV24ColumnsSelector_Column = new app.wwpbaseobjects.SdtWWPColumnsSelector_Column(remoteHandle, context);
      scmdbuf = "" ;
      AV102bardisnumfrom = "" ;
      AV103bardisnumto = "" ;
      AV46BarFecGenfrom = GXutil.nullDate() ;
      AV47BarFecGento = GXutil.nullDate() ;
      AV104barfecsalfrom = GXutil.nullDate() ;
      AV105barfecsalto = GXutil.nullDate() ;
      AV106BarFecClifrom = GXutil.nullDate() ;
      AV107barfecclito = GXutil.nullDate() ;
      AV108BarFecFprfrom = GXutil.nullDate() ;
      AV109barfecfprto = GXutil.nullDate() ;
      AV110BarSerfrom = "" ;
      AV111BarSerto = "" ;
      AV112BarColNomfrom = "" ;
      AV113BarColNomto = "" ;
      AV116BarNomClifrom = "" ;
      AV117BarNomClito = "" ;
      AV122TFBarPlf = "" ;
      AV127BarCodparfrom = "" ;
      AV128BarCodparto = "" ;
      AV129Cod_idtx = "" ;
      AV130BarGirar = "" ;
      A143BarDisNum = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A3030BarPlf = "" ;
      A130BarCodPar = "" ;
      A2829BarProPer = "" ;
      A2454BarGirar = "" ;
      AV41Emprcod = "" ;
      A396EmprCod = "" ;
      P0AA29_A9713Tb1_Cod = new short[1] ;
      P0AA29_A2454BarGirar = new String[] {""} ;
      P0AA29_A3030BarPlf = new String[] {""} ;
      P0AA29_A217BarTipArt = new short[1] ;
      P0AA29_n217BarTipArt = new boolean[] {false} ;
      P0AA29_A1235BarNumCli = new int[1] ;
      P0AA29_A1234BarNomCli = new String[] {""} ;
      P0AA29_A136BarColNum = new int[1] ;
      P0AA29_A135BarColNom = new String[] {""} ;
      P0AA29_A212BarSer = new String[] {""} ;
      P0AA29_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0AA29_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AA29_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AA29_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AA29_A213BarSit = new byte[1] ;
      P0AA29_A252CliCod = new int[1] ;
      P0AA29_n252CliCod = new boolean[] {false} ;
      P0AA29_A143BarDisNum = new String[] {""} ;
      P0AA29_A279CliNom = new String[] {""} ;
      P0AA29_A120BarAgrEst = new String[] {""} ;
      P0AA29_A1652BarSerDsc = new String[] {""} ;
      P0AA29_A13711BarTipArtD = new String[] {""} ;
      P0AA29_n13711BarTipArtD = new boolean[] {false} ;
      P0AA29_A4466BarAcaAnh = new short[1] ;
      P0AA29_A4348DisUsrCod = new String[] {""} ;
      P0AA29_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AA29_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AA29_A151BarFasCod = new String[] {""} ;
      P0AA29_n151BarFasCod = new boolean[] {false} ;
      P0AA29_A1955BarFasSig = new String[] {""} ;
      P0AA29_n1955BarFasSig = new boolean[] {false} ;
      P0AA29_A13933BarCuadern = new String[] {""} ;
      P0AA29_n13933BarCuadern = new boolean[] {false} ;
      P0AA29_A361DisCod = new int[1] ;
      P0AA29_A2829BarProPer = new String[] {""} ;
      P0AA29_A396EmprCod = new String[] {""} ;
      P0AA29_A199BarPie1 = new short[1] ;
      P0AA29_A365DisDes = new String[] {""} ;
      P0AA29_A898BarPieNDes = new int[1] ;
      P0AA29_A130BarCodPar = new String[] {""} ;
      P0AA29_A132BarCodReo = new byte[1] ;
      P0AA29_A129BarCod = new int[1] ;
      A279CliNom = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A4348DisUsrCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A13933BarCuadern = "" ;
      A365DisDes = "" ;
      GXv_int3 = new int[1] ;
      GXv_int5 = new long[1] ;
      A13696BarNHdr = "" ;
      A13934BarNormas = "" ;
      A14204BarProPerI = "" ;
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV135Stnorm = DecimalUtil.ZERO ;
      AV26UserCustomValue = "" ;
      GXt_char6 = "" ;
      GXv_char7 = new String[1] ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_testexport__default(),
         new Object[] {
             new Object[] {
            P0AA29_A9713Tb1_Cod, P0AA29_A2454BarGirar, P0AA29_A3030BarPlf, P0AA29_A217BarTipArt, P0AA29_n217BarTipArt, P0AA29_A1235BarNumCli, P0AA29_A1234BarNomCli, P0AA29_A136BarColNum, P0AA29_A135BarColNom, P0AA29_A212BarSer,
            P0AA29_A158BarFecFpr, P0AA29_A155BarFecCli, P0AA29_A161BarFecSal, P0AA29_A159BarFecGen, P0AA29_A213BarSit, P0AA29_A252CliCod, P0AA29_n252CliCod, P0AA29_A143BarDisNum, P0AA29_A279CliNom, P0AA29_A120BarAgrEst,
            P0AA29_A1652BarSerDsc, P0AA29_A13711BarTipArtD, P0AA29_n13711BarTipArtD, P0AA29_A4466BarAcaAnh, P0AA29_A4348DisUsrCod, P0AA29_A166BarKgm, P0AA29_A184BarMtr, P0AA29_A151BarFasCod, P0AA29_n151BarFasCod, P0AA29_A1955BarFasSig,
            P0AA29_n1955BarFasSig, P0AA29_A13933BarCuadern, P0AA29_n13933BarCuadern, P0AA29_A361DisCod, P0AA29_A2829BarProPer, P0AA29_A396EmprCod, P0AA29_A199BarPie1, P0AA29_A365DisDes, P0AA29_A898BarPieNDes, P0AA29_A130BarCodPar,
            P0AA29_A132BarCodReo, P0AA29_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44BarSitfrom ;
   private byte AV45BarSitto ;
   private byte AV125BarCodreofrom ;
   private byte AV126BarCodreoto ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short AV120BarTipArtfrom ;
   private short AV121BarTipArtto ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV13CellRow ;
   private int AV14FirstColumn ;
   private int AV15Random ;
   private int AV133GXV1 ;
   private int AV42CliCodfrom ;
   private int AV43CliCodto ;
   private int AV114BarColnumfrom ;
   private int AV115BarColNumto ;
   private int AV118BarNumClifrom ;
   private int AV119Barnumclito ;
   private int AV123BarCodfrom ;
   private int AV124BarCodto ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A13935BarAlbFact ;
   private int GXt_int2 ;
   private int GXv_int3[] ;
   private int A198BarPie ;
   private long AV30VisibleColumnCount ;
   private long A13930BarAlbUlti ;
   private long GXt_int4 ;
   private long GXv_int5[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV135Stnorm ;
   private String scmdbuf ;
   private String AV102bardisnumfrom ;
   private String AV103bardisnumto ;
   private String AV110BarSerfrom ;
   private String AV111BarSerto ;
   private String AV112BarColNomfrom ;
   private String AV113BarColNomto ;
   private String AV116BarNomClifrom ;
   private String AV117BarNomClito ;
   private String AV122TFBarPlf ;
   private String AV127BarCodparfrom ;
   private String AV128BarCodparto ;
   private String AV129Cod_idtx ;
   private String AV130BarGirar ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A3030BarPlf ;
   private String A130BarCodPar ;
   private String A2829BarProPer ;
   private String A2454BarGirar ;
   private String AV41Emprcod ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A4348DisUsrCod ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String A13933BarCuadern ;
   private String A365DisDes ;
   private String A13696BarNHdr ;
   private String A14204BarProPerI ;
   private String GXt_char6 ;
   private String GXv_char7[] ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date AV46BarFecGenfrom ;
   private java.util.Date AV47BarFecGento ;
   private java.util.Date AV104barfecsalfrom ;
   private java.util.Date AV105barfecsalto ;
   private java.util.Date AV106BarFecClifrom ;
   private java.util.Date AV107barfecclito ;
   private java.util.Date AV108BarFecFprfrom ;
   private java.util.Date AV109barfecfprto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private boolean n151BarFasCod ;
   private boolean n1955BarFasSig ;
   private boolean n13933BarCuadern ;
   private boolean Cond_result ;
   private String AV25ColumnsSelectorXML ;
   private String AV26UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private String A13934BarNormas ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AA29_A9713Tb1_Cod ;
   private String[] P0AA29_A2454BarGirar ;
   private String[] P0AA29_A3030BarPlf ;
   private short[] P0AA29_A217BarTipArt ;
   private boolean[] P0AA29_n217BarTipArt ;
   private int[] P0AA29_A1235BarNumCli ;
   private String[] P0AA29_A1234BarNomCli ;
   private int[] P0AA29_A136BarColNum ;
   private String[] P0AA29_A135BarColNom ;
   private String[] P0AA29_A212BarSer ;
   private java.util.Date[] P0AA29_A158BarFecFpr ;
   private java.util.Date[] P0AA29_A155BarFecCli ;
   private java.util.Date[] P0AA29_A161BarFecSal ;
   private java.util.Date[] P0AA29_A159BarFecGen ;
   private byte[] P0AA29_A213BarSit ;
   private int[] P0AA29_A252CliCod ;
   private boolean[] P0AA29_n252CliCod ;
   private String[] P0AA29_A143BarDisNum ;
   private String[] P0AA29_A279CliNom ;
   private String[] P0AA29_A120BarAgrEst ;
   private String[] P0AA29_A1652BarSerDsc ;
   private String[] P0AA29_A13711BarTipArtD ;
   private boolean[] P0AA29_n13711BarTipArtD ;
   private short[] P0AA29_A4466BarAcaAnh ;
   private String[] P0AA29_A4348DisUsrCod ;
   private java.math.BigDecimal[] P0AA29_A166BarKgm ;
   private java.math.BigDecimal[] P0AA29_A184BarMtr ;
   private String[] P0AA29_A151BarFasCod ;
   private boolean[] P0AA29_n151BarFasCod ;
   private String[] P0AA29_A1955BarFasSig ;
   private boolean[] P0AA29_n1955BarFasSig ;
   private String[] P0AA29_A13933BarCuadern ;
   private boolean[] P0AA29_n13933BarCuadern ;
   private int[] P0AA29_A361DisCod ;
   private String[] P0AA29_A2829BarProPer ;
   private String[] P0AA29_A396EmprCod ;
   private short[] P0AA29_A199BarPie1 ;
   private String[] P0AA29_A365DisDes ;
   private int[] P0AA29_A898BarPieNDes ;
   private String[] P0AA29_A130BarCodPar ;
   private byte[] P0AA29_A132BarCodReo ;
   private int[] P0AA29_A129BarCod ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector_Column AV24ColumnsSelector_Column ;
}

final  class consultadeproduccion_testexport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AA29( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102bardisnumfrom ,
                                          String AV103bardisnumto ,
                                          int AV42CliCodfrom ,
                                          int AV43CliCodto ,
                                          byte AV44BarSitfrom ,
                                          byte AV45BarSitto ,
                                          java.util.Date AV46BarFecGenfrom ,
                                          java.util.Date AV47BarFecGento ,
                                          java.util.Date AV104barfecsalfrom ,
                                          java.util.Date AV105barfecsalto ,
                                          java.util.Date AV106BarFecClifrom ,
                                          java.util.Date AV107barfecclito ,
                                          java.util.Date AV108BarFecFprfrom ,
                                          java.util.Date AV109barfecfprto ,
                                          String AV110BarSerfrom ,
                                          String AV111BarSerto ,
                                          String AV112BarColNomfrom ,
                                          String AV113BarColNomto ,
                                          int AV114BarColnumfrom ,
                                          int AV115BarColNumto ,
                                          String AV116BarNomClifrom ,
                                          String AV117BarNomClito ,
                                          int AV118BarNumClifrom ,
                                          int AV119Barnumclito ,
                                          short AV120BarTipArtfrom ,
                                          short AV121BarTipArtto ,
                                          String AV122TFBarPlf ,
                                          int AV123BarCodfrom ,
                                          int AV124BarCodto ,
                                          byte AV125BarCodreofrom ,
                                          byte AV126BarCodreoto ,
                                          String AV127BarCodparfrom ,
                                          String AV128BarCodparto ,
                                          String AV129Cod_idtx ,
                                          String AV130BarGirar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          short A217BarTipArt ,
                                          String A3030BarPlf ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[36];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarGirar, T1.BarPlf, T1.BarTipArt AS BarTipArt, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarFecFpr, T1.BarFecCli," ;
      scmdbuf += " T1.BarFecSal, T1.BarFecGen, T1.BarSit, T1.CliCod, T1.BarDisNum, T4.CliNom, T1.BarAgrEst, T1.BarSerDsc, T3.TipArtDsc AS BarTipArtD, T1.BarAcaAnh, T2.DisUsrCod, COALESCE(" ;
      scmdbuf += " T6.BarKgm, 0) AS BarKgm, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T7.BarFasCod, ' ') AS BarFasCod, COALESCE( T8.BarFasCod, ' ') AS BarFasSig, COALESCE( T5.Tb1_Dsc," ;
      scmdbuf += " ' ') AS BarCuadern, T1.DisCod, T1.BarProPer, T1.EmprCod, COALESCE( T6.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod FROM (((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie)" ;
      scmdbuf += " AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasCod, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T10.GXC2)" ;
      scmdbuf += " AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo =" ;
      scmdbuf += " T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasCod, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo," ;
      scmdbuf += " T9.BarCodPar FROM ((TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar)" ;
      scmdbuf += " INNER JOIN (SELECT MIN(T12.BarOrdLin) AS GXC3, COALESCE( T13.BarFasLin, 0) AS BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARFAS T12" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T13 ON T13.EmprCod = T12.EmprCod AND T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar) WHERE (T12.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T12.BarOrdLin > COALESCE( T13.BarFasLin, 0)) AND (T12.BarFasEst = 0) GROUP BY T13.BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar ) T11 ON T11.EmprCod" ;
      scmdbuf += " = T9.EmprCod AND T11.BarCod = T9.BarCod AND T11.BarCodReo = T9.BarCodReo AND T11.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T11.GXC3) AND (T9.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV102bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103bardisnumto)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV42CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV43CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV44BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (0==AV45BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104barfecsalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV109barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV114BarColnumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV115BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV118BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV119Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV120BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV121BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV123BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV124BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV125BarCodreofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV126BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P0AA29(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AA29", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 8);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(28);
               ((String[]) buf[34])[0] = rslt.getString(29, 8);
               ((String[]) buf[35])[0] = rslt.getString(30, 3);
               ((short[]) buf[36])[0] = rslt.getShort(31);
               ((String[]) buf[37])[0] = rslt.getString(32, 1);
               ((int[]) buf[38])[0] = rslt.getInt(33);
               ((String[]) buf[39])[0] = rslt.getString(34, 1);
               ((byte[]) buf[40])[0] = rslt.getByte(35);
               ((int[]) buf[41])[0] = rslt.getInt(36);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 4);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 20);
               }
               return;
      }
   }

}

