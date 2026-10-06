package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcdencproductosgetfilterdata extends GXProcedure
{
   public wcwcdencproductosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcdencproductosgetfilterdata.class ), "" );
   }

   public wcwcdencproductosgetfilterdata( int remoteHandle ,
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
      wcwcdencproductosgetfilterdata.this.aP5 = new String[] {""};
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
      wcwcdencproductosgetfilterdata.this.AV18DDOName = aP0;
      wcwcdencproductosgetfilterdata.this.AV16SearchTxt = aP1;
      wcwcdencproductosgetfilterdata.this.AV17SearchTxtTo = aP2;
      wcwcdencproductosgetfilterdata.this.aP3 = aP3;
      wcwcdencproductosgetfilterdata.this.aP4 = aP4;
      wcwcdencproductosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HREPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HREPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HRELOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADHRELOTEOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("WCWcdencproductosGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcdencproductosGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCWcdencproductosGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV14TFHrePrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV15TFHrePrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV39TFHrePrdDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV40TFHrePrdDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE") == 0 )
         {
            AV41TFHreLote = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE_SEL") == 0 )
         {
            AV42TFHreLote_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_COD") == 0 )
         {
            AV35Tb1_cod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN") == 0 )
         {
            AV36HreFecTin = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN_TO") == 0 )
         {
            AV37HreFecTin_to = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFHrePrdNum = AV16SearchTxt ;
      AV15TFHrePrdNum_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           AV15TFHrePrdNum_Sel ,
                                           AV14TFHrePrdNum ,
                                           AV40TFHrePrdDsc_Sel ,
                                           AV39TFHrePrdDsc ,
                                           AV42TFHreLote_Sel ,
                                           AV41TFHreLote ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A5726HreLote ,
                                           Short.valueOf(AV35Tb1_cod) ,
                                           A12453HreFecAct ,
                                           AV36HreFecTin ,
                                           AV37HreFecTin_to ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           Short.valueOf(A12535HreCencId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV14TFHrePrdNum = GXutil.padr( GXutil.rtrim( AV14TFHrePrdNum), 6, "%") ;
      lV39TFHrePrdDsc = GXutil.padr( GXutil.rtrim( AV39TFHrePrdDsc), 26, "%") ;
      lV41TFHreLote = GXutil.padr( GXutil.rtrim( AV41TFHreLote), 26, "%") ;
      /* Using cursor P08QM2 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV35Tb1_cod), AV36HreFecTin, AV37HreFecTin_to, AV34Emprcod, Short.valueOf(AV35Tb1_cod), lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV14TFHrePrdNum, AV15TFHrePrdNum_Sel, lV39TFHrePrdDsc, AV40TFHrePrdDsc_Sel, lV41TFHreLote, AV42TFHreLote_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8QM2 = false ;
         A4492HreBarCod = P08QM2_A4492HreBarCod[0] ;
         A4493HreBarReo = P08QM2_A4493HreBarReo[0] ;
         A4494HreBarPar = P08QM2_A4494HreBarPar[0] ;
         A4495HreNumCie = P08QM2_A4495HreNumCie[0] ;
         A396EmprCod = P08QM2_A396EmprCod[0] ;
         A12535HreCencId = P08QM2_A12535HreCencId[0] ;
         n12535HreCencId = P08QM2_n12535HreCencId[0] ;
         A4558HrePrdNum = P08QM2_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08QM2_n4558HrePrdNum[0] ;
         A12453HreFecAct = P08QM2_A12453HreFecAct[0] ;
         n12453HreFecAct = P08QM2_n12453HreFecAct[0] ;
         A5726HreLote = P08QM2_A5726HreLote[0] ;
         n5726HreLote = P08QM2_n5726HreLote[0] ;
         A4559HrePrdDsc = P08QM2_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08QM2_n4559HrePrdDsc[0] ;
         A4545HreLinMaq = P08QM2_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08QM2_A4550HreLinPro[0] ;
         A4557HreRecLin = P08QM2_A4557HreRecLin[0] ;
         A12535HreCencId = P08QM2_A12535HreCencId[0] ;
         n12535HreCencId = P08QM2_n12535HreCencId[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08QM2_A4558HrePrdNum[0], A4558HrePrdNum) == 0 ) )
         {
            brk8QM2 = false ;
            A4492HreBarCod = P08QM2_A4492HreBarCod[0] ;
            A4493HreBarReo = P08QM2_A4493HreBarReo[0] ;
            A4494HreBarPar = P08QM2_A4494HreBarPar[0] ;
            A4495HreNumCie = P08QM2_A4495HreNumCie[0] ;
            A396EmprCod = P08QM2_A396EmprCod[0] ;
            A4545HreLinMaq = P08QM2_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08QM2_A4550HreLinPro[0] ;
            A4557HreRecLin = P08QM2_A4557HreRecLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8QM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4558HrePrdNum)==0) )
         {
            AV20Option = A4558HrePrdNum ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QM2 )
         {
            brk8QM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHREPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV39TFHrePrdDsc = AV16SearchTxt ;
      AV40TFHrePrdDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           AV15TFHrePrdNum_Sel ,
                                           AV14TFHrePrdNum ,
                                           AV40TFHrePrdDsc_Sel ,
                                           AV39TFHrePrdDsc ,
                                           AV42TFHreLote_Sel ,
                                           AV41TFHreLote ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A5726HreLote ,
                                           Short.valueOf(AV35Tb1_cod) ,
                                           A12453HreFecAct ,
                                           AV36HreFecTin ,
                                           AV37HreFecTin_to ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           Short.valueOf(A12535HreCencId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV14TFHrePrdNum = GXutil.padr( GXutil.rtrim( AV14TFHrePrdNum), 6, "%") ;
      lV39TFHrePrdDsc = GXutil.padr( GXutil.rtrim( AV39TFHrePrdDsc), 26, "%") ;
      lV41TFHreLote = GXutil.padr( GXutil.rtrim( AV41TFHreLote), 26, "%") ;
      /* Using cursor P08QM3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV35Tb1_cod), AV36HreFecTin, AV37HreFecTin_to, AV34Emprcod, Short.valueOf(AV35Tb1_cod), lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV14TFHrePrdNum, AV15TFHrePrdNum_Sel, lV39TFHrePrdDsc, AV40TFHrePrdDsc_Sel, lV41TFHreLote, AV42TFHreLote_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8QM4 = false ;
         A4492HreBarCod = P08QM3_A4492HreBarCod[0] ;
         A4493HreBarReo = P08QM3_A4493HreBarReo[0] ;
         A4494HreBarPar = P08QM3_A4494HreBarPar[0] ;
         A4495HreNumCie = P08QM3_A4495HreNumCie[0] ;
         A396EmprCod = P08QM3_A396EmprCod[0] ;
         A12535HreCencId = P08QM3_A12535HreCencId[0] ;
         n12535HreCencId = P08QM3_n12535HreCencId[0] ;
         A4559HrePrdDsc = P08QM3_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08QM3_n4559HrePrdDsc[0] ;
         A12453HreFecAct = P08QM3_A12453HreFecAct[0] ;
         n12453HreFecAct = P08QM3_n12453HreFecAct[0] ;
         A5726HreLote = P08QM3_A5726HreLote[0] ;
         n5726HreLote = P08QM3_n5726HreLote[0] ;
         A4558HrePrdNum = P08QM3_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08QM3_n4558HrePrdNum[0] ;
         A4545HreLinMaq = P08QM3_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08QM3_A4550HreLinPro[0] ;
         A4557HreRecLin = P08QM3_A4557HreRecLin[0] ;
         A12535HreCencId = P08QM3_A12535HreCencId[0] ;
         n12535HreCencId = P08QM3_n12535HreCencId[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08QM3_A4559HrePrdDsc[0], A4559HrePrdDsc) == 0 ) )
         {
            brk8QM4 = false ;
            A4492HreBarCod = P08QM3_A4492HreBarCod[0] ;
            A4493HreBarReo = P08QM3_A4493HreBarReo[0] ;
            A4494HreBarPar = P08QM3_A4494HreBarPar[0] ;
            A4495HreNumCie = P08QM3_A4495HreNumCie[0] ;
            A396EmprCod = P08QM3_A396EmprCod[0] ;
            A4545HreLinMaq = P08QM3_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08QM3_A4550HreLinPro[0] ;
            A4557HreRecLin = P08QM3_A4557HreRecLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8QM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4559HrePrdDsc)==0) )
         {
            AV20Option = A4559HrePrdDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QM4 )
         {
            brk8QM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHRELOTEOPTIONS' Routine */
      returnInSub = false ;
      AV41TFHreLote = AV16SearchTxt ;
      AV42TFHreLote_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV38FilterFullText ,
                                           AV15TFHrePrdNum_Sel ,
                                           AV14TFHrePrdNum ,
                                           AV40TFHrePrdDsc_Sel ,
                                           AV39TFHrePrdDsc ,
                                           AV42TFHreLote_Sel ,
                                           AV41TFHreLote ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A5726HreLote ,
                                           Short.valueOf(AV35Tb1_cod) ,
                                           A12453HreFecAct ,
                                           AV36HreFecTin ,
                                           AV37HreFecTin_to ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           Short.valueOf(A12535HreCencId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV38FilterFullText = GXutil.concat( GXutil.rtrim( AV38FilterFullText), "%", "") ;
      lV14TFHrePrdNum = GXutil.padr( GXutil.rtrim( AV14TFHrePrdNum), 6, "%") ;
      lV39TFHrePrdDsc = GXutil.padr( GXutil.rtrim( AV39TFHrePrdDsc), 26, "%") ;
      lV41TFHreLote = GXutil.padr( GXutil.rtrim( AV41TFHreLote), 26, "%") ;
      /* Using cursor P08QM4 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV35Tb1_cod), AV36HreFecTin, AV37HreFecTin_to, AV34Emprcod, Short.valueOf(AV35Tb1_cod), lV38FilterFullText, lV38FilterFullText, lV38FilterFullText, lV14TFHrePrdNum, AV15TFHrePrdNum_Sel, lV39TFHrePrdDsc, AV40TFHrePrdDsc_Sel, lV41TFHreLote, AV42TFHreLote_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8QM6 = false ;
         A4492HreBarCod = P08QM4_A4492HreBarCod[0] ;
         A4493HreBarReo = P08QM4_A4493HreBarReo[0] ;
         A4494HreBarPar = P08QM4_A4494HreBarPar[0] ;
         A4495HreNumCie = P08QM4_A4495HreNumCie[0] ;
         A396EmprCod = P08QM4_A396EmprCod[0] ;
         A12535HreCencId = P08QM4_A12535HreCencId[0] ;
         n12535HreCencId = P08QM4_n12535HreCencId[0] ;
         A5726HreLote = P08QM4_A5726HreLote[0] ;
         n5726HreLote = P08QM4_n5726HreLote[0] ;
         A12453HreFecAct = P08QM4_A12453HreFecAct[0] ;
         n12453HreFecAct = P08QM4_n12453HreFecAct[0] ;
         A4559HrePrdDsc = P08QM4_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P08QM4_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P08QM4_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08QM4_n4558HrePrdNum[0] ;
         A4545HreLinMaq = P08QM4_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08QM4_A4550HreLinPro[0] ;
         A4557HreRecLin = P08QM4_A4557HreRecLin[0] ;
         A12535HreCencId = P08QM4_A12535HreCencId[0] ;
         n12535HreCencId = P08QM4_n12535HreCencId[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08QM4_A5726HreLote[0], A5726HreLote) == 0 ) )
         {
            brk8QM6 = false ;
            A4492HreBarCod = P08QM4_A4492HreBarCod[0] ;
            A4493HreBarReo = P08QM4_A4493HreBarReo[0] ;
            A4494HreBarPar = P08QM4_A4494HreBarPar[0] ;
            A4495HreNumCie = P08QM4_A4495HreNumCie[0] ;
            A396EmprCod = P08QM4_A396EmprCod[0] ;
            A4545HreLinMaq = P08QM4_A4545HreLinMaq[0] ;
            A4550HreLinPro = P08QM4_A4550HreLinPro[0] ;
            A4557HreRecLin = P08QM4_A4557HreRecLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8QM6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5726HreLote)==0) )
         {
            AV20Option = A5726HreLote ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QM6 )
         {
            brk8QM6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcdencproductosgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcwcdencproductosgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcwcdencproductosgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV14TFHrePrdNum = "" ;
      AV15TFHrePrdNum_Sel = "" ;
      AV39TFHrePrdDsc = "" ;
      AV40TFHrePrdDsc_Sel = "" ;
      AV41TFHreLote = "" ;
      AV42TFHreLote_Sel = "" ;
      AV34Emprcod = "" ;
      AV36HreFecTin = GXutil.nullDate() ;
      AV37HreFecTin_to = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV38FilterFullText = "" ;
      lV14TFHrePrdNum = "" ;
      lV39TFHrePrdDsc = "" ;
      lV41TFHreLote = "" ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A5726HreLote = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08QM2_A4492HreBarCod = new int[1] ;
      P08QM2_A4493HreBarReo = new byte[1] ;
      P08QM2_A4494HreBarPar = new String[] {""} ;
      P08QM2_A4495HreNumCie = new byte[1] ;
      P08QM2_A396EmprCod = new String[] {""} ;
      P08QM2_A12535HreCencId = new short[1] ;
      P08QM2_n12535HreCencId = new boolean[] {false} ;
      P08QM2_A4558HrePrdNum = new String[] {""} ;
      P08QM2_n4558HrePrdNum = new boolean[] {false} ;
      P08QM2_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08QM2_n12453HreFecAct = new boolean[] {false} ;
      P08QM2_A5726HreLote = new String[] {""} ;
      P08QM2_n5726HreLote = new boolean[] {false} ;
      P08QM2_A4559HrePrdDsc = new String[] {""} ;
      P08QM2_n4559HrePrdDsc = new boolean[] {false} ;
      P08QM2_A4545HreLinMaq = new short[1] ;
      P08QM2_A4550HreLinPro = new byte[1] ;
      P08QM2_A4557HreRecLin = new short[1] ;
      A4494HreBarPar = "" ;
      AV20Option = "" ;
      P08QM3_A4492HreBarCod = new int[1] ;
      P08QM3_A4493HreBarReo = new byte[1] ;
      P08QM3_A4494HreBarPar = new String[] {""} ;
      P08QM3_A4495HreNumCie = new byte[1] ;
      P08QM3_A396EmprCod = new String[] {""} ;
      P08QM3_A12535HreCencId = new short[1] ;
      P08QM3_n12535HreCencId = new boolean[] {false} ;
      P08QM3_A4559HrePrdDsc = new String[] {""} ;
      P08QM3_n4559HrePrdDsc = new boolean[] {false} ;
      P08QM3_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08QM3_n12453HreFecAct = new boolean[] {false} ;
      P08QM3_A5726HreLote = new String[] {""} ;
      P08QM3_n5726HreLote = new boolean[] {false} ;
      P08QM3_A4558HrePrdNum = new String[] {""} ;
      P08QM3_n4558HrePrdNum = new boolean[] {false} ;
      P08QM3_A4545HreLinMaq = new short[1] ;
      P08QM3_A4550HreLinPro = new byte[1] ;
      P08QM3_A4557HreRecLin = new short[1] ;
      P08QM4_A4492HreBarCod = new int[1] ;
      P08QM4_A4493HreBarReo = new byte[1] ;
      P08QM4_A4494HreBarPar = new String[] {""} ;
      P08QM4_A4495HreNumCie = new byte[1] ;
      P08QM4_A396EmprCod = new String[] {""} ;
      P08QM4_A12535HreCencId = new short[1] ;
      P08QM4_n12535HreCencId = new boolean[] {false} ;
      P08QM4_A5726HreLote = new String[] {""} ;
      P08QM4_n5726HreLote = new boolean[] {false} ;
      P08QM4_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08QM4_n12453HreFecAct = new boolean[] {false} ;
      P08QM4_A4559HrePrdDsc = new String[] {""} ;
      P08QM4_n4559HrePrdDsc = new boolean[] {false} ;
      P08QM4_A4558HrePrdNum = new String[] {""} ;
      P08QM4_n4558HrePrdNum = new boolean[] {false} ;
      P08QM4_A4545HreLinMaq = new short[1] ;
      P08QM4_A4550HreLinPro = new byte[1] ;
      P08QM4_A4557HreRecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcdencproductosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08QM2_A4492HreBarCod, P08QM2_A4493HreBarReo, P08QM2_A4494HreBarPar, P08QM2_A4495HreNumCie, P08QM2_A396EmprCod, P08QM2_A12535HreCencId, P08QM2_n12535HreCencId, P08QM2_A4558HrePrdNum, P08QM2_n4558HrePrdNum, P08QM2_A12453HreFecAct,
            P08QM2_n12453HreFecAct, P08QM2_A5726HreLote, P08QM2_n5726HreLote, P08QM2_A4559HrePrdDsc, P08QM2_n4559HrePrdDsc, P08QM2_A4545HreLinMaq, P08QM2_A4550HreLinPro, P08QM2_A4557HreRecLin
            }
            , new Object[] {
            P08QM3_A4492HreBarCod, P08QM3_A4493HreBarReo, P08QM3_A4494HreBarPar, P08QM3_A4495HreNumCie, P08QM3_A396EmprCod, P08QM3_A12535HreCencId, P08QM3_n12535HreCencId, P08QM3_A4559HrePrdDsc, P08QM3_n4559HrePrdDsc, P08QM3_A12453HreFecAct,
            P08QM3_n12453HreFecAct, P08QM3_A5726HreLote, P08QM3_n5726HreLote, P08QM3_A4558HrePrdNum, P08QM3_n4558HrePrdNum, P08QM3_A4545HreLinMaq, P08QM3_A4550HreLinPro, P08QM3_A4557HreRecLin
            }
            , new Object[] {
            P08QM4_A4492HreBarCod, P08QM4_A4493HreBarReo, P08QM4_A4494HreBarPar, P08QM4_A4495HreNumCie, P08QM4_A396EmprCod, P08QM4_A12535HreCencId, P08QM4_n12535HreCencId, P08QM4_A5726HreLote, P08QM4_n5726HreLote, P08QM4_A12453HreFecAct,
            P08QM4_n12453HreFecAct, P08QM4_A4559HrePrdDsc, P08QM4_n4559HrePrdDsc, P08QM4_A4558HrePrdNum, P08QM4_n4558HrePrdNum, P08QM4_A4545HreLinMaq, P08QM4_A4550HreLinPro, P08QM4_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV35Tb1_cod ;
   private short A12535HreCencId ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int A4492HreBarCod ;
   private long AV28count ;
   private String AV14TFHrePrdNum ;
   private String AV15TFHrePrdNum_Sel ;
   private String AV39TFHrePrdDsc ;
   private String AV40TFHrePrdDsc_Sel ;
   private String AV41TFHreLote ;
   private String AV42TFHreLote_Sel ;
   private String AV34Emprcod ;
   private String scmdbuf ;
   private String lV14TFHrePrdNum ;
   private String lV39TFHrePrdDsc ;
   private String lV41TFHreLote ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A5726HreLote ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private java.util.Date AV36HreFecTin ;
   private java.util.Date AV37HreFecTin_to ;
   private java.util.Date A12453HreFecAct ;
   private boolean returnInSub ;
   private boolean brk8QM2 ;
   private boolean n12535HreCencId ;
   private boolean n4558HrePrdNum ;
   private boolean n12453HreFecAct ;
   private boolean n5726HreLote ;
   private boolean n4559HrePrdDsc ;
   private boolean brk8QM4 ;
   private boolean brk8QM6 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV38FilterFullText ;
   private String lV38FilterFullText ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08QM2_A4492HreBarCod ;
   private byte[] P08QM2_A4493HreBarReo ;
   private String[] P08QM2_A4494HreBarPar ;
   private byte[] P08QM2_A4495HreNumCie ;
   private String[] P08QM2_A396EmprCod ;
   private short[] P08QM2_A12535HreCencId ;
   private boolean[] P08QM2_n12535HreCencId ;
   private String[] P08QM2_A4558HrePrdNum ;
   private boolean[] P08QM2_n4558HrePrdNum ;
   private java.util.Date[] P08QM2_A12453HreFecAct ;
   private boolean[] P08QM2_n12453HreFecAct ;
   private String[] P08QM2_A5726HreLote ;
   private boolean[] P08QM2_n5726HreLote ;
   private String[] P08QM2_A4559HrePrdDsc ;
   private boolean[] P08QM2_n4559HrePrdDsc ;
   private short[] P08QM2_A4545HreLinMaq ;
   private byte[] P08QM2_A4550HreLinPro ;
   private short[] P08QM2_A4557HreRecLin ;
   private int[] P08QM3_A4492HreBarCod ;
   private byte[] P08QM3_A4493HreBarReo ;
   private String[] P08QM3_A4494HreBarPar ;
   private byte[] P08QM3_A4495HreNumCie ;
   private String[] P08QM3_A396EmprCod ;
   private short[] P08QM3_A12535HreCencId ;
   private boolean[] P08QM3_n12535HreCencId ;
   private String[] P08QM3_A4559HrePrdDsc ;
   private boolean[] P08QM3_n4559HrePrdDsc ;
   private java.util.Date[] P08QM3_A12453HreFecAct ;
   private boolean[] P08QM3_n12453HreFecAct ;
   private String[] P08QM3_A5726HreLote ;
   private boolean[] P08QM3_n5726HreLote ;
   private String[] P08QM3_A4558HrePrdNum ;
   private boolean[] P08QM3_n4558HrePrdNum ;
   private short[] P08QM3_A4545HreLinMaq ;
   private byte[] P08QM3_A4550HreLinPro ;
   private short[] P08QM3_A4557HreRecLin ;
   private int[] P08QM4_A4492HreBarCod ;
   private byte[] P08QM4_A4493HreBarReo ;
   private String[] P08QM4_A4494HreBarPar ;
   private byte[] P08QM4_A4495HreNumCie ;
   private String[] P08QM4_A396EmprCod ;
   private short[] P08QM4_A12535HreCencId ;
   private boolean[] P08QM4_n12535HreCencId ;
   private String[] P08QM4_A5726HreLote ;
   private boolean[] P08QM4_n5726HreLote ;
   private java.util.Date[] P08QM4_A12453HreFecAct ;
   private boolean[] P08QM4_n12453HreFecAct ;
   private String[] P08QM4_A4559HrePrdDsc ;
   private boolean[] P08QM4_n4559HrePrdDsc ;
   private String[] P08QM4_A4558HrePrdNum ;
   private boolean[] P08QM4_n4558HrePrdNum ;
   private short[] P08QM4_A4545HreLinMaq ;
   private byte[] P08QM4_A4550HreLinPro ;
   private short[] P08QM4_A4557HreRecLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwcdencproductosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08QM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          String AV15TFHrePrdNum_Sel ,
                                          String AV14TFHrePrdNum ,
                                          String AV40TFHrePrdDsc_Sel ,
                                          String AV39TFHrePrdDsc ,
                                          String AV42TFHreLote_Sel ,
                                          String AV41TFHreLote ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          String A5726HreLote ,
                                          short AV35Tb1_cod ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV36HreFecTin ,
                                          java.util.Date AV37HreFecTin_to ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          short A12535HreCencId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T2.HreCencId, T1.HrePrdNum, T1.HreFecAct, T1.HreLote, T1.HrePrdDsc, T1.HreLinMaq, T1.HreLinPro," ;
      scmdbuf += " T1.HreRecLin FROM (TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar" ;
      scmdbuf += " = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.HrePrdNum >= '100000')");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T1.HreFecAct >= ?)");
      addWhere(sWhereString, "(T1.HreFecAct <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      addWhere(sWhereString, "(T1.HrePrdNum <= '999999')");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFHrePrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFHrePrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFHreLote_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFHreLote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFHreLote_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLote = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08QM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          String AV15TFHrePrdNum_Sel ,
                                          String AV14TFHrePrdNum ,
                                          String AV40TFHrePrdDsc_Sel ,
                                          String AV39TFHrePrdDsc ,
                                          String AV42TFHreLote_Sel ,
                                          String AV41TFHreLote ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          String A5726HreLote ,
                                          short AV35Tb1_cod ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV36HreFecTin ,
                                          java.util.Date AV37HreFecTin_to ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          short A12535HreCencId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T2.HreCencId, T1.HrePrdDsc, T1.HreFecAct, T1.HreLote, T1.HrePrdNum, T1.HreLinMaq, T1.HreLinPro," ;
      scmdbuf += " T1.HreRecLin FROM (TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar" ;
      scmdbuf += " = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T1.HreFecAct >= ?)");
      addWhere(sWhereString, "(T1.HreFecAct <= ?)");
      addWhere(sWhereString, "(T1.HrePrdNum >= '100000')");
      addWhere(sWhereString, "(T1.HrePrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFHrePrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFHrePrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFHreLote_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFHreLote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFHreLote_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLote = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08QM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38FilterFullText ,
                                          String AV15TFHrePrdNum_Sel ,
                                          String AV14TFHrePrdNum ,
                                          String AV40TFHrePrdDsc_Sel ,
                                          String AV39TFHrePrdDsc ,
                                          String AV42TFHreLote_Sel ,
                                          String AV41TFHreLote ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          String A5726HreLote ,
                                          short AV35Tb1_cod ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV36HreFecTin ,
                                          java.util.Date AV37HreFecTin_to ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          short A12535HreCencId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T2.HreCencId, T1.HreLote, T1.HreFecAct, T1.HrePrdDsc, T1.HrePrdNum, T1.HreLinMaq, T1.HreLinPro," ;
      scmdbuf += " T1.HreRecLin FROM (TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar" ;
      scmdbuf += " = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T1.HreFecAct >= ?)");
      addWhere(sWhereString, "(T1.HreFecAct <= ?)");
      addWhere(sWhereString, "(T1.HrePrdNum >= '100000')");
      addWhere(sWhereString, "(T1.HrePrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV38FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFHrePrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFHrePrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV39TFHrePrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFHrePrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42TFHreLote_Sel)==0) && ( ! (GXutil.strcmp("", AV41TFHreLote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42TFHreLote_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLote = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreLote" ;
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
                  return conditional_P08QM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() );
            case 1 :
                  return conditional_P08QM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() );
            case 2 :
                  return conditional_P08QM4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
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
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
      }
   }

}

