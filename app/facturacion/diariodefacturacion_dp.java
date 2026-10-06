package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class diariodefacturacion_dp extends GXProcedure
{
   public diariodefacturacion_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diariodefacturacion_dp.class ), "" );
   }

   public diariodefacturacion_dp( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> executeUdp( String aP0 ,
                                                                                        int aP1 ,
                                                                                        int aP2 ,
                                                                                        java.util.Date aP3 ,
                                                                                        java.util.Date aP4 ,
                                                                                        String aP5 ,
                                                                                        String aP6 ,
                                                                                        short aP7 ,
                                                                                        int aP8 ,
                                                                                        int aP9 ,
                                                                                        String aP10 ,
                                                                                        int aP11 ,
                                                                                        int aP12 ,
                                                                                        java.util.Date aP13 ,
                                                                                        java.util.Date aP14 )
   {
      diariodefacturacion_dp.this.aP15 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        int aP8 ,
                        int aP9 ,
                        String aP10 ,
                        int aP11 ,
                        int aP12 ,
                        java.util.Date aP13 ,
                        java.util.Date aP14 ,
                        GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             int aP8 ,
                             int aP9 ,
                             String aP10 ,
                             int aP11 ,
                             int aP12 ,
                             java.util.Date aP13 ,
                             java.util.Date aP14 ,
                             GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>[] aP15 )
   {
      diariodefacturacion_dp.this.AV5Emprcod = aP0;
      diariodefacturacion_dp.this.AV12Clicodfrom = aP1;
      diariodefacturacion_dp.this.AV11Clicodto = aP2;
      diariodefacturacion_dp.this.AV10Facfchfrom = aP3;
      diariodefacturacion_dp.this.AV9Facfchto = aP4;
      diariodefacturacion_dp.this.AV6FacPri = aP5;
      diariodefacturacion_dp.this.AV7FacSernum = aP6;
      diariodefacturacion_dp.this.AV8noserie = aP7;
      diariodefacturacion_dp.this.AV13TFDiariodeFacturacion_SDT__Clicod = aP8;
      diariodefacturacion_dp.this.AV17TFDiariodeFacturacion_SDT__Clicod_To = aP9;
      diariodefacturacion_dp.this.AV18TFDiariodeFacturacion_SDT__CliNom = aP10;
      diariodefacturacion_dp.this.AV19TFDiariodeFacturacion_SDT__Faccod = aP11;
      diariodefacturacion_dp.this.AV20TFDiariodeFacturacion_SDT__Faccod_To = aP12;
      diariodefacturacion_dp.this.AV21TFDiariodeFacturacion_SDT__Facfch = aP13;
      diariodefacturacion_dp.this.AV22TFDiariodeFacturacion_SDT__Facfch_To = aP14;
      diariodefacturacion_dp.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV18TFDiariodeFacturacion_SDT__CliNom ,
                                           Integer.valueOf(AV20TFDiariodeFacturacion_SDT__Faccod_To) ,
                                           Integer.valueOf(AV19TFDiariodeFacturacion_SDT__Faccod) ,
                                           Integer.valueOf(AV13TFDiariodeFacturacion_SDT__Clicod) ,
                                           AV22TFDiariodeFacturacion_SDT__Facfch_To ,
                                           AV21TFDiariodeFacturacion_SDT__Facfch ,
                                           Integer.valueOf(AV11Clicodto) ,
                                           Integer.valueOf(AV12Clicodfrom) ,
                                           AV9Facfchto ,
                                           AV10Facfchfrom ,
                                           A279CliNom ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV17TFDiariodeFacturacion_SDT__Clicod_To) ,
                                           A436FacFch ,
                                           A450FacPri ,
                                           AV6FacPri ,
                                           A2739FacSerNum ,
                                           AV7FacSernum ,
                                           Short.valueOf(AV8noserie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV18TFDiariodeFacturacion_SDT__CliNom = GXutil.padr( GXutil.rtrim( AV18TFDiariodeFacturacion_SDT__CliNom), 30, "%") ;
      /* Using cursor P00403 */
      pr_default.execute(0, new Object[] {AV6FacPri, AV6FacPri, AV7FacSernum, Short.valueOf(AV8noserie), lV18TFDiariodeFacturacion_SDT__CliNom, Integer.valueOf(AV20TFDiariodeFacturacion_SDT__Faccod_To), Integer.valueOf(AV19TFDiariodeFacturacion_SDT__Faccod), Integer.valueOf(AV17TFDiariodeFacturacion_SDT__Clicod_To), Integer.valueOf(AV13TFDiariodeFacturacion_SDT__Clicod), AV22TFDiariodeFacturacion_SDT__Facfch_To, AV21TFDiariodeFacturacion_SDT__Facfch, Integer.valueOf(AV11Clicodto), Integer.valueOf(AV12Clicodfrom), AV9Facfchto, AV10Facfchfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2739FacSerNum = P00403_A2739FacSerNum[0] ;
         A450FacPri = P00403_A450FacPri[0] ;
         A436FacFch = P00403_A436FacFch[0] ;
         A252CliCod = P00403_A252CliCod[0] ;
         A430FacCod = P00403_A430FacCod[0] ;
         A279CliNom = P00403_A279CliNom[0] ;
         A396EmprCod = P00403_A396EmprCod[0] ;
         A11513FacRecIca = P00403_A11513FacRecIca[0] ;
         A8346FacRecI = P00403_A8346FacRecI[0] ;
         n8346FacRecI = P00403_n8346FacRecI[0] ;
         A7212FacRect = P00403_A7212FacRect[0] ;
         A453FacRECPor = P00403_A453FacRECPor[0] ;
         A443FacIVAPor = P00403_A443FacIVAPor[0] ;
         A14224FacCostFac = P00403_A14224FacCostFac[0] ;
         A14223FacCostKgs = P00403_A14223FacCostKgs[0] ;
         A14222FacCostMts = P00403_A14222FacCostMts[0] ;
         A434FacDtoPP = P00403_A434FacDtoPP[0] ;
         A433FacDtoGen = P00403_A433FacDtoGen[0] ;
         A7209Colombia = P00403_A7209Colombia[0] ;
         n7209Colombia = P00403_n7209Colombia[0] ;
         A14219FacEnergia = P00403_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P00403_A3918FacImpTot1[0] ;
         A7209Colombia = P00403_A7209Colombia[0] ;
         n7209Colombia = P00403_n7209Colombia[0] ;
         A279CliNom = P00403_A279CliNom[0] ;
         A3918FacImpTot1 = P00403_A3918FacImpTot1[0] ;
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
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
         Gxm1diariodefacturacion_sdt = (app.facturacion.SdtDiariodeFacturacion_SDT_Item)new app.facturacion.SdtDiariodeFacturacion_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1diariodefacturacion_sdt, 0);
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch( A436FacFch );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod( A430FacCod );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod( A252CliCod );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom( A279CliNom );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot( A441FacImpTot );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen( A439FacImpGen );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp( A440FacImpPP );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp( A429FacBasImp );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp( A442FacIVAImp );
         Gxm1diariodefacturacion_sdt.setgxTv_SdtDiariodeFacturacion_SDT_Item_Factot( A455FacTot );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP15[0] = diariodefacturacion_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV18TFDiariodeFacturacion_SDT__CliNom = "" ;
      A279CliNom = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      P00403_A2739FacSerNum = new String[] {""} ;
      P00403_A450FacPri = new String[] {""} ;
      P00403_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P00403_A252CliCod = new int[1] ;
      P00403_A430FacCod = new int[1] ;
      P00403_A279CliNom = new String[] {""} ;
      P00403_A396EmprCod = new String[] {""} ;
      P00403_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_n8346FacRecI = new boolean[] {false} ;
      P00403_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A443FacIVAPor = new byte[1] ;
      P00403_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A7209Colombia = new byte[1] ;
      P00403_n7209Colombia = new boolean[] {false} ;
      P00403_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00403_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
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
      Gxm1diariodefacturacion_sdt = new app.facturacion.SdtDiariodeFacturacion_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.diariodefacturacion_dp__default(),
         new Object[] {
             new Object[] {
            P00403_A2739FacSerNum, P00403_A450FacPri, P00403_A436FacFch, P00403_A252CliCod, P00403_A430FacCod, P00403_A279CliNom, P00403_A396EmprCod, P00403_A11513FacRecIca, P00403_A8346FacRecI, P00403_n8346FacRecI,
            P00403_A7212FacRect, P00403_A453FacRECPor, P00403_A443FacIVAPor, P00403_A14224FacCostFac, P00403_A14223FacCostKgs, P00403_A14222FacCostMts, P00403_A434FacDtoPP, P00403_A433FacDtoGen, P00403_A7209Colombia, P00403_n7209Colombia,
            P00403_A14219FacEnergia, P00403_A3918FacImpTot1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short AV8noserie ;
   private short Gx_err ;
   private int AV12Clicodfrom ;
   private int AV11Clicodto ;
   private int AV13TFDiariodeFacturacion_SDT__Clicod ;
   private int AV17TFDiariodeFacturacion_SDT__Clicod_To ;
   private int AV19TFDiariodeFacturacion_SDT__Faccod ;
   private int AV20TFDiariodeFacturacion_SDT__Faccod_To ;
   private int A430FacCod ;
   private int A252CliCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
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
   private String AV5Emprcod ;
   private String AV6FacPri ;
   private String AV7FacSernum ;
   private String AV18TFDiariodeFacturacion_SDT__CliNom ;
   private String scmdbuf ;
   private String lV18TFDiariodeFacturacion_SDT__CliNom ;
   private String A279CliNom ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A396EmprCod ;
   private java.util.Date AV10Facfchfrom ;
   private java.util.Date AV9Facfchto ;
   private java.util.Date AV21TFDiariodeFacturacion_SDT__Facfch ;
   private java.util.Date AV22TFDiariodeFacturacion_SDT__Facfch_To ;
   private java.util.Date A436FacFch ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item>[] aP15 ;
   private IDataStoreProvider pr_default ;
   private String[] P00403_A2739FacSerNum ;
   private String[] P00403_A450FacPri ;
   private java.util.Date[] P00403_A436FacFch ;
   private int[] P00403_A252CliCod ;
   private int[] P00403_A430FacCod ;
   private String[] P00403_A279CliNom ;
   private String[] P00403_A396EmprCod ;
   private java.math.BigDecimal[] P00403_A11513FacRecIca ;
   private java.math.BigDecimal[] P00403_A8346FacRecI ;
   private boolean[] P00403_n8346FacRecI ;
   private java.math.BigDecimal[] P00403_A7212FacRect ;
   private java.math.BigDecimal[] P00403_A453FacRECPor ;
   private byte[] P00403_A443FacIVAPor ;
   private java.math.BigDecimal[] P00403_A14224FacCostFac ;
   private java.math.BigDecimal[] P00403_A14223FacCostKgs ;
   private java.math.BigDecimal[] P00403_A14222FacCostMts ;
   private java.math.BigDecimal[] P00403_A434FacDtoPP ;
   private java.math.BigDecimal[] P00403_A433FacDtoGen ;
   private byte[] P00403_A7209Colombia ;
   private boolean[] P00403_n7209Colombia ;
   private java.math.BigDecimal[] P00403_A14219FacEnergia ;
   private java.math.BigDecimal[] P00403_A3918FacImpTot1 ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtDiariodeFacturacion_SDT_Item Gxm1diariodefacturacion_sdt ;
}

final  class diariodefacturacion_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00403( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV18TFDiariodeFacturacion_SDT__CliNom ,
                                          int AV20TFDiariodeFacturacion_SDT__Faccod_To ,
                                          int AV19TFDiariodeFacturacion_SDT__Faccod ,
                                          int AV13TFDiariodeFacturacion_SDT__Clicod ,
                                          java.util.Date AV22TFDiariodeFacturacion_SDT__Facfch_To ,
                                          java.util.Date AV21TFDiariodeFacturacion_SDT__Facfch ,
                                          int AV11Clicodto ,
                                          int AV12Clicodfrom ,
                                          java.util.Date AV9Facfchto ,
                                          java.util.Date AV10Facfchfrom ,
                                          String A279CliNom ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          int AV17TFDiariodeFacturacion_SDT__Clicod_To ,
                                          java.util.Date A436FacFch ,
                                          String A450FacPri ,
                                          String AV6FacPri ,
                                          String A2739FacSerNum ,
                                          String AV7FacSernum ,
                                          short AV8noserie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[15];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.FacSerNum, T1.FacPri, T1.FacFch, T1.CliCod, T1.FacCod, T3.CliNom, T1.EmprCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac," ;
      scmdbuf += " T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1 FROM (((TXPCFAVEN T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE" ;
      scmdbuf += "  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds" ;
      scmdbuf += " * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( (" ;
      scmdbuf += " FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan =" ;
      scmdbuf += " 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.FacPri = ? or ? = '2')");
      addWhere(sWhereString, "(T1.FacSerNum = ? or ? = 1)");
      if ( ! (GXutil.strcmp("", AV18TFDiariodeFacturacion_SDT__CliNom)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(T3.CliNom))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV20TFDiariodeFacturacion_SDT__Faccod_To) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV19TFDiariodeFacturacion_SDT__Faccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! (0==AV13TFDiariodeFacturacion_SDT__Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      if ( ! (0==AV13TFDiariodeFacturacion_SDT__Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int1[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22TFDiariodeFacturacion_SDT__Facfch_To)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int1[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21TFDiariodeFacturacion_SDT__Facfch)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int1[10] = (byte)(1) ;
      }
      if ( ! (0==AV11Clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int1[11] = (byte)(1) ;
      }
      if ( ! (0==AV12Clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int1[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Facfchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int1[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10Facfchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int1[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacFch, T1.CliCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P00403(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00403", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
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
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

