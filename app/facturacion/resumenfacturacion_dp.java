package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class resumenfacturacion_dp extends GXProcedure
{
   public resumenfacturacion_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( resumenfacturacion_dp.class ), "" );
   }

   public resumenfacturacion_dp( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> executeUdp( String aP0 ,
                                                                                       java.util.Date aP1 ,
                                                                                       java.util.Date aP2 ,
                                                                                       int aP3 ,
                                                                                       int aP4 ,
                                                                                       String aP5 ,
                                                                                       String aP6 )
   {
      resumenfacturacion_dp.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>[] aP7 )
   {
      resumenfacturacion_dp.this.AV18Emprcod = aP0;
      resumenfacturacion_dp.this.AV13FacFchfrom = aP1;
      resumenfacturacion_dp.this.AV14FacFchto = aP2;
      resumenfacturacion_dp.this.AV15CliCodfrom = aP3;
      resumenfacturacion_dp.this.AV17CliCodto = aP4;
      resumenfacturacion_dp.this.AV12FacSerNum = aP5;
      resumenfacturacion_dp.this.AV16FacPri = aP6;
      resumenfacturacion_dp.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV17CliCodto) ,
                                           Integer.valueOf(AV15CliCodfrom) ,
                                           AV14FacFchto ,
                                           AV13FacFchfrom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A436FacFch ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV12FacSerNum ,
                                           A2739FacSerNum ,
                                           A450FacPri ,
                                           AV16FacPri ,
                                           AV18Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003X3 */
      pr_default.execute(0, new Object[] {AV18Emprcod, AV12FacSerNum, AV12FacSerNum, AV12FacSerNum, AV16FacPri, Integer.valueOf(AV17CliCodto), Integer.valueOf(AV15CliCodfrom), AV14FacFchto, AV13FacFchfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A450FacPri = P003X3_A450FacPri[0] ;
         A396EmprCod = P003X3_A396EmprCod[0] ;
         A436FacFch = P003X3_A436FacFch[0] ;
         A252CliCod = P003X3_A252CliCod[0] ;
         A2739FacSerNum = P003X3_A2739FacSerNum[0] ;
         A1153FacTipFac = P003X3_A1153FacTipFac[0] ;
         A279CliNom = P003X3_A279CliNom[0] ;
         A430FacCod = P003X3_A430FacCod[0] ;
         A11513FacRecIca = P003X3_A11513FacRecIca[0] ;
         A8346FacRecI = P003X3_A8346FacRecI[0] ;
         n8346FacRecI = P003X3_n8346FacRecI[0] ;
         A7212FacRect = P003X3_A7212FacRect[0] ;
         A453FacRECPor = P003X3_A453FacRECPor[0] ;
         A14224FacCostFac = P003X3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P003X3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P003X3_A14222FacCostMts[0] ;
         A433FacDtoGen = P003X3_A433FacDtoGen[0] ;
         A443FacIVAPor = P003X3_A443FacIVAPor[0] ;
         A434FacDtoPP = P003X3_A434FacDtoPP[0] ;
         A7209Colombia = P003X3_A7209Colombia[0] ;
         n7209Colombia = P003X3_n7209Colombia[0] ;
         A14219FacEnergia = P003X3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P003X3_A3918FacImpTot1[0] ;
         A7209Colombia = P003X3_A7209Colombia[0] ;
         n7209Colombia = P003X3_n7209Colombia[0] ;
         A279CliNom = P003X3_A279CliNom[0] ;
         A3918FacImpTot1 = P003X3_A3918FacImpTot1[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         Gxm1resumenfacturacion_sdt = (app.facturacion.SdtResumenFacturacion_SDT_Item)new app.facturacion.SdtResumenFacturacion_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1resumenfacturacion_sdt, 0);
         GXt_int1 = AV20Pzs_fra ;
         GXv_decimal2[0] = AV5Kgs_Fra ;
         GXv_decimal3[0] = AV6Kgs_otros ;
         GXv_int4[0] = GXt_int1 ;
         new app.pacumkgscopy1(remoteHandle, context).execute( A396EmprCod, A430FacCod, (byte)(AV19Carvema), GXv_decimal2, GXv_decimal3, GXv_int4) ;
         resumenfacturacion_dp.this.AV5Kgs_Fra = GXv_decimal2[0] ;
         resumenfacturacion_dp.this.AV6Kgs_otros = GXv_decimal3[0] ;
         resumenfacturacion_dp.this.GXt_int1 = GXv_int4[0] ;
         AV20Pzs_fra = GXt_int1 ;
         AV7Pre_medio = ((AV5Kgs_Fra.doubleValue()>0) ? GXutil.roundDecimal( A441FacImpTot.divide(AV5Kgs_Fra, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Faccod( A430FacCod );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Facfch( A436FacFch );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Clicod( A252CliCod );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Clinom( A279CliNom );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Facimptot( A441FacImpTot );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Facimppp( A440FacImpPP );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp( A442FacIVAImp );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen( A439FacImpGen );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Factot( A455FacTot );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra( AV5Kgs_Fra );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros( AV6Kgs_otros );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio( AV7Pre_medio );
         Gxm1resumenfacturacion_sdt.setgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra( AV20Pzs_fra );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = resumenfacturacion_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>(app.facturacion.SdtResumenFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A2739FacSerNum = "" ;
      A450FacPri = "" ;
      A396EmprCod = "" ;
      P003X3_A450FacPri = new String[] {""} ;
      P003X3_A396EmprCod = new String[] {""} ;
      P003X3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P003X3_A252CliCod = new int[1] ;
      P003X3_A2739FacSerNum = new String[] {""} ;
      P003X3_A1153FacTipFac = new byte[1] ;
      P003X3_A279CliNom = new String[] {""} ;
      P003X3_A430FacCod = new int[1] ;
      P003X3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_n8346FacRecI = new boolean[] {false} ;
      P003X3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A443FacIVAPor = new byte[1] ;
      P003X3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A7209Colombia = new byte[1] ;
      P003X3_n7209Colombia = new boolean[] {false} ;
      P003X3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003X3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A279CliNom = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      Gxm1resumenfacturacion_sdt = new app.facturacion.SdtResumenFacturacion_SDT_Item(remoteHandle, context);
      AV5Kgs_Fra = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      AV6Kgs_otros = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_int4 = new int[1] ;
      AV7Pre_medio = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.resumenfacturacion_dp__default(),
         new Object[] {
             new Object[] {
            P003X3_A450FacPri, P003X3_A396EmprCod, P003X3_A436FacFch, P003X3_A252CliCod, P003X3_A2739FacSerNum, P003X3_A1153FacTipFac, P003X3_A279CliNom, P003X3_A430FacCod, P003X3_A11513FacRecIca, P003X3_A8346FacRecI,
            P003X3_n8346FacRecI, P003X3_A7212FacRect, P003X3_A453FacRECPor, P003X3_A14224FacCostFac, P003X3_A14223FacCostKgs, P003X3_A14222FacCostMts, P003X3_A433FacDtoGen, P003X3_A443FacIVAPor, P003X3_A434FacDtoPP, P003X3_A7209Colombia,
            P003X3_n7209Colombia, P003X3_A14219FacEnergia, P003X3_A3918FacImpTot1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short AV19Carvema ;
   private short Gx_err ;
   private int AV15CliCodfrom ;
   private int AV17CliCodto ;
   private int A252CliCod ;
   private int A430FacCod ;
   private int AV20Pzs_fra ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV5Kgs_Fra ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal AV6Kgs_otros ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV7Pre_medio ;
   private String AV18Emprcod ;
   private String AV12FacSerNum ;
   private String AV16FacPri ;
   private String scmdbuf ;
   private String A2739FacSerNum ;
   private String A450FacPri ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private java.util.Date AV13FacFchfrom ;
   private java.util.Date AV14FacFchto ;
   private java.util.Date A436FacFch ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P003X3_A450FacPri ;
   private String[] P003X3_A396EmprCod ;
   private java.util.Date[] P003X3_A436FacFch ;
   private int[] P003X3_A252CliCod ;
   private String[] P003X3_A2739FacSerNum ;
   private byte[] P003X3_A1153FacTipFac ;
   private String[] P003X3_A279CliNom ;
   private int[] P003X3_A430FacCod ;
   private java.math.BigDecimal[] P003X3_A11513FacRecIca ;
   private java.math.BigDecimal[] P003X3_A8346FacRecI ;
   private boolean[] P003X3_n8346FacRecI ;
   private java.math.BigDecimal[] P003X3_A7212FacRect ;
   private java.math.BigDecimal[] P003X3_A453FacRECPor ;
   private java.math.BigDecimal[] P003X3_A14224FacCostFac ;
   private java.math.BigDecimal[] P003X3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P003X3_A14222FacCostMts ;
   private java.math.BigDecimal[] P003X3_A433FacDtoGen ;
   private byte[] P003X3_A443FacIVAPor ;
   private java.math.BigDecimal[] P003X3_A434FacDtoPP ;
   private byte[] P003X3_A7209Colombia ;
   private boolean[] P003X3_n7209Colombia ;
   private java.math.BigDecimal[] P003X3_A14219FacEnergia ;
   private java.math.BigDecimal[] P003X3_A3918FacImpTot1 ;
   private GXBaseCollection<app.facturacion.SdtResumenFacturacion_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtResumenFacturacion_SDT_Item Gxm1resumenfacturacion_sdt ;
}

final  class resumenfacturacion_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV17CliCodto ,
                                          int AV15CliCodfrom ,
                                          java.util.Date AV14FacFchto ,
                                          java.util.Date AV13FacFchfrom ,
                                          int A252CliCod ,
                                          java.util.Date A436FacFch ,
                                          byte A1153FacTipFac ,
                                          String AV12FacSerNum ,
                                          String A2739FacSerNum ,
                                          String A450FacPri ,
                                          String AV16FacPri ,
                                          String AV18Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[9];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.FacPri, T1.EmprCod, T1.FacFch, T1.CliCod, T1.FacSerNum, T1.FacTipFac, T3.CliNom, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacCostFac," ;
      scmdbuf += " T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, T1.FacIVAPor, T1.FacDtoPP, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1 FROM (((TXPCFAVEN T1" ;
      scmdbuf += " INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, FacCod," ;
      scmdbuf += " SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin" ;
      scmdbuf += " WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds" ;
      scmdbuf += " * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0)" ;
      scmdbuf += " and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0 or ? = 'XXX')");
      addWhere(sWhereString, "(( T1.FacSerNum = ?) or ? = 'XXX')");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      if ( ! (0==AV17CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FacFchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13FacFchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacFch, T1.FacCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P003X3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               return;
      }
   }

}

