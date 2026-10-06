package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientofacturawwgetfilterdata extends GXProcedure
{
   public mantenimientofacturawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofacturawwgetfilterdata.class ), "" );
   }

   public mantenimientofacturawwgetfilterdata( int remoteHandle ,
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
      mantenimientofacturawwgetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientofacturawwgetfilterdata.this.AV32DDOName = aP0;
      mantenimientofacturawwgetfilterdata.this.AV33SearchTxt = aP1;
      mantenimientofacturawwgetfilterdata.this.AV34SearchTxtTo = aP2;
      mantenimientofacturawwgetfilterdata.this.aP3 = aP3;
      mantenimientofacturawwgetfilterdata.this.aP4 = aP4;
      mantenimientofacturawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("Facturacion.MantenimientoFacturaWWGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV18TFCliNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV19TFCliNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPTOT") == 0 )
         {
            AV39TFFacImpTot = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFFacImpTot_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV41TFFacImpPP = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFFacImpPP_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV43TFFacBasImp = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFFacBasImp_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV45TFFacIVAImp = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFFacIVAImp_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV47TFFacTot = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFFacTot_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV49TFFacEst_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFFacEst_Sels.fromJSonString(AV49TFFacEst_SelsJson, null);
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCliNom = AV33SearchTxt ;
      AV19TFCliNom_Sel = "" ;
      AV63Facturacion_mantenimientofacturawwds_1_tfclinom = AV18TFCliNom ;
      AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV19TFCliNom_Sel ;
      AV65Facturacion_mantenimientofacturawwds_3_tffacimptot = AV39TFFacImpTot ;
      AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV40TFFacImpTot_To ;
      AV67Facturacion_mantenimientofacturawwds_5_tffacimppp = AV41TFFacImpPP ;
      AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV42TFFacImpPP_To ;
      AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV43TFFacBasImp ;
      AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV44TFFacBasImp_To ;
      AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV45TFFacIVAImp ;
      AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV46TFFacIVAImp_To ;
      AV73Facturacion_mantenimientofacturawwds_11_tffactot = AV47TFFacTot ;
      AV74Facturacion_mantenimientofacturawwds_12_tffactot_to = AV48TFFacTot_To ;
      AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV50TFFacEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A435FacEst) ,
                                           AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                           AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                           AV63Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                           Integer.valueOf(AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels.size()) ,
                                           Integer.valueOf(AV54FacCod) ,
                                           Integer.valueOf(AV56CliCod) ,
                                           AV57FacFchFrom ,
                                           AV58FacFchto ,
                                           A279CliNom ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A436FacFch ,
                                           AV65Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                           A441FacImpTot ,
                                           AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                           AV67Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                           A440FacImpPP ,
                                           AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                           AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                           A429FacBasImp ,
                                           AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                           AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                           A442FacIVAImp ,
                                           AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                           AV73Facturacion_mantenimientofacturawwds_11_tffactot ,
                                           A455FacTot ,
                                           AV74Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           A450FacPri ,
                                           AV55FacPri ,
                                           Byte.valueOf(A1153FacTipFac) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV63Facturacion_mantenimientofacturawwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV63Facturacion_mantenimientofacturawwds_1_tfclinom), 30, "%") ;
      /* Using cursor P09YS7 */
      pr_default.execute(0, new Object[] {AV65Facturacion_mantenimientofacturawwds_3_tffacimptot, AV65Facturacion_mantenimientofacturawwds_3_tffacimptot, AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV67Facturacion_mantenimientofacturawwds_5_tffacimppp, AV67Facturacion_mantenimientofacturawwds_5_tffacimppp, AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV53EmprCod, AV55FacPri, lV63Facturacion_mantenimientofacturawwds_1_tfclinom, AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel, Integer.valueOf(AV54FacCod), Integer.valueOf(AV56CliCod), AV57FacFchFrom, AV58FacFchto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9YS2 = false ;
         A396EmprCod = P09YS7_A396EmprCod[0] ;
         A450FacPri = P09YS7_A450FacPri[0] ;
         A1153FacTipFac = P09YS7_A1153FacTipFac[0] ;
         A279CliNom = P09YS7_A279CliNom[0] ;
         A436FacFch = P09YS7_A436FacFch[0] ;
         A252CliCod = P09YS7_A252CliCod[0] ;
         A430FacCod = P09YS7_A430FacCod[0] ;
         A435FacEst = P09YS7_A435FacEst[0] ;
         A11513FacRecIca = P09YS7_A11513FacRecIca[0] ;
         A8346FacRecI = P09YS7_A8346FacRecI[0] ;
         n8346FacRecI = P09YS7_n8346FacRecI[0] ;
         A7212FacRect = P09YS7_A7212FacRect[0] ;
         A453FacRECPor = P09YS7_A453FacRECPor[0] ;
         A443FacIVAPor = P09YS7_A443FacIVAPor[0] ;
         A14224FacCostFac = P09YS7_A14224FacCostFac[0] ;
         A14223FacCostKgs = P09YS7_A14223FacCostKgs[0] ;
         A14222FacCostMts = P09YS7_A14222FacCostMts[0] ;
         A433FacDtoGen = P09YS7_A433FacDtoGen[0] ;
         A3918FacImpTot1 = P09YS7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YS7_n3918FacImpTot1[0] ;
         A7209Colombia = P09YS7_A7209Colombia[0] ;
         n7209Colombia = P09YS7_n7209Colombia[0] ;
         A440FacImpPP = P09YS7_A440FacImpPP[0] ;
         n440FacImpPP = P09YS7_n440FacImpPP[0] ;
         A441FacImpTot = P09YS7_A441FacImpTot[0] ;
         n441FacImpTot = P09YS7_n441FacImpTot[0] ;
         A7209Colombia = P09YS7_A7209Colombia[0] ;
         n7209Colombia = P09YS7_n7209Colombia[0] ;
         A279CliNom = P09YS7_A279CliNom[0] ;
         A441FacImpTot = P09YS7_A441FacImpTot[0] ;
         n441FacImpTot = P09YS7_n441FacImpTot[0] ;
         A3918FacImpTot1 = P09YS7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = P09YS7_n3918FacImpTot1[0] ;
         A440FacImpPP = P09YS7_A440FacImpPP[0] ;
         n440FacImpPP = P09YS7_n440FacImpPP[0] ;
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
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to) <= 0 ) ) )
            {
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
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to) <= 0 ) ) )
                  {
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
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_mantenimientofacturawwds_11_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV73Facturacion_mantenimientofacturawwds_11_tffactot) >= 0 ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_mantenimientofacturawwds_12_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV74Facturacion_mantenimientofacturawwds_12_tffactot_to) <= 0 ) ) )
                        {
                           AV26count = 0 ;
                           while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09YS7_A279CliNom[0], A279CliNom) == 0 ) )
                           {
                              brk9YS2 = false ;
                              A396EmprCod = P09YS7_A396EmprCod[0] ;
                              A252CliCod = P09YS7_A252CliCod[0] ;
                              A430FacCod = P09YS7_A430FacCod[0] ;
                              AV26count = (long)(AV26count+1) ;
                              brk9YS2 = true ;
                              pr_default.readNext(0);
                           }
                           if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                           {
                              AV21Option = A279CliNom ;
                              AV22Options.add(AV21Option, 0);
                              AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                           }
                           if ( AV22Options.size() == 50 )
                           {
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9YS2 )
         {
            brk9YS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientofacturawwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = mantenimientofacturawwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = mantenimientofacturawwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18TFCliNom = "" ;
      AV19TFCliNom_Sel = "" ;
      AV39TFFacImpTot = DecimalUtil.ZERO ;
      AV40TFFacImpTot_To = DecimalUtil.ZERO ;
      AV41TFFacImpPP = DecimalUtil.ZERO ;
      AV42TFFacImpPP_To = DecimalUtil.ZERO ;
      AV43TFFacBasImp = DecimalUtil.ZERO ;
      AV44TFFacBasImp_To = DecimalUtil.ZERO ;
      AV45TFFacIVAImp = DecimalUtil.ZERO ;
      AV46TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV47TFFacTot = DecimalUtil.ZERO ;
      AV48TFFacTot_To = DecimalUtil.ZERO ;
      AV49TFFacEst_SelsJson = "" ;
      AV50TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      A279CliNom = "" ;
      AV63Facturacion_mantenimientofacturawwds_1_tfclinom = "" ;
      AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel = "" ;
      AV65Facturacion_mantenimientofacturawwds_3_tffacimptot = DecimalUtil.ZERO ;
      AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to = DecimalUtil.ZERO ;
      AV67Facturacion_mantenimientofacturawwds_5_tffacimppp = DecimalUtil.ZERO ;
      AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to = DecimalUtil.ZERO ;
      AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp = DecimalUtil.ZERO ;
      AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = DecimalUtil.ZERO ;
      AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp = DecimalUtil.ZERO ;
      AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = DecimalUtil.ZERO ;
      AV73Facturacion_mantenimientofacturawwds_11_tffactot = DecimalUtil.ZERO ;
      AV74Facturacion_mantenimientofacturawwds_12_tffactot_to = DecimalUtil.ZERO ;
      AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV63Facturacion_mantenimientofacturawwds_1_tfclinom = "" ;
      AV57FacFchFrom = GXutil.nullDate() ;
      AV58FacFchto = GXutil.nullDate() ;
      A436FacFch = GXutil.nullDate() ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV53EmprCod = "" ;
      A450FacPri = "" ;
      AV55FacPri = "" ;
      P09YS7_A396EmprCod = new String[] {""} ;
      P09YS7_A450FacPri = new String[] {""} ;
      P09YS7_A1153FacTipFac = new byte[1] ;
      P09YS7_A279CliNom = new String[] {""} ;
      P09YS7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YS7_A252CliCod = new int[1] ;
      P09YS7_A430FacCod = new int[1] ;
      P09YS7_A435FacEst = new byte[1] ;
      P09YS7_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_n8346FacRecI = new boolean[] {false} ;
      P09YS7_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A443FacIVAPor = new byte[1] ;
      P09YS7_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_n3918FacImpTot1 = new boolean[] {false} ;
      P09YS7_A7209Colombia = new byte[1] ;
      P09YS7_n7209Colombia = new boolean[] {false} ;
      P09YS7_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_n440FacImpPP = new boolean[] {false} ;
      P09YS7_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YS7_n441FacImpTot = new boolean[] {false} ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09YS7_A396EmprCod, P09YS7_A450FacPri, P09YS7_A1153FacTipFac, P09YS7_A279CliNom, P09YS7_A436FacFch, P09YS7_A252CliCod, P09YS7_A430FacCod, P09YS7_A435FacEst, P09YS7_A11513FacRecIca, P09YS7_A8346FacRecI,
            P09YS7_n8346FacRecI, P09YS7_A7212FacRect, P09YS7_A453FacRECPor, P09YS7_A443FacIVAPor, P09YS7_A14224FacCostFac, P09YS7_A14223FacCostKgs, P09YS7_A14222FacCostMts, P09YS7_A433FacDtoGen, P09YS7_A3918FacImpTot1, P09YS7_n3918FacImpTot1,
            P09YS7_A7209Colombia, P09YS7_n7209Colombia, P09YS7_A440FacImpPP, P09YS7_n440FacImpPP, P09YS7_A441FacImpTot, P09YS7_n441FacImpTot
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
   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ;
   private int AV54FacCod ;
   private int AV56CliCod ;
   private int A430FacCod ;
   private int A252CliCod ;
   private long AV26count ;
   private java.math.BigDecimal AV39TFFacImpTot ;
   private java.math.BigDecimal AV40TFFacImpTot_To ;
   private java.math.BigDecimal AV41TFFacImpPP ;
   private java.math.BigDecimal AV42TFFacImpPP_To ;
   private java.math.BigDecimal AV43TFFacBasImp ;
   private java.math.BigDecimal AV44TFFacBasImp_To ;
   private java.math.BigDecimal AV45TFFacIVAImp ;
   private java.math.BigDecimal AV46TFFacIVAImp_To ;
   private java.math.BigDecimal AV47TFFacTot ;
   private java.math.BigDecimal AV48TFFacTot_To ;
   private java.math.BigDecimal AV65Facturacion_mantenimientofacturawwds_3_tffacimptot ;
   private java.math.BigDecimal AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to ;
   private java.math.BigDecimal AV67Facturacion_mantenimientofacturawwds_5_tffacimppp ;
   private java.math.BigDecimal AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to ;
   private java.math.BigDecimal AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp ;
   private java.math.BigDecimal AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ;
   private java.math.BigDecimal AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp ;
   private java.math.BigDecimal AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ;
   private java.math.BigDecimal AV73Facturacion_mantenimientofacturawwds_11_tffactot ;
   private java.math.BigDecimal AV74Facturacion_mantenimientofacturawwds_12_tffactot_to ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private String AV18TFCliNom ;
   private String AV19TFCliNom_Sel ;
   private String A279CliNom ;
   private String AV63Facturacion_mantenimientofacturawwds_1_tfclinom ;
   private String AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel ;
   private String scmdbuf ;
   private String lV63Facturacion_mantenimientofacturawwds_1_tfclinom ;
   private String A396EmprCod ;
   private String AV53EmprCod ;
   private String A450FacPri ;
   private String AV55FacPri ;
   private java.util.Date AV57FacFchFrom ;
   private java.util.Date AV58FacFchto ;
   private java.util.Date A436FacFch ;
   private boolean returnInSub ;
   private boolean brk9YS2 ;
   private boolean n8346FacRecI ;
   private boolean n3918FacImpTot1 ;
   private boolean n7209Colombia ;
   private boolean n440FacImpPP ;
   private boolean n441FacImpTot ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV49TFFacEst_SelsJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV21Option ;
   private GXSimpleCollection<Byte> AV50TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YS7_A396EmprCod ;
   private String[] P09YS7_A450FacPri ;
   private byte[] P09YS7_A1153FacTipFac ;
   private String[] P09YS7_A279CliNom ;
   private java.util.Date[] P09YS7_A436FacFch ;
   private int[] P09YS7_A252CliCod ;
   private int[] P09YS7_A430FacCod ;
   private byte[] P09YS7_A435FacEst ;
   private java.math.BigDecimal[] P09YS7_A11513FacRecIca ;
   private java.math.BigDecimal[] P09YS7_A8346FacRecI ;
   private boolean[] P09YS7_n8346FacRecI ;
   private java.math.BigDecimal[] P09YS7_A7212FacRect ;
   private java.math.BigDecimal[] P09YS7_A453FacRECPor ;
   private byte[] P09YS7_A443FacIVAPor ;
   private java.math.BigDecimal[] P09YS7_A14224FacCostFac ;
   private java.math.BigDecimal[] P09YS7_A14223FacCostKgs ;
   private java.math.BigDecimal[] P09YS7_A14222FacCostMts ;
   private java.math.BigDecimal[] P09YS7_A433FacDtoGen ;
   private java.math.BigDecimal[] P09YS7_A3918FacImpTot1 ;
   private boolean[] P09YS7_n3918FacImpTot1 ;
   private byte[] P09YS7_A7209Colombia ;
   private boolean[] P09YS7_n7209Colombia ;
   private java.math.BigDecimal[] P09YS7_A440FacImpPP ;
   private boolean[] P09YS7_n440FacImpPP ;
   private java.math.BigDecimal[] P09YS7_A441FacImpTot ;
   private boolean[] P09YS7_n441FacImpTot ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class mantenimientofacturawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YS7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                          String AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                          String AV63Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                          int AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ,
                                          int AV54FacCod ,
                                          int AV56CliCod ,
                                          java.util.Date AV57FacFchFrom ,
                                          java.util.Date AV58FacFchto ,
                                          String A279CliNom ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          java.util.Date A436FacFch ,
                                          java.math.BigDecimal AV65Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                          java.math.BigDecimal A441FacImpTot ,
                                          java.math.BigDecimal AV66Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                          java.math.BigDecimal AV67Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal AV68Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                          java.math.BigDecimal AV69Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal AV70Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                          java.math.BigDecimal AV71Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal AV72Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                          java.math.BigDecimal AV73Facturacion_mantenimientofacturawwds_11_tffactot ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV74Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          String A450FacPri ,
                                          String AV55FacPri ,
                                          byte A1153FacTipFac )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacPri, T1.FacTipFac, T3.CliNom, T1.FacFch, T1.CliCod, T1.FacCod, T1.FacEst, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor," ;
      scmdbuf += " T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP, 0) AS FacImpPP, COALESCE(" ;
      scmdbuf += " T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia AS NUMERIC(23,10)))" ;
      scmdbuf += " / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not" ;
      scmdbuf += " (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod AND T8.FacCod = T7.FacCod) )" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin" ;
      scmdbuf += " and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts" ;
      scmdbuf += " * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan =" ;
      scmdbuf += " 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod) LEFT JOIN (SELECT" ;
      scmdbuf += " CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE(" ;
      scmdbuf += " T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T7.EmprCod," ;
      scmdbuf += " T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not" ;
      scmdbuf += " (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T9 ON T9.EmprCod = T7.EmprCod AND T9.FacCod = T7.FacCod) )" ;
      scmdbuf += " T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( (GXutil.strcmp("", AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Facturacion_mantenimientofacturawwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75Facturacion_mantenimientofacturawwds_13_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( ! (0==AV54FacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV56CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57FacFchFrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58FacFchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P09YS7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YS7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

