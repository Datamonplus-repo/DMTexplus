package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class saft1041_dp extends GXProcedure
{
   public saft1041_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( saft1041_dp.class ), "" );
   }

   public saft1041_dp( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> executeUdp( String aP0 ,
                                                                             int aP1 ,
                                                                             int aP2 ,
                                                                             java.util.Date aP3 ,
                                                                             java.util.Date aP4 ,
                                                                             short aP5 )
   {
      saft1041_dp.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        short aP5 ,
                        GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             short aP5 ,
                             GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>[] aP6 )
   {
      saft1041_dp.this.AV14Emprcod = aP0;
      saft1041_dp.this.AV8Faccodfrom = aP1;
      saft1041_dp.this.AV9Faccodto = aP2;
      saft1041_dp.this.AV6FacFchfrom = aP3;
      saft1041_dp.this.AV7FacFchto = aP4;
      saft1041_dp.this.AV15FirmaD = aP5;
      saft1041_dp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9Faccodto) ,
                                           Integer.valueOf(AV8Faccodfrom) ,
                                           AV7FacFchto ,
                                           AV6FacFchfrom ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           A450FacPri ,
                                           AV14Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003T3 */
      pr_default.execute(0, new Object[] {AV14Emprcod, Integer.valueOf(AV9Faccodto), Integer.valueOf(AV8Faccodfrom), AV7FacFchto, AV6FacFchfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A450FacPri = P003T3_A450FacPri[0] ;
         A396EmprCod = P003T3_A396EmprCod[0] ;
         A436FacFch = P003T3_A436FacFch[0] ;
         A430FacCod = P003T3_A430FacCod[0] ;
         A9710FacFirDg = P003T3_A9710FacFirDg[0] ;
         A9606FacHor = P003T3_A9606FacHor[0] ;
         A9646FacTot1 = P003T3_A9646FacTot1[0] ;
         A435FacEst = P003T3_A435FacEst[0] ;
         A9605FacFirma = P003T3_A9605FacFirma[0] ;
         A11513FacRecIca = P003T3_A11513FacRecIca[0] ;
         A8346FacRecI = P003T3_A8346FacRecI[0] ;
         n8346FacRecI = P003T3_n8346FacRecI[0] ;
         A7212FacRect = P003T3_A7212FacRect[0] ;
         A453FacRECPor = P003T3_A453FacRECPor[0] ;
         A443FacIVAPor = P003T3_A443FacIVAPor[0] ;
         A14224FacCostFac = P003T3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P003T3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P003T3_A14222FacCostMts[0] ;
         A434FacDtoPP = P003T3_A434FacDtoPP[0] ;
         A433FacDtoGen = P003T3_A433FacDtoGen[0] ;
         A7209Colombia = P003T3_A7209Colombia[0] ;
         n7209Colombia = P003T3_n7209Colombia[0] ;
         A14219FacEnergia = P003T3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P003T3_A3918FacImpTot1[0] ;
         A7209Colombia = P003T3_A7209Colombia[0] ;
         n7209Colombia = P003T3_n7209Colombia[0] ;
         A3918FacImpTot1 = P003T3_A3918FacImpTot1[0] ;
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
         Gxm1saft1041_sdt = (app.facturacion.SdtSAFT1041_SDT_Item)new app.facturacion.SdtSAFT1041_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1saft1041_sdt, 0);
         AV10DiaS = GXutil.substring( A9710FacFirDg, 20, 2) + "/" + GXutil.substring( A9710FacFirDg, 17, 2) + "/" + GXutil.substring( A9710FacFirDg, 12, 4) ;
         AV11TimeS = GXutil.substring( A9710FacFirDg, 23, 8) ;
         AV12Hhmmss = AV10DiaS + " " + AV11TimeS ;
         AV13Hhdt = localUtil.ctot( AV12Hhmmss, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Seleccionar1( (!(GXutil.dateCompare(A9606FacHor, AV13Hhdt))&&(AV15FirmaD==1) ? true : false) );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Seleccionar2( ((DecimalUtil.compareTo(A455FacTot, A9646FacTot1)!=0) ? true : false) );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Facest( A435FacEst );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Faccod( A430FacCod );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Facfch( A436FacFch );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Factot( A455FacTot );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Factot1( A9646FacTot1 );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Fachor( A9606FacHor );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Hhdt( AV13Hhdt );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Facfirdg( A9710FacFirDg );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Dias( AV10DiaS );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Times( AV11TimeS );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Hhmmss( AV12Hhmmss );
         Gxm1saft1041_sdt.setgxTv_SdtSAFT1041_SDT_Item_Facfirma( A9605FacFirma );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = saft1041_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>(app.facturacion.SdtSAFT1041_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A396EmprCod = "" ;
      P003T3_A450FacPri = new String[] {""} ;
      P003T3_A396EmprCod = new String[] {""} ;
      P003T3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P003T3_A430FacCod = new int[1] ;
      P003T3_A9710FacFirDg = new String[] {""} ;
      P003T3_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      P003T3_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A435FacEst = new byte[1] ;
      P003T3_A9605FacFirma = new String[] {""} ;
      P003T3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_n8346FacRecI = new boolean[] {false} ;
      P003T3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A443FacIVAPor = new byte[1] ;
      P003T3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A7209Colombia = new byte[1] ;
      P003T3_n7209Colombia = new boolean[] {false} ;
      P003T3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003T3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9710FacFirDg = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A9646FacTot1 = DecimalUtil.ZERO ;
      A9605FacFirma = "" ;
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
      Gxm1saft1041_sdt = new app.facturacion.SdtSAFT1041_SDT_Item(remoteHandle, context);
      AV10DiaS = "" ;
      AV11TimeS = "" ;
      AV12Hhmmss = "" ;
      AV13Hhdt = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.saft1041_dp__default(),
         new Object[] {
             new Object[] {
            P003T3_A450FacPri, P003T3_A396EmprCod, P003T3_A436FacFch, P003T3_A430FacCod, P003T3_A9710FacFirDg, P003T3_A9606FacHor, P003T3_A9646FacTot1, P003T3_A435FacEst, P003T3_A9605FacFirma, P003T3_A11513FacRecIca,
            P003T3_A8346FacRecI, P003T3_n8346FacRecI, P003T3_A7212FacRect, P003T3_A453FacRECPor, P003T3_A443FacIVAPor, P003T3_A14224FacCostFac, P003T3_A14223FacCostKgs, P003T3_A14222FacCostMts, P003T3_A434FacDtoPP, P003T3_A433FacDtoGen,
            P003T3_A7209Colombia, P003T3_n7209Colombia, P003T3_A14219FacEnergia, P003T3_A3918FacImpTot1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short AV15FirmaD ;
   private short Gx_err ;
   private int AV8Faccodfrom ;
   private int AV9Faccodto ;
   private int A430FacCod ;
   private java.math.BigDecimal A9646FacTot1 ;
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
   private String AV14Emprcod ;
   private String scmdbuf ;
   private String A450FacPri ;
   private String A396EmprCod ;
   private String A9710FacFirDg ;
   private String A9605FacFirma ;
   private String AV10DiaS ;
   private String AV11TimeS ;
   private String AV12Hhmmss ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV13Hhdt ;
   private java.util.Date AV6FacFchfrom ;
   private java.util.Date AV7FacFchto ;
   private java.util.Date A436FacFch ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P003T3_A450FacPri ;
   private String[] P003T3_A396EmprCod ;
   private java.util.Date[] P003T3_A436FacFch ;
   private int[] P003T3_A430FacCod ;
   private String[] P003T3_A9710FacFirDg ;
   private java.util.Date[] P003T3_A9606FacHor ;
   private java.math.BigDecimal[] P003T3_A9646FacTot1 ;
   private byte[] P003T3_A435FacEst ;
   private String[] P003T3_A9605FacFirma ;
   private java.math.BigDecimal[] P003T3_A11513FacRecIca ;
   private java.math.BigDecimal[] P003T3_A8346FacRecI ;
   private boolean[] P003T3_n8346FacRecI ;
   private java.math.BigDecimal[] P003T3_A7212FacRect ;
   private java.math.BigDecimal[] P003T3_A453FacRECPor ;
   private byte[] P003T3_A443FacIVAPor ;
   private java.math.BigDecimal[] P003T3_A14224FacCostFac ;
   private java.math.BigDecimal[] P003T3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P003T3_A14222FacCostMts ;
   private java.math.BigDecimal[] P003T3_A434FacDtoPP ;
   private java.math.BigDecimal[] P003T3_A433FacDtoGen ;
   private byte[] P003T3_A7209Colombia ;
   private boolean[] P003T3_n7209Colombia ;
   private java.math.BigDecimal[] P003T3_A14219FacEnergia ;
   private java.math.BigDecimal[] P003T3_A3918FacImpTot1 ;
   private GXBaseCollection<app.facturacion.SdtSAFT1041_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtSAFT1041_SDT_Item Gxm1saft1041_sdt ;
}

final  class saft1041_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9Faccodto ,
                                          int AV8Faccodfrom ,
                                          java.util.Date AV7FacFchto ,
                                          java.util.Date AV6FacFchfrom ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          String A450FacPri ,
                                          String AV14Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[5];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.FacPri, T1.EmprCod, T1.FacFch, T1.FacCod, T1.FacFirDg, T1.FacHor, T1.FacTot1, T1.FacEst, T1.FacFirma, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor," ;
      scmdbuf += " T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1 FROM" ;
      scmdbuf += " ((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin" ;
      scmdbuf += " and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts" ;
      scmdbuf += " * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan =" ;
      scmdbuf += " 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacPri = '1')");
      if ( ! (0==AV9Faccodto) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8Faccodfrom) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7FacFchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6FacFchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacFch, T1.FacCod" ;
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
                  return conditional_P003T3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 200);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               return;
      }
   }

}

