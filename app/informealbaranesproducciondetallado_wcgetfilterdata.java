package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informealbaranesproducciondetallado_wcgetfilterdata extends GXProcedure
{
   public informealbaranesproducciondetallado_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealbaranesproducciondetallado_wcgetfilterdata.class ), "" );
   }

   public informealbaranesproducciondetallado_wcgetfilterdata( int remoteHandle ,
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
      informealbaranesproducciondetallado_wcgetfilterdata.this.aP5 = new String[] {""};
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
      informealbaranesproducciondetallado_wcgetfilterdata.this.AV28DDOName = aP0;
      informealbaranesproducciondetallado_wcgetfilterdata.this.AV29SearchTxt = aP1;
      informealbaranesproducciondetallado_wcgetfilterdata.this.AV30SearchTxtTo = aP2;
      informealbaranesproducciondetallado_wcgetfilterdata.this.aP3 = aP3;
      informealbaranesproducciondetallado_wcgetfilterdata.this.aP4 = aP4;
      informealbaranesproducciondetallado_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV11TFIntDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV12TFIntDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIO") == 0 )
         {
            AV36Prio = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV37Clicod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV38Clicod_to = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV39ALbProfch = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH_TO") == 0 )
         {
            AV40ALbProfch_to = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV41Barser = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV42Barser_to = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI") == 0 )
         {
            AV43AlbEncCli = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI_TO") == 0 )
         {
            AV44AlbEncCli_to = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV45BarColNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV46BarColNom_to = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV47BarColNum = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV48BarColNum_to = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREO") == 0 )
         {
            AV50Barestreo = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOI") == 0 )
         {
            AV51Barestreoi = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOF") == 0 )
         {
            AV52barestreof = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPDISCOD") == 0 )
         {
            AV53TipDisCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV11TFIntDsc = AV29SearchTxt ;
      AV12TFIntDsc_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV37Clicod) ,
                                           Integer.valueOf(AV38Clicod_to) ,
                                           AV39ALbProfch ,
                                           AV40ALbProfch_to ,
                                           AV41Barser ,
                                           AV42Barser_to ,
                                           AV45BarColNom ,
                                           AV46BarColNom_to ,
                                           Integer.valueOf(AV47BarColNum) ,
                                           Integer.valueOf(AV48BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A39AlbProPri ,
                                           AV36Prio ,
                                           AV43AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV44AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV51Barestreoi) ,
                                           Byte.valueOf(AV52barestreof) ,
                                           A2010BarTipDis ,
                                           AV53TipDisCod ,
                                           A5140AlbMarca ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09SL2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, AV36Prio, AV36Prio, Byte.valueOf(AV51Barestreoi), Byte.valueOf(AV52barestreof), AV53TipDisCod, AV53TipDisCod, Integer.valueOf(AV37Clicod), Integer.valueOf(AV38Clicod_to), AV39ALbProfch, AV40ALbProfch_to, AV41Barser, AV42Barser_to, AV45BarColNom, AV46BarColNom_to, Integer.valueOf(AV47BarColNum), Integer.valueOf(AV48BarColNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P09SL2_A129BarCod[0] ;
         A132BarCodReo = P09SL2_A132BarCodReo[0] ;
         A130BarCodPar = P09SL2_A130BarCodPar[0] ;
         A30AlbProCod = P09SL2_A30AlbProCod[0] ;
         A5140AlbMarca = P09SL2_A5140AlbMarca[0] ;
         A2010BarTipDis = P09SL2_A2010BarTipDis[0] ;
         A148BarEstReo = P09SL2_A148BarEstReo[0] ;
         A136BarColNum = P09SL2_A136BarColNum[0] ;
         A135BarColNom = P09SL2_A135BarColNom[0] ;
         A212BarSer = P09SL2_A212BarSer[0] ;
         A34AlbProfch = P09SL2_A34AlbProfch[0] ;
         A1243GuiRemCli = P09SL2_A1243GuiRemCli[0] ;
         A39AlbProPri = P09SL2_A39AlbProPri[0] ;
         A252CliCod = P09SL2_A252CliCod[0] ;
         n252CliCod = P09SL2_n252CliCod[0] ;
         A218BarTipCol = P09SL2_A218BarTipCol[0] ;
         A143BarDisNum = P09SL2_A143BarDisNum[0] ;
         A4812BarEncCli = P09SL2_A4812BarEncCli[0] ;
         A396EmprCod = P09SL2_A396EmprCod[0] ;
         A2010BarTipDis = P09SL2_A2010BarTipDis[0] ;
         A148BarEstReo = P09SL2_A148BarEstReo[0] ;
         A136BarColNum = P09SL2_A136BarColNum[0] ;
         A135BarColNom = P09SL2_A135BarColNom[0] ;
         A212BarSer = P09SL2_A212BarSer[0] ;
         A252CliCod = P09SL2_A252CliCod[0] ;
         n252CliCod = P09SL2_n252CliCod[0] ;
         A218BarTipCol = P09SL2_A218BarTipCol[0] ;
         A143BarDisNum = P09SL2_A143BarDisNum[0] ;
         A4812BarEncCli = P09SL2_A4812BarEncCli[0] ;
         A5140AlbMarca = P09SL2_A5140AlbMarca[0] ;
         A34AlbProfch = P09SL2_A34AlbProfch[0] ;
         A1243GuiRemCli = P09SL2_A1243GuiRemCli[0] ;
         A39AlbProPri = P09SL2_A39AlbProPri[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         informealbaranesproducciondetallado_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         informealbaranesproducciondetallado_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         informealbaranesproducciondetallado_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         informealbaranesproducciondetallado_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV43AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV43AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV44AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV44AlbEncCli_to) <= 0 ) ) )
            {
               GXv_char6[0] = AV10IntDsc ;
               GXv_char5[0] = " " ;
               GXv_int7[0] = (short)(0) ;
               GXv_int8[0] = (byte)(0) ;
               GXv_char4[0] = "" ;
               GXv_char3[0] = " " ;
               GXv_int9[0] = 0 ;
               GXv_char10[0] = " " ;
               GXv_char11[0] = " " ;
               GXv_int12[0] = (short)(0) ;
               GXv_char13[0] = " " ;
               GXv_char14[0] = " " ;
               new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char6, GXv_char5, GXv_int7, GXv_int8, GXv_char4, GXv_char3, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
               informealbaranesproducciondetallado_wcgetfilterdata.this.AV10IntDsc = GXv_char6[0] ;
               if ( ! (GXutil.strcmp("", AV10IntDsc)==0) )
               {
                  AV17Option = AV10IntDsc ;
                  AV16InsertIndex = 1 ;
                  while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                  {
                     AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                  }
                  if ( ( ( AV16InsertIndex == AV18Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) != 0 ) )
                  {
                     AV18Options.add(AV17Option, AV16InsertIndex);
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informealbaranesproducciondetallado_wcgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = informealbaranesproducciondetallado_wcgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = informealbaranesproducciondetallado_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV11TFIntDsc = "" ;
      AV12TFIntDsc_Sel = "" ;
      AV35Emprcod = "" ;
      AV36Prio = "" ;
      AV39ALbProfch = GXutil.nullDate() ;
      AV40ALbProfch_to = GXutil.nullDate() ;
      AV41Barser = "" ;
      AV42Barser_to = "" ;
      AV43AlbEncCli = "" ;
      AV44AlbEncCli_to = "" ;
      AV45BarColNom = "" ;
      AV46BarColNom_to = "" ;
      AV53TipDisCod = "" ;
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A39AlbProPri = "" ;
      A13878PedidoClie = "" ;
      A2010BarTipDis = "" ;
      A5140AlbMarca = "" ;
      A396EmprCod = "" ;
      P09SL2_A129BarCod = new int[1] ;
      P09SL2_A132BarCodReo = new byte[1] ;
      P09SL2_A130BarCodPar = new String[] {""} ;
      P09SL2_A30AlbProCod = new long[1] ;
      P09SL2_A5140AlbMarca = new String[] {""} ;
      P09SL2_A2010BarTipDis = new String[] {""} ;
      P09SL2_A148BarEstReo = new byte[1] ;
      P09SL2_A136BarColNum = new int[1] ;
      P09SL2_A135BarColNom = new String[] {""} ;
      P09SL2_A212BarSer = new String[] {""} ;
      P09SL2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09SL2_A1243GuiRemCli = new int[1] ;
      P09SL2_A39AlbProPri = new String[] {""} ;
      P09SL2_A252CliCod = new int[1] ;
      P09SL2_n252CliCod = new boolean[] {false} ;
      P09SL2_A218BarTipCol = new byte[1] ;
      P09SL2_A143BarDisNum = new String[] {""} ;
      P09SL2_A4812BarEncCli = new String[] {""} ;
      P09SL2_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXt_char2 = "" ;
      AV10IntDsc = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      AV17Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproducciondetallado_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09SL2_A129BarCod, P09SL2_A132BarCodReo, P09SL2_A130BarCodPar, P09SL2_A30AlbProCod, P09SL2_A5140AlbMarca, P09SL2_A2010BarTipDis, P09SL2_A148BarEstReo, P09SL2_A136BarColNum, P09SL2_A135BarColNom, P09SL2_A212BarSer,
            P09SL2_A34AlbProfch, P09SL2_A1243GuiRemCli, P09SL2_A39AlbProPri, P09SL2_A252CliCod, P09SL2_n252CliCod, P09SL2_A218BarTipCol, P09SL2_A143BarDisNum, P09SL2_A4812BarEncCli, P09SL2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50Barestreo ;
   private byte AV51Barestreoi ;
   private byte AV52barestreof ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte GXv_int8[] ;
   private short GXv_int7[] ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV37Clicod ;
   private int AV38Clicod_to ;
   private int AV47BarColNum ;
   private int AV48BarColNum_to ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int9[] ;
   private int AV16InsertIndex ;
   private long A30AlbProCod ;
   private String AV11TFIntDsc ;
   private String AV12TFIntDsc_Sel ;
   private String AV35Emprcod ;
   private String AV36Prio ;
   private String AV41Barser ;
   private String AV42Barser_to ;
   private String AV43AlbEncCli ;
   private String AV44AlbEncCli_to ;
   private String AV45BarColNom ;
   private String AV46BarColNom_to ;
   private String AV53TipDisCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A39AlbProPri ;
   private String A13878PedidoClie ;
   private String A2010BarTipDis ;
   private String A5140AlbMarca ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String AV10IntDsc ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private java.util.Date AV39ALbProfch ;
   private java.util.Date AV40ALbProfch_to ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09SL2_A129BarCod ;
   private byte[] P09SL2_A132BarCodReo ;
   private String[] P09SL2_A130BarCodPar ;
   private long[] P09SL2_A30AlbProCod ;
   private String[] P09SL2_A5140AlbMarca ;
   private String[] P09SL2_A2010BarTipDis ;
   private byte[] P09SL2_A148BarEstReo ;
   private int[] P09SL2_A136BarColNum ;
   private String[] P09SL2_A135BarColNom ;
   private String[] P09SL2_A212BarSer ;
   private java.util.Date[] P09SL2_A34AlbProfch ;
   private int[] P09SL2_A1243GuiRemCli ;
   private String[] P09SL2_A39AlbProPri ;
   private int[] P09SL2_A252CliCod ;
   private boolean[] P09SL2_n252CliCod ;
   private byte[] P09SL2_A218BarTipCol ;
   private String[] P09SL2_A143BarDisNum ;
   private String[] P09SL2_A4812BarEncCli ;
   private String[] P09SL2_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class informealbaranesproducciondetallado_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09SL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV37Clicod ,
                                          int AV38Clicod_to ,
                                          java.util.Date AV39ALbProfch ,
                                          java.util.Date AV40ALbProfch_to ,
                                          String AV41Barser ,
                                          String AV42Barser_to ,
                                          String AV45BarColNom ,
                                          String AV46BarColNom_to ,
                                          int AV47BarColNum ,
                                          int AV48BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A39AlbProPri ,
                                          String AV36Prio ,
                                          String AV43AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV44AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV51Barestreoi ,
                                          byte AV52barestreof ,
                                          String A2010BarTipDis ,
                                          String AV53TipDisCod ,
                                          String A5140AlbMarca ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[17];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod, T3.AlbMarca, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli," ;
      scmdbuf += " T3.AlbProPri, T2.CliCod, T2.BarTipCol, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV37Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV38Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV47BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV48BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_P09SL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

