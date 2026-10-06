package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta_trnpromptgetfilterdata extends GXProcedure
{
   public hojaderuta_trnpromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_trnpromptgetfilterdata.class ), "" );
   }

   public hojaderuta_trnpromptgetfilterdata( int remoteHandle ,
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
      hojaderuta_trnpromptgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta_trnpromptgetfilterdata.this.AV22DDOName = aP0;
      hojaderuta_trnpromptgetfilterdata.this.AV20SearchTxt = aP1;
      hojaderuta_trnpromptgetfilterdata.this.AV21SearchTxtTo = aP2;
      hojaderuta_trnpromptgetfilterdata.this.aP3 = aP3;
      hojaderuta_trnpromptgetfilterdata.this.aP4 = aP4;
      hojaderuta_trnpromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNPromptGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta_TRNPromptGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNPromptGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV10TFBarSit = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarSit_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV12TFPedidoCliente = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV13TFPedidoCliente_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV16TFBarKgm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFBarKgm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV18TFBarMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFBarMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPedidoCliente = AV20SearchTxt ;
      AV13TFPedidoCliente_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV10TFBarSit) ,
                                           Byte.valueOf(AV11TFBarSit_To) ,
                                           AV16TFBarKgm ,
                                           AV17TFBarKgm_To ,
                                           AV18TFBarMtr ,
                                           AV19TFBarMtr_To ,
                                           Byte.valueOf(A213BarSit) ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV38FilterFullText ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A13878PedidoClie ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           AV13TFPedidoCliente_Sel ,
                                           AV12TFPedidoCliente } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09N53 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV10TFBarSit), Byte.valueOf(AV11TFBarSit_To), AV16TFBarKgm, AV17TFBarKgm_To, AV18TFBarMtr, AV19TFBarMtr_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A218BarTipCol = P09N53_A218BarTipCol[0] ;
         A136BarColNum = P09N53_A136BarColNum[0] ;
         A135BarColNom = P09N53_A135BarColNom[0] ;
         A1652BarSerDsc = P09N53_A1652BarSerDsc[0] ;
         A212BarSer = P09N53_A212BarSer[0] ;
         A279CliNom = P09N53_A279CliNom[0] ;
         A252CliCod = P09N53_A252CliCod[0] ;
         n252CliCod = P09N53_n252CliCod[0] ;
         A213BarSit = P09N53_A213BarSit[0] ;
         A13696BarNHdr = P09N53_A13696BarNHdr[0] ;
         A184BarMtr = P09N53_A184BarMtr[0] ;
         A166BarKgm = P09N53_A166BarKgm[0] ;
         A129BarCod = P09N53_A129BarCod[0] ;
         A132BarCodReo = P09N53_A132BarCodReo[0] ;
         A130BarCodPar = P09N53_A130BarCodPar[0] ;
         A143BarDisNum = P09N53_A143BarDisNum[0] ;
         A4812BarEncCli = P09N53_A4812BarEncCli[0] ;
         A396EmprCod = P09N53_A396EmprCod[0] ;
         A279CliNom = P09N53_A279CliNom[0] ;
         A184BarMtr = P09N53_A184BarMtr[0] ;
         A166BarKgm = P09N53_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta_trnpromptgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta_trnpromptgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta_trnpromptgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta_trnpromptgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV38FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV38FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV38FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV13TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV12TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV13TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV13TFPedidoCliente_Sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                  {
                     AV24Option = A13878PedidoClie ;
                     AV23InsertIndex = 1 ;
                     while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
                     {
                        AV23InsertIndex = (int)(AV23InsertIndex+1) ;
                     }
                     if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
                     {
                        AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
                        AV32count = (long)(AV32count+1) ;
                        AV30OptionIndexes.removeItem(AV23InsertIndex);
                        AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
                     }
                     else
                     {
                        AV25Options.add(AV24Option, AV23InsertIndex);
                        AV30OptionIndexes.add("1", AV23InsertIndex);
                     }
                  }
                  if ( AV25Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
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
      this.aP3[0] = hojaderuta_trnpromptgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = hojaderuta_trnpromptgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = hojaderuta_trnpromptgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV12TFPedidoCliente = "" ;
      AV13TFPedidoCliente_Sel = "" ;
      AV16TFBarKgm = DecimalUtil.ZERO ;
      AV17TFBarKgm_To = DecimalUtil.ZERO ;
      AV18TFBarMtr = DecimalUtil.ZERO ;
      AV19TFBarMtr_To = DecimalUtil.ZERO ;
      lV38FilterFullText = "" ;
      scmdbuf = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      P09N53_A218BarTipCol = new byte[1] ;
      P09N53_A136BarColNum = new int[1] ;
      P09N53_A135BarColNom = new String[] {""} ;
      P09N53_A1652BarSerDsc = new String[] {""} ;
      P09N53_A212BarSer = new String[] {""} ;
      P09N53_A279CliNom = new String[] {""} ;
      P09N53_A252CliCod = new int[1] ;
      P09N53_n252CliCod = new boolean[] {false} ;
      P09N53_A213BarSit = new byte[1] ;
      P09N53_A13696BarNHdr = new String[] {""} ;
      P09N53_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N53_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N53_A129BarCod = new int[1] ;
      P09N53_A132BarCodReo = new byte[1] ;
      P09N53_A130BarCodPar = new String[] {""} ;
      P09N53_A143BarDisNum = new String[] {""} ;
      P09N53_A4812BarEncCli = new String[] {""} ;
      P09N53_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV24Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnpromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09N53_A218BarTipCol, P09N53_A136BarColNum, P09N53_A135BarColNom, P09N53_A1652BarSerDsc, P09N53_A212BarSer, P09N53_A279CliNom, P09N53_A252CliCod, P09N53_n252CliCod, P09N53_A213BarSit, P09N53_A13696BarNHdr,
            P09N53_A184BarMtr, P09N53_A166BarKgm, P09N53_A129BarCod, P09N53_A132BarCodReo, P09N53_A130BarCodPar, P09N53_A143BarDisNum, P09N53_A4812BarEncCli, P09N53_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFBarSit ;
   private byte AV11TFBarSit_To ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV16TFBarKgm ;
   private java.math.BigDecimal AV17TFBarKgm_To ;
   private java.math.BigDecimal AV18TFBarMtr ;
   private java.math.BigDecimal AV19TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV12TFPedidoCliente ;
   private String AV13TFPedidoCliente_Sel ;
   private String scmdbuf ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String lV38FilterFullText ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09N53_A218BarTipCol ;
   private int[] P09N53_A136BarColNum ;
   private String[] P09N53_A135BarColNom ;
   private String[] P09N53_A1652BarSerDsc ;
   private String[] P09N53_A212BarSer ;
   private String[] P09N53_A279CliNom ;
   private int[] P09N53_A252CliCod ;
   private boolean[] P09N53_n252CliCod ;
   private byte[] P09N53_A213BarSit ;
   private String[] P09N53_A13696BarNHdr ;
   private java.math.BigDecimal[] P09N53_A184BarMtr ;
   private java.math.BigDecimal[] P09N53_A166BarKgm ;
   private int[] P09N53_A129BarCod ;
   private byte[] P09N53_A132BarCodReo ;
   private String[] P09N53_A130BarCodPar ;
   private String[] P09N53_A143BarDisNum ;
   private String[] P09N53_A4812BarEncCli ;
   private String[] P09N53_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class hojaderuta_trnpromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09N53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV10TFBarSit ,
                                          byte AV11TFBarSit_To ,
                                          java.math.BigDecimal AV16TFBarKgm ,
                                          java.math.BigDecimal AV17TFBarKgm_To ,
                                          java.math.BigDecimal AV18TFBarMtr ,
                                          java.math.BigDecimal AV19TFBarMtr_To ,
                                          byte A213BarSit ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String AV38FilterFullText ,
                                          String A13696BarNHdr ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A13878PedidoClie ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String AV13TFPedidoCliente_Sel ,
                                          String AV12TFPedidoCliente )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[6];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.BarTipCol, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2)))" ;
      scmdbuf += " || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm," ;
      scmdbuf += " T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      if ( ! (0==AV10TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int7[0] = (byte)(1) ;
      }
      if ( ! (0==AV11TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV16TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV17TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P09N53(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09N53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 11);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[7]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[11], 2);
               }
               return;
      }
   }

}

