package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionlabdipenviados_y_o_aceptados_dp extends GXProcedure
{
   public impresionlabdipenviados_y_o_aceptados_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionlabdipenviados_y_o_aceptados_dp.class ), "" );
   }

   public impresionlabdipenviados_y_o_aceptados_dp( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> executeUdp( String aP0 ,
                                                                                                                 int aP1 ,
                                                                                                                 String aP2 ,
                                                                                                                 String aP3 ,
                                                                                                                 int aP4 ,
                                                                                                                 java.util.Date aP5 ,
                                                                                                                 java.util.Date aP6 ,
                                                                                                                 java.util.Date aP7 ,
                                                                                                                 byte aP8 )
   {
      impresionlabdipenviados_y_o_aceptados_dp.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
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
                        GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
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
                             GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>[] aP9 )
   {
      impresionlabdipenviados_y_o_aceptados_dp.this.AV5Emprcod = aP0;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV6Clicod = aP1;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV7Lb_Cartaz = aP2;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV8Lb_ColNom = aP3;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV9Lb_numero = aP4;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV10Lb_FechaEfrom = aP5;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV11Lb_FechaEto = aP6;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV12Lb_fechaEn = aP7;
      impresionlabdipenviados_y_o_aceptados_dp.this.AV13Lb_estado = aP8;
      impresionlabdipenviados_y_o_aceptados_dp.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11Lb_FechaEto ,
                                           AV10Lb_FechaEfrom ,
                                           Integer.valueOf(AV9Lb_numero) ,
                                           AV8Lb_ColNom ,
                                           AV7Lb_Cartaz ,
                                           Integer.valueOf(AV6Clicod) ,
                                           A5541Lb_FechaE ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5536Lb_ColNom ,
                                           A5540Lb_Cartaz ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV8Lb_ColNom = GXutil.padr( GXutil.rtrim( AV8Lb_ColNom), 13, "%") ;
      lV7Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV7Lb_Cartaz), 20, "%") ;
      /* Using cursor P004A2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV11Lb_FechaEto, AV10Lb_FechaEfrom, Integer.valueOf(AV9Lb_numero), lV8Lb_ColNom, lV7Lb_Cartaz, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004A2_A396EmprCod[0] ;
         A252CliCod = P004A2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004A2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004A2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004A2_A5569Lb_EstEns[0] ;
         A5532Lb_numero = P004A2_A5532Lb_numero[0] ;
         A5541Lb_FechaE = P004A2_A5541Lb_FechaE[0] ;
         A5566Lb_Estado = P004A2_A5566Lb_Estado[0] ;
         A5533Lb_ArtCod = P004A2_A5533Lb_ArtCod[0] ;
         A5538Lb_ColNomC = P004A2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004A2_A5547Lb_Rb[0] ;
         A5718Lb_numop = P004A2_A5718Lb_numop[0] ;
         A5567Lb_FechaEn = P004A2_A5567Lb_FechaEn[0] ;
         A5537Lb_ColNum = P004A2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004A2_A831TipColCod[0] ;
         n831TipColCod = P004A2_n831TipColCod[0] ;
         A5555Lb_opcion = P004A2_A5555Lb_opcion[0] ;
         A252CliCod = P004A2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004A2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004A2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004A2_A5569Lb_EstEns[0] ;
         A5541Lb_FechaE = P004A2_A5541Lb_FechaE[0] ;
         A5533Lb_ArtCod = P004A2_A5533Lb_ArtCod[0] ;
         A5538Lb_ColNomC = P004A2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004A2_A5547Lb_Rb[0] ;
         A5537Lb_ColNum = P004A2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004A2_A831TipColCod[0] ;
         n831TipColCod = P004A2_n831TipColCod[0] ;
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt = (app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)new app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1impresionlabdipenviados_y_o_aceptados_sdt, 0);
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar( true );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero( A5532Lb_numero );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod( A252CliCod );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod( A5533Lb_ArtCod );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc( A5538Lb_ColNomC );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb( A5547Lb_Rb );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion( A5555Lb_opcion );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop( A5718Lb_numop );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz( A5540Lb_Cartaz );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae( A5541Lb_FechaE );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen( A5567Lb_FechaEn );
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado( A5566Lb_Estado );
         GXt_char1 = "" ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A5533Lb_ArtCod ;
         GXv_char5[0] = A5536Lb_ColNom ;
         GXv_int6[0] = A5537Lb_ColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_char8[0] = A5555Lb_opcion ;
         GXv_int9[0] = (byte)(AV14F_Cformu) ;
         GXv_date10[0] = AV15ForUltUti ;
         GXv_int11[0] = AV16Fornumcol ;
         GXv_char12[0] = GXt_char1 ;
         new app.pens080(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_char8, GXv_int9, GXv_date10, GXv_int11, GXv_char12) ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A396EmprCod = GXv_char2[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A252CliCod = GXv_int3[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A5533Lb_ArtCod = GXv_char4[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A5536Lb_ColNom = GXv_char5[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A5537Lb_ColNum = GXv_int6[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A831TipColCod = GXv_int7[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.A5555Lb_opcion = GXv_char8[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.AV14F_Cformu = GXv_int9[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.AV15ForUltUti = GXv_date10[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.AV16Fornumcol = GXv_int11[0] ;
         impresionlabdipenviados_y_o_aceptados_dp.this.GXt_char1 = GXv_char12[0] ;
         Gxm1impresionlabdipenviados_y_o_aceptados_sdt.setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs( GXt_char1 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP9[0] = impresionlabdipenviados_y_o_aceptados_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>(app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV8Lb_ColNom = "" ;
      lV7Lb_Cartaz = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5536Lb_ColNom = "" ;
      A5540Lb_Cartaz = "" ;
      A396EmprCod = "" ;
      P004A2_A396EmprCod = new String[] {""} ;
      P004A2_A252CliCod = new int[1] ;
      P004A2_A5540Lb_Cartaz = new String[] {""} ;
      P004A2_A5536Lb_ColNom = new String[] {""} ;
      P004A2_A5569Lb_EstEns = new byte[1] ;
      P004A2_A5532Lb_numero = new int[1] ;
      P004A2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P004A2_A5566Lb_Estado = new byte[1] ;
      P004A2_A5533Lb_ArtCod = new String[] {""} ;
      P004A2_A5538Lb_ColNomC = new String[] {""} ;
      P004A2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004A2_A5718Lb_numop = new byte[1] ;
      P004A2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P004A2_A5537Lb_ColNum = new int[1] ;
      P004A2_A831TipColCod = new byte[1] ;
      P004A2_n831TipColCod = new boolean[] {false} ;
      P004A2_A5555Lb_opcion = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      Gxm1impresionlabdipenviados_y_o_aceptados_sdt = new app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new byte[1] ;
      AV15ForUltUti = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_dp__default(),
         new Object[] {
             new Object[] {
            P004A2_A396EmprCod, P004A2_A252CliCod, P004A2_A5540Lb_Cartaz, P004A2_A5536Lb_ColNom, P004A2_A5569Lb_EstEns, P004A2_A5532Lb_numero, P004A2_A5541Lb_FechaE, P004A2_A5566Lb_Estado, P004A2_A5533Lb_ArtCod, P004A2_A5538Lb_ColNomC,
            P004A2_A5547Lb_Rb, P004A2_A5718Lb_numop, P004A2_A5567Lb_FechaEn, P004A2_A5537Lb_ColNum, P004A2_A831TipColCod, P004A2_n831TipColCod, P004A2_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Lb_estado ;
   private byte A5566Lb_Estado ;
   private byte A5569Lb_EstEns ;
   private byte A5718Lb_numop ;
   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private byte GXv_int9[] ;
   private short AV14F_Cformu ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int AV9Lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int AV16Fornumcol ;
   private int GXv_int11[] ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private String AV5Emprcod ;
   private String AV7Lb_Cartaz ;
   private String AV8Lb_ColNom ;
   private String scmdbuf ;
   private String lV8Lb_ColNom ;
   private String lV7Lb_Cartaz ;
   private String A5536Lb_ColNom ;
   private String A5540Lb_Cartaz ;
   private String A396EmprCod ;
   private String A5533Lb_ArtCod ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private String GXv_char12[] ;
   private java.util.Date AV10Lb_FechaEfrom ;
   private java.util.Date AV11Lb_FechaEto ;
   private java.util.Date AV12Lb_fechaEn ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date AV15ForUltUti ;
   private java.util.Date GXv_date10[] ;
   private boolean n831TipColCod ;
   private GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P004A2_A396EmprCod ;
   private int[] P004A2_A252CliCod ;
   private String[] P004A2_A5540Lb_Cartaz ;
   private String[] P004A2_A5536Lb_ColNom ;
   private byte[] P004A2_A5569Lb_EstEns ;
   private int[] P004A2_A5532Lb_numero ;
   private java.util.Date[] P004A2_A5541Lb_FechaE ;
   private byte[] P004A2_A5566Lb_Estado ;
   private String[] P004A2_A5533Lb_ArtCod ;
   private String[] P004A2_A5538Lb_ColNomC ;
   private java.math.BigDecimal[] P004A2_A5547Lb_Rb ;
   private byte[] P004A2_A5718Lb_numop ;
   private java.util.Date[] P004A2_A5567Lb_FechaEn ;
   private int[] P004A2_A5537Lb_ColNum ;
   private byte[] P004A2_A831TipColCod ;
   private boolean[] P004A2_n831TipColCod ;
   private String[] P004A2_A5555Lb_opcion ;
   private GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item Gxm1impresionlabdipenviados_y_o_aceptados_sdt ;
}

final  class impresionlabdipenviados_y_o_aceptados_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV11Lb_FechaEto ,
                                          java.util.Date AV10Lb_FechaEfrom ,
                                          int AV9Lb_numero ,
                                          String AV8Lb_ColNom ,
                                          String AV7Lb_Cartaz ,
                                          int AV6Clicod ,
                                          java.util.Date A5541Lb_FechaE ,
                                          int A5532Lb_numero ,
                                          String A5536Lb_ColNom ,
                                          String A5540Lb_Cartaz ,
                                          int A252CliCod ,
                                          byte A5566Lb_Estado ,
                                          byte A5569Lb_EstEns ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[7];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliCod, T2.Lb_Cartaz, T2.Lb_ColNom, T2.Lb_EstEns, T1.Lb_numero, T2.Lb_FechaE, T1.Lb_Estado, T2.Lb_ArtCod, T2.Lb_ColNomC, T2.Lb_Rb, T1.Lb_numop," ;
      scmdbuf += " T1.Lb_FechaEn, T2.Lb_ColNum, T2.TipColCod, T1.Lb_opcion FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado <= 2)");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11Lb_FechaEto)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE <= ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10Lb_FechaEfrom)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV9Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (0==AV6Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
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
                  return conditional_P004A2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 13);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

