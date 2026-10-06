package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recepcionensayocliente_dp extends GXProcedure
{
   public recepcionensayocliente_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recepcionensayocliente_dp.class ), "" );
   }

   public recepcionensayocliente_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item> executeUdp( String aP0 ,
                                                                                                    int aP1 ,
                                                                                                    String aP2 ,
                                                                                                    String aP3 ,
                                                                                                    int aP4 ,
                                                                                                    java.util.Date aP5 ,
                                                                                                    byte aP6 )
   {
      recepcionensayocliente_dp.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        java.util.Date aP5 ,
                        byte aP6 ,
                        GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             java.util.Date aP5 ,
                             byte aP6 ,
                             GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>[] aP7 )
   {
      recepcionensayocliente_dp.this.AV5Emprcod = aP0;
      recepcionensayocliente_dp.this.AV6Clicod = aP1;
      recepcionensayocliente_dp.this.AV7Lb_Cartaz = aP2;
      recepcionensayocliente_dp.this.AV8Lb_ColNom = aP3;
      recepcionensayocliente_dp.this.AV9Lb_numero = aP4;
      recepcionensayocliente_dp.this.AV10Lb_fechaR = aP5;
      recepcionensayocliente_dp.this.AV11Lb_estado = aP6;
      recepcionensayocliente_dp.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9Lb_numero) ,
                                           AV8Lb_ColNom ,
                                           AV7Lb_Cartaz ,
                                           Integer.valueOf(AV6Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5536Lb_ColNom ,
                                           A5540Lb_Cartaz ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           Byte.valueOf(AV11Lb_estado) ,
                                           A5567Lb_FechaEn ,
                                           A6461Lb_FecNoa1 ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV8Lb_ColNom = GXutil.padr( GXutil.rtrim( AV8Lb_ColNom), 13, "%") ;
      lV7Lb_Cartaz = GXutil.padr( GXutil.rtrim( AV7Lb_Cartaz), 20, "%") ;
      /* Using cursor P004M2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Byte.valueOf(AV11Lb_estado), Byte.valueOf(AV11Lb_estado), Integer.valueOf(AV9Lb_numero), lV8Lb_ColNom, lV7Lb_Cartaz, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004M2_A396EmprCod[0] ;
         A252CliCod = P004M2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004M2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004M2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004M2_A5569Lb_EstEns[0] ;
         A5532Lb_numero = P004M2_A5532Lb_numero[0] ;
         A6461Lb_FecNoa1 = P004M2_A6461Lb_FecNoa1[0] ;
         A5567Lb_FechaEn = P004M2_A5567Lb_FechaEn[0] ;
         A5566Lb_Estado = P004M2_A5566Lb_Estado[0] ;
         A5533Lb_ArtCod = P004M2_A5533Lb_ArtCod[0] ;
         A5537Lb_ColNum = P004M2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004M2_A831TipColCod[0] ;
         n831TipColCod = P004M2_n831TipColCod[0] ;
         A5538Lb_ColNomC = P004M2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004M2_A5547Lb_Rb[0] ;
         A5597Lb_TipRec = P004M2_A5597Lb_TipRec[0] ;
         A5718Lb_numop = P004M2_A5718Lb_numop[0] ;
         A5541Lb_FechaE = P004M2_A5541Lb_FechaE[0] ;
         A5563Lb_FechaR = P004M2_A5563Lb_FechaR[0] ;
         A6631Lb_ProvDef = P004M2_A6631Lb_ProvDef[0] ;
         A10822Lb_ObsCR = P004M2_A10822Lb_ObsCR[0] ;
         A12525Lb_opSt = P004M2_A12525Lb_opSt[0] ;
         n12525Lb_opSt = P004M2_n12525Lb_opSt[0] ;
         A12526Lb_opFc = P004M2_A12526Lb_opFc[0] ;
         n12526Lb_opFc = P004M2_n12526Lb_opFc[0] ;
         A279CliNom = P004M2_A279CliNom[0] ;
         A5565Lb_CosteE = P004M2_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P004M2_A5599Lb_RGB[0] ;
         A5555Lb_opcion = P004M2_A5555Lb_opcion[0] ;
         A252CliCod = P004M2_A252CliCod[0] ;
         A5540Lb_Cartaz = P004M2_A5540Lb_Cartaz[0] ;
         A5536Lb_ColNom = P004M2_A5536Lb_ColNom[0] ;
         A5569Lb_EstEns = P004M2_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P004M2_A5533Lb_ArtCod[0] ;
         A5537Lb_ColNum = P004M2_A5537Lb_ColNum[0] ;
         A831TipColCod = P004M2_A831TipColCod[0] ;
         n831TipColCod = P004M2_n831TipColCod[0] ;
         A5538Lb_ColNomC = P004M2_A5538Lb_ColNomC[0] ;
         A5547Lb_Rb = P004M2_A5547Lb_Rb[0] ;
         A5597Lb_TipRec = P004M2_A5597Lb_TipRec[0] ;
         A5541Lb_FechaE = P004M2_A5541Lb_FechaE[0] ;
         A5599Lb_RGB = P004M2_A5599Lb_RGB[0] ;
         A279CliNom = P004M2_A279CliNom[0] ;
         Gxm1recepciondeensayocliente_sdt = (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)new app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1recepciondeensayocliente_sdt, 0);
         GXt_char1 = Gx_msg ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A5533Lb_ArtCod ;
         GXv_char5[0] = A5536Lb_ColNom ;
         GXv_int6[0] = A5537Lb_ColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_int8[0] = (byte)(AV12F_Cformu) ;
         GXv_date9[0] = AV13ForUltUti ;
         GXv_int10[0] = AV14Fornumcol ;
         GXv_char11[0] = GXt_char1 ;
         new app.pens011(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8, GXv_date9, GXv_int10, GXv_char11) ;
         recepcionensayocliente_dp.this.A396EmprCod = GXv_char2[0] ;
         recepcionensayocliente_dp.this.A252CliCod = GXv_int3[0] ;
         recepcionensayocliente_dp.this.A5533Lb_ArtCod = GXv_char4[0] ;
         recepcionensayocliente_dp.this.A5536Lb_ColNom = GXv_char5[0] ;
         recepcionensayocliente_dp.this.A5537Lb_ColNum = GXv_int6[0] ;
         recepcionensayocliente_dp.this.A831TipColCod = GXv_int7[0] ;
         recepcionensayocliente_dp.this.AV12F_Cformu = GXv_int8[0] ;
         recepcionensayocliente_dp.this.AV13ForUltUti = GXv_date9[0] ;
         recepcionensayocliente_dp.this.AV14Fornumcol = GXv_int10[0] ;
         recepcionensayocliente_dp.this.GXt_char1 = GXv_char11[0] ;
         Gx_msg = GXt_char1 ;
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar( false );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero( A5532Lb_numero );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod( A252CliCod );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod( A5533Lb_ArtCod );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc( A5538Lb_ColNomC );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum( A5537Lb_ColNum );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb( A5547Lb_Rb );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion( A5555Lb_opcion );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec( A5597Lb_TipRec );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop( A5718Lb_numop );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz( A5540Lb_Cartaz );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae( A5541Lb_FechaE );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen( A5567Lb_FechaEn );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar( A5563Lb_FechaR );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado( A5566Lb_Estado );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar( false );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef( A6631Lb_ProvDef );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr( A10822Lb_ObsCR );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst( A12525Lb_opSt );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc( A12526Lb_opFc );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom( A279CliNom );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu( AV12F_Cformu );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol( AV14Fornumcol );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee( A5565Lb_CosteE );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod( A831TipColCod );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom( A5536Lb_ColNom );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti( AV13ForUltUti );
         Gxm1recepciondeensayocliente_sdt.setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb( A5599Lb_RGB );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = recepcionensayocliente_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>(app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV8Lb_ColNom = "" ;
      lV7Lb_Cartaz = "" ;
      A5536Lb_ColNom = "" ;
      A5540Lb_Cartaz = "" ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P004M2_A396EmprCod = new String[] {""} ;
      P004M2_A252CliCod = new int[1] ;
      P004M2_A5540Lb_Cartaz = new String[] {""} ;
      P004M2_A5536Lb_ColNom = new String[] {""} ;
      P004M2_A5569Lb_EstEns = new byte[1] ;
      P004M2_A5532Lb_numero = new int[1] ;
      P004M2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P004M2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P004M2_A5566Lb_Estado = new byte[1] ;
      P004M2_A5533Lb_ArtCod = new String[] {""} ;
      P004M2_A5537Lb_ColNum = new int[1] ;
      P004M2_A831TipColCod = new byte[1] ;
      P004M2_n831TipColCod = new boolean[] {false} ;
      P004M2_A5538Lb_ColNomC = new String[] {""} ;
      P004M2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004M2_A5597Lb_TipRec = new byte[1] ;
      P004M2_A5718Lb_numop = new byte[1] ;
      P004M2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P004M2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P004M2_A6631Lb_ProvDef = new String[] {""} ;
      P004M2_A10822Lb_ObsCR = new String[] {""} ;
      P004M2_A12525Lb_opSt = new String[] {""} ;
      P004M2_n12525Lb_opSt = new boolean[] {false} ;
      P004M2_A12526Lb_opFc = new java.util.Date[] {GXutil.nullDate()} ;
      P004M2_n12526Lb_opFc = new boolean[] {false} ;
      P004M2_A279CliNom = new String[] {""} ;
      P004M2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004M2_A5599Lb_RGB = new long[1] ;
      P004M2_A5555Lb_opcion = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A6631Lb_ProvDef = "" ;
      A10822Lb_ObsCR = "" ;
      A12525Lb_opSt = "" ;
      A12526Lb_opFc = GXutil.nullDate() ;
      A279CliNom = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      Gxm1recepciondeensayocliente_sdt = new app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item(remoteHandle, context);
      Gx_msg = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      AV13ForUltUti = GXutil.nullDate() ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepcionensayocliente_dp__default(),
         new Object[] {
             new Object[] {
            P004M2_A396EmprCod, P004M2_A252CliCod, P004M2_A5540Lb_Cartaz, P004M2_A5536Lb_ColNom, P004M2_A5569Lb_EstEns, P004M2_A5532Lb_numero, P004M2_A6461Lb_FecNoa1, P004M2_A5567Lb_FechaEn, P004M2_A5566Lb_Estado, P004M2_A5533Lb_ArtCod,
            P004M2_A5537Lb_ColNum, P004M2_A831TipColCod, P004M2_n831TipColCod, P004M2_A5538Lb_ColNomC, P004M2_A5547Lb_Rb, P004M2_A5597Lb_TipRec, P004M2_A5718Lb_numop, P004M2_A5541Lb_FechaE, P004M2_A5563Lb_FechaR, P004M2_A6631Lb_ProvDef,
            P004M2_A10822Lb_ObsCR, P004M2_A12525Lb_opSt, P004M2_n12525Lb_opSt, P004M2_A12526Lb_opFc, P004M2_n12526Lb_opFc, P004M2_A279CliNom, P004M2_A5565Lb_CosteE, P004M2_A5599Lb_RGB, P004M2_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Lb_estado ;
   private byte A5566Lb_Estado ;
   private byte A5569Lb_EstEns ;
   private byte A831TipColCod ;
   private byte A5597Lb_TipRec ;
   private byte A5718Lb_numop ;
   private byte GXv_int7[] ;
   private byte GXv_int8[] ;
   private short AV12F_Cformu ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int AV9Lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int AV14Fornumcol ;
   private int GXv_int10[] ;
   private long A5599Lb_RGB ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
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
   private String A6631Lb_ProvDef ;
   private String A12525Lb_opSt ;
   private String A279CliNom ;
   private String A5555Lb_opcion ;
   private String Gx_msg ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char11[] ;
   private java.util.Date AV10Lb_fechaR ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date A12526Lb_opFc ;
   private java.util.Date AV13ForUltUti ;
   private java.util.Date GXv_date9[] ;
   private boolean n831TipColCod ;
   private boolean n12525Lb_opSt ;
   private boolean n12526Lb_opFc ;
   private String A10822Lb_ObsCR ;
   private GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P004M2_A396EmprCod ;
   private int[] P004M2_A252CliCod ;
   private String[] P004M2_A5540Lb_Cartaz ;
   private String[] P004M2_A5536Lb_ColNom ;
   private byte[] P004M2_A5569Lb_EstEns ;
   private int[] P004M2_A5532Lb_numero ;
   private java.util.Date[] P004M2_A6461Lb_FecNoa1 ;
   private java.util.Date[] P004M2_A5567Lb_FechaEn ;
   private byte[] P004M2_A5566Lb_Estado ;
   private String[] P004M2_A5533Lb_ArtCod ;
   private int[] P004M2_A5537Lb_ColNum ;
   private byte[] P004M2_A831TipColCod ;
   private boolean[] P004M2_n831TipColCod ;
   private String[] P004M2_A5538Lb_ColNomC ;
   private java.math.BigDecimal[] P004M2_A5547Lb_Rb ;
   private byte[] P004M2_A5597Lb_TipRec ;
   private byte[] P004M2_A5718Lb_numop ;
   private java.util.Date[] P004M2_A5541Lb_FechaE ;
   private java.util.Date[] P004M2_A5563Lb_FechaR ;
   private String[] P004M2_A6631Lb_ProvDef ;
   private String[] P004M2_A10822Lb_ObsCR ;
   private String[] P004M2_A12525Lb_opSt ;
   private boolean[] P004M2_n12525Lb_opSt ;
   private java.util.Date[] P004M2_A12526Lb_opFc ;
   private boolean[] P004M2_n12526Lb_opFc ;
   private String[] P004M2_A279CliNom ;
   private java.math.BigDecimal[] P004M2_A5565Lb_CosteE ;
   private long[] P004M2_A5599Lb_RGB ;
   private String[] P004M2_A5555Lb_opcion ;
   private GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item Gxm1recepciondeensayocliente_sdt ;
}

final  class recepcionensayocliente_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9Lb_numero ,
                                          String AV8Lb_ColNom ,
                                          String AV7Lb_Cartaz ,
                                          int AV6Clicod ,
                                          int A5532Lb_numero ,
                                          String A5536Lb_ColNom ,
                                          String A5540Lb_Cartaz ,
                                          int A252CliCod ,
                                          byte A5566Lb_Estado ,
                                          byte AV11Lb_estado ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A6461Lb_FecNoa1 ,
                                          byte A5569Lb_EstEns ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[7];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliCod, T2.Lb_Cartaz, T2.Lb_ColNom, T2.Lb_EstEns, T1.Lb_numero, T1.Lb_FecNoa1, T1.Lb_FechaEn, T1.Lb_Estado, T2.Lb_ArtCod, T2.Lb_ColNum, T2.TipColCod," ;
      scmdbuf += " T2.Lb_ColNomC, T2.Lb_Rb, T2.Lb_TipRec, T1.Lb_numop, T2.Lb_FechaE, T1.Lb_FechaR, T1.Lb_ProvDef, T1.Lb_ObsCR, T1.Lb_opSt, T1.Lb_opFc, T3.CliNom, T1.Lb_CosteE, T2.Lb_RGB," ;
      scmdbuf += " T1.Lb_opcion FROM ((TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_Estado = ? or ? = 0 and T1.Lb_Estado <> 3)");
      addWhere(sWhereString, "(Not (T1.Lb_FechaEn = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "((T1.Lb_FecNoa1 = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T2.Lb_EstEns < 2)");
      if ( ! (0==AV9Lb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero = ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Lb_ColNom)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNom like ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7Lb_Cartaz)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz like ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV6Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P004M2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getVarchar(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,5);
               ((long[]) buf[27])[0] = rslt.getLong(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
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

