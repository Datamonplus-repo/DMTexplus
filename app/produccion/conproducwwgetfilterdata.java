package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class conproducwwgetfilterdata extends GXProcedure
{
   public conproducwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( conproducwwgetfilterdata.class ), "" );
   }

   public conproducwwgetfilterdata( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      conproducwwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      conproducwwgetfilterdata.this.AV30DDOName = aP0;
      conproducwwgetfilterdata.this.AV31SearchTxt = aP1;
      conproducwwgetfilterdata.this.AV32SearchTxtTo = aP2;
      conproducwwgetfilterdata.this.aP3 = aP3;
      conproducwwgetfilterdata.this.aP4 = aP4;
      conproducwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CP_BARCOLO") == 0 )
      {
         /* Execute user subroutine: 'LOADCP_BARCOLOOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CP_TARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCP_TARTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("Produccion.CONPRODUCWWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CONPRODUCWWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("Produccion.CONPRODUCWWGridState"), null, null);
      }
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLO") == 0 )
         {
            AV10TFCP_BARCOLO = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLO_SEL") == 0 )
         {
            AV11TFCP_BARCOLO_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_BARCOLU") == 0 )
         {
            AV12TFCP_BARCOLU = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCP_BARCOLU_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_TARTDSC") == 0 )
         {
            AV14TFCP_TARTDSC = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCP_TARTDSC_SEL") == 0 )
         {
            AV15TFCP_TARTDSC_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCP_BARCOLOOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCP_BARCOLO = AV31SearchTxt ;
      AV11TFCP_BARCOLO_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11TFCP_BARCOLO_Sel ,
                                           AV10TFCP_BARCOLO ,
                                           Integer.valueOf(AV12TFCP_BARCOLU) ,
                                           Integer.valueOf(AV13TFCP_BARCOLU_To) ,
                                           AV15TFCP_TARTDSC_Sel ,
                                           AV14TFCP_TARTDSC ,
                                           AV38bardisnumfrom ,
                                           AV39bardisnumto ,
                                           Integer.valueOf(AV40CliCodfrom) ,
                                           Integer.valueOf(AV41CliCodto) ,
                                           Byte.valueOf(AV42BarSitfrom) ,
                                           Byte.valueOf(AV43BarSitto) ,
                                           AV44barfecgenfrom ,
                                           AV45barfecgento ,
                                           AV46barfecsalfrom ,
                                           AV47barfecsalto ,
                                           AV48BarFecClifrom ,
                                           AV49barfecclito ,
                                           AV50BarFecFprfrom ,
                                           AV51barfecfprto ,
                                           AV52BarSerfrom ,
                                           AV53BarSerto ,
                                           AV54BarColNomfrom ,
                                           AV55BarColNomto ,
                                           Integer.valueOf(AV56BarColnumfrom) ,
                                           Integer.valueOf(AV57BarColNumto) ,
                                           AV58BarNomClifrom ,
                                           AV59BarNomClito ,
                                           Integer.valueOf(AV60BarNumClifrom) ,
                                           Integer.valueOf(AV61Barnumclito) ,
                                           Short.valueOf(AV62BarTipArtfrom) ,
                                           Short.valueOf(AV63BarTipArtto) ,
                                           AV64TFBarPlf ,
                                           Integer.valueOf(AV65BarCodfrom) ,
                                           Integer.valueOf(AV66BarCodto) ,
                                           Byte.valueOf(AV67BarCodreofrom) ,
                                           Byte.valueOf(AV68BarCodreoto) ,
                                           AV69BarCodparfrom ,
                                           AV70BarCodparto ,
                                           AV71Cod_idtx ,
                                           AV72BarGirar ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14343CP_TARTDSC ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           A14328CP_EMPRCOD ,
                                           AV37Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCP_BARCOLO = GXutil.padr( GXutil.rtrim( AV10TFCP_BARCOLO), 13, "%") ;
      lV14TFCP_TARTDSC = GXutil.concat( GXutil.rtrim( AV14TFCP_TARTDSC), "%", "") ;
      /* Using cursor P0AAM2 */
      pr_default.execute(0, new Object[] {AV37Emprcod, lV10TFCP_BARCOLO, AV11TFCP_BARCOLO_Sel, Integer.valueOf(AV12TFCP_BARCOLU), Integer.valueOf(AV13TFCP_BARCOLU_To), lV14TFCP_TARTDSC, AV15TFCP_TARTDSC_Sel, AV38bardisnumfrom, AV39bardisnumto, Integer.valueOf(AV40CliCodfrom), Integer.valueOf(AV41CliCodto), Byte.valueOf(AV42BarSitfrom), Byte.valueOf(AV43BarSitto), AV44barfecgenfrom, AV45barfecgento, AV46barfecsalfrom, AV47barfecsalto, AV48BarFecClifrom, AV49barfecclito, AV50BarFecFprfrom, AV51barfecfprto, AV52BarSerfrom, AV53BarSerto, AV54BarColNomfrom, AV55BarColNomto, Integer.valueOf(AV56BarColnumfrom), Integer.valueOf(AV57BarColNumto), AV58BarNomClifrom, AV59BarNomClito, Integer.valueOf(AV60BarNumClifrom), Integer.valueOf(AV61Barnumclito), Short.valueOf(AV62BarTipArtfrom), Short.valueOf(AV63BarTipArtto), AV64TFBarPlf, Integer.valueOf(AV65BarCodfrom), Integer.valueOf(AV66BarCodto), Byte.valueOf(AV67BarCodreofrom), Byte.valueOf(AV68BarCodreoto), AV69BarCodparfrom, AV70BarCodparto, AV71Cod_idtx, AV72BarGirar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAAM2 = false ;
         A14328CP_EMPRCOD = P0AAM2_A14328CP_EMPRCOD[0] ;
         A14331CP_BARCOLO = P0AAM2_A14331CP_BARCOLO[0] ;
         A14317CP_BARGIRA = P0AAM2_A14317CP_BARGIRA[0] ;
         A14323CP_BARPROP = P0AAM2_A14323CP_BARPROP[0] ;
         A14303CP_BARCODP = P0AAM2_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = P0AAM2_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = P0AAM2_A14301CP_BARCOD[0] ;
         A14306CP_BARPLF = P0AAM2_A14306CP_BARPLF[0] ;
         A14316CP_BARTIPA = P0AAM2_A14316CP_BARTIPA[0] ;
         A14305CP_BARNUMC = P0AAM2_A14305CP_BARNUMC[0] ;
         A14315CP_BARNOMC = P0AAM2_A14315CP_BARNOMC[0] ;
         A14311CP_BARSER = P0AAM2_A14311CP_BARSER[0] ;
         A14304CP_BARFECF = P0AAM2_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = P0AAM2_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = P0AAM2_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = P0AAM2_A14308CP_BARFECG[0] ;
         A14307CP_BARSIT = P0AAM2_A14307CP_BARSIT[0] ;
         A14326CP_CLICOD = P0AAM2_A14326CP_CLICOD[0] ;
         A14324CP_BARDISN = P0AAM2_A14324CP_BARDISN[0] ;
         A14343CP_TARTDSC = P0AAM2_A14343CP_TARTDSC[0] ;
         A14332CP_BARCOLU = P0AAM2_A14332CP_BARCOLU[0] ;
         A14297CP_ID = P0AAM2_A14297CP_ID[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAM2_A14331CP_BARCOLO[0], A14331CP_BARCOLO) == 0 ) )
         {
            brkAAM2 = false ;
            A14297CP_ID = P0AAM2_A14297CP_ID[0] ;
            AV24count = (long)(AV24count+1) ;
            brkAAM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14331CP_BARCOLO)==0) )
         {
            AV19Option = A14331CP_BARCOLO ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAM2 )
         {
            brkAAM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCP_TARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCP_TARTDSC = AV31SearchTxt ;
      AV15TFCP_TARTDSC_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV11TFCP_BARCOLO_Sel ,
                                           AV10TFCP_BARCOLO ,
                                           Integer.valueOf(AV12TFCP_BARCOLU) ,
                                           Integer.valueOf(AV13TFCP_BARCOLU_To) ,
                                           AV15TFCP_TARTDSC_Sel ,
                                           AV14TFCP_TARTDSC ,
                                           AV38bardisnumfrom ,
                                           AV39bardisnumto ,
                                           Integer.valueOf(AV40CliCodfrom) ,
                                           Integer.valueOf(AV41CliCodto) ,
                                           Byte.valueOf(AV42BarSitfrom) ,
                                           Byte.valueOf(AV43BarSitto) ,
                                           AV44barfecgenfrom ,
                                           AV45barfecgento ,
                                           AV46barfecsalfrom ,
                                           AV47barfecsalto ,
                                           AV48BarFecClifrom ,
                                           AV49barfecclito ,
                                           AV50BarFecFprfrom ,
                                           AV51barfecfprto ,
                                           AV52BarSerfrom ,
                                           AV53BarSerto ,
                                           AV54BarColNomfrom ,
                                           AV55BarColNomto ,
                                           Integer.valueOf(AV56BarColnumfrom) ,
                                           Integer.valueOf(AV57BarColNumto) ,
                                           AV58BarNomClifrom ,
                                           AV59BarNomClito ,
                                           Integer.valueOf(AV60BarNumClifrom) ,
                                           Integer.valueOf(AV61Barnumclito) ,
                                           Short.valueOf(AV62BarTipArtfrom) ,
                                           Short.valueOf(AV63BarTipArtto) ,
                                           AV64TFBarPlf ,
                                           Integer.valueOf(AV65BarCodfrom) ,
                                           Integer.valueOf(AV66BarCodto) ,
                                           Byte.valueOf(AV67BarCodreofrom) ,
                                           Byte.valueOf(AV68BarCodreoto) ,
                                           AV69BarCodparfrom ,
                                           AV70BarCodparto ,
                                           AV71Cod_idtx ,
                                           AV72BarGirar ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14343CP_TARTDSC ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           A14311CP_BARSER ,
                                           A14315CP_BARNOMC ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14306CP_BARPLF ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14323CP_BARPROP ,
                                           A14317CP_BARGIRA ,
                                           A14328CP_EMPRCOD ,
                                           AV37Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFCP_BARCOLO = GXutil.padr( GXutil.rtrim( AV10TFCP_BARCOLO), 13, "%") ;
      lV14TFCP_TARTDSC = GXutil.concat( GXutil.rtrim( AV14TFCP_TARTDSC), "%", "") ;
      /* Using cursor P0AAM3 */
      pr_default.execute(1, new Object[] {AV37Emprcod, lV10TFCP_BARCOLO, AV11TFCP_BARCOLO_Sel, Integer.valueOf(AV12TFCP_BARCOLU), Integer.valueOf(AV13TFCP_BARCOLU_To), lV14TFCP_TARTDSC, AV15TFCP_TARTDSC_Sel, AV38bardisnumfrom, AV39bardisnumto, Integer.valueOf(AV40CliCodfrom), Integer.valueOf(AV41CliCodto), Byte.valueOf(AV42BarSitfrom), Byte.valueOf(AV43BarSitto), AV44barfecgenfrom, AV45barfecgento, AV46barfecsalfrom, AV47barfecsalto, AV48BarFecClifrom, AV49barfecclito, AV50BarFecFprfrom, AV51barfecfprto, AV52BarSerfrom, AV53BarSerto, AV54BarColNomfrom, AV55BarColNomto, Integer.valueOf(AV56BarColnumfrom), Integer.valueOf(AV57BarColNumto), AV58BarNomClifrom, AV59BarNomClito, Integer.valueOf(AV60BarNumClifrom), Integer.valueOf(AV61Barnumclito), Short.valueOf(AV62BarTipArtfrom), Short.valueOf(AV63BarTipArtto), AV64TFBarPlf, Integer.valueOf(AV65BarCodfrom), Integer.valueOf(AV66BarCodto), Byte.valueOf(AV67BarCodreofrom), Byte.valueOf(AV68BarCodreoto), AV69BarCodparfrom, AV70BarCodparto, AV71Cod_idtx, AV72BarGirar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAAM4 = false ;
         A14328CP_EMPRCOD = P0AAM3_A14328CP_EMPRCOD[0] ;
         A14343CP_TARTDSC = P0AAM3_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = P0AAM3_A14317CP_BARGIRA[0] ;
         A14323CP_BARPROP = P0AAM3_A14323CP_BARPROP[0] ;
         A14303CP_BARCODP = P0AAM3_A14303CP_BARCODP[0] ;
         A14302CP_BARCODR = P0AAM3_A14302CP_BARCODR[0] ;
         A14301CP_BARCOD = P0AAM3_A14301CP_BARCOD[0] ;
         A14306CP_BARPLF = P0AAM3_A14306CP_BARPLF[0] ;
         A14316CP_BARTIPA = P0AAM3_A14316CP_BARTIPA[0] ;
         A14305CP_BARNUMC = P0AAM3_A14305CP_BARNUMC[0] ;
         A14315CP_BARNOMC = P0AAM3_A14315CP_BARNOMC[0] ;
         A14311CP_BARSER = P0AAM3_A14311CP_BARSER[0] ;
         A14304CP_BARFECF = P0AAM3_A14304CP_BARFECF[0] ;
         A14309CP_BARFECC = P0AAM3_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = P0AAM3_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = P0AAM3_A14308CP_BARFECG[0] ;
         A14307CP_BARSIT = P0AAM3_A14307CP_BARSIT[0] ;
         A14326CP_CLICOD = P0AAM3_A14326CP_CLICOD[0] ;
         A14324CP_BARDISN = P0AAM3_A14324CP_BARDISN[0] ;
         A14332CP_BARCOLU = P0AAM3_A14332CP_BARCOLU[0] ;
         A14331CP_BARCOLO = P0AAM3_A14331CP_BARCOLO[0] ;
         A14297CP_ID = P0AAM3_A14297CP_ID[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AAM3_A14343CP_TARTDSC[0], A14343CP_TARTDSC) == 0 ) )
         {
            brkAAM4 = false ;
            A14297CP_ID = P0AAM3_A14297CP_ID[0] ;
            AV24count = (long)(AV24count+1) ;
            brkAAM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14343CP_TARTDSC)==0) )
         {
            AV19Option = A14343CP_TARTDSC ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAM4 )
         {
            brkAAM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = conproducwwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = conproducwwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = conproducwwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFCP_BARCOLO = "" ;
      AV11TFCP_BARCOLO_Sel = "" ;
      AV14TFCP_TARTDSC = "" ;
      AV15TFCP_TARTDSC_Sel = "" ;
      scmdbuf = "" ;
      lV10TFCP_BARCOLO = "" ;
      lV14TFCP_TARTDSC = "" ;
      AV38bardisnumfrom = "" ;
      AV39bardisnumto = "" ;
      AV44barfecgenfrom = GXutil.nullDate() ;
      AV45barfecgento = GXutil.nullDate() ;
      AV46barfecsalfrom = GXutil.nullDate() ;
      AV47barfecsalto = GXutil.nullDate() ;
      AV48BarFecClifrom = GXutil.nullDate() ;
      AV49barfecclito = GXutil.nullDate() ;
      AV50BarFecFprfrom = GXutil.nullDate() ;
      AV51barfecfprto = GXutil.nullDate() ;
      AV52BarSerfrom = "" ;
      AV53BarSerto = "" ;
      AV54BarColNomfrom = "" ;
      AV55BarColNomto = "" ;
      AV58BarNomClifrom = "" ;
      AV59BarNomClito = "" ;
      AV64TFBarPlf = "" ;
      AV69BarCodparfrom = "" ;
      AV70BarCodparto = "" ;
      AV71Cod_idtx = "" ;
      AV72BarGirar = "" ;
      A14331CP_BARCOLO = "" ;
      A14343CP_TARTDSC = "" ;
      A14324CP_BARDISN = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14315CP_BARNOMC = "" ;
      A14306CP_BARPLF = "" ;
      A14303CP_BARCODP = "" ;
      A14323CP_BARPROP = "" ;
      A14317CP_BARGIRA = "" ;
      A14328CP_EMPRCOD = "" ;
      AV37Emprcod = "" ;
      P0AAM2_A14328CP_EMPRCOD = new String[] {""} ;
      P0AAM2_A14331CP_BARCOLO = new String[] {""} ;
      P0AAM2_A14317CP_BARGIRA = new String[] {""} ;
      P0AAM2_A14323CP_BARPROP = new String[] {""} ;
      P0AAM2_A14303CP_BARCODP = new String[] {""} ;
      P0AAM2_A14302CP_BARCODR = new byte[1] ;
      P0AAM2_A14301CP_BARCOD = new int[1] ;
      P0AAM2_A14306CP_BARPLF = new String[] {""} ;
      P0AAM2_A14316CP_BARTIPA = new short[1] ;
      P0AAM2_A14305CP_BARNUMC = new int[1] ;
      P0AAM2_A14315CP_BARNOMC = new String[] {""} ;
      P0AAM2_A14311CP_BARSER = new String[] {""} ;
      P0AAM2_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM2_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM2_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM2_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM2_A14307CP_BARSIT = new byte[1] ;
      P0AAM2_A14326CP_CLICOD = new int[1] ;
      P0AAM2_A14324CP_BARDISN = new String[] {""} ;
      P0AAM2_A14343CP_TARTDSC = new String[] {""} ;
      P0AAM2_A14332CP_BARCOLU = new int[1] ;
      P0AAM2_A14297CP_ID = new long[1] ;
      AV19Option = "" ;
      P0AAM3_A14328CP_EMPRCOD = new String[] {""} ;
      P0AAM3_A14343CP_TARTDSC = new String[] {""} ;
      P0AAM3_A14317CP_BARGIRA = new String[] {""} ;
      P0AAM3_A14323CP_BARPROP = new String[] {""} ;
      P0AAM3_A14303CP_BARCODP = new String[] {""} ;
      P0AAM3_A14302CP_BARCODR = new byte[1] ;
      P0AAM3_A14301CP_BARCOD = new int[1] ;
      P0AAM3_A14306CP_BARPLF = new String[] {""} ;
      P0AAM3_A14316CP_BARTIPA = new short[1] ;
      P0AAM3_A14305CP_BARNUMC = new int[1] ;
      P0AAM3_A14315CP_BARNOMC = new String[] {""} ;
      P0AAM3_A14311CP_BARSER = new String[] {""} ;
      P0AAM3_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM3_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM3_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM3_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAM3_A14307CP_BARSIT = new byte[1] ;
      P0AAM3_A14326CP_CLICOD = new int[1] ;
      P0AAM3_A14324CP_BARDISN = new String[] {""} ;
      P0AAM3_A14332CP_BARCOLU = new int[1] ;
      P0AAM3_A14331CP_BARCOLO = new String[] {""} ;
      P0AAM3_A14297CP_ID = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.conproducwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AAM2_A14328CP_EMPRCOD, P0AAM2_A14331CP_BARCOLO, P0AAM2_A14317CP_BARGIRA, P0AAM2_A14323CP_BARPROP, P0AAM2_A14303CP_BARCODP, P0AAM2_A14302CP_BARCODR, P0AAM2_A14301CP_BARCOD, P0AAM2_A14306CP_BARPLF, P0AAM2_A14316CP_BARTIPA, P0AAM2_A14305CP_BARNUMC,
            P0AAM2_A14315CP_BARNOMC, P0AAM2_A14311CP_BARSER, P0AAM2_A14304CP_BARFECF, P0AAM2_A14309CP_BARFECC, P0AAM2_A14310CP_BARFECS, P0AAM2_A14308CP_BARFECG, P0AAM2_A14307CP_BARSIT, P0AAM2_A14326CP_CLICOD, P0AAM2_A14324CP_BARDISN, P0AAM2_A14343CP_TARTDSC,
            P0AAM2_A14332CP_BARCOLU, P0AAM2_A14297CP_ID
            }
            , new Object[] {
            P0AAM3_A14328CP_EMPRCOD, P0AAM3_A14343CP_TARTDSC, P0AAM3_A14317CP_BARGIRA, P0AAM3_A14323CP_BARPROP, P0AAM3_A14303CP_BARCODP, P0AAM3_A14302CP_BARCODR, P0AAM3_A14301CP_BARCOD, P0AAM3_A14306CP_BARPLF, P0AAM3_A14316CP_BARTIPA, P0AAM3_A14305CP_BARNUMC,
            P0AAM3_A14315CP_BARNOMC, P0AAM3_A14311CP_BARSER, P0AAM3_A14304CP_BARFECF, P0AAM3_A14309CP_BARFECC, P0AAM3_A14310CP_BARFECS, P0AAM3_A14308CP_BARFECG, P0AAM3_A14307CP_BARSIT, P0AAM3_A14326CP_CLICOD, P0AAM3_A14324CP_BARDISN, P0AAM3_A14332CP_BARCOLU,
            P0AAM3_A14331CP_BARCOLO, P0AAM3_A14297CP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42BarSitfrom ;
   private byte AV43BarSitto ;
   private byte AV67BarCodreofrom ;
   private byte AV68BarCodreoto ;
   private byte A14307CP_BARSIT ;
   private byte A14302CP_BARCODR ;
   private short AV62BarTipArtfrom ;
   private short AV63BarTipArtto ;
   private short A14316CP_BARTIPA ;
   private short Gx_err ;
   private int AV75GXV1 ;
   private int AV12TFCP_BARCOLU ;
   private int AV13TFCP_BARCOLU_To ;
   private int AV40CliCodfrom ;
   private int AV41CliCodto ;
   private int AV56BarColnumfrom ;
   private int AV57BarColNumto ;
   private int AV60BarNumClifrom ;
   private int AV61Barnumclito ;
   private int AV65BarCodfrom ;
   private int AV66BarCodto ;
   private int A14332CP_BARCOLU ;
   private int A14326CP_CLICOD ;
   private int A14305CP_BARNUMC ;
   private int A14301CP_BARCOD ;
   private long A14297CP_ID ;
   private long AV24count ;
   private String AV10TFCP_BARCOLO ;
   private String AV11TFCP_BARCOLO_Sel ;
   private String scmdbuf ;
   private String lV10TFCP_BARCOLO ;
   private String AV38bardisnumfrom ;
   private String AV39bardisnumto ;
   private String AV52BarSerfrom ;
   private String AV53BarSerto ;
   private String AV54BarColNomfrom ;
   private String AV55BarColNomto ;
   private String AV58BarNomClifrom ;
   private String AV59BarNomClito ;
   private String AV64TFBarPlf ;
   private String AV69BarCodparfrom ;
   private String AV70BarCodparto ;
   private String AV71Cod_idtx ;
   private String AV72BarGirar ;
   private String A14331CP_BARCOLO ;
   private String A14324CP_BARDISN ;
   private String A14311CP_BARSER ;
   private String A14306CP_BARPLF ;
   private String A14303CP_BARCODP ;
   private String A14323CP_BARPROP ;
   private String A14328CP_EMPRCOD ;
   private String AV37Emprcod ;
   private java.util.Date AV44barfecgenfrom ;
   private java.util.Date AV45barfecgento ;
   private java.util.Date AV46barfecsalfrom ;
   private java.util.Date AV47barfecsalto ;
   private java.util.Date AV48BarFecClifrom ;
   private java.util.Date AV49barfecclito ;
   private java.util.Date AV50BarFecFprfrom ;
   private java.util.Date AV51barfecfprto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private boolean returnInSub ;
   private boolean brkAAM2 ;
   private boolean brkAAM4 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV14TFCP_TARTDSC ;
   private String AV15TFCP_TARTDSC_Sel ;
   private String lV14TFCP_TARTDSC ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAM2_A14328CP_EMPRCOD ;
   private String[] P0AAM2_A14331CP_BARCOLO ;
   private String[] P0AAM2_A14317CP_BARGIRA ;
   private String[] P0AAM2_A14323CP_BARPROP ;
   private String[] P0AAM2_A14303CP_BARCODP ;
   private byte[] P0AAM2_A14302CP_BARCODR ;
   private int[] P0AAM2_A14301CP_BARCOD ;
   private String[] P0AAM2_A14306CP_BARPLF ;
   private short[] P0AAM2_A14316CP_BARTIPA ;
   private int[] P0AAM2_A14305CP_BARNUMC ;
   private String[] P0AAM2_A14315CP_BARNOMC ;
   private String[] P0AAM2_A14311CP_BARSER ;
   private java.util.Date[] P0AAM2_A14304CP_BARFECF ;
   private java.util.Date[] P0AAM2_A14309CP_BARFECC ;
   private java.util.Date[] P0AAM2_A14310CP_BARFECS ;
   private java.util.Date[] P0AAM2_A14308CP_BARFECG ;
   private byte[] P0AAM2_A14307CP_BARSIT ;
   private int[] P0AAM2_A14326CP_CLICOD ;
   private String[] P0AAM2_A14324CP_BARDISN ;
   private String[] P0AAM2_A14343CP_TARTDSC ;
   private int[] P0AAM2_A14332CP_BARCOLU ;
   private long[] P0AAM2_A14297CP_ID ;
   private String[] P0AAM3_A14328CP_EMPRCOD ;
   private String[] P0AAM3_A14343CP_TARTDSC ;
   private String[] P0AAM3_A14317CP_BARGIRA ;
   private String[] P0AAM3_A14323CP_BARPROP ;
   private String[] P0AAM3_A14303CP_BARCODP ;
   private byte[] P0AAM3_A14302CP_BARCODR ;
   private int[] P0AAM3_A14301CP_BARCOD ;
   private String[] P0AAM3_A14306CP_BARPLF ;
   private short[] P0AAM3_A14316CP_BARTIPA ;
   private int[] P0AAM3_A14305CP_BARNUMC ;
   private String[] P0AAM3_A14315CP_BARNOMC ;
   private String[] P0AAM3_A14311CP_BARSER ;
   private java.util.Date[] P0AAM3_A14304CP_BARFECF ;
   private java.util.Date[] P0AAM3_A14309CP_BARFECC ;
   private java.util.Date[] P0AAM3_A14310CP_BARFECS ;
   private java.util.Date[] P0AAM3_A14308CP_BARFECG ;
   private byte[] P0AAM3_A14307CP_BARSIT ;
   private int[] P0AAM3_A14326CP_CLICOD ;
   private String[] P0AAM3_A14324CP_BARDISN ;
   private int[] P0AAM3_A14332CP_BARCOLU ;
   private String[] P0AAM3_A14331CP_BARCOLO ;
   private long[] P0AAM3_A14297CP_ID ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class conproducwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFCP_BARCOLO_Sel ,
                                          String AV10TFCP_BARCOLO ,
                                          int AV12TFCP_BARCOLU ,
                                          int AV13TFCP_BARCOLU_To ,
                                          String AV15TFCP_TARTDSC_Sel ,
                                          String AV14TFCP_TARTDSC ,
                                          String AV38bardisnumfrom ,
                                          String AV39bardisnumto ,
                                          int AV40CliCodfrom ,
                                          int AV41CliCodto ,
                                          byte AV42BarSitfrom ,
                                          byte AV43BarSitto ,
                                          java.util.Date AV44barfecgenfrom ,
                                          java.util.Date AV45barfecgento ,
                                          java.util.Date AV46barfecsalfrom ,
                                          java.util.Date AV47barfecsalto ,
                                          java.util.Date AV48BarFecClifrom ,
                                          java.util.Date AV49barfecclito ,
                                          java.util.Date AV50BarFecFprfrom ,
                                          java.util.Date AV51barfecfprto ,
                                          String AV52BarSerfrom ,
                                          String AV53BarSerto ,
                                          String AV54BarColNomfrom ,
                                          String AV55BarColNomto ,
                                          int AV56BarColnumfrom ,
                                          int AV57BarColNumto ,
                                          String AV58BarNomClifrom ,
                                          String AV59BarNomClito ,
                                          int AV60BarNumClifrom ,
                                          int AV61Barnumclito ,
                                          short AV62BarTipArtfrom ,
                                          short AV63BarTipArtto ,
                                          String AV64TFBarPlf ,
                                          int AV65BarCodfrom ,
                                          int AV66BarCodto ,
                                          byte AV67BarCodreofrom ,
                                          byte AV68BarCodreoto ,
                                          String AV69BarCodparfrom ,
                                          String AV70BarCodparto ,
                                          String AV71Cod_idtx ,
                                          String AV72BarGirar ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14343CP_TARTDSC ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          String A14328CP_EMPRCOD ,
                                          String AV37Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[42];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CP_EMPRCOD, CP_BARCOLO, CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARPLF, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARSER, CP_BARFECF, CP_BARFECC," ;
      scmdbuf += " CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_BARDISN, CP_TARTDSC, CP_BARCOLU, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( (GXutil.strcmp("", AV11TFCP_BARCOLO_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCP_BARCOLO)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_BARCOLO) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCP_BARCOLO_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCP_BARCOLU) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCP_BARCOLU_To) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCP_TARTDSC_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCP_TARTDSC)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_TARTDSC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCP_TARTDSC_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_TARTDSC = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39bardisnumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV40CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV42BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV43BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49barfecclito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51barfecfprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV56BarColnumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV57BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV60BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV61Barnumclito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV62BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV63BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV65BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV66BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV67BarCodreofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV68BarCodreoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodparto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_BARCOLO" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AAM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFCP_BARCOLO_Sel ,
                                          String AV10TFCP_BARCOLO ,
                                          int AV12TFCP_BARCOLU ,
                                          int AV13TFCP_BARCOLU_To ,
                                          String AV15TFCP_TARTDSC_Sel ,
                                          String AV14TFCP_TARTDSC ,
                                          String AV38bardisnumfrom ,
                                          String AV39bardisnumto ,
                                          int AV40CliCodfrom ,
                                          int AV41CliCodto ,
                                          byte AV42BarSitfrom ,
                                          byte AV43BarSitto ,
                                          java.util.Date AV44barfecgenfrom ,
                                          java.util.Date AV45barfecgento ,
                                          java.util.Date AV46barfecsalfrom ,
                                          java.util.Date AV47barfecsalto ,
                                          java.util.Date AV48BarFecClifrom ,
                                          java.util.Date AV49barfecclito ,
                                          java.util.Date AV50BarFecFprfrom ,
                                          java.util.Date AV51barfecfprto ,
                                          String AV52BarSerfrom ,
                                          String AV53BarSerto ,
                                          String AV54BarColNomfrom ,
                                          String AV55BarColNomto ,
                                          int AV56BarColnumfrom ,
                                          int AV57BarColNumto ,
                                          String AV58BarNomClifrom ,
                                          String AV59BarNomClito ,
                                          int AV60BarNumClifrom ,
                                          int AV61Barnumclito ,
                                          short AV62BarTipArtfrom ,
                                          short AV63BarTipArtto ,
                                          String AV64TFBarPlf ,
                                          int AV65BarCodfrom ,
                                          int AV66BarCodto ,
                                          byte AV67BarCodreofrom ,
                                          byte AV68BarCodreoto ,
                                          String AV69BarCodparfrom ,
                                          String AV70BarCodparto ,
                                          String AV71Cod_idtx ,
                                          String AV72BarGirar ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14343CP_TARTDSC ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          String A14306CP_BARPLF ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          String A14328CP_EMPRCOD ,
                                          String AV37Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[42];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT CP_EMPRCOD, CP_TARTDSC, CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARPLF, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARSER, CP_BARFECF, CP_BARFECC," ;
      scmdbuf += " CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_BARDISN, CP_BARCOLU, CP_BARCOLO, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( (GXutil.strcmp("", AV11TFCP_BARCOLO_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFCP_BARCOLO)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_BARCOLO) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFCP_BARCOLO_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV12TFCP_BARCOLU) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV13TFCP_BARCOLU_To) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFCP_TARTDSC_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFCP_TARTDSC)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CP_TARTDSC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFCP_TARTDSC_Sel)==0) )
      {
         addWhere(sWhereString, "(CP_TARTDSC = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38bardisnumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39bardisnumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV40CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV42BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV43BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49barfecclito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV51barfecfprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV56BarColnumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV57BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV60BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV61Barnumclito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV62BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV63BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV65BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (0==AV66BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (0==AV67BarCodreofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV68BarCodreoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarCodparfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodparto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_TARTDSC" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0AAM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] );
            case 1 :
                  return conditional_P0AAM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((long[]) buf[21])[0] = rslt.getLong(22);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 13);
               ((long[]) buf[21])[0] = rslt.getLong(22);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 40);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 20);
               }
               return;
      }
   }

}

