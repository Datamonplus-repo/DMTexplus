package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cfaven_alta_aeat_json extends GXProcedure
{
   public cfaven_alta_aeat_json( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cfaven_alta_aeat_json.class ), "" );
   }

   public cfaven_alta_aeat_json( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.aeat.SdtRegistroFacturacionAlta executeUdp( String aP0 ,
                                                          int aP1 )
   {
      cfaven_alta_aeat_json.this.aP2 = new app.aeat.SdtRegistroFacturacionAlta[] {new app.aeat.SdtRegistroFacturacionAlta()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        app.aeat.SdtRegistroFacturacionAlta[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             app.aeat.SdtRegistroFacturacionAlta[] aP2 )
   {
      cfaven_alta_aeat_json.this.A396EmprCod = aP0;
      cfaven_alta_aeat_json.this.A430FacCod = aP1;
      cfaven_alta_aeat_json.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004O3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P004O3_A252CliCod[0] ;
         A278CliNif = P004O3_A278CliNif[0] ;
         A279CliNom = P004O3_A279CliNom[0] ;
         A436FacFch = P004O3_A436FacFch[0] ;
         A395EmprCif = P004O3_A395EmprCif[0] ;
         n395EmprCif = P004O3_n395EmprCif[0] ;
         A407EmprNom = P004O3_A407EmprNom[0] ;
         n407EmprNom = P004O3_n407EmprNom[0] ;
         A1153FacTipFac = P004O3_A1153FacTipFac[0] ;
         A11513FacRecIca = P004O3_A11513FacRecIca[0] ;
         A8346FacRecI = P004O3_A8346FacRecI[0] ;
         n8346FacRecI = P004O3_n8346FacRecI[0] ;
         A7212FacRect = P004O3_A7212FacRect[0] ;
         A453FacRECPor = P004O3_A453FacRECPor[0] ;
         A443FacIVAPor = P004O3_A443FacIVAPor[0] ;
         A14224FacCostFac = P004O3_A14224FacCostFac[0] ;
         A14223FacCostKgs = P004O3_A14223FacCostKgs[0] ;
         A14222FacCostMts = P004O3_A14222FacCostMts[0] ;
         A434FacDtoPP = P004O3_A434FacDtoPP[0] ;
         A433FacDtoGen = P004O3_A433FacDtoGen[0] ;
         A7209Colombia = P004O3_A7209Colombia[0] ;
         n7209Colombia = P004O3_n7209Colombia[0] ;
         A14219FacEnergia = P004O3_A14219FacEnergia[0] ;
         A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
         A395EmprCif = P004O3_A395EmprCif[0] ;
         n395EmprCif = P004O3_n395EmprCif[0] ;
         A407EmprNom = P004O3_A407EmprNom[0] ;
         n407EmprNom = P004O3_n407EmprNom[0] ;
         A7209Colombia = P004O3_A7209Colombia[0] ;
         n7209Colombia = P004O3_n7209Colombia[0] ;
         A278CliNif = P004O3_A278CliNif[0] ;
         A279CliNom = P004O3_A279CliNom[0] ;
         A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
         A14390FacNroCadA = GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
         A14391FacAEATId = getFacAEATId0( A14390FacNroCadA) ;
         A14392FacRegAEAT = (boolean)(((A14391FacAEATId>0))) ;
         if ( ! A14392FacRegAEAT )
         {
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
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
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
            if ( A455FacTot.doubleValue() > 0 )
            {
               AV8TipoFactura = "F1" ;
               GXt_char1 = AV5CadenaParaHashActual ;
               GXv_char2[0] = AV7FechaISO8601 ;
               GXv_char3[0] = GXt_char1 ;
               new app.aeat.cfaven_datos_hash_actual(remoteHandle, context).execute( A430FacCod, AV8TipoFactura, GXv_char2, GXv_char3) ;
               cfaven_alta_aeat_json.this.AV7FechaISO8601 = GXv_char2[0] ;
               cfaven_alta_aeat_json.this.GXt_char1 = GXv_char3[0] ;
               AV5CadenaParaHashActual = GXt_char1 ;
               GXt_char1 = AV9HuellaFactura ;
               GXv_char3[0] = GXt_char1 ;
               new app.aeat.generarhash(remoteHandle, context).execute( AV5CadenaParaHashActual, GXv_char3) ;
               cfaven_alta_aeat_json.this.GXt_char1 = GXv_char3[0] ;
               AV9HuellaFactura = GXt_char1 ;
               Gxm1registrofacturacionalta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().setgxTv_SdtRegistroFacturacionAlta_Cabecera_Version( "1.0" );
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P004O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P004O3_A430FacCod[0] == A430FacCod ) )
               {
                  A395EmprCif = P004O3_A395EmprCif[0] ;
                  n395EmprCif = P004O3_n395EmprCif[0] ;
                  A407EmprNom = P004O3_A407EmprNom[0] ;
                  n407EmprNom = P004O3_n407EmprNom[0] ;
                  A395EmprCif = P004O3_A395EmprCif[0] ;
                  n395EmprCif = P004O3_n395EmprCif[0] ;
                  A407EmprNom = P004O3_A407EmprNom[0] ;
                  n407EmprNom = P004O3_n407EmprNom[0] ;
                  Gxm1registrofacturacionalta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor().setgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nif( GXutil.trim( A395EmprCif) );
                  Gxm1registrofacturacionalta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor().setgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_Nombrerazon( GXutil.trim( A407EmprNom) );
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               Gxm1registrofacturacionalta.getgxTv_SdtRegistroFacturacionAlta_Cabecera().setgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio( AV7FechaISO8601 );
               Gxm2registrofacturacionalta_registro = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem)new app.aeat.SdtRegistroFacturacionAlta_RegistroItem(remoteHandle, context);
               Gxm1registrofacturacionalta.getgxTv_SdtRegistroFacturacionAlta_Registro().add(Gxm2registrofacturacionalta_registro, 0);
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P004O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P004O3_A430FacCod[0] == A430FacCod ) )
               {
                  A436FacFch = P004O3_A436FacFch[0] ;
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Numeroseriefacturaemisor( GXutil.trim( GXutil.str( A430FacCod, 8, 0)) );
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Fechaexpedicionfacturaemisor( GXutil.format( "%1-%2-%3", GXutil.ltrimstr( GXutil.year( A436FacFch), 9, 0), GXutil.padl( GXutil.str( GXutil.month( A436FacFch), 10, 0), (short)(2), "0"), GXutil.padl( GXutil.str( GXutil.day( A436FacFch), 10, 0), (short)(2), "0"), "", "", "", "", "", "") );
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Tipofactura( httpContext.getMessage( "F1", "") );
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Cabecerafactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_CabeceraFactura_Claveregimenfactura( "01" );
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P004O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P004O3_A430FacCod[0] == A430FacCod ) )
               {
                  A11513FacRecIca = P004O3_A11513FacRecIca[0] ;
                  A8346FacRecI = P004O3_A8346FacRecI[0] ;
                  n8346FacRecI = P004O3_n8346FacRecI[0] ;
                  A7212FacRect = P004O3_A7212FacRect[0] ;
                  A453FacRECPor = P004O3_A453FacRECPor[0] ;
                  A443FacIVAPor = P004O3_A443FacIVAPor[0] ;
                  A14224FacCostFac = P004O3_A14224FacCostFac[0] ;
                  A14223FacCostKgs = P004O3_A14223FacCostKgs[0] ;
                  A14222FacCostMts = P004O3_A14222FacCostMts[0] ;
                  A434FacDtoPP = P004O3_A434FacDtoPP[0] ;
                  A433FacDtoGen = P004O3_A433FacDtoGen[0] ;
                  A7209Colombia = P004O3_A7209Colombia[0] ;
                  n7209Colombia = P004O3_n7209Colombia[0] ;
                  A14219FacEnergia = P004O3_A14219FacEnergia[0] ;
                  A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
                  A7209Colombia = P004O3_A7209Colombia[0] ;
                  n7209Colombia = P004O3_n7209Colombia[0] ;
                  A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
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
                  A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
                  A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                  if ( A455FacTot.doubleValue() > 0 )
                  {
                     Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion( httpContext.getMessage( "Servicio de Tintes y Acabados Textiles", "") );
                     Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal( GXutil.strReplace( GXutil.trim( GXutil.str( A455FacTot, 13, 2)), ",", ".") );
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P004O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P004O3_A430FacCod[0] == A430FacCod ) )
                     {
                        A443FacIVAPor = P004O3_A443FacIVAPor[0] ;
                        A14224FacCostFac = P004O3_A14224FacCostFac[0] ;
                        A14223FacCostKgs = P004O3_A14223FacCostKgs[0] ;
                        A14222FacCostMts = P004O3_A14222FacCostMts[0] ;
                        A434FacDtoPP = P004O3_A434FacDtoPP[0] ;
                        A433FacDtoGen = P004O3_A433FacDtoGen[0] ;
                        A7209Colombia = P004O3_A7209Colombia[0] ;
                        n7209Colombia = P004O3_n7209Colombia[0] ;
                        A14219FacEnergia = P004O3_A14219FacEnergia[0] ;
                        A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
                        A7209Colombia = P004O3_A7209Colombia[0] ;
                        n7209Colombia = P004O3_n7209Colombia[0] ;
                        A3918FacImpTot1 = P004O3_A3918FacImpTot1[0] ;
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
                        Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Tipo( "21" );
                        Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Baseimponible( GXutil.strReplace( GXutil.trim( GXutil.str( A429FacBasImp, 13, 2)), ",", ".") );
                        Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Datosfactura().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos().getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA_Cuota( GXutil.strReplace( GXutil.trim( GXutil.str( A442FacIVAImp, 11, 2)), ",", ".") );
                        /* Exiting from a For First loop. */
                        if (true) break;
                     }
                  }
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P004O3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P004O3_A430FacCod[0] == A430FacCod ) )
               {
                  A252CliCod = P004O3_A252CliCod[0] ;
                  A278CliNif = P004O3_A278CliNif[0] ;
                  A279CliNom = P004O3_A279CliNom[0] ;
                  A278CliNif = P004O3_A278CliNif[0] ;
                  A279CliNom = P004O3_A279CliNom[0] ;
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nif( GXutil.trim( A278CliNif) );
                  Gxm2registrofacturacionalta_registro.getgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor().setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Receptor_Nombrerazon( GXutil.trim( A279CliNom) );
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               GXt_char1 = "" ;
               GXv_char3[0] = GXt_char1 ;
               new app.aeat.obtenerhashanterior(remoteHandle, context).execute( GXv_char3) ;
               cfaven_alta_aeat_json.this.GXt_char1 = GXv_char3[0] ;
               Gxm2registrofacturacionalta_registro.setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafacturaanterior( GXt_char1 );
               Gxm2registrofacturacionalta_registro.setgxTv_SdtRegistroFacturacionAlta_RegistroItem_Huellafactura( GXutil.trim( AV9HuellaFactura) );
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = cfaven_alta_aeat_json.this.Gxm1registrofacturacionalta;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public long getFacAEATId0( String E14390FacNroCadA )
   {
      X14378AEATId = 0 ;
      Gx_first = true ;
      /* Using cursor P004O4 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( ( GXutil.strcmp(P004O4_A14381AEATNumero[0], E14390FacNroCadA) == 0 ) && ( GXutil.strcmp(P004O4_A14379AEATEstado[0], httpContext.getMessage( httpContext.getMessage( "Correcto", ""), "")) == 0 ) )
         {
            X14378AEATId = P004O4_A14378AEATId[0] ;
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return X14378AEATId ;
   }

   public void initialize( )
   {
      Gxm1registrofacturacionalta = new app.aeat.SdtRegistroFacturacionAlta(remoteHandle, context);
      scmdbuf = "" ;
      P004O3_A252CliCod = new int[1] ;
      P004O3_A396EmprCod = new String[] {""} ;
      P004O3_A278CliNif = new String[] {""} ;
      P004O3_A279CliNom = new String[] {""} ;
      P004O3_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P004O3_A395EmprCif = new String[] {""} ;
      P004O3_n395EmprCif = new boolean[] {false} ;
      P004O3_A407EmprNom = new String[] {""} ;
      P004O3_n407EmprNom = new boolean[] {false} ;
      P004O3_A1153FacTipFac = new byte[1] ;
      P004O3_A430FacCod = new int[1] ;
      P004O3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_n8346FacRecI = new boolean[] {false} ;
      P004O3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A443FacIVAPor = new byte[1] ;
      P004O3_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A7209Colombia = new byte[1] ;
      P004O3_n7209Colombia = new boolean[] {false} ;
      P004O3_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004O3_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A278CliNif = "" ;
      A279CliNom = "" ;
      A436FacFch = GXutil.nullDate() ;
      A395EmprCif = "" ;
      A407EmprNom = "" ;
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
      A14390FacNroCadA = "" ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
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
      AV8TipoFactura = "" ;
      AV5CadenaParaHashActual = "" ;
      AV7FechaISO8601 = "" ;
      GXv_char2 = new String[1] ;
      AV9HuellaFactura = "" ;
      Gxm2registrofacturacionalta_registro = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      P004O4_A14378AEATId = new long[1] ;
      P004O4_A14381AEATNumero = new String[] {""} ;
      P004O4_A14379AEATEstado = new String[] {""} ;
      P004O4_n14379AEATEstado = new boolean[] {false} ;
      E14390FacNroCadA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aeat.cfaven_alta_aeat_json__default(),
         new Object[] {
             new Object[] {
            P004O3_A252CliCod, P004O3_A396EmprCod, P004O3_A278CliNif, P004O3_A279CliNom, P004O3_A436FacFch, P004O3_A395EmprCif, P004O3_n395EmprCif, P004O3_A407EmprNom, P004O3_n407EmprNom, P004O3_A1153FacTipFac,
            P004O3_A430FacCod, P004O3_A11513FacRecIca, P004O3_A8346FacRecI, P004O3_n8346FacRecI, P004O3_A7212FacRect, P004O3_A453FacRECPor, P004O3_A443FacIVAPor, P004O3_A14224FacCostFac, P004O3_A14223FacCostKgs, P004O3_A14222FacCostMts,
            P004O3_A434FacDtoPP, P004O3_A433FacDtoGen, P004O3_A7209Colombia, P004O3_n7209Colombia, P004O3_A14219FacEnergia, P004O3_A3918FacImpTot1
            }
            , new Object[] {
            P004O4_A14378AEATId, P004O4_A14381AEATNumero, P004O4_A14379AEATEstado, P004O4_n14379AEATEstado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A252CliCod ;
   private long A14391FacAEATId ;
   private long X14378AEATId ;
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
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
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
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A278CliNif ;
   private String A279CliNom ;
   private String A395EmprCif ;
   private String A407EmprNom ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private java.util.Date A436FacFch ;
   private boolean n395EmprCif ;
   private boolean n407EmprNom ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean A14392FacRegAEAT ;
   private boolean Gx_first ;
   private String A14390FacNroCadA ;
   private String AV8TipoFactura ;
   private String AV5CadenaParaHashActual ;
   private String AV7FechaISO8601 ;
   private String AV9HuellaFactura ;
   private String E14390FacNroCadA ;
   private app.aeat.SdtRegistroFacturacionAlta[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P004O3_A252CliCod ;
   private String[] P004O3_A396EmprCod ;
   private String[] P004O3_A278CliNif ;
   private String[] P004O3_A279CliNom ;
   private java.util.Date[] P004O3_A436FacFch ;
   private String[] P004O3_A395EmprCif ;
   private boolean[] P004O3_n395EmprCif ;
   private String[] P004O3_A407EmprNom ;
   private boolean[] P004O3_n407EmprNom ;
   private byte[] P004O3_A1153FacTipFac ;
   private int[] P004O3_A430FacCod ;
   private java.math.BigDecimal[] P004O3_A11513FacRecIca ;
   private java.math.BigDecimal[] P004O3_A8346FacRecI ;
   private boolean[] P004O3_n8346FacRecI ;
   private java.math.BigDecimal[] P004O3_A7212FacRect ;
   private java.math.BigDecimal[] P004O3_A453FacRECPor ;
   private byte[] P004O3_A443FacIVAPor ;
   private java.math.BigDecimal[] P004O3_A14224FacCostFac ;
   private java.math.BigDecimal[] P004O3_A14223FacCostKgs ;
   private java.math.BigDecimal[] P004O3_A14222FacCostMts ;
   private java.math.BigDecimal[] P004O3_A434FacDtoPP ;
   private java.math.BigDecimal[] P004O3_A433FacDtoGen ;
   private byte[] P004O3_A7209Colombia ;
   private boolean[] P004O3_n7209Colombia ;
   private java.math.BigDecimal[] P004O3_A14219FacEnergia ;
   private java.math.BigDecimal[] P004O3_A3918FacImpTot1 ;
   private long[] P004O4_A14378AEATId ;
   private String[] P004O4_A14381AEATNumero ;
   private String[] P004O4_A14379AEATEstado ;
   private boolean[] P004O4_n14379AEATEstado ;
   private app.aeat.SdtRegistroFacturacionAlta Gxm1registrofacturacionalta ;
   private app.aeat.SdtRegistroFacturacionAlta_RegistroItem Gxm2registrofacturacionalta_registro ;
}

final  class cfaven_alta_aeat_json__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004O3", "SELECT T1.CliCod, T1.EmprCod, T3.CliNif, T3.CliNom, T1.FacFch, T2.EmprCif, T2.EmprNom, T1.FacTipFac, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T2.Colombia, T1.FacEnergia, COALESCE( T4.FacImpTot1, 0) AS FacImpTot1 FROM (((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) WHERE (T1.EmprCod = ? and T1.FacCod = ?) AND ((T1.FacTipFac = 0)) ORDER BY T1.EmprCod, T1.FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004O4", "SELECT AEATId, AEATNumero, AEATEstado FROM TXPAEATHi ORDER BY AEATId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

