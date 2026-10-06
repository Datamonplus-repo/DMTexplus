package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class enviodeensayoacliente_dp extends GXProcedure
{
   public enviodeensayoacliente_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviodeensayoacliente_dp.class ), "" );
   }

   public enviodeensayoacliente_dp( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> executeUdp( String aP0 ,
                                                                                                 int aP1 ,
                                                                                                 String aP2 ,
                                                                                                 String aP3 ,
                                                                                                 int aP4 ,
                                                                                                 java.util.Date aP5 ,
                                                                                                 java.util.Date aP6 ,
                                                                                                 java.util.Date aP7 ,
                                                                                                 byte aP8 ,
                                                                                                 short aP9 )
   {
      enviodeensayoacliente_dp.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        java.util.Date aP7 ,
                        byte aP8 ,
                        short aP9 ,
                        GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             java.util.Date aP7 ,
                             byte aP8 ,
                             short aP9 ,
                             GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>[] aP10 )
   {
      enviodeensayoacliente_dp.this.AV10Emprcod = aP0;
      enviodeensayoacliente_dp.this.AV11Clicod = aP1;
      enviodeensayoacliente_dp.this.AV12Lb_Cartaz = aP2;
      enviodeensayoacliente_dp.this.AV13Lb_ColNom = aP3;
      enviodeensayoacliente_dp.this.AV14Lb_numero = aP4;
      enviodeensayoacliente_dp.this.AV15Lb_FechaEfrom = aP5;
      enviodeensayoacliente_dp.this.AV16Lb_FechaEto = aP6;
      enviodeensayoacliente_dp.this.AV17Lb_fechaEn = aP7;
      enviodeensayoacliente_dp.this.AV9Lb_Estado = aP8;
      enviodeensayoacliente_dp.this.AV8Carvema = aP9;
      enviodeensayoacliente_dp.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV16Lb_FechaEto ,
                                           AV15Lb_FechaEfrom ,
                                           Integer.valueOf(AV14Lb_numero) ,
                                           AV13Lb_ColNom ,
                                           AV12Lb_Cartaz ,
                                           Integer.valueOf(AV11Clicod) ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5536Lb_ColNom ,
                                           A5540Lb_Cartaz ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV8Carvema) ,
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           Byte.valueOf(AV9Lb_Estado) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV13Lb_ColNom = GXutil.padr( GXutil.rtrim( AV13Lb_ColNom), 13, "%") ;
      lV12Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV12Lb_Cartaz), 20, "%") ;
      /* Using cursor P004K2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, Short.valueOf(AV8Carvema), Byte.valueOf(AV9Lb_Estado), Byte.valueOf(AV9Lb_Estado), Byte.valueOf(AV9Lb_Estado), AV16Lb_FechaEto, AV15Lb_FechaEfrom, Integer.valueOf(AV14Lb_numero), lV13Lb_ColNom, lV12Lb_Cartaz, Integer.valueOf(AV11Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004K2_A396EmprCod[0] ;
         A252CliCod = P004K2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004K2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004K2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004K2_A5569Lb_EstEns[0] ;
         A5532Lb_numero = P004K2_A5532Lb_numero[0] ;
         A5541Lb_FechaE = P004K2_A5541Lb_FechaE[0] ;
         A5566Lb_Estado = P004K2_A5566Lb_Estado[0] ;
         A279CliNom = P004K2_A279CliNom[0] ;
         A5533Lb_ArtCod = P004K2_A5533Lb_ArtCod[0] ;
         A5538Lb_ColNomC = P004K2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004K2_A5547Lb_Rb[0] ;
         A5718Lb_numop = P004K2_A5718Lb_numop[0] ;
         A5567Lb_FechaEn = P004K2_A5567Lb_FechaEn[0] ;
         A5537Lb_ColNum = P004K2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004K2_A831TipColCod[0] ;
         n831TipColCod = P004K2_n831TipColCod[0] ;
         A5565Lb_CosteE = P004K2_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P004K2_A5599Lb_RGB[0] ;
         A5534Lb_ArtDsc = P004K2_A5534Lb_ArtDsc[0] ;
         A5555Lb_opcion = P004K2_A5555Lb_opcion[0] ;
         A252CliCod = P004K2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004K2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004K2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004K2_A5569Lb_EstEns[0] ;
         A5541Lb_FechaE = P004K2_A5541Lb_FechaE[0] ;
         A5533Lb_ArtCod = P004K2_A5533Lb_ArtCod[0] ;
         A5538Lb_ColNomC = P004K2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004K2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P004K2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004K2_A831TipColCod[0] ;
         n831TipColCod = P004K2_n831TipColCod[0] ;
         A5599Lb_RGB = P004K2_A5599Lb_RGB[0] ;
         A5534Lb_ArtDsc = P004K2_A5534Lb_ArtDsc[0] ;
         A279CliNom = P004K2_A279CliNom[0] ;
         Gxm1enviodeensayoacliente_sdt = (app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item)new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1enviodeensayoacliente_sdt, 0);
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Seleccionar( false );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numero( A5532Lb_numero );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clicod( A252CliCod );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Clinom( A279CliNom );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artcod( A5533Lb_ArtCod );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnomc( A5538Lb_ColNomC );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rb( A5547Lb_Rb );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_opcion( A5555Lb_opcion );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_numop( A5718Lb_numop );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_cartaz( A5540Lb_Cartaz );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechae( A5541Lb_FechaE );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_fechaen( A5567Lb_FechaEn );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_estado( A5566Lb_Estado );
         GXt_char1 = "" ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A5533Lb_ArtCod ;
         GXv_char5[0] = A5536Lb_ColNom ;
         GXv_int6[0] = A5537Lb_ColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_char8[0] = A5555Lb_opcion ;
         GXv_int9[0] = (byte)(AV5F_Cformu) ;
         GXv_date10[0] = AV6ForUltUti ;
         GXv_int11[0] = AV7Fornumcol ;
         GXv_char12[0] = GXt_char1 ;
         new app.pens080(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_char8, GXv_int9, GXv_date10, GXv_int11, GXv_char12) ;
         enviodeensayoacliente_dp.this.A396EmprCod = GXv_char2[0] ;
         enviodeensayoacliente_dp.this.A252CliCod = GXv_int3[0] ;
         enviodeensayoacliente_dp.this.A5533Lb_ArtCod = GXv_char4[0] ;
         enviodeensayoacliente_dp.this.A5536Lb_ColNom = GXv_char5[0] ;
         enviodeensayoacliente_dp.this.A5537Lb_ColNum = GXv_int6[0] ;
         enviodeensayoacliente_dp.this.A831TipColCod = GXv_int7[0] ;
         enviodeensayoacliente_dp.this.A5555Lb_opcion = GXv_char8[0] ;
         enviodeensayoacliente_dp.this.AV5F_Cformu = GXv_int9[0] ;
         enviodeensayoacliente_dp.this.AV6ForUltUti = GXv_date10[0] ;
         enviodeensayoacliente_dp.this.AV7Fornumcol = GXv_int11[0] ;
         enviodeensayoacliente_dp.this.GXt_char1 = GXv_char12[0] ;
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Obs( GXt_char1 );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Eliminar( false );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_F_cformu( (byte)(AV5F_Cformu) );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_costee( A5565Lb_CosteE );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_rgb( A5599Lb_RGB );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Tipcolcod( A831TipColCod );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnom( A5536Lb_ColNom );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_colnum( A5537Lb_ColNum );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Fornumcol( AV7Fornumcol );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Forultuti( AV6ForUltUti );
         Gxm1enviodeensayoacliente_sdt.setgxTv_SdtEnviodeEnsayoaCliente_SDT_Item_Lb_artdsc( A5534Lb_ArtDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP10[0] = enviodeensayoacliente_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>(app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV13Lb_ColNom = "" ;
      lV12Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      A5540Lb_Cartaz = "" ;
      A396EmprCod = "" ;
      P004K2_A396EmprCod = new String[] {""} ;
      P004K2_A252CliCod = new int[1] ;
      P004K2_A5540Lb_Cartaz = new String[] {""} ;
      P004K2_A5536Lb_ColNom = new String[] {""} ;
      P004K2_A5569Lb_EstEns = new byte[1] ;
      P004K2_A5532Lb_numero = new int[1] ;
      P004K2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P004K2_A5566Lb_Estado = new byte[1] ;
      P004K2_A279CliNom = new String[] {""} ;
      P004K2_A5533Lb_ArtCod = new String[] {""} ;
      P004K2_A5538Lb_ColNomC = new String[] {""} ;
      P004K2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004K2_A5718Lb_numop = new byte[1] ;
      P004K2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P004K2_A5537Lb_ColNum = new int[1] ;
      P004K2_A831TipColCod = new byte[1] ;
      P004K2_n831TipColCod = new boolean[] {false} ;
      P004K2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004K2_A5599Lb_RGB = new long[1] ;
      P004K2_A5534Lb_ArtDsc = new String[] {""} ;
      P004K2_A5555Lb_opcion = new String[] {""} ;
      A279CliNom = "" ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5534Lb_ArtDsc = "" ;
      A5555Lb_opcion = "" ;
      Gxm1enviodeensayoacliente_sdt = new app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new byte[1] ;
      AV6ForUltUti = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.enviodeensayoacliente_dp__default(),
         new Object[] {
             new Object[] {
            P004K2_A396EmprCod, P004K2_A252CliCod, P004K2_A5540Lb_Cartaz, P004K2_A5536Lb_ColNom, P004K2_A5569Lb_EstEns, P004K2_A5532Lb_numero, P004K2_A5541Lb_FechaE, P004K2_A5566Lb_Estado, P004K2_A279CliNom, P004K2_A5533Lb_ArtCod,
            P004K2_A5538Lb_ColNomC, P004K2_A5547Lb_Rb, P004K2_A5718Lb_numop, P004K2_A5567Lb_FechaEn, P004K2_A5537Lb_ColNum, P004K2_A831TipColCod, P004K2_n831TipColCod, P004K2_A5565Lb_CosteE, P004K2_A5599Lb_RGB, P004K2_A5534Lb_ArtDsc,
            P004K2_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Lb_Estado ;
   private byte A5566Lb_Estado ;
   private byte A5569Lb_EstEns ;
   private byte A5718Lb_numop ;
   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private byte GXv_int9[] ;
   private short AV8Carvema ;
   private short AV5F_Cformu ;
   private short Gx_err ;
   private int AV11Clicod ;
   private int AV14Lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int AV7Fornumcol ;
   private int GXv_int11[] ;
   private long A5599Lb_RGB ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private String AV10Emprcod ;
   private String AV12Lb_Cartaz ;
   private String AV13Lb_ColNom ;
   private String scmdbuf ;
   private String lV13Lb_ColNom ;
   private String lV12Lb_Cartaz ;
   private String A5536Lb_ColNom ;
   private String A5540Lb_Cartaz ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5534Lb_ArtDsc ;
   private String A5555Lb_opcion ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char12[] ;
   private java.util.Date AV15Lb_FechaEfrom ;
   private java.util.Date AV16Lb_FechaEto ;
   private java.util.Date AV17Lb_fechaEn ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV6ForUltUti ;
   private java.util.Date GXv_date10[] ;
   private boolean n831TipColCod ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item>[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P004K2_A396EmprCod ;
   private int[] P004K2_A252CliCod ;
   private String[] P004K2_A5540Lb_Cartaz ;
   private String[] P004K2_A5536Lb_ColNom ;
   private byte[] P004K2_A5569Lb_EstEns ;
   private int[] P004K2_A5532Lb_numero ;
   private java.util.Date[] P004K2_A5541Lb_FechaE ;
   private byte[] P004K2_A5566Lb_Estado ;
   private String[] P004K2_A279CliNom ;
   private String[] P004K2_A5533Lb_ArtCod ;
   private String[] P004K2_A5538Lb_ColNomC ;
   private java.math.BigDecimal[] P004K2_A5547Lb_Rb ;
   private byte[] P004K2_A5718Lb_numop ;
   private java.util.Date[] P004K2_A5567Lb_FechaEn ;
   private int[] P004K2_A5537Lb_ColNum ;
   private byte[] P004K2_A831TipColCod ;
   private boolean[] P004K2_n831TipColCod ;
   private java.math.BigDecimal[] P004K2_A5565Lb_CosteE ;
   private long[] P004K2_A5599Lb_RGB ;
   private String[] P004K2_A5534Lb_ArtDsc ;
   private String[] P004K2_A5555Lb_opcion ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtEnviodeEnsayoaCliente_SDT_Item Gxm1enviodeensayoacliente_sdt ;
}

final  class enviodeensayoacliente_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV16Lb_FechaEto ,
                                          java.util.Date AV15Lb_FechaEfrom ,
                                          int AV14Lb_numero ,
                                          String AV13Lb_ColNom ,
                                          String AV12Lb_Cartaz ,
                                          int AV11Clicod ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A5532Lb_numero ,
                                          String A5536Lb_ColNom ,
                                          String A5540Lb_Cartaz ,
                                          int A252CliCod ,
                                          short AV8Carvema ,
                                          byte A5566Lb_Estado ,
                                          byte AV9Lb_Estado ,
                                          byte A5569Lb_EstEns ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[11];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliCod, T2.Lb_Cartaz, T2.Lb_ColNom, T2.Lb_EstEns, T1.Lb_numero, T2.Lb_FechaE, T1.Lb_Estado, T3.CliNom, T2.Lb_ArtCod, T2.Lb_ColNomC, T2.Lb_Rb," ;
      scmdbuf += " T1.Lb_numop, T1.Lb_FechaEn, T2.Lb_ColNum, T2.TipColCod, T1.Lb_CosteE, T2.Lb_RGB, T2.Lb_ArtDsc, T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( ? = 0 and ( ( T1.Lb_Estado = 1 and ? = 1) or ( T1.Lb_Estado = 0 and ? = 0) or ( ? = 2)))))");
      addWhere(sWhereString, "(T1.Lb_Estado >= 0 and T1.Lb_Estado <= 1)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV14Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV11Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_P004K2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 26);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               return;
      }
   }

}

