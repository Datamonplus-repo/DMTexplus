package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqfaswwgetfilterdata extends GXProcedure
{
   public tmaqfaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqfaswwgetfilterdata.class ), "" );
   }

   public tmaqfaswwgetfilterdata( int remoteHandle ,
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
      tmaqfaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tmaqfaswwgetfilterdata.this.AV18DDOName = aP0;
      tmaqfaswwgetfilterdata.this.AV16SearchTxt = aP1;
      tmaqfaswwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tmaqfaswwgetfilterdata.this.aP3 = aP3;
      tmaqfaswwgetfilterdata.this.aP4 = aP4;
      tmaqfaswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQFASUNI") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFASUNIOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_MAQEST") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQESTOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV29Session.getValue("TMAQFASWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQFASWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("TMAQFASWWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV12TFMaqDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV13TFMaqDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFASUNI") == 0 )
         {
            AV14TFMaqFasUni = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFASUNI_SEL") == 0 )
         {
            AV15TFMaqFasUni_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV49TFMaqEst = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV50TFMaqEst_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV16SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV55Tmaqfaswwds_1_filterfulltext = AV48FilterFullText ;
      AV56Tmaqfaswwds_2_tfmaqcod = AV10TFMaqCod ;
      AV57Tmaqfaswwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV58Tmaqfaswwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV59Tmaqfaswwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV60Tmaqfaswwds_6_tfmaqfasuni = AV14TFMaqFasUni ;
      AV61Tmaqfaswwds_7_tfmaqfasuni_sel = AV15TFMaqFasUni_Sel ;
      AV62Tmaqfaswwds_8_tfmaqest = AV49TFMaqEst ;
      AV63Tmaqfaswwds_9_tfmaqest_sel = AV50TFMaqEst_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Tmaqfaswwds_1_filterfulltext ,
                                           AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                           AV56Tmaqfaswwds_2_tfmaqcod ,
                                           AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                           AV58Tmaqfaswwds_4_tfmaqdsc ,
                                           AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                           AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                           AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                           AV62Tmaqfaswwds_8_tfmaqest ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1257MaqFasUni ,
                                           A607MaqEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV56Tmaqfaswwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV56Tmaqfaswwds_2_tfmaqcod), 6, "%") ;
      lV58Tmaqfaswwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV58Tmaqfaswwds_4_tfmaqdsc), 16, "%") ;
      lV60Tmaqfaswwds_6_tfmaqfasuni = GXutil.padr( GXutil.rtrim( AV60Tmaqfaswwds_6_tfmaqfasuni), 1, "%") ;
      lV62Tmaqfaswwds_8_tfmaqest = GXutil.padr( GXutil.rtrim( AV62Tmaqfaswwds_8_tfmaqest), 1, "%") ;
      /* Using cursor P08AY2 */
      pr_default.execute(0, new Object[] {lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV56Tmaqfaswwds_2_tfmaqcod, AV57Tmaqfaswwds_3_tfmaqcod_sel, lV58Tmaqfaswwds_4_tfmaqdsc, AV59Tmaqfaswwds_5_tfmaqdsc_sel, lV60Tmaqfaswwds_6_tfmaqfasuni, AV61Tmaqfaswwds_7_tfmaqfasuni_sel, lV62Tmaqfaswwds_8_tfmaqest, AV63Tmaqfaswwds_9_tfmaqest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8AY2 = false ;
         A602MaqCod = P08AY2_A602MaqCod[0] ;
         A607MaqEst = P08AY2_A607MaqEst[0] ;
         n607MaqEst = P08AY2_n607MaqEst[0] ;
         A1257MaqFasUni = P08AY2_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P08AY2_n1257MaqFasUni[0] ;
         A606MaqDsc = P08AY2_A606MaqDsc[0] ;
         n606MaqDsc = P08AY2_n606MaqDsc[0] ;
         A396EmprCod = P08AY2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08AY2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8AY2 = false ;
            A396EmprCod = P08AY2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AY2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV20Option = A602MaqCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AY2 )
         {
            brk8AY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV16SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV55Tmaqfaswwds_1_filterfulltext = AV48FilterFullText ;
      AV56Tmaqfaswwds_2_tfmaqcod = AV10TFMaqCod ;
      AV57Tmaqfaswwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV58Tmaqfaswwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV59Tmaqfaswwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV60Tmaqfaswwds_6_tfmaqfasuni = AV14TFMaqFasUni ;
      AV61Tmaqfaswwds_7_tfmaqfasuni_sel = AV15TFMaqFasUni_Sel ;
      AV62Tmaqfaswwds_8_tfmaqest = AV49TFMaqEst ;
      AV63Tmaqfaswwds_9_tfmaqest_sel = AV50TFMaqEst_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Tmaqfaswwds_1_filterfulltext ,
                                           AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                           AV56Tmaqfaswwds_2_tfmaqcod ,
                                           AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                           AV58Tmaqfaswwds_4_tfmaqdsc ,
                                           AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                           AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                           AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                           AV62Tmaqfaswwds_8_tfmaqest ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1257MaqFasUni ,
                                           A607MaqEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV56Tmaqfaswwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV56Tmaqfaswwds_2_tfmaqcod), 6, "%") ;
      lV58Tmaqfaswwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV58Tmaqfaswwds_4_tfmaqdsc), 16, "%") ;
      lV60Tmaqfaswwds_6_tfmaqfasuni = GXutil.padr( GXutil.rtrim( AV60Tmaqfaswwds_6_tfmaqfasuni), 1, "%") ;
      lV62Tmaqfaswwds_8_tfmaqest = GXutil.padr( GXutil.rtrim( AV62Tmaqfaswwds_8_tfmaqest), 1, "%") ;
      /* Using cursor P08AY3 */
      pr_default.execute(1, new Object[] {lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV56Tmaqfaswwds_2_tfmaqcod, AV57Tmaqfaswwds_3_tfmaqcod_sel, lV58Tmaqfaswwds_4_tfmaqdsc, AV59Tmaqfaswwds_5_tfmaqdsc_sel, lV60Tmaqfaswwds_6_tfmaqfasuni, AV61Tmaqfaswwds_7_tfmaqfasuni_sel, lV62Tmaqfaswwds_8_tfmaqest, AV63Tmaqfaswwds_9_tfmaqest_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8AY4 = false ;
         A606MaqDsc = P08AY3_A606MaqDsc[0] ;
         n606MaqDsc = P08AY3_n606MaqDsc[0] ;
         A607MaqEst = P08AY3_A607MaqEst[0] ;
         n607MaqEst = P08AY3_n607MaqEst[0] ;
         A1257MaqFasUni = P08AY3_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P08AY3_n1257MaqFasUni[0] ;
         A602MaqCod = P08AY3_A602MaqCod[0] ;
         A396EmprCod = P08AY3_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08AY3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8AY4 = false ;
            A602MaqCod = P08AY3_A602MaqCod[0] ;
            A396EmprCod = P08AY3_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AY4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV20Option = A606MaqDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AY4 )
         {
            brk8AY4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQFASUNIOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMaqFasUni = AV16SearchTxt ;
      AV15TFMaqFasUni_Sel = "" ;
      AV55Tmaqfaswwds_1_filterfulltext = AV48FilterFullText ;
      AV56Tmaqfaswwds_2_tfmaqcod = AV10TFMaqCod ;
      AV57Tmaqfaswwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV58Tmaqfaswwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV59Tmaqfaswwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV60Tmaqfaswwds_6_tfmaqfasuni = AV14TFMaqFasUni ;
      AV61Tmaqfaswwds_7_tfmaqfasuni_sel = AV15TFMaqFasUni_Sel ;
      AV62Tmaqfaswwds_8_tfmaqest = AV49TFMaqEst ;
      AV63Tmaqfaswwds_9_tfmaqest_sel = AV50TFMaqEst_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Tmaqfaswwds_1_filterfulltext ,
                                           AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                           AV56Tmaqfaswwds_2_tfmaqcod ,
                                           AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                           AV58Tmaqfaswwds_4_tfmaqdsc ,
                                           AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                           AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                           AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                           AV62Tmaqfaswwds_8_tfmaqest ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1257MaqFasUni ,
                                           A607MaqEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV56Tmaqfaswwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV56Tmaqfaswwds_2_tfmaqcod), 6, "%") ;
      lV58Tmaqfaswwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV58Tmaqfaswwds_4_tfmaqdsc), 16, "%") ;
      lV60Tmaqfaswwds_6_tfmaqfasuni = GXutil.padr( GXutil.rtrim( AV60Tmaqfaswwds_6_tfmaqfasuni), 1, "%") ;
      lV62Tmaqfaswwds_8_tfmaqest = GXutil.padr( GXutil.rtrim( AV62Tmaqfaswwds_8_tfmaqest), 1, "%") ;
      /* Using cursor P08AY4 */
      pr_default.execute(2, new Object[] {lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV56Tmaqfaswwds_2_tfmaqcod, AV57Tmaqfaswwds_3_tfmaqcod_sel, lV58Tmaqfaswwds_4_tfmaqdsc, AV59Tmaqfaswwds_5_tfmaqdsc_sel, lV60Tmaqfaswwds_6_tfmaqfasuni, AV61Tmaqfaswwds_7_tfmaqfasuni_sel, lV62Tmaqfaswwds_8_tfmaqest, AV63Tmaqfaswwds_9_tfmaqest_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8AY6 = false ;
         A1257MaqFasUni = P08AY4_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P08AY4_n1257MaqFasUni[0] ;
         A607MaqEst = P08AY4_A607MaqEst[0] ;
         n607MaqEst = P08AY4_n607MaqEst[0] ;
         A606MaqDsc = P08AY4_A606MaqDsc[0] ;
         n606MaqDsc = P08AY4_n606MaqDsc[0] ;
         A602MaqCod = P08AY4_A602MaqCod[0] ;
         A396EmprCod = P08AY4_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08AY4_A1257MaqFasUni[0], A1257MaqFasUni) == 0 ) )
         {
            brk8AY6 = false ;
            A602MaqCod = P08AY4_A602MaqCod[0] ;
            A396EmprCod = P08AY4_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AY6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1257MaqFasUni)==0) )
         {
            AV20Option = A1257MaqFasUni ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A1257MaqFasUni, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AY6 )
         {
            brk8AY6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQESTOPTIONS' Routine */
      returnInSub = false ;
      AV49TFMaqEst = AV16SearchTxt ;
      AV50TFMaqEst_Sel = "" ;
      AV55Tmaqfaswwds_1_filterfulltext = AV48FilterFullText ;
      AV56Tmaqfaswwds_2_tfmaqcod = AV10TFMaqCod ;
      AV57Tmaqfaswwds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV58Tmaqfaswwds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV59Tmaqfaswwds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV60Tmaqfaswwds_6_tfmaqfasuni = AV14TFMaqFasUni ;
      AV61Tmaqfaswwds_7_tfmaqfasuni_sel = AV15TFMaqFasUni_Sel ;
      AV62Tmaqfaswwds_8_tfmaqest = AV49TFMaqEst ;
      AV63Tmaqfaswwds_9_tfmaqest_sel = AV50TFMaqEst_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV55Tmaqfaswwds_1_filterfulltext ,
                                           AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                           AV56Tmaqfaswwds_2_tfmaqcod ,
                                           AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                           AV58Tmaqfaswwds_4_tfmaqdsc ,
                                           AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                           AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                           AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                           AV62Tmaqfaswwds_8_tfmaqest ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1257MaqFasUni ,
                                           A607MaqEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV55Tmaqfaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Tmaqfaswwds_1_filterfulltext), "%", "") ;
      lV56Tmaqfaswwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV56Tmaqfaswwds_2_tfmaqcod), 6, "%") ;
      lV58Tmaqfaswwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV58Tmaqfaswwds_4_tfmaqdsc), 16, "%") ;
      lV60Tmaqfaswwds_6_tfmaqfasuni = GXutil.padr( GXutil.rtrim( AV60Tmaqfaswwds_6_tfmaqfasuni), 1, "%") ;
      lV62Tmaqfaswwds_8_tfmaqest = GXutil.padr( GXutil.rtrim( AV62Tmaqfaswwds_8_tfmaqest), 1, "%") ;
      /* Using cursor P08AY5 */
      pr_default.execute(3, new Object[] {lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV55Tmaqfaswwds_1_filterfulltext, lV56Tmaqfaswwds_2_tfmaqcod, AV57Tmaqfaswwds_3_tfmaqcod_sel, lV58Tmaqfaswwds_4_tfmaqdsc, AV59Tmaqfaswwds_5_tfmaqdsc_sel, lV60Tmaqfaswwds_6_tfmaqfasuni, AV61Tmaqfaswwds_7_tfmaqfasuni_sel, lV62Tmaqfaswwds_8_tfmaqest, AV63Tmaqfaswwds_9_tfmaqest_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8AY8 = false ;
         A607MaqEst = P08AY5_A607MaqEst[0] ;
         n607MaqEst = P08AY5_n607MaqEst[0] ;
         A1257MaqFasUni = P08AY5_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P08AY5_n1257MaqFasUni[0] ;
         A606MaqDsc = P08AY5_A606MaqDsc[0] ;
         n606MaqDsc = P08AY5_n606MaqDsc[0] ;
         A602MaqCod = P08AY5_A602MaqCod[0] ;
         A396EmprCod = P08AY5_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08AY5_A607MaqEst[0], A607MaqEst) == 0 ) )
         {
            brk8AY8 = false ;
            A602MaqCod = P08AY5_A602MaqCod[0] ;
            A396EmprCod = P08AY5_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AY8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A607MaqEst)==0) )
         {
            AV20Option = A607MaqEst ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A607MaqEst, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AY8 )
         {
            brk8AY8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmaqfaswwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tmaqfaswwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tmaqfaswwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV48FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      AV14TFMaqFasUni = "" ;
      AV15TFMaqFasUni_Sel = "" ;
      AV49TFMaqEst = "" ;
      AV50TFMaqEst_Sel = "" ;
      A602MaqCod = "" ;
      AV55Tmaqfaswwds_1_filterfulltext = "" ;
      AV56Tmaqfaswwds_2_tfmaqcod = "" ;
      AV57Tmaqfaswwds_3_tfmaqcod_sel = "" ;
      AV58Tmaqfaswwds_4_tfmaqdsc = "" ;
      AV59Tmaqfaswwds_5_tfmaqdsc_sel = "" ;
      AV60Tmaqfaswwds_6_tfmaqfasuni = "" ;
      AV61Tmaqfaswwds_7_tfmaqfasuni_sel = "" ;
      AV62Tmaqfaswwds_8_tfmaqest = "" ;
      AV63Tmaqfaswwds_9_tfmaqest_sel = "" ;
      scmdbuf = "" ;
      lV55Tmaqfaswwds_1_filterfulltext = "" ;
      lV56Tmaqfaswwds_2_tfmaqcod = "" ;
      lV58Tmaqfaswwds_4_tfmaqdsc = "" ;
      lV60Tmaqfaswwds_6_tfmaqfasuni = "" ;
      lV62Tmaqfaswwds_8_tfmaqest = "" ;
      A606MaqDsc = "" ;
      A1257MaqFasUni = "" ;
      A607MaqEst = "" ;
      P08AY2_A602MaqCod = new String[] {""} ;
      P08AY2_A607MaqEst = new String[] {""} ;
      P08AY2_n607MaqEst = new boolean[] {false} ;
      P08AY2_A1257MaqFasUni = new String[] {""} ;
      P08AY2_n1257MaqFasUni = new boolean[] {false} ;
      P08AY2_A606MaqDsc = new String[] {""} ;
      P08AY2_n606MaqDsc = new boolean[] {false} ;
      P08AY2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P08AY3_A606MaqDsc = new String[] {""} ;
      P08AY3_n606MaqDsc = new boolean[] {false} ;
      P08AY3_A607MaqEst = new String[] {""} ;
      P08AY3_n607MaqEst = new boolean[] {false} ;
      P08AY3_A1257MaqFasUni = new String[] {""} ;
      P08AY3_n1257MaqFasUni = new boolean[] {false} ;
      P08AY3_A602MaqCod = new String[] {""} ;
      P08AY3_A396EmprCod = new String[] {""} ;
      P08AY4_A1257MaqFasUni = new String[] {""} ;
      P08AY4_n1257MaqFasUni = new boolean[] {false} ;
      P08AY4_A607MaqEst = new String[] {""} ;
      P08AY4_n607MaqEst = new boolean[] {false} ;
      P08AY4_A606MaqDsc = new String[] {""} ;
      P08AY4_n606MaqDsc = new boolean[] {false} ;
      P08AY4_A602MaqCod = new String[] {""} ;
      P08AY4_A396EmprCod = new String[] {""} ;
      AV23OptionDesc = "" ;
      P08AY5_A607MaqEst = new String[] {""} ;
      P08AY5_n607MaqEst = new boolean[] {false} ;
      P08AY5_A1257MaqFasUni = new String[] {""} ;
      P08AY5_n1257MaqFasUni = new boolean[] {false} ;
      P08AY5_A606MaqDsc = new String[] {""} ;
      P08AY5_n606MaqDsc = new boolean[] {false} ;
      P08AY5_A602MaqCod = new String[] {""} ;
      P08AY5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqfaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08AY2_A602MaqCod, P08AY2_A607MaqEst, P08AY2_n607MaqEst, P08AY2_A1257MaqFasUni, P08AY2_n1257MaqFasUni, P08AY2_A606MaqDsc, P08AY2_n606MaqDsc, P08AY2_A396EmprCod
            }
            , new Object[] {
            P08AY3_A606MaqDsc, P08AY3_n606MaqDsc, P08AY3_A607MaqEst, P08AY3_n607MaqEst, P08AY3_A1257MaqFasUni, P08AY3_n1257MaqFasUni, P08AY3_A602MaqCod, P08AY3_A396EmprCod
            }
            , new Object[] {
            P08AY4_A1257MaqFasUni, P08AY4_n1257MaqFasUni, P08AY4_A607MaqEst, P08AY4_n607MaqEst, P08AY4_A606MaqDsc, P08AY4_n606MaqDsc, P08AY4_A602MaqCod, P08AY4_A396EmprCod
            }
            , new Object[] {
            P08AY5_A607MaqEst, P08AY5_n607MaqEst, P08AY5_A1257MaqFasUni, P08AY5_n1257MaqFasUni, P08AY5_A606MaqDsc, P08AY5_n606MaqDsc, P08AY5_A602MaqCod, P08AY5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV53GXV1 ;
   private long AV28count ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String AV14TFMaqFasUni ;
   private String AV15TFMaqFasUni_Sel ;
   private String AV49TFMaqEst ;
   private String AV50TFMaqEst_Sel ;
   private String A602MaqCod ;
   private String AV56Tmaqfaswwds_2_tfmaqcod ;
   private String AV57Tmaqfaswwds_3_tfmaqcod_sel ;
   private String AV58Tmaqfaswwds_4_tfmaqdsc ;
   private String AV59Tmaqfaswwds_5_tfmaqdsc_sel ;
   private String AV60Tmaqfaswwds_6_tfmaqfasuni ;
   private String AV61Tmaqfaswwds_7_tfmaqfasuni_sel ;
   private String AV62Tmaqfaswwds_8_tfmaqest ;
   private String AV63Tmaqfaswwds_9_tfmaqest_sel ;
   private String scmdbuf ;
   private String lV56Tmaqfaswwds_2_tfmaqcod ;
   private String lV58Tmaqfaswwds_4_tfmaqdsc ;
   private String lV60Tmaqfaswwds_6_tfmaqfasuni ;
   private String lV62Tmaqfaswwds_8_tfmaqest ;
   private String A606MaqDsc ;
   private String A1257MaqFasUni ;
   private String A607MaqEst ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8AY2 ;
   private boolean n607MaqEst ;
   private boolean n1257MaqFasUni ;
   private boolean n606MaqDsc ;
   private boolean brk8AY4 ;
   private boolean brk8AY6 ;
   private boolean brk8AY8 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV55Tmaqfaswwds_1_filterfulltext ;
   private String lV55Tmaqfaswwds_1_filterfulltext ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AY2_A602MaqCod ;
   private String[] P08AY2_A607MaqEst ;
   private boolean[] P08AY2_n607MaqEst ;
   private String[] P08AY2_A1257MaqFasUni ;
   private boolean[] P08AY2_n1257MaqFasUni ;
   private String[] P08AY2_A606MaqDsc ;
   private boolean[] P08AY2_n606MaqDsc ;
   private String[] P08AY2_A396EmprCod ;
   private String[] P08AY3_A606MaqDsc ;
   private boolean[] P08AY3_n606MaqDsc ;
   private String[] P08AY3_A607MaqEst ;
   private boolean[] P08AY3_n607MaqEst ;
   private String[] P08AY3_A1257MaqFasUni ;
   private boolean[] P08AY3_n1257MaqFasUni ;
   private String[] P08AY3_A602MaqCod ;
   private String[] P08AY3_A396EmprCod ;
   private String[] P08AY4_A1257MaqFasUni ;
   private boolean[] P08AY4_n1257MaqFasUni ;
   private String[] P08AY4_A607MaqEst ;
   private boolean[] P08AY4_n607MaqEst ;
   private String[] P08AY4_A606MaqDsc ;
   private boolean[] P08AY4_n606MaqDsc ;
   private String[] P08AY4_A602MaqCod ;
   private String[] P08AY4_A396EmprCod ;
   private String[] P08AY5_A607MaqEst ;
   private boolean[] P08AY5_n607MaqEst ;
   private String[] P08AY5_A1257MaqFasUni ;
   private boolean[] P08AY5_n1257MaqFasUni ;
   private String[] P08AY5_A606MaqDsc ;
   private boolean[] P08AY5_n606MaqDsc ;
   private String[] P08AY5_A602MaqCod ;
   private String[] P08AY5_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tmaqfaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Tmaqfaswwds_1_filterfulltext ,
                                          String AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                          String AV56Tmaqfaswwds_2_tfmaqcod ,
                                          String AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                          String AV58Tmaqfaswwds_4_tfmaqdsc ,
                                          String AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                          String AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                          String AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                          String AV62Tmaqfaswwds_8_tfmaqest ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1257MaqFasUni ,
                                          String A607MaqEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqCod, MaqEst, MaqFasUni, MaqDsc, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV55Tmaqfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)) or ( UPPER(MaqFasUni) like '%' || UPPER(?)) or ( UPPER(MaqEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Tmaqfaswwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Tmaqfaswwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaqfaswwds_6_tfmaqfasuni)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFasUni) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFasUni = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaqfaswwds_8_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(MaqEst = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08AY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Tmaqfaswwds_1_filterfulltext ,
                                          String AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                          String AV56Tmaqfaswwds_2_tfmaqcod ,
                                          String AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                          String AV58Tmaqfaswwds_4_tfmaqdsc ,
                                          String AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                          String AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                          String AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                          String AV62Tmaqfaswwds_8_tfmaqest ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1257MaqFasUni ,
                                          String A607MaqEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MaqDsc, MaqEst, MaqFasUni, MaqCod, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV55Tmaqfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)) or ( UPPER(MaqFasUni) like '%' || UPPER(?)) or ( UPPER(MaqEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Tmaqfaswwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Tmaqfaswwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaqfaswwds_6_tfmaqfasuni)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFasUni) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFasUni = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaqfaswwds_8_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(MaqEst = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08AY4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Tmaqfaswwds_1_filterfulltext ,
                                          String AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                          String AV56Tmaqfaswwds_2_tfmaqcod ,
                                          String AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                          String AV58Tmaqfaswwds_4_tfmaqdsc ,
                                          String AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                          String AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                          String AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                          String AV62Tmaqfaswwds_8_tfmaqest ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1257MaqFasUni ,
                                          String A607MaqEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MaqFasUni, MaqEst, MaqDsc, MaqCod, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV55Tmaqfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)) or ( UPPER(MaqFasUni) like '%' || UPPER(?)) or ( UPPER(MaqEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Tmaqfaswwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Tmaqfaswwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaqfaswwds_6_tfmaqfasuni)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFasUni) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFasUni = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaqfaswwds_8_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(MaqEst = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqFasUni" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08AY5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Tmaqfaswwds_1_filterfulltext ,
                                          String AV57Tmaqfaswwds_3_tfmaqcod_sel ,
                                          String AV56Tmaqfaswwds_2_tfmaqcod ,
                                          String AV59Tmaqfaswwds_5_tfmaqdsc_sel ,
                                          String AV58Tmaqfaswwds_4_tfmaqdsc ,
                                          String AV61Tmaqfaswwds_7_tfmaqfasuni_sel ,
                                          String AV60Tmaqfaswwds_6_tfmaqfasuni ,
                                          String AV63Tmaqfaswwds_9_tfmaqest_sel ,
                                          String AV62Tmaqfaswwds_8_tfmaqest ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1257MaqFasUni ,
                                          String A607MaqEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MaqEst, MaqFasUni, MaqDsc, MaqCod, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV55Tmaqfaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)) or ( UPPER(MaqFasUni) like '%' || UPPER(?)) or ( UPPER(MaqEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV56Tmaqfaswwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Tmaqfaswwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Tmaqfaswwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tmaqfaswwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) && ( ! (GXutil.strcmp("", AV60Tmaqfaswwds_6_tfmaqfasuni)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqFasUni) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Tmaqfaswwds_7_tfmaqfasuni_sel)==0) )
      {
         addWhere(sWhereString, "(MaqFasUni = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV62Tmaqfaswwds_8_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Tmaqfaswwds_9_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(MaqEst = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqEst" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P08AY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08AY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P08AY4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P08AY5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AY4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AY5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

