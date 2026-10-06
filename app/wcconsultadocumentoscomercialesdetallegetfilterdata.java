package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesdetallegetfilterdata extends GXProcedure
{
   public wcconsultadocumentoscomercialesdetallegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadocumentoscomercialesdetallegetfilterdata.class ), "" );
   }

   public wcconsultadocumentoscomercialesdetallegetfilterdata( int remoteHandle ,
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
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV32DDOName = aP0;
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV30SearchTxt = aP1;
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV31SearchTxtTo = aP2;
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.aP3 = aP3;
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.aP4 = aP4;
      wcconsultadocumentoscomercialesdetallegetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMNREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMNREFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMVDOC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMVDOCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMART") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMARTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMARTD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMARTDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMCOL") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMCOLOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBCOMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOMDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("WCConsultaDocumentosComercialesDetalleGridState"), null, null);
      }
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV49TFAlbComLin = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFAlbComLin_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF") == 0 )
         {
            AV51TFAlbComNRef = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF_SEL") == 0 )
         {
            AV52TFAlbComNRef_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC") == 0 )
         {
            AV53TFAlbComVDoc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC_SEL") == 0 )
         {
            AV54TFAlbComVDoc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPZAS") == 0 )
         {
            AV55TFAlbComPzas = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFAlbComPzas_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMTS") == 0 )
         {
            AV57TFAlbComMts = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFAlbComMts_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART") == 0 )
         {
            AV59TFAlbComArt = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART_SEL") == 0 )
         {
            AV60TFAlbComArt_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD") == 0 )
         {
            AV61TFAlbComArtD = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD_SEL") == 0 )
         {
            AV62TFAlbComArtD_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL") == 0 )
         {
            AV63TFAlbComCol = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL_SEL") == 0 )
         {
            AV64TFAlbComCol_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMKGS") == 0 )
         {
            AV65TFAlbComKgs = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFAlbComKgs_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV67TFAlbComDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV68TFAlbComDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD") == 0 )
         {
            AV70AlbComCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBCOMNREFOPTIONS' Routine */
      returnInSub = false ;
      AV51TFAlbComNRef = AV30SearchTxt ;
      AV52TFAlbComNRef_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V2 */
      pr_default.execute(0, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk90V2 = false ;
         A396EmprCod = P090V2_A396EmprCod[0] ;
         A14AlbComCod = P090V2_A14AlbComCod[0] ;
         A13315AlbComNRef = P090V2_A13315AlbComNRef[0] ;
         A15AlbComDsc = P090V2_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V2_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090V2_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090V2_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090V2_A13320AlbComArt[0] ;
         A13318AlbComMts = P090V2_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V2_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090V2_A13316AlbComVDoc[0] ;
         A20AlbComLin = P090V2_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P090V2_A13315AlbComNRef[0], A13315AlbComNRef) == 0 ) )
         {
            brk90V2 = false ;
            A396EmprCod = P090V2_A396EmprCod[0] ;
            A14AlbComCod = P090V2_A14AlbComCod[0] ;
            A20AlbComLin = P090V2_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13315AlbComNRef)==0) )
         {
            AV34Option = A13315AlbComNRef ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V2 )
         {
            brk90V2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBCOMVDOCOPTIONS' Routine */
      returnInSub = false ;
      AV53TFAlbComVDoc = AV30SearchTxt ;
      AV54TFAlbComVDoc_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V3 */
      pr_default.execute(1, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk90V4 = false ;
         A396EmprCod = P090V3_A396EmprCod[0] ;
         A14AlbComCod = P090V3_A14AlbComCod[0] ;
         A13316AlbComVDoc = P090V3_A13316AlbComVDoc[0] ;
         A15AlbComDsc = P090V3_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V3_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090V3_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090V3_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090V3_A13320AlbComArt[0] ;
         A13318AlbComMts = P090V3_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V3_A13317AlbComPzas[0] ;
         A13315AlbComNRef = P090V3_A13315AlbComNRef[0] ;
         A20AlbComLin = P090V3_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P090V3_A13316AlbComVDoc[0], A13316AlbComVDoc) == 0 ) )
         {
            brk90V4 = false ;
            A396EmprCod = P090V3_A396EmprCod[0] ;
            A14AlbComCod = P090V3_A14AlbComCod[0] ;
            A20AlbComLin = P090V3_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13316AlbComVDoc)==0) )
         {
            AV34Option = A13316AlbComVDoc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V4 )
         {
            brk90V4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOMARTOPTIONS' Routine */
      returnInSub = false ;
      AV59TFAlbComArt = AV30SearchTxt ;
      AV60TFAlbComArt_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V4 */
      pr_default.execute(2, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk90V6 = false ;
         A396EmprCod = P090V4_A396EmprCod[0] ;
         A14AlbComCod = P090V4_A14AlbComCod[0] ;
         A13320AlbComArt = P090V4_A13320AlbComArt[0] ;
         A15AlbComDsc = P090V4_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V4_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090V4_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090V4_A13321AlbComArtD[0] ;
         A13318AlbComMts = P090V4_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V4_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090V4_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090V4_A13315AlbComNRef[0] ;
         A20AlbComLin = P090V4_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P090V4_A13320AlbComArt[0], A13320AlbComArt) == 0 ) )
         {
            brk90V6 = false ;
            A396EmprCod = P090V4_A396EmprCod[0] ;
            A14AlbComCod = P090V4_A14AlbComCod[0] ;
            A20AlbComLin = P090V4_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A13320AlbComArt)==0) )
         {
            AV34Option = A13320AlbComArt ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V6 )
         {
            brk90V6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBCOMARTDOPTIONS' Routine */
      returnInSub = false ;
      AV61TFAlbComArtD = AV30SearchTxt ;
      AV62TFAlbComArtD_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V5 */
      pr_default.execute(3, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk90V8 = false ;
         A396EmprCod = P090V5_A396EmprCod[0] ;
         A14AlbComCod = P090V5_A14AlbComCod[0] ;
         A13321AlbComArtD = P090V5_A13321AlbComArtD[0] ;
         A15AlbComDsc = P090V5_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V5_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090V5_A13322AlbComCol[0] ;
         A13320AlbComArt = P090V5_A13320AlbComArt[0] ;
         A13318AlbComMts = P090V5_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V5_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090V5_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090V5_A13315AlbComNRef[0] ;
         A20AlbComLin = P090V5_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P090V5_A13321AlbComArtD[0], A13321AlbComArtD) == 0 ) )
         {
            brk90V8 = false ;
            A396EmprCod = P090V5_A396EmprCod[0] ;
            A14AlbComCod = P090V5_A14AlbComCod[0] ;
            A20AlbComLin = P090V5_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A13321AlbComArtD)==0) )
         {
            AV34Option = A13321AlbComArtD ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V8 )
         {
            brk90V8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBCOMCOLOPTIONS' Routine */
      returnInSub = false ;
      AV63TFAlbComCol = AV30SearchTxt ;
      AV64TFAlbComCol_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V6 */
      pr_default.execute(4, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk90V10 = false ;
         A396EmprCod = P090V6_A396EmprCod[0] ;
         A14AlbComCod = P090V6_A14AlbComCod[0] ;
         A13322AlbComCol = P090V6_A13322AlbComCol[0] ;
         A15AlbComDsc = P090V6_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V6_A13319AlbComKgs[0] ;
         A13321AlbComArtD = P090V6_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090V6_A13320AlbComArt[0] ;
         A13318AlbComMts = P090V6_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V6_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090V6_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090V6_A13315AlbComNRef[0] ;
         A20AlbComLin = P090V6_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P090V6_A13322AlbComCol[0], A13322AlbComCol) == 0 ) )
         {
            brk90V10 = false ;
            A396EmprCod = P090V6_A396EmprCod[0] ;
            A14AlbComCod = P090V6_A14AlbComCod[0] ;
            A20AlbComLin = P090V6_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A13322AlbComCol)==0) )
         {
            AV34Option = A13322AlbComCol ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V10 )
         {
            brk90V10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBCOMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV67TFAlbComDsc = AV30SearchTxt ;
      AV68TFAlbComDsc_Sel = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV48FilterFullText ;
      AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV49TFAlbComLin ;
      AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV50TFAlbComLin_To ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV51TFAlbComNRef ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV52TFAlbComNRef_Sel ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV53TFAlbComVDoc ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV54TFAlbComVDoc_Sel ;
      AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV55TFAlbComPzas ;
      AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV56TFAlbComPzas_To ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV57TFAlbComMts ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV58TFAlbComMts_To ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV59TFAlbComArt ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV60TFAlbComArt_Sel ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV61TFAlbComArtD ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV62TFAlbComArtD_Sel ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV63TFAlbComCol ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV64TFAlbComCol_Sel ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV65TFAlbComKgs ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV66TFAlbComKgs_To ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV67TFAlbComDsc ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV68TFAlbComDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           A396EmprCod ,
                                           AV69Emprcod ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(AV70AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor P090V7 */
      pr_default.execute(5, new Object[] {AV69Emprcod, Integer.valueOf(AV70AlbComCod), lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk90V12 = false ;
         A396EmprCod = P090V7_A396EmprCod[0] ;
         A14AlbComCod = P090V7_A14AlbComCod[0] ;
         A15AlbComDsc = P090V7_A15AlbComDsc[0] ;
         A13319AlbComKgs = P090V7_A13319AlbComKgs[0] ;
         A13322AlbComCol = P090V7_A13322AlbComCol[0] ;
         A13321AlbComArtD = P090V7_A13321AlbComArtD[0] ;
         A13320AlbComArt = P090V7_A13320AlbComArt[0] ;
         A13318AlbComMts = P090V7_A13318AlbComMts[0] ;
         A13317AlbComPzas = P090V7_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = P090V7_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = P090V7_A13315AlbComNRef[0] ;
         A20AlbComLin = P090V7_A20AlbComLin[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P090V7_A15AlbComDsc[0], A15AlbComDsc) == 0 ) )
         {
            brk90V12 = false ;
            A396EmprCod = P090V7_A396EmprCod[0] ;
            A14AlbComCod = P090V7_A14AlbComCod[0] ;
            A20AlbComLin = P090V7_A20AlbComLin[0] ;
            AV42count = (long)(AV42count+1) ;
            brk90V12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A15AlbComDsc)==0) )
         {
            AV34Option = A15AlbComDsc ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk90V12 )
         {
            brk90V12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = wcconsultadocumentoscomercialesdetallegetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV51TFAlbComNRef = "" ;
      AV52TFAlbComNRef_Sel = "" ;
      AV53TFAlbComVDoc = "" ;
      AV54TFAlbComVDoc_Sel = "" ;
      AV57TFAlbComMts = DecimalUtil.ZERO ;
      AV58TFAlbComMts_To = DecimalUtil.ZERO ;
      AV59TFAlbComArt = "" ;
      AV60TFAlbComArt_Sel = "" ;
      AV61TFAlbComArtD = "" ;
      AV62TFAlbComArtD_Sel = "" ;
      AV63TFAlbComCol = "" ;
      AV64TFAlbComCol_Sel = "" ;
      AV65TFAlbComKgs = DecimalUtil.ZERO ;
      AV66TFAlbComKgs_To = DecimalUtil.ZERO ;
      AV67TFAlbComDsc = "" ;
      AV68TFAlbComDsc_Sel = "" ;
      AV69Emprcod = "" ;
      A13315AlbComNRef = "" ;
      AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = "" ;
      AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = "" ;
      AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = DecimalUtil.ZERO ;
      AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = DecimalUtil.ZERO ;
      AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = "" ;
      AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = "" ;
      AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = "" ;
      AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = DecimalUtil.ZERO ;
      AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = DecimalUtil.ZERO ;
      AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = "" ;
      scmdbuf = "" ;
      lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A396EmprCod = "" ;
      P090V2_A396EmprCod = new String[] {""} ;
      P090V2_A14AlbComCod = new int[1] ;
      P090V2_A13315AlbComNRef = new String[] {""} ;
      P090V2_A15AlbComDsc = new String[] {""} ;
      P090V2_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V2_A13322AlbComCol = new String[] {""} ;
      P090V2_A13321AlbComArtD = new String[] {""} ;
      P090V2_A13320AlbComArt = new String[] {""} ;
      P090V2_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V2_A13317AlbComPzas = new int[1] ;
      P090V2_A13316AlbComVDoc = new String[] {""} ;
      P090V2_A20AlbComLin = new short[1] ;
      AV34Option = "" ;
      P090V3_A396EmprCod = new String[] {""} ;
      P090V3_A14AlbComCod = new int[1] ;
      P090V3_A13316AlbComVDoc = new String[] {""} ;
      P090V3_A15AlbComDsc = new String[] {""} ;
      P090V3_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V3_A13322AlbComCol = new String[] {""} ;
      P090V3_A13321AlbComArtD = new String[] {""} ;
      P090V3_A13320AlbComArt = new String[] {""} ;
      P090V3_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V3_A13317AlbComPzas = new int[1] ;
      P090V3_A13315AlbComNRef = new String[] {""} ;
      P090V3_A20AlbComLin = new short[1] ;
      P090V4_A396EmprCod = new String[] {""} ;
      P090V4_A14AlbComCod = new int[1] ;
      P090V4_A13320AlbComArt = new String[] {""} ;
      P090V4_A15AlbComDsc = new String[] {""} ;
      P090V4_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V4_A13322AlbComCol = new String[] {""} ;
      P090V4_A13321AlbComArtD = new String[] {""} ;
      P090V4_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V4_A13317AlbComPzas = new int[1] ;
      P090V4_A13316AlbComVDoc = new String[] {""} ;
      P090V4_A13315AlbComNRef = new String[] {""} ;
      P090V4_A20AlbComLin = new short[1] ;
      P090V5_A396EmprCod = new String[] {""} ;
      P090V5_A14AlbComCod = new int[1] ;
      P090V5_A13321AlbComArtD = new String[] {""} ;
      P090V5_A15AlbComDsc = new String[] {""} ;
      P090V5_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V5_A13322AlbComCol = new String[] {""} ;
      P090V5_A13320AlbComArt = new String[] {""} ;
      P090V5_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V5_A13317AlbComPzas = new int[1] ;
      P090V5_A13316AlbComVDoc = new String[] {""} ;
      P090V5_A13315AlbComNRef = new String[] {""} ;
      P090V5_A20AlbComLin = new short[1] ;
      P090V6_A396EmprCod = new String[] {""} ;
      P090V6_A14AlbComCod = new int[1] ;
      P090V6_A13322AlbComCol = new String[] {""} ;
      P090V6_A15AlbComDsc = new String[] {""} ;
      P090V6_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V6_A13321AlbComArtD = new String[] {""} ;
      P090V6_A13320AlbComArt = new String[] {""} ;
      P090V6_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V6_A13317AlbComPzas = new int[1] ;
      P090V6_A13316AlbComVDoc = new String[] {""} ;
      P090V6_A13315AlbComNRef = new String[] {""} ;
      P090V6_A20AlbComLin = new short[1] ;
      P090V7_A396EmprCod = new String[] {""} ;
      P090V7_A14AlbComCod = new int[1] ;
      P090V7_A15AlbComDsc = new String[] {""} ;
      P090V7_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V7_A13322AlbComCol = new String[] {""} ;
      P090V7_A13321AlbComArtD = new String[] {""} ;
      P090V7_A13320AlbComArt = new String[] {""} ;
      P090V7_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P090V7_A13317AlbComPzas = new int[1] ;
      P090V7_A13316AlbComVDoc = new String[] {""} ;
      P090V7_A13315AlbComNRef = new String[] {""} ;
      P090V7_A20AlbComLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesdetallegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P090V2_A396EmprCod, P090V2_A14AlbComCod, P090V2_A13315AlbComNRef, P090V2_A15AlbComDsc, P090V2_A13319AlbComKgs, P090V2_A13322AlbComCol, P090V2_A13321AlbComArtD, P090V2_A13320AlbComArt, P090V2_A13318AlbComMts, P090V2_A13317AlbComPzas,
            P090V2_A13316AlbComVDoc, P090V2_A20AlbComLin
            }
            , new Object[] {
            P090V3_A396EmprCod, P090V3_A14AlbComCod, P090V3_A13316AlbComVDoc, P090V3_A15AlbComDsc, P090V3_A13319AlbComKgs, P090V3_A13322AlbComCol, P090V3_A13321AlbComArtD, P090V3_A13320AlbComArt, P090V3_A13318AlbComMts, P090V3_A13317AlbComPzas,
            P090V3_A13315AlbComNRef, P090V3_A20AlbComLin
            }
            , new Object[] {
            P090V4_A396EmprCod, P090V4_A14AlbComCod, P090V4_A13320AlbComArt, P090V4_A15AlbComDsc, P090V4_A13319AlbComKgs, P090V4_A13322AlbComCol, P090V4_A13321AlbComArtD, P090V4_A13318AlbComMts, P090V4_A13317AlbComPzas, P090V4_A13316AlbComVDoc,
            P090V4_A13315AlbComNRef, P090V4_A20AlbComLin
            }
            , new Object[] {
            P090V5_A396EmprCod, P090V5_A14AlbComCod, P090V5_A13321AlbComArtD, P090V5_A15AlbComDsc, P090V5_A13319AlbComKgs, P090V5_A13322AlbComCol, P090V5_A13320AlbComArt, P090V5_A13318AlbComMts, P090V5_A13317AlbComPzas, P090V5_A13316AlbComVDoc,
            P090V5_A13315AlbComNRef, P090V5_A20AlbComLin
            }
            , new Object[] {
            P090V6_A396EmprCod, P090V6_A14AlbComCod, P090V6_A13322AlbComCol, P090V6_A15AlbComDsc, P090V6_A13319AlbComKgs, P090V6_A13321AlbComArtD, P090V6_A13320AlbComArt, P090V6_A13318AlbComMts, P090V6_A13317AlbComPzas, P090V6_A13316AlbComVDoc,
            P090V6_A13315AlbComNRef, P090V6_A20AlbComLin
            }
            , new Object[] {
            P090V7_A396EmprCod, P090V7_A14AlbComCod, P090V7_A15AlbComDsc, P090V7_A13319AlbComKgs, P090V7_A13322AlbComCol, P090V7_A13321AlbComArtD, P090V7_A13320AlbComArt, P090V7_A13318AlbComMts, P090V7_A13317AlbComPzas, P090V7_A13316AlbComVDoc,
            P090V7_A13315AlbComNRef, P090V7_A20AlbComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV49TFAlbComLin ;
   private short AV50TFAlbComLin_To ;
   private short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ;
   private short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ;
   private short A20AlbComLin ;
   private short Gx_err ;
   private int AV73GXV1 ;
   private int AV55TFAlbComPzas ;
   private int AV56TFAlbComPzas_To ;
   private int AV70AlbComCod ;
   private int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ;
   private int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ;
   private int A13317AlbComPzas ;
   private int A14AlbComCod ;
   private long AV42count ;
   private java.math.BigDecimal AV57TFAlbComMts ;
   private java.math.BigDecimal AV58TFAlbComMts_To ;
   private java.math.BigDecimal AV65TFAlbComKgs ;
   private java.math.BigDecimal AV66TFAlbComKgs_To ;
   private java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ;
   private java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ;
   private java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ;
   private java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private String AV51TFAlbComNRef ;
   private String AV52TFAlbComNRef_Sel ;
   private String AV53TFAlbComVDoc ;
   private String AV54TFAlbComVDoc_Sel ;
   private String AV59TFAlbComArt ;
   private String AV60TFAlbComArt_Sel ;
   private String AV61TFAlbComArtD ;
   private String AV62TFAlbComArtD_Sel ;
   private String AV63TFAlbComCol ;
   private String AV64TFAlbComCol_Sel ;
   private String AV67TFAlbComDsc ;
   private String AV68TFAlbComDsc_Sel ;
   private String AV69Emprcod ;
   private String A13315AlbComNRef ;
   private String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ;
   private String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ;
   private String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ;
   private String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ;
   private String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ;
   private String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ;
   private String scmdbuf ;
   private String lV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String lV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String lV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String lV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String lV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String lV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String A13316AlbComVDoc ;
   private String A13320AlbComArt ;
   private String A13321AlbComArtD ;
   private String A13322AlbComCol ;
   private String A15AlbComDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk90V2 ;
   private boolean brk90V4 ;
   private boolean brk90V6 ;
   private boolean brk90V8 ;
   private boolean brk90V10 ;
   private boolean brk90V12 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String lV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P090V2_A396EmprCod ;
   private int[] P090V2_A14AlbComCod ;
   private String[] P090V2_A13315AlbComNRef ;
   private String[] P090V2_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V2_A13319AlbComKgs ;
   private String[] P090V2_A13322AlbComCol ;
   private String[] P090V2_A13321AlbComArtD ;
   private String[] P090V2_A13320AlbComArt ;
   private java.math.BigDecimal[] P090V2_A13318AlbComMts ;
   private int[] P090V2_A13317AlbComPzas ;
   private String[] P090V2_A13316AlbComVDoc ;
   private short[] P090V2_A20AlbComLin ;
   private String[] P090V3_A396EmprCod ;
   private int[] P090V3_A14AlbComCod ;
   private String[] P090V3_A13316AlbComVDoc ;
   private String[] P090V3_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V3_A13319AlbComKgs ;
   private String[] P090V3_A13322AlbComCol ;
   private String[] P090V3_A13321AlbComArtD ;
   private String[] P090V3_A13320AlbComArt ;
   private java.math.BigDecimal[] P090V3_A13318AlbComMts ;
   private int[] P090V3_A13317AlbComPzas ;
   private String[] P090V3_A13315AlbComNRef ;
   private short[] P090V3_A20AlbComLin ;
   private String[] P090V4_A396EmprCod ;
   private int[] P090V4_A14AlbComCod ;
   private String[] P090V4_A13320AlbComArt ;
   private String[] P090V4_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V4_A13319AlbComKgs ;
   private String[] P090V4_A13322AlbComCol ;
   private String[] P090V4_A13321AlbComArtD ;
   private java.math.BigDecimal[] P090V4_A13318AlbComMts ;
   private int[] P090V4_A13317AlbComPzas ;
   private String[] P090V4_A13316AlbComVDoc ;
   private String[] P090V4_A13315AlbComNRef ;
   private short[] P090V4_A20AlbComLin ;
   private String[] P090V5_A396EmprCod ;
   private int[] P090V5_A14AlbComCod ;
   private String[] P090V5_A13321AlbComArtD ;
   private String[] P090V5_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V5_A13319AlbComKgs ;
   private String[] P090V5_A13322AlbComCol ;
   private String[] P090V5_A13320AlbComArt ;
   private java.math.BigDecimal[] P090V5_A13318AlbComMts ;
   private int[] P090V5_A13317AlbComPzas ;
   private String[] P090V5_A13316AlbComVDoc ;
   private String[] P090V5_A13315AlbComNRef ;
   private short[] P090V5_A20AlbComLin ;
   private String[] P090V6_A396EmprCod ;
   private int[] P090V6_A14AlbComCod ;
   private String[] P090V6_A13322AlbComCol ;
   private String[] P090V6_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V6_A13319AlbComKgs ;
   private String[] P090V6_A13321AlbComArtD ;
   private String[] P090V6_A13320AlbComArt ;
   private java.math.BigDecimal[] P090V6_A13318AlbComMts ;
   private int[] P090V6_A13317AlbComPzas ;
   private String[] P090V6_A13316AlbComVDoc ;
   private String[] P090V6_A13315AlbComNRef ;
   private short[] P090V6_A20AlbComLin ;
   private String[] P090V7_A396EmprCod ;
   private int[] P090V7_A14AlbComCod ;
   private String[] P090V7_A15AlbComDsc ;
   private java.math.BigDecimal[] P090V7_A13319AlbComKgs ;
   private String[] P090V7_A13322AlbComCol ;
   private String[] P090V7_A13321AlbComArtD ;
   private String[] P090V7_A13320AlbComArt ;
   private java.math.BigDecimal[] P090V7_A13318AlbComMts ;
   private int[] P090V7_A13317AlbComPzas ;
   private String[] P090V7_A13316AlbComVDoc ;
   private String[] P090V7_A13315AlbComNRef ;
   private short[] P090V7_A20AlbComLin ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class wcconsultadocumentoscomercialesdetallegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P090V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComNRef, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComNRef" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P090V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComVDoc, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComVDoc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P090V4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComArt, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComArt" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P090V5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComArtD, AlbComDsc, AlbComKgs, AlbComCol, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComArtD" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P090V6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComCol, AlbComDsc, AlbComKgs, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComCol" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P090V7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String A396EmprCod ,
                                          String AV69Emprcod ,
                                          int A14AlbComCod ,
                                          int AV70AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[32];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbComCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV75Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV76Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV77Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV86Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV90Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbComDsc" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P090V2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
            case 1 :
                  return conditional_P090V3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
            case 2 :
                  return conditional_P090V4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
            case 3 :
                  return conditional_P090V5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
            case 4 :
                  return conditional_P090V6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
            case 5 :
                  return conditional_P090V7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P090V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090V4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090V5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090V6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P090V7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

