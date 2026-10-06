package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn22wwgetfilterdata extends GXProcedure
{
   public ttrn22wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn22wwgetfilterdata.class ), "" );
   }

   public ttrn22wwgetfilterdata( int remoteHandle ,
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
      ttrn22wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn22wwgetfilterdata.this.AV33DDOName = aP0;
      ttrn22wwgetfilterdata.this.AV34SearchTxt = aP1;
      ttrn22wwgetfilterdata.this.AV35SearchTxtTo = aP2;
      ttrn22wwgetfilterdata.this.aP3 = aP3;
      ttrn22wwgetfilterdata.this.aP4 = aP4;
      ttrn22wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV33DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV23Options.toJSonString(false) ;
      AV37OptionsDescJson = AV25OptionsDesc.toJSonString(false) ;
      AV38OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue("TTrn22WWGridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn22WWGridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV28Session.getValue("TTrn22WWGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV14TFCliNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV15TFCliNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV40TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            AV41TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV17TFAlbRef = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV18TFAlbRef_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV19TFAlbRefDsc = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV20TFAlbRefDsc_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV42TFAlbRPieEnt = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFAlbRPieEnt_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV44TFAlbRPieUti = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFAlbRPieUti_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV46TFAlbRPieDis = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFAlbRPieDis_To = (int)(GXutil.lval( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV48TFAlbRUni_SelsJson = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFAlbRUni_Sels.fromJSonString(AV48TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV50TFAlbRUniEnt = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFAlbRUniEnt_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV52TFAlbRUniUti = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFAlbRUniUti_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV54TFAlbRUniDis = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFAlbRUniDis_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliNom = AV34SearchTxt ;
      AV15TFCliNom_Sel = "" ;
      AV60Ttrn22wwds_1_tfclinom = AV14TFCliNom ;
      AV61Ttrn22wwds_2_tfclinom_sel = AV15TFCliNom_Sel ;
      AV62Ttrn22wwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV63Ttrn22wwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV64Ttrn22wwds_5_tfalbref = AV17TFAlbRef ;
      AV65Ttrn22wwds_6_tfalbref_sel = AV18TFAlbRef_Sel ;
      AV66Ttrn22wwds_7_tfalbrefdsc = AV19TFAlbRefDsc ;
      AV67Ttrn22wwds_8_tfalbrefdsc_sel = AV20TFAlbRefDsc_Sel ;
      AV68Ttrn22wwds_9_tfalbrpieent = AV42TFAlbRPieEnt ;
      AV69Ttrn22wwds_10_tfalbrpieent_to = AV43TFAlbRPieEnt_To ;
      AV70Ttrn22wwds_11_tfalbrpieuti = AV44TFAlbRPieUti ;
      AV71Ttrn22wwds_12_tfalbrpieuti_to = AV45TFAlbRPieUti_To ;
      AV72Ttrn22wwds_13_tfalbrpiedis = AV46TFAlbRPieDis ;
      AV73Ttrn22wwds_14_tfalbrpiedis_to = AV47TFAlbRPieDis_To ;
      AV74Ttrn22wwds_15_tfalbruni_sels = AV49TFAlbRUni_Sels ;
      AV75Ttrn22wwds_16_tfalbrunient = AV50TFAlbRUniEnt ;
      AV76Ttrn22wwds_17_tfalbrunient_to = AV51TFAlbRUniEnt_To ;
      AV77Ttrn22wwds_18_tfalbruniuti = AV52TFAlbRUniUti ;
      AV78Ttrn22wwds_19_tfalbruniuti_to = AV53TFAlbRUniUti_To ;
      AV79Ttrn22wwds_20_tfalbrunidis = AV54TFAlbRUniDis ;
      AV80Ttrn22wwds_21_tfalbrunidis_to = AV55TFAlbRUniDis_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV74Ttrn22wwds_15_tfalbruni_sels ,
                                           AV61Ttrn22wwds_2_tfclinom_sel ,
                                           AV60Ttrn22wwds_1_tfclinom ,
                                           AV62Ttrn22wwds_3_tfalbrhor ,
                                           AV63Ttrn22wwds_4_tfalbrhor_to ,
                                           AV65Ttrn22wwds_6_tfalbref_sel ,
                                           AV64Ttrn22wwds_5_tfalbref ,
                                           AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV66Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV74Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV75Ttrn22wwds_16_tfalbrunient ,
                                           AV76Ttrn22wwds_17_tfalbrunient_to ,
                                           AV77Ttrn22wwds_18_tfalbruniuti ,
                                           AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV79Ttrn22wwds_20_tfalbrunidis ,
                                           AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV60Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV60Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV64Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV64Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV66Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV66Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P0ATL2 */
      pr_default.execute(0, new Object[] {lV60Ttrn22wwds_1_tfclinom, AV61Ttrn22wwds_2_tfclinom_sel, AV62Ttrn22wwds_3_tfalbrhor, AV63Ttrn22wwds_4_tfalbrhor_to, lV64Ttrn22wwds_5_tfalbref, AV65Ttrn22wwds_6_tfalbref_sel, lV66Ttrn22wwds_7_tfalbrefdsc, AV67Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to), AV75Ttrn22wwds_16_tfalbrunient, AV76Ttrn22wwds_17_tfalbrunient_to, AV77Ttrn22wwds_18_tfalbruniuti, AV78Ttrn22wwds_19_tfalbruniuti_to, AV79Ttrn22wwds_20_tfalbrunidis, AV80Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkATL2 = false ;
         A396EmprCod = P0ATL2_A396EmprCod[0] ;
         A252CliCod = P0ATL2_A252CliCod[0] ;
         A279CliNom = P0ATL2_A279CliNom[0] ;
         A56AlbRUni = P0ATL2_A56AlbRUni[0] ;
         A3613AlbRefDsc = P0ATL2_A3613AlbRefDsc[0] ;
         A45AlbRef = P0ATL2_A45AlbRef[0] ;
         A6179AlbrHor = P0ATL2_A6179AlbrHor[0] ;
         A54AlbRPieUti = P0ATL2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATL2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATL2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATL2_A58AlbRUniEnt[0] ;
         A44AlbRecCod = P0ATL2_A44AlbRecCod[0] ;
         A279CliNom = P0ATL2_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV27count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ATL2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkATL2 = false ;
            A396EmprCod = P0ATL2_A396EmprCod[0] ;
            A252CliCod = P0ATL2_A252CliCod[0] ;
            A44AlbRecCod = P0ATL2_A44AlbRecCod[0] ;
            AV27count = (long)(AV27count+1) ;
            brkATL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV22Option = A279CliNom ;
            AV23Options.add(AV22Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV27count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkATL2 )
         {
            brkATL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV17TFAlbRef = AV34SearchTxt ;
      AV18TFAlbRef_Sel = "" ;
      AV60Ttrn22wwds_1_tfclinom = AV14TFCliNom ;
      AV61Ttrn22wwds_2_tfclinom_sel = AV15TFCliNom_Sel ;
      AV62Ttrn22wwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV63Ttrn22wwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV64Ttrn22wwds_5_tfalbref = AV17TFAlbRef ;
      AV65Ttrn22wwds_6_tfalbref_sel = AV18TFAlbRef_Sel ;
      AV66Ttrn22wwds_7_tfalbrefdsc = AV19TFAlbRefDsc ;
      AV67Ttrn22wwds_8_tfalbrefdsc_sel = AV20TFAlbRefDsc_Sel ;
      AV68Ttrn22wwds_9_tfalbrpieent = AV42TFAlbRPieEnt ;
      AV69Ttrn22wwds_10_tfalbrpieent_to = AV43TFAlbRPieEnt_To ;
      AV70Ttrn22wwds_11_tfalbrpieuti = AV44TFAlbRPieUti ;
      AV71Ttrn22wwds_12_tfalbrpieuti_to = AV45TFAlbRPieUti_To ;
      AV72Ttrn22wwds_13_tfalbrpiedis = AV46TFAlbRPieDis ;
      AV73Ttrn22wwds_14_tfalbrpiedis_to = AV47TFAlbRPieDis_To ;
      AV74Ttrn22wwds_15_tfalbruni_sels = AV49TFAlbRUni_Sels ;
      AV75Ttrn22wwds_16_tfalbrunient = AV50TFAlbRUniEnt ;
      AV76Ttrn22wwds_17_tfalbrunient_to = AV51TFAlbRUniEnt_To ;
      AV77Ttrn22wwds_18_tfalbruniuti = AV52TFAlbRUniUti ;
      AV78Ttrn22wwds_19_tfalbruniuti_to = AV53TFAlbRUniUti_To ;
      AV79Ttrn22wwds_20_tfalbrunidis = AV54TFAlbRUniDis ;
      AV80Ttrn22wwds_21_tfalbrunidis_to = AV55TFAlbRUniDis_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV74Ttrn22wwds_15_tfalbruni_sels ,
                                           AV61Ttrn22wwds_2_tfclinom_sel ,
                                           AV60Ttrn22wwds_1_tfclinom ,
                                           AV62Ttrn22wwds_3_tfalbrhor ,
                                           AV63Ttrn22wwds_4_tfalbrhor_to ,
                                           AV65Ttrn22wwds_6_tfalbref_sel ,
                                           AV64Ttrn22wwds_5_tfalbref ,
                                           AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV66Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV74Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV75Ttrn22wwds_16_tfalbrunient ,
                                           AV76Ttrn22wwds_17_tfalbrunient_to ,
                                           AV77Ttrn22wwds_18_tfalbruniuti ,
                                           AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV79Ttrn22wwds_20_tfalbrunidis ,
                                           AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV60Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV60Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV64Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV64Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV66Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV66Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P0ATL3 */
      pr_default.execute(1, new Object[] {lV60Ttrn22wwds_1_tfclinom, AV61Ttrn22wwds_2_tfclinom_sel, AV62Ttrn22wwds_3_tfalbrhor, AV63Ttrn22wwds_4_tfalbrhor_to, lV64Ttrn22wwds_5_tfalbref, AV65Ttrn22wwds_6_tfalbref_sel, lV66Ttrn22wwds_7_tfalbrefdsc, AV67Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to), AV75Ttrn22wwds_16_tfalbrunient, AV76Ttrn22wwds_17_tfalbrunient_to, AV77Ttrn22wwds_18_tfalbruniuti, AV78Ttrn22wwds_19_tfalbruniuti_to, AV79Ttrn22wwds_20_tfalbrunidis, AV80Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkATL4 = false ;
         A396EmprCod = P0ATL3_A396EmprCod[0] ;
         A252CliCod = P0ATL3_A252CliCod[0] ;
         A45AlbRef = P0ATL3_A45AlbRef[0] ;
         A56AlbRUni = P0ATL3_A56AlbRUni[0] ;
         A3613AlbRefDsc = P0ATL3_A3613AlbRefDsc[0] ;
         A6179AlbrHor = P0ATL3_A6179AlbrHor[0] ;
         A279CliNom = P0ATL3_A279CliNom[0] ;
         A54AlbRPieUti = P0ATL3_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATL3_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATL3_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATL3_A58AlbRUniEnt[0] ;
         A44AlbRecCod = P0ATL3_A44AlbRecCod[0] ;
         A279CliNom = P0ATL3_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV27count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ATL3_A45AlbRef[0], A45AlbRef) == 0 ) )
         {
            brkATL4 = false ;
            A396EmprCod = P0ATL3_A396EmprCod[0] ;
            A44AlbRecCod = P0ATL3_A44AlbRecCod[0] ;
            AV27count = (long)(AV27count+1) ;
            brkATL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV22Option = A45AlbRef ;
            AV23Options.add(AV22Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV27count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkATL4 )
         {
            brkATL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV19TFAlbRefDsc = AV34SearchTxt ;
      AV20TFAlbRefDsc_Sel = "" ;
      AV60Ttrn22wwds_1_tfclinom = AV14TFCliNom ;
      AV61Ttrn22wwds_2_tfclinom_sel = AV15TFCliNom_Sel ;
      AV62Ttrn22wwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV63Ttrn22wwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV64Ttrn22wwds_5_tfalbref = AV17TFAlbRef ;
      AV65Ttrn22wwds_6_tfalbref_sel = AV18TFAlbRef_Sel ;
      AV66Ttrn22wwds_7_tfalbrefdsc = AV19TFAlbRefDsc ;
      AV67Ttrn22wwds_8_tfalbrefdsc_sel = AV20TFAlbRefDsc_Sel ;
      AV68Ttrn22wwds_9_tfalbrpieent = AV42TFAlbRPieEnt ;
      AV69Ttrn22wwds_10_tfalbrpieent_to = AV43TFAlbRPieEnt_To ;
      AV70Ttrn22wwds_11_tfalbrpieuti = AV44TFAlbRPieUti ;
      AV71Ttrn22wwds_12_tfalbrpieuti_to = AV45TFAlbRPieUti_To ;
      AV72Ttrn22wwds_13_tfalbrpiedis = AV46TFAlbRPieDis ;
      AV73Ttrn22wwds_14_tfalbrpiedis_to = AV47TFAlbRPieDis_To ;
      AV74Ttrn22wwds_15_tfalbruni_sels = AV49TFAlbRUni_Sels ;
      AV75Ttrn22wwds_16_tfalbrunient = AV50TFAlbRUniEnt ;
      AV76Ttrn22wwds_17_tfalbrunient_to = AV51TFAlbRUniEnt_To ;
      AV77Ttrn22wwds_18_tfalbruniuti = AV52TFAlbRUniUti ;
      AV78Ttrn22wwds_19_tfalbruniuti_to = AV53TFAlbRUniUti_To ;
      AV79Ttrn22wwds_20_tfalbrunidis = AV54TFAlbRUniDis ;
      AV80Ttrn22wwds_21_tfalbrunidis_to = AV55TFAlbRUniDis_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV74Ttrn22wwds_15_tfalbruni_sels ,
                                           AV61Ttrn22wwds_2_tfclinom_sel ,
                                           AV60Ttrn22wwds_1_tfclinom ,
                                           AV62Ttrn22wwds_3_tfalbrhor ,
                                           AV63Ttrn22wwds_4_tfalbrhor_to ,
                                           AV65Ttrn22wwds_6_tfalbref_sel ,
                                           AV64Ttrn22wwds_5_tfalbref ,
                                           AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV66Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV74Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV75Ttrn22wwds_16_tfalbrunient ,
                                           AV76Ttrn22wwds_17_tfalbrunient_to ,
                                           AV77Ttrn22wwds_18_tfalbruniuti ,
                                           AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV79Ttrn22wwds_20_tfalbrunidis ,
                                           AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV60Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV60Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV64Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV64Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV66Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV66Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor P0ATL4 */
      pr_default.execute(2, new Object[] {lV60Ttrn22wwds_1_tfclinom, AV61Ttrn22wwds_2_tfclinom_sel, AV62Ttrn22wwds_3_tfalbrhor, AV63Ttrn22wwds_4_tfalbrhor_to, lV64Ttrn22wwds_5_tfalbref, AV65Ttrn22wwds_6_tfalbref_sel, lV66Ttrn22wwds_7_tfalbrefdsc, AV67Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV68Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV69Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV70Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV71Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV72Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV73Ttrn22wwds_14_tfalbrpiedis_to), AV75Ttrn22wwds_16_tfalbrunient, AV76Ttrn22wwds_17_tfalbrunient_to, AV77Ttrn22wwds_18_tfalbruniuti, AV78Ttrn22wwds_19_tfalbruniuti_to, AV79Ttrn22wwds_20_tfalbrunidis, AV80Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkATL6 = false ;
         A396EmprCod = P0ATL4_A396EmprCod[0] ;
         A252CliCod = P0ATL4_A252CliCod[0] ;
         A3613AlbRefDsc = P0ATL4_A3613AlbRefDsc[0] ;
         A56AlbRUni = P0ATL4_A56AlbRUni[0] ;
         A45AlbRef = P0ATL4_A45AlbRef[0] ;
         A6179AlbrHor = P0ATL4_A6179AlbrHor[0] ;
         A279CliNom = P0ATL4_A279CliNom[0] ;
         A54AlbRPieUti = P0ATL4_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0ATL4_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P0ATL4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0ATL4_A58AlbRUniEnt[0] ;
         A44AlbRecCod = P0ATL4_A44AlbRecCod[0] ;
         A279CliNom = P0ATL4_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV27count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ATL4_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
         {
            brkATL6 = false ;
            A396EmprCod = P0ATL4_A396EmprCod[0] ;
            A44AlbRecCod = P0ATL4_A44AlbRecCod[0] ;
            AV27count = (long)(AV27count+1) ;
            brkATL6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
         {
            AV22Option = A3613AlbRefDsc ;
            AV23Options.add(AV22Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV27count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkATL6 )
         {
            brkATL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn22wwgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = ttrn22wwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = ttrn22wwgetfilterdata.this.AV38OptionIndexesJson;
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
      AV37OptionsDescJson = "" ;
      AV38OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFCliNom = "" ;
      AV15TFCliNom_Sel = "" ;
      AV40TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV41TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV17TFAlbRef = "" ;
      AV18TFAlbRef_Sel = "" ;
      AV19TFAlbRefDsc = "" ;
      AV20TFAlbRefDsc_Sel = "" ;
      AV48TFAlbRUni_SelsJson = "" ;
      AV49TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV51TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV52TFAlbRUniUti = DecimalUtil.ZERO ;
      AV53TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV54TFAlbRUniDis = DecimalUtil.ZERO ;
      AV55TFAlbRUniDis_To = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      AV60Ttrn22wwds_1_tfclinom = "" ;
      AV61Ttrn22wwds_2_tfclinom_sel = "" ;
      AV62Ttrn22wwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV63Ttrn22wwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV64Ttrn22wwds_5_tfalbref = "" ;
      AV65Ttrn22wwds_6_tfalbref_sel = "" ;
      AV66Ttrn22wwds_7_tfalbrefdsc = "" ;
      AV67Ttrn22wwds_8_tfalbrefdsc_sel = "" ;
      AV74Ttrn22wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV75Ttrn22wwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV76Ttrn22wwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV77Ttrn22wwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV78Ttrn22wwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV79Ttrn22wwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV80Ttrn22wwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV60Ttrn22wwds_1_tfclinom = "" ;
      lV64Ttrn22wwds_5_tfalbref = "" ;
      lV66Ttrn22wwds_7_tfalbrefdsc = "" ;
      A56AlbRUni = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P0ATL2_A396EmprCod = new String[] {""} ;
      P0ATL2_A252CliCod = new int[1] ;
      P0ATL2_A279CliNom = new String[] {""} ;
      P0ATL2_A56AlbRUni = new String[] {""} ;
      P0ATL2_A3613AlbRefDsc = new String[] {""} ;
      P0ATL2_A45AlbRef = new String[] {""} ;
      P0ATL2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATL2_A54AlbRPieUti = new int[1] ;
      P0ATL2_A52AlbRPieEnt = new int[1] ;
      P0ATL2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL2_A44AlbRecCod = new int[1] ;
      A396EmprCod = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV22Option = "" ;
      P0ATL3_A396EmprCod = new String[] {""} ;
      P0ATL3_A252CliCod = new int[1] ;
      P0ATL3_A45AlbRef = new String[] {""} ;
      P0ATL3_A56AlbRUni = new String[] {""} ;
      P0ATL3_A3613AlbRefDsc = new String[] {""} ;
      P0ATL3_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATL3_A279CliNom = new String[] {""} ;
      P0ATL3_A54AlbRPieUti = new int[1] ;
      P0ATL3_A52AlbRPieEnt = new int[1] ;
      P0ATL3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL3_A44AlbRecCod = new int[1] ;
      P0ATL4_A396EmprCod = new String[] {""} ;
      P0ATL4_A252CliCod = new int[1] ;
      P0ATL4_A3613AlbRefDsc = new String[] {""} ;
      P0ATL4_A56AlbRUni = new String[] {""} ;
      P0ATL4_A45AlbRef = new String[] {""} ;
      P0ATL4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P0ATL4_A279CliNom = new String[] {""} ;
      P0ATL4_A54AlbRPieUti = new int[1] ;
      P0ATL4_A52AlbRPieEnt = new int[1] ;
      P0ATL4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATL4_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn22wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ATL2_A396EmprCod, P0ATL2_A252CliCod, P0ATL2_A279CliNom, P0ATL2_A56AlbRUni, P0ATL2_A3613AlbRefDsc, P0ATL2_A45AlbRef, P0ATL2_A6179AlbrHor, P0ATL2_A54AlbRPieUti, P0ATL2_A52AlbRPieEnt, P0ATL2_A60AlbRUniUti,
            P0ATL2_A58AlbRUniEnt, P0ATL2_A44AlbRecCod
            }
            , new Object[] {
            P0ATL3_A396EmprCod, P0ATL3_A252CliCod, P0ATL3_A45AlbRef, P0ATL3_A56AlbRUni, P0ATL3_A3613AlbRefDsc, P0ATL3_A6179AlbrHor, P0ATL3_A279CliNom, P0ATL3_A54AlbRPieUti, P0ATL3_A52AlbRPieEnt, P0ATL3_A60AlbRUniUti,
            P0ATL3_A58AlbRUniEnt, P0ATL3_A44AlbRecCod
            }
            , new Object[] {
            P0ATL4_A396EmprCod, P0ATL4_A252CliCod, P0ATL4_A3613AlbRefDsc, P0ATL4_A56AlbRUni, P0ATL4_A45AlbRef, P0ATL4_A6179AlbrHor, P0ATL4_A279CliNom, P0ATL4_A54AlbRPieUti, P0ATL4_A52AlbRPieEnt, P0ATL4_A60AlbRUniUti,
            P0ATL4_A58AlbRUniEnt, P0ATL4_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV42TFAlbRPieEnt ;
   private int AV43TFAlbRPieEnt_To ;
   private int AV44TFAlbRPieUti ;
   private int AV45TFAlbRPieUti_To ;
   private int AV46TFAlbRPieDis ;
   private int AV47TFAlbRPieDis_To ;
   private int AV68Ttrn22wwds_9_tfalbrpieent ;
   private int AV69Ttrn22wwds_10_tfalbrpieent_to ;
   private int AV70Ttrn22wwds_11_tfalbrpieuti ;
   private int AV71Ttrn22wwds_12_tfalbrpieuti_to ;
   private int AV72Ttrn22wwds_13_tfalbrpiedis ;
   private int AV73Ttrn22wwds_14_tfalbrpiedis_to ;
   private int AV74Ttrn22wwds_15_tfalbruni_sels_size ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int A51AlbRPieDis ;
   private long AV27count ;
   private java.math.BigDecimal AV50TFAlbRUniEnt ;
   private java.math.BigDecimal AV51TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV52TFAlbRUniUti ;
   private java.math.BigDecimal AV53TFAlbRUniUti_To ;
   private java.math.BigDecimal AV54TFAlbRUniDis ;
   private java.math.BigDecimal AV55TFAlbRUniDis_To ;
   private java.math.BigDecimal AV75Ttrn22wwds_16_tfalbrunient ;
   private java.math.BigDecimal AV76Ttrn22wwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV77Ttrn22wwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV78Ttrn22wwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV79Ttrn22wwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV80Ttrn22wwds_21_tfalbrunidis_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV14TFCliNom ;
   private String AV15TFCliNom_Sel ;
   private String AV17TFAlbRef ;
   private String AV18TFAlbRef_Sel ;
   private String AV19TFAlbRefDsc ;
   private String AV20TFAlbRefDsc_Sel ;
   private String A279CliNom ;
   private String AV60Ttrn22wwds_1_tfclinom ;
   private String AV61Ttrn22wwds_2_tfclinom_sel ;
   private String AV64Ttrn22wwds_5_tfalbref ;
   private String AV65Ttrn22wwds_6_tfalbref_sel ;
   private String AV66Ttrn22wwds_7_tfalbrefdsc ;
   private String AV67Ttrn22wwds_8_tfalbrefdsc_sel ;
   private String scmdbuf ;
   private String lV60Ttrn22wwds_1_tfclinom ;
   private String lV64Ttrn22wwds_5_tfalbref ;
   private String lV66Ttrn22wwds_7_tfalbrefdsc ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A396EmprCod ;
   private java.util.Date AV40TFAlbrHor ;
   private java.util.Date AV41TFAlbrHor_To ;
   private java.util.Date AV62Ttrn22wwds_3_tfalbrhor ;
   private java.util.Date AV63Ttrn22wwds_4_tfalbrhor_to ;
   private java.util.Date A6179AlbrHor ;
   private boolean returnInSub ;
   private boolean brkATL2 ;
   private boolean brkATL4 ;
   private boolean brkATL6 ;
   private String AV36OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV38OptionIndexesJson ;
   private String AV48TFAlbRUni_SelsJson ;
   private String AV33DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATL2_A396EmprCod ;
   private int[] P0ATL2_A252CliCod ;
   private String[] P0ATL2_A279CliNom ;
   private String[] P0ATL2_A56AlbRUni ;
   private String[] P0ATL2_A3613AlbRefDsc ;
   private String[] P0ATL2_A45AlbRef ;
   private java.util.Date[] P0ATL2_A6179AlbrHor ;
   private int[] P0ATL2_A54AlbRPieUti ;
   private int[] P0ATL2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATL2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATL2_A58AlbRUniEnt ;
   private int[] P0ATL2_A44AlbRecCod ;
   private String[] P0ATL3_A396EmprCod ;
   private int[] P0ATL3_A252CliCod ;
   private String[] P0ATL3_A45AlbRef ;
   private String[] P0ATL3_A56AlbRUni ;
   private String[] P0ATL3_A3613AlbRefDsc ;
   private java.util.Date[] P0ATL3_A6179AlbrHor ;
   private String[] P0ATL3_A279CliNom ;
   private int[] P0ATL3_A54AlbRPieUti ;
   private int[] P0ATL3_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATL3_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATL3_A58AlbRUniEnt ;
   private int[] P0ATL3_A44AlbRecCod ;
   private String[] P0ATL4_A396EmprCod ;
   private int[] P0ATL4_A252CliCod ;
   private String[] P0ATL4_A3613AlbRefDsc ;
   private String[] P0ATL4_A56AlbRUni ;
   private String[] P0ATL4_A45AlbRef ;
   private java.util.Date[] P0ATL4_A6179AlbrHor ;
   private String[] P0ATL4_A279CliNom ;
   private int[] P0ATL4_A54AlbRPieUti ;
   private int[] P0ATL4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P0ATL4_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0ATL4_A58AlbRUniEnt ;
   private int[] P0ATL4_A44AlbRecCod ;
   private GXSimpleCollection<String> AV49TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV74Ttrn22wwds_15_tfalbruni_sels ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV25OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
}

final  class ttrn22wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ATL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV61Ttrn22wwds_2_tfclinom_sel ,
                                          String AV60Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV62Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV63Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV65Ttrn22wwds_6_tfalbref_sel ,
                                          String AV64Ttrn22wwds_5_tfalbref ,
                                          String AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV66Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV68Ttrn22wwds_9_tfalbrpieent ,
                                          int AV69Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV70Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV71Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV72Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV73Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV74Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV75Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV76Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV77Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV79Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T2.CliNom, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt, T1.AlbRecCod" ;
      scmdbuf += " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV63Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV64Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV74Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ATL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV61Ttrn22wwds_2_tfclinom_sel ,
                                          String AV60Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV62Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV63Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV65Ttrn22wwds_6_tfalbref_sel ,
                                          String AV64Ttrn22wwds_5_tfalbref ,
                                          String AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV66Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV68Ttrn22wwds_9_tfalbrpieent ,
                                          int AV69Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV70Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV71Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV72Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV73Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV74Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV75Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV76Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV77Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV79Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[20];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRef, T1.AlbRUni, T1.AlbRefDsc, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt, T1.AlbRecCod" ;
      scmdbuf += " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV63Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV64Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( AV74Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0ATL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV61Ttrn22wwds_2_tfclinom_sel ,
                                          String AV60Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV62Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV63Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV65Ttrn22wwds_6_tfalbref_sel ,
                                          String AV64Ttrn22wwds_5_tfalbref ,
                                          String AV67Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV66Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV68Ttrn22wwds_9_tfalbrpieent ,
                                          int AV69Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV70Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV71Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV72Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV73Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV74Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV75Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV76Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV77Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV78Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV79Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV80Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRefDsc, T1.AlbRUni, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt, T1.AlbRecCod" ;
      scmdbuf += " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV60Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV63Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV64Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV74Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
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
                  return conditional_P0ATL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
            case 1 :
                  return conditional_P0ATL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
            case 2 :
                  return conditional_P0ATL4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
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
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

