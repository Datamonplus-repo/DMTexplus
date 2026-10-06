package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn04promptgetfilterdata extends GXProcedure
{
   public ttrn04promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn04promptgetfilterdata.class ), "" );
   }

   public ttrn04promptgetfilterdata( int remoteHandle ,
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
      ttrn04promptgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn04promptgetfilterdata.this.AV26DDOName = aP0;
      ttrn04promptgetfilterdata.this.AV24SearchTxt = aP1;
      ttrn04promptgetfilterdata.this.AV25SearchTxtTo = aP2;
      ttrn04promptgetfilterdata.this.aP3 = aP3;
      ttrn04promptgetfilterdata.this.aP4 = aP4;
      ttrn04promptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PEDIDOCLIENTE") == 0 )
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
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TTrn04PromptGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn04PromptGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TTrn04PromptGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV59FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV62TFBarSit = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarSit_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV57TFPedidoCliente = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV58TFPedidoCliente_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV60TFBarTipCol = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFBarTipCol_To = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODIN") == 0 )
         {
            AV64ClicodIn = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV65BarSit_to = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV57TFPedidoCliente = AV24SearchTxt ;
      AV58TFPedidoCliente_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV62TFBarSit) ,
                                           Byte.valueOf(AV63TFBarSit_To) ,
                                           Byte.valueOf(AV60TFBarTipCol) ,
                                           Byte.valueOf(AV61TFBarTipCol_To) ,
                                           Byte.valueOf(A213BarSit) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           AV59FilterFullText ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A13878PedidoClie ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           AV58TFPedidoCliente_Sel ,
                                           AV57TFPedidoCliente ,
                                           Short.valueOf(AV64ClicodIn) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      /* Using cursor P088H2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV64ClicodIn), Short.valueOf(AV64ClicodIn), Byte.valueOf(AV62TFBarSit), Byte.valueOf(AV63TFBarSit_To), Byte.valueOf(AV60TFBarTipCol), Byte.valueOf(AV61TFBarTipCol_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A218BarTipCol = P088H2_A218BarTipCol[0] ;
         A136BarColNum = P088H2_A136BarColNum[0] ;
         A135BarColNom = P088H2_A135BarColNom[0] ;
         A1652BarSerDsc = P088H2_A1652BarSerDsc[0] ;
         A212BarSer = P088H2_A212BarSer[0] ;
         A279CliNom = P088H2_A279CliNom[0] ;
         A252CliCod = P088H2_A252CliCod[0] ;
         n252CliCod = P088H2_n252CliCod[0] ;
         A213BarSit = P088H2_A213BarSit[0] ;
         A13696BarNHdr = P088H2_A13696BarNHdr[0] ;
         A129BarCod = P088H2_A129BarCod[0] ;
         A132BarCodReo = P088H2_A132BarCodReo[0] ;
         A130BarCodPar = P088H2_A130BarCodPar[0] ;
         A143BarDisNum = P088H2_A143BarDisNum[0] ;
         A4812BarEncCli = P088H2_A4812BarEncCli[0] ;
         A396EmprCod = P088H2_A396EmprCod[0] ;
         A279CliNom = P088H2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         ttrn04promptgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         ttrn04promptgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         ttrn04promptgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         ttrn04promptgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV59FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV58TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV57TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV58TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV58TFPedidoCliente_Sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                  {
                     AV28Option = A13878PedidoClie ;
                     AV27InsertIndex = 1 ;
                     while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
                     {
                        AV27InsertIndex = (int)(AV27InsertIndex+1) ;
                     }
                     if ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) == 0 ) )
                     {
                        AV36count = GXutil.lval( (String)AV34OptionIndexes.elementAt(-1+AV27InsertIndex)) ;
                        AV36count = (long)(AV36count+1) ;
                        AV34OptionIndexes.removeItem(AV27InsertIndex);
                        AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
                     }
                     else
                     {
                        AV29Options.add(AV28Option, AV27InsertIndex);
                        AV34OptionIndexes.add("1", AV27InsertIndex);
                     }
                  }
                  if ( AV29Options.size() == 50 )
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
      this.aP3[0] = ttrn04promptgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = ttrn04promptgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = ttrn04promptgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV59FilterFullText = "" ;
      AV57TFPedidoCliente = "" ;
      AV58TFPedidoCliente_Sel = "" ;
      lV59FilterFullText = "" ;
      scmdbuf = "" ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      P088H2_A218BarTipCol = new byte[1] ;
      P088H2_A136BarColNum = new int[1] ;
      P088H2_A135BarColNom = new String[] {""} ;
      P088H2_A1652BarSerDsc = new String[] {""} ;
      P088H2_A212BarSer = new String[] {""} ;
      P088H2_A279CliNom = new String[] {""} ;
      P088H2_A252CliCod = new int[1] ;
      P088H2_n252CliCod = new boolean[] {false} ;
      P088H2_A213BarSit = new byte[1] ;
      P088H2_A13696BarNHdr = new String[] {""} ;
      P088H2_A129BarCod = new int[1] ;
      P088H2_A132BarCodReo = new byte[1] ;
      P088H2_A130BarCodPar = new String[] {""} ;
      P088H2_A143BarDisNum = new String[] {""} ;
      P088H2_A4812BarEncCli = new String[] {""} ;
      P088H2_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A396EmprCod = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV28Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P088H2_A218BarTipCol, P088H2_A136BarColNum, P088H2_A135BarColNom, P088H2_A1652BarSerDsc, P088H2_A212BarSer, P088H2_A279CliNom, P088H2_A252CliCod, P088H2_n252CliCod, P088H2_A213BarSit, P088H2_A13696BarNHdr,
            P088H2_A129BarCod, P088H2_A132BarCodReo, P088H2_A130BarCodPar, P088H2_A143BarDisNum, P088H2_A4812BarEncCli, P088H2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV62TFBarSit ;
   private byte AV63TFBarSit_To ;
   private byte AV60TFBarTipCol ;
   private byte AV61TFBarTipCol_To ;
   private byte AV65BarSit_to ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short AV64ClicodIn ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private String AV57TFPedidoCliente ;
   private String AV58TFPedidoCliente_Sel ;
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
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV59FilterFullText ;
   private String lV59FilterFullText ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P088H2_A218BarTipCol ;
   private int[] P088H2_A136BarColNum ;
   private String[] P088H2_A135BarColNom ;
   private String[] P088H2_A1652BarSerDsc ;
   private String[] P088H2_A212BarSer ;
   private String[] P088H2_A279CliNom ;
   private int[] P088H2_A252CliCod ;
   private boolean[] P088H2_n252CliCod ;
   private byte[] P088H2_A213BarSit ;
   private String[] P088H2_A13696BarNHdr ;
   private int[] P088H2_A129BarCod ;
   private byte[] P088H2_A132BarCodReo ;
   private String[] P088H2_A130BarCodPar ;
   private String[] P088H2_A143BarDisNum ;
   private String[] P088H2_A4812BarEncCli ;
   private String[] P088H2_A396EmprCod ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class ttrn04promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P088H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV62TFBarSit ,
                                          byte AV63TFBarSit_To ,
                                          byte AV60TFBarTipCol ,
                                          byte AV61TFBarTipCol_To ,
                                          byte A213BarSit ,
                                          byte A218BarTipCol ,
                                          String AV59FilterFullText ,
                                          String A13696BarNHdr ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A13878PedidoClie ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String AV58TFPedidoCliente_Sel ,
                                          String AV57TFPedidoCliente ,
                                          short AV64ClicodIn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[6];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.BarTipCol, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2)))" ;
      scmdbuf += " || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarEncCli, T1.EmprCod" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      if ( ! (0==AV62TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarTipCol) )
      {
         addWhere(sWhereString, "(T1.BarTipCol >= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (0==AV61TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCol <= ?)");
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
                  return conditional_P088H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

