package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_3_anyadidasgetfilterdata extends GXProcedure
{
   public cierrerecetastinte_3_anyadidasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_3_anyadidasgetfilterdata.class ), "" );
   }

   public cierrerecetastinte_3_anyadidasgetfilterdata( int remoteHandle ,
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
      cierrerecetastinte_3_anyadidasgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_3_anyadidasgetfilterdata.this.AV24DDOName = aP0;
      cierrerecetastinte_3_anyadidasgetfilterdata.this.AV22SearchTxt = aP1;
      cierrerecetastinte_3_anyadidasgetfilterdata.this.AV23SearchTxtTo = aP2;
      cierrerecetastinte_3_anyadidasgetfilterdata.this.aP3 = aP3;
      cierrerecetastinte_3_anyadidasgetfilterdata.this.aP4 = aP4;
      cierrerecetastinte_3_anyadidasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("FormulacionTinte.CierreRecetasTinte_3_AnyadidasGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_3_AnyadidasGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("FormulacionTinte.CierreRecetasTinte_3_AnyadidasGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV20TFRecLinPro = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFRecLinPro_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV41TFRecLin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFRecLin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV43TFRecPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV44TFRecPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV45TFRecPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV46TFRecPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV47TFForPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV48TFForPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV49TFPrdCant = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdCant_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV51TFPrdCanFin = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFPrdCanFin_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV43TFRecPrdNum = AV22SearchTxt ;
      AV44TFRecPrdNum_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV20TFRecLinPro) ,
                                           Byte.valueOf(AV21TFRecLinPro_To) ,
                                           Short.valueOf(AV41TFRecLin) ,
                                           Short.valueOf(AV42TFRecLin_To) ,
                                           AV44TFRecPrdNum_Sel ,
                                           AV43TFRecPrdNum ,
                                           AV46TFRecPrdDsc_Sel ,
                                           AV45TFRecPrdDsc ,
                                           AV48TFForPrdDsc_Sel ,
                                           AV47TFForPrdDsc ,
                                           AV49TFPrdCant ,
                                           AV50TFPrdCant_To ,
                                           AV51TFPrdCanFin ,
                                           AV52TFPrdCanFin_To ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43TFRecPrdNum = GXutil.padr( GXutil.rtrim( AV43TFRecPrdNum), 6, "%") ;
      lV45TFRecPrdDsc = GXutil.padr( GXutil.rtrim( AV45TFRecPrdDsc), 26, "%") ;
      lV47TFForPrdDsc = GXutil.padr( GXutil.rtrim( AV47TFForPrdDsc), 5, "%") ;
      /* Using cursor P09LB2 */
      pr_default.execute(0, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), Byte.valueOf(AV20TFRecLinPro), Byte.valueOf(AV21TFRecLinPro_To), Short.valueOf(AV41TFRecLin), Short.valueOf(AV42TFRecLin_To), lV43TFRecPrdNum, AV44TFRecPrdNum_Sel, lV45TFRecPrdDsc, AV46TFRecPrdDsc_Sel, lV47TFForPrdDsc, AV48TFForPrdDsc_Sel, AV49TFPrdCant, AV50TFPrdCant_To, AV51TFPrdCanFin, AV52TFPrdCanFin_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LB2 = false ;
         A490ForPrdUMe = P09LB2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09LB2_n490ForPrdUMe[0] ;
         A396EmprCod = P09LB2_A396EmprCod[0] ;
         A129BarCod = P09LB2_A129BarCod[0] ;
         A132BarCodReo = P09LB2_A132BarCodReo[0] ;
         A130BarCodPar = P09LB2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09LB2_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09LB2_A872RecPrdNum[0] ;
         A683PrdCanFin = P09LB2_A683PrdCanFin[0] ;
         A686PrdCant = P09LB2_A686PrdCant[0] ;
         A488ForPrdDsc = P09LB2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB2_n488ForPrdDsc[0] ;
         A875RecPrdDsc = P09LB2_A875RecPrdDsc[0] ;
         A811RecLin = P09LB2_A811RecLin[0] ;
         A1273RecLinPro = P09LB2_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09LB2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB2_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LB2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9LB2 = false ;
            A396EmprCod = P09LB2_A396EmprCod[0] ;
            A129BarCod = P09LB2_A129BarCod[0] ;
            A132BarCodReo = P09LB2_A132BarCodReo[0] ;
            A130BarCodPar = P09LB2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09LB2_A2804RecLinMaq[0] ;
            A811RecLin = P09LB2_A811RecLin[0] ;
            A1273RecLinPro = P09LB2_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9LB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV26Option = A872RecPrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LB2 )
         {
            brk9LB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV45TFRecPrdDsc = AV22SearchTxt ;
      AV46TFRecPrdDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV20TFRecLinPro) ,
                                           Byte.valueOf(AV21TFRecLinPro_To) ,
                                           Short.valueOf(AV41TFRecLin) ,
                                           Short.valueOf(AV42TFRecLin_To) ,
                                           AV44TFRecPrdNum_Sel ,
                                           AV43TFRecPrdNum ,
                                           AV46TFRecPrdDsc_Sel ,
                                           AV45TFRecPrdDsc ,
                                           AV48TFForPrdDsc_Sel ,
                                           AV47TFForPrdDsc ,
                                           AV49TFPrdCant ,
                                           AV50TFPrdCant_To ,
                                           AV51TFPrdCanFin ,
                                           AV52TFPrdCanFin_To ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43TFRecPrdNum = GXutil.padr( GXutil.rtrim( AV43TFRecPrdNum), 6, "%") ;
      lV45TFRecPrdDsc = GXutil.padr( GXutil.rtrim( AV45TFRecPrdDsc), 26, "%") ;
      lV47TFForPrdDsc = GXutil.padr( GXutil.rtrim( AV47TFForPrdDsc), 5, "%") ;
      /* Using cursor P09LB3 */
      pr_default.execute(1, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), Byte.valueOf(AV20TFRecLinPro), Byte.valueOf(AV21TFRecLinPro_To), Short.valueOf(AV41TFRecLin), Short.valueOf(AV42TFRecLin_To), lV43TFRecPrdNum, AV44TFRecPrdNum_Sel, lV45TFRecPrdDsc, AV46TFRecPrdDsc_Sel, lV47TFForPrdDsc, AV48TFForPrdDsc_Sel, AV49TFPrdCant, AV50TFPrdCant_To, AV51TFPrdCanFin, AV52TFPrdCanFin_To});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LB4 = false ;
         A490ForPrdUMe = P09LB3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09LB3_n490ForPrdUMe[0] ;
         A396EmprCod = P09LB3_A396EmprCod[0] ;
         A129BarCod = P09LB3_A129BarCod[0] ;
         A132BarCodReo = P09LB3_A132BarCodReo[0] ;
         A130BarCodPar = P09LB3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09LB3_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09LB3_A875RecPrdDsc[0] ;
         A683PrdCanFin = P09LB3_A683PrdCanFin[0] ;
         A686PrdCant = P09LB3_A686PrdCant[0] ;
         A488ForPrdDsc = P09LB3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB3_n488ForPrdDsc[0] ;
         A872RecPrdNum = P09LB3_A872RecPrdNum[0] ;
         A811RecLin = P09LB3_A811RecLin[0] ;
         A1273RecLinPro = P09LB3_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09LB3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB3_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LB3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9LB4 = false ;
            A396EmprCod = P09LB3_A396EmprCod[0] ;
            A129BarCod = P09LB3_A129BarCod[0] ;
            A132BarCodReo = P09LB3_A132BarCodReo[0] ;
            A130BarCodPar = P09LB3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09LB3_A2804RecLinMaq[0] ;
            A811RecLin = P09LB3_A811RecLin[0] ;
            A1273RecLinPro = P09LB3_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9LB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV26Option = A875RecPrdDsc ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LB4 )
         {
            brk9LB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV47TFForPrdDsc = AV22SearchTxt ;
      AV48TFForPrdDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV20TFRecLinPro) ,
                                           Byte.valueOf(AV21TFRecLinPro_To) ,
                                           Short.valueOf(AV41TFRecLin) ,
                                           Short.valueOf(AV42TFRecLin_To) ,
                                           AV44TFRecPrdNum_Sel ,
                                           AV43TFRecPrdNum ,
                                           AV46TFRecPrdDsc_Sel ,
                                           AV45TFRecPrdDsc ,
                                           AV48TFForPrdDsc_Sel ,
                                           AV47TFForPrdDsc ,
                                           AV49TFPrdCant ,
                                           AV50TFPrdCant_To ,
                                           AV51TFPrdCanFin ,
                                           AV52TFPrdCanFin_To ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) ,
                                           AV53EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43TFRecPrdNum = GXutil.padr( GXutil.rtrim( AV43TFRecPrdNum), 6, "%") ;
      lV45TFRecPrdDsc = GXutil.padr( GXutil.rtrim( AV45TFRecPrdDsc), 26, "%") ;
      lV47TFForPrdDsc = GXutil.padr( GXutil.rtrim( AV47TFForPrdDsc), 5, "%") ;
      /* Using cursor P09LB4 */
      pr_default.execute(2, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), Byte.valueOf(AV20TFRecLinPro), Byte.valueOf(AV21TFRecLinPro_To), Short.valueOf(AV41TFRecLin), Short.valueOf(AV42TFRecLin_To), lV43TFRecPrdNum, AV44TFRecPrdNum_Sel, lV45TFRecPrdDsc, AV46TFRecPrdDsc_Sel, lV47TFForPrdDsc, AV48TFForPrdDsc_Sel, AV49TFPrdCant, AV50TFPrdCant_To, AV51TFPrdCanFin, AV52TFPrdCanFin_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9LB6 = false ;
         A490ForPrdUMe = P09LB4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09LB4_n490ForPrdUMe[0] ;
         A396EmprCod = P09LB4_A396EmprCod[0] ;
         A2804RecLinMaq = P09LB4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09LB4_A130BarCodPar[0] ;
         A132BarCodReo = P09LB4_A132BarCodReo[0] ;
         A129BarCod = P09LB4_A129BarCod[0] ;
         A683PrdCanFin = P09LB4_A683PrdCanFin[0] ;
         A686PrdCant = P09LB4_A686PrdCant[0] ;
         A488ForPrdDsc = P09LB4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB4_n488ForPrdDsc[0] ;
         A875RecPrdDsc = P09LB4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09LB4_A872RecPrdNum[0] ;
         A811RecLin = P09LB4_A811RecLin[0] ;
         A1273RecLinPro = P09LB4_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09LB4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09LB4_n488ForPrdDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09LB4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09LB4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9LB6 = false ;
            A2804RecLinMaq = P09LB4_A2804RecLinMaq[0] ;
            A130BarCodPar = P09LB4_A130BarCodPar[0] ;
            A132BarCodReo = P09LB4_A132BarCodReo[0] ;
            A129BarCod = P09LB4_A129BarCod[0] ;
            A811RecLin = P09LB4_A811RecLin[0] ;
            A1273RecLinPro = P09LB4_A1273RecLinPro[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9LB6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV26Option = A488ForPrdDsc ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LB6 )
         {
            brk9LB6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_3_anyadidasgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = cierrerecetastinte_3_anyadidasgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_3_anyadidasgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV43TFRecPrdNum = "" ;
      AV44TFRecPrdNum_Sel = "" ;
      AV45TFRecPrdDsc = "" ;
      AV46TFRecPrdDsc_Sel = "" ;
      AV47TFForPrdDsc = "" ;
      AV48TFForPrdDsc_Sel = "" ;
      AV49TFPrdCant = DecimalUtil.ZERO ;
      AV50TFPrdCant_To = DecimalUtil.ZERO ;
      AV51TFPrdCanFin = DecimalUtil.ZERO ;
      AV52TFPrdCanFin_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV43TFRecPrdNum = "" ;
      lV45TFRecPrdDsc = "" ;
      lV47TFForPrdDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV53EmprCod = "" ;
      A130BarCodPar = "" ;
      AV56BarCodPar = "" ;
      P09LB2_A490ForPrdUMe = new byte[1] ;
      P09LB2_n490ForPrdUMe = new boolean[] {false} ;
      P09LB2_A396EmprCod = new String[] {""} ;
      P09LB2_A129BarCod = new int[1] ;
      P09LB2_A132BarCodReo = new byte[1] ;
      P09LB2_A130BarCodPar = new String[] {""} ;
      P09LB2_A2804RecLinMaq = new short[1] ;
      P09LB2_A872RecPrdNum = new String[] {""} ;
      P09LB2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB2_A488ForPrdDsc = new String[] {""} ;
      P09LB2_n488ForPrdDsc = new boolean[] {false} ;
      P09LB2_A875RecPrdDsc = new String[] {""} ;
      P09LB2_A811RecLin = new short[1] ;
      P09LB2_A1273RecLinPro = new byte[1] ;
      AV26Option = "" ;
      P09LB3_A490ForPrdUMe = new byte[1] ;
      P09LB3_n490ForPrdUMe = new boolean[] {false} ;
      P09LB3_A396EmprCod = new String[] {""} ;
      P09LB3_A129BarCod = new int[1] ;
      P09LB3_A132BarCodReo = new byte[1] ;
      P09LB3_A130BarCodPar = new String[] {""} ;
      P09LB3_A2804RecLinMaq = new short[1] ;
      P09LB3_A875RecPrdDsc = new String[] {""} ;
      P09LB3_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB3_A488ForPrdDsc = new String[] {""} ;
      P09LB3_n488ForPrdDsc = new boolean[] {false} ;
      P09LB3_A872RecPrdNum = new String[] {""} ;
      P09LB3_A811RecLin = new short[1] ;
      P09LB3_A1273RecLinPro = new byte[1] ;
      P09LB4_A490ForPrdUMe = new byte[1] ;
      P09LB4_n490ForPrdUMe = new boolean[] {false} ;
      P09LB4_A396EmprCod = new String[] {""} ;
      P09LB4_A2804RecLinMaq = new short[1] ;
      P09LB4_A130BarCodPar = new String[] {""} ;
      P09LB4_A132BarCodReo = new byte[1] ;
      P09LB4_A129BarCod = new int[1] ;
      P09LB4_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LB4_A488ForPrdDsc = new String[] {""} ;
      P09LB4_n488ForPrdDsc = new boolean[] {false} ;
      P09LB4_A875RecPrdDsc = new String[] {""} ;
      P09LB4_A872RecPrdNum = new String[] {""} ;
      P09LB4_A811RecLin = new short[1] ;
      P09LB4_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_3_anyadidasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LB2_A490ForPrdUMe, P09LB2_n490ForPrdUMe, P09LB2_A396EmprCod, P09LB2_A129BarCod, P09LB2_A132BarCodReo, P09LB2_A130BarCodPar, P09LB2_A2804RecLinMaq, P09LB2_A872RecPrdNum, P09LB2_A683PrdCanFin, P09LB2_A686PrdCant,
            P09LB2_A488ForPrdDsc, P09LB2_n488ForPrdDsc, P09LB2_A875RecPrdDsc, P09LB2_A811RecLin, P09LB2_A1273RecLinPro
            }
            , new Object[] {
            P09LB3_A490ForPrdUMe, P09LB3_n490ForPrdUMe, P09LB3_A396EmprCod, P09LB3_A129BarCod, P09LB3_A132BarCodReo, P09LB3_A130BarCodPar, P09LB3_A2804RecLinMaq, P09LB3_A875RecPrdDsc, P09LB3_A683PrdCanFin, P09LB3_A686PrdCant,
            P09LB3_A488ForPrdDsc, P09LB3_n488ForPrdDsc, P09LB3_A872RecPrdNum, P09LB3_A811RecLin, P09LB3_A1273RecLinPro
            }
            , new Object[] {
            P09LB4_A490ForPrdUMe, P09LB4_n490ForPrdUMe, P09LB4_A396EmprCod, P09LB4_A2804RecLinMaq, P09LB4_A130BarCodPar, P09LB4_A132BarCodReo, P09LB4_A129BarCod, P09LB4_A683PrdCanFin, P09LB4_A686PrdCant, P09LB4_A488ForPrdDsc,
            P09LB4_n488ForPrdDsc, P09LB4_A875RecPrdDsc, P09LB4_A872RecPrdNum, P09LB4_A811RecLin, P09LB4_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFRecLinPro ;
   private byte AV21TFRecLinPro_To ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte AV55BarCodReo ;
   private byte A490ForPrdUMe ;
   private short AV41TFRecLin ;
   private short AV42TFRecLin_To ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short AV57RecLinMaq ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int A129BarCod ;
   private int AV54BarCod ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV49TFPrdCant ;
   private java.math.BigDecimal AV50TFPrdCant_To ;
   private java.math.BigDecimal AV51TFPrdCanFin ;
   private java.math.BigDecimal AV52TFPrdCanFin_To ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private String AV43TFRecPrdNum ;
   private String AV44TFRecPrdNum_Sel ;
   private String AV45TFRecPrdDsc ;
   private String AV46TFRecPrdDsc_Sel ;
   private String AV47TFForPrdDsc ;
   private String AV48TFForPrdDsc_Sel ;
   private String scmdbuf ;
   private String lV43TFRecPrdNum ;
   private String lV45TFRecPrdDsc ;
   private String lV47TFForPrdDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private String AV53EmprCod ;
   private String A130BarCodPar ;
   private String AV56BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9LB2 ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brk9LB4 ;
   private boolean brk9LB6 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09LB2_A490ForPrdUMe ;
   private boolean[] P09LB2_n490ForPrdUMe ;
   private String[] P09LB2_A396EmprCod ;
   private int[] P09LB2_A129BarCod ;
   private byte[] P09LB2_A132BarCodReo ;
   private String[] P09LB2_A130BarCodPar ;
   private short[] P09LB2_A2804RecLinMaq ;
   private String[] P09LB2_A872RecPrdNum ;
   private java.math.BigDecimal[] P09LB2_A683PrdCanFin ;
   private java.math.BigDecimal[] P09LB2_A686PrdCant ;
   private String[] P09LB2_A488ForPrdDsc ;
   private boolean[] P09LB2_n488ForPrdDsc ;
   private String[] P09LB2_A875RecPrdDsc ;
   private short[] P09LB2_A811RecLin ;
   private byte[] P09LB2_A1273RecLinPro ;
   private byte[] P09LB3_A490ForPrdUMe ;
   private boolean[] P09LB3_n490ForPrdUMe ;
   private String[] P09LB3_A396EmprCod ;
   private int[] P09LB3_A129BarCod ;
   private byte[] P09LB3_A132BarCodReo ;
   private String[] P09LB3_A130BarCodPar ;
   private short[] P09LB3_A2804RecLinMaq ;
   private String[] P09LB3_A875RecPrdDsc ;
   private java.math.BigDecimal[] P09LB3_A683PrdCanFin ;
   private java.math.BigDecimal[] P09LB3_A686PrdCant ;
   private String[] P09LB3_A488ForPrdDsc ;
   private boolean[] P09LB3_n488ForPrdDsc ;
   private String[] P09LB3_A872RecPrdNum ;
   private short[] P09LB3_A811RecLin ;
   private byte[] P09LB3_A1273RecLinPro ;
   private byte[] P09LB4_A490ForPrdUMe ;
   private boolean[] P09LB4_n490ForPrdUMe ;
   private String[] P09LB4_A396EmprCod ;
   private short[] P09LB4_A2804RecLinMaq ;
   private String[] P09LB4_A130BarCodPar ;
   private byte[] P09LB4_A132BarCodReo ;
   private int[] P09LB4_A129BarCod ;
   private java.math.BigDecimal[] P09LB4_A683PrdCanFin ;
   private java.math.BigDecimal[] P09LB4_A686PrdCant ;
   private String[] P09LB4_A488ForPrdDsc ;
   private boolean[] P09LB4_n488ForPrdDsc ;
   private String[] P09LB4_A875RecPrdDsc ;
   private String[] P09LB4_A872RecPrdNum ;
   private short[] P09LB4_A811RecLin ;
   private byte[] P09LB4_A1273RecLinPro ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class cierrerecetastinte_3_anyadidasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV20TFRecLinPro ,
                                          byte AV21TFRecLinPro_To ,
                                          short AV41TFRecLin ,
                                          short AV42TFRecLin_To ,
                                          String AV44TFRecPrdNum_Sel ,
                                          String AV43TFRecPrdNum ,
                                          String AV46TFRecPrdDsc_Sel ,
                                          String AV45TFRecPrdDsc ,
                                          String AV48TFForPrdDsc_Sel ,
                                          String AV47TFForPrdDsc ,
                                          java.math.BigDecimal AV49TFPrdCant ,
                                          java.math.BigDecimal AV50TFPrdCant_To ,
                                          java.math.BigDecimal AV51TFPrdCanFin ,
                                          java.math.BigDecimal AV52TFPrdCanFin_To ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.RecPrdDsc, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV20TFRecLinPro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV21TFRecLinPro_To) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV41TFRecLin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV42TFRecLin_To) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFRecPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFRecPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFForPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdCant_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdCanFin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdCanFin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09LB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV20TFRecLinPro ,
                                          byte AV21TFRecLinPro_To ,
                                          short AV41TFRecLin ,
                                          short AV42TFRecLin_To ,
                                          String AV44TFRecPrdNum_Sel ,
                                          String AV43TFRecPrdNum ,
                                          String AV46TFRecPrdDsc_Sel ,
                                          String AV45TFRecPrdDsc ,
                                          String AV48TFForPrdDsc_Sel ,
                                          String AV47TFForPrdDsc ,
                                          java.math.BigDecimal AV49TFPrdCant ,
                                          java.math.BigDecimal AV50TFPrdCant_To ,
                                          java.math.BigDecimal AV51TFPrdCanFin ,
                                          java.math.BigDecimal AV52TFPrdCanFin_To ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[19];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.RecPrdNum, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV20TFRecLinPro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV21TFRecLinPro_To) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV41TFRecLin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV42TFRecLin_To) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFRecPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFRecPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFForPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdCant_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdCanFin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdCanFin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09LB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV20TFRecLinPro ,
                                          byte AV21TFRecLinPro_To ,
                                          short AV41TFRecLin ,
                                          short AV42TFRecLin_To ,
                                          String AV44TFRecPrdNum_Sel ,
                                          String AV43TFRecPrdNum ,
                                          String AV46TFRecPrdDsc_Sel ,
                                          String AV45TFRecPrdDsc ,
                                          String AV48TFForPrdDsc_Sel ,
                                          String AV47TFForPrdDsc ,
                                          java.math.BigDecimal AV49TFPrdCant ,
                                          java.math.BigDecimal AV50TFPrdCant_To ,
                                          java.math.BigDecimal AV51TFPrdCanFin ,
                                          java.math.BigDecimal AV52TFPrdCanFin_To ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq ,
                                          String AV53EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV20TFRecLinPro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV21TFRecLinPro_To) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV41TFRecLin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV42TFRecLin_To) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV43TFRecPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFRecPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV45TFRecPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46TFRecPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFForPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFForPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdCant_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdCanFin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrdCanFin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09LB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() );
            case 1 :
                  return conditional_P09LB3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() );
            case 2 :
                  return conditional_P09LB4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[9])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               return;
      }
   }

}

