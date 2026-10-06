package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticpwwgetfilterdata extends GXProcedure
{
   public tarticpwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticpwwgetfilterdata.class ), "" );
   }

   public tarticpwwgetfilterdata( int remoteHandle ,
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
      tarticpwwgetfilterdata.this.aP5 = new String[] {""};
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
      tarticpwwgetfilterdata.this.AV20DDOName = aP0;
      tarticpwwgetfilterdata.this.AV18SearchTxt = aP1;
      tarticpwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      tarticpwwgetfilterdata.this.aP3 = aP3;
      tarticpwwgetfilterdata.this.aP4 = aP4;
      tarticpwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("TARTICPWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TARTICPWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TARTICPWWGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV16TFArtDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV17TFArtDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV18SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV52Tarticpwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tarticpwwds_2_tfclinom = AV12TFCliNom ;
      AV54Tarticpwwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV55Tarticpwwds_4_tfclicod = AV10TFCliCod ;
      AV56Tarticpwwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV57Tarticpwwds_6_tfartcod = AV14TFArtCod ;
      AV58Tarticpwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV59Tarticpwwds_8_tfartdsc = AV16TFArtDsc ;
      AV60Tarticpwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Tarticpwwds_1_filterfulltext ,
                                           AV54Tarticpwwds_3_tfclinom_sel ,
                                           AV53Tarticpwwds_2_tfclinom ,
                                           Integer.valueOf(AV55Tarticpwwds_4_tfclicod) ,
                                           Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to) ,
                                           AV58Tarticpwwds_7_tfartcod_sel ,
                                           AV57Tarticpwwds_6_tfartcod ,
                                           AV60Tarticpwwds_9_tfartdsc_sel ,
                                           AV59Tarticpwwds_8_tfartdsc ,
                                           A279CliNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A69ArtDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV53Tarticpwwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV53Tarticpwwds_2_tfclinom), 30, "%") ;
      lV57Tarticpwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV57Tarticpwwds_6_tfartcod), 16, "%") ;
      lV59Tarticpwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV59Tarticpwwds_8_tfartdsc), 26, "%") ;
      /* Using cursor P083G2 */
      pr_default.execute(0, new Object[] {lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV53Tarticpwwds_2_tfclinom, AV54Tarticpwwds_3_tfclinom_sel, Integer.valueOf(AV55Tarticpwwds_4_tfclicod), Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to), lV57Tarticpwwds_6_tfartcod, AV58Tarticpwwds_7_tfartcod_sel, lV59Tarticpwwds_8_tfartdsc, AV60Tarticpwwds_9_tfartdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk83G2 = false ;
         A396EmprCod = P083G2_A396EmprCod[0] ;
         A279CliNom = P083G2_A279CliNom[0] ;
         A69ArtDsc = P083G2_A69ArtDsc[0] ;
         n69ArtDsc = P083G2_n69ArtDsc[0] ;
         A65ArtCod = P083G2_A65ArtCod[0] ;
         A252CliCod = P083G2_A252CliCod[0] ;
         A279CliNom = P083G2_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P083G2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk83G2 = false ;
            A396EmprCod = P083G2_A396EmprCod[0] ;
            A65ArtCod = P083G2_A65ArtCod[0] ;
            A252CliCod = P083G2_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk83G2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV22Option = A279CliNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83G2 )
         {
            brk83G2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV18SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV52Tarticpwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tarticpwwds_2_tfclinom = AV12TFCliNom ;
      AV54Tarticpwwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV55Tarticpwwds_4_tfclicod = AV10TFCliCod ;
      AV56Tarticpwwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV57Tarticpwwds_6_tfartcod = AV14TFArtCod ;
      AV58Tarticpwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV59Tarticpwwds_8_tfartdsc = AV16TFArtDsc ;
      AV60Tarticpwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Tarticpwwds_1_filterfulltext ,
                                           AV54Tarticpwwds_3_tfclinom_sel ,
                                           AV53Tarticpwwds_2_tfclinom ,
                                           Integer.valueOf(AV55Tarticpwwds_4_tfclicod) ,
                                           Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to) ,
                                           AV58Tarticpwwds_7_tfartcod_sel ,
                                           AV57Tarticpwwds_6_tfartcod ,
                                           AV60Tarticpwwds_9_tfartdsc_sel ,
                                           AV59Tarticpwwds_8_tfartdsc ,
                                           A279CliNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A69ArtDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV53Tarticpwwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV53Tarticpwwds_2_tfclinom), 30, "%") ;
      lV57Tarticpwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV57Tarticpwwds_6_tfartcod), 16, "%") ;
      lV59Tarticpwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV59Tarticpwwds_8_tfartdsc), 26, "%") ;
      /* Using cursor P083G3 */
      pr_default.execute(1, new Object[] {lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV53Tarticpwwds_2_tfclinom, AV54Tarticpwwds_3_tfclinom_sel, Integer.valueOf(AV55Tarticpwwds_4_tfclicod), Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to), lV57Tarticpwwds_6_tfartcod, AV58Tarticpwwds_7_tfartcod_sel, lV59Tarticpwwds_8_tfartdsc, AV60Tarticpwwds_9_tfartdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk83G4 = false ;
         A396EmprCod = P083G3_A396EmprCod[0] ;
         A65ArtCod = P083G3_A65ArtCod[0] ;
         A69ArtDsc = P083G3_A69ArtDsc[0] ;
         n69ArtDsc = P083G3_n69ArtDsc[0] ;
         A252CliCod = P083G3_A252CliCod[0] ;
         A279CliNom = P083G3_A279CliNom[0] ;
         A279CliNom = P083G3_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P083G3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brk83G4 = false ;
            A396EmprCod = P083G3_A396EmprCod[0] ;
            A252CliCod = P083G3_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk83G4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV22Option = A65ArtCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83G4 )
         {
            brk83G4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFArtDsc = AV18SearchTxt ;
      AV17TFArtDsc_Sel = "" ;
      AV52Tarticpwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Tarticpwwds_2_tfclinom = AV12TFCliNom ;
      AV54Tarticpwwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV55Tarticpwwds_4_tfclicod = AV10TFCliCod ;
      AV56Tarticpwwds_5_tfclicod_to = AV11TFCliCod_To ;
      AV57Tarticpwwds_6_tfartcod = AV14TFArtCod ;
      AV58Tarticpwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV59Tarticpwwds_8_tfartdsc = AV16TFArtDsc ;
      AV60Tarticpwwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Tarticpwwds_1_filterfulltext ,
                                           AV54Tarticpwwds_3_tfclinom_sel ,
                                           AV53Tarticpwwds_2_tfclinom ,
                                           Integer.valueOf(AV55Tarticpwwds_4_tfclicod) ,
                                           Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to) ,
                                           AV58Tarticpwwds_7_tfartcod_sel ,
                                           AV57Tarticpwwds_6_tfartcod ,
                                           AV60Tarticpwwds_9_tfartdsc_sel ,
                                           AV59Tarticpwwds_8_tfartdsc ,
                                           A279CliNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           A69ArtDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV52Tarticpwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Tarticpwwds_1_filterfulltext), "%", "") ;
      lV53Tarticpwwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV53Tarticpwwds_2_tfclinom), 30, "%") ;
      lV57Tarticpwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV57Tarticpwwds_6_tfartcod), 16, "%") ;
      lV59Tarticpwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV59Tarticpwwds_8_tfartdsc), 26, "%") ;
      /* Using cursor P083G4 */
      pr_default.execute(2, new Object[] {lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV52Tarticpwwds_1_filterfulltext, lV53Tarticpwwds_2_tfclinom, AV54Tarticpwwds_3_tfclinom_sel, Integer.valueOf(AV55Tarticpwwds_4_tfclicod), Integer.valueOf(AV56Tarticpwwds_5_tfclicod_to), lV57Tarticpwwds_6_tfartcod, AV58Tarticpwwds_7_tfartcod_sel, lV59Tarticpwwds_8_tfartdsc, AV60Tarticpwwds_9_tfartdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk83G6 = false ;
         A396EmprCod = P083G4_A396EmprCod[0] ;
         A69ArtDsc = P083G4_A69ArtDsc[0] ;
         n69ArtDsc = P083G4_n69ArtDsc[0] ;
         A65ArtCod = P083G4_A65ArtCod[0] ;
         A252CliCod = P083G4_A252CliCod[0] ;
         A279CliNom = P083G4_A279CliNom[0] ;
         A279CliNom = P083G4_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P083G4_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brk83G6 = false ;
            A396EmprCod = P083G4_A396EmprCod[0] ;
            A65ArtCod = P083G4_A65ArtCod[0] ;
            A252CliCod = P083G4_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk83G6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV22Option = A69ArtDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83G6 )
         {
            brk83G6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tarticpwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = tarticpwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = tarticpwwgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFArtDsc = "" ;
      AV17TFArtDsc_Sel = "" ;
      A279CliNom = "" ;
      AV52Tarticpwwds_1_filterfulltext = "" ;
      AV53Tarticpwwds_2_tfclinom = "" ;
      AV54Tarticpwwds_3_tfclinom_sel = "" ;
      AV57Tarticpwwds_6_tfartcod = "" ;
      AV58Tarticpwwds_7_tfartcod_sel = "" ;
      AV59Tarticpwwds_8_tfartdsc = "" ;
      AV60Tarticpwwds_9_tfartdsc_sel = "" ;
      scmdbuf = "" ;
      lV52Tarticpwwds_1_filterfulltext = "" ;
      lV53Tarticpwwds_2_tfclinom = "" ;
      lV57Tarticpwwds_6_tfartcod = "" ;
      lV59Tarticpwwds_8_tfartdsc = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      P083G2_A396EmprCod = new String[] {""} ;
      P083G2_A279CliNom = new String[] {""} ;
      P083G2_A69ArtDsc = new String[] {""} ;
      P083G2_n69ArtDsc = new boolean[] {false} ;
      P083G2_A65ArtCod = new String[] {""} ;
      P083G2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P083G3_A396EmprCod = new String[] {""} ;
      P083G3_A65ArtCod = new String[] {""} ;
      P083G3_A69ArtDsc = new String[] {""} ;
      P083G3_n69ArtDsc = new boolean[] {false} ;
      P083G3_A252CliCod = new int[1] ;
      P083G3_A279CliNom = new String[] {""} ;
      P083G4_A396EmprCod = new String[] {""} ;
      P083G4_A69ArtDsc = new String[] {""} ;
      P083G4_n69ArtDsc = new boolean[] {false} ;
      P083G4_A65ArtCod = new String[] {""} ;
      P083G4_A252CliCod = new int[1] ;
      P083G4_A279CliNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticpwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P083G2_A396EmprCod, P083G2_A279CliNom, P083G2_A69ArtDsc, P083G2_n69ArtDsc, P083G2_A65ArtCod, P083G2_A252CliCod
            }
            , new Object[] {
            P083G3_A396EmprCod, P083G3_A65ArtCod, P083G3_A69ArtDsc, P083G3_n69ArtDsc, P083G3_A252CliCod, P083G3_A279CliNom
            }
            , new Object[] {
            P083G4_A396EmprCod, P083G4_A69ArtDsc, P083G4_n69ArtDsc, P083G4_A65ArtCod, P083G4_A252CliCod, P083G4_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV55Tarticpwwds_4_tfclicod ;
   private int AV56Tarticpwwds_5_tfclicod_to ;
   private int A252CliCod ;
   private long AV30count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFArtDsc ;
   private String AV17TFArtDsc_Sel ;
   private String A279CliNom ;
   private String AV53Tarticpwwds_2_tfclinom ;
   private String AV54Tarticpwwds_3_tfclinom_sel ;
   private String AV57Tarticpwwds_6_tfartcod ;
   private String AV58Tarticpwwds_7_tfartcod_sel ;
   private String AV59Tarticpwwds_8_tfartdsc ;
   private String AV60Tarticpwwds_9_tfartdsc_sel ;
   private String scmdbuf ;
   private String lV53Tarticpwwds_2_tfclinom ;
   private String lV57Tarticpwwds_6_tfartcod ;
   private String lV59Tarticpwwds_8_tfartdsc ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk83G2 ;
   private boolean n69ArtDsc ;
   private boolean brk83G4 ;
   private boolean brk83G6 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV52Tarticpwwds_1_filterfulltext ;
   private String lV52Tarticpwwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P083G2_A396EmprCod ;
   private String[] P083G2_A279CliNom ;
   private String[] P083G2_A69ArtDsc ;
   private boolean[] P083G2_n69ArtDsc ;
   private String[] P083G2_A65ArtCod ;
   private int[] P083G2_A252CliCod ;
   private String[] P083G3_A396EmprCod ;
   private String[] P083G3_A65ArtCod ;
   private String[] P083G3_A69ArtDsc ;
   private boolean[] P083G3_n69ArtDsc ;
   private int[] P083G3_A252CliCod ;
   private String[] P083G3_A279CliNom ;
   private String[] P083G4_A396EmprCod ;
   private String[] P083G4_A69ArtDsc ;
   private boolean[] P083G4_n69ArtDsc ;
   private String[] P083G4_A65ArtCod ;
   private int[] P083G4_A252CliCod ;
   private String[] P083G4_A279CliNom ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tarticpwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P083G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tarticpwwds_1_filterfulltext ,
                                          String AV54Tarticpwwds_3_tfclinom_sel ,
                                          String AV53Tarticpwwds_2_tfclinom ,
                                          int AV55Tarticpwwds_4_tfclicod ,
                                          int AV56Tarticpwwds_5_tfclicod_to ,
                                          String AV58Tarticpwwds_7_tfartcod_sel ,
                                          String AV57Tarticpwwds_6_tfartcod ,
                                          String AV60Tarticpwwds_9_tfartdsc_sel ,
                                          String AV59Tarticpwwds_8_tfartdsc ,
                                          String A279CliNom ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A69ArtDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.ArtDsc, T1.ArtCod, T1.CliCod FROM (TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV52Tarticpwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV53Tarticpwwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV55Tarticpwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Tarticpwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Tarticpwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticpwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P083G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tarticpwwds_1_filterfulltext ,
                                          String AV54Tarticpwwds_3_tfclinom_sel ,
                                          String AV53Tarticpwwds_2_tfclinom ,
                                          int AV55Tarticpwwds_4_tfclicod ,
                                          int AV56Tarticpwwds_5_tfclicod_to ,
                                          String AV58Tarticpwwds_7_tfartcod_sel ,
                                          String AV57Tarticpwwds_6_tfartcod ,
                                          String AV60Tarticpwwds_9_tfartdsc_sel ,
                                          String AV59Tarticpwwds_8_tfartdsc ,
                                          String A279CliNom ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A69ArtDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtCod, T1.ArtDsc, T1.CliCod, T2.CliNom FROM (TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV52Tarticpwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV53Tarticpwwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV55Tarticpwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Tarticpwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Tarticpwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticpwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P083G4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Tarticpwwds_1_filterfulltext ,
                                          String AV54Tarticpwwds_3_tfclinom_sel ,
                                          String AV53Tarticpwwds_2_tfclinom ,
                                          int AV55Tarticpwwds_4_tfclicod ,
                                          int AV56Tarticpwwds_5_tfclicod_to ,
                                          String AV58Tarticpwwds_7_tfartcod_sel ,
                                          String AV57Tarticpwwds_6_tfartcod ,
                                          String AV60Tarticpwwds_9_tfartdsc_sel ,
                                          String AV59Tarticpwwds_8_tfartdsc ,
                                          String A279CliNom ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          String A69ArtDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtDsc, T1.ArtCod, T1.CliCod, T2.CliNom FROM (TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV52Tarticpwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV53Tarticpwwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tarticpwwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV55Tarticpwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV56Tarticpwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Tarticpwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Tarticpwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Tarticpwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Tarticpwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtDsc" ;
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
                  return conditional_P083G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P083G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P083G4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P083G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P083G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P083G4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
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
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
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
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               return;
      }
   }

}

