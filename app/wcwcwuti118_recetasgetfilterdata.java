package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcwuti118_recetasgetfilterdata extends GXProcedure
{
   public wcwcwuti118_recetasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcwuti118_recetasgetfilterdata.class ), "" );
   }

   public wcwcwuti118_recetasgetfilterdata( int remoteHandle ,
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
      wcwcwuti118_recetasgetfilterdata.this.aP5 = new String[] {""};
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
      wcwcwuti118_recetasgetfilterdata.this.AV16DDOName = aP0;
      wcwcwuti118_recetasgetfilterdata.this.AV14SearchTxt = aP1;
      wcwcwuti118_recetasgetfilterdata.this.AV15SearchTxtTo = aP2;
      wcwcwuti118_recetasgetfilterdata.this.aP3 = aP3;
      wcwcwuti118_recetasgetfilterdata.this.aP4 = aP4;
      wcwcwuti118_recetasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HREPRDUDS") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDUDSOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HRELOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADHRELOTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WCWCWUti118_RecetasGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_RecetasGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCWCWUti118_RecetasGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV10TFHrePrdCant = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV11TFHrePrdCant_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV12TFHrePrdUDs = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV13TFHrePrdUDs_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE") == 0 )
         {
            AV38TFHreLote = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE_SEL") == 0 )
         {
            AV39TFHreLote_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV34Prdnum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELOTE") == 0 )
         {
            AV35HreLote = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV36Fec1 = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV37Fec2 = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDUDSOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHrePrdUDs = AV14SearchTxt ;
      AV13TFHrePrdUDs_Sel = "" ;
      AV44Wcwcwuti118_recetasds_1_filterfulltext = AV32FilterFullText ;
      AV45Wcwcwuti118_recetasds_2_tfhreprdcant = AV10TFHrePrdCant ;
      AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to = AV11TFHrePrdCant_To ;
      AV47Wcwcwuti118_recetasds_4_tfhreprduds = AV12TFHrePrdUDs ;
      AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel = AV13TFHrePrdUDs_Sel ;
      AV49Wcwcwuti118_recetasds_6_tfhrelote = AV38TFHreLote ;
      AV50Wcwcwuti118_recetasds_7_tfhrelote_sel = AV39TFHreLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Wcwcwuti118_recetasds_1_filterfulltext ,
                                           AV45Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                           AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                           AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                           AV47Wcwcwuti118_recetasds_4_tfhreprduds ,
                                           AV50Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                           AV49Wcwcwuti118_recetasds_6_tfhrelote ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A5726HreLote ,
                                           AV35HreLote ,
                                           A12453HreFecAct ,
                                           AV36Fec1 ,
                                           AV37Fec2 ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           A719PrdNum ,
                                           AV34Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV47Wcwcwuti118_recetasds_4_tfhreprduds = GXutil.padr( GXutil.rtrim( AV47Wcwcwuti118_recetasds_4_tfhreprduds), 5, "%") ;
      lV49Wcwcwuti118_recetasds_6_tfhrelote = GXutil.padr( GXutil.rtrim( AV49Wcwcwuti118_recetasds_6_tfhrelote), 26, "%") ;
      /* Using cursor P08X82 */
      pr_default.execute(0, new Object[] {AV36Fec1, AV37Fec2, AV33Emprcod, AV34Prdnum, lV44Wcwcwuti118_recetasds_1_filterfulltext, lV44Wcwcwuti118_recetasds_1_filterfulltext, lV44Wcwcwuti118_recetasds_1_filterfulltext, AV45Wcwcwuti118_recetasds_2_tfhreprdcant, AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to, lV47Wcwcwuti118_recetasds_4_tfhreprduds, AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel, lV49Wcwcwuti118_recetasds_6_tfhrelote, AV50Wcwcwuti118_recetasds_7_tfhrelote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8X82 = false ;
         A396EmprCod = P08X82_A396EmprCod[0] ;
         A719PrdNum = P08X82_A719PrdNum[0] ;
         n719PrdNum = P08X82_n719PrdNum[0] ;
         A4561HrePrdUDs = P08X82_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08X82_n4561HrePrdUDs[0] ;
         A12453HreFecAct = P08X82_A12453HreFecAct[0] ;
         n12453HreFecAct = P08X82_n12453HreFecAct[0] ;
         A5726HreLote = P08X82_A5726HreLote[0] ;
         n5726HreLote = P08X82_n5726HreLote[0] ;
         A4563HrePrdCant = P08X82_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08X82_n4563HrePrdCant[0] ;
         A4492HreBarCod = P08X82_A4492HreBarCod[0] ;
         A4493HreBarReo = P08X82_A4493HreBarReo[0] ;
         A4494HreBarPar = P08X82_A4494HreBarPar[0] ;
         A4495HreNumCie = P08X82_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08X82_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08X82_A4550HreLinPro[0] ;
         A4557HreRecLin = P08X82_A4557HreRecLin[0] ;
         if ( ( ( GXutil.strcmp(A5726HreLote, AV35HreLote) == 0 ) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) != 0 ) ) || ( (GXutil.strcmp("", A5726HreLote)==0) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) == 0 ) ) )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08X82_A4561HrePrdUDs[0], A4561HrePrdUDs) == 0 ) )
            {
               brk8X82 = false ;
               A396EmprCod = P08X82_A396EmprCod[0] ;
               A4492HreBarCod = P08X82_A4492HreBarCod[0] ;
               A4493HreBarReo = P08X82_A4493HreBarReo[0] ;
               A4494HreBarPar = P08X82_A4494HreBarPar[0] ;
               A4495HreNumCie = P08X82_A4495HreNumCie[0] ;
               A4545HreLinMaq = P08X82_A4545HreLinMaq[0] ;
               A4550HreLinPro = P08X82_A4550HreLinPro[0] ;
               A4557HreRecLin = P08X82_A4557HreRecLin[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8X82 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A4561HrePrdUDs)==0) )
            {
               AV18Option = A4561HrePrdUDs ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8X82 )
         {
            brk8X82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHRELOTEOPTIONS' Routine */
      returnInSub = false ;
      AV38TFHreLote = AV14SearchTxt ;
      AV39TFHreLote_Sel = "" ;
      AV44Wcwcwuti118_recetasds_1_filterfulltext = AV32FilterFullText ;
      AV45Wcwcwuti118_recetasds_2_tfhreprdcant = AV10TFHrePrdCant ;
      AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to = AV11TFHrePrdCant_To ;
      AV47Wcwcwuti118_recetasds_4_tfhreprduds = AV12TFHrePrdUDs ;
      AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel = AV13TFHrePrdUDs_Sel ;
      AV49Wcwcwuti118_recetasds_6_tfhrelote = AV38TFHreLote ;
      AV50Wcwcwuti118_recetasds_7_tfhrelote_sel = AV39TFHreLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV44Wcwcwuti118_recetasds_1_filterfulltext ,
                                           AV45Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                           AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                           AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                           AV47Wcwcwuti118_recetasds_4_tfhreprduds ,
                                           AV50Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                           AV49Wcwcwuti118_recetasds_6_tfhrelote ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A5726HreLote ,
                                           AV35HreLote ,
                                           A12453HreFecAct ,
                                           AV36Fec1 ,
                                           AV37Fec2 ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           A719PrdNum ,
                                           AV34Prdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV44Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV47Wcwcwuti118_recetasds_4_tfhreprduds = GXutil.padr( GXutil.rtrim( AV47Wcwcwuti118_recetasds_4_tfhreprduds), 5, "%") ;
      lV49Wcwcwuti118_recetasds_6_tfhrelote = GXutil.padr( GXutil.rtrim( AV49Wcwcwuti118_recetasds_6_tfhrelote), 26, "%") ;
      /* Using cursor P08X83 */
      pr_default.execute(1, new Object[] {AV36Fec1, AV37Fec2, AV33Emprcod, AV34Prdnum, lV44Wcwcwuti118_recetasds_1_filterfulltext, lV44Wcwcwuti118_recetasds_1_filterfulltext, lV44Wcwcwuti118_recetasds_1_filterfulltext, AV45Wcwcwuti118_recetasds_2_tfhreprdcant, AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to, lV47Wcwcwuti118_recetasds_4_tfhreprduds, AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel, lV49Wcwcwuti118_recetasds_6_tfhrelote, AV50Wcwcwuti118_recetasds_7_tfhrelote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8X84 = false ;
         A396EmprCod = P08X83_A396EmprCod[0] ;
         A719PrdNum = P08X83_A719PrdNum[0] ;
         n719PrdNum = P08X83_n719PrdNum[0] ;
         A5726HreLote = P08X83_A5726HreLote[0] ;
         n5726HreLote = P08X83_n5726HreLote[0] ;
         A12453HreFecAct = P08X83_A12453HreFecAct[0] ;
         n12453HreFecAct = P08X83_n12453HreFecAct[0] ;
         A4561HrePrdUDs = P08X83_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08X83_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08X83_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08X83_n4563HrePrdCant[0] ;
         A4492HreBarCod = P08X83_A4492HreBarCod[0] ;
         A4493HreBarReo = P08X83_A4493HreBarReo[0] ;
         A4494HreBarPar = P08X83_A4494HreBarPar[0] ;
         A4495HreNumCie = P08X83_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08X83_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08X83_A4550HreLinPro[0] ;
         A4557HreRecLin = P08X83_A4557HreRecLin[0] ;
         if ( ( ( GXutil.strcmp(A5726HreLote, AV35HreLote) == 0 ) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) != 0 ) ) || ( (GXutil.strcmp("", A5726HreLote)==0) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) == 0 ) ) )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08X83_A5726HreLote[0], A5726HreLote) == 0 ) )
            {
               brk8X84 = false ;
               A396EmprCod = P08X83_A396EmprCod[0] ;
               A4492HreBarCod = P08X83_A4492HreBarCod[0] ;
               A4493HreBarReo = P08X83_A4493HreBarReo[0] ;
               A4494HreBarPar = P08X83_A4494HreBarPar[0] ;
               A4495HreNumCie = P08X83_A4495HreNumCie[0] ;
               A4545HreLinMaq = P08X83_A4545HreLinMaq[0] ;
               A4550HreLinPro = P08X83_A4550HreLinPro[0] ;
               A4557HreRecLin = P08X83_A4557HreRecLin[0] ;
               if ( ( ( GXutil.strcmp(A5726HreLote, AV35HreLote) == 0 ) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) != 0 ) ) || ( (GXutil.strcmp("", A5726HreLote)==0) && ( GXutil.strcmp(AV35HreLote, httpContext.getMessage( "S/N", "")) == 0 ) ) )
               {
                  AV26count = (long)(AV26count+1) ;
               }
               brk8X84 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A5726HreLote)==0) )
            {
               AV18Option = A5726HreLote ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8X84 )
         {
            brk8X84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcwuti118_recetasgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcwcwuti118_recetasgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcwcwuti118_recetasgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFHrePrdCant = DecimalUtil.ZERO ;
      AV11TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV12TFHrePrdUDs = "" ;
      AV13TFHrePrdUDs_Sel = "" ;
      AV38TFHreLote = "" ;
      AV39TFHreLote_Sel = "" ;
      AV33Emprcod = "" ;
      AV34Prdnum = "" ;
      AV35HreLote = "" ;
      AV36Fec1 = GXutil.nullDate() ;
      AV37Fec2 = GXutil.nullDate() ;
      A4561HrePrdUDs = "" ;
      AV44Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      AV45Wcwcwuti118_recetasds_2_tfhreprdcant = DecimalUtil.ZERO ;
      AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV47Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel = "" ;
      AV49Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      AV50Wcwcwuti118_recetasds_7_tfhrelote_sel = "" ;
      scmdbuf = "" ;
      lV44Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      lV47Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      lV49Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P08X82_A396EmprCod = new String[] {""} ;
      P08X82_A719PrdNum = new String[] {""} ;
      P08X82_n719PrdNum = new boolean[] {false} ;
      P08X82_A4561HrePrdUDs = new String[] {""} ;
      P08X82_n4561HrePrdUDs = new boolean[] {false} ;
      P08X82_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08X82_n12453HreFecAct = new boolean[] {false} ;
      P08X82_A5726HreLote = new String[] {""} ;
      P08X82_n5726HreLote = new boolean[] {false} ;
      P08X82_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X82_n4563HrePrdCant = new boolean[] {false} ;
      P08X82_A4492HreBarCod = new int[1] ;
      P08X82_A4493HreBarReo = new byte[1] ;
      P08X82_A4494HreBarPar = new String[] {""} ;
      P08X82_A4495HreNumCie = new byte[1] ;
      P08X82_A4545HreLinMaq = new short[1] ;
      P08X82_A4550HreLinPro = new byte[1] ;
      P08X82_A4557HreRecLin = new short[1] ;
      A4494HreBarPar = "" ;
      AV18Option = "" ;
      P08X83_A396EmprCod = new String[] {""} ;
      P08X83_A719PrdNum = new String[] {""} ;
      P08X83_n719PrdNum = new boolean[] {false} ;
      P08X83_A5726HreLote = new String[] {""} ;
      P08X83_n5726HreLote = new boolean[] {false} ;
      P08X83_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08X83_n12453HreFecAct = new boolean[] {false} ;
      P08X83_A4561HrePrdUDs = new String[] {""} ;
      P08X83_n4561HrePrdUDs = new boolean[] {false} ;
      P08X83_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X83_n4563HrePrdCant = new boolean[] {false} ;
      P08X83_A4492HreBarCod = new int[1] ;
      P08X83_A4493HreBarReo = new byte[1] ;
      P08X83_A4494HreBarPar = new String[] {""} ;
      P08X83_A4495HreNumCie = new byte[1] ;
      P08X83_A4545HreLinMaq = new short[1] ;
      P08X83_A4550HreLinPro = new byte[1] ;
      P08X83_A4557HreRecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcwuti118_recetasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08X82_A396EmprCod, P08X82_A719PrdNum, P08X82_n719PrdNum, P08X82_A4561HrePrdUDs, P08X82_n4561HrePrdUDs, P08X82_A12453HreFecAct, P08X82_n12453HreFecAct, P08X82_A5726HreLote, P08X82_n5726HreLote, P08X82_A4563HrePrdCant,
            P08X82_n4563HrePrdCant, P08X82_A4492HreBarCod, P08X82_A4493HreBarReo, P08X82_A4494HreBarPar, P08X82_A4495HreNumCie, P08X82_A4545HreLinMaq, P08X82_A4550HreLinPro, P08X82_A4557HreRecLin
            }
            , new Object[] {
            P08X83_A396EmprCod, P08X83_A719PrdNum, P08X83_n719PrdNum, P08X83_A5726HreLote, P08X83_n5726HreLote, P08X83_A12453HreFecAct, P08X83_n12453HreFecAct, P08X83_A4561HrePrdUDs, P08X83_n4561HrePrdUDs, P08X83_A4563HrePrdCant,
            P08X83_n4563HrePrdCant, P08X83_A4492HreBarCod, P08X83_A4493HreBarReo, P08X83_A4494HreBarPar, P08X83_A4495HreNumCie, P08X83_A4545HreLinMaq, P08X83_A4550HreLinPro, P08X83_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV42GXV1 ;
   private int A4492HreBarCod ;
   private long AV26count ;
   private java.math.BigDecimal AV10TFHrePrdCant ;
   private java.math.BigDecimal AV11TFHrePrdCant_To ;
   private java.math.BigDecimal AV45Wcwcwuti118_recetasds_2_tfhreprdcant ;
   private java.math.BigDecimal AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private String AV12TFHrePrdUDs ;
   private String AV13TFHrePrdUDs_Sel ;
   private String AV38TFHreLote ;
   private String AV39TFHreLote_Sel ;
   private String AV33Emprcod ;
   private String AV34Prdnum ;
   private String AV35HreLote ;
   private String A4561HrePrdUDs ;
   private String AV47Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel ;
   private String AV49Wcwcwuti118_recetasds_6_tfhrelote ;
   private String AV50Wcwcwuti118_recetasds_7_tfhrelote_sel ;
   private String scmdbuf ;
   private String lV47Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String lV49Wcwcwuti118_recetasds_6_tfhrelote ;
   private String A5726HreLote ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A4494HreBarPar ;
   private java.util.Date AV36Fec1 ;
   private java.util.Date AV37Fec2 ;
   private java.util.Date A12453HreFecAct ;
   private boolean returnInSub ;
   private boolean brk8X82 ;
   private boolean n719PrdNum ;
   private boolean n4561HrePrdUDs ;
   private boolean n12453HreFecAct ;
   private boolean n5726HreLote ;
   private boolean n4563HrePrdCant ;
   private boolean brk8X84 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV44Wcwcwuti118_recetasds_1_filterfulltext ;
   private String lV44Wcwcwuti118_recetasds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08X82_A396EmprCod ;
   private String[] P08X82_A719PrdNum ;
   private boolean[] P08X82_n719PrdNum ;
   private String[] P08X82_A4561HrePrdUDs ;
   private boolean[] P08X82_n4561HrePrdUDs ;
   private java.util.Date[] P08X82_A12453HreFecAct ;
   private boolean[] P08X82_n12453HreFecAct ;
   private String[] P08X82_A5726HreLote ;
   private boolean[] P08X82_n5726HreLote ;
   private java.math.BigDecimal[] P08X82_A4563HrePrdCant ;
   private boolean[] P08X82_n4563HrePrdCant ;
   private int[] P08X82_A4492HreBarCod ;
   private byte[] P08X82_A4493HreBarReo ;
   private String[] P08X82_A4494HreBarPar ;
   private byte[] P08X82_A4495HreNumCie ;
   private short[] P08X82_A4545HreLinMaq ;
   private byte[] P08X82_A4550HreLinPro ;
   private short[] P08X82_A4557HreRecLin ;
   private String[] P08X83_A396EmprCod ;
   private String[] P08X83_A719PrdNum ;
   private boolean[] P08X83_n719PrdNum ;
   private String[] P08X83_A5726HreLote ;
   private boolean[] P08X83_n5726HreLote ;
   private java.util.Date[] P08X83_A12453HreFecAct ;
   private boolean[] P08X83_n12453HreFecAct ;
   private String[] P08X83_A4561HrePrdUDs ;
   private boolean[] P08X83_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08X83_A4563HrePrdCant ;
   private boolean[] P08X83_n4563HrePrdCant ;
   private int[] P08X83_A4492HreBarCod ;
   private byte[] P08X83_A4493HreBarReo ;
   private String[] P08X83_A4494HreBarPar ;
   private byte[] P08X83_A4495HreNumCie ;
   private short[] P08X83_A4545HreLinMaq ;
   private byte[] P08X83_A4550HreLinPro ;
   private short[] P08X83_A4557HreRecLin ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcwcwuti118_recetasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08X82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Wcwcwuti118_recetasds_1_filterfulltext ,
                                          java.math.BigDecimal AV45Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                          java.math.BigDecimal AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                          String AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                          String AV47Wcwcwuti118_recetasds_4_tfhreprduds ,
                                          String AV50Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                          String AV49Wcwcwuti118_recetasds_6_tfhrelote ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          String A5726HreLote ,
                                          String AV35HreLote ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV36Fec1 ,
                                          java.util.Date AV37Fec2 ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          String A719PrdNum ,
                                          String AV34Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, HrePrdUDs, HreFecAct, HreLote, HrePrdCant, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(HreFecAct >= ?)");
      addWhere(sWhereString, "(HreFecAct <= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV44Wcwcwuti118_recetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(HrePrdUDs) like '%' || UPPER(?)) or ( UPPER(HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Wcwcwuti118_recetasds_2_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV47Wcwcwuti118_recetasds_4_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcwuti118_recetasds_6_tfhrelote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) )
      {
         addWhere(sWhereString, "(HreLote = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrePrdUDs" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08X83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Wcwcwuti118_recetasds_1_filterfulltext ,
                                          java.math.BigDecimal AV45Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                          java.math.BigDecimal AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                          String AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                          String AV47Wcwcwuti118_recetasds_4_tfhreprduds ,
                                          String AV50Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                          String AV49Wcwcwuti118_recetasds_6_tfhrelote ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          String A5726HreLote ,
                                          String AV35HreLote ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV36Fec1 ,
                                          java.util.Date AV37Fec2 ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          String A719PrdNum ,
                                          String AV34Prdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, HreLote, HreFecAct, HrePrdUDs, HrePrdCant, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(HreFecAct >= ?)");
      addWhere(sWhereString, "(HreFecAct <= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV44Wcwcwuti118_recetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(HrePrdUDs) like '%' || UPPER(?)) or ( UPPER(HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Wcwcwuti118_recetasds_2_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Wcwcwuti118_recetasds_3_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV47Wcwcwuti118_recetasds_4_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcwuti118_recetasds_6_tfhrelote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) )
      {
         addWhere(sWhereString, "(HreLote = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreLote" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08X82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_P08X83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08X82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08X83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               return;
      }
   }

}

