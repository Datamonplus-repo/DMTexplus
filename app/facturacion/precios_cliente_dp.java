package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precios_cliente_dp extends GXProcedure
{
   public precios_cliente_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_dp.class ), "" );
   }

   public precios_cliente_dp( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> executeUdp( String aP0 ,
                                                                                    int aP1 ,
                                                                                    int aP2 ,
                                                                                    String aP3 ,
                                                                                    String aP4 )
   {
      precios_cliente_dp.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>[] aP5 )
   {
      precios_cliente_dp.this.AV5Emprcod = aP0;
      precios_cliente_dp.this.AV6Clicod = aP1;
      precios_cliente_dp.this.AV7Forcolnum = aP2;
      precios_cliente_dp.this.AV8SP = aP3;
      precios_cliente_dp.this.AV23forblo = aP4;
      precios_cliente_dp.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV7Forcolnum) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A492ForPreKgm ,
                                           AV8SP ,
                                           A7781ForBlo ,
                                           AV23forblo ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P003Q2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), AV8SP, AV8SP, AV23forblo, Integer.valueOf(AV7Forcolnum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P003Q2_A583IntCod[0] ;
         A4384ForTipArt = P003Q2_A4384ForTipArt[0] ;
         n4384ForTipArt = P003Q2_n4384ForTipArt[0] ;
         A7781ForBlo = P003Q2_A7781ForBlo[0] ;
         n7781ForBlo = P003Q2_n7781ForBlo[0] ;
         A252CliCod = P003Q2_A252CliCod[0] ;
         A396EmprCod = P003Q2_A396EmprCod[0] ;
         A492ForPreKgm = P003Q2_A492ForPreKgm[0] ;
         n492ForPreKgm = P003Q2_n492ForPreKgm[0] ;
         A831TipColCod = P003Q2_A831TipColCod[0] ;
         A483ForColNum = P003Q2_A483ForColNum[0] ;
         A4380ForCosForm = P003Q2_A4380ForCosForm[0] ;
         n4380ForCosForm = P003Q2_n4380ForCosForm[0] ;
         A5648CliTipo = P003Q2_A5648CliTipo[0] ;
         A486ForNumCol = P003Q2_A486ForNumCol[0] ;
         A8561Fam_Cod = P003Q2_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P003Q2_n8561Fam_Cod[0] ;
         A4223ForCosUti = P003Q2_A4223ForCosUti[0] ;
         n4223ForCosUti = P003Q2_n4223ForCosUti[0] ;
         A5742ForSerDsc = P003Q2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P003Q2_n5742ForSerDsc[0] ;
         A584IntDsc = P003Q2_A584IntDsc[0] ;
         n584IntDsc = P003Q2_n584IntDsc[0] ;
         A5626ForObsM = P003Q2_A5626ForObsM[0] ;
         n5626ForObsM = P003Q2_n5626ForObsM[0] ;
         A3585ForPreFec = P003Q2_A3585ForPreFec[0] ;
         n3585ForPreFec = P003Q2_n3585ForPreFec[0] ;
         A3587ForFecAnt = P003Q2_A3587ForFecAnt[0] ;
         n3587ForFecAnt = P003Q2_n3587ForFecAnt[0] ;
         A995ForTonal = P003Q2_A995ForTonal[0] ;
         n995ForTonal = P003Q2_n995ForTonal[0] ;
         A2838ForRelBan = P003Q2_A2838ForRelBan[0] ;
         n2838ForRelBan = P003Q2_n2838ForRelBan[0] ;
         A1192ForNumCli = P003Q2_A1192ForNumCli[0] ;
         n1192ForNumCli = P003Q2_n1192ForNumCli[0] ;
         A1191ForNomCli = P003Q2_A1191ForNomCli[0] ;
         n1191ForNomCli = P003Q2_n1191ForNomCli[0] ;
         A482ForColNom = P003Q2_A482ForColNom[0] ;
         A494ForSer = P003Q2_A494ForSer[0] ;
         A13929ForTipArtD = P003Q2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P003Q2_n13929ForTipArtD[0] ;
         A5648CliTipo = P003Q2_A5648CliTipo[0] ;
         A584IntDsc = P003Q2_A584IntDsc[0] ;
         n584IntDsc = P003Q2_n584IntDsc[0] ;
         A13929ForTipArtD = P003Q2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P003Q2_n13929ForTipArtD[0] ;
         Gxm1precios_cliente_sdt = (app.facturacion.SdtPrecios_cliente_SDT_Item)new app.facturacion.SdtPrecios_cliente_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1precios_cliente_sdt, 0);
         GXt_int1 = AV9GrdTipARt ;
         GXv_int2[0] = GXt_int1 ;
         new app.facturacion.tipartfam(remoteHandle, context).execute( A396EmprCod, A831TipColCod, GXv_int2) ;
         precios_cliente_dp.this.GXt_int1 = GXv_int2[0] ;
         AV9GrdTipARt = GXt_int1 ;
         GXt_decimal3 = AV10Coste_Ta ;
         GXv_decimal4[0] = GXt_decimal3 ;
         new app.pcosgen(remoteHandle, context).execute( AV5Emprcod, A252CliCod, A494ForSer, A4380ForCosForm, AV9GrdTipARt, GXv_decimal4) ;
         precios_cliente_dp.this.GXt_decimal3 = GXv_decimal4[0] ;
         AV10Coste_Ta = GXt_decimal3 ;
         GXt_int1 = AV20Ti ;
         GXv_decimal4[0] = AV13Pcm ;
         GXv_decimal5[0] = AV14ForCan ;
         GXv_decimal6[0] = AV15C_M ;
         GXv_decimal7[0] = AV16Cm ;
         GXv_decimal8[0] = AV17Fi ;
         GXv_decimal9[0] = AV18Mc ;
         GXv_decimal10[0] = AV19F_i ;
         GXv_decimal11[0] = AV22pv ;
         GXv_int2[0] = GXt_int1 ;
         new app.pprecli1(remoteHandle, context).execute( A396EmprCod, A4380ForCosForm, AV9GrdTipARt, A5648CliTipo, A486ForNumCol, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int2) ;
         precios_cliente_dp.this.AV13Pcm = GXv_decimal4[0] ;
         precios_cliente_dp.this.AV14ForCan = GXv_decimal5[0] ;
         precios_cliente_dp.this.AV15C_M = GXv_decimal6[0] ;
         precios_cliente_dp.this.AV16Cm = GXv_decimal7[0] ;
         precios_cliente_dp.this.AV17Fi = GXv_decimal8[0] ;
         precios_cliente_dp.this.AV18Mc = GXv_decimal9[0] ;
         precios_cliente_dp.this.AV19F_i = GXv_decimal10[0] ;
         precios_cliente_dp.this.AV22pv = GXv_decimal11[0] ;
         precios_cliente_dp.this.GXt_int1 = GXv_int2[0] ;
         AV20Ti = GXt_int1 ;
         AV21Pc = A4380ForCosForm.add((AV15C_M.multiply(DecimalUtil.doubleToDec(AV20Ti)))) ;
         AV9GrdTipARt = ((A8561Fam_Cod>0) ? A8561Fam_Cod : AV9GrdTipARt) ;
         AV18Mc = ((A4223ForCosUti.doubleValue()>0) ? A4223ForCosUti : AV18Mc) ;
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( false );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Emprcod( A396EmprCod );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Clicod( A252CliCod );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forser( A494ForSer );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc( A5742ForSerDsc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum( A483ForColNum );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod( A831TipColCod );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom( A482ForColNom );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli( A1191ForNomCli );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Intdsc( A584IntDsc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart( AV9GrdTipARt );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Cr( A4380ForCosForm );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forcan( AV14ForCan );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Pc( AV21Pc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Mv( AV18Mc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Pv( AV22pv );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_C_m( AV15C_M );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Cm( AV16Cm );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Fi( AV17Fi );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Ti( AV20Ti );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Mc( AV18Mc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_F_i( AV19F_i );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm( A492ForPreKgm );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Obs( GXutil.substring( A5626ForObsM, 1, 100) );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forprefec( A3585ForPreFec );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forfecant( A3587ForFecAnt );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc( A13929ForTipArtD );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Artdsc( A5742ForSerDsc );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Fortonal( A995ForTonal );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod( A8561Fam_Cod );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti( A4223ForCosUti );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse( AV9GrdTipARt );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Forrelban( A2838ForRelBan );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm( A492ForPreKgm );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol( A486ForNumCol );
         Gxm1precios_cliente_sdt.setgxTv_SdtPrecios_cliente_SDT_Item_Clitipo( A5648CliTipo );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = precios_cliente_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>(app.facturacion.SdtPrecios_cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A7781ForBlo = "" ;
      A396EmprCod = "" ;
      P003Q2_A829TipArtCod = new short[1] ;
      P003Q2_A583IntCod = new byte[1] ;
      P003Q2_A4384ForTipArt = new short[1] ;
      P003Q2_n4384ForTipArt = new boolean[] {false} ;
      P003Q2_A7781ForBlo = new String[] {""} ;
      P003Q2_n7781ForBlo = new boolean[] {false} ;
      P003Q2_A252CliCod = new int[1] ;
      P003Q2_A396EmprCod = new String[] {""} ;
      P003Q2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Q2_n492ForPreKgm = new boolean[] {false} ;
      P003Q2_A831TipColCod = new byte[1] ;
      P003Q2_A483ForColNum = new int[1] ;
      P003Q2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Q2_n4380ForCosForm = new boolean[] {false} ;
      P003Q2_A5648CliTipo = new String[] {""} ;
      P003Q2_A486ForNumCol = new int[1] ;
      P003Q2_A8561Fam_Cod = new short[1] ;
      P003Q2_n8561Fam_Cod = new boolean[] {false} ;
      P003Q2_A4223ForCosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Q2_n4223ForCosUti = new boolean[] {false} ;
      P003Q2_A5742ForSerDsc = new String[] {""} ;
      P003Q2_n5742ForSerDsc = new boolean[] {false} ;
      P003Q2_A584IntDsc = new String[] {""} ;
      P003Q2_n584IntDsc = new boolean[] {false} ;
      P003Q2_A5626ForObsM = new String[] {""} ;
      P003Q2_n5626ForObsM = new boolean[] {false} ;
      P003Q2_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003Q2_n3585ForPreFec = new boolean[] {false} ;
      P003Q2_A3587ForFecAnt = new java.util.Date[] {GXutil.nullDate()} ;
      P003Q2_n3587ForFecAnt = new boolean[] {false} ;
      P003Q2_A995ForTonal = new String[] {""} ;
      P003Q2_n995ForTonal = new boolean[] {false} ;
      P003Q2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Q2_n2838ForRelBan = new boolean[] {false} ;
      P003Q2_A1192ForNumCli = new int[1] ;
      P003Q2_n1192ForNumCli = new boolean[] {false} ;
      P003Q2_A1191ForNomCli = new String[] {""} ;
      P003Q2_n1191ForNomCli = new boolean[] {false} ;
      P003Q2_A482ForColNom = new String[] {""} ;
      P003Q2_A494ForSer = new String[] {""} ;
      P003Q2_A13929ForTipArtD = new String[] {""} ;
      P003Q2_n13929ForTipArtD = new boolean[] {false} ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A5648CliTipo = "" ;
      A4223ForCosUti = DecimalUtil.ZERO ;
      A5742ForSerDsc = "" ;
      A584IntDsc = "" ;
      A5626ForObsM = "" ;
      A3585ForPreFec = GXutil.nullDate() ;
      A3587ForFecAnt = GXutil.nullDate() ;
      A995ForTonal = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A1191ForNomCli = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A13929ForTipArtD = "" ;
      Gxm1precios_cliente_sdt = new app.facturacion.SdtPrecios_cliente_SDT_Item(remoteHandle, context);
      AV10Coste_Ta = DecimalUtil.ZERO ;
      GXt_decimal3 = DecimalUtil.ZERO ;
      AV13Pcm = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV14ForCan = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV15C_M = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV16Cm = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV17Fi = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV18Mc = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV19F_i = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV22pv = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int2 = new short[1] ;
      AV21Pc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precios_cliente_dp__default(),
         new Object[] {
             new Object[] {
            P003Q2_A829TipArtCod, P003Q2_A583IntCod, P003Q2_A4384ForTipArt, P003Q2_n4384ForTipArt, P003Q2_A7781ForBlo, P003Q2_n7781ForBlo, P003Q2_A252CliCod, P003Q2_A396EmprCod, P003Q2_A492ForPreKgm, P003Q2_n492ForPreKgm,
            P003Q2_A831TipColCod, P003Q2_A483ForColNum, P003Q2_A4380ForCosForm, P003Q2_n4380ForCosForm, P003Q2_A5648CliTipo, P003Q2_A486ForNumCol, P003Q2_A8561Fam_Cod, P003Q2_n8561Fam_Cod, P003Q2_A4223ForCosUti, P003Q2_n4223ForCosUti,
            P003Q2_A5742ForSerDsc, P003Q2_n5742ForSerDsc, P003Q2_A584IntDsc, P003Q2_n584IntDsc, P003Q2_A5626ForObsM, P003Q2_n5626ForObsM, P003Q2_A3585ForPreFec, P003Q2_n3585ForPreFec, P003Q2_A3587ForFecAnt, P003Q2_n3587ForFecAnt,
            P003Q2_A995ForTonal, P003Q2_n995ForTonal, P003Q2_A2838ForRelBan, P003Q2_n2838ForRelBan, P003Q2_A1192ForNumCli, P003Q2_n1192ForNumCli, P003Q2_A1191ForNomCli, P003Q2_n1191ForNomCli, P003Q2_A482ForColNom, P003Q2_A494ForSer,
            P003Q2_A13929ForTipArtD, P003Q2_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short A4384ForTipArt ;
   private short A8561Fam_Cod ;
   private short AV9GrdTipARt ;
   private short AV20Ti ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int AV7Forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A4223ForCosUti ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV10Coste_Ta ;
   private java.math.BigDecimal GXt_decimal3 ;
   private java.math.BigDecimal AV13Pcm ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV14ForCan ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV15C_M ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV16Cm ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV17Fi ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV18Mc ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV19F_i ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV22pv ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV21Pc ;
   private String AV5Emprcod ;
   private String AV8SP ;
   private String AV23forblo ;
   private String scmdbuf ;
   private String A7781ForBlo ;
   private String A396EmprCod ;
   private String A5648CliTipo ;
   private String A5742ForSerDsc ;
   private String A584IntDsc ;
   private String A995ForTonal ;
   private String A1191ForNomCli ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A13929ForTipArtD ;
   private java.util.Date A3585ForPreFec ;
   private java.util.Date A3587ForFecAnt ;
   private boolean n4384ForTipArt ;
   private boolean n7781ForBlo ;
   private boolean n492ForPreKgm ;
   private boolean n4380ForCosForm ;
   private boolean n8561Fam_Cod ;
   private boolean n4223ForCosUti ;
   private boolean n5742ForSerDsc ;
   private boolean n584IntDsc ;
   private boolean n5626ForObsM ;
   private boolean n3585ForPreFec ;
   private boolean n3587ForFecAnt ;
   private boolean n995ForTonal ;
   private boolean n2838ForRelBan ;
   private boolean n1192ForNumCli ;
   private boolean n1191ForNomCli ;
   private boolean n13929ForTipArtD ;
   private String A5626ForObsM ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P003Q2_A829TipArtCod ;
   private byte[] P003Q2_A583IntCod ;
   private short[] P003Q2_A4384ForTipArt ;
   private boolean[] P003Q2_n4384ForTipArt ;
   private String[] P003Q2_A7781ForBlo ;
   private boolean[] P003Q2_n7781ForBlo ;
   private int[] P003Q2_A252CliCod ;
   private String[] P003Q2_A396EmprCod ;
   private java.math.BigDecimal[] P003Q2_A492ForPreKgm ;
   private boolean[] P003Q2_n492ForPreKgm ;
   private byte[] P003Q2_A831TipColCod ;
   private int[] P003Q2_A483ForColNum ;
   private java.math.BigDecimal[] P003Q2_A4380ForCosForm ;
   private boolean[] P003Q2_n4380ForCosForm ;
   private String[] P003Q2_A5648CliTipo ;
   private int[] P003Q2_A486ForNumCol ;
   private short[] P003Q2_A8561Fam_Cod ;
   private boolean[] P003Q2_n8561Fam_Cod ;
   private java.math.BigDecimal[] P003Q2_A4223ForCosUti ;
   private boolean[] P003Q2_n4223ForCosUti ;
   private String[] P003Q2_A5742ForSerDsc ;
   private boolean[] P003Q2_n5742ForSerDsc ;
   private String[] P003Q2_A584IntDsc ;
   private boolean[] P003Q2_n584IntDsc ;
   private String[] P003Q2_A5626ForObsM ;
   private boolean[] P003Q2_n5626ForObsM ;
   private java.util.Date[] P003Q2_A3585ForPreFec ;
   private boolean[] P003Q2_n3585ForPreFec ;
   private java.util.Date[] P003Q2_A3587ForFecAnt ;
   private boolean[] P003Q2_n3587ForFecAnt ;
   private String[] P003Q2_A995ForTonal ;
   private boolean[] P003Q2_n995ForTonal ;
   private java.math.BigDecimal[] P003Q2_A2838ForRelBan ;
   private boolean[] P003Q2_n2838ForRelBan ;
   private int[] P003Q2_A1192ForNumCli ;
   private boolean[] P003Q2_n1192ForNumCli ;
   private String[] P003Q2_A1191ForNomCli ;
   private boolean[] P003Q2_n1191ForNomCli ;
   private String[] P003Q2_A482ForColNom ;
   private String[] P003Q2_A494ForSer ;
   private String[] P003Q2_A13929ForTipArtD ;
   private boolean[] P003Q2_n13929ForTipArtD ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtPrecios_cliente_SDT_Item Gxm1precios_cliente_sdt ;
}

final  class precios_cliente_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV7Forcolnum ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A492ForPreKgm ,
                                          String AV8SP ,
                                          String A7781ForBlo ,
                                          String AV23forblo ,
                                          String AV5Emprcod ,
                                          int AV6Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[6];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T4.TipArtCod, T1.IntCod, T1.ForTipArt, T1.ForBlo, T1.CliCod, T1.EmprCod, T1.ForPreKgm, T1.TipColCod, T1.ForColNum, T1.ForCosForm, T2.CliTipo, T1.ForNumCol," ;
      scmdbuf += " T1.Fam_Cod, T1.ForCosUti, T1.ForSerDsc, T3.IntDsc, T1.ForObsM, T1.ForPreFec, T1.ForFecAnt, T1.ForTonal, T1.ForRelBan, T1.ForNumCli, T1.ForNomCli, T1.ForColNom," ;
      scmdbuf += " T1.ForSer, COALESCE( T4.TipArtDsc, ' ') AS ForTipArtD FROM (((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN" ;
      scmdbuf += " TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPART T4 ON T4.EmprCod = T1.EmprCod AND T4.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForColNum > 0)");
      addWhere(sWhereString, "(T1.TipColCod > 0)");
      addWhere(sWhereString, "(T1.ForPreKgm = 0 and ? = 'S' or ? = 'N')");
      addWhere(sWhereString, "(T1.ForBlo = ?)");
      if ( ! (0==AV7Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForNomCli, T1.ForNumCli" ;
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
                  return conditional_P003Q2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , (java.math.BigDecimal)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(24, 13);
               ((String[]) buf[39])[0] = rslt.getString(25, 16);
               ((String[]) buf[40])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

