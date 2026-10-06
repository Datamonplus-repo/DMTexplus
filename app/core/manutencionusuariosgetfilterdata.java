package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class manutencionusuariosgetfilterdata extends GXProcedure
{
   public manutencionusuariosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( manutencionusuariosgetfilterdata.class ), "" );
   }

   public manutencionusuariosgetfilterdata( int remoteHandle ,
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
      manutencionusuariosgetfilterdata.this.aP5 = new String[] {""};
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
      manutencionusuariosgetfilterdata.this.AV29DDOName = aP0;
      manutencionusuariosgetfilterdata.this.AV30SearchTxt = aP1;
      manutencionusuariosgetfilterdata.this.AV31SearchTxtTo = aP2;
      manutencionusuariosgetfilterdata.this.aP3 = aP3;
      manutencionusuariosgetfilterdata.this.aP4 = aP4;
      manutencionusuariosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_USURNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADUSURNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_USUMAIL") == 0 )
      {
         /* Execute user subroutine: 'LOADUSUMAILOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_USURPRINT") == 0 )
      {
         /* Execute user subroutine: 'LOADUSURPRINTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_USURSOCKT") == 0 )
      {
         /* Execute user subroutine: 'LOADUSURSOCKTOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV19Options.toJSonString(false) ;
      AV33OptionsDescJson = AV21OptionsDesc.toJSonString(false) ;
      AV34OptionIndexesJson = AV22OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue("Core.ManutencionUsuariosGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Core.ManutencionUsuariosGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("Core.ManutencionUsuariosGridState"), null, null);
      }
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV40GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM") == 0 )
         {
            AV10TFUsurNom = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURNOM_SEL") == 0 )
         {
            AV11TFUsurNom_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL") == 0 )
         {
            AV13TFUsuMail = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSUMAIL_SEL") == 0 )
         {
            AV14TFUsuMail_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT") == 0 )
         {
            AV15TFUsurPrint = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURPRINT_SEL") == 0 )
         {
            AV16TFUsurPrint_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT") == 0 )
         {
            AV36TFUsurSockt = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUSURSOCKT_SEL") == 0 )
         {
            AV37TFUsurSockt_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADUSURNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFUsurNom = AV30SearchTxt ;
      AV11TFUsurNom_Sel = "" ;
      AV42Core_manutencionusuariosds_1_filterfulltext = AV35FilterFullText ;
      AV43Core_manutencionusuariosds_2_tfusurnom = AV10TFUsurNom ;
      AV44Core_manutencionusuariosds_3_tfusurnom_sel = AV11TFUsurNom_Sel ;
      AV45Core_manutencionusuariosds_4_tfusumail = AV13TFUsuMail ;
      AV46Core_manutencionusuariosds_5_tfusumail_sel = AV14TFUsuMail_Sel ;
      AV47Core_manutencionusuariosds_6_tfusurprint = AV15TFUsurPrint ;
      AV48Core_manutencionusuariosds_7_tfusurprint_sel = AV16TFUsurPrint_Sel ;
      AV49Core_manutencionusuariosds_8_tfusursockt = AV36TFUsurSockt ;
      AV50Core_manutencionusuariosds_9_tfusursockt_sel = AV37TFUsurSockt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV42Core_manutencionusuariosds_1_filterfulltext ,
                                           AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV43Core_manutencionusuariosds_2_tfusurnom ,
                                           AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV45Core_manutencionusuariosds_4_tfusumail ,
                                           AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV47Core_manutencionusuariosds_6_tfusurprint ,
                                           AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV49Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV43Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV43Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV45Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV45Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV47Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV47Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV49Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV49Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0AND2 */
      pr_default.execute(0, new Object[] {lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV43Core_manutencionusuariosds_2_tfusurnom, AV44Core_manutencionusuariosds_3_tfusurnom_sel, lV45Core_manutencionusuariosds_4_tfusumail, AV46Core_manutencionusuariosds_5_tfusumail_sel, lV47Core_manutencionusuariosds_6_tfusurprint, AV48Core_manutencionusuariosds_7_tfusurprint_sel, lV49Core_manutencionusuariosds_8_tfusursockt, AV50Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAND2 = false ;
         A854UsurNom = P0AND2_A854UsurNom[0] ;
         n854UsurNom = P0AND2_n854UsurNom[0] ;
         A14487UsurSockt = P0AND2_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AND2_n14487UsurSockt[0] ;
         A14415UsurPrint = P0AND2_A14415UsurPrint[0] ;
         n14415UsurPrint = P0AND2_n14415UsurPrint[0] ;
         A10513UsuMail = P0AND2_A10513UsuMail[0] ;
         A850UsurCod = P0AND2_A850UsurCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AND2_A854UsurNom[0], A854UsurNom) == 0 ) )
         {
            brkAND2 = false ;
            A850UsurCod = P0AND2_A850UsurCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brkAND2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A854UsurNom)==0) )
         {
            AV18Option = A854UsurNom ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAND2 )
         {
            brkAND2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADUSUMAILOPTIONS' Routine */
      returnInSub = false ;
      AV13TFUsuMail = AV30SearchTxt ;
      AV14TFUsuMail_Sel = "" ;
      AV42Core_manutencionusuariosds_1_filterfulltext = AV35FilterFullText ;
      AV43Core_manutencionusuariosds_2_tfusurnom = AV10TFUsurNom ;
      AV44Core_manutencionusuariosds_3_tfusurnom_sel = AV11TFUsurNom_Sel ;
      AV45Core_manutencionusuariosds_4_tfusumail = AV13TFUsuMail ;
      AV46Core_manutencionusuariosds_5_tfusumail_sel = AV14TFUsuMail_Sel ;
      AV47Core_manutencionusuariosds_6_tfusurprint = AV15TFUsurPrint ;
      AV48Core_manutencionusuariosds_7_tfusurprint_sel = AV16TFUsurPrint_Sel ;
      AV49Core_manutencionusuariosds_8_tfusursockt = AV36TFUsurSockt ;
      AV50Core_manutencionusuariosds_9_tfusursockt_sel = AV37TFUsurSockt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV42Core_manutencionusuariosds_1_filterfulltext ,
                                           AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV43Core_manutencionusuariosds_2_tfusurnom ,
                                           AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV45Core_manutencionusuariosds_4_tfusumail ,
                                           AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV47Core_manutencionusuariosds_6_tfusurprint ,
                                           AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV49Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV43Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV43Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV45Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV45Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV47Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV47Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV49Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV49Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0AND3 */
      pr_default.execute(1, new Object[] {lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV43Core_manutencionusuariosds_2_tfusurnom, AV44Core_manutencionusuariosds_3_tfusurnom_sel, lV45Core_manutencionusuariosds_4_tfusumail, AV46Core_manutencionusuariosds_5_tfusumail_sel, lV47Core_manutencionusuariosds_6_tfusurprint, AV48Core_manutencionusuariosds_7_tfusurprint_sel, lV49Core_manutencionusuariosds_8_tfusursockt, AV50Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAND4 = false ;
         A10513UsuMail = P0AND3_A10513UsuMail[0] ;
         A14487UsurSockt = P0AND3_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AND3_n14487UsurSockt[0] ;
         A14415UsurPrint = P0AND3_A14415UsurPrint[0] ;
         n14415UsurPrint = P0AND3_n14415UsurPrint[0] ;
         A854UsurNom = P0AND3_A854UsurNom[0] ;
         n854UsurNom = P0AND3_n854UsurNom[0] ;
         A850UsurCod = P0AND3_A850UsurCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AND3_A10513UsuMail[0], A10513UsuMail) == 0 ) )
         {
            brkAND4 = false ;
            A850UsurCod = P0AND3_A850UsurCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brkAND4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A10513UsuMail)==0) )
         {
            AV18Option = A10513UsuMail ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAND4 )
         {
            brkAND4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADUSURPRINTOPTIONS' Routine */
      returnInSub = false ;
      AV15TFUsurPrint = AV30SearchTxt ;
      AV16TFUsurPrint_Sel = "" ;
      AV42Core_manutencionusuariosds_1_filterfulltext = AV35FilterFullText ;
      AV43Core_manutencionusuariosds_2_tfusurnom = AV10TFUsurNom ;
      AV44Core_manutencionusuariosds_3_tfusurnom_sel = AV11TFUsurNom_Sel ;
      AV45Core_manutencionusuariosds_4_tfusumail = AV13TFUsuMail ;
      AV46Core_manutencionusuariosds_5_tfusumail_sel = AV14TFUsuMail_Sel ;
      AV47Core_manutencionusuariosds_6_tfusurprint = AV15TFUsurPrint ;
      AV48Core_manutencionusuariosds_7_tfusurprint_sel = AV16TFUsurPrint_Sel ;
      AV49Core_manutencionusuariosds_8_tfusursockt = AV36TFUsurSockt ;
      AV50Core_manutencionusuariosds_9_tfusursockt_sel = AV37TFUsurSockt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV42Core_manutencionusuariosds_1_filterfulltext ,
                                           AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV43Core_manutencionusuariosds_2_tfusurnom ,
                                           AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV45Core_manutencionusuariosds_4_tfusumail ,
                                           AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV47Core_manutencionusuariosds_6_tfusurprint ,
                                           AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV49Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV43Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV43Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV45Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV45Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV47Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV47Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV49Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV49Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0AND4 */
      pr_default.execute(2, new Object[] {lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV43Core_manutencionusuariosds_2_tfusurnom, AV44Core_manutencionusuariosds_3_tfusurnom_sel, lV45Core_manutencionusuariosds_4_tfusumail, AV46Core_manutencionusuariosds_5_tfusumail_sel, lV47Core_manutencionusuariosds_6_tfusurprint, AV48Core_manutencionusuariosds_7_tfusurprint_sel, lV49Core_manutencionusuariosds_8_tfusursockt, AV50Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAND6 = false ;
         A14415UsurPrint = P0AND4_A14415UsurPrint[0] ;
         n14415UsurPrint = P0AND4_n14415UsurPrint[0] ;
         A14487UsurSockt = P0AND4_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AND4_n14487UsurSockt[0] ;
         A10513UsuMail = P0AND4_A10513UsuMail[0] ;
         A854UsurNom = P0AND4_A854UsurNom[0] ;
         n854UsurNom = P0AND4_n854UsurNom[0] ;
         A850UsurCod = P0AND4_A850UsurCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AND4_A14415UsurPrint[0], A14415UsurPrint) == 0 ) )
         {
            brkAND6 = false ;
            A850UsurCod = P0AND4_A850UsurCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brkAND6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14415UsurPrint)==0) )
         {
            AV18Option = A14415UsurPrint ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAND6 )
         {
            brkAND6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADUSURSOCKTOPTIONS' Routine */
      returnInSub = false ;
      AV36TFUsurSockt = AV30SearchTxt ;
      AV37TFUsurSockt_Sel = "" ;
      AV42Core_manutencionusuariosds_1_filterfulltext = AV35FilterFullText ;
      AV43Core_manutencionusuariosds_2_tfusurnom = AV10TFUsurNom ;
      AV44Core_manutencionusuariosds_3_tfusurnom_sel = AV11TFUsurNom_Sel ;
      AV45Core_manutencionusuariosds_4_tfusumail = AV13TFUsuMail ;
      AV46Core_manutencionusuariosds_5_tfusumail_sel = AV14TFUsuMail_Sel ;
      AV47Core_manutencionusuariosds_6_tfusurprint = AV15TFUsurPrint ;
      AV48Core_manutencionusuariosds_7_tfusurprint_sel = AV16TFUsurPrint_Sel ;
      AV49Core_manutencionusuariosds_8_tfusursockt = AV36TFUsurSockt ;
      AV50Core_manutencionusuariosds_9_tfusursockt_sel = AV37TFUsurSockt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV42Core_manutencionusuariosds_1_filterfulltext ,
                                           AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                           AV43Core_manutencionusuariosds_2_tfusurnom ,
                                           AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                           AV45Core_manutencionusuariosds_4_tfusumail ,
                                           AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                           AV47Core_manutencionusuariosds_6_tfusurprint ,
                                           AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                           AV49Core_manutencionusuariosds_8_tfusursockt ,
                                           A854UsurNom ,
                                           A10513UsuMail ,
                                           A14415UsurPrint ,
                                           A14487UsurSockt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV42Core_manutencionusuariosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Core_manutencionusuariosds_1_filterfulltext), "%", "") ;
      lV43Core_manutencionusuariosds_2_tfusurnom = GXutil.padr( GXutil.rtrim( AV43Core_manutencionusuariosds_2_tfusurnom), 35, "%") ;
      lV45Core_manutencionusuariosds_4_tfusumail = GXutil.padr( GXutil.rtrim( AV45Core_manutencionusuariosds_4_tfusumail), 40, "%") ;
      lV47Core_manutencionusuariosds_6_tfusurprint = GXutil.concat( GXutil.rtrim( AV47Core_manutencionusuariosds_6_tfusurprint), "%", "") ;
      lV49Core_manutencionusuariosds_8_tfusursockt = GXutil.concat( GXutil.rtrim( AV49Core_manutencionusuariosds_8_tfusursockt), "%", "") ;
      /* Using cursor P0AND5 */
      pr_default.execute(3, new Object[] {lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV42Core_manutencionusuariosds_1_filterfulltext, lV43Core_manutencionusuariosds_2_tfusurnom, AV44Core_manutencionusuariosds_3_tfusurnom_sel, lV45Core_manutencionusuariosds_4_tfusumail, AV46Core_manutencionusuariosds_5_tfusumail_sel, lV47Core_manutencionusuariosds_6_tfusurprint, AV48Core_manutencionusuariosds_7_tfusurprint_sel, lV49Core_manutencionusuariosds_8_tfusursockt, AV50Core_manutencionusuariosds_9_tfusursockt_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAND8 = false ;
         A14487UsurSockt = P0AND5_A14487UsurSockt[0] ;
         n14487UsurSockt = P0AND5_n14487UsurSockt[0] ;
         A14415UsurPrint = P0AND5_A14415UsurPrint[0] ;
         n14415UsurPrint = P0AND5_n14415UsurPrint[0] ;
         A10513UsuMail = P0AND5_A10513UsuMail[0] ;
         A854UsurNom = P0AND5_A854UsurNom[0] ;
         n854UsurNom = P0AND5_n854UsurNom[0] ;
         A850UsurCod = P0AND5_A850UsurCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AND5_A14487UsurSockt[0], A14487UsurSockt) == 0 ) )
         {
            brkAND8 = false ;
            A850UsurCod = P0AND5_A850UsurCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brkAND8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14487UsurSockt)==0) )
         {
            AV18Option = A14487UsurSockt ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAND8 )
         {
            brkAND8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = manutencionusuariosgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = manutencionusuariosgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = manutencionusuariosgetfilterdata.this.AV34OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV34OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35FilterFullText = "" ;
      AV10TFUsurNom = "" ;
      AV11TFUsurNom_Sel = "" ;
      AV13TFUsuMail = "" ;
      AV14TFUsuMail_Sel = "" ;
      AV15TFUsurPrint = "" ;
      AV16TFUsurPrint_Sel = "" ;
      AV36TFUsurSockt = "" ;
      AV37TFUsurSockt_Sel = "" ;
      A854UsurNom = "" ;
      AV42Core_manutencionusuariosds_1_filterfulltext = "" ;
      AV43Core_manutencionusuariosds_2_tfusurnom = "" ;
      AV44Core_manutencionusuariosds_3_tfusurnom_sel = "" ;
      AV45Core_manutencionusuariosds_4_tfusumail = "" ;
      AV46Core_manutencionusuariosds_5_tfusumail_sel = "" ;
      AV47Core_manutencionusuariosds_6_tfusurprint = "" ;
      AV48Core_manutencionusuariosds_7_tfusurprint_sel = "" ;
      AV49Core_manutencionusuariosds_8_tfusursockt = "" ;
      AV50Core_manutencionusuariosds_9_tfusursockt_sel = "" ;
      scmdbuf = "" ;
      lV42Core_manutencionusuariosds_1_filterfulltext = "" ;
      lV43Core_manutencionusuariosds_2_tfusurnom = "" ;
      lV45Core_manutencionusuariosds_4_tfusumail = "" ;
      lV47Core_manutencionusuariosds_6_tfusurprint = "" ;
      lV49Core_manutencionusuariosds_8_tfusursockt = "" ;
      A10513UsuMail = "" ;
      A14415UsurPrint = "" ;
      A14487UsurSockt = "" ;
      P0AND2_A854UsurNom = new String[] {""} ;
      P0AND2_n854UsurNom = new boolean[] {false} ;
      P0AND2_A14487UsurSockt = new String[] {""} ;
      P0AND2_n14487UsurSockt = new boolean[] {false} ;
      P0AND2_A14415UsurPrint = new String[] {""} ;
      P0AND2_n14415UsurPrint = new boolean[] {false} ;
      P0AND2_A10513UsuMail = new String[] {""} ;
      P0AND2_A850UsurCod = new String[] {""} ;
      A850UsurCod = "" ;
      AV18Option = "" ;
      P0AND3_A10513UsuMail = new String[] {""} ;
      P0AND3_A14487UsurSockt = new String[] {""} ;
      P0AND3_n14487UsurSockt = new boolean[] {false} ;
      P0AND3_A14415UsurPrint = new String[] {""} ;
      P0AND3_n14415UsurPrint = new boolean[] {false} ;
      P0AND3_A854UsurNom = new String[] {""} ;
      P0AND3_n854UsurNom = new boolean[] {false} ;
      P0AND3_A850UsurCod = new String[] {""} ;
      P0AND4_A14415UsurPrint = new String[] {""} ;
      P0AND4_n14415UsurPrint = new boolean[] {false} ;
      P0AND4_A14487UsurSockt = new String[] {""} ;
      P0AND4_n14487UsurSockt = new boolean[] {false} ;
      P0AND4_A10513UsuMail = new String[] {""} ;
      P0AND4_A854UsurNom = new String[] {""} ;
      P0AND4_n854UsurNom = new boolean[] {false} ;
      P0AND4_A850UsurCod = new String[] {""} ;
      P0AND5_A14487UsurSockt = new String[] {""} ;
      P0AND5_n14487UsurSockt = new boolean[] {false} ;
      P0AND5_A14415UsurPrint = new String[] {""} ;
      P0AND5_n14415UsurPrint = new boolean[] {false} ;
      P0AND5_A10513UsuMail = new String[] {""} ;
      P0AND5_A854UsurNom = new String[] {""} ;
      P0AND5_n854UsurNom = new boolean[] {false} ;
      P0AND5_A850UsurCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.manutencionusuariosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AND2_A854UsurNom, P0AND2_n854UsurNom, P0AND2_A14487UsurSockt, P0AND2_n14487UsurSockt, P0AND2_A14415UsurPrint, P0AND2_n14415UsurPrint, P0AND2_A10513UsuMail, P0AND2_A850UsurCod
            }
            , new Object[] {
            P0AND3_A10513UsuMail, P0AND3_A14487UsurSockt, P0AND3_n14487UsurSockt, P0AND3_A14415UsurPrint, P0AND3_n14415UsurPrint, P0AND3_A854UsurNom, P0AND3_n854UsurNom, P0AND3_A850UsurCod
            }
            , new Object[] {
            P0AND4_A14415UsurPrint, P0AND4_n14415UsurPrint, P0AND4_A14487UsurSockt, P0AND4_n14487UsurSockt, P0AND4_A10513UsuMail, P0AND4_A854UsurNom, P0AND4_n854UsurNom, P0AND4_A850UsurCod
            }
            , new Object[] {
            P0AND5_A14487UsurSockt, P0AND5_n14487UsurSockt, P0AND5_A14415UsurPrint, P0AND5_n14415UsurPrint, P0AND5_A10513UsuMail, P0AND5_A854UsurNom, P0AND5_n854UsurNom, P0AND5_A850UsurCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV40GXV1 ;
   private long AV23count ;
   private String AV10TFUsurNom ;
   private String AV11TFUsurNom_Sel ;
   private String AV13TFUsuMail ;
   private String AV14TFUsuMail_Sel ;
   private String A854UsurNom ;
   private String AV43Core_manutencionusuariosds_2_tfusurnom ;
   private String AV44Core_manutencionusuariosds_3_tfusurnom_sel ;
   private String AV45Core_manutencionusuariosds_4_tfusumail ;
   private String AV46Core_manutencionusuariosds_5_tfusumail_sel ;
   private String scmdbuf ;
   private String lV43Core_manutencionusuariosds_2_tfusurnom ;
   private String lV45Core_manutencionusuariosds_4_tfusumail ;
   private String A10513UsuMail ;
   private String A850UsurCod ;
   private boolean returnInSub ;
   private boolean brkAND2 ;
   private boolean n854UsurNom ;
   private boolean n14487UsurSockt ;
   private boolean n14415UsurPrint ;
   private boolean brkAND4 ;
   private boolean brkAND6 ;
   private boolean brkAND8 ;
   private String AV32OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV34OptionIndexesJson ;
   private String AV29DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV35FilterFullText ;
   private String AV15TFUsurPrint ;
   private String AV16TFUsurPrint_Sel ;
   private String AV36TFUsurSockt ;
   private String AV37TFUsurSockt_Sel ;
   private String AV42Core_manutencionusuariosds_1_filterfulltext ;
   private String AV47Core_manutencionusuariosds_6_tfusurprint ;
   private String AV48Core_manutencionusuariosds_7_tfusurprint_sel ;
   private String AV49Core_manutencionusuariosds_8_tfusursockt ;
   private String AV50Core_manutencionusuariosds_9_tfusursockt_sel ;
   private String lV42Core_manutencionusuariosds_1_filterfulltext ;
   private String lV47Core_manutencionusuariosds_6_tfusurprint ;
   private String lV49Core_manutencionusuariosds_8_tfusursockt ;
   private String A14415UsurPrint ;
   private String A14487UsurSockt ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AND2_A854UsurNom ;
   private boolean[] P0AND2_n854UsurNom ;
   private String[] P0AND2_A14487UsurSockt ;
   private boolean[] P0AND2_n14487UsurSockt ;
   private String[] P0AND2_A14415UsurPrint ;
   private boolean[] P0AND2_n14415UsurPrint ;
   private String[] P0AND2_A10513UsuMail ;
   private String[] P0AND2_A850UsurCod ;
   private String[] P0AND3_A10513UsuMail ;
   private String[] P0AND3_A14487UsurSockt ;
   private boolean[] P0AND3_n14487UsurSockt ;
   private String[] P0AND3_A14415UsurPrint ;
   private boolean[] P0AND3_n14415UsurPrint ;
   private String[] P0AND3_A854UsurNom ;
   private boolean[] P0AND3_n854UsurNom ;
   private String[] P0AND3_A850UsurCod ;
   private String[] P0AND4_A14415UsurPrint ;
   private boolean[] P0AND4_n14415UsurPrint ;
   private String[] P0AND4_A14487UsurSockt ;
   private boolean[] P0AND4_n14487UsurSockt ;
   private String[] P0AND4_A10513UsuMail ;
   private String[] P0AND4_A854UsurNom ;
   private boolean[] P0AND4_n854UsurNom ;
   private String[] P0AND4_A850UsurCod ;
   private String[] P0AND5_A14487UsurSockt ;
   private boolean[] P0AND5_n14487UsurSockt ;
   private String[] P0AND5_A14415UsurPrint ;
   private boolean[] P0AND5_n14415UsurPrint ;
   private String[] P0AND5_A10513UsuMail ;
   private String[] P0AND5_A854UsurNom ;
   private boolean[] P0AND5_n854UsurNom ;
   private String[] P0AND5_A850UsurCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV21OptionsDesc ;
   private GXSimpleCollection<String> AV22OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
}

final  class manutencionusuariosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AND2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV43Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV45Core_manutencionusuariosds_4_tfusumail ,
                                          String AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV47Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV49Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT UsurNom, UsurSockt, UsurPrint, UsuMail, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV42Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV45Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UsurNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AND3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV43Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV45Core_manutencionusuariosds_4_tfusumail ,
                                          String AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV47Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV49Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT UsuMail, UsurSockt, UsurPrint, UsurNom, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV42Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV45Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UsuMail" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AND4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV43Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV45Core_manutencionusuariosds_4_tfusumail ,
                                          String AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV47Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV49Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT UsurPrint, UsurSockt, UsuMail, UsurNom, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV42Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV45Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UsurPrint" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AND5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Core_manutencionusuariosds_1_filterfulltext ,
                                          String AV44Core_manutencionusuariosds_3_tfusurnom_sel ,
                                          String AV43Core_manutencionusuariosds_2_tfusurnom ,
                                          String AV46Core_manutencionusuariosds_5_tfusumail_sel ,
                                          String AV45Core_manutencionusuariosds_4_tfusumail ,
                                          String AV48Core_manutencionusuariosds_7_tfusurprint_sel ,
                                          String AV47Core_manutencionusuariosds_6_tfusurprint ,
                                          String AV50Core_manutencionusuariosds_9_tfusursockt_sel ,
                                          String AV49Core_manutencionusuariosds_8_tfusursockt ,
                                          String A854UsurNom ,
                                          String A10513UsuMail ,
                                          String A14415UsurPrint ,
                                          String A14487UsurSockt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT UsurSockt, UsurPrint, UsuMail, UsurNom, UsurCod FROM TXPUSUARI" ;
      if ( ! (GXutil.strcmp("", AV42Core_manutencionusuariosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UsurNom) like '%' || UPPER(?)) or ( UPPER(UsuMail) like '%' || UPPER(?)) or ( UPPER(UsurPrint) like '%' || UPPER(?)) or ( UPPER(UsurSockt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Core_manutencionusuariosds_2_tfusurnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Core_manutencionusuariosds_3_tfusurnom_sel)==0) )
      {
         addWhere(sWhereString, "(UsurNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) && ( ! (GXutil.strcmp("", AV45Core_manutencionusuariosds_4_tfusumail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsuMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Core_manutencionusuariosds_5_tfusumail_sel)==0) )
      {
         addWhere(sWhereString, "(UsuMail = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) && ( ! (GXutil.strcmp("", AV47Core_manutencionusuariosds_6_tfusurprint)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurPrint) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Core_manutencionusuariosds_7_tfusurprint_sel)==0) )
      {
         addWhere(sWhereString, "(UsurPrint = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) && ( ! (GXutil.strcmp("", AV49Core_manutencionusuariosds_8_tfusursockt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UsurSockt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Core_manutencionusuariosds_9_tfusursockt_sel)==0) )
      {
         addWhere(sWhereString, "(UsurSockt = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UsurSockt" ;
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
                  return conditional_P0AND2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P0AND3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P0AND4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P0AND5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AND2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AND3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AND4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AND5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
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
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
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
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
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
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
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
                  stmt.setString(sIdx, (String)parms[16], 35);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 35);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 150);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 150);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               return;
      }
   }

}

