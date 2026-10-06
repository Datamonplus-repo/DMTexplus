package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturasemitidas_prc extends GXProcedure
{
   public facturasemitidas_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturasemitidas_prc.class ), "" );
   }

   public facturasemitidas_prc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int aP3 ,
                             int aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             String aP7 ,
                             short aP8 ,
                             String aP9 )
   {
      facturasemitidas_prc.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        int aP3 ,
                        int aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        String aP7 ,
                        short aP8 ,
                        String aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int aP3 ,
                             int aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             String aP7 ,
                             short aP8 ,
                             String aP9 ,
                             String[] aP10 )
   {
      facturasemitidas_prc.this.AV8Emprcod = aP0;
      facturasemitidas_prc.this.AV9PCliCod = aP1;
      facturasemitidas_prc.this.AV10UCliCod = aP2;
      facturasemitidas_prc.this.AV11PFacCod = aP3;
      facturasemitidas_prc.this.AV12UFacCod = aP4;
      facturasemitidas_prc.this.AV13PFecha = aP5;
      facturasemitidas_prc.this.AV14UFecha = aP6;
      facturasemitidas_prc.this.AV15FacSerNum = aP7;
      facturasemitidas_prc.this.AV30TipFra = aP8;
      facturasemitidas_prc.this.AV16FacPri = aP9;
      facturasemitidas_prc.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FacturasEmitidas_SDT.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV11PFacCod) ,
                                           Integer.valueOf(AV12UFacCod) ,
                                           AV13PFecha ,
                                           AV14UFecha ,
                                           Integer.valueOf(AV9PCliCod) ,
                                           Integer.valueOf(AV10UCliCod) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           A14226FacAnulada ,
                                           A2739FacSerNum ,
                                           AV15FacSerNum ,
                                           AV8Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A5W3 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV15FacSerNum, Integer.valueOf(AV11PFacCod), Integer.valueOf(AV12UFacCod), AV13PFecha, AV14UFecha, Integer.valueOf(AV9PCliCod), Integer.valueOf(AV10UCliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14226FacAnulada = P0A5W3_A14226FacAnulada[0] ;
         A2739FacSerNum = P0A5W3_A2739FacSerNum[0] ;
         A435FacEst = P0A5W3_A435FacEst[0] ;
         A252CliCod = P0A5W3_A252CliCod[0] ;
         A436FacFch = P0A5W3_A436FacFch[0] ;
         A430FacCod = P0A5W3_A430FacCod[0] ;
         A396EmprCod = P0A5W3_A396EmprCod[0] ;
         A450FacPri = P0A5W3_A450FacPri[0] ;
         A1153FacTipFac = P0A5W3_A1153FacTipFac[0] ;
         A279CliNom = P0A5W3_A279CliNom[0] ;
         A278CliNif = P0A5W3_A278CliNif[0] ;
         A11513FacRecIca = P0A5W3_A11513FacRecIca[0] ;
         A8346FacRecI = P0A5W3_A8346FacRecI[0] ;
         n8346FacRecI = P0A5W3_n8346FacRecI[0] ;
         A7212FacRect = P0A5W3_A7212FacRect[0] ;
         A443FacIVAPor = P0A5W3_A443FacIVAPor[0] ;
         A14224FacCostFac = P0A5W3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P0A5W3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P0A5W3_A14222FacCostMts[0] ;
         A434FacDtoPP = P0A5W3_A434FacDtoPP[0] ;
         A433FacDtoGen = P0A5W3_A433FacDtoGen[0] ;
         A14219FacEnergia = P0A5W3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P0A5W3_A3918FacImpTot1[0] ;
         A453FacRECPor = P0A5W3_A453FacRECPor[0] ;
         A7209Colombia = P0A5W3_A7209Colombia[0] ;
         n7209Colombia = P0A5W3_n7209Colombia[0] ;
         A7209Colombia = P0A5W3_A7209Colombia[0] ;
         n7209Colombia = P0A5W3_n7209Colombia[0] ;
         A279CliNom = P0A5W3_A279CliNom[0] ;
         A278CliNif = P0A5W3_A278CliNif[0] ;
         A3918FacImpTot1 = P0A5W3_A3918FacImpTot1[0] ;
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
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         if ( ( GXutil.strcmp(AV16FacPri, "2") == 0 ) || ( GXutil.strcmp(A450FacPri, AV16FacPri) == 0 ) )
         {
            if ( ( AV30TipFra == 3 ) || ( A1153FacTipFac == AV30TipFra ) )
            {
               AV20FacIVAImp = A442FacIVAImp.add(A452FacRecImp) ;
               if ( AV31FacCom == 1 )
               {
                  AV21FacCod = A430FacCod ;
                  /* Execute user subroutine: 'LFAVEN' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               if ( ( AV32NotCre == 0 ) || ( A1153FacTipFac != 1 ) )
               {
                  if ( ( AV31FacCom == 0 ) || ( AV37Faclis == 1 ) )
                  {
                     AV21FacCod = A430FacCod ;
                     /* Execute user subroutine: 'MTSKGS' */
                     S121 ();
                     if ( returnInSub )
                     {
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV19FacturasEmitidas_SDT_item = (app.facturacion.SdtFacturasEmitidas_SDT_Item)new app.facturacion.SdtFacturasEmitidas_SDT_Item(remoteHandle, context);
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Faccod( A430FacCod );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facfch( A436FacFch );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clicod( A252CliCod );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clinom( A279CliNom );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clinif( A278CliNif );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Factot( A455FacTot );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp( A429FacBasImp );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor( A443FacIVAPor );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp( AV20FacIVAImp );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs( AV24Kgs_fra );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts( AV23Mts_fra );
                     AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Factipo( (byte)(1) );
                     AV18FacturasEmitidas_SDT.add(AV19FacturasEmitidas_SDT_item, 0);
                  }
               }
               else
               {
                  AV21FacCod = A430FacCod ;
                  /* Execute user subroutine: 'MTSKGS' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV19FacturasEmitidas_SDT_item = (app.facturacion.SdtFacturasEmitidas_SDT_Item)new app.facturacion.SdtFacturasEmitidas_SDT_Item(remoteHandle, context);
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Faccod( A430FacCod );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facfch( A436FacFch );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clicod( A252CliCod );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clinom( A279CliNom );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Clinif( A278CliNif );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Factot( A455FacTot );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp( (A429FacBasImp.multiply(DecimalUtil.doubleToDec(-1))) );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor( (byte)((A443FacIVAPor*-1)) );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp( (AV20FacIVAImp.multiply(DecimalUtil.doubleToDec(-1))) );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs( AV24Kgs_fra );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts( AV23Mts_fra );
                  AV19FacturasEmitidas_SDT_item.setgxTv_SdtFacturasEmitidas_SDT_Item_Factipo( (byte)(2) );
                  AV18FacturasEmitidas_SDT.add(AV19FacturasEmitidas_SDT_item, 0);
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV33FacturasEmitidas_SDT_json = AV18FacturasEmitidas_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LFAVEN' Routine */
      returnInSub = false ;
      AV37Faclis = (byte)(0) ;
      if ( AV22FacAlbTip == 0 )
      {
         AV37Faclis = (byte)(1) ;
      }
      else
      {
         /* Using cursor P0A5W4 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV21FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A430FacCod = P0A5W4_A430FacCod[0] ;
            A454FacSer = P0A5W4_A454FacSer[0] ;
            A428FacAlbTip = P0A5W4_A428FacAlbTip[0] ;
            A446FacLin = P0A5W4_A446FacLin[0] ;
            A396EmprCod = P0A5W4_A396EmprCod[0] ;
            if ( ( A428FacAlbTip == AV22FacAlbTip ) && ( ( AV22FacAlbTip == 1 ) || ( GXutil.strcmp(A454FacSer, httpContext.getMessage( "COMERCIAL", "")) == 0 ) ) )
            {
               AV37Faclis = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'MTSKGS' Routine */
      returnInSub = false ;
      AV23Mts_fra = DecimalUtil.doubleToDec(0) ;
      AV24Kgs_fra = DecimalUtil.doubleToDec(0) ;
      AV25Hdr = GXutil.space( (short)(10)) ;
      AV26LastHdr = GXutil.space( (short)(10)) ;
      /* Using cursor P0A5W5 */
      pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV21FacCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0A5W5_A396EmprCod[0] ;
         A430FacCod = P0A5W5_A430FacCod[0] ;
         A449FacPreMts = P0A5W5_A449FacPreMts[0] ;
         A447FacMts = P0A5W5_A447FacMts[0] ;
         A448FacPreKgs = P0A5W5_A448FacPreKgs[0] ;
         A444FacKgs = P0A5W5_A444FacKgs[0] ;
         A1296FacBarPar = P0A5W5_A1296FacBarPar[0] ;
         A1295FacBarReo = P0A5W5_A1295FacBarReo[0] ;
         A1294FacBarCod = P0A5W5_A1294FacBarCod[0] ;
         A427FacAlbCod = P0A5W5_A427FacAlbCod[0] ;
         A446FacLin = P0A5W5_A446FacLin[0] ;
         AV25Hdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
         if ( GXutil.strcmp(AV25Hdr, AV26LastHdr) != 0 )
         {
            if ( A449FacPreMts.doubleValue() > 0 )
            {
               AV23Mts_fra = AV23Mts_fra.add(A447FacMts) ;
            }
            if ( A448FacPreKgs.doubleValue() > 0 )
            {
               AV24Kgs_fra = AV24Kgs_fra.add(A444FacKgs) ;
            }
         }
         AV26LastHdr = GXutil.str( A1294FacBarCod, 8, 0) + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
         AV27FacMts = A447FacMts ;
         AV28FacKgs = A444FacKgs ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP10[0] = facturasemitidas_prc.this.AV33FacturasEmitidas_SDT_json;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33FacturasEmitidas_SDT_json = "" ;
      AV18FacturasEmitidas_SDT = new GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item>(app.facturacion.SdtFacturasEmitidas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A14226FacAnulada = "" ;
      A2739FacSerNum = "" ;
      A396EmprCod = "" ;
      P0A5W3_A14226FacAnulada = new String[] {""} ;
      P0A5W3_A2739FacSerNum = new String[] {""} ;
      P0A5W3_A435FacEst = new byte[1] ;
      P0A5W3_A252CliCod = new int[1] ;
      P0A5W3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5W3_A430FacCod = new int[1] ;
      P0A5W3_A396EmprCod = new String[] {""} ;
      P0A5W3_A450FacPri = new String[] {""} ;
      P0A5W3_A1153FacTipFac = new byte[1] ;
      P0A5W3_A279CliNom = new String[] {""} ;
      P0A5W3_A278CliNif = new String[] {""} ;
      P0A5W3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_n8346FacRecI = new boolean[] {false} ;
      P0A5W3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A443FacIVAPor = new byte[1] ;
      P0A5W3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W3_A7209Colombia = new byte[1] ;
      P0A5W3_n7209Colombia = new boolean[] {false} ;
      A450FacPri = "" ;
      A279CliNom = "" ;
      A278CliNif = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
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
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV20FacIVAImp = DecimalUtil.ZERO ;
      AV19FacturasEmitidas_SDT_item = new app.facturacion.SdtFacturasEmitidas_SDT_Item(remoteHandle, context);
      AV24Kgs_fra = DecimalUtil.ZERO ;
      AV23Mts_fra = DecimalUtil.ZERO ;
      P0A5W4_A430FacCod = new int[1] ;
      P0A5W4_A454FacSer = new String[] {""} ;
      P0A5W4_A428FacAlbTip = new byte[1] ;
      P0A5W4_A446FacLin = new int[1] ;
      P0A5W4_A396EmprCod = new String[] {""} ;
      A454FacSer = "" ;
      AV25Hdr = "" ;
      AV26LastHdr = "" ;
      P0A5W5_A396EmprCod = new String[] {""} ;
      P0A5W5_A430FacCod = new int[1] ;
      P0A5W5_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W5_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W5_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W5_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5W5_A1296FacBarPar = new String[] {""} ;
      P0A5W5_A1295FacBarReo = new byte[1] ;
      P0A5W5_A1294FacBarCod = new int[1] ;
      P0A5W5_A427FacAlbCod = new long[1] ;
      P0A5W5_A446FacLin = new int[1] ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      AV27FacMts = DecimalUtil.ZERO ;
      AV28FacKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturasemitidas_prc__default(),
         new Object[] {
             new Object[] {
            P0A5W3_A14226FacAnulada, P0A5W3_A2739FacSerNum, P0A5W3_A435FacEst, P0A5W3_A252CliCod, P0A5W3_A436FacFch, P0A5W3_A430FacCod, P0A5W3_A396EmprCod, P0A5W3_A450FacPri, P0A5W3_A1153FacTipFac, P0A5W3_A279CliNom,
            P0A5W3_A278CliNif, P0A5W3_A11513FacRecIca, P0A5W3_A8346FacRecI, P0A5W3_n8346FacRecI, P0A5W3_A7212FacRect, P0A5W3_A443FacIVAPor, P0A5W3_A14224FacCostFac, P0A5W3_A14223FacCostKgs, P0A5W3_A14222FacCostMts, P0A5W3_A434FacDtoPP,
            P0A5W3_A433FacDtoGen, P0A5W3_A14219FacEnergia, P0A5W3_A3918FacImpTot1, P0A5W3_A453FacRECPor, P0A5W3_A7209Colombia, P0A5W3_n7209Colombia
            }
            , new Object[] {
            P0A5W4_A430FacCod, P0A5W4_A454FacSer, P0A5W4_A428FacAlbTip, P0A5W4_A446FacLin, P0A5W4_A396EmprCod
            }
            , new Object[] {
            P0A5W5_A396EmprCod, P0A5W5_A430FacCod, P0A5W5_A449FacPreMts, P0A5W5_A447FacMts, P0A5W5_A448FacPreKgs, P0A5W5_A444FacKgs, P0A5W5_A1296FacBarPar, P0A5W5_A1295FacBarReo, P0A5W5_A1294FacBarCod, P0A5W5_A427FacAlbCod,
            P0A5W5_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV37Faclis ;
   private byte AV22FacAlbTip ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private short AV30TipFra ;
   private short AV31FacCom ;
   private short AV32NotCre ;
   private short Gx_err ;
   private int AV9PCliCod ;
   private int AV10UCliCod ;
   private int AV11PFacCod ;
   private int AV12UFacCod ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV21FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A453FacRECPor ;
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
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV20FacIVAImp ;
   private java.math.BigDecimal AV24Kgs_fra ;
   private java.math.BigDecimal AV23Mts_fra ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal AV27FacMts ;
   private java.math.BigDecimal AV28FacKgs ;
   private String AV8Emprcod ;
   private String AV15FacSerNum ;
   private String AV16FacPri ;
   private String scmdbuf ;
   private String A14226FacAnulada ;
   private String A2739FacSerNum ;
   private String A396EmprCod ;
   private String A450FacPri ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A454FacSer ;
   private String AV25Hdr ;
   private String AV26LastHdr ;
   private String A1296FacBarPar ;
   private java.util.Date AV13PFecha ;
   private java.util.Date AV14UFecha ;
   private java.util.Date A436FacFch ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean returnInSub ;
   private String AV33FacturasEmitidas_SDT_json ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5W3_A14226FacAnulada ;
   private String[] P0A5W3_A2739FacSerNum ;
   private byte[] P0A5W3_A435FacEst ;
   private int[] P0A5W3_A252CliCod ;
   private java.util.Date[] P0A5W3_A436FacFch ;
   private int[] P0A5W3_A430FacCod ;
   private String[] P0A5W3_A396EmprCod ;
   private String[] P0A5W3_A450FacPri ;
   private byte[] P0A5W3_A1153FacTipFac ;
   private String[] P0A5W3_A279CliNom ;
   private String[] P0A5W3_A278CliNif ;
   private java.math.BigDecimal[] P0A5W3_A11513FacRecIca ;
   private java.math.BigDecimal[] P0A5W3_A8346FacRecI ;
   private boolean[] P0A5W3_n8346FacRecI ;
   private java.math.BigDecimal[] P0A5W3_A7212FacRect ;
   private byte[] P0A5W3_A443FacIVAPor ;
   private java.math.BigDecimal[] P0A5W3_A14224FacCostFac ;
   private java.math.BigDecimal[] P0A5W3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P0A5W3_A14222FacCostMts ;
   private java.math.BigDecimal[] P0A5W3_A434FacDtoPP ;
   private java.math.BigDecimal[] P0A5W3_A433FacDtoGen ;
   private java.math.BigDecimal[] P0A5W3_A14219FacEnergia ;
   private java.math.BigDecimal[] P0A5W3_A3918FacImpTot1 ;
   private java.math.BigDecimal[] P0A5W3_A453FacRECPor ;
   private byte[] P0A5W3_A7209Colombia ;
   private boolean[] P0A5W3_n7209Colombia ;
   private int[] P0A5W4_A430FacCod ;
   private String[] P0A5W4_A454FacSer ;
   private byte[] P0A5W4_A428FacAlbTip ;
   private int[] P0A5W4_A446FacLin ;
   private String[] P0A5W4_A396EmprCod ;
   private String[] P0A5W5_A396EmprCod ;
   private int[] P0A5W5_A430FacCod ;
   private java.math.BigDecimal[] P0A5W5_A449FacPreMts ;
   private java.math.BigDecimal[] P0A5W5_A447FacMts ;
   private java.math.BigDecimal[] P0A5W5_A448FacPreKgs ;
   private java.math.BigDecimal[] P0A5W5_A444FacKgs ;
   private String[] P0A5W5_A1296FacBarPar ;
   private byte[] P0A5W5_A1295FacBarReo ;
   private int[] P0A5W5_A1294FacBarCod ;
   private long[] P0A5W5_A427FacAlbCod ;
   private int[] P0A5W5_A446FacLin ;
   private GXBaseCollection<app.facturacion.SdtFacturasEmitidas_SDT_Item> AV18FacturasEmitidas_SDT ;
   private app.facturacion.SdtFacturasEmitidas_SDT_Item AV19FacturasEmitidas_SDT_item ;
}

final  class facturasemitidas_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A5W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV11PFacCod ,
                                          int AV12UFacCod ,
                                          java.util.Date AV13PFecha ,
                                          java.util.Date AV14UFecha ,
                                          int AV9PCliCod ,
                                          int AV10UCliCod ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          String A14226FacAnulada ,
                                          String A2739FacSerNum ,
                                          String AV15FacSerNum ,
                                          String AV8Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[8];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.FacAnulada, T1.FacSerNum, T1.FacEst, T1.CliCod, T1.FacFch, T1.FacCod, T1.EmprCod, T1.FacPri, T1.FacTipFac, T3.CliNom, T3.CliNif, T1.FacRecIca, T1.FacRecI," ;
      scmdbuf += " T1.FacRect, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1, T1.FacRECPor," ;
      scmdbuf += " T2.Colombia FROM (((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA" ;
      scmdbuf += " * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs" ;
      scmdbuf += " = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and" ;
      scmdbuf += " (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP" ;
      scmdbuf += " BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacEst >= 1)");
      addWhere(sWhereString, "(T1.FacAnulada <> 'S')");
      addWhere(sWhereString, "(T1.FacSerNum = ?)");
      if ( ! (0==AV11PFacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV12UFacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13PFecha)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14UFecha)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (0==AV9PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! (0==AV10UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
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
                  return conditional_P0A5W3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5W4", "SELECT FacCod, FacSer, FacAlbTip, FacLin, EmprCod FROM TXPLFAVEN WHERE FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5W5", "SELECT EmprCod, FacCod, FacPreMts, FacMts, FacPreKgs, FacKgs, FacBarPar, FacBarReo, FacBarCod, FacAlbCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,3);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

